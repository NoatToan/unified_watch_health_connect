package defpackage;

/* JADX INFO: loaded from: classes19.dex */
public class vrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f51520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51522c;
    private boolean e;

    public vrf(String str, double d, boolean z, int i) {
        this.f51522c = str;
        this.f51520a = d;
        this.e = z;
        this.f51521b = i;
    }

    public String e() {
        return this.f51522c;
    }

    public void d(double d) {
        this.f51520a = d;
    }

    public double a() {
        return this.f51520a;
    }

    public void d(boolean z) {
        this.e = z;
    }

    public boolean c() {
        return this.e;
    }

    public int b() {
        return this.f51521b;
    }
}
