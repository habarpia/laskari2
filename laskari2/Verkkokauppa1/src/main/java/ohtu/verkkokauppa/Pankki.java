package ohtu.verkkokauppa;

public class Pankki implements PankkiRajapinta{

    
    private KirjanpitoRajapinta kirjanpito;

//    public Pankki() {
//        kirjanpito = Kirjanpito.getInstance();
//    }
    public Pankki(KirjanpitoRajapinta kirjanpito){
        this.kirjanpito = kirjanpito;
    }

    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");
        
        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}
