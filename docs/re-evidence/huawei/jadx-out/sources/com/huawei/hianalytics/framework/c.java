package com.huawei.hianalytics.framework;

import com.huawei.hianalytics.framework.config.CipherType;
import com.huawei.hianalytics.framework.config.IMandatoryParameters;
import com.huawei.secure.android.common.encrypt.aes.AesCbc;
import com.huawei.secure.android.common.encrypt.aes.AesGcm;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static String a(String str, IMandatoryParameters iMandatoryParameters) {
        if (iMandatoryParameters == null) {
            return "";
        }
        byte[] loadWorkKey = iMandatoryParameters.getLoadWorkKey();
        String cipherType = iMandatoryParameters.getCipherType();
        cipherType.getClass();
        if (cipherType.equals(CipherType.AES_CBC)) {
            return AesCbc.encrypt(str, loadWorkKey);
        }
        if (!cipherType.equals(CipherType.AES_GCM)) {
            return "";
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        long mostSignificantBits = uuidRandomUUID.getMostSignificantBits();
        long leastSignificantBits = uuidRandomUUID.getLeastSignificantBits();
        byte[] bArr = new byte[12];
        for (int i = 0; i < 8; i++) {
            int i2 = (7 - i) * 8;
            bArr[i] = (byte) ((mostSignificantBits >>> i2) & 255);
            int i3 = i + 8;
            if (i3 < 12) {
                bArr[i3] = (byte) ((leastSignificantBits >>> i2) & 255);
            }
        }
        return HexUtil.byteArray2HexStr(bArr) + AesGcm.encrypt(str, loadWorkKey, bArr);
    }
}
