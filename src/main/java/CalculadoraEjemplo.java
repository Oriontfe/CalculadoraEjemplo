/**
 * Clase CalculadoraEjemplo que realiza operaciones básicas de cálculo.
 * Incluye suma, resta, multiplicación y división de dos operandos.
 * 
 * @author Ayoze
 * @version 1.0
 * @since 2024-11-09
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {

    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor para la clase CalculadoraEjemplo.
     * 
     * @param operando1 Primer operando para las operaciones.
     * @param operando2 Segundo operando para las operaciones.
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Realiza la suma de operando1 y operando2.
     * 
     * @return El resultado de la suma.
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Realiza la resta de operando1 y operando2.
     * 
     * @return El resultado de la resta.
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de operando1 y operando2.
     * 
     * @return El resultado de la multiplicación.
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Realiza la división de operando1 y operando2.
     * 
     * @return El resultado de la división.
     * @throws ArithmeticException si el operando2 es cero.
     */
    public double dividir() {
        if (operando2 == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        resultado = operando1 / operando2;
        return resultado;
    }

    /**
     * Método principal para probar los métodos de la clase CalculadoraEjemplo.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
    CalculadoraEjemplo calculadora = new CalculadoraEjemplo(10, 5);
    
    System.out.println("Suma: " + calculadora.sumar());
    System.out.println("Resta: " + calculadora.restar());
    System.out.println("Multiplicación: " + calculadora.multiplicar());
    System.out.println("División: " + calculadora.dividir());

    // Nuevo mensaje o cálculo adicional
    System.out.println("Operación completada con éxito.");
}

}
