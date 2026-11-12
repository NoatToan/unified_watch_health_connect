package defpackage;

import com.careforeyou.library.enums.Weight_Digit;
import com.careforeyou.library.enums.Weight_Unit;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes4.dex */
public class wg {
    public static int c(byte b2) {
        return b2 & 255;
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 > 0 && bArr.length >= (i3 = i + i2)) {
            byte[] bArr2 = new byte[i2];
            for (int i4 = i; i4 < i3; i4++) {
                bArr2[i4 - i] = bArr[i4];
            }
            return bArr2;
        }
        return new byte[0];
    }

    public static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String e(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append("0x" + hexString);
            sb.append(",");
        }
        return sb.toString();
    }

    public static int a(byte[] bArr) {
        try {
            return Integer.parseInt(c(bArr), 16);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static byte d(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i];
        while (true) {
            i = (byte) (i + 1);
            if (i > i2) {
                return b2;
            }
            b2 = (byte) (b2 ^ bArr[i]);
        }
    }

    public static byte[] d(short s) {
        return new byte[]{(byte) (s >> 8), (byte) s};
    }

    public static void e(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void b(byte[] bArr, short s, int i) {
        bArr[i] = (byte) (s >> 8);
        bArr[i + 1] = (byte) s;
    }

    public static String b(byte b2) {
        return "" + ((int) ((byte) ((b2 >> 7) & 1))) + ((int) ((byte) ((b2 >> 6) & 1))) + ((int) ((byte) ((b2 >> 5) & 1))) + ((int) ((byte) ((b2 >> 4) & 1))) + ((int) ((byte) ((b2 >> 3) & 1))) + ((int) ((byte) ((b2 >> 2) & 1))) + ((int) ((byte) ((b2 >> 1) & 1))) + ((int) ((byte) (b2 & 1)));
    }

    public static byte e(byte b2) {
        return Byte.parseByte(b(b2).substring(7, 8));
    }

    public static byte d(byte b2) {
        return Byte.parseByte(b(b2).substring(2, 3));
    }

    public static Weight_Unit f(byte b2) {
        Weight_Unit weight_Unit = Weight_Unit.KG;
        String strB = b(b2);
        if (strB.substring(3, 5).equalsIgnoreCase(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
            return Weight_Unit.JIN;
        }
        if (strB.substring(3, 5).equalsIgnoreCase("10")) {
            return Weight_Unit.LB;
        }
        if (strB.substring(3, 5).equalsIgnoreCase("11")) {
            return Weight_Unit.ST;
        }
        return Weight_Unit.KG;
    }

    public static Weight_Digit a(byte b2) {
        Weight_Digit weight_Digit = Weight_Digit.TWO;
        String strB = b(b2);
        if (strB.substring(5, 7).equalsIgnoreCase(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
            return Weight_Digit.ZERO;
        }
        if (strB.substring(5, 7).equalsIgnoreCase("10")) {
            return Weight_Digit.ONE;
        }
        return Weight_Digit.TWO;
    }

    public static Weight_Digit h(byte b2) {
        Weight_Digit weight_Digit = Weight_Digit.ONE;
        String strB = b(b2);
        if (strB.substring(5, 7).equalsIgnoreCase(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
            return Weight_Digit.ZERO;
        }
        if (strB.substring(5, 7).equalsIgnoreCase("10")) {
            return Weight_Digit.TWO;
        }
        return Weight_Digit.ONE;
    }

    public static byte j(byte b2) {
        String strB = b(b2);
        wf.e("BytesUtil", "getXiangshanCmdId:" + strB);
        return "1010".equalsIgnoreCase(strB.substring(0, 4)) ? (byte) 1 : (byte) 0;
    }

    public static Weight_Unit i(byte b2) {
        Weight_Unit weight_Unit = Weight_Unit.KG;
        String strB = b(b2);
        if (strB.substring(4, 8).equalsIgnoreCase("0001")) {
            return Weight_Unit.KG;
        }
        if (strB.substring(4, 8).equalsIgnoreCase("0002")) {
            return Weight_Unit.LB;
        }
        if (strB.substring(4, 8).equalsIgnoreCase("0003")) {
            return Weight_Unit.ST;
        }
        if (strB.substring(0, 4).equalsIgnoreCase("0004")) {
            return Weight_Unit.JIN;
        }
        return Weight_Unit.KG;
    }
}
