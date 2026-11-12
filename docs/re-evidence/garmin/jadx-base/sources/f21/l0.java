package f21;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.t1;
import p13.u0;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.s0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f68589a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f68591b;

        static {
            int[] iArr = new int[g21.n.values().length];
            try {
                iArr[g21.n.PROTEIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g21.n.FAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g21.n.CARBS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g21.n.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f68590a = iArr;
            int[] iArr2 = new int[g21.r.values().length];
            try {
                iArr2[g21.r.FIBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[g21.r.ADDED_SUGARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[g21.r.SATURATED_FAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[g21.r.IRON.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[g21.r.CALCIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[g21.r.VITAMIN_A.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[g21.r.VITAMIN_D.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            f68591b = iArr2;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f68589a = 1;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0151  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:117:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x012f  */
    /* JADX WARN: Code duplicated, block: B:99:0x013e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v16, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static final void a(b63.o oVar, String str, List list, String str2, boolean z14, ArrayList arrayList, Float f14, Float f15, Float f16, v21.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        Float f17;
        Float f18;
        int i17;
        int i18;
        int i19;
        boolean z15;
        p3.o0 o0Var;
        Float f19;
        Float f22;
        p2 p2VarI0;
        Float f24;
        Float f25;
        ?? arrayList2;
        n92.j jVar;
        Iterator it;
        e23.l<q4.f, i53.g<Float, Float>> lVar;
        int i24;
        oVar.getClass();
        str2.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(1930493746);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(oVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(list) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(str2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(arrayList) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            f17 = f14;
            i16 |= o0VarE.B(f17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            f17 = f14;
        }
        int i25 = i15 & 128;
        if (i25 == 0) {
            if ((12582912 & i14) == 0) {
                f18 = f15;
                i16 |= o0VarE.B(f18) ? 8388608 : 4194304;
            }
            i17 = i15 & 256;
            if (i17 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.B(f16)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i16 |= i18;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(eVar)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i16 |= i24;
            }
            i19 = i16;
            if ((i19 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                if (i25 != 0) {
                    f24 = null;
                } else {
                    f24 = f18;
                }
                if (i17 != 0) {
                    f25 = null;
                } else {
                    f25 = f16;
                }
                x1 x1Var = p3.n.f135158a;
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                float f26 = v21.d.f175299c;
                if (list != null) {
                    arrayList2 = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        lVar = ((g21.y) it.next()).f75535a;
                        if (lVar != null) {
                            arrayList2.add(lVar);
                        }
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = p13.j0.f134944a;
                }
                i53.f fVarJ = i53.a.j((Iterable) arrayList2);
                boolean zQ = q(list);
                y3 y3Var = t1.f91493k;
                w5.q.b bVar = (w5.q.b) o0VarE.A(y3Var);
                y3 y3Var2 = t1.f91490h;
                g6.d dVar = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF69050b(), 1.0f);
                y3 y3Var3 = t1.f91496n;
                s0 s0Var = new s0(bVar, dVar, (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                d92.b.f58623a.getClass();
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                x0 x0Var = j92.f.f97935l;
                n92.d dVar2 = new n92.d(arrayList, s0Var, d92.c.f(x0Var, o0VarE), null, null, 24, null);
                n92.j jVar2 = new n92.j(new d02.a(), Float.valueOf(0.0f), f17, 0, 8, null);
                if (f24 != null || f25 == null) {
                    jVar = null;
                } else {
                    jVar = new n92.j(new d02.a(), f24, f25, 0, 8, null);
                }
                s0 s0Var2 = new s0((w5.q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF69050b(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                fVar.getClass();
                n92.a aVar = new n92.a(jVar2, jVar, new n92.g(sn.a.c(o0VarE), s0Var2, d92.c.f(x0Var, o0VarE), null, 8, null), dVar2);
                d92.b.f58625c.getClass();
                int i26 = 25;
                o0Var = o0VarE;
                m92.r.a(rVarY, fVarJ, z3.f.c(-305977186, new as.p(str, i26), o0VarE), g6.f.a(f26), zQ, str2, w02.b0.g(j92.b.f97899b.f97920e, o0VarE), 0.0f, aVar, z3.f.c(7735671, new bv1.w(list, z14, 2, (byte) 0), o0VarE), z3.f.c(1977294531, new a42.a(oVar, i26, list, eVar), o0VarE), o0Var, (458752 & (i19 << 6)) | 805309824, 6, 128);
                x1 x1Var2 = p3.n.f135158a;
                f22 = f24;
                f19 = f25;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                f19 = f16;
                f22 = f18;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c12.f(oVar, str, list, str2, z14, arrayList, f14, f22, f19, eVar, i14, i15);
            }
        }
        i16 |= 12582912;
        f18 = f15;
        i17 = i15 & 256;
        if (i17 != 0) {
            i16 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarE.B(f16)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i16 |= i18;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(eVar)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i16 |= i24;
        }
        i19 = i16;
        if ((i19 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i19 & 1, z15)) {
            if (i25 != 0) {
                f24 = null;
            } else {
                f24 = f18;
            }
            if (i17 != 0) {
                f25 = null;
            } else {
                f25 = f16;
            }
            x1 x1Var3 = p3.n.f135158a;
            h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY2 = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
            float f27 = v21.d.f175299c;
            if (list != null) {
                arrayList2 = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    lVar = ((g21.y) it.next()).f75535a;
                    if (lVar != null) {
                        arrayList2.add(lVar);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = p13.j0.f134944a;
            }
            i53.f fVarJ2 = i53.a.j((Iterable) arrayList2);
            boolean zQ2 = q(list);
            y3 y3Var4 = t1.f91493k;
            w5.q.b bVar2 = (w5.q.b) o0VarE.A(y3Var4);
            y3 y3Var5 = t1.f91490h;
            g6.d dVar3 = new g6.d(((g6.c) o0VarE.A(y3Var5)).getF69050b(), 1.0f);
            y3 y3Var6 = t1.f91496n;
            s0 s0Var3 = new s0(bVar2, dVar3, (g6.o) o0VarE.A(y3Var6), 0, 8, null);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var2 = j92.f.f97935l;
            n92.d dVar4 = new n92.d(arrayList, s0Var3, d92.c.f(x0Var2, o0VarE), null, null, 24, null);
            n92.j jVar3 = new n92.j(new d02.a(), Float.valueOf(0.0f), f17, 0, 8, null);
            if (f24 != null) {
                jVar = null;
            } else {
                jVar = null;
            }
            s0 s0Var4 = new s0((w5.q.b) o0VarE.A(y3Var4), new g6.d(((g6.c) o0VarE.A(y3Var5)).getF69050b(), 1.0f), (g6.o) o0VarE.A(y3Var6), 0, 8, null);
            fVar2.getClass();
            n92.a aVar2 = new n92.a(jVar3, jVar, new n92.g(sn.a.c(o0VarE), s0Var4, d92.c.f(x0Var2, o0VarE), null, 8, null), dVar4);
            d92.b.f58625c.getClass();
            int i27 = 25;
            o0Var = o0VarE;
            m92.r.a(rVarY2, fVarJ2, z3.f.c(-305977186, new as.p(str, i27), o0VarE), g6.f.a(f27), zQ2, str2, w02.b0.g(j92.b.f97899b.f97920e, o0VarE), 0.0f, aVar2, z3.f.c(7735671, new bv1.w(list, z14, 2, (byte) 0), o0VarE), z3.f.c(1977294531, new a42.a(oVar, i27, list, eVar), o0VarE), o0Var, (458752 & (i19 << 6)) | 805309824, 6, 128);
            x1 x1Var4 = p3.n.f135158a;
            f22 = f24;
            f19 = f25;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            f19 = f16;
            f22 = f18;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c12.f(oVar, str, list, str2, z14, arrayList, f14, f22, f19, eVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137  */
    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:110:0x015b  */
    /* JADX WARN: Code duplicated, block: B:113:0x016a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0176  */
    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:124:0x020b  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:133:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static final void b(b63.o oVar, String str, List<g21.y> list, boolean z14, String str2, List<String> list2, Float f14, Float f15, Float f16, pi0.e eVar, v21.e eVar2, p3.m mVar, int i14, int i15, int i16) {
        int i17;
        Float f17;
        Float f18;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z15;
        p3.o0 o0Var;
        Float f19;
        Float f22;
        p2 p2VarI0;
        Float f24;
        Float f25;
        ?? arrayList;
        Float f26;
        Float f27;
        Float f28;
        Float f29;
        n92.j jVar;
        Iterator it;
        e23.l<q4.f, i53.g<Float, Float>> lVar;
        int i26;
        boolean zR;
        int i27;
        oVar.getClass();
        str2.getClass();
        list2.getClass();
        eVar2.getClass();
        p3.o0 o0VarE = mVar.E(-911924408);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.r(oVar) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.r(list) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.B(str2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i17 |= o0VarE.r(list2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            f17 = f14;
            i17 |= o0VarE.B(f17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            f17 = f14;
        }
        int i28 = i16 & 128;
        if (i28 == 0) {
            if ((12582912 & i14) == 0) {
                f18 = f15;
                i17 |= o0VarE.B(f18) ? 8388608 : 4194304;
            }
            i18 = i16 & 256;
            if (i18 != 0) {
                i17 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.B(f16)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i17 |= i19;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if ((i14 & 1073741824) == 0) {
                    zR = o0VarE.B(eVar);
                } else {
                    zR = o0VarE.r(eVar);
                }
                if (zR) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i17 |= i27;
            }
            i24 = i17;
            if ((i15 & 6) == 0) {
                if (o0VarE.r(eVar2)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i15 | i26;
            } else {
                i25 = i15;
            }
            if ((i24 & 306783379) == 306783378 || (i25 & 3) != 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i24 & 1, z15)) {
                if (i28 != 0) {
                    f24 = null;
                } else {
                    f24 = f18;
                }
                if (i18 != 0) {
                    f25 = null;
                } else {
                    f25 = f16;
                }
                x1 x1Var = p3.n.f135158a;
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                float f34 = v21.d.f175299c;
                if (list != null) {
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        lVar = ((g21.y) it.next()).f75535a;
                        if (lVar != null) {
                            arrayList.add(lVar);
                        }
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = p13.j0.f134944a;
                }
                i53.f fVarJ = i53.a.j((Iterable) arrayList);
                boolean zQ = q(list);
                y3 y3Var = t1.f91493k;
                w5.q.b bVar = (w5.q.b) o0VarE.A(y3Var);
                f26 = f24;
                y3 y3Var2 = t1.f91490h;
                f27 = f25;
                g6.d dVar = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF69050b(), 1.0f);
                y3 y3Var3 = t1.f91496n;
                s0 s0Var = new s0(bVar, dVar, (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                d92.b.f58623a.getClass();
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                x0 x0Var = j92.f.f97935l;
                n92.l lVar2 = new n92.l(list2, s0Var, d92.c.f(x0Var, o0VarE));
                n92.j jVar2 = new n92.j(new d02.a(), Float.valueOf(0.0f), f17, 0, 8, null);
                if (f26 != null || f27 == null) {
                    f28 = f26;
                    f29 = f27;
                    jVar = null;
                } else {
                    jVar = new n92.j(new d02.a(), f26, f27, 0, 8, null);
                    f28 = f26;
                    f29 = f27;
                }
                s0 s0Var2 = new s0((w5.q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF69050b(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                fVar.getClass();
                n92.a aVar = new n92.a(jVar2, jVar, new n92.g(sn.a.c(o0VarE), s0Var2, d92.c.f(x0Var, o0VarE), null, 8, null), lVar2);
                d92.b.f58625c.getClass();
                o0Var = o0VarE;
                m92.r.a(rVarY, fVarJ, z3.f.c(-1857080396, new as.p(str, 24), o0VarE), g6.f.a(f34), zQ, str2, w02.b0.g(j92.b.f97899b.f97920e, o0VarE), 0.0f, aVar, z3.f.c(-56296499, new bv1.w(list, z14, 1, (byte) 0), o0VarE), z3.f.c(1083559961, new a42.y(oVar, eVar, list, eVar2, 28), o0VarE), o0Var, (458752 & (i24 << 3)) | 805309824, 6, 128);
                x1 x1Var2 = p3.n.f135158a;
                f22 = f28;
                f19 = f29;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                f19 = f16;
                f22 = f18;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new k0(oVar, str, list, z14, str2, list2, f14, f22, f19, eVar, eVar2, i14, i15, i16);
            }
        }
        i17 |= 12582912;
        f18 = f15;
        i18 = i16 & 256;
        if (i18 != 0) {
            i17 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarE.B(f16)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i17 |= i19;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if ((i14 & 1073741824) == 0) {
                zR = o0VarE.B(eVar);
            } else {
                zR = o0VarE.r(eVar);
            }
            if (zR) {
                i27 = 536870912;
            } else {
                i27 = 268435456;
            }
            i17 |= i27;
        }
        i24 = i17;
        if ((i15 & 6) == 0) {
            if (o0VarE.r(eVar2)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i25 = i15 | i26;
        } else {
            i25 = i15;
        }
        if ((i24 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (o0VarE.n(i24 & 1, z15)) {
            if (i28 != 0) {
                f24 = null;
            } else {
                f24 = f18;
            }
            if (i18 != 0) {
                f25 = null;
            } else {
                f25 = f16;
            }
            x1 x1Var3 = p3.n.f135158a;
            h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY2 = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
            float f35 = v21.d.f175299c;
            if (list != null) {
                arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    lVar = ((g21.y) it.next()).f75535a;
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = p13.j0.f134944a;
            }
            i53.f fVarJ2 = i53.a.j((Iterable) arrayList);
            boolean zQ2 = q(list);
            y3 y3Var4 = t1.f91493k;
            w5.q.b bVar2 = (w5.q.b) o0VarE.A(y3Var4);
            f26 = f24;
            y3 y3Var5 = t1.f91490h;
            f27 = f25;
            g6.d dVar2 = new g6.d(((g6.c) o0VarE.A(y3Var5)).getF69050b(), 1.0f);
            y3 y3Var6 = t1.f91496n;
            s0 s0Var3 = new s0(bVar2, dVar2, (g6.o) o0VarE.A(y3Var6), 0, 8, null);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var2 = j92.f.f97935l;
            n92.l lVar3 = new n92.l(list2, s0Var3, d92.c.f(x0Var2, o0VarE));
            n92.j jVar3 = new n92.j(new d02.a(), Float.valueOf(0.0f), f17, 0, 8, null);
            if (f26 != null) {
                f28 = f26;
                f29 = f27;
                jVar = null;
            } else {
                f28 = f26;
                f29 = f27;
                jVar = null;
            }
            s0 s0Var4 = new s0((w5.q.b) o0VarE.A(y3Var4), new g6.d(((g6.c) o0VarE.A(y3Var5)).getF69050b(), 1.0f), (g6.o) o0VarE.A(y3Var6), 0, 8, null);
            fVar2.getClass();
            n92.a aVar2 = new n92.a(jVar3, jVar, new n92.g(sn.a.c(o0VarE), s0Var4, d92.c.f(x0Var2, o0VarE), null, 8, null), lVar3);
            d92.b.f58625c.getClass();
            o0Var = o0VarE;
            m92.r.a(rVarY2, fVarJ2, z3.f.c(-1857080396, new as.p(str, 24), o0VarE), g6.f.a(f35), zQ2, str2, w02.b0.g(j92.b.f97899b.f97920e, o0VarE), 0.0f, aVar2, z3.f.c(-56296499, new bv1.w(list, z14, 1, (byte) 0), o0VarE), z3.f.c(1083559961, new a42.y(oVar, eVar, list, eVar2, 28), o0VarE), o0Var, (458752 & (i24 << 3)) | 805309824, 6, 128);
            x1 x1Var4 = p3.n.f135158a;
            f22 = f28;
            f19 = f29;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            f19 = f16;
            f22 = f18;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(oVar, str, list, z14, str2, list2, f14, f22, f19, eVar, eVar2, i14, i15, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002c  */
    public static final e23.l c(float f14, long j8, float f15, float f16, List list, p3.m mVar) {
        list.getClass();
        x1 x1Var = p3.n.f135158a;
        boolean zI = mVar.i(f14) | mVar.l(j8) | mVar.r(list) | mVar.i(f15) | mVar.i(f16);
        Object objQ = mVar.q();
        if (zI) {
            j0 j0Var = new j0(f14, j8, list, f15, f16);
            mVar.K(j0Var);
            objQ = j0Var;
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                j0 j0Var2 = new j0(f14, j8, list, f15, f16);
                mVar.K(j0Var2);
                objQ = j0Var2;
            }
        }
        return (e23.l) objQ;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    public static final e23.l d(i53.f fVar, float f14, Float f15, p3.m mVar, int i14) {
        fVar.getClass();
        x1 x1Var = p3.n.f135158a;
        f02.u.f67749a.getClass();
        long jC = f02.u.c(mVar);
        boolean z14 = true;
        boolean zL = mVar.l(jC) | ((((i14 & 14) ^ 6) > 4 && mVar.r(fVar)) || (i14 & 6) == 4) | ((((i14 & 112) ^ 48) > 32 && mVar.i(f14)) || (i14 & 48) == 32);
        if ((((i14 & 896) ^ 384) <= 256 || !mVar.B(f15)) && (i14 & 384) != 256) {
            z14 = false;
        }
        boolean z15 = zL | z14;
        Object objQ = mVar.q();
        if (z15) {
            cd1.c cVar = new cd1.c(jC, fVar, f14, f15);
            mVar.K(cVar);
            objQ = cVar;
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                cd1.c cVar2 = new cd1.c(jC, fVar, f14, f15);
                mVar.K(cVar2);
                objQ = cVar2;
            }
        }
        return (e23.l) objQ;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0029  */
    public static final e23.l e(i53.f fVar, float f14, Float f15, Float f16, long j8, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        boolean zI = mVar.i(f14) | mVar.l(j8) | mVar.r(fVar) | mVar.B(f15) | mVar.B(f16);
        Object objQ = mVar.q();
        if (zI) {
            i0 i0Var = new i0(f14, j8, fVar, f15, f16);
            mVar.K(i0Var);
            objQ = i0Var;
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                i0 i0Var2 = new i0(f14, j8, fVar, f15, f16);
                mVar.K(i0Var2);
                objQ = i0Var2;
            }
        }
        return (e23.l) objQ;
    }

    public static final g21.d0 f(ArrayList arrayList, ArrayList arrayList2, long j8, long j14) {
        x1 x1Var = p3.n.f135158a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        i53.f<m92.h0.e.a> fVarG = c02.a.g(i53.a.e(arrayList2));
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            Double d14 = (Double) obj;
            Double d15 = (Double) p13.h0.e0(i14, arrayList2);
            if (d14 != null) {
                m92.h0.e.a aVar = new m92.h0.e.a(i14, (float) d14.doubleValue());
                if (d15 == null || d14.doubleValue() <= d15.doubleValue()) {
                    arrayList3.add(new m92.l0(new m92.h0.e.b(aVar, j8, null), true, false, 4, null));
                    arrayList4.add(aVar);
                } else {
                    m92.h0.e.a aVarA = m92.h0.e.a.a(aVar, 0.0f, (float) d15.doubleValue(), 1);
                    arrayList3.add(new m92.l0(new m92.h0.e.b(m92.h0.e.a.a(aVar, 0.0f, (float) d14.doubleValue(), 1), j14, null), true, false, 4, null));
                    arrayList3.add(new m92.l0(new m92.h0.e.b(aVarA, j8, null), false, false, 4, null));
                    arrayList4.add(aVar);
                }
            }
            i14 = i15;
        }
        g21.d0 d0Var = new g21.d0(arrayList3, arrayList4, fVarG);
        x1 x1Var2 = p3.n.f135158a;
        return d0Var;
    }

    public static final g21.d0 g(i53.f fVar, LinkedHashMap linkedHashMap, p3.m mVar) {
        Float fValueOf;
        float f14;
        ArrayList arrayList;
        long j8;
        fVar.getClass();
        x1 x1Var = p3.n.f135158a;
        g21.n.a aVar = g21.n.f75455a;
        g21.n nVar = g21.n.PROTEIN;
        aVar.getClass();
        long jB = g21.n.a.b(nVar, mVar);
        long jB2 = g21.n.a.b(g21.n.FAT, mVar);
        long jB3 = g21.n.a.b(g21.n.CARBS, mVar);
        long jB4 = g21.n.a.b(g21.n.OTHER, mVar);
        Iterator it = linkedHashMap.values().iterator();
        if (it.hasNext()) {
            v21.b bVar = (v21.b) it.next();
            float fQ0 = p13.h0.Q0(p13.u.C(new Float[]{bVar.f175292a, bVar.f175293b, bVar.f175294c, bVar.f175295d}));
            while (it.hasNext()) {
                v21.b bVar2 = (v21.b) it.next();
                fQ0 = Math.max(fQ0, p13.h0.Q0(p13.u.C(new Float[]{bVar2.f175292a, bVar2.f175293b, bVar2.f175294c, bVar2.f175295d})));
            }
            fValueOf = Float.valueOf(fQ0);
        } else {
            fValueOf = null;
        }
        float fFloatValue = (fValueOf != null ? fValueOf.floatValue() : 3000.0f) * 0.008f;
        long jE = vb.h.e(d92.b.f58623a, mVar);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = fVar.iterator();
        int i14 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            float f15 = fFloatValue;
            v21.b bVar3 = (v21.b) u0.c(next, linkedHashMap);
            Float f16 = bVar3.f175295d;
            Iterator it4 = it3;
            Float f17 = bVar3.f175292a;
            long j14 = jE;
            Float f18 = bVar3.f175293b;
            Float f19 = bVar3.f175294c;
            float fFloatValue2 = f16 != null ? f16.floatValue() : 0.0f;
            float fQ1 = p13.h0.Q0(p13.u.C(new Float[]{Float.valueOf(fFloatValue2), f19}));
            float fQ2 = p13.h0.Q0(p13.u.C(new Float[]{Float.valueOf(fQ1), f18}));
            float fQ3 = p13.h0.Q0(p13.u.C(new Float[]{Float.valueOf(fQ2), f17}));
            if (f17 != null || f18 != null || f19 != null || f16 != null) {
                arrayList3.add(new m92.h0.e.a(i14, fQ3));
            }
            int i16 = i14;
            long j15 = jB4;
            List listK = p13.x.k(new g21.e0(f17, jB, null), new g21.e0(f18, jB2, null), new g21.e0(f19, jB3, null), new g21.e0(f16, j15, null));
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : listK) {
                Float f22 = ((g21.e0) obj).f75413a;
                if (f22 != null && f22.floatValue() > 0.0f) {
                    arrayList4.add(obj);
                }
            }
            int i17 = 0;
            for (Object obj2 : arrayList4) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    p13.x.q();
                    throw null;
                }
                g21.e0 e0Var = (g21.e0) obj2;
                boolean z14 = i17 == 0;
                long j16 = e0Var.f75414b;
                if (o4.d0.d(j16, jB)) {
                    f14 = fQ3;
                } else if (o4.d0.d(j16, jB2)) {
                    f14 = fQ2;
                } else if (o4.d0.d(j16, jB3)) {
                    f14 = fQ1;
                } else {
                    f14 = o4.d0.d(j16, j15) ? fFloatValue2 : 0.0f;
                }
                if (z14) {
                    arrayList = arrayList2;
                    arrayList.add(new m92.l0(new m92.h0.e.b(new m92.h0.e.a(i16, f14), j16, null), true, false, 4, null));
                    j8 = j14;
                } else {
                    arrayList = arrayList2;
                    float f24 = i16;
                    j8 = j14;
                    arrayList.add(new m92.l0(new m92.h0.e.b(new m92.h0.e.a(f24, f14), j8, null), false, false, 6, null));
                    arrayList.add(new m92.l0(new m92.h0.e.b(new m92.h0.e.a(f24, f14 - f15), j16, null), false, false, 6, null));
                }
                arrayList2 = arrayList;
                i17 = i18;
                jB3 = jB3;
                arrayList3 = arrayList3;
                jB = jB;
                j14 = j8;
                jB2 = jB2;
            }
            it3 = it4;
            jB4 = j15;
            i14 = i15;
            fFloatValue = f15;
            arrayList2 = arrayList2;
            jE = j14;
            jB2 = jB2;
        }
        g21.d0 d0Var = new g21.d0(arrayList2, arrayList3, null, 4, null);
        x1 x1Var2 = p3.n.f135158a;
        return d0Var;
    }

    public static final q13.b h(boolean z14, g21.v vVar, boolean z15, p3.m mVar, int i14, int i15) {
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        x1 x1Var = p3.n.f135158a;
        mVar.C(1116238216);
        q13.b bVarB = p13.w.b();
        if (z14) {
            mVar.C(-799575991);
            String strQ = gl1.y.Q(mVar, R.string.lbl_calories);
            f02.u.f67749a.getClass();
            bVarB.add(new j82.f(strQ, new j82.g.a(f02.u.b(mVar), null), null, 4, null));
            if (z15) {
                mVar.C(-799338035);
                bVarB.add(new j82.f(gl1.y.Q(mVar, R.string.lbl_adjusted_goal), new j82.g.a(f02.u.a(mVar), null), null, 4, null));
                bVarB.add(new j82.f(gl1.y.Q(mVar, R.string.lbl_caloric_surplus), new j82.g.a(f02.u.d(mVar), null), null, 4, null));
                mVar.f();
            } else {
                mVar.C(-798838315);
                mVar.f();
            }
            bVarB.add(new j82.f(gl1.y.Q(mVar, R.string.lbl_goal), new j82.g.e(f02.u.c(mVar), null), null, 4, null));
            mVar.f();
        } else {
            mVar.C(-798611147);
            mVar.f();
        }
        bVarB.add(new j82.f(gl1.y.Q(mVar, vVar.f75527a), new j82.g.b(g21.w.a(vVar, mVar), null), null, 4, null));
        q13.b bVarA = p13.w.a(bVarB);
        mVar.f();
        return bVarA;
    }

    public static final Double i(g21.a0 a0Var, g21.n nVar) {
        a0Var.getClass();
        x1 x1Var = p3.n.f135158a;
        int i14 = a.f68590a[nVar.ordinal()];
        if (i14 == 1) {
            return a0Var.f75373a;
        }
        if (i14 == 2) {
            return a0Var.f75374b;
        }
        if (i14 != 3) {
            return null;
        }
        return a0Var.f75375c;
    }

    public static final Double j(g21.c0 c0Var, g21.r rVar) {
        c0Var.getClass();
        rVar.getClass();
        x1 x1Var = p3.n.f135158a;
        switch (a.f68591b[rVar.ordinal()]) {
            case 1:
                return c0Var.f75398a;
            case 2:
                return c0Var.f75399b;
            case 3:
                return c0Var.f75400c;
            case 4:
                return c0Var.f75401d;
            case 5:
                return c0Var.f75402e;
            case 6:
                return c0Var.f75403f;
            case 7:
                return c0Var.f75404g;
            default:
                lc.u0.r();
                return null;
        }
    }

    public static final Double k(g21.b bVar, g21.n nVar) {
        bVar.getClass();
        nVar.getClass();
        x1 x1Var = p3.n.f135158a;
        int i14 = a.f68590a[nVar.ordinal()];
        if (i14 == 1) {
            return bVar.f75380b;
        }
        if (i14 == 2) {
            return bVar.f75379a;
        }
        if (i14 == 3) {
            return bVar.f75381c;
        }
        if (i14 != 4) {
            lc.u0.r();
            return null;
        }
        Integer num = bVar.f75382d;
        if (num != null) {
            return Double.valueOf(num.intValue());
        }
        return null;
    }

    public static final Double l(g21.z zVar, g21.n nVar) {
        zVar.getClass();
        nVar.getClass();
        x1 x1Var = p3.n.f135158a;
        int i14 = a.f68590a[nVar.ordinal()];
        if (i14 == 1) {
            return zVar.f75541c;
        }
        if (i14 == 2) {
            return zVar.f75542d;
        }
        if (i14 == 3) {
            return zVar.f75543e;
        }
        if (i14 != 4) {
            lc.u0.r();
            return null;
        }
        Integer num = zVar.f75544f;
        if (num != null) {
            return Double.valueOf(num.intValue());
        }
        return null;
    }

    public static final Double m(g21.c cVar, g21.r rVar) {
        cVar.getClass();
        rVar.getClass();
        x1 x1Var = p3.n.f135158a;
        switch (a.f68591b[rVar.ordinal()]) {
            case 1:
                return cVar.f75391a;
            case 2:
                return cVar.f75392b;
            case 3:
                return cVar.f75393c;
            case 4:
                return cVar.f75394d;
            case 5:
                return cVar.f75397g;
            case 6:
                return cVar.f75395e;
            case 7:
                return cVar.f75396f;
            default:
                lc.u0.r();
                return null;
        }
    }

    public static final Double n(g21.b0 b0Var, g21.r rVar) {
        b0Var.getClass();
        rVar.getClass();
        x1 x1Var = p3.n.f135158a;
        switch (a.f68591b[rVar.ordinal()]) {
            case 1:
                return b0Var.f75384b;
            case 2:
                return b0Var.f75385c;
            case 3:
                return b0Var.f75386d;
            case 4:
                return b0Var.f75387e;
            case 5:
                return b0Var.f75388f;
            case 6:
                return b0Var.f75389g;
            case 7:
                return b0Var.f75390h;
            default:
                lc.u0.r();
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long o(p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        int i15 = i14 % 3;
        if (i15 == 0) {
            mVar.C(-814281419);
            f02.u.f67749a.getClass();
            gl.c.f77766a.getClass();
            long jQ = gl.c.a(mVar).q();
            mVar.f();
            return jQ;
        }
        if (i15 != 1) {
            mVar.C(-814277707);
            f02.u.f67749a.getClass();
            gl.c.f77766a.getClass();
            long jE = gl.c.a(mVar).e();
            mVar.f();
            return jE;
        }
        mVar.C(-814279626);
        f02.u.f67749a.getClass();
        gl.c.f77766a.getClass();
        long j8 = ((o4.d0) gl.c.a(mVar).f77764r.getF182175a()).f128833a;
        mVar.f();
        return j8;
    }

    public static final long p(p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        int i15 = i14 % 3;
        if (i15 == 0) {
            mVar.C(-636828848);
            f02.u.f67749a.getClass();
            gl.c.f77766a.getClass();
            long jP = gl.c.a(mVar).p();
            mVar.f();
            return jP;
        }
        if (i15 != 1) {
            mVar.C(-636824688);
            f02.u.f67749a.getClass();
            gl.c.f77766a.getClass();
            long jD = gl.c.a(mVar).d();
            mVar.f();
            return jD;
        }
        mVar.C(-636826831);
        f02.u.f67749a.getClass();
        gl.c.f77766a.getClass();
        long jR = gl.c.a(mVar).r();
        mVar.f();
        return jR;
    }

    public static final boolean q(List<g21.y> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((g21.y) it.next()).f75536b.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
