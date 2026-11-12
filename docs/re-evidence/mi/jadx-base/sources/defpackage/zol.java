package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class zol extends b87.a {
    public bpl i;

    public zol() {
        super(283, 5, 7, 12);
        this.i = new bpl(this, null, null);
        this.f3911b = j(BigInteger.valueOf(1L));
        this.c = j(new BigInteger(1, i7c.a("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.d = new BigInteger(1, i7c.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new zol();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new bpl(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new tol(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return 283;
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
