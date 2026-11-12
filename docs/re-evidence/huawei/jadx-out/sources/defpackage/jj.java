package defpackage;

/* JADX INFO: loaded from: classes21.dex */
public class jj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38668c;
    private float e;

    public jj(float f, float f2) {
        this.f38668c = f;
        this.e = f2;
    }

    public jj() {
        this(1.0f, 1.0f);
    }

    public float d() {
        return this.f38668c;
    }

    public float b() {
        return this.e;
    }

    public void a(float f, float f2) {
        this.f38668c = f;
        this.e = f2;
    }

    public boolean b(float f, float f2) {
        return this.f38668c == f && this.e == f2;
    }

    public String toString() {
        return d() + "x" + b();
    }
}
