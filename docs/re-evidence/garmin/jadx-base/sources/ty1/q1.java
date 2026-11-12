package ty1;

import android.content.Context;
import android.content.DialogInterface;
import c2.x2;
import i3.i7;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.androidx.fragment.koin.KoinApplicationExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import v62.d3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167218a;

    public /* synthetic */ q1(int i14) {
        this.f167218a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f167218a;
        int i15 = 8;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 1:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 2:
                r1.n nVar = (r1.n) obj;
                ((Integer) obj2).getClass();
                nVar.getClass();
                r1.n.a.f149168b.getClass();
                int i16 = r1.n.a.f149173g;
                return new r1.l0(nVar.e(i16, s1.l.d(500, 0, null, 6), r1.o.f149178a), nVar.b(i16, s1.l.d(500, 0, null, 6), r1.p.f149188a), 0.0f, null, 12, null);
            case 3:
                return Integer.valueOf(((u1.d2) obj2).f167433a.getIntValue());
            case 4:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                u50.a aVar4 = u50.a.f168642a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 5:
                t13.g.a aVar5 = (t13.g.a) obj2;
                if (!(aVar5 instanceof o53.f2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue2 = num != null ? num.intValue() : 1;
                return iIntValue2 == 0 ? aVar5 : Integer.valueOf(iIntValue2 + 1);
            case 6:
                o53.f2 f2Var = (o53.f2) obj;
                t13.g.a aVar6 = (t13.g.a) obj2;
                if (f2Var != null) {
                    return f2Var;
                }
                if (aVar6 instanceof o53.f2) {
                    return (o53.f2) aVar6;
                }
                return null;
            case 7:
                u53.e0 e0Var = (u53.e0) obj;
                t13.g.a aVar7 = (t13.g.a) obj2;
                if (aVar7 instanceof o53.f2) {
                    o53.f2<Object> f2Var2 = (o53.f2) aVar7;
                    t13.g gVar = e0Var.f168727a;
                    Object objS = f2Var2.S();
                    Object[] objArr = e0Var.f168728b;
                    int i17 = e0Var.f168730d;
                    objArr[i17] = objS;
                    o53.f2<Object>[] f2VarArr = e0Var.f168729c;
                    e0Var.f168730d = i17 + 1;
                    f2VarArr[i17] = f2Var2;
                }
                return e0Var;
            case 8:
                ((Integer) obj2).getClass();
                u72.c.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                u72.c.d((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 10:
                return KoinApplicationExtKt.fragmentFactoryModule$lambda$1$lambda$0((Scope) obj, (ParametersHolder) obj2);
            case 11:
                Scope scope = (Scope) obj;
                u80.a aVar8 = u80.a.f169457a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                s80.c cVar = (s80.c) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(s80.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                bVar.getClass();
                return new s80.g(contextAndroidContext, cVar, bVar, null, 8, null);
            case 12:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                u80.a aVar9 = u80.a.f169457a;
                scope2.getClass();
                parametersHolder.getClass();
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new s80.i(((Number) parametersHolder.elementAt(0, t0Var.b(Long.class))).longValue(), (y92.a) scope2.get((k23.d<?>) t0Var.b(y92.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.a) scope2.get((k23.d<?>) t0Var.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 8, null);
            case 13:
                Scope scope3 = (Scope) obj;
                u80.a aVar10 = u80.a.f169457a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                rd2.j jVar = rd2.f.a().f152045a;
                jVar.getClass();
                return new s80.d(jVar, (l80.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 14:
                u80.a aVar11 = u80.a.f169457a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (t80.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC_WEB_URL, t80.a.class, new c83.h.a[0], null, null, null, 120);
            case 15:
                Scope scope4 = (Scope) obj;
                u80.a aVar12 = u80.a.f169457a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                t80.a aVar13 = (t80.a) scope4.get((k23.d<?>) t0Var2.b(t80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                f12.l lVar = (f12.l) scope4.get((k23.d<?>) t0Var2.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                da2.b bVar2 = da2.d.c(ModuleExtKt.androidContext(scope4)).f58886a.f111646e;
                bVar2.getClass();
                return new v80.c(bVar2, aVar13, lVar, null, 8, null);
            case 16:
                Scope scope5 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                u80.a aVar14 = u80.a.f169457a;
                scope5.getClass();
                parametersHolder2.getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                long jLongValue = ((Number) parametersHolder2.elementAt(0, t0Var3.b(Long.class))).longValue();
                ca2.a aVar15 = (ca2.a) parametersHolder2.elementAt(1, t0Var3.b(ca2.a.class));
                y92.e eVar = (y92.e) parametersHolder2.elementAt(2, t0Var3.b(y92.e.class));
                f12.b bVar3 = (f12.b) Scope.get$default(scope5, t0Var3.b(f12.b.class), (Qualifier) null, (e23.a) null, 6, (Object) null);
                return new aa2.u(aVar15, new z92.a(bVar3.getUserProfilePk(), ve2.f.c(bVar3.h()).name()), eVar, (y92.d) scope5.get((k23.d<?>) t0Var3.b(y92.d.class), (Qualifier) null, new a90.b(jLongValue, 16)));
            case 17:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                u91.a aVar16 = u91.a.f169525a;
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar17 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar17, j92.b.f97901d.f97905d);
                    s62.a.f157643a.getClass();
                    i7.b(v62.e1.a(t62.b.f162798a), null, rVarQ, androidx.room.a0.c(mVar2), mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                u91.b.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 19:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ua0.a aVar18 = ua0.a.f169596a;
                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    int i18 = b3.a.f15501a;
                    u4.d dVarC = c3.b.f23769a;
                    if (dVarC == null) {
                        g6.f.a aVar19 = g6.f.f75994b;
                        u4.d.a aVar20 = new u4.d.a("AutoMirrored.Filled.ExitToApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96, null);
                        p13.j0 j0Var = u4.m.f168519a;
                        o4.d0.f128823b.getClass();
                        o4.t1 t1Var = new o4.t1(o4.d0.f128824c, null);
                        o4.u1.f129010b.getClass();
                        o4.v1.f129019b.getClass();
                        int i19 = o4.v1.f129021d;
                        u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(10.09f, 15.59f, 11.5f, 17.0f);
                        eVarM.j(5.0f, -5.0f);
                        eVarM.j(-5.0f, -5.0f);
                        eVarM.j(-1.41f, 1.41f);
                        eVarM.i(12.67f, 11.0f);
                        eVarM.g(3.0f);
                        eVarM.p(2.0f);
                        eVarM.h(9.67f);
                        eVarM.j(-2.58f, 2.59f);
                        eVarM.c();
                        eVarM.k(19.0f, 3.0f);
                        eVarM.g(5.0f);
                        eVarM.e(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        eVarM.p(4.0f);
                        eVarM.h(2.0f);
                        eVarM.o(5.0f);
                        eVarM.h(14.0f);
                        eVarM.p(14.0f);
                        eVarM.g(5.0f);
                        eVarM.p(-4.0f);
                        eVarM.g(3.0f);
                        eVarM.p(4.0f);
                        eVarM.e(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        eVarM.h(14.0f);
                        eVarM.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        eVarM.o(5.0f);
                        eVarM.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        eVarM.c();
                        u4.d.a.b(aVar20, eVarM.f168407a, 0, t1Var, 1.0f, null, 1.0f, i19, 1.0f);
                        dVarC = aVar20.c();
                        c3.b.f23769a = dVarC;
                    }
                    i7.b(dVarC, null, null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar3), mVar3, 48, 4);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ub0.c cVar2 = ub0.c.f169719a;
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    o90.a aVar21 = new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null);
                    Object objQ = mVar4.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new u1.y1(i15);
                        mVar4.K(objQ);
                    }
                    e23.l lVar2 = (e23.l) objQ;
                    Object objQ2 = mVar4.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new u1.p1(7);
                        mVar4.K(objQ2);
                    }
                    ub0.d.a("Venu 2", aVar21, lVar2, (e23.a) objQ2, mVar4, 3462);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ub0.c cVar3 = ub0.c.f169719a;
                if (mVar5.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    o90.a aVar22 = new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null);
                    Object objQ3 = mVar5.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new u1.y1(9);
                        mVar5.K(objQ3);
                    }
                    e23.l lVar3 = (e23.l) objQ3;
                    Object objQ4 = mVar5.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new u1.p1(8);
                        mVar5.K(objQ4);
                    }
                    ub0.d.a(null, aVar22, lVar3, (e23.a) objQ4, mVar5, 3462);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ug0.b bVar4 = ug0.b.f170568a;
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = d3.a(t62.b.f162798a);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar6);
                    h4.r.a aVar23 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, null, x2.q(c2.l.y(aVar23, j92.b.f97899b.f97917b), j92.b.f97901d.f97904c), jA, mVar6, 48, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ug2.q0.e((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 24:
                Scope scope6 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                ui0.a aVar24 = ui0.a.f171176a;
                scope6.getClass();
                parametersHolder3.getClass();
                r53.i iVar = (r53.i) parametersHolder3.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(r53.i.class));
                ui0.a aVar25 = ui0.a.f171176a;
                Context contextAndroidContext2 = ModuleExtKt.androidContext(scope6);
                yi0.c cVar4 = yi0.c.CYCLING;
                aVar25.getClass();
                f12.l.f68084a.getClass();
                return new ti0.b(new ri0.d(contextAndroidContext2, iVar, f12.l.a.a(), cVar4), cVar4);
            case 25:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                ui0.a aVar26 = ui0.a.f171176a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                return new si0.b((ti0.b) parametersHolder4.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(ti0.b.class)), yi0.c.CYCLING);
            case 26:
                Scope scope7 = (Scope) obj;
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                ui0.a aVar27 = ui0.a.f171176a;
                scope7.getClass();
                parametersHolder5.getClass();
                r53.i iVar2 = (r53.i) parametersHolder5.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(r53.i.class));
                ui0.a aVar28 = ui0.a.f171176a;
                Context contextAndroidContext3 = ModuleExtKt.androidContext(scope7);
                yi0.c cVar5 = yi0.c.CROSS_COUNTRY_SKIING;
                aVar28.getClass();
                f12.l.f68084a.getClass();
                return new ti0.b(new ri0.d(contextAndroidContext3, iVar2, f12.l.a.a(), cVar5), cVar5);
            case 27:
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                ui0.a aVar29 = ui0.a.f171176a;
                ((Scope) obj).getClass();
                parametersHolder6.getClass();
                return new si0.b((ti0.b) parametersHolder6.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(ti0.b.class)), yi0.c.CROSS_COUNTRY_SKIING);
            case 28:
                Scope scope8 = (Scope) obj;
                ParametersHolder parametersHolder7 = (ParametersHolder) obj2;
                ui0.a aVar30 = ui0.a.f171176a;
                scope8.getClass();
                parametersHolder7.getClass();
                r53.i iVar3 = (r53.i) parametersHolder7.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(r53.i.class));
                ui0.a aVar31 = ui0.a.f171176a;
                Context contextAndroidContext4 = ModuleExtKt.androidContext(scope8);
                yi0.c cVar6 = yi0.c.ROWING;
                aVar31.getClass();
                f12.l.f68084a.getClass();
                return new ti0.b(new ri0.d(contextAndroidContext4, iVar3, f12.l.a.a(), cVar6), cVar6);
            default:
                ParametersHolder parametersHolder8 = (ParametersHolder) obj2;
                ui0.a aVar32 = ui0.a.f171176a;
                ((Scope) obj).getClass();
                parametersHolder8.getClass();
                return new si0.b((ti0.b) parametersHolder8.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(ti0.b.class)), yi0.c.ROWING);
        }
    }

    public /* synthetic */ q1(int i14, int i15) {
        this.f167218a = i15;
    }
}
