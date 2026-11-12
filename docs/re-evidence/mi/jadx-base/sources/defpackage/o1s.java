package defpackage;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o1s implements n1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f28656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28657b;
    public final float c;
    public float d;

    public o1s(float f, float f2) {
        this.f28657b = f;
        this.c = f2;
    }

    @Override // defpackage.n1s
    public float a() {
        return this.f28657b;
    }

    @Override // defpackage.n1s
    public float b() {
        return this.d;
    }

    @Override // defpackage.n1s
    public float c() {
        return this.c;
    }

    @Override // defpackage.n1s
    public float d() {
        return this.f28656a;
    }

    public final float e(float f) {
        float f2 = this.f28657b;
        float f3 = this.c;
        if (f2 == f3) {
            return 0.0f;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return 0.0f;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    public void f(float f) throws IllegalArgumentException {
        if (f <= this.f28657b && f >= this.c) {
            this.f28656a = f;
            this.d = e(f);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.c + " , " + this.f28657b + "]");
    }
}
