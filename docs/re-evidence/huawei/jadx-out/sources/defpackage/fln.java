package defpackage;

/* JADX INFO: loaded from: classes29.dex */
public class fln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f34184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34185b;
    private int d;
    private String e;

    public fln(long j, int i, int i2, String str) {
        this.e = str;
        this.f34184a = j;
        this.d = i;
        this.f34185b = i2;
    }

    public String e() {
        return this.e;
    }

    public long a() {
        return this.f34184a;
    }

    public int d() {
        return this.d;
    }

    public int b() {
        return this.f34185b;
    }

    public void b(int i) {
        this.f34185b = i;
    }

    public String toString() {
        return "mHuid = " + this.e + " mTimestamp = " + this.f34184a + " mType = " + this.d;
    }
}
