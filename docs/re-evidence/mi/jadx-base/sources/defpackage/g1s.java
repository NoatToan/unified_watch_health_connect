package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes8.dex */
public class g1s {
    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater();
        deflater.reset();
        deflater.setInput(bArr);
        deflater.finish();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        try {
            try {
                try {
                    byte[] bArr2 = new byte[1024];
                    while (!deflater.finished()) {
                        byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    byteArrayOutputStream.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            deflater.end();
            return bArr;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            throw th;
        }
    }
}
