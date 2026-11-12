package qk0;

import am.x0;
import c2.k3;
import c2.q3;
import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import g02.a0;
import gl1.y;
import i3.l9;
import i3.mh;
import l72.j0;
import p005kotlin.Unit;
import p3.x1;
import r1.e0;
import rg0.i0;
import v62.o7;
import zb0.s0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145077a;

    public /* synthetic */ a(int i14) {
        this.f145077a = i14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = 18;
        int i15 = 6;
        switch (this.f145077a) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                b bVar = b.f145078a;
                ((e2.d) obj).getClass();
                if (mVar.n(1 & iIntValue, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    s62.a.f157643a.getClass();
                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar, R.string.lbl_no_results), y.Q(mVar, R.string.no_activities_match_search_try_other), rVarC, null, mVar, 0, 16);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                b bVar2 = b.f145078a;
                ((e2.d) obj).getClass();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC2 = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    s62.a.f157643a.getClass();
                    b82.n.c(u62.a.a(t62.a.f162797a), y.Q(mVar2, R.string.no_default_activities), y.Q(mVar2, R.string.not_selected_default_activities_for_gear), rVarC2, null, mVar2, 0, 16);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                x0 x0Var = (x0) obj;
                p3.m mVar3 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                x0Var.getClass();
                mVar3.C(-1978223715);
                x1 x1Var3 = p3.n.f135158a;
                j0 j0Var = new j0(gl1.d.T(x0Var.f4360c, mVar3, 0), null, null, false, false, 30, null);
                mVar3.f();
                return j0Var;
            case 3:
                boolean z14 = true;
                h82.r rVar = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                qk1.b bVar3 = qk1.b.f145170a;
                rVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(rVar) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18) {
                    z14 = false;
                }
                if (mVar4.n(iIntValue3 & 1, z14)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i16 = (iIntValue3 << 3) & 112;
                    rVar.D(R.string.lbl_wheelchair_mode, mVar4, i16);
                    rVar.l(R.string.wheelchair_mode_help_desc, (iIntValue3 << 6) & 896, 2, null, mVar4);
                    int i17 = i16 | 6;
                    rVar.j(z3.f.c(1502535051, new pk1.g(rVar, 5), mVar4), mVar4, i17);
                    rVar.j(z3.f.c(-1582031614, new pk1.g(rVar, i15), mVar4), mVar4, i17);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                boolean z15 = true;
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                qn0.a aVar3 = qn0.a.f145781a;
                rVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar5.B(rVar2) ? 4 : 2;
                }
                if ((iIntValue4 & 19) == 18) {
                    z15 = false;
                }
                if (mVar5.n(iIntValue4 & 1, z15)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i18 = ((iIntValue4 << 3) & 112) | 6;
                    rVar2.k(z3.f.c(-646538318, new pk1.g(rVar2, 12), mVar5), mVar5, i18);
                    rVar2.j(z3.f.c(420142078, new pk1.g(rVar2, 13), mVar5), mVar5, i18);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                boolean z16 = true;
                h82.r rVar3 = (h82.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                qn0.a aVar4 = qn0.a.f145781a;
                rVar3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar6.B(rVar3) ? 4 : 2;
                }
                if ((iIntValue5 & 19) == 18) {
                    z16 = false;
                }
                if (mVar6.n(iIntValue5 & 1, z16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    int i19 = ((iIntValue5 << 3) & 112) | 6;
                    rVar3.k(z3.f.c(-948073832, new pk1.g(rVar3, 17), mVar6), mVar6, i19);
                    rVar3.j(z3.f.c(1512764388, new pk1.g(rVar3, i14), mVar6), mVar6, i19);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                boolean z17 = true;
                h82.r rVar4 = (h82.r) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                qn0.a aVar5 = qn0.a.f145781a;
                rVar4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar7.B(rVar4) ? 4 : 2;
                }
                if ((iIntValue6 & 19) == 18) {
                    z17 = false;
                }
                if (mVar7.n(iIntValue6 & 1, z17)) {
                    x1 x1Var7 = p3.n.f135158a;
                    int i24 = ((iIntValue6 << 3) & 112) | 6;
                    rVar4.k(z3.f.c(-2072676871, new pk1.g(rVar4, 8), mVar7), mVar7, i24);
                    rVar4.j(z3.f.c(1148320813, new pk1.g(rVar4, 9), mVar7), mVar7, i24);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                boolean z18 = true;
                h82.r rVar5 = (h82.r) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                qn0.a aVar6 = qn0.a.f145781a;
                rVar5.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar8.B(rVar5) ? 4 : 2;
                }
                if ((iIntValue7 & 19) == 18) {
                    z18 = false;
                }
                if (mVar8.n(iIntValue7 & 1, z18)) {
                    x1 x1Var8 = p3.n.f135158a;
                    int i25 = ((iIntValue7 << 3) & 112) | 6;
                    rVar5.k(z3.f.c(-457025144, new pk1.g(rVar5, 10), mVar8), mVar8, i25);
                    rVar5.j(z3.f.c(-1874348332, new pk1.g(rVar5, 11), mVar8), mVar8, i25);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                h4.r rVar6 = (h4.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                v.h.y(1397834017, rVar6, (Integer) obj3, mVar9);
                x1 x1Var9 = p3.n.f135158a;
                h4.r rVarA = l4.k.a(rVar6, 0.5f);
                mVar9.f();
                return rVarA;
            case 9:
                p3.m mVar10 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                r11.a aVar7 = r11.a.f149358a;
                ((e0) obj).getClass();
                x1 x1Var10 = p3.n.f135158a;
                h4.r.a aVar8 = h4.r.S;
                l9.f88870a.getClass();
                c2.l.f(c2.l.F(aVar8, l9.a(mVar10)), mVar10);
                return Unit.INSTANCE;
            case 10:
                t2 t2Var = (t2) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                r21.b bVar4 = r21.b.f149476a;
                t2Var.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar11.B(t2Var) ? 4 : 2;
                }
                if (mVar11.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    l72.w.a.f111302a.c(t2Var, y.Q(mVar11, R.string.txt_activity_level_title), y.Q(mVar11, R.string.lbl_select_an_activity_level_equivalent), null, mVar11, iIntValue8 & 14, 4);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                r22.w wVar = r22.w.f149908a;
                ((e2.d) obj).getClass();
                if (mVar12.n(1 & iIntValue9, (iIntValue9 & 17) != 16)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarF = x2.f(c2.l.y(aVar9, j92.b.f97899b.f97920e), 1.0f);
                    String strQ = y.Q(mVar12, R.string.msg_segments_no_filter_results);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar12);
                    d6.h.f57752b.getClass();
                    mh.c(strQ, rVarF, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar12, 0, 0, 130044);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                h4.r rVar7 = (h4.r) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                r70.c cVar = r70.c.f151042a;
                rVar7.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar13.B(rVar7) ? 4 : 2;
                }
                if (mVar13.n(1 & iIntValue10, (iIntValue10 & 19) != 18)) {
                    x1 x1Var13 = p3.n.f135158a;
                    mh.c("", x2.y(h4.r.S, null, 3).then(rVar7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar13, 6, 0, 262140);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                boolean z19 = true;
                t2 t2Var2 = (t2) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                r72.a aVar10 = r72.a.f151157a;
                t2Var2.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar14.B(t2Var2) ? 4 : 2;
                }
                if ((iIntValue11 & 19) == 18) {
                    z19 = false;
                }
                if (mVar14.n(iIntValue11 & 1, z19)) {
                    x1 x1Var14 = p3.n.f135158a;
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    int i26 = iIntValue11 & 14;
                    int i27 = l72.x0.f111348c;
                    x0Var2.a((i27 << 24) | i26 | 25008, 116, null, t2Var2, null, null, "Metric", "Data Label", "Unit", null, mVar14);
                    x0Var2.h(t2Var2, mVar14, i26 | (i27 << 3));
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                t2 t2Var3 = (t2) obj;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                r72.a aVar11 = r72.a.f151157a;
                t2Var3.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar15.B(t2Var3) ? 4 : 2;
                }
                if (mVar15.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var15 = p3.n.f135158a;
                    l72.x0 x0Var3 = l72.x0.f111346a;
                    int i28 = (l72.x0.f111348c << 24) | (iIntValue12 & 14) | 25008;
                    x0Var3.a(i28, 116, null, t2Var3, null, null, "Metric", "Data Label", "Unit", null, mVar15);
                    x0Var3.a(i28, 116, null, t2Var3, null, null, "Metric", "Data Label", "Unit", null, mVar15);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                t2 t2Var4 = (t2) obj;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                r72.a aVar12 = r72.a.f151157a;
                t2Var4.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar16.B(t2Var4) ? 4 : 2;
                }
                if (mVar16.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var16 = p3.n.f135158a;
                    l72.x0 x0Var4 = l72.x0.f111346a;
                    int i29 = (l72.x0.f111348c << 24) | (iIntValue13 & 14) | 25008;
                    x0Var4.a(i29, 116, null, t2Var4, null, null, "Metric", "Data Label", "Unit", null, mVar16);
                    x0Var4.a(i29, 116, null, t2Var4, null, null, "Metric", "Data Label", "Unit", null, mVar16);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                boolean z24 = true;
                t2 t2Var5 = (t2) obj;
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                r72.a aVar13 = r72.a.f151157a;
                t2Var5.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar17.B(t2Var5) ? 4 : 2;
                }
                if ((iIntValue14 & 19) == 18) {
                    z24 = false;
                }
                if (mVar17.n(iIntValue14 & 1, z24)) {
                    x1 x1Var17 = p3.n.f135158a;
                    l72.x0 x0Var5 = l72.x0.f111346a;
                    int i30 = iIntValue14 & 14;
                    int i34 = l72.x0.f111348c;
                    x0Var5.a((i34 << 24) | i30 | 25008, 116, null, t2Var5, null, null, "Metric", "Data Label", "Unit", null, mVar17);
                    x0Var5.h(t2Var5, mVar17, i30 | (i34 << 3));
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                boolean z25 = true;
                t2 t2Var6 = (t2) obj;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                r72.a aVar14 = r72.a.f151157a;
                t2Var6.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar18.B(t2Var6) ? 4 : 2;
                }
                if ((iIntValue15 & 19) == 18) {
                    z25 = false;
                }
                if (mVar18.n(iIntValue15 & 1, z25)) {
                    x1 x1Var18 = p3.n.f135158a;
                    l72.x0 x0Var6 = l72.x0.f111346a;
                    int i35 = iIntValue15 & 14;
                    int i36 = l72.x0.f111348c;
                    x0Var6.f((i36 << 24) | i35 | 25008, 116, null, t2Var6, null, null, "00", "Unit", "Data Label", null, mVar18);
                    x0Var6.h(t2Var6, mVar18, i35 | (i36 << 3));
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                t2 t2Var7 = (t2) obj;
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                r72.a aVar15 = r72.a.f151157a;
                t2Var7.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= mVar19.B(t2Var7) ? 4 : 2;
                }
                if (mVar19.n(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    x1 x1Var19 = p3.n.f135158a;
                    l72.x0 x0Var7 = l72.x0.f111346a;
                    int i37 = (l72.x0.f111348c << 24) | (iIntValue16 & 14) | 25008;
                    x0Var7.a(i37, 116, null, t2Var7, null, null, "Metric", "Data Label", "Unit", null, mVar19);
                    x0Var7.a(i37, 116, null, t2Var7, null, null, "Metric", "Data Label", "Unit", null, mVar19);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                t2 t2Var8 = (t2) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                r72.a aVar16 = r72.a.f151157a;
                t2Var8.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= mVar20.B(t2Var8) ? 4 : 2;
                }
                if (mVar20.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    x1 x1Var20 = p3.n.f135158a;
                    l72.x0 x0Var8 = l72.x0.f111346a;
                    int i38 = (l72.x0.f111348c << 24) | (iIntValue17 & 14) | 25008;
                    x0Var8.a(i38, 116, null, t2Var8, null, null, "Metric", "Data Label", "Unit", null, mVar20);
                    x0Var8.a(i38, 116, null, t2Var8, null, null, "Metric", "Data Label", "Unit", null, mVar20);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                r72.b bVar5 = r72.b.f151165a;
                ((e2.d) obj).getClass();
                if (mVar21.n(1 & iIntValue18, (iIntValue18 & 17) != 16)) {
                    x1 x1Var21 = p3.n.f135158a;
                    h4.r.a aVar17 = h4.r.S;
                    int i39 = k3.f22728a;
                    c2.l.f(c2.l.F(aVar17, q3.d(mVar21)), mVar21);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 21:
                s0 s0Var = (s0) obj;
                p3.m mVar22 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                s0Var.getClass();
                mVar22.C(-1209117405);
                x1 x1Var22 = p3.n.f135158a;
                String strQ2 = y.Q(mVar22, s0Var.f203657b);
                mVar22.f();
                return strQ2;
            case 22:
                boolean z26 = true;
                h82.r rVar8 = (h82.r) obj;
                p3.m mVar23 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                i0 i0Var = i0.f152563a;
                rVar8.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= mVar23.B(rVar8) ? 4 : 2;
                }
                if ((iIntValue19 & 19) == 18) {
                    z26 = false;
                }
                if (mVar23.n(iIntValue19 & 1, z26)) {
                    x1 x1Var23 = p3.n.f135158a;
                    rVar8.D(R.string.adding_viewers_to_your_account, mVar23, (iIntValue19 << 3) & 112);
                    int i44 = (iIntValue19 << 6) & 896;
                    rVar8.o(R.string.msg_where_to_add_authorized_viewer, i44, 2, null, mVar23);
                    rVar8.o(R.string.msg_adding_authorized_viewer_must_have_account, i44, 2, null, mVar23);
                    rVar8.o(R.string.if_you_wish_revoke_account, i44, 2, null, mVar23);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 23:
                h82.r rVar9 = (h82.r) obj;
                boolean z27 = true;
                p3.m mVar24 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                i0 i0Var2 = i0.f152563a;
                rVar9.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= mVar24.B(rVar9) ? 4 : 2;
                }
                if ((iIntValue20 & 19) == 18) {
                    z27 = false;
                }
                if (mVar24.n(iIntValue20 & 1, z27)) {
                    x1 x1Var24 = p3.n.f135158a;
                    rVar9.D(R.string.viewing_other_accounts, mVar24, (iIntValue20 << 3) & 112);
                    int i45 = (iIntValue20 << 6) & 896;
                    rVar9.o(R.string.if_somebody_adds_you_viewer, i45, 2, null, mVar24);
                    rVar9.o(R.string.msg_as_authorized_viewer_you_will_have_access, i45, 2, null, mVar24);
                    rVar9.o(R.string.if_wish_remove_access_to_account, i45, 2, null, mVar24);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 24:
                h4.r rVar10 = (h4.r) obj;
                p3.m mVar25 = (p3.m) obj2;
                v.h.y(686524247, rVar10, (Integer) obj3, mVar25);
                x1 x1Var25 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC3 = c2.l.C(rVar10, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                mVar25.f();
                return rVarC3;
            case 25:
                h4.r rVar11 = (h4.r) obj;
                p3.m mVar26 = (p3.m) obj2;
                v.h.y(-2130898529, rVar11, (Integer) obj3, mVar26);
                x1 x1Var26 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC4 = c2.l.C(rVar11, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                mVar26.f();
                return rVarC4;
            case 26:
                p3.m mVar27 = (p3.m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                rr0.a aVar18 = rr0.a.f154192a;
                ((t2) obj).getClass();
                if (mVar27.n(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    x1 x1Var27 = p3.n.f135158a;
                    a0.a(mVar27, 0);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            case 27:
                p3.m mVar28 = (p3.m) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                rr0.b bVar6 = rr0.b.f154194a;
                ((t2) obj).getClass();
                if (mVar28.n(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    x1 x1Var28 = p3.n.f135158a;
                    a0.a(mVar28, 0);
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar29 = (p3.m) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                rr0.d dVar = rr0.d.f154198a;
                ((t2) obj).getClass();
                if (mVar29.n(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    x1 x1Var29 = p3.n.f135158a;
                    a0.a(mVar29, 0);
                } else {
                    mVar29.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar30 = (p3.m) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                rr0.e eVar = rr0.e.f154201a;
                ((t2) obj).getClass();
                if (mVar30.n(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    x1 x1Var30 = p3.n.f135158a;
                    a0.a(mVar30, 0);
                } else {
                    mVar30.e();
                }
                return Unit.INSTANCE;
        }
    }
}
