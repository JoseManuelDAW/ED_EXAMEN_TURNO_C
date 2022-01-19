/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg53603661e;

/**
 *
 * @author jose-
 */
import java.util.*;
// !!!! MODIFICA TU NOMBRE Y TU DNI DONDE TOQUE
public class DNI53603661E {
static final double FACTOR_HORA_EXTRA = 1.2;
private String nombreCompleto, dni;
private double salarioBasePorHora = 10.56;
public DNI53603661E(String nombreCompleto, String dni) {
this.nombreCompleto = nombreCompleto;
this.dni = dni;
}
public double getSalarioEsteMes(int horasExtra) {
double cantidadExtra, salarioFinal;
cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
return salarioFinal;
}
// Este método no lo comentaremos con JavaDoc
public static void main(String[] args) {
DNI53603661E emp = new DNI53603661E("Jose Manuel",
"53603661E");
int horasExtra = 2;
System.out.println("El salario de " + emp.nombreCompleto + " este mes
será de " + emp.getSalarioEsteMes(horasExtra)
+ " euros, al hacer " + horasExtra + " horas extra.");
}
}


