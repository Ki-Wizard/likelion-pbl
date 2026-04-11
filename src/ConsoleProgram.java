import java.util.Scanner;

public class ConsoleProgram {
    private static final int MIN_LION_COUNT = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lionCount = readLionCount(scanner);
        String[] lionNames = readLionNames(scanner, lionCount);
        printLionList(lionNames);

        scanner.close();
    }

    private static int readLionCount(Scanner scanner) {
        while (true) {
            System.out.print("아기사자 수를 입력하세요 (5 이상): ");

            if (!scanner.hasNextInt()) {
                System.out.println("숫자로 다시 입력해 주세요.");
                scanner.nextLine();
                continue;
            }

            int lionCount = scanner.nextInt();
            scanner.nextLine();

            if (lionCount < MIN_LION_COUNT) {
                System.out.println("아기사자 수는 5 이상으로 입력해 주세요.");
                continue;
            }

            return lionCount;
        }
    }

    private static String[] readLionNames(Scanner scanner, int lionCount) {
        String[] lionNames = new String[lionCount];

        System.out.println();
        System.out.println("아기사자 이름을 순서대로 입력하세요.");

        for (int i = 0; i < lionCount; i++) {
            System.out.print((i + 1) + "번째 아기사자 이름: ");
            lionNames[i] = scanner.nextLine();
        }

        return lionNames;
    }

    private static void printLionList(String[] lionNames) {
        System.out.println();
        System.out.println("===== 최종 아기사자 명단 =====");
        System.out.println("총 아기사자 수: " + lionNames.length);

        for (int i = 0; i < lionNames.length; i++) {
            System.out.println((i + 1) + ". " + lionNames[i]);
        }
    }
}
