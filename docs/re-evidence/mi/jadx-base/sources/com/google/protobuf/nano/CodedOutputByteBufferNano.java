package com.google.protobuf.nano;

import androidx.work.WorkInfo;
import defpackage.bmr;
import defpackage.dsf;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes5.dex */
public final class CodedOutputByteBufferNano {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f9722a;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    public CodedOutputByteBufferNano(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static int A(int i, long j) {
        return x(i) + B(j);
    }

    public static int B(long j) {
        return q(j);
    }

    public static int C(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int length = charSequence.length();
        int i4 = i2 + i;
        int i5 = 0;
        while (i5 < length && (i3 = i5 + i) < i4 && (cCharAt = charSequence.charAt(i5)) < 128) {
            bArr[i3] = (byte) cCharAt;
            i5++;
        }
        if (i5 == length) {
            return i + length;
        }
        int i6 = i + i5;
        while (i5 < length) {
            char cCharAt2 = charSequence.charAt(i5);
            if (cCharAt2 < 128 && i6 < i4) {
                bArr[i6] = (byte) cCharAt2;
                i6++;
            } else if (cCharAt2 < 2048 && i6 <= i4 - 2) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt2 >>> 6) | 960);
                i6 += 2;
                bArr[i7] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i6 > i4 - 3) {
                    if (i6 > i4 - 4) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i6);
                    }
                    int i8 = i5 + 1;
                    if (i8 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i8);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i6 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i9 = i6 + 3;
                            bArr[i6 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i6 += 4;
                            bArr[i9] = (byte) ((codePoint & 63) | 128);
                            i5 = i8;
                        } else {
                            i5 = i8;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unpaired surrogate at index ");
                    sb.append(i5 - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
                bArr[i6] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i10 = i6 + 2;
                bArr[i6 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i6 += 3;
                bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
            }
            i5++;
        }
        return i6;
    }

    public static void D(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            E(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(C(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    public static void E(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                byteBuffer.put((byte) cCharAt);
            } else if (cCharAt < 2048) {
                byteBuffer.put((byte) ((cCharAt >>> 6) | 960));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            } else {
                if (cCharAt >= 55296 && 57343 >= cCharAt) {
                    int i2 = i + 1;
                    if (i2 != charSequence.length()) {
                        char cCharAt2 = charSequence.charAt(i2);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            i = i2;
                        } else {
                            i = i2;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unpaired surrogate at index ");
                    sb.append(i - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBuffer.put((byte) ((cCharAt >>> '\f') | 480));
                byteBuffer.put((byte) (((cCharAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            }
            i++;
        }
    }

    public static int F(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long G(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int H(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int I = length;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 2048) {
                I += I(charSequence, i);
                break;
            }
            I += (127 - cCharAt) >>> 31;
            i++;
        }
        if (I >= length) {
            return I;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) I) + 4294967296L));
    }

    public static int I(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new IllegalArgumentException("Unpaired surrogate at index " + i);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    public static CodedOutputByteBufferNano J(byte[] bArr) {
        return K(bArr, 0, bArr.length);
    }

    public static CodedOutputByteBufferNano K(byte[] bArr, int i, int i2) {
        return new CodedOutputByteBufferNano(bArr, i, i2);
    }

    public static int b(int i, boolean z) {
        return x(i) + c(z);
    }

    public static int c(boolean z) {
        return 1;
    }

    public static int d(int i, byte[] bArr) {
        return x(i) + e(bArr);
    }

    public static int e(byte[] bArr) {
        return p(bArr.length) + bArr.length;
    }

    public static int f(int i, double d) {
        return x(i) + g(d);
    }

    public static int g(double d) {
        return 8;
    }

    public static int h(int i, int i2) {
        return x(i) + i(i2);
    }

    public static int i(int i) {
        return p(i);
    }

    public static int j(int i, float f) {
        return x(i) + k(f);
    }

    public static int k(float f) {
        return 4;
    }

    public static int l(int i, int i2) {
        return x(i) + m(i2);
    }

    public static int m(int i) {
        if (i >= 0) {
            return p(i);
        }
        return 10;
    }

    public static int n(int i, dsf dsfVar) {
        return x(i) + o(dsfVar);
    }

    public static int o(dsf dsfVar) {
        int iD = dsfVar.d();
        return p(iD) + iD;
    }

    public static int p(int i) {
        if ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int q(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int r(int i, int i2) {
        return x(i) + s(i2);
    }

    public static int s(int i) {
        return p(F(i));
    }

    public static int t(int i, long j) {
        return x(i) + u(j);
    }

    public static int u(long j) {
        return q(G(j));
    }

    public static int v(int i, String str) {
        return x(i) + w(str);
    }

    public static int w(String str) {
        int iH = H(str);
        return p(iH) + iH;
    }

    public static int x(int i) {
        return p(bmr.d(i, 0));
    }

    public static int y(int i, int i2) {
        return x(i) + z(i2);
    }

    public static int z(int i) {
        return p(i);
    }

    public int L() {
        return this.f9722a.remaining();
    }

    public void M(int i, boolean z) throws IOException {
        o0(i, 0);
        N(z);
    }

    public void N(boolean z) throws IOException {
        b0(z ? 1 : 0);
    }

    public void O(int i, byte[] bArr) throws IOException {
        o0(i, 2);
        P(bArr);
    }

    public void P(byte[] bArr) throws IOException {
        g0(bArr.length);
        c0(bArr);
    }

    public void Q(int i, double d) throws IOException {
        o0(i, 1);
        R(d);
    }

    public void R(double d) throws IOException {
        f0(Double.doubleToLongBits(d));
    }

    public void S(int i, int i2) throws IOException {
        o0(i, 0);
        T(i2);
    }

    public void T(int i) throws IOException {
        g0(i);
    }

    public void U(int i, float f) throws IOException {
        o0(i, 5);
        V(f);
    }

    public void V(float f) throws IOException {
        e0(Float.floatToIntBits(f));
    }

    public void W(int i, int i2) throws IOException {
        o0(i, 0);
        X(i2);
    }

    public void X(int i) throws IOException {
        if (i >= 0) {
            g0(i);
        } else {
            h0(i);
        }
    }

    public void Y(int i, dsf dsfVar) throws IOException {
        o0(i, 2);
        Z(dsfVar);
    }

    public void Z(dsf dsfVar) throws IOException {
        g0(dsfVar.c());
        dsfVar.j(this);
    }

    public void a() {
        if (L() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void a0(byte b2) throws IOException {
        if (!this.f9722a.hasRemaining()) {
            throw new OutOfSpaceException(this.f9722a.position(), this.f9722a.limit());
        }
        this.f9722a.put(b2);
    }

    public void b0(int i) throws IOException {
        a0((byte) i);
    }

    public void c0(byte[] bArr) throws IOException {
        d0(bArr, 0, bArr.length);
    }

    public void d0(byte[] bArr, int i, int i2) throws IOException {
        if (this.f9722a.remaining() < i2) {
            throw new OutOfSpaceException(this.f9722a.position(), this.f9722a.limit());
        }
        this.f9722a.put(bArr, i, i2);
    }

    public void e0(int i) throws IOException {
        if (this.f9722a.remaining() < 4) {
            throw new OutOfSpaceException(this.f9722a.position(), this.f9722a.limit());
        }
        this.f9722a.putInt(i);
    }

    public void f0(long j) throws IOException {
        if (this.f9722a.remaining() < 8) {
            throw new OutOfSpaceException(this.f9722a.position(), this.f9722a.limit());
        }
        this.f9722a.putLong(j);
    }

    public void g0(int i) throws IOException {
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            b0((i & 127) | 128);
            i >>>= 7;
        }
        b0(i);
    }

    public void h0(long j) throws IOException {
        while (((-128) & j) != 0) {
            b0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        b0((int) j);
    }

    public void i0(int i, int i2) throws IOException {
        o0(i, 0);
        j0(i2);
    }

    public void j0(int i) throws IOException {
        g0(F(i));
    }

    public void k0(int i, long j) throws IOException {
        o0(i, 0);
        l0(j);
    }

    public void l0(long j) throws IOException {
        h0(G(j));
    }

    public void m0(int i, String str) throws IOException {
        o0(i, 2);
        n0(str);
    }

    public void n0(String str) throws IOException {
        try {
            int iP = p(str.length());
            if (iP != p(str.length() * 3)) {
                g0(H(str));
                D(str, this.f9722a);
                return;
            }
            int iPosition = this.f9722a.position();
            if (this.f9722a.remaining() < iP) {
                throw new OutOfSpaceException(iPosition + iP, this.f9722a.limit());
            }
            this.f9722a.position(iPosition + iP);
            D(str, this.f9722a);
            int iPosition2 = this.f9722a.position();
            this.f9722a.position(iPosition);
            g0((iPosition2 - iPosition) - iP);
            this.f9722a.position(iPosition2);
        } catch (BufferOverflowException e) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.f9722a.position(), this.f9722a.limit());
            outOfSpaceException.initCause(e);
            throw outOfSpaceException;
        }
    }

    public void o0(int i, int i2) throws IOException {
        g0(bmr.d(i, i2));
    }

    public void p0(int i, int i2) throws IOException {
        o0(i, 0);
        q0(i2);
    }

    public void q0(int i) throws IOException {
        g0(i);
    }

    public void r0(int i, long j) throws IOException {
        o0(i, 0);
        s0(j);
    }

    public void s0(long j) throws IOException {
        h0(j);
    }

    public CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.f9722a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }
}
