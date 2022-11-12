
package laptop;

/**
 *
 * @author Axioo
 */
    public class Toshiba extends Laptop{
    private int volume;
    boolean is_power_on;
    private int MAX_VOL;
    private int MIN_VOL;

    public Toshiba(){
        this.volume=50;
    }

    public void powerOn(){
        is_power_on=true;
        System.out.println("Laptop is On");
        System.out.println("Toshiba Satellite");
    }

    public void powerOff(){
        is_power_on=false;
        System.out.println("Shutdown in process ...");
    }

    public void volumeUp(){
        if(is_power_on){
            if(this.volume==MAX_VOL){
                System.out.println("Volume is Full ");
            }
            else{
                this.volume+=10;
                System.out.println("Volume is : "+getVolume());
            }
        }
    }

    public void volumeDown(){
        if(is_power_on){
            if(this.volume==MIN_VOL){
                System.out.println("Volume is 0%");
            }
            else{
                this.volume-=10;
                System.out.println("Volume is : "+getVolume());
            }
        }
    }

    public int getVolume(){
        return this.volume;
    }
}


