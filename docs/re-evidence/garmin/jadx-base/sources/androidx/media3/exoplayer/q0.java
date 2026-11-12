package androidx.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Looper f9341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f9342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9343d;

    public q0(Looper looper) {
        this.f9340a = new Object();
        this.f9341b = looper;
        this.f9342c = null;
        this.f9343d = 0;
    }

    public final void a() {
        HandlerThread handlerThread;
        synchronized (this.f9340a) {
            try {
                fa.a.d(this.f9343d > 0);
                int i14 = this.f9343d - 1;
                this.f9343d = i14;
                if (i14 == 0 && (handlerThread = this.f9342c) != null) {
                    handlerThread.quit();
                    this.f9342c = null;
                    this.f9341b = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public q0() {
        this(null);
    }
}
