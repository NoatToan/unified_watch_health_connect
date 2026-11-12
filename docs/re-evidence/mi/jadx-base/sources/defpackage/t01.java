package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class t01 extends ak8<t01> {
    public int c;
    public String d;
    public s01 e;
    public s01 f;
    public s01 g;

    public t01() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
        s01 s01Var = this.e;
        if (s01Var != null) {
            iB += CodedOutputByteBufferNano.n(3, s01Var);
        }
        s01 s01Var2 = this.f;
        if (s01Var2 != null) {
            iB += CodedOutputByteBufferNano.n(4, s01Var2);
        }
        s01 s01Var3 = this.g;
        return s01Var3 != null ? iB + CodedOutputByteBufferNano.n(5, s01Var3) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        s01 s01Var = this.e;
        if (s01Var != null) {
            codedOutputByteBufferNano.Y(3, s01Var);
        }
        s01 s01Var2 = this.f;
        if (s01Var2 != null) {
            codedOutputByteBufferNano.Y(4, s01Var2);
        }
        s01 s01Var3 = this.g;
        if (s01Var3 != null) {
            codedOutputByteBufferNano.Y(5, s01Var3);
        }
        super.j(codedOutputByteBufferNano);
    }

    public t01 m() {
        this.c = -1;
        this.d = "";
        this.e = null;
        this.f = null;
        this.g = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public t01 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == -1 || iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                    this.c = iP;
                }
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new s01();
                }
                o34Var.q(this.e);
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new s01();
                }
                o34Var.q(this.f);
            } else if (iA == 42) {
                if (this.g == null) {
                    this.g = new s01();
                }
                o34Var.q(this.g);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
