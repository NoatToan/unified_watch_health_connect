package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class fol extends b87.a {
    public hol i;

    public fol() {
        super(233, 74, 0, 0);
        this.i = new hol(this, null, null);
        this.f3911b = j(BigInteger.valueOf(1L));
        this.c = j(new BigInteger(1, i7c.a("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
        this.d = new BigInteger(1, i7c.a("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new fol();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new hol(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new znl(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return 233;
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
