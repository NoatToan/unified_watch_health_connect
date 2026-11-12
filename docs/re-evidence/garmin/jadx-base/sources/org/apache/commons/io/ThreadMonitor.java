package org.apache.commons.io;

/* JADX INFO: loaded from: classes3.dex */
class ThreadMonitor implements Runnable {
    private final Thread thread;
    private final long timeout;

    private ThreadMonitor(Thread thread, long j8) {
        this.thread = thread;
        this.timeout = j8;
    }

    private static void sleep(long j8) throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis() + j8;
        do {
            Thread.sleep(j8);
            j8 = jCurrentTimeMillis - System.currentTimeMillis();
        } while (j8 > 0);
    }

    public static Thread start(Thread thread, long j8) {
        if (j8 <= 0) {
            return null;
        }
        Thread thread2 = new Thread(new ThreadMonitor(thread, j8), "ThreadMonitor");
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    public static void stop(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            sleep(this.timeout);
            this.thread.interrupt();
        } catch (InterruptedException unused) {
        }
    }

    public static Thread start(long j8) {
        return start(Thread.currentThread(), j8);
    }
}
