package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class l6f extends ak8<l6f> {
    public byte[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    public l6f() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.d(1, this.c) + CodedOutputByteBufferNano.l(2, this.d);
        int i = this.e;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(3, i);
        }
        int i2 = this.f;
        if (i2 != 0) {
            iB += CodedOutputByteBufferNano.y(4, i2);
        }
        int i3 = this.g;
        return i3 != 0 ? iB + CodedOutputByteBufferNano.y(5, i3) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.O(1, this.c);
        codedOutputByteBufferNano.W(2, this.d);
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.p0(3, i);
        }
        int i2 = this.f;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(4, i2);
        }
        int i3 = this.g;
        if (i3 != 0) {
            codedOutputByteBufferNano.p0(5, i3);
        }
        super.j(codedOutputByteBufferNano);
    }

    public l6f m() {
        this.c = bmr.h;
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
    public l6f e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.l();
            } else if (iA == 16) {
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
                this.d = iP;
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
