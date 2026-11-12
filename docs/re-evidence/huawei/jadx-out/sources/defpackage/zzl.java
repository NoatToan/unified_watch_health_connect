package defpackage;

import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes20.dex */
public final class zzl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f54818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54819c;
    private int d;
    private final boolean h;
    private byte i;
    public static final AtomicLong e = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f54817a = new AtomicLong();

    public zzl() {
        this(32, false);
    }

    public zzl(int i) {
        this(i, false);
    }

    public zzl(int i, boolean z) {
        this.h = z;
        this.f54818b = new byte[i];
        j();
    }

    public void e(long j, int i) {
        if (i < 0 || i > 64) {
            throw new IllegalArgumentException(String.format("Number of bits must be 1 to 64, not %d", Integer.valueOf(i)));
        }
        if (i < 64 && (j >> i) != 0) {
            throw new IllegalArgumentException(String.format("Truncating value %d to %d-bit integer", Long.valueOf(j), Integer.valueOf(i)));
        }
        int i2 = (i + 7) / 8;
        if ((i & 7) == 0 && !a()) {
            e(i2);
            while (true) {
                i -= 8;
                if (i < 0) {
                    return;
                } else {
                    e((byte) (j >> i));
                }
            }
        } else {
            e(i2 + 1);
            while (true) {
                i--;
                if (i < 0) {
                    return;
                }
                if (((j >> i) & 1) != 0) {
                    this.i = (byte) (this.i | (1 << this.d));
                }
                int i3 = this.d - 1;
                this.d = i3;
                if (i3 < 0) {
                    g();
                }
            }
        }
    }

    public void d(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException(String.format("Number of bits must be 1 to 32, not %d", Integer.valueOf(i2)));
        }
        if (i2 < 32 && (i >> i2) != 0) {
            throw new IllegalArgumentException(String.format("Truncating value %d to %d-bit integer", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = (i2 + 7) / 8;
        if ((i2 & 7) == 0 && !a()) {
            e(i3);
            while (true) {
                i2 -= 8;
                if (i2 < 0) {
                    return;
                } else {
                    e((byte) (i >> i2));
                }
            }
        } else {
            e(i3 + 1);
            while (true) {
                i2--;
                if (i2 < 0) {
                    return;
                }
                if (((i >> i2) & 1) != 0) {
                    this.i = (byte) (this.i | (1 << this.d));
                }
                int i4 = this.d - 1;
                this.d = i4;
                if (i4 < 0) {
                    g();
                }
            }
        }
    }

    public void a(int i, int i2, int i3) {
        int i4 = ((i3 + 7) / 8) + i;
        int i5 = this.f54819c;
        if (i4 > i5) {
            e(i4 - i5);
        }
        int i6 = this.f54819c;
        int i7 = this.d;
        byte b2 = this.i;
        j();
        this.f54819c = i;
        d(i2, i3);
        if (this.f54819c < i6) {
            this.f54819c = i6;
            this.i = b2;
            this.d = i7;
        }
    }

    public void a(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        b(bArr, 0, bArr.length);
    }

    public void b(byte[] bArr, int i, int i2) {
        if (bArr == null || i2 == 0) {
            return;
        }
        if (!a()) {
            a(bArr, i, i2);
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            d(bArr[i3 + i] & 255, 8);
        }
    }

    public void d(byte b2) {
        if (a()) {
            d(b2 & 255, 8);
        } else {
            e(1);
            e(b2);
        }
    }

    public void b(byte[] bArr, int i) {
        int iC = c(i);
        int iD = d(iC);
        if (bArr == null) {
            d(iD, iC);
            return;
        }
        if (iD == bArr.length) {
            throw new IllegalArgumentException(bArr.length + " bytes is too large for " + i + "!");
        }
        if (i < iC && (bArr.length >> i) != 0) {
            throw new IllegalArgumentException(String.format("Truncating value %d to %d-bit integer", Integer.valueOf(bArr.length), Integer.valueOf(i)));
        }
        d(bArr.length, iC);
        a(bArr);
    }

    public void c(zzg zzgVar, int i) {
        b(zzgVar == null ? null : zzgVar.d(), i);
    }

    public int b(int i) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("Number of bits must be multiple of 8, not " + i + "!");
        }
        if (a()) {
            throw new IllegalStateException("bits are pending!");
        }
        int i2 = this.f54819c;
        int i3 = i / 8;
        e(i3);
        this.f54819c += i3;
        return i2;
    }

    public byte[] d() {
        g();
        byte[] bArrCopyOf = this.f54818b;
        int length = bArrCopyOf.length;
        int i = this.f54819c;
        if (length == i) {
            this.f54818b = zzg.f54809a;
            f54817a.incrementAndGet();
        } else {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i);
            if (this.h) {
                Arrays.fill(this.f54818b, 0, this.f54819c, (byte) 0);
            }
            e.incrementAndGet();
        }
        this.f54819c = 0;
        return bArrCopyOf;
    }

    public void e(zzl zzlVar) {
        zzlVar.g();
        a(zzlVar.f54818b, 0, zzlVar.f54819c);
    }

    public void d(OutputStream outputStream) throws IOException {
        g();
        outputStream.write(this.f54818b, 0, this.f54819c);
        this.f54819c = 0;
    }

    public void e(int i, int i2) {
        if (i2 % 8 != 0) {
            throw new IllegalArgumentException("Number of bits must be multiple of 8, not " + i2 + "!");
        }
        a(i, (this.f54819c - i) - (i2 / 8), i2);
    }

    public int e() {
        return this.f54819c;
    }

    public void c() {
        if (this.h) {
            Arrays.fill(this.f54818b, 0, this.f54819c, (byte) 0);
        }
        this.f54819c = 0;
    }

    public void b() {
        c();
        this.f54818b = zzg.f54809a;
    }

    public void g() {
        if (a()) {
            e(1);
            e(this.i);
            j();
        }
    }

    public final boolean a() {
        return this.d < 7;
    }

    private final void j() {
        this.i = (byte) 0;
        this.d = 7;
    }

    private final void a(byte[] bArr, int i, int i2) {
        if (bArr == null || i2 <= 0) {
            return;
        }
        e(i2);
        System.arraycopy(bArr, i, this.f54818b, this.f54819c, i2);
        this.f54819c += i2;
    }

    private final void e(byte b2) {
        byte[] bArr = this.f54818b;
        int i = this.f54819c;
        this.f54819c = i + 1;
        bArr[i] = b2;
    }

    private final void e(int i) {
        int i2 = this.f54819c + i;
        if (i2 > this.f54818b.length) {
            h(a(i2));
        }
    }

    private final void h(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f54818b, 0, bArr, 0, this.f54819c);
        if (this.h) {
            Arrays.fill(this.f54818b, 0, this.f54819c, (byte) 0);
        }
        this.f54818b = bArr;
    }

    private final int a(int i) {
        int length = this.f54818b.length;
        if (length == 0) {
            length = 32;
        }
        if (length < i) {
            return i;
        }
        if (length > 1073741823) {
            return 1073741823;
        }
        return length;
    }

    public static int c(int i) {
        return i % 8 != 0 ? (i & (-8)) + 8 : i;
    }

    public static int d(int i) {
        if (i == 8) {
            return 255;
        }
        if (i == 16) {
            return 65535;
        }
        if (i == 24) {
            return ViewCompat.MEASURED_SIZE_MASK;
        }
        if (i == 32) {
            return -1;
        }
        throw new IllegalArgumentException("Var length Bits must be a multiple of 8, not " + i + "!");
    }

    public String toString() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f54818b, this.f54819c);
        if (bArrCopyOf != null && bArrCopyOf.length != 0) {
            StringBuilder sb = new StringBuilder(bArrCopyOf.length * 3);
            for (int i = 0; i < bArrCopyOf.length; i++) {
                sb.append(String.format("%02X", Integer.valueOf(bArrCopyOf[i] & 255)));
                if (i < bArrCopyOf.length - 1) {
                    sb.append(' ');
                }
            }
            return sb.toString();
        }
        return "--";
    }
}
