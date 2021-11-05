
package assigment3.pkg2;


public class Mammal implements animal {
    public final String leaves="leaves";
    public final String stems="stems";
     public final String roots="roots";
     public final String nuts="nuts";
     public int NoOfLegs;
     public String FavFOOD;

    public Mammal(int NoOfLegs, String FavFOOD) {
        this.NoOfLegs = NoOfLegs;
        this.FavFOOD = FavFOOD;
    }


       @Override
       public void eat(){
           System.out.println("Mammal eat");
           
       }
       @Override
  public void travel(){
           System.out.println("Mammal travel");
           
       }

    public int getNoOfLegs() {
        return NoOfLegs;
    }

    public String getFavFOOD() {
        return FavFOOD;
    }
    
   
}
