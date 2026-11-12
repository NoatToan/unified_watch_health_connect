package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class wa4 {
    public static byte[] a(String str) throws IOException {
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bytes.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream, bytes.length);
        gZIPOutputStream.write(bytes);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static String b(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr), bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length * 2);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2, 0, 1024);
            if (i <= 0) {
                return byteArrayOutputStream.toString();
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
    }
}
