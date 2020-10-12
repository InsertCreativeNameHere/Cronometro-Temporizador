
package cronometro;

/**
 *
 * @author javie
 */
public class Tiempo {
    
    private int segundos;
    private int minutos;
    private int horas;

    //Crea una instancia de la clase con los valores puestos por el susuario
    public Tiempo(int segundos, int minutos, int horas) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }

    //Crea una instancia de la clase con todos los valores incializados a 0
    public Tiempo() {
        
        this.segundos = 0;
        this.minutos = 0;
        this.horas = 0;
        
    }
    
    //Metodo para avanzar el tiempo
    public void avanzarTiempo(){
        
        this.segundos += 1;
        if(this.segundos > 59){
          this.minutos += 1;
          this.segundos = 0;
          if(this.minutos > 59){
              this.horas += 1;
              this.minutos = 0;
          }
        }
        
    }
    //Metodo para retroceder el tiempo
    public void retrocederTiempo(){
        
        this.segundos -= 1;
        if(this.segundos < 0){
            
            this.minutos -= 1;
            this.segundos = 59;
            if(this.minutos < 0){
                this.minutos = 59;
                this.horas -= 0;
            }
            
        }
        
    }
    
    //Setters y getters

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    
}
