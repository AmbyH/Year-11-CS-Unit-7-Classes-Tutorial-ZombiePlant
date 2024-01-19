public class ZombiePlant {

    private int MaxPotency;
    private int initialTreatments;

    public ZombiePlant(int a, int b){
        MaxPotency = a;
        initialTreatments = b;
    }

    public int treatmentsNeeded(){
        if(initialTreatments>=0) {
            return initialTreatments;
        }
        else {
            return 0;
        }
    }

    public boolean isDangerous(){
        if (initialTreatments>0){
            return true;
        }
        else {
            return false;
        }
    }

    public void treat(int i) {
        if (i<=MaxPotency&&i>0) {
            initialTreatments--;
        }
        else if(i>MaxPotency){
            initialTreatments++;
        }
    }

    public int getPotencyRequired(){
        return MaxPotency;
    }

    public static void main(String[] args) {
        ZombiePlant plant = new ZombiePlant(10,3);

    }
}
