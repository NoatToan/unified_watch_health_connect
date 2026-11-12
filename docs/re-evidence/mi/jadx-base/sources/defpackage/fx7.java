package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class fx7 extends ak8<fx7> {
    public jx7 c;
    public kx7 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public fx7() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        jx7 jx7Var = this.c;
        if (jx7Var != null) {
            iB += CodedOutputByteBufferNano.n(1, jx7Var);
        }
        kx7 kx7Var = this.d;
        if (kx7Var != null) {
            iB += CodedOutputByteBufferNano.n(2, kx7Var);
        }
        return iB + CodedOutputByteBufferNano.y(3, this.e) + CodedOutputByteBufferNano.y(4, this.f) + CodedOutputByteBufferNano.y(5, this.g) + CodedOutputByteBufferNano.y(6, this.h) + CodedOutputByteBufferNano.y(7, this.i);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        jx7 jx7Var = this.c;
        if (jx7Var != null) {
            codedOutputByteBufferNano.Y(1, jx7Var);
        }
        kx7 kx7Var = this.d;
        if (kx7Var != null) {
            codedOutputByteBufferNano.Y(2, kx7Var);
        }
        codedOutputByteBufferNano.p0(3, this.e);
        codedOutputByteBufferNano.p0(4, this.f);
        codedOutputByteBufferNano.p0(5, this.g);
        codedOutputByteBufferNano.p0(6, this.h);
        codedOutputByteBufferNano.p0(7, this.i);
        super.j(codedOutputByteBufferNano);
    }

    public fx7 m() {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public fx7 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new jx7();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new kx7();
                }
                o34Var.q(this.d);
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 40) {
                this.g = o34Var.B();
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
