package defpackage;

import health.compact.a.UnitUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class gxi implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f36196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f36197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f36198c;
    protected long d;
    protected long e;
    protected long g;
    protected int h;
    protected String i = "";
    protected int j;

    public boolean t() {
        int i = this.h;
        return i < 180 && i > 0;
    }

    public int h() {
        return this.f36196a;
    }

    public void d(int i) {
        this.f36196a = i;
    }

    public int o() {
        return this.j;
    }

    public void a(int i) {
        this.j = i;
    }

    public int i() {
        return this.h;
    }

    public void b(int i) {
        this.h = i;
    }

    public long j() {
        return this.e;
    }

    public void d(long j) {
        this.e = j;
    }

    public long b() {
        return this.f36198c;
    }

    public int e() {
        long j = this.f36198c;
        if (j > 0) {
            long j2 = this.e;
            if (j2 > 0) {
                return gwc.b(j, gwc.a(j2, this.i, -1));
            }
        }
        return -1;
    }

    public void c(long j) {
        this.f36198c = j;
    }

    public long l() {
        return this.g;
    }

    public int k() {
        long j = this.g;
        if (j > 0) {
            long j2 = this.e;
            if (j2 > 0) {
                return gwc.b(j, gwc.a(j2, this.i, -1));
            }
        }
        return -1;
    }

    public void e(long j) {
        this.g = j;
    }

    public long d() {
        return this.d;
    }

    public int f() {
        long j = this.d;
        if (j > 0) {
            long j2 = this.e;
            if (j2 > 0) {
                return gwc.b(j, gwc.a(j2, this.i, -1));
            }
        }
        return -1;
    }

    public void b(long j) {
        this.d = j;
    }

    public long a() {
        return this.f36197b;
    }

    public int c() {
        long j = this.f36197b;
        if (j > 0) {
            long j2 = this.e;
            if (j2 > 0) {
                return gwc.b(j, gwc.a(j2, this.i, -1));
            }
        }
        return -1;
    }

    public void a(long j) {
        this.f36197b = j;
    }

    public String m() {
        return this.i;
    }

    public void a(String str) {
        this.i = str;
    }

    public boolean n() {
        return this.h > 0;
    }

    public int g() {
        int i;
        int i2 = this.h;
        if (i2 < 0 || (i = this.j) <= 0) {
            return -1;
        }
        return (int) UnitUtil.d((i2 / i) * 100.0f, 0);
    }

    public String toString() {
        return "BaseSleepData{mSleepTime=" + this.h + ", mFallAsSleepTime=" + this.f36198c + ", mWakeupTime=" + this.g + ", mRisingTime=" + this.d + ", mGoBedTime=" + this.f36197b + ", mTimeZone='" + this.i + "', mSleepDayTime=" + this.e + ", mStayInBedTime=" + this.j + ", mSleepLatencyTime=" + this.f36196a + ", getFallAsSleepTimeOffset=" + e() + ", getGoBedTimeOffset=" + c() + ", getRisingTimeOffset=" + f() + ", getWakeupTimeOffset=" + k() + ", getSleepEfficiency=" + g() + '}';
    }
}
