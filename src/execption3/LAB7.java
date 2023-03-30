/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execption3;

/**
 *
 * @author User
 */
public class LAB7 {
    public static void main(String[] args) {
        System.out.println("Main method call method dothis()");
        try {
                dothis();
        }
        catch(Exceptione) {
            System.out.println("Main method receive exception " + e.getMessage());
        }
        public static void doThis() throwsException {
            System.out.println("Method doThis() call method doThat()");
            doThat();
        }
        public static void doThat() throwsException {
            throw new Exception();
        }
        }
    

