package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ned extends ak8<ned> {
    public k64 c;

    public ned() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        k64 k64Var = this.c;
        return k64Var != null ? iB + CodedOutputByteBufferNano.n(1, k64Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        k64 k64Var = this.c;
        if (k64Var != null) {
            codedOutputByteBufferNano.Y(1, k64Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ned m() {
        this.c = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ned e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new k64();
                }
                o34Var.q(this.c);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
