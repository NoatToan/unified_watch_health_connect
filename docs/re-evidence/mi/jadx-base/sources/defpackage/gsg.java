package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class gsg extends ak8<gsg> {
    public int c;
    public int d;
    public isg e;
    public fsg f;
    public boolean g;

    public gsg() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        isg isgVar = this.e;
        if (isgVar != null) {
            iB += CodedOutputByteBufferNano.n(3, isgVar);
        }
        fsg fsgVar = this.f;
        if (fsgVar != null) {
            iB += CodedOutputByteBufferNano.n(4, fsgVar);
        }
        return iB + CodedOutputByteBufferNano.b(5, this.g);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        isg isgVar = this.e;
        if (isgVar != null) {
            codedOutputByteBufferNano.Y(3, isgVar);
        }
        fsg fsgVar = this.f;
        if (fsgVar != null) {
            codedOutputByteBufferNano.Y(4, fsgVar);
        }
        codedOutputByteBufferNano.M(5, this.g);
        super.j(codedOutputByteBufferNano);
    }

    public gsg m() {
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public gsg e(o34 o34Var) throws IOException {
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
                    this.e = new isg();
                }
                o34Var.q(this.e);
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new fsg();
                }
                o34Var.q(this.f);
            } else if (iA == 40) {
                this.g = o34Var.k();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
