package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class qml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f46483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f46485c;
    private float d;
    private int e;

    public qml(float f, float f2, float f3, float f4) {
        this.e = 0;
        this.d = f;
        this.f46485c = f2;
        this.f46483a = f3;
        this.f46484b = f4;
    }

    public qml(float f, float f2, float f3, float f4, int i) {
        this(f, f2, f3, f4);
        this.e = i;
    }

    public float c() {
        return this.d;
    }

    public float e() {
        return this.f46485c;
    }

    public float d() {
        return this.f46483a;
    }

    public float b() {
        return this.f46484b;
    }

    public int a() {
        return this.e;
    }
}
