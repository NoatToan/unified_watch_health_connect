package defpackage;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class d06 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f14916a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f14917b = {6, 2, 7, 3};
    public static final int[] c = {8, 1, 1, 1, 1, 1, 1, 3};
    public static final int[] d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static void a(atk[] atkVarArr, atk[] atkVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            atkVarArr[iArr[i]] = atkVarArr2[i];
        }
    }

    public static wfh b(cj2 cj2Var, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException {
        cp2 cp2VarA = cj2Var.a();
        List<atk[]> listC = c(z, cp2VarA);
        if (listC.isEmpty()) {
            cp2VarA = cp2VarA.clone();
            cp2VarA.l();
            listC = c(z, cp2VarA);
        }
        return new wfh(cp2VarA, listC);
    }

    public static List<atk[]> c(boolean z, cp2 cp2Var) {
        int iC;
        float fD;
        ArrayList<atk[]> arrayList = new ArrayList();
        int iMax = 0;
        int i = 0;
        loop0: while (true) {
            int i2 = i;
            while (iMax < cp2Var.h()) {
                atk[] atkVarArrF = f(cp2Var, iMax, i);
                if (atkVarArrF[0] == null && atkVarArrF[3] == null) {
                    if (i2 == 0) {
                        break;
                    }
                    for (atk[] atkVarArr : arrayList) {
                        atk atkVar = atkVarArr[1];
                        if (atkVar != null) {
                            iMax = (int) Math.max(iMax, atkVar.d());
                        }
                        atk atkVar2 = atkVarArr[3];
                        if (atkVar2 != null) {
                            iMax = Math.max(iMax, (int) atkVar2.d());
                        }
                    }
                    iMax += 5;
                    i = 0;
                } else {
                    arrayList.add(atkVarArrF);
                    if (!z) {
                        break loop0;
                    }
                    atk atkVar3 = atkVarArrF[2];
                    if (atkVar3 != null) {
                        iC = (int) atkVar3.c();
                        fD = atkVarArrF[2].d();
                    } else {
                        iC = (int) atkVarArrF[4].c();
                        fD = atkVarArrF[4].d();
                    }
                    iMax = (int) fD;
                    i = iC;
                    i2 = 1;
                }
            }
            break loop0;
        }
        return arrayList;
    }

    public static int[] d(cp2 cp2Var, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (cp2Var.e(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (cp2Var.e(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else {
                    if (g(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i7, i};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    public static atk[] e(cp2 cp2Var, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        atk[] atkVarArr = new atk[4];
        int[] iArr2 = new int[iArr.length];
        int i6 = i3;
        while (true) {
            if (i6 >= i) {
                z = false;
                break;
            }
            int[] iArrD = d(cp2Var, i4, i6, i2, false, iArr, iArr2);
            if (iArrD != null) {
                int i7 = i6;
                int[] iArr3 = iArrD;
                while (i7 > 0) {
                    int i8 = i7 - 1;
                    int[] iArrD2 = d(cp2Var, i4, i8, i2, false, iArr, iArr2);
                    if (iArrD2 == null) {
                        break;
                    }
                    iArr3 = iArrD2;
                    i7 = i8;
                }
                float f = i7;
                atkVarArr[0] = new atk(iArr3[0], f);
                atkVarArr[1] = new atk(iArr3[1], f);
                z = true;
                i6 = i7;
                break;
            }
            i6 += 5;
        }
        int i9 = i6 + 1;
        if (z) {
            int[] iArr4 = {(int) atkVarArr[0].c(), (int) atkVarArr[1].c()};
            int i10 = i9;
            int i11 = 0;
            while (true) {
                if (i10 >= i) {
                    i5 = i11;
                    break;
                }
                int i12 = i11;
                int[] iArrD3 = d(cp2Var, iArr4[0], i10, i2, false, iArr, iArr2);
                if (iArrD3 == null || Math.abs(iArr4[0] - iArrD3[0]) >= 5 || Math.abs(iArr4[1] - iArrD3[1]) >= 5) {
                    i5 = i12;
                    if (i5 > 25) {
                        break;
                    }
                    i11 = i5 + 1;
                } else {
                    iArr4 = iArrD3;
                    i11 = 0;
                }
                i10++;
            }
            i9 = i10 - (i5 + 1);
            float f2 = i9;
            atkVarArr[2] = new atk(iArr4[0], f2);
            atkVarArr[3] = new atk(iArr4[1], f2);
        }
        if (i9 - i6 < 10) {
            Arrays.fill(atkVarArr, (Object) null);
        }
        return atkVarArr;
    }

    public static atk[] f(cp2 cp2Var, int i, int i2) {
        int iH = cp2Var.h();
        int iK = cp2Var.k();
        atk[] atkVarArr = new atk[8];
        a(atkVarArr, e(cp2Var, iH, iK, i, i2, c), f14916a);
        atk atkVar = atkVarArr[4];
        if (atkVar != null) {
            i2 = (int) atkVar.c();
            i = (int) atkVarArr[4].d();
        }
        a(atkVarArr, e(cp2Var, iH, iK, i, i2, d), f14917b);
        return atkVarArr;
    }

    public static float g(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = iArr2[i4] * f3;
            float f7 = i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
