package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes11.dex */
public class nfk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f43059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f43060c;
    private long d = SystemClock.elapsedRealtime();
    private final long e;

    public nfk(long j, long j2, long j3) {
        this.f43059b = j;
        this.e = j2;
        this.f43060c = Math.min(j3, j2);
    }

    public boolean c() {
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMin = Math.min(this.e, this.f43060c + (((jElapsedRealtime - this.d) / 1000) * this.f43059b));
            this.f43060c = jMin;
            this.d = jElapsedRealtime;
            if (jMin < 1) {
                return false;
            }
            this.f43060c = jMin - 1;
            return true;
        }
    }

    public long d() {
        return this.f43060c;
    }

    public long b() {
        return this.d;
    }
}
