package fa;

import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CheckReturnValue;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.commons.lang3.CharUtils;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f70051d = {CharUtils.CR, '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f70052e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImmutableSet<Charset> f70053f = ImmutableSet.of(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f70054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f70055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70056c;

    public r(int i14) {
        this.f70054a = new byte[i14];
        this.f70056c = i14;
    }

    public final int A() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        int i16 = (bArr[i14] & UnsignedBytes.MAX_VALUE) << 8;
        this.f70055b = i14 + 2;
        return (bArr[i15] & UnsignedBytes.MAX_VALUE) | i16;
    }

    public final long B() {
        int i14;
        int i15;
        long j8 = this.f70054a[this.f70055b];
        int i16 = 7;
        while (true) {
            if (i16 >= 0) {
                int i17 = 1 << i16;
                if ((((long) i17) & j8) == 0) {
                    if (i16 < 6) {
                        j8 &= (long) (i17 - 1);
                        i15 = 7 - i16;
                        break;
                    }
                    if (i16 == 7) {
                        i15 = 1;
                        break;
                    }
                } else {
                    i16--;
                }
            }
            i15 = 0;
            break;
        }
        if (i15 == 0) {
            throw new NumberFormatException(org.apache.commons.lang3.e.e(j8, "Invalid UTF-8 sequence first byte: "));
        }
        for (i14 = 1; i14 < i15; i14++) {
            byte b14 = this.f70054a[this.f70055b + i14];
            if ((b14 & 192) != 128) {
                throw new NumberFormatException(org.apache.commons.lang3.e.e(j8, "Invalid UTF-8 sequence continuation byte: "));
            }
            j8 = (j8 << 6) | ((long) (b14 & 63));
        }
        this.f70055b += i15;
        return j8;
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.f70054a;
            int i14 = this.f70055b;
            if (bArr[i14] == -17 && bArr[i14 + 1] == -69 && bArr[i14 + 2] == -65) {
                this.f70055b = i14 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f70054a;
        int i15 = this.f70055b;
        byte b14 = bArr2[i15];
        if (b14 == -2 && bArr2[i15 + 1] == -1) {
            this.f70055b = i15 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b14 != -1 || bArr2[i15 + 1] != -2) {
            return null;
        }
        this.f70055b = i15 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void D(int i14) {
        byte[] bArr = this.f70054a;
        if (bArr.length < i14) {
            bArr = new byte[i14];
        }
        E(bArr, i14);
    }

    public final void E(byte[] bArr, int i14) {
        this.f70054a = bArr;
        this.f70056c = i14;
        this.f70055b = 0;
    }

    public final void F(int i14) {
        a.a(i14 >= 0 && i14 <= this.f70054a.length);
        this.f70056c = i14;
    }

    public final void G(int i14) {
        a.a(i14 >= 0 && i14 <= this.f70056c);
        this.f70055b = i14;
    }

    public final void H(int i14) {
        G(this.f70055b + i14);
    }

    public final int a() {
        return this.f70056c - this.f70055b;
    }

    public final void b(int i14) {
        byte[] bArr = this.f70054a;
        if (i14 > bArr.length) {
            this.f70054a = Arrays.copyOf(bArr, i14);
        }
    }

    public final char c(Charset charset) {
        a.b(f70053f.contains(charset), "Unsupported charset: " + charset);
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte bCheckedCast;
        char cFromBytes;
        int i14 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            bCheckedCast = (byte) Chars.checkedCast(UnsignedBytes.toInt(this.f70054a[this.f70055b]));
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f70054a;
                int i15 = this.f70055b;
                cFromBytes = Chars.fromBytes(bArr[i15], bArr[i15 + 1]);
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f70054a;
                int i16 = this.f70055b;
                cFromBytes = Chars.fromBytes(bArr2[i16 + 1], bArr2[i16]);
            }
            bCheckedCast = (byte) cFromBytes;
            i14 = 2;
        }
        return (Chars.checkedCast(bCheckedCast) << 16) + i14;
    }

    public final void e(byte[] bArr, int i14, int i15) {
        System.arraycopy(this.f70054a, this.f70055b, bArr, i14, i15);
        this.f70055b += i15;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD == 0) {
            return (char) 0;
        }
        char c14 = (char) (iD >> 16);
        if (!Chars.contains(cArr, c14)) {
            return (char) 0;
        }
        this.f70055b += iD & 65535;
        return c14;
    }

    public final int g() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        int i16 = (bArr[i14] & UnsignedBytes.MAX_VALUE) << 24;
        int i17 = i14 + 2;
        this.f70055b = i17;
        int i18 = ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 16) | i16;
        int i19 = i14 + 3;
        this.f70055b = i19;
        int i24 = i18 | ((bArr[i17] & UnsignedBytes.MAX_VALUE) << 8);
        this.f70055b = i14 + 4;
        return (bArr[i19] & UnsignedBytes.MAX_VALUE) | i24;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9 A[SYNTHETIC] */
    public final String h(Charset charset) {
        int i14;
        byte[] bArr;
        a.b(f70053f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            C();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i14 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                com.google.firebase.messaging.l.j(charset, "Unsupported charset: ");
                return null;
            }
            i14 = 2;
        }
        int i15 = this.f70055b;
        while (true) {
            int i16 = this.f70056c;
            if (i15 >= i16 - (i14 - 1)) {
                i15 = i16;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && z.K(this.f70054a[i15])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.f70054a;
                if (bArr2[i15] == 0 && z.K(bArr2[i15 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f70054a;
                    if (bArr[i15 + 1] == 0 && z.K(bArr[i15])) {
                        break;
                    }
                }
                i15 += i14;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f70054a;
                    if (bArr[i15 + 1] == 0) {
                        continue;
                    }
                }
                i15 += i14;
            }
        }
        String strS = s(i15 - this.f70055b, charset);
        if (this.f70055b != this.f70056c && f(charset, f70051d) == '\r') {
            f(charset, f70052e);
        }
        return strS;
    }

    public final int i() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        int i16 = bArr[i14] & UnsignedBytes.MAX_VALUE;
        int i17 = i14 + 2;
        this.f70055b = i17;
        int i18 = ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 8) | i16;
        int i19 = i14 + 3;
        this.f70055b = i19;
        int i24 = i18 | ((bArr[i17] & UnsignedBytes.MAX_VALUE) << 16);
        this.f70055b = i14 + 4;
        return ((bArr[i19] & UnsignedBytes.MAX_VALUE) << 24) | i24;
    }

    public final long j() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        long j8 = ((long) bArr[i14]) & 255;
        int i16 = i14 + 2;
        this.f70055b = i16;
        long j14 = j8 | ((((long) bArr[i15]) & 255) << 8);
        int i17 = i14 + 3;
        this.f70055b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 16);
        int i18 = i14 + 4;
        this.f70055b = i18;
        long j16 = j15 | ((((long) bArr[i17]) & 255) << 24);
        int i19 = i14 + 5;
        this.f70055b = i19;
        long j17 = j16 | ((((long) bArr[i18]) & 255) << 32);
        int i24 = i14 + 6;
        this.f70055b = i24;
        long j18 = j17 | ((((long) bArr[i19]) & 255) << 40);
        int i25 = i14 + 7;
        this.f70055b = i25;
        long j19 = j18 | ((((long) bArr[i24]) & 255) << 48);
        this.f70055b = i14 + 8;
        return ((((long) bArr[i25]) & 255) << 56) | j19;
    }

    public final short k() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        int i16 = bArr[i14] & UnsignedBytes.MAX_VALUE;
        this.f70055b = i14 + 2;
        return (short) (((bArr[i15] & UnsignedBytes.MAX_VALUE) << 8) | i16);
    }

    public final long l() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        long j8 = ((long) bArr[i14]) & 255;
        int i16 = i14 + 2;
        this.f70055b = i16;
        long j14 = j8 | ((((long) bArr[i15]) & 255) << 8);
        int i17 = i14 + 3;
        this.f70055b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 16);
        this.f70055b = i14 + 4;
        return ((((long) bArr[i17]) & 255) << 24) | j15;
    }

    public final int m() {
        int i14 = i();
        if (i14 >= 0) {
            return i14;
        }
        vb.h.z(am.j.h(i14, "Top bit not zero: "));
        return 0;
    }

    public final int n() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        int i16 = bArr[i14] & UnsignedBytes.MAX_VALUE;
        this.f70055b = i14 + 2;
        return ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 8) | i16;
    }

    public final long o() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        long j8 = (((long) bArr[i14]) & 255) << 56;
        int i16 = i14 + 2;
        this.f70055b = i16;
        long j14 = j8 | ((((long) bArr[i15]) & 255) << 48);
        int i17 = i14 + 3;
        this.f70055b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 40);
        int i18 = i14 + 4;
        this.f70055b = i18;
        long j16 = j15 | ((((long) bArr[i17]) & 255) << 32);
        int i19 = i14 + 5;
        this.f70055b = i19;
        long j17 = j16 | ((((long) bArr[i18]) & 255) << 24);
        int i24 = i14 + 6;
        this.f70055b = i24;
        long j18 = j17 | ((((long) bArr[i19]) & 255) << 16);
        int i25 = i14 + 7;
        this.f70055b = i25;
        long j19 = j18 | ((((long) bArr[i24]) & 255) << 8);
        this.f70055b = i14 + 8;
        return (((long) bArr[i25]) & 255) | j19;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i14 = this.f70055b;
        while (i14 < this.f70056c && this.f70054a[i14] != 0) {
            i14++;
        }
        byte[] bArr = this.f70054a;
        int i15 = this.f70055b;
        int i16 = z.f70071a;
        String str = new String(bArr, i15, i14 - i15, StandardCharsets.UTF_8);
        this.f70055b = i14;
        if (i14 < this.f70056c) {
            this.f70055b = i14 + 1;
        }
        return str;
    }

    public final String q(int i14) {
        if (i14 == 0) {
            return "";
        }
        int i15 = this.f70055b;
        int i16 = (i15 + i14) - 1;
        int i17 = (i16 >= this.f70056c || this.f70054a[i16] != 0) ? i14 : i14 - 1;
        byte[] bArr = this.f70054a;
        int i18 = z.f70071a;
        String str = new String(bArr, i15, i17, StandardCharsets.UTF_8);
        this.f70055b += i14;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        int i16 = (bArr[i14] & UnsignedBytes.MAX_VALUE) << 8;
        this.f70055b = i14 + 2;
        return (short) ((bArr[i15] & UnsignedBytes.MAX_VALUE) | i16);
    }

    public final String s(int i14, Charset charset) {
        String str = new String(this.f70054a, this.f70055b, i14, charset);
        this.f70055b += i14;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        this.f70055b = i14 + 1;
        return bArr[i14] & UnsignedBytes.MAX_VALUE;
    }

    public final int v() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        int i16 = (bArr[i14] & UnsignedBytes.MAX_VALUE) << 8;
        this.f70055b = i14 + 2;
        int i17 = (bArr[i15] & UnsignedBytes.MAX_VALUE) | i16;
        this.f70055b = i14 + 4;
        return i17;
    }

    public final long w() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        long j8 = (((long) bArr[i14]) & 255) << 24;
        int i16 = i14 + 2;
        this.f70055b = i16;
        long j14 = j8 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i14 + 3;
        this.f70055b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 8);
        this.f70055b = i14 + 4;
        return (((long) bArr[i17]) & 255) | j15;
    }

    public final int x() {
        byte[] bArr = this.f70054a;
        int i14 = this.f70055b;
        int i15 = i14 + 1;
        this.f70055b = i15;
        int i16 = (bArr[i14] & UnsignedBytes.MAX_VALUE) << 16;
        int i17 = i14 + 2;
        this.f70055b = i17;
        int i18 = ((bArr[i15] & UnsignedBytes.MAX_VALUE) << 8) | i16;
        this.f70055b = i14 + 3;
        return (bArr[i17] & UnsignedBytes.MAX_VALUE) | i18;
    }

    public final int y() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        vb.h.z(am.j.h(iG, "Top bit not zero: "));
        return 0;
    }

    public final long z() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        vb.h.z(org.apache.commons.lang3.e.e(jO, "Top bit not zero: "));
        return 0L;
    }

    public r() {
        this.f70054a = z.f70076f;
    }

    public r(byte[] bArr) {
        this.f70054a = bArr;
        this.f70056c = bArr.length;
    }

    public r(byte[] bArr, int i14) {
        this.f70054a = bArr;
        this.f70056c = i14;
    }
}
