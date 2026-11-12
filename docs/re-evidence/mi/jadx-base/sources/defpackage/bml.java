package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class bml extends b87.a {
    public dml i;

    public bml() {
        super(113, 9, 0, 0);
        this.i = new dml(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("003088250CA6E7C7FE649CE85820F7")));
        this.c = j(new BigInteger(1, i7c.a("00E8BEE4D3E2260744188BE0E9C723")));
        this.d = new BigInteger(1, i7c.a("0100000000000000D9CCEC8A39E56F"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new bml();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new dml(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new zll(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return 113;
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
