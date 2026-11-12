package defpackage;

/* JADX INFO: loaded from: classes42.dex */
public class ppm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f45772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f45773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f45774c;
    private float d;
    private float e;
    private float f;
    private float h;
    private boolean i;
    private boolean j;

    public void e(float f, float f2, boolean z, float f3, boolean z2, float f4, float f5, boolean z3, float f6) {
        this.h = f;
        this.f = f2;
        this.j = z;
        if (f3 == 0.0f) {
            f3 = 1.0f;
        }
        this.f45773b = f3;
        this.i = z2;
        if (f4 == 0.0f) {
            f4 = 1.0f;
        }
        this.e = f4;
        if (f5 == 0.0f) {
            f5 = 1.0f;
        }
        this.d = f5;
        this.f45772a = z3;
        this.f45774c = f6;
    }

    protected void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.h = f;
        this.f = f2;
        if (f3 == 0.0f) {
            f3 = 1.0f;
        }
        this.f45773b = f3;
        if (f4 == 0.0f) {
            f4 = 1.0f;
        }
        this.e = f4;
        if (f5 == 0.0f) {
            f5 = 1.0f;
        }
        this.d = f5;
        this.f45774c = f6;
    }

    public float f() {
        return this.f;
    }

    public float d() {
        return this.h;
    }

    public float c() {
        if (this.i) {
            return this.e;
        }
        return 1.0f;
    }

    public float e() {
        if (this.j) {
            return this.f45773b;
        }
        return 1.0f;
    }

    public float b() {
        if (this.f45772a) {
            return this.f45774c;
        }
        return 0.0f;
    }

    public float a() {
        if (this.i) {
            return this.d;
        }
        return 1.0f;
    }

    public boolean j() {
        return this.j;
    }

    public boolean i() {
        return this.i;
    }

    public boolean g() {
        return this.f45772a;
    }
}
