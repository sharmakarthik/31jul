package threads;

class myThread2 extends Thread {
    table t;

    myThread2(table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}