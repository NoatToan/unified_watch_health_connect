package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.hw;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes12.dex */
public abstract class df {
    public static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (-1 == i) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        a(byteArrayOutputStream);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    hw.c(com.huawei.hms.ads.uiengineloader.aj.f12896a, "read stream ex: %s", th.getClass().getSimpleName());
                    return null;
                } finally {
                    a(byteArrayOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                hw.c(com.huawei.hms.ads.uiengineloader.aj.f12896a, "close HttpURLConnection Exception:" + th.getClass().getSimpleName());
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                hw.c(com.huawei.hms.ads.uiengineloader.aj.f12896a, "close " + th.getClass().getSimpleName());
            }
        }
    }

    public static String a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    static String a() {
        return "818f41d42d2b7048a92678b7309e0f04a60a6dd9562b567d3de93f849e5a4c31";
    }
}
