package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class dsm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32326a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32327c;
    private int d;
    private int e;

    public int a() {
        return this.d;
    }

    public void d(int i) {
        if (i == 65535) {
            this.d = -1;
        } else {
            this.d = i;
        }
    }

    public int c() {
        return this.e;
    }

    public void a(int i) {
        if (i == 65535) {
            this.e = -1;
        } else {
            this.e = i;
        }
    }

    public int d() {
        return this.f32326a;
    }

    public void b(int i) {
        this.f32326a = i;
    }

    public int e() {
        return this.f32327c;
    }

    public void e(int i) {
        this.f32327c = i;
    }

    public String toString() {
        return "RopeSkippingTrick{mSingleTrickNum=" + this.f32327c + ", mDoubleTrickNum=" + this.f32326a + ", mMultipleTrickNum=" + this.e + ", mReverseTrickNum=" + this.d + '}';
    }
}
