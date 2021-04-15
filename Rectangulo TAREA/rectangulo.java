
/**
 * Write a description of class rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rectangulo
{
    
    private int base;
    private int altura;
    private int perimetro;
    private int area;

    /**
     * Constructor for objects of class rectangulo
     */
    public rectangulo(int a)
    {
        base=0;
        altura=0;
        perimetro=0;
        area=0;
    }

   
    int calcularPerimetro(int altura,int base)
    {
      
        perimetro=2*altura+2*base;
        
        return perimetro;
    }
    int calcularArea(int altura,int base){
        area=altura*base;
        return area;
    }
    int getbase(){
        
       return base;
    }  
    int getaltura(){
        
       return altura;
    } 
    int getperimetro(){
        
       return perimetro;
    }
     int getarea(){
        
       return area;
    }
    int setbase(){
        
       return base;
    }  
    int setaltura(){
        
       return altura;
    } 
    int setperimetro(){
        
       return perimetro;
       
    }
    int setarea(){
        
       return area;
    }
    }
