package defpackage;

/* JADX INFO: loaded from: classes23.dex */
public class caq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1404b;
    private final int d;
    private final float e;

    public caq(int i, float f, int i2, int i3) {
        this.d = i;
        this.e = f;
        this.f1403a = i2;
        this.f1404b = i3;
    }

    public int c() {
        return this.d;
    }

    public float e() {
        return this.e;
    }

    public int b() {
        return this.f1403a;
    }

    public int a() {
        return this.f1404b;
    }

    public String toString() {
        return "DayTaskStatus{mType=" + this.d + ", mCloverScale=" + this.e + ", mCompleted=" + this.f1403a + ", mCloverStatus=" + this.f1404b + '}';
    }
}
