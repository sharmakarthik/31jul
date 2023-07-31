package threads;

class myThread1 extends Thread {
    table t;

    myThread1(table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}