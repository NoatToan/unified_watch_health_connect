package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class bcp extends ak8<bcp> {
    public ccp c;
    public int d;

    public bcp() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        ccp ccpVar = this.c;
        if (ccpVar != null) {
            iB += CodedOutputByteBufferNano.n(1, ccpVar);
        }
        return iB + CodedOutputByteBufferNano.l(2, this.d);
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        ccp ccpVar = this.c;
        if (ccpVar != null) {
            codedOutputByteBufferNano.Y(1, ccpVar);
        }
        codedOutputByteBufferNano.W(2, this.d);
        super.j(codedOutputByteBufferNano);
    }

    public bcp m() {
        this.c = null;
        this.d = 1;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public bcp e(o34 o34Var) throws IOException {
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
            } else if (iA == 16) {
                int iP = o34Var.p();
                if (iP == 1 || iP == 2 || iP == 3) {
                    this.d = iP;
                }
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
