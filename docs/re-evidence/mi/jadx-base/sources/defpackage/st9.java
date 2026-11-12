package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class st9 extends ak8<st9> {
    public boolean c;
    public t64 d;
    public t64 e;
    public boolean f;
    public t64 g;
    public t64 h;
    public int i;

    public st9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.b(1, this.c);
        t64 t64Var = this.d;
        if (t64Var != null) {
            iB += CodedOutputByteBufferNano.n(2, t64Var);
        }
        t64 t64Var2 = this.e;
        if (t64Var2 != null) {
            iB += CodedOutputByteBufferNano.n(3, t64Var2);
        }
        int iB2 = iB + CodedOutputByteBufferNano.b(4, this.f);
        int i = this.i;
        if (i != 0) {
            iB2 += CodedOutputByteBufferNano.l(5, i);
        }
        t64 t64Var3 = this.g;
        if (t64Var3 != null) {
            iB2 += CodedOutputByteBufferNano.n(6, t64Var3);
        }
        t64 t64Var4 = this.h;
        return t64Var4 != null ? iB2 + CodedOutputByteBufferNano.n(7, t64Var4) : iB2;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.M(1, this.c);
        t64 t64Var = this.d;
        if (t64Var != null) {
            codedOutputByteBufferNano.Y(2, t64Var);
        }
        t64 t64Var2 = this.e;
        if (t64Var2 != null) {
            codedOutputByteBufferNano.Y(3, t64Var2);
        }
        codedOutputByteBufferNano.M(4, this.f);
        int i = this.i;
        if (i != 0) {
            codedOutputByteBufferNano.W(5, i);
        }
        t64 t64Var3 = this.g;
        if (t64Var3 != null) {
            codedOutputByteBufferNano.Y(6, t64Var3);
        }
        t64 t64Var4 = this.h;
        if (t64Var4 != null) {
            codedOutputByteBufferNano.Y(7, t64Var4);
        }
        super.j(codedOutputByteBufferNano);
    }

    public st9 m() {
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = null;
        this.h = null;
        this.i = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public st9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.k();
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new t64();
                }
                o34Var.q(this.d);
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new t64();
                }
                o34Var.q(this.e);
            } else if (iA == 32) {
                this.f = o34Var.k();
            } else if (iA == 40) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2) {
                    this.i = iP;
                }
            } else if (iA == 50) {
                if (this.g == null) {
                    this.g = new t64();
                }
                o34Var.q(this.g);
            } else if (iA == 58) {
                if (this.h == null) {
                    this.h = new t64();
                }
                o34Var.q(this.h);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
