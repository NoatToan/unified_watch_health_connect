package com.autonavi.aps.amapapi.security;

import com.autonavi.aps.amapapi.utils.c;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miuipub.internal.hybrid.SignUtils;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.jbt;
import defpackage.m0t;
import defpackage.p0t;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f6875a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f6876b = {Base64.padSymbol, Base64.padSymbol, 81, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 69, 119, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 67, 48, 74, SettingsModule.VALUE_TYPE_FLAG, 115, 116, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, 75, 104, 76, 122, APDUConstants.TAG_MORE_DATA, 88, 99, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, 71, 49, 122, 68, 70, 79, 104, 113, 113, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, APDUConstants.TAG_MORE_DATA, 76, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 87, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, 103, 85, 84, 113, 71, 68, 69, 76, SettingsModule.VALUE_TYPE_FLAG, 82, 106, 51, 66, 75, 75, 69, 98, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, 84, 108, 115, 122, 51, 106, 76, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, 88, 122, 70, 121, 73, 75, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, 101, 70, 121, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, 105, 115, 105, 89, 120, 117, 112, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, 48, 76, 81, 70, 86, 108, 110, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 74, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 83, 119, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 119, 83, 68, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 81, 66, 66, 69, 81, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 99, 118, 104, 73, 90, 111, 75, 74, 89, 81, 68, 119, 119, 70, 77};
    private static final byte[] c;
    private static final IvParameterSpec d;

    static {
        byte[] bArr = {0, 1, 1, 2, 3, 5, 8, HMProSyncDataBaseProfile.DATA_TYPE_PAI, 8, 7, 6, 5, 4, 3, 2, 1};
        c = bArr;
        d = new IvParameterSpec(bArr);
    }

    public static byte[] a(byte[] bArr) throws Exception {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(SignUtils.KEY_RSA).generatePublic(new X509EncodedKeySpec(jbt.a(new StringBuilder(new String(f6876b)).reverse().toString().getBytes())));
        Cipher cipher = Cipher.getInstance(p0t.t("WUlNBL0VDQi9PQUVQV0lUSFNIQS0xQU5ETUdGMVBBRERJTkc"));
        cipher.init(1, publicKeyGeneratePublic);
        return cipher.doFinal(bArr);
    }

    public static byte[] b(byte[] bArr, String str) {
        try {
            SecretKeySpec secretKeySpecB = b(str);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpecB, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            c.a(th, "Encrypt", "aesDecrypt");
            return null;
        }
    }

    private static String c(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            char[] cArr = f6875a;
            sb.append(cArr[(bArr[i] >> 4) & 15]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    private static SecretKeySpec b(String str) {
        byte[] bytes;
        if (str == null) {
            str = "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(str);
        while (stringBuffer.length() < 16) {
            stringBuffer.append("0");
        }
        if (stringBuffer.length() > 16) {
            stringBuffer.setLength(16);
        }
        try {
            bytes = stringBuffer.toString().getBytes("UTF-8");
        } catch (Throwable th) {
            c.a(th, "Encrypt", "createKey");
            bytes = null;
        }
        return new SecretKeySpec(bytes, "AES");
    }

    public static byte[] a(byte[] bArr, String str) {
        try {
            SecretKeySpec secretKeySpecB = b(str);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpecB, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            c.a(th, "Encrypt", "aesEncrypt");
            return null;
        }
    }

    public static String a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return a(Coder.KEY_MD5, a("SHA1", str) + str);
                }
            } catch (Throwable th) {
                c.a(th, "Encrypt", "generatorKey");
            }
        }
        return null;
    }

    public static byte[] b(byte[] bArr) {
        try {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArr.length - 16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(p0t.u()));
            return cipher.doFinal(bArr3);
        } catch (Throwable th) {
            c.a(th, "Encrypt", "decryptRsponse length = ".concat(String.valueOf(bArr != null ? bArr.length : 0)));
            return null;
        }
    }

    public static String a(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            return c(m0t.c(str2.getBytes("UTF-8"), str));
        } catch (Throwable th) {
            c.a(th, "Encrypt", "encode");
            return null;
        }
    }

    private static byte[] a() {
        return p0t.u();
    }
}
