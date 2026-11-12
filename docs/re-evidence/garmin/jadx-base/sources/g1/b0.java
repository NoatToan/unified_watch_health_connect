package g1;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements c0 {
    @Override // g1.c0
    public final long a() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // g1.c0
    public final long b() {
        return System.nanoTime() / 1000;
    }
}
