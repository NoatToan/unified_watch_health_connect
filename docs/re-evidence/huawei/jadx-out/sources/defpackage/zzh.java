package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes20.dex */
public class zzh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected byte f54812c;
    protected int d;
    protected final InputStream e;

    protected static class b extends ByteArrayInputStream {
        protected b(byte[] bArr) {
            super(bArr);
        }

        protected b(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b b(int i) {
            int i2 = this.pos;
            long j = i;
            long jSkip = skip(j);
            if (jSkip < j) {
                throw new IllegalArgumentException("requested " + i + " bytes exceeds available " + jSkip + " bytes.");
            }
            return new b(this.buf, i2, i);
        }
    }

    public zzh(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("byte stream must not be null!");
        }
        this.e = inputStream;
        this.f54812c = (byte) 0;
        this.d = -1;
    }

    public void a() {
        try {
            this.e.close();
        } catch (IOException unused) {
        }
        this.f54812c = (byte) 0;
        this.d = -1;
    }

    public long d(long j) {
        int i;
        int i2 = this.d;
        int i3 = 0;
        if (i2 >= 0) {
            i = i2 + 1;
            j -= (long) i;
            this.d = -1;
        } else {
            i = 0;
        }
        int i4 = (int) (7 & j);
        long j2 = j / 8;
        long jA = a(j2);
        if (jA < 0) {
            return i;
        }
        if (jA >= j2) {
            try {
                c();
                this.d -= i4;
                i3 = i4;
            } catch (IllegalArgumentException unused) {
            }
        }
        return (jA * 8) + ((long) i3) + ((long) i);
    }

    public long e(int i) {
        if (i < 0 || i > 64) {
            throw new IllegalArgumentException("bits must be in range 0 ... 64!");
        }
        long jB = 0;
        if (this.d < 0 && (i & 7) == 0) {
            for (int i2 = 0; i2 < i; i2 += 8) {
                jB = (jB << 8) | ((long) b());
            }
            return jB;
        }
        while (true) {
            i--;
            if (i < 0) {
                return jB;
            }
            if (this.d < 0) {
                c();
            }
            byte b2 = this.f54812c;
            int i3 = this.d;
            if (((b2 >> i3) & 1) != 0) {
                jB |= 1 << i;
            }
            this.d = i3 - 1;
        }
    }

    public int a(int i) {
        if (i < 0 || i > 32) {
            throw new IllegalArgumentException("bits must be in range 0 ... 32!");
        }
        int i2 = 0;
        if (this.d < 0 && (i & 7) == 0) {
            int iB = 0;
            while (i2 < i) {
                iB = (iB << 8) | b();
                i2 += 8;
            }
            return iB;
        }
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            if (this.d < 0) {
                c();
            }
            byte b2 = this.f54812c;
            int i3 = this.d;
            if (((b2 >> i3) & 1) != 0) {
                i2 = (1 << i) | i2;
            }
            this.d = i3 - 1;
        }
    }

    public byte[] b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Count " + i + " must not be negative!");
        }
        if (i == 0) {
            return zzg.f54809a;
        }
        byte[] bArr = new byte[i];
        if (this.d < 0) {
            c(bArr, 0, i, true);
            return bArr;
        }
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) a(8);
        }
        return bArr;
    }

    public byte e() {
        int iB;
        if (this.d >= 0) {
            iB = a(8);
        } else {
            iB = b();
        }
        return (byte) iB;
    }

    public byte[] j(int i) {
        int iC = zzl.c(i);
        int iD = zzl.d(iC);
        int iA = a(iC);
        if (iA == iD) {
            return null;
        }
        return b(iA);
    }

    public zzf d(int i) {
        return new zzf(c(i));
    }

    public ByteArrayInputStream c(int i) {
        if (this.d > 0) {
            throw new IllegalStateException(this.d + " bits unread!");
        }
        InputStream inputStream = this.e;
        if (inputStream instanceof b) {
            return ((b) inputStream).b(i);
        }
        byte[] bArr = new byte[i];
        c(bArr, 0, i, true);
        return new b(bArr);
    }

    private long a(long j) {
        try {
            return this.e.skip(j);
        } catch (IOException unused) {
            return -1L;
        }
    }

    private void c() {
        this.f54812c = (byte) b();
        this.d = 7;
    }

    private int b() {
        try {
            int i = this.e.read();
            if (i >= 0) {
                return i;
            }
            throw new IllegalArgumentException("requested byte exceeds available bytes!");
        } catch (IOException e) {
            throw new IllegalArgumentException("request byte fails!", e);
        }
    }

    private int c(byte[] bArr, int i, int i2, boolean z) {
        int i3 = 0;
        int i4 = i2;
        while (i2 > 0) {
            try {
                int i5 = this.e.read(bArr, i + i3, i4);
                if (i5 <= 0) {
                    break;
                }
                i3 += i5;
                i4 -= i5;
                if (!z) {
                    break;
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("request bytes fails!", e);
            }
        }
        if (i3 >= i2) {
            return i3;
        }
        throw new IllegalArgumentException("requested " + i2 + " bytes exceeds available " + i3 + " bytes.");
    }
}
