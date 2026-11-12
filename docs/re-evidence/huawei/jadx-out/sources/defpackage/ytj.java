package defpackage;

/* JADX INFO: loaded from: classes46.dex */
public class ytj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53858c;
    private int e;

    public ytj(String str, int i, int i2) {
        this.f53857b = str;
        this.e = i;
        this.f53858c = i2;
    }

    public String b() {
        return this.f53857b;
    }

    public int d() {
        return this.e;
    }

    public int c() {
        return this.f53858c;
    }

    public String toString() {
        return "UltrasonicInitParameter{productId=" + this.f53857b + ", sequence=" + this.e + ", foldState=" + this.f53858c + '}';
    }
}
