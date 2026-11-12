package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class wxo extends ak8<wxo> {
    public n64 c;
    public t64 d;
    public v64 e;
    public boolean f;

    public wxo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        n64 n64Var = this.c;
        if (n64Var != null) {
            iB += CodedOutputByteBufferNano.n(1, n64Var);
        }
        t64 t64Var = this.d;
        if (t64Var != null) {
            iB += CodedOutputByteBufferNano.n(2, t64Var);
        }
        v64 v64Var = this.e;
        if (v64Var != null) {
            iB += CodedOutputByteBufferNano.n(3, v64Var);
        }
        boolean z = this.f;
        return z ? iB + CodedOutputByteBufferNano.b(4, z) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        n64 n64Var = this.c;
        if (n64Var != null) {
            codedOutputByteBufferNano.Y(1, n64Var);
        }
        t64 t64Var = this.d;
        if (t64Var != null) {
            codedOutputByteBufferNano.Y(2, t64Var);
        }
        v64 v64Var = this.e;
        if (v64Var != null) {
            codedOutputByteBufferNano.Y(3, v64Var);
        }
        boolean z = this.f;
        if (z) {
            codedOutputByteBufferNano.M(4, z);
        }
        super.j(codedOutputByteBufferNano);
    }

    public wxo m() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public wxo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new n64();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new t64();
                }
                o34Var.q(this.d);
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new v64();
                }
                o34Var.q(this.e);
            } else if (iA == 32) {
                this.f = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
