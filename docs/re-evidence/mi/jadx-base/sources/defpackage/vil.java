package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class vil extends b87.b {
    public static final BigInteger i = new BigInteger(1, i7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));
    public bjl h;

    public vil() {
        super(i);
        this.h = new bjl(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.c = j(new BigInteger(1, i7c.a("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.d = new BigInteger(1, i7c.a("0100000000000000000001F4C8F927AED3CA752257"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new vil();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new bjl(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new zil(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return i.bitLength();
    }

    @Override // defpackage.b87
    public i97 q() {
        return this.h;
    }

    @Override // defpackage.b87
    public boolean v(int i2) {
        return i2 == 2;
    }
}
