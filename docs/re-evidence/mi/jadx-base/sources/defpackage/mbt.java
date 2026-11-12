package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class mbt {
    public static final Charset o = Charset.forName("UTF-8");
    public static final /* synthetic */ boolean p = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f25985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25986b;
    public int h;
    public ByteBuffer n;
    public int c = 1;
    public int[] d = null;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public int[] i = new int[16];
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25987k = 0;
    public boolean l = false;
    public CharsetEncoder m = o.newEncoder();

    public mbt(ByteBuffer byteBuffer) {
        c(byteBuffer);
    }

    public static ByteBuffer B(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferAllocate;
    }

    public static ByteBuffer o(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i = iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferB = B(i);
        byteBufferB.position(i - iCapacity);
        byteBufferB.put(byteBuffer);
        return byteBufferB;
    }

    public final int A() {
        return this.f25985a.capacity() - this.f25986b;
    }

    public final byte[] C(int i, int i2) {
        D();
        byte[] bArr = new byte[i2];
        this.f25985a.position(i);
        this.f25985a.get(bArr);
        return bArr;
    }

    public final void D() {
        if (!this.g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public final void E(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.f25985a;
            int i3 = this.f25986b - 1;
            this.f25986b = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    public final void F() {
        if (this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public final void G(int i) {
        ByteBuffer byteBuffer = this.f25985a;
        int i2 = this.f25986b - 4;
        this.f25986b = i2;
        byteBuffer.putInt(i2, i);
    }

    public final void H(int i) {
        x(4, 0);
        G(i);
    }

    public final void I(int i) {
        this.d[i] = A();
    }

    public final int a() {
        if (!this.f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        G(this.f25987k);
        return A();
    }

    public int b(CharSequence charSequence) {
        int length = (int) (charSequence.length() * this.m.maxBytesPerChar());
        ByteBuffer byteBuffer = this.n;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            this.n = ByteBuffer.allocate(Math.max(128, length));
        }
        this.n.clear();
        CoderResult coderResultEncode = this.m.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), this.n, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e) {
                throw new Error(e);
            }
        }
        this.n.flip();
        return v(this.n);
    }

    public final mbt c(ByteBuffer byteBuffer) {
        this.f25985a = byteBuffer;
        byteBuffer.clear();
        this.f25985a.order(ByteOrder.LITTLE_ENDIAN);
        this.c = 1;
        this.f25986b = this.f25985a.capacity();
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = 0;
        this.j = 0;
        this.f25987k = 0;
        return this;
    }

    public final void d(byte b2) {
        x(1, 0);
        p(b2);
    }

    public final void e(int i) {
        x(4, 0);
        if (!p && i > A()) {
            throw new AssertionError();
        }
        G((A() - i) + 4);
    }

    public final void f(int i, byte b2) {
        if (this.l || b2 != 0) {
            d(b2);
            I(i);
        }
    }

    public final void g(int i, int i2) {
        if (this.l || i2 != 0) {
            H(i2);
            I(i);
        }
    }

    public final void h(int i, int i2, int i3) {
        F();
        this.f25987k = i2;
        int i4 = i * i2;
        x(4, i4);
        x(i3, i4);
        this.f = true;
    }

    public final void i(int i, long j) {
        if (this.l || j != 0) {
            s(j);
            I(i);
        }
    }

    public final void j(int i, short s) {
        if (this.l || s != 0) {
            t(s);
            I(i);
        }
    }

    public final void k(long j) {
        ByteBuffer byteBuffer = this.f25985a;
        int i = this.f25986b - 8;
        this.f25986b = i;
        byteBuffer.putLong(i, j);
    }

    public final void l(short s) {
        ByteBuffer byteBuffer = this.f25985a;
        int i = this.f25986b - 2;
        this.f25986b = i;
        byteBuffer.putShort(i, s);
    }

    public final void m(boolean z) {
        if (this.l || z) {
            y(z);
            I(0);
        }
    }

    public final int n() {
        int i;
        if (this.d == null || !this.f) {
            throw new AssertionError("FlatBuffers: endObject called without startObject");
        }
        H(0);
        int iA = A();
        for (int i2 = this.e - 1; i2 >= 0; i2--) {
            int i3 = this.d[i2];
            t((short) (i3 != 0 ? iA - i3 : 0));
        }
        t((short) (iA - this.h));
        t((short) ((this.e + 2) * 2));
        int i4 = 0;
        loop1: while (true) {
            if (i4 >= this.j) {
                i = 0;
                break;
            }
            int iCapacity = this.f25985a.capacity() - this.i[i4];
            int i5 = this.f25986b;
            short s = this.f25985a.getShort(iCapacity);
            if (s == this.f25985a.getShort(i5)) {
                int i6 = 2;
                while (true) {
                    if (i6 >= s) {
                        i = this.i[i4];
                        break loop1;
                    }
                    if (this.f25985a.getShort(iCapacity + i6) != this.f25985a.getShort(i5 + i6)) {
                        break;
                    }
                    i6 += 2;
                }
            }
            i4++;
        }
        if (i != 0) {
            int iCapacity2 = this.f25985a.capacity() - iA;
            this.f25986b = iCapacity2;
            this.f25985a.putInt(iCapacity2, i - iA);
        } else {
            int i7 = this.j;
            int[] iArr = this.i;
            if (i7 == iArr.length) {
                this.i = Arrays.copyOf(iArr, i7 * 2);
            }
            int[] iArr2 = this.i;
            int i8 = this.j;
            this.j = i8 + 1;
            iArr2[i8] = A();
            ByteBuffer byteBuffer = this.f25985a;
            byteBuffer.putInt(byteBuffer.capacity() - iA, A() - iA);
        }
        this.f = false;
        return iA;
    }

    public final void p(byte b2) {
        ByteBuffer byteBuffer = this.f25985a;
        int i = this.f25986b - 1;
        this.f25986b = i;
        byteBuffer.put(i, b2);
    }

    public final void q(int i) {
        F();
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i) {
            this.d = new int[i];
        }
        this.e = i;
        Arrays.fill(this.d, 0, i, 0);
        this.f = true;
        this.h = A();
    }

    public final void r(int i, int i2) {
        if (this.l || i2 != 0) {
            e(i2);
            I(i);
        }
    }

    public final void s(long j) {
        x(8, 0);
        k(j);
    }

    public final void t(short s) {
        x(2, 0);
        l(s);
    }

    public final void u(boolean z) {
        ByteBuffer byteBuffer = this.f25985a;
        int i = this.f25986b - 1;
        this.f25986b = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public final int v(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        d((byte) 0);
        h(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f25985a;
        int i = this.f25986b - iRemaining;
        this.f25986b = i;
        byteBuffer2.position(i);
        this.f25985a.put(byteBuffer);
        return a();
    }

    public final void w(int i) {
        x(this.c, 4);
        e(i);
        this.f25985a.position(this.f25986b);
        this.g = true;
    }

    public final void x(int i, int i2) {
        if (i > this.c) {
            this.c = i;
        }
        int i3 = ((~((this.f25985a.capacity() - this.f25986b) + i2)) + 1) & (i - 1);
        while (this.f25986b < i3 + i + i2) {
            int iCapacity = this.f25985a.capacity();
            ByteBuffer byteBufferO = o(this.f25985a);
            this.f25985a = byteBufferO;
            this.f25986b += byteBufferO.capacity() - iCapacity;
        }
        E(i3);
    }

    public final void y(boolean z) {
        x(1, 0);
        u(z);
    }

    public final byte[] z() {
        return C(this.f25986b, this.f25985a.capacity() - this.f25986b);
    }
}
