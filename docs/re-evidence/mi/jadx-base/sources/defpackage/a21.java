package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class a21 extends ak8<a21> {
    public l11.a c;
    public int d;
    public String e;

    public a21() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        l11.a aVar = this.c;
        if (aVar != null) {
            iB += CodedOutputByteBufferNano.n(1, aVar);
        }
        int iL = iB + CodedOutputByteBufferNano.l(2, this.d);
        return !this.e.equals("") ? iL + CodedOutputByteBufferNano.v(3, this.e) : iL;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        l11.a aVar = this.c;
        if (aVar != null) {
            codedOutputByteBufferNano.Y(1, aVar);
        }
        codedOutputByteBufferNano.W(2, this.d);
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        super.j(codedOutputByteBufferNano);
    }

    public a21 m() {
        this.c = null;
        this.d = -1;
        this.e = "";
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a21 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new l11.a();
                }
                o34Var.q(this.c);
            } else if (iA == 16) {
                int iP = o34Var.p();
                switch (iP) {
                    case -1:
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.d = iP;
                        break;
                }
            } else if (iA == 26) {
                this.e = o34Var.z();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
