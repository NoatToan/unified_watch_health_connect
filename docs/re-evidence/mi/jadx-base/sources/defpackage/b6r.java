package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class b6r extends ak8<b6r> {
    public int[] c;

    public b6r() {
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
        int iM = 0;
        while (true) {
            int[] iArr2 = this.c;
            if (i >= iArr2.length) {
                return iB + iM + iArr2.length;
            }
            iM += CodedOutputByteBufferNano.m(iArr2[i]);
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
                codedOutputByteBufferNano.W(1, iArr2[i]);
                i++;
            }
        }
        super.j(codedOutputByteBufferNano);
    }

    public b6r m() {
        this.c = bmr.f4377a;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public b6r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            if (iA == 0) {
                return this;
            }
            if (iA == 8) {
                int iA2 = bmr.a(o34Var, 8);
                int[] iArr = new int[iA2];
                int i = 0;
                for (int i2 = 0; i2 < iA2; i2++) {
                    if (i2 != 0) {
                        o34Var.A();
                    }
                    int iP = o34Var.p();
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
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                            iArr[i] = iP;
                            i++;
                            break;
                    }
                }
                if (i != 0) {
                    int[] iArr2 = this.c;
                    int length = iArr2 == null ? 0 : iArr2.length;
                    if (length == 0 && i == iA2) {
                        this.c = iArr;
                    } else {
                        int[] iArr3 = new int[length + i];
                        if (length != 0) {
                            System.arraycopy(iArr2, 0, iArr3, 0, length);
                        }
                        System.arraycopy(iArr, 0, iArr3, length, i);
                        this.c = iArr3;
                    }
                }
            } else if (iA == 10) {
                int iJ = o34Var.j(o34Var.v());
                int iF = o34Var.f();
                int i3 = 0;
                while (o34Var.d() > 0) {
                    switch (o34Var.p()) {
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
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                            i3++;
                            break;
                    }
                }
                if (i3 != 0) {
                    o34Var.E(iF);
                    int[] iArr4 = this.c;
                    int length2 = iArr4 == null ? 0 : iArr4.length;
                    int[] iArr5 = new int[i3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(iArr4, 0, iArr5, 0, length2);
                    }
                    while (o34Var.d() > 0) {
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
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                                iArr5[length2] = iP2;
                                length2++;
                                break;
                        }
                    }
                    this.c = iArr5;
                }
                o34Var.i(iJ);
            } else if (!l(o34Var, iA)) {
                return this;
            }
        }
    }
}
