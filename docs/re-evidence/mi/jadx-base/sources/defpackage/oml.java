package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class oml extends a87.a {
    public qml j;

    public oml() {
        super(131, 2, 3, 8);
        this.j = new qml(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.c = m(new BigInteger(1, h7c.a("0217C05610884B63B9C6C7291678F9D341")));
        this.d = new BigInteger(1, h7c.a("0400000000000000023123953A9464B54D"));
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
        return new oml();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new qml(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new qml(this, g87Var, g87Var2, g87VarArr, z);
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
