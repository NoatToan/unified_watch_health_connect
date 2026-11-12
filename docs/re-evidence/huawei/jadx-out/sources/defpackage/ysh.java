package defpackage;

import com.iabtcf.utils.FieldDefs;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes20.dex */
public class ysh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f53805c;
    private int e;
    private final InputStream d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ysj f53804b = new ysj(this);

    private byte a(byte b2, int i, int i2) {
        if (i2 == 0) {
            return (byte) 0;
        }
        return (byte) ((b2 >>> ((8 - i2) - i)) & ((1 << i2) - 1));
    }

    private byte b(byte b2, int i, int i2) {
        return i2 == 0 ? b2 : (byte) ((b2 & ((1 << i2) - 1)) << i);
    }

    public ysh(byte[] bArr) {
        this.f53805c = bArr;
        this.e = bArr.length;
    }

    private void h(int i) {
        byte[] bArr = this.f53805c;
        if (bArr.length >= i) {
            return;
        }
        byte[] bArr2 = new byte[i * 2];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f53805c = bArr2;
    }

    private boolean e(int i, int i2) {
        int i3 = i + i2;
        int i4 = this.e;
        int i5 = i3 - i4;
        if (i3 <= i4) {
            return true;
        }
        if (this.d == null) {
            throw new ysa(String.format("read %d bytes at index %d out of bounds for buffer length %d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f53805c.length)));
        }
        h(i3);
        while (i5 > 0) {
            try {
                int i6 = this.d.read(this.f53805c, this.e, i5);
                if (i6 == -1) {
                    return false;
                }
                this.e += i6;
                i5 -= i6;
            } catch (IOException e) {
                throw new ysa(String.format("error decoding at offset %d length %d", Integer.valueOf(i), Integer.valueOf(i2)), e);
            }
        }
        return true;
    }

    public String j(int i) {
        return String.valueOf(new char[]{(char) (f(i) + 65), (char) (f(i + 6) + 65)});
    }

    public String f(FieldDefs fieldDefs) {
        return j(fieldDefs.getOffset(this));
    }

    public boolean a(FieldDefs fieldDefs) {
        return b(fieldDefs.getOffset(this));
    }

    public boolean b(int i) {
        int i2 = i >>> 3;
        e(i2, 1);
        return ((this.f53805c[i2] >>> (7 - (i % 8))) & 1) == 1;
    }

    public byte d(int i) {
        return a(i, 2);
    }

    public byte c(FieldDefs fieldDefs) {
        return a(fieldDefs.getOffset(this));
    }

    public byte a(int i) {
        return a(i, 3);
    }

    public byte g(FieldDefs fieldDefs) {
        return f(fieldDefs.getOffset(this));
    }

    public byte f(int i) {
        int i2 = i >>> 3;
        int i3 = i % 8;
        int i4 = 8 - i3;
        if (i4 < 6) {
            e(i2, 2);
            int i5 = 6 - i4;
            return (byte) (b(this.f53805c[i2], i5, i4) | a(this.f53805c[i2 + 1], 0, i5));
        }
        e(i2, 1);
        return a(this.f53805c[i2], i3, 6);
    }

    private byte a(int i, int i2) {
        int i3 = i >>> 3;
        int i4 = i % 8;
        int i5 = 8 - i4;
        if (i5 < i2) {
            e(i3, 2);
            int i6 = i2 - i5;
            return (byte) (b(this.f53805c[i3], i6, i5) | a(this.f53805c[i3 + 1], 0, i6));
        }
        e(i3, 1);
        return a(this.f53805c[i3], i4, i2);
    }

    public int d(FieldDefs fieldDefs) {
        return e(fieldDefs.getOffset(this));
    }

    public int e(int i) {
        int iB;
        byte bA;
        int i2 = i >>> 3;
        int i3 = i % 8;
        int i4 = 8 - i3;
        if (i4 < 4) {
            e(i2, 3);
            byte b2 = b(this.f53805c[i2], i3, i4);
            byte[] bArr = this.f53805c;
            int i5 = i3 - 4;
            iB = ((b2 & 255) << 4) | ((bArr[i2 + 1] & 255) << i5);
            bA = a(bArr[i2 + 2], 0, i5);
        } else {
            e(i2, 2);
            iB = (b(this.f53805c[i2], i3, i4) & 255) << 4;
            bA = a(this.f53805c[i2 + 1], 0, i3 + 4);
        }
        return (bA & 255) | iB;
    }

    public int e(FieldDefs fieldDefs) {
        return c(fieldDefs.getOffset(this));
    }

    public int c(int i) {
        int i2;
        byte bA;
        int i3 = i >>> 3;
        int i4 = i % 8;
        int i5 = 8 - i4;
        if (i5 < 8) {
            e(i3, 3);
            byte b2 = b(this.f53805c[i3], i4, i5);
            byte[] bArr = this.f53805c;
            i2 = ((b2 & 255) << 8) | ((bArr[i3 + 1] & 255) << i4);
            bA = a(bArr[i3 + 2], 0, i4);
        } else {
            e(i3, 2);
            byte[] bArr2 = this.f53805c;
            i2 = (bArr2[i3] & 255) << 8;
            bA = bArr2[i3 + 1];
        }
        return (bA & 255) | i2;
    }

    public long b(FieldDefs fieldDefs) {
        return g(fieldDefs.getOffset(this));
    }

    public long g(int i) {
        int i2 = i >>> 3;
        int i3 = i % 8;
        int i4 = 8 - i3;
        if (i4 < 4) {
            e(i2, 6);
            long jB = b(this.f53805c[i2], i3, i4);
            byte[] bArr = this.f53805c;
            long j = bArr[i2 + 1];
            long j2 = bArr[i2 + 2];
            int i5 = i3 - 4;
            return (((long) a(bArr[i2 + 5], 0, i5)) & 255) | ((bArr[i2 + 3] & 255) << (i3 + 4)) | ((jB & 255) << 28) | ((j & 255) << (i3 + 20)) | ((j2 & 255) << (i3 + 12)) | ((bArr[i2 + 4] & 255) << i5);
        }
        e(i2, 5);
        long jB2 = b(this.f53805c[i2], i3, i4);
        byte[] bArr2 = this.f53805c;
        long j3 = bArr2[i2 + 1];
        int i6 = i3 + 4;
        return ((bArr2[i2 + 2] & 255) << (i3 + 12)) | ((jB2 & 255) << 28) | ((j3 & 255) << (i3 + 20)) | ((bArr2[i2 + 3] & 255) << i6) | (((long) a(bArr2[i2 + 4], 0, i6)) & 255);
    }
}
