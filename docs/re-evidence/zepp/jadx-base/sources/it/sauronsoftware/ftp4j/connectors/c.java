package it.sauronsoftware.ftp4j.connectors;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes22.dex */
class c extends OutputStream {
    private OutputStream a;
    private int b;
    private int c;
    private int d;
    private int e;

    public c(OutputStream outputStream) {
        this(outputStream, 76);
    }

    public void a() throws IOException {
        if (this.c > 0) {
            int i = this.e;
            if (i > 0 && this.d == i) {
                this.a.write("\r\n".getBytes());
                this.d = 0;
            }
            char cCharAt = a.a.charAt((this.b << 8) >>> 26);
            char cCharAt2 = a.a.charAt((this.b << 14) >>> 26);
            char cCharAt3 = this.c < 2 ? a.b : a.a.charAt((this.b << 20) >>> 26);
            char cCharAt4 = this.c < 3 ? a.b : a.a.charAt((this.b << 26) >>> 26);
            this.a.write(cCharAt);
            this.a.write(cCharAt2);
            this.a.write(cCharAt3);
            this.a.write(cCharAt4);
            this.d += 4;
            this.c = 0;
            this.b = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
        this.a.close();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        int i2 = this.c;
        this.b = ((i & 255) << (16 - (i2 * 8))) | this.b;
        int i3 = i2 + 1;
        this.c = i3;
        if (i3 == 3) {
            a();
        }
    }

    public c(OutputStream outputStream, int i) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.a = outputStream;
        this.e = i;
    }
}
