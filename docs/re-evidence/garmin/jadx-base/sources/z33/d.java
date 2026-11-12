package z33;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f202168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f202169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f202170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f202171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f202172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f202173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f202174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f202175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f202176i;

    private d(m mVar) {
        this.f202175h = Integer.MAX_VALUE;
        this.f202168a = mVar.f202211b;
        int iR = mVar.r();
        this.f202171d = iR;
        this.f202169b = mVar.size() + iR;
        this.f202174g = -this.f202171d;
        this.f202172e = null;
    }

    public static d c(InputStream inputStream) {
        return new d(inputStream);
    }

    public final void a(int i14) throws InvalidProtocolBufferException {
        if (this.f202173f != i14) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final int b() {
        int i14 = this.f202175h;
        if (i14 == Integer.MAX_VALUE) {
            return -1;
        }
        return i14 - (this.f202174g + this.f202171d);
    }

    public final void d(int i14) {
        this.f202175h = i14;
        p();
    }

    public final int e(int i14) throws InvalidProtocolBufferException {
        if (i14 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i15 = this.f202174g + this.f202171d + i14;
        int i16 = this.f202175h;
        if (i15 > i16) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f202175h = i15;
        p();
        return i16;
    }

    public final m f() {
        int iL = l();
        int i14 = this.f202169b;
        int i15 = this.f202171d;
        if (iL > i14 - i15 || iL <= 0) {
            return iL == 0 ? c.f202161a : new m(i(iL));
        }
        m mVar = c.f202161a;
        byte[] bArr = new byte[iL];
        System.arraycopy(this.f202168a, i15, bArr, 0, iL);
        m mVar2 = new m(bArr);
        this.f202171d += iL;
        return mVar2;
    }

    public final int g() {
        return l();
    }

    public final <T extends n> T h(p<T> pVar, e eVar) throws InvalidProtocolBufferException {
        int iL = l();
        if (this.f202176i >= 64) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iE = e(iL);
        this.f202176i++;
        T tA = pVar.a(this, eVar);
        a(0);
        this.f202176i--;
        d(iE);
        return tA;
    }

    public final byte[] i(int i14) throws InvalidProtocolBufferException {
        if (i14 <= 0) {
            if (i14 == 0) {
                return h.f202205a;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i15 = this.f202174g;
        int i16 = this.f202171d;
        int i17 = i15 + i16 + i14;
        int i18 = this.f202175h;
        if (i17 > i18) {
            s((i18 - i15) - i16);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = this.f202168a;
        if (i14 < 4096) {
            byte[] bArr2 = new byte[i14];
            int i19 = this.f202169b - i16;
            System.arraycopy(bArr, i16, bArr2, 0, i19);
            this.f202171d = this.f202169b;
            int i24 = i14 - i19;
            if (i24 > 0) {
                q(i24);
            }
            System.arraycopy(bArr, 0, bArr2, i19, i24);
            this.f202171d = i24;
            return bArr2;
        }
        int i25 = this.f202169b;
        this.f202174g = i15 + i25;
        this.f202171d = 0;
        this.f202169b = 0;
        int length = i25 - i16;
        int i26 = i14 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i26 > 0) {
            int iMin = Math.min(i26, 4096);
            byte[] bArr3 = new byte[iMin];
            int i27 = 0;
            while (i27 < iMin) {
                InputStream inputStream = this.f202172e;
                int i28 = inputStream == null ? -1 : inputStream.read(bArr3, i27, iMin - i27);
                if (i28 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f202174g += i28;
                i27 += i28;
            }
            i26 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i14];
        System.arraycopy(bArr, i16, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final int j() throws InvalidProtocolBufferException {
        int i14 = this.f202171d;
        if (this.f202169b - i14 < 4) {
            q(4);
            i14 = this.f202171d;
        }
        this.f202171d = i14 + 4;
        byte[] bArr = this.f202168a;
        return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public final long k() throws InvalidProtocolBufferException {
        int i14 = this.f202171d;
        if (this.f202169b - i14 < 8) {
            q(8);
            i14 = this.f202171d;
        }
        this.f202171d = i14 + 8;
        byte[] bArr = this.f202168a;
        return ((((long) bArr[i14 + 7]) & 255) << 56) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48);
    }

    public final int l() {
        int i14;
        int i15 = this.f202171d;
        int i16 = this.f202169b;
        if (i16 != i15) {
            int i17 = i15 + 1;
            byte[] bArr = this.f202168a;
            byte b14 = bArr[i15];
            if (b14 >= 0) {
                this.f202171d = i17;
                return b14;
            }
            if (i16 - i17 >= 9) {
                int i18 = i15 + 2;
                int i19 = (bArr[i17] << 7) ^ b14;
                long j8 = i19;
                if (j8 < 0) {
                    i14 = (int) ((-128) ^ j8);
                } else {
                    int i24 = i15 + 3;
                    int i25 = (bArr[i18] << Ascii.SO) ^ i19;
                    long j14 = i25;
                    if (j14 >= 0) {
                        i14 = (int) (16256 ^ j14);
                    } else {
                        int i26 = i15 + 4;
                        int i27 = i25 ^ (bArr[i24] << Ascii.NAK);
                        long j15 = i27;
                        if (j15 < 0) {
                            i14 = (int) ((-2080896) ^ j15);
                        } else {
                            i24 = i15 + 5;
                            byte b15 = bArr[i26];
                            int i28 = (int) (((long) (i27 ^ (b15 << Ascii.FS))) ^ 266354560);
                            if (b15 < 0) {
                                i26 = i15 + 6;
                                if (bArr[i24] < 0) {
                                    i24 = i15 + 7;
                                    if (bArr[i26] < 0) {
                                        i26 = i15 + 8;
                                        if (bArr[i24] < 0) {
                                            i24 = i15 + 9;
                                            if (bArr[i26] < 0) {
                                                int i29 = i15 + 10;
                                                if (bArr[i24] >= 0) {
                                                    i18 = i29;
                                                    i14 = i28;
                                                }
                                            }
                                        }
                                    }
                                }
                                i14 = i28;
                            }
                            i14 = i28;
                        }
                        i18 = i26;
                    }
                    i18 = i24;
                }
                this.f202171d = i18;
                return i14;
            }
        }
        return (int) n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m() {
        long j8;
        long j14;
        long j15;
        int i14 = this.f202171d;
        int i15 = this.f202169b;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f202168a;
            byte b14 = bArr[i14];
            if (b14 >= 0) {
                this.f202171d = i16;
                return b14;
            }
            if (i15 - i16 >= 9) {
                int i17 = i14 + 2;
                long j16 = (bArr[i16] << 7) ^ b14;
                if (j16 >= 0) {
                    int i18 = i14 + 3;
                    long j17 = j16 ^ ((long) (bArr[i17] << Ascii.SO));
                    if (j17 >= 0) {
                        j15 = 16256;
                    } else {
                        i17 = i14 + 4;
                        j16 = j17 ^ ((long) (bArr[i18] << Ascii.NAK));
                        if (j16 < 0) {
                            j14 = -2080896;
                        } else {
                            i18 = i14 + 5;
                            j17 = j16 ^ (((long) bArr[i17]) << 28);
                            if (j17 >= 0) {
                                j15 = 266354560;
                            } else {
                                i17 = i14 + 6;
                                j16 = j17 ^ (((long) bArr[i18]) << 35);
                                if (j16 >= 0) {
                                    i18 = i14 + 7;
                                    j17 = j16 ^ (((long) bArr[i17]) << 42);
                                    if (j17 >= 0) {
                                        j15 = 4363953127296L;
                                    } else {
                                        i17 = i14 + 8;
                                        j16 = j17 ^ (((long) bArr[i18]) << 49);
                                        if (j16 < 0) {
                                            j14 = -558586000294016L;
                                        } else {
                                            int i19 = i14 + 9;
                                            long j18 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            i17 = j18 < 0 ? i14 + 10 : i19;
                                            j8 = j18;
                                        }
                                    }
                                    this.f202171d = i17;
                                    return j8;
                                }
                                j14 = -34093383808L;
                            }
                        }
                    }
                    i17 = i18;
                    j8 = j15 ^ j17;
                    this.f202171d = i17;
                    return j8;
                }
                j14 = -128;
                j8 = j14 ^ j16;
                this.f202171d = i17;
                return j8;
            }
        }
        return n();
    }

    public final long n() throws InvalidProtocolBufferException {
        long j8 = 0;
        for (int i14 = 0; i14 < 64; i14 += 7) {
            if (this.f202171d == this.f202169b) {
                q(1);
            }
            int i15 = this.f202171d;
            this.f202171d = i15 + 1;
            byte b14 = this.f202168a[i15];
            j8 |= ((long) (b14 & Ascii.DEL)) << i14;
            if ((b14 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j8;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public final int o() throws InvalidProtocolBufferException {
        if (this.f202171d == this.f202169b && !t(1)) {
            this.f202173f = 0;
            return 0;
        }
        int iL = l();
        this.f202173f = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public final void p() {
        int i14 = this.f202169b + this.f202170c;
        this.f202169b = i14;
        int i15 = this.f202174g + i14;
        int i16 = this.f202175h;
        if (i15 <= i16) {
            this.f202170c = 0;
            return;
        }
        int i17 = i15 - i16;
        this.f202170c = i17;
        this.f202169b = i14 - i17;
    }

    public final void q(int i14) throws InvalidProtocolBufferException {
        if (!t(i14)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final boolean r(int i14, CodedOutputStream codedOutputStream) throws IOException {
        boolean zR;
        int i15 = i14 & 7;
        if (i15 == 0) {
            long jM = m();
            codedOutputStream.v(i14);
            codedOutputStream.w(jM);
            return true;
        }
        if (i15 == 1) {
            long jK = k();
            codedOutputStream.v(i14);
            codedOutputStream.u(jK);
            return true;
        }
        if (i15 == 2) {
            m mVarF = f();
            codedOutputStream.v(i14);
            codedOutputStream.v(mVarF.size());
            codedOutputStream.r(mVarF);
            return true;
        }
        if (i15 != 3) {
            if (i15 == 4) {
                return false;
            }
            if (i15 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iJ = j();
            codedOutputStream.v(i14);
            codedOutputStream.t(iJ);
            return true;
        }
        codedOutputStream.v(i14);
        do {
            int iO = o();
            if (iO == 0) {
                break;
            }
            int i16 = this.f202176i;
            if (i16 >= 64) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f202176i = i16 + 1;
            zR = r(iO, codedOutputStream);
            this.f202176i--;
        } while (zR);
        int i17 = ((i14 >>> 3) << 3) | 4;
        a(i17);
        codedOutputStream.v(i17);
        return true;
    }

    public final void s(int i14) throws InvalidProtocolBufferException {
        int i15 = this.f202169b;
        int i16 = this.f202171d;
        if (i14 <= i15 - i16 && i14 >= 0) {
            this.f202171d = i16 + i14;
            return;
        }
        if (i14 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i17 = this.f202174g;
        int i18 = i17 + i16 + i14;
        int i19 = this.f202175h;
        if (i18 > i19) {
            s((i19 - i17) - i16);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i24 = i15 - i16;
        this.f202171d = i15;
        q(1);
        while (true) {
            int i25 = i14 - i24;
            int i26 = this.f202169b;
            if (i25 <= i26) {
                this.f202171d = i25;
                return;
            } else {
                i24 += i26;
                this.f202171d = i26;
                q(1);
            }
        }
    }

    public final boolean t(int i14) throws IOException {
        InputStream inputStream;
        int i15 = this.f202171d;
        int i16 = i15 + i14;
        int i17 = this.f202169b;
        if (i16 <= i17) {
            vb.h.z(e0.f(i14, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        if (this.f202174g + i15 + i14 <= this.f202175h && (inputStream = this.f202172e) != null) {
            byte[] bArr = this.f202168a;
            if (i15 > 0) {
                if (i17 > i15) {
                    System.arraycopy(bArr, i15, bArr, 0, i17 - i15);
                }
                this.f202174g += i15;
                this.f202169b -= i15;
                this.f202171d = 0;
            }
            int i18 = this.f202169b;
            int i19 = inputStream.read(bArr, i18, bArr.length - i18);
            if (i19 == 0 || i19 < -1 || i19 > bArr.length) {
                vb.h.z(e0.f(i19, "InputStream#read(byte[]) returned invalid result: ", "\nThe InputStream implementation is buggy."));
                return false;
            }
            if (i19 > 0) {
                this.f202169b += i19;
                if ((this.f202174g + i14) - 67108864 > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                p();
                if (this.f202169b >= i14) {
                    return true;
                }
                return t(i14);
            }
        }
        return false;
    }

    private d(InputStream inputStream) {
        this.f202175h = Integer.MAX_VALUE;
        this.f202168a = new byte[4096];
        this.f202169b = 0;
        this.f202171d = 0;
        this.f202174g = 0;
        this.f202172e = inputStream;
    }
}
