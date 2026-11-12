package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class tnl extends b87.a {
    public vnl i;

    public tnl() {
        super(SportReportBaseParser.ReportType.divingOTU, 15, 0, 0);
        this.i = new vnl(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.c = j(new BigInteger(1, i7c.a("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.d = new BigInteger(1, i7c.a("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new tnl();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new vnl(this, h87Var, h87Var2, z);
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
