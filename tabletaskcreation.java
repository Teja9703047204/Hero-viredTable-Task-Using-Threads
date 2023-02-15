class Table implements Runnable {
    private int number;

    public Table(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " x" + 5 + " =" + (i * 5) + "/n");
        }
    }

}

class main {

    public static void main(String[] args) {
        Table obj1 = new obj1();
        Thread thread = new Thread(obj1);
        thread.start();
    }
}