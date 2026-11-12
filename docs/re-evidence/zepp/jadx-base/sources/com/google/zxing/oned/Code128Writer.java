package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.huami.widget.wheelview.Constant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    private static final int a = 103;
    private static final int b = 104;
    private static final int c = 105;
    private static final int d = 101;
    private static final int e = 100;
    private static final int f = 99;
    private static final int g = 106;
    private static final char h = 241;
    private static final char i = 242;
    private static final char j = 243;
    private static final char k = 244;
    private static final int l = 102;
    private static final int m = 97;
    private static final int n = 96;
    private static final int o = 101;
    private static final int p = 100;

    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int b(CharSequence charSequence, int i2, int i3) {
        a aVarC;
        a aVarC2;
        char cCharAt;
        a aVarC3 = c(charSequence, i2);
        a aVar = a.ONE_DIGIT;
        if (aVarC3 == aVar) {
            return 100;
        }
        a aVar2 = a.UNCODABLE;
        if (aVarC3 == aVar2) {
            return (i2 >= charSequence.length() || ((cCharAt = charSequence.charAt(i2)) >= ' ' && (i3 != 101 || cCharAt >= '`'))) ? 100 : 101;
        }
        if (i3 == 99) {
            return 99;
        }
        if (i3 != 100) {
            if (aVarC3 == a.FNC_1) {
                aVarC3 = c(charSequence, i2 + 1);
            }
            return aVarC3 == a.TWO_DIGITS ? 99 : 100;
        }
        a aVar3 = a.FNC_1;
        if (aVarC3 == aVar3 || (aVarC = c(charSequence, i2 + 2)) == aVar2 || aVarC == aVar) {
            return 100;
        }
        if (aVarC == aVar3) {
            return c(charSequence, i2 + 3) == a.TWO_DIGITS ? 99 : 100;
        }
        int i4 = i2 + 4;
        while (true) {
            aVarC2 = c(charSequence, i4);
            if (aVarC2 != a.TWO_DIGITS) {
                break;
            }
            i4 += 2;
        }
        return aVarC2 == a.ONE_DIGIT ? 100 : 99;
    }

    private static a c(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        if (i2 >= length) {
            return a.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt == 241) {
            return a.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return a.UNCODABLE;
        }
        int i3 = i2 + 1;
        if (i3 >= length) {
            return a.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i3);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int iAppendPattern = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                switch (cCharAt) {
                    case 241:
                    case 242:
                    case Constant.HEIGHT_MAX /* 243 */:
                    case 244:
                        break;
                    default:
                        if (cCharAt > 127) {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt)));
                        }
                        break;
                        break;
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            while (true) {
                int i7 = 103;
                if (i3 < length) {
                    int iB = b(str, i3, i5);
                    int iCharAt = 100;
                    if (iB == i5) {
                        switch (str.charAt(i3)) {
                            case 241:
                                iCharAt = 102;
                                break;
                            case 242:
                                iCharAt = 97;
                                break;
                            case Constant.HEIGHT_MAX /* 243 */:
                                iCharAt = 96;
                                break;
                            case 244:
                                if (i5 == 101) {
                                    iCharAt = 101;
                                }
                                break;
                            default:
                                if (i5 == 100) {
                                    iCharAt = str.charAt(i3) - ' ';
                                } else if (i5 != 101) {
                                    iCharAt = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                } else {
                                    iCharAt = str.charAt(i3) - ' ';
                                    if (iCharAt < 0) {
                                        iCharAt += 96;
                                    }
                                }
                                break;
                        }
                        i3++;
                    } else {
                        if (i5 != 0) {
                            i7 = iB;
                        } else if (iB == 100) {
                            i7 = 104;
                        } else if (iB != 101) {
                            i7 = 105;
                        }
                        iCharAt = i7;
                        i5 = iB;
                    }
                    arrayList.add(Code128Reader.a[iCharAt]);
                    i4 += iCharAt * i6;
                    if (i3 != 0) {
                        i6++;
                    }
                } else {
                    int[][] iArr = Code128Reader.a;
                    arrayList.add(iArr[i4 % 103]);
                    arrayList.add(iArr[106]);
                    int i8 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i9 : iArr2) {
                            i8 += i9;
                        }
                    }
                    boolean[] zArr = new boolean[i8];
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        iAppendPattern += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, (int[]) it2.next(), true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
