package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ujl extends a87.b {
    public static final BigInteger j = new BigInteger(1, h7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));
    public akl i;

    public ujl() {
        super(j);
        this.i = new akl(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.c = m(new BigInteger(1, h7c.a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.d = new BigInteger(1, h7c.a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 2;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new ujl();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new akl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new akl(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new yjl(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return j.bitLength();
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.i;
    }
}
