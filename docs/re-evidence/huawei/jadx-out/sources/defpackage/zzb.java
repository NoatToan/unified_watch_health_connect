package defpackage;

import androidx.core.view.MotionEventCompat;
import com.google.common.base.Ascii;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okio.Utf8;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f54800a = aaex.a((Class<?>) zzb.class);
    private static final byte[] d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f54802c = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, -9, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, PublicSuffixDatabase.i, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] g = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] h = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, Utf8.REPLACEMENT_BYTE, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, PublicSuffixDatabase.i, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f54801b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, PublicSuffixDatabase.i, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, Utf8.REPLACEMENT_BYTE, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    private static final byte[] a(int i) {
        if ((i & 16) == 16) {
            return g;
        }
        if ((i & 32) == 32) {
            return e;
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] c(int i) {
        if ((i & 16) == 16) {
            return h;
        }
        if ((i & 32) == 32) {
            return f54801b;
        }
        return f54802c;
    }

    private zzb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] c(byte[] bArr, byte[] bArr2, int i, int i2) {
        c(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    private static byte[] c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArrA = a(i4);
        int i5 = (i2 > 0 ? (bArr[i] << Ascii.CAN) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << Ascii.CAN) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << Ascii.CAN) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArrA[i5 >>> 18];
            bArr2[i3 + 1] = bArrA[(i5 >>> 12) & 63];
            if ((i4 & 64) == 0) {
                bArr2[i3 + 2] = 61;
                bArr2[i3 + 3] = 61;
            }
        } else if (i2 == 2) {
            bArr2[i3] = bArrA[i5 >>> 18];
            bArr2[i3 + 1] = bArrA[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = bArrA[(i5 >>> 6) & 63];
            if ((i4 & 64) == 0) {
                bArr2[i3 + 3] = 61;
                return bArr2;
            }
        } else if (i2 == 3) {
            bArr2[i3] = bArrA[i5 >>> 18];
            bArr2[i3 + 1] = bArrA[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = bArrA[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = bArrA[i5 & 63];
            return bArr2;
        }
        return bArr2;
    }

    public static String e(byte[] bArr) {
        try {
            return e(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String b(byte[] bArr, int i) throws IOException {
        return e(bArr, 0, bArr.length, i);
    }

    public static String e(byte[] bArr, int i, int i2, int i3) throws Throwable {
        byte[] bArrA = a(bArr, i, i2, i3);
        try {
            return new String(bArrA, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] a(byte[] bArr, int i, int i2, int i3) throws Throwable {
        int i4;
        b bVar;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i2);
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        }
        if ((i3 & 2) != 0) {
            GZIPOutputStream gZIPOutputStream2 = null;
            gZIPOutputStream2 = null;
            b bVar2 = null;
            gZIPOutputStream2 = null;
            gZIPOutputStream2 = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    b bVar3 = new b(byteArrayOutputStream2, i3 | 1);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bVar3);
                        try {
                            gZIPOutputStream.write(bArr, i, i2);
                            gZIPOutputStream.close();
                            try {
                                gZIPOutputStream.close();
                            } catch (Exception unused) {
                            }
                            try {
                                bVar3.close();
                            } catch (Exception unused2) {
                            }
                            try {
                                byteArrayOutputStream2.close();
                            } catch (Exception unused3) {
                            }
                            return byteArrayOutputStream2.toByteArray();
                        } catch (IOException e2) {
                            e = e2;
                            bVar2 = bVar3;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            bVar = bVar2;
                            gZIPOutputStream2 = gZIPOutputStream;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    gZIPOutputStream2.close();
                                } catch (Exception unused4) {
                                }
                                try {
                                    bVar.close();
                                } catch (Exception unused5) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (Exception unused6) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPOutputStream2 = gZIPOutputStream;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            bVar = bVar3;
                            gZIPOutputStream2.close();
                            bVar.close();
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        gZIPOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    gZIPOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    bVar = null;
                }
            } catch (IOException e5) {
                e = e5;
                bVar = null;
                byteArrayOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                bVar = null;
                byteArrayOutputStream = null;
            }
        } else {
            Object[] objArr = (i3 & 8) != 0;
            int i5 = (i2 / 3) * 4;
            int i6 = i2 % 3;
            if (((i3 & 64) == 0) == true) {
                i4 = i5 + (i6 > 0 ? 4 : 0);
            } else {
                i4 = i5 + (i6 > 0 ? i6 + 1 : 0);
            }
            if (objArr != false) {
                i4 += i4 / 76;
            }
            int i7 = i4;
            byte[] bArr2 = new byte[i7];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < i2 - 2) {
                c(bArr, i8 + i, 3, bArr2, i9, i3);
                int i11 = i10 + 4;
                if (!objArr == true || i11 < 76) {
                    i10 = i11;
                } else {
                    bArr2[i9 + 4] = 10;
                    i9++;
                    i10 = 0;
                }
                i8 += 3;
                i9 += 4;
            }
            if (i8 < i2) {
                c(bArr, i8 + i, i2 - i8, bArr2, i9, i3);
                i9 += 4;
            }
            int i12 = i9;
            if (i12 > i7 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i12];
            System.arraycopy(bArr2, 0, bArr3, 0, i12);
            return bArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new NullPointerException("Destination array was null.");
        }
        if (i < 0 || (i4 = i + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i)));
        }
        if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i2)));
        }
        byte[] bArrC = c(i3);
        byte b2 = bArr[i + 2];
        if (b2 == 61) {
            bArr2[i2] = (byte) ((((bArrC[bArr[i + 1]] & 255) << 12) | ((bArrC[bArr[i]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b3 = bArr[i4];
        if (b3 == 61) {
            int i6 = ((bArrC[bArr[i + 1]] & 255) << 12) | ((bArrC[bArr[i]] & 255) << 18) | ((bArrC[b2] & 255) << 6);
            bArr2[i2] = (byte) (i6 >>> 16);
            bArr2[i2 + 1] = (byte) (i6 >>> 8);
            return 2;
        }
        int i7 = ((bArrC[bArr[i + 1]] & 255) << 12) | ((bArrC[bArr[i]] & 255) << 18) | ((bArrC[b2] & 255) << 6) | (bArrC[b3] & 255);
        bArr2[i2] = (byte) (i7 >> 16);
        bArr2[i2 + 1] = (byte) (i7 >> 8);
        bArr2[i5] = (byte) i7;
        return 3;
    }

    public static byte[] d(byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4;
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (i < 0 || (i4 = i + i2) > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i2 == 0) {
            return zzg.f54809a;
        }
        if (i2 < 4) {
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i2);
        }
        byte[] bArrC = c(i3);
        byte[] bArr2 = new byte[(i2 * 3) / 4];
        byte[] bArr3 = new byte[4];
        int iA = 0;
        int i5 = 0;
        while (i < i4) {
            byte b2 = bArr[i];
            byte b3 = bArrC[b2 & 255];
            if (b3 < -5) {
                throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(b2 & 255), Integer.valueOf(i)));
            }
            if (b3 >= -1) {
                int i6 = i5 + 1;
                bArr3[i5] = b2;
                if (i6 > 3) {
                    iA += a(bArr3, 0, bArr2, iA, i3);
                    if (bArr[i] == 61) {
                        break;
                    }
                    i5 = 0;
                } else {
                    i5 = i6;
                }
            }
            i++;
        }
        byte[] bArr4 = new byte[iA];
        System.arraycopy(bArr2, 0, bArr4, 0, iA);
        return bArr4;
    }

    public static byte[] b(String str) throws IOException {
        return a(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] a(String str, int i) throws Throwable {
        byte[] bytes;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPInputStream gZIPInputStream2;
        ByteArrayInputStream byteArrayInputStream2;
        if (str == null) {
            throw new NullPointerException("Input string was null.");
        }
        try {
            bytes = str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        byte[] bArrD = d(bytes, 0, bytes.length, i);
        Object[] objArr = (i & 4) != 0;
        if (bArrD != null && bArrD.length >= 4 && objArr == false && 35615 == ((bArrD[0] & 255) | ((bArrD[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) {
            byte[] bArr = new byte[2048];
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            gZIPInputStream = null;
            ByteArrayInputStream byteArrayInputStream3 = null;
            GZIPInputStream gZIPInputStream3 = null;
            GZIPInputStream gZIPInputStream4 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayInputStream2 = new ByteArrayInputStream(bArrD);
                    try {
                        gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream2);
                        while (true) {
                            try {
                                int i2 = gZIPInputStream2.read(bArr);
                                if (i2 < 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                            } catch (IOException e2) {
                                e = e2;
                                byteArrayInputStream3 = byteArrayInputStream2;
                                byteArrayInputStream = byteArrayInputStream3;
                                gZIPInputStream4 = gZIPInputStream2;
                                try {
                                    f54800a.info(e.getMessage(), (Throwable) e);
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    gZIPInputStream2 = gZIPInputStream4;
                                    byteArrayInputStream2 = byteArrayInputStream;
                                } catch (Throwable th) {
                                    th = th;
                                    gZIPInputStream = gZIPInputStream4;
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
                                gZIPInputStream3 = gZIPInputStream2;
                                gZIPInputStream = gZIPInputStream3;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                byteArrayInputStream = byteArrayInputStream2;
                                byteArrayOutputStream2.close();
                                gZIPInputStream.close();
                                byteArrayInputStream.close();
                                throw th;
                            }
                        }
                        bArrD = byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused6) {
                        }
                    } catch (IOException e3) {
                        e = e3;
                        gZIPInputStream2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    gZIPInputStream2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayInputStream2 = null;
                }
            } catch (IOException e5) {
                e = e5;
                byteArrayInputStream = null;
                byteArrayOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                gZIPInputStream = null;
                byteArrayInputStream = null;
            }
            try {
                gZIPInputStream2.close();
            } catch (Exception unused7) {
            }
            try {
                byteArrayInputStream2.close();
            } catch (Exception unused8) {
            }
        }
        return bArrD;
    }

    public static class b extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f54803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f54804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f54805c;
        private byte[] d;
        private boolean e;
        private int f;
        private int g;
        private boolean h;
        private boolean i;
        private int j;

        public b(OutputStream outputStream, int i) {
            super(outputStream);
            this.e = (i & 8) != 0;
            boolean z = (i & 1) != 0;
            this.i = z;
            int i2 = z ? 3 : 4;
            this.f54805c = i2;
            this.f54804b = new byte[i2];
            this.g = 0;
            this.f = 0;
            this.h = false;
            this.f54803a = new byte[4];
            this.j = i;
            this.d = zzb.c(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            if (this.h) {
                this.out.write(i);
                return;
            }
            if (this.i) {
                byte[] bArr = this.f54804b;
                int i2 = this.g;
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) i;
                if (i3 >= this.f54805c) {
                    this.out.write(zzb.c(this.f54803a, this.f54804b, this.f54805c, this.j));
                    int i4 = this.f + 4;
                    this.f = i4;
                    if (this.e && i4 >= 76) {
                        this.out.write(10);
                        this.f = 0;
                    }
                    this.g = 0;
                    return;
                }
                return;
            }
            byte b2 = this.d[i & 127];
            if (b2 <= -5) {
                if (b2 != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
                return;
            }
            byte[] bArr2 = this.f54804b;
            int i5 = this.g;
            int i6 = i5 + 1;
            this.g = i6;
            bArr2[i5] = (byte) i;
            if (i6 >= this.f54805c) {
                this.out.write(this.f54803a, 0, zzb.a(bArr2, 0, this.f54803a, 0, this.j));
                this.g = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.h) {
                this.out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }

        public void c() throws IOException {
            if (this.g > 0) {
                if (this.i) {
                    this.out.write(zzb.c(this.f54803a, this.f54804b, this.g, this.j));
                    this.g = 0;
                    return;
                }
                throw new IOException("Base64 input not properly padded.");
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c();
            super.close();
            this.f54804b = null;
            this.out = null;
        }
    }
}
