package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class tpl extends b87.a {
    public vpl i;

    public tpl() {
        super(571, 2, 5, 10);
        this.i = new vpl(this, null, null);
        this.f3911b = j(BigInteger.valueOf(0L));
        this.c = j(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, i7c.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new tpl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new vpl(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new rpl(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return 571;
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
