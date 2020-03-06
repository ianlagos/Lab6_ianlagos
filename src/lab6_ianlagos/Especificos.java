/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_ianlagos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ian
 */
public class Especificos {
    
    private String user_especifico;
    private String contra_especifico;

    public Especificos(String user_especifico, String contra_especifico) {
        this.user_especifico = user_especifico;
        this.contra_especifico = contra_especifico;
    }

    public String getUser_especifico() {
        return user_especifico;
    }

    public void setUser_especifico(String user_especifico) {
        this.user_especifico = user_especifico;
    }

    public String getContra_especifico() {
        return contra_especifico;
    }

    public void setContra_especifico(String contra_especifico) {
        this.contra_especifico = contra_especifico;
    }

    @Override
    public String toString() {
        return user_especifico + contra_especifico;
    }

    

}
