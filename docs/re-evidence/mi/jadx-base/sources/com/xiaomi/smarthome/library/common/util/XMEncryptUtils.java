package com.xiaomi.smarthome.library.common.util;

import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.library.crypto.Base64Coder;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class XMEncryptUtils {
    private static final byte[] KEY = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 105, 20, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, 72, HMProSyncDataBaseProfile.DATA_SPO2_OSA, 72, APDUConstants.TAG_MORE_DATA, 22, APDUConstants.TAG_MORE_DATA, 21, 121, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_SPO2_POINT, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, 3};
    private static final byte[] IV = {100, 23, 84, 114, 72, 0, 4, APDUConstants.TAG_MORE_DATA, 73, APDUConstants.TAG_MORE_DATA, 2, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, 84, 102, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 32};

    public static String decrypt(String str, String str2) {
        int length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2 != null ? StringUtil.hexStringToByteArray(str2) : KEY, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(IV));
            str.getBytes("UTF-8");
            byte[] bArrDecode = Base64Coder.decode(str);
            byte[] bArrUpdate = cipher.update(bArrDecode, 0, bArrDecode.length);
            byte[] bArrDoFinal = cipher.doFinal();
            int length2 = (bArrUpdate == null ? 0 : bArrUpdate.length) + (bArrDoFinal == null ? 0 : bArrDoFinal.length);
            if (length2 <= 0) {
                return null;
            }
            byte[] bArr = new byte[length2];
            if (bArrUpdate != null) {
                System.arraycopy(bArrUpdate, 0, bArr, 0, bArrUpdate.length);
                length = bArrUpdate.length;
            } else {
                length = 0;
            }
            if (bArrDoFinal != null) {
                System.arraycopy(bArrDoFinal, 0, bArr, length, bArrDoFinal.length);
            }
            return new String(bArr, "UTF-8");
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public static String encrypt(String str, String str2) throws Exception {
        SecretKeySpec secretKeySpec;
        if (str2 != null) {
            byte[] bArr = new byte[16];
            System.arraycopy(StringUtil.hexStringToByteArray(str2), 0, bArr, 0, 16);
            secretKeySpec = new SecretKeySpec(bArr, "AES");
        } else {
            secretKeySpec = new SecretKeySpec(KEY, "AES");
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(IV));
        return String.valueOf(Base64Coder.encode(cipher.doFinal(str.getBytes("UTF-8"))));
    }
}
