package org.apache.commons.io.input;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.Charsets;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes23.dex */
public class ReversedLinesFileReader implements Closeable {
    private final int a;
    private final Charset b;
    private final RandomAccessFile c;
    private final long d;
    private final long e;
    private final byte[][] f;
    private final int g;
    private final int h;
    private b i;
    private boolean j;

    public class b {
        private final long a;
        private final byte[] b;
        private byte[] c;
        private int d;

        private void c() {
            int i = this.d + 1;
            if (i > 0) {
                byte[] bArr = new byte[i];
                this.c = bArr;
                System.arraycopy(this.b, 0, bArr, 0, i);
            } else {
                this.c = null;
            }
            this.d = -1;
        }

        private int d(byte[] bArr, int i) {
            for (byte[] bArr2 : ReversedLinesFileReader.this.f) {
                boolean z = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i + length) - (bArr2.length - 1);
                    z &= length2 >= 0 && bArr[length2] == bArr2[length];
                }
                if (z) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String e() throws IOException {
            String str;
            byte[] bArr;
            boolean z = this.a == 1;
            int i = this.d;
            while (true) {
                if (i > -1) {
                    if (z || i >= ReversedLinesFileReader.this.g) {
                        int iD = d(this.b, i);
                        if (iD > 0) {
                            int i2 = i + 1;
                            int i3 = (this.d - i2) + 1;
                            if (i3 < 0) {
                                throw new IllegalStateException("Unexpected negative line length=" + i3);
                            }
                            byte[] bArr2 = new byte[i3];
                            System.arraycopy(this.b, i2, bArr2, 0, i3);
                            str = new String(bArr2, ReversedLinesFileReader.this.b);
                            this.d = i - iD;
                            break;
                        }
                        i -= ReversedLinesFileReader.this.h;
                        if (i < 0) {
                            c();
                        }
                    } else {
                        c();
                    }
                }
                str = null;
                break;
            }
            if (!z || (bArr = this.c) == null) {
                return str;
            }
            String str2 = new String(bArr, ReversedLinesFileReader.this.b);
            this.c = null;
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b f() throws IOException {
            if (this.d > -1) {
                throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.d);
            }
            long j = this.a;
            if (j > 1) {
                ReversedLinesFileReader reversedLinesFileReader = ReversedLinesFileReader.this;
                return reversedLinesFileReader.new b(j - 1, reversedLinesFileReader.a, this.c);
            }
            if (this.c == null) {
                return null;
            }
            throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.c, ReversedLinesFileReader.this.b));
        }

        private b(long j, int i, byte[] bArr) throws IOException {
            this.a = j;
            byte[] bArr2 = new byte[(bArr != null ? bArr.length : 0) + i];
            this.b = bArr2;
            long j2 = (j - 1) * ((long) ReversedLinesFileReader.this.a);
            if (j > 0) {
                ReversedLinesFileReader.this.c.seek(j2);
                if (ReversedLinesFileReader.this.c.read(bArr2, 0, i) != i) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i, bArr.length);
            }
            this.d = bArr2.length - 1;
            this.c = null;
        }
    }

    @Deprecated
    public ReversedLinesFileReader(File file) throws IOException {
        this(file, 4096, Charset.defaultCharset());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c.close();
    }

    public String readLine() throws IOException {
        String strE = this.i.e();
        while (strE == null) {
            b bVarF = this.i.f();
            this.i = bVarF;
            if (bVarF == null) {
                break;
            }
            strE = bVarF.e();
        }
        if (!"".equals(strE) || this.j) {
            return strE;
        }
        this.j = true;
        return readLine();
    }

    public ReversedLinesFileReader(File file, Charset charset) throws IOException {
        this(file, 4096, charset);
    }

    public ReversedLinesFileReader(File file, int i, Charset charset) throws IOException {
        int i2;
        this.j = false;
        this.a = i;
        this.b = charset;
        Charset charset2 = Charsets.toCharset(charset);
        if (charset2.newEncoder().maxBytesPerChar() != 1.0f && charset2 != StandardCharsets.UTF_8 && charset2 != Charset.forName("Shift_JIS") && charset2 != Charset.forName("windows-31j") && charset2 != Charset.forName("x-windows-949") && charset2 != Charset.forName("gbk") && charset2 != Charset.forName("x-windows-950")) {
            if (charset2 != StandardCharsets.UTF_16BE && charset2 != StandardCharsets.UTF_16LE) {
                if (charset2 == StandardCharsets.UTF_16) {
                    throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
                }
                throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
            }
            this.h = 2;
        } else {
            this.h = 1;
        }
        byte[][] bArr = {"\r\n".getBytes(charset), "\n".getBytes(charset), StringUtils.CR.getBytes(charset)};
        this.f = bArr;
        this.g = bArr[0].length;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.c = randomAccessFile;
        long length = randomAccessFile.length();
        this.d = length;
        long j = i;
        int i3 = (int) (length % j);
        if (i3 > 0) {
            this.e = (length / j) + 1;
        } else {
            this.e = length / j;
            i2 = length > 0 ? i : i2;
            this.i = new b(this.e, i2, null);
        }
        i2 = i3;
        this.i = new b(this.e, i2, null);
    }

    public ReversedLinesFileReader(File file, int i, String str) throws IOException {
        this(file, i, Charsets.toCharset(str));
    }
}
