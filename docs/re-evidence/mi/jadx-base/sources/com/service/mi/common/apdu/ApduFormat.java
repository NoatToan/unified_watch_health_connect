package com.service.mi.common.apdu;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.al5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
public class ApduFormat {
    private ApduFormat() {
    }

    public static String formatCplc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String upperCase = str.toUpperCase();
        return upperCase.startsWith("9F7F") ? upperCase.substring(6, (Integer.parseInt(upperCase.substring(4, 6), 16) * 2) + 6) : upperCase;
    }

    public static String getClientDeviceIdByCplc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.substring(0, 4) + str.substring(24, 36) + str.substring(78, 84);
    }

    public static String getCommonSeidFromCplc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String cplc = formatCplc(str);
        return cplc.substring(0, 4) + cplc.substring(20, 36);
    }

    public static String getMiStandardSeIdFromCplc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String cplc = formatCplc(str);
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(al5.a(MessageDigest.getInstance(Coder.KEY_MD5).digest(cplc.getBytes())));
            sb.append(str.substring(24, 36));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString().toUpperCase();
    }
}
