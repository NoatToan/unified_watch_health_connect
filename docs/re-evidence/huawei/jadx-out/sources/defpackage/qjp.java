package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class qjp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46323c;
    private int d;
    private float e;
    private double g;
    private String i;

    public qjp(String str, double d, int i, int i2) {
        this.f46321a = str;
        this.g = d;
        this.f46322b = i;
        this.d = i2;
    }

    public qjp(String str, String str2, double d, int i, int i2) {
        this.f46321a = str;
        this.i = str2;
        this.g = d;
        this.f46322b = i;
        this.d = i2;
    }

    public int d() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public int c() {
        return this.f46322b;
    }

    public String a() {
        return this.f46321a;
    }

    public String j() {
        return this.i;
    }

    public double f() {
        return this.g;
    }

    public void b(double d) {
        this.g = d;
    }

    public void e(float f) {
        this.e = f;
    }

    public void b(int i) {
        this.f46323c = i;
    }

    public int e() {
        return this.f46323c;
    }

    public float b() {
        return this.e;
    }
}
