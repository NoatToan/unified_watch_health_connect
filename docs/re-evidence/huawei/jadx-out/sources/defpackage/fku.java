package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class fku {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f34147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f34148c;
    private float d;
    private float e;
    private double f;
    private boolean g;
    private String h;
    private double i;
    private float j;

    public void b(boolean z) {
        this.g = z;
    }

    public void c(double d) {
        this.f = d;
    }

    public void e(double d) {
        this.i = d;
    }

    public boolean h() {
        return this.g;
    }

    public String j() {
        return this.h;
    }

    public long g() {
        return this.f34148c;
    }

    public double i() {
        return this.f;
    }

    public double f() {
        return this.i;
    }

    public float e() {
        return this.j;
    }

    public float d() {
        return this.e;
    }

    public float b() {
        return this.d;
    }

    public float a() {
        return this.f34147b;
    }

    public float c() {
        return this.f34146a;
    }

    public fku(fku fkuVar) {
        this.j = 0.0f;
        this.g = false;
        if (fkuVar != null) {
            this.f = fkuVar.i();
            this.i = fkuVar.f();
            this.f34146a = fkuVar.c();
            this.e = fkuVar.d();
            this.f34147b = fkuVar.a();
            this.d = fkuVar.b();
            this.f34148c = fkuVar.g();
            this.h = fkuVar.j();
            this.j = fkuVar.e();
        }
    }

    public fku(double d, double d2, float f, float f2, float f3, float f4, long j, String str) {
        this.j = 0.0f;
        this.g = false;
        this.f = d2;
        this.i = d;
        this.f34146a = f;
        this.e = f2;
        this.f34147b = f3;
        this.d = f4;
        this.f34148c = j;
        this.h = str;
    }

    public fku() {
        this.j = 0.0f;
        this.g = false;
    }
}
