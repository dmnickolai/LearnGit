/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learngit;

/**
 *
 * @author Dennis
 */
public class LearnGit {
    
    LearnGit() {
        System.out.println("In LearnGit Constructor");
        new InnerClass();
    }

    class InnerClass {
        // Constants
        final static int one = 1;
        InnerClass() {
            System.out.println("In Inner Class Constructor");
            int j = one;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("In static main");
        LearnGit x = new LearnGit();
    }

}
