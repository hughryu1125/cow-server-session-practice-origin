import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO: src에 random한 숫자 6개를 생성하는 RandomNumberCreator 만들고
        //  main에서 출력하기
        //  RandomNumberCreator의 return type은 Array, List 뭐든 상관없습니다!
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        List<Integer> randomNumbers = randomNumberCreator.createRandomNumbers();

        System.out.println("이번 회차 로또 번호는");
        for (int number : randomNumbers) {
            System.out.println(number);
        }

        System.out.println("입니다.");
    }
}
