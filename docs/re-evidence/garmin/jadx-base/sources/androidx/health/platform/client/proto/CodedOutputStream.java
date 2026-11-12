package androidx.health.platform.client.proto;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f7529b = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f7530c = y2.f7817e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f7531a;

    public static class b extends CodedOutputStream {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f7532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7534f;

        public b(byte[] bArr, int i14, int i15) {
            super();
            if (bArr == null) {
                j20.x.l("buffer");
                throw null;
            }
            int i16 = i14 + i15;
            if ((i14 | i15 | (bArr.length - i16)) < 0) {
                org.apache.commons.lang3.e.s("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i14), Integer.valueOf(i15)});
                throw null;
            }
            this.f7532d = bArr;
            this.f7534f = i14;
            this.f7533e = i16;
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void A(int i14, int i15) throws OutOfSpaceException {
            z(i14, 0);
            B(i15);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void B(int i14) throws OutOfSpaceException {
            while (true) {
                int i15 = i14 & (-128);
                byte[] bArr = this.f7532d;
                if (i15 == 0) {
                    int i16 = this.f7534f;
                    this.f7534f = i16 + 1;
                    bArr[i16] = (byte) i14;
                    return;
                } else {
                    try {
                        int i17 = this.f7534f;
                        this.f7534f = i17 + 1;
                        bArr[i17] = (byte) ((i14 | 128) & 255);
                        i14 >>>= 7;
                    } catch (IndexOutOfBoundsException e4) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7534f), Integer.valueOf(this.f7533e), 1), e4);
                    }
                }
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7534f), Integer.valueOf(this.f7533e), 1), e4);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void C(int i14, long j8) throws OutOfSpaceException {
            z(i14, 0);
            D(j8);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void D(long j8) throws OutOfSpaceException {
            boolean z14 = CodedOutputStream.f7530c;
            byte[] bArr = this.f7532d;
            if (z14 && E() >= 10) {
                while ((j8 & (-128)) != 0) {
                    int i14 = this.f7534f;
                    this.f7534f = i14 + 1;
                    y2.k(bArr, i14, (byte) ((((int) j8) | 128) & 255));
                    j8 >>>= 7;
                }
                int i15 = this.f7534f;
                this.f7534f = i15 + 1;
                y2.k(bArr, i15, (byte) j8);
                return;
            }
            while ((j8 & (-128)) != 0) {
                try {
                    int i16 = this.f7534f;
                    this.f7534f = i16 + 1;
                    bArr[i16] = (byte) ((((int) j8) | 128) & 255);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7534f), Integer.valueOf(this.f7533e), 1), e4);
                }
            }
            int i17 = this.f7534f;
            this.f7534f = i17 + 1;
            bArr[i17] = (byte) j8;
        }

        public final int E() {
            return this.f7533e - this.f7534f;
        }

        public final void F(byte[] bArr, int i14, int i15) {
            try {
                System.arraycopy(bArr, i14, this.f7532d, this.f7534f, i15);
                this.f7534f += i15;
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7534f), Integer.valueOf(this.f7533e), Integer.valueOf(i15)), e4);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void i(byte b14) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f7532d;
                int i14 = this.f7534f;
                this.f7534f = i14 + 1;
                bArr[i14] = b14;
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7534f), Integer.valueOf(this.f7533e), 1), e4);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void j(int i14, boolean z14) throws OutOfSpaceException {
            z(i14, 0);
            i(z14 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void k(int i14, byte[] bArr) throws OutOfSpaceException {
            B(i14);
            F(bArr, 0, i14);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void l(int i14, i iVar) throws OutOfSpaceException {
            z(i14, 2);
            m(iVar);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void m(i iVar) throws OutOfSpaceException {
            B(iVar.size());
            iVar.h(this);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void n(int i14, int i15) throws OutOfSpaceException {
            z(i14, 5);
            o(i15);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void o(int i14) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f7532d;
                int i15 = this.f7534f;
                int i16 = i15 + 1;
                this.f7534f = i16;
                bArr[i15] = (byte) (i14 & 255);
                int i17 = i15 + 2;
                this.f7534f = i17;
                bArr[i16] = (byte) ((i14 >> 8) & 255);
                int i18 = i15 + 3;
                this.f7534f = i18;
                bArr[i17] = (byte) ((i14 >> 16) & 255);
                this.f7534f = i15 + 4;
                bArr[i18] = (byte) ((i14 >> 24) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7534f), Integer.valueOf(this.f7533e), 1), e4);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void p(int i14, long j8) throws OutOfSpaceException {
            z(i14, 1);
            q(j8);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void q(long j8) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f7532d;
                int i14 = this.f7534f;
                int i15 = i14 + 1;
                this.f7534f = i15;
                bArr[i14] = (byte) (((int) j8) & 255);
                int i16 = i14 + 2;
                this.f7534f = i16;
                bArr[i15] = (byte) (((int) (j8 >> 8)) & 255);
                int i17 = i14 + 3;
                this.f7534f = i17;
                bArr[i16] = (byte) (((int) (j8 >> 16)) & 255);
                int i18 = i14 + 4;
                this.f7534f = i18;
                bArr[i17] = (byte) (((int) (j8 >> 24)) & 255);
                int i19 = i14 + 5;
                this.f7534f = i19;
                bArr[i18] = (byte) (((int) (j8 >> 32)) & 255);
                int i24 = i14 + 6;
                this.f7534f = i24;
                bArr[i19] = (byte) (((int) (j8 >> 40)) & 255);
                int i25 = i14 + 7;
                this.f7534f = i25;
                bArr[i24] = (byte) (((int) (j8 >> 48)) & 255);
                this.f7534f = i14 + 8;
                bArr[i25] = (byte) (((int) (j8 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7534f), Integer.valueOf(this.f7533e), 1), e4);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void r(int i14, int i15) throws OutOfSpaceException {
            z(i14, 0);
            s(i15);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void s(int i14) throws OutOfSpaceException {
            if (i14 >= 0) {
                B(i14);
            } else {
                D(i14);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void t(int i14, c1 c1Var, n2 n2Var) throws OutOfSpaceException {
            z(i14, 2);
            B(((androidx.health.platform.client.proto.a) c1Var).e(n2Var));
            n2Var.c(c1Var, this.f7531a);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void u(c1 c1Var) throws OutOfSpaceException {
            B(c1Var.getSerializedSize());
            c1Var.b(this);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void v(int i14, c1 c1Var) throws OutOfSpaceException {
            z(1, 3);
            A(2, i14);
            z(3, 2);
            u(c1Var);
            z(1, 4);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void w(int i14, i iVar) throws OutOfSpaceException {
            z(1, 3);
            A(2, i14);
            l(3, iVar);
            z(1, 4);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void x(int i14, String str) throws OutOfSpaceException {
            z(i14, 2);
            y(str);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void y(String str) throws OutOfSpaceException {
            int i14 = this.f7534f;
            try {
                int iG = CodedOutputStream.g(str.length() * 3);
                int iG2 = CodedOutputStream.g(str.length());
                byte[] bArr = this.f7532d;
                if (iG2 != iG) {
                    B(z2.b(str));
                    this.f7534f = z2.f7824a.b(str, bArr, this.f7534f, E());
                    return;
                }
                int i15 = i14 + iG2;
                this.f7534f = i15;
                int iB = z2.f7824a.b(str, bArr, i15, E());
                this.f7534f = i14;
                B((iB - i14) - iG2);
                this.f7534f = iB;
            } catch (z2.d e4) {
                this.f7534f = i14;
                CodedOutputStream.f7529b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
                byte[] bytes = str.getBytes(l0.f7708a);
                try {
                    B(bytes.length);
                    F(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e14) {
                    throw new OutOfSpaceException(e14);
                }
            } catch (IndexOutOfBoundsException e15) {
                throw new OutOfSpaceException(e15);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void z(int i14, int i15) throws OutOfSpaceException {
            B((i14 << 3) | i15);
        }
    }

    public static int a(int i14, i iVar) {
        int iF = f(i14);
        int size = iVar.size();
        return g(size) + size + iF;
    }

    public static int b(o0 o0Var) {
        int serializedSize;
        if (o0Var.f7738d != null) {
            serializedSize = o0Var.f7738d.size();
        } else {
            i iVar = o0Var.f7735a;
            if (iVar != null) {
                serializedSize = iVar.size();
            } else {
                serializedSize = o0Var.f7737c != null ? o0Var.f7737c.getSerializedSize() : 0;
            }
        }
        return g(serializedSize) + serializedSize;
    }

    public static int c(int i14) {
        return g((i14 >> 31) ^ (i14 << 1));
    }

    public static int d(long j8) {
        return h((j8 >> 63) ^ (j8 << 1));
    }

    public static int e(String str) {
        int length;
        try {
            length = z2.b(str);
        } catch (z2.d unused) {
            length = str.getBytes(l0.f7708a).length;
        }
        return g(length) + length;
    }

    public static int f(int i14) {
        return g(i14 << 3);
    }

    public static int g(int i14) {
        return (352 - (Integer.numberOfLeadingZeros(i14) * 9)) >>> 6;
    }

    public static int h(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    public abstract void A(int i14, int i15);

    public abstract void B(int i14);

    public abstract void C(int i14, long j8);

    public abstract void D(long j8);

    public abstract void i(byte b14);

    public abstract void j(int i14, boolean z14);

    public abstract void k(int i14, byte[] bArr);

    public abstract void l(int i14, i iVar);

    public abstract void m(i iVar);

    public abstract void n(int i14, int i15);

    public abstract void o(int i14);

    public abstract void p(int i14, long j8);

    public abstract void q(long j8);

    public abstract void r(int i14, int i15);

    public abstract void s(int i14);

    public abstract void t(int i14, c1 c1Var, n2 n2Var);

    public abstract void u(c1 c1Var);

    public abstract void v(int i14, c1 c1Var);

    public abstract void w(int i14, i iVar);

    public abstract void x(int i14, String str);

    public abstract void y(String str);

    public abstract void z(int i14, int i15);

    private CodedOutputStream() {
    }

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(String str) {
            super(fb1.c.n("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(Throwable th3) {
            super(MESSAGE, th3);
        }

        public OutOfSpaceException(String str, Throwable th3) {
            super(fb1.c.n("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th3);
        }
    }
}
