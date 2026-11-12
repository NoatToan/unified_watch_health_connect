package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class s1 {
    public static final s1 f = new s1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f9750b;
    public Object[] c;
    public int d;
    public boolean e;

    public s1() {
        this(0, new int[8], new Object[8], true);
    }

    public static s1 c() {
        return f;
    }

    public static int f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public static int g(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    public static s1 m(s1 s1Var, s1 s1Var2) {
        int i = s1Var.f9749a + s1Var2.f9749a;
        int[] iArrCopyOf = Arrays.copyOf(s1Var.f9750b, i);
        System.arraycopy(s1Var2.f9750b, 0, iArrCopyOf, s1Var.f9749a, s1Var2.f9749a);
        Object[] objArrCopyOf = Arrays.copyOf(s1Var.c, i);
        System.arraycopy(s1Var2.c, 0, objArrCopyOf, s1Var.f9749a, s1Var2.f9749a);
        return new s1(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static s1 n() {
        return new s1();
    }

    public static boolean o(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static void t(int i, Object obj, Writer writer) throws IOException {
        int iA = WireFormat.a(i);
        int iB = WireFormat.b(i);
        if (iB == 0) {
            writer.C(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            writer.m(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            writer.K(iA, (ByteString) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            writer.c(iA, ((Integer) obj).intValue());
        } else if (writer.B() == Writer.FieldOrder.ASCENDING) {
            writer.p(iA);
            ((s1) obj).u(writer);
            writer.r(iA);
        } else {
            writer.r(iA);
            ((s1) obj).u(writer);
            writer.p(iA);
        }
    }

    public void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        int i = this.f9749a;
        int[] iArr = this.f9750b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f9750b = Arrays.copyOf(iArr, i2);
            this.c = Arrays.copyOf(this.c, i2);
        }
    }

    public int d() {
        int iA0;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9749a; i3++) {
            int i4 = this.f9750b[i3];
            int iA = WireFormat.a(i4);
            int iB = WireFormat.b(i4);
            if (iB == 0) {
                iA0 = CodedOutputStream.a0(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 1) {
                iA0 = CodedOutputStream.p(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 2) {
                iA0 = CodedOutputStream.h(iA, (ByteString) this.c[i3]);
            } else if (iB == 3) {
                iA0 = (CodedOutputStream.X(iA) * 2) + ((s1) this.c[i3]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iA0 = CodedOutputStream.n(iA, ((Integer) this.c[i3]).intValue());
            }
            i2 += iA0;
        }
        this.d = i2;
        return i2;
    }

    public int e() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iL = 0;
        for (int i2 = 0; i2 < this.f9749a; i2++) {
            iL += CodedOutputStream.L(WireFormat.a(this.f9750b[i2]), (ByteString) this.c[i2]);
        }
        this.d = iL;
        return iL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        int i = this.f9749a;
        return i == s1Var.f9749a && r(this.f9750b, s1Var.f9750b, i) && o(this.c, s1Var.c, this.f9749a);
    }

    public void h() {
        this.e = false;
    }

    public int hashCode() {
        int i = this.f9749a;
        return ((((527 + i) * 31) + f(this.f9750b, i)) * 31) + g(this.c, this.f9749a);
    }

    public boolean i(int i, j jVar) throws IOException {
        a();
        int iA = WireFormat.a(i);
        int iB = WireFormat.b(i);
        if (iB == 0) {
            q(i, Long.valueOf(jVar.y()));
            return true;
        }
        if (iB == 1) {
            q(i, Long.valueOf(jVar.u()));
            return true;
        }
        if (iB == 2) {
            q(i, jVar.q());
            return true;
        }
        if (iB == 3) {
            s1 s1Var = new s1();
            s1Var.j(jVar);
            jVar.a(WireFormat.c(iA, 4));
            q(i, s1Var);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        q(i, Integer.valueOf(jVar.t()));
        return true;
    }

    public final s1 j(j jVar) throws IOException {
        int iJ;
        do {
            iJ = jVar.J();
            if (iJ == 0) {
                break;
            }
        } while (i(iJ, jVar));
        return this;
    }

    public s1 k(int i, ByteString byteString) {
        a();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        q(WireFormat.c(i, 2), byteString);
        return this;
    }

    public s1 l(int i, int i2) {
        a();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        q(WireFormat.c(i, 0), Long.valueOf(i2));
        return this;
    }

    public final void p(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f9749a; i2++) {
            r0.c(sb, i, String.valueOf(WireFormat.a(this.f9750b[i2])), this.c[i2]);
        }
    }

    public void q(int i, Object obj) {
        a();
        b();
        int[] iArr = this.f9750b;
        int i2 = this.f9749a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.f9749a = i2 + 1;
    }

    public void s(Writer writer) throws IOException {
        if (writer.B() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f9749a - 1; i >= 0; i--) {
                writer.b(WireFormat.a(this.f9750b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f9749a; i2++) {
            writer.b(WireFormat.a(this.f9750b[i2]), this.c[i2]);
        }
    }

    public void u(Writer writer) throws IOException {
        if (this.f9749a == 0) {
            return;
        }
        if (writer.B() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.f9749a; i++) {
                t(this.f9750b[i], this.c[i], writer);
            }
            return;
        }
        for (int i2 = this.f9749a - 1; i2 >= 0; i2--) {
            t(this.f9750b[i2], this.c[i2], writer);
        }
    }

    public s1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.f9749a = i;
        this.f9750b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
