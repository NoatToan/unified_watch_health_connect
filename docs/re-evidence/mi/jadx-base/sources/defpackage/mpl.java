package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class mpl extends a87.a {
    public opl j;

    public mpl() {
        super(409, 87, 0, 0);
        this.j = new opl(this, null, null);
        this.f755b = m(BigInteger.valueOf(1L));
        this.c = m(new BigInteger(1, h7c.a("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.d = new BigInteger(1, h7c.a("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
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
        return new mpl();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new opl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new opl(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new gpl(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return 409;
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.j;
    }
}
