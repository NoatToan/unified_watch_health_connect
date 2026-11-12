package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class t7r extends ak8<t7r> {
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    public t7r() {
        m();
    }

    public static t7r r(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (t7r) dsf.f(new t7r(), bArr);
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

    public t7r m() {
        this.e = 0;
        this.f = 0;
        n();
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    public t7r n() {
        this.c = 0;
        this.d = null;
        return this;
    }

    public q90 o() {
        if (this.c == 3) {
            return (q90) this.d;
        }
        return null;
    }

    public int p() {
        if (this.c == 100) {
            return ((Integer) this.d).intValue();
        }
        return 0;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public t7r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2) {
                    this.e = iP;
                }
            } else if (iA == 16) {
                this.f = o34Var.B();
            } else if (iA == 26) {
                if (this.c != 3) {
                    this.d = new q90();
                }
                o34Var.q((dsf) this.d);
                this.c = 3;
            } else if (iA == 800) {
                this.d = Integer.valueOf(o34Var.n());
                this.c = 100;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }

    public t7r s(q90 q90Var) {
        q90Var.getClass();
        this.c = 3;
        this.d = q90Var;
        return this;
    }
}
