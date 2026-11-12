package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class apl extends a87.a {
    public cpl j;

    public apl() {
        super(283, 5, 7, 12);
        this.j = new cpl(this, null, null);
        this.f755b = m(BigInteger.valueOf(1L));
        this.c = m(new BigInteger(1, h7c.a("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.d = new BigInteger(1, h7c.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 6;
    }

    @Override // a87.a
    public boolean G() {
        return false;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new apl();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new cpl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new cpl(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new uol(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return 283;
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.j;
    }
}
