package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.j.b f8967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8975i;

    public g0(androidx.media3.exoplayer.source.j.b bVar, long j8, long j14, long j15, long j16, boolean z14, boolean z15, boolean z16, boolean z17) {
        boolean z18 = true;
        fa.a.a(!z17 || z15);
        fa.a.a(!z16 || z15);
        if (z14 && (z15 || z16 || z17)) {
            z18 = false;
        }
        fa.a.a(z18);
        this.f8967a = bVar;
        this.f8968b = j8;
        this.f8969c = j14;
        this.f8970d = j15;
        this.f8971e = j16;
        this.f8972f = z14;
        this.f8973g = z15;
        this.f8974h = z16;
        this.f8975i = z17;
    }

    public final g0 a(long j8) {
        if (j8 == this.f8969c) {
            return this;
        }
        return new g0(this.f8967a, this.f8968b, j8, this.f8970d, this.f8971e, this.f8972f, this.f8973g, this.f8974h, this.f8975i);
    }

    public final g0 b(long j8) {
        if (j8 == this.f8968b) {
            return this;
        }
        return new g0(this.f8967a, j8, this.f8969c, this.f8970d, this.f8971e, this.f8972f, this.f8973g, this.f8974h, this.f8975i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f8968b == g0Var.f8968b && this.f8969c == g0Var.f8969c && this.f8970d == g0Var.f8970d && this.f8971e == g0Var.f8971e && this.f8972f == g0Var.f8972f && this.f8973g == g0Var.f8973g && this.f8974h == g0Var.f8974h && this.f8975i == g0Var.f8975i) {
                androidx.media3.exoplayer.source.j.b bVar = g0Var.f8967a;
                int i14 = fa.z.f70071a;
                if (Objects.equals(this.f8967a, bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f8967a.hashCode() + 527) * 31) + ((int) this.f8968b)) * 31) + ((int) this.f8969c)) * 31) + ((int) this.f8970d)) * 31) + ((int) this.f8971e)) * 31) + (this.f8972f ? 1 : 0)) * 31) + (this.f8973g ? 1 : 0)) * 31) + (this.f8974h ? 1 : 0)) * 31) + (this.f8975i ? 1 : 0);
    }
}
