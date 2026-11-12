package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 extends g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f16292a;

    static {
        int[] iArr = new int[6];
        // fill-array-data instruction
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 2;
        iArr[3] = 2;
        iArr[4] = 3;
        iArr[5] = 1;
        f16292a = new int[][]{new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, iArr, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    }

    private static boolean a(r rVar, int i, int i2) {
        return rVar.a(i, i2, false, false);
    }

    private int[] c(StringBuilder sb, int[] iArr) throws a {
        int i;
        int i2;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1] == 1 ? 1 : 0;
        int i6 = iArr[2] == 1 ? 1 : 0;
        int i7 = iArr[3] == 1 ? 1 : 0;
        int i8 = iArr[4];
        int i9 = iArr[5] == 1 ? 1 : 0;
        int i10 = iArr[6] == 1 ? 1 : 0;
        if (i3 < 100) {
            if (i3 < 10) {
                sb.append('0');
            }
            sb.append(i3);
        } else {
            i = i3 == 106 ? i7 : 0;
            if (i3 != 106) {
                switch (i3) {
                    case 100:
                        i2 = 100;
                        return new int[]{i3, i5, i6, i, i2, i9, i10};
                    case 101:
                        i8 = 101;
                        i4 = i10;
                        break;
                    case 102:
                        i7 = i;
                        break;
                    default:
                        throw a.a();
                }
            }
            i10 = i4;
            i2 = i8;
            return new int[]{i3, i5, i6, i, i2, i9, i10};
        }
        i = i7;
        i2 = i8;
        return new int[]{i3, i5, i6, i, i2, i9, i10};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int[] b(StringBuilder sb, int[] iArr) throws a {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = iArr[0];
        int i10 = iArr[1] == 1 ? 1 : 0;
        int i11 = iArr[2] == 1 ? 1 : 0;
        int i12 = iArr[3] == 1 ? 1 : 0;
        int i13 = iArr[4];
        int i14 = iArr[5] == 1 ? 1 : 0;
        int i15 = iArr[6] == 1 ? 1 : 0;
        if (i9 >= 96) {
            if (i9 != 106) {
                i12 = 0;
            }
            if (i9 != 106) {
                i7 = 101;
                switch (i9) {
                    case 96:
                    case 97:
                    case 102:
                        i8 = i10;
                        break;
                    case Constants.DEFAULT_PRO_BOT_MARGIN_PAD /* 98 */:
                        i = i15;
                        i6 = 1;
                        i2 = i10;
                        i3 = i11;
                        i4 = i12;
                        i5 = 101;
                        break;
                    case 99:
                        i13 = 99;
                        i8 = i10;
                        break;
                    case 100:
                        if (i11 == 0 && i10 != 0) {
                            i3 = 1;
                            i4 = i12;
                            i5 = i13;
                            i6 = i14;
                            i = i15;
                            i2 = 0;
                        } else if (i11 == 0 || i10 == 0) {
                            i8 = 1;
                        } else {
                            i11 = 0;
                        }
                        break;
                    case 101:
                        i8 = i10;
                        i2 = i8;
                        i3 = i11;
                        i4 = i12;
                        i6 = i14;
                        i5 = i7;
                        i = i15;
                        break;
                    default:
                        throw a.a();
                }
            } else {
                int i16 = i14;
                i = 1;
                i2 = i10;
                i3 = i11;
                i4 = i12;
                i5 = i13;
                i6 = i16;
            }
            return new int[]{i9, i2, i3, i4, i5, i6, i};
        }
        if (i10 == i11) {
            sb.append((char) (i9 + 32));
        } else {
            sb.append((char) (i9 + 160));
        }
        i7 = i13;
        i2 = i8;
        i3 = i11;
        i4 = i12;
        i6 = i14;
        i5 = i7;
        i = i15;
        return new int[]{i9, i2, i3, i4, i5, i6, i};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int[] a(StringBuilder sb, int[] iArr) throws a {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = iArr[0];
        int i10 = iArr[1] == 1 ? 1 : 0;
        int i11 = iArr[2] == 1 ? 1 : 0;
        int i12 = iArr[3] == 1 ? 1 : 0;
        int i13 = iArr[4];
        int i14 = iArr[5] == 1 ? 1 : 0;
        int i15 = iArr[6] == 1 ? 1 : 0;
        if (i9 >= 64) {
            if (i9 >= 96) {
                if (i9 != 106) {
                    i12 = 0;
                }
                if (i9 != 106) {
                    i7 = 100;
                    switch (i9) {
                        case 96:
                        case 97:
                        case 102:
                            i8 = i10;
                            break;
                        case Constants.DEFAULT_PRO_BOT_MARGIN_PAD /* 98 */:
                            i = i15;
                            i6 = 1;
                            i2 = i10;
                            i3 = i11;
                            i4 = i12;
                            i5 = 100;
                            break;
                        case 99:
                            i13 = 99;
                            i8 = i10;
                            break;
                        case 100:
                            i8 = i10;
                            i2 = i8;
                            i3 = i11;
                            i4 = i12;
                            i6 = i14;
                            i5 = i7;
                            i = i15;
                            break;
                        case 101:
                            if (i11 == 0 && i10 != 0) {
                                i3 = 1;
                                i4 = i12;
                                i5 = i13;
                                i6 = i14;
                                i = i15;
                                i2 = 0;
                            } else if (i11 == 0 || i10 == 0) {
                                i8 = 1;
                            } else {
                                i11 = 0;
                            }
                            break;
                        default:
                            throw a.a();
                    }
                } else {
                    int i16 = i14;
                    i = 1;
                    i2 = i10;
                    i3 = i11;
                    i4 = i12;
                    i5 = i13;
                    i6 = i16;
                }
                return new int[]{i9, i2, i3, i4, i5, i6, i};
            }
            if (i10 == i11) {
                sb.append((char) (i9 - 64));
            } else {
                sb.append((char) (i9 + 64));
            }
        } else if (i10 == i11) {
            sb.append((char) (i9 + 32));
        } else {
            sb.append((char) (i9 + 160));
        }
        i7 = i13;
        i2 = i8;
        i3 = i11;
        i4 = i12;
        i6 = i14;
        i5 = i7;
        i = i15;
        return new int[]{i9, i2, i3, i4, i5, i6, i};
    }

    private static float b(r rVar, int[] iArr, int i) {
        int[] iArr2 = new int[7];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        for (int i2 : iArr) {
            i += i2;
        }
        boolean z = true;
        int i3 = 0;
        while (z && i < rVar.d()) {
            if (rVar.b(i)) {
                i3++;
                i++;
            } else {
                iArr2[6] = i3;
                z = false;
            }
        }
        int[][] iArr3 = f16292a;
        return g5.a(iArr2, iArr3[iArr3.length - 1], 0.7f);
    }

    private static int a(r rVar, int[] iArr, int i) throws a {
        float fA;
        g5.a(rVar, i, iArr);
        float f = 0.25f;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = f16292a;
            if (i3 >= iArr2.length) {
                break;
            }
            int[] iArr3 = iArr2[i3];
            if (i3 == iArr2.length - 1) {
                fA = b(rVar, iArr, i);
            } else {
                fA = g5.a(iArr, iArr3, 0.7f);
            }
            if (fA < f) {
                i2 = i3;
                f = fA;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw a.a();
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i, r rVar, Map map) throws a {
        int i2;
        int[] iArrA = a(rVar);
        int i3 = iArrA[0];
        int i4 = i3 - (((iArrA[1] - i3) / 11) * 10);
        if (i4 > 0 && i4 < i3) {
            if (!a(rVar, i4, i3)) {
                throw a.a();
            }
        }
        int i5 = iArrA[2];
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(Byte.valueOf((byte) i5));
        if (i5 == 103) {
            i2 = 101;
        } else if (i5 == 104) {
            i2 = 100;
        } else {
            i2 = i5 == 105 ? 99 : 0;
        }
        if (i2 != 0) {
            StringBuilder sb = new StringBuilder(20);
            int[] iArr = new int[7];
            iArr[6] = i2;
            a(sb, iArrA, iArr, i5, rVar, arrayList);
            int i6 = iArr[0];
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[3];
            int i10 = iArr[4];
            boolean z = iArr[5] == 1;
            int i11 = iArr[6];
            if ((i9 - (i10 * i8)) % 103 == i8) {
                int length = sb.length();
                if (length != 0) {
                    if (length > 0 && z) {
                        if (i11 == 99) {
                            sb.delete(length - 2, length);
                        } else {
                            sb.delete(length - 1, length);
                        }
                    }
                    float f = iArrA[0];
                    float f2 = i6 + (((i7 - i6) * 13) / 11);
                    int size = arrayList.size();
                    byte[] bArr = new byte[size];
                    for (int i12 = 0; i12 < size; i12++) {
                        bArr[i12] = ((Byte) arrayList.get(i12)).byteValue();
                    }
                    float f3 = i;
                    return new s6(sb.toString(), bArr, new u6[]{new u6(f, f3), new u6(f2, f3)}, BarcodeFormat.CODE_128);
                }
                throw a.a();
            }
            throw a.a();
        }
        throw a.a();
    }

    private void a(StringBuilder sb, int[] iArr, int[] iArr2, int i, r rVar, List list) throws a {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = iArr[0];
        int i7 = 6;
        int[] iArr3 = new int[6];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z = false;
        int i11 = 0;
        int i12 = iArr[1];
        int i13 = iArr2[6];
        int i14 = 1;
        int i15 = i;
        int i16 = 0;
        int i17 = i6;
        int i18 = 0;
        while (i11 == 0) {
            int iA = a(rVar, iArr3, i12);
            list.add(Byte.valueOf((byte) iA));
            if (iA != 106) {
                int i19 = i16 + 1;
                i4 = i15 + (i19 * iA);
                i2 = i19;
                i3 = 1;
            } else {
                i2 = i16;
                i3 = i14;
                i4 = i15;
            }
            int i20 = i12;
            for (int i21 = 0; i21 < i7; i21++) {
                i20 += iArr3[i21];
            }
            if (iA != 105) {
                int i22 = i13;
                int[] iArrC = {iA, i8, i9, i3, i13, 0, i11};
                if (i22 == 101) {
                    iArrC = a(sb, iArrC);
                } else if (i22 == 100) {
                    iArrC = b(sb, iArrC);
                } else if (i22 == 99) {
                    iArrC = c(sb, iArrC);
                }
                int i23 = iArrC[0];
                int i24 = iArrC[1] == 1 ? 1 : 0;
                int i25 = iArrC[2] == 1 ? 1 : 0;
                int i26 = iArrC[3] == 1 ? 1 : 0;
                boolean z2 = iArrC[5] == 1;
                i11 = iArrC[6] == 1 ? 1 : 0;
                if (z) {
                    i5 = iArrC[4] == 101 ? 100 : 101;
                } else {
                    i5 = iArrC[4];
                }
                z = z2;
                i18 = i10;
                i17 = i12;
                i16 = i2;
                i12 = i20;
                i10 = i23;
                i8 = i24;
                i9 = i25;
                i13 = i5;
                i15 = i4;
                i14 = i26;
                i7 = 6;
            } else {
                throw a.a();
            }
        }
        iArr2[0] = i17;
        iArr2[1] = i12;
        iArr2[2] = i18;
        iArr2[3] = i15;
        iArr2[4] = i16;
        iArr2[5] = i14;
        iArr2[6] = i13;
    }

    private static int[] a(r rVar) throws a {
        int iD = rVar.d();
        int iC = rVar.c(0);
        int[] iArr = new int[6];
        boolean z = false;
        int i = 0;
        int i2 = iC;
        while (iC < iD) {
            if (rVar.b(iC) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == 5) {
                    int i3 = -1;
                    float f = 0.25f;
                    for (int i4 = 103; i4 <= 105; i4++) {
                        float fA = g5.a(iArr, f16292a[i4], 0.7f);
                        if (fA < f) {
                            i3 = i4;
                            f = fA;
                        }
                    }
                    if (i3 >= 0) {
                        return new int[]{i2, iC, i3};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i5 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i] = 0;
                    i = i5;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
            iC++;
        }
        throw a.a();
    }
}
