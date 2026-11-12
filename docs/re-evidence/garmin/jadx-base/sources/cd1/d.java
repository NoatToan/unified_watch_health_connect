package cd1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import g6.o;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j92.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import m92.h0;
import o4.f0;
import o4.m1;
import o82.g;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.j0;
import p13.x;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import p5.v;
import s5.s0;
import s5.x0;
import v.h;
import w02.b0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26873a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130851d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130853f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.f130858k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.f130859l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26873a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x010c  */
    public static final void a(ad1.b bVar, String str, String str2, m mVar, int i14) {
        o0 o0Var;
        int i15;
        String str3;
        o0 o0VarE = mVar.E(-1287286506);
        int i16 = 2;
        int i17 = i14 | (o0VarE.k(bVar.ordinal()) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | 128;
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                i15 = i17 & (-897);
                str3 = str;
            } else {
                o0VarE.e();
                i15 = i17 & (-897);
                str3 = str2;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97917b;
            bVar3.getClass();
            q.a(u1.n.e(l4.k.b(x2.q(l.C(aVar, 0.0f, f14, eVar.f97917b, 0.0f, 9), bVar.f2766c), bVar.f2767d.f131016a), n5.a.a(o0VarE, bVar.f2768e), m1.f128891a), o0VarE, 0);
            boolean zB = o0VarE.B(str3);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new c82.b(str3, i16);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c82.b(str3, i16);
                    o0VarE.K(objQ);
                }
            }
            r rVarC2 = v.c((e23.l) objQ, aVar, false);
            d92.b.f58624b.getClass();
            str2 = str3;
            mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97935l, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        String str4 = str2;
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(bVar, str, str4, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0227  */
    /* JADX WARN: Code duplicated, block: B:104:0x027d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0280  */
    /* JADX WARN: Code duplicated, block: B:107:0x0284  */
    /* JADX WARN: Code duplicated, block: B:109:0x0289  */
    /* JADX WARN: Code duplicated, block: B:121:0x034f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0112  */
    /* JADX WARN: Code duplicated, block: B:69:0x0120  */
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0140  */
    /* JADX WARN: Code duplicated, block: B:82:0x0154  */
    /* JADX WARN: Code duplicated, block: B:86:0x016b A[LOOP:3: B:84:0x0165->B:86:0x016b, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Iterable] */
    public static final void b(fd1.e eVar, i53.c cVar, r rVar, String str, m mVar, int i14) {
        o0 o0Var;
        ArrayList arrayList;
        Iterator it;
        boolean z14;
        float f14;
        boolean z15;
        ad1.b bVar;
        long jB;
        int i15;
        List list;
        g gVar;
        ?? arrayList2;
        ArrayList arrayList3;
        Iterator it3;
        int i16;
        int i17;
        h0.e.a aVar;
        Float fValueOf;
        h0.e.a aVar2;
        Float fValueOf2;
        i53.c<fd1.c> cVar2;
        fd1.c next;
        boolean z16;
        boolean z17;
        n92.j jVar;
        y3 y3Var;
        y3 y3Var2;
        y3 y3Var3;
        f fVar;
        x0 x0Var;
        g gVar2;
        int i18;
        n92.d dVar;
        n92.n nVar;
        fd1.e eVar2 = eVar;
        cVar.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(1451847996);
        int i19 = i14 | (o0VarE.B(eVar2) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.B(str) ? 2048 : 1024);
        if (o0VarE.n(i19 & 1, (i19 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            float f15 = (float) 1.6d;
            g6.f.a aVar3 = g6.f.f75994b;
            boolean z18 = ((i19 & 14) == 4) | ((i19 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z18) {
                arrayList = new ArrayList();
                it = cVar.iterator();
                while (it.hasNext()) {
                    bVar = (ad1.b) it.next();
                    jB = f0.b(a7.b.getColor(context, bVar.f2768e));
                    if (eVar2 != null) {
                        i15 = 0;
                        list = j0.f134944a;
                    } else {
                        i15 = 0;
                        list = j0.f134944a;
                    }
                    if (eVar2 != null) {
                        gVar = eVar2.f70490a;
                    } else {
                        gVar = null;
                    }
                    if (gVar == g.f130853f) {
                        arrayList2 = new ArrayList();
                        i16 = i15;
                        for (Object obj : list) {
                            i17 = i16 + 1;
                            if (i16 < 0) {
                                x.q();
                                throw null;
                            }
                            float f16 = ((h0.e.a) obj).f117346a;
                            aVar = (h0.e.a) p13.h0.e0(i16 - 1, list);
                            if (aVar != null) {
                                fValueOf = Float.valueOf(aVar.f117346a);
                            } else {
                                fValueOf = null;
                            }
                            float f17 = f15;
                            aVar2 = (h0.e.a) p13.h0.e0(i17, list);
                            if (aVar2 != null) {
                                fValueOf2 = Float.valueOf(aVar2.f117346a);
                            } else {
                                fValueOf2 = null;
                            }
                            if (fValueOf != null) {
                                arrayList2.add(obj);
                            } else {
                                arrayList2.add(obj);
                            }
                            i16 = i17;
                            f15 = f17;
                        }
                    } else {
                        arrayList2 = list;
                    }
                    float f18 = f15;
                    arrayList3 = new ArrayList(y.r(arrayList2, 10));
                    it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new h0.e.d((h0.e.a) it3.next(), new o92.b(bVar.f2767d, jB, null, 4, null), null, 4, null));
                    }
                    fd1.e eVar3 = eVar2;
                    ArrayList arrayList4 = arrayList;
                    c cVar3 = new c(f18, jB, list, eVar3);
                    eVar2 = eVar3;
                    a4.a aVar4 = new a4.a(arrayList3, 29, bVar, eVar2);
                    e23.l[] lVarArr = new e23.l[2];
                    lVarArr[i15] = cVar3;
                    lVarArr[1] = aVar4;
                    d0.v(arrayList4, x.k(lVarArr));
                    arrayList = arrayList4;
                    f15 = f18;
                }
                z14 = false;
                f14 = 1.0f;
                z15 = true;
                objQ = p0.n(i53.a.e(arrayList));
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    arrayList = new ArrayList();
                    it = cVar.iterator();
                    while (it.hasNext()) {
                        bVar = (ad1.b) it.next();
                        jB = f0.b(a7.b.getColor(context, bVar.f2768e));
                        if (eVar2 != null || (cVar2 = eVar2.f70491b) == null) {
                            i15 = 0;
                        } else {
                            Iterator<fd1.c> it4 = cVar2.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    i15 = 0;
                                    next = null;
                                    break;
                                } else {
                                    next = it4.next();
                                    i15 = 0;
                                }
                            } while (next.f70481a != bVar);
                            fd1.c cVar4 = next;
                            if (cVar4 != null) {
                                list = cVar4.f70482b;
                            }
                            if (eVar2 != null) {
                                gVar = eVar2.f70490a;
                            } else {
                                gVar = null;
                            }
                            if (gVar == g.f130853f) {
                                arrayList2 = new ArrayList();
                                i16 = i15;
                                while (r13.hasNext()) {
                                    i17 = i16 + 1;
                                    if (i16 < 0) {
                                        x.q();
                                        throw null;
                                    }
                                    float f19 = ((h0.e.a) obj).f117346a;
                                    aVar = (h0.e.a) p13.h0.e0(i16 - 1, list);
                                    if (aVar != null) {
                                        fValueOf = Float.valueOf(aVar.f117346a);
                                    } else {
                                        fValueOf = null;
                                    }
                                    float f110 = f15;
                                    aVar2 = (h0.e.a) p13.h0.e0(i17, list);
                                    if (aVar2 != null) {
                                        fValueOf2 = Float.valueOf(aVar2.f117346a);
                                    } else {
                                        fValueOf2 = null;
                                    }
                                    if (fValueOf != null || fValueOf2 == null || f19 - fValueOf.floatValue() > 1.0f || fValueOf2.floatValue() - f19 > 1.0f) {
                                        arrayList2.add(obj);
                                    }
                                    i16 = i17;
                                    f15 = f110;
                                }
                            } else {
                                arrayList2 = list;
                            }
                            float f111 = f15;
                            arrayList3 = new ArrayList(y.r(arrayList2, 10));
                            it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(new h0.e.d((h0.e.a) it3.next(), new o92.b(bVar.f2767d, jB, null, 4, null), null, 4, null));
                            }
                            fd1.e eVar4 = eVar2;
                            ArrayList arrayList5 = arrayList;
                            c cVar5 = new c(f111, jB, list, eVar4);
                            eVar2 = eVar4;
                            a4.a aVar5 = new a4.a(arrayList3, 29, bVar, eVar2);
                            e23.l[] lVarArr2 = new e23.l[2];
                            lVarArr2[i15] = cVar5;
                            lVarArr2[1] = aVar5;
                            d0.v(arrayList5, x.k(lVarArr2));
                            arrayList = arrayList5;
                            f15 = f111;
                        }
                        list = j0.f134944a;
                        if (eVar2 != null) {
                            gVar = eVar2.f70490a;
                        } else {
                            gVar = null;
                        }
                        if (gVar == g.f130853f) {
                            arrayList2 = new ArrayList();
                            i16 = i15;
                            while (r13.hasNext()) {
                                i17 = i16 + 1;
                                if (i16 < 0) {
                                    x.q();
                                    throw null;
                                }
                                float f112 = ((h0.e.a) obj).f117346a;
                                aVar = (h0.e.a) p13.h0.e0(i16 - 1, list);
                                if (aVar != null) {
                                    fValueOf = Float.valueOf(aVar.f117346a);
                                } else {
                                    fValueOf = null;
                                }
                                float f113 = f15;
                                aVar2 = (h0.e.a) p13.h0.e0(i17, list);
                                if (aVar2 != null) {
                                    fValueOf2 = Float.valueOf(aVar2.f117346a);
                                } else {
                                    fValueOf2 = null;
                                }
                                if (fValueOf != null) {
                                    arrayList2.add(obj);
                                } else {
                                    arrayList2.add(obj);
                                }
                                i16 = i17;
                                f15 = f113;
                            }
                        } else {
                            arrayList2 = list;
                        }
                        float f114 = f15;
                        arrayList3 = new ArrayList(y.r(arrayList2, 10));
                        it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(new h0.e.d((h0.e.a) it3.next(), new o92.b(bVar.f2767d, jB, null, 4, null), null, 4, null));
                        }
                        fd1.e eVar5 = eVar2;
                        ArrayList arrayList6 = arrayList;
                        c cVar6 = new c(f114, jB, list, eVar5);
                        eVar2 = eVar5;
                        a4.a aVar6 = new a4.a(arrayList3, 29, bVar, eVar2);
                        e23.l[] lVarArr3 = new e23.l[2];
                        lVarArr3[i15] = cVar6;
                        lVarArr3[1] = aVar6;
                        d0.v(arrayList6, x.k(lVarArr3));
                        arrayList = arrayList6;
                        f15 = f114;
                    }
                    z14 = false;
                    f14 = 1.0f;
                    z15 = true;
                    objQ = p0.n(i53.a.e(arrayList));
                    o0VarE.K(objQ);
                } else {
                    z14 = false;
                    f14 = 1.0f;
                    z15 = true;
                }
            }
            i53.c cVar7 = (i53.c) ((p1) objQ).getF182175a();
            if (eVar2 != null) {
                z16 = z15;
                if (eVar2.f70496g == z16) {
                    z17 = z16;
                }
                boolean z19 = z17 ^ z16;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar6 = j92.b.f97899b;
                float fG = b0.g(eVar6.f97916a, o0VarE);
                bVar2.getClass();
                float fG2 = b0.g(eVar6.f97918c, o0VarE);
                if (eVar2 == null && eVar2.f70496g) {
                    jVar = new n92.j(new d02.g(), Float.valueOf(eVar2.f70494e), Float.valueOf(eVar2.f70495f), 4);
                } else {
                    jVar = null;
                }
                y3Var = t1.f91493k;
                w5.q.b bVar3 = (w5.q.b) o0VarE.A(y3Var);
                y3Var2 = t1.f91490h;
                g6.d dVar2 = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), f14);
                y3Var3 = t1.f91496n;
                s0 s0Var = new s0(bVar3, dVar2, (o) o0VarE.A(y3Var3), 0, 8, null);
                fVar = d92.b.f58624b;
                fVar.getClass();
                x0Var = f.f97935l;
                n92.g gVar3 = new n92.g(sn.a.c(o0VarE), s0Var, d92.c.f(x0Var, o0VarE), null, 8, null);
                if (eVar2 != null) {
                    gVar2 = eVar2.f70490a;
                } else {
                    gVar2 = null;
                }
                if (gVar2 == null) {
                    i18 = -1;
                } else {
                    i18 = a.f26873a[gVar2.ordinal()];
                }
                if (i18 != 1 || i18 == 2) {
                    o0VarE.C(1687253359);
                    i53.c<String> cVar8 = eVar2.f70493d;
                    s0 s0Var2 = new s0((w5.q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                    fVar.getClass();
                    dVar = new n92.d(cVar8, s0Var2, d92.c.f(x0Var, o0VarE), null, null, 24, null);
                    o0VarE.g0(false);
                } else {
                    if (i18 == 3) {
                        o0VarE.C(1687800943);
                        i53.c<String> cVar9 = eVar2.f70493d;
                        s0 s0Var3 = new s0((w5.q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                        fVar.getClass();
                        dVar = new n92.d(cVar9, s0Var3, d92.c.f(x0Var, o0VarE), null, null, 24, null);
                        o0VarE.g0(false);
                    } else if (i18 != 4) {
                        o0VarE.C(1688864769);
                        o0VarE.g0(z14);
                        nVar = null;
                    } else {
                        o0VarE.C(1688351627);
                        i53.c<String> cVar10 = eVar2.f70493d;
                        s0 s0Var4 = new s0((w5.q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                        fVar.getClass();
                        n92.l lVar = new n92.l(cVar10, s0Var4, d92.c.f(x0Var, o0VarE));
                        o0VarE.g0(false);
                        nVar = lVar;
                    }
                    n92.a aVar7 = new n92.a(jVar, null, gVar3, nVar, 2, null);
                    o0Var = o0VarE;
                    m92.r.b(rVar, cVar7, null, str, z19, gl1.y.Q(o0VarE, R.string.common_no_data), fG, fG2, aVar7, null, z3.f.c(-717105013, new aa2.f(18, eVar2, cVar), o0VarE), o0Var, 6 | (i19 & 7168), 6, 516);
                    x1 x1Var2 = n.f135158a;
                }
                nVar = dVar;
                n92.a aVar8 = new n92.a(jVar, null, gVar3, nVar, 2, null);
                o0Var = o0VarE;
                m92.r.b(rVar, cVar7, null, str, z19, gl1.y.Q(o0VarE, R.string.common_no_data), fG, fG2, aVar8, null, z3.f.c(-717105013, new aa2.f(18, eVar2, cVar), o0VarE), o0Var, 6 | (i19 & 7168), 6, 516);
                x1 x1Var3 = n.f135158a;
            } else {
                z16 = z15;
            }
            z17 = z14;
            boolean z110 = z17 ^ z16;
            d92.b.f58623a.getClass();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar7 = j92.b.f97899b;
            float fG3 = b0.g(eVar7.f97916a, o0VarE);
            bVar4.getClass();
            float fG4 = b0.g(eVar7.f97918c, o0VarE);
            if (eVar2 == null) {
                jVar = null;
            } else {
                jVar = null;
            }
            y3Var = t1.f91493k;
            w5.q.b bVar5 = (w5.q.b) o0VarE.A(y3Var);
            y3Var2 = t1.f91490h;
            g6.d dVar3 = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), f14);
            y3Var3 = t1.f91496n;
            s0 s0Var5 = new s0(bVar5, dVar3, (o) o0VarE.A(y3Var3), 0, 8, null);
            fVar = d92.b.f58624b;
            fVar.getClass();
            x0Var = f.f97935l;
            n92.g gVar4 = new n92.g(sn.a.c(o0VarE), s0Var5, d92.c.f(x0Var, o0VarE), null, 8, null);
            if (eVar2 != null) {
                gVar2 = eVar2.f70490a;
            } else {
                gVar2 = null;
            }
            if (gVar2 == null) {
                i18 = -1;
            } else {
                i18 = a.f26873a[gVar2.ordinal()];
            }
            if (i18 != 1) {
                o0VarE.C(1687253359);
                i53.c<String> cVar11 = eVar2.f70493d;
                s0 s0Var6 = new s0((w5.q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                fVar.getClass();
                dVar = new n92.d(cVar11, s0Var6, d92.c.f(x0Var, o0VarE), null, null, 24, null);
                o0VarE.g0(false);
                nVar = dVar;
            } else {
                o0VarE.C(1687253359);
                i53.c<String> cVar12 = eVar2.f70493d;
                s0 s0Var7 = new s0((w5.q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                fVar.getClass();
                dVar = new n92.d(cVar12, s0Var7, d92.c.f(x0Var, o0VarE), null, null, 24, null);
                o0VarE.g0(false);
                nVar = dVar;
            }
            n92.a aVar9 = new n92.a(jVar, null, gVar4, nVar, 2, null);
            o0Var = o0VarE;
            m92.r.b(rVar, cVar7, null, str, z110, gl1.y.Q(o0VarE, R.string.common_no_data), fG3, fG4, aVar9, null, z3.f.c(-717105013, new aa2.f(18, eVar2, cVar), o0VarE), o0Var, 6 | (i19 & 7168), 6, 516);
            x1 x1Var4 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l(eVar2, cVar, rVar, str, i14, 21);
        }
    }
}
