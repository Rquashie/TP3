import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner jUn = new Scanner(System.in);
        Scanner jDeux = new Scanner(System.in);


        int tour = 1;
        String emplacementJun = "";
        String emplacementJdeux = "";
        boolean vainqueur = false, rempli = false;
        int caseVide = 0;


        //Tableau

        String reponseJun = "";

        //Nom des joueurs
        System.out.println("Joueur 1 veuillez saisir votre nom : ");
        String nomJUN = jUn.nextLine();
        System.out.println("Joueur 2 veuillez saisir votre nom : ");
        String nomJDeux = jUn.nextLine();
        ArrayList <String> resultats = new ArrayList <> ();


        do {
            char[][] tab = new char[3][3];

            //COMMENCER PARTIE
            while (tour <= 9) {
                tour++;
                //TOUR J1
                System.out.println(nomJUN + " : veuillez choisir un emplacement (X)");
                emplacementJun = jUn.nextLine();
                if (emplacementJun.equals("L1C1")) {
                    tab[0][0] = 'X';
                } else if (emplacementJun.equals("L1C2")) {
                    tab[0][1] = 'X';
                } else if (emplacementJun.equals("L1C3")) {
                    tab[0][2] = 'X';
                } else if (emplacementJun.equals("L2C1")) {
                    tab[1][0] = 'X';
                } else if (emplacementJun.equals("L2C2")) {
                    tab[1][1] = 'X';
                } else if (emplacementJun.equals("L2C3")) {
                    tab[1][2] = 'X';
                } else if (emplacementJun.equals("L3C1")) {
                    tab[2][0] = 'X';
                } else if (emplacementJun.equals("L3C2")) {
                    tab[2][1] = 'X';
                } else if (emplacementJun.equals("L3C3")) {
                    tab[2][2] = 'X';
                }


                //TOUR J2
                System.out.println(nomJDeux + " : veuillez choisir un emplacement (O)");
                emplacementJdeux = jDeux.nextLine();
                if (emplacementJdeux.equals("L1C1")) {
                    tab[0][0] = 'O';
                } else if (emplacementJdeux.equals("L1C2")) {
                    tab[0][1] = 'O';
                } else if (emplacementJdeux.equals("L1C3")) {
                    tab[0][2] = 'O';
                } else if (emplacementJdeux.equals("L2C1")) {
                    tab[1][0] = 'O';
                } else if (emplacementJdeux.equals("L2C2")) {
                    tab[1][1] = 'O';
                } else if (emplacementJdeux.equals("L2C3")) {
                    tab[1][2] = 'O';
                } else if (emplacementJdeux.equals("L3C1")) {
                    tab[2][0] = 'O';
                } else if (emplacementJdeux.equals("L3C2")) {
                    tab[2][1] = 'O';
                } else if (emplacementJdeux.equals("L3C3")) {
                    tab[2][2] = 'O';
                }
                for (int i = 0; i < tab.length; i++) {
                    System.out.println(Arrays.toString(tab[i]) + '\n');
                }


                //Ligne 1
                if (tab[0][0] == 'X' && tab[0][1] == 'X' && tab[0][2] == 'X') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJUN);
                    resultats.add(nomJUN);
                    break;
                } else if (tab[0][0] == 'O' && tab[0][1] == 'O' && tab[0][2] == 'O') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJDeux);
                    resultats.add(nomJDeux);
                    break;
                }
                //Ligne 2
                else if (tab[1][0] == 'X' && tab[1][1] == 'X' && tab[1][2] == 'X') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJUN);
                    resultats.add(nomJUN);
                    break;
                } else if (tab[1][0] == 'O' && tab[1][1] == 'O' && tab[1][2] == 'O') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJDeux);
                    resultats.add(nomJDeux);
                    break;
                }
                //Ligne 3
                else if (tab[2][0] == 'X' && tab[2][1] == 'X' && tab[2][2] == 'X') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJUN);
                    resultats.add(nomJUN);
                    break;
                } else if (tab[2][0] == 'O' && tab[2][1] == 'O' && tab[2][2] == 'O') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJDeux);
                    resultats.add(nomJDeux);
                    break;
                }
                //Colonne 1
                else if (tab[0][0] == 'X' && tab[1][0] == 'X' && tab[2][0] == 'X') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJUN);
                    resultats.add(nomJUN);
                    break;
                } else if (tab[0][0] == 'O' && tab[1][0] == 'O' && tab[2][0] == 'O') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJDeux);
                    resultats.add(nomJDeux);
                    break;
                }
                //Colonne 2
                else if (tab[0][1] == 'X' && tab[1][1] == 'X' && tab[2][1] == 'X') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJUN);
                    resultats.add(nomJUN);
                    break;
                } else if (tab[0][1] == 'O' && tab[1][1] == 'O' && tab[2][1] == 'O') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJDeux);
                    resultats.add(nomJDeux);
                    break;
                }
                //Colonne 3
                else if (tab[0][2] == 'X' && tab[1][2] == 'X' && tab[2][2] == 'X') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJUN);
                    resultats.add(nomJUN);
                    break;
                } else if (tab[0][2] == 'O' && tab[1][2] == 'O' && tab[2][2] == 'O') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJDeux);
                    resultats.add(nomJDeux) ;
                    break;
                }
                //DIAGONALE 1
                else if (tab[0][0] == 'X' && tab[1][1] == 'X' && tab[2][2] == 'X') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJUN);
                    resultats.add(nomJUN);
                    break;
                } else if (tab[0][0] == 'O' && tab[1][1] == 'O' && tab[2][2] == 'O') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJDeux);
                    resultats.add(nomJDeux);
                    break;
                }
                //DIAGONALE 2
                else if (tab[0][2] == 'X' && tab[1][1] == 'X' && tab[2][0] == 'X') {
                    vainqueur = true;
                    System.out.println("Vainqueur : " + nomJUN);
                    resultats.add(nomJUN) ;
                    break;
                } else if (tab[0][2] == 'O' && tab[1][1] == 'O' && tab[2][0] == 'O') {
                    vainqueur = true;
                    resultats.add(nomJDeux) ;
                    System.out.println("Vainqueur : " + nomJDeux);
                    break;
                }

                if (rempli(tab) == true && vainqueur == false) {
                    System.out.println("Match nul");
                    resultats.add("Match nul");
                    break;
                }
            }
            
            System.out.println("\nVoulez-vous rejouer ? (o/n) :");
            reponseJun = jUn.nextLine();

            String tempNom = nomJUN ;
            nomJUN = nomJDeux ;
            nomJDeux = tempNom ;

            String tempEmplacement = emplacementJun ;
            emplacementJun = emplacementJdeux ;
            emplacementJdeux = tempEmplacement ;

        } while (reponseJun.equals("o")|| reponseJun.equals("O")|| reponseJun.equals("oui")|| reponseJun.equals("OUI"));
        System.out.println("Liste des vainqueurs :");
        for(String elem : resultats) {
            System.out.println(elem);
            System.out.println("--------");
        }

        }


    public static boolean rempli(char[][] tab) {
        int rempli= 0 ;
        for (int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
             if (tab[i][j] == 'O' || tab[i][j] == 'X') {
                rempli++;}
            }
        }
        if(rempli == 9) {
            return true;
        }
        return false ;
    }
}
