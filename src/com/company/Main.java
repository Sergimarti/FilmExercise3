package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*String title = askForTitle();
        String director = askForDirector();
        String cataegory = askForCategory();*/

        int amountFilms = askForAmountFilms();

        ArrayList <Films> film = new ArrayList<>();

        for (int i = 0; i < amountFilms; i++) {



            film.add(createfilm());


        }
        printfilms(film);


        for (int i = 0; i < film.size(); i++) {

            System.out.println(" posicion " + (i) + " " + film(i).getFilmTitle());
            System.out.println(film[i].getDirector());
            System.out.println(film[i].getCategory());
        }

        int positionDelete = askForPositinTonDelete();

        for (int i = 0; i < film.length; i++) {

            if (i == positionDelete){

                System.out.println("vols esborrar la pelicula en la posicion  " + (i) + film[i].getFilmTitle());

                positionDelete = 0;


            }

        }






    }

    private static void printfilms(ArrayList<Films> film) {
        for (Films films: film) System.out.println(film);
    }

    private static int askForPositinTonDelete() {
        System.out.println("indica la posició de la pelicula que vols eliminar");
        Scanner sc = new Scanner(System.in);
        int positionDelete = sc.nextInt();
        return positionDelete;
    }

    private static int askForAmountFilms() {
        System.out.println(" Quantes pelicules vols afegir? ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        return amount;

    }

    private static Films createfilm() {
        String createdTitle = askForTitle();
        String createdDirector = askForDirector();
        String createdCategory = askForCategory();

        Films film = new Films(createdTitle, createdDirector, createdCategory);

        System.out.println("film created " + createdTitle + " Director " + createdDirector + " Category " + createdCategory);
        return film;
    }

    private static String askForCategory() {
        System.out.println("indica la categoria ");
        Scanner scan = new Scanner(System.in);
        String categoria = scan.nextLine();
        return categoria;
    }

    private static String askForDirector() {
        System.out.println("indica el nom del director ");
        Scanner scan = new Scanner(System.in);
        String director = scan.nextLine();
        return director;
    }

    private static String askForTitle() {
        System.out.println("indica el titol de la pelicula ");
        Scanner scan = new Scanner(System.in);
        String titlefilm = scan.nextLine();
        return titlefilm;
    }
}
