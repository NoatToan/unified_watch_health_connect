package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class brl {
    public static final brl c;
    public static final brl d;
    public static final brl e;
    public static final brl f;
    public static final brl g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4521b;

    static {
        brl brlVar = new brl(0L, 0L);
        c = brlVar;
        d = new brl(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new brl(Long.MAX_VALUE, 0L);
        f = new brl(0L, Long.MAX_VALUE);
        g = brlVar;
    }

    public brl(long j, long j2) {
        rk1.a(j >= 0);
        rk1.a(j2 >= 0);
        this.f4520a = j;
        this.f4521b = j2;
    }

    public long a(long j, long j2, long j3) {
        long j4 = this.f4520a;
        if (j4 == 0 && this.f4521b == 0) {
            return j;
        }
        long jQ0 = wlq.Q0(j, j4, Long.MIN_VALUE);
        long jB = wlq.b(j, this.f4521b, Long.MAX_VALUE);
        boolean z = false;
        boolean z2 = jQ0 <= j2 && j2 <= jB;
        if (jQ0 <= j3 && j3 <= jB) {
            z = true;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z2) {
            return j2;
        }
        return z ? j3 : jQ0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || brl.class != obj.getClass()) {
            return false;
        }
        brl brlVar = (brl) obj;
        return this.f4520a == brlVar.f4520a && this.f4521b == brlVar.f4521b;
    }

    public int hashCode() {
        return (((int) this.f4520a) * 31) + ((int) this.f4521b);
    }
}
