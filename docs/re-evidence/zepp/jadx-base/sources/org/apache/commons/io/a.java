package org.apache.commons.io;

/* JADX INFO: loaded from: classes23.dex */
class a implements Runnable {
    private final Thread a;
    private final long b;

    private a(Thread thread, long j) {
        this.a = thread;
        this.b = j;
    }

    private static void a(long j) throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis() + j;
        do {
            Thread.sleep(j);
            j = jCurrentTimeMillis - System.currentTimeMillis();
        } while (j > 0);
    }

    public static Thread b(long j) {
        return c(Thread.currentThread(), j);
    }

    public static Thread c(Thread thread, long j) {
        if (j <= 0) {
            return null;
        }
        Thread thread2 = new Thread(new a(thread, j), a.class.getSimpleName());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    public static void d(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a(this.b);
            this.a.interrupt();
        } catch (InterruptedException unused) {
        }
    }
}
