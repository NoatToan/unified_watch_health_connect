package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public static final o0 f = new o0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2244b;
    public Object[] c;
    public int d;
    public boolean e;

    public o0() {
        this(0, new int[8], new Object[8], true);
    }

    public static boolean c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static o0 e() {
        return f;
    }

    public static int h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public static int i(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    public static o0 k(o0 o0Var, o0 o0Var2) {
        int i = o0Var.f2243a + o0Var2.f2243a;
        int[] iArrCopyOf = Arrays.copyOf(o0Var.f2244b, i);
        System.arraycopy(o0Var2.f2244b, 0, iArrCopyOf, o0Var.f2243a, o0Var2.f2243a);
        Object[] objArrCopyOf = Arrays.copyOf(o0Var.c, i);
        System.arraycopy(o0Var2.c, 0, objArrCopyOf, o0Var.f2243a, o0Var2.f2243a);
        return new o0(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static o0 l() {
        return new o0();
    }

    public static void p(int i, Object obj, Writer writer) throws IOException {
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
            writer.J(iA, (ByteString) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            writer.c(iA, ((Integer) obj).intValue());
        } else if (writer.B() == Writer.FieldOrder.ASCENDING) {
            writer.p(iA);
            ((o0) obj).q(writer);
            writer.r(iA);
        } else {
            writer.r(iA);
            ((o0) obj).q(writer);
            writer.p(iA);
        }
    }

    public void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        int i = this.f2243a;
        int[] iArr = this.f2244b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f2244b = Arrays.copyOf(iArr, i2);
            this.c = Arrays.copyOf(this.c, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        int i = this.f2243a;
        return i == o0Var.f2243a && c(this.f2244b, o0Var.f2244b, i) && d(this.c, o0Var.c, this.f2243a);
    }

    public int f() {
        int iZ;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f2243a; i3++) {
            int i4 = this.f2244b[i3];
            int iA = WireFormat.a(i4);
            int iB = WireFormat.b(i4);
            if (iB == 0) {
                iZ = CodedOutputStream.Z(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 1) {
                iZ = CodedOutputStream.p(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 2) {
                iZ = CodedOutputStream.h(iA, (ByteString) this.c[i3]);
            } else if (iB == 3) {
                iZ = (CodedOutputStream.W(iA) * 2) + ((o0) this.c[i3]).f();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iZ = CodedOutputStream.n(iA, ((Integer) this.c[i3]).intValue());
            }
            i2 += iZ;
        }
        this.d = i2;
        return i2;
    }

    public int g() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iK = 0;
        for (int i2 = 0; i2 < this.f2243a; i2++) {
            iK += CodedOutputStream.K(WireFormat.a(this.f2244b[i2]), (ByteString) this.c[i2]);
        }
        this.d = iK;
        return iK;
    }

    public int hashCode() {
        int i = this.f2243a;
        return ((((527 + i) * 31) + h(this.f2244b, i)) * 31) + i(this.c, this.f2243a);
    }

    public void j() {
        this.e = false;
    }

    public final void m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f2243a; i2++) {
            c0.c(sb, i, String.valueOf(WireFormat.a(this.f2244b[i2])), this.c[i2]);
        }
    }

    public void n(int i, Object obj) {
        a();
        b();
        int[] iArr = this.f2244b;
        int i2 = this.f2243a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.f2243a = i2 + 1;
    }

    public void o(Writer writer) throws IOException {
        if (writer.B() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f2243a - 1; i >= 0; i--) {
                writer.b(WireFormat.a(this.f2244b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f2243a; i2++) {
            writer.b(WireFormat.a(this.f2244b[i2]), this.c[i2]);
        }
    }

    public void q(Writer writer) throws IOException {
        if (this.f2243a == 0) {
            return;
        }
        if (writer.B() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.f2243a; i++) {
                p(this.f2244b[i], this.c[i], writer);
            }
            return;
        }
        for (int i2 = this.f2243a - 1; i2 >= 0; i2--) {
            p(this.f2244b[i2], this.c[i2], writer);
        }
    }

    public o0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.f2243a = i;
        this.f2244b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
