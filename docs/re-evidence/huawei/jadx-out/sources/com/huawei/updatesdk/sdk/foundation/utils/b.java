package com.huawei.updatesdk.sdk.foundation.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes20.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29897b = 1024;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29898c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f29896a = new byte[1024];

    public void a(byte[] bArr, int i) {
        if (i <= 0) {
            return;
        }
        byte[] bArr2 = this.f29896a;
        int length = bArr2.length;
        int i2 = this.f29898c;
        if (length - i2 >= i) {
            System.arraycopy(bArr, 0, bArr2, i2, i);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            System.arraycopy(bArr, 0, bArr3, this.f29898c, i);
            this.f29896a = bArr3;
        }
        this.f29898c += i;
    }

    public String a() {
        int i = this.f29898c;
        if (i <= 0) {
            return null;
        }
        try {
            return new String(this.f29896a, 0, i, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            cArr2[i] = cArr[(b2 >>> 4) & 15];
            cArr2[i + 1] = cArr[b2 & 15];
            i2++;
            i += 2;
        }
        return String.valueOf(cArr2);
    }
}
