package com.google.protobuf;

import androidx.work.WorkInfo;
import defpackage.jbq;
import defpackage.p73;
import defpackage.v91;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CodedOutputStream extends p73 {
    public static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean d = jbq.J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f9463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9464b;

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

        public final void f1(byte b2) {
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = b2;
            this.h++;
        }

        public final void g1(int i) {
            byte[] bArr = this.e;
            int i2 = this.g;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            this.g = i2 + 4;
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            this.h += 4;
        }

        public final void h1(long j) {
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

        public final void i1(int i) {
            if (i >= 0) {
                k1(i);
            } else {
                l1(i);
            }
        }

        public final void j1(int i, int i2) {
            k1(WireFormat.c(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int k0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void k1(int i) {
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
                jbq.Q(bArr3, i4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i5 = this.g;
            this.g = i5 + 1;
            jbq.Q(bArr4, i5, (byte) i);
            this.h += (int) (((long) this.g) - j);
        }

        public final void l1(long j) {
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
                jbq.Q(bArr3, i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i4 = this.g;
            this.g = i4 + 1;
            jbq.Q(bArr4, i4, (byte) j);
            this.h += (int) (((long) this.g) - j2);
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

        @Override // com.google.protobuf.CodedOutputStream
        public final void G0(int i, int i2) throws IOException {
            a1(i, 0);
            H0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void H0(int i) throws IOException {
            if (i >= 0) {
                c1(i);
            } else {
                e1(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void K0(int i, q0 q0Var) throws IOException {
            a1(i, 2);
            M0(q0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void L0(int i, q0 q0Var, e1 e1Var) throws IOException {
            a1(i, 2);
            c1(((com.google.protobuf.b) q0Var).getSerializedSize(e1Var));
            e1Var.f(q0Var, this.f9463a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void M0(q0 q0Var) throws IOException {
            c1(q0Var.getSerializedSize());
            q0Var.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void N0(int i, q0 q0Var) throws IOException {
            a1(1, 3);
            b1(2, i);
            K0(3, q0Var);
            a1(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void O0(int i, ByteString byteString) throws IOException {
            a1(1, 3);
            b1(2, i);
            q0(3, byteString);
            a1(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Y0(int i, String str) throws IOException {
            a1(i, 2);
            Z0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Z0(String str) throws IOException {
            int i = this.h;
            try {
                int iZ = CodedOutputStream.Z(str.length() * 3);
                int iZ2 = CodedOutputStream.Z(str.length());
                if (iZ2 == iZ) {
                    int i2 = i + iZ2;
                    this.h = i2;
                    int i3 = v1.i(str, this.e, i2, k0());
                    this.h = i;
                    c1((i3 - i) - iZ2);
                    this.h = i3;
                } else {
                    c1(v1.j(str));
                    this.h = v1.i(str, this.e, this.h, k0());
                }
            } catch (v1.d e) {
                this.h = i;
                f0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // defpackage.p73
        public final void a(ByteBuffer byteBuffer) throws IOException {
            f1(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void a1(int i, int i2) throws IOException {
            c1(WireFormat.c(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream, defpackage.p73
        public final void b(byte[] bArr, int i, int i2) throws IOException {
            g1(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void b1(int i, int i2) throws IOException {
            a1(i, 0);
            c1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void c1(int i) throws IOException {
            if (!CodedOutputStream.d || v91.c() || k0() < 5) {
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
                jbq.Q(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.e;
            int i5 = this.h;
            this.h = i5 + 1;
            jbq.Q(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr5 = this.e;
                int i7 = this.h;
                this.h = i7 + 1;
                jbq.Q(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.e;
            int i8 = this.h;
            this.h = i8 + 1;
            jbq.Q(bArr6, i8, (byte) (i6 | 128));
            int i9 = i >>> 14;
            if ((i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr7 = this.e;
                int i10 = this.h;
                this.h = i10 + 1;
                jbq.Q(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.e;
            int i11 = this.h;
            this.h = i11 + 1;
            jbq.Q(bArr8, i11, (byte) (i9 | 128));
            int i12 = i >>> 21;
            if ((i12 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr9 = this.e;
                int i13 = this.h;
                this.h = i13 + 1;
                jbq.Q(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.e;
            int i14 = this.h;
            this.h = i14 + 1;
            jbq.Q(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.e;
            int i15 = this.h;
            this.h = i15 + 1;
            jbq.Q(bArr11, i15, (byte) (i >>> 28));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void d1(int i, long j) throws IOException {
            a1(i, 0);
            e1(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void e0() {
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void e1(long j) throws IOException {
            if (CodedOutputStream.d && k0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    jbq.Q(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = i2 + 1;
                jbq.Q(bArr2, i2, (byte) j);
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

        public final void f1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.e, this.h, iRemaining);
                this.h += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(iRemaining)), e);
            }
        }

        public final void g1(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int k0() {
            return this.g - this.h;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(byte b2) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void m0(int i, boolean z) throws IOException {
            a1(i, 0);
            l0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void p0(byte[] bArr, int i, int i2) throws IOException {
            c1(i2);
            g1(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void q0(int i, ByteString byteString) throws IOException {
            a1(i, 2);
            r0(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(ByteString byteString) throws IOException {
            c1(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void w0(int i, int i2) throws IOException {
            a1(i, 5);
            x0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void x0(int i) throws IOException {
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

        @Override // com.google.protobuf.CodedOutputStream
        public final void y0(int i, long j) throws IOException {
            a1(i, 1);
            z0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void z0(long j) throws IOException {
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

        @Override // com.google.protobuf.CodedOutputStream
        public void G0(int i, int i2) throws IOException {
            n1(20);
            j1(i, 0);
            i1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void H0(int i) throws IOException {
            if (i >= 0) {
                c1(i);
            } else {
                e1(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void K0(int i, q0 q0Var) throws IOException {
            a1(i, 2);
            M0(q0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void L0(int i, q0 q0Var, e1 e1Var) throws IOException {
            a1(i, 2);
            q1(q0Var, e1Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void M0(q0 q0Var) throws IOException {
            c1(q0Var.getSerializedSize());
            q0Var.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void N0(int i, q0 q0Var) throws IOException {
            a1(1, 3);
            b1(2, i);
            K0(3, q0Var);
            a1(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void O0(int i, ByteString byteString) throws IOException {
            a1(1, 3);
            b1(2, i);
            q0(3, byteString);
            a1(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void Y0(int i, String str) throws IOException {
            a1(i, 2);
            Z0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void Z0(String str) throws IOException {
            int iJ;
            try {
                int length = str.length() * 3;
                int iZ = CodedOutputStream.Z(length);
                int i = iZ + length;
                int i2 = this.f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int i3 = v1.i(str, bArr, 0, length);
                    c1(i3);
                    b(bArr, 0, i3);
                    return;
                }
                if (i > i2 - this.g) {
                    m1();
                }
                int iZ2 = CodedOutputStream.Z(str.length());
                int i4 = this.g;
                try {
                    if (iZ2 == iZ) {
                        int i5 = i4 + iZ2;
                        this.g = i5;
                        int i6 = v1.i(str, this.e, i5, this.f - i5);
                        this.g = i4;
                        iJ = (i6 - i4) - iZ2;
                        k1(iJ);
                        this.g = i6;
                    } else {
                        iJ = v1.j(str);
                        k1(iJ);
                        this.g = v1.i(str, this.e, this.g, iJ);
                    }
                    this.h += iJ;
                } catch (v1.d e) {
                    this.h -= this.g - i4;
                    this.g = i4;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (v1.d e3) {
                f0(str, e3);
            }
        }

        @Override // defpackage.p73
        public void a(ByteBuffer byteBuffer) throws IOException {
            o1(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void a1(int i, int i2) throws IOException {
            c1(WireFormat.c(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream, defpackage.p73
        public void b(byte[] bArr, int i, int i2) throws IOException {
            p1(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void b1(int i, int i2) throws IOException {
            n1(20);
            j1(i, 0);
            k1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void c1(int i) throws IOException {
            n1(5);
            k1(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void d1(int i, long j) throws IOException {
            n1(20);
            j1(i, 0);
            l1(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void e0() throws IOException {
            if (this.g > 0) {
                m1();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void e1(long j) throws IOException {
            n1(10);
            l1(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void l0(byte b2) throws IOException {
            if (this.g == this.f) {
                m1();
            }
            f1(b2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void m0(int i, boolean z) throws IOException {
            n1(11);
            j1(i, 0);
            f1(z ? (byte) 1 : (byte) 0);
        }

        public final void m1() throws IOException {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        public final void n1(int i) throws IOException {
            if (this.f - this.g < i) {
                m1();
            }
        }

        public void o1(ByteBuffer byteBuffer) throws IOException {
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
            m1();
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

        @Override // com.google.protobuf.CodedOutputStream
        public void p0(byte[] bArr, int i, int i2) throws IOException {
            c1(i2);
            p1(bArr, i, i2);
        }

        public void p1(byte[] bArr, int i, int i2) throws IOException {
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
            m1();
            if (i7 <= this.f) {
                System.arraycopy(bArr, i6, this.e, 0, i7);
                this.g = i7;
            } else {
                this.i.write(bArr, i6, i7);
            }
            this.h += i7;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void q0(int i, ByteString byteString) throws IOException {
            a1(i, 2);
            r0(byteString);
        }

        public void q1(q0 q0Var, e1 e1Var) throws IOException {
            c1(((com.google.protobuf.b) q0Var).getSerializedSize(e1Var));
            e1Var.f(q0Var, this.f9463a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void r0(ByteString byteString) throws IOException {
            c1(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void w0(int i, int i2) throws IOException {
            n1(14);
            j1(i, 5);
            g1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void x0(int i) throws IOException {
            n1(4);
            g1(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void y0(int i, long j) throws IOException {
            n1(18);
            j1(i, 1);
            h1(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void z0(long j) throws IOException {
            n1(8);
            h1(j);
        }
    }

    public static int A(long j) {
        return b0(j);
    }

    public static int B(int i, f0 f0Var) {
        return (X(1) * 2) + Y(2, i) + C(3, f0Var);
    }

    public static int C(int i, f0 f0Var) {
        return X(i) + D(f0Var);
    }

    public static int D(f0 f0Var) {
        return E(f0Var.c());
    }

    public static int E(int i) {
        return Z(i) + i;
    }

    public static int F(int i, q0 q0Var) {
        return (X(1) * 2) + Y(2, i) + G(3, q0Var);
    }

    public static int G(int i, q0 q0Var) {
        return X(i) + I(q0Var);
    }

    public static int H(int i, q0 q0Var, e1 e1Var) {
        return X(i) + J(q0Var, e1Var);
    }

    public static int I(q0 q0Var) {
        return E(q0Var.getSerializedSize());
    }

    public static int J(q0 q0Var, e1 e1Var) {
        return E(((com.google.protobuf.b) q0Var).getSerializedSize(e1Var));
    }

    public static int K(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int L(int i, ByteString byteString) {
        return (X(1) * 2) + Y(2, i) + h(3, byteString);
    }

    @Deprecated
    public static int M(int i) {
        return Z(i);
    }

    public static int N(int i, int i2) {
        return X(i) + O(i2);
    }

    public static int O(int i) {
        return 4;
    }

    public static int P(int i, long j) {
        return X(i) + Q(j);
    }

    public static int Q(long j) {
        return 8;
    }

    public static int R(int i, int i2) {
        return X(i) + S(i2);
    }

    public static int S(int i) {
        return Z(c0(i));
    }

    public static int T(int i, long j) {
        return X(i) + U(j);
    }

    public static int U(long j) {
        return b0(d0(j));
    }

    public static int V(int i, String str) {
        return X(i) + W(str);
    }

    public static int W(String str) {
        int length;
        try {
            length = v1.j(str);
        } catch (v1.d unused) {
            length = str.getBytes(d0.f9618a).length;
        }
        return E(length);
    }

    public static int X(int i) {
        return Z(WireFormat.c(i, 0));
    }

    public static int Y(int i, int i2) {
        return X(i) + Z(i2);
    }

    public static int Z(int i) {
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

    public static int a0(int i, long j) {
        return X(i) + b0(j);
    }

    public static int b0(long j) {
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

    public static int c0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long d0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int e(int i, boolean z) {
        return X(i) + f(z);
    }

    public static int f(boolean z) {
        return 1;
    }

    public static int g(byte[] bArr) {
        return E(bArr.length);
    }

    public static int h(int i, ByteString byteString) {
        return X(i) + i(byteString);
    }

    public static CodedOutputStream h0(OutputStream outputStream, int i) {
        return new d(outputStream, i);
    }

    public static int i(ByteString byteString) {
        return E(byteString.size());
    }

    public static CodedOutputStream i0(byte[] bArr) {
        return j0(bArr, 0, bArr.length);
    }

    public static int j(int i, double d2) {
        return X(i) + k(d2);
    }

    public static CodedOutputStream j0(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    public static int k(double d2) {
        return 8;
    }

    public static int l(int i, int i2) {
        return X(i) + m(i2);
    }

    public static int m(int i) {
        return y(i);
    }

    public static int n(int i, int i2) {
        return X(i) + o(i2);
    }

    public static int o(int i) {
        return 4;
    }

    public static int p(int i, long j) {
        return X(i) + q(j);
    }

    public static int q(long j) {
        return 8;
    }

    public static int r(int i, float f) {
        return X(i) + s(f);
    }

    public static int s(float f) {
        return 4;
    }

    @Deprecated
    public static int t(int i, q0 q0Var) {
        return (X(i) * 2) + v(q0Var);
    }

    @Deprecated
    public static int u(int i, q0 q0Var, e1 e1Var) {
        return (X(i) * 2) + w(q0Var, e1Var);
    }

    @Deprecated
    public static int v(q0 q0Var) {
        return q0Var.getSerializedSize();
    }

    @Deprecated
    public static int w(q0 q0Var, e1 e1Var) {
        return ((com.google.protobuf.b) q0Var).getSerializedSize(e1Var);
    }

    public static int x(int i, int i2) {
        return X(i) + y(i2);
    }

    public static int y(int i) {
        if (i >= 0) {
            return Z(i);
        }
        return 10;
    }

    public static int z(int i, long j) {
        return X(i) + A(j);
    }

    public final void A0(int i, float f) throws IOException {
        w0(i, Float.floatToRawIntBits(f));
    }

    public final void B0(float f) throws IOException {
        x0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void C0(int i, q0 q0Var) throws IOException {
        a1(i, 3);
        E0(q0Var);
        a1(i, 4);
    }

    @Deprecated
    public final void D0(int i, q0 q0Var, e1 e1Var) throws IOException {
        a1(i, 3);
        F0(q0Var, e1Var);
        a1(i, 4);
    }

    @Deprecated
    public final void E0(q0 q0Var) throws IOException {
        q0Var.writeTo(this);
    }

    @Deprecated
    public final void F0(q0 q0Var, e1 e1Var) throws IOException {
        e1Var.f(q0Var, this.f9463a);
    }

    public abstract void G0(int i, int i2) throws IOException;

    public abstract void H0(int i) throws IOException;

    public final void I0(int i, long j) throws IOException {
        d1(i, j);
    }

    public final void J0(long j) throws IOException {
        e1(j);
    }

    public abstract void K0(int i, q0 q0Var) throws IOException;

    public abstract void L0(int i, q0 q0Var, e1 e1Var) throws IOException;

    public abstract void M0(q0 q0Var) throws IOException;

    public abstract void N0(int i, q0 q0Var) throws IOException;

    public abstract void O0(int i, ByteString byteString) throws IOException;

    @Deprecated
    public final void P0(int i) throws IOException {
        c1(i);
    }

    public final void Q0(int i, int i2) throws IOException {
        w0(i, i2);
    }

    public final void R0(int i) throws IOException {
        x0(i);
    }

    public final void S0(int i, long j) throws IOException {
        y0(i, j);
    }

    public final void T0(long j) throws IOException {
        z0(j);
    }

    public final void U0(int i, int i2) throws IOException {
        b1(i, c0(i2));
    }

    public final void V0(int i) throws IOException {
        c1(c0(i));
    }

    public final void W0(int i, long j) throws IOException {
        d1(i, d0(j));
    }

    public final void X0(long j) throws IOException {
        e1(d0(j));
    }

    public abstract void Y0(int i, String str) throws IOException;

    public abstract void Z0(String str) throws IOException;

    public abstract void a1(int i, int i2) throws IOException;

    @Override // defpackage.p73
    public abstract void b(byte[] bArr, int i, int i2) throws IOException;

    public abstract void b1(int i, int i2) throws IOException;

    public abstract void c1(int i) throws IOException;

    public final void d() {
        if (k0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void d1(int i, long j) throws IOException;

    public abstract void e0() throws IOException;

    public abstract void e1(long j) throws IOException;

    public final void f0(String str, v1.d dVar) throws IOException {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(d0.f9618a);
        try {
            c1(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public boolean g0() {
        return this.f9464b;
    }

    public abstract int k0();

    public abstract void l0(byte b2) throws IOException;

    public abstract void m0(int i, boolean z) throws IOException;

    public final void n0(boolean z) throws IOException {
        l0(z ? (byte) 1 : (byte) 0);
    }

    public final void o0(byte[] bArr) throws IOException {
        p0(bArr, 0, bArr.length);
    }

    public abstract void p0(byte[] bArr, int i, int i2) throws IOException;

    public abstract void q0(int i, ByteString byteString) throws IOException;

    public abstract void r0(ByteString byteString) throws IOException;

    public final void s0(int i, double d2) throws IOException {
        y0(i, Double.doubleToRawLongBits(d2));
    }

    public final void t0(double d2) throws IOException {
        z0(Double.doubleToRawLongBits(d2));
    }

    public final void u0(int i, int i2) throws IOException {
        G0(i, i2);
    }

    public final void v0(int i) throws IOException {
        H0(i);
    }

    public abstract void w0(int i, int i2) throws IOException;

    public abstract void x0(int i) throws IOException;

    public abstract void y0(int i, long j) throws IOException;

    public abstract void z0(long j) throws IOException;

    public CodedOutputStream() {
    }
}
