package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class m21 extends ak8<m21> {
    public n21 c;
    public o21 d;

    public m21() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        n21 n21Var = this.c;
        if (n21Var != null) {
            iB += CodedOutputByteBufferNano.n(1, n21Var);
        }
        o21 o21Var = this.d;
        return o21Var != null ? iB + CodedOutputByteBufferNano.n(2, o21Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        n21 n21Var = this.c;
        if (n21Var != null) {
            codedOutputByteBufferNano.Y(1, n21Var);
        }
        o21 o21Var = this.d;
        if (o21Var != null) {
            codedOutputByteBufferNano.Y(2, o21Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public m21 m() {
        this.c = null;
        this.d = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public m21 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new n21();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new o21();
                }
                o34Var.q(this.d);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
