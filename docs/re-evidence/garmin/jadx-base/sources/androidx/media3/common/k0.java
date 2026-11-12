package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f8334d = new k0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8337c;

    static {
        fa.z.H(0);
        fa.z.H(1);
        fa.z.H(3);
    }

    public k0(int i14, int i15, float f14) {
        this.f8335a = i14;
        this.f8336b = i15;
        this.f8337c = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (this.f8335a == k0Var.f8335a && this.f8336b == k0Var.f8336b && this.f8337c == k0Var.f8337c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f8337c) + ((((217 + this.f8335a) * 31) + this.f8336b) * 31);
    }

    public k0(int i14, int i15) {
        this(i14, i15, 1.0f);
    }

    @Deprecated
    public k0(int i14, int i15, int i16, float f14) {
        this(i14, i15, f14);
    }
}
