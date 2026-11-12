package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class dnl extends b87.a {
    public fnl i;

    public dnl() {
        super(163, 3, 6, 7);
        this.i = new fnl(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.c = j(new BigInteger(1, i7c.a("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.d = new BigInteger(1, i7c.a("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new dnl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new fnl(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new xml(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return 163;
    }

    @Override // defpackage.b87
    public i97 q() {
        return this.i;
    }

    @Override // defpackage.b87
    public boolean v(int i) {
        return i == 6;
    }
}
