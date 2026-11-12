package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class cml extends a87.a {
    public eml j;

    public cml() {
        super(113, 9, 0, 0);
        this.j = new eml(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("003088250CA6E7C7FE649CE85820F7")));
        this.c = m(new BigInteger(1, h7c.a("00E8BEE4D3E2260744188BE0E9C723")));
        this.d = new BigInteger(1, h7c.a("0100000000000000D9CCEC8A39E56F"));
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
        return new cml();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new eml(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new eml(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new aml(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return 113;
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.j;
    }
}
