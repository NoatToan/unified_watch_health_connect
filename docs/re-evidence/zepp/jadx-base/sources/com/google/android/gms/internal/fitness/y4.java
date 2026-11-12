package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class y4 extends t4 {
    private static int d(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return u4.b(i);
        }
        if (i2 == 1) {
            return u4.k(i, s4.a(bArr, j));
        }
        if (i2 == 2) {
            return u4.g(i, s4.a(bArr, j), s4.a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.fitness.t4
    public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
            char cCharAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(cCharAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            s4.i(bArr, j4, (byte) cCharAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char cCharAt3 = charSequence.charAt(i4);
            if (cCharAt3 >= c || j4 >= j5) {
                if (cCharAt3 < 2048 && j4 <= j5 - 2) {
                    long j6 = j4 + j;
                    s4.i(bArr, j4, (byte) ((cCharAt3 >>> 6) | 960));
                    s4.i(bArr, j6, (byte) ((cCharAt3 & '?') | 128));
                    j2 = j6 + j;
                    j3 = j;
                } else {
                    if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j4 > j5 - 3) {
                        if (j4 > j5 - 4) {
                            if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i3)))) {
                                throw new v4(i4, length);
                            }
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(cCharAt3);
                            sb2.append(" at index ");
                            sb2.append(j4);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                long j7 = j4 + 1;
                                s4.i(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j8 = j7 + 1;
                                s4.i(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j9 = j8 + 1;
                                s4.i(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j9 + 1;
                                s4.i(bArr, j9, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new v4(i4 - 1, length);
                    }
                    long j10 = j4 + j;
                    s4.i(bArr, j4, (byte) ((cCharAt3 >>> '\f') | 480));
                    long j11 = j10 + j;
                    s4.i(bArr, j10, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                    s4.i(bArr, j11, (byte) ((cCharAt3 & '?') | 128));
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
                s4.i(bArr, j4, (byte) cCharAt3);
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

    @Override // com.google.android.gms.internal.fitness.t4
    public final int b(int i, byte[] bArr, int i2, int i3) {
        int i4;
        long j;
        if ((i2 | i3 | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        long j2 = i2;
        int i5 = (int) (((long) i3) - j2);
        if (i5 >= 16) {
            long j3 = j2;
            i4 = 0;
            while (true) {
                if (i4 >= i5) {
                    i4 = i5;
                    break;
                }
                long j4 = j3 + 1;
                if (s4.a(bArr, j3) < 0) {
                    break;
                }
                i4++;
                j3 = j4;
            }
        } else {
            i4 = 0;
        }
        int i6 = i5 - i4;
        long j5 = j2 + ((long) i4);
        while (true) {
            byte bA = 0;
            while (i6 > 0) {
                long j6 = j5 + 1;
                bA = s4.a(bArr, j5);
                if (bA < 0) {
                    j5 = j6;
                    break;
                }
                i6--;
                j5 = j6;
            }
            if (i6 == 0) {
                return 0;
            }
            int i7 = i6 - 1;
            if (bA < -32) {
                if (i7 == 0) {
                    return bA;
                }
                i6 = i7 - 1;
                if (bA >= -62) {
                    j = j5 + 1;
                    if (s4.a(bArr, j5) > -65) {
                    }
                }
                return -1;
            }
            if (bA >= -16) {
                if (i7 < 3) {
                    return d(bArr, bA, j5, i7);
                }
                i6 = i7 - 3;
                long j7 = j5 + 1;
                byte bA2 = s4.a(bArr, j5);
                if (bA2 <= -65 && (((bA << 28) + (bA2 + 112)) >> 30) == 0) {
                    long j8 = j7 + 1;
                    if (s4.a(bArr, j7) <= -65) {
                        j = j8 + 1;
                        if (s4.a(bArr, j8) > -65) {
                        }
                    }
                }
                return -1;
            }
            if (i7 < 2) {
                return d(bArr, bA, j5, i7);
            }
            i6 = i7 - 2;
            long j9 = j5 + 1;
            byte bA3 = s4.a(bArr, j5);
            if (bA3 <= -65 && ((bA != -32 || bA3 >= -96) && (bA != -19 || bA3 < -96))) {
                j5 = j9 + 1;
                if (s4.a(bArr, j9) > -65) {
                }
            }
            return -1;
            j5 = j;
        }
    }
}
