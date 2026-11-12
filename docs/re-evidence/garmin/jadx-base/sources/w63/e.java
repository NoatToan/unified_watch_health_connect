package w63;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gfdi.framework.FileManagerCompat;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lw63/e;", "Lw63/g;", "Lw63/f;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements g, f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f183348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f183349b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw63/e$a;", "Ljava/io/Closeable;", "<init>", "()V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f183350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f183351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c0 f183352c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f183354e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f183353d = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f183355f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f183356g = -1;

        public final void a(long j8) {
            e eVar = this.f183350a;
            if (eVar == null) {
                vb.h.z("not attached to a buffer");
                return;
            }
            if (!this.f183351b) {
                vb.h.z("resizeBuffer() only permitted for read/write buffers");
                return;
            }
            long j14 = eVar.f183349b;
            if (j8 <= j14) {
                if (j8 < 0) {
                    vb.h.x(org.apache.commons.lang3.e.e(j8, "newSize < 0: "));
                    return;
                }
                long j15 = j14 - j8;
                while (j15 > 0) {
                    c0 c0Var = eVar.f183348a;
                    c0Var.getClass();
                    c0 c0Var2 = c0Var.f183342g;
                    c0Var2.getClass();
                    int i14 = c0Var2.f183338c;
                    long j16 = i14 - c0Var2.f183337b;
                    if (j16 > j15) {
                        c0Var2.f183338c = i14 - ((int) j15);
                        break;
                    } else {
                        eVar.f183348a = c0Var2.a();
                        d0.a(c0Var2);
                        j15 -= j16;
                    }
                }
                this.f183352c = null;
                this.f183353d = j8;
                this.f183354e = null;
                this.f183355f = -1;
                this.f183356g = -1;
            } else if (j8 > j14) {
                long j17 = j8 - j14;
                int i15 = 1;
                boolean z14 = true;
                for (long j18 = 0; j17 > j18; j18 = 0) {
                    c0 c0VarC = eVar.C(i15);
                    int iMin = (int) Math.min(j17, 8192 - c0VarC.f183338c);
                    int i16 = c0VarC.f183338c + iMin;
                    c0VarC.f183338c = i16;
                    j17 -= (long) iMin;
                    if (z14) {
                        this.f183352c = c0VarC;
                        this.f183353d = j14;
                        this.f183354e = c0VarC.f183336a;
                        this.f183355f = i16 - iMin;
                        this.f183356g = i16;
                        z14 = false;
                    }
                    i15 = 1;
                }
            }
            eVar.f183349b = j8;
        }

        public final int c(long j8) {
            e eVar = this.f183350a;
            if (eVar == null) {
                vb.h.z("not attached to a buffer");
                return 0;
            }
            if (j8 >= -1) {
                long j14 = eVar.f183349b;
                if (j8 <= j14) {
                    if (j8 == -1 || j8 == j14) {
                        this.f183352c = null;
                        this.f183353d = j8;
                        this.f183354e = null;
                        this.f183355f = -1;
                        this.f183356g = -1;
                        return -1;
                    }
                    c0 c0Var = eVar.f183348a;
                    c0 c0Var2 = this.f183352c;
                    long j15 = 0;
                    if (c0Var2 != null) {
                        long j16 = this.f183353d - ((long) (this.f183355f - c0Var2.f183337b));
                        if (j16 > j8) {
                            c0Var2 = c0Var;
                            c0Var = c0Var2;
                            j14 = j16;
                        } else {
                            j15 = j16;
                        }
                    } else {
                        c0Var2 = c0Var;
                    }
                    if (j14 - j8 > j8 - j15) {
                        while (true) {
                            c0Var2.getClass();
                            long j17 = ((long) (c0Var2.f183338c - c0Var2.f183337b)) + j15;
                            if (j8 < j17) {
                                break;
                            }
                            c0Var2 = c0Var2.f183341f;
                            j15 = j17;
                        }
                    } else {
                        while (j14 > j8) {
                            c0Var.getClass();
                            c0Var = c0Var.f183342g;
                            c0Var.getClass();
                            j14 -= (long) (c0Var.f183338c - c0Var.f183337b);
                        }
                        c0Var2 = c0Var;
                        j15 = j14;
                    }
                    if (this.f183351b) {
                        c0Var2.getClass();
                        if (c0Var2.f183339d) {
                            byte[] bArr = c0Var2.f183336a;
                            c0 c0Var3 = new c0(Arrays.copyOf(bArr, bArr.length), c0Var2.f183337b, c0Var2.f183338c, false, true);
                            if (eVar.f183348a == c0Var2) {
                                eVar.f183348a = c0Var3;
                            }
                            c0Var2.b(c0Var3);
                            c0 c0Var4 = c0Var3.f183342g;
                            c0Var4.getClass();
                            c0Var4.a();
                            c0Var2 = c0Var3;
                        }
                    }
                    this.f183352c = c0Var2;
                    this.f183353d = j8;
                    c0Var2.getClass();
                    this.f183354e = c0Var2.f183336a;
                    int i14 = c0Var2.f183337b + ((int) (j8 - j15));
                    this.f183355f = i14;
                    int i15 = c0Var2.f183338c;
                    this.f183356g = i15;
                    return i15 - i14;
                }
            }
            StringBuilder sbK = ds.e0.k(j8, "offset=", " > size=");
            sbK.append(eVar.f183349b);
            throw new ArrayIndexOutOfBoundsException(sbK.toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f183350a == null) {
                vb.h.z("not attached to a buffer");
                return;
            }
            this.f183350a = null;
            this.f183352c = null;
            this.f183353d = -1L;
            this.f183354e = null;
            this.f183355f = -1;
            this.f183356g = -1;
        }
    }

    public final h B(int i14) {
        if (i14 == 0) {
            return h.f183362e;
        }
        w63.b.b(this.f183349b, 0L, i14);
        c0 c0Var = this.f183348a;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i16 < i14) {
            c0Var.getClass();
            int i18 = c0Var.f183338c;
            int i19 = c0Var.f183337b;
            if (i18 == i19) {
                vb.h.q("s.limit == s.pos");
                return null;
            }
            i16 += i18 - i19;
            i17++;
            c0Var = c0Var.f183341f;
        }
        byte[][] bArr = new byte[i17][];
        int[] iArr = new int[i17 * 2];
        c0 c0Var2 = this.f183348a;
        int i24 = 0;
        while (i15 < i14) {
            c0Var2.getClass();
            bArr[i24] = c0Var2.f183336a;
            i15 += c0Var2.f183338c - c0Var2.f183337b;
            iArr[i24] = Math.min(i15, i14);
            iArr[i24 + i17] = c0Var2.f183337b;
            c0Var2.f183339d = true;
            i24++;
            c0Var2 = c0Var2.f183341f;
        }
        return new e0(bArr, iArr);
    }

    public final c0 C(int i14) {
        if (i14 < 1 || i14 > 8192) {
            vb.h.s("unexpected capacity");
            return null;
        }
        c0 c0Var = this.f183348a;
        if (c0Var == null) {
            c0 c0VarB = d0.b();
            this.f183348a = c0VarB;
            c0VarB.f183342g = c0VarB;
            c0VarB.f183341f = c0VarB;
            return c0VarB;
        }
        c0 c0Var2 = c0Var.f183342g;
        c0Var2.getClass();
        if (c0Var2.f183338c + i14 <= 8192 && c0Var2.f183340e) {
            return c0Var2;
        }
        c0 c0VarB2 = d0.b();
        c0Var2.b(c0VarB2);
        return c0VarB2;
    }

    public final void E(h hVar) {
        hVar.getClass();
        hVar.t(hVar.d(), this);
    }

    @Override // w63.g
    public final long E0(h hVar) {
        hVar.getClass();
        return o3(Long.MAX_VALUE, hVar);
    }

    @Override // w63.g
    public final void E3(long j8) throws EOFException {
        if (this.f183349b >= j8) {
            return;
        }
        vb.h.m();
    }

    @Override // w63.g
    public final boolean F1() {
        return this.f183349b == 0;
    }

    @Override // w63.g
    public final boolean F3(long j8, h hVar) {
        hVar.getClass();
        return n(hVar.d(), hVar, j8);
    }

    @Override // w63.g
    public final long G1() throws EOFException {
        long j8;
        byte b14;
        long j14 = 0;
        if (this.f183349b == 0) {
            vb.h.m();
            return 0L;
        }
        int i14 = 0;
        boolean z14 = false;
        long j15 = 0;
        long j16 = -7;
        boolean z15 = false;
        loop0: while (true) {
            c0 c0Var = this.f183348a;
            c0Var.getClass();
            byte[] bArr = c0Var.f183336a;
            int i15 = c0Var.f183337b;
            int i16 = c0Var.f183338c;
            while (true) {
                if (i15 >= i16) {
                    j8 = j14;
                    break;
                }
                b14 = bArr[i15];
                if (b14 >= 48 && b14 <= 57) {
                    int i17 = 48 - b14;
                    if (j15 < -922337203685477580L) {
                        break loop0;
                    }
                    j8 = j14;
                    if (j15 == -922337203685477580L && i17 < j16) {
                        break loop0;
                    }
                    j15 = (j15 * 10) + ((long) i17);
                } else {
                    j8 = j14;
                    if (b14 != 45 || i14 != 0) {
                        z15 = true;
                        break;
                    }
                    j16--;
                    z14 = true;
                }
                i15++;
                i14++;
                j14 = j8;
            }
            if (i15 == i16) {
                this.f183348a = c0Var.a();
                d0.a(c0Var);
            } else {
                c0Var.f183337b = i15;
            }
            if (z15 || this.f183348a == null) {
                long j17 = this.f183349b - ((long) i14);
                this.f183349b = j17;
                if (i14 >= (z14 ? 2 : 1)) {
                    return z14 ? j15 : -j15;
                }
                if (j17 == j8) {
                    vb.h.m();
                    return 0L;
                }
                StringBuilder sbI = sn.a.i(z14 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbI.append(w63.b.c(j(j8)));
                throw new NumberFormatException(sbI.toString());
            }
            j14 = j8;
        }
        e eVar = new e();
        eVar.J(j15);
        eVar.H(b14);
        if (!z14) {
            eVar.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(eVar.x()));
    }

    @Override // w63.f
    public final long G3(g0 g0Var) {
        g0Var.getClass();
        long j8 = 0;
        while (true) {
            long j14 = g0Var.read(this, 8192L);
            if (j14 == -1) {
                return j8;
            }
            j8 += j14;
        }
    }

    public final void H(int i14) {
        c0 c0VarC = C(1);
        byte[] bArr = c0VarC.f183336a;
        int i15 = c0VarC.f183338c;
        c0VarC.f183338c = i15 + 1;
        bArr[i15] = (byte) i14;
        this.f183349b++;
    }

    public final void J(long j8) {
        boolean z14;
        if (j8 == 0) {
            H(48);
            return;
        }
        if (j8 < 0) {
            j8 = -j8;
            if (j8 < 0) {
                R("-9223372036854775808");
                return;
            }
            z14 = true;
        } else {
            z14 = false;
        }
        byte[] bArr = x63.a.f189308a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j8)) * 10) >>> 5;
        int i14 = iNumberOfLeadingZeros + (j8 > x63.a.f189309b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z14) {
            i14++;
        }
        c0 c0VarC = C(i14);
        byte[] bArr2 = c0VarC.f183336a;
        int i15 = c0VarC.f183338c + i14;
        while (j8 != 0) {
            long j14 = 10;
            i15--;
            bArr2[i15] = x63.a.f189308a[(int) (j8 % j14)];
            j8 /= j14;
        }
        if (z14) {
            bArr2[i15 - 1] = 45;
        }
        c0VarC.f183338c += i14;
        this.f183349b += (long) i14;
    }

    @Override // w63.g
    public final byte[] J2() {
        return s(this.f183349b);
    }

    public final void K(long j8) {
        if (j8 == 0) {
            H(48);
            return;
        }
        long j14 = (j8 >>> 1) | j8;
        long j15 = j14 | (j14 >>> 2);
        long j16 = j15 | (j15 >>> 4);
        long j17 = j16 | (j16 >>> 8);
        long j18 = j17 | (j17 >>> 16);
        long j19 = j18 | (j18 >>> 32);
        long j24 = j19 - ((j19 >>> 1) & 6148914691236517205L);
        long j25 = ((j24 >>> 2) & 3689348814741910323L) + (j24 & 3689348814741910323L);
        long j26 = ((j25 >>> 4) + j25) & 1085102592571150095L;
        long j27 = j26 + (j26 >>> 8);
        long j28 = j27 + (j27 >>> 16);
        int i14 = (int) ((((j28 & 63) + ((j28 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        c0 c0VarC = C(i14);
        byte[] bArr = c0VarC.f183336a;
        int i15 = c0VarC.f183338c;
        for (int i16 = (i15 + i14) - 1; i16 >= i15; i16--) {
            bArr[i16] = x63.a.f189308a[(int) (15 & j8)];
            j8 >>>= 4;
        }
        c0VarC.f183338c += i14;
        this.f183349b += (long) i14;
    }

    public final void L(int i14) {
        c0 c0VarC = C(4);
        byte[] bArr = c0VarC.f183336a;
        int i15 = c0VarC.f183338c;
        bArr[i15] = (byte) ((i14 >>> 24) & 255);
        bArr[i15 + 1] = (byte) ((i14 >>> 16) & 255);
        bArr[i15 + 2] = (byte) ((i14 >>> 8) & 255);
        bArr[i15 + 3] = (byte) (i14 & 255);
        c0VarC.f183338c = i15 + 4;
        this.f183349b += 4;
    }

    @Override // w63.g
    public final long L0() throws EOFException {
        int i14;
        if (this.f183349b == 0) {
            vb.h.m();
            return 0L;
        }
        int i15 = 0;
        boolean z14 = false;
        long j8 = 0;
        do {
            c0 c0Var = this.f183348a;
            c0Var.getClass();
            byte[] bArr = c0Var.f183336a;
            int i16 = c0Var.f183337b;
            int i17 = c0Var.f183338c;
            while (i16 < i17) {
                byte b14 = bArr[i16];
                if (b14 >= 48 && b14 <= 57) {
                    i14 = b14 - 48;
                } else if (b14 >= 97 && b14 <= 102) {
                    i14 = b14 - 87;
                } else {
                    if (b14 < 65 || b14 > 70) {
                        if (i15 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(w63.b.c(b14)));
                        }
                        z14 = true;
                        break;
                    }
                    i14 = b14 - 55;
                }
                if (((-1152921504606846976L) & j8) != 0) {
                    e eVar = new e();
                    eVar.K(j8);
                    eVar.H(b14);
                    throw new NumberFormatException("Number too large: ".concat(eVar.x()));
                }
                j8 = (j8 << 4) | ((long) i14);
                i16++;
                i15++;
            }
            if (i16 == i17) {
                this.f183348a = c0Var.a();
                d0.a(c0Var);
            } else {
                c0Var.f183337b = i16;
            }
            if (z14) {
                break;
            }
        } while (this.f183348a != null);
        this.f183349b -= (long) i15;
        return j8;
    }

    public final void N(long j8) {
        c0 c0VarC = C(8);
        byte[] bArr = c0VarC.f183336a;
        int i14 = c0VarC.f183338c;
        bArr[i14] = (byte) ((j8 >>> 56) & 255);
        bArr[i14 + 1] = (byte) ((j8 >>> 48) & 255);
        bArr[i14 + 2] = (byte) ((j8 >>> 40) & 255);
        bArr[i14 + 3] = (byte) ((j8 >>> 32) & 255);
        bArr[i14 + 4] = (byte) ((j8 >>> 24) & 255);
        bArr[i14 + 5] = (byte) ((j8 >>> 16) & 255);
        bArr[i14 + 6] = (byte) ((j8 >>> 8) & 255);
        bArr[i14 + 7] = (byte) (j8 & 255);
        c0VarC.f183338c = i14 + 8;
        this.f183349b += 8;
    }

    public final void O(int i14) {
        c0 c0VarC = C(2);
        byte[] bArr = c0VarC.f183336a;
        int i15 = c0VarC.f183338c;
        bArr[i15] = (byte) ((i14 >>> 8) & 255);
        bArr[i15 + 1] = (byte) (i14 & 255);
        c0VarC.f183338c = i15 + 2;
        this.f183349b += 2;
    }

    @Override // w63.f
    public final /* bridge */ /* synthetic */ f O3(h hVar) {
        E(hVar);
        return this;
    }

    public final void P(String str, int i14, int i15, Charset charset) {
        if (i14 < 0) {
            vb.h.x(am.j.h(i14, "beginIndex < 0: "));
            return;
        }
        if (i15 < i14) {
            vb.h.x(tn.k.e(i15, i14, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i15 > str.length()) {
            vb.h.n(str.length(), b71.i.i(i15, "endIndex > string.length: ", " > "));
        } else {
            if (charset.equals(d53.c.f57666b)) {
                Q(i14, i15, str);
                return;
            }
            byte[] bytes = str.substring(i14, i15).getBytes(charset);
            bytes.getClass();
            write(bytes, 0, bytes.length);
        }
    }

    @Override // w63.g
    public final String P2(Charset charset) {
        charset.getClass();
        return w(this.f183349b, charset);
    }

    public final void Q(int i14, int i15, String str) {
        char cCharAt;
        str.getClass();
        if (i14 < 0) {
            vb.h.x(am.j.h(i14, "beginIndex < 0: "));
            return;
        }
        if (i15 < i14) {
            vb.h.x(tn.k.e(i15, i14, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i15 > str.length()) {
            vb.h.n(str.length(), b71.i.i(i15, "endIndex > string.length: ", " > "));
            return;
        }
        while (i14 < i15) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 128) {
                c0 c0VarC = C(1);
                byte[] bArr = c0VarC.f183336a;
                int i16 = c0VarC.f183338c - i14;
                int iMin = Math.min(i15, 8192 - i16);
                int i17 = i14 + 1;
                bArr[i14 + i16] = (byte) cCharAt2;
                while (true) {
                    i14 = i17;
                    if (i14 >= iMin || (cCharAt = str.charAt(i14)) >= 128) {
                        break;
                    }
                    i17 = i14 + 1;
                    bArr[i14 + i16] = (byte) cCharAt;
                }
                int i18 = c0VarC.f183338c;
                int i19 = (i16 + i14) - i18;
                c0VarC.f183338c = i18 + i19;
                this.f183349b += (long) i19;
            } else {
                if (cCharAt2 < 2048) {
                    c0 c0VarC2 = C(2);
                    byte[] bArr2 = c0VarC2.f183336a;
                    int i24 = c0VarC2.f183338c;
                    bArr2[i24] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i24 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c0VarC2.f183338c = i24 + 2;
                    this.f183349b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    c0 c0VarC3 = C(3);
                    byte[] bArr3 = c0VarC3.f183336a;
                    int i25 = c0VarC3.f183338c;
                    bArr3[i25] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i25 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i25 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c0VarC3.f183338c = i25 + 3;
                    this.f183349b += 3;
                } else {
                    int i26 = i14 + 1;
                    char cCharAt3 = i26 < i15 ? str.charAt(i26) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        H(63);
                        i14 = i26;
                    } else {
                        int i27 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        c0 c0VarC4 = C(4);
                        byte[] bArr4 = c0VarC4.f183336a;
                        int i28 = c0VarC4.f183338c;
                        bArr4[i28] = (byte) ((i27 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        bArr4[i28 + 1] = (byte) (((i27 >> 12) & 63) | 128);
                        bArr4[i28 + 2] = (byte) (((i27 >> 6) & 63) | 128);
                        bArr4[i28 + 3] = (byte) ((i27 & 63) | 128);
                        c0VarC4.f183338c = i28 + 4;
                        this.f183349b += 4;
                        i14 += 2;
                    }
                }
                i14++;
            }
        }
    }

    public final void R(String str) {
        str.getClass();
        Q(0, str.length(), str);
    }

    public final void S(int i14) {
        if (i14 < 128) {
            H(i14);
            return;
        }
        if (i14 < 2048) {
            c0 c0VarC = C(2);
            byte[] bArr = c0VarC.f183336a;
            int i15 = c0VarC.f183338c;
            bArr[i15] = (byte) ((i14 >> 6) | 192);
            bArr[i15 + 1] = (byte) ((i14 & 63) | 128);
            c0VarC.f183338c = i15 + 2;
            this.f183349b += 2;
            return;
        }
        if (55296 <= i14 && i14 < 57344) {
            H(63);
            return;
        }
        if (i14 < 65536) {
            c0 c0VarC2 = C(3);
            byte[] bArr2 = c0VarC2.f183336a;
            int i16 = c0VarC2.f183338c;
            bArr2[i16] = (byte) ((i14 >> 12) | 224);
            bArr2[i16 + 1] = (byte) (((i14 >> 6) & 63) | 128);
            bArr2[i16 + 2] = (byte) ((i14 & 63) | 128);
            c0VarC2.f183338c = i16 + 3;
            this.f183349b += 3;
            return;
        }
        if (i14 > 1114111) {
            vb.h.s("Unexpected code point: 0x".concat(w63.b.d(i14)));
            return;
        }
        c0 c0VarC3 = C(4);
        byte[] bArr3 = c0VarC3.f183336a;
        int i17 = c0VarC3.f183338c;
        bArr3[i17] = (byte) ((i14 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr3[i17 + 1] = (byte) (((i14 >> 12) & 63) | 128);
        bArr3[i17 + 2] = (byte) (((i14 >> 6) & 63) | 128);
        bArr3[i17 + 3] = (byte) ((i14 & 63) | 128);
        c0VarC3.f183338c = i17 + 4;
        this.f183349b += 4;
    }

    @Override // w63.f
    public final /* bridge */ /* synthetic */ f T2(long j8) {
        K(j8);
        return this;
    }

    @Override // w63.g
    public final long V3(f0 f0Var) {
        long j8 = this.f183349b;
        if (j8 > 0) {
            f0Var.write(this, j8);
        }
        return j8;
    }

    @Override // w63.f
    public final f Z0() {
        return this;
    }

    public final void a() throws EOFException {
        skip(this.f183349b);
    }

    @Override // w63.g
    public final boolean b(long j8) {
        return this.f183349b >= j8;
    }

    public final long c() {
        long j8 = this.f183349b;
        if (j8 == 0) {
            return 0L;
        }
        c0 c0Var = this.f183348a;
        c0Var.getClass();
        c0 c0Var2 = c0Var.f183342g;
        c0Var2.getClass();
        int i14 = c0Var2.f183338c;
        return (i14 >= 8192 || !c0Var2.f183340e) ? j8 : j8 - ((long) (i14 - c0Var2.f183337b));
    }

    @Override // w63.g
    public final String c1(long j8) throws EOFException {
        if (j8 < 0) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "limit < 0: "));
            return null;
        }
        long j14 = j8 != Long.MAX_VALUE ? j8 + 1 : Long.MAX_VALUE;
        long jK = k((byte) 10, 0L, j14);
        if (jK != -1) {
            return x63.a.c(this, jK);
        }
        if (j14 < this.f183349b && j(j14 - 1) == 13 && j(j14) == 10) {
            return x63.a.c(this, j14);
        }
        e eVar = new e();
        f(0L, eVar, Math.min(32, this.f183349b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f183349b, j8) + " content=" + eVar.h0(eVar.f183349b).e() + (char) 8230);
    }

    public final Object clone() {
        return e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, w63.f0
    public final void close() {
    }

    @Override // w63.g
    /* JADX INFO: renamed from: d */
    public final e getF183329b() {
        return this;
    }

    @Override // w63.f
    public final /* bridge */ /* synthetic */ f d4(int i14, int i15, String str) {
        Q(i14, i15, str);
        return this;
    }

    public final e e() {
        e eVar = new e();
        if (this.f183349b == 0) {
            return eVar;
        }
        c0 c0Var = this.f183348a;
        c0Var.getClass();
        c0 c0VarC = c0Var.c();
        eVar.f183348a = c0VarC;
        c0VarC.f183342g = c0VarC;
        c0VarC.f183341f = c0VarC;
        for (c0 c0Var2 = c0Var.f183341f; c0Var2 != c0Var; c0Var2 = c0Var2.f183341f) {
            c0 c0Var3 = c0VarC.f183342g;
            c0Var3.getClass();
            c0Var2.getClass();
            c0Var3.b(c0Var2.c());
        }
        eVar.f183349b = this.f183349b;
        return eVar;
    }

    @Override // w63.f
    public final /* bridge */ /* synthetic */ f e0(long j8) {
        J(j8);
        return this;
    }

    @Override // w63.g
    public final void e2(e eVar, long j8) throws EOFException {
        eVar.getClass();
        long j14 = this.f183349b;
        if (j14 >= j8) {
            eVar.write(this, j8);
        } else {
            eVar.write(this, j14);
            vb.h.m();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        long j8 = this.f183349b;
        e eVar = (e) obj;
        if (j8 != eVar.f183349b) {
            return false;
        }
        if (j8 == 0) {
            return true;
        }
        c0 c0Var = this.f183348a;
        c0Var.getClass();
        c0 c0Var2 = eVar.f183348a;
        c0Var2.getClass();
        int i14 = c0Var.f183337b;
        int i15 = c0Var2.f183337b;
        long j14 = 0;
        while (j14 < this.f183349b) {
            long jMin = Math.min(c0Var.f183338c - i14, c0Var2.f183338c - i15);
            long j15 = 0;
            while (j15 < jMin) {
                int i16 = i14 + 1;
                int i17 = i15 + 1;
                if (c0Var.f183336a[i14] != c0Var2.f183336a[i15]) {
                    return false;
                }
                j15++;
                i14 = i16;
                i15 = i17;
            }
            if (i14 == c0Var.f183338c) {
                c0Var = c0Var.f183341f;
                c0Var.getClass();
                i14 = c0Var.f183337b;
            }
            if (i15 == c0Var2.f183338c) {
                c0Var2 = c0Var2.f183341f;
                c0Var2.getClass();
                i15 = c0Var2.f183337b;
            }
            j14 += jMin;
        }
        return true;
    }

    public final void f(long j8, e eVar, long j14) {
        eVar.getClass();
        long j15 = j8;
        w63.b.b(this.f183349b, j15, j14);
        if (j14 == 0) {
            return;
        }
        eVar.f183349b += j14;
        c0 c0Var = this.f183348a;
        while (true) {
            c0Var.getClass();
            long j16 = c0Var.f183338c - c0Var.f183337b;
            if (j15 < j16) {
                break;
            }
            j15 -= j16;
            c0Var = c0Var.f183341f;
        }
        c0 c0Var2 = c0Var;
        long j17 = j14;
        while (j17 > 0) {
            c0Var2.getClass();
            c0 c0VarC = c0Var2.c();
            int i14 = c0VarC.f183337b + ((int) j15);
            c0VarC.f183337b = i14;
            c0VarC.f183338c = Math.min(i14 + ((int) j17), c0VarC.f183338c);
            c0 c0Var3 = eVar.f183348a;
            if (c0Var3 == null) {
                c0VarC.f183342g = c0VarC;
                c0VarC.f183341f = c0VarC;
                eVar.f183348a = c0VarC;
            } else {
                c0 c0Var4 = c0Var3.f183342g;
                c0Var4.getClass();
                c0Var4.b(c0VarC);
            }
            j17 -= (long) (c0VarC.f183338c - c0VarC.f183337b);
            c0Var2 = c0Var2.f183341f;
            j15 = 0;
        }
    }

    @Override // w63.f, w63.f0, java.io.Flushable
    public final void flush() {
    }

    @Override // w63.g
    public final h h0(long j8) throws EOFException {
        if (j8 < 0 || j8 > 2147483647L) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount: "));
            return null;
        }
        if (this.f183349b < j8) {
            vb.h.m();
            return null;
        }
        if (j8 < 4096) {
            return new h(s(j8));
        }
        h hVarB = B((int) j8);
        skip(j8);
        return hVarB;
    }

    @Override // w63.f
    public final /* bridge */ /* synthetic */ f h1(String str) {
        R(str);
        return this;
    }

    public final int hashCode() {
        c0 c0Var = this.f183348a;
        if (c0Var == null) {
            return 0;
        }
        int i14 = 1;
        do {
            int i15 = c0Var.f183338c;
            for (int i16 = c0Var.f183337b; i16 < i15; i16++) {
                i14 = (i14 * 31) + c0Var.f183336a[i16];
            }
            c0Var = c0Var.f183341f;
            c0Var.getClass();
        } while (c0Var != this.f183348a);
        return i14;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte j(long j8) {
        w63.b.b(this.f183349b, j8, 1L);
        c0 c0Var = this.f183348a;
        c0Var.getClass();
        long j14 = this.f183349b;
        if (j14 - j8 < j8) {
            while (j14 > j8) {
                c0Var = c0Var.f183342g;
                c0Var.getClass();
                j14 -= (long) (c0Var.f183338c - c0Var.f183337b);
            }
            return c0Var.f183336a[(int) ((((long) c0Var.f183337b) + j8) - j14)];
        }
        long j15 = 0;
        while (true) {
            int i14 = c0Var.f183338c;
            int i15 = c0Var.f183337b;
            long j16 = ((long) (i14 - i15)) + j15;
            if (j16 > j8) {
                return c0Var.f183336a[(int) ((((long) i15) + j8) - j15)];
            }
            c0Var = c0Var.f183341f;
            c0Var.getClass();
            j15 = j16;
        }
    }

    @Override // w63.g
    public final int j1(w wVar) throws EOFException {
        wVar.getClass();
        int iD = x63.a.d(this, wVar, false);
        if (iD == -1) {
            return -1;
        }
        skip(wVar.f183404b[iD].d());
        return iD;
    }

    @Override // w63.g
    public final e j3() {
        return this;
    }

    public final long k(byte b14, long j8, long j14) {
        c0 c0Var;
        long j15 = 0;
        if (0 > j8 || j8 > j14) {
            StringBuilder sb3 = new StringBuilder("size=");
            sb3.append(this.f183349b);
            j20.x.j(j8, " fromIndex=", " toIndex=", sb3);
            sb3.append(j14);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        long j16 = this.f183349b;
        if (j14 > j16) {
            j14 = j16;
        }
        if (j8 == j14 || (c0Var = this.f183348a) == null) {
            return -1L;
        }
        if (j16 - j8 < j8) {
            while (j16 > j8) {
                c0Var = c0Var.f183342g;
                c0Var.getClass();
                j16 -= (long) (c0Var.f183338c - c0Var.f183337b);
            }
            while (j16 < j14) {
                byte[] bArr = c0Var.f183336a;
                int iMin = (int) Math.min(c0Var.f183338c, (((long) c0Var.f183337b) + j14) - j16);
                for (int i14 = (int) ((((long) c0Var.f183337b) + j8) - j16); i14 < iMin; i14++) {
                    if (bArr[i14] == b14) {
                        return ((long) (i14 - c0Var.f183337b)) + j16;
                    }
                }
                j16 += (long) (c0Var.f183338c - c0Var.f183337b);
                c0Var = c0Var.f183341f;
                c0Var.getClass();
                j8 = j16;
            }
            return -1L;
        }
        while (true) {
            long j17 = ((long) (c0Var.f183338c - c0Var.f183337b)) + j15;
            if (j17 > j8) {
                break;
            }
            c0Var = c0Var.f183341f;
            c0Var.getClass();
            j15 = j17;
        }
        while (j15 < j14) {
            byte[] bArr2 = c0Var.f183336a;
            int iMin2 = (int) Math.min(c0Var.f183338c, (((long) c0Var.f183337b) + j14) - j15);
            for (int i15 = (int) ((((long) c0Var.f183337b) + j8) - j15); i15 < iMin2; i15++) {
                if (bArr2[i15] == b14) {
                    return ((long) (i15 - c0Var.f183337b)) + j15;
                }
            }
            j15 += (long) (c0Var.f183338c - c0Var.f183337b);
            c0Var = c0Var.f183341f;
            c0Var.getClass();
            j8 = j15;
        }
        return -1L;
    }

    public final long l(long j8, h hVar) {
        hVar.getClass();
        long j14 = 0;
        if (j8 < 0) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "fromIndex < 0: "));
            return 0L;
        }
        c0 c0Var = this.f183348a;
        if (c0Var == null) {
            return -1L;
        }
        long j15 = this.f183349b;
        if (j15 - j8 < j8) {
            while (j15 > j8) {
                c0Var = c0Var.f183342g;
                c0Var.getClass();
                j15 -= (long) (c0Var.f183338c - c0Var.f183337b);
            }
            if (hVar.d() == 2) {
                byte bI = hVar.i(0);
                byte bI2 = hVar.i(1);
                while (j15 < this.f183349b) {
                    byte[] bArr = c0Var.f183336a;
                    int i14 = c0Var.f183338c;
                    for (int i15 = (int) ((((long) c0Var.f183337b) + j8) - j15); i15 < i14; i15++) {
                        byte b14 = bArr[i15];
                        if (b14 == bI || b14 == bI2) {
                            return ((long) (i15 - c0Var.f183337b)) + j15;
                        }
                    }
                    j15 += (long) (c0Var.f183338c - c0Var.f183337b);
                    c0Var = c0Var.f183341f;
                    c0Var.getClass();
                    j8 = j15;
                }
                return -1L;
            }
            byte[] bArrH = hVar.getF183363a();
            while (j15 < this.f183349b) {
                byte[] bArr2 = c0Var.f183336a;
                int i16 = c0Var.f183338c;
                for (int i17 = (int) ((((long) c0Var.f183337b) + j8) - j15); i17 < i16; i17++) {
                    byte b15 = bArr2[i17];
                    for (byte b16 : bArrH) {
                        if (b15 == b16) {
                            return ((long) (i17 - c0Var.f183337b)) + j15;
                        }
                    }
                }
                j15 += (long) (c0Var.f183338c - c0Var.f183337b);
                c0Var = c0Var.f183341f;
                c0Var.getClass();
                j8 = j15;
            }
            return -1L;
        }
        while (true) {
            long j16 = ((long) (c0Var.f183338c - c0Var.f183337b)) + j14;
            if (j16 > j8) {
                break;
            }
            c0Var = c0Var.f183341f;
            c0Var.getClass();
            j14 = j16;
        }
        if (hVar.d() == 2) {
            byte bI3 = hVar.i(0);
            byte bI4 = hVar.i(1);
            while (j14 < this.f183349b) {
                byte[] bArr3 = c0Var.f183336a;
                int i18 = c0Var.f183338c;
                for (int i19 = (int) ((((long) c0Var.f183337b) + j8) - j14); i19 < i18; i19++) {
                    byte b17 = bArr3[i19];
                    if (b17 == bI3 || b17 == bI4) {
                        return ((long) (i19 - c0Var.f183337b)) + j14;
                    }
                }
                j14 += (long) (c0Var.f183338c - c0Var.f183337b);
                c0Var = c0Var.f183341f;
                c0Var.getClass();
                j8 = j14;
            }
            return -1L;
        }
        byte[] bArrH2 = hVar.getF183363a();
        while (j14 < this.f183349b) {
            byte[] bArr4 = c0Var.f183336a;
            int i24 = c0Var.f183338c;
            for (int i25 = (int) ((((long) c0Var.f183337b) + j8) - j14); i25 < i24; i25++) {
                byte b18 = bArr4[i25];
                for (byte b19 : bArrH2) {
                    if (b18 == b19) {
                        return ((long) (i25 - c0Var.f183337b)) + j14;
                    }
                }
            }
            j14 += (long) (c0Var.f183338c - c0Var.f183337b);
            c0Var = c0Var.f183341f;
            c0Var.getClass();
            j8 = j14;
        }
        return -1L;
    }

    @Override // w63.f
    public final f l3() {
        return this;
    }

    public final boolean n(int i14, h hVar, long j8) {
        hVar.getClass();
        if (i14 >= 0 && j8 >= 0 && ((long) i14) + j8 <= this.f183349b && i14 <= hVar.d()) {
            return i14 == 0 || x63.a.a(this, hVar, j8, j8 + 1, i14) != -1;
        }
        return false;
    }

    @Override // w63.g
    public final long o3(long j8, h hVar) {
        hVar.getClass();
        byte[] bArr = x63.a.f189308a;
        return x63.a.a(this, hVar, 0L, j8, hVar.d());
    }

    public final a p(a aVar) {
        aVar.getClass();
        byte[] bArr = x63.a.f189308a;
        if (aVar == w63.b.f183326a) {
            aVar = new a();
        }
        if (aVar.f183350a != null) {
            vb.h.z("already attached to a buffer");
            return null;
        }
        aVar.f183350a = this;
        aVar.f183351b = true;
        return aVar;
    }

    @Override // w63.f
    public final /* bridge */ /* synthetic */ f p4(int i14, int i15, byte[] bArr) {
        write(bArr, i14, i15);
        return this;
    }

    @Override // w63.g
    public final b0 peek() {
        return new b0(new z(this));
    }

    public final int read(byte[] bArr, int i14, int i15) {
        bArr.getClass();
        w63.b.b(bArr.length, i14, i15);
        c0 c0Var = this.f183348a;
        if (c0Var == null) {
            return -1;
        }
        int iMin = Math.min(i15, c0Var.f183338c - c0Var.f183337b);
        byte[] bArr2 = c0Var.f183336a;
        int i16 = c0Var.f183337b;
        p13.s.e(bArr2, i14, i16, bArr, i16 + iMin);
        int i17 = c0Var.f183337b + iMin;
        c0Var.f183337b = i17;
        this.f183349b -= (long) iMin;
        if (i17 == c0Var.f183338c) {
            this.f183348a = c0Var.a();
            d0.a(c0Var);
        }
        return iMin;
    }

    @Override // w63.g
    public final byte readByte() throws EOFException {
        if (this.f183349b == 0) {
            vb.h.m();
            return (byte) 0;
        }
        c0 c0Var = this.f183348a;
        c0Var.getClass();
        int i14 = c0Var.f183337b;
        int i15 = c0Var.f183338c;
        int i16 = i14 + 1;
        byte b14 = c0Var.f183336a[i14];
        this.f183349b--;
        if (i16 != i15) {
            c0Var.f183337b = i16;
            return b14;
        }
        this.f183348a = c0Var.a();
        d0.a(c0Var);
        return b14;
    }

    @Override // w63.g
    public final void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i14 = 0;
        while (i14 < bArr.length) {
            int i15 = read(bArr, i14, bArr.length - i14);
            if (i15 == -1) {
                vb.h.m();
                return;
            }
            i14 += i15;
        }
    }

    @Override // w63.g
    public final int readInt() throws EOFException {
        if (this.f183349b < 4) {
            vb.h.m();
            return 0;
        }
        c0 c0Var = this.f183348a;
        c0Var.getClass();
        int i14 = c0Var.f183337b;
        int i15 = c0Var.f183338c;
        if (i15 - i14 < 4) {
            return ((readByte() & UnsignedBytes.MAX_VALUE) << 24) | ((readByte() & UnsignedBytes.MAX_VALUE) << 16) | ((readByte() & UnsignedBytes.MAX_VALUE) << 8) | (readByte() & UnsignedBytes.MAX_VALUE);
        }
        byte[] bArr = c0Var.f183336a;
        int i16 = i14 + 3;
        int i17 = ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i14] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 8);
        int i18 = i14 + 4;
        int i19 = (bArr[i16] & UnsignedBytes.MAX_VALUE) | i17;
        this.f183349b -= 4;
        if (i18 != i15) {
            c0Var.f183337b = i18;
            return i19;
        }
        this.f183348a = c0Var.a();
        d0.a(c0Var);
        return i19;
    }

    @Override // w63.g
    public final long readLong() throws EOFException {
        if (this.f183349b < 8) {
            vb.h.m();
            return 0L;
        }
        c0 c0Var = this.f183348a;
        c0Var.getClass();
        int i14 = c0Var.f183337b;
        int i15 = c0Var.f183338c;
        if (i15 - i14 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c0Var.f183336a;
        int i16 = i14 + 7;
        long j8 = ((((long) bArr[i14]) & 255) << 56) | ((((long) bArr[i14 + 1]) & 255) << 48) | ((((long) bArr[i14 + 2]) & 255) << 40) | ((((long) bArr[i14 + 3]) & 255) << 32) | ((((long) bArr[i14 + 4]) & 255) << 24) | ((((long) bArr[i14 + 5]) & 255) << 16) | ((((long) bArr[i14 + 6]) & 255) << 8);
        int i17 = i14 + 8;
        long j14 = j8 | (((long) bArr[i16]) & 255);
        this.f183349b -= 8;
        if (i17 != i15) {
            c0Var.f183337b = i17;
            return j14;
        }
        this.f183348a = c0Var.a();
        d0.a(c0Var);
        return j14;
    }

    @Override // w63.g
    public final short readShort() throws EOFException {
        if (this.f183349b < 2) {
            vb.h.m();
            return (short) 0;
        }
        c0 c0Var = this.f183348a;
        c0Var.getClass();
        int i14 = c0Var.f183337b;
        int i15 = c0Var.f183338c;
        if (i15 - i14 < 2) {
            return (short) (((readByte() & UnsignedBytes.MAX_VALUE) << 8) | (readByte() & UnsignedBytes.MAX_VALUE));
        }
        byte[] bArr = c0Var.f183336a;
        int i16 = i14 + 1;
        int i17 = (bArr[i14] & UnsignedBytes.MAX_VALUE) << 8;
        int i18 = i14 + 2;
        int i19 = (bArr[i16] & UnsignedBytes.MAX_VALUE) | i17;
        this.f183349b -= 2;
        if (i18 == i15) {
            this.f183348a = c0Var.a();
            d0.a(c0Var);
        } else {
            c0Var.f183337b = i18;
        }
        return (short) i19;
    }

    public final byte[] s(long j8) throws EOFException {
        if (j8 < 0 || j8 > 2147483647L) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount: "));
            return null;
        }
        if (this.f183349b < j8) {
            vb.h.m();
            return null;
        }
        byte[] bArr = new byte[(int) j8];
        readFully(bArr);
        return bArr;
    }

    @Override // w63.g
    public final String s1() {
        return c1(Long.MAX_VALUE);
    }

    @Override // w63.g
    public final void skip(long j8) throws EOFException {
        while (j8 > 0) {
            c0 c0Var = this.f183348a;
            if (c0Var == null) {
                vb.h.m();
                return;
            }
            int iMin = (int) Math.min(j8, c0Var.f183338c - c0Var.f183337b);
            long j14 = iMin;
            this.f183349b -= j14;
            j8 -= j14;
            int i14 = c0Var.f183337b + iMin;
            c0Var.f183337b = i14;
            if (i14 == c0Var.f183338c) {
                this.f183348a = c0Var.a();
                d0.a(c0Var);
            }
        }
    }

    @Override // w63.g
    public final long t1(h hVar) {
        hVar.getClass();
        return l(0L, hVar);
    }

    @Override // w63.f
    public final OutputStream t4() {
        return new c();
    }

    @Override // w63.g0
    public final h0 timeout() {
        return h0.NONE;
    }

    public final String toString() {
        long j8 = this.f183349b;
        if (j8 <= 2147483647L) {
            return B((int) j8).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f183349b).toString());
    }

    public final short v() throws EOFException {
        short s8 = readShort();
        a aVar = w63.b.f183326a;
        return (short) (((s8 & 255) << 8) | ((65280 & s8) >>> 8));
    }

    @Override // w63.g
    public final InputStream v4() {
        return new b();
    }

    public final String w(long j8, Charset charset) throws EOFException {
        charset.getClass();
        if (j8 < 0 || j8 > 2147483647L) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount: "));
            return null;
        }
        if (this.f183349b < j8) {
            vb.h.m();
            return null;
        }
        if (j8 == 0) {
            return "";
        }
        c0 c0Var = this.f183348a;
        c0Var.getClass();
        int i14 = c0Var.f183337b;
        if (((long) i14) + j8 > c0Var.f183338c) {
            return new String(s(j8), charset);
        }
        int i15 = (int) j8;
        String str = new String(c0Var.f183336a, i14, i15, charset);
        int i16 = c0Var.f183337b + i15;
        c0Var.f183337b = i16;
        this.f183349b -= j8;
        if (i16 == c0Var.f183338c) {
            this.f183348a = c0Var.a();
            d0.a(c0Var);
        }
        return str;
    }

    @Override // w63.f0
    public final void write(e eVar, long j8) {
        c0 c0VarB;
        eVar.getClass();
        if (eVar == this) {
            vb.h.s("source == this");
            return;
        }
        w63.b.b(eVar.f183349b, 0L, j8);
        while (j8 > 0) {
            c0 c0Var = eVar.f183348a;
            c0Var.getClass();
            int i14 = c0Var.f183338c;
            c0 c0Var2 = eVar.f183348a;
            c0Var2.getClass();
            long j14 = i14 - c0Var2.f183337b;
            int i15 = 0;
            if (j8 < j14) {
                c0 c0Var3 = this.f183348a;
                c0 c0Var4 = c0Var3 != null ? c0Var3.f183342g : null;
                if (c0Var4 != null && c0Var4.f183340e) {
                    if ((((long) c0Var4.f183338c) + j8) - ((long) (c0Var4.f183339d ? 0 : c0Var4.f183337b)) <= 8192) {
                        c0 c0Var5 = eVar.f183348a;
                        c0Var5.getClass();
                        c0Var5.d(c0Var4, (int) j8);
                        eVar.f183349b -= j8;
                        this.f183349b += j8;
                        return;
                    }
                }
                c0 c0Var6 = eVar.f183348a;
                c0Var6.getClass();
                int i16 = (int) j8;
                if (i16 <= 0 || i16 > c0Var6.f183338c - c0Var6.f183337b) {
                    vb.h.s("byteCount out of range");
                    return;
                }
                if (i16 >= 1024) {
                    c0VarB = c0Var6.c();
                } else {
                    c0VarB = d0.b();
                    byte[] bArr = c0Var6.f183336a;
                    byte[] bArr2 = c0VarB.f183336a;
                    int i17 = c0Var6.f183337b;
                    p13.s.e(bArr, 0, i17, bArr2, i17 + i16);
                }
                c0VarB.f183338c = c0VarB.f183337b + i16;
                c0Var6.f183337b += i16;
                c0 c0Var7 = c0Var6.f183342g;
                c0Var7.getClass();
                c0Var7.b(c0VarB);
                eVar.f183348a = c0VarB;
            }
            c0 c0Var8 = eVar.f183348a;
            c0Var8.getClass();
            long j15 = c0Var8.f183338c - c0Var8.f183337b;
            eVar.f183348a = c0Var8.a();
            c0 c0Var9 = this.f183348a;
            if (c0Var9 == null) {
                this.f183348a = c0Var8;
                c0Var8.f183342g = c0Var8;
                c0Var8.f183341f = c0Var8;
            } else {
                c0 c0Var10 = c0Var9.f183342g;
                c0Var10.getClass();
                c0Var10.b(c0Var8);
                c0 c0Var11 = c0Var8.f183342g;
                if (c0Var11 == c0Var8) {
                    vb.h.z("cannot compact");
                    return;
                }
                c0Var11.getClass();
                if (c0Var11.f183340e) {
                    int i18 = c0Var8.f183338c - c0Var8.f183337b;
                    c0 c0Var12 = c0Var8.f183342g;
                    c0Var12.getClass();
                    int i19 = 8192 - c0Var12.f183338c;
                    c0 c0Var13 = c0Var8.f183342g;
                    c0Var13.getClass();
                    if (!c0Var13.f183339d) {
                        c0 c0Var14 = c0Var8.f183342g;
                        c0Var14.getClass();
                        i15 = c0Var14.f183337b;
                    }
                    if (i18 <= i19 + i15) {
                        c0 c0Var15 = c0Var8.f183342g;
                        c0Var15.getClass();
                        c0Var8.d(c0Var15, i18);
                        c0Var8.a();
                        d0.a(c0Var8);
                    }
                }
            }
            eVar.f183349b -= j15;
            this.f183349b += j15;
            j8 -= j15;
        }
    }

    @Override // w63.f
    public final /* bridge */ /* synthetic */ f writeByte(int i14) {
        H(i14);
        return this;
    }

    @Override // w63.f
    public final /* bridge */ /* synthetic */ f writeInt(int i14) {
        L(i14);
        return this;
    }

    @Override // w63.f
    public final /* bridge */ /* synthetic */ f writeShort(int i14) {
        O(i14);
        return this;
    }

    public final String x() {
        return w(this.f183349b, d53.c.f57666b);
    }

    public final int z() throws EOFException {
        int i14;
        int i15;
        int i16;
        if (this.f183349b == 0) {
            vb.h.m();
            return 0;
        }
        byte bJ = j(0L);
        if ((bJ & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            i14 = bJ & Ascii.DEL;
            i16 = 0;
            i15 = 1;
        } else if ((bJ & 224) == 192) {
            i14 = bJ & Ascii.US;
            i15 = 2;
            i16 = 128;
        } else if ((bJ & 240) == 224) {
            i14 = bJ & Ascii.SI;
            i15 = 3;
            i16 = 2048;
        } else {
            if ((bJ & 248) != 240) {
                skip(1L);
                return FileManagerCompat.GARMIN_DEVICE_XML_FILE_INDEX;
            }
            i14 = bJ & 7;
            i15 = 4;
            i16 = 65536;
        }
        long j8 = i15;
        if (this.f183349b < j8) {
            StringBuilder sbI = b71.i.i(i15, "size < ", ": ");
            sbI.append(this.f183349b);
            sbI.append(" (to read code point prefixed 0x");
            sbI.append(w63.b.c(bJ));
            sbI.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            throw new EOFException(sbI.toString());
        }
        for (int i17 = 1; i17 < i15; i17++) {
            long j14 = i17;
            byte bJ2 = j(j14);
            if ((bJ2 & 192) != 128) {
                skip(j14);
                return FileManagerCompat.GARMIN_DEVICE_XML_FILE_INDEX;
            }
            i14 = (i14 << 6) | (bJ2 & 63);
        }
        skip(j8);
        if (i14 > 1114111) {
            return FileManagerCompat.GARMIN_DEVICE_XML_FILE_INDEX;
        }
        return ((55296 > i14 || i14 >= 57344) && i14 >= i16) ? i14 : FileManagerCompat.GARMIN_DEVICE_XML_FILE_INDEX;
    }

    @Override // w63.g
    public final h z0() {
        return h0(this.f183349b);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"w63/e$c", "Ljava/io/OutputStream;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends OutputStream {
        public c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }

        public final String toString() {
            return e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i14, int i15) {
            bArr.getClass();
            e.this.write(bArr, i14, i15);
        }

        @Override // java.io.OutputStream
        public final void write(int i14) {
            e.this.H(i14);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"w63/e$b", "Ljava/io/InputStream;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(e.this.f183349b, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            e eVar = e.this;
            if (eVar.f183349b > 0) {
                return eVar.readByte() & UnsignedBytes.MAX_VALUE;
            }
            return -1;
        }

        public final String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i14, int i15) {
            bArr.getClass();
            return e.this.read(bArr, i14, i15);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        c0 c0Var = this.f183348a;
        if (c0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c0Var.f183338c - c0Var.f183337b);
        byteBuffer.put(c0Var.f183336a, c0Var.f183337b, iMin);
        int i14 = c0Var.f183337b + iMin;
        c0Var.f183337b = i14;
        this.f183349b -= (long) iMin;
        if (i14 == c0Var.f183338c) {
            this.f183348a = c0Var.a();
            d0.a(c0Var);
        }
        return iMin;
    }

    @Override // w63.g0
    public final long read(e eVar, long j8) {
        eVar.getClass();
        if (j8 >= 0) {
            long j14 = this.f183349b;
            if (j14 == 0) {
                return -1L;
            }
            if (j8 > j14) {
                j8 = j14;
            }
            eVar.write(this, j8);
            return j8;
        }
        vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount < 0: "));
        return 0L;
    }

    @Override // w63.f
    public final f write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i14 = iRemaining;
        while (i14 > 0) {
            c0 c0VarC = C(1);
            int iMin = Math.min(i14, 8192 - c0VarC.f183338c);
            byteBuffer.get(c0VarC.f183336a, c0VarC.f183338c, iMin);
            i14 -= iMin;
            c0VarC.f183338c += iMin;
        }
        this.f183349b += (long) iRemaining;
        return iRemaining;
    }

    public final void write(byte[] bArr, int i14, int i15) {
        bArr.getClass();
        long j8 = i15;
        w63.b.b(bArr.length, i14, j8);
        int i16 = i15 + i14;
        while (i14 < i16) {
            c0 c0VarC = C(1);
            int iMin = Math.min(i16 - i14, 8192 - c0VarC.f183338c);
            int i17 = i14 + iMin;
            p13.s.e(bArr, c0VarC.f183338c, i14, c0VarC.f183336a, i17);
            c0VarC.f183338c += iMin;
            i14 = i17;
        }
        this.f183349b += j8;
    }
}
