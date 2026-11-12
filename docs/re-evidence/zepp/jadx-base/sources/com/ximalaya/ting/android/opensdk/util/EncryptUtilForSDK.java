package com.ximalaya.ting.android.opensdk.util;

import android.content.Context;
import com.ximalaya.ting.paydecrypt.PayUtil;

/* JADX INFO: loaded from: classes22.dex */
public class EncryptUtilForSDK {
    private static EncryptUtilForSDK mInstance;
    private Context mContext;

    static {
        try {
            System.loadLibrary("xmopendatacrypto");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static synchronized EncryptUtilForSDK getInstance() {
        if (mInstance == null) {
            synchronized (EncryptUtilForSDK.class) {
                if (mInstance == null) {
                    mInstance = new EncryptUtilForSDK();
                }
            }
        }
        return mInstance;
    }

    public static void release() {
        mInstance = null;
    }

    public byte[] decryptByKey2(byte[] bArr, String str) {
        byte[] bArr2 = new byte[0];
        try {
            return decryptByPublicKey2(this.mContext, bArr, PayUtil.getKey0(str), PayUtil.getKey1(str), this.mContext.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return bArr2;
        }
    }

    public native byte[] decryptByPublicKey2(Context context, byte[] bArr, String str, String str2, String str3) throws Exception;

    public native String decryptRc4ByPublicKey(Context context, String str, String str2, String str3) throws Exception;

    public String decryptRc4ByPublicKeyJava(String str, String str2) {
        try {
            return decryptRc4ByPublicKey(this.mContext, str, PayUtil.getName1(str2), this.mContext.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void init(Context context) {
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
    }
}
