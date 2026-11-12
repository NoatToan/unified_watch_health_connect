package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public class q9h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31260a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31261b = Integer.MIN_VALUE;
    public float c = 0.0f;
    public float d = 0.0f;
    public long e = -11;

    public float a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    public boolean c(int i, int i2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.e;
        boolean z = (jUptimeMillis - j <= 10 && this.f31260a == i && this.f31261b == i2) ? false : true;
        if (jUptimeMillis - j != 0) {
            this.c = (i - this.f31260a) / (jUptimeMillis - j);
            this.d = (i2 - this.f31261b) / (jUptimeMillis - j);
        }
        this.e = jUptimeMillis;
        this.f31260a = i;
        this.f31261b = i2;
        return z;
    }
}
