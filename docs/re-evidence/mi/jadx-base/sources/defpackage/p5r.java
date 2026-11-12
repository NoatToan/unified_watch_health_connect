package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class p5r extends ak8<p5r> {
    public String c;
    public boolean d;
    public String e;
    public byte[] f;
    public String g;
    public int h;
    public String[] i;
    public int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String[] f30040k;
    public boolean l;
    public w5r.b m;
    public int[] n;
    public a6r[] o;
    public String p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z5r f30041r;

    public p5r() {
        m();
    }

    @Override // defpackage.ak8, defpackage.dsf
    public int b() {
        int[] iArr;
        int[] iArr2;
        int iB = super.b() + CodedOutputByteBufferNano.v(1, this.c) + CodedOutputByteBufferNano.b(2, this.d);
        if (!this.e.equals("")) {
            iB += CodedOutputByteBufferNano.v(3, this.e);
        }
        if (!this.g.equals("")) {
            iB += CodedOutputByteBufferNano.v(4, this.g);
        }
        int i = this.h;
        if (i != 0) {
            iB += CodedOutputByteBufferNano.y(5, i);
        }
        if (!this.p.equals("")) {
            iB += CodedOutputByteBufferNano.v(6, this.p);
        }
        int[] iArr3 = this.n;
        int i2 = 0;
        if (iArr3 != null && iArr3.length > 0) {
            int i3 = 0;
            int iM = 0;
            while (true) {
                iArr2 = this.n;
                if (i3 >= iArr2.length) {
                    break;
                }
                iM += CodedOutputByteBufferNano.m(iArr2[i3]);
                i3++;
            }
            iB = iB + iM + iArr2.length;
        }
        String[] strArr = this.i;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            int iW = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.i;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    i5++;
                    iW += CodedOutputByteBufferNano.w(str);
                }
                i4++;
            }
            iB = iB + iW + i5;
        }
        int[] iArr4 = this.j;
        if (iArr4 != null && iArr4.length > 0) {
            int i6 = 0;
            int iZ = 0;
            while (true) {
                iArr = this.j;
                if (i6 >= iArr.length) {
                    break;
                }
                iZ += CodedOutputByteBufferNano.z(iArr[i6]);
                i6++;
            }
            iB = iB + iZ + iArr.length;
        }
        String[] strArr3 = this.f30040k;
        if (strArr3 != null && strArr3.length > 0) {
            int i7 = 0;
            int iW2 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr4 = this.f30040k;
                if (i7 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i7];
                if (str2 != null) {
                    i8++;
                    iW2 += CodedOutputByteBufferNano.w(str2);
                }
                i7++;
            }
            iB = iB + iW2 + i8;
        }
        boolean z = this.l;
        if (z) {
            iB += CodedOutputByteBufferNano.b(11, z);
        }
        a6r[] a6rVarArr = this.o;
        if (a6rVarArr != null && a6rVarArr.length > 0) {
            while (true) {
                a6r[] a6rVarArr2 = this.o;
                if (i2 >= a6rVarArr2.length) {
                    break;
                }
                a6r a6rVar = a6rVarArr2[i2];
                if (a6rVar != null) {
                    iB += CodedOutputByteBufferNano.n(12, a6rVar);
                }
                i2++;
            }
        }
        if (!Arrays.equals(this.f, bmr.h)) {
            iB += CodedOutputByteBufferNano.d(13, this.f);
        }
        int i9 = this.q;
        if (i9 != 0) {
            iB += CodedOutputByteBufferNano.y(14, i9);
        }
        w5r.b bVar = this.m;
        if (bVar != null) {
            iB += CodedOutputByteBufferNano.n(15, bVar);
        }
        z5r z5rVar = this.f30041r;
        return z5rVar != null ? iB + CodedOutputByteBufferNano.n(16, z5rVar) : iB;
    }

    @Override // defpackage.ak8, defpackage.dsf
    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.m0(1, this.c);
        codedOutputByteBufferNano.M(2, this.d);
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.m0(3, this.e);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.m0(4, this.g);
        }
        int i = this.h;
        if (i != 0) {
            codedOutputByteBufferNano.p0(5, i);
        }
        if (!this.p.equals("")) {
            codedOutputByteBufferNano.m0(6, this.p);
        }
        int[] iArr = this.n;
        int i2 = 0;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.n;
                if (i3 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.W(7, iArr2[i3]);
                i3++;
            }
        }
        String[] strArr = this.i;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.i;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    codedOutputByteBufferNano.m0(8, str);
                }
                i4++;
            }
        }
        int[] iArr3 = this.j;
        if (iArr3 != null && iArr3.length > 0) {
            int i5 = 0;
            while (true) {
                int[] iArr4 = this.j;
                if (i5 >= iArr4.length) {
                    break;
                }
                codedOutputByteBufferNano.p0(9, iArr4[i5]);
                i5++;
            }
        }
        String[] strArr3 = this.f30040k;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.f30040k;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i6];
                if (str2 != null) {
                    codedOutputByteBufferNano.m0(10, str2);
                }
                i6++;
            }
        }
        boolean z = this.l;
        if (z) {
            codedOutputByteBufferNano.M(11, z);
        }
        a6r[] a6rVarArr = this.o;
        if (a6rVarArr != null && a6rVarArr.length > 0) {
            while (true) {
                a6r[] a6rVarArr2 = this.o;
                if (i2 >= a6rVarArr2.length) {
                    break;
                }
                a6r a6rVar = a6rVarArr2[i2];
                if (a6rVar != null) {
                    codedOutputByteBufferNano.Y(12, a6rVar);
                }
                i2++;
            }
        }
        if (!Arrays.equals(this.f, bmr.h)) {
            codedOutputByteBufferNano.O(13, this.f);
        }
        int i7 = this.q;
        if (i7 != 0) {
            codedOutputByteBufferNano.p0(14, i7);
        }
        w5r.b bVar = this.m;
        if (bVar != null) {
            codedOutputByteBufferNano.Y(15, bVar);
        }
        z5r z5rVar = this.f30041r;
        if (z5rVar != null) {
            codedOutputByteBufferNano.Y(16, z5rVar);
        }
        super.j(codedOutputByteBufferNano);
    }

    public p5r m() {
        this.c = "";
        this.d = false;
        this.e = "";
        this.f = bmr.h;
        this.g = "";
        this.h = 0;
        String[] strArr = bmr.f;
        this.i = strArr;
        int[] iArr = bmr.f4377a;
        this.j = iArr;
        this.f30040k = strArr;
        this.l = false;
        this.m = null;
        this.n = iArr;
        this.o = a6r.n();
        this.p = "";
        this.q = 0;
        this.f30041r = null;
        this.f1122b = null;
        this.f15887a = -1;
        return this;
    }

    @Override // defpackage.dsf
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public p5r e(o34 o34Var) throws IOException {
        while (true) {
            int iA = o34Var.A();
            switch (iA) {
                case 0:
                    return this;
                case 10:
                    this.c = o34Var.z();
                    break;
                case 16:
                    this.d = o34Var.k();
                    break;
                case 26:
                    this.e = o34Var.z();
                    break;
                case 34:
                    this.g = o34Var.z();
                    break;
                case 40:
                    this.h = o34Var.B();
                    break;
                case 50:
                    this.p = o34Var.z();
                    break;
                case 56:
                    int iA2 = bmr.a(o34Var, 56);
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
                        int[] iArr2 = this.n;
                        int length = iArr2 == null ? 0 : iArr2.length;
                        if (length == 0 && i == iA2) {
                            this.n = iArr;
                        } else {
                            int[] iArr3 = new int[length + i];
                            if (length != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr3, length, i);
                            this.n = iArr3;
                        }
                    }
                    break;
                case 58:
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
                        int[] iArr4 = this.n;
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
                        this.n = iArr5;
                    }
                    o34Var.i(iJ);
                    break;
                case 66:
                    int iA3 = bmr.a(o34Var, 66);
                    String[] strArr = this.i;
                    int length3 = strArr == null ? 0 : strArr.length;
                    int i4 = iA3 + length3;
                    String[] strArr2 = new String[i4];
                    if (length3 != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        strArr2[length3] = o34Var.z();
                        o34Var.A();
                        length3++;
                    }
                    strArr2[length3] = o34Var.z();
                    this.i = strArr2;
                    break;
                case 72:
                    int iA4 = bmr.a(o34Var, 72);
                    int[] iArr6 = this.j;
                    int length4 = iArr6 == null ? 0 : iArr6.length;
                    int i5 = iA4 + length4;
                    int[] iArr7 = new int[i5];
                    if (length4 != 0) {
                        System.arraycopy(iArr6, 0, iArr7, 0, length4);
                    }
                    while (length4 < i5 - 1) {
                        iArr7[length4] = o34Var.B();
                        o34Var.A();
                        length4++;
                    }
                    iArr7[length4] = o34Var.B();
                    this.j = iArr7;
                    break;
                case 74:
                    int iJ2 = o34Var.j(o34Var.v());
                    int iF2 = o34Var.f();
                    int i6 = 0;
                    while (o34Var.d() > 0) {
                        o34Var.B();
                        i6++;
                    }
                    o34Var.E(iF2);
                    int[] iArr8 = this.j;
                    int length5 = iArr8 == null ? 0 : iArr8.length;
                    int i7 = i6 + length5;
                    int[] iArr9 = new int[i7];
                    if (length5 != 0) {
                        System.arraycopy(iArr8, 0, iArr9, 0, length5);
                    }
                    while (length5 < i7) {
                        iArr9[length5] = o34Var.B();
                        length5++;
                    }
                    this.j = iArr9;
                    o34Var.i(iJ2);
                    break;
                case 82:
                    int iA5 = bmr.a(o34Var, 82);
                    String[] strArr3 = this.f30040k;
                    int length6 = strArr3 == null ? 0 : strArr3.length;
                    int i8 = iA5 + length6;
                    String[] strArr4 = new String[i8];
                    if (length6 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length6);
                    }
                    while (length6 < i8 - 1) {
                        strArr4[length6] = o34Var.z();
                        o34Var.A();
                        length6++;
                    }
                    strArr4[length6] = o34Var.z();
                    this.f30040k = strArr4;
                    break;
                case 88:
                    this.l = o34Var.k();
                    break;
                case 98:
                    int iA6 = bmr.a(o34Var, 98);
                    a6r[] a6rVarArr = this.o;
                    int length7 = a6rVarArr == null ? 0 : a6rVarArr.length;
                    int i9 = iA6 + length7;
                    a6r[] a6rVarArr2 = new a6r[i9];
                    if (length7 != 0) {
                        System.arraycopy(a6rVarArr, 0, a6rVarArr2, 0, length7);
                    }
                    while (length7 < i9 - 1) {
                        a6r a6rVar = new a6r();
                        a6rVarArr2[length7] = a6rVar;
                        o34Var.q(a6rVar);
                        o34Var.A();
                        length7++;
                    }
                    a6r a6rVar2 = new a6r();
                    a6rVarArr2[length7] = a6rVar2;
                    o34Var.q(a6rVar2);
                    this.o = a6rVarArr2;
                    break;
                case 106:
                    this.f = o34Var.l();
                    break;
                case 112:
                    this.q = o34Var.B();
                    break;
                case 122:
                    if (this.m == null) {
                        this.m = new w5r.b();
                    }
                    o34Var.q(this.m);
                    break;
                case 130:
                    if (this.f30041r == null) {
                        this.f30041r = new z5r();
                    }
                    o34Var.q(this.f30041r);
                    break;
                default:
                    if (!l(o34Var, iA)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }
}
