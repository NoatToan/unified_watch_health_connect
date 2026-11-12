package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ril extends b87.b {
    public static final BigInteger i = djl.i;
    public til h;

    public ril() {
        super(i);
        this.h = new til(this, null, null);
        this.f3911b = j(y77.f39883a);
        this.c = j(BigInteger.valueOf(7L));
        this.d = new BigInteger(1, i7c.a("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new ril();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new til(this, h87Var, h87Var2, z);
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
