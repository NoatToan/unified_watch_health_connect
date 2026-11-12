package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class xpl extends b87.a {
    public static final rpl j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final rpl f39338k;
    public zpl i;

    static {
        rpl rplVar = new rpl(new BigInteger(1, i7c.a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        j = rplVar;
        f39338k = (rpl) rplVar.n();
    }

    public xpl() {
        super(571, 2, 5, 10);
        this.i = new zpl(this, null, null);
        this.f3911b = j(BigInteger.valueOf(1L));
        this.c = j;
        this.d = new BigInteger(1, i7c.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new xpl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new zpl(this, h87Var, h87Var2, z);
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
