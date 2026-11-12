package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes11.dex */
public class qfp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f31487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f31488b;

    public static abstract class a implements Runnable {
        private String name;

        public a(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        public abstract void onTimerCallback() throws TimeoutException;

        public abstract void resetCallback();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                onTimerCallback();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
            resetCallback();
        }
    }

    public qfp(Looper looper) {
        this.f31487a = new Handler(looper);
    }

    public synchronized String a() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return b() ? this.f31488b.getName() : "";
    }

    public synchronized boolean b() {
        return this.f31488b != null;
    }

    public synchronized void c() {
        this.f31488b = null;
    }

    public synchronized void d(a aVar, long j) {
        this.f31487a.removeCallbacksAndMessages(null);
        this.f31487a.postDelayed(aVar, j);
        this.f31488b = aVar;
    }

    public synchronized void e() {
        this.f31487a.removeCallbacksAndMessages(null);
        this.f31488b = null;
    }
}
