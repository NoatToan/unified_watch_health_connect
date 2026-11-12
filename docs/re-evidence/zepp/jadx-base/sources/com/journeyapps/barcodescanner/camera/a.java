package com.journeyapps.barcodescanner.camera;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes18.dex */
class a {
    private static final String e = "a";
    private static a f;
    private Handler a;
    private HandlerThread b;
    private int c = 0;
    private final Object d = new Object();

    private a() {
    }

    private void a() {
        synchronized (this.d) {
            if (this.a == null) {
                if (this.c <= 0) {
                    throw new IllegalStateException("CameraThread is not open");
                }
                HandlerThread handlerThread = new HandlerThread("CameraThread");
                this.b = handlerThread;
                handlerThread.start();
                this.a = new Handler(this.b.getLooper());
            }
        }
    }

    public static a e() {
        if (f == null) {
            f = new a();
        }
        return f;
    }

    private void g() {
        synchronized (this.d) {
            this.b.quit();
            this.b = null;
            this.a = null;
        }
    }

    public void b() {
        synchronized (this.d) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                g();
            }
        }
    }

    public void c(Runnable runnable) {
        synchronized (this.d) {
            a();
            this.a.post(runnable);
        }
    }

    public void d(Runnable runnable, long j) {
        synchronized (this.d) {
            a();
            this.a.postDelayed(runnable, j);
        }
    }

    public void f(Runnable runnable) {
        synchronized (this.d) {
            this.c++;
            c(runnable);
        }
    }
}
