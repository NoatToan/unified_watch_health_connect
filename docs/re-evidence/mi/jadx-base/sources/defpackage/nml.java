package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class nml extends b87.a {
    public pml i;

    public nml() {
        super(131, 2, 3, 8);
        this.i = new pml(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.c = j(new BigInteger(1, i7c.a("0217C05610884B63B9C6C7291678F9D341")));
        this.d = new BigInteger(1, i7c.a("0400000000000000023123953A9464B54D"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new nml();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new pml(this, h87Var, h87Var2, z);
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
