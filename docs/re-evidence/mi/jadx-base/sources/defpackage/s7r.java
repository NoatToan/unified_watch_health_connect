package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class s7r extends ak8<s7r> {
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    public s7r() {
        m();
    }

    public static s7r L(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (s7r) dsf.f(new s7r(), bArr);
    }

    public vkf A() {
        if (this.c == 20) {
            return (vkf) this.d;
        }
        return null;
    }

    public csg B() {
        if (this.c == 7) {
            return (csg) this.d;
        }
        return null;
    }

    public qxg C() {
        if (this.c == 9) {
            return (qxg) this.d;
        }
        return null;
    }

    public xgo D() {
        if (this.c == 13) {
            return (xgo) this.d;
        }
        return null;
    }

    public txo E() {
        if (this.c == 4) {
            return (txo) this.d;
        }
        return null;
    }

    public jcp F() {
        if (this.c == 22) {
            return (jcp) this.d;
        }
        return null;
    }

    public v5r G() {
        if (this.c == 6) {
            return (v5r) this.d;
        }
        return null;
    }

    public e9r H() {
        if (this.c == 12) {
            return (e9r) this.d;
        }
        return null;
    }

    public boolean I() {
        return this.c == 3;
    }

    public boolean J() {
        return this.c == 100;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public s7r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    int iP = o34Var.p();
                    switch (iP) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            this.e = iP;
                            break;
                    }
                    break;
                case 16:
                    this.f = o34Var.B();
                    break;
                case 26:
                    if (this.c != 3) {
                        this.d = new p90();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 3;
                    break;
                case 34:
                    if (this.c != 4) {
                        this.d = new txo();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 4;
                    break;
                case 50:
                    if (this.c != 6) {
                        this.d = new v5r();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 6;
                    break;
                case 58:
                    if (this.c != 7) {
                        this.d = new csg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 7;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new qxg();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 82:
                    if (this.c != 10) {
                        this.d = new ur9();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 10;
                    break;
                case 90:
                    if (this.c != 11) {
                        this.d = new ive();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 11;
                    break;
                case 98:
                    if (this.c != 12) {
                        this.d = new e9r();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 12;
                    break;
                case 106:
                    if (this.c != 13) {
                        this.d = new xgo();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 13;
                    break;
                case 114:
                    if (this.c != 14) {
                        this.d = new z93();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 14;
                    break;
                case 122:
                    if (this.c != 15) {
                        this.d = new x69();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 15;
                    break;
                case 130:
                    if (this.c != 16) {
                        this.d = new m01();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 16;
                    break;
                case 138:
                    if (this.c != 17) {
                        this.d = new m5f();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 17;
                    break;
                case 146:
                    if (this.c != 18) {
                        this.d = new x0b();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 18;
                    break;
                case 154:
                    if (this.c != 19) {
                        this.d = new k14();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 19;
                    break;
                case 162:
                    if (this.c != 20) {
                        this.d = new vkf();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 20;
                    break;
                case 170:
                    if (this.c != 21) {
                        this.d = new w41();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 21;
                    break;
                case 178:
                    if (this.c != 22) {
                        this.d = new jcp();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 22;
                    break;
                case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
                    if (this.c != 23) {
                        this.d = new dg4();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 23;
                    break;
                case SportReportBaseParser.ReportType.divingCNS /* 194 */:
                    if (this.c != 24) {
                        this.d = new f6f();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 24;
                    break;
                case 202:
                    if (this.c != 25) {
                        this.d = new udd();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 25;
                    break;
                case 800:
                    this.d = Integer.valueOf(o34Var.n());
                    this.c = 100;
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

    public s7r M(p90 p90Var) {
        p90Var.getClass();
        this.c = 3;
        this.d = p90Var;
        return this;
    }

    public s7r N(m01 m01Var) {
        m01Var.getClass();
        this.c = 16;
        this.d = m01Var;
        return this;
    }

    public s7r O(z93 z93Var) {
        z93Var.getClass();
        this.c = 14;
        this.d = z93Var;
        return this;
    }

    public s7r P(k14 k14Var) {
        k14Var.getClass();
        this.c = 19;
        this.d = k14Var;
        return this;
    }

    public s7r Q(dg4 dg4Var) {
        dg4Var.getClass();
        this.c = 23;
        this.d = dg4Var;
        return this;
    }

    public s7r R(x69 x69Var) {
        x69Var.getClass();
        this.c = 15;
        this.d = x69Var;
        return this;
    }

    public s7r S(ur9 ur9Var) {
        ur9Var.getClass();
        this.c = 10;
        this.d = ur9Var;
        return this;
    }

    public s7r T(x0b x0bVar) {
        x0bVar.getClass();
        this.c = 18;
        this.d = x0bVar;
        return this;
    }

    public s7r U(udd uddVar) {
        uddVar.getClass();
        this.c = 25;
        this.d = uddVar;
        return this;
    }

    public s7r V(ive iveVar) {
        iveVar.getClass();
        this.c = 11;
        this.d = iveVar;
        return this;
    }

    public s7r W(m5f m5fVar) {
        m5fVar.getClass();
        this.c = 17;
        this.d = m5fVar;
        return this;
    }

    public s7r X(f6f f6fVar) {
        f6fVar.getClass();
        this.c = 24;
        this.d = f6fVar;
        return this;
    }

    public s7r Y(vkf vkfVar) {
        vkfVar.getClass();
        this.c = 20;
        this.d = vkfVar;
        return this;
    }

    public s7r Z(csg csgVar) {
        csgVar.getClass();
        this.c = 7;
        this.d = csgVar;
        return this;
    }

    public s7r a0(qxg qxgVar) {
        qxgVar.getClass();
        this.c = 9;
        this.d = qxgVar;
        return this;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.e) + CodedOutputByteBufferNano.y(2, this.f);
        if (this.c == 3) {
            iB += CodedOutputByteBufferNano.n(3, (dsf) this.d);
        }
        if (this.c == 4) {
            iB += CodedOutputByteBufferNano.n(4, (dsf) this.d);
        }
        if (this.c == 6) {
            iB += CodedOutputByteBufferNano.n(6, (dsf) this.d);
        }
        if (this.c == 7) {
            iB += CodedOutputByteBufferNano.n(7, (dsf) this.d);
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
        return this.c == 100 ? iB + CodedOutputByteBufferNano.h(100, ((Integer) this.d).intValue()) : iB;
    }

    public s7r b0(xgo xgoVar) {
        xgoVar.getClass();
        this.c = 13;
        this.d = xgoVar;
        return this;
    }

    public s7r c0(txo txoVar) {
        txoVar.getClass();
        this.c = 4;
        this.d = txoVar;
        return this;
    }

    public s7r d0(jcp jcpVar) {
        jcpVar.getClass();
        this.c = 22;
        this.d = jcpVar;
        return this;
    }

    public s7r e0(v5r v5rVar) {
        v5rVar.getClass();
        this.c = 6;
        this.d = v5rVar;
        return this;
    }

    public s7r f0(e9r e9rVar) {
        e9rVar.getClass();
        this.c = 12;
        this.d = e9rVar;
        return this;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.e);
        codedOutputByteBufferNano.p0(2, this.f);
        if (this.c == 3) {
            codedOutputByteBufferNano.Y(3, (dsf) this.d);
        }
        if (this.c == 4) {
            codedOutputByteBufferNano.Y(4, (dsf) this.d);
        }
        if (this.c == 6) {
            codedOutputByteBufferNano.Y(6, (dsf) this.d);
        }
        if (this.c == 7) {
            codedOutputByteBufferNano.Y(7, (dsf) this.d);
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
        if (this.c == 100) {
            codedOutputByteBufferNano.S(100, ((Integer) this.d).intValue());
        }
        super.j(codedOutputByteBufferNano);
    }

    public s7r m() {
        this.e = 0;
        this.f = 0;
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public s7r n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public p90 o() {
        if (this.c == 3) {
            return (p90) this.d;
        }
        return null;
    }

    public m01 p() {
        if (this.c == 16) {
            return (m01) this.d;
        }
        return null;
    }

    public k14 q() {
        if (this.c == 19) {
            return (k14) this.d;
        }
        return null;
    }

    public dg4 r() {
        if (this.c == 23) {
            return (dg4) this.d;
        }
        return null;
    }

    public int s() {
        if (this.c == 100) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    public x69 t() {
        if (this.c == 15) {
            return (x69) this.d;
        }
        return null;
    }

    public ur9 u() {
        if (this.c == 10) {
            return (ur9) this.d;
        }
        return null;
    }

    public x0b v() {
        if (this.c == 18) {
            return (x0b) this.d;
        }
        return null;
    }

    public udd w() {
        if (this.c == 25) {
            return (udd) this.d;
        }
        return null;
    }

    public ive x() {
        if (this.c == 11) {
            return (ive) this.d;
        }
        return null;
    }

    public m5f y() {
        if (this.c == 17) {
            return (m5f) this.d;
        }
        return null;
    }

    public f6f z() {
        if (this.c == 24) {
            return (f6f) this.d;
        }
        return null;
    }
}
