PROYECTO NETBEANS CON DESIGN: MATRIZ MULTIPLICACION POO

IMPORTANTE
Esta version incluye:
MatrizGUIForm.java
MatrizGUIForm.form

Por eso NetBeans debe mostrar las pestañas:
Source | Design | History

COMO ABRIR
1. Descomprime el ZIP.
2. Abre NetBeans.
3. File > Open Project.
4. Selecciona la carpeta MatrizMultiplicacionPOO_Form_NetBeans.
5. En Source Packages abre:
   ec.edu.espe.matrizform
6. Da doble clic en:
   MatrizGUIForm.java

AHI DEBE APARECER
Source | Design | History

COMO EJECUTAR
1. Clic derecho en el proyecto.
2. Clean and Build.
3. Run Project.

Si pregunta clase principal:
ec.edu.espe.matrizform.Main

QUE HACE
- Tiene Matriz A.
- Tiene Matriz B.
- Multiplica A x B.
- Muestra resultado.
- Usa JTable como grid.
- Usa botones.
- Tiene dimension editable.
- Por defecto inicia en 4x4.

POO UTILIZADA
- Clase Matriz con atributos privados.
- Constructor.
- Getter y setter.
- Interfaz OperacionMatriz.
- Clase MultiplicacionMatriz que implementa la interfaz.
- Excepcion personalizada DimensionInvalidaException.
- JFrame Form editable visualmente en NetBeans.

SI EL INGENIERO PIDE EDITAR GRAFICAMENTE
Abre MatrizGUIForm.java y entra a Design.
Ahi puedes mover botones, tablas, labels y cambiar textos desde Properties.
