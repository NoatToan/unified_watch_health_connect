package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.hw;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class db {
    public static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            hw.d("Sha256Util", "sha256 NoSuchAlgorithmException");
            return new byte[0];
        }
    }

    public static String a(String str) {
        if (dg.b(str)) {
            return "";
        }
        try {
            return ar.a(a(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            hw.c("Sha256Util", "digest UnsupportedEncodingException");
            return "";
        }
    }

    private static String a(InputStream inputStream) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bArr = new byte[8192];
        boolean z = false;
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                break;
            }
            messageDigest.update(bArr, 0, i);
            z = true;
        }
        if (z) {
            return ar.a(messageDigest.digest());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    public static String a(File file) throws Throwable {
        FileInputStream fileInputStream;
        ?? r0 = 0;
        if (file != null) {
            ?? D = ai.d(file);
            try {
                if (D != 0) {
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            String strA = a(fileInputStream);
                            df.a((Closeable) fileInputStream);
                            return strA;
                        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
                            hw.c("Sha256Util", "fail to get file sha256");
                            df.a((Closeable) fileInputStream);
                            return null;
                        }
                    } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused2) {
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        df.a((Closeable) r0);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0 = D;
            }
        }
        return null;
    }
}
