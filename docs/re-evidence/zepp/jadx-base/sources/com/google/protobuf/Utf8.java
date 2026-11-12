package com.google.protobuf;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
final class Utf8 {
    private static final b a;
    private static final long b = -9187201950435737472L;
    public static final int c = 3;
    public static final int d = 0;
    public static final int e = -1;
    private static final int f = 16;

    public static final class UnsafeProcessor extends b {
        public static boolean isAvailable() {
            return UnsafeUtil.S() && UnsafeUtil.T();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (UnsafeUtil.A(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.n(i);
            }
            if (i2 == 1) {
                return Utf8.o(i, UnsafeUtil.A(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.p(i, UnsafeUtil.A(bArr, j), UnsafeUtil.A(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.b
        public String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte bA = UnsafeUtil.A(bArr, i);
                if (!a.n(bA)) {
                    break;
                }
                i++;
                a.i(bA, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte bA2 = UnsafeUtil.A(bArr, i);
                if (a.n(bA2)) {
                    int i7 = i5 + 1;
                    a.i(bA2, cArr, i5);
                    while (i6 < i3) {
                        byte bA3 = UnsafeUtil.A(bArr, i6);
                        if (!a.n(bA3)) {
                            break;
                        }
                        i6++;
                        a.i(bA3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (a.p(bA2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    a.k(bA2, UnsafeUtil.A(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (a.o(bA2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i6 + 1;
                    a.j(bA2, UnsafeUtil.A(bArr, i6), UnsafeUtil.A(bArr, i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i6 + 1;
                    byte bA4 = UnsafeUtil.A(bArr, i6);
                    int i10 = i9 + 1;
                    a.h(bA2, bA4, UnsafeUtil.A(bArr, i9), UnsafeUtil.A(bArr, i10), cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // com.google.protobuf.Utf8.b
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long jI = UnsafeUtil.i(byteBuffer) + ((long) i);
            long j = ((long) i2) + jI;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (jI < j) {
                byte bY = UnsafeUtil.y(jI);
                if (!a.n(bY)) {
                    break;
                }
                jI++;
                a.i(bY, cArr, i3);
                i3++;
            }
            while (true) {
                int i4 = i3;
                while (jI < j) {
                    long j2 = jI + 1;
                    byte bY2 = UnsafeUtil.y(jI);
                    if (a.n(bY2)) {
                        int i5 = i4 + 1;
                        a.i(bY2, cArr, i4);
                        while (j2 < j) {
                            byte bY3 = UnsafeUtil.y(j2);
                            if (!a.n(bY3)) {
                                break;
                            }
                            j2++;
                            a.i(bY3, cArr, i5);
                            i5++;
                        }
                        i4 = i5;
                        jI = j2;
                    } else if (a.p(bY2)) {
                        if (j2 >= j) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        jI = j2 + 1;
                        a.k(bY2, UnsafeUtil.y(j2), cArr, i4);
                        i4++;
                    } else if (a.o(bY2)) {
                        if (j2 >= j - 1) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j3 = j2 + 1;
                        a.j(bY2, UnsafeUtil.y(j2), UnsafeUtil.y(j3), cArr, i4);
                        i4++;
                        jI = j3 + 1;
                    } else {
                        if (j2 >= j - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j4 = j2 + 1;
                        byte bY4 = UnsafeUtil.y(j2);
                        long j5 = j4 + 1;
                        byte bY5 = UnsafeUtil.y(j4);
                        jI = j5 + 1;
                        a.h(bY2, bY4, bY5, UnsafeUtil.y(j5), cArr, i4);
                        i3 = i4 + 1 + 1;
                    }
                }
                return new String(cArr, 0, i4);
            }
        }

        @Override // com.google.protobuf.Utf8.b
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
            char c;
            long j;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long j4 = i;
            long j5 = ((long) i2) + j4;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                UnsafeUtil.d0(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = charSequence.charAt(i4);
                if (cCharAt2 >= c || j4 >= j5) {
                    if (cCharAt2 < 2048 && j4 <= j5 - 2) {
                        long j6 = j4 + j;
                        UnsafeUtil.d0(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                        UnsafeUtil.d0(bArr, j6, (byte) ((cCharAt2 & '?') | 128));
                        j2 = j6 + j;
                        j3 = j;
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                            if (j4 > j5 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                    throw new c(i4, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                            }
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char cCharAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    long j7 = j4 + 1;
                                    UnsafeUtil.d0(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    long j8 = j7 + 1;
                                    UnsafeUtil.d0(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j9 = j8 + 1;
                                    UnsafeUtil.d0(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 = 1;
                                    j2 = j9 + 1;
                                    UnsafeUtil.d0(bArr, j9, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new c(i4 - 1, length);
                        }
                        long j10 = j4 + j;
                        UnsafeUtil.d0(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j11 = j10 + j;
                        UnsafeUtil.d0(bArr, j10, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        UnsafeUtil.d0(bArr, j11, (byte) ((cCharAt2 & '?') | 128));
                        j2 = j11 + 1;
                        j3 = 1;
                    }
                    i4++;
                    c = 128;
                    long j12 = j3;
                    j4 = j2;
                    j = j12;
                } else {
                    long j13 = j4 + j;
                    UnsafeUtil.d0(bArr, j4, (byte) cCharAt2);
                    j3 = j;
                    j2 = j13;
                }
                i4++;
                c = 128;
                long j14 = j3;
                j4 = j2;
                j = j14;
            }
            return (int) j4;
        }

        @Override // com.google.protobuf.Utf8.b
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            char c;
            long j;
            int i;
            char cCharAt;
            long jI = UnsafeUtil.i(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jI;
            long jLimit = ((long) byteBuffer.limit()) + jI;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i2 = 0;
            while (true) {
                c = 128;
                if (i2 >= length || (cCharAt = charSequence.charAt(i2)) >= 128) {
                    break;
                }
                UnsafeUtil.b0(jPosition, (byte) cCharAt);
                i2++;
                jPosition++;
            }
            if (i2 == length) {
                byteBuffer.position((int) (jPosition - jI));
                return;
            }
            while (i2 < length) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 < c && jPosition < jLimit) {
                    UnsafeUtil.b0(jPosition, (byte) cCharAt2);
                    jPosition++;
                    j = jI;
                } else if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                    j = jI;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                        if (jPosition > jLimit - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i2 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i)))) {
                                throw new c(i2, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                        }
                        int i3 = i2 + 1;
                        if (i3 != length) {
                            char cCharAt3 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                long j2 = jPosition + 1;
                                UnsafeUtil.b0(jPosition, (byte) ((codePoint >>> 18) | 240));
                                long j3 = j2 + 1;
                                UnsafeUtil.b0(j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j4 = j3 + 1;
                                UnsafeUtil.b0(j3, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j5 = j4 + 1;
                                UnsafeUtil.b0(j4, (byte) ((codePoint & 63) | 128));
                                i2 = i3;
                                jPosition = j5;
                            } else {
                                i2 = i3;
                            }
                        }
                        throw new c(i2 - 1, length);
                    }
                    long j6 = jPosition + 1;
                    UnsafeUtil.b0(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j7 = j6 + 1;
                    UnsafeUtil.b0(j6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    UnsafeUtil.b0(j7, (byte) ((cCharAt2 & '?') | 128));
                    jPosition = j7 + 1;
                } else {
                    j = jI;
                    long j8 = jPosition + 1;
                    UnsafeUtil.b0(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                    UnsafeUtil.b0(j8, (byte) ((cCharAt2 & '?') | 128));
                    jPosition = j8 + 1;
                }
                i2++;
                jI = j;
                c = 128;
            }
            byteBuffer.position((int) (jPosition - jI));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (com.google.protobuf.UnsafeUtil.A(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.A(r13, r2) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            long j;
            byte bA = 0;
            if ((i2 | i3 | (bArr.length - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long j2 = i2;
            long j3 = i3;
            if (i != 0) {
                if (j2 >= j3) {
                    return i;
                }
                byte b = (byte) i;
                if (b < -32) {
                    if (b >= -62) {
                        long j4 = 1 + j2;
                        if (UnsafeUtil.A(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    byte bA2 = (byte) (~(i >> 8));
                    if (bA2 == 0) {
                        long j5 = j2 + 1;
                        bA2 = UnsafeUtil.A(bArr, j2);
                        if (j5 >= j3) {
                            return Utf8.o(b, bA2);
                        }
                        j2 = j5;
                    }
                    if (bA2 <= -65 && ((b != -32 || bA2 >= -96) && (b != -19 || bA2 < -96))) {
                        j = j2 + 1;
                    }
                    return -1;
                }
                byte bA3 = (byte) (~(i >> 8));
                if (bA3 == 0) {
                    long j6 = j2 + 1;
                    bA3 = UnsafeUtil.A(bArr, j2);
                    if (j6 >= j3) {
                        return Utf8.o(b, bA3);
                    }
                    j2 = j6;
                } else {
                    bA = (byte) (i >> 16);
                }
                if (bA == 0) {
                    long j7 = j2 + 1;
                    bA = UnsafeUtil.A(bArr, j2);
                    if (j7 >= j3) {
                        return Utf8.p(b, bA3, bA);
                    }
                    j2 = j7;
                }
                if (bA3 <= -65 && (((b << 28) + (bA3 + 112)) >> 30) == 0 && bA <= -65) {
                    j = j2 + 1;
                }
                return -1;
                j2 = j;
            }
            return partialIsValidUtf8(bArr, j2, (int) (j3 - j2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (com.google.protobuf.UnsafeUtil.y(r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (com.google.protobuf.UnsafeUtil.y(r2) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
            long j;
            byte bY = 0;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long jI = UnsafeUtil.i(byteBuffer) + ((long) i2);
            long j2 = ((long) (i3 - i2)) + jI;
            if (i != 0) {
                if (jI >= j2) {
                    return i;
                }
                byte b = (byte) i;
                if (b < -32) {
                    if (b >= -62) {
                        long j3 = 1 + jI;
                        if (UnsafeUtil.y(jI) <= -65) {
                            jI = j3;
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    byte bY2 = (byte) (~(i >> 8));
                    if (bY2 == 0) {
                        long j4 = jI + 1;
                        bY2 = UnsafeUtil.y(jI);
                        if (j4 >= j2) {
                            return Utf8.o(b, bY2);
                        }
                        jI = j4;
                    }
                    if (bY2 <= -65 && ((b != -32 || bY2 >= -96) && (b != -19 || bY2 < -96))) {
                        j = jI + 1;
                    }
                    return -1;
                }
                byte bY3 = (byte) (~(i >> 8));
                if (bY3 == 0) {
                    long j5 = jI + 1;
                    bY3 = UnsafeUtil.y(jI);
                    if (j5 >= j2) {
                        return Utf8.o(b, bY3);
                    }
                    jI = j5;
                } else {
                    bY = (byte) (i >> 16);
                }
                if (bY == 0) {
                    long j6 = jI + 1;
                    bY = UnsafeUtil.y(jI);
                    if (j6 >= j2) {
                        return Utf8.p(b, bY3, bY);
                    }
                    jI = j6;
                }
                if (bY3 <= -65 && (((b << 28) + (bY3 + 112)) >> 30) == 0 && bY <= -65) {
                    j = jI + 1;
                }
                return -1;
                jI = j;
            }
            return partialIsValidUtf8(jI, (int) (j2 - jI));
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = 8 - (((int) j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (UnsafeUtil.y(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (UnsafeUtil.K(j) & Utf8.b) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.n(i);
            }
            if (i2 == 1) {
                return Utf8.o(i, UnsafeUtil.y(j));
            }
            if (i2 == 2) {
                return Utf8.p(i, UnsafeUtil.y(j), UnsafeUtil.y(j + 1));
            }
            throw new AssertionError();
        }

        private static int partialIsValidUtf8(byte[] bArr, long j, int i) {
            long j2;
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j, i);
            int i2 = i - iUnsafeEstimateConsecutiveAscii;
            long j3 = j + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte bA = 0;
                while (i2 > 0) {
                    long j4 = j3 + 1;
                    bA = UnsafeUtil.A(bArr, j3);
                    if (bA < 0) {
                        j3 = j4;
                        break;
                    }
                    i2--;
                    j3 = j4;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (bA < -32) {
                    if (i3 == 0) {
                        return bA;
                    }
                    i2 = i3 - 1;
                    if (bA >= -62) {
                        j2 = 1 + j3;
                        if (UnsafeUtil.A(bArr, j3) > -65) {
                        }
                    }
                    return -1;
                }
                if (bA >= -16) {
                    if (i3 < 3) {
                        return unsafeIncompleteStateFor(bArr, bA, j3, i3);
                    }
                    i2 = i3 - 3;
                    long j5 = j3 + 1;
                    byte bA2 = UnsafeUtil.A(bArr, j3);
                    if (bA2 <= -65 && (((bA << 28) + (bA2 + 112)) >> 30) == 0) {
                        long j6 = j5 + 1;
                        if (UnsafeUtil.A(bArr, j5) <= -65) {
                            j2 = 1 + j6;
                            if (UnsafeUtil.A(bArr, j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return unsafeIncompleteStateFor(bArr, bA, j3, i3);
                }
                i2 = i3 - 2;
                long j7 = j3 + 1;
                byte bA3 = UnsafeUtil.A(bArr, j3);
                if (bA3 <= -65 && ((bA != -32 || bA3 >= -96) && (bA != -19 || bA3 < -96))) {
                    j2 = 1 + j7;
                    if (UnsafeUtil.A(bArr, j7) > -65) {
                    }
                }
                return -1;
                j3 = j2;
            }
        }

        private static int partialIsValidUtf8(long j, int i) {
            long j2;
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j, i);
            long j3 = j + ((long) iUnsafeEstimateConsecutiveAscii);
            int i2 = i - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte bY = 0;
                while (i2 > 0) {
                    long j4 = j3 + 1;
                    bY = UnsafeUtil.y(j3);
                    if (bY < 0) {
                        j3 = j4;
                        break;
                    }
                    i2--;
                    j3 = j4;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (bY < -32) {
                    if (i3 == 0) {
                        return bY;
                    }
                    i2 = i3 - 1;
                    if (bY >= -62) {
                        j2 = 1 + j3;
                        if (UnsafeUtil.y(j3) > -65) {
                        }
                    }
                    return -1;
                }
                if (bY >= -16) {
                    if (i3 < 3) {
                        return unsafeIncompleteStateFor(j3, bY, i3);
                    }
                    i2 = i3 - 3;
                    long j5 = j3 + 1;
                    byte bY2 = UnsafeUtil.y(j3);
                    if (bY2 <= -65 && (((bY << 28) + (bY2 + 112)) >> 30) == 0) {
                        long j6 = j5 + 1;
                        if (UnsafeUtil.y(j5) <= -65) {
                            j2 = 1 + j6;
                            if (UnsafeUtil.y(j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return unsafeIncompleteStateFor(j3, bY, i3);
                }
                i2 = i3 - 2;
                long j7 = j3 + 1;
                byte bY3 = UnsafeUtil.y(j3);
                if (bY3 <= -65 && ((bY != -32 || bY3 >= -96) && (bY != -19 || bY3 < -96))) {
                    j2 = 1 + j7;
                    if (UnsafeUtil.y(j7) > -65) {
                    }
                }
                return -1;
                j3 = j2;
            }
        }
    }

    public static class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m(b3) || m(b4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iR = ((b & 7) << 18) | (r(b2) << 12) | (r(b3) << 6) | r(b4);
            cArr[i] = l(iR);
            cArr[i + 1] = q(iR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m(b3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 15) << 12) | (r(b2) << 6) | r(b3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || m(b2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 31) << 6) | r(b2));
        }

        private static char l(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean m(byte b) {
            return b > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b) {
            return b >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b) {
            return b < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b) {
            return b < -32;
        }

        private static char q(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int r(byte b) {
            return b & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY;
        }
    }

    public static abstract class b {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i, i2) : decodeUtf8Default(byteBuffer, i, i2);
        }

        public abstract String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!a.n(b)) {
                    break;
                }
                i++;
                a.i(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (a.n(b2)) {
                    int i7 = i5 + 1;
                    a.i(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = byteBuffer.get(i6);
                        if (!a.n(b3)) {
                            break;
                        }
                        i6++;
                        a.i(b3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (a.p(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    a.k(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (a.o(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i6 + 1;
                    a.j(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i6 + 1;
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i9 + 1;
                    a.h(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2);

        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(Utf8.i(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i = 0;
            while (i < length) {
                try {
                    char cCharAt = charSequence.charAt(i);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i, (byte) cCharAt);
                    i++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i == length) {
                byteBuffer.position(iPosition + i);
                return;
            }
            iPosition += i;
            while (i < length) {
                char cCharAt2 = charSequence.charAt(i);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i2 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i2, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i2;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i2;
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i3 = i + 1;
                        if (i3 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i3);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i4 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        iPosition = i4 + 1;
                                        byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        i4 = iPosition + 1;
                                        byteBuffer.put(iPosition, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(i4, (byte) ((codePoint & 63) | 128));
                                        iPosition = i4;
                                        i = i3;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        iPosition = i4;
                                    }
                                } else {
                                    i = i3;
                                }
                            } catch (IndexOutOfBoundsException unused4) {
                            }
                            i = i3;
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (byteBuffer.position() + Math.max(i, (iPosition - byteBuffer.position()) + 1)));
                        }
                        throw new c(i, length);
                    }
                    int i5 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition = i5 + 1;
                    byteBuffer.put(i5, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i++;
                iPosition++;
            }
            byteBuffer.position(iPosition);
        }

        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i, int i2) {
            return partialIsValidUtf8(0, bArr, i, i2) == 0;
        }

        public final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i, byteBuffer, i2, i3) : partialIsValidUtf8Default(i, byteBuffer, i2, i3);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
        }

        public abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
        
            if (r8.get(r9) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int partialIsValidUtf8Default(int i, ByteBuffer byteBuffer, int i2, int i3) {
            int i4;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b = (byte) i;
                if (b < -32) {
                    if (b >= -62) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                if (b < -16) {
                    byte b2 = (byte) (~(i >> 8));
                    if (b2 == 0) {
                        int i5 = i2 + 1;
                        byte b3 = byteBuffer.get(i2);
                        if (i5 >= i3) {
                            return Utf8.o(b, b3);
                        }
                        i2 = i5;
                        b2 = b3;
                    }
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                byte b4 = (byte) (~(i >> 8));
                byte b5 = 0;
                if (b4 == 0) {
                    int i6 = i2 + 1;
                    b4 = byteBuffer.get(i2);
                    if (i6 >= i3) {
                        return Utf8.o(b, b4);
                    }
                    i2 = i6;
                } else {
                    b5 = (byte) (i >> 16);
                }
                if (b5 == 0) {
                    int i7 = i2 + 1;
                    b5 = byteBuffer.get(i2);
                    if (i7 >= i3) {
                        return Utf8.p(b, b4, b5);
                    }
                    i2 = i7;
                }
                if (b4 <= -65 && (((b << 28) + (b4 + 112)) >> 30) == 0 && b5 <= -65) {
                    i4 = i2 + 1;
                }
                return -1;
                i2 = i4;
            }
            return partialIsValidUtf8(byteBuffer, i2, i3);
        }

        public abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            return partialIsValidUtf8(0, byteBuffer, i, i2) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            int iM = i + Utf8.m(byteBuffer, i, i2);
            while (iM < i2) {
                int i3 = iM + 1;
                byte b = byteBuffer.get(iM);
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        i3++;
                    } else {
                        if (b >= -16) {
                            if (i3 >= i2 - 2) {
                                return Utf8.q(byteBuffer, b, i3, i2 - i3);
                            }
                            int i4 = i3 + 1;
                            byte b2 = byteBuffer.get(i3);
                            if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                                int i5 = i4 + 1;
                                if (byteBuffer.get(i4) <= -65) {
                                    i3 = i5 + 1;
                                    if (byteBuffer.get(i5) > -65) {
                                    }
                                }
                            }
                            return -1;
                        }
                        if (i3 >= i2 - 1) {
                            return Utf8.q(byteBuffer, b, i3, i2 - i3);
                        }
                        int i6 = i3 + 1;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(i6) > -65))) {
                            return -1;
                        }
                        iM = i6 + 1;
                    }
                }
                iM = i3;
            }
            return 0;
        }
    }

    public static class c extends IllegalArgumentException {
        public c(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    static {
        a = (!UnsafeProcessor.isAvailable() || com.google.protobuf.a.c()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String g(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return a.decodeUtf8(byteBuffer, i, i2);
    }

    public static String h(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return a.decodeUtf8(bArr, i, i2);
    }

    public static int i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.encodeUtf8(charSequence, bArr, i, i2);
    }

    public static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        a.encodeUtf8(charSequence, byteBuffer);
    }

    public static int k(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iL = length;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 2048) {
                iL += l(charSequence, i);
                break;
            }
            iL += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iL >= length) {
            return iL;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iL) + 4294967296L));
    }

    private static int l(CharSequence charSequence, int i) {
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
                        throw new c(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & b) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return n(i);
        }
        if (i3 == 1) {
            return o(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return p(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return n(b2);
        }
        if (i3 == 1) {
            return o(b2, bArr[i]);
        }
        if (i3 == 2) {
            return p(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static boolean s(ByteBuffer byteBuffer) {
        return a.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean t(byte[] bArr) {
        return a.isValidUtf8(bArr, 0, bArr.length);
    }

    public static boolean u(byte[] bArr, int i, int i2) {
        return a.isValidUtf8(bArr, i, i2);
    }

    public static int v(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return a.partialIsValidUtf8(i, byteBuffer, i2, i3);
    }

    public static int w(int i, byte[] bArr, int i2, int i3) {
        return a.partialIsValidUtf8(i, bArr, i2, i3);
    }

    public static final class SafeProcessor extends b {
        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.r(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = i4 + 1;
                            if (bArr[i4] <= -65) {
                                i3 = i5 + 1;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return Utf8.r(bArr, i3, i2);
                    }
                    int i6 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i = i6 + 1;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return -1;
                }
                i = i3;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.b
        public String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!a.n(b)) {
                    break;
                }
                i++;
                a.i(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (a.n(b2)) {
                    int i7 = i5 + 1;
                    a.i(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = bArr[i6];
                        if (!a.n(b3)) {
                            break;
                        }
                        i6++;
                        a.i(b3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (a.p(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    a.k(b2, bArr[i6], cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (a.o(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i6 + 1;
                    a.j(b2, bArr[i6], bArr[i8], cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    int i10 = i9 + 1;
                    a.h(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // com.google.protobuf.Utf8.b
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i, i2);
        }

        @Override // com.google.protobuf.Utf8.b
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char cCharAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) cCharAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char cCharAt2 = charSequence.charAt(i7);
                if (cCharAt2 >= 128 || i8 >= i6) {
                    if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                        i8 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                    throw new c(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                            }
                            int i10 = i7 + 1;
                            if (i10 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i11 = i8 + 1;
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    int i12 = i11 + 1;
                                    bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i13 = i12 + 1;
                                    bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 = i13 + 1;
                                    bArr[i13] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new c(i7 - 1, length);
                        }
                        int i14 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i3 = i15 + 1;
                        bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i7++;
                } else {
                    i3 = i8 + 1;
                    bArr[i8] = (byte) cCharAt2;
                }
                i8 = i3;
                i7++;
            }
            return i8;
        }

        @Override // com.google.protobuf.Utf8.b
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
        
            if (r8[r9] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
            int i4;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b = (byte) i;
                if (b < -32) {
                    if (b >= -62) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                if (b < -16) {
                    byte b2 = (byte) (~(i >> 8));
                    if (b2 == 0) {
                        int i5 = i2 + 1;
                        byte b3 = bArr[i2];
                        if (i5 >= i3) {
                            return Utf8.o(b, b3);
                        }
                        i2 = i5;
                        b2 = b3;
                    }
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                byte b4 = (byte) (~(i >> 8));
                byte b5 = 0;
                if (b4 == 0) {
                    int i6 = i2 + 1;
                    b4 = bArr[i2];
                    if (i6 >= i3) {
                        return Utf8.o(b, b4);
                    }
                    i2 = i6;
                } else {
                    b5 = (byte) (i >> 16);
                }
                if (b5 == 0) {
                    int i7 = i2 + 1;
                    b5 = bArr[i2];
                    if (i7 >= i3) {
                        return Utf8.p(b, b4, b5);
                    }
                    i2 = i7;
                }
                if (b4 <= -65 && (((b << 28) + (b4 + 112)) >> 30) == 0 && b5 <= -65) {
                    i4 = i2 + 1;
                }
                return -1;
                i2 = i4;
            }
            return partialIsValidUtf8(bArr, i2, i3);
        }

        @Override // com.google.protobuf.Utf8.b
        public int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i, i2);
        }
    }
}
