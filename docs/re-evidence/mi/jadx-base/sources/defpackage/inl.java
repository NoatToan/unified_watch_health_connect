package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class inl extends a87.a {
    public knl j;

    public inl() {
        super(163, 3, 6, 7);
        this.j = new knl(this, null, null);
        this.f755b = m(BigInteger.valueOf(1L));
        this.c = m(new BigInteger(1, h7c.a("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.d = new BigInteger(1, h7c.a("040000000000000000000292FE77E70C12A4234C33"));
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
        return new inl();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new knl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new knl(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new yml(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return 163;
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.j;
    }
}
