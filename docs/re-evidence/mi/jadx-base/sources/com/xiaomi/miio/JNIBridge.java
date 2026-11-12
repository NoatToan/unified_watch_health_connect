package com.xiaomi.miio;

/* JADX INFO: loaded from: classes11.dex */
public class JNIBridge {

    public static class MiioMsg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f13588a;
    }

    static {
        System.loadLibrary("miio");
    }

    public static native MiioMsg bledecrypt(byte[] bArr, byte[] bArr2);

    public static native MiioMsg decrypt(byte[] bArr, byte[] bArr2);

    public static native byte[] encrypt(MiioMsg miioMsg);

    public static native MiioMsg hdecrypt(byte[] bArr);

    public static native byte[] hencrypt(MiioMsg miioMsg);

    public static native byte[] smencrypt(byte[] bArr, long j);

    public static native byte[] smencryptpk(byte[] bArr, long j, byte[] bArr2);
}
