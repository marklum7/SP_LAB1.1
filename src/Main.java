
public class Main {
    public static void main(String[] args) {

      /*  int MaxVar;
        int[] numbers = new int[20];
        for (int i = 0, i < numbers.lenght, i++){

            numbers[i] = Math.random(1, 50);


        }

       */
        int[]nums=new int[20];
        for (int i=0; i<nums.length;i++){
            nums[i]= (int) (Math.random() * 100);
        }
        int MaxVar[] = new int[4];
        MaxVar[0] = 0;
        MaxVar[1] = 0;
        MaxVar[2] = 0;
        MaxVar[3] = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > MaxVar[0]) {
                MaxVar[0] = nums[i];
            }
            if (nums[i] > MaxVar[1] && nums[i] % 14 == 0) {
                MaxVar[1] = nums[i];
            }
            if (nums[i] > MaxVar[2] && nums[i] % 2 == 0) {
                MaxVar[2] = nums[i];
            }
            if (nums[i] > MaxVar[3] && nums[i] % 7 == 0) {
                MaxVar[3] = nums[i];
            }
        }
        int Max1 = MaxVar[0] * MaxVar[1];
        int Max2 = MaxVar[2] * MaxVar[3];
        if (Max1 % 14 == 0 && Max2 % 14 == 0){
            if (Max1 > Max2) {
                System.out.println(Max1);
            }else{
                System.out.println(Max2);
            }
        }else{
            System.out.println(-1);
        }

    }
}