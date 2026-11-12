package androidx.media3.exoplayer;

import android.os.Looper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa.c f9347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.common.d0 f9348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Looper f9351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9355k;

    public interface a {
    }

    public interface b {
        void handleMessage(int i14, Object obj);
    }

    public r0(a aVar, b bVar, androidx.media3.common.d0 d0Var, int i14, fa.c cVar, Looper looper) {
        this.f9346b = aVar;
        this.f9345a = bVar;
        this.f9348d = d0Var;
        this.f9351g = looper;
        this.f9347c = cVar;
        this.f9352h = i14;
    }

    public final synchronized void a(long j8) {
        boolean z14;
        fa.a.d(this.f9353i);
        fa.a.d(this.f9351g.getThread() != Thread.currentThread());
        long jElapsedRealtime = this.f9347c.elapsedRealtime() + j8;
        while (true) {
            z14 = this.f9355k;
            if (z14 || j8 <= 0) {
                break;
            }
            this.f9347c.getClass();
            wait(j8);
            j8 = jElapsedRealtime - this.f9347c.elapsedRealtime();
        }
        if (!z14) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z14) {
        this.f9354j = z14 | this.f9354j;
        this.f9355k = true;
        notifyAll();
    }

    @CanIgnoreReturnValue
    public final void c() {
        fa.a.d(!this.f9353i);
        this.f9353i = true;
        z zVar = (z) this.f9346b;
        synchronized (zVar) {
            if (!zVar.I && zVar.f9895k.getThread().isAlive()) {
                zVar.f9893i.obtainMessage(14, this).b();
                return;
            }
            fa.k.g("Ignoring messages sent after release.");
            b(false);
        }
    }
}
