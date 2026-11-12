package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class rt9 extends ak8<rt9> {
    public int c;
    public int d;
    public float e;
    public int f;
    public int g;

    public rt9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d) + CodedOutputByteBufferNano.j(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.l(5, this.g);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        codedOutputByteBufferNano.U(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        codedOutputByteBufferNano.W(5, this.g);
        super.j(codedOutputByteBufferNano);
    }

    public rt9 m() {
        this.c = 0;
        this.d = 0;
        this.e = 0.0f;
        this.f = 0;
        this.g = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public rt9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 29) {
                this.e = o34Var.o();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 40) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2) {
                    this.g = iP;
                }
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
