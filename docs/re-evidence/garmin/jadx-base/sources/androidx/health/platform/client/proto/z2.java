package androidx.health.platform.client.proto;

import com.garmin.android.gfdi.framework.FileManagerCompat;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7824a;

    public static class a {
        private a() {
        }

        public static boolean a(byte b14) {
            return b14 > -65;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i14, int i15);

        public abstract int b(String str, byte[] bArr, int i14, int i15);

        public abstract int c(byte[] bArr, int i14, int i15);
    }

    public static final class c extends b {
        @Override // androidx.health.platform.client.proto.z2.b
        public final String a(byte[] bArr, int i14, int i15) throws InvalidProtocolBufferException {
            if ((i14 | i15 | ((bArr.length - i14) - i15)) < 0) {
                com.google.protobuf.a.l("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i14), Integer.valueOf(i15)});
                return null;
            }
            int i16 = i14 + i15;
            char[] cArr = new char[i15];
            int i17 = 0;
            while (i14 < i16) {
                byte b14 = bArr[i14];
                if (b14 < 0) {
                    break;
                }
                i14++;
                cArr[i17] = (char) b14;
                i17++;
            }
            while (i14 < i16) {
                int i18 = i14 + 1;
                byte b15 = bArr[i14];
                if (b15 >= 0) {
                    int i19 = i17 + 1;
                    cArr[i17] = (char) b15;
                    while (i18 < i16) {
                        byte b16 = bArr[i18];
                        if (b16 < 0) {
                            break;
                        }
                        i18++;
                        cArr[i19] = (char) b16;
                        i19++;
                    }
                    i17 = i19;
                    i14 = i18;
                } else if (b15 < -32) {
                    if (i18 >= i16) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i14 += 2;
                    byte b17 = bArr[i18];
                    int i24 = i17 + 1;
                    if (b15 < -62 || a.a(b17)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    cArr[i17] = (char) ((b17 & 63) | ((b15 & Ascii.US) << 6));
                    i17 = i24;
                } else {
                    if (b15 >= -16) {
                        if (i18 >= i16 - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        byte b18 = bArr[i18];
                        int i25 = i14 + 3;
                        byte b19 = bArr[i14 + 2];
                        i14 += 4;
                        byte b24 = bArr[i25];
                        int i26 = i17 + 1;
                        if (!a.a(b18)) {
                            if ((((b18 + 112) + (b15 << Ascii.FS)) >> 30) == 0 && !a.a(b19) && !a.a(b24)) {
                                int i27 = ((b18 & 63) << 12) | ((b15 & 7) << 18) | ((b19 & 63) << 6) | (b24 & 63);
                                cArr[i17] = (char) ((i27 >>> 10) + 55232);
                                cArr[i26] = (char) ((i27 & 1023) + 56320);
                                i17 += 2;
                            }
                        }
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    if (i18 >= i16 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i28 = i14 + 2;
                    byte b25 = bArr[i18];
                    i14 += 3;
                    byte b26 = bArr[i28];
                    int i29 = i17 + 1;
                    if (a.a(b25) || ((b15 == -32 && b25 < -96) || ((b15 == -19 && b25 >= -96) || a.a(b26)))) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    cArr[i17] = (char) (((b25 & 63) << 6) | ((b15 & Ascii.SI) << 12) | (b26 & 63));
                    i17 = i29;
                }
            }
            return new String(cArr, 0, i17);
        }

        @Override // androidx.health.platform.client.proto.z2.b
        public final int b(String str, byte[] bArr, int i14, int i15) {
            int i16;
            int i17;
            char cCharAt;
            int length = str.length();
            int i18 = i15 + i14;
            int i19 = 0;
            while (i19 < length && (i17 = i19 + i14) < i18 && (cCharAt = str.charAt(i19)) < 128) {
                bArr[i17] = (byte) cCharAt;
                i19++;
            }
            if (i19 == length) {
                return i14 + length;
            }
            int i24 = i14 + i19;
            while (i19 < length) {
                char cCharAt2 = str.charAt(i19);
                if (cCharAt2 < 128 && i24 < i18) {
                    bArr[i24] = (byte) cCharAt2;
                    i24++;
                } else if (cCharAt2 < 2048 && i24 <= i18 - 2) {
                    int i25 = i24 + 1;
                    bArr[i24] = (byte) ((cCharAt2 >>> 6) | 960);
                    i24 += 2;
                    bArr[i25] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i24 > i18 - 3) {
                        if (i24 > i18 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i16 = i19 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i16)))) {
                                throw new d(i19, length);
                            }
                            com.google.protobuf.a.n(cCharAt2, i24);
                            return 0;
                        }
                        int i26 = i19 + 1;
                        if (i26 != str.length()) {
                            char cCharAt3 = str.charAt(i26);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i24] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                bArr[i24 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i27 = i24 + 3;
                                bArr[i24 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i24 += 4;
                                bArr[i27] = (byte) ((codePoint & 63) | 128);
                                i19 = i26;
                            } else {
                                i19 = i26;
                            }
                        }
                        throw new d(i19 - 1, length);
                    }
                    bArr[i24] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i28 = i24 + 2;
                    bArr[i24 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i24 += 3;
                    bArr[i28] = (byte) ((cCharAt2 & '?') | 128);
                }
                i19++;
            }
            return i24;
        }

        @Override // androidx.health.platform.client.proto.z2.b
        public final int c(byte[] bArr, int i14, int i15) {
            while (i14 < i15 && bArr[i14] >= 0) {
                i14++;
            }
            if (i14 >= i15) {
                return 0;
            }
            while (i14 < i15) {
                int i16 = i14 + 1;
                byte b14 = bArr[i14];
                if (b14 >= 0) {
                    i14 = i16;
                } else if (b14 < -32) {
                    if (i16 >= i15) {
                        return b14;
                    }
                    if (b14 < -62) {
                        return -1;
                    }
                    i14 += 2;
                    if (bArr[i16] > -65) {
                        return -1;
                    }
                } else if (b14 < -16) {
                    if (i16 >= i15 - 1) {
                        return z2.a(bArr, i16, i15);
                    }
                    int i17 = i14 + 2;
                    byte b15 = bArr[i16];
                    if (b15 > -65) {
                        return -1;
                    }
                    if (b14 == -32 && b15 < -96) {
                        return -1;
                    }
                    if (b14 == -19 && b15 >= -96) {
                        return -1;
                    }
                    i14 += 3;
                    if (bArr[i17] > -65) {
                        return -1;
                    }
                } else {
                    if (i16 >= i15 - 2) {
                        return z2.a(bArr, i16, i15);
                    }
                    int i18 = i14 + 2;
                    byte b16 = bArr[i16];
                    if (b16 > -65) {
                        return -1;
                    }
                    if ((((b16 + 112) + (b14 << Ascii.FS)) >> 30) != 0) {
                        return -1;
                    }
                    int i19 = i14 + 3;
                    if (bArr[i18] > -65) {
                        return -1;
                    }
                    i14 += 4;
                    if (bArr[i19] > -65) {
                        return -1;
                    }
                }
            }
            return 0;
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i14, int i15) {
            super(tn.k.e(i14, i15, "Unpaired surrogate at index ", " of "));
        }
    }

    public static final class e extends b {
        public static int d(byte[] bArr, int i14, long j8, int i15) {
            if (i15 == 0) {
                b bVar = z2.f7824a;
                if (i14 > -12) {
                    return -1;
                }
                return i14;
            }
            if (i15 == 1) {
                return z2.c(i14, y2.g(bArr, j8));
            }
            if (i15 == 2) {
                return z2.d(i14, y2.g(bArr, j8), y2.g(bArr, j8 + 1));
            }
            v.e0.l();
            return 0;
        }

        @Override // androidx.health.platform.client.proto.z2.b
        public final String a(byte[] bArr, int i14, int i15) throws InvalidProtocolBufferException {
            Charset charset = l0.f7708a;
            String str = new String(bArr, i14, i15, charset);
            if (str.indexOf(FileManagerCompat.GARMIN_DEVICE_XML_FILE_INDEX) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i14, i15 + i14))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // androidx.health.platform.client.proto.z2.b
        public final int b(String str, byte[] bArr, int i14, int i15) {
            long j8;
            long j14;
            int i16;
            char cCharAt;
            long j15 = i14;
            long j16 = ((long) i15) + j15;
            int length = str.length();
            if (length > i15 || bArr.length - i15 < i14) {
                com.google.protobuf.a.d(str.charAt(length - 1), i14 + i15);
                return 0;
            }
            int i17 = 0;
            while (true) {
                j8 = 1;
                if (i17 >= length || (cCharAt = str.charAt(i17)) >= 128) {
                    break;
                }
                y2.k(bArr, j15, (byte) cCharAt);
                i17++;
                j15 = 1 + j15;
            }
            if (i17 == length) {
                return (int) j15;
            }
            while (i17 < length) {
                char cCharAt2 = str.charAt(i17);
                if (cCharAt2 < 128 && j15 < j16) {
                    y2.k(bArr, j15, (byte) cCharAt2);
                    j14 = j8;
                    j15 += j8;
                } else if (cCharAt2 >= 2048 || j15 > j16 - 2) {
                    j14 = j8;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j15 > j16 - 3) {
                        if (j15 > j16 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i16 = i17 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i16)))) {
                                throw new d(i17, length);
                            }
                            com.google.protobuf.a.e(cCharAt2, j15);
                            return 0;
                        }
                        int i18 = i17 + 1;
                        if (i18 != length) {
                            char cCharAt3 = str.charAt(i18);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                y2.k(bArr, j15, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                y2.k(bArr, j15 + j14, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j17 = j15 + 3;
                                y2.k(bArr, 2 + j15, (byte) (((codePoint >>> 6) & 63) | 128));
                                j15 += 4;
                                y2.k(bArr, j17, (byte) ((codePoint & 63) | 128));
                                i17 = i18;
                            } else {
                                i17 = i18;
                            }
                        }
                        throw new d(i17 - 1, length);
                    }
                    y2.k(bArr, j15, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j18 = 2 + j15;
                    y2.k(bArr, j15 + j14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j15 += 3;
                    y2.k(bArr, j18, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j14 = j8;
                    long j19 = j15 + j14;
                    y2.k(bArr, j15, (byte) ((cCharAt2 >>> 6) | 960));
                    j15 += 2;
                    y2.k(bArr, j19, (byte) ((cCharAt2 & '?') | 128));
                }
                i17++;
                j8 = j14;
            }
            return (int) j15;
        }

        @Override // androidx.health.platform.client.proto.z2.b
        public final int c(byte[] bArr, int i14, int i15) {
            int i16;
            if ((i14 | i15 | (bArr.length - i15)) < 0) {
                com.google.protobuf.a.l("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i14), Integer.valueOf(i15)});
                return 0;
            }
            long j8 = i14;
            int i17 = (int) (((long) i15) - j8);
            if (i17 >= 16) {
                int i18 = 8 - (((int) j8) & 7);
                long j14 = j8;
                i16 = 0;
                while (true) {
                    if (i16 >= i18) {
                        while (true) {
                            int i19 = i16 + 8;
                            if (i19 > i17) {
                                break;
                            }
                            if ((y2.f7815c.h(bArr, y2.f7818f + j14) & (-9187201950435737472L)) != 0) {
                                break;
                            }
                            j14 += 8;
                            i16 = i19;
                        }
                        while (true) {
                            if (i16 >= i17) {
                                i16 = i17;
                                break;
                            }
                            long j15 = j14 + 1;
                            if (y2.g(bArr, j14) < 0) {
                                break;
                            }
                            i16++;
                            j14 = j15;
                        }
                    } else {
                        long j16 = j14 + 1;
                        if (y2.g(bArr, j14) < 0) {
                            break;
                        }
                        i16++;
                        j14 = j16;
                    }
                }
            } else {
                i16 = 0;
            }
            int i24 = i17 - i16;
            long j17 = j8 + ((long) i16);
            while (true) {
                byte bG = 0;
                while (i24 > 0) {
                    long j18 = j17 + 1;
                    bG = y2.g(bArr, j17);
                    if (bG < 0) {
                        j17 = j18;
                        break;
                    }
                    i24--;
                    j17 = j18;
                }
                if (i24 == 0) {
                    return 0;
                }
                int i25 = i24 - 1;
                if (bG < -32) {
                    if (i25 == 0) {
                        return bG;
                    }
                    i24 -= 2;
                    if (bG < -62) {
                        return -1;
                    }
                    long j19 = j17 + 1;
                    if (y2.g(bArr, j17) > -65) {
                        return -1;
                    }
                    j17 = j19;
                } else if (bG < -16) {
                    if (i25 < 2) {
                        return d(bArr, bG, j17, i25);
                    }
                    i24 -= 3;
                    long j24 = j17 + 1;
                    byte bG2 = y2.g(bArr, j17);
                    if (bG2 > -65) {
                        return -1;
                    }
                    if (bG == -32 && bG2 < -96) {
                        return -1;
                    }
                    if (bG == -19 && bG2 >= -96) {
                        return -1;
                    }
                    j17 += 2;
                    if (y2.g(bArr, j24) > -65) {
                        return -1;
                    }
                } else {
                    if (i25 < 3) {
                        return d(bArr, bG, j17, i25);
                    }
                    i24 -= 4;
                    long j25 = j17 + 1;
                    byte bG3 = y2.g(bArr, j17);
                    if (bG3 > -65) {
                        return -1;
                    }
                    if ((((bG3 + 112) + (bG << Ascii.FS)) >> 30) != 0) {
                        return -1;
                    }
                    long j26 = 2 + j17;
                    if (y2.g(bArr, j25) > -65) {
                        return -1;
                    }
                    j17 += 3;
                    if (y2.g(bArr, j26) > -65) {
                        return -1;
                    }
                }
            }
        }
    }

    static {
        f7824a = (y2.f7817e && y2.f7816d && !androidx.health.platform.client.proto.d.a()) ? new e() : new c();
    }

    private z2() {
    }

    public static int a(byte[] bArr, int i14, int i15) {
        byte b14 = bArr[i14 - 1];
        int i16 = i15 - i14;
        if (i16 == 0) {
            if (b14 > -12) {
                return -1;
            }
            return b14;
        }
        if (i16 == 1) {
            return c(b14, bArr[i14]);
        }
        if (i16 == 2) {
            return d(b14, bArr[i14], bArr[i14 + 1]);
        }
        v.e0.l();
        return 0;
    }

    public static int b(String str) {
        int length = str.length();
        int i14 = 0;
        int i15 = 0;
        while (i15 < length && str.charAt(i15) < 128) {
            i15++;
        }
        int i16 = length;
        while (i15 < length) {
            char cCharAt = str.charAt(i15);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i15 < length2) {
                    char cCharAt2 = str.charAt(i15);
                    if (cCharAt2 < 2048) {
                        i14 += (127 - cCharAt2) >>> 31;
                    } else {
                        i14 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i15) < 65536) {
                                throw new d(i15, length2);
                            }
                            i15++;
                        }
                    }
                    i15++;
                }
                i16 += i14;
                break;
            }
            i16 += (127 - cCharAt) >>> 31;
            i15++;
        }
        if (i16 >= length) {
            return i16;
        }
        com.google.protobuf.a.g(((long) i16) + 4294967296L);
        return 0;
    }

    public static int c(int i14, int i15) {
        if (i14 > -12 || i15 > -65) {
            return -1;
        }
        return i14 ^ (i15 << 8);
    }

    public static int d(int i14, int i15, int i16) {
        if (i14 > -12 || i15 > -65 || i16 > -65) {
            return -1;
        }
        return (i14 ^ (i15 << 8)) ^ (i16 << 16);
    }
}
