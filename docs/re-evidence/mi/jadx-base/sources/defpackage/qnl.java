package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class qnl extends a87.a {
    public snl j;

    public qnl() {
        super(SportReportBaseParser.ReportType.divingOTU, 15, 0, 0);
        this.j = new snl(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.c = m(new BigInteger(1, h7c.a("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.d = new BigInteger(1, h7c.a("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 6;
    }

    @Override // a87.a
    public boolean G() {
        return false;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new qnl();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new snl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new snl(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new onl(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return SportReportBaseParser.ReportType.divingOTU;
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.j;
    }
}
