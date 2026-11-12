package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class hsg extends ak8<hsg> {
    public int c;
    public fsg d;
    public dsg e;

    public hsg() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        fsg fsgVar = this.d;
        if (fsgVar != null) {
            iB += CodedOutputByteBufferNano.n(2, fsgVar);
        }
        dsg dsgVar = this.e;
        return dsgVar != null ? iB + CodedOutputByteBufferNano.n(3, dsgVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        fsg fsgVar = this.d;
        if (fsgVar != null) {
            codedOutputByteBufferNano.Y(2, fsgVar);
        }
        dsg dsgVar = this.e;
        if (dsgVar != null) {
            codedOutputByteBufferNano.Y(3, dsgVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public hsg m() {
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public hsg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.p();
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new fsg();
                }
                o34Var.q(this.d);
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new dsg();
                }
                o34Var.q(this.e);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
