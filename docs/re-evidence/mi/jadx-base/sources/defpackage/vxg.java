package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class vxg extends ak8<vxg> {
    public int c;
    public String[] d;
    public int e;

    public static final class a extends ak8<a> {
        public int c;
        public int[] d;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
            int[] iArr = this.d;
            if (iArr == null || iArr.length <= 0) {
                return iB;
            }
            int i = 0;
            int iZ = 0;
            while (true) {
                int[] iArr2 = this.d;
                if (i >= iArr2.length) {
                    return iB + iZ + iArr2.length;
                }
                iZ += CodedOutputByteBufferNano.z(iArr2[i]);
                i++;
            }
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.W(1, this.c);
            int[] iArr = this.d;
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                while (true) {
                    int[] iArr2 = this.d;
                    if (i >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.p0(2, iArr2[i]);
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = 1;
            this.d = bmr.f4377a;
            this.f1122b = null;
            this.f15887a = -1;
            return this;
        }

        @Override // defpackage.dsf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a e(o34 o34Var) throws IOException {
            while (true) {
                int iA = o34Var.A();
                if (iA == 0) {
                    return this;
                }
                if (iA == 8) {
                    int iP = o34Var.p();
                    if (iP == 1 || iP == 2) {
                        this.c = iP;
                    }
                } else if (iA == 16) {
                    int iA2 = bmr.a(o34Var, 16);
                    int[] iArr = this.d;
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
                    this.d = iArr2;
                } else if (iA == 18) {
                    int iJ = o34Var.j(o34Var.v());
                    int iF = o34Var.f();
                    int i2 = 0;
                    while (o34Var.d() > 0) {
                        o34Var.B();
                        i2++;
                    }
                    o34Var.E(iF);
                    int[] iArr3 = this.d;
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
                    this.d = iArr4;
                    o34Var.i(iJ);
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public vxg() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b() + CodedOutputByteBufferNano.l(1, this.c);
        String[] strArr = this.d;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            int iW = 0;
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.d;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    i2++;
                    iW += CodedOutputByteBufferNano.w(str);
                }
                i++;
            }
            iB = iB + iW + i2;
        }
        int i3 = this.e;
        return i3 != 0 ? iB + CodedOutputByteBufferNano.y(3, i3) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.W(1, this.c);
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
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.p0(3, i2);
        }
        super.j(codedOutputByteBufferNano);
    }

    public vxg m() {
        this.c = 1;
        this.d = bmr.f;
        this.e = 0;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public vxg e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iP = o34Var.p();
                if (iP == 1 || iP == 2) {
                    this.c = iP;
                }
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
            } else if (iA == 24) {
                this.e = o34Var.B();
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
