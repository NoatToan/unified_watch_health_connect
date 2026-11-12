package com.xmlywind.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes22.dex */
class d {
    private InputStream a;
    private OutputStream b = null;
    private byte[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public d(InputStream inputStream, int i, int i2) {
        this.a = inputStream;
        a(i, i2);
    }

    private void a(int i, int i2) {
        this.f = i;
        this.g = i2;
        int i3 = i / i2;
        this.h = i3;
        this.c = new byte[i];
        if (this.a != null) {
            this.d = -1;
            this.e = i3;
        } else {
            this.d = 0;
            this.e = 0;
        }
    }

    private boolean e() throws IOException {
        if (this.a == null) {
            throw new IOException("reading from an output buffer");
        }
        this.e = 0;
        int i = this.f;
        int i2 = 0;
        while (i > 0) {
            long j = this.a.read(this.c, i2, i);
            if (j == -1) {
                if (i2 != 0) {
                    Arrays.fill(this.c, i2, i + i2, (byte) 0);
                    break;
                }
                return false;
            }
            i2 = (int) (((long) i2) + j);
            i = (int) (((long) i) - j);
        }
        this.d++;
        return true;
    }

    private void f() throws IOException {
        OutputStream outputStream = this.b;
        if (outputStream == null) {
            throw new IOException("writing to an input buffer");
        }
        outputStream.write(this.c, 0, this.f);
        this.b.flush();
        this.e = 0;
        this.d++;
        Arrays.fill(this.c, (byte) 0);
    }

    public int a() {
        return this.g;
    }

    public boolean a(byte[] bArr) {
        int iA = a();
        for (int i = 0; i < iA; i++) {
            if (bArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public byte[] b() throws IOException {
        if (this.a == null) {
            if (this.b == null) {
                throw new IOException("input buffer is closed");
            }
            throw new IOException("reading from an output buffer");
        }
        if (this.e >= this.h && !e()) {
            return null;
        }
        int i = this.g;
        byte[] bArr = new byte[i];
        System.arraycopy(this.c, this.e * i, bArr, 0, i);
        this.e++;
        return bArr;
    }

    public void c() throws IOException {
        if (this.b == null) {
            throw new IOException("writing to an input buffer");
        }
        if (this.e > 0) {
            f();
        }
    }

    public void d() throws IOException {
        if (this.b == null) {
            InputStream inputStream = this.a;
            if (inputStream != null) {
                if (inputStream != System.in) {
                    inputStream.close();
                }
                this.a = null;
                return;
            }
            return;
        }
        c();
        OutputStream outputStream = this.b;
        if (outputStream == System.out || outputStream == System.err) {
            return;
        }
        outputStream.close();
        this.b = null;
    }
}
