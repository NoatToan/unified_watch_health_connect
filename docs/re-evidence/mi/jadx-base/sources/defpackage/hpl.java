package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class hpl extends b87.a {
    public jpl i;

    public hpl() {
        super(409, 87, 0, 0);
        this.i = new jpl(this, null, null);
        this.f3911b = j(BigInteger.valueOf(0L));
        this.c = j(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, i7c.a("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new hpl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new jpl(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new fpl(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return 409;
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
