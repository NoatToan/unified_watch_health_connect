package xn;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.d2;
import c2.a0;
import c2.c1;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.i7;
import i3.mh;
import i3.wd;
import java.util.Locale;
import l72.d3;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.y0;
import v62.e1;
import v62.s9;
import w52.u0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191587a;

    public /* synthetic */ a(int i14) {
        this.f191587a = i14;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ya0.i iVar = ya0.i.f195444a;
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(mVar, R.string.device_already_linked_on_another_account);
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97931h;
            x0 x0VarB = d92.c.b(x0Var, mVar);
            d6.h.f57752b.getClass();
            int i14 = d6.h.f57755e;
            mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
            mh.c(y.Q(mVar, R.string.device_already_linked_need_reset_message), c2.l.C(x2.f(aVar, 1.0f), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar), mVar, 0, 0, 130044);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        a0 a0Var = (a0) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ya0.k kVar = ya0.k.f195481a;
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarA = a0Var.a(x2.f(aVar, 1.0f), 1.0f, true);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarA, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.u uVar = c2.u.f22885a;
            s62.a.f157643a.getClass();
            u4.d dVarA = e1.a(t62.b.f162798a);
            long jB = ds.e0.b(d92.b.f58623a, mVar);
            d92.b.f58625c.getClass();
            i7.b(dVarA, null, uVar.c(x2.q(aVar, j92.b.f97901d.f97907f), gVar), jB, mVar, 48, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        wd wdVar = (wd) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        yg2.f fVar = yg2.f.f196976a;
        wdVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(wdVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            d3.a(wdVar, x2.f(h4.r.S, 1.0f), mVar, (iIntValue & 14) | 48, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        v.h.y(1584884486, rVar, (Integer) obj3, mVar);
        x1 x1Var = p3.n.f135158a;
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        u1.u uVarA = u1.n.a(j92.b.f97899b.f97916a, d92.b.a(mVar).j().e());
        h4.r rVarC = u1.q.c(uVarA.f167683a, rVar, uVarA.f167684b, k2.i.a(j92.b.f97900c.f97911c));
        mVar.f();
        return rVarC;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        v.h.y(1566921426, rVar, (Integer) obj3, mVar);
        x1 x1Var = p3.n.f135158a;
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        h4.r rVarC = c2.l.C(rVar, 0.0f, 0.0f, j92.b.f97899b.f97919d, 0.0f, 11);
        mVar.f();
        return rVarC;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        h82.r rVar = (h82.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        yn.a aVar = yn.a.f198130a;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            rVar.D(R.string.activities_surfing_help_title, mVar, (iIntValue << 3) & 112);
            rVar.o(R.string.activities_surfing_help_subtitle, (iIntValue << 6) & 896, 2, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:164:0x05ff  */
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
        Object obj4;
        Object obj5;
        int i14 = this.f191587a;
        int i15 = 20;
        p3.m.a aVar = p3.m.f135153a;
        int i16 = 18;
        int i17 = 2;
        boolean z14 = false;
        int i18 = 1;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                b bVar = b.f191588a;
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    String strQ = y.Q(mVar, R.string.lbl_walking);
                    d2Var.getClass();
                    h4.r rVarA = t2Var.a(d2.i(), 0.4f, true);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81536n;
                    int i19 = iIntValue & 14;
                    d2Var.f(t2Var, strQ, rVarA, aVar2, 0, 0, mVar, i19 | 3072, 24);
                    int i24 = i19 | 3120;
                    d2Var.f(t2Var, "50", t2Var.a(d2.i(), 0.2f, true), aVar2, 0, 0, mVar, i24, 24);
                    d2Var.f(t2Var, "150", t2Var.a(d2.i(), 0.2f, true), aVar2, 0, 0, mVar, i24, 24);
                    d2Var.f(t2Var, "200", t2Var.a(d2.i(), 0.2f, true), aVar2, 0, 0, mVar, i24, 24);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                b bVar2 = b.f191588a;
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d2 d2Var2 = d2.f16532a;
                    String strQ2 = y.Q(mVar2, R.string.txt_title_daily_steps);
                    d2Var2.getClass();
                    h4.r rVarA2 = t2Var2.a(d2.i(), 0.4f, true);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81536n;
                    int i25 = iIntValue2 & 14;
                    d2Var2.f(t2Var2, strQ2, rVarA2, aVar3, 0, 0, mVar2, i25 | 3072, 24);
                    int i26 = i25 | 3120;
                    d2Var2.f(t2Var2, "50", t2Var2.a(d2.i(), 0.2f, true), aVar3, 0, 0, mVar2, i26, 24);
                    d2Var2.f(t2Var2, "150", t2Var2.a(d2.i(), 0.2f, true), aVar3, 0, 0, mVar2, i26, 24);
                    d2Var2.f(t2Var2, "200", t2Var2.a(d2.i(), 0.2f, true), aVar3, 0, 0, mVar2, i26, 24);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                t2 t2Var3 = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                b bVar3 = b.f191588a;
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    d2 d2Var3 = d2.f16532a;
                    String strQ3 = y.Q(mVar3, R.string.lbl_grand_total);
                    d2Var3.getClass();
                    h4.r rVarA3 = t2Var3.a(d2.i(), 0.4f, true);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar4 = h4.d.a.f81536n;
                    int i27 = iIntValue3 & 14;
                    d2Var3.f(t2Var3, strQ3, rVarA3, aVar4, 0, 0, mVar3, i27 | 3072, 24);
                    int i28 = i27 | 3120;
                    d2Var3.f(t2Var3, "210", t2Var3.a(d2.i(), 0.2f, true), aVar4, 0, 0, mVar3, i28, 24);
                    d2Var3.f(t2Var3, "600", t2Var3.a(d2.i(), 0.2f, true), aVar4, 0, 0, mVar3, i28, 24);
                    d2Var3.f(t2Var3, "810", t2Var3.a(d2.i(), 0.2f, true), aVar4, 0, 0, mVar3, i28, 24);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                h82.r rVar = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                b bVar4 = b.f191588a;
                rVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    rVar.D(R.string.lbl_recorded_activity_calories, mVar4, (iIntValue4 << 3) & 112);
                    rVar.o(R.string.calories_during_an_activity_description, (iIntValue4 << 6) & 896, 2, null, mVar4);
                    rVar.c(mVar4, iIntValue4 & 14);
                    d2 d2Var4 = d2.f16532a;
                    d2Var4.d(null, z3.f.c(-1356793680, new w52.s(28), mVar4), mVar4, 48, 1);
                    d2Var4.g(1, 390, 2, null, mVar4, z3.f.c(641222138, new w52.s(29), mVar4));
                    d2Var4.g(2, 390, 2, null, mVar4, z3.f.c(710663921, new a(z14 ? 1 : 0), mVar4));
                    d2Var4.g(3, 390, 2, null, mVar4, z3.f.c(1717586610, new a(i18), mVar4));
                    d2Var4.g(4, 390, 2, null, mVar4, z3.f.c(-1570457997, new a(i17), mVar4));
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                c cVar = c.f191590a;
                rVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar2) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i29 = (iIntValue5 << 3) & 112;
                    rVar2.D(R.string.lbl_connected_gps, mVar5, i29);
                    int i30 = (iIntValue5 << 6) & 896;
                    rVar2.l(R.string.msg_connected_gps_info, i30, 2, null, mVar5);
                    rVar2.t(R.string.common_how_it_works, mVar5, i29);
                    rVar2.o(R.string.msg_connected_gps_how_it_works, i30, 2, null, mVar5);
                    rVar2.t(R.string.lbl_viewing_activities_in_gc, mVar5, i29);
                    rVar2.o(R.string.msg_connected_gps_view_activities, i30, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                h82.r rVar3 = (h82.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                d dVar = d.f191592a;
                rVar3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar3) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    int i34 = (iIntValue6 << 3) & 112;
                    rVar3.D(R.string.activities_gaming_win_rate, mVar6, i34);
                    rVar3.j(z3.f.c(1893924219, new wd0.a(rVar3, 15), mVar6), mVar6, i34 | 6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                e eVar = e.f191594a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    u0.a(mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                e eVar2 = e.f191594a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    u0.a(mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                h82.r rVar4 = (h82.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                e eVar3 = e.f191594a;
                rVar4.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.B(rVar4) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    int i35 = (iIntValue9 << 3) & 112;
                    rVar4.D(R.string.lbl_tracking_calories_in_out, mVar9, i35);
                    int i36 = (iIntValue9 << 6) & 896;
                    rVar4.l(R.string.lbl_tracking_calories_description, i36, 2, null, mVar9);
                    rVar4.t(R.string.lbl_nutrition_tracking_basics, mVar9, i35);
                    rVar4.o(R.string.nutrition_tracking_basics_description_text_1, i36, 2, null, mVar9);
                    rVar4.t(R.string.lbl_optimizing_training_nutrition, mVar9, i35);
                    rVar4.o(R.string.optimizing_training_nutrition_description_text_1, i36, 2, null, mVar9);
                    rVar4.o(R.string.optimizing_training_nutrition_description_text_2, i36, 2, null, mVar9);
                    rVar4.o(R.string.optimizing_training_nutrition_description_text_3, i36, 2, null, mVar9);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                h82.r rVar5 = (h82.r) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                e eVar4 = e.f191594a;
                rVar5.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.B(rVar5) ? 4 : 2;
                }
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    int i37 = (iIntValue10 << 3) & 112;
                    rVar5.D(R.string.lbl_getting_the_fluid_you_need, mVar10, i37);
                    int i38 = (iIntValue10 << 6) & 896;
                    rVar5.l(R.string.getting_the_fluid_you_need_description, i38, 2, null, mVar10);
                    rVar5.t(R.string.lbl_fluid_tracking_while_training, mVar10, i37);
                    rVar5.o(R.string.fluid_tracking_while_description, i38, 2, null, mVar10);
                    rVar5.t(R.string.lbl_optimizing_hydration, mVar10, i37);
                    rVar5.o(R.string.optimizing_hydration_description_text_1, i38, 2, null, mVar10);
                    rVar5.o(R.string.optimizing_hydration_description_text_2, i38, 2, null, mVar10);
                    rVar5.o(R.string.optimizing_hydration_description_text_3, i38, 2, null, mVar10);
                    rVar5.t(R.string.lbl_hydration_strategies, mVar10, i37);
                    rVar5.o(R.string.hydration_strategies_description_text_1, i38, 2, null, mVar10);
                    rVar5.o(R.string.hydration_strategies_description_text_2, i38, 2, null, mVar10);
                    rVar5.o(R.string.hydration_strategies_description_text_3, i38, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                f fVar = f.f191599a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    u0.a(mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                h82.r rVar6 = (h82.r) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                g gVar = g.f191604a;
                rVar6.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(rVar6) ? 4 : 2;
                }
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    rVar6.D(R.string.activity_details_run_walk_detection, mVar12, (iIntValue12 << 3) & 112);
                    rVar6.o(R.string.rwd_help_text_v2, (iIntValue12 << 6) & 896, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                h82.r rVar7 = (h82.r) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                xo.a aVar5 = xo.a.f191747a;
                rVar7.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar13.B(rVar7) ? 4 : 2;
                }
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var13 = p3.n.f135158a;
                    int i39 = (iIntValue13 << 3) & 112;
                    rVar7.D(R.string.edit_legs_title, mVar13, i39);
                    int i44 = (iIntValue13 << 6) & 896;
                    rVar7.l(R.string.edit_legs_summary_v2, i44, 2, null, mVar13);
                    rVar7.c(mVar13, iIntValue13 & 14);
                    rVar7.o(R.string.edit_legs_useful_text, i44, 2, null, mVar13);
                    int i45 = i39 | 6;
                    rVar7.j(z3.f.c(-199610362, new wd0.a(rVar7, i16), mVar13), mVar13, i45);
                    rVar7.j(z3.f.c(-1500551569, new wd0.a(rVar7, 19), mVar13), mVar13, i45);
                    rVar7.j(z3.f.c(-1618188338, new wd0.a(rVar7, i15), mVar13), mVar13, i45);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                h82.r rVar8 = (h82.r) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                xw.d dVar2 = xw.d.f192294a;
                rVar8.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar14.B(rVar8) ? 4 : 2;
                }
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var14 = p3.n.f135158a;
                    rVar8.D(R.string.lbl_blood_pressure_reminders, mVar14, (iIntValue14 << 3) & 112);
                    rVar8.l(R.string.msg_blood_pressure_add_reminder_benefits, (iIntValue14 << 6) & 896, 2, null, mVar14);
                    Context context = (Context) mVar14.A(AndroidCompositionLocals_androidKt.f6042b);
                    boolean zR = mVar14.r(context);
                    Object objQ = mVar14.q();
                    if (zR) {
                        obj4 = objQ;
                        Object cVar2 = new ot.c(context, i15);
                        mVar14.K(cVar2);
                        obj4 = cVar2;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj4 = objQ;
                            Object cVar3 = new ot.c(context, i15);
                            mVar14.K(cVar3);
                            obj4 = cVar3;
                        }
                    }
                    obj4 = objQ;
                    e23.l lVar = (e23.l) obj4;
                    boolean zR2 = mVar14.r(context);
                    Object objQ2 = mVar14.q();
                    if (zR2) {
                        obj5 = objQ2;
                        Object cVar4 = new ot.c(context, 21);
                        mVar14.K(cVar4);
                        obj5 = cVar4;
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            obj5 = objQ2;
                            Object cVar5 = new ot.c(context, 21);
                            mVar14.K(cVar5);
                            obj5 = cVar5;
                        }
                    }
                    obj5 = objQ2;
                    rVar8.y(y.Q(mVar14, R.string.msg_turn_on_reminders_with_links), null, null, i53.a.a(lVar, (e23.l) obj5), mVar14, (iIntValue14 << 12) & 57344, 6);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                xy.e eVar5 = xy.e.f192617a;
                ((c1) obj).getClass();
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var15 = p3.n.f135158a;
                    for (ny.a aVar6 : ny.a.f128285f) {
                        h4.r.a aVar7 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar6 = j92.b.f97899b;
                        h4.r rVarA4 = c2.l.A(aVar7, eVar6.f97918c, 0.0f, 2);
                        h4.d.f81522a.getClass();
                        h4.g.b bVar5 = h4.d.a.f81534l;
                        c2.j.f22691a.getClass();
                        s2 s2VarA = q2.a(c2.j.f22692b, bVar5, mVar15, 48);
                        x1 x1Var16 = p3.n.f135158a;
                        int iHashCode = Long.hashCode(mVar15.getU());
                        i2 i2VarX = mVar15.x();
                        h4.r rVarC = h4.k.c(rVarA4, mVar15);
                        h5.g.V.getClass();
                        e0.a aVar8 = h5.g.a.f81805b;
                        if (mVar15.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar15.z();
                        if (mVar15.getT()) {
                            mVar15.M(aVar8);
                        } else {
                            mVar15.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA, mVar15);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar15);
                        h5.g.a.b bVar6 = h5.g.a.f81813j;
                        if (mVar15.getT() || !p005kotlin.jvm.internal.s.g(mVar15.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar15, iHashCode, bVar6);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar15);
                        u2 u2Var = u2.f22900a;
                        h4.r rVarB = l4.k.b(x2.q(aVar7, eVar6.f97920e), k2.i.f102406a);
                        ny.a.f128281b.getClass();
                        c2.q.a(u1.n.e(rVarB, ny.a.C2460a.a(aVar6, mVar15), m1.f128891a), mVar15, 0);
                        String strQ4 = y.Q(mVar15, aVar6.f128286a);
                        d92.b.f58624b.getClass();
                        mh.c(strQ4, c2.l.C(aVar7, eVar6.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, mVar15), mVar15, 0, 0, 131068);
                        mVar15.y();
                    }
                    x1 x1Var17 = p3.n.f135158a;
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                xy.g gVar2 = xy.g.f192621a;
                ((c1) obj).getClass();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var18 = p3.n.f135158a;
                    for (ny.a aVar9 : ny.a.f128285f) {
                        h4.r.a aVar10 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar7 = j92.b.f97899b;
                        h4.r rVarA5 = c2.l.A(aVar10, eVar7.f97918c, 0.0f, 2);
                        h4.d.f81522a.getClass();
                        h4.g.b bVar7 = h4.d.a.f81534l;
                        c2.j.f22691a.getClass();
                        s2 s2VarA2 = q2.a(c2.j.f22692b, bVar7, mVar16, 48);
                        x1 x1Var19 = p3.n.f135158a;
                        int iHashCode2 = Long.hashCode(mVar16.getU());
                        i2 i2VarX2 = mVar16.x();
                        h4.r rVarC2 = h4.k.c(rVarA5, mVar16);
                        h5.g.V.getClass();
                        e0.a aVar11 = h5.g.a.f81805b;
                        if (mVar16.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar16.z();
                        if (mVar16.getT()) {
                            mVar16.M(aVar11);
                        } else {
                            mVar16.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA2, mVar16);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar16);
                        h5.g.a.b bVar8 = h5.g.a.f81813j;
                        if (mVar16.getT() || !p005kotlin.jvm.internal.s.g(mVar16.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar16, iHashCode2, bVar8);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar16);
                        u2 u2Var2 = u2.f22900a;
                        h4.r rVarB2 = l4.k.b(x2.q(aVar10, eVar7.f97920e), k2.i.f102406a);
                        ny.a.f128281b.getClass();
                        c2.q.a(u1.n.e(rVarB2, ny.a.C2460a.a(aVar9, mVar16), m1.f128891a), mVar16, 0);
                        String strQ5 = y.Q(mVar16, aVar9.f128286a);
                        d92.b.f58624b.getClass();
                        mh.c(strQ5, c2.l.C(aVar10, eVar7.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, mVar16), mVar16, 0, 0, 131068);
                        mVar16.y();
                    }
                    x1 x1Var20 = p3.n.f135158a;
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar17 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                y01.d dVar3 = y01.d.f192991a;
                ((r1.e0) obj).getClass();
                x1 x1Var21 = p3.n.f135158a;
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar8 = j92.b.f97899b;
                h4.r rVarZ = c2.l.z(rVarF, eVar8.f97920e, eVar8.f97917b);
                c22.x0.f23314a.getClass();
                String strW = gl1.d.W(c22.x0.He);
                d6.h.f57752b.getClass();
                int i46 = d6.h.f57757g;
                d92.b.f58624b.getClass();
                mh.c(strW, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(i46), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar17), mVar17, 0, 0, 130044);
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj3).getClass();
                y01.d dVar4 = y01.d.f192991a;
                ((r1.e0) obj).getClass();
                x1 x1Var22 = p3.n.f135158a;
                h4.r.a aVar12 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarQ = x2.q(aVar12, j92.b.f97901d.f97904c);
                s62.a.f157643a.getClass();
                y0.b(s9.a(t62.b.f162798a), null, rVarQ, null, (p3.m) obj2, 48, 120);
                return Unit.INSTANCE;
            case 18:
                int iIntValue17 = ((Integer) obj2).intValue();
                ((f2.t) obj).getClass();
                ((y22.w) obj3).getClass();
                return f2.c.a(iIntValue17 == 0 ? dh.b.f(2) : dh.b.f(1));
            case 19:
                h4.r rVar9 = (h4.r) obj;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                y40.e eVar9 = y40.e.f194400a;
                rVar9.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= mVar18.B(rVar9) ? 4 : 2;
                }
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    x1 x1Var23 = p3.n.f135158a;
                    mh.c("", x2.y(h4.r.S, null, 3).then(rVar9), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar18, 6, 0, 262140);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 20:
                h4.r rVar10 = (h4.r) obj;
                p3.m mVar19 = (p3.m) obj2;
                v.h.y(-435452806, rVar10, (Integer) obj3, mVar19);
                x1 x1Var24 = p3.n.f135158a;
                Object objQ3 = mVar19.q();
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new p008y1.y0(17);
                    mVar19.K(objQ3);
                }
                h4.r rVarC3 = p5.v.c((e23.l) objQ3, rVar10, false);
                mVar19.f();
                return rVarC3;
            case 21:
                h82.r rVar11 = (h82.r) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                y91.a aVar13 = y91.a.f195289a;
                rVar11.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= mVar20.B(rVar11) ? 4 : 2;
                }
                if (mVar20.n(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    x1 x1Var25 = p3.n.f135158a;
                    int i47 = (iIntValue19 << 3) & 112;
                    rVar11.t(R.string.concept_personal_records, mVar20, i47);
                    int i48 = (iIntValue19 << 6) & 896;
                    rVar11.l(R.string.personal_records_help_overview, i48, 2, null, mVar20);
                    rVar11.l(R.string.personal_records_help_benchmark_distances, i48, 2, null, mVar20);
                    rVar11.t(R.string.personal_records_help_receiving_record_title, mVar20, i47);
                    rVar11.l(R.string.personal_records_help_receiving_record_description, i48, 2, null, mVar20);
                    String strQ6 = y.Q(mVar20, R.string.lbl_miles);
                    Locale locale = Locale.ROOT;
                    String lowerCase = strQ6.toLowerCase(locale);
                    lowerCase.getClass();
                    String strConcat = "13 ".concat(lowerCase);
                    String lowerCase2 = y.Q(mVar20, R.string.lbl_miles).toLowerCase(locale);
                    lowerCase2.getClass();
                    rVar11.m(i48, 2, y.P(R.string.personal_records_help_distance_matching, new Object[]{strConcat, "13.3 ".concat(lowerCase2)}, mVar20), null, mVar20);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 22:
                return a(obj, obj2, obj3);
            case 23:
                return b(obj, obj2, obj3);
            case 24:
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                yg2.f fVar2 = yg2.f.f196976a;
                ((e2.d) obj).getClass();
                if (mVar21.n(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    x1 x1Var26 = p3.n.f135158a;
                    h4.r.a aVar14 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar10 = j92.b.f97899b;
                    float f14 = eVar10.f97918c;
                    h4.r rVarC4 = c2.l.C(aVar14, f14, f14, 0.0f, eVar10.f97917b, 4);
                    String strQ7 = y.Q(mVar21, R.string.skipped);
                    d92.b.f58624b.getClass();
                    mh.c(strQ7, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar21), mVar21, 0, 0, 131068);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 25:
                return c(obj, obj2, obj3);
            case 26:
                return d(obj, obj2, obj3);
            case 27:
                return e(obj, obj2, obj3);
            case 28:
                return f(obj, obj2, obj3);
            default:
                h82.r rVar12 = (h82.r) obj;
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                yn.b bVar9 = yn.b.f198132a;
                rVar12.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= mVar22.B(rVar12) ? 4 : 2;
                }
                if (mVar22.n(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    x1 x1Var27 = p3.n.f135158a;
                    rVar12.D(R.string.activity_wakesports_run_distance_chart_title, mVar22, (iIntValue21 << 3) & 112);
                    rVar12.o(R.string.activity_wakesports_run_distance_help_text, (iIntValue21 << 6) & 896, 2, null, mVar22);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
        }
    }
}
