package androidx.datastore.preferences.protobuf;

import androidx.work.WorkInfo;
import defpackage.kbq;
import defpackage.q73;
import defpackage.w91;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends q73 {
    public static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean d = kbq.G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f2165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2166b;

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

    public static abstract class b extends CodedOutputStream {
        public final byte[] e;
        public final int f;
        public int g;
        public int h;

        public b(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.e = bArr;
            this.f = bArr.length;
        }

        public final void c1(byte b2) {
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = b2;
            this.h++;
        }

        public final void d1(int i) {
            byte[] bArr = this.e;
            int i2 = this.g;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            this.g = i2 + 4;
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            this.h += 4;
        }

        public final void e1(long j) {
            byte[] bArr = this.e;
            int i = this.g;
            bArr[i] = (byte) (j & 255);
            bArr[i + 1] = (byte) ((j >> 8) & 255);
            bArr[i + 2] = (byte) ((j >> 16) & 255);
            bArr[i + 3] = (byte) (255 & (j >> 24));
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            this.g = i + 8;
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
            this.h += 8;
        }

        public final void f1(int i) {
            if (i >= 0) {
                h1(i);
            } else {
                i1(i);
            }
        }

        public final void g1(int i, int i2) {
            h1(WireFormat.c(i, i2));
        }

        public final void h1(int i) {
            if (!CodedOutputStream.d) {
                while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    this.h++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr2[i3] = (byte) i;
                this.h++;
                return;
            }
            long j = this.g;
            while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                byte[] bArr3 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                kbq.M(bArr3, i4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i5 = this.g;
            this.g = i5 + 1;
            kbq.M(bArr4, i5, (byte) i);
            this.h += (int) (((long) this.g) - j);
        }

        public final void i1(long j) {
            if (!CodedOutputStream.d) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    this.h++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr2[i2] = (byte) j;
                this.h++;
                return;
            }
            long j2 = this.g;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                kbq.M(bArr3, i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i4 = this.g;
            this.g = i4 + 1;
            kbq.M(bArr4, i4, (byte) j);
            this.h += (int) (((long) this.g) - j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int j0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class c extends CodedOutputStream {
        public final byte[] e;
        public final int f;
        public final int g;
        public int h;

        public c(byte[] bArr, int i, int i2) {
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

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F0(int i, int i2) throws IOException {
            X0(i, 0);
            G0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G0(int i) throws IOException {
            if (i >= 0) {
                Z0(i);
            } else {
                b1(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J0(int i, b0 b0Var, k0 k0Var) throws IOException {
            X0(i, 2);
            Z0(((androidx.datastore.preferences.protobuf.a) b0Var).d(k0Var));
            k0Var.f(b0Var, this.f2165a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K0(b0 b0Var) throws IOException {
            Z0(b0Var.getSerializedSize());
            b0Var.a(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L0(int i, b0 b0Var) throws IOException {
            X0(1, 3);
            Y0(2, i);
            e1(3, b0Var);
            X0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M0(int i, ByteString byteString) throws IOException {
            X0(1, 3);
            Y0(2, i);
            p0(3, byteString);
            X0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V0(int i, String str) throws IOException {
            X0(i, 2);
            W0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W0(String str) throws IOException {
            int i = this.h;
            try {
                int iY = CodedOutputStream.Y(str.length() * 3);
                int iY2 = CodedOutputStream.Y(str.length());
                if (iY2 == iY) {
                    int i2 = i + iY2;
                    this.h = i2;
                    int i3 = q0.i(str, this.e, i2, j0());
                    this.h = i;
                    Z0((i3 - i) - iY2);
                    this.h = i3;
                } else {
                    Z0(q0.j(str));
                    this.h = q0.i(str, this.e, this.h, j0());
                }
            } catch (q0.d e) {
                this.h = i;
                e0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X0(int i, int i2) throws IOException {
            Z0(WireFormat.c(i, i2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Y0(int i, int i2) throws IOException {
            X0(i, 0);
            Z0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Z0(int i) throws IOException {
            if (!CodedOutputStream.d || w91.c() || j0() < 5) {
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
                kbq.M(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.e;
            int i5 = this.h;
            this.h = i5 + 1;
            kbq.M(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr5 = this.e;
                int i7 = this.h;
                this.h = i7 + 1;
                kbq.M(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.e;
            int i8 = this.h;
            this.h = i8 + 1;
            kbq.M(bArr6, i8, (byte) (i6 | 128));
            int i9 = i >>> 14;
            if ((i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr7 = this.e;
                int i10 = this.h;
                this.h = i10 + 1;
                kbq.M(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.e;
            int i11 = this.h;
            this.h = i11 + 1;
            kbq.M(bArr8, i11, (byte) (i9 | 128));
            int i12 = i >>> 21;
            if ((i12 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr9 = this.e;
                int i13 = this.h;
                this.h = i13 + 1;
                kbq.M(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.e;
            int i14 = this.h;
            this.h = i14 + 1;
            kbq.M(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.e;
            int i15 = this.h;
            this.h = i15 + 1;
            kbq.M(bArr11, i15, (byte) (i >>> 28));
        }

        @Override // defpackage.q73
        public final void a(ByteBuffer byteBuffer) throws IOException {
            c1(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void a1(int i, long j) throws IOException {
            X0(i, 0);
            b1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, defpackage.q73
        public final void b(byte[] bArr, int i, int i2) throws IOException {
            d1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b1(long j) throws IOException {
            if (CodedOutputStream.d && j0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    kbq.M(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = i2 + 1;
                kbq.M(bArr2, i2, (byte) j);
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

        public final void c1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.e, this.h, iRemaining);
                this.h += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(iRemaining)), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void d0() {
        }

        public final void d1(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        public final void e1(int i, b0 b0Var) throws IOException {
            X0(i, 2);
            K0(b0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int j0() {
            return this.g - this.h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k0(byte b2) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void l0(int i, boolean z) throws IOException {
            X0(i, 0);
            k0(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o0(byte[] bArr, int i, int i2) throws IOException {
            Z0(i2);
            d1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void p0(int i, ByteString byteString) throws IOException {
            X0(i, 2);
            q0(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void q0(ByteString byteString) throws IOException {
            Z0(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v0(int i, int i2) throws IOException {
            X0(i, 5);
            w0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w0(int i) throws IOException {
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

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x0(int i, long j) throws IOException {
            X0(i, 1);
            y0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y0(long j) throws IOException {
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

    public static final class d extends b {
        public final OutputStream i;

        public d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.i = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void F0(int i, int i2) throws IOException {
            k1(20);
            g1(i, 0);
            f1(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void G0(int i) throws IOException {
            if (i >= 0) {
                Z0(i);
            } else {
                b1(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void J0(int i, b0 b0Var, k0 k0Var) throws IOException {
            X0(i, 2);
            o1(b0Var, k0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void K0(b0 b0Var) throws IOException {
            Z0(b0Var.getSerializedSize());
            b0Var.a(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L0(int i, b0 b0Var) throws IOException {
            X0(1, 3);
            Y0(2, i);
            n1(3, b0Var);
            X0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void M0(int i, ByteString byteString) throws IOException {
            X0(1, 3);
            Y0(2, i);
            p0(3, byteString);
            X0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void V0(int i, String str) throws IOException {
            X0(i, 2);
            W0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W0(String str) throws IOException {
            int iJ;
            try {
                int length = str.length() * 3;
                int iY = CodedOutputStream.Y(length);
                int i = iY + length;
                int i2 = this.f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int i3 = q0.i(str, bArr, 0, length);
                    Z0(i3);
                    b(bArr, 0, i3);
                    return;
                }
                if (i > i2 - this.g) {
                    j1();
                }
                int iY2 = CodedOutputStream.Y(str.length());
                int i4 = this.g;
                try {
                    if (iY2 == iY) {
                        int i5 = i4 + iY2;
                        this.g = i5;
                        int i6 = q0.i(str, this.e, i5, this.f - i5);
                        this.g = i4;
                        iJ = (i6 - i4) - iY2;
                        h1(iJ);
                        this.g = i6;
                    } else {
                        iJ = q0.j(str);
                        h1(iJ);
                        this.g = q0.i(str, this.e, this.g, iJ);
                    }
                    this.h += iJ;
                } catch (q0.d e) {
                    this.h -= this.g - i4;
                    this.g = i4;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (q0.d e3) {
                e0(str, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void X0(int i, int i2) throws IOException {
            Z0(WireFormat.c(i, i2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y0(int i, int i2) throws IOException {
            k1(20);
            g1(i, 0);
            h1(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Z0(int i) throws IOException {
            k1(5);
            h1(i);
        }

        @Override // defpackage.q73
        public void a(ByteBuffer byteBuffer) throws IOException {
            l1(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a1(int i, long j) throws IOException {
            k1(20);
            g1(i, 0);
            i1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, defpackage.q73
        public void b(byte[] bArr, int i, int i2) throws IOException {
            m1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void b1(long j) throws IOException {
            k1(10);
            i1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void d0() throws IOException {
            if (this.g > 0) {
                j1();
            }
        }

        public final void j1() throws IOException {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void k0(byte b2) throws IOException {
            if (this.g == this.f) {
                j1();
            }
            c1(b2);
        }

        public final void k1(int i) throws IOException {
            if (this.f - this.g < i) {
                j1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void l0(int i, boolean z) throws IOException {
            k1(11);
            g1(i, 0);
            c1(z ? (byte) 1 : (byte) 0);
        }

        public void l1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i = this.f;
            int i2 = this.g;
            if (i - i2 >= iRemaining) {
                byteBuffer.get(this.e, i2, iRemaining);
                this.g += iRemaining;
                this.h += iRemaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.e, i2, i3);
            int i4 = iRemaining - i3;
            this.g = this.f;
            this.h += i3;
            j1();
            while (true) {
                int i5 = this.f;
                if (i4 <= i5) {
                    byteBuffer.get(this.e, 0, i4);
                    this.g = i4;
                    this.h += i4;
                    return;
                } else {
                    byteBuffer.get(this.e, 0, i5);
                    this.i.write(this.e, 0, this.f);
                    int i6 = this.f;
                    i4 -= i6;
                    this.h += i6;
                }
            }
        }

        public void m1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f;
            int i4 = this.g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.e, i4, i2);
                this.g += i2;
                this.h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.g = this.f;
            this.h += i5;
            j1();
            if (i7 <= this.f) {
                System.arraycopy(bArr, i6, this.e, 0, i7);
                this.g = i7;
            } else {
                this.i.write(bArr, i6, i7);
            }
            this.h += i7;
        }

        public void n1(int i, b0 b0Var) throws IOException {
            X0(i, 2);
            K0(b0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o0(byte[] bArr, int i, int i2) throws IOException {
            Z0(i2);
            m1(bArr, i, i2);
        }

        public void o1(b0 b0Var, k0 k0Var) throws IOException {
            Z0(((androidx.datastore.preferences.protobuf.a) b0Var).d(k0Var));
            k0Var.f(b0Var, this.f2165a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void p0(int i, ByteString byteString) throws IOException {
            X0(i, 2);
            q0(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void q0(ByteString byteString) throws IOException {
            Z0(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v0(int i, int i2) throws IOException {
            k1(14);
            g1(i, 5);
            d1(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void w0(int i) throws IOException {
            k1(4);
            d1(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void x0(int i, long j) throws IOException {
            k1(18);
            g1(i, 1);
            e1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void y0(long j) throws IOException {
            k1(8);
            e1(j);
        }
    }

    public static int A(int i, u uVar) {
        return (W(1) * 2) + X(2, i) + B(3, uVar);
    }

    public static int B(int i, u uVar) {
        return W(i) + C(uVar);
    }

    public static int C(u uVar) {
        return D(uVar.b());
    }

    public static int D(int i) {
        return Y(i) + i;
    }

    public static int E(int i, b0 b0Var) {
        return (W(1) * 2) + X(2, i) + F(3, b0Var);
    }

    public static int F(int i, b0 b0Var) {
        return W(i) + H(b0Var);
    }

    public static int G(int i, b0 b0Var, k0 k0Var) {
        return W(i) + I(b0Var, k0Var);
    }

    public static int H(b0 b0Var) {
        return D(b0Var.getSerializedSize());
    }

    public static int I(b0 b0Var, k0 k0Var) {
        return D(((androidx.datastore.preferences.protobuf.a) b0Var).d(k0Var));
    }

    public static int J(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int K(int i, ByteString byteString) {
        return (W(1) * 2) + X(2, i) + h(3, byteString);
    }

    @Deprecated
    public static int L(int i) {
        return Y(i);
    }

    public static int M(int i, int i2) {
        return W(i) + N(i2);
    }

    public static int N(int i) {
        return 4;
    }

    public static int O(int i, long j) {
        return W(i) + P(j);
    }

    public static int P(long j) {
        return 8;
    }

    public static int Q(int i, int i2) {
        return W(i) + R(i2);
    }

    public static int R(int i) {
        return Y(b0(i));
    }

    public static int S(int i, long j) {
        return W(i) + T(j);
    }

    public static int T(long j) {
        return a0(c0(j));
    }

    public static int U(int i, String str) {
        return W(i) + V(str);
    }

    public static int V(String str) {
        int length;
        try {
            length = q0.j(str);
        } catch (q0.d unused) {
            length = str.getBytes(s.f2252a).length;
        }
        return D(length);
    }

    public static int W(int i) {
        return Y(WireFormat.c(i, 0));
    }

    public static int X(int i, int i2) {
        return W(i) + Y(i2);
    }

    public static int Y(int i) {
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

    public static int Z(int i, long j) {
        return W(i) + a0(j);
    }

    public static int a0(long j) {
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

    public static int b0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long c0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int e(int i, boolean z) {
        return W(i) + f(z);
    }

    public static int f(boolean z) {
        return 1;
    }

    public static int g(byte[] bArr) {
        return D(bArr.length);
    }

    public static CodedOutputStream g0(OutputStream outputStream, int i) {
        return new d(outputStream, i);
    }

    public static int h(int i, ByteString byteString) {
        return W(i) + i(byteString);
    }

    public static CodedOutputStream h0(byte[] bArr) {
        return i0(bArr, 0, bArr.length);
    }

    public static int i(ByteString byteString) {
        return D(byteString.size());
    }

    public static CodedOutputStream i0(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    public static int j(int i, double d2) {
        return W(i) + k(d2);
    }

    public static int k(double d2) {
        return 8;
    }

    public static int l(int i, int i2) {
        return W(i) + m(i2);
    }

    public static int m(int i) {
        return x(i);
    }

    public static int n(int i, int i2) {
        return W(i) + o(i2);
    }

    public static int o(int i) {
        return 4;
    }

    public static int p(int i, long j) {
        return W(i) + q(j);
    }

    public static int q(long j) {
        return 8;
    }

    public static int r(int i, float f) {
        return W(i) + s(f);
    }

    public static int s(float f) {
        return 4;
    }

    @Deprecated
    public static int t(int i, b0 b0Var, k0 k0Var) {
        return (W(i) * 2) + v(b0Var, k0Var);
    }

    @Deprecated
    public static int u(b0 b0Var) {
        return b0Var.getSerializedSize();
    }

    @Deprecated
    public static int v(b0 b0Var, k0 k0Var) {
        return ((androidx.datastore.preferences.protobuf.a) b0Var).d(k0Var);
    }

    public static int w(int i, int i2) {
        return W(i) + x(i2);
    }

    public static int x(int i) {
        if (i >= 0) {
            return Y(i);
        }
        return 10;
    }

    public static int y(int i, long j) {
        return W(i) + z(j);
    }

    public static int z(long j) {
        return a0(j);
    }

    public final void A0(float f) throws IOException {
        w0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void B0(int i, b0 b0Var) throws IOException {
        X0(i, 3);
        D0(b0Var);
        X0(i, 4);
    }

    @Deprecated
    public final void C0(int i, b0 b0Var, k0 k0Var) throws IOException {
        X0(i, 3);
        E0(b0Var, k0Var);
        X0(i, 4);
    }

    @Deprecated
    public final void D0(b0 b0Var) throws IOException {
        b0Var.a(this);
    }

    @Deprecated
    public final void E0(b0 b0Var, k0 k0Var) throws IOException {
        k0Var.f(b0Var, this.f2165a);
    }

    public abstract void F0(int i, int i2) throws IOException;

    public abstract void G0(int i) throws IOException;

    public final void H0(int i, long j) throws IOException {
        a1(i, j);
    }

    public final void I0(long j) throws IOException {
        b1(j);
    }

    public abstract void J0(int i, b0 b0Var, k0 k0Var) throws IOException;

    public abstract void K0(b0 b0Var) throws IOException;

    public abstract void L0(int i, b0 b0Var) throws IOException;

    public abstract void M0(int i, ByteString byteString) throws IOException;

    public final void N0(int i, int i2) throws IOException {
        v0(i, i2);
    }

    public final void O0(int i) throws IOException {
        w0(i);
    }

    public final void P0(int i, long j) throws IOException {
        x0(i, j);
    }

    public final void Q0(long j) throws IOException {
        y0(j);
    }

    public final void R0(int i, int i2) throws IOException {
        Y0(i, b0(i2));
    }

    public final void S0(int i) throws IOException {
        Z0(b0(i));
    }

    public final void T0(int i, long j) throws IOException {
        a1(i, c0(j));
    }

    public final void U0(long j) throws IOException {
        b1(c0(j));
    }

    public abstract void V0(int i, String str) throws IOException;

    public abstract void W0(String str) throws IOException;

    public abstract void X0(int i, int i2) throws IOException;

    public abstract void Y0(int i, int i2) throws IOException;

    public abstract void Z0(int i) throws IOException;

    public abstract void a1(int i, long j) throws IOException;

    @Override // defpackage.q73
    public abstract void b(byte[] bArr, int i, int i2) throws IOException;

    public abstract void b1(long j) throws IOException;

    public final void d() {
        if (j0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void d0() throws IOException;

    public final void e0(String str, q0.d dVar) throws IOException {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(s.f2252a);
        try {
            Z0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public boolean f0() {
        return this.f2166b;
    }

    public abstract int j0();

    public abstract void k0(byte b2) throws IOException;

    public abstract void l0(int i, boolean z) throws IOException;

    public final void m0(boolean z) throws IOException {
        k0(z ? (byte) 1 : (byte) 0);
    }

    public final void n0(byte[] bArr) throws IOException {
        o0(bArr, 0, bArr.length);
    }

    public abstract void o0(byte[] bArr, int i, int i2) throws IOException;

    public abstract void p0(int i, ByteString byteString) throws IOException;

    public abstract void q0(ByteString byteString) throws IOException;

    public final void r0(int i, double d2) throws IOException {
        x0(i, Double.doubleToRawLongBits(d2));
    }

    public final void s0(double d2) throws IOException {
        y0(Double.doubleToRawLongBits(d2));
    }

    public final void t0(int i, int i2) throws IOException {
        F0(i, i2);
    }

    public final void u0(int i) throws IOException {
        G0(i);
    }

    public abstract void v0(int i, int i2) throws IOException;

    public abstract void w0(int i) throws IOException;

    public abstract void x0(int i, long j) throws IOException;

    public abstract void y0(long j) throws IOException;

    public final void z0(int i, float f) throws IOException {
        v0(i, Float.floatToRawIntBits(f));
    }

    public CodedOutputStream() {
    }
}
