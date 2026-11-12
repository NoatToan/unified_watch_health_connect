package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v0 f9773c = new v0(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9775b;

    public v0(boolean z14) {
        this.f9774a = 0;
        this.f9775b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f9774a == v0Var.f9774a && this.f9775b == v0Var.f9775b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9774a << 1) + (this.f9775b ? 1 : 0);
    }

    public v0(int i14, boolean z14) {
        this.f9774a = i14;
        this.f9775b = z14;
    }
}
