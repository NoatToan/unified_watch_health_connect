package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class pwo extends ak8<pwo> {
    public int c;
    public int d;
    public int e;
    public int f;
    public rwo g;

    public pwo() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        int i = this.c;
        if (i != 1) {
            iB += CodedOutputByteBufferNano.l(1, i);
        }
        int i2 = this.d;
        if (i2 != 1) {
            iB += CodedOutputByteBufferNano.l(2, i2);
        }
        int i3 = this.e;
        if (i3 != 1) {
            iB += CodedOutputByteBufferNano.l(3, i3);
        }
        int i4 = this.f;
        if (i4 != 1) {
            iB += CodedOutputByteBufferNano.l(4, i4);
        }
        rwo rwoVar = this.g;
        return rwoVar != null ? iB + CodedOutputByteBufferNano.n(5, rwoVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.c;
        if (i != 1) {
            codedOutputByteBufferNano.W(1, i);
        }
        int i2 = this.d;
        if (i2 != 1) {
            codedOutputByteBufferNano.W(2, i2);
        }
        int i3 = this.e;
        if (i3 != 1) {
            codedOutputByteBufferNano.W(3, i3);
        }
        int i4 = this.f;
        if (i4 != 1) {
            codedOutputByteBufferNano.W(4, i4);
        }
        rwo rwoVar = this.g;
        if (rwoVar != null) {
            codedOutputByteBufferNano.Y(5, rwoVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public pwo m() {
        this.c = 1;
        this.d = 1;
        this.e = 1;
        this.f = 1;
        this.g = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public pwo e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 1 || iP == 2 || iP == 3) {
                    this.c = iP;
                }
            } else if (iA == 16) {
                int iP2 = o34Var.p();
                if (iP2 == 1 || iP2 == 2) {
                    this.d = iP2;
                }
            } else if (iA == 24) {
                int iP3 = o34Var.p();
                if (iP3 == 1 || iP3 == 2) {
                    this.e = iP3;
                }
            } else if (iA == 32) {
                int iP4 = o34Var.p();
                if (iP4 == 1 || iP4 == 2 || iP4 == 3 || iP4 == 4) {
                    this.f = iP4;
                }
            } else if (iA == 42) {
                if (this.g == null) {
                    this.g = new rwo();
                }
                o34Var.q(this.g);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
