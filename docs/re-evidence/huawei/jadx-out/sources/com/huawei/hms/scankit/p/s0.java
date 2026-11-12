package com.huawei.hms.scankit.p;

import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class s0 extends h5 {

    enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int a(CharSequence charSequence, int i, int i2) {
        a aVar;
        a aVarA;
        a aVarA2;
        a aVarA3 = a(charSequence, i);
        a aVar2 = a.UNCODABLE;
        if (aVarA3 != aVar2 && aVarA3 != (aVar = a.ONE_DIGIT)) {
            if (i2 == 99) {
                return 99;
            }
            if (i2 == 100) {
                a aVar3 = a.FNC_1;
                if (aVarA3 == aVar3 || (aVarA = a(charSequence, i + 2)) == aVar2 || aVarA == aVar) {
                    return 100;
                }
                if (aVarA == aVar3) {
                    return a(charSequence, i + 3) == a.TWO_DIGITS ? 99 : 100;
                }
                int i3 = i + 4;
                while (true) {
                    aVarA2 = a(charSequence, i3);
                    if (aVarA2 != a.TWO_DIGITS) {
                        break;
                    }
                    i3 += 2;
                }
                return aVarA2 == a.ONE_DIGIT ? 100 : 99;
            }
            if (aVarA3 == a.FNC_1) {
                aVarA3 = a(charSequence, i + 1);
            }
            if (aVarA3 == a.TWO_DIGITS) {
                return 99;
            }
        }
        return 100;
    }

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got " + barcodeFormat);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(String str) {
        int length = str.length();
        if (length >= 1 && length <= 80) {
            int iA = 0;
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt < ' ' || cCharAt > '~') {
                    switch (cCharAt) {
                        case 241:
                        case InterfaceHiMap.POLY_LINE_MAX_SIZE /* 242 */:
                        case 243:
                        case 244:
                            break;
                        default:
                            throw new IllegalArgumentException("Bad character in input: " + cCharAt);
                    }
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i2 = 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int iA2 = a(str, i3, i5);
                int iCharAt = 100;
                if (iA2 == i5) {
                    switch (str.charAt(i3)) {
                        case 241:
                            iCharAt = 102;
                            i3++;
                            break;
                        case InterfaceHiMap.POLY_LINE_MAX_SIZE /* 242 */:
                            iCharAt = 97;
                            i3++;
                            break;
                        case 243:
                            iCharAt = 96;
                            i3++;
                            break;
                        case 244:
                            i3++;
                            break;
                        default:
                            if (i5 == 100) {
                                iCharAt = str.charAt(i3) - ' ';
                            } else {
                                try {
                                    iCharAt = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                } catch (NumberFormatException unused) {
                                    throw new IllegalArgumentException("contents substring can not format integer");
                                }
                            }
                            i3++;
                            break;
                    }
                } else {
                    iCharAt = i5 == 0 ? iA2 == 100 ? 104 : 105 : iA2;
                    i5 = iA2;
                }
                arrayList.add(r0.f16292a[iCharAt]);
                i4 += iCharAt * i2;
                if (i3 != 0) {
                    i2++;
                }
            }
            int[][] iArr = r0.f16292a;
            arrayList.add(iArr[i4 % 103]);
            arrayList.add(iArr[106]);
            int i6 = 0;
            for (int[] iArr2 : arrayList) {
                for (int i7 : iArr2) {
                    i6 += i7;
                }
            }
            boolean[] zArr = new boolean[i6];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iA += h5.a(zArr, iA, (int[]) it.next(), true);
            }
            return zArr;
        }
        throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + length);
    }

    private static a a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return a.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == 241) {
            return a.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return a.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i2);
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            return a.TWO_DIGITS;
        }
        return a.ONE_DIGIT;
    }
}
