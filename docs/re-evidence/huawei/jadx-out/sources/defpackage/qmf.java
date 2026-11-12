package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class qmf extends qms {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f46475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected float f46476c;
    protected int d;
    protected float e;

    public qmf(float f, float f2) {
        this.f46475b = 0;
        this.d = 0;
        this.f46476c = f;
        this.e = f2;
    }

    public qmf(float f) {
        this.e = 0.0f;
        this.f46475b = 0;
        this.d = 0;
        this.f46476c = f;
    }

    public qmf(float f, int i, int i2) {
        this.e = 0.0f;
        this.f46476c = f;
        this.f46475b = i;
        this.d = i2;
    }

    public qmf(float f, float f2, int i, int i2) {
        this.f46476c = f;
        this.e = f2;
        this.f46475b = i;
        this.d = i2;
    }

    public float b() {
        return this.f46476c;
    }

    public void b(float f) {
        this.f46476c = f;
    }

    public float c() {
        return this.e;
    }

    public int f() {
        return this.f46475b;
    }

    public int i() {
        return this.d;
    }
}
