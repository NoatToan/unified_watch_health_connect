package com.huawei.appgallery.marketinstallerservice.b.b.e;

import defpackage.bir;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes23.dex */
public abstract class a {
    public static byte[] a(byte[] bArr) throws Throwable {
        DataOutputStream dataOutputStream;
        if (bArr == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = null;
        dataOutputStream2 = null;
        dataOutputStream2 = null;
        try {
            try {
                try {
                    dataOutputStream = new DataOutputStream(new GZIPOutputStream(byteArrayOutputStream, bArr.length));
                    try {
                        int length = bArr.length;
                        dataOutputStream.write(bArr, 0, length);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        dataOutputStream2 = length;
                    } catch (IOException e) {
                        e = e;
                        dataOutputStream2 = dataOutputStream;
                        bir.d("GZIPUtil", "gzip error!", e);
                        if (dataOutputStream2 != null) {
                            dataOutputStream2.close();
                            dataOutputStream2 = dataOutputStream2;
                        }
                        return byteArrayOutputStream.toByteArray();
                    } catch (Throwable th) {
                        th = th;
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException e2) {
                                bir.d("GZIPUtil", "", e2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    bir.d("GZIPUtil", "", e3);
                }
            } catch (IOException e4) {
                e = e4;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = dataOutputStream2;
        }
    }
}
