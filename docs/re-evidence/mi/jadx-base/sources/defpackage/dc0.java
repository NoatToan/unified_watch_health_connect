package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dc0 extends ak8<dc0> {
    public int c;
    public float d;
    public String e;
    public String f;
    public String g;
    public int h;

    public dc0() {
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
        int i = this.h;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(4, i);
        }
        if (!this.f.equals("")) {
            iB += CodedOutputByteBufferNano.v(5, this.f);
        }
        return !this.g.equals("") ? iB + CodedOutputByteBufferNano.v(6, this.g) : iB;
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
        int i = this.h;
        if (i != 0) {
            codedOutputByteBufferNano.p0(4, i);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(5, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(6, this.g);
        }
        super.j(codedOutputByteBufferNano);
    }

    public dc0 m() {
        this.c = 0;
        this.d = 0.0f;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public dc0 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 15) {
                    this.c = iP;
                }
            } else if (iA == 21) {
                this.d = o34Var.o();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 32) {
                this.h = o34Var.B();
            } else if (iA == 42) {
                this.f = o34Var.z();
            } else if (iA == 50) {
                this.g = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
