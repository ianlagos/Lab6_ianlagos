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
public class Admin_especificos {

    private ArrayList<Especificos> listaUsers_especificos = new ArrayList();
    private File archivo_especifico = null;

    public Admin_especificos(String path) {
        archivo_especifico = new File(path);
    }

    public ArrayList<Especificos> getListaUsers_especificos() {
        return listaUsers_especificos;
    }

    public void setListaUsers_especificos(ArrayList<Especificos> listaUsers_especificos) {
        this.listaUsers_especificos = listaUsers_especificos;
    }

    public File getArchivo_especifico() {
        return archivo_especifico;
    }

    public void setArchivo_especifico(File archivo_especifico) {
        this.archivo_especifico = archivo_especifico;
    }

    @Override
    public String toString() {
        return "Admin_especificos{" + listaUsers_especificos + '}';
    }
    //
    public void setUser_especifico(Especificos e){
        this.listaUsers_especificos.add(e);
    }

    public void escribirEspecifico() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo_especifico, false);
            bw = new BufferedWriter(fw);
            for (Especificos t : listaUsers_especificos) {
                bw.write(t.getUser_especifico()+ ";");
                bw.write(t.getContra_especifico()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarEspecifico() {
        Scanner sc = null;
        listaUsers_especificos = new ArrayList();
        if (archivo_especifico.exists()) {
            try {
                sc = new Scanner(archivo_especifico);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaUsers_especificos.add(new Especificos(sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF

    }
}
