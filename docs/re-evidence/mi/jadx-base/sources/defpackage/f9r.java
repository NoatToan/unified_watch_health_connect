package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class f9r extends ak8<f9r> {
    public int c;
    public int d;

    public f9r() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        int i = this.c;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(1, i);
        }
        int i2 = this.d;
        return i2 != 0 ? iB + CodedOutputByteBufferNano.l(2, i2) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.c;
        if (i != 0) {
            codedOutputByteBufferNano.W(1, i);
        }
        int i2 = this.d;
        if (i2 != 0) {
            codedOutputByteBufferNano.W(2, i2);
        }
        super.j(codedOutputByteBufferNano);
    }

    public f9r m() {
        this.c = 0;
        this.d = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public f9r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                int iP2 = o34Var.p();
                if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                    this.d = iP2;
                }
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
