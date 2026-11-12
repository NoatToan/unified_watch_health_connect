package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class dlt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f31979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31980c;
    private int d;
    private long e;

    public dlt(int i, long j, long j2, int i2, int i3) {
        this.f31980c = i;
        this.e = j;
        this.f31979b = j2;
        this.d = i2;
        this.f31978a = i3;
    }

    public long b() {
        return this.f31979b;
    }

    public int e() {
        return this.f31978a;
    }

    public String toString() {
        return "XiaomiStep{mId=" + this.f31980c + ", mBeginTime=" + this.e + ", mEndTime=" + this.f31979b + ", mMode=" + this.d + ", mSteps=" + this.f31978a + '}';
    }
}
