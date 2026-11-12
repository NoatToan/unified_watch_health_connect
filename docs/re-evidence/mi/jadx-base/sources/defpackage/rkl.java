package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class rkl extends b87.b {
    public static final BigInteger i = new BigInteger(1, i7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));
    public xkl h;

    public rkl() {
        super(i);
        this.h = new xkl(this, null, null);
        this.f3911b = j(y77.f39883a);
        this.c = j(BigInteger.valueOf(7L));
        this.d = new BigInteger(1, i7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new rkl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new xkl(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new vkl(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return i.bitLength();
    }

    @Override // defpackage.b87
    public i97 q() {
        return this.h;
    }

    @Override // defpackage.b87
    public boolean v(int i2) {
        return i2 == 2;
    }
}
