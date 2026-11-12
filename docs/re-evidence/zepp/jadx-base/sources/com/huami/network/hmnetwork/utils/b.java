package com.huami.network.hmnetwork.utils;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
class b extends FilterInputStream {
    private static final int[] c = new int[128];
    private int a;
    private int b;

    static {
        for (int i = 0; i < 64; i++) {
            c[a.d[i]] = i;
        }
    }

    private b(InputStream inputStream) {
        super(inputStream);
    }

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? "" : new String(b(str));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] b(String str) {
        byte[] bytes = str.getBytes();
        b bVar = new b(new ByteArrayInputStream(bytes));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) (((double) bytes.length) * 0.75d));
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = bVar.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
                try {
                    bVar.close();
                } catch (IOException unused) {
                }
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException unused2) {
                    throw th;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                bVar.close();
            } catch (IOException unused3) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused4) {
            }
            return byteArray;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        do {
            i = ((FilterInputStream) this).in.read();
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace((char) i));
        int i2 = this.a + 1;
        this.a = i2;
        if (i == 61) {
            return -1;
        }
        int i3 = c[i];
        int i4 = (i2 - 1) % 4;
        if (i4 == 0) {
            this.b = i3 & 63;
            return read();
        }
        if (i4 == 1) {
            int i5 = ((this.b << 2) + (i3 >> 4)) & 255;
            this.b = i3 & 15;
            return i5;
        }
        if (i4 == 2) {
            int i6 = ((this.b << 4) + (i3 >> 2)) & 255;
            this.b = i3 & 3;
            return i6;
        }
        if (i4 == 3) {
            return ((this.b << 6) + i3) & 255;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr.length < (i2 + i) - 1) {
            throw new IOException("The input buffer is too small: " + i2 + " bytes requested starting at offset " + i + " while the buffer  is only " + bArr.length + " bytes long.");
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = read();
            if (i4 == -1 && i3 == 0) {
                return -1;
            }
            if (i4 == -1) {
                break;
            }
            bArr[i + i3] = (byte) i4;
            i3++;
        }
        return i3;
    }
}
