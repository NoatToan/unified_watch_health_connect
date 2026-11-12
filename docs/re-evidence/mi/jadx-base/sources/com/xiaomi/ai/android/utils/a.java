package com.xiaomi.ai.android.utils;

import defpackage.mj1;
import defpackage.wpe;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static long a(mj1 mj1Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long length = (mj1Var == null || mj1Var.size() <= 0) ? 0L : mj1Var.toString().getBytes().length;
        wpe.b("CommonUtils", "getArrayLength : " + length + " ,time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return length;
    }

    public static String a(byte[] bArr, String str) {
        if (bArr != null && bArr.length != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                byte[] bArr2 = new byte[256];
                while (true) {
                    int i = gZIPInputStream.read(bArr2);
                    if (i < 0) {
                        return byteArrayOutputStream.toString(str);
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                }
            } catch (IOException e) {
                wpe.c("CommonUtils", "gzip uncompress error." + e.getMessage(), false);
            }
        }
        return null;
    }

    public static byte[] a(String str, String str2) {
        if (str == null || str.length() == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(str2));
            gZIPOutputStream.close();
        } catch (IOException e) {
            wpe.c("CommonUtils", "gzipOutputStream compress error." + e.getMessage(), false);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
