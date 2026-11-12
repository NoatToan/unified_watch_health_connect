package clc.utils.taskmanager;

import android.os.Looper;
import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class ThreadWorker implements Runnable {
    private final Object a;
    private Looper b;

    public ThreadWorker(String str) {
        Object obj = new Object();
        this.a = obj;
        this.b = null;
        Thread thread = new Thread(null, this, str);
        thread.setPriority(1);
        thread.start();
        synchronized (obj) {
            while (this.b == null) {
                try {
                    this.a.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Looper getLooper() {
        return this.b;
    }

    public void join() {
        Looper looper = getLooper();
        if (looper != null) {
            try {
                Thread thread = looper.getThread();
                if (thread != null) {
                    thread.join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void pause() {
        Thread thread = this.b.getThread();
        if (thread != null) {
            try {
                synchronized (thread) {
                    thread.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void quit() {
        this.b.quit();
    }

    public void restart() {
        Thread thread = this.b.getThread();
        if (thread != null) {
            try {
                synchronized (thread) {
                    try {
                        thread.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.a) {
            Process.setThreadPriority(10);
            Looper.prepare();
            this.b = Looper.myLooper();
            this.a.notifyAll();
        }
        Looper.loop();
    }
}
