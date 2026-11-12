package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class bol extends b87.a {
    public dol i;

    public bol() {
        super(233, 74, 0, 0);
        this.i = new dol(this, null, null);
        this.f3911b = j(BigInteger.valueOf(0L));
        this.c = j(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, i7c.a("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new bol();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new dol(this, h87Var, h87Var2, z);
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
