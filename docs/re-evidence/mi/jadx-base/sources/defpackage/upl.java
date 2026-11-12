package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class upl extends a87.a {
    public wpl j;

    public upl() {
        super(571, 2, 5, 10);
        this.j = new wpl(this, null, null);
        this.f755b = m(BigInteger.valueOf(0L));
        this.c = m(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, h7c.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 6;
    }

    @Override // a87.a
    public boolean G() {
        return true;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new upl();
    }

    @Override // defpackage.a87
    public w87 e() {
        return new i3r();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new wpl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new wpl(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new spl(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return 571;
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.j;
    }
}
