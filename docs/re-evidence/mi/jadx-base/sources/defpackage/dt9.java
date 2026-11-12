package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dt9 extends ak8<dt9> {
    public boolean c;
    public av9 d;

    public dt9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
        av9 av9Var = this.d;
        return av9Var != null ? iB + CodedOutputByteBufferNano.n(2, av9Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        av9 av9Var = this.d;
        if (av9Var != null) {
            codedOutputByteBufferNano.Y(2, av9Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public dt9 m() {
        this.c = false;
        this.d = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public dt9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new av9();
                }
                o34Var.q(this.d);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
