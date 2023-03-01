/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasycolas;
import java.util.*;
import java.time.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Libni
 */
public class Generador {
    private double tiempo;
    public Generador(){
    }
    public Generador(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
    
    JFrame jFrame = new JFrame();
    public void Pila(){
        Instant inicio = Instant.now();
        Stack<Integer> pila = new Stack<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            int numero = rand.nextInt(20000001) - 10000000; 
            pila.push(numero);
        }
        Instant fin = Instant.now(); 
        Duration tiempoGeneracion = Duration.between(inicio, fin);        
        System.out.println("Se han generado " + pila.size() + " números aleatorios en " + tiempoGeneracion.toMillis() + " milisegundos.");

        System.out.println("\nExtrayendo números aleatorios de la pila...");
        Instant inicio2 = Instant.now();
        while (!pila.empty()) {
            int numero = pila.pop();
        }
        Instant fin2 = Instant.now();
        Duration tiempoExtraccion = Duration.between(inicio2, fin2);
        System.out.println("Se han extraído " + pila.size() + " números aleatorios de la pila en " + tiempoExtraccion.toMillis() + " milisegundos.");
        double tp=tiempoGeneracion.toMillisPart()+tiempoExtraccion.toMillis();
        setTiempo(tp);
        System.out.println("\ntimepo: "+ tp);
        System.out.println("------------------------------------------------------------------------------------------------------");
    }
    
    public void Cola(){
        Instant inicio = Instant.now(); 
        Queue<Integer> cola = new LinkedList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            int numero = rand.nextInt(20000001) - 10000000; 
            cola.offer(numero);
        }
        Instant fin = Instant.now(); 
        Duration tiempoGeneracion = Duration.between(inicio, fin);        
        System.out.println("Se han generado " + cola.size() + " números aleatorios en " + tiempoGeneracion.toMillis() + " milisegundos.");

        System.out.println("\nExtrayendo números aleatorios de la cola...");
        Instant inicio2 = Instant.now();
        while (!cola.isEmpty()) {
            int numero = cola.poll();
        }
        Instant fin2 = Instant.now();
        Duration tiempoExtraccion = Duration.between(inicio2, fin2);
        System.out.println("Se han extraído " + cola.size() + " números aleatorios de la pila en " + tiempoExtraccion.toMillis() + " milisegundos.");
        
        double tp=tiempoGeneracion.toMillisPart()+tiempoExtraccion.toMillis();
        setTiempo(tp);
        System.out.println("\ntimepo: "+ tp);
        System.out.println("------------------------------------------------------------------------------------------------------");
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
}
