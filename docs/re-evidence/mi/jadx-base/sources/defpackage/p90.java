package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class p90 extends ak8<p90> {
    public int c = 0;
    public Object d;

    public p90() {
        m();
    }

    public boolean A() {
        return this.c == 18;
    }

    public boolean B() {
        return this.c == 16;
    }

    public boolean C() {
        return this.c == 14;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public p90 e(o34 o34Var) throws IOException {
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
                        this.d = new ea0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 4;
                    break;
                case 42:
                    if (this.c != 5) {
                        this.d = new mb0();
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
                        this.d = new vb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 82:
                    if (this.c != 10) {
                        this.d = new yb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 10;
                    break;
                case 90:
                    if (this.c != 11) {
                        this.d = new sb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 11;
                    break;
                case 98:
                    if (this.c != 12) {
                        this.d = new ha0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 12;
                    break;
                case 106:
                    if (this.c != 13) {
                        this.d = new jb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 13;
                    break;
                case 114:
                    if (this.c != 14) {
                        this.d = new eb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 14;
                    break;
                case 122:
                    if (this.c != 15) {
                        this.d = new ya0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 15;
                    break;
                case 130:
                    if (this.c != 16) {
                        this.d = new bb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 16;
                    break;
                case 138:
                    if (this.c != 17) {
                        this.d = new na0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 17;
                    break;
                case 146:
                    if (this.c != 18) {
                        this.d = new ta0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 18;
                    break;
                case 154:
                    if (this.c != 19) {
                        this.d = new ka0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 19;
                    break;
                case 162:
                    if (this.c != 20) {
                        this.d = new qa0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 20;
                    break;
                case 234:
                    if (this.c != 29) {
                        this.d = new pb0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 29;
                    break;
                case 242:
                    if (this.c != 30) {
                        this.d = new v90();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 30;
                    break;
                case 250:
                    if (this.c != 31) {
                        this.d = new ba0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 31;
                    break;
                case SportSummary.VERSION_102 /* 258 */:
                    if (this.c != 32) {
                        this.d = new s90();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 32;
                    break;
                case 266:
                    if (this.c != 33) {
                        this.d = new y90();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 33;
                    break;
                case 274:
                    if (this.c != 34) {
                        this.d = new fc0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 34;
                    break;
                case 282:
                    if (this.c != 35) {
                        this.d = new gc0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 35;
                    break;
                case 290:
                    if (this.c != 36) {
                        this.d = new hc0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 36;
                    break;
                case 298:
                    if (this.c != 37) {
                        this.d = new bc0();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 37;
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

    public p90 E(String str) {
        this.c = 2;
        this.d = str;
        return this;
    }

    public p90 F(mb0 mb0Var) {
        mb0Var.getClass();
        this.c = 5;
        this.d = mb0Var;
        return this;
    }

    public p90 G(pb0 pb0Var) {
        pb0Var.getClass();
        this.c = 29;
        this.d = pb0Var;
        return this;
    }

    public p90 H(sb0 sb0Var) {
        sb0Var.getClass();
        this.c = 11;
        this.d = sb0Var;
        return this;
    }

    public p90 I(bc0 bc0Var) {
        bc0Var.getClass();
        this.c = 37;
        this.d = bc0Var;
        return this;
    }

    public p90 J(int i) {
        this.c = 3;
        this.d = Integer.valueOf(i);
        return this;
    }

    public p90 K(ka0 ka0Var) {
        ka0Var.getClass();
        this.c = 19;
        this.d = ka0Var;
        return this;
    }

    public p90 L(na0 na0Var) {
        na0Var.getClass();
        this.c = 17;
        this.d = na0Var;
        return this;
    }

    public p90 M(gc0 gc0Var) {
        gc0Var.getClass();
        this.c = 35;
        this.d = gc0Var;
        return this;
    }

    public p90 N(ya0 ya0Var) {
        ya0Var.getClass();
        this.c = 15;
        this.d = ya0Var;
        return this;
    }

    public p90 O(jb0 jb0Var) {
        jb0Var.getClass();
        this.c = 13;
        this.d = jb0Var;
        return this;
    }

    public p90 P(hc0 hc0Var) {
        hc0Var.getClass();
        this.c = 36;
        this.d = hc0Var;
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
        if (this.c == 34) {
            iB += CodedOutputByteBufferNano.n(34, (dsf) this.d);
        }
        if (this.c == 35) {
            iB += CodedOutputByteBufferNano.n(35, (dsf) this.d);
        }
        if (this.c == 36) {
            iB += CodedOutputByteBufferNano.n(36, (dsf) this.d);
        }
        return this.c == 37 ? iB + CodedOutputByteBufferNano.n(37, (dsf) this.d) : iB;
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
        if (this.c == 34) {
            codedOutputByteBufferNano.Y(34, (dsf) this.d);
        }
        if (this.c == 35) {
            codedOutputByteBufferNano.Y(35, (dsf) this.d);
        }
        if (this.c == 36) {
            codedOutputByteBufferNano.Y(36, (dsf) this.d);
        }
        if (this.c == 37) {
            codedOutputByteBufferNano.Y(37, (dsf) this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public p90 m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public p90 n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public ea0 o() {
        if (this.c == 4) {
            return (ea0) this.d;
        }
        return null;
    }

    public ha0 p() {
        if (this.c == 12) {
            return (ha0) this.d;
        }
        return null;
    }

    public boolean q() {
        if (this.c == 1) {
            return ((Boolean) this.d).booleanValue();
        }
        return false;
    }

    public int r() {
        if (this.c == 3) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    public qa0 s() {
        if (this.c == 20) {
            return (qa0) this.d;
        }
        return null;
    }

    public ta0 t() {
        if (this.c == 18) {
            return (ta0) this.d;
        }
        return null;
    }

    public fc0 u() {
        if (this.c == 34) {
            return (fc0) this.d;
        }
        return null;
    }

    public bb0 v() {
        if (this.c == 16) {
            return (bb0) this.d;
        }
        return null;
    }

    public eb0 w() {
        if (this.c == 14) {
            return (eb0) this.d;
        }
        return null;
    }

    public boolean x() {
        return this.c == 12;
    }

    public boolean y() {
        return this.c == 3;
    }

    public boolean z() {
        return this.c == 20;
    }
}
