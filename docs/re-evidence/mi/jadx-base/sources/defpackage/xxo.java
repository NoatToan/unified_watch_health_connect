package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class xxo extends ak8<xxo> {
    public o64 c;
    public u64 d;
    public w64 e;
    public boolean f;

    public xxo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        o64 o64Var = this.c;
        if (o64Var != null) {
            iB += CodedOutputByteBufferNano.n(1, o64Var);
        }
        u64 u64Var = this.d;
        if (u64Var != null) {
            iB += CodedOutputByteBufferNano.n(2, u64Var);
        }
        w64 w64Var = this.e;
        if (w64Var != null) {
            iB += CodedOutputByteBufferNano.n(3, w64Var);
        }
        boolean z = this.f;
        return z ? iB + CodedOutputByteBufferNano.b(4, z) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        o64 o64Var = this.c;
        if (o64Var != null) {
            codedOutputByteBufferNano.Y(1, o64Var);
        }
        u64 u64Var = this.d;
        if (u64Var != null) {
            codedOutputByteBufferNano.Y(2, u64Var);
        }
        w64 w64Var = this.e;
        if (w64Var != null) {
            codedOutputByteBufferNano.Y(3, w64Var);
        }
        boolean z = this.f;
        if (z) {
            codedOutputByteBufferNano.M(4, z);
        }
        super.j(codedOutputByteBufferNano);
    }

    public xxo m() {
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
    public xxo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new o64();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new u64();
                }
                o34Var.q(this.d);
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new w64();
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
