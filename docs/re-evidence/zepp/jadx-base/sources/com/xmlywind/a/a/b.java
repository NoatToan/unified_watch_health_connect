package com.xmlywind.a.a;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class b extends com.xmlywind.a.c {
    public final d a;
    private boolean b;
    private long c;
    private long d;
    private byte[] e;
    private a f;

    public b(InputStream inputStream) {
        this(inputStream, 10240, 512);
    }

    public b(InputStream inputStream, int i, int i2) {
        this.a = new d(inputStream, i, i2);
        this.e = null;
        this.b = false;
    }

    private byte[] d() throws IOException {
        if (!this.b) {
            byte[] bArrB = this.a.b();
            if (bArrB == null || this.a.a(bArrB)) {
                this.b = true;
            }
            if (!this.b) {
                return bArrB;
            }
        }
        return null;
    }

    private void e() throws IOException {
        int i;
        int i2;
        InputStreamReader inputStreamReader = new InputStreamReader(this, "UTF-8") { // from class: com.xmlywind.a.a.b.1
            @Override // java.io.InputStreamReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        };
        HashMap map = new HashMap();
        do {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                try {
                    i = inputStreamReader.read();
                    if (i == -1) {
                        break;
                    }
                    i3++;
                    if (i == 32) {
                        StringBuffer stringBuffer = new StringBuffer();
                        while (true) {
                            i2 = inputStreamReader.read();
                            if (i2 == -1) {
                                break;
                            }
                            i3++;
                            if (i2 == 61) {
                                String string = stringBuffer.toString();
                                int i5 = i4 - i3;
                                char[] cArr = new char[i5];
                                int i6 = inputStreamReader.read(cArr);
                                if (i6 == i5) {
                                    map.put(string, new String(cArr, 0, i5 - 1));
                                    break;
                                }
                                throw new IOException("Failed to read Paxheader. Expected " + i5 + " chars, read " + i6);
                            }
                            stringBuffer.append((char) i2);
                        }
                        i = i2;
                        break;
                    }
                    i4 = (i4 * 10) + (i - 48);
                } catch (Throwable th) {
                    inputStreamReader.close();
                    throw th;
                }
            }
        } while (i != -1);
        inputStreamReader.close();
        c();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("path".equals(str)) {
                this.f.a(str2);
            } else if ("linkpath".equals(str)) {
                this.f.b(str2);
            } else if ("gid".equals(str)) {
                this.f.b(Integer.parseInt(str2));
            } else if ("gname".equals(str)) {
                this.f.d(str2);
            } else if ("uid".equals(str)) {
                this.f.a(Integer.parseInt(str2));
            } else if ("uname".equals(str)) {
                this.f.c(str2);
            } else if ("size".equals(str)) {
                this.f.a(Long.parseLong(str2));
            }
        }
    }

    private void f() throws IOException {
        byte[] bArrD;
        if (this.f.c()) {
            do {
                bArrD = d();
                if (this.b) {
                    this.f = null;
                    return;
                }
            } while (new c(bArrD).a());
        }
    }

    @Override // java.io.InputStream
    public int available() {
        long j = this.c;
        long j2 = this.d;
        if (j - j2 > ParserMinimalBase.MAX_INT_L) {
            return Integer.MAX_VALUE;
        }
        return (int) (j - j2);
    }

    public a b() throws IOException {
        if (this.b) {
            return null;
        }
        if (this.f != null) {
            long j = this.c;
            long jSkip = this.d;
            while (true) {
                j -= jSkip;
                if (j <= 0) {
                    this.e = null;
                    break;
                }
                jSkip = skip(j);
                if (jSkip <= 0) {
                    throw new RuntimeException("failed to skip current tar entry");
                }
            }
        }
        byte[] bArrD = d();
        if (this.b) {
            this.f = null;
            return null;
        }
        a aVar = new a(bArrD);
        this.f = aVar;
        this.d = 0L;
        this.c = aVar.b();
        if (this.f.e()) {
            StringBuffer stringBuffer = new StringBuffer();
            byte[] bArr = new byte[256];
            while (true) {
                int i = read(bArr);
                if (i < 0) {
                    break;
                }
                stringBuffer.append(new String(bArr, 0, i));
            }
            c();
            if (this.f == null) {
                return null;
            }
            if (stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) == 0) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            this.f.a(stringBuffer.toString());
        }
        if (this.f.f()) {
            e();
        }
        if (this.f.d()) {
            f();
        }
        return this.f;
    }

    public com.xmlywind.a.a c() {
        return b();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.d();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.d;
        long j2 = this.c;
        if (j >= j2) {
            return -1;
        }
        if (((long) i2) + j > j2) {
            i2 = (int) (j2 - j);
        }
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            int length = i2 > bArr2.length ? bArr2.length : i2;
            System.arraycopy(bArr2, 0, bArr, i, length);
            byte[] bArr3 = this.e;
            if (length >= bArr3.length) {
                this.e = null;
            } else {
                int length2 = bArr3.length - length;
                byte[] bArr4 = new byte[length2];
                System.arraycopy(bArr3, length, bArr4, 0, length2);
                this.e = bArr4;
            }
            i3 = length + 0;
            i2 -= length;
            i += length;
        } else {
            i3 = 0;
        }
        while (i2 > 0) {
            byte[] bArrB = this.a.b();
            if (bArrB == null) {
                throw new IOException("unexpected EOF with " + i2 + " bytes unread. Occured at byte: " + a());
            }
            a(bArrB.length);
            int length3 = bArrB.length;
            if (length3 > i2) {
                System.arraycopy(bArrB, 0, bArr, i, i2);
                int i4 = length3 - i2;
                byte[] bArr5 = new byte[i4];
                this.e = bArr5;
                System.arraycopy(bArrB, i2, bArr5, 0, i4);
                length3 = i2;
            } else {
                System.arraycopy(bArrB, 0, bArr, i, length3);
            }
            i3 += length3;
            i2 -= length3;
            i += length3;
        }
        this.d += (long) i3;
        return i3;
    }

    @Override // java.io.InputStream
    public void reset() {
        synchronized (this) {
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        byte[] bArr = new byte[8192];
        long j2 = j;
        while (j2 > 0) {
            long j3 = 8192;
            if (j2 <= j3) {
                j3 = j2;
            }
            int i = read(bArr, 0, (int) j3);
            if (i == -1) {
                break;
            }
            j2 -= (long) i;
        }
        return j - j2;
    }
}
