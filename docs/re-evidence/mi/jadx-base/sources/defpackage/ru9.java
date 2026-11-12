package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ru9 extends ak8<ru9> {
    public int c;
    public v64 d;
    public int e;
    public v64 f;
    public int[] g;

    public ru9() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.y(1, this.c);
        v64 v64Var = this.d;
        if (v64Var != null) {
            iB += CodedOutputByteBufferNano.n(2, v64Var);
        }
        int iY = iB + CodedOutputByteBufferNano.y(3, this.e);
        v64 v64Var2 = this.f;
        if (v64Var2 != null) {
            iY += CodedOutputByteBufferNano.n(4, v64Var2);
        }
        int[] iArr = this.g;
        if (iArr == null || iArr.length <= 0) {
            return iY;
        }
        int i = 0;
        int iZ = 0;
        while (true) {
            int[] iArr2 = this.g;
            if (i >= iArr2.length) {
                return iY + iZ + iArr2.length;
            }
            iZ += CodedOutputByteBufferNano.z(iArr2[i]);
            i++;
        }
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.p0(1, this.c);
        v64 v64Var = this.d;
        if (v64Var != null) {
            codedOutputByteBufferNano.Y(2, v64Var);
        }
        codedOutputByteBufferNano.p0(3, this.e);
        v64 v64Var2 = this.f;
        if (v64Var2 != null) {
            codedOutputByteBufferNano.Y(4, v64Var2);
        }
        int[] iArr = this.g;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.g;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.p0(5, iArr2[i]);
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public ru9 m() {
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = null;
        this.g = bmr.f4377a;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ru9 e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                this.c = o34Var.B();
            } else if (iA == 18) {
                if (this.d == null) {
                    this.d = new v64();
                }
                o34Var.q(this.d);
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (iA == 34) {
                if (this.f == null) {
                    this.f = new v64();
                }
                o34Var.q(this.f);
            } else if (iA == 40) {
                int iA2 = bmr.a(o34Var, 40);
                int[] iArr = this.g;
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
                this.g = iArr2;
            } else if (iA == 42) {
                int iJ = o34Var.j(o34Var.v());
                int iF = o34Var.f();
                int i2 = 0;
                while (o34Var.d() > 0) {
                    o34Var.B();
                    i2++;
                }
                o34Var.E(iF);
                int[] iArr3 = this.g;
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
                this.g = iArr4;
                o34Var.i(iJ);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
