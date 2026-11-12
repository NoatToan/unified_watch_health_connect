package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class kf4 implements arl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23798b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;

    public kf4(long j, long j2, int i, int i2) {
        this.f23797a = j;
        this.f23798b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            this.d = j - j2;
            this.f = f(j, j2, i);
        }
    }

    public static long f(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    public final long a(long j) {
        long j2 = (j * ((long) this.e)) / 8000000;
        int i = this.c;
        return this.f23798b + wlq.s((j2 / ((long) i)) * ((long) i), 0L, this.d - ((long) i));
    }

    public long b(long j) {
        return f(j, this.f23798b, this.e);
    }

    @Override // defpackage.arl
    public arl.a d(long j) {
        if (this.d == -1) {
            return new arl.a(new crl(0L, this.f23798b));
        }
        long jA = a(j);
        long jB = b(jA);
        crl crlVar = new crl(jB, jA);
        if (jB < j) {
            int i = this.c;
            if (((long) i) + jA < this.f23797a) {
                long j2 = jA + ((long) i);
                return new arl.a(crlVar, new crl(b(j2), j2));
            }
        }
        return new arl.a(crlVar);
    }

    @Override // defpackage.arl
    public boolean e() {
        return this.d != -1;
    }

    @Override // defpackage.arl
    public long i() {
        return this.f;
    }
}
