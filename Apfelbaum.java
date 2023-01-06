/**
 * @author Herbert Wenisch
 * @version 2023-01-06
 */

class Apfelbaum {
    double hoehe;
    String ort;

    Apfelbaum(double eineHoehe, String einOrt){
        hoehe = eineHoehe;
        ort = einOrt;
    }

    void wachse(double einBetrag){
        if (einBetrag > 0) hoehe += einBetrag;
    }
}