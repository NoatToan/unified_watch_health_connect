package defpackage;

import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class dx9 implements arl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ex9 f16023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16024b;

    public dx9(ex9 ex9Var, long j) {
        this.f16023a = ex9Var;
        this.f16024b = j;
    }

    public final crl a(long j, long j2) {
        return new crl((j * FolmeCore.NANOS_TO_MS) / ((long) this.f16023a.e), this.f16024b + j2);
    }

    @Override // defpackage.arl
    public arl.a d(long j) {
        rk1.i(this.f16023a.f17151k);
        ex9 ex9Var = this.f16023a;
        ex9.a aVar = ex9Var.f17151k;
        long[] jArr = aVar.f17152a;
        long[] jArr2 = aVar.f17153b;
        int i = wlq.i(jArr, ex9Var.j(j), true, false);
        crl crlVarA = a(i == -1 ? 0L : jArr[i], i != -1 ? jArr2[i] : 0L);
        if (crlVarA.f14648a == j || i == jArr.length - 1) {
            return new arl.a(crlVarA);
        }
        int i2 = i + 1;
        return new arl.a(crlVarA, a(jArr[i2], jArr2[i2]));
    }

    @Override // defpackage.arl
    public boolean e() {
        return true;
    }

    @Override // defpackage.arl
    public long i() {
        return this.f16023a.g();
    }
}
