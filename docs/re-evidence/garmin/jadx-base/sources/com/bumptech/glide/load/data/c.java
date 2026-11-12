package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f28538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f28539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi.b f28540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28541d;

    public c(OutputStream outputStream, xi.b bVar, int i14) {
        this.f28538a = outputStream;
        this.f28540c = bVar;
        this.f28539b = (byte[]) bVar.c(i14, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.f28538a;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f28539b;
            if (bArr != null) {
                this.f28540c.put(bArr);
                this.f28539b = null;
            }
        } catch (Throwable th3) {
            outputStream.close();
            throw th3;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i14 = this.f28541d;
        OutputStream outputStream = this.f28538a;
        if (i14 > 0) {
            outputStream.write(this.f28539b, 0, i14);
            this.f28541d = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i14, int i15) throws IOException {
        int i16 = 0;
        do {
            int i17 = i15 - i16;
            int i18 = i14 + i16;
            int i19 = this.f28541d;
            OutputStream outputStream = this.f28538a;
            if (i19 == 0 && i17 >= this.f28539b.length) {
                outputStream.write(bArr, i18, i17);
                return;
            }
            int iMin = Math.min(i17, this.f28539b.length - i19);
            System.arraycopy(bArr, i18, this.f28539b, this.f28541d, iMin);
            int i24 = this.f28541d + iMin;
            this.f28541d = i24;
            i16 += iMin;
            byte[] bArr2 = this.f28539b;
            if (i24 == bArr2.length && i24 > 0) {
                outputStream.write(bArr2, 0, i24);
                this.f28541d = 0;
            }
        } while (i16 < i15);
    }

    public c(OutputStream outputStream, xi.b bVar) {
        this(outputStream, bVar, 65536);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i14) throws IOException {
        byte[] bArr = this.f28539b;
        int i15 = this.f28541d;
        int i16 = i15 + 1;
        this.f28541d = i16;
        bArr[i15] = (byte) i14;
        if (i16 != bArr.length || i16 <= 0) {
            return;
        }
        this.f28538a.write(bArr, 0, i16);
        this.f28541d = 0;
    }
}
