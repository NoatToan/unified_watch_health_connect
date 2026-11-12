package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ec0 extends ak8<ec0> {
    public int c;
    public float d;
    public String e;
    public int f;

    public ec0() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            iB += CodedOutputByteBufferNano.j(2, this.d);
        }
        if (!this.e.equals("")) {
            iB += CodedOutputByteBufferNano.v(3, this.e);
        }
        int i = this.f;
        return i != 0 ? iB + CodedOutputByteBufferNano.y(4, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.U(2, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.p0(4, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ec0 m() {
        this.c = 0;
        this.d = 0.0f;
        this.e = "";
        this.f = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ec0 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1) {
                    this.c = iP;
                }
            } else if (iA == 21) {
                this.d = o34Var.o();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
