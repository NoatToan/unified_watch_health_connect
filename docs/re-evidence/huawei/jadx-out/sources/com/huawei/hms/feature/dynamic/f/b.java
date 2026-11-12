package com.huawei.hms.feature.dynamic.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f13180a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f13181b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String b(byte[] bArr, boolean z) {
        return new String(a(bArr, z));
    }

    private static char[] a(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            cArr2[i] = cArr[(b2 & 240) >>> 4];
            cArr2[i + 1] = cArr[b2 & 15];
            i2++;
            i += 2;
        }
        return cArr2;
    }

    public static char[] a(byte[] bArr, boolean z) {
        return a(bArr, z ? f13181b : f13180a);
    }

    public static char[] a(byte[] bArr) {
        return a(bArr, false);
    }
}
