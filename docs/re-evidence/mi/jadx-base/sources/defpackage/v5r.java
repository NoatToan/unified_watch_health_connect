package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class v5r extends ak8<v5r> {
    public int c = 0;
    public Object d;

    public v5r() {
        m();
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public v5r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    if (this.c != 1) {
                        this.d = new y5r.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 1;
                    break;
                case 18:
                    this.d = o34Var.z();
                    this.c = 2;
                    break;
                case 26:
                    this.d = o34Var.z();
                    this.c = 3;
                    break;
                case 32:
                    this.d = Boolean.valueOf(o34Var.k());
                    this.c = 4;
                    break;
                case 40:
                    this.d = Integer.valueOf(o34Var.n());
                    this.c = 5;
                    break;
                case 50:
                    if (this.c != 6) {
                        this.d = new t5r();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 6;
                    break;
                case 58:
                    if (this.c != 7) {
                        this.d = new s5r();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 7;
                    break;
                case 66:
                    if (this.c != 8) {
                        this.d = new x5r.a();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 8;
                    break;
                case 74:
                    if (this.c != 9) {
                        this.d = new u5r();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 9;
                    break;
                case 90:
                    if (this.c != 11) {
                        this.d = new b6r();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 11;
                    break;
                case 98:
                    if (this.c != 12) {
                        this.d = new p5r();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 12;
                    break;
                case 106:
                    if (this.c != 13) {
                        this.d = new q5r();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 13;
                    break;
                case 114:
                    if (this.c != 14) {
                        this.d = new o5r();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 14;
                    break;
                case 122:
                    if (this.c != 15) {
                        this.d = new r5r();
                    }
                    o34Var.q((dsf) this.d);
                    this.c = 15;
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

    public v5r B(p5r p5rVar) {
        p5rVar.getClass();
        this.c = 12;
        this.d = p5rVar;
        return this;
    }

    public v5r C(String str) {
        this.c = 2;
        this.d = str;
        return this;
    }

    public v5r D(t5r t5rVar) {
        t5rVar.getClass();
        this.c = 6;
        this.d = t5rVar;
        return this;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        if (this.c == 1) {
            iB += CodedOutputByteBufferNano.n(1, (dsf) this.d);
        }
        if (this.c == 2) {
            iB += CodedOutputByteBufferNano.v(2, (String) this.d);
        }
        if (this.c == 3) {
            iB += CodedOutputByteBufferNano.v(3, (String) this.d);
        }
        if (this.c == 4) {
            iB += CodedOutputByteBufferNano.b(4, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 5) {
            iB += CodedOutputByteBufferNano.h(5, ((Integer) this.d).intValue());
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
        return this.c == 15 ? iB + CodedOutputByteBufferNano.n(15, (dsf) this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.c == 1) {
            codedOutputByteBufferNano.Y(1, (dsf) this.d);
        }
        if (this.c == 2) {
            codedOutputByteBufferNano.m0(2, (String) this.d);
        }
        if (this.c == 3) {
            codedOutputByteBufferNano.m0(3, (String) this.d);
        }
        if (this.c == 4) {
            codedOutputByteBufferNano.M(4, ((Boolean) this.d).booleanValue());
        }
        if (this.c == 5) {
            codedOutputByteBufferNano.S(5, ((Integer) this.d).intValue());
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
        super.j(codedOutputByteBufferNano);
    }

    public v5r m() {
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public v5r n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public o5r o() {
        if (this.c == 14) {
            return (o5r) this.d;
        }
        return null;
    }

    public p5r p() {
        if (this.c == 12) {
            return (p5r) this.d;
        }
        return null;
    }

    public q5r q() {
        if (this.c == 13) {
            return (q5r) this.d;
        }
        return null;
    }

    public r5r r() {
        if (this.c == 15) {
            return (r5r) this.d;
        }
        return null;
    }

    public s5r s() {
        if (this.c == 7) {
            return (s5r) this.d;
        }
        return null;
    }

    public u5r t() {
        if (this.c == 9) {
            return (u5r) this.d;
        }
        return null;
    }

    public int u() {
        if (this.c == 5) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    public boolean v() {
        if (this.c == 4) {
            return ((Boolean) this.d).booleanValue();
        }
        return false;
    }

    public b6r w() {
        if (this.c == 11) {
            return (b6r) this.d;
        }
        return null;
    }

    public y5r.a x() {
        if (this.c == 1) {
            return (y5r.a) this.d;
        }
        return null;
    }

    public boolean y() {
        return this.c == 9;
    }

    public boolean z() {
        return this.c == 5;
    }
}
