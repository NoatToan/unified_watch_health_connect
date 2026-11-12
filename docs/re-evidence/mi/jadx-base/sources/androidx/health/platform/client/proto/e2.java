package androidx.health.platform.client.proto;

import defpackage.hbq;
import defpackage.t91;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2487a;

    public static class a {
        public static void h(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || m(b4) || m(b5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iR = ((b2 & 7) << 18) | (r(b3) << 12) | (r(b4) << 6) | r(b5);
            cArr[i] = l(iR);
            cArr[i + 1] = q(iR);
        }

        public static void i(byte b2, char[] cArr, int i) {
            cArr[i] = (char) b2;
        }

        public static void j(byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || m(b4)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b2 & 15) << 12) | (r(b3) << 6) | r(b4));
        }

        public static void k(byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b2 < -62 || m(b3)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b2 & 31) << 6) | r(b3));
        }

        public static char l(int i) {
            return (char) ((i >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        }

        public static boolean m(byte b2) {
            return b2 > -65;
        }

        public static boolean n(byte b2) {
            return b2 >= 0;
        }

        public static boolean o(byte b2) {
            return b2 < -16;
        }

        public static boolean p(byte b2) {
            return b2 < -32;
        }

        public static char q(int i) {
            return (char) ((i & 1023) + Utf8.LOG_SURROGATE_HEADER);
        }

        public static int r(byte b2) {
            return b2 & 63;
        }
    }

    public static abstract class b {
        public static int j(ByteBuffer byteBuffer, int i, int i2) {
            int iL = i + e2.l(byteBuffer, i, i2);
            while (iL < i2) {
                int i3 = iL + 1;
                byte b2 = byteBuffer.get(iL);
                if (b2 >= 0) {
                    iL = i3;
                } else if (b2 < -32) {
                    if (i3 >= i2) {
                        return b2;
                    }
                    if (b2 < -62 || byteBuffer.get(i3) > -65) {
                        return -1;
                    }
                    iL += 2;
                } else {
                    if (b2 >= -16) {
                        if (i3 >= i2 - 2) {
                            return e2.p(byteBuffer, b2, i3, i2 - i3);
                        }
                        int i4 = iL + 2;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                            int i5 = iL + 3;
                            if (byteBuffer.get(i4) <= -65) {
                                iL += 4;
                                if (byteBuffer.get(i5) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return e2.p(byteBuffer, b2, i3, i2 - i3);
                    }
                    int i6 = iL + 2;
                    byte b4 = byteBuffer.get(i3);
                    if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || byteBuffer.get(i6) > -65))) {
                        return -1;
                    }
                    iL += 3;
                }
            }
            return 0;
        }

        public final String a(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            }
            return byteBuffer.isDirect() ? d(byteBuffer, i, i2) : c(byteBuffer, i, i2);
        }

        public abstract String b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        public final String c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = byteBuffer.get(i);
                if (!a.n(b2)) {
                    break;
                }
                i++;
                a.i(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = byteBuffer.get(i);
                if (a.n(b3)) {
                    int i7 = i5 + 1;
                    a.i(b3, cArr, i5);
                    while (i6 < i3) {
                        byte b4 = byteBuffer.get(i6);
                        if (!a.n(b4)) {
                            break;
                        }
                        i6++;
                        a.i(b4, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i6;
                } else if (a.p(b3)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    a.k(b3, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (a.o(b3)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i + 2;
                    i += 3;
                    a.j(b3, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = byteBuffer.get(i6);
                    int i9 = i + 3;
                    byte b6 = byteBuffer.get(i + 2);
                    i += 4;
                    a.h(b3, b5, b6, byteBuffer.get(i9), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        public abstract String d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        public abstract int e(CharSequence charSequence, byte[] bArr, int i, int i2);

        public final boolean f(ByteBuffer byteBuffer, int i, int i2) {
            return h(0, byteBuffer, i, i2) == 0;
        }

        public final boolean g(byte[] bArr, int i, int i2) {
            return i(0, bArr, i, i2) == 0;
        }

        public final int h(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? l(i, byteBuffer, i2, i3) : k(i, byteBuffer, i2, i3);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return i(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
        }

        public abstract int i(int i, byte[] bArr, int i2, int i3);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int k(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = androidx.health.platform.client.proto.e2.a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = androidx.health.platform.client.proto.e2.a(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = androidx.health.platform.client.proto.e2.b(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = j(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.platform.client.proto.e2.b.k(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int l(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    public static final class c extends b {
        public static int m(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return n(bArr, i, i2);
        }

        public static int n(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i3 >= i2) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 >= -16) {
                        if (i3 >= i2 - 2) {
                            return e2.q(bArr, i3, i2);
                        }
                        int i4 = i + 2;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                            int i5 = i + 3;
                            if (bArr[i4] <= -65) {
                                i += 4;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return e2.q(bArr, i3, i2);
                    }
                    int i6 = i + 2;
                    byte b4 = bArr[i3];
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        i += 3;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return -1;
                }
                i = i3;
            }
            return 0;
        }

        @Override // androidx.health.platform.client.proto.e2.b
        public String b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                if (!a.n(b2)) {
                    break;
                }
                i++;
                a.i(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = bArr[i];
                if (a.n(b3)) {
                    int i7 = i5 + 1;
                    a.i(b3, cArr, i5);
                    while (i6 < i3) {
                        byte b4 = bArr[i6];
                        if (!a.n(b4)) {
                            break;
                        }
                        i6++;
                        a.i(b4, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i6;
                } else if (a.p(b3)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    a.k(b3, bArr[i6], cArr, i5);
                    i5++;
                } else if (a.o(b3)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i + 2;
                    i += 3;
                    a.j(b3, bArr[i6], bArr[i8], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = bArr[i6];
                    int i9 = i + 3;
                    byte b6 = bArr[i + 2];
                    i += 4;
                    a.h(b3, b5, b6, bArr[i9], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.health.platform.client.proto.e2.b
        public String d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return c(byteBuffer, i, i2);
        }

        @Override // androidx.health.platform.client.proto.e2.b
        public int e(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int length = charSequence.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = charSequence.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = charSequence.charAt(i6);
                if (cCharAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) cCharAt2;
                    i7++;
                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                    i7 += 2;
                    bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                throw new d(i6, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                        }
                        int i9 = i6 + 1;
                        if (i9 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | 128);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new d(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i11 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i7 += 3;
                    bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
                }
                i6++;
            }
            return i7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.health.platform.client.proto.e2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int i(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.health.platform.client.proto.e2.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.health.platform.client.proto.e2.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.health.platform.client.proto.e2.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.platform.client.proto.e2.c.i(int, byte[], int, int):int");
        }

        @Override // androidx.health.platform.client.proto.e2.b
        public int l(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return k(i, byteBuffer, i2, i3);
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static final class e extends b {
        public static boolean m() {
            return hbq.I() && hbq.J();
        }

        public static int n(long j, int i) {
            int iP = p(j, i);
            long j2 = j + ((long) iP);
            int i2 = i - iP;
            while (true) {
                byte bW = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bW = hbq.w(j2);
                    if (bW < 0) {
                        j2 = j3;
                        break;
                    }
                    i2--;
                    j2 = j3;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (bW < -32) {
                    if (i3 == 0) {
                        return bW;
                    }
                    i2 -= 2;
                    if (bW >= -62) {
                        long j4 = 1 + j2;
                        if (hbq.w(j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bW >= -16) {
                    if (i3 < 3) {
                        return r(j2, bW, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bW2 = hbq.w(j2);
                    if (bW2 <= -65 && (((bW << 28) + (bW2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (hbq.w(j5) <= -65) {
                            j2 += 3;
                            if (hbq.w(j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return r(j2, bW, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bW3 = hbq.w(j2);
                if (bW3 <= -65 && ((bW != -32 || bW3 >= -96) && (bW != -19 || bW3 < -96))) {
                    j2 += 2;
                    if (hbq.w(j7) > -65) {
                    }
                }
                return -1;
            }
        }

        public static int o(byte[] bArr, long j, int i) {
            int iQ = q(bArr, j, i);
            int i2 = i - iQ;
            long j2 = j + ((long) iQ);
            while (true) {
                byte bX = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bX = hbq.x(bArr, j2);
                    if (bX < 0) {
                        j2 = j3;
                        break;
                    }
                    i2--;
                    j2 = j3;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (bX < -32) {
                    if (i3 == 0) {
                        return bX;
                    }
                    i2 -= 2;
                    if (bX >= -62) {
                        long j4 = 1 + j2;
                        if (hbq.x(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bX >= -16) {
                    if (i3 < 3) {
                        return s(bArr, bX, j2, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bX2 = hbq.x(bArr, j2);
                    if (bX2 <= -65 && (((bX << 28) + (bX2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (hbq.x(bArr, j5) <= -65) {
                            j2 += 3;
                            if (hbq.x(bArr, j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return s(bArr, bX, j2, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bX3 = hbq.x(bArr, j2);
                if (bX3 <= -65 && ((bX != -32 || bX3 >= -96) && (bX != -19 || bX3 < -96))) {
                    j2 += 2;
                    if (hbq.x(bArr, j7) > -65) {
                    }
                }
                return -1;
            }
        }

        public static int p(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = (int) ((-j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (hbq.w(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (hbq.D(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        public static int q(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            int i3 = 8 - (((int) j) & 7);
            while (i2 < i3) {
                long j2 = 1 + j;
                if (hbq.x(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            while (true) {
                int i4 = i2 + 8;
                if (i4 > i || (hbq.E(bArr, hbq.h + j) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j += 8;
                i2 = i4;
            }
            while (i2 < i) {
                long j3 = j + 1;
                if (hbq.x(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j3;
            }
            return i;
        }

        public static int r(long j, int i, int i2) {
            if (i2 == 0) {
                return e2.m(i);
            }
            if (i2 == 1) {
                return e2.n(i, hbq.w(j));
            }
            if (i2 == 2) {
                return e2.o(i, hbq.w(j), hbq.w(j + 1));
            }
            throw new AssertionError();
        }

        public static int s(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return e2.m(i);
            }
            if (i2 == 1) {
                return e2.n(i, hbq.x(bArr, j));
            }
            if (i2 == 2) {
                return e2.o(i, hbq.x(bArr, j), hbq.x(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.health.platform.client.proto.e2.b
        public String b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            Charset charset = f0.f2490b;
            String str = new String(bArr, i, i2, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // androidx.health.platform.client.proto.e2.b
        public String d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long jK = hbq.k(byteBuffer) + ((long) i);
            long j = ((long) i2) + jK;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (jK < j) {
                byte bW = hbq.w(jK);
                if (!a.n(bW)) {
                    break;
                }
                jK++;
                a.i(bW, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (jK < j) {
                long j2 = jK + 1;
                byte bW2 = hbq.w(jK);
                if (a.n(bW2)) {
                    int i5 = i4 + 1;
                    a.i(bW2, cArr, i4);
                    while (j2 < j) {
                        byte bW3 = hbq.w(j2);
                        if (!a.n(bW3)) {
                            break;
                        }
                        j2++;
                        a.i(bW3, cArr, i5);
                        i5++;
                    }
                    i4 = i5;
                    jK = j2;
                } else if (a.p(bW2)) {
                    if (j2 >= j) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jK += 2;
                    a.k(bW2, hbq.w(j2), cArr, i4);
                    i4++;
                } else if (a.o(bW2)) {
                    if (j2 >= j - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j3 = 2 + jK;
                    jK += 3;
                    a.j(bW2, hbq.w(j2), hbq.w(j3), cArr, i4);
                    i4++;
                } else {
                    if (j2 >= j - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte bW4 = hbq.w(j2);
                    long j4 = 3 + jK;
                    byte bW5 = hbq.w(2 + jK);
                    jK += 4;
                    a.h(bW2, bW4, bW5, hbq.w(j4), cArr, i4);
                    i4 += 2;
                }
            }
            return new String(cArr, 0, i4);
        }

        @Override // androidx.health.platform.client.proto.e2.b
        public int e(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            String str;
            String str2;
            int i3;
            long j2;
            char cCharAt;
            long j3 = i;
            long j4 = ((long) i2) + j3;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                hbq.P(bArr, j3, (byte) cCharAt);
                i4++;
                j3 = 1 + j3;
            }
            if (i4 == length) {
                return (int) j3;
            }
            while (i4 < length) {
                char cCharAt2 = charSequence.charAt(i4);
                if (cCharAt2 >= 128 || j3 >= j4) {
                    if (cCharAt2 >= 2048 || j3 > j4 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j3 > j4 - 3) {
                            if (j3 > j4 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                    throw new d(i4, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j3);
                            }
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char cCharAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j2 = 1;
                                    hbq.P(bArr, j3, (byte) ((codePoint >>> 18) | 240));
                                    hbq.P(bArr, j3 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j5 = j3 + 3;
                                    hbq.P(bArr, j3 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 += 4;
                                    hbq.P(bArr, j5, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new d(i4 - 1, length);
                        }
                        hbq.P(bArr, j3, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j6 = j3 + 2;
                        hbq.P(bArr, j3 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j3 += 3;
                        hbq.P(bArr, j6, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j7 = j3 + j;
                        hbq.P(bArr, j3, (byte) ((cCharAt2 >>> 6) | 960));
                        j3 += 2;
                        hbq.P(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j2 = 1;
                } else {
                    hbq.P(bArr, j3, (byte) cCharAt2);
                    str2 = str4;
                    j2 = j;
                    j3 += j;
                    str = str3;
                }
                i4++;
                str3 = str;
                str4 = str2;
                j = j2;
                j4 = j4;
            }
            return (int) j3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (defpackage.hbq.x(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (defpackage.hbq.x(r12, r0) > (-65)) goto L59;
         */
        @Override // androidx.health.platform.client.proto.e2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int i(int r11, byte[] r12, int r13, int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r14
                r0 = r0 | r1
                if (r0 < 0) goto La8
                long r0 = (long) r13
                long r13 = (long) r14
                if (r11 == 0) goto La1
                int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r2 < 0) goto L10
                return r11
            L10:
                byte r2 = (byte) r11
                r3 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r2 >= r3) goto L2a
                r11 = -62
                if (r2 < r11) goto L29
                long r6 = r6 + r0
                byte r11 = defpackage.hbq.x(r12, r0)
                if (r11 <= r5) goto L26
                goto L29
            L26:
                r0 = r6
                goto La1
            L29:
                return r4
            L2a:
                r8 = -16
                if (r2 >= r8) goto L5e
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L44
                long r8 = r0 + r6
                byte r11 = defpackage.hbq.x(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L43
                int r11 = androidx.health.platform.client.proto.e2.a(r2, r11)
                return r11
            L43:
                r0 = r8
            L44:
                if (r11 > r5) goto L5d
                r8 = -96
                if (r2 != r3) goto L4c
                if (r11 < r8) goto L5d
            L4c:
                r3 = -19
                if (r2 != r3) goto L52
                if (r11 >= r8) goto L5d
            L52:
                long r2 = r0 + r6
                byte r11 = defpackage.hbq.x(r12, r0)
                if (r11 <= r5) goto L5b
                goto L5d
            L5b:
                r0 = r2
                goto La1
            L5d:
                return r4
            L5e:
                int r3 = r11 >> 8
                int r3 = ~r3
                byte r3 = (byte) r3
                if (r3 != 0) goto L76
                long r8 = r0 + r6
                byte r3 = defpackage.hbq.x(r12, r0)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L73
                int r11 = androidx.health.platform.client.proto.e2.a(r2, r3)
                return r11
            L73:
                r11 = 0
                r0 = r8
                goto L79
            L76:
                int r11 = r11 >> 16
                byte r11 = (byte) r11
            L79:
                if (r11 != 0) goto L8b
                long r8 = r0 + r6
                byte r11 = defpackage.hbq.x(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L8a
                int r11 = androidx.health.platform.client.proto.e2.b(r2, r3, r11)
                return r11
            L8a:
                r0 = r8
            L8b:
                if (r3 > r5) goto La0
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r2 = r2 + r3
                int r2 = r2 >> 30
                if (r2 != 0) goto La0
                if (r11 > r5) goto La0
                long r2 = r0 + r6
                byte r11 = defpackage.hbq.x(r12, r0)
                if (r11 <= r5) goto L5b
            La0:
                return r4
            La1:
                long r13 = r13 - r0
                int r11 = (int) r13
                int r11 = o(r12, r0, r11)
                return r11
            La8:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14}
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r13, r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.platform.client.proto.e2.e.i(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (defpackage.hbq.w(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (defpackage.hbq.w(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (defpackage.hbq.w(r0) > (-65)) goto L57;
         */
        @Override // androidx.health.platform.client.proto.e2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int l(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.platform.client.proto.e2.e.l(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f2487a = (!e.m() || t91.c()) ? new c() : new e();
    }

    public static String g(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return f2487a.a(byteBuffer, i, i2);
    }

    public static String h(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return f2487a.b(bArr, i, i2);
    }

    public static int i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f2487a.e(charSequence, bArr, i, i2);
    }

    public static int j(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iK = length;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 2048) {
                iK += k(charSequence, i);
                break;
            }
            iK += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iK >= length) {
            return iK;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iK) + 4294967296L));
    }

    public static int k(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new d(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    public static int l(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    public static int m(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static int n(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int o(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int p(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return m(i);
        }
        if (i3 == 1) {
            return n(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return o(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    public static int q(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m(b2);
        }
        if (i3 == 1) {
            return n(b2, bArr[i]);
        }
        if (i3 == 2) {
            return o(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static boolean r(ByteBuffer byteBuffer) {
        return f2487a.f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean s(byte[] bArr) {
        return f2487a.g(bArr, 0, bArr.length);
    }

    public static boolean t(byte[] bArr, int i, int i2) {
        return f2487a.g(bArr, i, i2);
    }

    public static int u(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return f2487a.h(i, byteBuffer, i2, i3);
    }

    public static int v(int i, byte[] bArr, int i2, int i3) {
        return f2487a.i(i, bArr, i2, i3);
    }
}
