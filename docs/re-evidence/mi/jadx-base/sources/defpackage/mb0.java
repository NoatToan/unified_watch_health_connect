package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class mb0 extends ak8<mb0> {
    public String c;
    public String d;
    public cc0 e;

    public mb0() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.v(2, this.d);
        cc0 cc0Var = this.e;
        return cc0Var != null ? iB + CodedOutputByteBufferNano.n(3, cc0Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.m0(2, this.d);
        cc0 cc0Var = this.e;
        if (cc0Var != null) {
            codedOutputByteBufferNano.Y(3, cc0Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public mb0 m() {
        this.c = "";
        this.d = "";
        this.e = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public mb0 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                if (this.e == null) {
                    this.e = new cc0();
                }
                o34Var.q(this.e);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
