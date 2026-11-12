package defpackage;

import androidx.work.WorkInfo;
import com.xiaomi.passport.ui.internal.MenuBuilder;

/* JADX INFO: loaded from: classes6.dex */
public class a04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public final byte[] f462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f463b;
    public final byte[] c;
    public final int[] d;
    public final String[] e;
    public final mf4[] f;
    public final int[] g;
    public final int h;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[PHI: r8
      0x0063: PHI (r8v3 int) = (r8v0 int), (r8v1 int), (r8v4 int) binds: [B:12:0x0052, B:22:0x006f, B:18:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    public a04(byte[] bArr, int i, boolean z) {
        this.c = bArr;
        this.f462a = bArr;
        if (z) {
            int i2 = i + 6;
            if (C(i2) > 61) {
                throw new IllegalArgumentException("Unsupported class file major version " + ((int) C(i2)));
            }
        }
        int I = I(i + 8);
        this.d = new int[I];
        this.e = new String[I];
        int i3 = i + 10;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = 1;
        while (i5 < I) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            this.d[i5] = i7;
            int I2 = 3;
            switch (bArr[i3]) {
                case 1:
                    I2 = 3 + I(i7);
                    if (I2 > i4) {
                        i5 = i6;
                        i4 = I2;
                    } else {
                        i5 = i6;
                    }
                    i3 += I2;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i5 = i6;
                    I2 = 5;
                    i3 += I2;
                    break;
                case 5:
                case 6:
                    i5 += 2;
                    I2 = 9;
                    i3 += I2;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i5 = i6;
                    i3 += I2;
                    break;
                case 15:
                    I2 = 4;
                    i5 = i6;
                    i3 += I2;
                    break;
                case 17:
                    z2 = true;
                    z3 = true;
                    i5 = i6;
                    I2 = 5;
                    i3 += I2;
                    break;
                case 18:
                    z3 = true;
                    i5 = i6;
                    I2 = 5;
                    i3 += I2;
                    break;
            }
        }
        this.h = i4;
        this.f463b = i3;
        this.f = z2 ? new mf4[I] : null;
        this.g = z3 ? k(i4) : null;
    }

    public final void A(cuf cufVar, li4 li4Var, int i, boolean z) {
        int iR = i + 1;
        int i2 = this.c[i] & 255;
        cufVar.a(i2, z);
        char[] cArr = li4Var.c;
        for (int i3 = 0; i3 < i2; i3++) {
            int I = I(iR);
            iR += 2;
            while (true) {
                int i4 = I - 1;
                if (I > 0) {
                    iR = r(cufVar.y(i3, H(iR, cArr), z), iR + 2, true, cArr);
                    I = i4;
                }
            }
        }
    }

    public final int B(m04 m04Var, li4 li4Var, int i) {
        int i2;
        li4 li4Var2 = li4Var;
        char[] cArr = li4Var2.c;
        String strH = H(i, cArr);
        String strH2 = H(i + 2, cArr);
        int I = I(i + 4);
        int i3 = i + 6;
        int i4 = 0;
        em1 em1VarJ = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        String strH3 = null;
        while (true) {
            int i8 = I - 1;
            if (I <= 0) {
                break;
            }
            String strH4 = H(i3, cArr);
            int iT = t(i3 + 2);
            int i9 = i3 + 6;
            if ("Signature".equals(strH4)) {
                strH3 = H(i9, cArr);
                i2 = i9;
            } else if ("RuntimeVisibleAnnotations".equals(strH4)) {
                i7 = i9;
                i2 = i7;
            } else if ("RuntimeVisibleTypeAnnotations".equals(strH4)) {
                i5 = i9;
                i2 = i5;
            } else if ("RuntimeInvisibleAnnotations".equals(strH4)) {
                i6 = i9;
                i2 = i6;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(strH4)) {
                i4 = i9;
                i2 = i4;
            } else {
                i2 = i9;
                em1 em1Var = em1VarJ;
                em1VarJ = j(li4Var2.f25090a, strH4, i2, iT, cArr, -1, null);
                em1VarJ.c = em1Var;
                i7 = i7;
                i6 = i6;
                i5 = i5;
                i4 = i4;
            }
            i3 = i2 + iT;
            li4Var2 = li4Var;
            I = i8;
        }
        int i10 = i4;
        em1 em1Var2 = em1VarJ;
        int i11 = i5;
        int i12 = i6;
        int i13 = i7;
        sjj sjjVarM = m04Var.m(strH, strH2, strH3);
        if (sjjVarM == null) {
            return i3;
        }
        if (i13 != 0) {
            int I2 = I(i13);
            int iR = i13 + 2;
            while (true) {
                int i14 = I2 - 1;
                if (I2 <= 0) {
                    break;
                }
                iR = r(sjjVarM.a(H(iR, cArr), true), iR + 2, true, cArr);
                I2 = i14;
            }
        }
        if (i12 != 0) {
            int I3 = I(i12);
            int iR2 = i12 + 2;
            while (true) {
                int i15 = I3 - 1;
                if (I3 <= 0) {
                    break;
                }
                iR2 = r(sjjVarM.a(H(iR2, cArr), false), iR2 + 2, true, cArr);
                I3 = i15;
            }
        }
        if (i11 != 0) {
            int I4 = I(i11);
            int iR3 = i11 + 2;
            while (true) {
                int i16 = I4 - 1;
                if (I4 <= 0) {
                    break;
                }
                int iF = F(li4Var, iR3);
                iR3 = r(sjjVarM.d(li4Var.h, li4Var.i, H(iF, cArr), true), iF + 2, true, cArr);
                I4 = i16;
            }
        }
        if (i10 != 0) {
            int I5 = I(i10);
            int iR4 = i10 + 2;
            while (true) {
                int i17 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                int iF2 = F(li4Var, iR4);
                iR4 = r(sjjVarM.d(li4Var.h, li4Var.i, H(iF2, cArr), false), iF2 + 2, true, cArr);
                I5 = i17;
            }
        }
        em1 em1Var3 = em1Var2;
        while (em1Var3 != null) {
            em1 em1Var4 = em1Var3.c;
            em1Var3.c = null;
            sjjVarM.b(em1Var3);
            em1Var3 = em1Var4;
        }
        sjjVarM.c();
        return i3;
    }

    public short C(int i) {
        byte[] bArr = this.c;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public final int D(int i, boolean z, boolean z2, li4 li4Var) {
        int iL;
        int i2;
        char[] cArr = li4Var.c;
        h2e[] h2eVarArr = li4Var.g;
        if (z) {
            iL = i + 1;
            i2 = this.c[i] & 255;
        } else {
            li4Var.m = -1;
            iL = i;
            i2 = 255;
        }
        li4Var.p = 0;
        if (i2 < 64) {
            li4Var.n = 3;
            li4Var.f25093r = 0;
        } else if (i2 < 128) {
            i2 -= 64;
            iL = L(iL, li4Var.s, 0, cArr, h2eVarArr);
            li4Var.n = 4;
            li4Var.f25093r = 1;
        } else {
            if (i2 < 247) {
                throw new IllegalArgumentException();
            }
            int I = I(iL);
            int i3 = iL + 2;
            if (i2 == 247) {
                iL = L(i3, li4Var.s, 0, cArr, h2eVarArr);
                li4Var.n = 4;
                li4Var.f25093r = 1;
            } else {
                if (i2 >= 248 && i2 < 251) {
                    li4Var.n = 2;
                    int i4 = 251 - i2;
                    li4Var.p = i4;
                    li4Var.o -= i4;
                    li4Var.f25093r = 0;
                } else if (i2 == 251) {
                    li4Var.n = 3;
                    li4Var.f25093r = 0;
                } else if (i2 < 255) {
                    int i5 = i2 - 251;
                    int i6 = z2 ? li4Var.o : 0;
                    iL = i3;
                    int i7 = i5;
                    while (i7 > 0) {
                        iL = L(iL, li4Var.q, i6, cArr, h2eVarArr);
                        i7--;
                        i6++;
                    }
                    li4Var.n = 1;
                    li4Var.p = i5;
                    li4Var.o += i5;
                    li4Var.f25093r = 0;
                } else {
                    int I2 = I(i3);
                    int iL2 = iL + 4;
                    li4Var.n = 0;
                    li4Var.p = I2;
                    li4Var.o = I2;
                    for (int i8 = 0; i8 < I2; i8++) {
                        iL2 = L(iL2, li4Var.q, i8, cArr, h2eVarArr);
                    }
                    int I3 = I(iL2);
                    iL = iL2 + 2;
                    li4Var.f25093r = I3;
                    for (int i9 = 0; i9 < I3; i9++) {
                        iL = L(iL, li4Var.s, i9, cArr, h2eVarArr);
                    }
                }
                iL = i3;
            }
            i2 = I;
        }
        int i10 = li4Var.m + i2 + 1;
        li4Var.m = i10;
        d(i10, h2eVarArr);
        return iL;
    }

    public final String E(int i, char[] cArr) {
        return H(this.d[I(i)], cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    public final int F(li4 li4Var, int i) {
        int i2;
        int i3;
        int iT = t(i);
        int i4 = iT >>> 24;
        if (i4 != 0 && i4 != 1) {
            switch (i4) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = iT & WorkInfo.STOP_REASON_NOT_STOPPED;
                    i3 = i + 3;
                    break;
                case 19:
                case 20:
                case 21:
                    i2 = iT & (-16777216);
                    i3 = i + 1;
                    break;
                case 22:
                    i2 = iT & MenuBuilder.CATEGORY_MASK;
                    i3 = i + 2;
                    break;
                default:
                    switch (i4) {
                        case 64:
                        case 65:
                            i2 = iT & (-16777216);
                            int I = I(i + 1);
                            i3 = i + 3;
                            li4Var.j = new h2e[I];
                            li4Var.f25092k = new h2e[I];
                            li4Var.l = new int[I];
                            for (int i5 = 0; i5 < I; i5++) {
                                int I2 = I(i3);
                                int I3 = I(i3 + 2);
                                int I4 = I(i3 + 4);
                                i3 += 6;
                                li4Var.j[i5] = d(I2, li4Var.g);
                                li4Var.f25092k[i5] = d(I2 + I3, li4Var.g);
                                li4Var.l[i5] = I4;
                            }
                            break;
                        case 66:
                            i2 = iT & WorkInfo.STOP_REASON_NOT_STOPPED;
                            i3 = i + 3;
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = iT & (-16777216);
                            i3 = i + 3;
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = iT & (-16776961);
                            i3 = i + 4;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
        } else {
            i2 = iT & MenuBuilder.CATEGORY_MASK;
            i3 = i + 2;
        }
        li4Var.h = i2;
        int iL = l(i3);
        li4Var.i = iL == 0 ? null : new x4q(this.c, i3);
        return i3 + 1 + (iL * 2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[FALL_THROUGH] */
    public final int[] G(cuf cufVar, li4 li4Var, int i, boolean z) {
        int i2;
        char[] cArr = li4Var.c;
        int I = I(i);
        int[] iArr = new int[I];
        int iR = i + 2;
        for (int i3 = 0; i3 < I; i3++) {
            iArr[i3] = iR;
            int iT = t(iR);
            int i4 = iT >>> 24;
            if (i4 != 23) {
                switch (i4) {
                    default:
                        switch (i4) {
                            case 64:
                            case 65:
                                int I2 = I(iR + 1);
                                i2 = iR + 3;
                                while (true) {
                                    int i5 = I2 - 1;
                                    if (I2 > 0) {
                                        int I3 = I(i2);
                                        int I4 = I(i2 + 2);
                                        i2 += 6;
                                        d(I3, li4Var.g);
                                        d(I3 + I4, li4Var.g);
                                        I2 = i5;
                                    }
                                    break;
                                }
                                break;
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i2 = iR + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = iR + 3;
                        break;
                }
            } else {
                i2 = iR + 3;
            }
            int iL = l(i2);
            if (i4 == 66) {
                x4q x4qVar = iL != 0 ? new x4q(this.c, i2) : null;
                int i6 = i2 + (iL * 2) + 1;
                iR = r(cufVar.A(iT & WorkInfo.STOP_REASON_NOT_STOPPED, x4qVar, H(i6, cArr), z), i6 + 2, true, cArr);
            } else {
                iR = r(null, i2 + (iL * 2) + 3, true, cArr);
            }
        }
        return iArr;
    }

    public String H(int i, char[] cArr) {
        int I = I(i);
        if (i == 0 || I == 0) {
            return null;
        }
        return K(I, cArr);
    }

    public int I(int i) {
        byte[] bArr = this.c;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public final String J(int i, int i2, char[] cArr) {
        int i3;
        int i4 = i2 + i;
        byte[] bArr = this.c;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if ((b2 & 128) == 0) {
                cArr[i5] = (char) (b2 & 127);
                i5++;
                i = i6;
            } else {
                if ((b2 & 224) == 192) {
                    i3 = i5 + 1;
                    i += 2;
                    cArr[i5] = (char) (((b2 & 31) << 6) + (bArr[i6] & 63));
                } else {
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    cArr[i5] = (char) (((b2 & 15) << 12) + ((bArr[i6] & 63) << 6) + (bArr[i7] & 63));
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }

    public final String K(int i, char[] cArr) {
        String[] strArr = this.e;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.d[i];
        String strJ = J(i2 + 2, I(i2), cArr);
        strArr[i] = strJ;
        return strJ;
    }

    public final int L(int i, Object[] objArr, int i2, char[] cArr, h2e[] h2eVarArr) {
        int i3 = i + 1;
        switch (this.c[i] & 255) {
            case 0:
                objArr[i2] = wah.f37769a;
                return i3;
            case 1:
                objArr[i2] = wah.f37770b;
                return i3;
            case 2:
                objArr[i2] = wah.c;
                return i3;
            case 3:
                objArr[i2] = wah.d;
                return i3;
            case 4:
                objArr[i2] = wah.e;
                return i3;
            case 5:
                objArr[i2] = wah.f;
                return i3;
            case 6:
                objArr[i2] = wah.g;
                return i3;
            case 7:
                objArr[i2] = m(i3, cArr);
                break;
            case 8:
                objArr[i2] = d(I(i3), h2eVarArr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i + 3;
    }

    public void a(m04 m04Var, em1[] em1VarArr, int i) {
        int i2;
        li4 li4Var = new li4();
        li4Var.f25090a = em1VarArr;
        li4Var.f25091b = i;
        char[] cArr = new char[this.h];
        li4Var.c = cArr;
        int i3 = this.f463b;
        int I = I(i3);
        String strM = m(i3 + 2, cArr);
        String strM2 = m(i3 + 4, cArr);
        int I2 = I(i3 + 6);
        String[] strArr = new String[I2];
        int i4 = i3 + 8;
        for (int i5 = 0; i5 < I2; i5++) {
            strArr[i5] = m(i4, cArr);
            i4 += 2;
        }
        int iE = e();
        int i6 = I;
        int I3 = I(iE - 2);
        String strJ = null;
        String strH = null;
        int i7 = 0;
        String strH2 = null;
        int i8 = 0;
        String strM3 = null;
        String strM4 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        em1 em1Var = null;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (I3 > 0) {
            String strH3 = H(iE, cArr);
            int iT = t(iE + 2);
            int i18 = iE + 6;
            String str = strJ;
            if ("SourceFile".equals(strH3)) {
                i2 = i18;
                strH = H(i18, cArr);
            } else if ("InnerClasses".equals(strH3)) {
                i16 = i18;
                i2 = i16;
            } else if ("EnclosingMethod".equals(strH3)) {
                i9 = i18;
                i2 = i9;
            } else if ("NestHost".equals(strH3)) {
                i2 = i18;
                strM4 = m(i18, cArr);
            } else if ("NestMembers".equals(strH3)) {
                i14 = i18;
                i2 = i14;
            } else if ("PermittedSubclasses".equals(strH3)) {
                i15 = i18;
                i2 = i15;
            } else {
                if ("Signature".equals(strH3)) {
                    strH2 = H(i18, cArr);
                } else if ("RuntimeVisibleAnnotations".equals(strH3)) {
                    i10 = i18;
                    i2 = i10;
                } else if ("RuntimeVisibleTypeAnnotations".equals(strH3)) {
                    i12 = i18;
                    i2 = i12;
                } else if ("Deprecated".equals(strH3)) {
                    i6 |= 131072;
                } else if ("Synthetic".equals(strH3)) {
                    i6 |= 4096;
                } else {
                    if ("SourceDebugExtension".equals(strH3)) {
                        if (iT > this.c.length - i18) {
                            throw new IllegalArgumentException();
                        }
                        strJ = J(i18, iT, new char[iT]);
                        i2 = i18;
                    } else if ("RuntimeInvisibleAnnotations".equals(strH3)) {
                        i11 = i18;
                        i2 = i11;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(strH3)) {
                        i13 = i18;
                        i2 = i13;
                    } else if ("Record".equals(strH3)) {
                        i6 |= 65536;
                        i17 = i18;
                        i2 = i17;
                    } else if ("Module".equals(strH3)) {
                        i7 = i18;
                        i2 = i7;
                    } else if ("ModuleMainClass".equals(strH3)) {
                        strM3 = m(i18, cArr);
                    } else if ("ModulePackages".equals(strH3)) {
                        i8 = i18;
                        i2 = i8;
                    } else if ("BootstrapMethods".equals(strH3)) {
                        i2 = i18;
                        i4 = i4;
                        iT = iT;
                        strArr = strArr;
                        strJ = str;
                    } else {
                        i2 = i18;
                        i4 = i4;
                        iT = iT;
                        strArr = strArr;
                        em1 em1VarJ = j(em1VarArr, strH3, i2, iT, cArr, -1, null);
                        em1VarJ.c = em1Var;
                        em1Var = em1VarJ;
                        i6 = i6;
                        strJ = str;
                        strH = strH;
                    }
                    iE = i2 + iT;
                    I3--;
                    strArr = strArr;
                    i4 = i4;
                }
                i2 = i18;
            }
            strJ = str;
            iE = i2 + iT;
            I3--;
            strArr = strArr;
            i4 = i4;
        }
        String str2 = strJ;
        String str3 = strH;
        int i19 = i4;
        String[] strArr2 = strArr;
        em1 em1Var2 = em1Var;
        m04Var.a(t(this.d[1] - 7), i6, strM, strH2, strM2, strArr2);
        if ((i & 2) == 0 && (str3 != null || str2 != null)) {
            m04Var.n(str3, str2);
        }
        if (i7 != 0) {
            y(m04Var, li4Var, i7, i8, strM3);
        }
        String str4 = strM4;
        if (str4 != null) {
            m04Var.i(str4);
        }
        int i20 = i9;
        if (i20 != 0) {
            String strM5 = m(i20, cArr);
            int I4 = I(i20 + 2);
            m04Var.k(strM5, I4 == 0 ? null : H(this.d[I4], cArr), I4 == 0 ? null : H(this.d[I4] + 2, cArr));
        }
        int i21 = i10;
        if (i21 != 0) {
            int I5 = I(i21);
            int iR = i21 + 2;
            while (true) {
                int i22 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                iR = r(m04Var.b(H(iR, cArr), true), iR + 2, true, cArr);
                I5 = i22;
            }
        }
        int i23 = i11;
        if (i23 != 0) {
            int I6 = I(i23);
            int iR2 = i23 + 2;
            while (true) {
                int i24 = I6 - 1;
                if (I6 <= 0) {
                    break;
                }
                iR2 = r(m04Var.b(H(iR2, cArr), false), iR2 + 2, true, cArr);
                I6 = i24;
            }
        }
        int i25 = i12;
        if (i25 != 0) {
            int I7 = I(i25);
            int iR3 = i25 + 2;
            while (true) {
                int i26 = I7 - 1;
                if (I7 <= 0) {
                    break;
                }
                int iF = F(li4Var, iR3);
                iR3 = r(m04Var.o(li4Var.h, li4Var.i, H(iF, cArr), true), iF + 2, true, cArr);
                I7 = i26;
            }
        }
        int i27 = i13;
        if (i27 != 0) {
            int I8 = I(i27);
            int iR4 = i27 + 2;
            while (true) {
                int i28 = I8 - 1;
                if (I8 <= 0) {
                    break;
                }
                int iF2 = F(li4Var, iR4);
                iR4 = r(m04Var.o(li4Var.h, li4Var.i, H(iF2, cArr), false), iF2 + 2, true, cArr);
                I8 = i28;
            }
        }
        while (em1Var2 != null) {
            em1 em1Var3 = em1Var2.c;
            em1Var2.c = null;
            m04Var.c(em1Var2);
            em1Var2 = em1Var3;
        }
        int i29 = i14;
        if (i29 != 0) {
            int I9 = I(i29);
            int i30 = i29 + 2;
            while (true) {
                int i31 = I9 - 1;
                if (I9 <= 0) {
                    break;
                }
                m04Var.j(m(i30, cArr));
                i30 += 2;
                I9 = i31;
            }
        }
        int i32 = i15;
        if (i32 != 0) {
            int I10 = I(i32);
            int i33 = i32 + 2;
            while (true) {
                int i34 = I10 - 1;
                if (I10 <= 0) {
                    break;
                }
                m04Var.l(m(i33, cArr));
                i33 += 2;
                I10 = i34;
            }
        }
        int i35 = i16;
        if (i35 != 0) {
            int I11 = I(i35);
            int i36 = i35 + 2;
            while (true) {
                int i37 = I11 - 1;
                if (I11 <= 0) {
                    break;
                }
                m04Var.f(m(i36, cArr), m(i36 + 2, cArr), H(i36 + 4, cArr), I(i36 + 6));
                i36 += 8;
                I11 = i37;
            }
        }
        int i38 = i17;
        if (i38 != 0) {
            int I12 = I(i38);
            int iB = i38 + 2;
            while (true) {
                int i39 = I12 - 1;
                if (I12 <= 0) {
                    break;
                }
                iB = B(m04Var, li4Var, iB);
                I12 = i39;
            }
        }
        int I13 = I(i19);
        int iS = i19 + 2;
        while (true) {
            int i40 = I13 - 1;
            if (I13 <= 0) {
                break;
            }
            iS = s(m04Var, li4Var, iS);
            I13 = i40;
        }
        int I14 = I(iS);
        int iW = iS + 2;
        while (true) {
            int i41 = I14 - 1;
            if (I14 <= 0) {
                m04Var.d();
                return;
            } else {
                iW = w(m04Var, li4Var, iW);
                I14 = i41;
            }
        }
    }

    public final void b(li4 li4Var) {
        int i;
        String str = li4Var.f;
        Object[] objArr = li4Var.q;
        int i2 = 0;
        if ((li4Var.d & 8) == 0) {
            if ("<init>".equals(li4Var.e)) {
                objArr[0] = wah.g;
            } else {
                objArr[0] = m(this.f463b + 2, li4Var.c);
            }
            i2 = 1;
        }
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (cCharAt == 'F') {
                i = i2 + 1;
                objArr[i2] = wah.c;
            } else if (cCharAt != 'L') {
                if (cCharAt != 'S' && cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        i = i2 + 1;
                        objArr[i2] = wah.e;
                    } else if (cCharAt != 'Z') {
                        if (cCharAt != '[') {
                            switch (cCharAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    i = i2 + 1;
                                    objArr[i2] = wah.d;
                                    break;
                                default:
                                    li4Var.o = i2;
                                    return;
                            }
                        } else {
                            while (str.charAt(i4) == '[') {
                                i4++;
                            }
                            if (str.charAt(i4) == 'L') {
                                do {
                                    i4++;
                                } while (str.charAt(i4) != ';');
                            }
                            int i5 = i4 + 1;
                            objArr[i2] = str.substring(i3, i5);
                            i3 = i5;
                            i2++;
                        }
                    }
                }
                i = i2 + 1;
                objArr[i2] = wah.f37770b;
            } else {
                int i6 = i4;
                while (str.charAt(i6) != ';') {
                    i6++;
                }
                objArr[i2] = str.substring(i4, i6);
                i2++;
                i3 = i6 + 1;
            }
            i2 = i;
            i3 = i4;
        }
    }

    public final void c(int i, h2e[] h2eVarArr) {
        if (h2eVarArr[i] == null) {
            h2e h2eVarU = u(i, h2eVarArr);
            h2eVarU.f19609a = (short) (h2eVarU.f19609a | 1);
        }
    }

    public final h2e d(int i, h2e[] h2eVarArr) {
        h2e h2eVarU = u(i, h2eVarArr);
        h2eVarU.f19609a = (short) (h2eVarU.f19609a & (-2));
        return h2eVarU;
    }

    public final int e() {
        int i = this.f463b;
        int I = i + 8 + (I(i + 6) * 2);
        int I2 = I(I);
        int iT = I + 2;
        while (true) {
            int i2 = I2 - 1;
            if (I2 <= 0) {
                break;
            }
            int I3 = I(iT + 6);
            iT += 8;
            while (true) {
                int i3 = I3 - 1;
                if (I3 > 0) {
                    iT += t(iT + 2) + 6;
                    I3 = i3;
                }
            }
            I2 = i2;
        }
        int I4 = I(iT);
        int iT2 = iT + 2;
        while (true) {
            int i4 = I4 - 1;
            if (I4 <= 0) {
                return iT2 + 2;
            }
            int I5 = I(iT2 + 6);
            iT2 += 8;
            while (true) {
                int i5 = I5 - 1;
                if (I5 > 0) {
                    iT2 += t(iT2 + 2) + 6;
                    I5 = i5;
                }
            }
            I4 = i4;
        }
    }

    public int f(int i) {
        return this.d[i];
    }

    public int g() {
        return this.d.length;
    }

    public int h() {
        return this.h;
    }

    public final int i(int[] iArr, int i) {
        if (iArr == null || i >= iArr.length || l(iArr[i]) < 67) {
            return -1;
        }
        return I(iArr[i] + 1);
    }

    public final em1 j(em1[] em1VarArr, String str, int i, int i2, char[] cArr, int i3, h2e[] h2eVarArr) {
        for (em1 em1Var : em1VarArr) {
            if (em1Var.f16792a.equals(str)) {
                return em1Var.i(this, i, i2, cArr, i3, h2eVarArr);
            }
        }
        return new em1(str).i(this, i, i2, null, -1, null);
    }

    public final int[] k(int i) {
        char[] cArr = new char[i];
        int iE = e();
        for (int I = I(iE - 2); I > 0; I--) {
            String strH = H(iE, cArr);
            int iT = t(iE + 2);
            int i2 = iE + 6;
            if ("BootstrapMethods".equals(strH)) {
                int I2 = I(i2);
                int[] iArr = new int[I2];
                int I3 = iE + 8;
                for (int i3 = 0; i3 < I2; i3++) {
                    iArr[i3] = I3;
                    I3 += (I(I3 + 2) * 2) + 4;
                }
                return iArr;
            }
            iE = i2 + iT;
        }
        throw new IllegalArgumentException();
    }

    public int l(int i) {
        return this.c[i] & 255;
    }

    public String m(int i, char[] cArr) {
        return E(i, cArr);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x0510 -> B:232:0x081d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35161. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void n(defpackage.cuf r43, defpackage.li4 r44, int r45) {
        /*
            Method dump skipped, instruction units count: 3516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a04.n(cuf, li4, int):void");
    }

    public Object o(int i, char[] cArr) {
        int i2 = this.d[i];
        byte b2 = this.c[i2 - 1];
        switch (b2) {
            case 3:
                return Integer.valueOf(t(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(t(i2)));
            case 5:
                return Long.valueOf(v(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(v(i2)));
            case 7:
                return n4q.j(H(i2, cArr));
            case 8:
                return H(i2, cArr);
            default:
                switch (b2) {
                    case 15:
                        int iL = l(i2);
                        int i3 = this.d[I(i2 + 1)];
                        int i4 = this.d[I(i3 + 2)];
                        return new gkb(iL, m(i3, cArr), H(i4, cArr), H(i4 + 2, cArr), this.c[i3 - 1] == 11);
                    case 16:
                        return n4q.i(H(i2, cArr));
                    case 17:
                        return p(i, cArr);
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public final mf4 p(int i, char[] cArr) {
        mf4 mf4Var = this.f[i];
        if (mf4Var != null) {
            return mf4Var;
        }
        int[] iArr = this.d;
        int i2 = iArr[i];
        int i3 = iArr[I(i2 + 2)];
        String strH = H(i3, cArr);
        String strH2 = H(i3 + 2, cArr);
        int i4 = this.g[I(i2)];
        gkb gkbVar = (gkb) o(I(i4), cArr);
        int I = I(i4 + 2);
        Object[] objArr = new Object[I];
        int i5 = i4 + 4;
        for (int i6 = 0; i6 < I; i6++) {
            objArr[i6] = o(I(i5), cArr);
            i5 += 2;
        }
        mf4[] mf4VarArr = this.f;
        mf4 mf4Var2 = new mf4(strH, strH2, gkbVar, objArr);
        mf4VarArr[i] = mf4Var2;
        return mf4Var2;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x020c  */
    public final int q(jd1 jd1Var, int i, String str, char[] cArr) {
        int i2 = 0;
        if (jd1Var == null) {
            int i3 = this.c[i] & 255;
            if (i3 == 64) {
                return r(null, i + 3, true, cArr);
            }
            if (i3 != 91) {
                return i3 != 101 ? i + 3 : i + 5;
            }
            return r(null, i + 1, false, cArr);
        }
        int i4 = i + 1;
        int i5 = this.c[i] & 255;
        if (i5 == 64) {
            return r(jd1Var.b(str, H(i4, cArr)), i + 3, true, cArr);
        }
        if (i5 == 70) {
            jd1Var.a(str, o(I(i4), cArr));
        } else if (i5 == 83) {
            jd1Var.a(str, Short.valueOf((short) t(this.d[I(i4)])));
        } else if (i5 == 99) {
            jd1Var.a(str, n4q.n(H(i4, cArr)));
        } else {
            if (i5 == 101) {
                jd1Var.e(str, H(i4, cArr), H(i + 3, cArr));
                return i + 5;
            }
            if (i5 == 115) {
                jd1Var.a(str, H(i4, cArr));
            } else if (i5 == 73 || i5 == 74) {
                jd1Var.a(str, o(I(i4), cArr));
            } else if (i5 == 90) {
                jd1Var.a(str, t(this.d[I(i4)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
            } else {
                if (i5 == 91) {
                    int I = I(i4);
                    int i6 = i + 3;
                    if (I == 0) {
                        return r(jd1Var.c(str), i + 1, false, cArr);
                    }
                    int i7 = this.c[i6] & 255;
                    if (i7 == 70) {
                        float[] fArr = new float[I];
                        while (i2 < I) {
                            fArr[i2] = Float.intBitsToFloat(t(this.d[I(i6 + 1)]));
                            i6 += 3;
                            i2++;
                        }
                        jd1Var.a(str, fArr);
                    } else if (i7 == 83) {
                        short[] sArr = new short[I];
                        while (i2 < I) {
                            sArr[i2] = (short) t(this.d[I(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        jd1Var.a(str, sArr);
                    } else if (i7 == 90) {
                        boolean[] zArr = new boolean[I];
                        for (int i8 = 0; i8 < I; i8++) {
                            zArr[i8] = t(this.d[I(i6 + 1)]) != 0;
                            i6 += 3;
                        }
                        jd1Var.a(str, zArr);
                    } else if (i7 == 73) {
                        int[] iArr = new int[I];
                        while (i2 < I) {
                            iArr[i2] = t(this.d[I(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        jd1Var.a(str, iArr);
                    } else if (i7 != 74) {
                        switch (i7) {
                            case 66:
                                byte[] bArr = new byte[I];
                                while (i2 < I) {
                                    bArr[i2] = (byte) t(this.d[I(i6 + 1)]);
                                    i6 += 3;
                                    i2++;
                                }
                                jd1Var.a(str, bArr);
                                break;
                            case 67:
                                char[] cArr2 = new char[I];
                                while (i2 < I) {
                                    cArr2[i2] = (char) t(this.d[I(i6 + 1)]);
                                    i6 += 3;
                                    i2++;
                                }
                                jd1Var.a(str, cArr2);
                                break;
                            case 68:
                                double[] dArr = new double[I];
                                while (i2 < I) {
                                    dArr[i2] = Double.longBitsToDouble(v(this.d[I(i6 + 1)]));
                                    i6 += 3;
                                    i2++;
                                }
                                jd1Var.a(str, dArr);
                                break;
                            default:
                                return r(jd1Var.c(str), i + 1, false, cArr);
                        }
                    } else {
                        long[] jArr = new long[I];
                        while (i2 < I) {
                            jArr[i2] = v(this.d[I(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        jd1Var.a(str, jArr);
                    }
                    return i6;
                }
                switch (i5) {
                    case 66:
                        jd1Var.a(str, Byte.valueOf((byte) t(this.d[I(i4)])));
                        break;
                    case 67:
                        jd1Var.a(str, Character.valueOf((char) t(this.d[I(i4)])));
                        break;
                    case 68:
                        jd1Var.a(str, o(I(i4), cArr));
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        }
        return i + 3;
    }

    public final int r(jd1 jd1Var, int i, boolean z, char[] cArr) {
        int I = I(i);
        int iQ = i + 2;
        if (!z) {
            while (true) {
                int i2 = I - 1;
                if (I <= 0) {
                    break;
                }
                iQ = q(jd1Var, iQ, null, cArr);
                I = i2;
            }
        } else {
            while (true) {
                int i3 = I - 1;
                if (I <= 0) {
                    break;
                }
                iQ = q(jd1Var, iQ + 2, H(iQ, cArr), cArr);
                I = i3;
            }
        }
        if (jd1Var != null) {
            jd1Var.d();
        }
        return iQ;
    }

    public final int s(m04 m04Var, li4 li4Var, int i) {
        int i2;
        int i3;
        li4 li4Var2 = li4Var;
        char[] cArr = li4Var2.c;
        int I = I(i);
        String strH = H(i + 2, cArr);
        String strH2 = H(i + 4, cArr);
        int I2 = I(i + 6);
        int i4 = i + 8;
        int i5 = I;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        em1 em1VarJ = null;
        String strH3 = null;
        Object objO = null;
        while (true) {
            int i10 = I2 - 1;
            if (I2 <= 0) {
                break;
            }
            String strH4 = H(i4, cArr);
            int iT = t(i4 + 2);
            int i11 = i4 + 6;
            if ("ConstantValue".equals(strH4)) {
                int I3 = I(i11);
                objO = I3 == 0 ? null : o(I3, cArr);
            } else if ("Signature".equals(strH4)) {
                strH3 = H(i11, cArr);
            } else {
                if ("Deprecated".equals(strH4)) {
                    i3 = 131072 | i5;
                } else {
                    if ("Synthetic".equals(strH4)) {
                        i3 = i5 | 4096;
                    } else if ("RuntimeVisibleAnnotations".equals(strH4)) {
                        i9 = i11;
                        i2 = i9;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(strH4)) {
                        i7 = i11;
                        i2 = i7;
                    } else if ("RuntimeInvisibleAnnotations".equals(strH4)) {
                        i8 = i11;
                        i2 = i8;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(strH4)) {
                        i6 = i11;
                        i2 = i6;
                    } else {
                        i2 = i11;
                        em1 em1Var = em1VarJ;
                        em1VarJ = j(li4Var2.f25090a, strH4, i2, iT, cArr, -1, null);
                        em1VarJ.c = em1Var;
                        i8 = i8;
                        i9 = i9;
                        i6 = i6;
                        i7 = i7;
                    }
                    i4 = i2 + iT;
                    li4Var2 = li4Var;
                    I2 = i10;
                }
                i5 = i3;
            }
            i2 = i11;
            i4 = i2 + iT;
            li4Var2 = li4Var;
            I2 = i10;
        }
        em1 em1Var2 = em1VarJ;
        int i12 = i6;
        int i13 = i7;
        int i14 = i8;
        int i15 = i9;
        gl9 gl9VarE = m04Var.e(i5, strH, strH2, strH3, objO);
        if (gl9VarE == null) {
            return i4;
        }
        if (i15 != 0) {
            int I4 = I(i15);
            int iR = i15 + 2;
            while (true) {
                int i16 = I4 - 1;
                if (I4 <= 0) {
                    break;
                }
                iR = r(gl9VarE.a(H(iR, cArr), true), iR + 2, true, cArr);
                I4 = i16;
            }
        }
        if (i14 != 0) {
            int I5 = I(i14);
            int iR2 = i14 + 2;
            while (true) {
                int i17 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                iR2 = r(gl9VarE.a(H(iR2, cArr), false), iR2 + 2, true, cArr);
                I5 = i17;
            }
        }
        if (i13 != 0) {
            int I6 = I(i13);
            int iR3 = i13 + 2;
            while (true) {
                int i18 = I6 - 1;
                if (I6 <= 0) {
                    break;
                }
                int iF = F(li4Var, iR3);
                iR3 = r(gl9VarE.d(li4Var.h, li4Var.i, H(iF, cArr), true), iF + 2, true, cArr);
                I6 = i18;
            }
        }
        if (i12 != 0) {
            int I7 = I(i12);
            int iR4 = i12 + 2;
            while (true) {
                int i19 = I7 - 1;
                if (I7 <= 0) {
                    break;
                }
                int iF2 = F(li4Var, iR4);
                iR4 = r(gl9VarE.d(li4Var.h, li4Var.i, H(iF2, cArr), false), iF2 + 2, true, cArr);
                I7 = i19;
            }
        }
        while (true) {
            em1 em1Var3 = em1Var2;
            if (em1Var3 == null) {
                gl9VarE.c();
                return i4;
            }
            em1Var2 = em1Var3.c;
            em1Var3.c = null;
            gl9VarE.b(em1Var3);
        }
    }

    public int t(int i) {
        byte[] bArr = this.c;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public h2e u(int i, h2e[] h2eVarArr) {
        if (h2eVarArr[i] == null) {
            h2eVarArr[i] = new h2e();
        }
        return h2eVarArr[i];
    }

    public long v(int i) {
        return (((long) t(i)) << 32) | (((long) t(i + 4)) & 4294967295L);
    }

    public final int w(m04 m04Var, li4 li4Var, int i) {
        int i2;
        int i3;
        char[] cArr = li4Var.c;
        li4Var.d = I(i);
        li4Var.e = H(i + 2, cArr);
        int i4 = i + 4;
        li4Var.f = H(i4, cArr);
        int I = I(i + 6);
        int i5 = i + 8;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int I2 = 0;
        em1 em1Var = null;
        boolean z = false;
        int i11 = 0;
        String[] strArr = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = I - 1;
            if (I <= 0) {
                break;
            }
            String strH = H(i5, cArr);
            int iT = t(i5 + 2);
            int i17 = I2;
            int i18 = i5 + 6;
            i6 = i6;
            if ("Code".equals(strH)) {
                if ((li4Var.f25091b & 1) == 0) {
                    i15 = i18;
                    i6 = i6;
                    I2 = i17;
                    i3 = i15;
                } else {
                    i2 = i7;
                    i7 = i2;
                    i3 = i18;
                    I2 = i17;
                }
            } else if ("Exceptions".equals(strH)) {
                int I3 = I(i18);
                String[] strArr2 = new String[I3];
                int i19 = i5 + 8;
                int i20 = i7;
                for (int i21 = 0; i21 < I3; i21++) {
                    strArr2[i21] = m(i19, cArr);
                    i19 += 2;
                }
                strArr = strArr2;
                i11 = i18;
                i6 = i6;
                i7 = i20;
                I2 = i17;
                i3 = i11;
            } else {
                i2 = i7;
                if ("Signature".equals(strH)) {
                    i3 = i18;
                    i6 = i6;
                    i7 = i2;
                    I2 = I(i18);
                } else if ("Deprecated".equals(strH)) {
                    li4Var.d |= 131072;
                    i7 = i2;
                    i3 = i18;
                    I2 = i17;
                } else if ("RuntimeVisibleAnnotations".equals(strH)) {
                    i8 = i18;
                    i6 = i6;
                    i7 = i2;
                    I2 = i17;
                    i3 = i8;
                } else if ("RuntimeVisibleTypeAnnotations".equals(strH)) {
                    i6 = i18;
                    i7 = i2;
                    I2 = i17;
                    i3 = i6;
                } else if ("AnnotationDefault".equals(strH)) {
                    i9 = i18;
                    i6 = i6;
                    i7 = i2;
                    I2 = i17;
                    i3 = i9;
                } else if ("Synthetic".equals(strH)) {
                    li4Var.d |= 4096;
                    i7 = i2;
                    z = true;
                    i3 = i18;
                    I2 = i17;
                } else if ("RuntimeInvisibleAnnotations".equals(strH)) {
                    i7 = i18;
                    i6 = i6;
                    I2 = i17;
                    i3 = i7;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(strH)) {
                    i12 = i18;
                    i6 = i6;
                    i7 = i2;
                    I2 = i17;
                    i3 = i12;
                } else if ("RuntimeVisibleParameterAnnotations".equals(strH)) {
                    i13 = i18;
                    i6 = i6;
                    i7 = i2;
                    I2 = i17;
                    i3 = i13;
                } else if ("RuntimeInvisibleParameterAnnotations".equals(strH)) {
                    i14 = i18;
                    i6 = i6;
                    i7 = i2;
                    I2 = i17;
                    i3 = i14;
                } else if ("MethodParameters".equals(strH)) {
                    i10 = i18;
                    i6 = i6;
                    i7 = i2;
                    I2 = i17;
                    i3 = i10;
                } else {
                    i3 = i18;
                    em1 em1VarJ = j(li4Var.f25090a, strH, i18, iT, cArr, -1, null);
                    em1VarJ.c = em1Var;
                    em1Var = em1VarJ;
                    I2 = i17;
                    i6 = i6;
                    i7 = i2;
                    i8 = i8;
                    i9 = i9;
                    i10 = i10;
                }
            }
            i5 = i3 + iT;
            I = i16;
        }
        int i22 = i6;
        int i23 = i7;
        int i24 = i8;
        int i25 = i9;
        int i26 = i10;
        int i27 = I2;
        cuf cufVarG = m04Var.g(li4Var.d, li4Var.e, li4Var.f, i27 == 0 ? null : K(i27, cArr), strArr);
        if (cufVarG == null) {
            return i5;
        }
        if (cufVarG instanceof duf) {
            duf dufVar = (duf) cufVarG;
            if (dufVar.G(this, z, (li4Var.d & 131072) != 0, I(i4), i27, i11)) {
                dufVar.S(i, i5 - i);
                return i5;
            }
        }
        if (i26 != 0 && (li4Var.f25091b & 2) == 0) {
            int iL = l(i26);
            int i28 = i26 + 1;
            while (true) {
                int i29 = iL - 1;
                if (iL <= 0) {
                    break;
                }
                cufVarG.x(H(i28, cArr), I(i28 + 2));
                i28 += 4;
                iL = i29;
            }
        }
        if (i25 != 0) {
            jd1 jd1VarC = cufVarG.c();
            q(jd1VarC, i25, null, cArr);
            if (jd1VarC != null) {
                jd1VarC.d();
            }
        }
        if (i24 != 0) {
            int I4 = I(i24);
            int iR = i24 + 2;
            while (true) {
                int i30 = I4 - 1;
                if (I4 <= 0) {
                    break;
                }
                iR = r(cufVarG.b(H(iR, cArr), true), iR + 2, true, cArr);
                I4 = i30;
            }
        }
        if (i23 != 0) {
            int I5 = I(i23);
            int iR2 = i23 + 2;
            while (true) {
                int i31 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                iR2 = r(cufVarG.b(H(iR2, cArr), false), iR2 + 2, true, cArr);
                I5 = i31;
            }
        }
        if (i22 != 0) {
            int I6 = I(i22);
            int iR3 = i22 + 2;
            while (true) {
                int i32 = I6 - 1;
                if (I6 <= 0) {
                    break;
                }
                int iF = F(li4Var, iR3);
                iR3 = r(cufVarG.C(li4Var.h, li4Var.i, H(iF, cArr), true), iF + 2, true, cArr);
                I6 = i32;
            }
        }
        int i33 = i12;
        if (i33 != 0) {
            int I7 = I(i33);
            int iR4 = i33 + 2;
            while (true) {
                int i34 = I7 - 1;
                if (I7 <= 0) {
                    break;
                }
                int iF2 = F(li4Var, iR4);
                iR4 = r(cufVarG.C(li4Var.h, li4Var.i, H(iF2, cArr), false), iF2 + 2, true, cArr);
                I7 = i34;
            }
        }
        int i35 = i13;
        if (i35 != 0) {
            A(cufVarG, li4Var, i35, true);
        }
        int i36 = i14;
        if (i36 != 0) {
            A(cufVarG, li4Var, i36, false);
        }
        while (em1Var != null) {
            em1 em1Var2 = em1Var.c;
            em1Var.c = null;
            cufVarG.d(em1Var);
            em1Var = em1Var2;
        }
        int i37 = i15;
        if (i37 != 0) {
            cufVarG.e();
            n(cufVarG, li4Var, i37);
        }
        cufVarG.f();
        return i5;
    }

    public String x(int i, char[] cArr) {
        return E(i, cArr);
    }

    public final void y(m04 m04Var, li4 li4Var, int i, int i2, String str) {
        String[] strArr;
        char[] cArr = li4Var.c;
        int i3 = i + 6;
        l7g l7gVarH = m04Var.h(x(i, cArr), I(i + 2), H(i + 4, cArr));
        if (l7gVarH == null) {
            return;
        }
        if (str != null) {
            l7gVarH.c(str);
        }
        if (i2 != 0) {
            int I = I(i2);
            int i4 = i2 + 2;
            while (true) {
                int i5 = I - 1;
                if (I <= 0) {
                    break;
                }
                l7gVarH.e(z(i4, cArr));
                i4 += 2;
                I = i5;
            }
        }
        int I2 = I(i3);
        int i6 = i + 8;
        while (true) {
            int i7 = I2 - 1;
            if (I2 <= 0) {
                break;
            }
            String strX = x(i6, cArr);
            int I3 = I(i6 + 2);
            String strH = H(i6 + 4, cArr);
            i6 += 6;
            l7gVarH.g(strX, I3, strH);
            I2 = i7;
        }
        int I4 = I(i6);
        int i8 = i6 + 2;
        while (true) {
            int i9 = I4 - 1;
            String[] strArr2 = null;
            if (I4 <= 0) {
                break;
            }
            String strZ = z(i8, cArr);
            int I5 = I(i8 + 2);
            int I6 = I(i8 + 4);
            i8 += 6;
            if (I6 != 0) {
                strArr2 = new String[I6];
                for (int i10 = 0; i10 < I6; i10++) {
                    strArr2[i10] = x(i8, cArr);
                    i8 += 2;
                }
            }
            l7gVarH.b(strZ, I5, strArr2);
            I4 = i9;
        }
        int I7 = I(i8);
        int i11 = i8 + 2;
        while (true) {
            int i12 = I7 - 1;
            if (I7 <= 0) {
                break;
            }
            String strZ2 = z(i11, cArr);
            int I8 = I(i11 + 2);
            int I9 = I(i11 + 4);
            i11 += 6;
            if (I9 != 0) {
                strArr = new String[I9];
                for (int i13 = 0; i13 < I9; i13++) {
                    strArr[i13] = x(i11, cArr);
                    i11 += 2;
                }
            } else {
                strArr = null;
            }
            l7gVarH.d(strZ2, I8, strArr);
            I7 = i12;
        }
        int I10 = I(i11);
        int i14 = i11 + 2;
        while (true) {
            int i15 = I10 - 1;
            if (I10 <= 0) {
                break;
            }
            l7gVarH.h(m(i14, cArr));
            i14 += 2;
            I10 = i15;
        }
        int I11 = I(i14);
        int i16 = i14 + 2;
        while (true) {
            int i17 = I11 - 1;
            if (I11 <= 0) {
                l7gVarH.a();
                return;
            }
            String strM = m(i16, cArr);
            int I12 = I(i16 + 2);
            i16 += 4;
            String[] strArr3 = new String[I12];
            for (int i18 = 0; i18 < I12; i18++) {
                strArr3[i18] = m(i16, cArr);
                i16 += 2;
            }
            l7gVarH.f(strM, strArr3);
            I11 = i17;
        }
    }

    public String z(int i, char[] cArr) {
        return E(i, cArr);
    }
}
