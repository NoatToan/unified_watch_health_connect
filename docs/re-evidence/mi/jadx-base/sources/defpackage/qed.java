package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class qed extends ak8<qed> {
    public t64 c;

    public qed() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        t64 t64Var = this.c;
        return t64Var != null ? iB + CodedOutputByteBufferNano.n(1, t64Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        t64 t64Var = this.c;
        if (t64Var != null) {
            codedOutputByteBufferNano.Y(1, t64Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public qed m() {
        this.c = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public qed e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new t64();
                }
                o34Var.q(this.c);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
