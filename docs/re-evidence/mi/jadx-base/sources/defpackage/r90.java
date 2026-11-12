package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class r90 extends ak8<r90> {
    public int c = 0;
    public Object d;

    public r90() {
        m();
    }

    public boolean A() {
        return this.c == 33;
    }

    public boolean B() {
        return this.c == 31;
    }

    public boolean C() {
        return this.c == 12;
    }

    public boolean D() {
        return this.c == 3;
    }

    public boolean E() {
        return this.c == 20;
    }

    public boolean F() {
        return this.c == 18;
    }

    public boolean G() {
        return this.c == 16;
    }

    public boolean H() {
        return this.c == 14;
    }

    public boolean I() {
        return this.c == 42;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public r90 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 8:
                    this.d = Boolean.valueOf(o34Var.k());
                    this.c = 1;
                    break;
                case 18:
                    this.d = o34Var.z();
                    this.c = 2;
                    break;
                case 24:
                    this.d = Integer.valueOf(o34Var.n());
                    this.c = 3;
                    break;
                case 34:
                    if (this.c != 4) {
                        this.d = new ga0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 4;
                    break;
                case 42:
                    if (this.c != 5) {
                        this.d = new ob0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 5;
                    break;
                case 48:
                    this.d = Boolean.valueOf(o34Var.k());
                    this.c = 6;
                    break;
                case 58:
                    this.d = o34Var.z();
                    this.c = 7;
                    break;
                case 64:
                    this.d = Boolean.valueOf(o34Var.k());
                    this.c = 8;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new xb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 82:
                    if (this.c != 10) {
                        this.d = new ac0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 10;
                    break;
                case 90:
                    if (this.c != 11) {
                        this.d = new ub0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 11;
                    break;
                case 98:
                    if (this.c != 12) {
                        this.d = new ja0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 12;
                    break;
                case 106:
                    if (this.c != 13) {
                        this.d = new lb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 13;
                    break;
                case 114:
                    if (this.c != 14) {
                        this.d = new gb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 14;
                    break;
                case 122:
                    if (this.c != 15) {
                        this.d = new ab0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 15;
                    break;
                case 130:
                    if (this.c != 16) {
                        this.d = new db0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 16;
                    break;
                case 138:
                    if (this.c != 17) {
                        this.d = new pa0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 17;
                    break;
                case 146:
                    if (this.c != 18) {
                        this.d = new va0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 18;
                    break;
                case 154:
                    if (this.c != 19) {
                        this.d = new ma0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 19;
                    break;
                case 162:
                    if (this.c != 20) {
                        this.d = new sa0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 20;
                    break;
                case 234:
                    if (this.c != 29) {
                        this.d = new rb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 29;
                    break;
                case 242:
                    if (this.c != 30) {
                        this.d = new x90();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 30;
                    break;
                case 250:
                    if (this.c != 31) {
                        this.d = new da0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 31;
                    break;
                case SportSummary.VERSION_102 /* 258 */:
                    if (this.c != 32) {
                        this.d = new u90();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 32;
                    break;
                case 266:
                    if (this.c != 33) {
                        this.d = new aa0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 33;
                    break;
                case 322:
                    if (this.c != 40) {
                        this.d = new jc0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 40;
                    break;
                case 330:
                    if (this.c != 41) {
                        this.d = new lc0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 41;
                    break;
                case 338:
                    if (this.c != 42) {
                        this.d = new kc0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 42;
                    break;
                case 346:
                    if (this.c != 43) {
                        this.d = new ic0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 43;
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

    public r90 K(u90 u90Var) {
        u90Var.getClass();
        this.c = 32;
        this.d = u90Var;
        return this;
    }

    public r90 L(x90 x90Var) {
        x90Var.getClass();
        this.c = 30;
        this.d = x90Var;
        return this;
    }

    public r90 M(ic0 ic0Var) {
        ic0Var.getClass();
        this.c = 43;
        this.d = ic0Var;
        return this;
    }

    public r90 N(String str) {
        this.c = 2;
        this.d = str;
        return this;
    }

    public r90 O(ob0 ob0Var) {
        ob0Var.getClass();
        this.c = 5;
        this.d = ob0Var;
        return this;
    }

    public r90 P(rb0 rb0Var) {
        rb0Var.getClass();
        this.c = 29;
        this.d = rb0Var;
        return this;
    }

    public r90 Q(ub0 ub0Var) {
        ub0Var.getClass();
        this.c = 11;
        this.d = ub0Var;
        return this;
    }

    public r90 R(int i) {
        this.c = 3;
        this.d = Integer.valueOf(i);
        return this;
    }

    public r90 S(ma0 ma0Var) {
        ma0Var.getClass();
        this.c = 19;
        this.d = ma0Var;
        return this;
    }

    public r90 T(pa0 pa0Var) {
        pa0Var.getClass();
        this.c = 17;
        this.d = pa0Var;
        return this;
    }

    public r90 U(ab0 ab0Var) {
        ab0Var.getClass();
        this.c = 15;
        this.d = ab0Var;
        return this;
    }

    public r90 V(lb0 lb0Var) {
        lb0Var.getClass();
        this.c = 13;
        this.d = lb0Var;
        return this;
    }

    public r90 W(jc0 jc0Var) {
        jc0Var.getClass();
        this.c = 40;
        this.d = jc0Var;
        return this;
    }

    public r90 X(kc0 kc0Var) {
        kc0Var.getClass();
        this.c = 42;
        this.d = kc0Var;
        return this;
    }

    public r90 Y(lc0 lc0Var) {
        lc0Var.getClass();
        this.c = 41;
        this.d = lc0Var;
        return this;
    }

    public r90 Z(String str) {
        this.c = 7;
        this.d = str;
        return this;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.b(1, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.v(2, (String) this.d);
        }
        if (this.c == 3) {
            iB += CodedOutputByteBufferNano.h(3, ((Integer) this.d).intValue());
        }
        if (this.c == 4) {
            iB += CodedOutputByteBufferNano.n(4, (dsf) this.d);
        }
        if (this.c == 5) {
            iB += CodedOutputByteBufferNano.n(5, (dsf) this.d);
        }
        if (this.c == 6) {
            iB += CodedOutputByteBufferNano.b(6, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 7) {
            iB += CodedOutputByteBufferNano.v(7, (String) this.d);
        }
        if (this.c == 8) {
            iB += CodedOutputByteBufferNano.b(8, ((Boolean) this.d).booleanValue());
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
        if (this.c == 29) {
            iB += CodedOutputByteBufferNano.n(29, (dsf) this.d);
        }
        if (this.c == 30) {
            iB += CodedOutputByteBufferNano.n(30, (dsf) this.d);
        }
        if (this.c == 31) {
            iB += CodedOutputByteBufferNano.n(31, (dsf) this.d);
        }
        if (this.c == 32) {
            iB += CodedOutputByteBufferNano.n(32, (dsf) this.d);
        }
        if (this.c == 33) {
            iB += CodedOutputByteBufferNano.n(33, (dsf) this.d);
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
        return this.c == 43 ? iB + CodedOutputByteBufferNano.n(43, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.c == 1) {
            codedOutputByteBufferNano.M(1, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 2) {
            codedOutputByteBufferNano.m0(2, (String) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.S(3, ((Integer) this.d).intValue());
        }
        if (this.c == 4) {
            codedOutputByteBufferNano.Y(4, (dsf) this.d);
        }
        if (this.c == 5) {
            codedOutputByteBufferNano.Y(5, (dsf) this.d);
        }
        if (this.c == 6) {
            codedOutputByteBufferNano.M(6, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 7) {
            codedOutputByteBufferNano.m0(7, (String) this.d);
        }
        if (this.c == 8) {
            codedOutputByteBufferNano.M(8, ((Boolean) this.d).booleanValue());
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
        if (this.c == 33) {
            codedOutputByteBufferNano.Y(33, (dsf) this.d);
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
        super.j(codedOutputByteBufferNano);
    }

    public r90 m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public r90 n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public aa0 o() {
        if (this.c == 33) {
            return (aa0) this.d;
        }
        return null;
    }

    public da0 p() {
        if (this.c == 31) {
            return (da0) this.d;
        }
        return null;
    }

    public ga0 q() {
        if (this.c == 4) {
            return (ga0) this.d;
        }
        return null;
    }

    public ja0 r() {
        if (this.c == 12) {
            return (ja0) this.d;
        }
        return null;
    }

    public boolean s() {
        if (this.c == 1) {
            return ((Boolean) this.d).booleanValue();
        }
        return false;
    }

    public int t() {
        if (this.c == 3) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    public sa0 u() {
        if (this.c == 20) {
            return (sa0) this.d;
        }
        return null;
    }

    public va0 v() {
        if (this.c == 18) {
            return (va0) this.d;
        }
        return null;
    }

    public db0 w() {
        if (this.c == 16) {
            return (db0) this.d;
        }
        return null;
    }

    public gb0 x() {
        if (this.c == 14) {
            return (gb0) this.d;
        }
        return null;
    }

    public kc0 y() {
        if (this.c == 42) {
            return (kc0) this.d;
        }
        return null;
    }

    public boolean z() {
        if (this.c == 8) {
            return ((Boolean) this.d).booleanValue();
        }
        return false;
    }
}
