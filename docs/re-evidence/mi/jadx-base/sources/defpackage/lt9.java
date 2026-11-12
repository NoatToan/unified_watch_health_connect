package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class lt9 extends ak8<lt9> {
    public int c;
    public t64 d;
    public t64 e;
    public int f;

    public lt9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
        t64 t64Var = this.d;
        if (t64Var != null) {
            iB += CodedOutputByteBufferNano.n(2, t64Var);
        }
        t64 t64Var2 = this.e;
        if (t64Var2 != null) {
            iB += CodedOutputByteBufferNano.n(3, t64Var2);
        }
        return iB + CodedOutputByteBufferNano.y(4, this.f);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        t64 t64Var = this.d;
        if (t64Var != null) {
            codedOutputByteBufferNano.Y(2, t64Var);
        }
        t64 t64Var2 = this.e;
        if (t64Var2 != null) {
            codedOutputByteBufferNano.Y(3, t64Var2);
        }
        codedOutputByteBufferNano.p0(4, this.f);
        super.j(codedOutputByteBufferNano);
    }

    public lt9 m() {
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
    public lt9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
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
                this.f = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
