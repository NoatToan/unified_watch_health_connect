package com.ta.utdid2.a.a;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static String a(String str) {
        byte[] bArrA;
        try {
            bArrA = a(a(), str.getBytes());
        } catch (Exception unused) {
            bArrA = null;
        }
        if (bArrA != null) {
            return a(bArrA);
        }
        return null;
    }

    public static String b(String str) {
        try {
            return new String(b(a(), m203a(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] a() throws Exception {
        return f.a(new byte[]{SettingsModule.VALUE_TYPE_STRING_ENUM, 83, -50, -89, -84, -114, SettingsModule.VALUE_TYPE_FLAG, 99, 10, 63, 22, -65, -11, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, 101, -118});
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(b()));
        return cipher.doFinal(bArr2);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(b()));
        return cipher.doFinal(bArr2);
    }

    private static byte[] b() {
        try {
            byte[] bArrDecode = b.decode("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8"), 2);
            if (bArrDecode != null) {
                return f.a(bArrDecode);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static byte[] m203a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b2 : bArr) {
            a(stringBuffer, b2);
        }
        return stringBuffer.toString();
    }

    private static void a(StringBuffer stringBuffer, byte b2) {
        stringBuffer.append("0123456789ABCDEF".charAt((b2 >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b2 & 15));
    }
}
