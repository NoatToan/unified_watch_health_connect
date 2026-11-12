package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class k14 extends ak8<k14> {
    public int c = 0;
    public Object d;

    public k14() {
        m();
    }

    public boolean A() {
        return this.c == 13;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public k14 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    if (this.c != 1) {
                        this.d = new m14.b();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 1;
                    break;
                case 18:
                    if (this.c != 2) {
                        this.d = new m14.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 2;
                    break;
                case 26:
                    if (this.c != 3) {
                        this.d = new m14();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 3;
                    break;
                case 32:
                    this.d = Integer.valueOf(o34Var.B());
                    this.c = 4;
                    break;
                case 42:
                    if (this.c != 5) {
                        this.d = new l14();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 5;
                    break;
                case 48:
                    this.d = Boolean.valueOf(o34Var.k());
                    this.c = 6;
                    break;
                case 58:
                    if (this.c != 7) {
                        this.d = new m64();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 7;
                    break;
                case 64:
                    this.d = Integer.valueOf(o34Var.n());
                    this.c = 8;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new q14();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 82:
                    if (this.c != 10) {
                        this.d = new p14.b();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 10;
                    break;
                case 90:
                    if (this.c != 11) {
                        this.d = new r14();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 11;
                    break;
                case 98:
                    this.d = o34Var.z();
                    this.c = 12;
                    break;
                case 104:
                    this.d = Integer.valueOf(o34Var.n());
                    this.c = 13;
                    break;
                case 114:
                    if (this.c != 14) {
                        this.d = new p14.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 14;
                    break;
                case 122:
                    if (this.c != 15) {
                        this.d = new p14();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 15;
                    break;
                case 130:
                    if (this.c != 16) {
                        this.d = new n14.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 16;
                    break;
                case 138:
                    if (this.c != 17) {
                        this.d = new o14();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 17;
                    break;
                case 146:
                    if (this.c != 18) {
                        this.d = new p14.c();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 18;
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

    public k14 C(m14.a aVar) {
        aVar.getClass();
        this.c = 2;
        this.d = aVar;
        return this;
    }

    public k14 D(m64 m64Var) {
        m64Var.getClass();
        this.c = 7;
        this.d = m64Var;
        return this;
    }

    public k14 E(l14 l14Var) {
        l14Var.getClass();
        this.c = 5;
        this.d = l14Var;
        return this;
    }

    public k14 F(m14 m14Var) {
        m14Var.getClass();
        this.c = 3;
        this.d = m14Var;
        return this;
    }

    public k14 G(n14.a aVar) {
        aVar.getClass();
        this.c = 16;
        this.d = aVar;
        return this;
    }

    public k14 H(p14.a aVar) {
        aVar.getClass();
        this.c = 14;
        this.d = aVar;
        return this;
    }

    public k14 I(o14 o14Var) {
        o14Var.getClass();
        this.c = 17;
        this.d = o14Var;
        return this;
    }

    public k14 J(p14 p14Var) {
        p14Var.getClass();
        this.c = 15;
        this.d = p14Var;
        return this;
    }

    public k14 K(p14.b bVar) {
        bVar.getClass();
        this.c = 10;
        this.d = bVar;
        return this;
    }

    public k14 L(p14.c cVar) {
        cVar.getClass();
        this.c = 18;
        this.d = cVar;
        return this;
    }

    public k14 M(q14 q14Var) {
        q14Var.getClass();
        this.c = 9;
        this.d = q14Var;
        return this;
    }

    public k14 N(r14 r14Var) {
        r14Var.getClass();
        this.c = 11;
        this.d = r14Var;
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
            iB += CodedOutputByteBufferNano.y(4, ((Integer) this.d).intValue());
        }
        if (this.c == 5) {
            iB += CodedOutputByteBufferNano.n(5, (dsf) this.d);
        }
        if (this.c == 6) {
            iB += CodedOutputByteBufferNano.b(6, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 7) {
            iB += CodedOutputByteBufferNano.n(7, (dsf) this.d);
        }
        if (this.c == 8) {
            iB += CodedOutputByteBufferNano.h(8, ((Integer) this.d).intValue());
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
            iB += CodedOutputByteBufferNano.v(12, (String) this.d);
        }
        if (this.c == 13) {
            iB += CodedOutputByteBufferNano.h(13, ((Integer) this.d).intValue());
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
        return this.c == 18 ? iB + CodedOutputByteBufferNano.n(18, (dsf) this.d) : iB;
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
            codedOutputByteBufferNano.p0(4, ((Integer) this.d).intValue());
        }
        if (this.c == 5) {
            codedOutputByteBufferNano.Y(5, (dsf) this.d);
        }
        if (this.c == 6) {
            codedOutputByteBufferNano.M(6, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 7) {
            codedOutputByteBufferNano.Y(7, (dsf) this.d);
        }
        if (this.c == 8) {
            codedOutputByteBufferNano.S(8, ((Integer) this.d).intValue());
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
            codedOutputByteBufferNano.m0(12, (String) this.d);
        }
        if (this.c == 13) {
            codedOutputByteBufferNano.S(13, ((Integer) this.d).intValue());
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
        super.j(codedOutputByteBufferNano);
    }

    public k14 m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public k14 n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public int o() {
        if (this.c == 8) {
            return ((Integer) this.d).intValue();
        }
        return 1;
    }

    public m64 p() {
        if (this.c == 7) {
            return (m64) this.d;
        }
        return null;
    }

    public m14 q() {
        if (this.c == 3) {
            return (m14) this.d;
        }
        return null;
    }

    public m14.b r() {
        if (this.c == 1) {
            return (m14.b) this.d;
        }
        return null;
    }

    public int s() {
        if (this.c == 4) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    public n14.a t() {
        if (this.c == 16) {
            return (n14.a) this.d;
        }
        return null;
    }

    public p14.b u() {
        if (this.c == 10) {
            return (p14.b) this.d;
        }
        return null;
    }

    public p14.c v() {
        if (this.c == 18) {
            return (p14.c) this.d;
        }
        return null;
    }

    public q14 w() {
        if (this.c == 9) {
            return (q14) this.d;
        }
        return null;
    }

    public r14 x() {
        if (this.c == 11) {
            return (r14) this.d;
        }
        return null;
    }

    public int y() {
        if (this.c == 13) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    public boolean z() {
        return this.c == 4;
    }
}
