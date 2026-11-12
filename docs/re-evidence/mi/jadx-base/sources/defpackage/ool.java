package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ool extends a87.a {
    public qol j;

    public ool() {
        super(239, 158, 0, 0);
        this.j = new qol(this, null, null);
        this.f755b = m(BigInteger.valueOf(0L));
        this.c = m(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, h7c.a("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
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
        return new ool();
    }

    @Override // defpackage.a87
    public w87 e() {
        return new i3r();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new qol(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new qol(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new mol(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return 239;
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.j;
    }
}
