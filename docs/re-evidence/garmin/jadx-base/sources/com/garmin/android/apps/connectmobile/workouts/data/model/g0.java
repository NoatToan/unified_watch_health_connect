package com.garmin.android.apps.connectmobile.workouts.data.model;

import c2.x2;
import f5.v1;
import i3.i7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.r1;
import p005kotlin.Unit;
import p13.h0;
import p3.x1;
import z2.t1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f48180b;

    public /* synthetic */ g0(int i14, ArrayList arrayList) {
        this.f48179a = i14;
        this.f48180b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f48179a;
        boolean z14 = false;
        int i15 = 1;
        final ArrayList arrayList = this.f48180b;
        switch (i14) {
            case 0:
                l52.j jVar = (l52.j) obj;
                h0.a aVar = h0.f48185j;
                jVar.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jVar.a((l52.e.b) it.next());
                }
                return Unit.INSTANCE;
            case 1:
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                final int i16 = 0;
                e2.f0.f(f0Var, arrayList.size(), null, new z3.e(1413914064, true, new e23.r() { // from class: cq.r
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i17 = i16;
                        ArrayList arrayList2 = arrayList;
                        switch (i17) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                p3.m mVar = (p3.m) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((e2.d) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
                                }
                                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    x1 x1Var = p3.n.f135158a;
                                    o13.p pVar = (o13.p) arrayList2.get(iIntValue);
                                    A a14 = pVar.f128594a;
                                    B b14 = pVar.f128595b;
                                    if (p005kotlin.jvm.internal.s.g(a14, "HEADER")) {
                                        mVar.C(1169744937);
                                        r1.b((String) b14, null, mVar, 0, 2);
                                        mVar.f();
                                    } else {
                                        mVar.C(1169824793);
                                        u.r((String) pVar.f128594a, (String) b14, mVar, 0);
                                        mVar.f();
                                    }
                                } else {
                                    mVar.e();
                                }
                                break;
                            default:
                                int iIntValue3 = ((Integer) obj3).intValue();
                                p3.m mVar2 = (p3.m) obj4;
                                int iIntValue4 = ((Integer) obj5).intValue();
                                ((f2.r) obj2).getClass();
                                if ((iIntValue4 & 48) == 0) {
                                    iIntValue4 |= mVar2.k(iIntValue3) ? 32 : 16;
                                }
                                if (mVar2.n(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    if (iIntValue3 == 11) {
                                        mVar2.C(-544540535);
                                        if (arrayList2.size() > 12) {
                                            mVar2.C(299190907);
                                            i7.a(n5.c.a(2131232459, mVar2, 0), null, c2.l.g(x2.f(h4.r.S, 1.0f), 1.0f), com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar2), mVar2, 432, 0);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(299705538);
                                            ww0.f fVar = (ww0.f) h0.e0(iIntValue3, arrayList2);
                                            fx0.h.a(fVar != null ? Integer.valueOf(fVar.b()) : null, mVar2, 0);
                                            mVar2.f();
                                        }
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-544513936);
                                        ww0.f fVar2 = (ww0.f) h0.e0(iIntValue3, arrayList2);
                                        fx0.h.a(fVar2 != null ? Integer.valueOf(fVar2.b()) : null, mVar2, 0);
                                        mVar2.f();
                                    }
                                } else {
                                    mVar2.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 6);
                return Unit.INSTANCE;
            case 2:
                hk1.v vVar = (hk1.v) obj;
                int i17 = ek1.m.f64465g;
                vVar.getClass();
                arrayList.add(vVar);
                return Unit.INSTANCE;
            case 3:
                f2.j0 j0Var = (f2.j0) obj;
                j0Var.getClass();
                final int i18 = 1;
                j0Var.g(Math.min(arrayList.size(), 12), null, null, f2.i0.f68219a, new z3.e(499991458, true, new e23.r() { // from class: cq.r
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i19 = i18;
                        ArrayList arrayList2 = arrayList;
                        switch (i19) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                p3.m mVar = (p3.m) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((e2.d) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
                                }
                                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    x1 x1Var = p3.n.f135158a;
                                    o13.p pVar = (o13.p) arrayList2.get(iIntValue);
                                    A a14 = pVar.f128594a;
                                    B b14 = pVar.f128595b;
                                    if (p005kotlin.jvm.internal.s.g(a14, "HEADER")) {
                                        mVar.C(1169744937);
                                        r1.b((String) b14, null, mVar, 0, 2);
                                        mVar.f();
                                    } else {
                                        mVar.C(1169824793);
                                        u.r((String) pVar.f128594a, (String) b14, mVar, 0);
                                        mVar.f();
                                    }
                                } else {
                                    mVar.e();
                                }
                                break;
                            default:
                                int iIntValue3 = ((Integer) obj3).intValue();
                                p3.m mVar2 = (p3.m) obj4;
                                int iIntValue4 = ((Integer) obj5).intValue();
                                ((f2.r) obj2).getClass();
                                if ((iIntValue4 & 48) == 0) {
                                    iIntValue4 |= mVar2.k(iIntValue3) ? 32 : 16;
                                }
                                if (mVar2.n(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    if (iIntValue3 == 11) {
                                        mVar2.C(-544540535);
                                        if (arrayList2.size() > 12) {
                                            mVar2.C(299190907);
                                            i7.a(n5.c.a(2131232459, mVar2, 0), null, c2.l.g(x2.f(h4.r.S, 1.0f), 1.0f), com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar2), mVar2, 432, 0);
                                            mVar2.f();
                                        } else {
                                            mVar2.C(299705538);
                                            ww0.f fVar = (ww0.f) h0.e0(iIntValue3, arrayList2);
                                            fx0.h.a(fVar != null ? Integer.valueOf(fVar.b()) : null, mVar2, 0);
                                            mVar2.f();
                                        }
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-544513936);
                                        ww0.f fVar2 = (ww0.f) h0.e0(iIntValue3, arrayList2);
                                        fx0.h.a(fVar2 != null ? Integer.valueOf(fVar2.b()) : null, mVar2, 0);
                                        mVar2.f();
                                    }
                                } else {
                                    mVar2.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                return Unit.INSTANCE;
            case 4:
                v1.a aVar2 = (v1.a) obj;
                int size = arrayList.size();
                int i19 = 0;
                while (i19 < size) {
                    h2.h hVar = (h2.h) arrayList.get(i19);
                    List<v1> list = hVar.f80908c;
                    boolean z15 = hVar.f80915j;
                    if (hVar.f80919n == Integer.MIN_VALUE) {
                        b2.e.a("position() should be called first");
                    }
                    int size2 = list.size();
                    for (?? r14 = z14; r14 < size2; r14++) {
                        v1 v1Var = list.get(r14);
                        int[] iArr = hVar.f80917l;
                        int i24 = r14 * 2;
                        long j8 = (((long) iArr[i24 + i15]) & 4294967295L) | (((long) iArr[i24]) << 32);
                        g6.k.a aVar3 = g6.k.f76003b;
                        if (hVar.f80914i) {
                            int i25 = z15 ? (int) (j8 >> 32) : (hVar.f80919n - ((int) (j8 >> 32))) - (z15 ? v1Var.f69145b : v1Var.f69144a);
                            j8 = (((long) (z15 ? (hVar.f80919n - ((int) (j8 & 4294967295L))) - (z15 ? v1Var.f69145b : v1Var.f69144a) : (int) (j8 & 4294967295L))) & 4294967295L) | (((long) i25) << 32);
                        }
                        long jE = g6.k.e(j8, hVar.f80909d);
                        if (z15) {
                            v1.a.O(aVar2, v1Var, jE);
                        } else {
                            v1.a.F(aVar2, v1Var, jE);
                        }
                        i15 = 1;
                    }
                    i19++;
                    z14 = false;
                    i15 = 1;
                }
                return Unit.INSTANCE;
            case 5:
                return ((g01.n) arrayList.get(((Integer) obj).intValue())).a();
            case 6:
                k30.a aVar4 = (k30.a) obj;
                int i26 = k40.a.f102826f;
                aVar4.getClass();
                Long l14 = aVar4.f102522a;
                if (l14 != null && p13.h0.R(arrayList, l14)) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 7:
                k30.a aVar5 = (k30.a) obj;
                int i27 = k40.a.f102826f;
                aVar5.getClass();
                return Boolean.valueOf(!p13.h0.R(arrayList, aVar5.f102522a));
            case 8:
                v1.a aVar6 = (v1.a) obj;
                l2.c.a aVar7 = l2.c.a.f108420a;
                int size3 = arrayList.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    v1.a.B(aVar6, (v1) arrayList.get(i28), 0, 0);
                }
                return Unit.INSTANCE;
            default:
                v1.a aVar8 = (v1.a) obj;
                t1 t1Var = t1.f201801a;
                int size4 = arrayList.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    aVar8.r((v1) arrayList.get(i29), 0, 0, 0.0f);
                }
                return Unit.INSTANCE;
        }
    }
}
