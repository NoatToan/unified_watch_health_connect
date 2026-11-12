package androidx.health.platform.client.proto;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w2 f7807f = new w2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f7809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f7810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7812e;

    private w2(int i14, int[] iArr, Object[] objArr, boolean z14) {
        this.f7811d = -1;
        this.f7808a = i14;
        this.f7809b = iArr;
        this.f7810c = objArr;
        this.f7812e = z14;
    }

    public static w2 c(w2 w2Var, w2 w2Var2) {
        int i14 = w2Var.f7808a + w2Var2.f7808a;
        int[] iArrCopyOf = Arrays.copyOf(w2Var.f7809b, i14);
        System.arraycopy(w2Var2.f7809b, 0, iArrCopyOf, w2Var.f7808a, w2Var2.f7808a);
        Object[] objArrCopyOf = Arrays.copyOf(w2Var.f7810c, i14);
        System.arraycopy(w2Var2.f7810c, 0, objArrCopyOf, w2Var.f7808a, w2Var2.f7808a);
        return new w2(i14, iArrCopyOf, objArrCopyOf, true);
    }

    public static w2 d() {
        return new w2();
    }

    public final void a(int i14) {
        int[] iArr = this.f7809b;
        if (i14 > iArr.length) {
            int i15 = this.f7808a;
            int i16 = (i15 / 2) + i15;
            if (i16 >= i14) {
                i14 = i16;
            }
            if (i14 < 8) {
                i14 = 8;
            }
            this.f7809b = Arrays.copyOf(iArr, i14);
            this.f7810c = Arrays.copyOf(this.f7810c, i14);
        }
    }

    public final int b() {
        int iF;
        int iH;
        int iF2;
        int i14 = this.f7811d;
        if (i14 != -1) {
            return i14;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f7808a; i16++) {
            int i17 = this.f7809b[i16];
            int i18 = i17 >>> 3;
            int i19 = i17 & 7;
            if (i19 != 0) {
                if (i19 == 1) {
                    ((Long) this.f7810c[i16]).getClass();
                    iF2 = CodedOutputStream.f(i18) + 8;
                } else if (i19 == 2) {
                    iF2 = CodedOutputStream.a(i18, (i) this.f7810c[i16]);
                } else if (i19 == 3) {
                    iF = CodedOutputStream.f(i18) * 2;
                    iH = ((w2) this.f7810c[i16]).b();
                } else {
                    if (i19 != 5) {
                        yc.l2.p(InvalidProtocolBufferException.invalidWireType());
                        return 0;
                    }
                    ((Integer) this.f7810c[i16]).getClass();
                    iF2 = CodedOutputStream.f(i18) + 4;
                }
                i15 = iF2 + i15;
            } else {
                long jLongValue = ((Long) this.f7810c[i16]).longValue();
                iF = CodedOutputStream.f(i18);
                iH = CodedOutputStream.h(jLongValue);
            }
            i15 = iH + iF + i15;
        }
        this.f7811d = i15;
        return i15;
    }

    public final void e(int i14, Object obj) {
        if (!this.f7812e) {
            com.google.protobuf.a.m();
            return;
        }
        a(this.f7808a + 1);
        int[] iArr = this.f7809b;
        int i15 = this.f7808a;
        iArr[i15] = i14;
        this.f7810c[i15] = obj;
        this.f7808a = i15 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        int i14 = this.f7808a;
        if (i14 == w2Var.f7808a) {
            int[] iArr = this.f7809b;
            int[] iArr2 = w2Var.f7809b;
            for (int i15 = 0; i15 < i14; i15++) {
                if (iArr[i15] == iArr2[i15]) {
                }
            }
            Object[] objArr = this.f7810c;
            Object[] objArr2 = w2Var.f7810c;
            int i16 = this.f7808a;
            for (int i17 = 0; i17 < i16; i17++) {
                if (objArr[i17].equals(objArr2[i17])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(d3 d3Var) {
        if (this.f7808a == 0) {
            return;
        }
        l lVar = (l) d3Var;
        lVar.getClass();
        d3.a aVar = d3.a.ASCENDING;
        for (int i14 = 0; i14 < this.f7808a; i14++) {
            int i15 = this.f7809b[i14];
            Object obj = this.f7810c[i14];
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i17 == 0) {
                lVar.g(i16, ((Long) obj).longValue());
            } else if (i17 == 1) {
                lVar.d(i16, ((Long) obj).longValue());
            } else if (i17 == 2) {
                lVar.b(i16, (i) obj);
            } else if (i17 == 3) {
                lVar.getClass();
                CodedOutputStream codedOutputStream = lVar.f7707a;
                d3.a aVar2 = d3.a.ASCENDING;
                codedOutputStream.z(i16, 3);
                ((w2) obj).f(d3Var);
                codedOutputStream.z(i16, 4);
            } else {
                if (i17 != 5) {
                    o2.c.p(InvalidProtocolBufferException.invalidWireType());
                    return;
                }
                lVar.c(i16, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i14 = this.f7808a;
        int i15 = (527 + i14) * 31;
        int[] iArr = this.f7809b;
        int iHashCode = 17;
        int i16 = 17;
        for (int i17 = 0; i17 < i14; i17++) {
            i16 = (i16 * 31) + iArr[i17];
        }
        int i18 = (i15 + i16) * 31;
        Object[] objArr = this.f7810c;
        int i19 = this.f7808a;
        for (int i24 = 0; i24 < i19; i24++) {
            iHashCode = (iHashCode * 31) + objArr[i24].hashCode();
        }
        return i18 + iHashCode;
    }

    private w2() {
        this(0, new int[8], new Object[8], true);
    }
}
