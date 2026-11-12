package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class jed extends ak8<jed> {
    public String c;
    public String[] d;

    public jed() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c);
        String[] strArr = this.d;
        if (strArr == null || strArr.length <= 0) {
            return iB;
        }
        int i = 0;
        int iW = 0;
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.d;
            if (i >= strArr2.length) {
                return iB + iW + i2;
            }
            String str = strArr2[i];
            if (str != null) {
                i2++;
                iW += CodedOutputByteBufferNano.w(str);
            }
            i++;
        }
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        String[] strArr = this.d;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.d;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.m0(2, str);
                }
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public jed m() {
        this.c = "";
        this.d = bmr.f;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public jed e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                this.c = o34Var.z();
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
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
