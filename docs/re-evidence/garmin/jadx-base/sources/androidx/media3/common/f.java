package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8220b;

    public f(int i14, float f14) {
        this.f8219a = i14;
        this.f8220b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f8219a == fVar.f8219a && Float.compare(fVar.f8220b, this.f8220b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8220b) + ((527 + this.f8219a) * 31);
    }
}
