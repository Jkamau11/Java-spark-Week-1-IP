package ke.co.safaricom;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String password;
        int key;

        System.out.print("Please enter the sentence: ");
        password = keyboard.nextLine();

        do {
            System.out.print("Please enter a key between 1 to 25: ");
            key = keyboard.nextInt();

            //here we handle key errors
            if (key < 1 || key > 25) {
                System.out.printf(" The key must be between 1 and 25, you entered %d.\n", key);
            }
        } while (key < 1 || key > 25);


        System.out.println("Password:\t" + password);
        CeaserCipher ceaserCipher = new CeaserCipher(password,key);
        String encryption = ceaserCipher.cipher();
        System.out.println("Encrypted:\t" + encryption);

        //decryption
        CeaserCipher ceaserCipherDec = new CeaserCipher(encryption,-key);
        System.out.println("Decrypted:\t" + ceaserCipherDec.cipher());

    }

}
