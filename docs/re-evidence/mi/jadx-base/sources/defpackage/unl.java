package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class unl extends a87.a {
    public wnl j;

    public unl() {
        super(SportReportBaseParser.ReportType.divingOTU, 15, 0, 0);
        this.j = new wnl(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.c = m(new BigInteger(1, h7c.a("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.d = new BigInteger(1, h7c.a("010000000000000000000000015AAB561B005413CCD4EE99D5"));
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
        return new unl();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new wnl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new wnl(this, g87Var, g87Var2, g87VarArr, z);
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
