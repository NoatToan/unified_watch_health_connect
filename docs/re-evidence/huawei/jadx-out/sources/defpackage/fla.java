package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class fla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f34156a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34158c = 3;
    private int i = 100;
    private float j = 1.5f;
    private float f = 3.0f;
    private float[] e = {12.0f, 12.0f, 33.3f};
    private float h = 0.3f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f34157b = 2.8f;
    private boolean d = true;
    private int n = 3;
    private int g = 20000;

    public void c(boolean z) {
        this.f34156a = z;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void b(float f) {
        this.j = f;
    }

    public void d(float f) {
        this.h = f;
    }

    public void d(int i) {
        this.i = i;
    }

    public void e(float f) {
        this.f = f;
    }

    public void d(float[] fArr) {
        if (fArr != null) {
            this.e = (float[]) fArr.clone();
        }
    }

    public void a(float f) {
        this.f34157b = f;
    }

    public boolean f() {
        return this.f34156a;
    }

    public boolean h() {
        return this.d;
    }

    public int g() {
        return this.n;
    }

    public int i() {
        return this.g;
    }

    public float j() {
        return this.j;
    }

    public float d() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public float e() {
        return this.f;
    }

    public int b() {
        return this.f34158c;
    }

    public float e(int i) {
        if (i < 0) {
            return 0.0f;
        }
        float[] fArr = this.e;
        if (i >= fArr.length) {
            return 0.0f;
        }
        return fArr[i];
    }

    public float a() {
        return this.f34157b;
    }
}
