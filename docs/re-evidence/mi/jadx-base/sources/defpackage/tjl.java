package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class tjl extends b87.b {
    public static final BigInteger i = new BigInteger(1, i7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));
    public zjl h;

    public tjl() {
        super(i);
        this.h = new zjl(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.c = j(new BigInteger(1, i7c.a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.d = new BigInteger(1, i7c.a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new tjl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new zjl(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new xjl(bigInteger);
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
