
package assignment3;


public abstract class Ball implements Tossable {
    protected String brandname; 
   
    public  Ball(String brandname) {
        this.brandname = brandname;
    }

    public String getBrandname() {
        return brandname;
    }
    public abstract void bounce();
      
}

