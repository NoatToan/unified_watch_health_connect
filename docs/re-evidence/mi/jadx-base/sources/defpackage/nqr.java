package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class nqr extends be {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static rqr f28269b = new rqr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h87 f28270a;

    public nqr(h87 h87Var) {
        this.f28270a = h87Var;
    }

    public h87 g() {
        return this.f28270a;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        return new pg5(f28269b.c(this.f28270a.s(), f28269b.b(this.f28270a)));
    }

    public nqr(BigInteger bigInteger, ge geVar) {
        this(new h87.b(bigInteger, new BigInteger(1, geVar.r())));
    }

    public nqr(int i, int i2, int i3, int i4, ge geVar) {
        this(new h87.a(i, i2, i3, i4, new BigInteger(1, geVar.r())));
    }
}
