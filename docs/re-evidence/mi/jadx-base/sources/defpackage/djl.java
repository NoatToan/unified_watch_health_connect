package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class djl extends b87.b {
    public static final BigInteger i = new BigInteger(1, i7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    public jjl h;

    public djl() {
        super(i);
        this.h = new jjl(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.c = j(new BigInteger(1, i7c.a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.d = new BigInteger(1, i7c.a("0100000000000000000000351EE786A818F3A1A16B"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new djl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new jjl(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new hjl(bigInteger);
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
