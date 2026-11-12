package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class udd extends ak8<udd> {
    public int c = 0;
    public Object d;

    public udd() {
        m();
    }

    public udd A(hed hedVar) {
        hedVar.getClass();
        this.c = 9;
        this.d = hedVar;
        return this;
    }

    public udd B(ied iedVar) {
        iedVar.getClass();
        this.c = 10;
        this.d = iedVar;
        return this;
    }

    public udd C(med medVar) {
        medVar.getClass();
        this.c = 3;
        this.d = medVar;
        return this;
    }

    public udd D(med.a aVar) {
        aVar.getClass();
        this.c = 2;
        this.d = aVar;
        return this;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.n(1, (dsf) this.d);
        }
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.n(2, (dsf) this.d);
        }
        if (this.c == 3) {
            iB += CodedOutputByteBufferNano.n(3, (dsf) this.d);
        }
        if (this.c == 4) {
            iB += CodedOutputByteBufferNano.n(4, (dsf) this.d);
        }
        if (this.c == 5) {
            iB += CodedOutputByteBufferNano.n(5, (dsf) this.d);
        }
        if (this.c == 6) {
            iB += CodedOutputByteBufferNano.n(6, (dsf) this.d);
        }
        if (this.c == 7) {
            iB += CodedOutputByteBufferNano.n(7, (dsf) this.d);
        }
        if (this.c == 8) {
            iB += CodedOutputByteBufferNano.n(8, (dsf) this.d);
        }
        if (this.c == 9) {
            iB += CodedOutputByteBufferNano.n(9, (dsf) this.d);
        }
        if (this.c == 10) {
            iB += CodedOutputByteBufferNano.n(10, (dsf) this.d);
        }
        if (this.c == 11) {
            iB += CodedOutputByteBufferNano.n(11, (dsf) this.d);
        }
        if (this.c == 12) {
            iB += CodedOutputByteBufferNano.n(12, (dsf) this.d);
        }
        if (this.c == 13) {
            iB += CodedOutputByteBufferNano.n(13, (dsf) this.d);
        }
        if (this.c == 14) {
            iB += CodedOutputByteBufferNano.n(14, (dsf) this.d);
        }
        if (this.c == 15) {
            iB += CodedOutputByteBufferNano.n(15, (dsf) this.d);
        }
        if (this.c == 16) {
            iB += CodedOutputByteBufferNano.n(16, (dsf) this.d);
        }
        if (this.c == 17) {
            iB += CodedOutputByteBufferNano.n(17, (dsf) this.d);
        }
        if (this.c == 18) {
            iB += CodedOutputByteBufferNano.n(18, (dsf) this.d);
        }
        if (this.c == 19) {
            iB += CodedOutputByteBufferNano.n(19, (dsf) this.d);
        }
        if (this.c == 20) {
            iB += CodedOutputByteBufferNano.n(20, (dsf) this.d);
        }
        if (this.c == 21) {
            iB += CodedOutputByteBufferNano.n(21, (dsf) this.d);
        }
        if (this.c == 22) {
            iB += CodedOutputByteBufferNano.n(22, (dsf) this.d);
        }
        if (this.c == 23) {
            iB += CodedOutputByteBufferNano.n(23, (dsf) this.d);
        }
        if (this.c == 24) {
            iB += CodedOutputByteBufferNano.n(24, (dsf) this.d);
        }
        if (this.c == 25) {
            iB += CodedOutputByteBufferNano.n(25, (dsf) this.d);
        }
        if (this.c == 26) {
            iB += CodedOutputByteBufferNano.n(26, (dsf) this.d);
        }
        if (this.c == 27) {
            iB += CodedOutputByteBufferNano.n(27, (dsf) this.d);
        }
        if (this.c == 28) {
            iB += CodedOutputByteBufferNano.n(28, (dsf) this.d);
        }
        if (this.c == 29) {
            iB += CodedOutputByteBufferNano.n(29, (dsf) this.d);
        }
        if (this.c == 30) {
            iB += CodedOutputByteBufferNano.n(30, (dsf) this.d);
        }
        if (this.c == 31) {
            iB += CodedOutputByteBufferNano.n(31, (dsf) this.d);
        }
        return this.c == 32 ? iB + CodedOutputByteBufferNano.n(32, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.c == 1) {
            codedOutputByteBufferNano.Y(1, (dsf) this.d);
        }
        if (this.c == 2) {
            codedOutputByteBufferNano.Y(2, (dsf) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.Y(3, (dsf) this.d);
        }
        if (this.c == 4) {
            codedOutputByteBufferNano.Y(4, (dsf) this.d);
        }
        if (this.c == 5) {
            codedOutputByteBufferNano.Y(5, (dsf) this.d);
        }
        if (this.c == 6) {
            codedOutputByteBufferNano.Y(6, (dsf) this.d);
        }
        if (this.c == 7) {
            codedOutputByteBufferNano.Y(7, (dsf) this.d);
        }
        if (this.c == 8) {
            codedOutputByteBufferNano.Y(8, (dsf) this.d);
        }
        if (this.c == 9) {
            codedOutputByteBufferNano.Y(9, (dsf) this.d);
        }
        if (this.c == 10) {
            codedOutputByteBufferNano.Y(10, (dsf) this.d);
        }
        if (this.c == 11) {
            codedOutputByteBufferNano.Y(11, (dsf) this.d);
        }
        if (this.c == 12) {
            codedOutputByteBufferNano.Y(12, (dsf) this.d);
        }
        if (this.c == 13) {
            codedOutputByteBufferNano.Y(13, (dsf) this.d);
        }
        if (this.c == 14) {
            codedOutputByteBufferNano.Y(14, (dsf) this.d);
        }
        if (this.c == 15) {
            codedOutputByteBufferNano.Y(15, (dsf) this.d);
        }
        if (this.c == 16) {
            codedOutputByteBufferNano.Y(16, (dsf) this.d);
        }
        if (this.c == 17) {
            codedOutputByteBufferNano.Y(17, (dsf) this.d);
        }
        if (this.c == 18) {
            codedOutputByteBufferNano.Y(18, (dsf) this.d);
        }
        if (this.c == 19) {
            codedOutputByteBufferNano.Y(19, (dsf) this.d);
        }
        if (this.c == 20) {
            codedOutputByteBufferNano.Y(20, (dsf) this.d);
        }
        if (this.c == 21) {
            codedOutputByteBufferNano.Y(21, (dsf) this.d);
        }
        if (this.c == 22) {
            codedOutputByteBufferNano.Y(22, (dsf) this.d);
        }
        if (this.c == 23) {
            codedOutputByteBufferNano.Y(23, (dsf) this.d);
        }
        if (this.c == 24) {
            codedOutputByteBufferNano.Y(24, (dsf) this.d);
        }
        if (this.c == 25) {
            codedOutputByteBufferNano.Y(25, (dsf) this.d);
        }
        if (this.c == 26) {
            codedOutputByteBufferNano.Y(26, (dsf) this.d);
        }
        if (this.c == 27) {
            codedOutputByteBufferNano.Y(27, (dsf) this.d);
        }
        if (this.c == 28) {
            codedOutputByteBufferNano.Y(28, (dsf) this.d);
        }
        if (this.c == 29) {
            codedOutputByteBufferNano.Y(29, (dsf) this.d);
        }
        if (this.c == 30) {
            codedOutputByteBufferNano.Y(30, (dsf) this.d);
        }
        if (this.c == 31) {
            codedOutputByteBufferNano.Y(31, (dsf) this.d);
        }
        if (this.c == 32) {
            codedOutputByteBufferNano.Y(32, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public udd m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public udd n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public gdd o() {
        if (this.c == 4) {
            return (gdd) this.d;
        }
        return null;
    }

    public sdd p() {
        if (this.c == 6) {
            return (sdd) this.d;
        }
        return null;
    }

    public ded q() {
        if (this.c == 11) {
            return (ded) this.d;
        }
        return null;
    }

    public hed r() {
        if (this.c == 9) {
            return (hed) this.d;
        }
        return null;
    }

    public led s() {
        if (this.c == 12) {
            return (led) this.d;
        }
        return null;
    }

    public red t() {
        if (this.c == 5) {
            return (red) this.d;
        }
        return null;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public udd e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    if (this.c != 1) {
                        this.d = new aed();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 1;
                    break;
                case 18:
                    if (this.c != 2) {
                        this.d = new med.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 2;
                    break;
                case 26:
                    if (this.c != 3) {
                        this.d = new med();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 3;
                    break;
                case 34:
                    if (this.c != 4) {
                        this.d = new gdd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 4;
                    break;
                case 42:
                    if (this.c != 5) {
                        this.d = new red();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 5;
                    break;
                case 50:
                    if (this.c != 6) {
                        this.d = new sdd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 6;
                    break;
                case 58:
                    if (this.c != 7) {
                        this.d = new qdd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 7;
                    break;
                case 66:
                    if (this.c != 8) {
                        this.d = new eed.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 8;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new hed();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 82:
                    if (this.c != 10) {
                        this.d = new ied();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 10;
                    break;
                case 90:
                    if (this.c != 11) {
                        this.d = new ded();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 11;
                    break;
                case 98:
                    if (this.c != 12) {
                        this.d = new led();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 12;
                    break;
                case 106:
                    if (this.c != 13) {
                        this.d = new ged();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 13;
                    break;
                case 114:
                    if (this.c != 14) {
                        this.d = new fed.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 14;
                    break;
                case 122:
                    if (this.c != 15) {
                        this.d = new rdd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 15;
                    break;
                case 130:
                    if (this.c != 16) {
                        this.d = new ced();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 16;
                    break;
                case 138:
                    if (this.c != 17) {
                        this.d = new bed();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 17;
                    break;
                case 146:
                    if (this.c != 18) {
                        this.d = new wdd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 18;
                    break;
                case 154:
                    if (this.c != 19) {
                        this.d = new vdd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 19;
                    break;
                case 162:
                    if (this.c != 20) {
                        this.d = new xdd.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 20;
                    break;
                case 170:
                    if (this.c != 21) {
                        this.d = new zdd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 21;
                    break;
                case 178:
                    if (this.c != 22) {
                        this.d = new ydd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 22;
                    break;
                case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
                    if (this.c != 23) {
                        this.d = new pdd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 23;
                    break;
                case SportReportBaseParser.ReportType.divingCNS /* 194 */:
                    if (this.c != 24) {
                        this.d = new ndd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 24;
                    break;
                case 202:
                    if (this.c != 25) {
                        this.d = new odd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 25;
                    break;
                case 210:
                    if (this.c != 26) {
                        this.d = new jed();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 26;
                    break;
                case 218:
                    if (this.c != 27) {
                        this.d = new ked();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 27;
                    break;
                case 226:
                    if (this.c != 28) {
                        this.d = new ldd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 28;
                    break;
                case 234:
                    if (this.c != 29) {
                        this.d = new mdd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 29;
                    break;
                case 242:
                    if (this.c != 30) {
                        this.d = new jdd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 30;
                    break;
                case 250:
                    if (this.c != 31) {
                        this.d = new ped();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 31;
                    break;
                case SportSummary.VERSION_102 /* 258 */:
                    if (this.c != 32) {
                        this.d = new oed();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 32;
                    break;
                default:
                    if (!l(o34Var, iA)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }

    public udd v(qdd qddVar) {
        qddVar.getClass();
        this.c = 7;
        this.d = qddVar;
        return this;
    }

    public udd w(aed aedVar) {
        aedVar.getClass();
        this.c = 1;
        this.d = aedVar;
        return this;
    }

    public udd x(bed bedVar) {
        bedVar.getClass();
        this.c = 17;
        this.d = bedVar;
        return this;
    }

    public udd y(ced cedVar) {
        cedVar.getClass();
        this.c = 16;
        this.d = cedVar;
        return this;
    }

    public udd z(eed.a aVar) {
        aVar.getClass();
        this.c = 8;
        this.d = aVar;
        return this;
    }
}
