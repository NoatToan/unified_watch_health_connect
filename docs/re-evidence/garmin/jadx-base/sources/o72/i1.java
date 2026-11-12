package o72;

import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope;
import com.mapbox.maps.extension.compose.ornaments.scalebar.MapScaleBarScope;
import i3.mh;
import i3.ua;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i1 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130437a;

    public /* synthetic */ i1(int i14) {
        this.f130437a = i14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = 1;
        switch (this.f130437a) {
            case 0:
                c2.t2 t2Var = (c2.t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j1 j1Var = j1.f130443a;
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    b82.d2.f16532a.a(t2Var, "Footer", null, null, 0, 0, mVar, (iIntValue & 14) | 48, 30);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                c2.t2 t2Var2 = (c2.t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                j1 j1Var2 = j1.f130443a;
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int i15 = iIntValue2;
                    b82.d2 d2Var = b82.d2.f16532a;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar = h4.d.a.f81538p;
                    d2Var.getClass();
                    int i16 = (i15 & 14) | 25008;
                    d2Var.c(t2Var2, "Lap", "", t2Var2.a(b82.d2.h(), 0.2f, true), aVar, 0, 0, mVar2, i16, 48);
                    d2Var.c(t2Var2, "Time", "", t2Var2.a(b82.d2.h(), 0.2f, true), aVar, 0, 0, mVar2, i16, 48);
                    d2Var.c(t2Var2, "Distance", "km", t2Var2.a(b82.d2.h(), 0.2f, true), aVar, 0, 0, mVar2, i16, 48);
                    d2Var.c(t2Var2, "Avg Pace", "min/km", t2Var2.a(b82.d2.h(), 0.2f, true), aVar, 0, 0, mVar2, i16, 48);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                c2.t2 t2Var3 = (c2.t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                j1 j1Var3 = j1.f130443a;
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    b82.d2.f16532a.a(t2Var3, "Footer", null, null, 0, 0, mVar3, (iIntValue3 & 14) | 48, 30);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                k1 k1Var = k1.f130459a;
                ((c2.t2) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), mVar4);
                    d6.p.f57793b.getClass();
                    int i17 = d6.p.f57795d;
                    g6.f.a aVar2 = g6.f.f75994b;
                    mh.c("Custom Navigation Content", c2.l.C(h4.r.S, 0.0f, 0.0f, 8, 0.0f, 11), 0L, null, 0L, null, 0L, null, 0L, i17, false, 2, 0, null, x0VarB, mVar4, 54, 24960, 110588);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                h4.r rVar = (h4.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                v.h.y(1458248272, rVar, (Integer) obj3, mVar5);
                p3.x1 x1Var5 = p3.n.f135158a;
                h4.r rVarA = l4.k.a(l4.k.h(rVar, 0.6f, 0.6f), 0.6f);
                mVar5.f();
                return rVarA;
            case 5:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                v.h.y(-1484373317, rVar2, (Integer) obj3, mVar6);
                p3.x1 x1Var6 = p3.n.f135158a;
                h4.r rVarA2 = l4.k.a(l4.k.h(rVar2, 0.6f, 0.6f), 0.6f);
                mVar6.f();
                return rVarA2;
            case 6:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar7 = (p3.m) obj2;
                v.h.y(2105197362, rVar3, (Integer) obj3, mVar7);
                p3.x1 x1Var7 = p3.n.f135158a;
                h4.r rVarA3 = l4.k.a(l4.k.h(rVar3, 0.6f, 0.6f), 0.6f);
                mVar7.f();
                return rVarA3;
            case 7:
                h4.r rVar4 = (h4.r) obj;
                p3.m mVar8 = (p3.m) obj2;
                v.h.y(-526311864, rVar4, (Integer) obj3, mVar8);
                p3.x1 x1Var8 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jG = d92.b.a(mVar8).c().g();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97900c.f97911c;
                h4.r rVarE = u1.n.e(rVar4, jG, k2.i.c(f14, f14, 0.0f, 0.0f, 12));
                mVar8.f();
                return rVarE;
            case 8:
                h4.r rVar5 = (h4.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                v.h.y(-749739215, rVar5, (Integer) obj3, mVar9);
                p3.x1 x1Var9 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jG2 = d92.b.a(mVar9).c().g();
                d92.b.f58625c.getClass();
                float f15 = j92.b.f97900c.f97911c;
                h4.r rVarE2 = u1.n.e(rVar5, jG2, k2.i.c(0.0f, 0.0f, f15, f15, 3));
                mVar9.f();
                return rVarE2;
            case 9:
                h4.r rVar6 = (h4.r) obj;
                p3.m mVar10 = (p3.m) obj2;
                v.h.y(-1736456467, rVar6, (Integer) obj3, mVar10);
                p3.x1 x1Var10 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jG3 = d92.b.a(mVar10).c().g();
                d92.b.f58625c.getClass();
                float f16 = j92.b.f97900c.f97911c;
                h4.r rVarE3 = u1.n.e(rVar6, jG3, k2.i.c(f16, f16, 0.0f, 0.0f, 12));
                mVar10.f();
                return rVarE3;
            case 10:
                h4.r rVar7 = (h4.r) obj;
                p3.m mVar11 = (p3.m) obj2;
                v.h.y(-1255667946, rVar7, (Integer) obj3, mVar11);
                p3.x1 x1Var11 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jG4 = d92.b.a(mVar11).c().g();
                d92.b.f58625c.getClass();
                float f17 = j92.b.f97900c.f97911c;
                h4.r rVarE4 = u1.n.e(rVar7, jG4, k2.i.c(0.0f, 0.0f, f17, f17, 3));
                mVar11.f();
                return rVarE4;
            case 11:
                gg1.o0 o0Var = (gg1.o0) obj;
                p3.m mVar12 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                o0Var.getClass();
                mVar12.C(-243376409);
                p3.x1 x1Var12 = p3.n.f135158a;
                String strQ = gl1.y.Q(mVar12, o0Var.f77292b);
                mVar12.f();
                return strQ;
            case 12:
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                oe2.a aVar3 = oe2.a.f131445a;
                ((MapCompassScope) obj).getClass();
                if (mVar13.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                oe2.a aVar4 = oe2.a.f131445a;
                ((MapScaleBarScope) obj).getClass();
                if (mVar14.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    p3.x1 x1Var14 = p3.n.f135158a;
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                oe2.a aVar5 = oe2.a.f131445a;
                ((MapCompassScope) obj).getClass();
                if (mVar15.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    p3.x1 x1Var15 = p3.n.f135158a;
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                oe2.a aVar6 = oe2.a.f131445a;
                ((MapScaleBarScope) obj).getClass();
                if (mVar16.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    p3.x1 x1Var16 = p3.n.f135158a;
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ok0.l lVar = ok0.l.f132499a;
                ((e2.d) obj).getClass();
                if (mVar17.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    p3.x1 x1Var17 = p3.n.f135158a;
                    l72.r1.b(gl1.y.Q(mVar17, R.string.gear_collections), null, mVar17, 0, 2);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ok0.l lVar2 = ok0.l.f132499a;
                ((e2.d) obj).getClass();
                if (mVar18.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    p3.x1 x1Var18 = p3.n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarA4 = c2.l.A(c2.l.A(aVar7, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97917b, 1);
                    String strQ2 = gl1.y.Q(mVar18, R.string.gear_collection_partial_gears_active_warning);
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, rVarA4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar18, 0, 0, 131068);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ok0.l lVar3 = ok0.l.f132499a;
                ((e2.d) obj).getClass();
                if (mVar19.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    p3.x1 x1Var19 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(aVar8, j92.b.f97899b.f97920e);
                    String strQ3 = gl1.y.Q(mVar19, R.string.only_gear_active_time_of_activity_displayed);
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar19), mVar19, 0, 0, 131068);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                h82.r rVar8 = (h82.r) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                or0.a aVar9 = or0.a.f133327a;
                rVar8.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar20.B(rVar8) ? 4 : 2;
                }
                if (mVar20.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    p3.x1 x1Var20 = p3.n.f135158a;
                    int i18 = (iIntValue12 << 3) & 112;
                    rVar8.D(R.string.intensity_minutes_on_device, mVar20, i18);
                    int i19 = (iIntValue12 << 6) & 896;
                    rVar8.l(R.string.lbl_help_intensity_minutes_options, i19, 2, null, mVar20);
                    int i24 = i18 | 6;
                    rVar8.j(z3.f.c(-931491491, new ix0.f(rVar8, 19), mVar20), mVar20, i24);
                    rVar8.j(z3.f.c(-1672622316, new ix0.f(rVar8, 20), mVar20), mVar20, i24);
                    rVar8.o(R.string.hr_zones_customize, i19, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                oy0.a aVar10 = oy0.a.f134364a;
                ((e2.d) obj).getClass();
                if (mVar21.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    p3.x1 x1Var21 = p3.n.f135158a;
                    u4.d.b bVar = u4.d.f168373k;
                    u4.d dVarB = n5.e.b(R.drawable.activity_default, mVar21, 6);
                    String strQ4 = gl1.y.Q(mVar21, R.string.msg_no_activities);
                    c22.x0.f23314a.getClass();
                    b82.n.c(dVarB, strQ4, gl1.d.W(c22.x0.Ga), null, null, mVar21, 0, 24);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                oy0.a aVar11 = oy0.a.f134364a;
                ((e2.d) obj).getClass();
                if (mVar22.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    p3.x1 x1Var22 = p3.n.f135158a;
                    h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA5 = c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97920e, 1);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode = Long.hashCode(mVar22.getU());
                    p3.i2 i2VarX = mVar22.x();
                    h4.r rVarC = h4.k.c(rVarA5, mVar22);
                    h5.g.V.getClass();
                    h5.e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar22.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar22.z();
                    if (mVar22.getT()) {
                        mVar22.M(aVar12);
                    } else {
                        mVar22.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar22);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar22);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar22.getT() || !p005kotlin.jvm.internal.s.g(mVar22.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar22, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar22);
                    c2.u uVar = c2.u.f22885a;
                    ua.a(0.0f, 0.0f, 0, 0, 61, lc.u0.f(mVar22), 0L, null, mVar22);
                    mVar22.y();
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 22:
                h4.r rVar9 = (h4.r) obj;
                p3.m mVar23 = (p3.m) obj2;
                v.h.y(818703127, rVar9, (Integer) obj3, mVar23);
                p3.x1 x1Var23 = p3.n.f135158a;
                h4.r rVarA6 = l4.k.a(rVar9, 0.5f);
                mVar23.f();
                return rVarA6;
            case 23:
                h82.r rVar10 = (h82.r) obj;
                p3.m mVar24 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                p40.a aVar13 = p40.a.f135627a;
                rVar10.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar24.B(rVar10) ? 4 : 2;
                }
                if (mVar24.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    p3.x1 x1Var24 = p3.n.f135158a;
                    int i25 = (iIntValue15 << 3) & 112;
                    rVar10.D(R.string.course_planning_help_title, mVar24, i25);
                    rVar10.l(R.string.course_planner_help_description, (iIntValue15 << 6) & 896, 2, null, mVar24);
                    rVar10.j(z3.f.c(2073889527, new or0.f(rVar10, i14), mVar24), mVar24, i25 | 6);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar25 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                p40.i iVar = p40.i.f135676a;
                ((c2.t2) obj).getClass();
                if (mVar25.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    p3.x1 x1Var25 = p3.n.f135158a;
                    String strQ5 = gl1.y.Q(mVar25, R.string.lbl_remove);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97931h;
                    d6.h.f57752b.getClass();
                    mh.c(strQ5, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var, mVar25, 0, 0, 130046);
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 25:
                h82.r rVar11 = (h82.r) obj;
                p3.m mVar26 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                p50.a aVar14 = p50.a.f136102a;
                rVar11.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= mVar26.B(rVar11) ? 4 : 2;
                }
                if (mVar26.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    p3.x1 x1Var26 = p3.n.f135158a;
                    int i26 = (iIntValue17 << 3) & 112;
                    rVar11.D(R.string.nutrition_hydration_strategy_help_screen_title, mVar26, i26);
                    int i27 = (iIntValue17 << 6) & 896;
                    rVar11.l(R.string.nutrition_hydration_strategy_help_screen_intro, i27, 2, null, mVar26);
                    rVar11.o(R.string.nutrition_hydration_strategy_help_screen_paragraph_1, i27, 2, null, mVar26);
                    rVar11.o(R.string.nutrition_hydration_strategy_help_screen_paragraph_2, i27, 2, null, mVar26);
                    rVar11.o(R.string.nutrition_hydration_strategy_help_screen_paragraph_3, i27, 2, null, mVar26);
                    rVar11.t(R.string.nutrition_hydration_strategy_help_screen_heading_1, mVar26, i26);
                    rVar11.o(R.string.nutrition_hydration_strategy_help_screen_paragraph_4, i27, 2, null, mVar26);
                    rVar11.t(R.string.nutrition_hydration_strategy_help_screen_heading_2, mVar26, i26);
                    rVar11.o(R.string.nutrition_hydration_strategy_help_screen_paragraph_5, i27, 2, null, mVar26);
                    rVar11.o(R.string.nutrition_hydration_strategy_help_screen_paragraph_6, i27, 2, null, mVar26);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar27 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                p72.a aVar15 = p72.a.f136312a;
                ((e2.d) obj).getClass();
                if (mVar27.n(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    p3.x1 x1Var27 = p3.n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    int i28 = c2.k3.f22728a;
                    c2.l.f(c2.l.F(aVar16, c2.q3.d(mVar27)), mVar27);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            case 27:
                p3.m mVar28 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                pa0.c cVar = pa0.c.f136708a;
                ((c2.a0) obj).getClass();
                if (mVar28.n(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    p3.x1 x1Var28 = p3.n.f135158a;
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar29 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                pa0.c cVar2 = pa0.c.f136708a;
                ((c2.a0) obj).getClass();
                if (mVar29.n(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    p3.x1 x1Var29 = p3.n.f135158a;
                } else {
                    mVar29.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar30 = (p3.m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                pa0.c cVar3 = pa0.c.f136708a;
                ((c2.a0) obj).getClass();
                if (mVar30.n(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    p3.x1 x1Var30 = p3.n.f135158a;
                } else {
                    mVar30.e();
                }
                return Unit.INSTANCE;
        }
    }
}
