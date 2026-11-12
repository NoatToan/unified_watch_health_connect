package org.apache.commons.lang3;

import am.j;
import b71.i;
import com.google.firebase.messaging.l;
import java.util.UUID;
import okhttp3.internal.ws.WebSocketProtocol;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class Conversion {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean[] TTTT = {true, true, true, true};
    private static final boolean[] FTTT = {false, true, true, true};
    private static final boolean[] TFTT = {true, false, true, true};
    private static final boolean[] FFTT = {false, false, true, true};
    private static final boolean[] TTFT = {true, true, false, true};
    private static final boolean[] FTFT = {false, true, false, true};
    private static final boolean[] TFFT = {true, false, false, true};
    private static final boolean[] FFFT = {false, false, false, true};
    private static final boolean[] TTTF = {true, true, true, false};
    private static final boolean[] FTTF = {false, true, true, false};
    private static final boolean[] TFTF = {true, false, true, false};
    private static final boolean[] FFTF = {false, false, true, false};
    private static final boolean[] TTFF = {true, true, false, false};
    private static final boolean[] FTFF = {false, true, false, false};
    private static final boolean[] TFFF = {true, false, false, false};
    private static final boolean[] FFFF = {false, false, false, false};

    public static char binaryBeMsb0ToHexDigit(boolean[] zArr, int i14) {
        if (zArr.length == 0) {
            h.s("Cannot convert an empty array.");
            return (char) 0;
        }
        int length = ((zArr.length - 1) - i14) + 1;
        int iMin = Math.min(4, length);
        boolean[] zArr2 = new boolean[4];
        System.arraycopy(zArr, length - iMin, zArr2, 4 - iMin, iMin);
        if (zArr2[0]) {
            if (zArr2[1]) {
                if (zArr2[2]) {
                    return zArr2[3] ? 'f' : 'e';
                }
                return zArr2[3] ? 'd' : 'c';
            }
            if (zArr2[2]) {
                return zArr2[3] ? 'b' : 'a';
            }
            return zArr2[3] ? '9' : '8';
        }
        if (zArr2[1]) {
            if (zArr2[2]) {
                return zArr2[3] ? '7' : '6';
            }
            return zArr2[3] ? '5' : '4';
        }
        if (zArr2[2]) {
            return zArr2[3] ? '3' : '2';
        }
        return zArr2[3] ? '1' : '0';
    }

    public static byte binaryToByte(boolean[] zArr, int i14, byte b14, int i15, int i16) {
        if ((zArr.length == 0 && i14 == 0) || i16 == 0) {
            return b14;
        }
        if ((i16 - 1) + i15 >= 8) {
            h.s("nBools-1+dstPos is greater or equal to than 8");
            return (byte) 0;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i17 + i15;
            b14 = (byte) ((b14 & (~(1 << i18))) | ((zArr[i17 + i14] ? 1 : 0) << i18));
        }
        return b14;
    }

    public static char binaryToHexDigit(boolean[] zArr, int i14) {
        if (zArr.length == 0) {
            h.s("Cannot convert an empty array.");
            return (char) 0;
        }
        int i15 = i14 + 3;
        if (zArr.length > i15 && zArr[i15]) {
            if (zArr[i14 + 2]) {
                if (zArr[i14 + 1]) {
                    return zArr[i14] ? 'f' : 'e';
                }
                return zArr[i14] ? 'd' : 'c';
            }
            if (zArr[i14 + 1]) {
                return zArr[i14] ? 'b' : 'a';
            }
            return zArr[i14] ? '9' : '8';
        }
        int i16 = i14 + 2;
        if (zArr.length > i16 && zArr[i16]) {
            if (zArr[i14 + 1]) {
                return zArr[i14] ? '7' : '6';
            }
            return zArr[i14] ? '5' : '4';
        }
        int i17 = i14 + 1;
        if (zArr.length <= i17 || !zArr[i17]) {
            return zArr[i14] ? '1' : '0';
        }
        return zArr[i14] ? '3' : '2';
    }

    public static char binaryToHexDigitMsb0_4bits(boolean[] zArr, int i14) {
        if (zArr.length > 8) {
            sn.a.z(zArr.length, "src.length>8: src.length=");
            return (char) 0;
        }
        if (zArr.length - i14 < 4) {
            l.h(", srcPos=", zArr.length, i14, "src.length-srcPos<4: src.length=");
            return (char) 0;
        }
        if (zArr[i14 + 3]) {
            if (zArr[i14 + 2]) {
                if (zArr[i14 + 1]) {
                    return zArr[i14] ? 'f' : '7';
                }
                return zArr[i14] ? 'b' : '3';
            }
            if (zArr[i14 + 1]) {
                return zArr[i14] ? 'd' : '5';
            }
            return zArr[i14] ? '9' : '1';
        }
        if (zArr[i14 + 2]) {
            if (zArr[i14 + 1]) {
                return zArr[i14] ? 'e' : '6';
            }
            return zArr[i14] ? 'a' : '2';
        }
        if (zArr[i14 + 1]) {
            return zArr[i14] ? 'c' : '4';
        }
        return zArr[i14] ? '8' : '0';
    }

    public static int binaryToInt(boolean[] zArr, int i14, int i15, int i16, int i17) {
        if ((zArr.length == 0 && i14 == 0) || i17 == 0) {
            return i15;
        }
        if ((i17 - 1) + i16 >= 32) {
            h.s("nBools-1+dstPos is greater or equal to than 32");
            return 0;
        }
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i18 + i16;
            i15 = (i15 & (~(1 << i19))) | ((zArr[i18 + i14] ? 1 : 0) << i19);
        }
        return i15;
    }

    public static long binaryToLong(boolean[] zArr, int i14, long j8, int i15, int i16) {
        if ((zArr.length == 0 && i14 == 0) || i16 == 0) {
            return j8;
        }
        if ((i16 - 1) + i15 >= 64) {
            h.s("nBools-1+dstPos is greater or equal to than 64");
            return 0L;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i17 + i15;
            j8 = (j8 & (~(1 << i18))) | ((zArr[i17 + i14] ? 1L : 0L) << i18);
        }
        return j8;
    }

    public static short binaryToShort(boolean[] zArr, int i14, short s8, int i15, int i16) {
        if ((zArr.length == 0 && i14 == 0) || i16 == 0) {
            return s8;
        }
        if ((i16 - 1) + i15 >= 16) {
            h.s("nBools-1+dstPos is greater or equal to than 16");
            return (short) 0;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i17 + i15;
            s8 = (short) ((s8 & (~(1 << i18))) | ((zArr[i17 + i14] ? 1 : 0) << i18));
        }
        return s8;
    }

    public static int byteArrayToInt(byte[] bArr, int i14, int i15, int i16, int i17) {
        if ((bArr.length == 0 && i14 == 0) || i17 == 0) {
            return i15;
        }
        if (i.b(i17, 1, 8, i16) >= 32) {
            h.s("(nBytes-1)*8+dstPos is greater or equal to than 32");
            return 0;
        }
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = (i18 * 8) + i16;
            i15 = (i15 & (~(255 << i19))) | ((bArr[i18 + i14] & 255) << i19);
        }
        return i15;
    }

    public static long byteArrayToLong(byte[] bArr, int i14, long j8, int i15, int i16) {
        if ((bArr.length == 0 && i14 == 0) || i16 == 0) {
            return j8;
        }
        if (i.b(i16, 1, 8, i15) >= 64) {
            h.s("(nBytes-1)*8+dstPos is greater or equal to than 64");
            return 0L;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (i17 * 8) + i15;
            j8 = (j8 & (~(255 << i18))) | ((((long) bArr[i17 + i14]) & 255) << i18);
        }
        return j8;
    }

    public static short byteArrayToShort(byte[] bArr, int i14, short s8, int i15, int i16) {
        if ((bArr.length == 0 && i14 == 0) || i16 == 0) {
            return s8;
        }
        if (i.b(i16, 1, 8, i15) >= 16) {
            h.s("(nBytes-1)*8+dstPos is greater or equal to than 16");
            return (short) 0;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (i17 * 8) + i15;
            s8 = (short) ((s8 & (~(255 << i18))) | ((bArr[i17 + i14] & 255) << i18));
        }
        return s8;
    }

    public static UUID byteArrayToUuid(byte[] bArr, int i14) {
        if (bArr.length - i14 >= 16) {
            return new UUID(byteArrayToLong(bArr, i14, 0L, 0, 8), byteArrayToLong(bArr, i14 + 8, 0L, 0, 8));
        }
        h.s("Need at least 16 bytes for UUID");
        return null;
    }

    public static boolean[] byteToBinary(byte b14, int i14, boolean[] zArr, int i15, int i16) {
        if (i16 != 0) {
            if ((i16 - 1) + i14 >= 8) {
                h.s("nBools-1+srcPos is greater or equal to than 8");
                return null;
            }
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = i15 + i17;
                boolean z14 = true;
                if (((b14 >> (i17 + i14)) & 1) == 0) {
                    z14 = false;
                }
                zArr[i18] = z14;
            }
        }
        return zArr;
    }

    public static String byteToHex(byte b14, int i14, String str, int i15, int i16) {
        if (i16 == 0) {
            return str;
        }
        if (i.b(i16, 1, 4, i14) >= 8) {
            h.s("(nHexs-1)*4+srcPos is greater or equal to than 8");
            return null;
        }
        StringBuilder sb3 = new StringBuilder(str);
        int length = sb3.length();
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (b14 >> ((i17 * 4) + i14)) & 15;
            int i19 = i15 + i17;
            if (i19 == length) {
                length++;
                sb3.append(intToHexDigit(i18));
            } else {
                sb3.setCharAt(i19, intToHexDigit(i18));
            }
        }
        return sb3.toString();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static boolean[] hexDigitMsb0ToBinary(char c14) {
        switch (c14) {
            case '0':
                return (boolean[]) FFFF.clone();
            case '1':
                return (boolean[]) FFFT.clone();
            case '2':
                return (boolean[]) FFTF.clone();
            case '3':
                return (boolean[]) FFTT.clone();
            case '4':
                return (boolean[]) FTFF.clone();
            case '5':
                return (boolean[]) FTFT.clone();
            case '6':
                return (boolean[]) FTTF.clone();
            case '7':
                return (boolean[]) FTTT.clone();
            case '8':
                return (boolean[]) TFFF.clone();
            case '9':
                return (boolean[]) TFFT.clone();
            default:
                switch (c14) {
                    case 'A':
                        return (boolean[]) TFTF.clone();
                    case 'B':
                        return (boolean[]) TFTT.clone();
                    case 'C':
                        return (boolean[]) TTFF.clone();
                    case 'D':
                        return (boolean[]) TTFT.clone();
                    case 'E':
                        return (boolean[]) TTTF.clone();
                    case 'F':
                        return (boolean[]) TTTT.clone();
                    default:
                        switch (c14) {
                            case 'a':
                                return (boolean[]) TFTF.clone();
                            case 'b':
                                return (boolean[]) TFTT.clone();
                            case 'c':
                                return (boolean[]) TTFF.clone();
                            case 'd':
                                return (boolean[]) TTFT.clone();
                            case 'e':
                                return (boolean[]) TTTF.clone();
                            case 'f':
                                return (boolean[]) TTTT.clone();
                            default:
                                com.nimbusds.jose.shaded.gson.internal.a.n(c14, "Cannot interpret '", "' as a hexadecimal digit");
                                return null;
                        }
                }
        }
    }

    public static int hexDigitMsb0ToInt(char c14) {
        switch (c14) {
            case '0':
                return 0;
            case '1':
                return 8;
            case '2':
                return 4;
            case '3':
                return 12;
            case '4':
                return 2;
            case '5':
                return 10;
            case '6':
                return 6;
            case '7':
                return 14;
            case '8':
                return 1;
            case '9':
                return 9;
            default:
                switch (c14) {
                    case 'A':
                        return 5;
                    case 'B':
                        return 13;
                    case 'C':
                        return 3;
                    case 'D':
                        return 11;
                    case 'E':
                        return 7;
                    case 'F':
                        return 15;
                    default:
                        switch (c14) {
                            case 'a':
                                return 5;
                            case 'b':
                                return 13;
                            case 'c':
                                return 3;
                            case 'd':
                                return 11;
                            case 'e':
                                return 7;
                            case 'f':
                                return 15;
                            default:
                                com.nimbusds.jose.shaded.gson.internal.a.n(c14, "Cannot interpret '", "' as a hexadecimal digit");
                                return 0;
                        }
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static boolean[] hexDigitToBinary(char c14) {
        switch (c14) {
            case '0':
                return (boolean[]) FFFF.clone();
            case '1':
                return (boolean[]) TFFF.clone();
            case '2':
                return (boolean[]) FTFF.clone();
            case '3':
                return (boolean[]) TTFF.clone();
            case '4':
                return (boolean[]) FFTF.clone();
            case '5':
                return (boolean[]) TFTF.clone();
            case '6':
                return (boolean[]) FTTF.clone();
            case '7':
                return (boolean[]) TTTF.clone();
            case '8':
                return (boolean[]) FFFT.clone();
            case '9':
                return (boolean[]) TFFT.clone();
            default:
                switch (c14) {
                    case 'A':
                        return (boolean[]) FTFT.clone();
                    case 'B':
                        return (boolean[]) TTFT.clone();
                    case 'C':
                        return (boolean[]) FFTT.clone();
                    case 'D':
                        return (boolean[]) TFTT.clone();
                    case 'E':
                        return (boolean[]) FTTT.clone();
                    case 'F':
                        return (boolean[]) TTTT.clone();
                    default:
                        switch (c14) {
                            case 'a':
                                return (boolean[]) FTFT.clone();
                            case 'b':
                                return (boolean[]) TTFT.clone();
                            case 'c':
                                return (boolean[]) FFTT.clone();
                            case 'd':
                                return (boolean[]) TFTT.clone();
                            case 'e':
                                return (boolean[]) FTTT.clone();
                            case 'f':
                                return (boolean[]) TTTT.clone();
                            default:
                                com.nimbusds.jose.shaded.gson.internal.a.n(c14, "Cannot interpret '", "' as a hexadecimal digit");
                                return null;
                        }
                }
        }
    }

    public static int hexDigitToInt(char c14) {
        int iDigit = Character.digit(c14, 16);
        if (iDigit >= 0) {
            return iDigit;
        }
        com.nimbusds.jose.shaded.gson.internal.a.n(c14, "Cannot interpret '", "' as a hexadecimal digit");
        return 0;
    }

    public static byte hexToByte(String str, int i14, byte b14, int i15, int i16) {
        if (i16 == 0) {
            return b14;
        }
        if (i.b(i16, 1, 4, i15) >= 8) {
            h.s("(nHexs-1)*4+dstPos is greater or equal to than 8");
            return (byte) 0;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (i17 * 4) + i15;
            b14 = (byte) ((b14 & (~(15 << i18))) | ((hexDigitToInt(str.charAt(i17 + i14)) & 15) << i18));
        }
        return b14;
    }

    public static int hexToInt(String str, int i14, int i15, int i16, int i17) {
        if (i17 == 0) {
            return i15;
        }
        if (i.b(i17, 1, 4, i16) >= 32) {
            h.s("(nHexs-1)*4+dstPos is greater or equal to than 32");
            return 0;
        }
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = (i18 * 4) + i16;
            i15 = (i15 & (~(15 << i19))) | ((hexDigitToInt(str.charAt(i18 + i14)) & 15) << i19);
        }
        return i15;
    }

    public static long hexToLong(String str, int i14, long j8, int i15, int i16) {
        if (i16 == 0) {
            return j8;
        }
        if (i.b(i16, 1, 4, i15) >= 64) {
            h.s("(nHexs-1)*4+dstPos is greater or equal to than 64");
            return 0L;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (i17 * 4) + i15;
            j8 = (j8 & (~(15 << i18))) | ((((long) hexDigitToInt(str.charAt(i17 + i14))) & 15) << i18);
        }
        return j8;
    }

    public static short hexToShort(String str, int i14, short s8, int i15, int i16) {
        if (i16 == 0) {
            return s8;
        }
        if (i.b(i16, 1, 4, i15) >= 16) {
            h.s("(nHexs-1)*4+dstPos is greater or equal to than 16");
            return (short) 0;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (i17 * 4) + i15;
            s8 = (short) ((s8 & (~(15 << i18))) | ((hexDigitToInt(str.charAt(i17 + i14)) & 15) << i18));
        }
        return s8;
    }

    public static long intArrayToLong(int[] iArr, int i14, long j8, int i15, int i16) {
        if ((iArr.length == 0 && i14 == 0) || i16 == 0) {
            return j8;
        }
        if (i.b(i16, 1, 32, i15) >= 64) {
            h.s("(nInts-1)*32+dstPos is greater or equal to than 64");
            return 0L;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (i17 * 32) + i15;
            j8 = (j8 & (~(4294967295 << i18))) | ((((long) iArr[i17 + i14]) & 4294967295L) << i18);
        }
        return j8;
    }

    public static boolean[] intToBinary(int i14, int i15, boolean[] zArr, int i16, int i17) {
        if (i17 != 0) {
            if ((i17 - 1) + i15 >= 32) {
                h.s("nBools-1+srcPos is greater or equal to than 32");
                return null;
            }
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = i16 + i18;
                boolean z14 = true;
                if (((i14 >> (i18 + i15)) & 1) == 0) {
                    z14 = false;
                }
                zArr[i19] = z14;
            }
        }
        return zArr;
    }

    public static byte[] intToByteArray(int i14, int i15, byte[] bArr, int i16, int i17) {
        if (i17 != 0) {
            if (i.b(i17, 1, 8, i15) >= 32) {
                h.s("(nBytes-1)*8+srcPos is greater or equal to than 32");
                return null;
            }
            for (int i18 = 0; i18 < i17; i18++) {
                bArr[i16 + i18] = (byte) ((i14 >> ((i18 * 8) + i15)) & 255);
            }
        }
        return bArr;
    }

    public static String intToHex(int i14, int i15, String str, int i16, int i17) {
        if (i17 == 0) {
            return str;
        }
        if (i.b(i17, 1, 4, i15) >= 32) {
            h.s("(nHexs-1)*4+srcPos is greater or equal to than 32");
            return null;
        }
        StringBuilder sb3 = new StringBuilder(str);
        int length = sb3.length();
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = (i14 >> ((i18 * 4) + i15)) & 15;
            int i24 = i16 + i18;
            if (i24 == length) {
                length++;
                sb3.append(intToHexDigit(i19));
            } else {
                sb3.setCharAt(i24, intToHexDigit(i19));
            }
        }
        return sb3.toString();
    }

    public static char intToHexDigit(int i14) {
        char cForDigit = Character.forDigit(i14, 16);
        if (cForDigit != 0) {
            return cForDigit;
        }
        h.s(j.h(i14, "nibble value not between 0 and 15: "));
        return (char) 0;
    }

    public static char intToHexDigitMsb0(int i14) {
        switch (i14) {
            case 0:
                return '0';
            case 1:
                return '8';
            case 2:
                return '4';
            case 3:
                return 'c';
            case 4:
                return '2';
            case 5:
                return 'a';
            case 6:
                return '6';
            case 7:
                return 'e';
            case 8:
                return '1';
            case 9:
                return '9';
            case 10:
                return '5';
            case 11:
                return 'd';
            case 12:
                return '3';
            case 13:
                return 'b';
            case 14:
                return '7';
            case 15:
                return 'f';
            default:
                h.s(j.h(i14, "nibble value not between 0 and 15: "));
                return (char) 0;
        }
    }

    public static short[] intToShortArray(int i14, int i15, short[] sArr, int i16, int i17) {
        if (i17 != 0) {
            if (i.b(i17, 1, 16, i15) >= 32) {
                h.s("(nShorts-1)*16+srcPos is greater or equal to than 32");
                return null;
            }
            for (int i18 = 0; i18 < i17; i18++) {
                sArr[i16 + i18] = (short) ((i14 >> ((i18 * 16) + i15)) & 65535);
            }
        }
        return sArr;
    }

    public static boolean[] longToBinary(long j8, int i14, boolean[] zArr, int i15, int i16) {
        if (i16 != 0) {
            if ((i16 - 1) + i14 >= 64) {
                h.s("nBools-1+srcPos is greater or equal to than 64");
                return null;
            }
            for (int i17 = 0; i17 < i16; i17++) {
                zArr[i15 + i17] = (1 & (j8 >> (i17 + i14))) != 0;
            }
        }
        return zArr;
    }

    public static byte[] longToByteArray(long j8, int i14, byte[] bArr, int i15, int i16) {
        if (i16 != 0) {
            if (i.b(i16, 1, 8, i14) >= 64) {
                h.s("(nBytes-1)*8+srcPos is greater or equal to than 64");
                return null;
            }
            for (int i17 = 0; i17 < i16; i17++) {
                bArr[i15 + i17] = (byte) (255 & (j8 >> ((i17 * 8) + i14)));
            }
        }
        return bArr;
    }

    public static String longToHex(long j8, int i14, String str, int i15, int i16) {
        if (i16 == 0) {
            return str;
        }
        if (i.b(i16, 1, 4, i14) >= 64) {
            h.s("(nHexs-1)*4+srcPos is greater or equal to than 64");
            return null;
        }
        StringBuilder sb3 = new StringBuilder(str);
        int length = sb3.length();
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (int) ((j8 >> ((i17 * 4) + i14)) & 15);
            int i19 = i15 + i17;
            if (i19 == length) {
                length++;
                sb3.append(intToHexDigit(i18));
            } else {
                sb3.setCharAt(i19, intToHexDigit(i18));
            }
        }
        return sb3.toString();
    }

    public static int[] longToIntArray(long j8, int i14, int[] iArr, int i15, int i16) {
        if (i16 != 0) {
            if (i.b(i16, 1, 32, i14) >= 64) {
                h.s("(nInts-1)*32+srcPos is greater or equal to than 64");
                return null;
            }
            for (int i17 = 0; i17 < i16; i17++) {
                iArr[i15 + i17] = (int) (j8 >> ((i17 * 32) + i14));
            }
        }
        return iArr;
    }

    public static short[] longToShortArray(long j8, int i14, short[] sArr, int i15, int i16) {
        if (i16 != 0) {
            if (i.b(i16, 1, 16, i14) >= 64) {
                h.s("(nShorts-1)*16+srcPos is greater or equal to than 64");
                return null;
            }
            for (int i17 = 0; i17 < i16; i17++) {
                sArr[i15 + i17] = (short) (WebSocketProtocol.PAYLOAD_SHORT_MAX & (j8 >> ((i17 * 16) + i14)));
            }
        }
        return sArr;
    }

    public static int shortArrayToInt(short[] sArr, int i14, int i15, int i16, int i17) {
        if ((sArr.length == 0 && i14 == 0) || i17 == 0) {
            return i15;
        }
        if (i.b(i17, 1, 16, i16) >= 32) {
            h.s("(nShorts-1)*16+dstPos is greater or equal to than 32");
            return 0;
        }
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = (i18 * 16) + i16;
            i15 = (i15 & (~(65535 << i19))) | ((sArr[i18 + i14] & 65535) << i19);
        }
        return i15;
    }

    public static long shortArrayToLong(short[] sArr, int i14, long j8, int i15, int i16) {
        if ((sArr.length == 0 && i14 == 0) || i16 == 0) {
            return j8;
        }
        if (i.b(i16, 1, 16, i15) >= 64) {
            h.s("(nShorts-1)*16+dstPos is greater or equal to than 64");
            return 0L;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (i17 * 16) + i15;
            j8 = (j8 & (~(WebSocketProtocol.PAYLOAD_SHORT_MAX << i18))) | ((((long) sArr[i17 + i14]) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << i18);
        }
        return j8;
    }

    public static boolean[] shortToBinary(short s8, int i14, boolean[] zArr, int i15, int i16) {
        if (i16 != 0) {
            if ((i16 - 1) + i14 >= 16) {
                h.s("nBools-1+srcPos is greater or equal to than 16");
                return null;
            }
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = i15 + i17;
                boolean z14 = true;
                if (((s8 >> (i17 + i14)) & 1) == 0) {
                    z14 = false;
                }
                zArr[i18] = z14;
            }
        }
        return zArr;
    }

    public static byte[] shortToByteArray(short s8, int i14, byte[] bArr, int i15, int i16) {
        if (i16 != 0) {
            if (i.b(i16, 1, 8, i14) >= 16) {
                h.s("(nBytes-1)*8+srcPos is greater or equal to than 16");
                return null;
            }
            for (int i17 = 0; i17 < i16; i17++) {
                bArr[i15 + i17] = (byte) ((s8 >> ((i17 * 8) + i14)) & 255);
            }
        }
        return bArr;
    }

    public static String shortToHex(short s8, int i14, String str, int i15, int i16) {
        if (i16 == 0) {
            return str;
        }
        if (i.b(i16, 1, 4, i14) >= 16) {
            h.s("(nHexs-1)*4+srcPos is greater or equal to than 16");
            return null;
        }
        StringBuilder sb3 = new StringBuilder(str);
        int length = sb3.length();
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (s8 >> ((i17 * 4) + i14)) & 15;
            int i19 = i15 + i17;
            if (i19 == length) {
                length++;
                sb3.append(intToHexDigit(i18));
            } else {
                sb3.setCharAt(i19, intToHexDigit(i18));
            }
        }
        return sb3.toString();
    }

    public static byte[] uuidToByteArray(UUID uuid, byte[] bArr, int i14, int i15) {
        if (i15 != 0) {
            if (i15 > 16) {
                h.s("nBytes is greater than 16");
                return null;
            }
            longToByteArray(uuid.getMostSignificantBits(), 0, bArr, i14, Math.min(i15, 8));
            if (i15 >= 8) {
                longToByteArray(uuid.getLeastSignificantBits(), 0, bArr, i14 + 8, i15 - 8);
            }
        }
        return bArr;
    }

    public static char binaryBeMsb0ToHexDigit(boolean[] zArr) {
        return binaryBeMsb0ToHexDigit(zArr, 0);
    }

    public static char binaryToHexDigit(boolean[] zArr) {
        return binaryToHexDigit(zArr, 0);
    }

    public static char binaryToHexDigitMsb0_4bits(boolean[] zArr) {
        return binaryToHexDigitMsb0_4bits(zArr, 0);
    }
}
