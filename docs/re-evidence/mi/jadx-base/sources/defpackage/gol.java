package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class gol extends a87.a {
    public iol j;

    public gol() {
        super(233, 74, 0, 0);
        this.j = new iol(this, null, null);
        this.f755b = m(BigInteger.valueOf(1L));
        this.c = m(new BigInteger(1, h7c.a("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
        this.d = new BigInteger(1, h7c.a("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
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
        return new gol();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new iol(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new iol(this, g87Var, g87Var2, g87VarArr, z);
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
