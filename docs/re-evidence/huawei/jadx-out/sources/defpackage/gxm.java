package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class gxm extends gxi {
    protected int f;
    protected String k;
    protected long l;
    protected long m;
    protected String n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected int s;
    protected int t;
    protected int x;

    public int q() {
        return this.f;
    }

    public void c(int i) {
        this.f = i;
    }

    public int s() {
        if (this.f < 0 || this.h <= 0) {
            return -1;
        }
        return Math.round((this.f * 100.0f) / this.h);
    }

    public int y() {
        return this.q;
    }

    public void i(int i) {
        this.q = i;
    }

    public int ad() {
        return this.x;
    }

    public void m(int i) {
        this.x = i;
    }

    public int z() {
        return this.t;
    }

    public void h(int i) {
        this.t = i;
    }

    public int x() {
        return this.p;
    }

    public void j(int i) {
        this.p = i;
    }

    public int aa() {
        return this.s;
    }

    public void g(int i) {
        this.s = i;
    }

    public int u() {
        return this.o;
    }

    public void e(int i) {
        this.o = i;
    }

    public String v() {
        return this.k;
    }

    public void c(String str) {
        this.k = str;
    }

    public long w() {
        return this.l;
    }

    public void g(long j) {
        this.l = j;
    }

    public long p() {
        return this.m;
    }

    public void h(long j) {
        this.m = j;
    }

    public void f(int i) {
        this.r = i;
    }

    public String r() {
        return this.n;
    }

    public void b(String str) {
        this.n = str;
    }

    public int ac() {
        int i = this.p;
        if (i != -1) {
            return gwc.c(i);
        }
        return -1;
    }

    public boolean ab() {
        return this.h <= 0 && this.o > 0;
    }

    @Override // defpackage.gxi
    public int h() {
        if (this.f36198c <= 0 || this.f36197b <= 0) {
            return -1;
        }
        return e() - c();
    }

    @Override // defpackage.gxi
    public boolean n() {
        return super.n() || this.o > 0 || this.p > 0;
    }

    @Override // defpackage.gxi
    public String toString() {
        return "PhoneSleepData{mWakeupDuration=" + this.s + ", mNoonSleepTime=" + this.o + ", mStayInBedTime=" + this.j + ", mEnvNoiseSeqData='" + this.k + "', mEnvNoiseStartTime=" + this.l + ", mEnvNoiseEndTime=" + this.m + ", mSleepEndReason=" + this.r + ", mEnvNoiseMetaData='" + this.n + "', getSleepLevel=" + ac() + ", getSleepEfficiency=" + g() + ", getSleepLatencyTime=" + h() + '}' + super.toString();
    }
}
