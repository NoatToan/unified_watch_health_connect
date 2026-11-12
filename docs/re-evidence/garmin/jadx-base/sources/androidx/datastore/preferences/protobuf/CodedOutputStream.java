package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f6654b = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f6655c = p1.f6803e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f6656a;

    public static abstract class b extends CodedOutputStream {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f6657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6659f;

        public b(int i14) {
            super();
            if (i14 < 0) {
                vb.h.s("bufferSize must be >= 0");
                throw null;
            }
            byte[] bArr = new byte[Math.max(i14, 20)];
            this.f6657d = bArr;
            this.f6658e = bArr.length;
        }

        public final void G(int i14) {
            int i15 = this.f6659f;
            int i16 = i15 + 1;
            this.f6659f = i16;
            byte[] bArr = this.f6657d;
            bArr[i15] = (byte) (i14 & 255);
            int i17 = i15 + 2;
            this.f6659f = i17;
            bArr[i16] = (byte) ((i14 >> 8) & 255);
            int i18 = i15 + 3;
            this.f6659f = i18;
            bArr[i17] = (byte) ((i14 >> 16) & 255);
            this.f6659f = i15 + 4;
            bArr[i18] = (byte) ((i14 >> 24) & 255);
        }

        public final void H(long j8) {
            int i14 = this.f6659f;
            int i15 = i14 + 1;
            this.f6659f = i15;
            byte[] bArr = this.f6657d;
            bArr[i14] = (byte) (j8 & 255);
            int i16 = i14 + 2;
            this.f6659f = i16;
            bArr[i15] = (byte) ((j8 >> 8) & 255);
            int i17 = i14 + 3;
            this.f6659f = i17;
            bArr[i16] = (byte) ((j8 >> 16) & 255);
            int i18 = i14 + 4;
            this.f6659f = i18;
            bArr[i17] = (byte) (255 & (j8 >> 24));
            int i19 = i14 + 5;
            this.f6659f = i19;
            bArr[i18] = (byte) (((int) (j8 >> 32)) & 255);
            int i24 = i14 + 6;
            this.f6659f = i24;
            bArr[i19] = (byte) (((int) (j8 >> 40)) & 255);
            int i25 = i14 + 7;
            this.f6659f = i25;
            bArr[i24] = (byte) (((int) (j8 >> 48)) & 255);
            this.f6659f = i14 + 8;
            bArr[i25] = (byte) (((int) (j8 >> 56)) & 255);
        }

        public final void I(int i14, int i15) {
            J((i14 << 3) | i15);
        }

        public final void J(int i14) {
            boolean z14 = CodedOutputStream.f6655c;
            byte[] bArr = this.f6657d;
            if (z14) {
                while (true) {
                    int i15 = i14 & (-128);
                    int i16 = this.f6659f;
                    if (i15 == 0) {
                        this.f6659f = i16 + 1;
                        p1.j(bArr, i16, (byte) i14);
                        return;
                    } else {
                        this.f6659f = i16 + 1;
                        p1.j(bArr, i16, (byte) ((i14 | 128) & 255));
                        i14 >>>= 7;
                    }
                }
            } else {
                while (true) {
                    int i17 = i14 & (-128);
                    int i18 = this.f6659f;
                    if (i17 == 0) {
                        this.f6659f = i18 + 1;
                        bArr[i18] = (byte) i14;
                        return;
                    } else {
                        this.f6659f = i18 + 1;
                        bArr[i18] = (byte) ((i14 | 128) & 255);
                        i14 >>>= 7;
                    }
                }
            }
        }

        public final void K(long j8) {
            boolean z14 = CodedOutputStream.f6655c;
            byte[] bArr = this.f6657d;
            if (z14) {
                while (true) {
                    long j14 = j8 & (-128);
                    int i14 = this.f6659f;
                    if (j14 == 0) {
                        this.f6659f = i14 + 1;
                        p1.j(bArr, i14, (byte) j8);
                        return;
                    } else {
                        this.f6659f = i14 + 1;
                        p1.j(bArr, i14, (byte) ((((int) j8) | 128) & 255));
                        j8 >>>= 7;
                    }
                }
            } else {
                while (true) {
                    long j15 = j8 & (-128);
                    int i15 = this.f6659f;
                    if (j15 == 0) {
                        this.f6659f = i15 + 1;
                        bArr[i15] = (byte) j8;
                        return;
                    } else {
                        this.f6659f = i15 + 1;
                        bArr[i15] = (byte) ((((int) j8) | 128) & 255);
                        j8 >>>= 7;
                    }
                }
            }
        }
    }

    public static class c extends CodedOutputStream {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f6660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6662f;

        public c(byte[] bArr, int i14, int i15) {
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
            this.f6660d = bArr;
            this.f6662f = i14;
            this.f6661e = i16;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A(String str) throws OutOfSpaceException {
            int i14 = this.f6662f;
            try {
                int iH = CodedOutputStream.h(str.length() * 3);
                int iH2 = CodedOutputStream.h(str.length());
                int i15 = this.f6661e;
                byte[] bArr = this.f6660d;
                if (iH2 != iH) {
                    D(q1.a(str));
                    int i16 = this.f6662f;
                    this.f6662f = q1.f6808a.b(str, bArr, i16, i15 - i16);
                    return;
                }
                int i17 = i14 + iH2;
                this.f6662f = i17;
                int iB = q1.f6808a.b(str, bArr, i17, i15 - i17);
                this.f6662f = i14;
                D((iB - i14) - iH2);
                this.f6662f = iB;
            } catch (q1.d e4) {
                this.f6662f = i14;
                j(str, e4);
            } catch (IndexOutOfBoundsException e14) {
                throw new OutOfSpaceException(e14);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B(int i14, int i15) throws OutOfSpaceException {
            D((i14 << 3) | i15);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C(int i14, int i15) throws OutOfSpaceException {
            B(i14, 0);
            D(i15);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i14) throws OutOfSpaceException {
            while (true) {
                int i15 = i14 & (-128);
                byte[] bArr = this.f6660d;
                if (i15 == 0) {
                    int i16 = this.f6662f;
                    this.f6662f = i16 + 1;
                    bArr[i16] = (byte) i14;
                    return;
                } else {
                    try {
                        int i17 = this.f6662f;
                        this.f6662f = i17 + 1;
                        bArr[i17] = (byte) ((i14 | 128) & 255);
                        i14 >>>= 7;
                    } catch (IndexOutOfBoundsException e4) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6662f), Integer.valueOf(this.f6661e), 1), e4);
                    }
                }
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6662f), Integer.valueOf(this.f6661e), 1), e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E(int i14, long j8) throws OutOfSpaceException {
            B(i14, 0);
            F(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F(long j8) throws OutOfSpaceException {
            boolean z14 = CodedOutputStream.f6655c;
            int i14 = this.f6661e;
            byte[] bArr = this.f6660d;
            if (!z14 || i14 - this.f6662f < 10) {
                while (true) {
                    long j14 = j8 & (-128);
                    int i15 = this.f6662f;
                    if (j14 == 0) {
                        this.f6662f = i15 + 1;
                        bArr[i15] = (byte) j8;
                        return;
                    } else {
                        try {
                            this.f6662f = i15 + 1;
                            bArr[i15] = (byte) ((((int) j8) | 128) & 255);
                            j8 >>>= 7;
                        } catch (IndexOutOfBoundsException e4) {
                            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6662f), Integer.valueOf(i14), 1), e4);
                        }
                    }
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6662f), Integer.valueOf(i14), 1), e4);
                }
            }
            while (true) {
                long j15 = j8 & (-128);
                int i16 = this.f6662f;
                if (j15 == 0) {
                    this.f6662f = i16 + 1;
                    p1.j(bArr, i16, (byte) j8);
                    return;
                } else {
                    this.f6662f = i16 + 1;
                    p1.j(bArr, i16, (byte) ((((int) j8) | 128) & 255));
                    j8 >>>= 7;
                }
            }
        }

        public final void G(byte[] bArr, int i14, int i15) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i14, this.f6660d, this.f6662f, i15);
                this.f6662f += i15;
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6662f), Integer.valueOf(this.f6661e), Integer.valueOf(i15)), e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final void a(byte[] bArr, int i14, int i15) throws OutOfSpaceException {
            G(bArr, i14, i15);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k(byte b14) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f6660d;
                int i14 = this.f6662f;
                this.f6662f = i14 + 1;
                bArr[i14] = b14;
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6662f), Integer.valueOf(this.f6661e), 1), e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void l(int i14, boolean z14) throws OutOfSpaceException {
            B(i14, 0);
            k(z14 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void m(int i14, byte[] bArr) throws OutOfSpaceException {
            D(i14);
            G(bArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void n(int i14, h hVar) throws OutOfSpaceException {
            B(i14, 2);
            o(hVar);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o(h hVar) throws OutOfSpaceException {
            D(hVar.size());
            hVar.i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void p(int i14, int i15) throws OutOfSpaceException {
            B(i14, 5);
            q(i15);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void q(int i14) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f6660d;
                int i15 = this.f6662f;
                int i16 = i15 + 1;
                this.f6662f = i16;
                bArr[i15] = (byte) (i14 & 255);
                int i17 = i15 + 2;
                this.f6662f = i17;
                bArr[i16] = (byte) ((i14 >> 8) & 255);
                int i18 = i15 + 3;
                this.f6662f = i18;
                bArr[i17] = (byte) ((i14 >> 16) & 255);
                this.f6662f = i15 + 4;
                bArr[i18] = (byte) ((i14 >> 24) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6662f), Integer.valueOf(this.f6661e), 1), e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void r(int i14, long j8) throws OutOfSpaceException {
            B(i14, 1);
            s(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s(long j8) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f6660d;
                int i14 = this.f6662f;
                int i15 = i14 + 1;
                this.f6662f = i15;
                bArr[i14] = (byte) (((int) j8) & 255);
                int i16 = i14 + 2;
                this.f6662f = i16;
                bArr[i15] = (byte) (((int) (j8 >> 8)) & 255);
                int i17 = i14 + 3;
                this.f6662f = i17;
                bArr[i16] = (byte) (((int) (j8 >> 16)) & 255);
                int i18 = i14 + 4;
                this.f6662f = i18;
                bArr[i17] = (byte) (((int) (j8 >> 24)) & 255);
                int i19 = i14 + 5;
                this.f6662f = i19;
                bArr[i18] = (byte) (((int) (j8 >> 32)) & 255);
                int i24 = i14 + 6;
                this.f6662f = i24;
                bArr[i19] = (byte) (((int) (j8 >> 40)) & 255);
                int i25 = i14 + 7;
                this.f6662f = i25;
                bArr[i24] = (byte) (((int) (j8 >> 48)) & 255);
                this.f6662f = i14 + 8;
                bArr[i25] = (byte) (((int) (j8 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6662f), Integer.valueOf(this.f6661e), 1), e4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t(int i14, int i15) throws OutOfSpaceException {
            B(i14, 0);
            u(i15);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(int i14) throws OutOfSpaceException {
            if (i14 >= 0) {
                D(i14);
            } else {
                F(i14);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v(int i14, q0 q0Var, g1 g1Var) throws OutOfSpaceException {
            B(i14, 2);
            D(((androidx.datastore.preferences.protobuf.a) q0Var).d(g1Var));
            g1Var.d(q0Var, this.f6656a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w(q0 q0Var) throws OutOfSpaceException {
            D(q0Var.getSerializedSize());
            q0Var.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i14, q0 q0Var) throws OutOfSpaceException {
            B(1, 3);
            C(2, i14);
            B(3, 2);
            w(q0Var);
            B(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y(int i14, h hVar) throws OutOfSpaceException {
            B(1, 3);
            C(2, i14);
            n(3, hVar);
            B(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z(int i14, String str) throws OutOfSpaceException {
            B(i14, 2);
            A(str);
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final OutputStream f6663g;

        public d(OutputStream outputStream, int i14) {
            super(i14);
            if (outputStream != null) {
                this.f6663g = outputStream;
            } else {
                j20.x.l("out");
                throw null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iH = CodedOutputStream.h(length);
                int i14 = iH + length;
                int i15 = this.f6658e;
                if (i14 > i15) {
                    byte[] bArr = new byte[length];
                    int iB = q1.f6808a.b(str, bArr, 0, length);
                    D(iB);
                    N(bArr, 0, iB);
                    return;
                }
                if (i14 > i15 - this.f6659f) {
                    L();
                }
                int iH2 = CodedOutputStream.h(str.length());
                int i16 = this.f6659f;
                byte[] bArr2 = this.f6657d;
                try {
                    try {
                        if (iH2 == iH) {
                            int i17 = i16 + iH2;
                            this.f6659f = i17;
                            int iB2 = q1.f6808a.b(str, bArr2, i17, i15 - i17);
                            this.f6659f = i16;
                            J((iB2 - i16) - iH2);
                            this.f6659f = iB2;
                        } else {
                            int iA = q1.a(str);
                            J(iA);
                            this.f6659f = q1.f6808a.b(str, bArr2, this.f6659f, iA);
                        }
                    } catch (q1.d e4) {
                        this.f6659f = i16;
                        throw e4;
                    }
                } catch (ArrayIndexOutOfBoundsException e14) {
                    throw new OutOfSpaceException(e14);
                }
            } catch (q1.d e15) {
                j(str, e15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B(int i14, int i15) throws IOException {
            D((i14 << 3) | i15);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C(int i14, int i15) throws IOException {
            M(20);
            I(i14, 0);
            J(i15);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i14) throws IOException {
            M(5);
            J(i14);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E(int i14, long j8) throws IOException {
            M(20);
            I(i14, 0);
            K(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F(long j8) throws IOException {
            M(10);
            K(j8);
        }

        public final void L() throws IOException {
            this.f6663g.write(this.f6657d, 0, this.f6659f);
            this.f6659f = 0;
        }

        public final void M(int i14) throws IOException {
            if (this.f6658e - this.f6659f < i14) {
                L();
            }
        }

        public final void N(byte[] bArr, int i14, int i15) throws IOException {
            int i16 = this.f6659f;
            int i17 = this.f6658e;
            int i18 = i17 - i16;
            byte[] bArr2 = this.f6657d;
            if (i18 >= i15) {
                System.arraycopy(bArr, i14, bArr2, i16, i15);
                this.f6659f += i15;
                return;
            }
            System.arraycopy(bArr, i14, bArr2, i16, i18);
            int i19 = i14 + i18;
            int i24 = i15 - i18;
            this.f6659f = i17;
            L();
            if (i24 > i17) {
                this.f6663g.write(bArr, i19, i24);
            } else {
                System.arraycopy(bArr, i19, bArr2, 0, i24);
                this.f6659f = i24;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final void a(byte[] bArr, int i14, int i15) throws IOException {
            N(bArr, i14, i15);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k(byte b14) throws IOException {
            if (this.f6659f == this.f6658e) {
                L();
            }
            int i14 = this.f6659f;
            this.f6659f = i14 + 1;
            this.f6657d[i14] = b14;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void l(int i14, boolean z14) throws IOException {
            M(11);
            I(i14, 0);
            byte b14 = z14 ? (byte) 1 : (byte) 0;
            int i15 = this.f6659f;
            this.f6659f = i15 + 1;
            this.f6657d[i15] = b14;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void m(int i14, byte[] bArr) throws IOException {
            D(i14);
            N(bArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void n(int i14, h hVar) throws IOException {
            B(i14, 2);
            o(hVar);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o(h hVar) throws IOException {
            D(hVar.size());
            hVar.i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void p(int i14, int i15) throws IOException {
            M(14);
            I(i14, 5);
            G(i15);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void q(int i14) throws IOException {
            M(4);
            G(i14);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void r(int i14, long j8) throws IOException {
            M(18);
            I(i14, 1);
            H(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s(long j8) throws IOException {
            M(8);
            H(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t(int i14, int i15) throws IOException {
            M(20);
            I(i14, 0);
            if (i15 >= 0) {
                J(i15);
            } else {
                K(i15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(int i14) throws IOException {
            if (i14 >= 0) {
                D(i14);
            } else {
                F(i14);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v(int i14, q0 q0Var, g1 g1Var) throws IOException {
            B(i14, 2);
            D(((androidx.datastore.preferences.protobuf.a) q0Var).d(g1Var));
            g1Var.d(q0Var, this.f6656a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w(q0 q0Var) throws IOException {
            D(q0Var.getSerializedSize());
            q0Var.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i14, q0 q0Var) throws IOException {
            B(1, 3);
            C(2, i14);
            B(3, 2);
            w(q0Var);
            B(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y(int i14, h hVar) throws IOException {
            B(1, 3);
            C(2, i14);
            n(3, hVar);
            B(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z(int i14, String str) throws IOException {
            B(i14, 2);
            A(str);
        }
    }

    public static int b(int i14, h hVar) {
        int iG = g(i14);
        int size = hVar.size();
        return h(size) + size + iG;
    }

    public static int c(c0 c0Var) {
        int serializedSize;
        if (c0Var.f6687d != null) {
            serializedSize = c0Var.f6687d.size();
        } else {
            h hVar = c0Var.f6684a;
            if (hVar != null) {
                serializedSize = hVar.size();
            } else {
                serializedSize = c0Var.f6686c != null ? c0Var.f6686c.getSerializedSize() : 0;
            }
        }
        return h(serializedSize) + serializedSize;
    }

    public static int d(int i14) {
        return h((i14 >> 31) ^ (i14 << 1));
    }

    public static int e(long j8) {
        return i((j8 >> 63) ^ (j8 << 1));
    }

    public static int f(String str) {
        int length;
        try {
            length = q1.a(str);
        } catch (q1.d unused) {
            length = str.getBytes(z.f6936a).length;
        }
        return h(length) + length;
    }

    public static int g(int i14) {
        return h(i14 << 3);
    }

    public static int h(int i14) {
        return (352 - (Integer.numberOfLeadingZeros(i14) * 9)) >>> 6;
    }

    public static int i(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    public abstract void A(String str);

    public abstract void B(int i14, int i15);

    public abstract void C(int i14, int i15);

    public abstract void D(int i14);

    public abstract void E(int i14, long j8);

    public abstract void F(long j8);

    public final void j(String str, q1.d dVar) throws OutOfSpaceException {
        f6654b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(z.f6936a);
        try {
            D(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e4) {
            throw new OutOfSpaceException(e4);
        }
    }

    public abstract void k(byte b14);

    public abstract void l(int i14, boolean z14);

    public abstract void m(int i14, byte[] bArr);

    public abstract void n(int i14, h hVar);

    public abstract void o(h hVar);

    public abstract void p(int i14, int i15);

    public abstract void q(int i14);

    public abstract void r(int i14, long j8);

    public abstract void s(long j8);

    public abstract void t(int i14, int i15);

    public abstract void u(int i14);

    public abstract void v(int i14, q0 q0Var, g1 g1Var);

    public abstract void w(q0 q0Var);

    public abstract void x(int i14, q0 q0Var);

    public abstract void y(int i14, h hVar);

    public abstract void z(int i14, String str);

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
