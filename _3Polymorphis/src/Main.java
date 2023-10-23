//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea()
// che stampi l'area della forma.
//Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
// per calcolare l'area del rettangolo.

public class Main {
    public static void main(String[] args) {
        Forma myforma = new Forma();
        Rettangolo myrettangolo = new Rettangolo(3,6);
        Triangolo mytriangolo = new Triangolo(3, 6);

        System.out.println("Area rettangolo: " + myrettangolo.calcolaArea());
        System.out.println("Area triangolo: " + mytriangolo.calcolaArea());
    }
}