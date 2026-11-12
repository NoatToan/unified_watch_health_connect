package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class uxg extends ak8<uxg> {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public uxg() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        int i = this.d;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.l(2, i);
        }
        int i2 = this.e;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(3, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            iB += CodedOutputByteBufferNano.y(4, i3);
        }
        int i4 = this.g;
        return i4 != 0 ? iB + CodedOutputByteBufferNano.y(5, i4) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.W(2, i);
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(3, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(4, i3);
        }
        int i4 = this.g;
        if (i4 != 0) {
            codedOutputByteBufferNano.p0(5, i4);
        }
        super.j(codedOutputByteBufferNano);
    }

    public uxg m() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public uxg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP != 255) {
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
                            break;
                        default:
                            continue;
                    }
                }
                this.c = iP;
            } else if (iA == 16) {
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
                        this.d = iP2;
                        break;
                }
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 32) {
                this.f = o34Var.B();
            } else if (iA == 40) {
                this.g = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
