package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ib0 extends ak8<ib0> {
    public String c;
    public ec0 d;

    public ib0() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
        ec0 ec0Var = this.d;
        return ec0Var != null ? iB + CodedOutputByteBufferNano.n(2, ec0Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        ec0 ec0Var = this.d;
        if (ec0Var != null) {
            codedOutputByteBufferNano.Y(2, ec0Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ib0 m() {
        this.c = "";
        this.d = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ib0 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new ec0();
                }
                o34Var.q(this.d);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
