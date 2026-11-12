package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class sml extends a87.a {
    public uml j;

    public sml() {
        super(131, 2, 3, 8);
        this.j = new uml(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.c = m(new BigInteger(1, h7c.a("04B8266A46C55657AC734CE38F018F2192")));
        this.d = new BigInteger(1, h7c.a("0400000000000000016954A233049BA98F"));
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
        return new sml();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new uml(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new uml(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new mml(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return 131;
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.j;
    }
}
