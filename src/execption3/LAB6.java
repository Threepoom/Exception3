/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execption3;

/**
 *
 * @author User
 */
public class LAB6 {
    public static void main(String[] args) {
        int[] list = new int[5];
        try{
            System.out.println("list[10] is "+ list[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            StackTraceElement[] s = e.getStackTrace();
            for (int i=0; i< s.length; i++){
            System.out.println(s[0].getClassName());
            System.out.println(s[0].getMethodName());
            System.out.println(s[0].getFileName());
            System.out.println(s[0].getLineNumber());
            }
        }
    }
    
}
