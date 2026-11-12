package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o11 extends ak8<o11> {
    public int c;
    public int d;
    public int e;

    public o11() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.l(2, this.d) + CodedOutputByteBufferNano.l(3, this.e);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        codedOutputByteBufferNano.W(3, this.e);
        super.j(codedOutputByteBufferNano);
    }

    public o11 m() {
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public o11 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.p();
            } else if (iA == 16) {
                int iP = o34Var.p();
                if (iP == -1 || iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                    this.d = iP;
                }
            } else if (iA == 24) {
                int iP2 = o34Var.p();
                if (iP2 == -1 || iP2 == 0 || iP2 == 1) {
                    this.e = iP2;
                }
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
