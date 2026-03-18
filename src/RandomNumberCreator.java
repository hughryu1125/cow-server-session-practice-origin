import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberCreator {
    private List<Integer> randomNumbers = new ArrayList<>();
    private Random random = new Random();

    public List<Integer> createRandomNumbers() {

        while (randomNumbers.size() < 6) {
            int randomNumber = random.nextInt(45) + 1;

            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }

        return randomNumbers;
    }
}
