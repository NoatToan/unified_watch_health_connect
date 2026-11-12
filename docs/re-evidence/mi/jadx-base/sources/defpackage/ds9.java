package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ds9 extends ak8<ds9> {
    public int c;
    public int d;
    public byte[] e;
    public ju9 f;

    public ds9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        int i = this.d;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(2, i);
        }
        if (!Arrays.equals(this.e, bmr.h)) {
            iB += CodedOutputByteBufferNano.d(3, this.e);
        }
        ju9 ju9Var = this.f;
        return ju9Var != null ? iB + CodedOutputByteBufferNano.n(4, ju9Var) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.p0(2, i);
        }
        if (!Arrays.equals(this.e, bmr.h)) {
            codedOutputByteBufferNano.O(3, this.e);
        }
        ju9 ju9Var = this.f;
        if (ju9Var != null) {
            codedOutputByteBufferNano.Y(4, ju9Var);
        }
        super.j(codedOutputByteBufferNano);
    }

    public ds9 m() {
        this.c = 0;
        this.d = 0;
        this.e = bmr.h;
        this.f = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ds9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP != 16) {
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
                        case 9:
                            break;
                        default:
                            continue;
                    }
                }
                this.c = iP;
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 26) {
                this.e = o34Var.l();
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new ju9();
                }
                o34Var.q(this.f);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
