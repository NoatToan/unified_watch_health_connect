package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o14 extends ak8<o14> {
    public int[] c;

    public o14() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        int[] iArr = this.c;
        if (iArr == null || iArr.length <= 0) {
            return iB;
        }
        int i = 0;
        int iZ = 0;
        while (true) {
            int[] iArr2 = this.c;
            if (i >= iArr2.length) {
                return iB + iZ + iArr2.length;
            }
            iZ += CodedOutputByteBufferNano.z(iArr2[i]);
            i++;
        }
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int[] iArr = this.c;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.p0(1, iArr2[i]);
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public o14 m() {
        this.c = bmr.f4377a;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public o14 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iA2 = bmr.a(o34Var, 8);
                int[] iArr = this.c;
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
                this.c = iArr2;
            } else if (iA == 10) {
                int iJ = o34Var.j(o34Var.v());
                int iF = o34Var.f();
                int i2 = 0;
                while (o34Var.d() > 0) {
                    o34Var.B();
                    i2++;
                }
                o34Var.E(iF);
                int[] iArr3 = this.c;
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
                this.c = iArr4;
                o34Var.i(iJ);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
