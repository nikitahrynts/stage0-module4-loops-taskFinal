package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int spaceLength = cathetusLength - 1;
        for (int i = 0; i < cathetusLength; i++) {
            int temp = i + 1;
            for (int j = 0; j < cathetusLength; j++) {
                if (j >= spaceLength && j <= cathetusLength * 2 - spaceLength) System.out.print(temp--);
                else System.out.print(" ");
            }
            temp += 2;
            for (int j = cathetusLength + 1; j <= 2 * cathetusLength; j++) {
                if (j >= spaceLength && j <= cathetusLength * 2 - spaceLength - 1) System.out.print(temp++);
            }
            spaceLength--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
