package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class fsg extends ak8<fsg> {
    public int c;
    public int d;
    public int[] e;

    public fsg() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c) + CodedOutputByteBufferNano.y(2, this.d);
        int[] iArr = this.e;
        if (iArr == null || iArr.length <= 0) {
            return iB;
        }
        int i = 0;
        int iZ = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i >= iArr2.length) {
                return iB + iZ + iArr2.length;
            }
            iZ += CodedOutputByteBufferNano.z(iArr2[i]);
            i++;
        }
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        codedOutputByteBufferNano.p0(2, this.d);
        int[] iArr = this.e;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.e;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.p0(3, iArr2[i]);
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public fsg m() {
        this.c = 0;
        this.d = 0;
        this.e = bmr.f4377a;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public fsg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 16) {
                this.d = o34Var.B();
            } else if (iA == 24) {
                int iA2 = bmr.a(o34Var, 24);
                int[] iArr = this.e;
                int length = iArr == null ? 0 : iArr.length;
                int i = iA2 + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = o34Var.B();
                    o34Var.A();
                    length++;
                }
                iArr2[length] = o34Var.B();
                this.e = iArr2;
            } else if (iA == 26) {
                int iJ = o34Var.j(o34Var.v());
                int iF = o34Var.f();
                int i2 = 0;
                while (o34Var.d() > 0) {
                    o34Var.B();
                    i2++;
                }
                o34Var.E(iF);
                int[] iArr3 = this.e;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i3 = i2 + length2;
                int[] iArr4 = new int[i3];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i3) {
                    iArr4[length2] = o34Var.B();
                    length2++;
                }
                this.e = iArr4;
                o34Var.i(iJ);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
