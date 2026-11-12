package com.huawei.hihealth.util;

import health.compact.a.util.LogUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class HiZipUtil {
    public static String a(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(str.getBytes("utf-8"));
            return byteArrayOutputStream.toString(str);
        } finally {
            c(gZIPOutputStream);
            byteArrayOutputStream.toString("ISO-8859-1");
            c(byteArrayOutputStream);
        }
    }

    public static String d(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        try {
            byte[] bArr = new byte[256];
            while (true) {
                int i = gZIPInputStream.read(bArr);
                if (i >= 0) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    c(gZIPInputStream);
                    String string = byteArrayOutputStream.toString("utf-8");
                    c(byteArrayInputStream);
                    c(byteArrayOutputStream);
                    return string;
                }
            }
        } catch (Throwable th) {
            c(gZIPInputStream);
            byteArrayOutputStream.toString("utf-8");
            c(byteArrayInputStream);
            c(byteArrayOutputStream);
            throw th;
        }
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                LogUtil.c("HiZipUtil", "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }
}
