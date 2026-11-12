package defpackage;

import com.google.common.base.Ascii;
import com.huawei.devicesdk.util.rsa.BaseCodec;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public class cqv extends BaseCodec {
    private final int f;
    private final byte[] g;
    private final byte[] h;
    private final byte[] i;
    private final int j;
    static final byte[] e = {13, 10};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f31266a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte[] d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f31267b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f31268c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, PublicSuffixDatabase.i, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public cqv() {
        this(0);
    }

    public cqv(boolean z) {
        this(76, e, z);
    }

    public cqv(int i) {
        this(i, e);
    }

    public cqv(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public cqv(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.h = f31268c;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException("myLineSeparator must not contain base64 characters: [" + cqc.c(bArr) + "]");
            }
            if (i > 0) {
                this.j = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.g = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.j = 4;
                this.g = null;
            }
        } else {
            this.j = 4;
            this.g = null;
        }
        this.f = this.j - 1;
        this.i = z ? f31267b : d;
    }

    public static String b(byte[] bArr) {
        return cqc.c(c(bArr, false));
    }

    public static byte[] c(byte[] bArr, boolean z) {
        return c(bArr, z, false);
    }

    public static byte[] c(byte[] bArr, boolean z, boolean z2) {
        return b(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] b(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        cqv cqvVar = z ? new cqv(z2) : new cqv(0, e, z2);
        long encodedLength = cqvVar.getEncodedLength(bArr);
        if (encodedLength > i) {
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i);
        }
        return cqvVar.encode(bArr);
    }

    public static byte[] d(String str) {
        return new cqv().decode(str);
    }

    @Override // com.huawei.devicesdk.util.rsa.BaseCodec
    public void encode(byte[] bArr, int i, int i2, BaseCodec.c cVar) {
        if (cVar == null || cVar.e) {
            return;
        }
        if (i2 < 0) {
            e(cVar);
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            byte[] bArrEnsureBufferSize = ensureBufferSize(this.j, cVar);
            cVar.f5463b = (cVar.f5463b + 1) % 3;
            int i4 = bArr[i];
            if (i4 < 0) {
                i4 += 256;
            }
            cVar.f5462a = (cVar.f5462a << 8) + i4;
            if (cVar.f5463b == 0) {
                int i5 = cVar.j;
                cVar.j = i5 + 1;
                bArrEnsureBufferSize[i5] = this.i[(cVar.f5462a >> 18) & 63];
                int i6 = cVar.j;
                cVar.j = i6 + 1;
                bArrEnsureBufferSize[i6] = this.i[(cVar.f5462a >> 12) & 63];
                int i7 = cVar.j;
                cVar.j = i7 + 1;
                bArrEnsureBufferSize[i7] = this.i[(cVar.f5462a >> 6) & 63];
                int i8 = cVar.j;
                cVar.j = i8 + 1;
                bArrEnsureBufferSize[i8] = this.i[cVar.f5462a & 63];
                cVar.d += 4;
                if (this.lineLength > 0 && this.lineLength <= cVar.d) {
                    System.arraycopy(this.g, 0, bArrEnsureBufferSize, cVar.j, this.g.length);
                    cVar.j += this.g.length;
                    cVar.d = 0;
                }
            }
            i3++;
            i++;
        }
    }

    private void e(BaseCodec.c cVar) {
        cVar.e = true;
        if (cVar.f5463b == 0 && this.lineLength == 0) {
            return;
        }
        int i = cVar.j;
        byte[] bArrEnsureBufferSize = ensureBufferSize(this.j, cVar);
        int i2 = cVar.f5463b;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = cVar.j;
                cVar.j = i3 + 1;
                bArrEnsureBufferSize[i3] = this.i[(cVar.f5462a >> 2) & 63];
                int i4 = cVar.j;
                cVar.j = i4 + 1;
                bArrEnsureBufferSize[i4] = this.i[(cVar.f5462a << 4) & 63];
                if (this.i == d) {
                    int i5 = cVar.j;
                    cVar.j = i5 + 1;
                    bArrEnsureBufferSize[i5] = 61;
                    int i6 = cVar.j;
                    cVar.j = i6 + 1;
                    bArrEnsureBufferSize[i6] = 61;
                }
            } else if (i2 == 2) {
                int i7 = cVar.j;
                cVar.j = i7 + 1;
                bArrEnsureBufferSize[i7] = this.i[(cVar.f5462a >> 10) & 63];
                int i8 = cVar.j;
                cVar.j = i8 + 1;
                bArrEnsureBufferSize[i8] = this.i[(cVar.f5462a >> 4) & 63];
                int i9 = cVar.j;
                cVar.j = i9 + 1;
                bArrEnsureBufferSize[i9] = this.i[(cVar.f5462a << 2) & 63];
                if (this.i == d) {
                    int i10 = cVar.j;
                    cVar.j = i10 + 1;
                    bArrEnsureBufferSize[i10] = 61;
                }
            } else {
                throw new IllegalStateException("Impossible modulus " + cVar.f5463b);
            }
        }
        cVar.d += cVar.j - i;
        if (this.lineLength <= 0 || cVar.d <= 0) {
            return;
        }
        System.arraycopy(this.g, 0, bArrEnsureBufferSize, cVar.j, this.g.length);
        cVar.j += this.g.length;
    }

    @Override // com.huawei.devicesdk.util.rsa.BaseCodec
    public void decode(byte[] bArr, int i, int i2, BaseCodec.c cVar) {
        byte b2;
        if (cVar.e) {
            return;
        }
        if (i2 < 0) {
            cVar.e = true;
        }
        int i3 = 0;
        while (i3 < i2) {
            byte b3 = bArr[i];
            if (b3 == 61) {
                cVar.e = true;
                break;
            }
            if (b3 >= 0) {
                byte[] bArr2 = f31268c;
                if (b3 < bArr2.length && (b2 = bArr2[b3]) >= 0) {
                    cVar.f5463b = (cVar.f5463b + 1) % 4;
                    cVar.f5462a = (cVar.f5462a << 6) + b2;
                    if (cVar.f5463b == 0) {
                        byte[] bArrEnsureBufferSize = ensureBufferSize(this.f, cVar);
                        int i4 = cVar.j;
                        cVar.j = i4 + 1;
                        bArrEnsureBufferSize[i4] = (byte) ((cVar.f5462a >> 16) & 255);
                        int i5 = cVar.j;
                        cVar.j = i5 + 1;
                        bArrEnsureBufferSize[i5] = (byte) ((cVar.f5462a >> 8) & 255);
                        int i6 = cVar.j;
                        cVar.j = i6 + 1;
                        bArrEnsureBufferSize[i6] = (byte) (cVar.f5462a & 255);
                    }
                }
            }
            i3++;
            i++;
        }
        c(cVar);
    }

    private void c(BaseCodec.c cVar) {
        if (!cVar.e || cVar.f5463b == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize = ensureBufferSize(this.f, cVar);
        int i = cVar.f5463b;
        if (i != 1) {
            if (i == 2) {
                cVar.f5462a >>= 4;
                int i2 = cVar.j;
                cVar.j = i2 + 1;
                bArrEnsureBufferSize[i2] = (byte) (cVar.f5462a & 255);
                return;
            }
            if (i == 3) {
                cVar.f5462a >>= 2;
                int i3 = cVar.j;
                cVar.j = i3 + 1;
                bArrEnsureBufferSize[i3] = (byte) ((cVar.f5462a >> 8) & 255);
                int i4 = cVar.j;
                cVar.j = i4 + 1;
                bArrEnsureBufferSize[i4] = (byte) (cVar.f5462a & 255);
                return;
            }
            throw new IllegalStateException("Impossible modulus " + cVar.f5463b);
        }
    }

    @Override // com.huawei.devicesdk.util.rsa.BaseCodec
    public boolean isInAlphabet(byte b2) {
        if (b2 < 0) {
            return false;
        }
        byte[] bArr = this.h;
        return b2 < bArr.length && bArr[b2] != -1;
    }
}
