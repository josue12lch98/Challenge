package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola, llenarás el formulario de https://apprater.net/add/ siguiendo este programa");
        Scanner sc = new Scanner(System.in);
        String [] labels = {"Your name","Product Tittle", "Email Address", "Product URL","Add another Product URL"};
        int index=1;for (String label : labels ){ System.out.println(index++ + " " +label);}
        int label = sc.nextInt();String [] selectors = {"css","name", "id", "xpath"};
        index=1;for (String selector : selectors ){ System.out.println(index++ + " " +selector);}
        int selector = sc.nextInt();
        System.out.println("Escribir valor de la entrada");
        String value = sc.nextLine() +sc.nextLine(); label--;selector--;
        System.out.println("Se ejecutará el siguiente código: website.sendText("+ "\"" +labels[label] + "\",\""+selectors[selector]+ "\",\"user-submitted-"+selectors[selector]+"\",\""+value+"\",\"" );



    }
}
