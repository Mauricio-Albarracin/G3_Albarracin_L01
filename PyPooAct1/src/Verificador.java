public class Verificador {

    // Método para verificar si los rectángulos se sobreponen
    static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
        // Se sobreponen si un rectángulo no está completamente a la izquierda, derecha, arriba o abajo del otro
        boolean noEstaALaIzquierda = r1.getEsquina2().getX() > r2.getEsquina1().getX();
        boolean noEstaADerecha = r1.getEsquina1().getX() < r2.getEsquina2().getX();
        boolean noEstaArriba = r1.getEsquina1().getY() < r2.getEsquina2().getY();
        boolean noEstaAbajo = r1.getEsquina2().getY() > r2.getEsquina1().getY();

        return noEstaALaIzquierda && noEstaADerecha && noEstaArriba && noEstaAbajo;
    }

    // Método para verificar si los rectángulos están juntos
    static boolean esJunto(Rectangulo r1, Rectangulo r2) {
        // Están juntos si comparten un borde sin solaparse
        boolean tocanLadoIzquierdo = r1.getEsquina2().getX() == r2.getEsquina1().getX();
        boolean tocanLadoDerecho = r1.getEsquina1().getX() == r2.getEsquina2().getX();
        boolean tocanLadoInferior = r1.getEsquina2().getY() == r2.getEsquina1().getY();
        boolean tocanLadoSuperior = r1.getEsquina1().getY() == r2.getEsquina2().getY();

        return tocanLadoIzquierdo || tocanLadoDerecho || tocanLadoInferior || tocanLadoSuperior;
    }

    // Método para verificar si los rectángulos son disjuntos
    static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {
        // Son disjuntos si no se sobreponen y no están juntos
        return !esSobrePos(r1, r2) && !esJunto(r1, r2);
    }
}
