package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class bkl extends b87.b {
    public static final BigInteger i = new BigInteger(1, i7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    public hkl h;

    public bkl() {
        super(i);
        this.h = new hkl(this, null, null);
        this.f3911b = j(y77.f39883a);
        this.c = j(BigInteger.valueOf(5L));
        this.d = new BigInteger(1, i7c.a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new bkl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new hkl(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new fkl(bigInteger);
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
