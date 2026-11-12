package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ipl extends a87.a {
    public kpl j;

    public ipl() {
        super(409, 87, 0, 0);
        this.j = new kpl(this, null, null);
        this.f755b = m(BigInteger.valueOf(0L));
        this.c = m(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, h7c.a("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
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
        return new ipl();
    }

    @Override // defpackage.a87
    public w87 e() {
        return new i3r();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new kpl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new kpl(this, g87Var, g87Var2, g87VarArr, z);
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
