package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class pbl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f30211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30212b;

    public pbl() {
        this(1.0f, 1.0f);
    }

    public boolean a(float f, float f2) {
        return this.f30211a == f && this.f30212b == f2;
    }

    public float b() {
        return this.f30211a;
    }

    public float c() {
        return this.f30212b;
    }

    public void d(float f, float f2) {
        this.f30211a = f;
        this.f30212b = f2;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public pbl(float f, float f2) {
        this.f30211a = f;
        this.f30212b = f2;
    }
}
