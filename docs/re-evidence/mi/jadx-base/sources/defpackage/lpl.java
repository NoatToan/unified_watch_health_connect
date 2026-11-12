package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class lpl extends b87.a {
    public npl i;

    public lpl() {
        super(409, 87, 0, 0);
        this.i = new npl(this, null, null);
        this.f3911b = j(BigInteger.valueOf(1L));
        this.c = j(new BigInteger(1, i7c.a("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.d = new BigInteger(1, i7c.a("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new lpl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new npl(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new fpl(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return 409;
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
