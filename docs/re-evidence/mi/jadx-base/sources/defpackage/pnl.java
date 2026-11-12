package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class pnl extends b87.a {
    public rnl i;

    public pnl() {
        super(SportReportBaseParser.ReportType.divingOTU, 15, 0, 0);
        this.i = new rnl(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.c = j(new BigInteger(1, i7c.a("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.d = new BigInteger(1, i7c.a("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new pnl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new rnl(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new nnl(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return SportReportBaseParser.ReportType.divingOTU;
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
