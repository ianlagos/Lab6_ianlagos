/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_ianlagos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ian
 */
public class adminUser {

    private ArrayList<Usuarios> listaUsers = new ArrayList();
    private File archivo = null;

    public adminUser(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaUsers() {
        return listaUsers;
    }

    public void setListaUsers(ArrayList<Usuarios> listaUsers) {
        this.listaUsers = listaUsers;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminUser{" + listaUsers + '}';
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaUsers = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaUsers.add(new Usuarios(sc.nextLine(), sc.next(), sc.nextInt(), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuarios t : listaUsers) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getUser() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getContraseña() + ";");
                bw.write(t.getNacimiento() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    
}
