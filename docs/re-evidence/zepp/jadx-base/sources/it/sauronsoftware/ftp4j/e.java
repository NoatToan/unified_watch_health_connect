package it.sauronsoftware.ftp4j;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes22.dex */
class e extends Writer {
    private static final String c = "\r\n";
    private OutputStream a;
    private Writer b;

    public e(OutputStream outputStream, String str) throws IOException {
        this.a = outputStream;
        this.b = new OutputStreamWriter(outputStream, str);
    }

    public void a(String str) throws IOException {
        synchronized (this) {
            this.b = new OutputStreamWriter(this.a, str);
        }
    }

    public void b(String str) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\r\n");
        int iCountTokens = stringTokenizer.countTokens();
        boolean z = false;
        for (int i = 0; i < iCountTokens; i++) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.length() > 0) {
                if (z) {
                    stringBuffer.append('\r');
                    stringBuffer.append((char) 0);
                }
                stringBuffer.append(strNextToken);
                z = true;
            }
        }
        if (stringBuffer.length() > 0) {
            this.b.write(stringBuffer.toString());
            this.b.write("\r\n");
            this.b.flush();
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.b.close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        synchronized (this) {
            this.b.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        synchronized (this) {
            this.b.write(cArr, i, i2);
        }
    }
}
