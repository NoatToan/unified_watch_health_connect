package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class jpi implements Serializable {
    private static final long serialVersionUID = -1029604556087330774L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f38791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38793c;
    private float d;
    private long e;
    private boolean f;
    private double g;
    private double h;
    private boolean i;
    private float j;
    private String l;

    public jpi() {
        this.j = 0.0f;
        this.f = false;
        this.i = false;
    }

    public jpi(double d, double d2, float f, float f2, float f3, float f4, long j, String str) {
        this.j = 0.0f;
        this.f = false;
        this.i = false;
        this.h = d2;
        this.g = d;
        this.d = f;
        this.f38792b = f2;
        this.f38793c = f3;
        this.f38791a = f4;
        this.e = j;
        this.l = str;
    }

    public jpi(jpi jpiVar) {
        this.j = 0.0f;
        this.f = false;
        this.i = false;
        if (jpiVar != null) {
            this.h = jpiVar.h();
            this.g = jpiVar.i();
            this.d = jpiVar.b();
            this.f38792b = jpiVar.d();
            this.f38793c = jpiVar.e();
            this.f38791a = jpiVar.c();
            this.e = jpiVar.f();
            this.l = jpiVar.g();
            this.j = jpiVar.a();
        }
    }

    public long f() {
        return this.e;
    }

    public float b() {
        return this.d;
    }

    public void b(double d) {
        this.g = d;
    }

    public void c(double d) {
        this.h = d;
    }

    public double i() {
        return this.g;
    }

    public double h() {
        return this.h;
    }

    public float d() {
        return this.f38792b;
    }

    public float e() {
        return this.f38793c;
    }

    public float c() {
        return this.f38791a;
    }

    public String g() {
        return this.l;
    }

    public boolean j() {
        return this.f;
    }

    public void d(boolean z) {
        this.f = z;
    }

    public float a() {
        return this.j;
    }

    public void b(float f) {
        this.j = f;
    }
}
