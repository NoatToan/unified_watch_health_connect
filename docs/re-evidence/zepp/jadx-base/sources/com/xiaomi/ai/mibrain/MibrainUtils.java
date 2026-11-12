package com.xiaomi.ai.mibrain;

/* JADX INFO: loaded from: classes18.dex */
public class MibrainUtils {
    static {
        Mibrainsdk.loadMibrainLibs();
    }

    public static native String base64(byte[] bArr);

    public static native String sha1(byte[] bArr);
}
