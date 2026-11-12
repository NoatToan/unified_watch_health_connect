package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.mi_connect_sdk.BuildConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ur9 extends ak8<ur9> {
    public int c = 0;
    public Object d;

    public ur9() {
        m();
    }

    public byte[] A() {
        return this.c == 3 ? (byte[]) this.d : bmr.h;
    }

    public ur9 A0(jv9.b.a aVar) {
        aVar.getClass();
        this.c = 36;
        this.d = aVar;
        return this;
    }

    public byte[] B() {
        return this.c == 2 ? (byte[]) this.d : bmr.h;
    }

    public ur9 B0(ht9 ht9Var) {
        ht9Var.getClass();
        this.c = 60;
        this.d = ht9Var;
        return this;
    }

    public ns9 C() {
        if (this.c == 11) {
            return (ns9) this.d;
        }
        return null;
    }

    public ur9 C0(ht9.a aVar) {
        aVar.getClass();
        this.c = 61;
        this.d = aVar;
        return this;
    }

    public ps9.b D() {
        if (this.c == 49) {
            return (ps9.b) this.d;
        }
        return null;
    }

    public ur9 D0(lt9 lt9Var) {
        lt9Var.getClass();
        this.c = 65;
        this.d = lt9Var;
        return this;
    }

    public ps9.c E() {
        if (this.c == 55) {
            return (ps9.c) this.d;
        }
        return null;
    }

    public ur9 E0(mt9 mt9Var) {
        mt9Var.getClass();
        this.c = 63;
        this.d = mt9Var;
        return this;
    }

    public ps9.d F() {
        if (this.c == 47) {
            return (ps9.d) this.d;
        }
        return null;
    }

    public ur9 F0(st9 st9Var) {
        st9Var.getClass();
        this.c = 9;
        this.d = st9Var;
        return this;
    }

    public ps9.f G() {
        if (this.c == 57) {
            return (ps9.f) this.d;
        }
        return null;
    }

    public ur9 G0(ut9 ut9Var) {
        ut9Var.getClass();
        this.c = 59;
        this.d = ut9Var;
        return this;
    }

    public vs9 H() {
        if (this.c == 40) {
            return (vs9) this.d;
        }
        return null;
    }

    public ur9 H0(pt9 pt9Var) {
        pt9Var.getClass();
        this.c = 78;
        this.d = pt9Var;
        return this;
    }

    public dt9 I() {
        if (this.c == 10) {
            return (dt9) this.d;
        }
        return null;
    }

    public ur9 I0(vt9 vt9Var) {
        vt9Var.getClass();
        this.c = 58;
        this.d = vt9Var;
        return this;
    }

    public gt9.a J() {
        if (this.c == 4) {
            return (gt9.a) this.d;
        }
        return null;
    }

    public ur9 J0(xt9 xt9Var) {
        xt9Var.getClass();
        this.c = 37;
        this.d = xt9Var;
        return this;
    }

    public nt9 K() {
        if (this.c == 64) {
            return (nt9) this.d;
        }
        return null;
    }

    public ur9 K0(er9.a aVar) {
        aVar.getClass();
        this.c = 44;
        this.d = aVar;
        return this;
    }

    public ot9.a L() {
        if (this.c == 62) {
            return (ot9.a) this.d;
        }
        return null;
    }

    public ur9 L0(bu9 bu9Var) {
        bu9Var.getClass();
        this.c = 25;
        this.d = bu9Var;
        return this;
    }

    public jv9.c.a M() {
        if (this.c == 12) {
            return (jv9.c.a) this.d;
        }
        return null;
    }

    public ur9 M0(du9 du9Var) {
        du9Var.getClass();
        this.c = 26;
        this.d = du9Var;
        return this;
    }

    public st9 N() {
        if (this.c == 9) {
            return (st9) this.d;
        }
        return null;
    }

    public ur9 N0(fu9 fu9Var) {
        fu9Var.getClass();
        this.c = 20;
        this.d = fu9Var;
        return this;
    }

    public ut9 O() {
        if (this.c == 59) {
            return (ut9) this.d;
        }
        return null;
    }

    public ur9 O0(hu9 hu9Var) {
        hu9Var.getClass();
        this.c = 21;
        this.d = hu9Var;
        return this;
    }

    public qt9.a P() {
        if (this.c == 79) {
            return (qt9.a) this.d;
        }
        return null;
    }

    public ur9 P0(nu9 nu9Var) {
        nu9Var.getClass();
        this.c = 5;
        this.d = nu9Var;
        return this;
    }

    public vt9 Q() {
        if (this.c == 58) {
            return (vt9) this.d;
        }
        return null;
    }

    public ur9 Q0(pu9 pu9Var) {
        pu9Var.getClass();
        this.c = 80;
        this.d = pu9Var;
        return this;
    }

    public bu9 R() {
        if (this.c == 25) {
            return (bu9) this.d;
        }
        return null;
    }

    public ur9 R0(qu9 qu9Var) {
        qu9Var.getClass();
        this.c = 68;
        this.d = qu9Var;
        return this;
    }

    public du9 S() {
        if (this.c == 26) {
            return (du9) this.d;
        }
        return null;
    }

    public ur9 S0(tu9 tu9Var) {
        tu9Var.getClass();
        this.c = 1;
        this.d = tu9Var;
        return this;
    }

    public fu9 T() {
        if (this.c == 20) {
            return (fu9) this.d;
        }
        return null;
    }

    public ur9 T0(xu9 xu9Var) {
        xu9Var.getClass();
        this.c = 43;
        this.d = xu9Var;
        return this;
    }

    public hu9 U() {
        if (this.c == 21) {
            return (hu9) this.d;
        }
        return null;
    }

    public ur9 U0(zu9 zu9Var) {
        zu9Var.getClass();
        this.c = 13;
        this.d = zu9Var;
        return this;
    }

    public ju9 V() {
        if (this.c == 24) {
            return (ju9) this.d;
        }
        return null;
    }

    public ur9 V0(jv9 jv9Var) {
        jv9Var.getClass();
        this.c = 34;
        this.d = jv9Var;
        return this;
    }

    public pu9 W() {
        if (this.c == 80) {
            return (pu9) this.d;
        }
        return null;
    }

    public tu9.b X() {
        if (this.c == 6) {
            return (tu9.b) this.d;
        }
        return null;
    }

    public zu9 Y() {
        if (this.c == 13) {
            return (zu9) this.d;
        }
        return null;
    }

    public cv9 Z() {
        if (this.c == 67) {
            return (cv9) this.d;
        }
        return null;
    }

    public dv9 a0() {
        if (this.c == 15) {
            return (dv9) this.d;
        }
        return null;
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
        if (this.c == 45) {
            iB += CodedOutputByteBufferNano.n(45, (dsf) this.d);
        }
        if (this.c == 46) {
            iB += CodedOutputByteBufferNano.n(46, (dsf) this.d);
        }
        if (this.c == 47) {
            iB += CodedOutputByteBufferNano.n(47, (dsf) this.d);
        }
        if (this.c == 48) {
            iB += CodedOutputByteBufferNano.n(48, (dsf) this.d);
        }
        if (this.c == 49) {
            iB += CodedOutputByteBufferNano.n(49, (dsf) this.d);
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
        if (this.c == 58) {
            iB += CodedOutputByteBufferNano.n(58, (dsf) this.d);
        }
        if (this.c == 59) {
            iB += CodedOutputByteBufferNano.n(59, (dsf) this.d);
        }
        if (this.c == 60) {
            iB += CodedOutputByteBufferNano.n(60, (dsf) this.d);
        }
        if (this.c == 61) {
            iB += CodedOutputByteBufferNano.n(61, (dsf) this.d);
        }
        if (this.c == 62) {
            iB += CodedOutputByteBufferNano.n(62, (dsf) this.d);
        }
        if (this.c == 63) {
            iB += CodedOutputByteBufferNano.n(63, (dsf) this.d);
        }
        if (this.c == 64) {
            iB += CodedOutputByteBufferNano.n(64, (dsf) this.d);
        }
        if (this.c == 65) {
            iB += CodedOutputByteBufferNano.n(65, (dsf) this.d);
        }
        if (this.c == 66) {
            iB += CodedOutputByteBufferNano.n(66, (dsf) this.d);
        }
        if (this.c == 67) {
            iB += CodedOutputByteBufferNano.n(67, (dsf) this.d);
        }
        if (this.c == 68) {
            iB += CodedOutputByteBufferNano.n(68, (dsf) this.d);
        }
        if (this.c == 69) {
            iB += CodedOutputByteBufferNano.n(69, (dsf) this.d);
        }
        if (this.c == 70) {
            iB += CodedOutputByteBufferNano.n(70, (dsf) this.d);
        }
        if (this.c == 71) {
            iB += CodedOutputByteBufferNano.n(71, (dsf) this.d);
        }
        if (this.c == 72) {
            iB += CodedOutputByteBufferNano.n(72, (dsf) this.d);
        }
        if (this.c == 73) {
            iB += CodedOutputByteBufferNano.n(73, (dsf) this.d);
        }
        if (this.c == 74) {
            iB += CodedOutputByteBufferNano.n(74, (dsf) this.d);
        }
        if (this.c == 75) {
            iB += CodedOutputByteBufferNano.n(75, (dsf) this.d);
        }
        if (this.c == 76) {
            iB += CodedOutputByteBufferNano.n(76, (dsf) this.d);
        }
        if (this.c == 77) {
            iB += CodedOutputByteBufferNano.n(77, (dsf) this.d);
        }
        if (this.c == 78) {
            iB += CodedOutputByteBufferNano.n(78, (dsf) this.d);
        }
        if (this.c == 79) {
            iB += CodedOutputByteBufferNano.n(79, (dsf) this.d);
        }
        if (this.c == 80) {
            iB += CodedOutputByteBufferNano.n(80, (dsf) this.d);
        }
        if (this.c == 81) {
            iB += CodedOutputByteBufferNano.n(81, (dsf) this.d);
        }
        return this.c == 82 ? iB + CodedOutputByteBufferNano.n(82, (dsf) this.d) : iB;
    }

    public ev9 b0() {
        if (this.c == 23) {
            return (ev9) this.d;
        }
        return null;
    }

    public gv9 c0() {
        if (this.c == 42) {
            return (gv9) this.d;
        }
        return null;
    }

    public boolean d0() {
        return this.c == 3;
    }

    public boolean e0() {
        return this.c == 2;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public ur9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    if (this.c != 1) {
                        this.d = new tu9();
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
                        this.d = new gt9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 4;
                    break;
                case 42:
                    if (this.c != 5) {
                        this.d = new nu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 5;
                    break;
                case 50:
                    if (this.c != 6) {
                        this.d = new tu9.b();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 6;
                    break;
                case 58:
                    if (this.c != 7) {
                        this.d = new fr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 7;
                    break;
                case 66:
                    if (this.c != 8) {
                        this.d = new ls9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 8;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new st9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 82:
                    if (this.c != 10) {
                        this.d = new dt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 10;
                    break;
                case 90:
                    if (this.c != 11) {
                        this.d = new ns9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 11;
                    break;
                case 98:
                    if (this.c != 12) {
                        this.d = new jv9.c.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 12;
                    break;
                case 106:
                    if (this.c != 13) {
                        this.d = new zu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 13;
                    break;
                case 114:
                    if (this.c != 14) {
                        this.d = new ar9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 14;
                    break;
                case 122:
                    if (this.c != 15) {
                        this.d = new dv9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 15;
                    break;
                case 138:
                    if (this.c != 17) {
                        this.d = new bt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 17;
                    break;
                case 146:
                    if (this.c != 18) {
                        this.d = new zs9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 18;
                    break;
                case 154:
                    if (this.c != 19) {
                        this.d = new xs9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 19;
                    break;
                case 162:
                    if (this.c != 20) {
                        this.d = new fu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 20;
                    break;
                case 170:
                    if (this.c != 21) {
                        this.d = new hu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 21;
                    break;
                case 178:
                    if (this.c != 22) {
                        this.d = new rs9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 22;
                    break;
                case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
                    if (this.c != 23) {
                        this.d = new ev9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 23;
                    break;
                case SportReportBaseParser.ReportType.divingCNS /* 194 */:
                    if (this.c != 24) {
                        this.d = new ju9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 24;
                    break;
                case 202:
                    if (this.c != 25) {
                        this.d = new bu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 25;
                    break;
                case 210:
                    if (this.c != 26) {
                        this.d = new du9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 26;
                    break;
                case 218:
                    if (this.c != 27) {
                        this.d = new mr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 27;
                    break;
                case 226:
                    if (this.c != 28) {
                        this.d = new or9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 28;
                    break;
                case 234:
                    if (this.c != 29) {
                        this.d = new kr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 29;
                    break;
                case 242:
                    if (this.c != 30) {
                        this.d = new qr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 30;
                    break;
                case 274:
                    if (this.c != 34) {
                        this.d = new jv9();
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
                        this.d = new jv9.b.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 36;
                    break;
                case 298:
                    if (this.c != 37) {
                        this.d = new xt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 37;
                    break;
                case 306:
                    if (this.c != 38) {
                        this.d = new is9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 38;
                    break;
                case 314:
                    if (this.c != 39) {
                        this.d = new br9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 39;
                    break;
                case 322:
                    if (this.c != 40) {
                        this.d = new vs9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 40;
                    break;
                case 330:
                    if (this.c != 41) {
                        this.d = new ts9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 41;
                    break;
                case 338:
                    if (this.c != 42) {
                        this.d = new gv9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 42;
                    break;
                case 346:
                    if (this.c != 43) {
                        this.d = new xu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 43;
                    break;
                case 354:
                    if (this.c != 44) {
                        this.d = new er9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 44;
                    break;
                case 362:
                    if (this.c != 45) {
                        this.d = new jr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 45;
                    break;
                case BuildConfig.MiConnectVersionBuild /* 370 */:
                    if (this.c != 46) {
                        this.d = new os9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 46;
                    break;
                case 378:
                    if (this.c != 47) {
                        this.d = new ps9.d();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 47;
                    break;
                case 386:
                    if (this.c != 48) {
                        this.d = new ps9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 48;
                    break;
                case 394:
                    if (this.c != 49) {
                        this.d = new ps9.b();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 49;
                    break;
                case 402:
                    if (this.c != 50) {
                        this.d = new bs9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 50;
                    break;
                case 410:
                    if (this.c != 51) {
                        this.d = new ds9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 51;
                    break;
                case 418:
                    if (this.c != 52) {
                        this.d = new wr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 52;
                    break;
                case StdStatuses.UPGRADE_REQUIRED /* 426 */:
                    if (this.c != 53) {
                        this.d = new zr9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 53;
                    break;
                case 434:
                    if (this.c != 54) {
                        this.d = new gs9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 54;
                    break;
                case 442:
                    if (this.c != 55) {
                        this.d = new ps9.c();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 55;
                    break;
                case 450:
                    if (this.c != 56) {
                        this.d = new ps9.e();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 56;
                    break;
                case 458:
                    if (this.c != 57) {
                        this.d = new ps9.f();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 57;
                    break;
                case 466:
                    if (this.c != 58) {
                        this.d = new vt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 58;
                    break;
                case 474:
                    if (this.c != 59) {
                        this.d = new ut9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 59;
                    break;
                case 482:
                    if (this.c != 60) {
                        this.d = new ht9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 60;
                    break;
                case 490:
                    if (this.c != 61) {
                        this.d = new ht9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 61;
                    break;
                case 498:
                    if (this.c != 62) {
                        this.d = new ot9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 62;
                    break;
                case 506:
                    if (this.c != 63) {
                        this.d = new mt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 63;
                    break;
                case SportSummary.VRESION_202 /* 514 */:
                    if (this.c != 64) {
                        this.d = new nt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 64;
                    break;
                case 522:
                    if (this.c != 65) {
                        this.d = new lt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 65;
                    break;
                case 530:
                    if (this.c != 66) {
                        this.d = new qs9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 66;
                    break;
                case 538:
                    if (this.c != 67) {
                        this.d = new cv9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 67;
                    break;
                case 546:
                    if (this.c != 68) {
                        this.d = new qu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 68;
                    break;
                case 554:
                    if (this.c != 69) {
                        this.d = new it9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 69;
                    break;
                case 562:
                    if (this.c != 70) {
                        this.d = new jt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 70;
                    break;
                case 570:
                    if (this.c != 71) {
                        this.d = new js9.d();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 71;
                    break;
                case 578:
                    if (this.c != 72) {
                        this.d = new js9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 72;
                    break;
                case 586:
                    if (this.c != 73) {
                        this.d = new js9.b();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 73;
                    break;
                case 594:
                    if (this.c != 74) {
                        this.d = new js9.c();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 74;
                    break;
                case 602:
                    if (this.c != 75) {
                        this.d = new js9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 75;
                    break;
                case 610:
                    if (this.c != 76) {
                        this.d = new su9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 76;
                    break;
                case 618:
                    if (this.c != 77) {
                        this.d = new ru9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 77;
                    break;
                case 626:
                    if (this.c != 78) {
                        this.d = new pt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 78;
                    break;
                case 634:
                    if (this.c != 79) {
                        this.d = new qt9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 79;
                    break;
                case 642:
                    if (this.c != 80) {
                        this.d = new pu9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 80;
                    break;
                case 650:
                    if (this.c != 81) {
                        this.d = new kt9.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 81;
                    break;
                case 658:
                    if (this.c != 82) {
                        this.d = new rt9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 82;
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

    public ur9 g0(ar9 ar9Var) {
        ar9Var.getClass();
        this.c = 14;
        this.d = ar9Var;
        return this;
    }

    public ur9 h0(fr9 fr9Var) {
        fr9Var.getClass();
        this.c = 7;
        this.d = fr9Var;
        return this;
    }

    public ur9 i0(it9 it9Var) {
        it9Var.getClass();
        this.c = 69;
        this.d = it9Var;
        return this;
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
        if (this.c == 45) {
            codedOutputByteBufferNano.Y(45, (dsf) this.d);
        }
        if (this.c == 46) {
            codedOutputByteBufferNano.Y(46, (dsf) this.d);
        }
        if (this.c == 47) {
            codedOutputByteBufferNano.Y(47, (dsf) this.d);
        }
        if (this.c == 48) {
            codedOutputByteBufferNano.Y(48, (dsf) this.d);
        }
        if (this.c == 49) {
            codedOutputByteBufferNano.Y(49, (dsf) this.d);
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
        if (this.c == 59) {
            codedOutputByteBufferNano.Y(59, (dsf) this.d);
        }
        if (this.c == 60) {
            codedOutputByteBufferNano.Y(60, (dsf) this.d);
        }
        if (this.c == 61) {
            codedOutputByteBufferNano.Y(61, (dsf) this.d);
        }
        if (this.c == 62) {
            codedOutputByteBufferNano.Y(62, (dsf) this.d);
        }
        if (this.c == 63) {
            codedOutputByteBufferNano.Y(63, (dsf) this.d);
        }
        if (this.c == 64) {
            codedOutputByteBufferNano.Y(64, (dsf) this.d);
        }
        if (this.c == 65) {
            codedOutputByteBufferNano.Y(65, (dsf) this.d);
        }
        if (this.c == 66) {
            codedOutputByteBufferNano.Y(66, (dsf) this.d);
        }
        if (this.c == 67) {
            codedOutputByteBufferNano.Y(67, (dsf) this.d);
        }
        if (this.c == 68) {
            codedOutputByteBufferNano.Y(68, (dsf) this.d);
        }
        if (this.c == 69) {
            codedOutputByteBufferNano.Y(69, (dsf) this.d);
        }
        if (this.c == 70) {
            codedOutputByteBufferNano.Y(70, (dsf) this.d);
        }
        if (this.c == 71) {
            codedOutputByteBufferNano.Y(71, (dsf) this.d);
        }
        if (this.c == 72) {
            codedOutputByteBufferNano.Y(72, (dsf) this.d);
        }
        if (this.c == 73) {
            codedOutputByteBufferNano.Y(73, (dsf) this.d);
        }
        if (this.c == 74) {
            codedOutputByteBufferNano.Y(74, (dsf) this.d);
        }
        if (this.c == 75) {
            codedOutputByteBufferNano.Y(75, (dsf) this.d);
        }
        if (this.c == 76) {
            codedOutputByteBufferNano.Y(76, (dsf) this.d);
        }
        if (this.c == 77) {
            codedOutputByteBufferNano.Y(77, (dsf) this.d);
        }
        if (this.c == 78) {
            codedOutputByteBufferNano.Y(78, (dsf) this.d);
        }
        if (this.c == 79) {
            codedOutputByteBufferNano.Y(79, (dsf) this.d);
        }
        if (this.c == 80) {
            codedOutputByteBufferNano.Y(80, (dsf) this.d);
        }
        if (this.c == 81) {
            codedOutputByteBufferNano.Y(81, (dsf) this.d);
        }
        if (this.c == 82) {
            codedOutputByteBufferNano.Y(82, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ur9 j0(boolean z) {
        this.c = 35;
        this.d = Boolean.valueOf(z);
        return this;
    }

    public ur9 k0(is9.a aVar) {
        aVar.getClass();
        this.c = 38;
        this.d = aVar;
        return this;
    }

    public ur9 l0(wr9 wr9Var) {
        wr9Var.getClass();
        this.c = 52;
        this.d = wr9Var;
        return this;
    }

    public ur9 m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public ur9 m0(bs9 bs9Var) {
        bs9Var.getClass();
        this.c = 50;
        this.d = bs9Var;
        return this;
    }

    public ur9 n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public ur9 n0(gs9.a aVar) {
        aVar.getClass();
        this.c = 54;
        this.d = aVar;
        return this;
    }

    public ar9 o() {
        if (this.c == 14) {
            return (ar9) this.d;
        }
        return null;
    }

    public ur9 o0(ls9 ls9Var) {
        ls9Var.getClass();
        this.c = 8;
        this.d = ls9Var;
        return this;
    }

    public br9 p() {
        if (this.c == 39) {
            return (br9) this.d;
        }
        return null;
    }

    public ur9 p0(byte[] bArr) {
        this.c = 3;
        this.d = bArr;
        return this;
    }

    public fr9 q() {
        if (this.c == 7) {
            return (fr9) this.d;
        }
        return null;
    }

    public ur9 q0(byte[] bArr) {
        this.c = 2;
        this.d = bArr;
        return this;
    }

    public jt9 r() {
        if (this.c == 70) {
            return (jt9) this.d;
        }
        return null;
    }

    public ur9 r0(ns9 ns9Var) {
        ns9Var.getClass();
        this.c = 11;
        this.d = ns9Var;
        return this;
    }

    public kr9 s() {
        if (this.c == 29) {
            return (kr9) this.d;
        }
        return null;
    }

    public ur9 s0(os9 os9Var) {
        os9Var.getClass();
        this.c = 46;
        this.d = os9Var;
        return this;
    }

    public qr9 t() {
        if (this.c == 30) {
            return (qr9) this.d;
        }
        return null;
    }

    public ur9 t0(ps9.a aVar) {
        aVar.getClass();
        this.c = 48;
        this.d = aVar;
        return this;
    }

    public is9.a u() {
        if (this.c == 38) {
            return (is9.a) this.d;
        }
        return null;
    }

    public ur9 u0(ps9.e eVar) {
        eVar.getClass();
        this.c = 56;
        this.d = eVar;
        return this;
    }

    public zr9 v() {
        if (this.c == 53) {
            return (zr9) this.d;
        }
        return null;
    }

    public ur9 v0(qs9 qs9Var) {
        qs9Var.getClass();
        this.c = 66;
        this.d = qs9Var;
        return this;
    }

    public bs9 w() {
        if (this.c == 50) {
            return (bs9) this.d;
        }
        return null;
    }

    public ur9 w0(rs9 rs9Var) {
        rs9Var.getClass();
        this.c = 22;
        this.d = rs9Var;
        return this;
    }

    public ds9 x() {
        if (this.c == 51) {
            return (ds9) this.d;
        }
        return null;
    }

    public ur9 x0(ts9 ts9Var) {
        ts9Var.getClass();
        this.c = 41;
        this.d = ts9Var;
        return this;
    }

    public gs9.a y() {
        if (this.c == 54) {
            return (gs9.a) this.d;
        }
        return null;
    }

    public ur9 y0(vs9 vs9Var) {
        vs9Var.getClass();
        this.c = 40;
        this.d = vs9Var;
        return this;
    }

    public ls9 z() {
        if (this.c == 8) {
            return (ls9) this.d;
        }
        return null;
    }

    public ur9 z0(dt9 dt9Var) {
        dt9Var.getClass();
        this.c = 10;
        this.d = dt9Var;
        return this;
    }
}
