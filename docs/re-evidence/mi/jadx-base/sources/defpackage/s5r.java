package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class s5r extends ak8<s5r> {
    public String c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public boolean i;

    public s5r() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.l(2, this.d);
        boolean z = this.e;
        if (z) {
            iB += CodedOutputByteBufferNano.b(3, z);
        }
        int i = this.f;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(4, i);
        }
        int i2 = this.h;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(5, i2);
        }
        boolean z2 = this.i;
        if (z2) {
            iB += CodedOutputByteBufferNano.b(6, z2);
        }
        int i3 = this.g;
        return i3 != 1 ? iB + CodedOutputByteBufferNano.l(7, i3) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        boolean z = this.e;
        if (z) {
            codedOutputByteBufferNano.M(3, z);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputByteBufferNano.W(4, i);
        }
        int i2 = this.h;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(5, i2);
        }
        boolean z2 = this.i;
        if (z2) {
            codedOutputByteBufferNano.M(6, z2);
        }
        int i3 = this.g;
        if (i3 != 1) {
            codedOutputByteBufferNano.W(7, i3);
        }
        super.j(codedOutputByteBufferNano);
    }

    public s5r m() {
        this.c = "";
        this.d = 0;
        this.e = false;
        this.f = 0;
        this.g = 1;
        this.h = 0;
        this.i = false;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public s5r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
            } else if (iA == 16) {
                int iP = o34Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                    this.d = iP;
                }
            } else if (iA == 24) {
                this.e = o34Var.k();
            } else if (iA == 32) {
                int iP2 = o34Var.p();
                switch (iP2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.f = iP2;
                        break;
                }
            } else if (iA == 40) {
                this.h = o34Var.B();
            } else if (iA == 48) {
                this.i = o34Var.k();
            } else if (iA == 56) {
                int iP3 = o34Var.p();
                if (iP3 == 1) {
                    this.g = iP3;
                }
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
