package ec.edu.espe.matrizform;

public class Matriz {

    private int filas;
    private int columnas;
    private int[][] datos;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.datos = new int[filas][columnas];
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int[][] getDatos() {
        return datos;
    }

    public void setDatos(int[][] datos) {
        this.datos = datos;
        this.filas = datos.length;
        this.columnas = datos[0].length;
    }

    public int getValor(int fila, int columna) {
        return datos[fila][columna];
    }

    public void setValor(int fila, int columna, int valor) {
        datos[fila][columna] = valor;
    }
}
