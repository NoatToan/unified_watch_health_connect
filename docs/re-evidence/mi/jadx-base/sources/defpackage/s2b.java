package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class s2b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f33203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f33204b;
    public float c;

    public s2b(double d, double d2) {
        c(d);
        d(d2);
    }

    public double a() {
        return this.f33203a;
    }

    public double b() {
        return this.f33204b;
    }

    public void c(double d) {
        this.f33203a = d;
    }

    public void d(double d) {
        this.f33204b = d;
    }

    public String toString() {
        return this.f33203a + "," + this.f33204b;
    }

    public s2b(double d, double d2, float f) {
        c(d);
        d(d2);
        this.c = f;
    }
}
