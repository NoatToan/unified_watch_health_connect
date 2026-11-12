package fa;

import android.net.Uri;
import android.text.TextUtils;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    private x() {
    }

    public static int[] a(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i14 = iIndexOf5 + 2;
        if (i14 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i14) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static String b(StringBuilder sb3, int i14, int i15) {
        int i16;
        int iLastIndexOf;
        if (i14 >= i15) {
            return sb3.toString();
        }
        if (sb3.charAt(i14) == '/') {
            i14++;
        }
        int i17 = i14;
        int i18 = i17;
        while (i17 <= i15) {
            if (i17 == i15) {
                i16 = i17;
            } else if (sb3.charAt(i17) == '/') {
                i16 = i17 + 1;
            } else {
                i17++;
            }
            int i19 = i18 + 1;
            if (i17 == i19 && sb3.charAt(i18) == '.') {
                sb3.delete(i18, i16);
                i15 -= i16 - i18;
            } else {
                if (i17 == i18 + 2 && sb3.charAt(i18) == '.' && sb3.charAt(i19) == '.') {
                    iLastIndexOf = sb3.lastIndexOf("/", i18 - 2) + 1;
                    int i24 = iLastIndexOf > i14 ? iLastIndexOf : i14;
                    sb3.delete(i24, i16);
                    i15 -= i16 - i24;
                } else {
                    iLastIndexOf = i17 + 1;
                }
                i18 = iLastIndexOf;
            }
            i17 = i18;
        }
        return sb3.toString();
    }

    public static String c(String str, String str2) {
        StringBuilder sb3 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrA = a(str2);
        if (iArrA[0] != -1) {
            sb3.append(str2);
            b(sb3, iArrA[1], iArrA[2]);
            return sb3.toString();
        }
        int[] iArrA2 = a(str);
        if (iArrA[3] == 0) {
            sb3.append((CharSequence) str, 0, iArrA2[3]);
            sb3.append(str2);
            return sb3.toString();
        }
        if (iArrA[2] == 0) {
            sb3.append((CharSequence) str, 0, iArrA2[2]);
            sb3.append(str2);
            return sb3.toString();
        }
        int i14 = iArrA[1];
        if (i14 != 0) {
            int i15 = iArrA2[0] + 1;
            sb3.append((CharSequence) str, 0, i15);
            sb3.append(str2);
            return b(sb3, iArrA[1] + i15, i15 + iArrA[2]);
        }
        if (str2.charAt(i14) == '/') {
            sb3.append((CharSequence) str, 0, iArrA2[1]);
            sb3.append(str2);
            int i16 = iArrA2[1];
            return b(sb3, i16, iArrA[2] + i16);
        }
        int i17 = iArrA2[0] + 2;
        int i18 = iArrA2[1];
        if (i17 >= i18 || i18 != iArrA2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrA2[2] - 1);
            int i19 = iLastIndexOf == -1 ? iArrA2[1] : iLastIndexOf + 1;
            sb3.append((CharSequence) str, 0, i19);
            sb3.append(str2);
            return b(sb3, iArrA2[1], i19 + iArrA[2]);
        }
        sb3.append((CharSequence) str, 0, i18);
        sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb3.append(str2);
        int i24 = iArrA2[1];
        return b(sb3, i24, iArrA[2] + i24 + 1);
    }

    public static Uri d(String str, String str2) {
        return Uri.parse(c(str, str2));
    }
}
