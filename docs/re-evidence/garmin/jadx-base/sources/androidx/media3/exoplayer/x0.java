package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0 f9876c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9878b;

    static {
        x0 x0Var = new x0(0L, 0L);
        new x0(Long.MAX_VALUE, Long.MAX_VALUE);
        new x0(Long.MAX_VALUE, 0L);
        new x0(0L, Long.MAX_VALUE);
        f9876c = x0Var;
    }

    public x0(long j8, long j14) {
        fa.a.a(j8 >= 0);
        fa.a.a(j14 >= 0);
        this.f9877a = j8;
        this.f9878b = j14;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005d A[RETURN] */
    public final long a(long j8, long j14, long j15) {
        long j16 = this.f9877a;
        long j17 = this.f9878b;
        if (j16 == 0 && j17 == 0) {
            return j8;
        }
        int i14 = fa.z.f70071a;
        long j18 = j8 - j16;
        if (((j16 ^ j8) & (j8 ^ j18)) < 0) {
            j18 = Long.MIN_VALUE;
        }
        long j19 = j8 + j17;
        if (((j17 ^ j19) & (j8 ^ j19)) < 0) {
            j19 = Long.MAX_VALUE;
        }
        boolean z14 = false;
        boolean z15 = j18 <= j14 && j14 <= j19;
        if (j18 <= j15 && j15 <= j19) {
            z14 = true;
        }
        if (z15 && z14) {
            if (Math.abs(j14 - j8) <= Math.abs(j15 - j8)) {
                return j14;
            }
            return j15;
        }
        if (!z15) {
            if (z14) {
                return j15;
            }
            return j18;
        }
        return j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f9877a == x0Var.f9877a && this.f9878b == x0Var.f9878b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9877a) * 31) + ((int) this.f9878b);
    }
}
