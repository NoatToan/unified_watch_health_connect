package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class eu9 extends ak8<eu9> {
    public int c;
    public int d;
    public int e;

    public eu9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        int i = this.e;
        return i != 0 ? iB + CodedOutputByteBufferNano.l(3, i) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.W(3, i);
        }
        super.j(codedOutputByteBufferNano);
    }

    public eu9 m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public eu9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                switch (iP) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                        this.c = iP;
                        break;
                }
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                int iP2 = o34Var.p();
                if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 10) {
                    this.e = iP2;
                }
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
