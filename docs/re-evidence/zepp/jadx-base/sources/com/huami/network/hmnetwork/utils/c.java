package com.huami.network.hmnetwork.utils;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
class c extends FilterOutputStream {
    private int a;
    private int b;
    private boolean c;

    private c(OutputStream outputStream) {
        super(outputStream);
        this.c = true;
    }

    public static String a(byte[] bArr) {
        return b(bArr, true);
    }

    public static String b(byte[] bArr, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) (((double) bArr.length) * 1.4d));
        c cVar = new c(byteArrayOutputStream, z);
        try {
            try {
                cVar.write(bArr);
                try {
                    cVar.close();
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            try {
                cVar.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = this.a;
        if (i % 3 == 1) {
            ((FilterOutputStream) this).out.write(a.d[(this.b << 4) & 63]);
            ((FilterOutputStream) this).out.write(61);
            ((FilterOutputStream) this).out.write(61);
        } else if (i % 3 == 2) {
            ((FilterOutputStream) this).out.write(a.d[(this.b << 2) & 63]);
            ((FilterOutputStream) this).out.write(61);
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        if (i < 0) {
            i += 256;
        }
        int i2 = this.a;
        if (i2 % 3 == 0) {
            this.b = i & 3;
            ((FilterOutputStream) this).out.write(a.d[i >> 2]);
        } else if (i2 % 3 == 1) {
            int i3 = ((this.b << 4) + (i >> 4)) & 63;
            this.b = i & 15;
            ((FilterOutputStream) this).out.write(a.d[i3]);
        } else if (i2 % 3 == 2) {
            int i4 = ((this.b << 2) + (i >> 6)) & 63;
            OutputStream outputStream = ((FilterOutputStream) this).out;
            char[] cArr = a.d;
            outputStream.write(cArr[i4]);
            ((FilterOutputStream) this).out.write(cArr[i & 63]);
            this.b = 0;
        }
        int i5 = this.a + 1;
        this.a = i5;
        if (this.c && i5 % 57 == 0) {
            ((FilterOutputStream) this).out.write(10);
        }
    }

    private c(OutputStream outputStream, boolean z) {
        this(outputStream);
        this.c = z;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            write(bArr[i + i3]);
        }
    }
}
