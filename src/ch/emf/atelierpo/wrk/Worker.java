package ch.emf.atelierpo.wrk;

import java.util.ArrayList;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {

    /**
     * Description : Cette méthode vérifie si une plaque d'immatriculation est
     * valide en Suisse. Voici les cantons de Suisse valides : Zurich (ZH),
     * Berne (BE), Lucerne (LU), Uri (UR), Schwyz (SZ), Obwald (OW), Nidwald
     * (NW), Glaris (GL), Zoug (ZG), Fribourg (FR), Soleure (SO), Bâle-Ville
     * (BS), Bâle-Campagne (BL), Schaffhouse (SH), Appenzell Rhodes-Extérieures
     * (AR), Appenzell Rhodes-Intérieures (AI,) Saint-Gall (SG), Grisons (GR)
     * ,Argovie (AG), Thurgovie (TG), Tessin (TI), Vaud (VD), Valais (VS)
     * ,Neuchâtel (NE), Genève (GE) ,Jura (JU)
     *
     * @param canton : Identifie le canton où la plaque d'immatriculation est
     * enregistrée.
     * @param numeroDePlaque : Le numéro de la plaque d'immatriculation à
     * contrôler.
     * @return true si la plaque d'immatriculation est valide en Suisse, sinon
     * false.
     */
    public boolean controlePlaqueImmatriculation(String canton, String numeroDePlaque) {

        boolean resultat = false;

        ArrayList<String> cantons = new ArrayList<>();
        cantons.add("ZH");
        cantons.add("BE");
        cantons.add("LU");
        cantons.add("UR");
        cantons.add("SO");
        cantons.add("BS");
        cantons.add("BL");
        cantons.add("SH");
        cantons.add("AR");
        cantons.add("AI");
        cantons.add("SG");
        cantons.add("GR");
        cantons.add("AG");
        cantons.add("TG");
        cantons.add("TI");
        cantons.add("VD");
        cantons.add("VS");
        cantons.add("NE");
        cantons.add("GE");
        cantons.add("JU");
        cantons.add("SZ");
        cantons.add("OW");
        cantons.add("NW");
        cantons.add("GL");
        cantons.add("ZG");
        cantons.add("FR");
        

        for (String cantonS : cantons) {
            if (canton.contains(cantonS) && canton.length() == 2) {
                resultat = true;
                break;
            }else{
                resultat = false;
            }
        }

        if(resultat == true){
            if(numeroDePlaque.length() == 9){
                for (int i = 0; i < 1000000000; i++) {
                    
                    if(Integer.parseInt(numeroDePlaque) == i){
                        resultat = true;
                        break;
                    }else{
                        resultat = false;
                    }
                }
            }else{
                resultat = false;
            }
        }
        
        return resultat;
    }

}
