package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class nol extends b87.a {
    public pol i;

    public nol() {
        super(239, 158, 0, 0);
        this.i = new pol(this, null, null);
        this.f3911b = j(BigInteger.valueOf(0L));
        this.c = j(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, i7c.a("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new nol();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new pol(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new lol(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return 239;
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
