package defpackage;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;

/* JADX INFO: loaded from: classes4.dex */
public class tv6 implements NotThreadSafeBridgeIdleDebugListener, nwg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ure f35096a = ure.b(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ure f35097b = ure.b(20);
    public final ure c = ure.b(20);
    public final ure d = ure.b(20);
    public volatile boolean e = true;

    public static void c(ure ureVar, long j) {
        int iG = ureVar.g();
        int i = 0;
        for (int i2 = 0; i2 < iG; i2++) {
            if (ureVar.d(i2) < j) {
                i++;
            }
        }
        if (i > 0) {
            for (int i3 = 0; i3 < iG - i; i3++) {
                ureVar.f(i3, ureVar.d(i3 + i));
            }
            ureVar.c(i);
        }
    }

    public static long f(ure ureVar, long j, long j2) {
        long j3 = -1;
        for (int i = 0; i < ureVar.g(); i++) {
            long jD = ureVar.d(i);
            if (jD < j || jD >= j2) {
                if (jD >= j2) {
                    break;
                }
            } else {
                j3 = jD;
            }
        }
        return j3;
    }

    public static boolean g(ure ureVar, long j, long j2) {
        for (int i = 0; i < ureVar.g(); i++) {
            long jD = ureVar.d(i);
            if (jD >= j && jD < j2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nwg
    public synchronized void a() {
        this.d.a(System.nanoTime());
    }

    @Override // defpackage.nwg
    public synchronized void b() {
        this.c.a(System.nanoTime());
    }

    public final boolean d(long j, long j2) {
        long jF = f(this.f35096a, j, j2);
        long jF2 = f(this.f35097b, j, j2);
        if (jF == -1 && jF2 == -1) {
            return this.e;
        }
        return jF > jF2;
    }

    public synchronized boolean e(long j, long j2) {
        boolean z;
        try {
            boolean zG = g(this.d, j, j2);
            boolean zD = d(j, j2);
            z = true;
            if (!zG && (!zD || g(this.c, j, j2))) {
                z = false;
            }
            c(this.f35096a, j2);
            c(this.f35097b, j2);
            c(this.c, j2);
            c(this.d, j2);
            this.e = zD;
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.f35097b.a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.f35096a.a(System.nanoTime());
    }
}
