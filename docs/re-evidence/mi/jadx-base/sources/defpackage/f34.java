package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class f34 extends nah {

    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public static int f(CharSequence charSequence, int i, int i2) {
        a aVarG;
        a aVarG2;
        char cCharAt;
        a aVarG3 = g(charSequence, i);
        a aVar = a.ONE_DIGIT;
        if (aVarG3 == aVar) {
            return 100;
        }
        a aVar2 = a.UNCODABLE;
        if (aVarG3 == aVar2) {
            return (i >= charSequence.length() || ((cCharAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || cCharAt >= '`'))) ? 100 : 101;
        }
        if (i2 == 99) {
            return 99;
        }
        if (i2 != 100) {
            if (aVarG3 == a.FNC_1) {
                aVarG3 = g(charSequence, i + 1);
            }
            return aVarG3 == a.TWO_DIGITS ? 99 : 100;
        }
        a aVar3 = a.FNC_1;
        if (aVarG3 == aVar3 || (aVarG = g(charSequence, i + 2)) == aVar2 || aVarG == aVar) {
            return 100;
        }
        if (aVarG == aVar3) {
            return g(charSequence, i + 3) == a.TWO_DIGITS ? 99 : 100;
        }
        int i3 = i + 4;
        while (true) {
            aVarG2 = g(charSequence, i3);
            if (aVarG2 != a.TWO_DIGITS) {
                break;
            }
            i3 += 2;
        }
        return aVarG2 == a.ONE_DIGIT ? 100 : 99;
    }

    public static a g(CharSequence charSequence, int i) {
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
        return (cCharAt2 < '0' || cCharAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // defpackage.nah, defpackage.epr
    public cp2 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // defpackage.nah
    public boolean[] c(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int iB = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            switch (cCharAt) {
                case 241:
                case 242:
                case 243:
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
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            int i6 = 103;
            if (i2 >= length) {
                int[][] iArr = e34.f16208a;
                arrayList.add(iArr[i3 % 103]);
                arrayList.add(iArr[106]);
                int i7 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i8 : iArr2) {
                        i7 += i8;
                    }
                }
                boolean[] zArr = new boolean[i7];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iB += nah.b(zArr, iB, (int[]) it.next(), true);
                }
                return zArr;
            }
            int iF = f(str, i2, i4);
            int iCharAt = 100;
            if (iF == i4) {
                switch (str.charAt(i2)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case 243:
                        iCharAt = 96;
                        break;
                    case 244:
                        if (i4 == 101) {
                            iCharAt = 101;
                        }
                        break;
                    default:
                        if (i4 == 100) {
                            iCharAt = str.charAt(i2) - ' ';
                        } else if (i4 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i2, i2 + 2));
                            i2++;
                        } else {
                            char cCharAt2 = str.charAt(i2);
                            iCharAt = cCharAt2 - ' ';
                            if (iCharAt < 0) {
                                iCharAt = cCharAt2 + '@';
                            }
                        }
                        break;
                }
                i2++;
            } else {
                if (i4 != 0) {
                    i6 = iF;
                } else if (iF == 100) {
                    i6 = 104;
                } else if (iF != 101) {
                    i6 = 105;
                }
                iCharAt = i6;
                i4 = iF;
            }
            arrayList.add(e34.f16208a[iCharAt]);
            i3 += iCharAt * i5;
            if (i2 != 0) {
                i5++;
            }
        }
    }
}
