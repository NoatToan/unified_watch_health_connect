package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class u01 extends ak8<u01> {
    public int c;
    public int d;
    public boolean e;
    public int f;
    public String g;
    public String h;
    public int i;
    public t01 j;

    public u01() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.l(2, this.d) + CodedOutputByteBufferNano.b(3, this.e);
        int i = this.f;
        if (i != -1) {
            iB += CodedOutputByteBufferNano.l(4, i);
        }
        if (!this.g.equals("")) {
            iB += CodedOutputByteBufferNano.v(5, this.g);
        }
        if (!this.h.equals("")) {
            iB += CodedOutputByteBufferNano.v(6, this.h);
        }
        int i2 = this.i;
        if (i2 != -1) {
            iB += CodedOutputByteBufferNano.l(7, i2);
        }
        t01 t01Var = this.j;
        return t01Var != null ? iB + CodedOutputByteBufferNano.n(8, t01Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        codedOutputByteBufferNano.M(3, this.e);
        int i = this.f;
        if (i != -1) {
            codedOutputByteBufferNano.W(4, i);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(5, this.g);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.m0(6, this.h);
        }
        int i2 = this.i;
        if (i2 != -1) {
            codedOutputByteBufferNano.W(7, i2);
        }
        t01 t01Var = this.j;
        if (t01Var != null) {
            codedOutputByteBufferNano.Y(8, t01Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public u01 m() {
        this.c = -1;
        this.d = -1;
        this.e = false;
        this.f = -1;
        this.g = "";
        this.h = "";
        this.i = -1;
        this.j = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public u01 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == -1 || iP == 0 || iP == 1 || iP == 2) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                int iP2 = o34Var.p();
                switch (iP2) {
                    case -1:
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        this.d = iP2;
                        break;
                }
            } else if (iA == 24) {
                this.e = o34Var.k();
            } else if (iA == 32) {
                int iP3 = o34Var.p();
                switch (iP3) {
                    case -1:
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        this.f = iP3;
                        break;
                }
            } else if (iA == 42) {
                this.g = o34Var.z();
            } else if (iA == 50) {
                this.h = o34Var.z();
            } else if (iA == 56) {
                int iP4 = o34Var.p();
                if (iP4 == -1 || iP4 == 0 || iP4 == 1 || iP4 == 2 || iP4 == 3) {
                    this.i = iP4;
                }
            } else if (iA == 66) {
                if (this.j == null) {
                    this.j = new t01();
                }
                o34Var.q(this.j);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
