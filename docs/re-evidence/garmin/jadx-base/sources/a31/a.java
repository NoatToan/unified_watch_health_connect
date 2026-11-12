package a31;

import bv1.y;
import c2.a0;
import c2.c1;
import c2.h2;
import c2.l;
import c2.t;
import c2.t2;
import c2.x2;
import c22.c3;
import cw1.w0;
import d6.h;
import e23.q;
import h4.r;
import i3.fe;
import i3.i7;
import i3.v5;
import i3.ve;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l72.v2;
import l72.x0;
import nr.l0;
import o4.d0;
import p005kotlin.Unit;
import p13.x;
import p3.m;
import p3.n;
import p3.x1;
import r1.q2;
import tn.k;
import us1.i;
import y22.p;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f915b;

    public /* synthetic */ a(List list, int i14) {
        this.f914a = i14;
        this.f915b = list;
    }

    /* JADX WARN: Code duplicated, block: B:211:0x0512  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d0 d0VarA;
        String str;
        int i14 = this.f914a;
        int i15 = 8;
        h hVarA = null;
        Object[] objArr = 0;
        int i16 = 2;
        List<Map.Entry> list = this.f915b;
        boolean z14 = true;
        boolean z15 = false;
        switch (i14) {
            case 0:
                h2 h2Var = (h2) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                d dVar = d.f921a;
                h2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(h2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    ve.a(l.j(l.x(r.S, h2Var), h2Var), null, k.a(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(400790479, new b(list, z15 ? 1 : 0), mVar), mVar, 12582912, 122);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    int i17 = 0;
                    for (Object obj4 : list) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            x.q();
                            throw null;
                        }
                        bv1.e.b((av1.b) obj4, mVar2, 0);
                        if (i17 < list.size() - 1) {
                            mVar2.C(-1619752668);
                            r rVarF = x2.f(r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            v5.a(0.0f, 0, 2, q2.f(mVar2), l.C(rVarF, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), mVar2);
                            mVar2.f();
                        } else {
                            mVar2.C(-1619461485);
                            mVar2.f();
                        }
                        i17 = i18;
                    }
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    int i19 = 0;
                    for (Object obj5 : list) {
                        int i24 = i19 + 1;
                        if (i19 < 0) {
                            x.q();
                            throw null;
                        }
                        y.c((iw1.a) obj5, false, mVar3, 48);
                        if (i19 < list.size() - 1) {
                            mVar3.C(-1009829373);
                            r rVarF2 = x2.f(r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            v5.a(0.0f, 0, 2, q2.f(mVar3), l.C(rVarF2, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), mVar3);
                            mVar3.f();
                        } else {
                            mVar3.C(-1009538190);
                            mVar3.f();
                        }
                        i19 = i24;
                    }
                    x1 x1Var5 = n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                t2 t2Var = (t2) obj;
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(t2Var) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((q) it.next()).invoke(t2Var, mVar4, Integer.valueOf(iIntValue4 & 14));
                    }
                    x1 x1Var7 = n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                t2 t2Var2 = (t2) obj;
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(t2Var2) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((q) it3.next()).invoke(t2Var2, mVar5, Integer.valueOf(iIntValue5 & 14));
                    }
                    x1 x1Var9 = n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var10 = n.f135158a;
                    if (list.isEmpty()) {
                        h.f57752b.getClass();
                        hVarA = h.a(h.f57755e);
                    }
                    w0.b(hVarA, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                m mVar7 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var11 = n.f135158a;
                    r rVarD = x2.d(r.S, 1.0f);
                    boolean zR = mVar7.r(list);
                    Object objQ = mVar7.q();
                    if (zR) {
                        objQ = new aq1.d0(list, 8);
                        mVar7.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new aq1.d0(list, 8);
                            mVar7.K(objQ);
                        }
                    }
                    e2.c.b(rVarD, null, null, null, null, null, false, null, (e23.l) objQ, mVar7, 6, 510);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                m mVar8 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var12 = n.f135158a;
                    hw1.d.a(null, z3.f.c(-1633367110, new a(list, i15), mVar8), mVar8, 48);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                m mVar9 = (m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var13 = n.f135158a;
                    int i25 = 0;
                    for (Object obj6 : list) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            x.q();
                            throw null;
                        }
                        gw1.k.c((iw1.a) obj6, false, false, mVar9, 432);
                        if (i25 < list.size() - 1) {
                            mVar9.C(232930506);
                            r rVarF3 = x2.f(r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            v5.a(0.0f, 0, 2, q2.f(mVar9), l.C(rVarF3, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), mVar9);
                            mVar9.f();
                        } else {
                            mVar9.C(233252441);
                            mVar9.f();
                        }
                        i25 = i26;
                    }
                    x1 x1Var14 = n.f135158a;
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar10 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var15 = n.f135158a;
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ys1.f.a(0, null, gl1.y.Q(mVar10, ((us1.g) it4.next()).f172402b), mVar10);
                    }
                    x1 x1Var16 = n.f135158a;
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar11 = (m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var17 = n.f135158a;
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        String upperCase = gl1.y.Q(mVar11, ((i) it5.next()).f172418b).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        ys1.f.a(0, null, upperCase, mVar11);
                    }
                    x1 x1Var18 = n.f135158a;
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                t2 t2Var3 = (t2) obj;
                m mVar12 = (m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(t2Var3) ? 4 : 2;
                }
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var19 = n.f135158a;
                    mVar12.C(-446822027);
                    for (Map.Entry entry : list) {
                        x0 x0Var = x0.f111346a;
                        String strValueOf = String.valueOf(((Number) entry.getValue()).intValue());
                        pu1.c cVar = (pu1.c) entry.getKey();
                        if (cVar == null) {
                            mVar12.C(941656943);
                            mVar12.f();
                            d0VarA = null;
                        } else {
                            mVar12.C(-385265966);
                            long jA = cVar.a(mVar12);
                            mVar12.f();
                            d0VarA = d0.a(jA);
                        }
                        x0.a aVar = d0VarA != null ? new x0.a(d0VarA.f128833a, objArr == true ? 1 : 0) : null;
                        pu1.c cVar2 = (pu1.c) entry.getKey();
                        c3 c3Var = cVar2 != null ? cVar2.f141315b : null;
                        if (c3Var == null) {
                            mVar12.C(941764823);
                            mVar12.f();
                            str = null;
                        } else {
                            mVar12.C(941764824);
                            String strT = gl1.d.T(c3Var, mVar12, 0);
                            mVar12.f();
                            str = strT;
                        }
                        x0Var.a((iIntValue12 & 14) | (x0.f111348c << 24), 120, null, t2Var3, null, null, strValueOf, str, null, aVar, mVar12);
                    }
                    mVar12.f();
                    if (list.size() < 2) {
                        mVar12.C(-966253649);
                        x0.f111346a.h(t2Var3, mVar12, (iIntValue12 & 14) | (x0.f111348c << 3));
                        mVar12.f();
                    } else {
                        mVar12.C(-966207521);
                        mVar12.f();
                    }
                    x1 x1Var20 = n.f135158a;
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                r rVar = (r) obj;
                m mVar13 = (m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                rVar.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar13.B(rVar) ? 4 : 2;
                }
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var21 = n.f135158a;
                    sn0.c.b(rVar, list, mVar13, iIntValue13 & 14);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                t2 t2Var4 = (t2) obj;
                m mVar14 = (m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar14.B(t2Var4) ? 4 : 2;
                }
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var22 = n.f135158a;
                    mVar14.C(719193802);
                    for (Map.Entry entry2 : list) {
                        x0.f111346a.f((iIntValue14 & 14) | (x0.f111348c << 24), 124, null, t2Var4, null, null, (String) entry2.getValue(), gl1.y.Q(mVar14, ((ag2.c.a) entry2.getKey()).f3219b), null, null, mVar14);
                    }
                    mVar14.f();
                    if (list.size() < 2) {
                        mVar14.C(820503208);
                        x0.f111346a.h(t2Var4, mVar14, (iIntValue14 & 14) | (x0.f111348c << 3));
                        mVar14.f();
                    } else {
                        mVar14.C(820557024);
                        mVar14.f();
                    }
                    x1 x1Var23 = n.f135158a;
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                t2 t2Var5 = (t2) obj;
                m mVar15 = (m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                t2Var5.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar15.B(t2Var5) ? 4 : 2;
                }
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var24 = n.f135158a;
                    mVar15.C(1907653597);
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        final l0 l0Var = (l0) it6.next();
                        e23.a<Unit> aVar2 = l0Var.f127251b;
                        x0 x0Var2 = x0.f111346a;
                        r rVarA = v2.a(r.S, aVar2 != null, new p(aVar2, z14 ? 1 : 0), mVar15, 6);
                        r22.p pVar = l0Var.f127250a;
                        String str2 = pVar.f149774a;
                        String str3 = pVar.f149776c;
                        String str4 = pVar.f149775b;
                        final int i27 = z15 ? 1 : 0;
                        x0Var2.f((iIntValue15 & 14) | 1572864 | (x0.f111348c << 24), 68, null, t2Var5, z3.f.c(-1496428351, new q() { // from class: yr.l0
                            @Override // e23.q
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                int i28 = i27;
                                nr.l0 l0Var2 = l0Var;
                                switch (i28) {
                                    case 0:
                                        p3.m mVar16 = (p3.m) obj8;
                                        int iIntValue16 = ((Integer) obj9).intValue();
                                        ((t2) obj7).getClass();
                                        if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                                            x1 x1Var25 = p3.n.f135158a;
                                            r22.p pVar2 = l0Var2.f127250a;
                                            u4.d dVar2 = pVar2.f149777d;
                                            if (dVar2 == null) {
                                                mVar16.C(1663600907);
                                                mVar16.f();
                                            } else {
                                                mVar16.C(1663600908);
                                                String str5 = pVar2.f149779f;
                                                h4.r.a aVar3 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                float f14 = j92.b.f97899b.f97917b;
                                                i7.b(dVar2, str5, x2.q(c2.l.C(aVar3, f14, f14, 0.0f, 0.0f, 12), j92.b.f97901d.f97904c), n5.a.a(mVar16, pVar2.f149778e), mVar16, 0, 0);
                                                mVar16.f();
                                            }
                                        } else {
                                            mVar16.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar17 = (p3.m) obj8;
                                        int iIntValue17 = ((Integer) obj9).intValue();
                                        ((t2) obj7).getClass();
                                        if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                            x1 x1Var26 = p3.n.f135158a;
                                            r22.p pVar3 = l0Var2.f127250a;
                                            u4.d dVar3 = pVar3.f149777d;
                                            if (dVar3 == null) {
                                                mVar17.C(823795818);
                                                mVar17.f();
                                            } else {
                                                mVar17.C(823795819);
                                                String str6 = pVar3.f149779f;
                                                h4.r.a aVar4 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                float f15 = j92.b.f97899b.f97917b;
                                                i7.b(dVar3, str6, x2.q(c2.l.C(aVar4, f15, f15, 0.0f, 0.0f, 12), j92.b.f97901d.f97904c), n5.a.a(mVar17, pVar3.f149778e), mVar17, 0, 0);
                                                mVar17.f();
                                            }
                                        } else {
                                            mVar17.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar15), rVarA, str2, str3, str4, null, mVar15);
                    }
                    mVar15.f();
                    if (list.size() == 1) {
                        mVar15.C(-991145074);
                        x0.f111346a.h(t2Var5, mVar15, (iIntValue15 & 14) | (x0.f111348c << 3));
                        mVar15.f();
                    } else {
                        mVar15.C(-991098946);
                        mVar15.f();
                    }
                    x1 x1Var25 = n.f135158a;
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            default:
                t2 t2Var6 = (t2) obj;
                m mVar16 = (m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                t2Var6.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= mVar16.B(t2Var6) ? 4 : 2;
                }
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    x1 x1Var26 = n.f135158a;
                    mVar16.C(1251902214);
                    Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        final l0 l0Var2 = (l0) it7.next();
                        e23.a<Unit> aVar3 = l0Var2.f127251b;
                        x0 x0Var3 = x0.f111346a;
                        r rVarA2 = v2.a(r.S, aVar3 != null, new p(aVar3, i16), mVar16, 6);
                        r22.p pVar2 = l0Var2.f127250a;
                        String str5 = pVar2.f149774a;
                        String str6 = pVar2.f149776c;
                        String str7 = pVar2.f149775b;
                        final int i28 = z14 ? 1 : 0;
                        x0Var3.a((x0.f111348c << 24) | (iIntValue16 & 14) | 196608, 68, null, t2Var6, z3.f.c(-2077749822, new q() { // from class: yr.l0
                            @Override // e23.q
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                int i29 = i28;
                                nr.l0 l0Var3 = l0Var2;
                                switch (i29) {
                                    case 0:
                                        p3.m mVar17 = (p3.m) obj8;
                                        int iIntValue17 = ((Integer) obj9).intValue();
                                        ((t2) obj7).getClass();
                                        if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                            x1 x1Var27 = p3.n.f135158a;
                                            r22.p pVar3 = l0Var3.f127250a;
                                            u4.d dVar2 = pVar3.f149777d;
                                            if (dVar2 == null) {
                                                mVar17.C(1663600907);
                                                mVar17.f();
                                            } else {
                                                mVar17.C(1663600908);
                                                String str8 = pVar3.f149779f;
                                                h4.r.a aVar4 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                float f14 = j92.b.f97899b.f97917b;
                                                i7.b(dVar2, str8, x2.q(c2.l.C(aVar4, f14, f14, 0.0f, 0.0f, 12), j92.b.f97901d.f97904c), n5.a.a(mVar17, pVar3.f149778e), mVar17, 0, 0);
                                                mVar17.f();
                                            }
                                        } else {
                                            mVar17.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar18 = (p3.m) obj8;
                                        int iIntValue18 = ((Integer) obj9).intValue();
                                        ((t2) obj7).getClass();
                                        if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                            x1 x1Var28 = p3.n.f135158a;
                                            r22.p pVar4 = l0Var3.f127250a;
                                            u4.d dVar3 = pVar4.f149777d;
                                            if (dVar3 == null) {
                                                mVar18.C(823795818);
                                                mVar18.f();
                                            } else {
                                                mVar18.C(823795819);
                                                String str9 = pVar4.f149779f;
                                                h4.r.a aVar5 = h4.r.S;
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                float f15 = j92.b.f97899b.f97917b;
                                                i7.b(dVar3, str9, x2.q(c2.l.C(aVar5, f15, f15, 0.0f, 0.0f, 12), j92.b.f97901d.f97904c), n5.a.a(mVar18, pVar4.f149778e), mVar18, 0, 0);
                                                mVar18.f();
                                            }
                                        } else {
                                            mVar18.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar16), rVarA2, str5, str6, str7, null, mVar16);
                    }
                    mVar16.f();
                    if (list.size() == 1) {
                        mVar16.C(155389884);
                        x0.f111346a.h(t2Var6, mVar16, (iIntValue16 & 14) | (x0.f111348c << 3));
                        mVar16.f();
                    } else {
                        mVar16.C(155436012);
                        mVar16.f();
                    }
                    x1 x1Var27 = n.f135158a;
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
        }
    }
}
