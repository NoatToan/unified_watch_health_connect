package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class gxk extends gxi {
    protected int f;
    protected int k;
    protected int l;
    protected int m;

    public int x() {
        return this.k;
    }

    public void g(int i) {
        this.k = i;
    }

    public int p() {
        return this.m;
    }

    public void h(int i) {
        this.m = i;
    }

    public int r() {
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

    public int q() {
        return this.l;
    }

    public void e(int i) {
        this.l = i;
    }

    @Override // defpackage.gxi
    public String toString() {
        return "CommonSleepData{mWakeupTimes=" + this.m + ", mDeepSleepTime=" + this.f + ", mShallowSleepTime=" + this.l + '}' + super.toString();
    }
}
