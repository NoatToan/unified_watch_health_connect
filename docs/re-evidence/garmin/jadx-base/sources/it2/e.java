package it2;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f94988a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BufferedOutputStream f94989b;

    public e(OutputStream outputStream) {
        if (outputStream != null) {
            this.f94989b = new BufferedOutputStream(outputStream);
        } else {
            h.s("output is null");
            throw null;
        }
    }

    public final void a(int i14, byte[] bArr) throws IOException {
        byte[] bArr2;
        c cVar = this.f94988a;
        cVar.getClass();
        if (bArr == null) {
            h.s("buffer is null");
            return;
        }
        if (i14 < 0) {
            org.apache.commons.lang3.e.v("offset and length must be positive");
            return;
        }
        if (i14 > bArr.length) {
            org.apache.commons.lang3.e.v("offset + length is greater than buffer.length");
            return;
        }
        if (bArr.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i15 = i14 / 254;
            if (i14 % 254 > 0) {
                i15++;
            }
            int i16 = i15 + i14;
            if (cVar.f94982a.length < i16) {
                cVar.f94982a = new byte[i16];
            }
            byte[] bArr3 = cVar.f94982a;
            int i17 = 1;
            int i18 = 1;
            boolean z14 = false;
            int i19 = 0;
            int i24 = 0;
            for (int i25 = 0; i25 < i14; i25++) {
                byte b14 = bArr[i25];
                if (b14 == 0) {
                    bArr3[i19] = (byte) i17;
                    i24++;
                    i17 = 1;
                    i19 = i18;
                    i18++;
                } else {
                    int i26 = i18 + 1;
                    bArr3[i18] = b14;
                    int i27 = i24 + 1;
                    i17++;
                    if (i17 == 255) {
                        bArr3[i19] = (byte) i17;
                        i24 += 2;
                        i18 += 2;
                        z14 = true;
                        i17 = 1;
                        i19 = i26;
                    } else {
                        i24 = i27;
                        i18 = i26;
                    }
                }
                z14 = false;
            }
            if (!z14) {
                bArr3[i19] = (byte) i17;
                i24++;
            }
            bArr2 = new byte[i24];
            System.arraycopy(bArr3, 0, bArr2, 0, i24);
        }
        BufferedOutputStream bufferedOutputStream = this.f94989b;
        bufferedOutputStream.write(0);
        bufferedOutputStream.write(bArr2);
        bufferedOutputStream.write(0);
        bufferedOutputStream.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f94989b.close();
    }
}
