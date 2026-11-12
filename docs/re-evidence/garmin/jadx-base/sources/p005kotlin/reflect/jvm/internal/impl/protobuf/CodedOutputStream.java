package p005kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.exoplayer2.v;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.lang3.e;
import z33.c;
import z33.n;

/* JADX INFO: loaded from: classes3.dex */
public final class CodedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f105931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f105933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OutputStream f105934d;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(byte[] bArr, int i14, int i15) {
        this.f105934d = null;
        this.f105931a = bArr;
        this.f105933c = i14;
        this.f105932b = i14 + i15;
    }

    public static int a(int i14, int i15) {
        return c(i15) + h(i14);
    }

    public static int b(int i14, int i15) {
        return c(i15) + h(i14);
    }

    public static int c(int i14) {
        if (i14 >= 0) {
            return f(i14);
        }
        return 10;
    }

    public static int d(int i14, n nVar) {
        return e(nVar) + h(i14);
    }

    public static int e(n nVar) {
        int serializedSize = nVar.getSerializedSize();
        return f(serializedSize) + serializedSize;
    }

    public static int f(int i14) {
        if ((i14 & (-128)) == 0) {
            return 1;
        }
        if ((i14 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i14) == 0) {
            return 3;
        }
        return (i14 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g(long j8) {
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (((-16384) & j8) == 0) {
            return 2;
        }
        if (((-2097152) & j8) == 0) {
            return 3;
        }
        if (((-268435456) & j8) == 0) {
            return 4;
        }
        if (((-34359738368L) & j8) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j8) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j8) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j8) == 0) {
            return 8;
        }
        return (j8 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int h(int i14) {
        return f(i14 << 3);
    }

    public static CodedOutputStream j(OutputStream outputStream, int i14) {
        return new CodedOutputStream(outputStream, new byte[i14]);
    }

    public final void i() throws IOException {
        if (this.f105934d != null) {
            k();
        }
    }

    public final void k() throws IOException {
        OutputStream outputStream = this.f105934d;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f105931a, 0, this.f105933c);
        this.f105933c = 0;
    }

    public final void l(int i14, int i15) throws IOException {
        x(i14, 0);
        n(i15);
    }

    public final void m(int i14, int i15) throws IOException {
        x(i14, 0);
        n(i15);
    }

    public final void n(int i14) throws IOException {
        if (i14 >= 0) {
            v(i14);
        } else {
            w(i14);
        }
    }

    public final void o(int i14, n nVar) throws IOException {
        x(i14, 2);
        p(nVar);
    }

    public final void p(n nVar) throws IOException {
        v(nVar.getSerializedSize());
        nVar.a(this);
    }

    public final void q(int i14) throws IOException {
        byte b14 = (byte) i14;
        if (this.f105933c == this.f105932b) {
            k();
        }
        int i15 = this.f105933c;
        this.f105933c = i15 + 1;
        this.f105931a[i15] = b14;
    }

    public final void r(c cVar) throws IOException {
        int size = cVar.size();
        int i14 = this.f105933c;
        int i15 = this.f105932b;
        int i16 = i15 - i14;
        byte[] bArr = this.f105931a;
        if (i16 >= size) {
            cVar.c(bArr, 0, i14, size);
            this.f105933c += size;
            return;
        }
        cVar.c(bArr, 0, i14, i16);
        int i17 = size - i16;
        this.f105933c = i15;
        k();
        if (i17 <= i15) {
            cVar.c(bArr, i16, 0, i17);
            this.f105933c = i17;
            return;
        }
        if (i16 < 0) {
            e.v(v.b(30, i16, "Source offset < 0: "));
            return;
        }
        if (i17 < 0) {
            e.v(v.b(23, i17, "Length < 0: "));
            return;
        }
        int i18 = i16 + i17;
        if (i18 > cVar.size()) {
            e.v(v.b(39, i18, "Source end offset exceeded: "));
        } else if (i17 > 0) {
            cVar.p(this.f105934d, i16, i17);
        }
    }

    public final void s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i14 = this.f105933c;
        int i15 = this.f105932b;
        int i16 = i15 - i14;
        byte[] bArr2 = this.f105931a;
        if (i16 >= length) {
            System.arraycopy(bArr, 0, bArr2, i14, length);
            this.f105933c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i14, i16);
        int i17 = length - i16;
        this.f105933c = i15;
        k();
        if (i17 > i15) {
            this.f105934d.write(bArr, i16, i17);
        } else {
            System.arraycopy(bArr, i16, bArr2, 0, i17);
            this.f105933c = i17;
        }
    }

    public final void t(int i14) throws IOException {
        q(i14 & 255);
        q((i14 >> 8) & 255);
        q((i14 >> 16) & 255);
        q((i14 >> 24) & 255);
    }

    public final void u(long j8) throws IOException {
        q(((int) j8) & 255);
        q(((int) (j8 >> 8)) & 255);
        q(((int) (j8 >> 16)) & 255);
        q(((int) (j8 >> 24)) & 255);
        q(((int) (j8 >> 32)) & 255);
        q(((int) (j8 >> 40)) & 255);
        q(((int) (j8 >> 48)) & 255);
        q(((int) (j8 >> 56)) & 255);
    }

    public final void v(int i14) throws IOException {
        while ((i14 & (-128)) != 0) {
            q((i14 & 127) | 128);
            i14 >>>= 7;
        }
        q(i14);
    }

    public final void w(long j8) throws IOException {
        while (((-128) & j8) != 0) {
            q((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        q((int) j8);
    }

    public final void x(int i14, int i15) throws IOException {
        v((i14 << 3) | i15);
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f105934d = outputStream;
        this.f105931a = bArr;
        this.f105933c = 0;
        this.f105932b = bArr.length;
    }
}
