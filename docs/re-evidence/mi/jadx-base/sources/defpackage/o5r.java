package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o5r extends ak8<o5r> {
    public int c;
    public String d;
    public String e;

    public o5r() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        if (!this.d.equals("")) {
            iB += CodedOutputByteBufferNano.v(2, this.d);
        }
        return !this.e.equals("") ? iB + CodedOutputByteBufferNano.v(3, this.e) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.m0(2, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        super.j(codedOutputByteBufferNano);
    }

    public o5r m() {
        this.c = 0;
        this.d = "";
        this.e = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public o5r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                    this.c = iP;
                }
            } else if (iA == 18) {
                this.d = o34Var.z();
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
