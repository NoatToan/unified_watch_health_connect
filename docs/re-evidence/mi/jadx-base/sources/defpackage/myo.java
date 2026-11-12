package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class myo extends ak8<myo> {
    public int c;
    public t64 d;
    public t64 e;
    public int f;

    public myo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        t64 t64Var = this.d;
        if (t64Var != null) {
            iB += CodedOutputByteBufferNano.n(2, t64Var);
        }
        t64 t64Var2 = this.e;
        if (t64Var2 != null) {
            iB += CodedOutputByteBufferNano.n(3, t64Var2);
        }
        int i = this.f;
        return i != 0 ? iB + CodedOutputByteBufferNano.l(4, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        t64 t64Var = this.d;
        if (t64Var != null) {
            codedOutputByteBufferNano.Y(2, t64Var);
        }
        t64 t64Var2 = this.e;
        if (t64Var2 != null) {
            codedOutputByteBufferNano.Y(3, t64Var2);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.W(4, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public myo m() {
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public myo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                    this.c = iP;
                }
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new t64();
                }
                o34Var.q(this.d);
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new t64();
                }
                o34Var.q(this.e);
            } else if (iA == 32) {
                int iP2 = o34Var.p();
                if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                    this.f = iP2;
                }
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
