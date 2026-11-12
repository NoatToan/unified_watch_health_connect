package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class pll extends b87.b {
    public static final BigInteger i = new BigInteger(1, i7c.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
    public vll h;

    public pll() {
        super(i);
        this.h = new vll(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = j(new BigInteger(1, i7c.a("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.d = new BigInteger(1, i7c.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new pll();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new vll(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new tll(bigInteger);
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
