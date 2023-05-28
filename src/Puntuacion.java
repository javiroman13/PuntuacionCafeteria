import java.util.Random;

public class Puntuacion {
    public void calificacion(){
        int [] respuesta = new int[30];
        int [] puntuacion=new int[5];
        Random rand = new Random();
        for (int i=0;i<30;i++){
            respuesta[i]=rand.nextInt(5)+1;
        }
        for (int i=0;i<30;i++){
            puntuacion[respuesta[i]-1]++;
        }
        for (int k=0;k<5;k++){
            System.out.println("calificacion; "+(k+1)+":"+puntuacion[k]+ "veces");

        } } }

