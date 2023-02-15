class multipleThreads {
    public static void main(final String[] args) {
        System.out.println("Thread main started");
        final Thread thread1 = new Thread(new WorkerThread());
        thread1.setName("WorkerThread 1");
        final Thread thread2 = new Thread(new WorkerThread());
        thread1.setName("WorkerThread 2");
        thread1.start();
        thread2.start();
        System.out.println("Thread main ended");
    }
}

class WorkerThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("[" + Thread.currentThread().getName() + "] Message " + i);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}