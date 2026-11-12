package it.sauronsoftware.ftp4j;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes22.dex */
class d extends Reader {
    private static final String c = System.getProperty("line.separator");
    private InputStream a;
    private Reader b;

    public d(InputStream inputStream, String str) throws IOException {
        this.a = inputStream;
        this.b = new InputStreamReader(inputStream, str);
    }

    public void a(String str) throws IOException {
        synchronized (this) {
            this.b = new InputStreamReader(this.a, str);
        }
    }

    public String b() throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        int i = -1;
        while (true) {
            int i2 = this.b.read();
            if (i2 == -1) {
                if (stringBuffer.length() == 0) {
                    return null;
                }
                return stringBuffer.toString();
            }
            if (i2 == 10) {
                return stringBuffer.toString();
            }
            if (i == 13 && i2 == 0) {
                stringBuffer.append(c);
            } else if (i2 != 0 && i2 != 13) {
                stringBuffer.append((char) i2);
            }
            i = i2;
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.b.close();
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        synchronized (this) {
            i3 = this.b.read(cArr, i, i2);
        }
        return i3;
    }
}
