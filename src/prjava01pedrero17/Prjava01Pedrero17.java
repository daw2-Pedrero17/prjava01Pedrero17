/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava01pedrero17;

/**
 *
 * @author Pedrero17
 * 
 */

import java.io.*;
public class Prjava01Pedrero17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer01pedrero17.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("<head>");bw.newLine();
            bw.write("<title>");bw.newLine();
            bw.write("Nova p&agrave;gina web de Pedrero17");bw.newLine();
            bw.write("</title>");bw.newLine();
            bw.write("</head>");bw.newLine();
            bw.write("<body>");bw.newLine();
            bw.write("Nova p&agrave;gina web de Pedrero17");bw.newLine();
            bw.write("</body>");bw.newLine();
            bw.close();
        }
    }
    
}
