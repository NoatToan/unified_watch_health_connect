package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class z51 extends atk {
    public final float c;

    public z51(float f, float f2, float f3) {
        super(f, f2);
        this.c = f3;
    }

    public boolean f(float f, float f2, float f3) {
        if (Math.abs(f2 - d()) > f || Math.abs(f3 - c()) > f) {
            return false;
        }
        float fAbs = Math.abs(f - this.c);
        return fAbs <= 1.0f || fAbs <= this.c;
    }

    public z51 g(float f, float f2, float f3) {
        return new z51((c() + f2) / 2.0f, (d() + f) / 2.0f, (this.c + f3) / 2.0f);
    }
}
