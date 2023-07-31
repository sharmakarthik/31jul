package threads;

class synchroization {
    public static void main(String[] args) {
        table ab = new table();
        myThread1 t1 = new myThread1(ab);
        myThread2 t2 = new myThread2(ab);
        t1.start();
        t2.start();
    }
}