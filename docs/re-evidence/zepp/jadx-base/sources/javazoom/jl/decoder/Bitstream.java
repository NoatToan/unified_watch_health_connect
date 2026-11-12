package javazoom.jl.decoder;

import androidx.core.internal.view.SupportMenu;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;
import org.cybergarage.upnp.Argument;

/* JADX INFO: loaded from: classes23.dex */
public final class Bitstream implements BitstreamErrors {
    public static byte p = 0;
    public static byte q = 1;
    private static final int r = 433;
    private int b;
    private int d;
    private int e;
    private int f;
    private boolean h;
    private final PushbackInputStream j;
    private boolean o;
    private final int[] a = new int[r];
    private byte[] c = new byte[1732];
    private int g = 0;
    private final int[] i = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071};
    private final Header k = new Header();
    private final byte[] l = new byte[4];
    private Crc16[] m = new Crc16[1];
    private byte[] n = null;

    public Bitstream(InputStream inputStream) {
        this.o = true;
        Objects.requireNonNull(inputStream, Argument.IN);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        a(bufferedInputStream);
        this.o = true;
        this.j = new PushbackInputStream(bufferedInputStream, 1732);
        closeFrame();
    }

    private void a(InputStream inputStream) {
        int iF = -1;
        try {
            inputStream.mark(10);
            iF = f(inputStream);
            this.g = iF;
        } catch (IOException unused) {
        } catch (Throwable th) {
            try {
                inputStream.reset();
            } catch (IOException unused2) {
            }
            throw th;
        }
        try {
            inputStream.reset();
        } catch (IOException unused3) {
        }
        if (iF > 0) {
            try {
                byte[] bArr = new byte[iF];
                this.n = bArr;
                inputStream.read(bArr, 0, bArr.length);
            } catch (IOException unused4) {
            }
        }
    }

    private void b() throws BitstreamException {
        this.k.b(this, this.m);
    }

    private int d(byte[] bArr, int i, int i2) throws BitstreamException {
        int i3 = 0;
        while (i2 > 0) {
            try {
                int i4 = this.j.read(bArr, i, i2);
                if (i4 == -1) {
                    break;
                }
                i3 += i4;
                i += i4;
                i2 -= i4;
            } catch (IOException e) {
                throw newBitstreamException(258, e);
            }
        }
        return i3;
    }

    private int e(byte[] bArr, int i, int i2) throws BitstreamException {
        int i3 = 0;
        while (i2 > 0) {
            try {
                int i4 = this.j.read(bArr, i, i2);
                if (i4 == -1) {
                    while (true) {
                        int i5 = i2 - 1;
                        if (i2 <= 0) {
                            break;
                        }
                        int i6 = i + 1;
                        bArr[i] = 0;
                        i = i6;
                        i2 = i5;
                    }
                } else {
                    i3 += i4;
                    i += i4;
                    i2 -= i4;
                }
            } catch (IOException e) {
                throw newBitstreamException(258, e);
            }
        }
        return i3;
    }

    private int f(InputStream inputStream) throws IOException {
        int i;
        byte[] bArr = new byte[4];
        inputStream.read(bArr, 0, 3);
        if (bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            inputStream.read(bArr, 0, 3);
            byte b = bArr[0];
            byte b2 = bArr[1];
            inputStream.read(bArr, 0, 4);
            i = (bArr[0] << 21) + (bArr[1] << 14) + (bArr[2] << 7) + bArr[3];
        } else {
            i = -10;
        }
        return i + 10;
    }

    private Header g() throws BitstreamException {
        if (this.b == -1) {
            b();
        }
        return this.k;
    }

    public void c() throws BitstreamException {
        byte[] bArr = this.c;
        int i = this.b;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 1;
            int i5 = i2 + 2;
            int i6 = i2 + 3;
            this.a[i3] = ((bArr[i2] << 24) & (-16777216)) | (((i4 < i ? bArr[i4] : (byte) 0) << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | (((i5 < i ? bArr[i5] : (byte) 0) << 8) & 65280) | ((i6 < i ? bArr[i6] : (byte) 0) & 255);
            i2 += 4;
            i3++;
        }
        this.d = 0;
        this.e = 0;
    }

    public void close() throws BitstreamException {
        try {
            this.j.close();
        } catch (IOException e) {
            throw newBitstreamException(258, e);
        }
    }

    public void closeFrame() {
        this.b = -1;
        this.d = -1;
        this.e = -1;
    }

    public InputStream getRawID3v2() {
        if (this.n == null) {
            return null;
        }
        return new ByteArrayInputStream(this.n);
    }

    public int get_bits(int i) {
        int i2 = this.e;
        int i3 = i2 + i;
        if (this.d < 0) {
            this.d = 0;
        }
        if (i3 <= 32) {
            int[] iArr = this.a;
            int i4 = this.d;
            int i5 = (iArr[i4] >>> (32 - i3)) & this.i[i];
            int i6 = i2 + i;
            this.e = i6;
            if (i6 == 32) {
                this.e = 0;
                this.d = i4 + 1;
            }
            return i5;
        }
        int[] iArr2 = this.a;
        int i7 = this.d;
        int i8 = iArr2[i7] & 65535;
        int i9 = i7 + 1;
        this.d = i9;
        int i10 = this.i[i] & (((((iArr2[i9] & SupportMenu.CATEGORY_MASK) >>> 16) & 65535) | ((-65536) & (i8 << 16))) >>> (48 - i3));
        this.e = i3 - 32;
        return i10;
    }

    public int h(int i) throws BitstreamException {
        int iE = e(this.c, 0, i);
        this.b = i;
        this.d = -1;
        this.e = -1;
        return iE;
    }

    public int header_pos() {
        return this.g;
    }

    public void i(int i) {
        this.f = i & (-193);
        this.h = (i & 192) == 192;
    }

    public boolean isSyncCurrentPosition(int i) throws BitstreamException {
        int iD = d(this.l, 0, 4);
        byte[] bArr = this.l;
        int i2 = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr[2] << 8) & 65280) | ((bArr[3] << 0) & 255);
        try {
            this.j.unread(bArr, 0, iD);
        } catch (IOException unused) {
        }
        if (iD == 0) {
            return true;
        }
        if (iD != 4) {
            return false;
        }
        return isSyncMark(i2, i, this.f);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    public boolean isSyncMark(int i, int i2, int i3) {
        boolean z;
        if (i2 != p) {
            if (((-521216) & i) == i3) {
                z = ((i & 192) == 192) == this.h;
            }
        } else if ((i & (-2097152)) == -2097152) {
        }
        if (z) {
            z = ((i >>> 10) & 3) != 3;
        }
        if (z) {
            z = ((i >>> 17) & 3) != 0;
        }
        if (z) {
            return ((i >>> 19) & 3) != 1;
        }
        return z;
    }

    public int j(byte b) throws BitstreamException {
        if (d(this.l, 0, 3) != 3) {
            throw newBitstreamException(260, null);
        }
        byte[] bArr = this.l;
        int i = ((bArr[2] << 0) & 255) | ((bArr[0] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr[1] << 8) & 65280);
        do {
            int i2 = i << 8;
            if (d(this.l, 3, 1) != 1) {
                throw newBitstreamException(260, null);
            }
            i = i2 | (this.l[3] & 255);
        } while (!isSyncMark(i, b, this.f));
        return i;
    }

    public BitstreamException newBitstreamException(int i) {
        return new BitstreamException(i, (Throwable) null);
    }

    public int readBits(int i) {
        return get_bits(i);
    }

    public int readCheckedBits(int i) {
        return get_bits(i);
    }

    public Header readFrame() throws BitstreamException {
        Header headerG;
        try {
            headerG = g();
            try {
                if (!this.o) {
                    return headerG;
                }
                headerG.a(this.c);
                this.o = false;
                return headerG;
            } catch (BitstreamException e) {
                e = e;
                if (e.getErrorCode() != 261) {
                    if (e.getErrorCode() == 260) {
                        return headerG;
                    }
                    throw newBitstreamException(e.getErrorCode(), e);
                }
                try {
                    closeFrame();
                    return g();
                } catch (BitstreamException e2) {
                    if (e2.getErrorCode() == 260) {
                        return headerG;
                    }
                    throw newBitstreamException(e2.getErrorCode(), e2);
                }
            }
        } catch (BitstreamException e3) {
            e = e3;
            headerG = null;
        }
    }

    public void unreadFrame() throws BitstreamException {
        int i;
        if (this.d == -1 && this.e == -1 && (i = this.b) > 0) {
            try {
                this.j.unread(this.c, 0, i);
            } catch (IOException unused) {
                throw newBitstreamException(258);
            }
        }
    }

    public BitstreamException newBitstreamException(int i, Throwable th) {
        return new BitstreamException(i, th);
    }
}
