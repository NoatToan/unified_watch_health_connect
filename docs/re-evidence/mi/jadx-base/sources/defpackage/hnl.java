package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class hnl extends b87.a {
    public jnl i;

    public hnl() {
        super(163, 3, 6, 7);
        this.i = new jnl(this, null, null);
        this.f3911b = j(BigInteger.valueOf(1L));
        this.c = j(new BigInteger(1, i7c.a("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.d = new BigInteger(1, i7c.a("040000000000000000000292FE77E70C12A4234C33"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new hnl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new jnl(this, h87Var, h87Var2, z);
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
