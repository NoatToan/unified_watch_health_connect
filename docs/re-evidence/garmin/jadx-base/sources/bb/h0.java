package bb;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f17185c = new h0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17187b;

    public h0(long j8, long j14) {
        this.f17186a = j8;
        this.f17187b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.f17186a == h0Var.f17186a && this.f17187b == h0Var.f17187b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f17186a) * 31) + ((int) this.f17187b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[timeUs=");
        sb3.append(this.f17186a);
        sb3.append(", position=");
        return am.j.i(this.f17187b, "]", sb3);
    }
}
