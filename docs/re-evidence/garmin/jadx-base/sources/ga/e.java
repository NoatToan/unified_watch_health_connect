package ga;

import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.math.DoubleMath;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f76514a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f76515b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f76516c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f76517d = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76519b;

        public a(int i14, int i15) {
            this.f76518a = i14;
            this.f76519b = i15;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76521b;

        public b(int i14, int i15, int i16) {
            this.f76520a = i14;
            this.f76521b = i15;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f76523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f76524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f76525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f76526e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f76527f;

        public c(int i14, boolean z14, int i15, int i16, int[] iArr, int i17) {
            this.f76522a = i14;
            this.f76523b = z14;
            this.f76524c = i15;
            this.f76525d = i16;
            this.f76526e = iArr;
            this.f76527f = i17;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList<c> f76528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f76529b;

        public d(List<c> list, int[] iArr) {
            this.f76528a = ImmutableList.copyOf((Collection) list);
            this.f76529b = iArr;
        }
    }

    /* JADX INFO: renamed from: ga.e$e, reason: collision with other inner class name */
    public static final class C1538e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f76532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f76533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f76534e;

        public C1538e(int i14, int i15, int i16, int i17, int i18) {
            this.f76530a = i14;
            this.f76531b = i15;
            this.f76532c = i16;
            this.f76533d = i17;
            this.f76534e = i18;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList<C1538e> f76535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f76536b;

        public f(List<C1538e> list, int[] iArr) {
            this.f76535a = ImmutableList.copyOf((Collection) list);
            this.f76536b = iArr;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76537a;

        public g(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26) {
            this.f76537a = i17;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f76538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f76540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f76541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f76542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f76543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f76544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f76545h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f76546i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f76547j;

        public h(b bVar, c cVar, int i14, int i15, int i16, int i17, int i18, int i19, float f14, int i24, int i25, int i26, int i27) {
            this.f76538a = cVar;
            this.f76539b = i15;
            this.f76540c = i16;
            this.f76541d = i18;
            this.f76542e = i19;
            this.f76543f = f14;
            this.f76544g = i24;
            this.f76545h = i25;
            this.f76546i = i26;
            this.f76547j = i27;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f76550c;

        public i(int i14, int i15, int i16) {
            this.f76548a = i14;
            this.f76549b = i15;
            this.f76550c = i16;
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList<i> f76551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f76552b;

        public j(List<i> list, int[] iArr) {
            this.f76551a = ImmutableList.copyOf((Collection) list);
            this.f76552b = iArr;
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList<a> f76553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f76554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f76555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j f76556d;

        public k(b bVar, List<a> list, d dVar, f fVar, j jVar) {
            this.f76553a = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
            this.f76554b = dVar;
            this.f76555c = fVar;
            this.f76556d = jVar;
        }
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f76559c;

        public l(int i14, int i15, boolean z14) {
            this.f76557a = i14;
            this.f76558b = i15;
            this.f76559c = z14;
        }
    }

    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f76562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f76563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f76564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f76565f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f76566g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f76567h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f76568i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f76569j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f76570k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f76571l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f76572m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f76573n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f76574o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f76575p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f76576q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f76577r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f76578s;

        public m(int i14, int i15, int i16, int i17, int i18, int i19, int i24, float f14, int i25, int i26, boolean z14, boolean z15, int i27, int i28, int i29, boolean z16, int i30, int i34, int i35, int i36) {
            this.f76560a = i14;
            this.f76561b = i15;
            this.f76562c = i16;
            this.f76563d = i17;
            this.f76564e = i19;
            this.f76565f = i24;
            this.f76566g = f14;
            this.f76567h = i25;
            this.f76568i = i26;
            this.f76569j = z14;
            this.f76570k = z15;
            this.f76571l = i27;
            this.f76572m = i28;
            this.f76573n = i29;
            this.f76574o = z16;
            this.f76575p = i30;
            this.f76576q = i34;
            this.f76577r = i35;
            this.f76578s = i36;
        }
    }

    private e() {
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i14, int i15, boolean[] zArr) {
        int i16 = i15 - i14;
        fa.a.d(i16 >= 0);
        if (i16 == 0) {
            return i15;
        }
        if (zArr[0]) {
            a(zArr);
            return i14 - 3;
        }
        if (i16 > 1 && zArr[1] && bArr[i14] == 1) {
            a(zArr);
            return i14 - 2;
        }
        if (i16 > 2 && zArr[2] && bArr[i14] == 0 && bArr[i14 + 1] == 1) {
            a(zArr);
            return i14 - 1;
        }
        int i17 = i15 - 1;
        int i18 = i14 + 2;
        while (i18 < i17) {
            byte b14 = bArr[i18];
            if ((b14 & 254) == 0) {
                int i19 = i18 - 2;
                if (bArr[i19] == 0 && bArr[i18 - 1] == 0 && b14 == 1) {
                    a(zArr);
                    return i19;
                }
                i18 -= 2;
            }
            i18 += 3;
        }
        zArr[0] = i16 <= 2 ? !(i16 != 2 ? !(zArr[1] && bArr[i17] == 1) : !(zArr[2] && bArr[i15 + (-2)] == 0 && bArr[i17] == 1)) : bArr[i15 + (-3)] == 0 && bArr[i15 + (-2)] == 0 && bArr[i17] == 1;
        zArr[1] = i16 <= 1 ? zArr[2] && bArr[i17] == 0 : bArr[i15 + (-2)] == 0 && bArr[i17] == 0;
        zArr[2] = bArr[i17] == 0;
        return i15;
    }

    public static boolean c(byte b14) {
        if (((b14 & 96) >> 5) != 0) {
            return true;
        }
        int i14 = b14 & Ascii.US;
        return (i14 == 1 || i14 == 9 || i14 == 14) ? false : true;
    }

    public static b d(ga.f fVar) {
        fVar.i();
        return new b(fVar.e(6), fVar.e(6), fVar.e(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static c e(ga.f fVar, boolean z14, int i14, c cVar) {
        int[] iArr;
        int i15;
        boolean z15;
        int i16;
        int i17;
        boolean zD;
        int iE;
        int i18;
        int i19;
        int[] iArr2 = new int[6];
        if (!z14) {
            if (cVar != null) {
                int i24 = cVar.f76522a;
                zD = cVar.f76523b;
                iE = cVar.f76524c;
                i18 = cVar.f76525d;
                iArr2 = cVar.f76526e;
                i15 = i24;
            } else {
                iArr = iArr2;
                i15 = 0;
                z15 = false;
                i16 = 0;
                i17 = 0;
            }
            int iE2 = fVar.e(8);
            i19 = 0;
            for (int i25 = 0; i25 < i14; i25++) {
                if (fVar.d()) {
                    i19 += 88;
                }
                if (fVar.d()) {
                    i19 += 8;
                }
            }
            fVar.j(i19);
            if (i14 > 0) {
                fVar.j((8 - i14) * 2);
            }
            return new c(i15, z15, i16, i17, iArr, iE2);
        }
        int iE3 = fVar.e(2);
        zD = fVar.d();
        iE = fVar.e(5);
        i18 = 0;
        for (int i26 = 0; i26 < 32; i26++) {
            if (fVar.d()) {
                i18 |= 1 << i26;
            }
        }
        for (int i27 = 0; i27 < 6; i27++) {
            iArr2[i27] = fVar.e(8);
        }
        i15 = iE3;
        iArr = iArr2;
        z15 = zD;
        i16 = iE;
        i17 = i18;
        int iE4 = fVar.e(8);
        i19 = 0;
        while (i25 < i14) {
            if (fVar.d()) {
                i19 += 88;
            }
            if (fVar.d()) {
                i19 += 8;
            }
        }
        fVar.j(i19);
        if (i14 > 0) {
            fVar.j((8 - i14) * 2);
        }
        return new c(i15, z15, i16, i17, iArr, iE4);
    }

    public static g f(int i14, int i15, byte[] bArr) {
        byte b14;
        int i16 = i14 + 2;
        do {
            i15--;
            b14 = bArr[i15];
            if (b14 != 0) {
                break;
            }
        } while (i15 > i16);
        if (b14 == 0 || i15 <= i16) {
            return null;
        }
        ga.f fVar = new ga.f(bArr, i16, i15 + 1);
        while (fVar.b(16)) {
            int iE = fVar.e(8);
            int i17 = 0;
            while (iE == 255) {
                i17 += 255;
                iE = fVar.e(8);
            }
            int i18 = i17 + iE;
            int iE2 = fVar.e(8);
            int i19 = 0;
            while (iE2 == 255) {
                i19 += 255;
                iE2 = fVar.e(8);
            }
            int i24 = i19 + iE2;
            if (i24 == 0 || !fVar.b(i24)) {
                return null;
            }
            if (i18 == 176) {
                int iF = fVar.f();
                boolean zD = fVar.d();
                int iF2 = zD ? fVar.f() : 0;
                int iF3 = fVar.f();
                int iF4 = -1;
                int iF5 = -1;
                int iE3 = -1;
                int iE4 = -1;
                int i25 = -1;
                int iE5 = -1;
                for (int i26 = 0; i26 <= iF3; i26++) {
                    iF4 = fVar.f();
                    iF5 = fVar.f();
                    iE3 = fVar.e(6);
                    if (iE3 == 63) {
                        return null;
                    }
                    iE4 = fVar.e(iE3 == 0 ? Math.max(0, iF - 30) : Math.max(0, (iE3 + iF) - 31));
                    if (zD) {
                        int iE6 = fVar.e(6);
                        if (iE6 == 63) {
                            return null;
                        }
                        i25 = iE6;
                        iE5 = fVar.e(iE6 == 0 ? Math.max(0, iF2 - 30) : Math.max(0, (iE6 + iF2) - 31));
                    }
                    if (fVar.d()) {
                        fVar.j(10);
                    }
                }
                return new g(iF, iF2, iF3 + 1, iF4, iF5, iE3, iE4, i25, iE5);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:154:0x029d  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:170:0x0305  */
    /* JADX WARN: Code duplicated, block: B:172:0x030c A[LOOP:12: B:171:0x030a->B:172:0x030c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0320  */
    /* JADX WARN: Code duplicated, block: B:177:0x0326  */
    /* JADX WARN: Code duplicated, block: B:179:0x0330  */
    /* JADX WARN: Code duplicated, block: B:181:0x033c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x0342  */
    /* JADX WARN: Code duplicated, block: B:185:0x0346  */
    /* JADX WARN: Code duplicated, block: B:186:0x034b  */
    /* JADX WARN: Code duplicated, block: B:189:0x0356  */
    /* JADX WARN: Code duplicated, block: B:192:0x035f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0369  */
    /* JADX WARN: Code duplicated, block: B:195:0x036c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0373  */
    /* JADX WARN: Code duplicated, block: B:199:0x0389  */
    /* JADX WARN: Code duplicated, block: B:200:0x038c  */
    /* JADX WARN: Code duplicated, block: B:201:0x038e  */
    /* JADX WARN: Code duplicated, block: B:206:0x03af  */
    /* JADX WARN: Code duplicated, block: B:209:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:212:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:215:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0114 A[LOOP:0: B:62:0x0112->B:63:0x0114, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0151  */
    /* JADX WARN: Code duplicated, block: B:75:0x0156  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0160  */
    /* JADX WARN: Code duplicated, block: B:82:0x0163  */
    /* JADX WARN: Code duplicated, block: B:84:0x0169  */
    /* JADX WARN: Code duplicated, block: B:86:0x016e  */
    /* JADX WARN: Code duplicated, block: B:88:0x017e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0184 A[LOOP:3: B:90:0x0182->B:91:0x0184, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:94:0x018e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a4  */
    public static h g(byte[] bArr, int i14, int i15, k kVar) {
        int i16;
        int iF;
        int i17;
        int i18;
        int iF2;
        int iF3;
        int i19;
        int i24;
        int iF4;
        int iMax;
        int i25;
        int iF5;
        int i26;
        int[] iArrCopyOf;
        int[] iArr;
        int i27;
        int i28;
        float f14;
        int i29;
        int i30;
        int i34;
        int i35;
        int iG;
        int iH;
        int i36;
        j jVar;
        int iE;
        int iE2;
        int iE3;
        int iF6;
        int i37;
        int iF7;
        int iF8;
        int[] iArr2;
        int i38;
        int[] iArr3;
        int i39;
        int i44;
        int i45;
        boolean zD;
        int i46;
        int i47;
        int i48;
        int iMin;
        int i49;
        int i54;
        int i55;
        int i56;
        f fVar;
        b bVarD = d(new ga.f(bArr, i14, i15));
        ga.f fVar2 = new ga.f(bArr, i14 + 2, i15);
        fVar2.j(4);
        int iE4 = fVar2.e(3);
        int i57 = bVarD.f76521b;
        int i58 = 1;
        boolean z14 = i57 != 0 && iE4 == 7;
        if (kVar != null) {
            ImmutableList<a> immutableList = kVar.f76553a;
            if (immutableList.isEmpty()) {
                i16 = 0;
            } else {
                i16 = immutableList.get(Math.min(i57, immutableList.size() - 1)).f76518a;
            }
        } else {
            i16 = 0;
        }
        c cVarE = null;
        if (!z14) {
            fVar2.i();
            cVarE = e(fVar2, true, iE4, null);
        } else if (kVar != null) {
            d dVar = kVar.f76554b;
            int[] iArr4 = dVar.f76529b;
            ImmutableList<c> immutableList2 = dVar.f76528a;
            int i59 = iArr4[i16];
            if (immutableList2.size() > i59) {
                cVarE = immutableList2.get(i59);
            }
        }
        int iF9 = fVar2.f();
        if (z14) {
            int iE5 = fVar2.d() ? fVar2.e(8) : -1;
            if (kVar != null && (fVar = kVar.f76555c) != null) {
                ImmutableList<C1538e> immutableList3 = fVar.f76535a;
                if (iE5 == -1) {
                    iE5 = fVar.f76536b[i16];
                }
                if (iE5 != -1 && immutableList3.size() > iE5) {
                    C1538e c1538e = immutableList3.get(iE5);
                    iF = c1538e.f76530a;
                    i17 = c1538e.f76533d;
                    i18 = c1538e.f76534e;
                    iF2 = c1538e.f76531b;
                    iF3 = c1538e.f76532c;
                }
                iF4 = fVar2.f();
                if (z14 == 0) {
                    if (fVar2.d()) {
                        i55 = 0;
                    } else {
                        i55 = iE4;
                    }
                    i56 = i55;
                    iMax = -1;
                    while (i56 <= iE4) {
                        fVar2.f();
                        iMax = Math.max(fVar2.f(), iMax);
                        fVar2.f();
                        i56++;
                        i58 = i58;
                    }
                } else {
                    iMax = -1;
                }
                i25 = i58;
                fVar2.f();
                fVar2.f();
                fVar2.f();
                fVar2.f();
                fVar2.f();
                fVar2.f();
                if (fVar2.d()) {
                    if (z14) {
                        zD = fVar2.d();
                    } else {
                        zD = false;
                    }
                    i46 = 6;
                    if (zD) {
                        fVar2.j(6);
                    } else if (fVar2.d()) {
                        i47 = 0;
                        while (i47 < 4) {
                            i48 = 0;
                            while (i48 < i46) {
                                if (fVar2.d()) {
                                    iMin = Math.min(64, i25 << ((i47 << 1) + 4));
                                    if (i47 > i25) {
                                        fVar2.g();
                                    }
                                    for (i49 = 0; i49 < iMin; i49++) {
                                        fVar2.g();
                                    }
                                } else {
                                    fVar2.f();
                                }
                                if (i47 == 3) {
                                    i54 = 3;
                                } else {
                                    i54 = 1;
                                }
                                i48 += i54;
                                i46 = 6;
                                i25 = 1;
                            }
                            i47++;
                            i46 = 6;
                            i25 = 1;
                        }
                    }
                }
                fVar2.j(2);
                if (fVar2.d()) {
                    fVar2.j(8);
                    fVar2.f();
                    fVar2.f();
                    fVar2.i();
                }
                iF5 = fVar2.f();
                i26 = 0;
                iArrCopyOf = new int[0];
                int i64 = iMax;
                iArr = new int[0];
                i27 = -1;
                i28 = -1;
                while (i26 < iF5) {
                    if (i26 == 0 && fVar2.d()) {
                        int i65 = i27 + i28;
                        int iF10 = (1 - ((fVar2.d() ? 1 : 0) * 2)) * (fVar2.f() + 1);
                        int i66 = i65 + 1;
                        boolean[] zArr = new boolean[i66];
                        for (int i67 = 0; i67 <= i65; i67++) {
                            if (fVar2.d()) {
                                zArr[i67] = true;
                            } else {
                                zArr[i67] = fVar2.d();
                            }
                        }
                        int[] iArr5 = new int[i66];
                        int[] iArr6 = new int[i66];
                        int i68 = 0;
                        for (int i69 = i28 - 1; i69 >= 0; i69--) {
                            int i74 = iArrCopyOf[i69] + iF10;
                            if (i74 < 0 && zArr[i27 + i69]) {
                                iArr5[i68] = i74;
                                i68++;
                            }
                        }
                        if (iF10 < 0 && zArr[i65]) {
                            iArr5[i68] = iF10;
                            i68++;
                        }
                        int i75 = i68;
                        for (int i76 = 0; i76 < i27; i76++) {
                            int i77 = iArr[i76] + iF10;
                            if (i77 < 0 && zArr[i76]) {
                                iArr5[i75] = i77;
                                i75++;
                            }
                        }
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i75);
                        int i78 = 0;
                        for (int i79 = i27 - 1; i79 >= 0; i79--) {
                            int i84 = iArr[i79] + iF10;
                            if (i84 > 0 && zArr[i79]) {
                                iArr6[i78] = i84;
                                i78++;
                            }
                        }
                        if (iF10 > 0 && zArr[i65]) {
                            iArr6[i78] = iF10;
                            i78++;
                        }
                        int i85 = i75;
                        int i86 = i78;
                        for (int i87 = 0; i87 < i28; i87++) {
                            int i88 = iArrCopyOf[i87] + iF10;
                            if (i88 > 0 && zArr[i27 + i87]) {
                                iArr6[i86] = i88;
                                i86++;
                            }
                        }
                        iArrCopyOf = Arrays.copyOf(iArr6, i86);
                        i28 = i86;
                        i27 = i85;
                        iArr = iArrCopyOf2;
                    } else {
                        iF7 = fVar2.f();
                        iF8 = fVar2.f();
                        iArr2 = new int[iF7];
                        for (i38 = 0; i38 < iF7; i38++) {
                            if (i38 > 0) {
                                i45 = iArr2[i38 - 1];
                            } else {
                                i45 = 0;
                            }
                            iArr2[i38] = i45 - (fVar2.f() + 1);
                            fVar2.i();
                        }
                        iArr3 = new int[iF8];
                        for (i39 = 0; i39 < iF8; i39++) {
                            if (i39 > 0) {
                                i44 = iArr3[i39 - 1];
                            } else {
                                i44 = 0;
                            }
                            iArr3[i39] = fVar2.f() + 1 + i44;
                            fVar2.i();
                        }
                        iArr = iArr2;
                        iArrCopyOf = iArr3;
                        i28 = iF8;
                        i27 = iF7;
                    }
                    i26++;
                    iF5 = iF5;
                    bVarD = bVarD;
                    i16 = i16;
                }
                b bVar = bVarD;
                int i89 = i16;
                if (fVar2.d()) {
                    iF6 = fVar2.f();
                    for (i37 = 0; i37 < iF6; i37++) {
                        fVar2.j(iF4 + 5);
                    }
                }
                fVar2.j(2);
                f14 = 1.0f;
                if (fVar2.d()) {
                    if (fVar2.d()) {
                        iE = fVar2.e(8);
                        if (iE == 255) {
                            iE2 = fVar2.e(16);
                            iE3 = fVar2.e(16);
                            if (iE2 != 0 && iE3 != 0) {
                                f14 = iE2 / iE3;
                            }
                        } else if (iE < 17) {
                            f14 = f76515b[iE];
                        } else {
                            fb1.c.r(iE, "Unexpected aspect_ratio_idc value: ");
                        }
                    }
                    if (fVar2.d()) {
                        fVar2.i();
                    }
                    if (fVar2.d()) {
                        fVar2.j(3);
                        if (fVar2.d()) {
                            i36 = 1;
                        } else {
                            i36 = 2;
                        }
                        if (fVar2.d()) {
                            int iE6 = fVar2.e(8);
                            int iE7 = fVar2.e(8);
                            fVar2.j(8);
                            iG = androidx.media3.common.i.g(iE6);
                            iH = androidx.media3.common.i.h(iE7);
                        } else {
                            iG = -1;
                            iH = -1;
                        }
                    } else if (kVar != null || (jVar = kVar.f76556d) == null) {
                        iG = -1;
                        iH = -1;
                        i36 = -1;
                    } else {
                        ImmutableList<i> immutableList4 = jVar.f76551a;
                        int i93 = jVar.f76552b[i89];
                        if (immutableList4.size() > i93) {
                            i iVar = immutableList4.get(i93);
                            int i94 = iVar.f76548a;
                            int i95 = iVar.f76549b;
                            iH = iVar.f76550c;
                            iG = i94;
                            i36 = i95;
                        } else {
                            iG = -1;
                            iH = -1;
                            i36 = -1;
                        }
                    }
                    if (fVar2.d()) {
                        fVar2.f();
                        fVar2.f();
                    }
                    fVar2.i();
                    if (fVar2.d()) {
                        i18 *= 2;
                    }
                    i35 = iH;
                    i34 = i36;
                    i29 = i18;
                    i30 = iG;
                } else {
                    i29 = i18;
                    i30 = -1;
                    i34 = -1;
                    i35 = -1;
                }
                return new h(bVar, cVarE, iF, i24, i19, iF9, i17, i29, f14, i64, i30, i34, i35);
            }
            i24 = 0;
            i19 = 0;
            iF = 0;
            i18 = 0;
            i17 = 0;
            iF4 = fVar2.f();
            if (z14 == 0) {
                if (fVar2.d()) {
                    i55 = 0;
                } else {
                    i55 = iE4;
                }
                i56 = i55;
                iMax = -1;
                while (i56 <= iE4) {
                    fVar2.f();
                    iMax = Math.max(fVar2.f(), iMax);
                    fVar2.f();
                    i56++;
                    i58 = i58;
                }
            } else {
                iMax = -1;
            }
            i25 = i58;
            fVar2.f();
            fVar2.f();
            fVar2.f();
            fVar2.f();
            fVar2.f();
            fVar2.f();
            if (fVar2.d()) {
                if (z14) {
                    zD = fVar2.d();
                } else {
                    zD = false;
                }
                i46 = 6;
                if (zD) {
                    fVar2.j(6);
                } else if (fVar2.d()) {
                    i47 = 0;
                    while (i47 < 4) {
                        i48 = 0;
                        while (i48 < i46) {
                            if (fVar2.d()) {
                                fVar2.f();
                            } else {
                                iMin = Math.min(64, i25 << ((i47 << 1) + 4));
                                if (i47 > i25) {
                                    fVar2.g();
                                }
                                while (i49 < iMin) {
                                    fVar2.g();
                                }
                            }
                            if (i47 == 3) {
                                i54 = 3;
                            } else {
                                i54 = 1;
                            }
                            i48 += i54;
                            i46 = 6;
                            i25 = 1;
                        }
                        i47++;
                        i46 = 6;
                        i25 = 1;
                    }
                }
            }
            fVar2.j(2);
            if (fVar2.d()) {
                fVar2.j(8);
                fVar2.f();
                fVar2.f();
                fVar2.i();
            }
            iF5 = fVar2.f();
            i26 = 0;
            iArrCopyOf = new int[0];
            int i610 = iMax;
            iArr = new int[0];
            i27 = -1;
            i28 = -1;
            while (i26 < iF5) {
                if (i26 == 0) {
                    iF7 = fVar2.f();
                    iF8 = fVar2.f();
                    iArr2 = new int[iF7];
                    while (i38 < iF7) {
                        if (i38 > 0) {
                            i45 = iArr2[i38 - 1];
                        } else {
                            i45 = 0;
                        }
                        iArr2[i38] = i45 - (fVar2.f() + 1);
                        fVar2.i();
                    }
                    iArr3 = new int[iF8];
                    while (i39 < iF8) {
                        if (i39 > 0) {
                            i44 = iArr3[i39 - 1];
                        } else {
                            i44 = 0;
                        }
                        iArr3[i39] = fVar2.f() + 1 + i44;
                        fVar2.i();
                    }
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                    i28 = iF8;
                    i27 = iF7;
                } else {
                    iF7 = fVar2.f();
                    iF8 = fVar2.f();
                    iArr2 = new int[iF7];
                    while (i38 < iF7) {
                        if (i38 > 0) {
                            i45 = iArr2[i38 - 1];
                        } else {
                            i45 = 0;
                        }
                        iArr2[i38] = i45 - (fVar2.f() + 1);
                        fVar2.i();
                    }
                    iArr3 = new int[iF8];
                    while (i39 < iF8) {
                        if (i39 > 0) {
                            i44 = iArr3[i39 - 1];
                        } else {
                            i44 = 0;
                        }
                        iArr3[i39] = fVar2.f() + 1 + i44;
                        fVar2.i();
                    }
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                    i28 = iF8;
                    i27 = iF7;
                }
                i26++;
                iF5 = iF5;
                bVarD = bVarD;
                i16 = i16;
            }
            b bVar2 = bVarD;
            int i810 = i16;
            if (fVar2.d()) {
                iF6 = fVar2.f();
                while (i37 < iF6) {
                    fVar2.j(iF4 + 5);
                }
            }
            fVar2.j(2);
            f14 = 1.0f;
            if (fVar2.d()) {
                if (fVar2.d()) {
                    iE = fVar2.e(8);
                    if (iE == 255) {
                        iE2 = fVar2.e(16);
                        iE3 = fVar2.e(16);
                        if (iE2 != 0) {
                            f14 = iE2 / iE3;
                        }
                    } else if (iE < 17) {
                        f14 = f76515b[iE];
                    } else {
                        fb1.c.r(iE, "Unexpected aspect_ratio_idc value: ");
                    }
                }
                if (fVar2.d()) {
                    fVar2.i();
                }
                if (fVar2.d()) {
                    fVar2.j(3);
                    if (fVar2.d()) {
                        i36 = 1;
                    } else {
                        i36 = 2;
                    }
                    if (fVar2.d()) {
                        int iE8 = fVar2.e(8);
                        int iE9 = fVar2.e(8);
                        fVar2.j(8);
                        iG = androidx.media3.common.i.g(iE8);
                        iH = androidx.media3.common.i.h(iE9);
                    } else {
                        iG = -1;
                        iH = -1;
                    }
                } else if (kVar != null) {
                    iG = -1;
                    iH = -1;
                    i36 = -1;
                } else {
                    iG = -1;
                    iH = -1;
                    i36 = -1;
                }
                if (fVar2.d()) {
                    fVar2.f();
                    fVar2.f();
                }
                fVar2.i();
                if (fVar2.d()) {
                    i18 *= 2;
                }
                i35 = iH;
                i34 = i36;
                i29 = i18;
                i30 = iG;
            } else {
                i29 = i18;
                i30 = -1;
                i34 = -1;
                i35 = -1;
            }
            return new h(bVar2, cVarE, iF, i24, i19, iF9, i17, i29, f14, i610, i30, i34, i35);
        }
        iF = fVar2.f();
        if (iF == 3) {
            fVar2.i();
        }
        int iF11 = fVar2.f();
        int iF12 = fVar2.f();
        if (fVar2.d()) {
            int iF13 = fVar2.f();
            int iF14 = fVar2.f();
            int iF15 = fVar2.f();
            int iF16 = fVar2.f();
            iF11 -= (iF13 + iF14) * ((iF == 1 || iF == 2) ? 2 : 1);
            iF12 -= (iF15 + iF16) * (iF == 1 ? 2 : 1);
        }
        i17 = iF11;
        i18 = iF12;
        iF2 = fVar2.f();
        iF3 = fVar2.f();
        int i96 = iF3;
        i24 = iF2;
        i19 = i96;
        iF4 = fVar2.f();
        if (z14 == 0) {
            if (fVar2.d()) {
                i55 = 0;
            } else {
                i55 = iE4;
            }
            i56 = i55;
            iMax = -1;
            while (i56 <= iE4) {
                fVar2.f();
                iMax = Math.max(fVar2.f(), iMax);
                fVar2.f();
                i56++;
                i58 = i58;
            }
        } else {
            iMax = -1;
        }
        i25 = i58;
        fVar2.f();
        fVar2.f();
        fVar2.f();
        fVar2.f();
        fVar2.f();
        fVar2.f();
        if (fVar2.d()) {
            if (z14) {
                zD = fVar2.d();
            } else {
                zD = false;
            }
            i46 = 6;
            if (zD) {
                fVar2.j(6);
            } else if (fVar2.d()) {
                i47 = 0;
                while (i47 < 4) {
                    i48 = 0;
                    while (i48 < i46) {
                        if (fVar2.d()) {
                            fVar2.f();
                        } else {
                            iMin = Math.min(64, i25 << ((i47 << 1) + 4));
                            if (i47 > i25) {
                                fVar2.g();
                            }
                            while (i49 < iMin) {
                                fVar2.g();
                            }
                        }
                        if (i47 == 3) {
                            i54 = 3;
                        } else {
                            i54 = 1;
                        }
                        i48 += i54;
                        i46 = 6;
                        i25 = 1;
                    }
                    i47++;
                    i46 = 6;
                    i25 = 1;
                }
            }
        }
        fVar2.j(2);
        if (fVar2.d()) {
            fVar2.j(8);
            fVar2.f();
            fVar2.f();
            fVar2.i();
        }
        iF5 = fVar2.f();
        i26 = 0;
        iArrCopyOf = new int[0];
        int i611 = iMax;
        iArr = new int[0];
        i27 = -1;
        i28 = -1;
        while (i26 < iF5) {
            if (i26 == 0) {
                iF7 = fVar2.f();
                iF8 = fVar2.f();
                iArr2 = new int[iF7];
                while (i38 < iF7) {
                    if (i38 > 0) {
                        i45 = iArr2[i38 - 1];
                    } else {
                        i45 = 0;
                    }
                    iArr2[i38] = i45 - (fVar2.f() + 1);
                    fVar2.i();
                }
                iArr3 = new int[iF8];
                while (i39 < iF8) {
                    if (i39 > 0) {
                        i44 = iArr3[i39 - 1];
                    } else {
                        i44 = 0;
                    }
                    iArr3[i39] = fVar2.f() + 1 + i44;
                    fVar2.i();
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i28 = iF8;
                i27 = iF7;
            } else {
                iF7 = fVar2.f();
                iF8 = fVar2.f();
                iArr2 = new int[iF7];
                while (i38 < iF7) {
                    if (i38 > 0) {
                        i45 = iArr2[i38 - 1];
                    } else {
                        i45 = 0;
                    }
                    iArr2[i38] = i45 - (fVar2.f() + 1);
                    fVar2.i();
                }
                iArr3 = new int[iF8];
                while (i39 < iF8) {
                    if (i39 > 0) {
                        i44 = iArr3[i39 - 1];
                    } else {
                        i44 = 0;
                    }
                    iArr3[i39] = fVar2.f() + 1 + i44;
                    fVar2.i();
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i28 = iF8;
                i27 = iF7;
            }
            i26++;
            iF5 = iF5;
            bVarD = bVarD;
            i16 = i16;
        }
        b bVar3 = bVarD;
        int i811 = i16;
        if (fVar2.d()) {
            iF6 = fVar2.f();
            while (i37 < iF6) {
                fVar2.j(iF4 + 5);
            }
        }
        fVar2.j(2);
        f14 = 1.0f;
        if (fVar2.d()) {
            if (fVar2.d()) {
                iE = fVar2.e(8);
                if (iE == 255) {
                    iE2 = fVar2.e(16);
                    iE3 = fVar2.e(16);
                    if (iE2 != 0) {
                        f14 = iE2 / iE3;
                    }
                } else if (iE < 17) {
                    f14 = f76515b[iE];
                } else {
                    fb1.c.r(iE, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (fVar2.d()) {
                fVar2.i();
            }
            if (fVar2.d()) {
                fVar2.j(3);
                if (fVar2.d()) {
                    i36 = 1;
                } else {
                    i36 = 2;
                }
                if (fVar2.d()) {
                    int iE10 = fVar2.e(8);
                    int iE11 = fVar2.e(8);
                    fVar2.j(8);
                    iG = androidx.media3.common.i.g(iE10);
                    iH = androidx.media3.common.i.h(iE11);
                } else {
                    iG = -1;
                    iH = -1;
                }
            } else if (kVar != null) {
                iG = -1;
                iH = -1;
                i36 = -1;
            } else {
                iG = -1;
                iH = -1;
                i36 = -1;
            }
            if (fVar2.d()) {
                fVar2.f();
                fVar2.f();
            }
            fVar2.i();
            if (fVar2.d()) {
                i18 *= 2;
            }
            i35 = iH;
            i34 = i36;
            i29 = i18;
            i30 = iG;
        } else {
            i29 = i18;
            i30 = -1;
            i34 = -1;
            i35 = -1;
        }
        return new h(bVar3, cVarE, iF, i24, i19, iF9, i17, i29, f14, i611, i30, i34, i35);
    }

    /* JADX WARN: Code duplicated, block: B:479:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0120  */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:66:0x012c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x0150  */
    /* JADX WARN: Code duplicated, block: B:76:0x0155  */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static k h(int i14, int i15, byte[] bArr) {
        int[] iArr;
        int i16;
        j jVar;
        int iE;
        int iE2;
        int iE3;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean[][] zArr;
        int i25;
        int[] iArr2;
        int[] iArr3;
        boolean[][] zArr2;
        boolean z14;
        int i26;
        boolean zD;
        int i27;
        int i28;
        int i29;
        boolean zD2;
        boolean zD3;
        int iF;
        int i30;
        int i34;
        int i35;
        boolean z15;
        boolean z16;
        ga.f fVar = new ga.f(bArr, i14, i15);
        b bVarD = d(fVar);
        fVar.j(4);
        boolean zD4 = fVar.d();
        boolean zD5 = fVar.d();
        int iE4 = fVar.e(6);
        int i36 = iE4 + 1;
        int iE5 = fVar.e(3);
        fVar.j(17);
        c cVarE = e(fVar, true, iE5, null);
        for (int i37 = fVar.d() ? 0 : iE5; i37 <= iE5; i37++) {
            fVar.f();
            fVar.f();
            fVar.f();
        }
        int iE6 = fVar.e(6);
        int iF2 = fVar.f() + 1;
        int i38 = 6;
        d dVar = new d(ImmutableList.of(cVarE), new int[1]);
        boolean z17 = i36 >= 2 && iF2 >= 2;
        boolean z18 = zD4 && zD5;
        int i39 = 1;
        int i44 = iE6 + 1;
        boolean z19 = i44 >= i36;
        if (!z17 || !z18 || !z19) {
            return new k(bVarD, null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iF2, i44);
        int[] iArr5 = new int[iF2];
        int[] iArr6 = new int[iF2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i45 = 1; i45 < iF2; i45++) {
            int i46 = 0;
            for (int i47 = 0; i47 <= iE6; i47++) {
                if (fVar.d()) {
                    iArr4[i45][i46] = i47;
                    iArr6[i45] = i47;
                    i46++;
                }
                iArr5[i45] = i46;
            }
        }
        if (fVar.d()) {
            fVar.j(64);
            if (fVar.d()) {
                fVar.f();
            }
            int iF3 = fVar.f();
            int i48 = 0;
            while (i48 < iF3) {
                fVar.f();
                if (i48 == 0 || fVar.d()) {
                    boolean zD6 = fVar.d();
                    boolean zD7 = fVar.d();
                    if (zD6 || zD7) {
                        zD = fVar.d();
                        iF3 = iF3;
                        if (zD) {
                            fVar.j(19);
                        }
                        fVar.j(8);
                        if (zD) {
                            fVar.j(4);
                        }
                        fVar.j(15);
                        i28 = zD6;
                        i27 = zD7;
                    } else {
                        z16 = zD6;
                        z15 = zD7;
                    }
                    i29 = 0;
                    while (i29 <= iE5) {
                        zD2 = fVar.d();
                        if (!zD2) {
                            zD2 = fVar.d();
                        }
                        if (zD2) {
                            fVar.f();
                            zD3 = false;
                        } else {
                            zD3 = fVar.d();
                        }
                        if (zD3) {
                            iF = 0;
                        } else {
                            iF = fVar.f();
                        }
                        b bVar = bVarD;
                        i30 = i28 + i27;
                        int[][] iArr7 = iArr4;
                        i34 = 0;
                        while (i34 < i30) {
                            int i49 = i30;
                            for (i35 = 0; i35 <= iF; i35++) {
                                fVar.f();
                                fVar.f();
                                if (zD) {
                                    fVar.f();
                                    fVar.f();
                                }
                                fVar.i();
                            }
                            i34++;
                            i30 = i49;
                        }
                        i29++;
                        bVarD = bVar;
                        iArr4 = iArr7;
                    }
                    i48++;
                    iF3 = iF3;
                } else {
                    z16 = false;
                    z15 = false;
                }
                zD = false;
                i28 = z16;
                i27 = z15;
                i29 = 0;
                while (i29 <= iE5) {
                    zD2 = fVar.d();
                    if (!zD2) {
                        zD2 = fVar.d();
                    }
                    if (zD2) {
                        fVar.f();
                        zD3 = false;
                    } else {
                        zD3 = fVar.d();
                    }
                    if (zD3) {
                        iF = fVar.f();
                    } else {
                        iF = 0;
                    }
                    b bVar2 = bVarD;
                    i30 = i28 + i27;
                    int[][] iArr8 = iArr4;
                    i34 = 0;
                    while (i34 < i30) {
                        int i410 = i30;
                        while (i35 <= iF) {
                            fVar.f();
                            fVar.f();
                            if (zD) {
                                fVar.f();
                                fVar.f();
                            }
                            fVar.i();
                        }
                        i34++;
                        i30 = i410;
                    }
                    i29++;
                    bVarD = bVar2;
                    iArr4 = iArr8;
                }
                i48++;
                iF3 = iF3;
            }
        }
        b bVar3 = bVarD;
        int[][] iArr9 = iArr4;
        if (!fVar.d()) {
            return new k(bVar3, null, dVar, null, null);
        }
        int i54 = fVar.f76582d;
        if (i54 > 0) {
            fVar.j(8 - i54);
        }
        c cVarE2 = e(fVar, false, iE5, cVarE);
        boolean zD8 = fVar.d();
        boolean[] zArr3 = new boolean[16];
        b bVar4 = bVar3;
        int i55 = 0;
        for (int i56 = 0; i56 < 16; i56++) {
            boolean zD9 = fVar.d();
            zArr3[i56] = zD9;
            if (zD9) {
                i55++;
            }
        }
        if (i55 == 0 || !zArr3[1]) {
            return new k(bVar4, null, dVar, null, null);
        }
        int[] iArr10 = new int[i55];
        for (int i57 = 0; i57 < i55 - (zD8 ? 1 : 0); i57++) {
            iArr10[i57] = fVar.e(3);
        }
        int[] iArr11 = new int[i55 + 1];
        if (zD8) {
            int i58 = 1;
            while (i58 < i55) {
                int[] iArr12 = iArr11;
                for (int i59 = 0; i59 < i58; i59++) {
                    iArr12[i58] = iArr10[i59] + 1 + iArr12[i58];
                }
                i58++;
                iArr11 = iArr12;
            }
            iArr = iArr11;
            iArr[i55] = 6;
        } else {
            iArr = iArr11;
        }
        int[][] iArr13 = (int[][]) Array.newInstance((Class<?>) cls, i36, i55);
        int[] iArr14 = new int[i36];
        iArr14[0] = 0;
        boolean zD10 = fVar.d();
        int i64 = 1;
        while (i64 < i36) {
            if (zD10) {
                i26 = i64;
                iArr14[i26] = fVar.e(i38);
            } else {
                i26 = i64;
                iArr14[i26] = i26;
            }
            if (zD8) {
                int i65 = 0;
                while (i65 < i55) {
                    int i66 = i65 + 1;
                    iArr13[i26][i65] = (iArr14[i26] & ((1 << iArr[i66]) - 1)) >> iArr[i65];
                    i65 = i66;
                }
            } else {
                int i67 = 0;
                while (i67 < i55) {
                    int i68 = i67;
                    iArr13[i26][i68] = fVar.e(iArr10[i67] + 1);
                    i67 = i68 + 1;
                }
            }
            i64 = i26 + 1;
            i38 = 6;
        }
        int[] iArr15 = new int[i44];
        int i69 = 1;
        int i74 = 0;
        while (i74 < i36) {
            iArr15[iArr14[i74]] = -1;
            d dVar2 = dVar;
            int i75 = 0;
            int i76 = 0;
            while (i75 < 16) {
                if (zArr3[i75]) {
                    if (i75 == i39) {
                        iArr15[iArr14[i74]] = iArr13[i74][i76];
                    }
                    i76++;
                }
                i75++;
                i39 = 1;
            }
            if (i74 > 0) {
                int i77 = 0;
                while (true) {
                    if (i77 >= i74) {
                        z14 = true;
                        break;
                    }
                    int i78 = i77;
                    if (iArr15[iArr14[i74]] == iArr15[iArr14[i77]]) {
                        z14 = false;
                        break;
                    }
                    i77 = i78 + 1;
                }
                if (z14) {
                    i69++;
                }
            }
            i74++;
            dVar = dVar2;
            i39 = 1;
        }
        d dVar3 = dVar;
        int iE7 = fVar.e(4);
        if (i69 < 2 || iE7 == 0) {
            return new k(bVar4, null, dVar3, null, null);
        }
        int[] iArr16 = new int[i69];
        for (int i79 = 0; i79 < i69; i79++) {
            iArr16[i79] = fVar.e(iE7);
        }
        int[] iArr17 = new int[i44];
        int i84 = 0;
        while (i84 < i36) {
            int[] iArr18 = iArr17;
            iArr18[Math.min(iArr14[i84], iE6)] = i84;
            i84++;
            iArr17 = iArr18;
        }
        int[] iArr19 = iArr17;
        ImmutableList.Builder builder = ImmutableList.builder();
        int i85 = 0;
        while (i85 <= iE6) {
            int i86 = i69;
            int[] iArr20 = iArr16;
            int iMin = Math.min(iArr15[i85], i86 - 1);
            builder.add(new a(iArr19[i85], iMin >= 0 ? iArr20[iMin] : -1));
            i85++;
            i69 = i86;
            iArr5 = iArr5;
            iArr16 = iArr20;
        }
        int[] iArr21 = iArr5;
        ImmutableList immutableListBuild = builder.build();
        if (((a) immutableListBuild.get(0)).f76519b == -1) {
            return new k(bVar4, null, dVar3, null, null);
        }
        int i87 = 1;
        while (true) {
            b bVar5 = bVar4;
            if (i87 > iE6) {
                bVar4 = bVar5;
                i16 = -1;
                i87 = -1;
                break;
            }
            bVar4 = bVar5;
            i16 = -1;
            if (((a) immutableListBuild.get(i87)).f76519b != -1) {
                break;
            }
            i87++;
        }
        if (i87 == i16) {
            return new k(bVar4, null, dVar3, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i36, i36);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i36, i36);
        int i88 = 1;
        while (i88 < i36) {
            boolean[][] zArr6 = zArr5;
            for (int i89 = 0; i89 < i88; i89++) {
                boolean[] zArr7 = zArr4[i88];
                boolean[] zArr8 = zArr6[i88];
                boolean zD11 = fVar.d();
                zArr8[i89] = zD11;
                zArr7[i89] = zD11;
            }
            i88++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i93 = 1; i93 < i36; i93++) {
            int i94 = 0;
            while (i94 < iE4) {
                int i95 = i94;
                for (int i96 = 0; i96 < i93; i96++) {
                    boolean[] zArr10 = zArr9[i93];
                    if (zArr10[i96] && zArr9[i96][i95]) {
                        zArr10[i95] = true;
                        break;
                    }
                }
                i94 = i95 + 1;
            }
        }
        int[] iArr22 = new int[i44];
        int i97 = 0;
        while (i97 < i36) {
            int[] iArr23 = iArr22;
            int i98 = 0;
            for (int i99 = 0; i99 < i97; i99++) {
                i98 += zArr4[i97][i99] ? 1 : 0;
            }
            iArr23[iArr14[i97]] = i98;
            i97++;
            iArr22 = iArr23;
        }
        int[] iArr24 = iArr22;
        int i100 = 0;
        for (int i101 = 0; i101 < i36; i101++) {
            if (iArr24[iArr14[i101]] == 0) {
                i100++;
            }
        }
        if (i100 > 1) {
            return new k(bVar4, null, dVar3, null, null);
        }
        int[] iArr25 = new int[i36];
        int[] iArr26 = new int[iF2];
        if (fVar.d()) {
            int i102 = 0;
            while (i102 < i36) {
                int i103 = i102;
                iArr25[i103] = fVar.e(3);
                i102 = i103 + 1;
            }
        } else {
            Arrays.fill(iArr25, 0, i36, iE5);
        }
        int i104 = 0;
        while (i104 < iF2) {
            int[] iArr27 = iArr25;
            int i105 = i104;
            int[] iArr28 = iArr6;
            int iMax = 0;
            for (int i106 = 0; i106 < iArr21[i105]; i106++) {
                iMax = Math.max(iMax, iArr27[((a) immutableListBuild.get(iArr9[i105][i106])).f76518a]);
            }
            iArr26[i105] = iMax + 1;
            i104 = i105 + 1;
            iArr25 = iArr27;
            iArr6 = iArr28;
        }
        int[] iArr29 = iArr6;
        if (fVar.d()) {
            int i107 = 0;
            while (i107 < iE4) {
                int i108 = i107 + 1;
                int i109 = i108;
                while (i109 < i36) {
                    if (zArr4[i109][i107]) {
                        fVar.j(3);
                    }
                    i109++;
                    i107 = i107;
                }
                i107 = i108;
            }
        }
        fVar.i();
        int iF4 = fVar.f() + 1;
        ImmutableList.Builder builder2 = ImmutableList.builder();
        builder2.add(cVarE);
        if (iF4 > 1) {
            builder2.add(cVarE2);
            for (int i110 = 2; i110 < iF4; i110++) {
                cVarE2 = e(fVar, fVar.d(), iE5, cVarE2);
                builder2.add(cVarE2);
            }
        }
        ImmutableList immutableListBuild2 = builder2.build();
        int iF5 = fVar.f() + iF2;
        if (iF5 > iF2) {
            return new k(bVar4, null, dVar3, null, null);
        }
        int iE8 = fVar.e(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) cls2, iF5, i44);
        int i111 = 0;
        int[] iArr30 = new int[iF5];
        int[] iArr31 = new int[iF5];
        int i112 = 0;
        while (i112 < iF2) {
            iArr30[i112] = i111;
            iArr31[i112] = iArr29[i112];
            if (iE8 == 0) {
                i25 = i112;
                iArr2 = iArr30;
                iArr3 = iArr14;
                zArr2 = zArr11;
                Arrays.fill(zArr11[i25], i111, iArr21[i25], true);
                iArr2[i25] = iArr21[i25];
            } else {
                i25 = i112;
                iArr2 = iArr30;
                iArr3 = iArr14;
                zArr2 = zArr11;
                if (iE8 == 1) {
                    int i113 = iArr29[i25];
                    for (int i114 = 0; i114 < iArr21[i25]; i114++) {
                        zArr2[i25][i114] = iArr9[i25][i114] == i113;
                    }
                    iArr2[i25] = 1;
                } else {
                    i111 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i112 = i25 + 1;
                iArr30 = iArr2;
                iArr14 = iArr3;
                zArr11 = zArr2;
            }
            i111 = 0;
            i112 = i25 + 1;
            iArr30 = iArr2;
            iArr14 = iArr3;
            zArr11 = zArr2;
        }
        int[] iArr32 = iArr30;
        int[] iArr33 = iArr14;
        boolean[][] zArr12 = zArr11;
        int[] iArr34 = new int[i44];
        int i115 = 2;
        int[] iArr35 = new int[2];
        iArr35[1] = i44;
        iArr35[i111] = iF5;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr35);
        int i116 = 1;
        int i117 = 0;
        while (i116 < iF5) {
            if (iE8 == i115) {
                for (int i118 = 0; i118 < iArr21[i116]; i118++) {
                    zArr12[i116][i118] = fVar.d();
                    int i119 = iArr32[i116];
                    boolean z24 = zArr12[i116][i118];
                    iArr32[i116] = i119 + (z24 ? 1 : 0);
                    if (z24) {
                        iArr31[i116] = iArr9[i116][i118];
                    }
                }
            }
            if (i117 == 0) {
                i17 = 0;
                if (iArr9[i116][0] == 0 && zArr12[i116][0]) {
                    for (int i120 = 1; i120 < iArr21[i116]; i120++) {
                        if (iArr9[i116][i120] == i87 && zArr12[i116][i87]) {
                            i117 = i116;
                        }
                    }
                }
            } else {
                i17 = 0;
            }
            int i121 = i17;
            while (i121 < iArr21[i116]) {
                if (iF4 > 1) {
                    zArr13[i116][i121] = zArr12[i116][i121];
                    i24 = iE8;
                    zArr = zArr13;
                    i18 = iF4;
                    int iLog2 = DoubleMath.log2(iF4, RoundingMode.CEILING);
                    if (zArr[i116][i121]) {
                        i19 = i87;
                        break;
                    }
                    int i122 = ((a) immutableListBuild.get(iArr9[i116][i121])).f76518a;
                    int i123 = i17;
                    while (true) {
                        if (i123 >= i121) {
                            i19 = i87;
                            break;
                        }
                        i19 = i87;
                        if (zArr9[i122][((a) immutableListBuild.get(iArr9[i116][i123])).f76518a]) {
                            zArr[i116][i121] = true;
                            break;
                        }
                        i123++;
                        i87 = i19;
                    }
                    if (zArr[i116][i121]) {
                        if (i117 <= 0 || i116 != i117) {
                            fVar.j(iLog2);
                        } else {
                            iArr34[i121] = fVar.e(iLog2);
                        }
                    }
                } else {
                    i18 = iF4;
                    i19 = i87;
                    i24 = iE8;
                    zArr = zArr13;
                }
                i121++;
                iE8 = i24;
                zArr13 = zArr;
                iF4 = i18;
                i87 = i19;
            }
            int i124 = iF4;
            int i125 = i87;
            int i126 = iE8;
            boolean[][] zArr14 = zArr13;
            if (iArr32[i116] == 1 && iArr24[iArr31[i116]] > 0) {
                fVar.i();
            }
            i116++;
            iE8 = i126;
            zArr13 = zArr14;
            iF4 = i124;
            i87 = i125;
            i115 = 2;
        }
        boolean[][] zArr15 = zArr13;
        if (i117 == 0) {
            return new k(bVar4, null, dVar3, null, null);
        }
        b bVar6 = bVar4;
        int iF6 = fVar.f();
        int i127 = iF6 + 1;
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(i127);
        int[] iArr36 = new int[i36];
        int i128 = 0;
        while (i128 < i127) {
            int iE9 = fVar.e(16);
            int iE10 = fVar.e(16);
            ImmutableList immutableList = immutableListBuild;
            if (fVar.d()) {
                iE = fVar.e(2);
                if (iE == 3) {
                    fVar.i();
                }
                iE2 = fVar.e(4);
                iE3 = fVar.e(4);
            } else {
                iE = 0;
                iE2 = 0;
                iE3 = 0;
            }
            if (fVar.d()) {
                int iF7 = fVar.f();
                int iF8 = fVar.f();
                int iF9 = fVar.f();
                int iF10 = fVar.f();
                iE9 -= (iF7 + iF8) * ((iE == 1 || iE == 2) ? 2 : 1);
                iE10 -= (iF9 + iF10) * (iE == 1 ? 2 : 1);
            }
            builderBuilderWithExpectedSize.add(new C1538e(iE, iE2, iE3, iE9, iE10));
            i128++;
            immutableListBuild = immutableList;
            bVar6 = bVar6;
        }
        ImmutableList immutableList2 = immutableListBuild;
        b bVar7 = bVar6;
        if (i127 <= 1 || !fVar.d()) {
            for (int i129 = 1; i129 < i36; i129++) {
                iArr36[i129] = Math.min(i129, iF6);
            }
        } else {
            int iLog3 = DoubleMath.log2(i127, RoundingMode.CEILING);
            for (int i130 = 1; i130 < i36; i130++) {
                iArr36[i130] = fVar.e(iLog3);
            }
        }
        f fVar2 = new f(builderBuilderWithExpectedSize.build(), iArr36);
        fVar.j(2);
        for (int i131 = 1; i131 < i36; i131++) {
            if (iArr24[iArr33[i131]] == 0) {
                fVar.i();
            }
        }
        for (int i132 = 1; i132 < iF5; i132++) {
            boolean zD12 = fVar.d();
            int i133 = 0;
            while (i133 < iArr26[i132]) {
                if ((i133 <= 0 || !zD12) ? i133 == 0 : fVar.d()) {
                    for (int i134 = 0; i134 < iArr21[i132]; i134++) {
                        if (zArr15[i132][i134]) {
                            fVar.f();
                        }
                    }
                    fVar.f();
                    fVar.f();
                }
                i133++;
            }
        }
        int iF11 = fVar.f() + 2;
        if (fVar.d()) {
            fVar.j(iF11);
        } else {
            for (int i135 = 1; i135 < i36; i135++) {
                for (int i136 = 0; i136 < i135; i136++) {
                    if (zArr4[i135][i136]) {
                        fVar.j(iF11);
                    }
                }
            }
        }
        int iF12 = fVar.f();
        for (int i137 = 1; i137 <= iF12; i137++) {
            fVar.j(8);
        }
        if (fVar.d()) {
            int i138 = fVar.f76582d;
            if (i138 > 0) {
                fVar.j(8 - i138);
            }
            if (!fVar.d() ? fVar.d() : true) {
                fVar.i();
            }
            boolean zD13 = fVar.d();
            boolean zD14 = fVar.d();
            if (zD13 || zD14) {
                for (int i139 = 0; i139 < iF2; i139++) {
                    for (int i140 = 0; i140 < iArr26[i139]; i140++) {
                        boolean zD15 = zD13 ? fVar.d() : false;
                        boolean zD16 = zD14 ? fVar.d() : false;
                        if (zD15) {
                            fVar.j(32);
                        }
                        if (zD16) {
                            fVar.j(18);
                        }
                    }
                }
            }
            boolean zD17 = fVar.d();
            int iE11 = zD17 ? fVar.e(4) + 1 : i36;
            ImmutableList.Builder builderBuilderWithExpectedSize2 = ImmutableList.builderWithExpectedSize(iE11);
            int[] iArr37 = new int[i36];
            for (int i141 = 0; i141 < iE11; i141++) {
                fVar.j(3);
                int i142 = fVar.d() ? 1 : 2;
                int iG = androidx.media3.common.i.g(fVar.e(8));
                int iH = androidx.media3.common.i.h(fVar.e(8));
                fVar.j(8);
                builderBuilderWithExpectedSize2.add(new i(iG, i142, iH));
            }
            if (zD17 && iE11 > 1) {
                for (int i143 = 0; i143 < i36; i143++) {
                    iArr37[i143] = fVar.e(4);
                }
            }
            jVar = new j(builderBuilderWithExpectedSize2.build(), iArr37);
        } else {
            jVar = null;
        }
        return new k(bVar7, immutableList2, new d(immutableListBuild2, iArr34), fVar2, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203  */
    /* JADX WARN: Code duplicated, block: B:122:0x020f  */
    /* JADX WARN: Code duplicated, block: B:125:0x021a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0223  */
    /* JADX WARN: Code duplicated, block: B:131:0x022a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0236  */
    /* JADX WARN: Code duplicated, block: B:136:0x025a  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0146  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:91:0x018b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0191  */
    /* JADX WARN: Code duplicated, block: B:95:0x019b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
    public static m i(int i14, int i15, byte[] bArr) {
        int iF;
        boolean zD;
        int iF2;
        int i16;
        int i17;
        int i18;
        int iF3;
        boolean z14;
        boolean zD2;
        int i19;
        int i24;
        int i25;
        int iF4;
        int i26;
        float f14;
        int i27;
        int i28;
        int i29;
        float f15;
        int i30;
        int i34;
        int i35;
        boolean zD3;
        boolean zD4;
        int iE;
        int iE2;
        int iE3;
        int i36;
        int i37;
        ga.f fVar = new ga.f(bArr, i14 + 1, i15);
        int iE4 = fVar.e(8);
        int iE5 = fVar.e(8);
        int iE6 = fVar.e(8);
        int iF5 = fVar.f();
        if (iE4 == 100 || iE4 == 110 || iE4 == 122 || iE4 == 244 || iE4 == 44 || iE4 == 83 || iE4 == 86 || iE4 == 118 || iE4 == 128 || iE4 == 138) {
            iF = fVar.f();
            zD = iF == 3 ? fVar.d() : false;
            iF2 = fVar.f();
            int iF6 = fVar.f();
            fVar.i();
            if (fVar.d()) {
                int i38 = iF != 3 ? 8 : 12;
                i16 = 16;
                int i39 = 0;
                while (i39 < i38) {
                    if (fVar.d()) {
                        int i44 = i39 < 6 ? 16 : 64;
                        int iG = 8;
                        int i45 = 8;
                        for (int i46 = 0; i46 < i44; i46++) {
                            if (iG != 0) {
                                iG = ((fVar.g() + i45) + 256) % 256;
                            }
                            if (iG != 0) {
                                i45 = iG;
                            }
                        }
                    }
                    i39++;
                }
            } else {
                i16 = 16;
            }
            i17 = iF6;
        } else {
            iF = 1;
            i16 = 16;
            i17 = 0;
            zD = false;
            iF2 = 0;
        }
        int iF7 = fVar.f() + 4;
        int iF8 = fVar.f();
        if (iF8 != 0) {
            if (iF8 == 1) {
                boolean zD5 = fVar.d();
                fVar.g();
                fVar.g();
                iE4 = iE4;
                long jF = fVar.f();
                iF8 = iF8;
                for (int i47 = 0; i47 < jF; i47++) {
                    fVar.f();
                }
                z14 = zD5;
                i18 = 244;
                iF3 = 0;
            } else {
                i18 = 244;
                iF3 = 0;
            }
            int iF9 = fVar.f();
            fVar.i();
            int iF10 = fVar.f() + 1;
            int iF11 = fVar.f() + 1;
            zD2 = fVar.d();
            i19 = 2 - (zD2 ? 1 : 0);
            int i48 = iF11 * i19;
            if (!zD2) {
                fVar.i();
            }
            fVar.i();
            i24 = iF10 * 16;
            i25 = i48 * 16;
            if (fVar.d()) {
                int iF12 = fVar.f();
                int iF13 = fVar.f();
                int iF14 = fVar.f();
                int iF15 = fVar.f();
                if (iF == 0) {
                    i36 = 1;
                } else {
                    if (iF == 3) {
                        i36 = 1;
                    } else {
                        i36 = 2;
                    }
                    if (iF == 1) {
                        i37 = 2;
                    } else {
                        i37 = 1;
                    }
                    i19 *= i37;
                }
                i24 -= (iF12 + iF13) * i36;
                i25 -= (iF14 + iF15) * i19;
            }
            int i49 = i25;
            int i54 = i24;
            int i55 = iE4;
            int i56 = iF3;
            iF4 = ((i55 != 44 || i55 == 86 || i55 == 100 || i55 == 110 || i55 == 122 || i55 == i18) && (iE5 & 16) != 0) ? 0 : i16;
            i26 = -1;
            f14 = 1.0f;
            if (fVar.d()) {
                if (fVar.d()) {
                    iE = fVar.e(8);
                    if (iE == 255) {
                        int i57 = i16;
                        iE2 = fVar.e(i57);
                        iE3 = fVar.e(i57);
                        if (iE2 != 0 && iE3 != 0) {
                            f14 = iE2 / iE3;
                        }
                    } else if (iE < 17) {
                        f14 = f76515b[iE];
                    } else {
                        fb1.c.r(iE, "Unexpected aspect_ratio_idc value: ");
                    }
                }
                if (fVar.d()) {
                    fVar.i();
                }
                if (fVar.d()) {
                    fVar.j(3);
                    if (fVar.d()) {
                        i34 = 1;
                    } else {
                        i34 = 2;
                    }
                    if (fVar.d()) {
                        int iE7 = fVar.e(8);
                        int iE8 = fVar.e(8);
                        fVar.j(8);
                        int iG2 = androidx.media3.common.i.g(iE7);
                        int iH = androidx.media3.common.i.h(iE8);
                        i26 = iG2;
                        i35 = iH;
                    } else {
                        i35 = -1;
                    }
                } else {
                    i34 = -1;
                    i35 = -1;
                }
                if (fVar.d()) {
                    fVar.f();
                    fVar.f();
                }
                if (fVar.d()) {
                    fVar.j(65);
                }
                zD3 = fVar.d();
                if (zD3) {
                    j(fVar);
                }
                zD4 = fVar.d();
                if (zD4) {
                    j(fVar);
                }
                if (zD3 || zD4) {
                    fVar.i();
                }
                fVar.i();
                if (fVar.d()) {
                    fVar.i();
                    fVar.f();
                    fVar.f();
                    fVar.f();
                    fVar.f();
                    iF4 = fVar.f();
                    fVar.f();
                }
                f15 = f14;
                i30 = i26;
                i28 = i34;
                i29 = i35;
                i27 = iF4;
            } else {
                i27 = iF4;
                i28 = -1;
                i29 = -1;
                f15 = 1.0f;
                i30 = -1;
            }
            return new m(i55, iE5, iE6, iF5, iF9, i54, i49, f15, iF2, i17, zD, zD2, iF7, iF8, i56, z14, i30, i28, i29, i27);
        }
        iF3 = fVar.f() + 4;
        i18 = 244;
        z14 = false;
        int iF16 = fVar.f();
        fVar.i();
        int iF17 = fVar.f() + 1;
        int iF18 = fVar.f() + 1;
        zD2 = fVar.d();
        i19 = 2 - (zD2 ? 1 : 0);
        int i410 = iF18 * i19;
        if (!zD2) {
            fVar.i();
        }
        fVar.i();
        i24 = iF17 * 16;
        i25 = i410 * 16;
        if (fVar.d()) {
            int iF19 = fVar.f();
            int iF110 = fVar.f();
            int iF111 = fVar.f();
            int iF112 = fVar.f();
            if (iF == 0) {
                i36 = 1;
            } else {
                if (iF == 3) {
                    i36 = 1;
                } else {
                    i36 = 2;
                }
                if (iF == 1) {
                    i37 = 2;
                } else {
                    i37 = 1;
                }
                i19 *= i37;
            }
            i24 -= (iF19 + iF110) * i36;
            i25 -= (iF111 + iF112) * i19;
        }
        int i411 = i25;
        int i58 = i24;
        int i59 = iE4;
        int i510 = iF3;
        if (i59 != 44) {
        }
        i26 = -1;
        f14 = 1.0f;
        if (fVar.d()) {
            if (fVar.d()) {
                iE = fVar.e(8);
                if (iE == 255) {
                    int i511 = i16;
                    iE2 = fVar.e(i511);
                    iE3 = fVar.e(i511);
                    if (iE2 != 0) {
                        f14 = iE2 / iE3;
                    }
                } else if (iE < 17) {
                    f14 = f76515b[iE];
                } else {
                    fb1.c.r(iE, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (fVar.d()) {
                fVar.i();
            }
            if (fVar.d()) {
                fVar.j(3);
                if (fVar.d()) {
                    i34 = 1;
                } else {
                    i34 = 2;
                }
                if (fVar.d()) {
                    int iE9 = fVar.e(8);
                    int iE10 = fVar.e(8);
                    fVar.j(8);
                    int iG3 = androidx.media3.common.i.g(iE9);
                    int iH2 = androidx.media3.common.i.h(iE10);
                    i26 = iG3;
                    i35 = iH2;
                } else {
                    i35 = -1;
                }
            } else {
                i34 = -1;
                i35 = -1;
            }
            if (fVar.d()) {
                fVar.f();
                fVar.f();
            }
            if (fVar.d()) {
                fVar.j(65);
            }
            zD3 = fVar.d();
            if (zD3) {
                j(fVar);
            }
            zD4 = fVar.d();
            if (zD4) {
                j(fVar);
            }
            if (zD3) {
                fVar.i();
            } else {
                fVar.i();
            }
            fVar.i();
            if (fVar.d()) {
                fVar.i();
                fVar.f();
                fVar.f();
                fVar.f();
                fVar.f();
                iF4 = fVar.f();
                fVar.f();
            }
            f15 = f14;
            i30 = i26;
            i28 = i34;
            i29 = i35;
            i27 = iF4;
        } else {
            i27 = iF4;
            i28 = -1;
            i29 = -1;
            f15 = 1.0f;
            i30 = -1;
        }
        return new m(i59, iE5, iE6, iF5, iF16, i58, i411, f15, iF2, i17, zD, zD2, iF7, iF8, i510, z14, i30, i28, i29, i27);
    }

    public static void j(ga.f fVar) {
        int iF = fVar.f() + 1;
        fVar.j(8);
        for (int i14 = 0; i14 < iF; i14++) {
            fVar.f();
            fVar.f();
            fVar.i();
        }
        fVar.j(20);
    }

    public static int k(byte[] bArr, int i14) {
        int i15;
        synchronized (f76516c) {
            int i16 = 0;
            int i17 = 0;
            while (i16 < i14) {
                while (true) {
                    if (i16 >= i14 - 2) {
                        i16 = i14;
                        break;
                    }
                    try {
                        if (bArr[i16] == 0 && bArr[i16 + 1] == 0 && bArr[i16 + 2] == 3) {
                            break;
                        }
                        i16++;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (i16 < i14) {
                    int[] iArr = f76517d;
                    if (iArr.length <= i17) {
                        f76517d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f76517d[i17] = i16;
                    i16 += 3;
                    i17++;
                }
            }
            i15 = i14 - i17;
            int i18 = 0;
            int i19 = 0;
            for (int i24 = 0; i24 < i17; i24++) {
                int i25 = f76517d[i24] - i19;
                System.arraycopy(bArr, i19, bArr, i18, i25);
                int i26 = i18 + i25;
                int i27 = i26 + 1;
                bArr[i26] = 0;
                i18 = i26 + 2;
                bArr[i27] = 0;
                i19 += i25 + 3;
            }
            System.arraycopy(bArr, i19, bArr, i18, i15 - i18);
        }
        return i15;
    }
}
