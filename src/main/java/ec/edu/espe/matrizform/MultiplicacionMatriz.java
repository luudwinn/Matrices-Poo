package ec.edu.espe.matrizform;

public class MultiplicacionMatriz implements OperacionMatriz {

    @Override
    public Matriz calcular(Matriz matrizA, Matriz matrizB) throws DimensionInvalidaException {

        if (matrizA.getColumnas() != matrizB.getFilas()) {
            throw new DimensionInvalidaException(
                    "No se puede multiplicar: columnas de A deben ser iguales a filas de B."
            );
        }

        Matriz resultado = new Matriz(matrizA.getFilas(), matrizB.getColumnas());

        for (int i = 0; i < matrizA.getFilas(); i++) {
            for (int j = 0; j < matrizB.getColumnas(); j++) {
                int suma = 0;

                for (int k = 0; k < matrizA.getColumnas(); k++) {
                    suma += matrizA.getValor(i, k) * matrizB.getValor(k, j);
                }

                resultado.setValor(i, j, suma);
            }
        }

        return resultado;
    }
}
