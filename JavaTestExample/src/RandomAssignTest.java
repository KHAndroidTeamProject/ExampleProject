import java.util.Random;

/*
배열에 난수 값을 할당하고 이 난수 값들 중에서 짝수만 뽑으시오.
난수의 범위는 1 ~ 1000 사이의 숫자를 생성하게 만드시오.
난수를 생성하는 개수는 7 ~ 13 개(이것도 난수로)로 작성하시오.
(Good Abstraction 을 구현하시면 좋습니다)
[ 되도록이면 Class 로 작성해주세요. ]
 */
class RandomAssign {
    Random rand;
    int randLen;
    int[] randArr;

    public RandomAssign() {
        rand = new Random();
        randLen = rand.nextInt(7) + 7;
        randArr = new int[randLen];

        for(int i = 0; i < randLen; i++) {
            randArr[i] = rand.nextInt(1000) + 1;
        }
    }

    public int getRandLen() {
        return randLen;
    }

    public int[] getRandArr() {
        return randArr;
    }

    public String toString() {
        return "배열의 길이 = " + randLen;
    }
}

public class RandomAssignTest {
    public static void main(String[] args) {
        RandomAssign ra = new RandomAssign();
        System.out.println(ra);

        int[] arr = ra.getRandArr();

        for(int i = 0; i < ra.getRandLen(); i++) {
            System.out.println(arr[i]);
        }
    }
}