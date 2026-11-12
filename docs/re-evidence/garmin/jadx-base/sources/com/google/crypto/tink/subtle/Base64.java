package com.google.crypto.tink.subtle;

import androidx.core.view.j;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static abstract class Coder {

        /* JADX INFO: renamed from: op, reason: collision with root package name */
        public int f53631op;
        public byte[] output;

        public abstract int maxOutputSize(int i14);

        public abstract boolean process(byte[] bArr, int i14, int i15, boolean z14);
    }

    public static class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int i14, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (i14 & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int i14) {
            return j.a(i14, 3, 4, 10);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public boolean process(byte[] bArr, int i14, int i15, boolean z14) {
            int i16 = this.state;
            if (i16 == 6) {
                return false;
            }
            int i17 = i15 + i14;
            int i18 = this.value;
            byte[] bArr2 = this.output;
            int[] iArr = this.alphabet;
            int i19 = 0;
            int i24 = i18;
            int i25 = i16;
            int i26 = i14;
            while (i26 < i17) {
                if (i25 == 0) {
                    while (true) {
                        int i27 = i26 + 4;
                        if (i27 > i17 || (i24 = (iArr[bArr[i26] & UnsignedBytes.MAX_VALUE] << 18) | (iArr[bArr[i26 + 1] & UnsignedBytes.MAX_VALUE] << 12) | (iArr[bArr[i26 + 2] & UnsignedBytes.MAX_VALUE] << 6) | iArr[bArr[i26 + 3] & UnsignedBytes.MAX_VALUE]) < 0) {
                            break;
                        }
                        bArr2[i19 + 2] = (byte) i24;
                        bArr2[i19 + 1] = (byte) (i24 >> 8);
                        bArr2[i19] = (byte) (i24 >> 16);
                        i19 += 3;
                        i26 = i27;
                    }
                    if (i26 >= i17) {
                        break;
                    }
                }
                int i28 = i26 + 1;
                int i29 = iArr[bArr[i26] & UnsignedBytes.MAX_VALUE];
                if (i25 != 0) {
                    if (i25 != 1) {
                        if (i25 != 2) {
                            if (i25 != 3) {
                                if (i25 != 4) {
                                    if (i25 == 5 && i29 != -1) {
                                        this.state = 6;
                                        return false;
                                    }
                                } else if (i29 == -2) {
                                    i25++;
                                } else if (i29 != -1) {
                                    this.state = 6;
                                    return false;
                                }
                            } else if (i29 >= 0) {
                                int i30 = i29 | (i24 << 6);
                                bArr2[i19 + 2] = (byte) i30;
                                bArr2[i19 + 1] = (byte) (i30 >> 8);
                                bArr2[i19] = (byte) (i30 >> 16);
                                i19 += 3;
                                i24 = i30;
                                i25 = 0;
                            } else if (i29 == -2) {
                                bArr2[i19 + 1] = (byte) (i24 >> 2);
                                bArr2[i19] = (byte) (i24 >> 10);
                                i19 += 2;
                                i25 = 5;
                            } else if (i29 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i29 >= 0) {
                            i29 |= i24 << 6;
                            i25++;
                            i24 = i29;
                        } else if (i29 == -2) {
                            bArr2[i19] = (byte) (i24 >> 4);
                            i19++;
                            i25 = 4;
                        } else if (i29 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (i29 >= 0) {
                        i29 |= i24 << 6;
                        i25++;
                        i24 = i29;
                    } else if (i29 != -1) {
                        this.state = 6;
                        return false;
                    }
                } else if (i29 >= 0) {
                    i25++;
                    i24 = i29;
                } else if (i29 != -1) {
                    this.state = 6;
                    return false;
                }
                i26 = i28;
            }
            if (!z14) {
                this.state = i25;
                this.value = i24;
                this.f53631op = i19;
                return true;
            }
            if (i25 == 1) {
                this.state = 6;
                return false;
            }
            if (i25 == 2) {
                bArr2[i19] = (byte) (i24 >> 4);
                i19++;
            } else if (i25 == 3) {
                int i34 = i19 + 1;
                bArr2[i19] = (byte) (i24 >> 10);
                i19 += 2;
                bArr2[i34] = (byte) (i24 >> 2);
            } else if (i25 == 4) {
                this.state = 6;
                return false;
            }
            this.state = i25;
            this.f53631op = i19;
            return true;
        }
    }

    public static class Encoder extends Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean doCr;
        public final boolean doNewline;
        public final boolean doPadding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int i14, byte[] bArr) {
            this.output = bArr;
            this.doPadding = (i14 & 1) == 0;
            boolean z14 = (i14 & 2) == 0;
            this.doNewline = z14;
            this.doCr = (i14 & 4) != 0;
            this.alphabet = (i14 & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z14 ? 19 : -1;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int i14) {
            return j.a(i14, 8, 5, 10);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public boolean process(byte[] bArr, int i14, int i15, boolean z14) {
            int i16;
            int i17;
            int i18;
            int i19;
            byte b14;
            byte b15;
            byte b16;
            int i24;
            int i25;
            byte[] bArr2 = this.alphabet;
            byte[] bArr3 = this.output;
            int i26 = this.count;
            int i27 = i15 + i14;
            int i28 = this.tailLen;
            char c14 = 2;
            int i29 = 0;
            if (i28 != 1) {
                if (i28 == 2 && (i25 = i14 + 1) <= i27) {
                    byte[] bArr4 = this.tail;
                    i17 = ((bArr4[1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr4[0] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i14] & UnsignedBytes.MAX_VALUE);
                    this.tailLen = 0;
                    i16 = i25;
                } else {
                    i16 = i14;
                    i17 = -1;
                }
            } else if (i14 + 2 <= i27) {
                i16 = i14 + 2;
                i17 = (bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) | ((this.tail[0] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i14] & UnsignedBytes.MAX_VALUE) << 8);
                this.tailLen = 0;
            } else {
                i16 = i14;
                i17 = -1;
            }
            if (i17 != -1) {
                bArr3[0] = bArr2[(i17 >> 18) & 63];
                bArr3[1] = bArr2[(i17 >> 12) & 63];
                bArr3[2] = bArr2[(i17 >> 6) & 63];
                bArr3[3] = bArr2[i17 & 63];
                i26--;
                if (i26 == 0) {
                    if (this.doCr) {
                        bArr3[4] = Ascii.CR;
                        i24 = 5;
                    } else {
                        i24 = 4;
                    }
                    i18 = i24 + 1;
                    bArr3[i24] = 10;
                    i26 = 19;
                } else {
                    i18 = 4;
                }
            } else {
                i18 = 0;
            }
            while (true) {
                i16 += 3;
                if (i16 > i27) {
                    break;
                }
                c14 = c14;
                int i30 = ((bArr[i16 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i16] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i16 + 2] & UnsignedBytes.MAX_VALUE);
                bArr3[i18] = bArr2[(i30 >> 18) & 63];
                bArr3[i18 + 1] = bArr2[(i30 >> 12) & 63];
                bArr3[i18 + 2] = bArr2[(i30 >> 6) & 63];
                bArr3[i18 + 3] = bArr2[i30 & 63];
                int i34 = i18 + 4;
                i26--;
                if (i26 == 0) {
                    if (this.doCr) {
                        bArr3[i34] = Ascii.CR;
                        i34 = i18 + 5;
                    }
                    i18 = i34 + 1;
                    bArr3[i34] = 10;
                    i26 = 19;
                } else {
                    i18 = i34;
                }
            }
            if (z14) {
                int i35 = this.tailLen;
                if (i16 - i35 == i27 - 1) {
                    if (i35 > 0) {
                        b16 = this.tail[0];
                        i29 = 1;
                    } else {
                        b16 = bArr[i16];
                    }
                    int i36 = (b16 & UnsignedBytes.MAX_VALUE) << 4;
                    this.tailLen = i35 - i29;
                    bArr3[i18] = bArr2[(i36 >> 6) & 63];
                    int i37 = i18 + 2;
                    bArr3[i18 + 1] = bArr2[i36 & 63];
                    if (this.doPadding) {
                        bArr3[i37] = 61;
                        i37 = i18 + 4;
                        bArr3[i18 + 3] = 61;
                    }
                    if (this.doNewline) {
                        if (this.doCr) {
                            bArr3[i37] = Ascii.CR;
                            i37++;
                        }
                        i19 = i37 + 1;
                        bArr3[i37] = 10;
                        i18 = i19;
                    } else {
                        i18 = i37;
                    }
                } else if (i16 - i35 == i27 - 2) {
                    if (i35 > 1) {
                        b14 = this.tail[0];
                        i29 = 1;
                    } else {
                        byte b17 = bArr[i16];
                        i16++;
                        b14 = b17;
                    }
                    int i38 = (b14 & UnsignedBytes.MAX_VALUE) << 10;
                    if (i35 > 0) {
                        b15 = this.tail[i29];
                        i29++;
                    } else {
                        b15 = bArr[i16];
                    }
                    int i39 = i38 | ((b15 & UnsignedBytes.MAX_VALUE) << 2);
                    this.tailLen = i35 - i29;
                    bArr3[i18] = bArr2[(i39 >> 12) & 63];
                    bArr3[i18 + 1] = bArr2[(i39 >> 6) & 63];
                    int i44 = i18 + 3;
                    bArr3[i18 + 2] = bArr2[i39 & 63];
                    if (this.doPadding) {
                        bArr3[i44] = 61;
                        i44 = i18 + 4;
                    }
                    if (this.doNewline) {
                        if (this.doCr) {
                            bArr3[i44] = Ascii.CR;
                            i44++;
                        }
                        i19 = i44 + 1;
                        bArr3[i44] = 10;
                        i18 = i19;
                    } else {
                        i18 = i44;
                    }
                } else if (this.doNewline && i18 > 0 && i26 != 19) {
                    if (this.doCr) {
                        bArr3[i18] = Ascii.CR;
                        i18++;
                    }
                    i19 = i18 + 1;
                    bArr3[i18] = 10;
                    i18 = i19;
                }
            } else if (i16 == i27 - 1) {
                byte[] bArr5 = this.tail;
                int i45 = this.tailLen;
                this.tailLen = i45 + 1;
                bArr5[i45] = bArr[i16];
            } else if (i16 == i27 - 2) {
                byte[] bArr6 = this.tail;
                int i46 = this.tailLen;
                int i47 = i46 + 1;
                this.tailLen = i47;
                bArr6[i46] = bArr[i16];
                this.tailLen = i46 + 2;
                bArr6[i47] = bArr[i16 + 1];
            }
            this.f53631op = i18;
            this.count = i26;
            return true;
        }
    }

    private Base64() {
    }

    public static byte[] decode(byte[] bArr, int i14, int i15, int i16) {
        Decoder decoder = new Decoder(i16, new byte[(i15 * 3) / 4]);
        if (!decoder.process(bArr, i14, i15, true)) {
            h.s("bad base-64");
            return null;
        }
        int i17 = decoder.f53631op;
        byte[] bArr2 = decoder.output;
        if (i17 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i17];
        System.arraycopy(bArr2, 0, bArr3, 0, i17);
        return bArr3;
    }

    public static byte[] encode(byte[] bArr, int i14, int i15, int i16) {
        Encoder encoder = new Encoder(i16, null);
        int iA = (i15 / 3) * 4;
        if (!encoder.doPadding) {
            int i17 = i15 % 3;
            if (i17 == 1) {
                iA += 2;
            } else if (i17 == 2) {
                iA += 3;
            }
        } else if (i15 % 3 > 0) {
            iA += 4;
        }
        if (encoder.doNewline && i15 > 0) {
            iA += am.j.a(i15, 1, 57, 1) * (encoder.doCr ? 2 : 1);
        }
        encoder.output = new byte[iA];
        encoder.process(bArr, i14, i15, true);
        return encoder.output;
    }

    public static String encodeToString(byte[] bArr, int i14) {
        try {
            return new String(encode(bArr, i14), "US-ASCII");
        } catch (UnsupportedEncodingException e4) {
            h.q(e4);
            return null;
        }
    }

    public static byte[] urlSafeDecode(String str) {
        return decode(str, 11);
    }

    public static String urlSafeEncode(byte[] bArr) {
        return encodeToString(bArr, 11);
    }

    public static String encodeToString(byte[] bArr, int i14, int i15, int i16) {
        try {
            return new String(encode(bArr, i14, i15, i16), "US-ASCII");
        } catch (UnsupportedEncodingException e4) {
            h.q(e4);
            return null;
        }
    }

    public static byte[] decode(String str, int i14) {
        return decode(str.getBytes(UTF_8), i14);
    }

    public static byte[] decode(byte[] bArr, int i14) {
        return decode(bArr, 0, bArr.length, i14);
    }

    public static byte[] decode(String str) {
        return decode(str, 2);
    }

    public static byte[] encode(byte[] bArr, int i14) {
        return encode(bArr, 0, bArr.length, i14);
    }

    public static String encode(byte[] bArr) {
        return encodeToString(bArr, 2);
    }
}
