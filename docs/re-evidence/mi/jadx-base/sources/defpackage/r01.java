package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class r01 extends ak8<r01> {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public r01() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        return super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.l(2, this.d) + CodedOutputByteBufferNano.l(3, this.e) + CodedOutputByteBufferNano.l(4, this.f) + CodedOutputByteBufferNano.l(5, this.g) + CodedOutputByteBufferNano.l(6, this.h);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        codedOutputByteBufferNano.W(3, this.e);
        codedOutputByteBufferNano.W(4, this.f);
        codedOutputByteBufferNano.W(5, this.g);
        codedOutputByteBufferNano.W(6, this.h);
        super.j(codedOutputByteBufferNano);
    }

    public r01 m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public r01 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                int iP2 = o34Var.p();
                if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                    this.d = iP2;
                }
            } else if (iA == 24) {
                int iP3 = o34Var.p();
                if (iP3 == 0 || iP3 == 1 || iP3 == 2 || iP3 == 3) {
                    this.e = iP3;
                }
            } else if (iA == 32) {
                int iP4 = o34Var.p();
                if (iP4 == 0 || iP4 == 1 || iP4 == 2) {
                    this.f = iP4;
                }
            } else if (iA == 40) {
                int iP5 = o34Var.p();
                if (iP5 == 0 || iP5 == 1) {
                    this.g = iP5;
                }
            } else if (iA == 48) {
                int iP6 = o34Var.p();
                if (iP6 == 0 || iP6 == 1 || iP6 == 2) {
                    this.h = iP6;
                }
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
