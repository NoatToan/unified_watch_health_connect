package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class m64 extends ak8<m64> {
    public int c;
    public String[] d;
    public String[] e;

    public m64() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
        String[] strArr = this.d;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int iW = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.d;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i3++;
                    iW += CodedOutputByteBufferNano.w(str);
                }
                i2++;
            }
            iB = iB + iW + i3;
        }
        String[] strArr3 = this.e;
        if (strArr3 == null || strArr3.length <= 0) {
            return iB;
        }
        int iW2 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr4 = this.e;
            if (i >= strArr4.length) {
                return iB + iW2 + i4;
            }
            String str2 = strArr4[i];
            if (str2 != null) {
                i4++;
                iW2 += CodedOutputByteBufferNano.w(str2);
            }
            i++;
        }
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        String[] strArr = this.d;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.d;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.m0(2, str);
                }
                i2++;
            }
        }
        String[] strArr3 = this.e;
        if (strArr3 != null && strArr3.length > 0) {
            while (true) {
                String[] strArr4 = this.e;
                if (i >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.m0(3, str2);
                }
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public m64 m() {
        this.c = 0;
        String[] strArr = bmr.f;
        this.d = strArr;
        this.e = strArr;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public m64 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 18) {
                int iA2 = bmr.a(o34Var, 18);
                String[] strArr = this.d;
                int length = strArr == null ? 0 : strArr.length;
                int i = iA2 + length;
                String[] strArr2 = new String[i];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i - 1) {
                    strArr2[length] = o34Var.z();
                    o34Var.A();
                    length++;
                }
                strArr2[length] = o34Var.z();
                this.d = strArr2;
            } else if (iA == 26) {
                int iA3 = bmr.a(o34Var, 26);
                String[] strArr3 = this.e;
                int length2 = strArr3 == null ? 0 : strArr3.length;
                int i2 = iA3 + length2;
                String[] strArr4 = new String[i2];
                if (length2 != 0) {
                    System.arraycopy(strArr3, 0, strArr4, 0, length2);
                }
                while (length2 < i2 - 1) {
                    strArr4[length2] = o34Var.z();
                    o34Var.A();
                    length2++;
                }
                strArr4[length2] = o34Var.z();
                this.e = strArr4;
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
