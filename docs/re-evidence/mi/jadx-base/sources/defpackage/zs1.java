package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zs1 extends a7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f41619b;
    public final float c;
    public final float d;

    public zs1(float f, float f2, float f3, float f4) {
        this.f41618a = f;
        this.f41619b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.a7d, defpackage.n1s
    public float a() {
        return this.f41619b;
    }

    @Override // defpackage.a7d, defpackage.n1s
    public float b() {
        return this.d;
    }

    @Override // defpackage.a7d, defpackage.n1s
    public float c() {
        return this.c;
    }

    @Override // defpackage.a7d, defpackage.n1s
    public float d() {
        return this.f41618a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a7d)) {
            return false;
        }
        a7d a7dVar = (a7d) obj;
        return Float.floatToIntBits(this.f41618a) == Float.floatToIntBits(a7dVar.d()) && Float.floatToIntBits(this.f41619b) == Float.floatToIntBits(a7dVar.a()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(a7dVar.c()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(a7dVar.b());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f41618a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f41619b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f41618a + ", maxZoomRatio=" + this.f41619b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}
