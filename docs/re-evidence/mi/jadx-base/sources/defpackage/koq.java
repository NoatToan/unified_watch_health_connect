package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class koq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f24061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f24062b;
    public float c;
    public float d;
    public float e;
    public float f;

    public void a(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.c;
        float f8 = f4 + this.d;
        float f9 = f7 + (this.f24061a * f5);
        float f10 = f8 + (this.f24062b * f6);
        float radians = (float) Math.toRadians(this.f);
        float radians2 = (float) Math.toRadians(this.e);
        double d = radians;
        double d2 = i2 * f6;
        float fSin = f9 + (((float) ((((double) ((-i) * f5)) * Math.sin(d)) - (Math.cos(d) * d2))) * radians2);
        float fCos = f10 + (radians2 * ((float) ((((double) (i * f5)) * Math.cos(d)) - (d2 * Math.sin(d)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void b() {
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.f24062b = 0.0f;
        this.f24061a = 0.0f;
    }

    public void c(uzd uzdVar, float f) {
        if (uzdVar != null) {
            this.e = uzdVar.b(f);
        }
    }

    public void d(e7n e7nVar, float f) {
        if (e7nVar != null) {
            this.e = e7nVar.b(f);
            this.f = e7nVar.a(f);
        }
    }

    public void e(uzd uzdVar, uzd uzdVar2, float f) {
        if (uzdVar != null) {
            this.f24061a = uzdVar.b(f);
        }
        if (uzdVar2 != null) {
            this.f24062b = uzdVar2.b(f);
        }
    }

    public void f(e7n e7nVar, e7n e7nVar2, float f) {
        if (e7nVar != null) {
            this.f24061a = e7nVar.b(f);
        }
        if (e7nVar2 != null) {
            this.f24062b = e7nVar2.b(f);
        }
    }

    public void g(uzd uzdVar, uzd uzdVar2, float f) {
        if (uzdVar != null) {
            this.c = uzdVar.b(f);
        }
        if (uzdVar2 != null) {
            this.d = uzdVar2.b(f);
        }
    }

    public void h(e7n e7nVar, e7n e7nVar2, float f) {
        if (e7nVar != null) {
            this.c = e7nVar.b(f);
        }
        if (e7nVar2 != null) {
            this.d = e7nVar2.b(f);
        }
    }
}
