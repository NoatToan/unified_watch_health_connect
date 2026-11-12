package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class zml extends b87.a {
    public bnl i;

    public zml() {
        super(163, 3, 6, 7);
        this.i = new bnl(this, null, null);
        h87 h87VarJ = j(BigInteger.valueOf(1L));
        this.f3911b = h87VarJ;
        this.c = h87VarJ;
        this.d = new BigInteger(1, i7c.a("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new zml();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new bnl(this, h87Var, h87Var2, z);
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
