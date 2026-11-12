package com.ximalaya.ting.android.player;

/* JADX INFO: loaded from: classes22.dex */
public class MediadataCrytoUtil {
    public static int ENCRYPT_DATA_LENGTH = 1024;
    private static MediadataCrytoUtil mInstance;
    private long ctx = initLogistic();

    static {
        try {
            System.loadLibrary("mediadatacryto");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private MediadataCrytoUtil() {
    }

    private native byte[] decryptData(long j, byte[] bArr, int i);

    private native void destroyEncryptCtx(long j);

    private native byte[] encryptData(long j, byte[] bArr, int i);

    public static synchronized MediadataCrytoUtil getInstance() {
        if (mInstance == null) {
            mInstance = new MediadataCrytoUtil();
        }
        return mInstance;
    }

    private native long initLogistic();

    public static void release() {
        MediadataCrytoUtil mediadataCrytoUtil = mInstance;
        if (mediadataCrytoUtil != null) {
            mediadataCrytoUtil.destroyEncryptCtx(mediadataCrytoUtil.ctx);
            mInstance = null;
        }
    }

    public byte[] decryptData(byte[] bArr) {
        return decryptData(this.ctx, bArr, bArr.length);
    }

    public byte[] encryptData(byte[] bArr) {
        return encryptData(this.ctx, bArr, bArr.length);
    }
}
