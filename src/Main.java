import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String sanchez = "Sanchez";
        String bird_man = "Bird_Man";
        String vilochka = "Vilochka";
        String tolst = "Tolstopyatenko";
        String old = "Starshiy";
        String names = "Bird_Man names:";
        String new_line = System.lineSeparator();

        int exam_1 = new Random().nextInt(1, 100);
        int exam_2 = new Random().nextInt(1, 100);
        boolean result = (exam_1 > 50) && (exam_2 > 50);
        int result_2 = (exam_1 + exam_2) / 2;

        float num1 = 4199 / 13f;
        float num2 = 4199 / 14f;
        float num3 = 4199 / 15f;
        float num4 = 4199 / 16f;
        float num5 = 4199 / 17f;
        float num6 = 4199 / 18f;
        float num7 = 4199 / 19f;
        float penalty = num1 + num2 + num3 + num4 + num5 + num6 + num7;

        System.out.println(names + new_line + bird_man + new_line + vilochka
                + new_line + tolst + new_line + old + new_line + result + new_line
                + result_2 + new_line + penalty);
    }
}