package defpackage;

import androidx.work.Data;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b0p extends dj1 {
    public final byte[] c;
    public final int d;
    public final int e;
    public boolean f;
    public long g;
    public long h;
    public final InputStream i;
    public a0p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b1s f3660k;
    public final String l;
    public Map<String, String> m;
    public final boolean n;

    public b0p(InputStream inputStream) {
        this(inputStream, Data.MAX_DATA_BYTES, 512);
    }

    public final boolean D() {
        a0p a0pVar = this.j;
        return a0pVar != null && a0pVar.h();
    }

    public boolean E(byte[] bArr) {
        return bArr == null || ej1.a(bArr, this.d);
    }

    public Map<String, String> J(InputStream inputStream) throws IOException {
        int i;
        int i2;
        HashMap map = new HashMap(this.m);
        do {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = inputStream.read();
                if (i == -1) {
                    break;
                }
                i3++;
                if (i == 10) {
                    break;
                }
                if (i == 32) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        i2 = inputStream.read();
                        if (i2 == -1) {
                            break;
                        }
                        i3++;
                        if (i2 == 61) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            int i5 = i4 - i3;
                            if (i5 == 1) {
                                map.remove(string);
                                break;
                            }
                            byte[] bArr = new byte[i5];
                            int iA = cvc.a(inputStream, bArr);
                            if (iA == i5) {
                                map.put(string, new String(bArr, 0, i5 - 1, "UTF-8"));
                                break;
                            }
                            throw new IOException("Failed to read Paxheader. Expected " + i5 + " bytes, read " + iA);
                        }
                        byteArrayOutputStream.write((byte) i2);
                    }
                    i = i2;
                    break;
                }
                i4 = (i4 * 10) + (i - 48);
            }
        } while (i != -1);
        return map;
    }

    public final void K() throws IOException {
        Map<String, String> mapJ = J(this);
        o();
        l(mapJ);
    }

    public final void M() throws IOException {
        this.m = J(this);
        o();
    }

    public final void N() throws IOException {
        byte[] bArrS;
        if (this.j.i()) {
            do {
                bArrS = s();
                if (bArrS == null) {
                    this.j = null;
                    return;
                }
            } while (new c0p(bArrS).a());
        }
    }

    public byte[] O() throws IOException {
        byte[] bArr = new byte[this.d];
        int iA = cvc.a(this.i, bArr);
        a(iA);
        if (iA != this.d) {
            return null;
        }
        return bArr;
    }

    public final void P(boolean z) {
        this.f = z;
    }

    public final void Q() throws IOException {
        if (D()) {
            return;
        }
        long j = this.g;
        if (j > 0) {
            int i = this.d;
            if (j % ((long) i) != 0) {
                b(cvc.c(this.i, (((j / ((long) i)) + 1) * ((long) i)) - j));
            }
        }
    }

    public final void R() throws IOException {
        boolean zMarkSupported = this.i.markSupported();
        if (zMarkSupported) {
            this.i.mark(this.d);
        }
        try {
            if ((!E(O())) && zMarkSupported) {
                d(this.d);
                this.i.reset();
            }
        } catch (Throwable th) {
            if (zMarkSupported) {
                d(this.d);
                this.i.reset();
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (D()) {
            return 0;
        }
        long j = this.g;
        long j2 = this.h;
        if (j - j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) (j - j2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i.close();
    }

    public final void l(Map<String, String> map) {
        this.j.C(map);
    }

    public final void m() throws IOException {
        long jC = c();
        int i = this.e;
        long j = jC % ((long) i);
        if (j > 0) {
            b(cvc.c(this.i, ((long) i) - j));
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public byte[] n() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = read(this.c);
            if (i < 0) {
                break;
            }
            byteArrayOutputStream.write(this.c, 0, i);
        }
        o();
        if (this.j == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        if (length == byteArray.length) {
            return byteArray;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 0, bArr, 0, length);
        return bArr;
    }

    public cj1 o() throws IOException {
        return p();
    }

    public a0p p() throws IOException {
        if (y()) {
            return null;
        }
        if (this.j != null) {
            cvc.c(this, Long.MAX_VALUE);
            Q();
        }
        byte[] bArrS = s();
        if (bArrS == null) {
            this.j = null;
            return null;
        }
        try {
            a0p a0pVar = new a0p(bArrS, this.f3660k, this.n);
            this.j = a0pVar;
            this.h = 0L;
            this.g = a0pVar.g();
            if (this.j.j()) {
                byte[] bArrN = n();
                if (bArrN == null) {
                    return null;
                }
                this.j.w(this.f3660k.decode(bArrN));
            }
            if (this.j.k()) {
                byte[] bArrN2 = n();
                if (bArrN2 == null) {
                    return null;
                }
                this.j.y(this.f3660k.decode(bArrN2));
            }
            if (this.j.l()) {
                M();
            }
            if (this.j.n()) {
                K();
            } else if (!this.m.isEmpty()) {
                l(this.m);
            }
            if (this.j.m()) {
                N();
            }
            this.g = this.j.g();
            return this.j;
        } catch (IllegalArgumentException e) {
            throw new IOException("Error detected parsing the header", e);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (y() || D() || this.h >= this.g) {
            return -1;
        }
        if (this.j == null) {
            throw new IllegalStateException("No current tar entry");
        }
        int iMin = Math.min(i2, available());
        int i3 = this.i.read(bArr, i, iMin);
        if (i3 != -1) {
            a(i3);
            this.h += (long) i3;
        } else {
            if (iMin > 0) {
                throw new IOException("Truncated TAR archive");
            }
            P(true);
        }
        return i3;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
    }

    public final byte[] s() throws IOException {
        byte[] bArrO = O();
        P(E(bArrO));
        if (!y() || bArrO == null) {
            return bArrO;
        }
        R();
        m();
        return null;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0 || D()) {
            return 0L;
        }
        long jC = cvc.c(this.i, Math.min(j, this.g - this.h));
        b(jC);
        this.h += jC;
        return jC;
    }

    public final boolean y() {
        return this.f;
    }

    public b0p(InputStream inputStream, int i, int i2) {
        this(inputStream, i, i2, null);
    }

    public b0p(InputStream inputStream, int i, int i2, String str) {
        this(inputStream, i, i2, str, false);
    }

    public b0p(InputStream inputStream, int i, int i2, String str, boolean z) {
        this.c = new byte[256];
        this.m = new HashMap();
        this.i = inputStream;
        this.f = false;
        this.l = str;
        this.f3660k = c1s.a(str);
        this.d = i2;
        this.e = i;
        this.n = z;
    }
}
