package br.chronosAcademy.media;

public class Media {
    public String calculaMedia(double v1, double v2) {
        double media = (v1 + v2)/2;
        if (media <5) {
            return "Reprovado";
        }
        return "Aprovado";
    }
}
