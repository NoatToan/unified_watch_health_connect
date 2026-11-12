package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class si3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f33659b;
    public Object c;
    public boolean d;

    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f33658a) {
                    return;
                }
                this.f33658a = true;
                this.d = true;
                a aVar = this.f33659b;
                Object obj = this.c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        while (this.d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void setOnCancelListener(a aVar) {
        synchronized (this) {
            try {
                b();
                if (this.f33659b == aVar) {
                    return;
                }
                this.f33659b = aVar;
                if (this.f33658a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
