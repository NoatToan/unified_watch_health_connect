package h7;

import android.os.CancellationSignal;
import androidx.transition.m;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f82322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a73.f f82323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CancellationSignal f82324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f82325d;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f82322a) {
                    return;
                }
                this.f82322a = true;
                this.f82325d = true;
                a73.f fVar = this.f82323b;
                CancellationSignal cancellationSignal = this.f82324c;
                if (fVar != null) {
                    try {
                        Runnable runnable = (Runnable) fVar.f1836d;
                        m mVar = (m) fVar.f1834b;
                        Runnable runnable2 = (Runnable) fVar.f1835c;
                        if (runnable == null) {
                            mVar.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th3) {
                        synchronized (this) {
                            this.f82325d = false;
                            notifyAll();
                            throw th3;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.f82325d = false;
                    notifyAll();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
