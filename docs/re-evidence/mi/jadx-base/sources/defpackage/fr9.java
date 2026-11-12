package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class fr9 extends ak8<fr9> {
    public boolean c;
    public int d;
    public int e;
    public av9 f;

    public fr9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c) + CodedOutputByteBufferNano.l(2, this.d);
        int i = this.e;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(3, i);
        }
        av9 av9Var = this.f;
        return av9Var != null ? iB + CodedOutputByteBufferNano.n(4, av9Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.p0(3, i);
        }
        av9 av9Var = this.f;
        if (av9Var != null) {
            codedOutputByteBufferNano.Y(4, av9Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public fr9 m() {
        this.c = false;
        this.d = 0;
        this.e = 0;
        this.f = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public fr9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 16) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2) {
                    this.d = iP;
                }
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new av9();
                }
                o34Var.q(this.f);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
