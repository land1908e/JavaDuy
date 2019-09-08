package Bai2Buoi1;

public class Main {
    public static void main(String[] args) {
        Song song = new Song();
        Song song1 = song;
        song1.name = "Hello";

        song = new Song();
        song.name = "Ahihi";

        System.out.println("Name: " + song1.name);
        System.out.println("Name: " + song.name);

    }
}
