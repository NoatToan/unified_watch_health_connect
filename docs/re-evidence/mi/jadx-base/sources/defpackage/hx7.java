package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class hx7 extends ak8<hx7> {
    public ex7 c;

    public hx7() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        ex7 ex7Var = this.c;
        return ex7Var != null ? iB + CodedOutputByteBufferNano.n(1, ex7Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        ex7 ex7Var = this.c;
        if (ex7Var != null) {
            codedOutputByteBufferNano.Y(1, ex7Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public hx7 m() {
        this.c = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public hx7 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new ex7();
                }
                o34Var.q(this.c);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
