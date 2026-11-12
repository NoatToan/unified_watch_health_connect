package bv0;

import i3.fe;
import java.util.List;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21314a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f21315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f21320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f21321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f21323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f21324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f21325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f21326m;

    public /* synthetic */ h(String str, h4.r rVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, e23.a aVar, int i14) {
        this.f21323j = str;
        this.f21324k = rVar;
        this.f21325l = str2;
        this.f21326m = str3;
        this.f21316c = str4;
        this.f21317d = str5;
        this.f21318e = str6;
        this.f21319f = str7;
        this.f21320g = str8;
        this.f21321h = num;
        this.f21315b = aVar;
        this.f21322i = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f21314a;
        int i15 = this.f21322i;
        Object obj3 = this.f21320g;
        Object obj4 = this.f21319f;
        Object obj5 = this.f21318e;
        Object obj6 = this.f21326m;
        Object obj7 = this.f21321h;
        Object obj8 = this.f21317d;
        Object obj9 = this.f21316c;
        Object obj10 = this.f21325l;
        Object obj11 = this.f21324k;
        Object obj12 = this.f21323j;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                n2.a((sc.f) obj12, (gv0.d) obj11, (yu0.f) obj10, (kv0.j) obj6, this.f21315b, (e23.a) obj9, this.f21322i, (e23.a) obj8, (e23.a) obj5, (e23.l) obj7, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                p21.l.a((q21.q) obj12, (fe) obj11, this.f21315b, (e23.a) obj9, (e23.a) obj8, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (e23.a) obj10, (e23.l) obj7, (e23.a) obj6, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                t60.f.b((String) obj12, (h4.r) obj11, (String) obj10, (String) obj6, (String) obj9, (String) obj8, (String) obj5, (String) obj4, (String) obj3, (Integer) obj7, this.f21315b, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            default:
                final x3 x3Var = (x3) obj12;
                p3.p1 p1Var = (p3.p1) obj11;
                List list = (List) obj10;
                e23.a aVar = (e23.a) obj9;
                e23.a aVar2 = (e23.a) obj8;
                e23.l lVar = (e23.l) obj7;
                final r52.b bVar = (r52.b) obj6;
                final r52.g gVar = (r52.g) obj5;
                final r52.b bVar2 = (r52.b) obj4;
                List<e23.a> list2 = (List) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = p3.p0.f(new vv0.n(14, x3Var, p1Var));
                        mVar.K(objQ);
                    }
                    x3 x3Var2 = (x3) objQ;
                    boolean zBooleanValue = ((Boolean) x3Var2.getF182175a()).booleanValue();
                    z3.e eVarC = z3.f.c(1620450005, new r11.k(x3Var, list, this.f21315b, aVar, aVar2, lVar, x3Var2), mVar);
                    final int i16 = 0;
                    final int i17 = this.f21322i;
                    z3.e eVarC2 = z3.f.c(1342879191, new e23.p() { // from class: w52.r1
                        @Override // e23.p
                        public final Object invoke(Object obj13, Object obj14) {
                            int i18 = i16;
                            int i19 = i17;
                            r52.g gVar2 = gVar;
                            r52.b bVar3 = bVar;
                            x3 x3Var3 = x3Var;
                            p3.m mVar2 = (p3.m) obj13;
                            int iIntValue2 = ((Integer) obj14).intValue();
                            switch (i18) {
                                case 0:
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        p3.x1 x1Var2 = p3.n.f135158a;
                                        Object f182175a = x3Var3.getF182175a();
                                        v52.c.C3278c c3278c = f182175a instanceof v52.c.C3278c ? (v52.c.C3278c) f182175a : null;
                                        if (c3278c == null) {
                                            return Unit.INSTANCE;
                                        }
                                        bVar3.a(gVar2, c3278c.f175760a, mVar2, (i19 >> 21) & 8);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        p3.x1 x1Var3 = p3.n.f135158a;
                                        v52.c cVar = (v52.c) x3Var3.getF182175a();
                                        if (!(cVar instanceof v52.c.b)) {
                                            if (cVar instanceof v52.c.C3278c) {
                                                r52.h hVar = (r52.h) ((v52.c.C3278c) cVar).f175760a;
                                                mVar2.C(1559137050);
                                                bVar3.a(gVar2, hVar, mVar2, (i19 >> 21) & 8);
                                                mVar2.f();
                                            } else if (!(cVar instanceof v52.c.a)) {
                                                lc.u0.r();
                                                return null;
                                            }
                                        }
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, mVar);
                    final int i18 = 1;
                    z02.d.a(zBooleanValue, eVarC, null, eVarC2, null, z3.f.c(1065308377, new e23.p() { // from class: w52.r1
                        @Override // e23.p
                        public final Object invoke(Object obj13, Object obj14) {
                            int i19 = i18;
                            int i110 = i17;
                            r52.g gVar2 = gVar;
                            r52.b bVar3 = bVar2;
                            x3 x3Var3 = x3Var;
                            p3.m mVar2 = (p3.m) obj13;
                            int iIntValue2 = ((Integer) obj14).intValue();
                            switch (i19) {
                                case 0:
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        p3.x1 x1Var2 = p3.n.f135158a;
                                        Object f182175a = x3Var3.getF182175a();
                                        v52.c.C3278c c3278c = f182175a instanceof v52.c.C3278c ? (v52.c.C3278c) f182175a : null;
                                        if (c3278c == null) {
                                            return Unit.INSTANCE;
                                        }
                                        bVar3.a(gVar2, c3278c.f175760a, mVar2, (i110 >> 21) & 8);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        p3.x1 x1Var3 = p3.n.f135158a;
                                        v52.c cVar = (v52.c) x3Var3.getF182175a();
                                        if (!(cVar instanceof v52.c.b)) {
                                            if (cVar instanceof v52.c.C3278c) {
                                                r52.h hVar = (r52.h) ((v52.c.C3278c) cVar).f175760a;
                                                mVar2.C(1559137050);
                                                bVar3.a(gVar2, hVar, mVar2, (i110 >> 21) & 8);
                                                mVar2.f();
                                            } else if (!(cVar instanceof v52.c.a)) {
                                                lc.u0.r();
                                                return null;
                                            }
                                        }
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, mVar), mVar, 199728, 20);
                    v52.c cVar = (v52.c) x3Var.getF182175a();
                    if (!(cVar instanceof v52.c.b)) {
                        if (cVar instanceof v52.c.C3278c) {
                            r52.h hVar = (r52.h) ((v52.c.C3278c) cVar).f175760a;
                            mVar.C(-684168877);
                            for (e23.a aVar3 : list2) {
                                mVar.C(-684167438);
                                ((r52.b) aVar3.invoke()).a(gVar, hVar, mVar, (i17 >> 21) & 8);
                                mVar.f();
                            }
                            mVar.f();
                        } else if (!(cVar instanceof v52.c.a)) {
                            lc.u0.r();
                            return null;
                        }
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(p3.p1 p1Var, p3.p1 p1Var2, List list, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.l lVar, r52.b bVar, r52.g gVar, int i14, r52.b bVar2, List list2) {
        this.f21323j = p1Var;
        this.f21324k = p1Var2;
        this.f21325l = list;
        this.f21315b = aVar;
        this.f21316c = aVar2;
        this.f21317d = aVar3;
        this.f21321h = lVar;
        this.f21326m = bVar;
        this.f21318e = gVar;
        this.f21322i = i14;
        this.f21319f = bVar2;
        this.f21320g = list2;
    }

    public /* synthetic */ h(q21.q qVar, fe feVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, e23.a aVar6, e23.a aVar7, e23.l lVar, e23.a aVar8, int i14) {
        this.f21323j = qVar;
        this.f21324k = feVar;
        this.f21315b = aVar;
        this.f21316c = aVar2;
        this.f21317d = aVar3;
        this.f21318e = aVar4;
        this.f21319f = aVar5;
        this.f21320g = aVar6;
        this.f21325l = aVar7;
        this.f21321h = lVar;
        this.f21326m = aVar8;
        this.f21322i = i14;
    }

    public /* synthetic */ h(sc.f fVar, gv0.d dVar, yu0.f fVar2, kv0.j jVar, e23.a aVar, e23.a aVar2, int i14, e23.a aVar3, e23.a aVar4, e23.l lVar, e23.a aVar5, e23.a aVar6, int i15) {
        this.f21323j = fVar;
        this.f21324k = dVar;
        this.f21325l = fVar2;
        this.f21326m = jVar;
        this.f21315b = aVar;
        this.f21316c = aVar2;
        this.f21322i = i14;
        this.f21317d = aVar3;
        this.f21318e = aVar4;
        this.f21321h = lVar;
        this.f21319f = aVar5;
        this.f21320g = aVar6;
    }
}
