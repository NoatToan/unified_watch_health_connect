package androidx.health.platform.client.proto;

import androidx.work.WorkInfo;
import defpackage.hbq;
import defpackage.n73;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends n73 {
    public static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean d = hbq.I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f2452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2453b;

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

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void B0(int i, int i2) throws IOException {
            T0(i, 0);
            C0(i2);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void C0(int i) throws IOException {
            if (i >= 0) {
                V0(i);
            } else {
                X0(i);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void F0(int i, o0 o0Var, w1 w1Var) throws IOException {
            T0(i, 2);
            V0(((androidx.health.platform.client.proto.a) o0Var).e(w1Var));
            w1Var.g(o0Var, this.f2452a);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void G0(o0 o0Var) throws IOException {
            V0(o0Var.getSerializedSize());
            o0Var.b(this);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void H0(int i, o0 o0Var) throws IOException {
            T0(1, 3);
            U0(2, i);
            a1(3, o0Var);
            T0(1, 4);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void I0(int i, ByteString byteString) throws IOException {
            T0(1, 3);
            U0(2, i);
            l0(3, byteString);
            T0(1, 4);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void R0(int i, String str) throws IOException {
            T0(i, 2);
            S0(str);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void S0(String str) throws IOException {
            int i = this.h;
            try {
                int iW = CodedOutputStream.W(str.length() * 3);
                int iW2 = CodedOutputStream.W(str.length());
                if (iW2 == iW) {
                    int i2 = i + iW2;
                    this.h = i2;
                    int i3 = e2.i(str, this.e, i2, f0());
                    this.h = i;
                    V0((i3 - i) - iW2);
                    this.h = i3;
                } else {
                    V0(e2.j(str));
                    this.h = e2.i(str, this.e, this.h, f0());
                }
            } catch (e2.d e) {
                this.h = i;
                b0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void T0(int i, int i2) throws IOException {
            V0(WireFormat.c(i, i2));
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void U0(int i, int i2) throws IOException {
            T0(i, 0);
            V0(i2);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void V0(int i) throws IOException {
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
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void W0(int i, long j) throws IOException {
            T0(i, 0);
            X0(j);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void X0(long j) throws IOException {
            if (CodedOutputStream.d && f0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    hbq.P(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = i2 + 1;
                hbq.P(bArr2, i2, (byte) j);
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

        public final void Y0(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.e, this.h, iRemaining);
                this.h += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(iRemaining)), e);
            }
        }

        public final void Z0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        @Override // defpackage.n73
        public final void a(ByteBuffer byteBuffer) throws IOException {
            Y0(byteBuffer);
        }

        public final void a1(int i, o0 o0Var) throws IOException {
            T0(i, 2);
            G0(o0Var);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream, defpackage.n73
        public final void b(byte[] bArr, int i, int i2) throws IOException {
            Z0(bArr, i, i2);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final int f0() {
            return this.g - this.h;
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void g0(byte b2) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void h0(int i, boolean z) throws IOException {
            T0(i, 0);
            g0(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void k0(byte[] bArr, int i, int i2) throws IOException {
            V0(i2);
            Z0(bArr, i, i2);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void l0(int i, ByteString byteString) throws IOException {
            T0(i, 2);
            m0(byteString);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void m0(ByteString byteString) throws IOException {
            V0(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void r0(int i, int i2) throws IOException {
            T0(i, 5);
            s0(i2);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void s0(int i) throws IOException {
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

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void t0(int i, long j) throws IOException {
            T0(i, 1);
            u0(j);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void u0(long j) throws IOException {
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
    }

    public static int A(int i, h0 h0Var) {
        return (U(1) * 2) + V(2, i) + B(3, h0Var);
    }

    public static int B(int i, h0 h0Var) {
        return U(i) + C(h0Var);
    }

    public static int C(h0 h0Var) {
        return D(h0Var.b());
    }

    public static int D(int i) {
        return W(i) + i;
    }

    public static int E(int i, o0 o0Var) {
        return (U(1) * 2) + V(2, i) + F(3, o0Var);
    }

    public static int F(int i, o0 o0Var) {
        return U(i) + H(o0Var);
    }

    public static int G(int i, o0 o0Var, w1 w1Var) {
        return U(i) + I(o0Var, w1Var);
    }

    public static int H(o0 o0Var) {
        return D(o0Var.getSerializedSize());
    }

    public static int I(o0 o0Var, w1 w1Var) {
        return D(((androidx.health.platform.client.proto.a) o0Var).e(w1Var));
    }

    public static int J(int i, ByteString byteString) {
        return (U(1) * 2) + V(2, i) + h(3, byteString);
    }

    public static int K(int i, int i2) {
        return U(i) + L(i2);
    }

    public static int L(int i) {
        return 4;
    }

    public static int M(int i, long j) {
        return U(i) + N(j);
    }

    public static int N(long j) {
        return 8;
    }

    public static int O(int i, int i2) {
        return U(i) + P(i2);
    }

    public static int P(int i) {
        return W(Z(i));
    }

    public static int Q(int i, long j) {
        return U(i) + R(j);
    }

    public static int R(long j) {
        return Y(a0(j));
    }

    public static int S(int i, String str) {
        return U(i) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = e2.j(str);
        } catch (e2.d unused) {
            length = str.getBytes(f0.f2490b).length;
        }
        return D(length);
    }

    public static int U(int i) {
        return W(WireFormat.c(i, 0));
    }

    public static int V(int i, int i2) {
        return U(i) + W(i2);
    }

    public static int W(int i) {
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

    public static int X(int i, long j) {
        return U(i) + Y(j);
    }

    public static int Y(long j) {
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

    public static int Z(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long a0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static CodedOutputStream d0(byte[] bArr) {
        return e0(bArr, 0, bArr.length);
    }

    public static int e(int i, boolean z) {
        return U(i) + f(z);
    }

    public static CodedOutputStream e0(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    public static int f(boolean z) {
        return 1;
    }

    public static int g(byte[] bArr) {
        return D(bArr.length);
    }

    public static int h(int i, ByteString byteString) {
        return U(i) + i(byteString);
    }

    public static int i(ByteString byteString) {
        return D(byteString.size());
    }

    public static int j(int i, double d2) {
        return U(i) + k(d2);
    }

    public static int k(double d2) {
        return 8;
    }

    public static int l(int i, int i2) {
        return U(i) + m(i2);
    }

    public static int m(int i) {
        return x(i);
    }

    public static int n(int i, int i2) {
        return U(i) + o(i2);
    }

    public static int o(int i) {
        return 4;
    }

    public static int p(int i, long j) {
        return U(i) + q(j);
    }

    public static int q(long j) {
        return 8;
    }

    public static int r(int i, float f) {
        return U(i) + s(f);
    }

    public static int s(float f) {
        return 4;
    }

    @Deprecated
    public static int t(int i, o0 o0Var, w1 w1Var) {
        return (U(i) * 2) + v(o0Var, w1Var);
    }

    @Deprecated
    public static int u(o0 o0Var) {
        return o0Var.getSerializedSize();
    }

    @Deprecated
    public static int v(o0 o0Var, w1 w1Var) {
        return ((androidx.health.platform.client.proto.a) o0Var).e(w1Var);
    }

    public static int w(int i, int i2) {
        return U(i) + x(i2);
    }

    public static int x(int i) {
        if (i >= 0) {
            return W(i);
        }
        return 10;
    }

    public static int y(int i, long j) {
        return U(i) + z(j);
    }

    public static int z(long j) {
        return Y(j);
    }

    @Deprecated
    public final void A0(o0 o0Var, w1 w1Var) throws IOException {
        w1Var.g(o0Var, this.f2452a);
    }

    public abstract void B0(int i, int i2) throws IOException;

    public abstract void C0(int i) throws IOException;

    public final void D0(int i, long j) throws IOException {
        W0(i, j);
    }

    public final void E0(long j) throws IOException {
        X0(j);
    }

    public abstract void F0(int i, o0 o0Var, w1 w1Var) throws IOException;

    public abstract void G0(o0 o0Var) throws IOException;

    public abstract void H0(int i, o0 o0Var) throws IOException;

    public abstract void I0(int i, ByteString byteString) throws IOException;

    public final void J0(int i, int i2) throws IOException {
        r0(i, i2);
    }

    public final void K0(int i) throws IOException {
        s0(i);
    }

    public final void L0(int i, long j) throws IOException {
        t0(i, j);
    }

    public final void M0(long j) throws IOException {
        u0(j);
    }

    public final void N0(int i, int i2) throws IOException {
        U0(i, Z(i2));
    }

    public final void O0(int i) throws IOException {
        V0(Z(i));
    }

    public final void P0(int i, long j) throws IOException {
        W0(i, a0(j));
    }

    public final void Q0(long j) throws IOException {
        X0(a0(j));
    }

    public abstract void R0(int i, String str) throws IOException;

    public abstract void S0(String str) throws IOException;

    public abstract void T0(int i, int i2) throws IOException;

    public abstract void U0(int i, int i2) throws IOException;

    public abstract void V0(int i) throws IOException;

    public abstract void W0(int i, long j) throws IOException;

    public abstract void X0(long j) throws IOException;

    @Override // defpackage.n73
    public abstract void b(byte[] bArr, int i, int i2) throws IOException;

    public final void b0(String str, e2.d dVar) throws IOException {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(f0.f2490b);
        try {
            V0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        }
    }

    public boolean c0() {
        return this.f2453b;
    }

    public final void d() {
        if (f0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int f0();

    public abstract void g0(byte b2) throws IOException;

    public abstract void h0(int i, boolean z) throws IOException;

    public final void i0(boolean z) throws IOException {
        g0(z ? (byte) 1 : (byte) 0);
    }

    public final void j0(byte[] bArr) throws IOException {
        k0(bArr, 0, bArr.length);
    }

    public abstract void k0(byte[] bArr, int i, int i2) throws IOException;

    public abstract void l0(int i, ByteString byteString) throws IOException;

    public abstract void m0(ByteString byteString) throws IOException;

    public final void n0(int i, double d2) throws IOException {
        t0(i, Double.doubleToRawLongBits(d2));
    }

    public final void o0(double d2) throws IOException {
        u0(Double.doubleToRawLongBits(d2));
    }

    public final void p0(int i, int i2) throws IOException {
        B0(i, i2);
    }

    public final void q0(int i) throws IOException {
        C0(i);
    }

    public abstract void r0(int i, int i2) throws IOException;

    public abstract void s0(int i) throws IOException;

    public abstract void t0(int i, long j) throws IOException;

    public abstract void u0(long j) throws IOException;

    public final void v0(int i, float f) throws IOException {
        r0(i, Float.floatToRawIntBits(f));
    }

    public final void w0(float f) throws IOException {
        s0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void x0(int i, o0 o0Var) throws IOException {
        T0(i, 3);
        z0(o0Var);
        T0(i, 4);
    }

    @Deprecated
    public final void y0(int i, o0 o0Var, w1 w1Var) throws IOException {
        T0(i, 3);
        A0(o0Var, w1Var);
        T0(i, 4);
    }

    @Deprecated
    public final void z0(o0 o0Var) throws IOException {
        o0Var.b(this);
    }

    public CodedOutputStream() {
    }
}
