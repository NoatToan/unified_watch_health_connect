package com.loc;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.nfc.applet.ISeCommandKt;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes18.dex */
public final class dx {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final byte[] b = {61, 61, 81, 65, 65, org.threeten.bp.a.o, 119, 65, org.threeten.bp.a.m, 48, 74, SettingsModule.VALUE_TYPE_FLAG, 115, 116, 54, 75, 104, 76, 122, 97, 88, 99, 53, 71, HMDisplaySetting.TYPE_OSPREY_W, 122, org.threeten.bp.a.n, 70, 79, 104, 113, 113, 65, 97, 76, 54, 65, org.threeten.bp.a.l, 87, 53, 103, 85, 84, 113, 71, org.threeten.bp.a.n, org.threeten.bp.a.o, 76, SettingsModule.VALUE_TYPE_FLAG, 82, 106, HMDisplaySetting.TYPE_VENICE, org.threeten.bp.a.l, 75, 75, org.threeten.bp.a.o, 98, 55, 84, ISeCommandKt.RPDU_NEED_JUDGE, 115, 122, HMDisplaySetting.TYPE_VENICE, 106, 76, 55, 88, 122, 70, 121, 73, 75, 52, 50, 43, 101, 70, 121, 56, 105, 115, 105, 89, 120, 117, 112, 53, 48, 76, 81, 70, 86, ISeCommandKt.RPDU_NEED_JUDGE, 110, 73, 65, org.threeten.bp.a.l, 74, 65, 83, 119, 65, 119, 83, org.threeten.bp.a.n, 65, 81, org.threeten.bp.a.l, org.threeten.bp.a.l, org.threeten.bp.a.o, 81, 65, 78, 99, 118, 104, 73, RaceType.CMD_NEED_RESP, 111, 75, 74, 89, 81, org.threeten.bp.a.n, 119, 119, 70, 77};
    private static final byte[] c;
    private static final IvParameterSpec d;

    static {
        byte[] bArr = {0, 1, 1, 2, 3, 5, 8, 13, 8, 7, 6, 5, 4, 3, 2, 1};
        c = bArr;
        d = new IvParameterSpec(bArr);
    }

    public static String a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return a("MD5", a("SHA1", str) + str);
                }
            } catch (Throwable th) {
                ei.a(th, "Encrypt", "generatorKey");
            }
        }
        return null;
    }

    public static String a(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            byte[] bArrA = r.a(str2.getBytes("UTF-8"), str);
            int length = bArrA.length;
            StringBuilder sb = new StringBuilder(length * 2);
            for (int i = 0; i < length; i++) {
                char[] cArr = a;
                sb.append(cArr[(bArrA[i] >> 4) & 15]);
                sb.append(cArr[bArrA[i] & 15]);
            }
            return sb.toString();
        } catch (Throwable th) {
            ei.a(th, "Encrypt", "encode");
            return null;
        }
    }

    public static byte[] a(byte[] bArr) throws Exception {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(com.alipay.sdk.m.n.d.a).generatePublic(new X509EncodedKeySpec(dk.a(new StringBuilder(new String(b)).reverse().toString().getBytes())));
        Cipher cipher = Cipher.getInstance(u.c("WUlNBL0VDQi9PQUVQV0lUSFNIQS0xQU5ETUdGMVBBRERJTkc"));
        cipher.init(1, publicKeyGeneratePublic);
        return cipher.doFinal(bArr);
    }

    public static byte[] a(byte[] bArr, String str) {
        try {
            SecretKeySpec secretKeySpecB = b(str);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(u.c());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpecB, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            ei.a(th, "Encrypt", "aesEncrypt");
            return null;
        }
    }

    private static SecretKeySpec b(String str) {
        byte[] bytes;
        if (str == null) {
            str = "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        while (true) {
            stringBuffer.append(str);
            if (stringBuffer.length() >= 16) {
                break;
            }
            str = "0";
        }
        if (stringBuffer.length() > 16) {
            stringBuffer.setLength(16);
        }
        try {
            bytes = stringBuffer.toString().getBytes("UTF-8");
        } catch (Throwable th) {
            ei.a(th, "Encrypt", "createKey");
            bytes = null;
        }
        return new SecretKeySpec(bytes, com.huami.network.hmnetwork.utils.a.a);
    }

    public static byte[] b(byte[] bArr) {
        try {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArr.length - 16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, com.huami.network.hmnetwork.utils.a.a);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(u.c()));
            return cipher.doFinal(bArr3);
        } catch (Throwable th) {
            ei.a(th, "Encrypt", "decryptRsponse length = " + (bArr != null ? bArr.length : 0));
            return null;
        }
    }

    public static byte[] b(byte[] bArr, String str) {
        try {
            SecretKeySpec secretKeySpecB = b(str);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(u.c());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpecB, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            ei.a(th, "Encrypt", "aesDecrypt");
            return null;
        }
    }
}
