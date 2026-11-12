package ub1;

import c2.c1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import d53.w;
import e23.p;
import e23.q;
import gl1.y;
import h5.e0;
import h82.r;
import i3.mh;
import i3.s5;
import i3.wd;
import jf.v;
import kotlin.t1;
import l72.d3;
import o4.d0;
import o4.m1;
import o4.q1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;
import s5.i0;
import s5.x0;
import vd0.n0;
import vd0.t0;
import w5.b0;
import w5.c0;
import w5.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169796a;

    public /* synthetic */ e(w30.e eVar) {
        this.f169796a = 26;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [h82.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [h82.r] */
    /* JADX WARN: Type inference failed for: r20v2, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r5v1, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r5v2, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r5v6, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    private final Object a(Object obj, Object obj2, Object obj3) {
        ?? r14 = (r) obj;
        ?? r15 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = w30.e.f181832f;
        r14.getClass();
        int i15 = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= r15.B(r14) ? 4 : 2;
        }
        boolean z14 = true;
        int i16 = 0;
        if (r15.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i17 = (iIntValue << 3) & 112;
            r14.D(R.string.climb_grade_section_title, r15, i17);
            char c14 = 6;
            int i18 = (iIntValue << 6) & 896;
            r14.l(R.string.climb_grade_section_intro, i18, 2, null, r15);
            r14.o(R.string.climb_grade_section_paragraph1, i18, 2, null, r15);
            r14.o(R.string.climb_grade_section_paragraph2, i18, 2, null, r15);
            r15.C(32416694);
            gl.c.f77766a.getClass();
            gl.e eVar = gl.c.f77767b;
            ?? r16 = r14;
            ?? r17 = r15;
            for (w30.e.b bVar : x.k(new w30.e.b(eVar.E, R.string.category_description_help_cat1_percentage, R.string.climb_cat1_description, null), new w30.e.b(eVar.f77816x0, R.string.category_description_help_cat2_percentage, R.string.climb_cat2_description, null), new w30.e.b(eVar.M, R.string.category_description_help_cat3_percentage, R.string.climb_cat3_description, null), new w30.e.b(eVar.f77770a0, R.string.category_description_help_cat4_percentage, R.string.climb_cat4_description, null), new w30.e.b(eVar.f77778e0, R.string.category_description_help_cat5_percentage, R.string.climb_cat5_description, null))) {
                h4.d.f81522a.getClass();
                h4.g.b bVar2 = h4.d.a.f81534l;
                h4.r.a aVar = h4.r.S;
                g6.f.a aVar2 = g6.f.f75994b;
                float f14 = 16;
                h4.r rVarC = c2.l.C(aVar, 28, 8, f14, 0.0f, 8);
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, bVar2, r17, 48);
                x1 x1Var2 = n.f135158a;
                int iHashCode = Long.hashCode(r17.getU());
                i2 i2VarX = r17.x();
                h4.r rVarC2 = h4.k.c(rVarC, r17);
                h5.g.V.getClass();
                e0.a aVar3 = h5.g.a.f81805b;
                if (r17.F() == null) {
                    p0.l();
                    throw null;
                }
                r17.z();
                if (r17.getT()) {
                    r17.M(aVar3);
                } else {
                    r17.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, r17);
                b4.c(h5.g.a.f81809f, i2VarX, r17);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (r17.getT() || !s.g(r17.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, r17, iHashCode, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC2, r17);
                u2 u2Var = u2.f22900a;
                c2.q.a(u1.n.e(l4.k.b(x2.q(aVar, f14), k2.i.f102406a), bVar.f181833a, m1.f128891a), r17, i16);
                String strQ = y.Q(r17, bVar.f181834b);
                float f15 = i15;
                h4.r rVarA = u2Var.a(c2.l.C(aVar, f14, f15, 0.0f, f15, 4), 0.25f, z14);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0Var = j92.f.f97932i;
                ?? r24 = r17;
                mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, r17), r24, 0, 0, 131068);
                mh.c(y.Q(r24, bVar.f181835c), u2Var.a(c2.l.C(aVar, f14, f15, 0.0f, f15, 4), 0.75f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, r24), r24, 0, 0, 131068);
                ?? r18 = r24;
                r18.y();
                r16 = r16;
                z14 = true;
                i15 = i15;
                i17 = i17;
                i16 = 0;
                c14 = 6;
                r17 = r18;
            }
            int i19 = i17;
            r17.f();
            r16.o(R.string.climb_grade_section_paragraph3, i18, 2, null, r17);
            r16.t(R.string.climb_grade_section_paragraph_heading, r17, i19);
            String strQ2 = y.Q(r17, R.string.txt_one_factor);
            String strP = y.P(R.string.climb_grade_section_paragraph4, new Object[]{strQ2}, r17);
            int iH = w.H(strP, strQ2, 0, false, 6);
            int length = strQ2.length() + iH;
            b0.f182070b.getClass();
            r16.r(new s5.c(strP, p13.w.c(new s5.c.d(new i0(0L, 0L, (f0) null, b0.a(b0.f182071c), (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65527, (p005kotlin.jvm.internal.j) null), iH, length)), null, 4, null), r17, i19);
            x1 x1Var3 = n.f135158a;
        } else {
            r15.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:306:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:313:0x0957  */
    /* JADX WARN: Code duplicated, block: B:8:0x0049  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f169796a;
        int i15 = 25;
        p3.m.a aVar = p3.m.f135153a;
        int i16 = 14;
        int i17 = 16;
        int i18 = 18;
        int i19 = 6;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                v.h.y(1522499942, rVar, (Integer) obj3, mVar);
                x1 x1Var = n.f135158a;
                h4.r rVarA = l4.k.a(rVar, 0.5f);
                mVar.f();
                return rVarA;
            case 1:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                v.h.y(-358955369, rVar2, (Integer) obj3, mVar2);
                x1 x1Var2 = n.f135158a;
                h4.r rVarA2 = l4.k.a(rVar2, 0.5f);
                mVar2.f();
                return rVarA2;
            case 2:
                p pVar = (p) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                uc.a aVar2 = uc.a.f169921a;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar3.r(pVar) ? 4 : 2;
                }
                if (mVar3.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    pVar.invoke(mVar3, Integer.valueOf(iIntValue & 14));
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                wd wdVar = (wd) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ug2.e eVar = ug2.e.f170756a;
                wdVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar4.B(wdVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    d3.a(wdVar, x2.f(h4.r.S, 1.0f), mVar4, 48 | (iIntValue2 & 14), 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                n0 n0Var = n0.f177333a;
                ((e2.d) obj).getClass();
                if (mVar5.n(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    vd0.p.c(mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                n0 n0Var2 = n0.f177333a;
                ((e2.d) obj).getClass();
                if (mVar6.n(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    vd0.p.d(mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                vd0.p0 p0Var = vd0.p0.f177348a;
                ((e2.d) obj).getClass();
                if (mVar7.n(1 & iIntValue5, (iIntValue5 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    t0.e(mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                vd0.p0 p0Var2 = vd0.p0.f177348a;
                ((e2.d) obj).getClass();
                if (mVar8.n(1 & iIntValue6, (iIntValue6 & 17) != 16)) {
                    x1 x1Var8 = n.f135158a;
                    t0.c(mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                vd0.p0 p0Var3 = vd0.p0.f177348a;
                ((e2.d) obj).getClass();
                if (mVar9.n(1 & iIntValue7, (iIntValue7 & 17) != 16)) {
                    x1 x1Var9 = n.f135158a;
                    t0.e(mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar10 = (p3.m) obj2;
                v.h.y(-488099170, (h4.r) obj, (Integer) obj3, mVar10);
                x1 x1Var10 = n.f135158a;
                d92.b.f58623a.getClass();
                long jC = d92.b.a(mVar10).j().c();
                mVar10.C(-911864018);
                float fS0 = ((g6.c) mVar10.A(t1.f91490h)).s0(t0.f177387d);
                mVar10.f();
                h4.r.a aVar3 = h4.r.S;
                boolean zL = mVar10.l(jC) | mVar10.i(fS0);
                Object objQ = mVar10.q();
                if (zL) {
                    objQ = new s5(jC, fS0, i19);
                    mVar10.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new s5(jC, fS0, i19);
                        mVar10.K(objQ);
                    }
                }
                h4.r rVarD = l4.k.d(aVar3, (e23.l) objQ);
                mVar10.f();
                return rVarD;
            case 10:
                p3.m mVar11 = (p3.m) obj2;
                v.h.y(1766812659, (h4.r) obj, (Integer) obj3, mVar11);
                x1 x1Var11 = n.f135158a;
                d92.b.f58623a.getClass();
                long jC2 = d92.b.a(mVar11).j().c();
                mVar11.C(1394886179);
                float fS1 = ((g6.c) mVar11.A(t1.f91490h)).s0(t0.f177386c);
                mVar11.f();
                h4.r.a aVar4 = h4.r.S;
                boolean zL2 = mVar11.l(jC2) | mVar11.i(fS1);
                Object objQ2 = mVar11.q();
                if (zL2) {
                    objQ2 = new s5(jC2, fS1, 5);
                    mVar11.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new s5(jC2, fS1, 5);
                        mVar11.K(objQ2);
                    }
                }
                h4.r rVarD2 = l4.k.d(aVar4, (e23.l) objQ2);
                mVar11.f();
                return rVarD2;
            case 11:
                r rVar3 = (r) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                vg1.g gVar = vg1.g.f178109a;
                rVar3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar12.B(rVar3) ? 4 : 2;
                }
                if (mVar12.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var12 = n.f135158a;
                    int i24 = (iIntValue8 << 3) & 112;
                    rVar3.D(R.string.bike_alarm_title, mVar12, i24);
                    rVar3.l(R.string.bike_alarm_brief_description, (iIntValue8 << 6) & 896, 2, null, mVar12);
                    int i25 = i24 | 6;
                    rVar3.j(z3.f.c(-595908583, new t12.a(rVar3, 13), mVar12), mVar12, i25);
                    rVar3.j(z3.f.c(-520386288, new t12.a(rVar3, i16), mVar12), mVar12, i25);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                r rVar4 = (r) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                vp1.b bVar = vp1.b.f179385a;
                rVar4.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar13.B(rVar4) ? 4 : 2;
                }
                if (mVar13.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var13 = n.f135158a;
                    int i26 = ((iIntValue9 << 3) & 112) | 6;
                    rVar4.j(z3.f.c(2086374135, new t12.a(rVar4, 15), mVar13), mVar13, i26);
                    rVar4.j(z3.f.c(692865120, new t12.a(rVar4, i17), mVar13), mVar13, i26);
                    rVar4.j(z3.f.c(522025663, new t12.a(rVar4, 17), mVar13), mVar13, i26);
                    rVar4.j(z3.f.c(351186206, new t12.a(rVar4, i18), mVar13), mVar13, i26);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                r rVar5 = (r) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                vr1.a aVar5 = vr1.a.f179483a;
                rVar5.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar14.B(rVar5) ? 4 : 2;
                }
                if (mVar14.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var14 = n.f135158a;
                    int i27 = (iIntValue10 << 3) & 112;
                    rVar5.D(R.string.stress_help_reading_title_1, mVar14, i27);
                    rVar5.l(R.string.stress_help_reading_description_1, (iIntValue10 << 6) & 896, 2, null, mVar14);
                    int i28 = i27 | 6;
                    rVar5.j(z3.f.c(12713008, new t12.a(rVar5, i15), mVar14), mVar14, i28);
                    rVar5.j(z3.f.c(917252825, new t12.a(rVar5, 26), mVar14), mVar14, i28);
                    rVar5.j(z3.f.c(1510741496, new t12.a(rVar5, 27), mVar14), mVar14, i28);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                r rVar6 = (r) obj;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                vu0.a aVar6 = vu0.a.f180221a;
                rVar6.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar15.B(rVar6) ? 4 : 2;
                }
                if (mVar15.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var15 = n.f135158a;
                    rVar6.D(R.string.lbl_starting_livetrack_session, mVar15, (iIntValue11 << 3) & 112);
                    int i29 = (iIntValue11 << 6) & 896;
                    rVar6.l(R.string.msg_livetrack_description, i29, 2, null, mVar15);
                    rVar6.o(R.string.msg_how_to_start_livetrack_session, i29, 2, null, mVar15);
                    rVar6.o(R.string.msg_how_to_start_livetrack_from_device, i29, 2, null, mVar15);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                r rVar7 = (r) obj;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                vu0.a aVar7 = vu0.a.f180221a;
                rVar7.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar16.B(rVar7) ? 4 : 2;
                }
                if (mVar16.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var16 = n.f135158a;
                    int i30 = (iIntValue12 << 3) & 112;
                    rVar7.D(R.string.lbl_livetrack_on_device, mVar16, i30);
                    int i34 = (iIntValue12 << 6) & 896;
                    rVar7.m(i34, 0, y.Q(mVar16, R.string.msg_grouptrack_allows_following_view), lv0.b.b(y.Q(mVar16, R.string.msg_grouptrack_allows_following_view), mVar16), mVar16);
                    rVar7.j(z3.f.c(12684355, new t12.a(rVar7, 29), mVar16), mVar16, i30 | 6);
                    rVar7.p(y.Q(mVar16, R.string.msg_share_livetrack_via_grouptrack), lv0.b.b(y.Q(mVar16, R.string.msg_share_livetrack_via_grouptrack), mVar16), mVar16, i34);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                r rVar8 = (r) obj;
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                vu0.a aVar8 = vu0.a.f180221a;
                rVar8.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar17.B(rVar8) ? 4 : 2;
                }
                if (mVar17.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var17 = n.f135158a;
                    rVar8.D(R.string.live_track_auto_start, mVar17, (iIntValue13 << 3) & 112);
                    int i35 = (iIntValue13 << 6) & 896;
                    rVar8.l(R.string.msg_livetrack_auto_start_usage, i35, 2, null, mVar17);
                    rVar8.o(R.string.msg_how_to_use_livetrack_auto_start, i35, 2, null, mVar17);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                r rVar9 = (r) obj;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                vu0.a aVar9 = vu0.a.f180221a;
                rVar9.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar18.B(rVar9) ? 4 : 2;
                }
                if (mVar18.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var18 = n.f135158a;
                    rVar9.D(R.string.lbl_show_course, mVar18, (iIntValue14 << 3) & 112);
                    int i36 = (iIntValue14 << 6) & 896;
                    rVar9.l(R.string.msg_course_sharing_usage, i36, 2, null, mVar18);
                    rVar9.o(R.string.msg_course_sharing_how_to, i36, 2, null, mVar18);
                    rVar9.o(R.string.msg_course_sharing_steps, i36, 2, null, mVar18);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                r rVar10 = (r) obj;
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                vu0.a aVar10 = vu0.a.f180221a;
                rVar10.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar19.B(rVar10) ? 4 : 2;
                }
                if (mVar19.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var19 = n.f135158a;
                    rVar10.D(R.string.lbl_share_strava, mVar19, (iIntValue15 << 3) & 112);
                    rVar10.o(R.string.msg_how_to_share_livetrack_via_strava, (iIntValue15 << 6) & 896, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                r rVar11 = (r) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                vu0.a aVar11 = vu0.a.f180221a;
                rVar11.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= mVar20.B(rVar11) ? 4 : 2;
                }
                if (mVar20.n(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    x1 x1Var20 = n.f135158a;
                    rVar11.D(R.string.live_track_allow_messages_subtitle, mVar20, (iIntValue16 << 3) & 112);
                    rVar11.o(R.string.live_track_spectator_messaging_help_text, (iIntValue16 << 6) & 896, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                r rVar12 = (r) obj;
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                vv0.a aVar12 = vv0.a.f180424a;
                rVar12.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= mVar21.B(rVar12) ? 4 : 2;
                }
                if (mVar21.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    x1 x1Var21 = n.f135158a;
                    int i37 = ((iIntValue17 << 3) & 112) | 6;
                    rVar12.k(z3.f.c(-286833342, new vu0.h(rVar12, 7), mVar21), mVar21, i37);
                    rVar12.j(z3.f.c(-829784178, new vu0.h(rVar12, 8), mVar21), mVar21, i37);
                    rVar12.j(z3.f.c(1441146373, new vu0.h(rVar12, 9), mVar21), mVar21, i37);
                    rVar12.j(z3.f.c(-1635541306, new vu0.h(rVar12, 10), mVar21), mVar21, i37);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 21:
                r rVar13 = (r) obj;
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                vv0.a aVar13 = vv0.a.f180424a;
                rVar13.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= mVar22.B(rVar13) ? 4 : 2;
                }
                if (mVar22.n(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    x1 x1Var22 = n.f135158a;
                    int i38 = ((iIntValue18 << 3) & 112) | 6;
                    rVar13.k(z3.f.c(72301390, new vu0.h(rVar13, 11), mVar22), mVar22, i38);
                    rVar13.j(z3.f.c(420694658, new vu0.h(rVar13, 12), mVar22), mVar22, i38);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar23 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                w11.a aVar14 = w11.a.f181194a;
                ((e2.d) obj).getClass();
                if (mVar23.n(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    x1 x1Var23 = n.f135158a;
                    String strQ = y.Q(mVar23, R.string.msg_confirm_meal_time_food_selections);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar23);
                    d6.h.f57752b.getClass();
                    int i39 = d6.h.f57755e;
                    h4.r.a aVar15 = h4.r.S;
                    d92.b.f58625c.getClass();
                    mh.c(strQ, c2.l.y(aVar15, j92.b.f97899b.f97921f), 0L, null, 0L, null, 0L, d6.h.a(i39), 0L, 0, false, 0, 0, null, x0VarB, mVar23, 0, 0, 130044);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 23:
                r rVar14 = (r) obj;
                p3.m mVar24 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                w30.a aVar16 = w30.a.f181821a;
                rVar14.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= mVar24.B(rVar14) ? 4 : 2;
                }
                if (mVar24.n(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    x1 x1Var24 = n.f135158a;
                    rVar14.D(R.string.know_your_climbs, mVar24, (iIntValue20 << 3) & 112);
                    int i44 = (iIntValue20 << 6) & 896;
                    rVar14.l(R.string.climb_details_section_paragraph1, i44, 2, null, mVar24);
                    rVar14.o(R.string.climb_details_section_paragraph2, i44, 2, null, mVar24);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 24:
                r rVar15 = (r) obj;
                p3.m mVar25 = (p3.m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                w30.a aVar17 = w30.a.f181821a;
                rVar15.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= mVar25.B(rVar15) ? 4 : 2;
                }
                if (mVar25.n(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    x1 x1Var25 = n.f135158a;
                    int i45 = (iIntValue21 << 3) & 112;
                    rVar15.D(R.string.climb_categories_section_title, mVar25, i45);
                    int i46 = (iIntValue21 << 6) & 896;
                    rVar15.l(R.string.climb_categories_section_intro1, i46, 2, null, mVar25);
                    rVar15.m(i46, 0, y.Q(mVar25, R.string.climb_categories_section_intro2), y.Q(mVar25, R.string.climb_categories_section_intro2_description), mVar25);
                    rVar15.o(R.string.climb_categories_section_paragraph1, i46, 2, null, mVar25);
                    rVar15.t(R.string.lbl_easy_uncategorized, mVar25, i45);
                    rVar15.o(R.string.climb_categories_section_paragraph2, i46, 2, null, mVar25);
                    rVar15.s(i46, 2, y.P(R.string.lbl_category_number, new Object[]{"4"}, mVar25), null, mVar25);
                    rVar15.o(R.string.climb_categories_section_paragraph3, i46, 2, null, mVar25);
                    rVar15.s(i46, 2, y.P(R.string.lbl_category_number, new Object[]{"3"}, mVar25), null, mVar25);
                    rVar15.o(R.string.climb_categories_section_paragraph4, i46, 2, null, mVar25);
                    rVar15.s(i46, 2, y.P(R.string.lbl_category_number, new Object[]{"2"}, mVar25), null, mVar25);
                    rVar15.o(R.string.climb_categories_section_paragraph5, i46, 2, null, mVar25);
                    rVar15.s(i46, 2, y.P(R.string.lbl_category_number, new Object[]{IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE}, mVar25), null, mVar25);
                    rVar15.o(R.string.climb_categories_section_paragraph6, i46, 2, null, mVar25);
                    rVar15.t(R.string.lbl_horse_cat, mVar25, i45);
                    rVar15.o(R.string.climb_categories_section_paragraph7, i46, 2, null, mVar25);
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 25:
                r rVar16 = (r) obj;
                p3.m mVar26 = (p3.m) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                w30.a aVar18 = w30.a.f181821a;
                rVar16.getClass();
                if ((iIntValue22 & 6) == 0) {
                    iIntValue22 |= mVar26.B(rVar16) ? 4 : 2;
                }
                if (mVar26.n(iIntValue22 & 1, (iIntValue22 & 19) != 18)) {
                    x1 x1Var26 = n.f135158a;
                    rVar16.D(R.string.customize_your_map, mVar26, (iIntValue22 << 3) & 112);
                    int i47 = (iIntValue22 << 6) & 896;
                    rVar16.l(R.string.create_courses_with_climbs_section_paragraph1, i47, 2, null, mVar26);
                    rVar16.o(R.string.create_courses_with_climbs_section_paragraph2, i47, 2, null, mVar26);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 26:
                return a(obj, obj2, obj3);
            case 27:
                p3.m mVar27 = (p3.m) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                w51.b bVar2 = w51.b.f182219a;
                ((c1) obj).getClass();
                if (mVar27.n(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    x1 x1Var27 = n.f135158a;
                    h4.r.a aVar19 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarA3 = c2.l.A(aVar19, eVar2.f97918c, 0.0f, 2);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar3, mVar27, 48);
                    int iHashCode = Long.hashCode(mVar27.getU());
                    i2 i2VarX = mVar27.x();
                    h4.r rVarC = h4.k.c(rVarA3, mVar27);
                    h5.g.V.getClass();
                    e0.a aVar20 = h5.g.a.f81805b;
                    if (mVar27.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar27.z();
                    if (mVar27.getT()) {
                        mVar27.M(aVar20);
                    } else {
                        mVar27.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar27);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar27);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar27.getT() || !s.g(mVar27.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar27, iHashCode, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar27);
                    u2 u2Var = u2.f22900a;
                    h4.r rVarB = l4.k.b(x2.q(c2.l.A(aVar19, 0.0f, 0.0f, 3), j92.b.f97901d.f97903b), k2.i.f102406a);
                    o4.w.a aVar21 = o4.w.f129023a;
                    gl.c.f77766a.getClass();
                    gl.e eVar3 = gl.c.f77767b;
                    c2.q.a(u1.n.d(rVarB, o4.w.a.i(aVar21, x.k(d0.a(eVar3.f77770a0), d0.a(eVar3.L), d0.a(eVar3.f77813w), d0.a(eVar3.f77799p), d0.a(eVar3.f77803r), d0.a(n5.a.a(mVar27, R.color.heart_rate_line_gradient0))), 0.0f, 14), null, 6), mVar27, 0);
                    String strQ2 = y.Q(mVar27, R.string.lbl_heart_rate_cap);
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, c2.l.C(aVar19, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, mVar27), mVar27, 0, 0, 131068);
                    mVar27.y();
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            case 28:
                jf.w wVar = (jf.w) obj;
                p3.m mVar28 = (p3.m) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                w52.j jVar = w52.j.f182550a;
                wVar.getClass();
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= mVar28.B(wVar) ? 4 : 2;
                }
                if (mVar28.n(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    x1 x1Var28 = n.f135158a;
                    if (((jf.d.c) p0.c(wVar.b().f98632q, mVar28, 0).getF182175a()) instanceof jf.d.c.C1894d) {
                        mVar28.C(-1549668134);
                        v.b(wVar, null, null, null, null, null, 0.0f, null, false, mVar28, iIntValue24 & 14);
                        mVar28.f();
                    } else {
                        mVar28.C(-1549586449);
                        mVar28.f();
                    }
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar29 = (p3.m) obj2;
                v.h.y(663698040, (h4.r) obj, (Integer) obj3, mVar29);
                x1 x1Var29 = n.f135158a;
                long jA = n5.a.a(mVar29, R.color.gcm3_workout_repeat_border);
                h4.r.a aVar22 = h4.r.S;
                boolean zL3 = mVar29.l(jA);
                Object objQ3 = mVar29.q();
                if (zL3) {
                    objQ3 = new j82.d(jA, 25);
                    mVar29.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new j82.d(jA, 25);
                        mVar29.K(objQ3);
                    }
                }
                h4.r rVarD3 = l4.k.d(aVar22, (e23.l) objQ3);
                mVar29.f();
                return rVarD3;
        }
    }

    public /* synthetic */ e(int i14) {
        this.f169796a = i14;
    }
}
