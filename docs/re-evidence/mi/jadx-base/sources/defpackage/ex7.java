package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ex7 extends ak8<ex7> {
    public jx7 c;
    public kx7 d;

    public ex7() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        jx7 jx7Var = this.c;
        if (jx7Var != null) {
            iB += CodedOutputByteBufferNano.n(1, jx7Var);
        }
        kx7 kx7Var = this.d;
        return kx7Var != null ? iB + CodedOutputByteBufferNano.n(2, kx7Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        jx7 jx7Var = this.c;
        if (jx7Var != null) {
            codedOutputByteBufferNano.Y(1, jx7Var);
        }
        kx7 kx7Var = this.d;
        if (kx7Var != null) {
            codedOutputByteBufferNano.Y(2, kx7Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ex7 m() {
        this.c = null;
        this.d = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ex7 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new jx7();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new kx7();
                }
                o34Var.q(this.d);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
