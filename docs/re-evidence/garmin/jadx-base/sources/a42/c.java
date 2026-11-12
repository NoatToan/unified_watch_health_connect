package a42;

import am.c1;
import am.e1;
import am.l1;
import android.app.Activity;
import android.content.Context;
import au0.k0;
import au0.l0;
import au0.m0;
import b21.v4;
import b82.d2;
import b82.g1;
import b82.k1;
import b82.t0;
import c2.x2;
import c22.c3;
import c62.h1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import d81.i0;
import ew1.f1;
import f2.o0;
import f5.z0;
import h2.j0;
import i3.mc;
import i3.mh;
import i3.uf;
import java.util.List;
import l72.i3;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;
import v62.o7;
import w52.q1;
import w52.v0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f984g;

    public /* synthetic */ c(d62.i iVar, e23.a aVar, String str, List list, WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity, e23.l lVar) {
        this.f978a = 13;
        this.f982e = iVar;
        this.f979b = aVar;
        this.f983f = str;
        this.f984g = list;
        this.f981d = workoutActivityProfileSelectionActivity;
        this.f980c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r20v0, types: [boolean] */
    private final Object a(Object obj, Object obj2) {
        i53.c cVar = (i53.c) this.f982e;
        c2.a0 a0Var = (c2.a0) this.f983f;
        g6.c cVar2 = (g6.c) this.f984g;
        j0 j0Var = (j0) this.f979b;
        o53.b0 b0Var = (o53.b0) this.f980c;
        p1 p1Var = (p1) this.f981d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        boolean z14 = false;
        int i14 = 1;
        int i15 = 2;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = 0;
            for (Object obj3 : cVar) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                g02.p1 p1Var2 = (g02.p1) obj3;
                h4.r.a aVar = h4.r.S;
                h4.d.f81522a.getClass();
                h4.r rVarB = a0Var.b(aVar, h4.d.a.f81537o);
                boolean zB = mVar.B(cVar2);
                Object objQ = mVar.q();
                p3.m.a aVar2 = p3.m.f135153a;
                if (zB) {
                    objQ = new g02.r(cVar2, p1Var, i14);
                    mVar.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new g02.r(cVar2, p1Var, i14);
                        mVar.K(objQ);
                    }
                }
                h4.r rVarG = f5.g0.g(rVarB, (e23.l) objQ);
                boolean zB2 = mVar.B(p1Var2);
                Object objQ2 = mVar.q();
                if (zB2) {
                    objQ2 = new o0(p1Var2, 27);
                    mVar.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new o0(p1Var2, 27);
                        mVar.K(objQ2);
                    }
                }
                h4.r rVarC = p5.v.c((e23.l) objQ2, rVarG, z14);
                ?? r14 = j0Var.l() == i16 ? i14 : z14;
                long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar);
                ?? r24 = r14;
                long jX = com.nimbusds.jose.shaded.gson.internal.a.x(mVar);
                boolean zR = mVar.r(b0Var) | mVar.B(j0Var) | mVar.k(i16);
                Object objQ3 = mVar.q();
                if (zR) {
                    objQ3 = new a83.a(b0Var, j0Var, i16, 6);
                    mVar.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new a83.a(b0Var, j0Var, i16, 6);
                        mVar.K(objQ3);
                    }
                }
                p3.m mVar2 = mVar;
                uf.c(r24, (e23.a) objQ3, rVarC, false, z3.f.c(990407618, new fp0.l(p1Var2, i15), mVar), jA, jX, mVar2, 24576, 296);
                mVar = mVar2;
                i16 = i17;
                z14 = false;
                i14 = 1;
                i15 = i15;
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0071  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a0  */
    private final Object b(Object obj, Object obj2) {
        CustomBarChart customBarChart = (CustomBarChart) this.f982e;
        rz.a aVar = (rz.a) this.f983f;
        LocalDate localDate = (LocalDate) this.f984g;
        LocalDate localDate2 = (LocalDate) this.f979b;
        z42.d dVar = (z42.d) this.f980c;
        Context context = (Context) this.f981d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 290);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(rVarH, j92.b.f97899b.f97920e, 0.0f, 2);
            boolean zR = mVar.r(customBarChart);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new di0.c(customBarChart, 2);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new di0.c(customBarChart, 2);
                    mVar.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = mVar.r(aVar) | mVar.r(localDate) | mVar.r(localDate2) | mVar.r(dVar) | mVar.r(context);
            Object objQ2 = mVar.q();
            if (zR2) {
                e1 e1Var = new e1(aVar, localDate, localDate2, dVar, context, 18);
                mVar.K(e1Var);
                objQ2 = e1Var;
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    e1 e1Var2 = new e1(aVar, localDate, localDate2, dVar, context, 18);
                    mVar.K(e1Var2);
                    objQ2 = e1Var2;
                }
            }
            p002j6.c.b(lVar, rVarA, (e23.l) objQ2, mVar, 0, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0071  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a1  */
    private final Object c(Object obj, Object obj2) {
        CustomBarChart customBarChart = (CustomBarChart) this.f982e;
        rz.a aVar = (rz.a) this.f983f;
        LocalDate localDate = (LocalDate) this.f984g;
        LocalDate localDate2 = (LocalDate) this.f979b;
        z42.i iVar = (z42.i) this.f980c;
        Context context = (Context) this.f981d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 290);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(rVarH, j92.b.f97899b.f97920e, 0.0f, 2);
            boolean zR = mVar.r(customBarChart);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new di0.c(customBarChart, 3);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new di0.c(customBarChart, 3);
                    mVar.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = mVar.r(aVar) | mVar.r(localDate) | mVar.r(localDate2) | mVar.r(iVar) | mVar.r(context);
            Object objQ2 = mVar.q();
            if (zR2) {
                e1 e1Var = new e1(aVar, localDate, localDate2, iVar, context, 19);
                mVar.K(e1Var);
                objQ2 = e1Var;
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    e1 e1Var2 = new e1(aVar, localDate, localDate2, iVar, context, 19);
                    mVar.K(e1Var2);
                    objQ2 = e1Var2;
                }
            }
            p002j6.c.b(lVar, rVarA, (e23.l) objQ2, mVar, 0, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        gn1.d.a((h4.r) this.f982e, (j23.i) this.f983f, (b63.u) this.f984g, (j23.g) this.f979b, (b63.u) this.f981d, (e23.l) this.f980c, (p3.m) obj, p0.t(196609));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2) {
        pv0.v vVar = (pv0.v) this.f982e;
        e23.a aVar = (e23.a) this.f979b;
        o53.b0 b0Var = (o53.b0) this.f983f;
        mc mcVar = (mc) this.f984g;
        p1 p1Var = (p1) this.f980c;
        p1 p1Var2 = (p1) this.f981d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (o72.t.P(vVar)) {
                mVar.C(-297588880);
                List<pv0.c> list = vVar.f141429b;
                boolean z14 = ((gw0.h0) p1Var.getF182175a()).f79614f;
                boolean zR = mVar.r(b0Var) | mVar.B(mcVar) | mVar.B(aVar);
                Object objQ = mVar.q();
                if (zR) {
                    gw0.x xVar = new gw0.x(b0Var, p1Var2, aVar, mcVar, 3);
                    mVar.K(xVar);
                    objQ = xVar;
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        gw0.x xVar2 = new gw0.x(b0Var, p1Var2, aVar, mcVar, 3);
                        mVar.K(xVar2);
                        objQ = xVar2;
                    }
                }
                gw0.g0.c(null, list, null, null, z14, aVar, (e23.l) objQ, mVar, 6, 12);
                mVar.f();
            } else {
                mVar.C(-296991138);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:138:0x0534  */
    /* JADX WARN: Code duplicated, block: B:203:0x0729  */
    /* JADX WARN: Code duplicated, block: B:279:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:308:0x0b3c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:317:0x0b90  */
    /* JADX WARN: Code duplicated, block: B:323:0x0bc8  */
    /* JADX WARN: Code duplicated, block: B:328:0x0c12  */
    /* JADX WARN: Code duplicated, block: B:57:0x0242  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x031b  */
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
        p3.m mVar;
        boolean z14;
        int i14 = this.f978a;
        int i15 = 7;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f981d;
        Object obj4 = this.f980c;
        Object obj5 = this.f979b;
        Object obj6 = this.f984g;
        Object obj7 = this.f983f;
        Object obj8 = this.f982e;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                h.a((d42.b) obj8, (q71.e) obj7, (List) obj6, (e23.a) obj5, (e23.l) obj4, (ky0.w) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                h0.a((e42.b) obj8, (e23.a) obj5, (w02.b) obj7, (e23.a) obj6, (e23.l) obj4, (ky0.w) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                e23.a aVar2 = (e23.a) obj5;
                e23.a aVar3 = (e23.a) obj8;
                String str = (String) obj7;
                p1 p1Var = (p1) obj6;
                x3 x3Var = (x3) obj4;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar2.C(-2024928087);
                        String strQ = gl1.y.Q(mVar2, R.string.search_activities);
                        boolean zB = mVar2.B(aVar2);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new defpackage.c(aVar2, 9);
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new defpackage.c(aVar2, 9);
                                mVar2.K(objQ);
                            }
                        }
                        e23.a aVar4 = (e23.a) objQ;
                        i53.f fVarA = i53.a.a(new i3("DONE", gl1.y.Q(mVar2, R.string.lbl_done), ((gr.a) x3Var.getF182175a()).f78516c != ((gr.a) x3Var.getF182175a()).f78517d, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                        boolean zB2 = mVar2.B(aVar3);
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new a03.h0(aVar3, 3);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new a03.h0(aVar3, 3);
                                mVar2.K(objQ2);
                            }
                        }
                        z02.f.d(strQ, null, null, aVar4, fVarA, null, (e23.l) objQ2, mVar2, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                        mVar2.f();
                    } else {
                        mVar2.C(-2024166789);
                        boolean zB3 = mVar2.B(aVar3);
                        Object objQ3 = mVar2.q();
                        if (zB3) {
                            objQ3 = new defpackage.c(aVar3, 10);
                            mVar2.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new defpackage.c(aVar3, 10);
                                mVar2.K(objQ3);
                            }
                        }
                        e23.a aVar5 = (e23.a) objQ3;
                        s62.a.f157643a.getClass();
                        i53.f fVarA2 = i53.a.a(new i3("SEARCH", gl1.y.Q(mVar2, R.string.lbl_search), false, o7.a(t62.b.f162798a), gl1.y.Q(mVar2, R.string.lbl_search), 4, (p005kotlin.jvm.internal.j) null));
                        boolean zB4 = mVar2.B(p1Var);
                        Object objQ4 = mVar2.q();
                        if (zB4) {
                            objQ4 = new c1(p1Var2, p1Var, 0);
                            mVar2.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new c1(p1Var2, p1Var, 0);
                                mVar2.K(objQ4);
                            }
                        }
                        z02.f.d(str, null, null, aVar5, fVarA2, null, (e23.l) objQ4, mVar2, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                m4.b0 b0Var = (m4.b0) obj8;
                p1 p1Var3 = (p1) obj7;
                gr.b bVar = (gr.b) obj6;
                p1 p1Var4 = (p1) obj5;
                p1 p1Var5 = (p1) obj4;
                x3 x3Var2 = (x3) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.r rVarD = x2.d(aVar6, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar7);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                        mVar3.C(1576519749);
                        t0 t0Var = t0.f16792a;
                        h4.r rVarF = x2.f(aVar6, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f14 = eVar.f97920e;
                        h4.r rVarA = m4.e.a(c2.l.B(rVarF, f14, f14, f14, eVar.f97917b), b0Var);
                        String str2 = (String) p1Var3.getF182175a();
                        String strQ2 = gl1.y.Q(mVar3, R.string.lbl_search);
                        boolean zB5 = mVar3.B(p1Var3);
                        Object objQ5 = mVar3.q();
                        if (zB5) {
                            byte b14 = 0;
                            objQ5 = new l1(p1Var3, b14, b14);
                            mVar3.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                byte b15 = 0;
                                objQ5 = new l1(p1Var3, b15, b15);
                                mVar3.K(objQ5);
                            }
                        }
                        t0Var.g(rVarA, str2, strQ2, null, null, 0L, (e23.p) objQ5, mVar3, 0, 56);
                        mVar3.f();
                    } else {
                        mVar3.C(1577152800);
                        i53.f fVarA3 = i53.a.a(new g1(gl1.y.Q(mVar3, R.string.lbl_suggestions), null, null, null, 14, null), new g1(gl1.y.Q(mVar3, R.string.common_all), null, null, null, 14, null));
                        boolean zBooleanValue = ((Boolean) p1Var5.getF182175a()).booleanValue();
                        h4.r rVarF2 = x2.f(aVar6, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f15 = eVar2.f97920e;
                        h4.r rVarB = c2.l.B(rVarF2, f15, f15, f15, eVar2.f97917b);
                        Object objQ6 = mVar3.q();
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new a11.m(p1Var5, 1);
                            mVar3.K(objQ6);
                        }
                        k1.a(fVarA3, zBooleanValue ? 1 : 0, rVarB, null, 0.0f, (e23.l) objQ6, mVar3, 196608, 24);
                        mVar3.f();
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(c2.l.A(aVar6, 0.0f, j92.b.f97899b.f97918c, 1), mVar3);
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        mVar3.C(1578037881);
                        am.p1.c((String) p1Var3.getF182175a(), (gr.a) x3Var2.getF182175a(), bVar, mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(1578152271);
                        am.p1.e((String) p1Var3.getF182175a(), (gr.a) x3Var2.getF182175a(), bVar, mVar3, 0);
                        mVar3.f();
                    }
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                x3 x3Var3 = (x3) obj8;
                e23.a aVar8 = (e23.a) obj5;
                wn1.n nVar = (wn1.n) obj7;
                String str3 = (String) obj6;
                e23.a aVar9 = (e23.a) obj4;
                e23.a aVar10 = (e23.a) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    z02.d.a(((Boolean) x3Var3.getF182175a()).booleanValue(), z3.f.c(630859799, new a51.g(aVar8, 5), mVar4), null, null, null, z3.f.c(1307866139, new ao1.h(nVar, str3, aVar9, aVar10), mVar4), mVar4, 196656, 28);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                Context context = (Context) obj8;
                p1 p1Var6 = (p1) obj7;
                p1 p1Var7 = (p1) obj6;
                p1 p1Var8 = (p1) obj5;
                p1 p1Var9 = (p1) obj4;
                p1 p1Var10 = (p1) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    g6.f.a aVar11 = g6.f.f75994b;
                    d2Var.d(c2.l.C(h4.r.S, 0.0f, 10, 0.0f, 7, 5), z3.f.c(-1743600795, new ak0.h(context, (Object) p1Var6, (Object) p1Var7, (Object) p1Var8, (Object) p1Var9, p1Var10, 2), mVar5), mVar5, 54, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                List list = (List) obj6;
                p1 p1Var11 = (p1) obj8;
                p1 p1Var12 = (p1) obj7;
                p1 p1Var13 = (p1) obj5;
                p1 p1Var14 = (p1) obj4;
                p1 p1Var15 = (p1) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    if (list == null) {
                        mVar6.C(2047914664);
                        mVar6.f();
                    } else {
                        mVar6.C(2047914665);
                        int i16 = 0;
                        for (Object obj9 : list) {
                            int i17 = i16 + 1;
                            if (i16 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            nr.b0 b0Var3 = (nr.b0) obj9;
                            d2 d2Var2 = d2.f16532a;
                            h4.r.a aVar12 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            d2Var2.g(i16, 384, 0, c2.l.A(aVar12, 0.0f, j92.b.f97899b.f97920e, 1), mVar6, z3.f.c(1013548538, new as.h(i16, b0Var3, p1Var11, p1Var12, p1Var13, p1Var14, p1Var15), mVar6));
                            i16 = i17;
                        }
                        mVar6.f();
                    }
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                at.e.b((mc) obj8, (vs.e) obj7, (o13.p) obj6, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                m0 m0Var = (m0) obj8;
                p004k6.u uVar = (p004k6.u) obj7;
                String str4 = (String) obj6;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                m0.b bVar3 = m0.f12967d;
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    boolean zR = mVar7.r(m0Var);
                    Object objQ7 = mVar7.q();
                    if (zR) {
                        objQ7 = new k0(m0Var, 0);
                        mVar7.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new k0(m0Var, 0);
                            mVar7.K(objQ7);
                        }
                    }
                    i3.l.d((e23.a) objQ7, null, uVar, z3.f.c(-1189110472, new l0(m0Var, str4, str5, str6, str7, 0), mVar7), mVar7, 3072, 2);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                e23.q qVar = (e23.q) obj8;
                c12.h hVar = (c12.h) obj7;
                e23.q qVar2 = (e23.q) obj6;
                e23.l lVar = (e23.l) obj4;
                z3.e eVar3 = (z3.e) obj5;
                x3 x3Var4 = (x3) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar13 = h4.r.S;
                    h4.r rVarD2 = x2.d(aVar13, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode2 = Long.hashCode(mVar8.getU());
                    i2 i2VarX2 = mVar8.x();
                    h4.r rVarC2 = h4.k.c(rVarD2, mVar8);
                    h5.g.V.getClass();
                    h5.e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar14);
                    } else {
                        mVar8.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, zVarA2, mVar8);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar8);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar8, iHashCode2, bVar4);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar8);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    if (qVar != null) {
                        mVar8.C(1184813301);
                        qVar.invoke(hVar, mVar8, 0);
                        mVar8.f();
                    } else {
                        mVar8.C(1184862312);
                        mVar8.f();
                    }
                    h4.r rVarA2 = b0Var4.a(aVar13, 1.0f, true);
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode3 = Long.hashCode(mVar8.getU());
                    i2 i2VarX3 = mVar8.x();
                    h4.r rVarC3 = h4.k.c(rVarA2, mVar8);
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar14);
                    } else {
                        mVar8.c();
                    }
                    b4.c(eVar4, z0VarD, mVar8);
                    b4.c(c1623g, i2VarX3, mVar8);
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar8, iHashCode3, bVar4);
                    }
                    b4.c(fVar, rVarC3, mVar8);
                    c2.u uVar2 = c2.u.f22885a;
                    if (lVar == null) {
                        mVar8.C(-757159017);
                        eVar3.invoke(((c12.h.b) x3Var4.getF182175a()).f22560b.f22562a, hVar, mVar8, 0);
                        mVar8.f();
                        mVar = mVar8;
                    } else {
                        mVar8.C(-757040442);
                        r1.b.a(((c12.h.b) x3Var4.getF182175a()).f22560b, null, lVar, null, null, null, z3.f.c(744374156, new ao1.f(1, eVar3, hVar), mVar8), mVar8, 1572864, 58);
                        mVar = mVar8;
                        mVar.f();
                    }
                    mVar.y();
                    if (qVar2 != null) {
                        mVar.C(1185472981);
                        qVar2.invoke(hVar, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(1185521992);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar5 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) obj8;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj7;
                h1 h1Var = (h1) obj6;
                l52.i.a aVar15 = (l52.i.a) obj4;
                e23.a aVar16 = (e23.a) obj5;
                e23.q qVar3 = (e23.q) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    if (k52.g.f(eVar5.getF24782e()) || eVar5.getF24782e() == m52.k.B) {
                        WorkoutDetailsDTO f48577a = eVar5.getF48577a();
                        if ((f48577a.F() || f48577a.H() || f48577a.f48044e == m52.k.A) && j0Var.f48217c != m52.d.REST) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                    m52.k kVarB = eVar5.getF24782e();
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.v> listD = eVar5.d();
                    PowerZonesDTO powerZonesDTOH = eVar5.getF24794q();
                    int i18 = powerZonesDTOH != null ? powerZonesDTOH.f43987b : 0;
                    double dY = eVar5.getF24795r();
                    com.garmin.android.apps.connectmobile.repcounting.model.c cVarC = eVar5.getF24796s();
                    boolean zIsFirst = aVar15.isFirst();
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVarA = eVar5.getF24785h();
                    boolean zD = eVar5.getF48577a().D();
                    boolean zH = eVar5.getF24797t();
                    o13.p<Boolean, Double> pVarZ = eVar5.z();
                    boolean zH2 = mVar9.h(z14) | mVar9.B(aVar16);
                    Object objQ8 = mVar9.q();
                    if (zH2) {
                        objQ8 = new as.i(z14, aVar16, 1);
                        mVar9.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new as.i(z14, aVar16, 1);
                            mVar9.K(objQ8);
                        }
                    }
                    q1.l(h1Var, kVarB, j0Var, listD, i18, dY, cVarC, zIsFirst, dVarA, zD, zH, pVarZ, (e23.a) objQ8, eVar5.getF24783f(), qVar3, mVar9, (com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 << 6) | (com.garmin.android.apps.connectmobile.repcounting.model.c.f41096c << 18));
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                e23.a aVar17 = (e23.a) obj5;
                e23.a aVar18 = (e23.a) obj8;
                i53.f fVar2 = (i53.f) obj7;
                n82.f fVar3 = (n82.f) obj6;
                yd1.a aVar19 = (yd1.a) obj4;
                c70.i iVar = (c70.i) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar10.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    z02.d.a(false, z3.f.c(1876947210, new at1.f(aVar17, aVar18, i15), mVar10), null, null, null, z3.f.c(-1320939642, new a51.l(fVar2, fVar3, aVar19, iVar, 20), mVar10), mVar10, 196656, 29);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                cv1.k.a((h4.r) obj8, (String) obj7, (String) obj6, (String) obj5, (String) obj4, (hv1.c) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                d62.i iVar2 = (d62.i) obj8;
                e23.a aVar20 = (e23.a) obj5;
                String str8 = (String) obj7;
                List list2 = (List) obj6;
                WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity = (WorkoutActivityProfileSelectionActivity) obj3;
                e23.l lVar2 = (e23.l) obj4;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                WorkoutActivityProfileSelectionActivity.b bVar5 = WorkoutActivityProfileSelectionActivity.f48559a;
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    b82.c.c(z3.f.c(1785509284, new WorkoutActivityProfileSelectionActivity.c(iVar2, aVar20), mVar11), z3.f.c(829804138, new ak0.j(str8, list2, workoutActivityProfileSelectionActivity, iVar2, lVar2, 14), mVar11), mVar11, 54);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                i0.b((h4.r) obj8, (c3) obj7, (c3) obj6, (c3) obj5, (c3) obj4, (c3) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                dd1.e.a((u82.d) obj8, (u82.d) obj7, (u82.d) obj6, (i53.c) obj3, (e23.l) obj4, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                dj0.i.b((gj0.a) obj8, (gj0.d) obj7, (yi0.c) obj6, (yi0.b) obj5, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                b.u uVar3 = (b.u) obj8;
                i3 i3Var = (i3) obj7;
                i3 i3Var2 = (i3) obj6;
                e23.a aVar21 = (e23.a) obj5;
                e23.l lVar3 = (e23.l) obj4;
                p1 p1Var16 = (p1) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar12.n(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar12, R.string.lbl_functional_threshold_power_short);
                    boolean zR2 = mVar12.r(uVar3);
                    Object objQ9 = mVar12.q();
                    if (zR2) {
                        objQ9 = new dj0.m.a(uVar3);
                        mVar12.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new dj0.m.a(uVar3);
                            mVar12.K(objQ9);
                        }
                    }
                    e23.a aVar22 = (e23.a) ((k23.g) objQ9);
                    i53.f fVarA4 = i53.a.a(i3Var, i3Var2);
                    boolean zB6 = mVar12.B(aVar21) | mVar12.B(lVar3);
                    Object objQ10 = mVar12.q();
                    if (zB6) {
                        objQ10 = new dj0.k(aVar21, lVar3, p1Var16);
                        mVar12.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new dj0.k(aVar21, lVar3, p1Var16);
                            mVar12.K(objQ10);
                        }
                    }
                    z02.f.d(strQ3, null, null, aVar22, null, fVarA4, (e23.l) objQ10, mVar12, 2097152, 54);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                e11.x.g((h4.r) obj8, (v21.e) obj7, (g21.f0) obj6, (g21.f0) obj5, (i53.c) obj4, (i53.c) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                e62.j.a((v0) obj8, (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) obj7, (e23.a) obj5, (e23.l) obj4, (e23.l) obj6, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                f1 f1Var = (f1) obj8;
                e23.a aVar23 = (e23.a) obj5;
                Activity activity = (Activity) obj7;
                Context context2 = (Context) obj6;
                p1 p1Var17 = (p1) obj4;
                p1 p1Var18 = (p1) obj3;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                f1.a aVar24 = f1.f66451c;
                if (mVar13.n(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                    String strQ4 = gl1.y.Q(mVar13, R.string.lbl_next);
                    boolean zBooleanValue2 = ((Boolean) p1Var17.getF182175a()).booleanValue();
                    boolean zR3 = mVar13.r(f1Var) | mVar13.B(aVar23) | mVar13.r(activity) | mVar13.r(context2);
                    Object objQ11 = mVar13.q();
                    if (zR3) {
                        v4 v4Var = new v4(f1Var, aVar23, activity, p1Var18, context2, 6);
                        mVar13.K(v4Var);
                        objQ11 = v4Var;
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            v4 v4Var2 = new v4(f1Var, aVar23, activity, p1Var18, context2, 6);
                            mVar13.K(v4Var2);
                            objQ11 = v4Var2;
                        }
                    }
                    f0Var.d(384, 1, (e23.a) objQ11, rVarF3, strQ4, mVar13, null, zBooleanValue2);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 21:
                String str9 = (String) obj8;
                String str10 = (String) obj7;
                String str11 = (String) obj6;
                String str12 = (String) obj5;
                String str13 = (String) obj4;
                String str14 = (String) obj3;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar14.n(1 & iIntValue13, (iIntValue13 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    h4.r rVarD3 = x2.d(h4.r.S, 1.0f);
                    boolean zB7 = mVar14.B(str9);
                    Object objQ12 = mVar14.q();
                    if (zB7) {
                        objQ12 = new cq.t(str9, 26);
                        mVar14.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new cq.t(str9, 26);
                            mVar14.K(objQ12);
                        }
                    }
                    h4.r rVarC4 = p5.v.c((e23.l) objQ12, rVarD3, false);
                    c2.j.f22691a.getClass();
                    c2.j.f fVar4 = c2.j.f22699i;
                    h4.d.f81522a.getClass();
                    c2.z zVarA3 = c2.y.a(fVar4, h4.d.a.f81536n, mVar14, 6);
                    int iHashCode4 = Long.hashCode(mVar14.getU());
                    i2 i2VarX4 = mVar14.x();
                    h4.r rVarC5 = h4.k.c(rVarC4, mVar14);
                    h5.g.V.getClass();
                    h5.e0.a aVar25 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar25);
                    } else {
                        mVar14.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar14);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar14);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar14, iHashCode4, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar14);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97930g;
                    mh.c(str10, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar14), mVar14, 0, 0, 131070);
                    g02.e0.a(str11, str12, null, null, false, false, false, null, null, null, null, d92.c.b(x0Var, mVar14), mVar14, 24576, 0, 2028);
                    g02.e0.a(str13, str14, null, null, false, false, false, null, null, null, null, d92.c.b(x0Var, mVar14), mVar14, 24576, 0, 2028);
                    mVar14.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 22:
                return a(obj, obj2);
            case 23:
                return b(obj, obj2);
            case 24:
                ((Integer) obj2).getClass();
                g52.g.a((LocalDate) obj8, (LocalDate) obj7, (z42.d) obj6, (o82.g) obj3, (e23.l) obj4, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                return c(obj, obj2);
            case 26:
                ((Integer) obj2).getClass();
                gl1.d.f((Long) obj8, (String) obj7, (kl1.a) obj6, (ws.a) obj5, (l80.b) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                return d(obj, obj2);
            case 28:
                return e(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                h21.j.a((o82.a) obj8, (i53.c) obj7, (pi0.e) obj6, (v21.e) obj5, (n82.f) obj4, (i21.d) obj3, (p3.m) obj, p0.t(513));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(int i14, e23.a aVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f978a = i14;
        this.f982e = obj;
        this.f979b = aVar;
        this.f983f = obj2;
        this.f984g = obj3;
        this.f980c = obj4;
        this.f981d = obj5;
    }

    public /* synthetic */ c(e23.a aVar, e23.a aVar2, Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f978a = i14;
        this.f979b = aVar;
        this.f982e = aVar2;
        this.f983f = obj;
        this.f984g = obj2;
        this.f980c = obj3;
        this.f981d = obj4;
    }

    public /* synthetic */ c(e42.b bVar, e23.a aVar, w02.b bVar2, e23.a aVar2, e23.l lVar, ky0.w wVar, int i14) {
        this.f978a = 1;
        this.f982e = bVar;
        this.f979b = aVar;
        this.f983f = bVar2;
        this.f984g = aVar2;
        this.f980c = lVar;
        this.f981d = wVar;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, e23.l lVar, e23.a aVar, int i14, int i15) {
        this.f978a = i15;
        this.f982e = obj;
        this.f983f = obj2;
        this.f984g = obj3;
        this.f981d = obj4;
        this.f980c = lVar;
        this.f979b = aVar;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, e23.l lVar, int i14, int i15) {
        this.f978a = i15;
        this.f982e = obj;
        this.f983f = obj2;
        this.f984g = obj3;
        this.f979b = obj4;
        this.f981d = obj5;
        this.f980c = lVar;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f978a = i14;
        this.f982e = obj;
        this.f983f = obj2;
        this.f984g = obj3;
        this.f979b = obj4;
        this.f980c = obj5;
        this.f981d = obj6;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14, int i15) {
        this.f978a = i15;
        this.f982e = obj;
        this.f983f = obj2;
        this.f984g = obj3;
        this.f979b = obj4;
        this.f980c = obj5;
        this.f981d = obj6;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, o13.h hVar, Object obj5, int i14) {
        this.f978a = i14;
        this.f982e = obj;
        this.f983f = obj2;
        this.f984g = obj3;
        this.f980c = obj4;
        this.f979b = hVar;
        this.f981d = obj5;
    }

    public /* synthetic */ c(List list, p1 p1Var, p1 p1Var2, p1 p1Var3, p1 p1Var4, p1 p1Var5) {
        this.f978a = 6;
        this.f984g = list;
        this.f982e = p1Var;
        this.f983f = p1Var2;
        this.f979b = p1Var3;
        this.f980c = p1Var4;
        this.f981d = p1Var5;
    }

    public /* synthetic */ c(v0 v0Var, com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, e23.a aVar, e23.l lVar, e23.l lVar2, e23.a aVar2, int i14) {
        this.f978a = 19;
        this.f982e = v0Var;
        this.f983f = fVar;
        this.f979b = aVar;
        this.f980c = lVar;
        this.f984g = lVar2;
        this.f981d = aVar2;
    }
}
