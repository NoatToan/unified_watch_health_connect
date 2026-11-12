package com.baidu.ocr.sdk.jni;

import android.content.Context;
import com.baidu.ocr.sdk.exception.SDKError;

/* JADX INFO: loaded from: classes2.dex */
public class JniInterface {
    private static Throwable loadLibraryError;

    static {
        try {
            System.loadLibrary("ocr-sdk");
            loadLibraryError = null;
        } catch (Throwable th) {
            loadLibraryError = th;
        }
    }

    public static Throwable getLoadLibraryError() {
        return loadLibraryError;
    }

    public native String getToken(Context context);

    public native String getTokenFromLicense(Context context, byte[] bArr, int i);

    public native byte[] init(Context context, String str);

    public native byte[] initWithBin(Context context, String str) throws SDKError;

    public native byte[] initWithBinLic(Context context, String str, String str2) throws SDKError;
}
