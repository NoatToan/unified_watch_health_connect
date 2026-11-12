package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ypl extends a87.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final spl f40406k;
    public static final spl l;
    public aql j;

    static {
        spl splVar = new spl(new BigInteger(1, h7c.a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        f40406k = splVar;
        l = (spl) splVar.n();
    }

    public ypl() {
        super(571, 2, 5, 10);
        this.j = new aql(this, null, null);
        this.f755b = m(BigInteger.valueOf(1L));
        this.c = f40406k;
        this.d = new BigInteger(1, h7c.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
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
        return new ypl();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new aql(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new aql(this, g87Var, g87Var2, g87VarArr, z);
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
