package com.huawei.wisecloud.drmclient.utils;

import com.huawei.wisecloud.drmclient.exception.HwDrmException;
import com.huawei.wisecloud.drmclient.log.HwDrmLog;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes20.dex */
public class AESUtil {
    private static final String AES_ALGORITHM_NAME = "AES";
    private static final String AES_CBC = "AES/CBC/PKCS5Padding";
    private static final String AES_ECB = "AES/ECB/PKCS5Padding";
    private static final String AES_GCM = "AES/GCM/NoPadding";
    private static final int AES_GCM_DEFAULT_TAG_LENGTH = 128;
    private static final String AES_OFB = "AES/OFB/PKCS5Padding";
    private static final String AES_OFB_NO_PADDING = "AES/OFB/NoPadding";
    private static final String TAG = "AESUtil";

    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws HwDrmException {
        byte b2;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, AES_ALGORITHM_NAME);
            Cipher cipher = Cipher.getInstance(str);
            switch (str.hashCode()) {
                case -1593046894:
                    if (!str.equals(AES_CBC)) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case -1183691157:
                    if (!str.equals(AES_OFB)) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case -601004814:
                    if (!str.equals(AES_ECB)) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 64687:
                    if (!str.equals(AES_ALGORITHM_NAME)) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case 403528690:
                    if (!str.equals(AES_GCM)) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 1030148556:
                    if (!str.equals(AES_OFB_NO_PADDING)) {
                        b2 = -1;
                    } else {
                        b2 = 5;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                cipher.init(2, secretKeySpec);
                return cipher.doFinal(bArr);
            }
            if (b2 == 1 || b2 == 2) {
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                return cipher.doFinal(bArr);
            }
            if (b2 == 3) {
                cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr3));
                return cipher.doFinal(bArr);
            }
            if (b2 == 4) {
                cipher.init(2, secretKeySpec);
                return cipher.doFinal(bArr);
            }
            if (b2 == 5) {
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                return cipher.doFinal(bArr);
            }
            throw new HwDrmException(logErrorMsg("unsupported AES algorithm" + str));
        } catch (Exception e) {
            HwDrmLog.e(TAG, "fail to decrypt, NoSuchAlgorithmException :" + HwDrmLog.printException(e));
            throw new HwDrmException(logErrorMsg("fail to decrypt, NoSuchAlgorithmException :"));
        }
    }

    private static String logErrorMsg(String str) {
        HwDrmLog.e(TAG, str);
        return str;
    }
}
