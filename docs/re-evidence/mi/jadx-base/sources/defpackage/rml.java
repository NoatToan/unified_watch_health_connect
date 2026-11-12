package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class rml extends b87.a {
    public tml i;

    public rml() {
        super(131, 2, 3, 8);
        this.i = new tml(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.c = j(new BigInteger(1, i7c.a("04B8266A46C55657AC734CE38F018F2192")));
        this.d = new BigInteger(1, i7c.a("0400000000000000016954A233049BA98F"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new rml();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new tml(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new lml(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return 131;
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
