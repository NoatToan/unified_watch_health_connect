package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class fml extends b87.a {
    public hml i;

    public fml() {
        super(113, 9, 0, 0);
        this.i = new hml(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.c = j(new BigInteger(1, i7c.a("0095E9A9EC9B297BD4BF36E059184F")));
        this.d = new BigInteger(1, i7c.a("010000000000000108789B2496AF93"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new fml();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new hml(this, h87Var, h87Var2, z);
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
