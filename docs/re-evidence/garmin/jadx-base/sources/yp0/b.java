package yp0;

import a03.k0;
import c2.a0;
import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import ds.e0;
import e23.q;
import f5.b1;
import f5.v1;
import f5.y0;
import gl1.y;
import h82.r;
import i3.mh;
import l72.x0;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.t0;
import p3.x1;
import u1.a2;
import zo1.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198629a;

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = 26;
        int i15 = 24;
        switch (this.f198629a) {
            case 0:
                r rVar = (r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c cVar = c.f198630a;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    int i16 = (iIntValue << 3) & 112;
                    rVar.D(R.string.lbl_hydration_basics_help_heading, mVar, i16);
                    rVar.l(R.string.msg_hydration_basics_help_description, (iIntValue << 6) & 896, 2, null, mVar);
                    int i17 = i16 | 6;
                    rVar.j(z3.f.c(1476156190, new wd0.a(rVar, 22), mVar), mVar, i17);
                    rVar.j(z3.f.c(-547880555, new wd0.a(rVar, 23), mVar), mVar, i17);
                    rVar.j(z3.f.c(670399062, new wd0.a(rVar, i15), mVar), mVar, i17);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                r rVar2 = (r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                c cVar2 = c.f198630a;
                rVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i18 = (iIntValue2 << 3) & 112;
                    rVar2.D(R.string.lbl_hydration_tracking_easy, mVar2, i18);
                    rVar2.l(R.string.msg_hydration_tracking_help_description, (iIntValue2 << 6) & 896, 2, null, mVar2);
                    int i19 = i18 | 6;
                    rVar2.j(z3.f.c(704216873, new wd0.a(rVar2, 25), mVar2), mVar2, i19);
                    rVar2.j(z3.f.c(1713436960, new wd0.a(rVar2, i14), mVar2), mVar2, i19);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                TimingGatesActivity.a aVar = TimingGatesActivity.f29952c;
                rVar3.getClass();
                mVar3.C(-1123845508);
                x1 x1Var3 = p3.n.f135158a;
                h4.r rVarB = a2.b(rVar3, a2.a(mVar3), false);
                mVar3.f();
                return rVarB;
            case 3:
                b1 b1Var = (b1) obj;
                y0 y0Var = (y0) obj2;
                b1Var.getClass();
                y0Var.getClass();
                v1 v1VarQ = y0Var.Q(((g6.a) obj3).f75988a);
                return b1.h0(b1Var, v1VarQ.f69145b, v1VarQ.f69144a, new k0(v1VarQ, 26));
            case 4:
                h4.r rVar4 = (h4.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                v.h.y(1277905479, rVar4, (Integer) obj3, mVar4);
                x1 x1Var4 = p3.n.f135158a;
                h4.r rVarA = l4.k.a(rVar4, 0.5f);
                mVar4.f();
                return rVarA;
            case 5:
                t2 t2Var = (t2) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                yu1.b bVar = yu1.b.f199773a;
                t2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar5.B(t2Var) ? 4 : 2;
                }
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    x0.f111346a.f((x0.f111348c << 24) | (iIntValue3 & 14), 124, null, t2Var, null, null, y.Q(mVar5, R.string.lbl_finish), y.Q(mVar5, R.string.lbl_goal), null, null, mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                yz1.a aVar2 = yz1.a.f200232a;
                ((t2) obj).getClass();
                if (mVar6.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    String strQ = y.Q(mVar6, R.string.common_learn_more);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(d92.c.e(j92.f.f97933j), e0.e(mVar6), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar6, 0, 0, 131070);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                h4.r rVar5 = (h4.r) obj;
                p3.m mVar7 = (p3.m) obj2;
                v.h.y(-291161176, rVar5, (Integer) obj3, mVar7);
                x1 x1Var7 = p3.n.f135158a;
                h4.r rVarA2 = l4.k.a(rVar5, 0.5f);
                mVar7.f();
                return rVarA2;
            case 8:
                h4.r rVar6 = (h4.r) obj;
                p3.m mVar8 = (p3.m) obj2;
                v.h.y(-1612313176, rVar6, (Integer) obj3, mVar8);
                x1 x1Var8 = p3.n.f135158a;
                h4.r rVarA3 = l4.k.a(rVar6, 0.5f);
                mVar8.f();
                return rVarA3;
            case 9:
                h4.r rVar7 = (h4.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                v.h.y(1815105200, rVar7, (Integer) obj3, mVar9);
                x1 x1Var9 = p3.n.f135158a;
                h4.r rVarA4 = l4.k.a(rVar7, 0.5f);
                mVar9.f();
                return rVarA4;
            case 10:
                h4.r rVar8 = (h4.r) obj;
                p3.m mVar10 = (p3.m) obj2;
                v.h.y(1260082364, rVar8, (Integer) obj3, mVar10);
                x1 x1Var10 = p3.n.f135158a;
                h4.r rVarA5 = l4.k.a(rVar8, 0.5f);
                mVar10.f();
                return rVarA5;
            case 11:
                h4.r rVar9 = (h4.r) obj;
                p3.m mVar11 = (p3.m) obj2;
                v.h.y(-907791056, rVar9, (Integer) obj3, mVar11);
                x1 x1Var11 = p3.n.f135158a;
                h4.r rVarF = x2.f(rVar9, 1.0f);
                mVar11.f();
                return rVarF;
            case 12:
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                za0.g gVar = za0.g.f203243a;
                ((a0) obj).getClass();
                if (mVar12.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var12 = p3.n.f135158a;
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                zo1.d dVar = zo1.d.f206251a;
                ((e2.d) obj).getClass();
                if (mVar13.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var13 = p3.n.f135158a;
                    String strQ2 = y.Q(mVar13, R.string.group_ride_genesis_title);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), mVar13);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    mh.c(strQ2, c2.l.z(aVar3, eVar.f97920e, eVar.f97918c), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar13, 0, 0, 131068);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                zo1.d dVar2 = zo1.d.f206251a;
                ((e2.d) obj).getClass();
                if (mVar14.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var14 = p3.n.f135158a;
                    String strQ3 = y.Q(mVar14, R.string.group_ride_genesis_message);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar14);
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    mh.c(strQ3, c2.l.z(aVar4, eVar2.f97920e, eVar2.f97918c), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar14, 0, 0, 131068);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                zo1.e eVar3 = zo1.e.f206278a;
                ((e2.d) obj).getClass();
                if (mVar15.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var15 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar5, j92.b.f97899b.f97920e), mVar15);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                zo1.e eVar4 = zo1.e.f206278a;
                ((e2.d) obj).getClass();
                if (mVar16.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var16 = p3.n.f135158a;
                    r0.g(R.string.lbl_award_winners, mVar16, 0);
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar6, j92.b.f97899b.f97920e), mVar16);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                zo1.e eVar5 = zo1.e.f206278a;
                ((e2.d) obj).getClass();
                if (mVar17.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var17 = p3.n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar7, j92.b.f97899b.f97920e), mVar17);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                zo1.e eVar6 = zo1.e.f206278a;
                ((e2.d) obj).getClass();
                if (mVar18.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var18 = p3.n.f135158a;
                    r0.g(R.string.lbl_award_winners, mVar18, 0);
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar8, j92.b.f97899b.f97918c), mVar18);
                    g6.f.a aVar9 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(aVar8, 32);
                    String strQ4 = y.Q(mVar18, R.string.lbl_award_empty_state);
                    d6.h.f57752b.getClass();
                    int i24 = d6.h.f57755e;
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, rVarY, 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar18), mVar18, 48, 0, 130044);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                zo1.e eVar7 = zo1.e.f206278a;
                ((e2.d) obj).getClass();
                if (mVar19.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var19 = p3.n.f135158a;
                    r0.g(R.string.lbl_preliminary_awards, mVar19, 0);
                    h4.r.a aVar10 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar10, j92.b.f97899b.f97920e), mVar19);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                zo1.e eVar8 = zo1.e.f206278a;
                ((e2.d) obj).getClass();
                if (mVar20.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var20 = p3.n.f135158a;
                    h4.r.a aVar11 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar9 = j92.b.f97899b;
                    c2.l.f(x2.h(aVar11, eVar9.f97920e), mVar20);
                    r0.g(R.string.lbl_preliminary_climb_rankings, mVar20, 0);
                    c2.l.f(x2.h(aVar11, eVar9.f97918c), mVar20);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                zo1.f fVar = zo1.f.f206295a;
                ((e2.d) obj).getClass();
                if (mVar21.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var21 = p3.n.f135158a;
                    String strQ5 = y.Q(mVar21, R.string.lbl_riders_footer);
                    h4.r.a aVar12 = h4.r.S;
                    float f14 = 16;
                    g6.f.a aVar13 = g6.f.f75994b;
                    h4.r rVarB2 = c2.l.B(aVar12, f14, 4, f14, f14);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ5, rVarB2, com.nimbusds.jose.shaded.gson.internal.a.x(mVar21), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar21, 0, 0, 131064);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                zr.a aVar14 = zr.a.f206700a;
                ((t2) obj).getClass();
                if (mVar22.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var22 = p3.n.f135158a;
                    String strQ6 = y.Q(mVar22, R.string.activity_summary_self_evaluation);
                    h4.r.a aVar15 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC = c2.l.C(aVar15, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    d92.b.f58624b.getClass();
                    mh.c(strQ6, rVarC, zl.a.a(mVar22), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, mVar22, 0, 0, 131064);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar23 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                zr.a aVar16 = zr.a.f206700a;
                ((t2) obj).getClass();
                if (mVar23.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var23 = p3.n.f135158a;
                    String strQ7 = y.Q(mVar23, R.string.lbl_save);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ7, null, e0.e(mVar23), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, mVar23, 0, 0, 131066);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar24 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                zr.a aVar17 = zr.a.f206700a;
                ((t2) obj).getClass();
                if (mVar24.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    x1 x1Var24 = p3.n.f135158a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY2 = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
                    String strQ8 = y.Q(mVar24, R.string.lbl_help);
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97931h;
                    d6.h.f57752b.getClass();
                    mh.c(strQ8, rVarY2, e0.e(mVar24), null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var, mVar24, 0, 0, 130040);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 25:
                h4.r rVar10 = (h4.r) obj;
                p3.m mVar25 = (p3.m) obj2;
                v.h.y(-1708645152, rVar10, (Integer) obj3, mVar25);
                x1 x1Var25 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = c2.l.C(rVar10, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                mVar25.f();
                return rVarC2;
            case 26:
                h4.r rVar11 = (h4.r) obj;
                p3.m mVar26 = (p3.m) obj2;
                v.h.y(243494798, rVar11, (Integer) obj3, mVar26);
                x1 x1Var26 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA6 = c2.l.A(rVar11, 0.0f, j92.b.f97899b.f97918c, 1);
                mVar26.f();
                return rVarA6;
            case 27:
                b1 b1Var2 = (b1) obj;
                y0 y0Var2 = (y0) obj2;
                b1Var2.getClass();
                y0Var2.getClass();
                v1 v1VarQ2 = y0Var2.Q(((g6.a) obj3).f75988a);
                int i25 = v1VarQ2.f69145b;
                return b1Var2.H1(v1VarQ2.f69144a, i25, t0.b(new o13.p(f5.b.f68892a, Integer.valueOf(MathKt.c(i25 / 2.0f)))), new k0(v1VarQ2, 27));
            case 28:
                p3.m mVar27 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                zx0.a aVar18 = zx0.a.f207337a;
                ((t2) obj).getClass();
                if (mVar27.n(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    x1 x1Var27 = p3.n.f135158a;
                    g02.a0.a(mVar27, 0);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            default:
                r rVar12 = (r) obj;
                p3.m mVar28 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                zx0.b bVar2 = zx0.b.f207339a;
                rVar12.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= mVar28.B(rVar12) ? 4 : 2;
                }
                if (mVar28.n(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    x1 x1Var28 = p3.n.f135158a;
                    rVar12.o(R.string.moveiq_help_text, (iIntValue19 << 6) & 896, 2, null, mVar28);
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
        }
    }
}
