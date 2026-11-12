package defpackage;

import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class k6r implements arl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6r f23535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23536b;
    public final long c;
    public final long d;
    public final long e;

    public k6r(i6r i6rVar, int i, long j, long j2) {
        this.f23535a = i6rVar;
        this.f23536b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) i6rVar.e);
        this.d = j3;
        this.e = a(j3);
    }

    public final long a(long j) {
        return wlq.H0(j * ((long) this.f23536b), FolmeCore.NANOS_TO_MS, this.f23535a.c);
    }

    @Override // defpackage.arl
    public arl.a d(long j) {
        long jS = wlq.s((((long) this.f23535a.c) * j) / (((long) this.f23536b) * FolmeCore.NANOS_TO_MS), 0L, this.d - 1);
        long j2 = this.c + (((long) this.f23535a.e) * jS);
        long jA = a(jS);
        crl crlVar = new crl(jA, j2);
        if (jA >= j || jS == this.d - 1) {
            return new arl.a(crlVar);
        }
        long j3 = jS + 1;
        return new arl.a(crlVar, new crl(a(j3), this.c + (((long) this.f23535a.e) * j3)));
    }

    @Override // defpackage.arl
    public boolean e() {
        return true;
    }

    @Override // defpackage.arl
    public long i() {
        return this.e;
    }
}
