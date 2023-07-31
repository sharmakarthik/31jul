package threads;

class table {
    void printTable(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            } else {
                System.out.println(i);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}