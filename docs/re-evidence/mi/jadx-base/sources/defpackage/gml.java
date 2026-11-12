package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class gml extends a87.a {
    public iml j;

    public gml() {
        super(113, 9, 0, 0);
        this.j = new iml(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.c = m(new BigInteger(1, h7c.a("0095E9A9EC9B297BD4BF36E059184F")));
        this.d = new BigInteger(1, h7c.a("010000000000000108789B2496AF93"));
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
        return new gml();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new iml(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new iml(this, g87Var, g87Var2, g87VarArr, z);
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
