package com.google.crypto.tink.shaded.protobuf;

import androidx.work.WorkInfo;
import defpackage.ibq;
import defpackage.o73;
import defpackage.u91;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CodedOutputStream extends o73 {
    public static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean d = ibq.G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f9354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9355b;

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static class b extends CodedOutputStream {
        public final byte[] e;
        public final int f;
        public final int g;
        public int h;

        public b(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.e = bArr;
            this.f = i;
            this.h = i;
            this.g = i3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void B0(int i, b0 b0Var, k0 k0Var) throws IOException {
            N0(i, 2);
            P0(((com.google.crypto.tink.shaded.protobuf.a) b0Var).c(k0Var));
            k0Var.h(b0Var, this.f9354a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void C0(int i, b0 b0Var) throws IOException {
            N0(1, 3);
            O0(2, i);
            V0(3, b0Var);
            N0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void D0(int i, ByteString byteString) throws IOException {
            N0(1, 3);
            O0(2, i);
            k0(3, byteString);
            N0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void M0(int i, String str) throws IOException {
            N0(i, 2);
            X0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void N0(int i, int i2) throws IOException {
            P0(WireFormat.c(i, i2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void O0(int i, int i2) throws IOException {
            N0(i, 0);
            P0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void P0(int i) throws IOException {
            if (!CodedOutputStream.d || u91.c() || g0() < 5) {
                while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    try {
                        byte[] bArr = this.e;
                        int i2 = this.h;
                        this.h = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                    }
                }
                byte[] bArr2 = this.e;
                int i3 = this.h;
                this.h = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr3 = this.e;
                int i4 = this.h;
                this.h = i4 + 1;
                ibq.M(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.e;
            int i5 = this.h;
            this.h = i5 + 1;
            ibq.M(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr5 = this.e;
                int i7 = this.h;
                this.h = i7 + 1;
                ibq.M(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.e;
            int i8 = this.h;
            this.h = i8 + 1;
            ibq.M(bArr6, i8, (byte) (i6 | 128));
            int i9 = i >>> 14;
            if ((i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr7 = this.e;
                int i10 = this.h;
                this.h = i10 + 1;
                ibq.M(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.e;
            int i11 = this.h;
            this.h = i11 + 1;
            ibq.M(bArr8, i11, (byte) (i9 | 128));
            int i12 = i >>> 21;
            if ((i12 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr9 = this.e;
                int i13 = this.h;
                this.h = i13 + 1;
                ibq.M(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.e;
            int i14 = this.h;
            this.h = i14 + 1;
            ibq.M(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.e;
            int i15 = this.h;
            this.h = i15 + 1;
            ibq.M(bArr11, i15, (byte) (i >>> 28));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void Q0(int i, long j) throws IOException {
            N0(i, 0);
            R0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void R0(long j) throws IOException {
            if (CodedOutputStream.d && g0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    ibq.M(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = i2 + 1;
                ibq.M(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.e;
                    int i3 = this.h;
                    this.h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr4 = this.e;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        public final void S0(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.e, this.h, iRemaining);
                this.h += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(iRemaining)), e);
            }
        }

        public final void T0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        public final void U0(ByteString byteString) throws IOException {
            P0(byteString.size());
            byteString.writeTo(this);
        }

        public final void V0(int i, b0 b0Var) throws IOException {
            N0(i, 2);
            W0(b0Var);
        }

        public final void W0(b0 b0Var) throws IOException {
            P0(b0Var.getSerializedSize());
            b0Var.a(this);
        }

        public final void X0(String str) throws IOException {
            int i = this.h;
            try {
                int iX = CodedOutputStream.X(str.length() * 3);
                int iX2 = CodedOutputStream.X(str.length());
                if (iX2 == iX) {
                    int i2 = i + iX2;
                    this.h = i2;
                    int i3 = q0.i(str, this.e, i2, g0());
                    this.h = i;
                    P0((i3 - i) - iX2);
                    this.h = i3;
                } else {
                    P0(q0.j(str));
                    this.h = q0.i(str, this.e, this.h, g0());
                }
            } catch (q0.d e) {
                this.h = i;
                c0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // defpackage.o73
        public final void a(ByteBuffer byteBuffer) throws IOException {
            S0(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, defpackage.o73
        public final void b(byte[] bArr, int i, int i2) throws IOException {
            T0(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int g0() {
            return this.g - this.h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void h0(byte b2) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void i0(int i, boolean z) throws IOException {
            N0(i, 0);
            h0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k0(int i, ByteString byteString) throws IOException {
            N0(i, 2);
            U0(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void p0(int i, int i2) throws IOException {
            N0(i, 5);
            q0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void q0(int i) throws IOException {
            try {
                byte[] bArr = this.e;
                int i2 = this.h;
                bArr[i2] = (byte) (i & 255);
                bArr[i2 + 1] = (byte) ((i >> 8) & 255);
                bArr[i2 + 2] = (byte) ((i >> 16) & 255);
                this.h = i2 + 4;
                bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void r0(int i, long j) throws IOException {
            N0(i, 1);
            s0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void s0(long j) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                bArr[i] = (byte) (((int) j) & 255);
                bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
                bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
                bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
                bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
                bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
                bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
                this.h = i + 8;
                bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void x0(int i, int i2) throws IOException {
            N0(i, 0);
            y0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void y0(int i) throws IOException {
            if (i >= 0) {
                P0(i);
            } else {
                R0(i);
            }
        }
    }

    public static int A(int i, u uVar) {
        return (V(1) * 2) + W(2, i) + B(3, uVar);
    }

    public static int B(int i, u uVar) {
        return V(i) + C(uVar);
    }

    public static int C(u uVar) {
        return D(uVar.b());
    }

    public static int D(int i) {
        return X(i) + i;
    }

    public static int E(int i, b0 b0Var) {
        return (V(1) * 2) + W(2, i) + F(3, b0Var);
    }

    public static int F(int i, b0 b0Var) {
        return V(i) + H(b0Var);
    }

    public static int G(int i, b0 b0Var, k0 k0Var) {
        return V(i) + I(b0Var, k0Var);
    }

    public static int H(b0 b0Var) {
        return D(b0Var.getSerializedSize());
    }

    public static int I(b0 b0Var, k0 k0Var) {
        return D(((com.google.crypto.tink.shaded.protobuf.a) b0Var).c(k0Var));
    }

    public static int J(int i, ByteString byteString) {
        return (V(1) * 2) + W(2, i) + h(3, byteString);
    }

    @Deprecated
    public static int K(int i) {
        return X(i);
    }

    public static int L(int i, int i2) {
        return V(i) + M(i2);
    }

    public static int M(int i) {
        return 4;
    }

    public static int N(int i, long j) {
        return V(i) + O(j);
    }

    public static int O(long j) {
        return 8;
    }

    public static int P(int i, int i2) {
        return V(i) + Q(i2);
    }

    public static int Q(int i) {
        return X(a0(i));
    }

    public static int R(int i, long j) {
        return V(i) + S(j);
    }

    public static int S(long j) {
        return Z(b0(j));
    }

    public static int T(int i, String str) {
        return V(i) + U(str);
    }

    public static int U(String str) {
        int length;
        try {
            length = q0.j(str);
        } catch (q0.d unused) {
            length = str.getBytes(s.f9434a).length;
        }
        return D(length);
    }

    public static int V(int i) {
        return X(WireFormat.c(i, 0));
    }

    public static int W(int i, int i2) {
        return V(i) + X(i2);
    }

    public static int X(int i) {
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

    public static int Y(int i, long j) {
        return V(i) + Z(j);
    }

    public static int Z(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int a0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long b0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int e(int i, boolean z) {
        return V(i) + f(z);
    }

    public static CodedOutputStream e0(byte[] bArr) {
        return f0(bArr, 0, bArr.length);
    }

    public static int f(boolean z) {
        return 1;
    }

    public static CodedOutputStream f0(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    public static int g(byte[] bArr) {
        return D(bArr.length);
    }

    public static int h(int i, ByteString byteString) {
        return V(i) + i(byteString);
    }

    public static int i(ByteString byteString) {
        return D(byteString.size());
    }

    public static int j(int i, double d2) {
        return V(i) + k(d2);
    }

    public static int k(double d2) {
        return 8;
    }

    public static int l(int i, int i2) {
        return V(i) + m(i2);
    }

    public static int m(int i) {
        return x(i);
    }

    public static int n(int i, int i2) {
        return V(i) + o(i2);
    }

    public static int o(int i) {
        return 4;
    }

    public static int p(int i, long j) {
        return V(i) + q(j);
    }

    public static int q(long j) {
        return 8;
    }

    public static int r(int i, float f) {
        return V(i) + s(f);
    }

    public static int s(float f) {
        return 4;
    }

    @Deprecated
    public static int t(int i, b0 b0Var, k0 k0Var) {
        return (V(i) * 2) + v(b0Var, k0Var);
    }

    @Deprecated
    public static int u(b0 b0Var) {
        return b0Var.getSerializedSize();
    }

    @Deprecated
    public static int v(b0 b0Var, k0 k0Var) {
        return ((com.google.crypto.tink.shaded.protobuf.a) b0Var).c(k0Var);
    }

    public static int w(int i, int i2) {
        return V(i) + x(i2);
    }

    public static int x(int i) {
        if (i >= 0) {
            return X(i);
        }
        return 10;
    }

    public static int y(int i, long j) {
        return V(i) + z(j);
    }

    public static int z(long j) {
        return Z(j);
    }

    public final void A0(long j) throws IOException {
        R0(j);
    }

    public abstract void B0(int i, b0 b0Var, k0 k0Var) throws IOException;

    public abstract void C0(int i, b0 b0Var) throws IOException;

    public abstract void D0(int i, ByteString byteString) throws IOException;

    public final void E0(int i, int i2) throws IOException {
        p0(i, i2);
    }

    public final void F0(int i) throws IOException {
        q0(i);
    }

    public final void G0(int i, long j) throws IOException {
        r0(i, j);
    }

    public final void H0(long j) throws IOException {
        s0(j);
    }

    public final void I0(int i, int i2) throws IOException {
        O0(i, a0(i2));
    }

    public final void J0(int i) throws IOException {
        P0(a0(i));
    }

    public final void K0(int i, long j) throws IOException {
        Q0(i, b0(j));
    }

    public final void L0(long j) throws IOException {
        R0(b0(j));
    }

    public abstract void M0(int i, String str) throws IOException;

    public abstract void N0(int i, int i2) throws IOException;

    public abstract void O0(int i, int i2) throws IOException;

    public abstract void P0(int i) throws IOException;

    public abstract void Q0(int i, long j) throws IOException;

    public abstract void R0(long j) throws IOException;

    @Override // defpackage.o73
    public abstract void b(byte[] bArr, int i, int i2) throws IOException;

    public final void c0(String str, q0.d dVar) throws IOException {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(s.f9434a);
        try {
            P0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public final void d() {
        if (g0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public boolean d0() {
        return this.f9355b;
    }

    public abstract int g0();

    public abstract void h0(byte b2) throws IOException;

    public abstract void i0(int i, boolean z) throws IOException;

    public final void j0(boolean z) throws IOException {
        h0(z ? (byte) 1 : (byte) 0);
    }

    public abstract void k0(int i, ByteString byteString) throws IOException;

    public final void l0(int i, double d2) throws IOException {
        r0(i, Double.doubleToRawLongBits(d2));
    }

    public final void m0(double d2) throws IOException {
        s0(Double.doubleToRawLongBits(d2));
    }

    public final void n0(int i, int i2) throws IOException {
        x0(i, i2);
    }

    public final void o0(int i) throws IOException {
        y0(i);
    }

    public abstract void p0(int i, int i2) throws IOException;

    public abstract void q0(int i) throws IOException;

    public abstract void r0(int i, long j) throws IOException;

    public abstract void s0(long j) throws IOException;

    public final void t0(int i, float f) throws IOException {
        p0(i, Float.floatToRawIntBits(f));
    }

    public final void u0(float f) throws IOException {
        q0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void v0(int i, b0 b0Var, k0 k0Var) throws IOException {
        N0(i, 3);
        w0(b0Var, k0Var);
        N0(i, 4);
    }

    @Deprecated
    public final void w0(b0 b0Var, k0 k0Var) throws IOException {
        k0Var.h(b0Var, this.f9354a);
    }

    public abstract void x0(int i, int i2) throws IOException;

    public abstract void y0(int i) throws IOException;

    public final void z0(int i, long j) throws IOException {
        Q0(i, j);
    }

    public CodedOutputStream() {
    }
}
