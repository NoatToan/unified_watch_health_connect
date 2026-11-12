package androidx.health.platform.client.proto;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {
    public static final c2 f = new c2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2480b;
    public Object[] c;
    public int d;
    public boolean e;

    public c2() {
        this(0, new int[8], new Object[8], true);
    }

    public static c2 c() {
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

    public static c2 j(c2 c2Var, c2 c2Var2) {
        int i = c2Var.f2479a + c2Var2.f2479a;
        int[] iArrCopyOf = Arrays.copyOf(c2Var.f2480b, i);
        System.arraycopy(c2Var2.f2480b, 0, iArrCopyOf, c2Var.f2479a, c2Var2.f2479a);
        Object[] objArrCopyOf = Arrays.copyOf(c2Var.c, i);
        System.arraycopy(c2Var2.c, 0, objArrCopyOf, c2Var.f2479a, c2Var2.f2479a);
        return new c2(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static c2 k() {
        return new c2();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i, Object obj, Writer writer) throws IOException {
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
            ((c2) obj).r(writer);
            writer.r(iA);
        } else {
            writer.r(iA);
            ((c2) obj).r(writer);
            writer.p(iA);
        }
    }

    public void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i) {
        int[] iArr = this.f2480b;
        if (i > iArr.length) {
            int i2 = this.f2479a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f2480b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public int d() {
        int iX;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f2479a; i3++) {
            int i4 = this.f2480b[i3];
            int iA = WireFormat.a(i4);
            int iB = WireFormat.b(i4);
            if (iB == 0) {
                iX = CodedOutputStream.X(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 1) {
                iX = CodedOutputStream.p(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 2) {
                iX = CodedOutputStream.h(iA, (ByteString) this.c[i3]);
            } else if (iB == 3) {
                iX = (CodedOutputStream.U(iA) * 2) + ((c2) this.c[i3]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iX = CodedOutputStream.n(iA, ((Integer) this.c[i3]).intValue());
            }
            i2 += iX;
        }
        this.d = i2;
        return i2;
    }

    public int e() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iJ = 0;
        for (int i2 = 0; i2 < this.f2479a; i2++) {
            iJ += CodedOutputStream.J(WireFormat.a(this.f2480b[i2]), (ByteString) this.c[i2]);
        }
        this.d = iJ;
        return iJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        int i = this.f2479a;
        return i == c2Var.f2479a && o(this.f2480b, c2Var.f2480b, i) && l(this.c, c2Var.c, this.f2479a);
    }

    public void h() {
        this.e = false;
    }

    public int hashCode() {
        int i = this.f2479a;
        return ((((527 + i) * 31) + f(this.f2480b, i)) * 31) + g(this.c, this.f2479a);
    }

    public c2 i(c2 c2Var) {
        if (c2Var.equals(c())) {
            return this;
        }
        a();
        int i = this.f2479a + c2Var.f2479a;
        b(i);
        System.arraycopy(c2Var.f2480b, 0, this.f2480b, this.f2479a, c2Var.f2479a);
        System.arraycopy(c2Var.c, 0, this.c, this.f2479a, c2Var.f2479a);
        this.f2479a = i;
        return this;
    }

    public final void m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f2479a; i2++) {
            p0.d(sb, i, String.valueOf(WireFormat.a(this.f2480b[i2])), this.c[i2]);
        }
    }

    public void n(int i, Object obj) {
        a();
        b(this.f2479a + 1);
        int[] iArr = this.f2480b;
        int i2 = this.f2479a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.f2479a = i2 + 1;
    }

    public void p(Writer writer) throws IOException {
        if (writer.B() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f2479a - 1; i >= 0; i--) {
                writer.b(WireFormat.a(this.f2480b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f2479a; i2++) {
            writer.b(WireFormat.a(this.f2480b[i2]), this.c[i2]);
        }
    }

    public void r(Writer writer) throws IOException {
        if (this.f2479a == 0) {
            return;
        }
        if (writer.B() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.f2479a; i++) {
                q(this.f2480b[i], this.c[i], writer);
            }
            return;
        }
        for (int i2 = this.f2479a - 1; i2 >= 0; i2--) {
            q(this.f2480b[i2], this.c[i2], writer);
        }
    }

    public c2(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.f2479a = i;
        this.f2480b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
