package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n1 f6788f = new n1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f6790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f6791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6793e;

    private n1(int i14, int[] iArr, Object[] objArr, boolean z14) {
        this.f6792d = -1;
        this.f6789a = i14;
        this.f6790b = iArr;
        this.f6791c = objArr;
        this.f6793e = z14;
    }

    public static n1 c(n1 n1Var, n1 n1Var2) {
        int i14 = n1Var.f6789a + n1Var2.f6789a;
        int[] iArrCopyOf = Arrays.copyOf(n1Var.f6790b, i14);
        System.arraycopy(n1Var2.f6790b, 0, iArrCopyOf, n1Var.f6789a, n1Var2.f6789a);
        Object[] objArrCopyOf = Arrays.copyOf(n1Var.f6791c, i14);
        System.arraycopy(n1Var2.f6791c, 0, objArrCopyOf, n1Var.f6789a, n1Var2.f6789a);
        return new n1(i14, iArrCopyOf, objArrCopyOf, true);
    }

    public static n1 d() {
        return new n1();
    }

    public final void a(int i14) {
        int[] iArr = this.f6790b;
        if (i14 > iArr.length) {
            int i15 = this.f6789a;
            int i16 = (i15 / 2) + i15;
            if (i16 >= i14) {
                i14 = i16;
            }
            if (i14 < 8) {
                i14 = 8;
            }
            this.f6790b = Arrays.copyOf(iArr, i14);
            this.f6791c = Arrays.copyOf(this.f6791c, i14);
        }
    }

    public final int b() {
        int iG;
        int i14;
        int iG2;
        int i15 = this.f6792d;
        if (i15 != -1) {
            return i15;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f6789a; i17++) {
            int i18 = this.f6790b[i17];
            int i19 = i18 >>> 3;
            int i24 = i18 & 7;
            if (i24 != 0) {
                if (i24 == 1) {
                    ((Long) this.f6791c[i17]).getClass();
                    iG2 = CodedOutputStream.g(i19) + 8;
                } else if (i24 == 2) {
                    iG2 = CodedOutputStream.b(i19, (h) this.f6791c[i17]);
                } else if (i24 == 3) {
                    iG = CodedOutputStream.g(i19) * 2;
                    i14 = ((n1) this.f6791c[i17]).b();
                } else {
                    if (i24 != 5) {
                        l2.p(InvalidProtocolBufferException.invalidWireType());
                        return 0;
                    }
                    ((Integer) this.f6791c[i17]).getClass();
                    iG2 = CodedOutputStream.g(i19) + 4;
                }
                i16 = iG2 + i16;
            } else {
                long jLongValue = ((Long) this.f6791c[i17]).longValue();
                iG = CodedOutputStream.g(i19);
                i14 = CodedOutputStream.i(jLongValue);
            }
            i16 = i14 + iG + i16;
        }
        this.f6792d = i16;
        return i16;
    }

    public final void e(int i14, Object obj) {
        if (!this.f6793e) {
            com.google.protobuf.a.m();
            return;
        }
        a(this.f6789a + 1);
        int[] iArr = this.f6790b;
        int i15 = this.f6789a;
        iArr[i15] = i14;
        this.f6791c[i15] = obj;
        this.f6789a = i15 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        int i14 = this.f6789a;
        if (i14 == n1Var.f6789a) {
            int[] iArr = this.f6790b;
            int[] iArr2 = n1Var.f6790b;
            for (int i15 = 0; i15 < i14; i15++) {
                if (iArr[i15] == iArr2[i15]) {
                }
            }
            Object[] objArr = this.f6791c;
            Object[] objArr2 = n1Var.f6791c;
            int i16 = this.f6789a;
            for (int i17 = 0; i17 < i16; i17++) {
                if (objArr[i17].equals(objArr2[i17])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(u1 u1Var) {
        if (this.f6789a == 0) {
            return;
        }
        k kVar = (k) u1Var;
        kVar.getClass();
        u1.a aVar = u1.a.ASCENDING;
        for (int i14 = 0; i14 < this.f6789a; i14++) {
            int i15 = this.f6790b[i14];
            Object obj = this.f6791c[i14];
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i17 == 0) {
                kVar.g(i16, ((Long) obj).longValue());
            } else if (i17 == 1) {
                kVar.d(i16, ((Long) obj).longValue());
            } else if (i17 == 2) {
                kVar.b(i16, (h) obj);
            } else if (i17 == 3) {
                kVar.getClass();
                CodedOutputStream codedOutputStream = kVar.f6774a;
                u1.a aVar2 = u1.a.ASCENDING;
                codedOutputStream.B(i16, 3);
                ((n1) obj).f(u1Var);
                codedOutputStream.B(i16, 4);
            } else {
                if (i17 != 5) {
                    o2.c.p(InvalidProtocolBufferException.invalidWireType());
                    return;
                }
                kVar.c(i16, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i14 = this.f6789a;
        int i15 = (527 + i14) * 31;
        int[] iArr = this.f6790b;
        int iHashCode = 17;
        int i16 = 17;
        for (int i17 = 0; i17 < i14; i17++) {
            i16 = (i16 * 31) + iArr[i17];
        }
        int i18 = (i15 + i16) * 31;
        Object[] objArr = this.f6791c;
        int i19 = this.f6789a;
        for (int i24 = 0; i24 < i19; i24++) {
            iHashCode = (iHashCode * 31) + objArr[i24].hashCode();
        }
        return i18 + iHashCode;
    }

    private n1() {
        this(0, new int[8], new Object[8], true);
    }
}
