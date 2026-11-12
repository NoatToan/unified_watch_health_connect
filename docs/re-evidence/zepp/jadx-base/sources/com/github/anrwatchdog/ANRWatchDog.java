package com.github.anrwatchdog;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class ANRWatchDog extends Thread {
    private static final int l = 5000;
    private static final ANRListener m = new a();
    private static final ANRInterceptor n = new b();
    private static final InterruptionListener o = new c();
    private ANRListener a;
    private ANRInterceptor b;
    private InterruptionListener c;
    private final Handler d;
    private final int e;
    private String f;
    private boolean g;
    private boolean h;
    private volatile long i;
    private volatile boolean j;
    private final Runnable k;

    public interface ANRInterceptor {
        long intercept(long j);
    }

    public interface ANRListener {
        void onAppNotResponding(ANRError aNRError);
    }

    public interface InterruptionListener {
        void onInterrupted(InterruptedException interruptedException);
    }

    public static class a implements ANRListener {
        @Override // com.github.anrwatchdog.ANRWatchDog.ANRListener
        public void onAppNotResponding(ANRError aNRError) {
            throw aNRError;
        }
    }

    public static class b implements ANRInterceptor {
        @Override // com.github.anrwatchdog.ANRWatchDog.ANRInterceptor
        public long intercept(long j) {
            return 0L;
        }
    }

    public static class c implements InterruptionListener {
        @Override // com.github.anrwatchdog.ANRWatchDog.InterruptionListener
        public void onInterrupted(InterruptedException interruptedException) {
            Log.w("ANRWatchdog", "Interrupted: " + interruptedException.getMessage());
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ANRWatchDog.this.i = 0L;
            ANRWatchDog.this.j = false;
        }
    }

    public ANRWatchDog() {
        this(5000);
    }

    public int getTimeoutInterval() {
        return this.e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-WatchDog|");
        long jIntercept = this.e;
        while (!isInterrupted()) {
            boolean z = this.i == 0;
            this.i += jIntercept;
            if (z) {
                this.d.post(this.k);
            }
            try {
                Thread.sleep(jIntercept);
                if (this.i != 0 && !this.j) {
                    if (this.h || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        jIntercept = this.b.intercept(this.i);
                        if (jIntercept <= 0) {
                            this.a.onAppNotResponding(this.f != null ? ANRError.a(this.i, this.f, this.g) : ANRError.b(this.i));
                            jIntercept = this.e;
                            this.j = true;
                        }
                    } else {
                        Log.w("ANRWatchdog", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                        this.j = true;
                    }
                }
            } catch (InterruptedException e) {
                this.c.onInterrupted(e);
                return;
            }
        }
    }

    public ANRWatchDog setANRInterceptor(ANRInterceptor aNRInterceptor) {
        if (aNRInterceptor == null) {
            this.b = n;
        } else {
            this.b = aNRInterceptor;
        }
        return this;
    }

    public ANRWatchDog setANRListener(ANRListener aNRListener) {
        if (aNRListener == null) {
            this.a = m;
        } else {
            this.a = aNRListener;
        }
        return this;
    }

    public ANRWatchDog setIgnoreDebugger(boolean z) {
        this.h = z;
        return this;
    }

    public ANRWatchDog setInterruptionListener(InterruptionListener interruptionListener) {
        if (interruptionListener == null) {
            this.c = o;
        } else {
            this.c = interruptionListener;
        }
        return this;
    }

    public ANRWatchDog setLogThreadsWithoutStackTrace(boolean z) {
        this.g = z;
        return this;
    }

    public ANRWatchDog setReportAllThreads() {
        this.f = "";
        return this;
    }

    public ANRWatchDog setReportMainThreadOnly() {
        this.f = null;
        return this;
    }

    public ANRWatchDog setReportThreadNamePrefix(String str) {
        if (str == null) {
            str = "";
        }
        this.f = str;
        return this;
    }

    public ANRWatchDog(int i) {
        this.a = m;
        this.b = n;
        this.c = o;
        this.d = new Handler(Looper.getMainLooper());
        this.f = "";
        this.g = false;
        this.h = false;
        this.i = 0L;
        this.j = false;
        this.k = new d();
        this.e = i;
    }
}
