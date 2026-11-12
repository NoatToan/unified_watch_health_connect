package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class col extends a87.a {
    public eol j;

    public col() {
        super(233, 74, 0, 0);
        this.j = new eol(this, null, null);
        this.f755b = m(BigInteger.valueOf(0L));
        this.c = m(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, h7c.a("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
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
        return new col();
    }

    @Override // defpackage.a87
    public w87 e() {
        return new i3r();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new eol(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new eol(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new aol(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return 233;
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.j;
    }
}
