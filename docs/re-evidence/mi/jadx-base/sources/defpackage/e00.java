package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e00<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f16108b;
    public float c = 1.0f;
    public float d = 1.0f;
    public int e = 0;
    public int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16107a = 0;

    public e00(int i) {
        this.f16108b = new float[i];
    }

    public void a() {
        this.f16107a = 0;
    }

    public void b(float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    public int c() {
        return this.f16108b.length;
    }
}
