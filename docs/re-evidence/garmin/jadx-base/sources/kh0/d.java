package kh0;

import a03.k0;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.a0;
import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.reschedule.RescheduleSTPWorkoutActivity;
import com.garmin.android.livesessionview.LiveActivityActivity;
import f5.g0;
import f5.v1;
import gl1.y;
import i3.mh;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.t1;
import kq.a1;
import kq.b1;
import kq.c1;
import kq.d1;
import kq.e1;
import kq.f1;
import kq.g1;
import kq.l0;
import kq.p0;
import kq.q0;
import kq.r0;
import kq.w0;
import kq.x0;
import lc.u0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p006l2.g3;
import p006l2.u2;
import p3.x1;
import p3.x3;
import s5.i0;
import s5.y0;
import v62.i8;
import v62.o7;
import w5.b0;
import w5.c0;
import w5.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f104717b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f104716a = i14;
        this.f104717b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x047a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0499  */
    /* JADX WARN: Code duplicated, block: B:137:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:141:0x04af  */
    /* JADX WARN: Code duplicated, block: B:144:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0275  */
    /* JADX WARN: Type inference failed for: r4v65, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        String strValueOf;
        Object obj4;
        f0 f0Var;
        b0 b0Var;
        c0 c0Var;
        int i14;
        Object obj5;
        w5.q.b bVar;
        Object obj6;
        Object obj7;
        u1 u1VarResolveViewModel;
        int i15;
        int i16 = this.f104716a;
        p3.m.a aVar = p3.m.f135153a;
        int i17 = 3;
        int i18 = 18;
        int i19 = 0;
        int i24 = 1;
        Object obj8 = this.f104717b;
        switch (i16) {
            case 0:
                dh0.n nVar = (dh0.n) obj8;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    ih0.i iVar = new ih0.i((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
                    int i25 = (iIntValue & 14) | 512;
                    g.k(t2Var, nVar.f59614a, iVar, mVar, i25);
                    g.k(t2Var, nVar.f59615b, iVar, mVar, i25);
                    g.k(t2Var, nVar.f59616c, iVar, mVar, i25);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                kq.g gVar = (kq.g) obj8;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i26 = kq.g.f106071f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    gVar.g(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                kq.c0 c0Var2 = (kq.c0) obj8;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i27 = kq.c0.f106052g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    c0Var2.g(mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                l0 l0Var = (l0) obj8;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i28 = l0.f106099g;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    l0Var.h(mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p0 p0Var = (p0) obj8;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i29 = p0.f106119f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    p0Var.g(mVar5, h82.c.f82429e);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                q0 q0Var = (q0) obj8;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i30 = q0.f106122f;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    q0Var.g(mVar6, h82.c.f82429e);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                r0 r0Var = (r0) obj8;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i34 = r0.f106124f;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    r0Var.g(mVar7, h82.c.f82429e);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                w0 w0Var = (w0) obj8;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i35 = w0.f106141f;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    w0Var.g(mVar8, h82.c.f82429e);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                x0 x0Var = (x0) obj8;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i36 = x0.f106144f;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    x0Var.g(mVar9, h82.c.f82429e);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                a1 a1Var = (a1) obj8;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i37 = a1.f106045f;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    a1Var.g(mVar10, h82.c.f82429e);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                b1 b1Var = (b1) obj8;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                int i38 = b1.f106049f;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    b1Var.g(mVar11, h82.c.f82429e);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                c1 c1Var = (c1) obj8;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i39 = c1.f106054f;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var12 = p3.n.f135158a;
                    c1Var.g(mVar12, h82.c.f82429e);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                d1 d1Var = (d1) obj8;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                int i44 = d1.f106060f;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var13 = p3.n.f135158a;
                    d1Var.g(mVar13, h82.c.f82429e);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                e1 e1Var = (e1) obj8;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                int i45 = e1.f106066f;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var14 = p3.n.f135158a;
                    e1Var.g(mVar14, h82.c.f82429e);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                f1 f1Var = (f1) obj8;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                int i46 = f1.f106070f;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var15 = p3.n.f135158a;
                    f1Var.g(mVar15, h82.c.f82429e);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                g1 g1Var = (g1) obj8;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                int i47 = g1.f106077f;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var16 = p3.n.f135158a;
                    g1Var.g(mVar16, h82.c.f82429e);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                sy0.d dVar = (sy0.d) obj8;
                t2 t2Var2 = (t2) obj;
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= mVar17.B(t2Var2) ? 4 : 2;
                }
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    x1 x1Var17 = p3.n.f135158a;
                    Integer numValueOf = dVar != null ? Integer.valueOf(dVar.f161207a) : null;
                    strValueOf = numValueOf != null ? String.valueOf(numValueOf.intValue()) : null;
                    if (strValueOf == null) {
                        strValueOf = sn.a.h(mVar17, -972070662, R.string.no_value, mVar17);
                    } else {
                        mVar17.C(-972071561);
                        mVar17.f();
                    }
                    l72.x0.f111346a.a((iIntValue17 & 14) | (l72.x0.f111348c << 24), 124, null, t2Var2, null, null, strValueOf, y.Q(mVar17, R.string.lbl_activites), null, null, mVar17);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                s5.x0 x0Var2 = (s5.x0) obj8;
                p3.m mVar18 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                mVar18.C(1582736677);
                x1 x1Var18 = p3.n.f135158a;
                g6.c cVar = (g6.c) mVar18.A(t1.f91490h);
                w5.q.b bVar2 = (w5.q.b) mVar18.A(t1.f91493k);
                g6.o oVar = (g6.o) mVar18.A(t1.f91496n);
                boolean zB = mVar18.B(x0Var2) | mVar18.k(oVar.ordinal());
                Object objQ = mVar18.q();
                if (zB) {
                    obj4 = objQ;
                    s5.x0 x0VarA = y0.a(x0Var2, oVar);
                    mVar18.K(x0VarA);
                    obj4 = x0VarA;
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        obj4 = objQ;
                        s5.x0 x0VarA2 = y0.a(x0Var2, oVar);
                        mVar18.K(x0VarA2);
                        obj4 = x0VarA2;
                    }
                }
                obj4 = objQ;
                s5.x0 x0Var3 = (s5.x0) obj4;
                boolean zB2 = mVar18.B(bVar2) | mVar18.B(x0Var3);
                Object objQ2 = mVar18.q();
                if (zB2) {
                    obj5 = objQ2;
                    i0 i0Var = x0Var3.f157322a;
                    w5.q qVar = i0Var.fontFamily;
                    f0Var = i0Var.fontWeight;
                    if (f0Var == null) {
                        f0.f182097b.getClass();
                        f0Var = f0.f182102g;
                    }
                    b0Var = i0Var.fontStyle;
                    if (b0Var != null) {
                        i19 = b0Var.f182072a;
                    } else {
                        b0.f182070b.getClass();
                    }
                    c0Var = i0Var.fontSynthesis;
                    if (c0Var != null) {
                        i14 = c0Var.f182079a;
                    } else {
                        c0.f182075b.getClass();
                        i14 = c0.f182078e;
                    }
                    w5.w0 w0VarA = bVar2.a(qVar, f0Var, i19, i14);
                    mVar18.K(w0VarA);
                    obj5 = w0VarA;
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        obj5 = objQ2;
                        i0 i0Var2 = x0Var3.f157322a;
                        w5.q qVar2 = i0Var2.fontFamily;
                        f0Var = i0Var2.fontWeight;
                        if (f0Var == null) {
                            f0.f182097b.getClass();
                            f0Var = f0.f182102g;
                        }
                        b0Var = i0Var2.fontStyle;
                        if (b0Var != null) {
                            i19 = b0Var.f182072a;
                        } else {
                            b0.f182070b.getClass();
                        }
                        c0Var = i0Var2.fontSynthesis;
                        if (c0Var != null) {
                            i14 = c0Var.f182079a;
                        } else {
                            c0.f182075b.getClass();
                            i14 = c0.f182078e;
                        }
                        w5.w0 w0VarA2 = bVar2.a(qVar2, f0Var, i19, i14);
                        mVar18.K(w0VarA2);
                        obj5 = w0VarA2;
                    }
                }
                obj5 = objQ2;
                x3 x3Var = (x3) obj5;
                Object objQ3 = mVar18.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    bVar = bVar2;
                    g3 g3Var = new g3(oVar, cVar, bVar, x0Var2, x3Var.getF182175a());
                    mVar18.K(g3Var);
                    obj6 = g3Var;
                } else {
                    bVar = bVar2;
                    obj6 = objQ3;
                }
                g3 g3Var2 = (g3) obj6;
                Object f182175a = x3Var.getF182175a();
                if (oVar != g3Var2.f108506a || !p005kotlin.jvm.internal.s.g(cVar, g3Var2.f108507b) || !p005kotlin.jvm.internal.s.g(bVar, g3Var2.f108508c) || !p005kotlin.jvm.internal.s.g(x0Var3, g3Var2.f108509d) || !p005kotlin.jvm.internal.s.g(f182175a, g3Var2.f108510e)) {
                    g3Var2.f108506a = oVar;
                    g3Var2.f108507b = cVar;
                    g3Var2.f108508c = bVar;
                    g3Var2.f108509d = x0Var3;
                    g3Var2.f108510e = f182175a;
                    g3Var2.f108511f = u2.a(x0Var3, cVar, bVar, u2.f108806a, 1);
                }
                h4.r.a aVar2 = h4.r.S;
                boolean zR = mVar18.r(g3Var2);
                Object objQ4 = mVar18.q();
                Object obj9 = objQ4;
                if (zR || objQ4 == c2565a) {
                    d dVar2 = new d(g3Var2, i18);
                    mVar18.K(dVar2);
                    obj9 = dVar2;
                }
                h4.r rVarD = g0.d(aVar2, (e23.q) obj9);
                mVar18.f();
                return rVarD;
            case 18:
                g6.a aVar3 = (g6.a) obj3;
                long j8 = ((g3) obj8).f108511f;
                long j14 = aVar3.f75988a;
                int iL = g6.a.l(j14);
                long j15 = aVar3.f75988a;
                v1 v1VarQ = ((f5.y0) obj2).Q(g6.a.c(j23.t.e((int) (j8 >> 32), iL, g6.a.j(j15)), 0, j23.t.e((int) (j8 & 4294967295L), g6.a.k(j15), g6.a.i(j15)), 0, 10, j14));
                return f5.b1.h0((f5.b1) obj, v1VarQ.f69144a, v1VarQ.f69145b, new k0(v1VarQ, 19));
            case 19:
                m21.e eVar = (m21.e) obj8;
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar19.n(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    x1 x1Var19 = p3.n.f135158a;
                    if (eVar.f116084a.length() > 0) {
                        mVar19.C(1875255106);
                        s62.a.f157643a.getClass();
                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar19, R.string.lbl_no_results_found), y.Q(mVar19, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar19, 3072, 16);
                        mVar19.f();
                    } else {
                        mVar19.C(1875671498);
                        s62.a.f157643a.getClass();
                        b82.n.c(i8.a(t62.b.f162798a), y.Q(mVar19, R.string.no_favorites_yet), y.Q(mVar19, R.string.no_favorites_message), x2.d(h4.r.S, 1.0f), null, mVar19, 3072, 16);
                        mVar19.f();
                    }
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 20:
                CreateCourseActivity createCourseActivity = (CreateCourseActivity) obj8;
                List list = (List) obj;
                String str = (String) obj2;
                CreateCourseActivity.a aVar4 = CreateCourseActivity.f32989g;
                list.getClass();
                str.getClass();
                androidx.fragment.app.v supportFragmentManager = createCourseActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                c60.e.q(supportFragmentManager, list, new l30.a(createCourseActivity, i17), new k62.k(createCourseActivity, 21, str, (String) obj3));
                return Unit.INSTANCE;
            case 21:
                lc.y yVar = (lc.y) obj8;
                lc.v vVar = (lc.v) obj;
                p3.m mVar20 = (p3.m) obj2;
                ((Integer) obj3).intValue();
                vVar.getClass();
                mVar20.C(1707031240);
                x1 x1Var20 = p3.n.f135158a;
                Activity activity = (Activity) mVar20.A(c.n.f22332a);
                boolean zR2 = mVar20.r(activity);
                Object objQ5 = mVar20.q();
                if (zR2) {
                    obj7 = objQ5;
                    by1.l lVar = new by1.l(activity, i17);
                    mVar20.K(lVar);
                    obj7 = lVar;
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        obj7 = objQ5;
                        by1.l lVar2 = new by1.l(activity, i17);
                        mVar20.K(lVar2);
                        obj7 = lVar2;
                    }
                }
                obj7 = objQ5;
                e23.a aVar5 = (e23.a) obj7;
                lc.v vVarJ = og.a.J(vVar, yVar, mVar20);
                if (vVarJ == null) {
                    mVar20.C(-625910746);
                    mVar20.f();
                    u1VarResolveViewModel = null;
                } else {
                    mVar20.C(256903995);
                    mVar20.L(-1614864554);
                    u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(p51.e.class), vVarJ.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVarJ), null, KoinApplicationKt.currentKoinScope(mVar20, 0), aVar5);
                    mVar20.R();
                    mVar20.f();
                }
                if (u1VarResolveViewModel == null) {
                    mVar20.C(256905622);
                    mVar20.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar20);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(p51.e.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar20, 0), aVar5);
                    mVar20.R();
                } else {
                    mVar20.C(256901747);
                }
                mVar20.f();
                p51.e eVar2 = (p51.e) u1VarResolveViewModel;
                mVar20.f();
                return eVar2;
            case 22:
                RescheduleSTPWorkoutActivity rescheduleSTPWorkoutActivity = (RescheduleSTPWorkoutActivity) obj8;
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                long jLongValue3 = ((Long) obj3).longValue();
                RescheduleSTPWorkoutActivity.a aVar6 = RescheduleSTPWorkoutActivity.f49530b;
                l62.d dVarCa = rescheduleSTPWorkoutActivity.ca();
                l62.e eVar3 = new l62.e(rescheduleSTPWorkoutActivity, i24);
                w9.a aVarA = androidx.lifecycle.v1.a(dVarCa);
                x53.c cVar2 = o53.s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new l62.c(dVarCa, jLongValue2, jLongValue, jLongValue3, eVar3, null), 2);
                return Unit.INSTANCE;
            case 23:
                LiveActivityActivity liveActivityActivity = (LiveActivityActivity) obj8;
                h4.r rVar = (h4.r) obj;
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                LiveActivityActivity.a aVar7 = LiveActivityActivity.f50544d;
                rVar.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= mVar21.B(rVar) ? 4 : 2;
                }
                if (mVar21.n(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    x1 x1Var21 = p3.n.f135158a;
                    ((tg2.a) liveActivityActivity.f50546b.getValue()).a(rVar, mVar21, iIntValue19 & 14);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 24:
                dh0.g gVar2 = (dh0.g) obj8;
                t2 t2Var3 = (t2) obj;
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= mVar22.B(t2Var3) ? 4 : 2;
                }
                if (mVar22.n(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    x1 x1Var22 = p3.n.f135158a;
                    l72.w.a aVar8 = l72.w.a.f111302a;
                    int i48 = lh0.j.b.f112416a[gVar2.ordinal()];
                    if (i48 == 1) {
                        i15 = R.string.lbl_body_fat_percentage;
                    } else if (i48 == 2) {
                        i15 = R.string.lbl_weight_characteristic_bmi;
                    } else if (i48 == 3) {
                        i15 = R.string.lbl_vigorous_days;
                    } else if (i48 == 4) {
                        i15 = R.string.lbl_vigorous_minutes;
                    } else {
                        if (i48 != 5) {
                            u0.r();
                            return null;
                        }
                        i15 = R.string.hr_zones_lbl_resting_heart_rate;
                    }
                    aVar8.c(t2Var3, y.Q(mVar22, i15), null, null, mVar22, iIntValue20 & 14, 6);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 25:
                km0.b bVar3 = (km0.b) obj8;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p3.m mVar23 = (p3.m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= mVar23.h(zBooleanValue) ? 4 : 2;
                }
                if (mVar23.n(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    x1 x1Var23 = p3.n.f135158a;
                    if (zBooleanValue) {
                        mVar23.C(2107596623);
                        String str2 = bVar3.f105299c;
                        String strF = androidx.core.view.j.f(str2 != null ? g22.n.c(str2) : 0, "/200");
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar23);
                        h4.r.a aVar9 = h4.r.S;
                        d92.b.f58625c.getClass();
                        mh.c(strF, c2.l.C(aVar9, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar23, 0, 0, 131068);
                        mVar23.f();
                    } else {
                        mVar23.C(2107938460);
                        mVar23.f();
                    }
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 26:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar24 = (p3.m) obj2;
                v.h.y(2143060676, rVar2, (Integer) obj3, mVar24);
                x1 x1Var24 = p3.n.f135158a;
                h4.r rVarA = ((a0) obj8).a(rVar2, 1.0f, true);
                mVar24.f();
                return rVarA;
            case 27:
                mh1.m mVar25 = (mh1.m) obj8;
                p3.m mVar26 = (p3.m) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                int i49 = mh1.m.f118484f;
                if (mVar26.n(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    x1 x1Var25 = p3.n.f135158a;
                    mVar25.g(mVar26, h82.c.f82429e);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 28:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o53.k.f129358f;
                ((yt.f) obj8).invoke((Throwable) obj);
                return Unit.INSTANCE;
            default:
                s60.a aVar10 = (s60.a) obj8;
                Double d14 = (Double) obj;
                p3.m mVar27 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                mVar27.C(-2058673373);
                x1 x1Var26 = p3.n.f135158a;
                strValueOf = d14 != null ? aVar10.b(d14.doubleValue()) : null;
                mVar27.f();
                return strValueOf;
        }
    }
}
