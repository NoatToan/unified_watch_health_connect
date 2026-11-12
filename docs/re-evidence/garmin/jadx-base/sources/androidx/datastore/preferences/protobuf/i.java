package androidx.datastore.preferences.protobuf;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f6723d;

    public static final class b extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f6724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6725f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6726g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6727h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f6728i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6729j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f6730k;

        private b(byte[] bArr, int i14, int i15, boolean z14) {
            super();
            this.f6730k = Integer.MAX_VALUE;
            this.f6724e = bArr;
            this.f6725f = i15 + i14;
            this.f6727h = i14;
            this.f6728i = i14;
        }

        public final int A() throws InvalidProtocolBufferException {
            int i14 = this.f6727h;
            if (this.f6725f - i14 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f6727h = i14 + 4;
            byte[] bArr = this.f6724e;
            return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        public final long B() throws InvalidProtocolBufferException {
            int i14 = this.f6727h;
            if (this.f6725f - i14 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f6727h = i14 + 8;
            byte[] bArr = this.f6724e;
            return ((((long) bArr[i14 + 7]) & 255) << 56) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48);
        }

        public final int C() {
            int i14;
            int i15 = this.f6727h;
            int i16 = this.f6725f;
            if (i16 != i15) {
                int i17 = i15 + 1;
                byte[] bArr = this.f6724e;
                byte b14 = bArr[i15];
                if (b14 >= 0) {
                    this.f6727h = i17;
                    return b14;
                }
                if (i16 - i17 >= 9) {
                    int i18 = i15 + 2;
                    int i19 = (bArr[i17] << 7) ^ b14;
                    if (i19 < 0) {
                        i14 = i19 ^ (-128);
                    } else {
                        int i24 = i15 + 3;
                        int i25 = (bArr[i18] << Ascii.SO) ^ i19;
                        if (i25 >= 0) {
                            i14 = i25 ^ 16256;
                        } else {
                            int i26 = i15 + 4;
                            int i27 = i25 ^ (bArr[i24] << Ascii.NAK);
                            if (i27 < 0) {
                                i14 = (-2080896) ^ i27;
                            } else {
                                i24 = i15 + 5;
                                byte b15 = bArr[i26];
                                int i28 = (i27 ^ (b15 << Ascii.FS)) ^ 266354560;
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
                    this.f6727h = i18;
                    return i14;
                }
            }
            return (int) E();
        }

        public final long D() {
            long j8;
            long j14;
            long j15;
            long j16;
            int i14 = this.f6727h;
            int i15 = this.f6725f;
            if (i15 != i14) {
                int i16 = i14 + 1;
                byte[] bArr = this.f6724e;
                byte b14 = bArr[i14];
                if (b14 >= 0) {
                    this.f6727h = i16;
                    return b14;
                }
                if (i15 - i16 >= 9) {
                    int i17 = i14 + 2;
                    int i18 = (bArr[i16] << 7) ^ b14;
                    if (i18 < 0) {
                        j8 = i18 ^ (-128);
                    } else {
                        int i19 = i14 + 3;
                        int i24 = (bArr[i17] << Ascii.SO) ^ i18;
                        if (i24 >= 0) {
                            j8 = i24 ^ 16256;
                            i17 = i19;
                        } else {
                            int i25 = i14 + 4;
                            int i26 = i24 ^ (bArr[i19] << Ascii.NAK);
                            if (i26 < 0) {
                                j16 = (-2080896) ^ i26;
                            } else {
                                long j17 = i26;
                                i17 = i14 + 5;
                                long j18 = j17 ^ (((long) bArr[i25]) << 28);
                                if (j18 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    i25 = i14 + 6;
                                    long j19 = j18 ^ (((long) bArr[i17]) << 35);
                                    if (j19 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        i17 = i14 + 7;
                                        j18 = j19 ^ (((long) bArr[i25]) << 42);
                                        if (j18 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            i25 = i14 + 8;
                                            j19 = j18 ^ (((long) bArr[i17]) << 49);
                                            if (j19 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                i17 = i14 + 9;
                                                long j24 = (j19 ^ (((long) bArr[i25]) << 56)) ^ 71499008037633920L;
                                                if (j24 < 0) {
                                                    int i27 = i14 + 10;
                                                    if (bArr[i17] >= 0) {
                                                        i17 = i27;
                                                    }
                                                }
                                                j8 = j24;
                                            }
                                        }
                                    }
                                    j16 = j14 ^ j19;
                                }
                                j8 = j15 ^ j18;
                            }
                            i17 = i25;
                            j8 = j16;
                        }
                    }
                    this.f6727h = i17;
                    return j8;
                }
            }
            return E();
        }

        public final long E() throws InvalidProtocolBufferException {
            long j8 = 0;
            for (int i14 = 0; i14 < 64; i14 += 7) {
                int i15 = this.f6727h;
                if (i15 == this.f6725f) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f6727h = i15 + 1;
                byte b14 = this.f6724e[i15];
                j8 |= ((long) (b14 & Ascii.DEL)) << i14;
                if ((b14 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final void F() {
            int i14 = this.f6725f + this.f6726g;
            this.f6725f = i14;
            int i15 = i14 - this.f6728i;
            int i16 = this.f6730k;
            if (i15 <= i16) {
                this.f6726g = 0;
                return;
            }
            int i17 = i15 - i16;
            this.f6726g = i17;
            this.f6725f = i14 - i17;
        }

        public final void G(int i14) throws InvalidProtocolBufferException {
            if (i14 >= 0) {
                int i15 = this.f6725f;
                int i16 = this.f6727h;
                if (i14 <= i15 - i16) {
                    this.f6727h = i16 + i14;
                    return;
                }
            }
            if (i14 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final void a(int i14) throws InvalidProtocolBufferException {
            if (this.f6729j != i14) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int b() {
            return this.f6727h - this.f6728i;
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final boolean c() {
            return this.f6727h == this.f6725f;
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final void e(int i14) {
            this.f6730k = i14;
            F();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int f(int i14) throws InvalidProtocolBufferException {
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iB = b() + i14;
            if (iB < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i15 = this.f6730k;
            if (iB > i15) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f6730k = iB;
            F();
            return i15;
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final boolean g() {
            return D() != 0;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0042  */
        @Override // androidx.datastore.preferences.protobuf.i
        public final h.C0094h h() throws InvalidProtocolBufferException {
            byte[] bArrCopyOfRange;
            int iC = C();
            byte[] bArr = this.f6724e;
            if (iC > 0) {
                int i14 = this.f6725f;
                int i15 = this.f6727h;
                if (iC <= i14 - i15) {
                    h.C0094h c0094hC = h.c(i15, iC, bArr);
                    this.f6727h += iC;
                    return c0094hC;
                }
            }
            if (iC == 0) {
                return h.f6707b;
            }
            if (iC > 0) {
                int i16 = this.f6725f;
                int i17 = this.f6727h;
                if (iC <= i16 - i17) {
                    int i18 = iC + i17;
                    this.f6727h = i18;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i17, i18);
                } else {
                    if (iC <= 0) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    if (iC == 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    bArrCopyOfRange = z.f6937b;
                }
            } else {
                if (iC <= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (iC == 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                bArrCopyOfRange = z.f6937b;
            }
            h.C0094h c0094h = h.f6707b;
            return new h.C0094h(bArrCopyOfRange);
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final double i() {
            return Double.longBitsToDouble(B());
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int j() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int k() {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final long l() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final float m() {
            return Float.intBitsToFloat(A());
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int n() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final long o() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int p() {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final long q() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int r() {
            int iC = C();
            return (-(iC & 1)) ^ (iC >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final long s() {
            long jD = D();
            return (-(jD & 1)) ^ (jD >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final String t() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC > 0) {
                int i14 = this.f6725f;
                int i15 = this.f6727h;
                if (iC <= i14 - i15) {
                    String str = new String(this.f6724e, i15, iC, z.f6936a);
                    this.f6727h += iC;
                    return str;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final String u() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC > 0) {
                int i14 = this.f6725f;
                int i15 = this.f6727h;
                if (iC <= i14 - i15) {
                    String strA = q1.f6808a.a(this.f6724e, i15, iC);
                    this.f6727h += iC;
                    return strA;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int v() throws InvalidProtocolBufferException {
            if (c()) {
                this.f6729j = 0;
                return 0;
            }
            int iC = C();
            this.f6729j = iC;
            if ((iC >>> 3) != 0) {
                return iC;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int w() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final long x() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final boolean y(int i14) throws InvalidProtocolBufferException {
            int i15 = i14 & 7;
            int i16 = 0;
            if (i15 != 0) {
                if (i15 == 1) {
                    G(8);
                    return true;
                }
                if (i15 == 2) {
                    G(C());
                    return true;
                }
                if (i15 == 3) {
                    z();
                    a(((i14 >>> 3) << 3) | 4);
                    return true;
                }
                if (i15 == 4) {
                    return false;
                }
                if (i15 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                G(4);
                return true;
            }
            int i17 = this.f6725f - this.f6727h;
            byte[] bArr = this.f6724e;
            if (i17 >= 10) {
                while (i16 < 10) {
                    int i18 = this.f6727h;
                    this.f6727h = i18 + 1;
                    if (bArr[i18] < 0) {
                        i16++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i16 < 10) {
                int i19 = this.f6727h;
                if (i19 == this.f6725f) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f6727h = i19 + 1;
                if (bArr[i19] < 0) {
                    i16++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
            return true;
        }
    }

    public static final class c extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InputStream f6731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f6732f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6733g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6734h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6735i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6736j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f6737k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f6738l;

        private c(InputStream inputStream, int i14) {
            super();
            this.f6738l = Integer.MAX_VALUE;
            z.a(inputStream, "input");
            this.f6731e = inputStream;
            this.f6732f = new byte[i14];
            this.f6733g = 0;
            this.f6735i = 0;
            this.f6737k = 0;
        }

        public final byte[] A(int i14) throws IOException {
            byte[] bArrB = B(i14);
            if (bArrB != null) {
                return bArrB;
            }
            int i15 = this.f6735i;
            int i16 = this.f6733g;
            int length = i16 - i15;
            this.f6737k += i16;
            this.f6735i = 0;
            this.f6733g = 0;
            ArrayList<byte[]> arrayListC = C(i14 - length);
            byte[] bArr = new byte[i14];
            System.arraycopy(this.f6732f, i15, bArr, 0, length);
            for (byte[] bArr2 : arrayListC) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] B(int i14) throws IOException {
            if (i14 == 0) {
                return z.f6937b;
            }
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i15 = this.f6737k;
            int i16 = this.f6735i;
            int i17 = i15 + i16 + i14;
            if (i17 - this.f6722c > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i18 = this.f6738l;
            if (i17 > i18) {
                K((i18 - i15) - i16);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i19 = this.f6733g - i16;
            int i24 = i14 - i19;
            InputStream inputStream = this.f6731e;
            if (i24 >= 4096) {
                try {
                    if (i24 > inputStream.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e4) {
                    e4.setThrownFromInputStream();
                    throw e4;
                }
            }
            byte[] bArr = new byte[i14];
            System.arraycopy(this.f6732f, this.f6735i, bArr, 0, i19);
            this.f6737k += this.f6733g;
            this.f6735i = 0;
            this.f6733g = 0;
            while (i19 < i14) {
                try {
                    int i25 = inputStream.read(bArr, i19, i14 - i19);
                    if (i25 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.f6737k += i25;
                    i19 += i25;
                } catch (InvalidProtocolBufferException e14) {
                    e14.setThrownFromInputStream();
                    throw e14;
                }
            }
            return bArr;
        }

        public final ArrayList C(int i14) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i14 > 0) {
                int iMin = Math.min(i14, 4096);
                byte[] bArr = new byte[iMin];
                int i15 = 0;
                while (i15 < iMin) {
                    int i16 = this.f6731e.read(bArr, i15, iMin - i15);
                    if (i16 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.f6737k += i16;
                    i15 += i16;
                }
                i14 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int D() throws InvalidProtocolBufferException {
            int i14 = this.f6735i;
            if (this.f6733g - i14 < 4) {
                J(4);
                i14 = this.f6735i;
            }
            this.f6735i = i14 + 4;
            byte[] bArr = this.f6732f;
            return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        public final long E() throws InvalidProtocolBufferException {
            int i14 = this.f6735i;
            if (this.f6733g - i14 < 8) {
                J(8);
                i14 = this.f6735i;
            }
            this.f6735i = i14 + 8;
            byte[] bArr = this.f6732f;
            return ((((long) bArr[i14 + 7]) & 255) << 56) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48);
        }

        public final int F() {
            int i14;
            int i15 = this.f6735i;
            int i16 = this.f6733g;
            if (i16 != i15) {
                int i17 = i15 + 1;
                byte[] bArr = this.f6732f;
                byte b14 = bArr[i15];
                if (b14 >= 0) {
                    this.f6735i = i17;
                    return b14;
                }
                if (i16 - i17 >= 9) {
                    int i18 = i15 + 2;
                    int i19 = (bArr[i17] << 7) ^ b14;
                    if (i19 < 0) {
                        i14 = i19 ^ (-128);
                    } else {
                        int i24 = i15 + 3;
                        int i25 = (bArr[i18] << Ascii.SO) ^ i19;
                        if (i25 >= 0) {
                            i14 = i25 ^ 16256;
                        } else {
                            int i26 = i15 + 4;
                            int i27 = i25 ^ (bArr[i24] << Ascii.NAK);
                            if (i27 < 0) {
                                i14 = (-2080896) ^ i27;
                            } else {
                                i24 = i15 + 5;
                                byte b15 = bArr[i26];
                                int i28 = (i27 ^ (b15 << Ascii.FS)) ^ 266354560;
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
                    this.f6735i = i18;
                    return i14;
                }
            }
            return (int) H();
        }

        public final long G() {
            long j8;
            long j14;
            long j15;
            long j16;
            int i14 = this.f6735i;
            int i15 = this.f6733g;
            if (i15 != i14) {
                int i16 = i14 + 1;
                byte[] bArr = this.f6732f;
                byte b14 = bArr[i14];
                if (b14 >= 0) {
                    this.f6735i = i16;
                    return b14;
                }
                if (i15 - i16 >= 9) {
                    int i17 = i14 + 2;
                    int i18 = (bArr[i16] << 7) ^ b14;
                    if (i18 < 0) {
                        j8 = i18 ^ (-128);
                    } else {
                        int i19 = i14 + 3;
                        int i24 = (bArr[i17] << Ascii.SO) ^ i18;
                        if (i24 >= 0) {
                            j8 = i24 ^ 16256;
                            i17 = i19;
                        } else {
                            int i25 = i14 + 4;
                            int i26 = i24 ^ (bArr[i19] << Ascii.NAK);
                            if (i26 < 0) {
                                j16 = (-2080896) ^ i26;
                            } else {
                                long j17 = i26;
                                i17 = i14 + 5;
                                long j18 = j17 ^ (((long) bArr[i25]) << 28);
                                if (j18 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    i25 = i14 + 6;
                                    long j19 = j18 ^ (((long) bArr[i17]) << 35);
                                    if (j19 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        i17 = i14 + 7;
                                        j18 = j19 ^ (((long) bArr[i25]) << 42);
                                        if (j18 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            i25 = i14 + 8;
                                            j19 = j18 ^ (((long) bArr[i17]) << 49);
                                            if (j19 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                i17 = i14 + 9;
                                                long j24 = (j19 ^ (((long) bArr[i25]) << 56)) ^ 71499008037633920L;
                                                if (j24 < 0) {
                                                    int i27 = i14 + 10;
                                                    if (bArr[i17] >= 0) {
                                                        i17 = i27;
                                                    }
                                                }
                                                j8 = j24;
                                            }
                                        }
                                    }
                                    j16 = j14 ^ j19;
                                }
                                j8 = j15 ^ j18;
                            }
                            i17 = i25;
                            j8 = j16;
                        }
                    }
                    this.f6735i = i17;
                    return j8;
                }
            }
            return H();
        }

        public final long H() throws InvalidProtocolBufferException {
            long j8 = 0;
            for (int i14 = 0; i14 < 64; i14 += 7) {
                if (this.f6735i == this.f6733g) {
                    J(1);
                }
                int i15 = this.f6735i;
                this.f6735i = i15 + 1;
                byte b14 = this.f6732f[i15];
                j8 |= ((long) (b14 & Ascii.DEL)) << i14;
                if ((b14 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final void I() {
            int i14 = this.f6733g + this.f6734h;
            this.f6733g = i14;
            int i15 = this.f6737k + i14;
            int i16 = this.f6738l;
            if (i15 <= i16) {
                this.f6734h = 0;
                return;
            }
            int i17 = i15 - i16;
            this.f6734h = i17;
            this.f6733g = i14 - i17;
        }

        public final void J(int i14) throws InvalidProtocolBufferException {
            if (L(i14)) {
                return;
            }
            if (i14 <= (this.f6722c - this.f6737k) - this.f6735i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        public final void K(int i14) throws InvalidProtocolBufferException {
            int i15 = this.f6733g;
            int i16 = this.f6735i;
            if (i14 <= i15 - i16 && i14 >= 0) {
                this.f6735i = i16 + i14;
                return;
            }
            InputStream inputStream = this.f6731e;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i17 = this.f6737k;
            int i18 = i17 + i16;
            int i19 = i18 + i14;
            int i24 = this.f6738l;
            if (i19 > i24) {
                K((i24 - i17) - i16);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f6737k = i18;
            int i25 = i15 - i16;
            this.f6733g = 0;
            this.f6735i = 0;
            while (i25 < i14) {
                long j8 = i14 - i25;
                try {
                    try {
                        long jSkip = inputStream.skip(j8);
                        if (jSkip < 0 || jSkip > j8) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i25 += (int) jSkip;
                        }
                    } catch (InvalidProtocolBufferException e4) {
                        e4.setThrownFromInputStream();
                        throw e4;
                    }
                } catch (Throwable th3) {
                    this.f6737k += i25;
                    I();
                    throw th3;
                }
            }
            this.f6737k += i25;
            I();
            if (i25 >= i14) {
                return;
            }
            int i26 = this.f6733g;
            int i27 = i26 - this.f6735i;
            this.f6735i = i26;
            J(1);
            while (true) {
                int i28 = i14 - i27;
                int i29 = this.f6733g;
                if (i28 <= i29) {
                    this.f6735i = i28;
                    return;
                } else {
                    i27 += i29;
                    this.f6735i = i29;
                    J(1);
                }
            }
        }

        public final boolean L(int i14) throws IOException {
            InputStream inputStream = this.f6731e;
            int i15 = this.f6735i;
            int i16 = i15 + i14;
            int i17 = this.f6733g;
            if (i16 <= i17) {
                vb.h.z(v.e0.f(i14, "refillBuffer() called when ", " bytes were already available in buffer"));
                return false;
            }
            int i18 = this.f6737k;
            int i19 = this.f6722c;
            if (i14 <= (i19 - i18) - i15 && i18 + i15 + i14 <= this.f6738l) {
                byte[] bArr = this.f6732f;
                if (i15 > 0) {
                    if (i17 > i15) {
                        System.arraycopy(bArr, i15, bArr, 0, i17 - i15);
                    }
                    this.f6737k += i15;
                    this.f6733g -= i15;
                    this.f6735i = 0;
                }
                int i24 = this.f6733g;
                try {
                    int i25 = inputStream.read(bArr, i24, Math.min(bArr.length - i24, (i19 - this.f6737k) - i24));
                    if (i25 == 0 || i25 < -1 || i25 > bArr.length) {
                        com.google.firebase.messaging.l.f(i25, inputStream.getClass());
                        return false;
                    }
                    if (i25 > 0) {
                        this.f6733g += i25;
                        I();
                        if (this.f6733g >= i14) {
                            return true;
                        }
                        return L(i14);
                    }
                } catch (InvalidProtocolBufferException e4) {
                    e4.setThrownFromInputStream();
                    throw e4;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final void a(int i14) throws InvalidProtocolBufferException {
            if (this.f6736j != i14) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int b() {
            return this.f6737k + this.f6735i;
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final boolean c() {
            return this.f6735i == this.f6733g && !L(1);
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final void e(int i14) {
            this.f6738l = i14;
            I();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int f(int i14) throws InvalidProtocolBufferException {
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i15 = this.f6737k + this.f6735i + i14;
            if (i15 < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i16 = this.f6738l;
            if (i15 > i16) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f6738l = i15;
            I();
            return i16;
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final boolean g() {
            return G() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final h.C0094h h() throws IOException {
            int iF = F();
            int i14 = this.f6733g;
            int i15 = this.f6735i;
            int i16 = i14 - i15;
            byte[] bArr = this.f6732f;
            if (iF <= i16 && iF > 0) {
                h.C0094h c0094hC = h.c(i15, iF, bArr);
                this.f6735i += iF;
                return c0094hC;
            }
            if (iF == 0) {
                return h.f6707b;
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArrB = B(iF);
            if (bArrB != null) {
                return h.c(0, bArrB.length, bArrB);
            }
            int i17 = this.f6735i;
            int i18 = this.f6733g;
            int length = i18 - i17;
            this.f6737k += i18;
            this.f6735i = 0;
            this.f6733g = 0;
            ArrayList<byte[]> arrayListC = C(iF - length);
            byte[] bArr2 = new byte[iF];
            System.arraycopy(bArr, i17, bArr2, 0, length);
            for (byte[] bArr3 : arrayListC) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            h.C0094h c0094h = h.f6707b;
            return new h.C0094h(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final double i() {
            return Double.longBitsToDouble(E());
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int j() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int k() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final long l() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final float m() {
            return Float.intBitsToFloat(D());
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int n() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final long o() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int p() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final long q() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int r() {
            int iF = F();
            return (-(iF & 1)) ^ (iF >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final long s() {
            long jG = G();
            return (-(jG & 1)) ^ (jG >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final String t() throws InvalidProtocolBufferException {
            int iF = F();
            byte[] bArr = this.f6732f;
            if (iF > 0) {
                int i14 = this.f6733g;
                int i15 = this.f6735i;
                if (iF <= i14 - i15) {
                    String str = new String(bArr, i15, iF, z.f6936a);
                    this.f6735i += iF;
                    return str;
                }
            }
            if (iF == 0) {
                return "";
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (iF > this.f6733g) {
                return new String(A(iF), z.f6936a);
            }
            J(iF);
            String str2 = new String(bArr, this.f6735i, iF, z.f6936a);
            this.f6735i += iF;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final String u() throws IOException {
            int iF = F();
            int i14 = this.f6735i;
            int i15 = this.f6733g;
            int i16 = i15 - i14;
            byte[] bArrA = this.f6732f;
            if (iF <= i16 && iF > 0) {
                this.f6735i = i14 + iF;
            } else {
                if (iF == 0) {
                    return "";
                }
                if (iF < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                i14 = 0;
                if (iF <= i15) {
                    J(iF);
                    this.f6735i = iF;
                } else {
                    bArrA = A(iF);
                }
            }
            return q1.f6808a.a(bArrA, i14, iF);
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int v() throws InvalidProtocolBufferException {
            if (c()) {
                this.f6736j = 0;
                return 0;
            }
            int iF = F();
            this.f6736j = iF;
            if ((iF >>> 3) != 0) {
                return iF;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final int w() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final long x() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.i
        public final boolean y(int i14) throws InvalidProtocolBufferException {
            int i15 = i14 & 7;
            int i16 = 0;
            if (i15 != 0) {
                if (i15 == 1) {
                    K(8);
                    return true;
                }
                if (i15 == 2) {
                    K(F());
                    return true;
                }
                if (i15 == 3) {
                    z();
                    a(((i14 >>> 3) << 3) | 4);
                    return true;
                }
                if (i15 == 4) {
                    return false;
                }
                if (i15 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                K(4);
                return true;
            }
            int i17 = this.f6733g - this.f6735i;
            byte[] bArr = this.f6732f;
            if (i17 >= 10) {
                while (i16 < 10) {
                    int i18 = this.f6735i;
                    this.f6735i = i18 + 1;
                    if (bArr[i18] < 0) {
                        i16++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i16 < 10) {
                if (this.f6735i == this.f6733g) {
                    J(1);
                }
                int i19 = this.f6735i;
                this.f6735i = i19 + 1;
                if (bArr[i19] < 0) {
                    i16++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
            return true;
        }
    }

    private i() {
        this.f6721b = 100;
        this.f6722c = Integer.MAX_VALUE;
    }

    public static b d(byte[] bArr, int i14, int i15, boolean z14) {
        b bVar = new b(bArr, i14, i15, z14);
        try {
            bVar.f(i15);
            return bVar;
        } catch (InvalidProtocolBufferException e4) {
            l2.t(e4);
            return null;
        }
    }

    public abstract void a(int i14);

    public abstract int b();

    public abstract boolean c();

    public abstract void e(int i14);

    public abstract int f(int i14);

    public abstract boolean g();

    public abstract h.C0094h h();

    public abstract double i();

    public abstract int j();

    public abstract int k();

    public abstract long l();

    public abstract float m();

    public abstract int n();

    public abstract long o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract String t();

    public abstract String u();

    public abstract int v();

    public abstract int w();

    public abstract long x();

    public abstract boolean y(int i14);

    public final void z() throws InvalidProtocolBufferException {
        boolean zY;
        do {
            int iV = v();
            if (iV == 0) {
                return;
            }
            int i14 = this.f6720a;
            if (i14 >= this.f6721b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f6720a = i14 + 1;
            zY = y(iV);
            this.f6720a--;
        } while (zY);
    }
}
