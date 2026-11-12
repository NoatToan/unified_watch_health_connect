package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class y41 extends ak8<y41> {
    public String c;
    public int d;
    public String e;
    public String f;

    public y41() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.l(2, this.d) + CodedOutputByteBufferNano.v(3, this.e);
        return !this.f.equals("") ? iB + CodedOutputByteBufferNano.v(4, this.f) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        codedOutputByteBufferNano.m0(3, this.e);
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.m0(4, this.f);
        }
        super.j(codedOutputByteBufferNano);
    }

    public y41 m() {
        this.c = "";
        this.d = -1;
        this.e = "";
        this.f = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public y41 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 16) {
                int iP = o34Var.p();
                if (iP == -1 || iP == 0 || iP == 1 || iP == 2) {
                    this.d = iP;
                }
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (iA == 34) {
                this.f = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
