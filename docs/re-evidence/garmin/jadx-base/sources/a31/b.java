package a31;

import as.q;
import b82.d2;
import c2.b0;
import c2.j;
import c2.l;
import c2.t2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nr.c0;
import nr.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import u1.a2;
import u1.w;
import v.h;
import w2.a0;
import zo1.f1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f917b;

    public /* synthetic */ b(List list, int i14) {
        this.f916a = i14;
        this.f917b = list;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x02b7 A[LOOP:1: B:93:0x0287->B:104:0x02b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x02ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x02f1 A[LOOP:3: B:110:0x02c2->B:121:0x02f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:308:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x025b  */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        String str;
        o13.p pVar;
        String str2;
        Object next2;
        String str3;
        String str4;
        int i14 = this.f916a;
        m.a aVar = m.f135153a;
        float f14 = 1.0f;
        int i15 = 4;
        h4.d.c cVar = null;
        int i16 = 2;
        final int i17 = 0;
        int i18 = 0;
        List<k31.c> list = this.f917b;
        final int i19 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                d dVar = d.f921a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarB = a2.b(l.y(rVarF, j92.b.f97899b.f97920e), a2.a(mVar), true);
                    j jVar = j.f22691a;
                    g6.f.a aVar2 = g6.f.f75994b;
                    jVar.getClass();
                    j.i iVarI = j.i(16);
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(iVarI, h4.d.a.f81536n, mVar, 6);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(rVarB, mVar);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    mVar.C(835723820);
                    for (k31.c cVar2 : list) {
                        String strC = cVar2.c(a0.s(mVar));
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarE = d92.c.e(j92.f.f97931h);
                        String strB = cVar2.b(a0.s(mVar), new Object[i17]);
                        x0 x0Var = j92.f.f97932i;
                        String strQ = gl1.y.Q(mVar, cVar2.f102654j);
                        x0 x0VarE2 = d92.c.e(x0Var);
                        r rVarX = x2.x(x2.f(r.S, f14), cVar, 3);
                        u4.d dVar2 = cVar2.f102648d;
                        Object objQ = mVar.q();
                        aVar.getClass();
                        m.a.C2565a c2565a = m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new a03.d(13);
                            mVar.K(objQ);
                        }
                        e23.a aVar4 = (e23.a) objQ;
                        Object objQ2 = mVar.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new a03.d(14);
                            mVar.K(objQ2);
                        }
                        r31.r.b(dVar2, strC, strB, strQ, aVar4, (e23.a) objQ2, rVarX, null, null, null, new c(strC, x0VarE, i17), new c(strB, x0Var, i19), new c(strQ, x0VarE2, 2), 0L, mVar, 1794048, 25472);
                        cVar = cVar;
                        f14 = 1.0f;
                        i17 = 0;
                    }
                    mVar.f();
                    mVar.y();
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    if (list == null) {
                        mVar2.C(-1967885780);
                        mVar2.f();
                    } else {
                        mVar2.C(-1967885779);
                        Iterator it = list.iterator();
                        while (true) {
                            int i24 = i18;
                            if (it.hasNext()) {
                                Object next3 = it.next();
                                i18 = i24 + 1;
                                if (i24 < 0) {
                                    x.q();
                                    throw null;
                                }
                                d2.f16532a.g(i24, 384, 2, null, mVar2, z3.f.c(1728547259, new af1.l(i24, (c0) next3, i19), mVar2));
                            } else {
                                mVar2.f();
                            }
                        }
                    }
                    x1 x1Var4 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    if (list == null) {
                        mVar3.C(51583955);
                        mVar3.f();
                    } else {
                        mVar3.C(51583956);
                        int i25 = 0;
                        for (Object obj3 : list) {
                            int i26 = i25 + 1;
                            if (i25 < 0) {
                                x.q();
                                throw null;
                            }
                            d2.f16532a.g(i25, 384, 2, null, mVar3, z3.f.c(2111216507, new af1.l(i25, (d0) obj3, i16), mVar3));
                            i25 = i26;
                        }
                        mVar3.f();
                    }
                    x1 x1Var6 = n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    if (list == null) {
                        mVar4.C(509969217);
                        mVar4.f();
                    } else {
                        mVar4.C(509969218);
                        int i27 = 0;
                        for (Object obj4 : list) {
                            int i28 = i27 + 1;
                            if (i27 < 0) {
                                x.q();
                                throw null;
                            }
                            nr.e0 e0Var = (nr.e0) obj4;
                            Object objQ3 = mVar4.q();
                            aVar.getClass();
                            m.a.C2565a c2565a2 = m.a.f135155b;
                            if (objQ3 == c2565a2) {
                                objQ3 = p0.n(Boolean.TRUE);
                                mVar4.K(objQ3);
                            }
                            p1 p1Var = (p1) objQ3;
                            d2 d2Var = d2.f16532a;
                            r.a aVar5 = r.S;
                            Object objQ4 = mVar4.q();
                            if (objQ4 == c2565a2) {
                                objQ4 = new ak0.z(p1Var, i15);
                                mVar4.K(objQ4);
                            }
                            d2Var.g(i27, 384, 0, w.d(aVar5, false, null, null, (e23.a) objQ4, 15), mVar4, z3.f.c(-1186738680, new q(i27, e0Var, p1Var, i17), mVar4));
                            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                                mVar4.C(13666397);
                                List<nr.b0> list2 = e0Var.f127034c;
                                if (list2 == null) {
                                    mVar4.C(423658308);
                                    mVar4.f();
                                } else {
                                    mVar4.C(423658309);
                                    for (final nr.b0 b0Var2 : list2) {
                                        if (b0Var2.f126995f) {
                                            mVar4.C(1477696026);
                                            d2.f16532a.g(i27, 384, 2, null, mVar4, z3.f.c(425773466, new e23.q() { // from class: as.r
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    int i29 = i17;
                                                    nr.b0 b0Var3 = b0Var2;
                                                    t2 t2Var = (t2) obj5;
                                                    switch (i29) {
                                                        case 0:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            t2Var.getClass();
                                                            if ((iIntValue5 & 6) == 0) {
                                                                iIntValue5 |= mVar5.B(t2Var) ? 4 : 2;
                                                            }
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                x1 x1Var8 = p3.n.f135158a;
                                                                int i30 = iIntValue5;
                                                                d2 d2Var2 = d2.f16532a;
                                                                String strValueOf = String.valueOf(b0Var3.f126990a);
                                                                h4.r.a aVar6 = h4.r.S;
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar = j92.b.f97899b;
                                                                float f15 = eVar.f97920e;
                                                                float f16 = eVar.f97918c;
                                                                int i34 = i30 & 14;
                                                                d2Var2.f(t2Var, strValueOf, t2Var.a(c2.l.B(aVar6, f15, f15, f16, f15), 1.8f, true), null, 0, 0, mVar5, i34, 28);
                                                                d2Var2.f(t2Var, b0Var3.f126991b, t2Var.a(k.e(aVar6), 3.0f, true), null, 0, 0, mVar5, i34, 28);
                                                                d2Var2.f(t2Var, b0Var3.f126992c, t2Var.a(k.e(aVar6), 2.0f, true), null, 0, 0, mVar5, i34, 28);
                                                                d2Var2.f(t2Var, b0Var3.f126993d, t2Var.a(k.e(aVar6), 2.0f, true), null, 0, 0, mVar5, i34, 28);
                                                                d2Var2.f(t2Var, b0Var3.f126994e, t2Var.a(c2.l.B(aVar6, f16, f15, f15, f15), 2.2f, true), null, 0, 0, mVar5, i34, 28);
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            break;
                                                        default:
                                                            p3.m mVar6 = (p3.m) obj6;
                                                            int iIntValue6 = ((Integer) obj7).intValue();
                                                            t2Var.getClass();
                                                            if ((iIntValue6 & 6) == 0) {
                                                                iIntValue6 |= mVar6.B(t2Var) ? 4 : 2;
                                                            }
                                                            if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                                                x1 x1Var9 = p3.n.f135158a;
                                                                int i35 = iIntValue6;
                                                                d2 d2Var3 = d2.f16532a;
                                                                h4.r.a aVar7 = h4.r.S;
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar2 = j92.b.f97899b;
                                                                float f17 = eVar2.f97920e;
                                                                float f18 = eVar2.f97918c;
                                                                int i36 = i35 & 14;
                                                                int i37 = i36 | 48;
                                                                d2Var3.f(t2Var, "", t2Var.a(c2.l.B(aVar7, f17, f17, f18, f17), 1.8f, true), null, 0, 0, mVar6, i37, 28);
                                                                d2Var3.f(t2Var, gl1.y.Q(mVar6, R.string.stress_level_rest), t2Var.a(k.e(aVar7), 3.0f, true), null, 0, 0, mVar6, i36, 28);
                                                                d2Var3.f(t2Var, b0Var3.f126992c, t2Var.a(k.e(aVar7), 2.0f, true), null, 0, 0, mVar6, i36, 28);
                                                                d2Var3.f(t2Var, "", t2Var.a(k.e(aVar7), 2.0f, true), null, 0, 0, mVar6, i37, 28);
                                                                d2Var3.f(t2Var, "", t2Var.a(c2.l.B(aVar7, f18, f17, f17, f17), 2.2f, true), null, 0, 0, mVar6, i37, 28);
                                                            } else {
                                                                mVar6.e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, mVar4));
                                            mVar4.f();
                                        } else {
                                            mVar4.C(1480034759);
                                            d2.f16532a.g(i27, 384, 2, null, mVar4, z3.f.c(1039646193, new e23.q() { // from class: as.r
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    int i29 = i19;
                                                    nr.b0 b0Var3 = b0Var2;
                                                    t2 t2Var = (t2) obj5;
                                                    switch (i29) {
                                                        case 0:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            t2Var.getClass();
                                                            if ((iIntValue5 & 6) == 0) {
                                                                iIntValue5 |= mVar5.B(t2Var) ? 4 : 2;
                                                            }
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                x1 x1Var8 = p3.n.f135158a;
                                                                int i30 = iIntValue5;
                                                                d2 d2Var2 = d2.f16532a;
                                                                String strValueOf = String.valueOf(b0Var3.f126990a);
                                                                h4.r.a aVar6 = h4.r.S;
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar = j92.b.f97899b;
                                                                float f15 = eVar.f97920e;
                                                                float f16 = eVar.f97918c;
                                                                int i34 = i30 & 14;
                                                                d2Var2.f(t2Var, strValueOf, t2Var.a(c2.l.B(aVar6, f15, f15, f16, f15), 1.8f, true), null, 0, 0, mVar5, i34, 28);
                                                                d2Var2.f(t2Var, b0Var3.f126991b, t2Var.a(k.e(aVar6), 3.0f, true), null, 0, 0, mVar5, i34, 28);
                                                                d2Var2.f(t2Var, b0Var3.f126992c, t2Var.a(k.e(aVar6), 2.0f, true), null, 0, 0, mVar5, i34, 28);
                                                                d2Var2.f(t2Var, b0Var3.f126993d, t2Var.a(k.e(aVar6), 2.0f, true), null, 0, 0, mVar5, i34, 28);
                                                                d2Var2.f(t2Var, b0Var3.f126994e, t2Var.a(c2.l.B(aVar6, f16, f15, f15, f15), 2.2f, true), null, 0, 0, mVar5, i34, 28);
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            break;
                                                        default:
                                                            p3.m mVar6 = (p3.m) obj6;
                                                            int iIntValue6 = ((Integer) obj7).intValue();
                                                            t2Var.getClass();
                                                            if ((iIntValue6 & 6) == 0) {
                                                                iIntValue6 |= mVar6.B(t2Var) ? 4 : 2;
                                                            }
                                                            if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                                                x1 x1Var9 = p3.n.f135158a;
                                                                int i35 = iIntValue6;
                                                                d2 d2Var3 = d2.f16532a;
                                                                h4.r.a aVar7 = h4.r.S;
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar2 = j92.b.f97899b;
                                                                float f17 = eVar2.f97920e;
                                                                float f18 = eVar2.f97918c;
                                                                int i36 = i35 & 14;
                                                                int i37 = i36 | 48;
                                                                d2Var3.f(t2Var, "", t2Var.a(c2.l.B(aVar7, f17, f17, f18, f17), 1.8f, true), null, 0, 0, mVar6, i37, 28);
                                                                d2Var3.f(t2Var, gl1.y.Q(mVar6, R.string.stress_level_rest), t2Var.a(k.e(aVar7), 3.0f, true), null, 0, 0, mVar6, i36, 28);
                                                                d2Var3.f(t2Var, b0Var3.f126992c, t2Var.a(k.e(aVar7), 2.0f, true), null, 0, 0, mVar6, i36, 28);
                                                                d2Var3.f(t2Var, "", t2Var.a(k.e(aVar7), 2.0f, true), null, 0, 0, mVar6, i37, 28);
                                                                d2Var3.f(t2Var, "", t2Var.a(c2.l.B(aVar7, f18, f17, f17, f17), 2.2f, true), null, 0, 0, mVar6, i37, 28);
                                                            } else {
                                                                mVar6.e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, mVar4));
                                            mVar4.f();
                                        }
                                    }
                                    mVar4.f();
                                }
                                mVar4.f();
                            } else {
                                mVar4.C(428281277);
                                mVar4.f();
                            }
                            i27 = i28;
                        }
                        mVar4.f();
                    }
                    x1 x1Var8 = n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                bg2.c.d(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i29 = bv1.d.f21399b;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r rVarF2 = x2.f(r.S, 1.0f);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode2 = Long.hashCode(mVar5.getU());
                    i2 i2VarX2 = mVar5.x();
                    r rVarC2 = k.c(rVarF2, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar6);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar5, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar5);
                    b0 b0Var3 = b0.f22601a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj5 : list) {
                        Integer numValueOf = Integer.valueOf(((av1.b) obj5).f13245c);
                        Object arrayList = linkedHashMap.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(numValueOf, arrayList);
                        }
                        ((List) arrayList).add(obj5);
                    }
                    mVar5.C(1824681211);
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        int iIntValue6 = ((Number) entry.getKey()).intValue();
                        List list3 = (List) entry.getValue();
                        if (iIntValue6 <= -1 || list3.size() <= 1) {
                            mVar5.C(-1009705903);
                            bv1.e.b((av1.b) h0.b0(list3), mVar5, 0);
                            mVar5.f();
                        } else {
                            mVar5.C(-1009819208);
                            bv1.e.a(list3, mVar5, 0);
                            mVar5.f();
                        }
                        if (h0.f0(linkedHashMap.keySet(), Integer.valueOf(iIntValue6)) < linkedHashMap.keySet().size() - 1) {
                            mVar5.C(-1009421943);
                            r rVarF3 = x2.f(r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            l.f(x2.h(rVarF3, j92.b.f97899b.f97920e), mVar5);
                            mVar5.f();
                        } else {
                            mVar5.C(-1009272988);
                            mVar5.f();
                        }
                    }
                    mVar5.f();
                    mVar5.y();
                    x1 x1Var10 = n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                bv1.e.a(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                m mVar6 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        fd1.a aVar7 = (fd1.a) it3.next();
                        cd1.d.a(aVar7.f70477a, aVar7.f70478b, null, mVar6, 0);
                    }
                    x1 x1Var12 = n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list.size() == 1) {
                    String str5 = (String) h0.H0(list);
                    int iH = d53.w.H(charSequence, str5, iIntValue8, false, 4);
                    if (iH < 0) {
                        pVar = null;
                    } else {
                        pVar = new o13.p(Integer.valueOf(iH), str5);
                    }
                } else {
                    if (iIntValue8 < 0) {
                        iIntValue8 = 0;
                    }
                    j23.l lVar = new j23.l(iIntValue8, charSequence.length());
                    boolean z14 = charSequence instanceof String;
                    int i30 = lVar.f96798c;
                    int i34 = lVar.f96797b;
                    int i35 = lVar.f96796a;
                    if (z14) {
                        if ((i30 <= 0 || i35 > i34) && (i30 >= 0 || i34 > i35)) {
                            pVar = null;
                        } else {
                            while (true) {
                                Iterator it4 = list.iterator();
                                do {
                                    if (it4.hasNext()) {
                                        next2 = it4.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        pVar = new o13.p(Integer.valueOf(i35), str3);
                                    } else if (i35 != i34) {
                                        i35 += i30;
                                    } else {
                                        pVar = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, i35, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    pVar = new o13.p(Integer.valueOf(i35), str3);
                                } else if (i35 != i34) {
                                    i35 += i30;
                                } else {
                                    pVar = null;
                                }
                            }
                        }
                    } else if ((i30 <= 0 || i35 > i34) && (i30 >= 0 || i34 > i35)) {
                        pVar = null;
                    } else {
                        int i36 = i35;
                        while (true) {
                            Iterator it5 = list.iterator();
                            do {
                                if (it5.hasNext()) {
                                    next = it5.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    pVar = new o13.p(Integer.valueOf(i36), str);
                                } else if (i36 != i34) {
                                    i36 += i30;
                                } else {
                                    pVar = null;
                                }
                            } while (!d53.w.N(str2, false, 0, charSequence, i36, str2.length()));
                            str = (String) next;
                            if (str != null) {
                                pVar = new o13.p(Integer.valueOf(i36), str);
                            } else if (i36 != i34) {
                                i36 += i30;
                            } else {
                                pVar = null;
                            }
                        }
                    }
                }
                if (pVar != null) {
                    return new o13.p(pVar.f128594a, Integer.valueOf(((String) pVar.f128595b).length()));
                }
                return null;
            case 9:
                ((Integer) obj2).getClass();
                gs.l.a(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                hs.e.c(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                jt1.k.a(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                jt1.k.d(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                m mVar7 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    String strQ2 = gl1.y.Q(mVar7, list.size() == 1 ? R.string.bic_activity_profiles_restore_message : R.string.activity_profile_backup_header_msg);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar7), mVar7, 0, 0, 131070);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 14:
                m mVar8 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        ml1.b.b((String) it6.next(), mVar8, 0);
                    }
                    x1 x1Var15 = n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                o72.s.d(list, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                oo0.a.a(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                qc0.b.b(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                rv1.d.a(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                t42.p.c(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                m mVar9 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1399078180, new b(list, 21), mVar9), mVar9, 196608, 31);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 21:
                m mVar10 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    vr.g.e(list, mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                vr.g.e(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                vr.g.a(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                w52.y.j(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                xg2.k.b(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                f1.g(list, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(List list, int i14, int i15) {
        this.f916a = i15;
        this.f917b = list;
    }
}
