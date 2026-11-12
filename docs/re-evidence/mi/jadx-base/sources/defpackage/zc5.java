package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class zc5 extends b87.b {
    public static final BigInteger i = ahg.H(bd5.f4077a);
    public fd5 h;

    public zc5() {
        super(i);
        this.h = new fd5(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.c = j(new BigInteger(1, i7c.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.d = new BigInteger(1, i7c.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.e = BigInteger.valueOf(8L);
        this.f = 4;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new zc5();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new fd5(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new dd5(bigInteger);
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
        return i2 == 4;
    }
}
