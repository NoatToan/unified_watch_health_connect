package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class vr9 extends ak8<vr9> {
    public int c = 0;
    public Object d;

    public vr9() {
        m();
    }

    public ft9.a A() {
        if (this.c == 4) {
            return (ft9.a) this.d;
        }
        return null;
    }

    public eu9 B() {
        if (this.c == 26) {
            return (eu9) this.d;
        }
        return null;
    }

    public gu9 C() {
        if (this.c == 20) {
            return (gu9) this.d;
        }
        return null;
    }

    public iu9 D() {
        if (this.c == 21) {
            return (iu9) this.d;
        }
        return null;
    }

    public ku9 E() {
        if (this.c == 24) {
            return (ku9) this.d;
        }
        return null;
    }

    public fv9 F() {
        if (this.c == 23) {
            return (fv9) this.d;
        }
        return null;
    }

    public hv9 G() {
        if (this.c == 42) {
            return (hv9) this.d;
        }
        return null;
    }

    public boolean H() {
        return this.c == 3;
    }

    public boolean I() {
        return this.c == 2;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public vr9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    if (this.c != 1) {
                        this.d = new uu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 1;
                    break;
                case 18:
                    this.d = o34Var.l();
                    this.c = 2;
                    break;
                case 26:
                    this.d = o34Var.l();
                    this.c = 3;
                    break;
                case 34:
                    if (this.c != 4) {
                        this.d = new ft9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 4;
                    break;
                case 42:
                    if (this.c != 5) {
                        this.d = new ou9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 5;
                    break;
                case 58:
                    if (this.c != 7) {
                        this.d = new gr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 7;
                    break;
                case 66:
                    if (this.c != 8) {
                        this.d = new ks9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 8;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new tt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 82:
                    if (this.c != 10) {
                        this.d = new et9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 10;
                    break;
                case 138:
                    if (this.c != 17) {
                        this.d = new ct9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 17;
                    break;
                case 146:
                    if (this.c != 18) {
                        this.d = new at9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 18;
                    break;
                case 154:
                    if (this.c != 19) {
                        this.d = new ys9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 19;
                    break;
                case 162:
                    if (this.c != 20) {
                        this.d = new gu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 20;
                    break;
                case 170:
                    if (this.c != 21) {
                        this.d = new iu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 21;
                    break;
                case 178:
                    if (this.c != 22) {
                        this.d = new ss9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 22;
                    break;
                case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
                    if (this.c != 23) {
                        this.d = new fv9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 23;
                    break;
                case SportReportBaseParser.ReportType.divingCNS /* 194 */:
                    if (this.c != 24) {
                        this.d = new ku9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 24;
                    break;
                case 202:
                    if (this.c != 25) {
                        this.d = new cu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 25;
                    break;
                case 210:
                    if (this.c != 26) {
                        this.d = new eu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 26;
                    break;
                case 218:
                    if (this.c != 27) {
                        this.d = new nr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 27;
                    break;
                case 226:
                    if (this.c != 28) {
                        this.d = new pr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 28;
                    break;
                case 234:
                    if (this.c != 29) {
                        this.d = new lr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 29;
                    break;
                case 242:
                    if (this.c != 30) {
                        this.d = new rr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 30;
                    break;
                case 274:
                    if (this.c != 34) {
                        this.d = new iv9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 34;
                    break;
                case 280:
                    this.d = Boolean.valueOf(o34Var.k());
                    this.c = 35;
                    break;
                case 290:
                    if (this.c != 36) {
                        this.d = new iv9.b.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 36;
                    break;
                case 298:
                    if (this.c != 37) {
                        this.d = new wt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 37;
                    break;
                case 306:
                    if (this.c != 38) {
                        this.d = new hs9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 38;
                    break;
                case 314:
                    if (this.c != 39) {
                        this.d = new cr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 39;
                    break;
                case 322:
                    if (this.c != 40) {
                        this.d = new ws9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 40;
                    break;
                case 330:
                    if (this.c != 41) {
                        this.d = new us9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 41;
                    break;
                case 338:
                    if (this.c != 42) {
                        this.d = new hv9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 42;
                    break;
                case 346:
                    if (this.c != 43) {
                        this.d = new yu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 43;
                    break;
                case 354:
                    if (this.c != 44) {
                        this.d = new dr9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 44;
                    break;
                case 402:
                    if (this.c != 50) {
                        this.d = new cs9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 50;
                    break;
                case 410:
                    if (this.c != 51) {
                        this.d = new es9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 51;
                    break;
                case 418:
                    if (this.c != 52) {
                        this.d = new xr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 52;
                    break;
                case StdStatuses.UPGRADE_REQUIRED /* 426 */:
                    if (this.c != 53) {
                        this.d = new as9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 53;
                    break;
                case 434:
                    if (this.c != 54) {
                        this.d = new fs9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 54;
                    break;
                case 442:
                    if (this.c != 55) {
                        this.d = new yr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 55;
                    break;
                case 450:
                    if (this.c != 56) {
                        this.d = new ir9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 56;
                    break;
                case 458:
                    if (this.c != 57) {
                        this.d = new tr9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 57;
                    break;
                case 466:
                    if (this.c != 58) {
                        this.d = new sr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 58;
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

    public vr9 K(tr9.a aVar) {
        aVar.getClass();
        this.c = 57;
        this.d = aVar;
        return this;
    }

    public vr9 L(xr9 xr9Var) {
        xr9Var.getClass();
        this.c = 52;
        this.d = xr9Var;
        return this;
    }

    public vr9 M(cs9 cs9Var) {
        cs9Var.getClass();
        this.c = 50;
        this.d = cs9Var;
        return this;
    }

    public vr9 N(fs9.a aVar) {
        aVar.getClass();
        this.c = 54;
        this.d = aVar;
        return this;
    }

    public vr9 O(byte[] bArr) {
        this.c = 3;
        this.d = bArr;
        return this;
    }

    public vr9 P(byte[] bArr) {
        this.c = 2;
        this.d = bArr;
        return this;
    }

    public vr9 Q(ss9 ss9Var) {
        ss9Var.getClass();
        this.c = 22;
        this.d = ss9Var;
        return this;
    }

    public vr9 R(us9 us9Var) {
        us9Var.getClass();
        this.c = 41;
        this.d = us9Var;
        return this;
    }

    public vr9 S(ws9 ws9Var) {
        ws9Var.getClass();
        this.c = 40;
        this.d = ws9Var;
        return this;
    }

    public vr9 T(dr9.a aVar) {
        aVar.getClass();
        this.c = 44;
        this.d = aVar;
        return this;
    }

    public vr9 U(cu9 cu9Var) {
        cu9Var.getClass();
        this.c = 25;
        this.d = cu9Var;
        return this;
    }

    public vr9 V(gu9 gu9Var) {
        gu9Var.getClass();
        this.c = 20;
        this.d = gu9Var;
        return this;
    }

    public vr9 W(ou9 ou9Var) {
        ou9Var.getClass();
        this.c = 5;
        this.d = ou9Var;
        return this;
    }

    public vr9 X(uu9 uu9Var) {
        uu9Var.getClass();
        this.c = 1;
        this.d = uu9Var;
        return this;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.n(1, (dsf) this.d);
        }
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.d(2, (byte[]) this.d);
        }
        if (this.c == 3) {
            iB += CodedOutputByteBufferNano.d(3, (byte[]) this.d);
        }
        if (this.c == 4) {
            iB += CodedOutputByteBufferNano.n(4, (dsf) this.d);
        }
        if (this.c == 5) {
            iB += CodedOutputByteBufferNano.n(5, (dsf) this.d);
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
        if (this.c == 34) {
            iB += CodedOutputByteBufferNano.n(34, (dsf) this.d);
        }
        if (this.c == 35) {
            iB += CodedOutputByteBufferNano.b(35, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 36) {
            iB += CodedOutputByteBufferNano.n(36, (dsf) this.d);
        }
        if (this.c == 37) {
            iB += CodedOutputByteBufferNano.n(37, (dsf) this.d);
        }
        if (this.c == 38) {
            iB += CodedOutputByteBufferNano.n(38, (dsf) this.d);
        }
        if (this.c == 39) {
            iB += CodedOutputByteBufferNano.n(39, (dsf) this.d);
        }
        if (this.c == 40) {
            iB += CodedOutputByteBufferNano.n(40, (dsf) this.d);
        }
        if (this.c == 41) {
            iB += CodedOutputByteBufferNano.n(41, (dsf) this.d);
        }
        if (this.c == 42) {
            iB += CodedOutputByteBufferNano.n(42, (dsf) this.d);
        }
        if (this.c == 43) {
            iB += CodedOutputByteBufferNano.n(43, (dsf) this.d);
        }
        if (this.c == 44) {
            iB += CodedOutputByteBufferNano.n(44, (dsf) this.d);
        }
        if (this.c == 50) {
            iB += CodedOutputByteBufferNano.n(50, (dsf) this.d);
        }
        if (this.c == 51) {
            iB += CodedOutputByteBufferNano.n(51, (dsf) this.d);
        }
        if (this.c == 52) {
            iB += CodedOutputByteBufferNano.n(52, (dsf) this.d);
        }
        if (this.c == 53) {
            iB += CodedOutputByteBufferNano.n(53, (dsf) this.d);
        }
        if (this.c == 54) {
            iB += CodedOutputByteBufferNano.n(54, (dsf) this.d);
        }
        if (this.c == 55) {
            iB += CodedOutputByteBufferNano.n(55, (dsf) this.d);
        }
        if (this.c == 56) {
            iB += CodedOutputByteBufferNano.n(56, (dsf) this.d);
        }
        if (this.c == 57) {
            iB += CodedOutputByteBufferNano.n(57, (dsf) this.d);
        }
        return this.c == 58 ? iB + CodedOutputByteBufferNano.n(58, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.c == 1) {
            codedOutputByteBufferNano.Y(1, (dsf) this.d);
        }
        if (this.c == 2) {
            codedOutputByteBufferNano.O(2, (byte[]) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.O(3, (byte[]) this.d);
        }
        if (this.c == 4) {
            codedOutputByteBufferNano.Y(4, (dsf) this.d);
        }
        if (this.c == 5) {
            codedOutputByteBufferNano.Y(5, (dsf) this.d);
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
        if (this.c == 34) {
            codedOutputByteBufferNano.Y(34, (dsf) this.d);
        }
        if (this.c == 35) {
            codedOutputByteBufferNano.M(35, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 36) {
            codedOutputByteBufferNano.Y(36, (dsf) this.d);
        }
        if (this.c == 37) {
            codedOutputByteBufferNano.Y(37, (dsf) this.d);
        }
        if (this.c == 38) {
            codedOutputByteBufferNano.Y(38, (dsf) this.d);
        }
        if (this.c == 39) {
            codedOutputByteBufferNano.Y(39, (dsf) this.d);
        }
        if (this.c == 40) {
            codedOutputByteBufferNano.Y(40, (dsf) this.d);
        }
        if (this.c == 41) {
            codedOutputByteBufferNano.Y(41, (dsf) this.d);
        }
        if (this.c == 42) {
            codedOutputByteBufferNano.Y(42, (dsf) this.d);
        }
        if (this.c == 43) {
            codedOutputByteBufferNano.Y(43, (dsf) this.d);
        }
        if (this.c == 44) {
            codedOutputByteBufferNano.Y(44, (dsf) this.d);
        }
        if (this.c == 50) {
            codedOutputByteBufferNano.Y(50, (dsf) this.d);
        }
        if (this.c == 51) {
            codedOutputByteBufferNano.Y(51, (dsf) this.d);
        }
        if (this.c == 52) {
            codedOutputByteBufferNano.Y(52, (dsf) this.d);
        }
        if (this.c == 53) {
            codedOutputByteBufferNano.Y(53, (dsf) this.d);
        }
        if (this.c == 54) {
            codedOutputByteBufferNano.Y(54, (dsf) this.d);
        }
        if (this.c == 55) {
            codedOutputByteBufferNano.Y(55, (dsf) this.d);
        }
        if (this.c == 56) {
            codedOutputByteBufferNano.Y(56, (dsf) this.d);
        }
        if (this.c == 57) {
            codedOutputByteBufferNano.Y(57, (dsf) this.d);
        }
        if (this.c == 58) {
            codedOutputByteBufferNano.Y(58, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public vr9 m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public vr9 n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public cr9 o() {
        if (this.c == 39) {
            return (cr9) this.d;
        }
        return null;
    }

    public ir9 p() {
        if (this.c == 56) {
            return (ir9) this.d;
        }
        return null;
    }

    public sr9 q() {
        if (this.c == 58) {
            return (sr9) this.d;
        }
        return null;
    }

    public tr9.a r() {
        if (this.c == 57) {
            return (tr9.a) this.d;
        }
        return null;
    }

    public yr9 s() {
        if (this.c == 55) {
            return (yr9) this.d;
        }
        return null;
    }

    public as9 t() {
        if (this.c == 53) {
            return (as9) this.d;
        }
        return null;
    }

    public cs9 u() {
        if (this.c == 50) {
            return (cs9) this.d;
        }
        return null;
    }

    public es9 v() {
        if (this.c == 51) {
            return (es9) this.d;
        }
        return null;
    }

    public fs9.a w() {
        if (this.c == 54) {
            return (fs9.a) this.d;
        }
        return null;
    }

    public byte[] x() {
        return this.c == 3 ? (byte[]) this.d : bmr.h;
    }

    public byte[] y() {
        return this.c == 2 ? (byte[]) this.d : bmr.h;
    }

    public ws9 z() {
        if (this.c == 40) {
            return (ws9) this.d;
        }
        return null;
    }
}
