package com.amap.api.col.p0003sl;

import androidx.core.view.MotionEventCompat;
import com.google.common.base.Ascii;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public class jj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f2890a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f2891b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f2892c = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, -9, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, PublicSuffixDatabase.i, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] e = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, Utf8.REPLACEMENT_BYTE, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, PublicSuffixDatabase.i, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] f = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] g = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, PublicSuffixDatabase.i, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, Utf8.REPLACEMENT_BYTE, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    private jj() {
    }

    public static String a(byte[] bArr) {
        String strA;
        try {
            strA = a(bArr, bArr.length);
        } catch (IOException e2) {
            if (!f2890a) {
                throw new AssertionError(e2.getMessage());
            }
            strA = null;
        }
        if (f2890a || strA != null) {
            return strA;
        }
        throw new AssertionError();
    }

    private static byte[] b(byte[] bArr, int i) throws IOException {
        int i2;
        int i3;
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (i > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        if (i == 0) {
            return new byte[0];
        }
        if (i < 4) {
            throw new IllegalArgumentException("Base64Util-encoded string must have at least four characters, but length specified was ".concat(String.valueOf(i)));
        }
        byte[] bArr2 = f2892c;
        int i4 = (i * 3) / 4;
        byte[] bArr3 = new byte[i4];
        byte[] bArr4 = new byte[4];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            byte b2 = bArr[i7];
            byte b3 = bArr2[b2 & 255];
            if (b3 < -5) {
                throw new IOException(String.format("Bad Base64Util input character decimal %d in array position %d", Integer.valueOf(b2 & 255), Integer.valueOf(i7)));
            }
            if (b3 >= -1) {
                int i8 = i6 + 1;
                bArr4[i6] = b2;
                if (i8 <= 3) {
                    i6 = i8;
                } else {
                    if (i5 < 0 || (i2 = i5 + 2) >= i4) {
                        throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(i4), Integer.valueOf(i5)));
                    }
                    byte[] bArr5 = f2892c;
                    byte b4 = bArr4[2];
                    if (b4 == 61) {
                        bArr3[i5] = (byte) ((((bArr5[bArr4[0]] & 255) << 18) | ((bArr5[bArr4[1]] & 255) << 12)) >>> 16);
                        i3 = 1;
                    } else {
                        byte b5 = bArr4[3];
                        if (b5 == 61) {
                            int i9 = ((bArr5[bArr4[0]] & 255) << 18) | ((bArr5[bArr4[1]] & 255) << 12) | ((bArr5[b4] & 255) << 6);
                            bArr3[i5] = (byte) (i9 >>> 16);
                            bArr3[i5 + 1] = (byte) (i9 >>> 8);
                            i3 = 2;
                        } else {
                            int i10 = ((bArr5[bArr4[0]] & 255) << 18) | ((bArr5[bArr4[1]] & 255) << 12) | ((bArr5[b4] & 255) << 6) | (bArr5[b5] & 255);
                            bArr3[i5] = (byte) (i10 >> 16);
                            bArr3[i5 + 1] = (byte) (i10 >> 8);
                            bArr3[i2] = (byte) i10;
                            i3 = 3;
                        }
                    }
                    i5 += i3;
                    if (bArr[i7] == 61) {
                        break;
                    }
                    i6 = 0;
                }
            }
        }
        byte[] bArr6 = new byte[i5];
        System.arraycopy(bArr3, 0, bArr6, 0, i5);
        return bArr6;
    }

    public static byte[] a(String str) throws IOException {
        return b(str);
    }

    private static byte[] b(String str) throws Throwable {
        byte[] bytes;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        if (str == null) {
            throw new NullPointerException("Input string was null.");
        }
        try {
            bytes = str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        byte[] bArrB = b(bytes, bytes.length);
        if (bArrB.length >= 4 && 35615 == ((bArrB[0] & 255) | ((bArrB[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) {
            byte[] bArr = new byte[2048];
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            gZIPInputStream = null;
            byteArrayInputStream = null;
            GZIPInputStream gZIPInputStream2 = null;
            ByteArrayInputStream byteArrayInputStream2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArrB);
                    try {
                        gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        while (true) {
                            try {
                                int i = gZIPInputStream.read(bArr);
                                if (i < 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            } catch (IOException e2) {
                                e = e2;
                                byteArrayInputStream2 = byteArrayInputStream;
                                try {
                                    e.printStackTrace();
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    byteArrayInputStream = byteArrayInputStream2;
                                } catch (Throwable th) {
                                    th = th;
                                    byteArrayInputStream = byteArrayInputStream2;
                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                    try {
                                        byteArrayOutputStream2.close();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        gZIPInputStream.close();
                                    } catch (Exception unused4) {
                                    }
                                    try {
                                        byteArrayInputStream.close();
                                        throw th;
                                    } catch (Exception unused5) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                gZIPInputStream2 = gZIPInputStream;
                                gZIPInputStream = gZIPInputStream2;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                byteArrayOutputStream2.close();
                                gZIPInputStream.close();
                                byteArrayInputStream.close();
                                throw th;
                            }
                        }
                        bArrB = byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused6) {
                        }
                    } catch (IOException e3) {
                        e = e3;
                        gZIPInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    gZIPInputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayInputStream = null;
                }
            } catch (IOException e5) {
                e = e5;
                byteArrayOutputStream = null;
                gZIPInputStream = null;
            } catch (Throwable th5) {
                th = th5;
                byteArrayInputStream = null;
                gZIPInputStream = null;
                byteArrayOutputStream2.close();
                gZIPInputStream.close();
                byteArrayInputStream.close();
                throw th;
            }
            try {
                gZIPInputStream.close();
            } catch (Exception unused7) {
            }
            try {
                byteArrayInputStream.close();
            } catch (Exception unused8) {
            }
        }
        return bArrB;
    }

    private static byte[] a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = f2891b;
        int i4 = (i2 > 0 ? (bArr[i] << Ascii.CAN) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << Ascii.CAN) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << Ascii.CAN) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArr3[i4 >>> 18];
            bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i4 >>> 18];
            bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = bArr3[i4 >>> 18];
        bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i4 & 63];
        return bArr2;
    }

    private static String a(byte[] bArr, int i) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have length offset: ".concat(String.valueOf(i)));
        }
        if (i > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", 0, Integer.valueOf(i), Integer.valueOf(bArr.length)));
        }
        int i2 = ((i / 3) * 4) + (i % 3 > 0 ? 4 : 0);
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i - 2) {
            a(bArr, i3, 3, bArr2, i4);
            i3 += 3;
            i4 += 4;
        }
        if (i3 < i) {
            a(bArr, i3, i - i3, bArr2, i4);
            i4 += 4;
        }
        if (i4 <= i2 - 1) {
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            bArr2 = bArr3;
        }
        try {
            return new String(bArr2, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr2);
        }
    }
}
