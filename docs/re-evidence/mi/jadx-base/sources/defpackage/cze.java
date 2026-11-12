package defpackage;

import cn.hutool.crypto.CryptoException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public interface cze {
    byte[] a();

    int b();

    default byte[] c(InputStream inputStream, int i) {
        if (i < 1) {
            i = 8192;
        }
        byte[] bArr = new byte[i];
        try {
            try {
                int i2 = inputStream.read(bArr, 0, i);
                while (i2 > -1) {
                    update(bArr, 0, i2);
                    i2 = inputStream.read(bArr, 0, i);
                }
                byte[] bArrA = a();
                reset();
                return bArrA;
            } catch (IOException e) {
                throw new CryptoException(e);
            }
        } catch (Throwable th) {
            reset();
            throw th;
        }
    }

    String getAlgorithm();

    void reset();

    void update(byte[] bArr, int i, int i2);
}
