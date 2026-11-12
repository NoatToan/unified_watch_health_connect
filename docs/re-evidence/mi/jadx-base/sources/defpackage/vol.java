package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class vol extends b87.a {
    public xol i;

    public vol() {
        super(283, 5, 7, 12);
        this.i = new xol(this, null, null);
        this.f3911b = j(BigInteger.valueOf(0L));
        this.c = j(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, i7c.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new vol();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new xol(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new tol(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return 283;
    }

    @Override // defpackage.b87
    public i97 q() {
        return this.i;
    }

    @Override // defpackage.b87
    public boolean v(int i) {
        return i == 6;
    }
}
