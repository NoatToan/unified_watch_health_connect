package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.utils.HwLog;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes20.dex */
public abstract class f4 {
    public static boolean a(char c2) {
        return c2 <= ' ' || c2 == 12288 || c2 == 160;
    }

    public static boolean b(String str) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(d(str));
    }

    public static boolean c(String str) {
        if (!b(str)) {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length >= 1 && Integer.parseInt(strArrSplit[0]) > 1) {
                HwLog.i("StringUtils", "isVersionTwo() isVersionTwo: true");
                return true;
            }
        }
        HwLog.e("StringUtils", "isVersionTwo() isVersionTwo: false");
        return false;
    }

    public static String d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && a(str.charAt(i))) {
            i++;
        }
        while (i < length && a(str.charAt(length - 1))) {
            length--;
        }
        return (i > 0 || length < str.length()) ? SafeString.substring(str, i, length) : str;
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("0x");
                int i2 = i * 2;
                byte[] bArr2 = {bytes[i2]};
                Charset charset = StandardCharsets.UTF_8;
                sb.append(new String(bArr2, charset));
                bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, charset)).byteValue());
            }
        } catch (NumberFormatException e) {
            HwLog.e("StringUtils", "hexStr2ByteArray exception:" + HwLog.printException((Exception) e));
        }
        return bArr;
    }

    public static String a(String str, String str2) {
        if (b(str) || b(str2)) {
            return "";
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    public static String a(String str, String str2, int i) {
        try {
            if (!b(str) && !b(str2)) {
                Matcher matcher = Pattern.compile(str2).matcher(str);
                if (matcher.find()) {
                    return matcher.group(i);
                }
                return "";
            }
            return "";
        } catch (Exception unused) {
            HwLog.e("StringUtils", "getMatchSubString Exception");
        }
    }
}
