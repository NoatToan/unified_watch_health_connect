package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class icp extends ak8<icp> {
    public static volatile icp[] e;
    public ccp c;
    public int[] d;

    public static final class a extends ak8<a> {
        public icp[] c;

        public a() {
            m();
        }

        @Override // defpackage.ak8, defpackage.dsf
        public int b() {
            int iB = super.b();
            icp[] icpVarArr = this.c;
            if (icpVarArr != null && icpVarArr.length > 0) {
                int i = 0;
                while (true) {
                    icp[] icpVarArr2 = this.c;
                    if (i >= icpVarArr2.length) {
                        break;
                    }
                    icp icpVar = icpVarArr2[i];
                    if (icpVar != null) {
                        iB += CodedOutputByteBufferNano.n(1, icpVar);
                    }
                    i++;
                }
            }
            return iB;
        }

        @Override // defpackage.ak8, defpackage.dsf
        public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            icp[] icpVarArr = this.c;
            if (icpVarArr != null && icpVarArr.length > 0) {
                int i = 0;
                while (true) {
                    icp[] icpVarArr2 = this.c;
                    if (i >= icpVarArr2.length) {
                        break;
                    }
                    icp icpVar = icpVarArr2[i];
                    if (icpVar != null) {
                        codedOutputByteBufferNano.Y(1, icpVar);
                    }
                    i++;
                }
            }
            super.j(codedOutputByteBufferNano);
        }

        public a m() {
            this.c = icp.n();
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
                if (iA == 10) {
                    int iA2 = bmr.a(o34Var, 10);
                    icp[] icpVarArr = this.c;
                    int length = icpVarArr == null ? 0 : icpVarArr.length;
                    int i = iA2 + length;
                    icp[] icpVarArr2 = new icp[i];
                    if (length != 0) {
                        System.arraycopy(icpVarArr, 0, icpVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        icp icpVar = new icp();
                        icpVarArr2[length] = icpVar;
                        o34Var.q(icpVar);
                        o34Var.A();
                        length++;
                    }
                    icp icpVar2 = new icp();
                    icpVarArr2[length] = icpVar2;
                    o34Var.q(icpVar2);
                    this.c = icpVarArr2;
                } else if (!l(o34Var, iA)) {
                    return this;
                }
            }
        }
    }

    public icp() {
        m();
    }

    public static icp[] n() {
        if (e == null) {
            synchronized (afd.c) {
                try {
                    if (e == null) {
                        e = new icp[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int iB = super.b();
        ccp ccpVar = this.c;
        if (ccpVar != null) {
            iB += CodedOutputByteBufferNano.n(1, ccpVar);
        }
        int[] iArr = this.d;
        if (iArr == null || iArr.length <= 0) {
            return iB;
        }
        int i = 0;
        int iM = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i >= iArr2.length) {
                return iB + iM + iArr2.length;
            }
            iM += CodedOutputByteBufferNano.m(iArr2[i]);
            i++;
        }
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        ccp ccpVar = this.c;
        if (ccpVar != null) {
            codedOutputByteBufferNano.Y(1, ccpVar);
        }
        int[] iArr = this.d;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.d;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.W(2, iArr2[i]);
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public icp m() {
        this.c = null;
        this.d = bmr.f4377a;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public icp e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 10) {
                if (this.c == null) {
                    this.c = new ccp();
                }
                o34Var.q(this.c);
            } else if (iA == 16) {
                int iA2 = bmr.a(o34Var, 16);
                int[] iArr = new int[iA2];
                int i = 0;
                for (int i2 = 0; i2 < iA2; i2++) {
                    if (i2 != 0) {
                        o34Var.A();
                    }
                    int iP = o34Var.p();
                    if (iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        iArr[i] = iP;
                        i++;
                    }
                }
                if (i != 0) {
                    int[] iArr2 = this.d;
                    int length = iArr2 == null ? 0 : iArr2.length;
                    if (length == 0 && i == iA2) {
                        this.d = iArr;
                    } else {
                        int[] iArr3 = new int[length + i];
                        if (length != 0) {
                            System.arraycopy(iArr2, 0, iArr3, 0, length);
                        }
                        System.arraycopy(iArr, 0, iArr3, length, i);
                        this.d = iArr3;
                    }
                }
            } else if (iA == 18) {
                int iJ = o34Var.j(o34Var.v());
                int iF = o34Var.f();
                int i3 = 0;
                while (o34Var.d() > 0) {
                    int iP2 = o34Var.p();
                    if (iP2 == 1 || iP2 == 2 || iP2 == 3 || iP2 == 4 || iP2 == 5) {
                        i3++;
                    }
                }
                if (i3 != 0) {
                    o34Var.E(iF);
                    int[] iArr4 = this.d;
                    int length2 = iArr4 == null ? 0 : iArr4.length;
                    int[] iArr5 = new int[i3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(iArr4, 0, iArr5, 0, length2);
                    }
                    while (o34Var.d() > 0) {
                        int iP3 = o34Var.p();
                        if (iP3 == 1 || iP3 == 2 || iP3 == 3 || iP3 == 4 || iP3 == 5) {
                            iArr5[length2] = iP3;
                            length2++;
                        }
                    }
                    this.d = iArr5;
                }
                o34Var.i(iJ);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
