package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class x9j extends n10 {
    public static final int[] i = {1, 10, 34, 70, 126};
    public static final int[] j = {4, 20, 48, 81};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f38891k = {0, 161, 961, 2015, 2715};
    public static final int[] l = {0, 336, 1036, 1516};
    public static final int[] m = {8, 6, 4, 3, 1};
    public static final int[] n = {2, 4, 6, 8};
    public static final int[][] o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    public final List<kjh> g = new ArrayList();
    public final List<kjh> h = new ArrayList();

    public static void q(Collection<kjh> collection, kjh kjhVar) {
        if (kjhVar == null) {
            return;
        }
        for (kjh kjhVar2 : collection) {
            if (kjhVar2.b() == kjhVar.b()) {
                kjhVar2.e();
                return;
            }
        }
        collection.add(kjhVar);
    }

    public static boolean s(kjh kjhVar, kjh kjhVar2) {
        int iA = (kjhVar.a() + (kjhVar2.a() * 16)) % 79;
        int iC = (kjhVar.d().c() * 9) + kjhVar2.d().c();
        if (iC > 72) {
            iC--;
        }
        if (iC > 8) {
            iC--;
        }
        return iA == iC;
    }

    public static wsk t(kjh kjhVar, kjh kjhVar2) {
        String strValueOf = String.valueOf((((long) kjhVar.b()) * 4537077) + ((long) kjhVar2.b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(strValueOf);
        int i2 = 0;
        for (int i3 = 0; i3 < 13; i3++) {
            int iCharAt = sb.charAt(i3) - '0';
            if ((i3 & 1) == 0) {
                iCharAt *= 3;
            }
            i2 += iCharAt;
        }
        int i4 = 10 - (i2 % 10);
        if (i4 == 10) {
            i4 = 0;
        }
        sb.append(i4);
        atk[] atkVarArrA = kjhVar.d().a();
        atk[] atkVarArrA2 = kjhVar2.d().a();
        return new wsk(sb.toString(), null, new atk[]{atkVarArrA[0], atkVarArrA[1], atkVarArrA2[0], atkVarArrA2[1]}, BarcodeFormat.RSS_14);
    }

    @Override // defpackage.mah
    public wsk b(int i2, zo2 zo2Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        q(this.g, v(zo2Var, false, i2, map));
        zo2Var.q();
        q(this.h, v(zo2Var, true, i2, map));
        zo2Var.q();
        for (kjh kjhVar : this.g) {
            if (kjhVar.c() > 1) {
                for (kjh kjhVar2 : this.h) {
                    if (kjhVar2.c() > 1 && s(kjhVar, kjhVar2)) {
                        return t(kjhVar, kjhVar2);
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[PHI: r6 r7
      0x0025: PHI (r6v7 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:23:0x0041, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0025: PHI (r7v11 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:23:0x0041, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x002a A[PHI: r6 r7
      0x002a: PHI (r6v5 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r7v5 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r6 r7
      0x002d: PHI (r6v4 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r7v4 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x009c  */
    /* JADX WARN: Code duplicated, block: B:69:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00af  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public final void r(boolean z, int i2) throws NotFoundException {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int iD = q8f.d(l());
        int iD2 = q8f.d(j());
        boolean z6 = true;
        if (z) {
            if (iD > 12) {
                z3 = true;
                z2 = false;
            } else if (iD < 4) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (iD2 > 12) {
                z5 = true;
                z4 = false;
            } else if (iD2 < 4) {
                z4 = true;
                z5 = false;
            } else {
                z4 = false;
                z5 = false;
            }
        } else {
            if (iD > 11) {
                z3 = true;
                z2 = false;
            } else if (iD < 5) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (iD2 > 10) {
                z5 = true;
                z4 = false;
            } else if (iD2 < 4) {
                z4 = true;
                z5 = false;
            } else {
                z4 = false;
                z5 = false;
            }
        }
        int i3 = (iD + iD2) - i2;
        boolean z7 = (iD & 1) == z;
        boolean z8 = (iD2 & 1) == 1;
        if (i3 != 1) {
            if (i3 == -1) {
                if (z7) {
                    if (z8) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else {
                    if (!z8) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    z4 = true;
                }
            } else {
                if (i3 != 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (z7) {
                    if (!z8) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (iD < iD2) {
                        z5 = true;
                    } else {
                        z4 = true;
                        z3 = true;
                    }
                } else if (z8) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            if (z6) {
                if (!z3) {
                    throw NotFoundException.getNotFoundInstance();
                }
                n10.n(l(), m());
            }
            if (z3) {
                n10.g(l(), m());
            }
            if (z4) {
                if (!z5) {
                    throw NotFoundException.getNotFoundInstance();
                }
                n10.n(j(), m());
            }
            if (z5) {
                n10.g(j(), k());
            }
        }
        if (z7) {
            if (z8) {
                throw NotFoundException.getNotFoundInstance();
            }
            z3 = true;
        } else {
            if (!z8) {
                throw NotFoundException.getNotFoundInstance();
            }
            z5 = true;
        }
        z6 = z2;
        if (z6) {
            if (!z3) {
                throw NotFoundException.getNotFoundInstance();
            }
            n10.n(l(), m());
        }
        if (z3) {
            n10.g(l(), m());
        }
        if (z4) {
            if (!z5) {
                throw NotFoundException.getNotFoundInstance();
            }
            n10.n(j(), m());
        }
        if (z5) {
            n10.g(j(), k());
        }
    }

    @Override // defpackage.mah, defpackage.sgj
    public void reset() {
        this.g.clear();
        this.h.clear();
    }

    public final yk5 u(zo2 zo2Var, sn9 sn9Var, boolean z) throws NotFoundException {
        int[] iArrH = h();
        for (int i2 = 0; i2 < iArrH.length; i2++) {
            iArrH[i2] = 0;
        }
        if (z) {
            mah.f(zo2Var, sn9Var.b()[0], iArrH);
        } else {
            mah.e(zo2Var, sn9Var.b()[1] + 1, iArrH);
            int i3 = 0;
            for (int length = iArrH.length - 1; i3 < length; length--) {
                int i4 = iArrH[i3];
                iArrH[i3] = iArrH[length];
                iArrH[length] = i4;
                i3++;
            }
        }
        int i5 = z ? 16 : 15;
        float fD = q8f.d(iArrH) / i5;
        int[] iArrL = l();
        int[] iArrJ = j();
        float[] fArrM = m();
        float[] fArrK = k();
        for (int i6 = 0; i6 < iArrH.length; i6++) {
            float f = iArrH[i6] / fD;
            int i7 = (int) (0.5f + f);
            if (i7 <= 0) {
                i7 = 1;
            } else if (i7 > 8) {
                i7 = 8;
            }
            int i8 = i6 / 2;
            if ((i6 & 1) == 0) {
                iArrL[i8] = i7;
                fArrM[i8] = f - i7;
            } else {
                iArrJ[i8] = i7;
                fArrK[i8] = f - i7;
            }
        }
        r(z, i5);
        int i9 = 0;
        int i10 = 0;
        for (int length2 = iArrL.length - 1; length2 >= 0; length2--) {
            int i11 = iArrL[length2];
            i9 = (i9 * 9) + i11;
            i10 += i11;
        }
        int i12 = 0;
        int i13 = 0;
        for (int length3 = iArrJ.length - 1; length3 >= 0; length3--) {
            int i14 = iArrJ[length3];
            i12 = (i12 * 9) + i14;
            i13 += i14;
        }
        int i15 = i9 + (i12 * 3);
        if (!z) {
            if ((i13 & 1) != 0 || i13 > 10 || i13 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i16 = (10 - i13) / 2;
            int i17 = n[i16];
            return new yk5((z9j.b(iArrJ, 9 - i17, false) * j[i16]) + z9j.b(iArrL, i17, true) + l[i16], i15);
        }
        if ((i10 & 1) != 0 || i10 > 12 || i10 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i18 = (12 - i10) / 2;
        int i19 = m[i18];
        return new yk5((z9j.b(iArrL, i19, false) * i[i18]) + z9j.b(iArrJ, 9 - i19, true) + f38891k[i18], i15);
    }

    public final kjh v(zo2 zo2Var, boolean z, int i2, Map<DecodeHintType, ?> map) {
        try {
            int[] iArrW = w(zo2Var, z);
            sn9 sn9VarX = x(zo2Var, i2, z, iArrW);
            btk btkVar = map == null ? null : (btk) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (btkVar != null) {
                float fK = (iArrW[0] + iArrW[1]) / 2.0f;
                if (z) {
                    fK = (zo2Var.k() - 1) - fK;
                }
                btkVar.a(new atk(fK, i2));
            }
            yk5 yk5VarU = u(zo2Var, sn9VarX, true);
            yk5 yk5VarU2 = u(zo2Var, sn9VarX, false);
            return new kjh((yk5VarU.b() * 1597) + yk5VarU2.b(), yk5VarU.a() + (yk5VarU2.a() * 4), sn9VarX);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    public final int[] w(zo2 zo2Var, boolean z) throws NotFoundException {
        int[] iArrI = i();
        iArrI[0] = 0;
        iArrI[1] = 0;
        iArrI[2] = 0;
        iArrI[3] = 0;
        int iK = zo2Var.k();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < iK) {
            z2 = !zo2Var.g(i2);
            if (z == z2) {
                break;
            }
            i2++;
        }
        int i3 = 0;
        int i4 = i2;
        while (i2 < iK) {
            if (zo2Var.g(i2) != z2) {
                iArrI[i3] = iArrI[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else {
                    if (n10.o(iArrI)) {
                        return new int[]{i4, i2};
                    }
                    i4 += iArrI[0] + iArrI[1];
                    iArrI[0] = iArrI[2];
                    iArrI[1] = iArrI[3];
                    iArrI[2] = 0;
                    iArrI[3] = 0;
                    i3--;
                }
                iArrI[i3] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final sn9 x(zo2 zo2Var, int i2, boolean z, int[] iArr) throws NotFoundException {
        int iK;
        int i3;
        boolean zG = zo2Var.g(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && zG != zo2Var.g(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int i6 = iArr[0] - i5;
        int[] iArrI = i();
        System.arraycopy(iArrI, 0, iArrI, 1, iArrI.length - 1);
        iArrI[0] = i6;
        int iP = n10.p(iArrI, o);
        int i7 = iArr[1];
        if (z) {
            int iK2 = (zo2Var.k() - 1) - i5;
            iK = (zo2Var.k() - 1) - i7;
            i3 = iK2;
        } else {
            iK = i7;
            i3 = i5;
        }
        return new sn9(iP, new int[]{i5, iArr[1]}, i3, iK, i2);
    }
}
