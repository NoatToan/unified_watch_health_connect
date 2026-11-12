package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ix7 extends ak8<ix7> {
    public int c;
    public int d;
    public sw7 e;
    public sw7 f;
    public lx7 g;
    public int h;
    public int i;

    public ix7() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        sw7 sw7Var = this.e;
        if (sw7Var != null) {
            iB += CodedOutputByteBufferNano.n(3, sw7Var);
        }
        sw7 sw7Var2 = this.f;
        if (sw7Var2 != null) {
            iB += CodedOutputByteBufferNano.n(4, sw7Var2);
        }
        lx7 lx7Var = this.g;
        if (lx7Var != null) {
            iB += CodedOutputByteBufferNano.n(5, lx7Var);
        }
        return iB + CodedOutputByteBufferNano.y(6, this.h) + CodedOutputByteBufferNano.y(7, this.i);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        sw7 sw7Var = this.e;
        if (sw7Var != null) {
            codedOutputByteBufferNano.Y(3, sw7Var);
        }
        sw7 sw7Var2 = this.f;
        if (sw7Var2 != null) {
            codedOutputByteBufferNano.Y(4, sw7Var2);
        }
        lx7 lx7Var = this.g;
        if (lx7Var != null) {
            codedOutputByteBufferNano.Y(5, lx7Var);
        }
        codedOutputByteBufferNano.p0(6, this.h);
        codedOutputByteBufferNano.p0(7, this.i);
        super.j(codedOutputByteBufferNano);
    }

    public ix7 m() {
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 0;
        this.i = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ix7 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new sw7();
                }
                o34Var.q(this.e);
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new sw7();
                }
                o34Var.q(this.f);
            } else if (iA == 42) {
                if (this.g == null) {
                    this.g = new lx7();
                }
                o34Var.q(this.g);
            } else if (iA == 48) {
                this.h = o34Var.B();
            } else if (iA == 56) {
                this.i = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
