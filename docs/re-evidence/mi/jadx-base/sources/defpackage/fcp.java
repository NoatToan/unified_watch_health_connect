package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class fcp extends ak8<fcp> {
    public ccp c;
    public String d;

    public fcp() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        ccp ccpVar = this.c;
        if (ccpVar != null) {
            iB += CodedOutputByteBufferNano.n(1, ccpVar);
        }
        return !this.d.equals("") ? iB + CodedOutputByteBufferNano.v(2, this.d) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        ccp ccpVar = this.c;
        if (ccpVar != null) {
            codedOutputByteBufferNano.Y(1, ccpVar);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.m0(2, this.d);
        }
        super.j(codedOutputByteBufferNano);
    }

    public fcp m() {
        this.c = null;
        this.d = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public fcp e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new ccp();
                }
                o34Var.q(this.c);
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
