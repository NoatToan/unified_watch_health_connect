package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class ega {
    public static boolean a(byte[] bArr, UUID uuid) {
        if (bArr == null) {
            return false;
        }
        String string = uuid != null ? uuid.toString() : null;
        boolean zA = string == null;
        int length = bArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            byte b2 = bArr[i];
            if (b2 <= 0) {
                return z && zA;
            }
            int i2 = i + 1;
            byte b3 = bArr[i2];
            zA = a(string, i2, bArr, zA, b2);
            if (b3 == 1) {
                z = (bArr[i + 2] & 3) > 0;
            }
            i = i2 + (b2 - 1) + 1;
        }
        return z && zA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean a(String str, int i, byte[] bArr, boolean z, int i2) {
        byte b2 = bArr[i];
        if (str != null) {
            switch (b2) {
                case 2:
                case 3:
                    for (int i3 = i + 1; i3 < (i + i2) - 1; i3 += 2) {
                        z = z || d(str, bArr, i3);
                    }
                    break;
                case 4:
                case 5:
                    for (int i4 = i + 1; i4 < (i + i2) - 1; i4 += 4) {
                        z = z || c(str, bArr, i4, 4);
                    }
                    return z;
                case 6:
                case 7:
                    for (int i5 = i + 1; i5 < (i + i2) - 1; i5 += 16) {
                        z = z || d(str, bArr, i5, 16);
                    }
                    return z;
            }
        }
        return z;
    }

    private static boolean d(String str, byte[] bArr, int i) {
        if (b(bArr, i) == -1) {
            return false;
        }
        String strSubstring = str.substring(4, 8);
        String str2 = String.format(Locale.ENGLISH, "%04x", Integer.valueOf(b(bArr, i)));
        LogUtil.d("ScannerServiceParser", "decodeService16BitUuid theRequiredUuid = ", strSubstring, " theServiceUuid = ", str2);
        return str2.equalsIgnoreCase(strSubstring);
    }

    private static boolean c(String str, byte[] bArr, int i, int i2) {
        int i3 = (i + i2) - 4;
        if (b(bArr, i3) == -1) {
            return false;
        }
        String strSubstring = str.substring(4, 8);
        String str2 = String.format(Locale.ENGLISH, "%04x", Integer.valueOf(b(bArr, i3)));
        LogUtil.d("ScannerServiceParser", "decodeService32BitUuid theRequiredUuid = ", strSubstring, " theServiceUuid = ", str2);
        return str2.equalsIgnoreCase(strSubstring);
    }

    private static boolean d(String str, byte[] bArr, int i, int i2) {
        int i3 = (i + i2) - 4;
        if (b(bArr, i3) == -1) {
            return false;
        }
        return String.format(Locale.ENGLISH, "%04x", Integer.valueOf(b(bArr, i3))).equalsIgnoreCase(str.substring(4, 8));
    }

    private static int b(byte[] bArr, int i) {
        LogUtil.a("ScannerServiceParser", "decodeUuid16 dataByte.length:", Integer.valueOf(bArr.length), " decodeUuid16 startInt:", Integer.valueOf(i));
        int i2 = i + 1;
        if (bArr.length > i2) {
            return (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        }
        LogUtil.a("ScannerServiceParser", "decodeUuid16 ArrayIndexOutOfBoundsException dataByte.length <= startInt + 1");
        return -1;
    }
}
