package com.huami.nfc.applet;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class TlvDecodeUtil {
    private static int a(String str) {
        if (a.a(str)) {
            return 0;
        }
        return Integer.valueOf(new BigInteger(a.b(Integer.valueOf(str, 16).intValue(), 8, "0").substring(1)).toString(), 2).intValue();
    }

    private void b(String str, int i, List<Tlv> list) {
        if (list == null || str.length() <= 0) {
            return;
        }
        int length = str.length() / 2;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < str.length() / 2; i2++) {
            int i3 = i2 * 2;
            strArr[i2] = str.substring(i3, i3 + 2);
        }
        if ((Integer.valueOf(strArr[0], 16).intValue() & 32) != 32) {
            if ((Integer.parseInt(strArr[0], 16) & 31) != 31) {
                StringBuilder sb = new StringBuilder();
                int[] iArrC = c(sb, strArr, 1);
                list.add(new Tlv(strArr[0], sb.toString().length(), sb.toString()));
                if (i > iArrC[1]) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i4 = iArrC[1]; i4 < length; i4++) {
                        sb2.append(strArr[i4]);
                    }
                    b(sb2.toString(), length - iArrC[1], list);
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            int[] iArrC2 = c(sb3, strArr, 2);
            list.add(new Tlv(strArr[0] + strArr[1], sb3.toString().length(), sb3.toString()));
            if (i > iArrC2[1]) {
                StringBuilder sb4 = new StringBuilder();
                for (int i5 = iArrC2[1]; i5 < length; i5++) {
                    sb4.append(strArr[i5]);
                }
                b(sb4.toString(), length - iArrC2[1], list);
                return;
            }
            return;
        }
        if ((Integer.valueOf(strArr[0], 16).intValue() & 31) != 31) {
            StringBuilder sb5 = new StringBuilder();
            int[] iArrC3 = c(sb5, strArr, 1);
            list.add(new Tlv(strArr[0], sb5.toString().length(), sb5.toString()));
            b(sb5.toString(), sb5.length() / 2, list);
            if (i > iArrC3[1]) {
                StringBuilder sb6 = new StringBuilder();
                for (int i6 = iArrC3[1]; i6 < length; i6++) {
                    sb6.append(strArr[i6]);
                }
                b(sb6.toString(), length - iArrC3[1], list);
                return;
            }
            return;
        }
        StringBuilder sb7 = new StringBuilder();
        int[] iArrC4 = c(sb7, strArr, 2);
        list.add(new Tlv(strArr[0] + strArr[1], sb7.toString().length(), sb7.toString()));
        b(sb7.toString(), sb7.length() / 2, list);
        if (i > iArrC4[1]) {
            StringBuilder sb8 = new StringBuilder();
            for (int i7 = iArrC4[1]; i7 < length; i7++) {
                sb8.append(strArr[i7]);
            }
            b(sb8.toString(), length - iArrC4[1], list);
        }
    }

    private int[] c(StringBuilder sb, String[] strArr, int i) {
        int[] iArr = new int[2];
        int[] iArrE = e(strArr, i);
        int i2 = iArrE[1];
        int i3 = iArrE[0];
        int i4 = i2 + i3;
        int length = i4 > strArr.length ? strArr.length : i4;
        for (int i5 = i3; i5 < length; i5++) {
            sb.append(strArr[i5]);
        }
        iArr[0] = i3;
        iArr[1] = i4;
        return iArr;
    }

    private static boolean d(String str) {
        if (a.a(str)) {
            return false;
        }
        return !"1".equals(a.b(Integer.valueOf(str, 16).intValue(), 8, "0").substring(0, 1));
    }

    private static int[] e(String[] strArr, int i) {
        int[] iArr = new int[2];
        if (strArr != null && strArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            int iA = a(strArr[i]);
            iArr[1] = iA;
            if (d(strArr[i])) {
                iArr[0] = i + 1;
            } else {
                sb.setLength(0);
                int i2 = i + 1;
                int length = iA + i2;
                if (length >= strArr.length) {
                    length = strArr.length;
                }
                while (i2 < length) {
                    sb.append(strArr[i2]);
                    i2++;
                }
                iArr[1] = Integer.valueOf(sb.toString(), 16).intValue();
                iArr[0] = length;
            }
        }
        return iArr;
    }

    public static void main(String[] strArr) {
        List<Tlv> listBuildTlvsForFull = new TlvDecodeUtil().buildTlvsForFull("611E4F10A00000000323008698070100000000009F700207018002000A8101159000");
        if (listBuildTlvsForFull == null || listBuildTlvsForFull.size() <= 0) {
            return;
        }
        for (Tlv tlv : listBuildTlvsForFull) {
            System.out.println(" tlv " + tlv);
        }
    }

    public List<Tlv> buildTlvsForFull(String str) {
        ArrayList arrayList = new ArrayList();
        if (!a.a(str)) {
            b(str, str.length() / 2, arrayList);
        }
        return arrayList;
    }
}
