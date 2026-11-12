package cw1;

import c2.x2;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f56218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f56219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f56220d;

    public /* synthetic */ t1(LinkedHashMap linkedHashMap, int i14, p3.p1 p1Var, int i15) {
        this.f56217a = i15;
        this.f56218b = linkedHashMap;
        this.f56219c = i14;
        this.f56220d = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x0278  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f56217a;
        p3.m.a aVar = p3.m.f135153a;
        final p3.p1 p1Var = this.f56220d;
        final LinkedHashMap linkedHashMap = this.f56218b;
        final int i15 = 2;
        final int i16 = 1;
        boolean z14 = false;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarX = x2.x(x2.z(aVar2, null, 3), null, 3);
                    i53.c cVarE = i53.a.e(linkedHashMap.values());
                    boolean zR = mVar.r(linkedHashMap);
                    Object objQ = mVar.q();
                    if (zR) {
                        final int i17 = z14 ? 1 : 0;
                        objQ = new e23.l() { // from class: cw1.u1
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                int i18 = i17;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                switch (i18) {
                                    case 0:
                                        Object key = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue2)).getKey();
                                        key.getClass();
                                        p1Var.setValue((hv1.i) key);
                                        break;
                                    case 1:
                                        Object key2 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue2)).getKey();
                                        key2.getClass();
                                        p1Var.setValue((hv1.f) key2);
                                        break;
                                    default:
                                        Object key3 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue2)).getKey();
                                        key3.getClass();
                                        p1Var.setValue((hv1.j) key3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i18 = z14 ? 1 : 0;
                            objQ = new e23.l() { // from class: cw1.u1
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    int i19 = i18;
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    switch (i19) {
                                        case 0:
                                            Object key = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue2)).getKey();
                                            key.getClass();
                                            p1Var.setValue((hv1.i) key);
                                            break;
                                        case 1:
                                            Object key2 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue2)).getKey();
                                            key2.getClass();
                                            p1Var.setValue((hv1.f) key2);
                                            break;
                                        default:
                                            Object key3 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue2)).getKey();
                                            key3.getClass();
                                            p1Var.setValue((hv1.j) key3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    r82.k.a(rVarX, cVarE, this.f56219c, null, 0.0f, false, false, 0L, null, (e23.l) objQ, mVar, 6, 504);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.r rVarF2 = x2.f(aVar5, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar6 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.f22694d, aVar6, mVar2, 48);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarF2, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    h4.r rVarX2 = x2.x(x2.z(aVar5, null, 3), null, 3);
                    i53.c cVarE2 = i53.a.e(linkedHashMap.values());
                    boolean zR2 = mVar2.r(linkedHashMap);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.l() { // from class: cw1.u1
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                int i19 = i15;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                switch (i19) {
                                    case 0:
                                        Object key = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue3)).getKey();
                                        key.getClass();
                                        p1Var.setValue((hv1.i) key);
                                        break;
                                    case 1:
                                        Object key2 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue3)).getKey();
                                        key2.getClass();
                                        p1Var.setValue((hv1.f) key2);
                                        break;
                                    default:
                                        Object key3 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue3)).getKey();
                                        key3.getClass();
                                        p1Var.setValue((hv1.j) key3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.l() { // from class: cw1.u1
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    int i19 = i15;
                                    int iIntValue3 = ((Integer) obj3).intValue();
                                    switch (i19) {
                                        case 0:
                                            Object key = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue3)).getKey();
                                            key.getClass();
                                            p1Var.setValue((hv1.i) key);
                                            break;
                                        case 1:
                                            Object key2 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue3)).getKey();
                                            key2.getClass();
                                            p1Var.setValue((hv1.f) key2);
                                            break;
                                        default:
                                            Object key3 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue3)).getKey();
                                            key3.getClass();
                                            p1Var.setValue((hv1.j) key3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    r82.k.a(rVarX2, cVarE2, this.f56219c, null, 0.0f, false, false, 0L, null, (e23.l) objQ2, mVar2, 6, 504);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.r rVarF3 = x2.f(aVar8, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar9 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA3 = c2.y.a(c2.j.f22694d, aVar9, mVar3, 48);
                    int iHashCode3 = Long.hashCode(mVar3.getU());
                    i2 i2VarX3 = mVar3.x();
                    h4.r rVarC3 = h4.k.c(rVarF3, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar10);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar3);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    h4.r rVarX3 = x2.x(x2.z(aVar8, null, 3), null, 3);
                    i53.c cVarE3 = i53.a.e(linkedHashMap.values());
                    boolean zR3 = mVar3.r(linkedHashMap);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new e23.l() { // from class: cw1.u1
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                int i19 = i16;
                                int iIntValue4 = ((Integer) obj3).intValue();
                                switch (i19) {
                                    case 0:
                                        Object key = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue4)).getKey();
                                        key.getClass();
                                        p1Var.setValue((hv1.i) key);
                                        break;
                                    case 1:
                                        Object key2 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue4)).getKey();
                                        key2.getClass();
                                        p1Var.setValue((hv1.f) key2);
                                        break;
                                    default:
                                        Object key3 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue4)).getKey();
                                        key3.getClass();
                                        p1Var.setValue((hv1.j) key3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.l() { // from class: cw1.u1
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    int i19 = i16;
                                    int iIntValue4 = ((Integer) obj3).intValue();
                                    switch (i19) {
                                        case 0:
                                            Object key = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue4)).getKey();
                                            key.getClass();
                                            p1Var.setValue((hv1.i) key);
                                            break;
                                        case 1:
                                            Object key2 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue4)).getKey();
                                            key2.getClass();
                                            p1Var.setValue((hv1.f) key2);
                                            break;
                                        default:
                                            Object key3 = ((Map.Entry) p13.h0.W(linkedHashMap.entrySet(), iIntValue4)).getKey();
                                            key3.getClass();
                                            p1Var.setValue((hv1.j) key3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ3);
                        }
                    }
                    r82.k.a(rVarX3, cVarE3, this.f56219c, null, 0.0f, false, false, 0L, null, (e23.l) objQ3, mVar3, 6, 504);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
