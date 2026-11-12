package com.xiaomi.hm.health.utils;

import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import java.io.UnsupportedEncodingException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes22.dex */
public class AESHelper {
    private static final AESHelper c = new AESHelper(DeviceXFunctionsKt.getContext().getString(R.string.ccb));
    private Cipher a;
    private Cipher b;

    private AESHelper(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            bytes = null;
        }
        byte[] bArr = new byte[16];
        for (int i = 0; i < bytes.length && i < 16; i++) {
            bArr[i] = bytes[i];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, com.huami.network.hmnetwork.utils.a.a);
        try {
            Cipher cipher = Cipher.getInstance(com.huami.network.hmnetwork.utils.a.a);
            this.a = cipher;
            cipher.init(1, secretKeySpec);
            Cipher cipher2 = Cipher.getInstance(com.huami.network.hmnetwork.utils.a.a);
            this.b = cipher2;
            cipher2.init(2, secretKeySpec);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static AESHelper getInstance() {
        return c;
    }

    public byte[] decrypt(byte[] bArr) {
        try {
            return this.b.doFinal(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] encrypt(String str) {
        try {
            return this.a.doFinal(str.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
