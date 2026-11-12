package s50;

import c2.a0;
import c2.t;
import c2.t2;
import c2.x2;
import c22.s3;
import c80.u;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.q;
import h4.r;
import i3.mh;
import j92.f;
import jk0.o;
import l4.k;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import p5.v;
import pk1.g;
import s5.e0;
import s70.y;
import sg0.w;
import sk0.h0;
import sk0.k0;
import sk0.p;
import sm1.j;
import t11.e;
import v.h;
import w52.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157340a;

    public /* synthetic */ b(int i14) {
        this.f157340a = i14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strL = null;
        int i14 = 29;
        int i15 = 3;
        int i16 = 2;
        int i17 = 4;
        boolean z14 = true;
        boolean z15 = false;
        switch (this.f157340a) {
            case 0:
                r rVar = (r) obj;
                m mVar = (m) obj2;
                h.y(-1049077704, rVar, (Integer) obj3, mVar);
                x1 x1Var = n.f135158a;
                Object objQ = mVar.q();
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e0(8);
                    mVar.K(objQ);
                }
                r rVarC = v.c((l) objQ, rVar, false);
                mVar.f();
                return rVarC;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y yVar = y.f157831a;
                ((t2) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_edit_home);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97931h, mVar2), mVar2, 0, 0, 131070);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                r rVar2 = (r) obj;
                m mVar3 = (m) obj2;
                h.y(1854348230, rVar2, (Integer) obj3, mVar3);
                x1 x1Var3 = n.f135158a;
                r rVarA = k.a(rVar2, 0.5f);
                mVar3.f();
                return rVarA;
            case 3:
                r rVar3 = (r) obj;
                m mVar4 = (m) obj2;
                h.y(-324864159, rVar3, (Integer) obj3, mVar4);
                x1 x1Var4 = n.f135158a;
                r rVarA2 = k.a(rVar3, 0.5f);
                mVar4.f();
                return rVarA2;
            case 4:
                r rVar4 = (r) obj;
                m mVar5 = (m) obj2;
                h.y(-1521002460, rVar4, (Integer) obj3, mVar5);
                x1 x1Var5 = n.f135158a;
                r rVarA3 = k.a(rVar4, 0.5f);
                mVar5.f();
                return rVarA3;
            case 5:
                m mVar6 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                sa0.c cVar = sa0.c.f158169a;
                ((a0) obj).getClass();
                if (mVar6.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar, j92.b.f97899b.f97922g), mVar6);
                    sa0.h.c(mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                h82.r rVar5 = (h82.r) obj;
                m mVar7 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                sf0.a aVar2 = sf0.a.f158821a;
                rVar5.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar7.B(rVar5) ? 4 : 2;
                }
                if (mVar7.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var7 = n.f135158a;
                    int i18 = (iIntValue3 << 3) & 112;
                    rVar5.D(R.string.epoch_help_reloading_charts_header, mVar7, i18);
                    int i19 = (iIntValue3 << 6) & 896;
                    rVar5.o(R.string.epoch_help_reloading_charts_text, i19, 2, null, mVar7);
                    rVar5.t(R.string.epoch_help_reload_limit_header, mVar7, i18);
                    rVar5.o(R.string.epoch_help_reload_limit_text, i19, 2, null, mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                h82.r rVar6 = (h82.r) obj;
                m mVar8 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                w wVar = w.f159176a;
                rVar6.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar8.B(rVar6) ? 4 : 2;
                }
                if (mVar8.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    rVar6.k(z3.f.c(1055310606, new g(rVar6, 28), mVar8), mVar8, ((iIntValue4 << 3) & 112) | 6);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                m mVar9 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                si1.b bVar = si1.b.f159364a;
                ((t) obj).getClass();
                if (mVar9.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var9 = n.f135158a;
                    si1.h.d(new ti1.b(0L, false, false, false, false, false, 63, null), mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                c80.w wVar2 = (c80.w) obj;
                m mVar10 = (m) obj2;
                ((Integer) obj3).getClass();
                wVar2.getClass();
                mVar10.C(2059130186);
                x1 x1Var10 = n.f135158a;
                String strQ2 = gl1.y.Q(mVar10, p.j(wVar2));
                mVar10.f();
                return strQ2;
            case 10:
                u uVar = (u) obj;
                m mVar11 = (m) obj2;
                ((Integer) obj3).intValue();
                uVar.getClass();
                mVar11.C(1165527712);
                x1 x1Var11 = n.f135158a;
                String strL2 = xy2.b.l(uVar, mVar11);
                mVar11.f();
                return strL2;
            case 11:
                h0 h0Var = h0.f159674a;
                ((u) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                h0 h0Var2 = h0.f159674a;
                ((u) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                m mVar12 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                k0 k0Var = k0.f159709a;
                ((t2) obj).getClass();
                if (mVar12.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var12 = n.f135158a;
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 14:
                u uVar2 = (u) obj;
                m mVar13 = (m) obj2;
                ((Integer) obj3).intValue();
                mVar13.C(-193317016);
                x1 x1Var13 = n.f135158a;
                if (uVar2 == null) {
                    mVar13.C(443992108);
                } else {
                    mVar13.C(-1094056331);
                    strL = xy2.b.l(uVar2, mVar13);
                }
                mVar13.f();
                if (strL == null) {
                    strL = sn.a.h(mVar13, -1094055761, R.string.all_gear_title, mVar13);
                } else {
                    mVar13.C(-1094056598);
                    mVar13.f();
                }
                mVar13.f();
                return strL;
            case 15:
                u uVar3 = (u) obj;
                m mVar14 = (m) obj2;
                ((Integer) obj3).intValue();
                mVar14.C(-1555564688);
                x1 x1Var14 = n.f135158a;
                if (uVar3 == null) {
                    mVar14.C(869575460);
                } else {
                    mVar14.C(-249043843);
                    strL = xy2.b.l(uVar3, mVar14);
                }
                mVar14.f();
                if (strL == null) {
                    strL = sn.a.h(mVar14, -249043273, R.string.all_gear_title, mVar14);
                } else {
                    mVar14.C(-249044110);
                    mVar14.f();
                }
                mVar14.f();
                return strL;
            case 16:
                o oVar = (o) obj;
                m mVar15 = (m) obj2;
                ((Integer) obj3).getClass();
                oVar.getClass();
                mVar15.C(848850628);
                x1 x1Var15 = n.f135158a;
                String strQ3 = gl1.y.Q(mVar15, oVar.f99307d);
                mVar15.f();
                return strQ3;
            case 17:
                h82.r rVar7 = (h82.r) obj;
                m mVar16 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                sm1.b bVar2 = sm1.b.f160103a;
                rVar7.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar16.B(rVar7) ? 4 : 2;
                }
                if (mVar16.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var16 = n.f135158a;
                    int i24 = (iIntValue7 << 6) & 896;
                    rVar7.E(gl1.y.Q(mVar16, R.string.lbl_staying_in_rhythm), mVar16, i24);
                    rVar7.m(i24, 2, gl1.y.Q(mVar16, R.string.msg_sleep_alignment_help_intro), null, mVar16);
                    int i25 = (iIntValue7 << 3) & 112;
                    rVar7.q(gl1.y.Q(mVar16, R.string.msg_sleep_alignment_help_paragraph_1), mVar16, i25);
                    rVar7.q(gl1.y.Q(mVar16, R.string.msg_sleep_alignment_help_paragraph_2), mVar16, i25);
                    int i26 = i25 | 6;
                    rVar7.j(z3.f.c(-726497597, new g(rVar7, i14), mVar16), mVar16, i26);
                    rVar7.j(z3.f.c(282722490, new sm1.a(rVar7, z15 ? 1 : 0), mVar16), mVar16, i26);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 18:
                m mVar17 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                sy.m mVar18 = sy.m.f161199a;
                if (mVar17.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var17 = n.f135158a;
                    u0.a(mVar17, 0);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 19:
                h82.r rVar8 = (h82.r) obj;
                m mVar19 = (m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                t11.a aVar3 = t11.a.f161712a;
                rVar8.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar19.B(rVar8) ? 4 : 2;
                }
                if (mVar19.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var18 = n.f135158a;
                    int i27 = (iIntValue9 << 6) & 896;
                    rVar8.E(gl1.y.Q(mVar19, R.string.auto_adjust_calorie_goal_settings), mVar19, i27);
                    rVar8.m(i27, 2, gl1.y.Q(mVar19, R.string.msg_auto_adjust_calorie_goal), null, mVar19);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 20:
                h82.r rVar9 = (h82.r) obj;
                m mVar20 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                t11.b bVar3 = t11.b.f161714a;
                rVar9.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar20.B(rVar9) ? 4 : 2;
                }
                if (mVar20.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var19 = n.f135158a;
                    int i28 = (iIntValue10 << 6) & 896;
                    rVar9.E(gl1.y.Q(mVar20, R.string.macronutrients), mVar20, i28);
                    rVar9.m(i28, 2, gl1.y.Q(mVar20, R.string.macronutrients_description), null, mVar20);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 21:
                h82.r rVar10 = (h82.r) obj;
                m mVar21 = (m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                t11.c cVar2 = t11.c.f161716a;
                rVar10.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar21.B(rVar10) ? 4 : 2;
                }
                if (mVar21.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var20 = n.f135158a;
                    int i29 = ((iIntValue11 << 3) & 112) | 6;
                    rVar10.k(z3.f.c(1367154599, new j(rVar10, 10), mVar21), mVar21, i29);
                    rVar10.j(z3.f.c(1259022067, new j(rVar10, 11), mVar21), mVar21, i29);
                    rVar10.j(z3.f.c(-421550166, new j(rVar10, 12), mVar21), mVar21, i29);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 22:
                m mVar22 = (m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                t11.d dVar = t11.d.f161718a;
                if (mVar22.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var21 = n.f135158a;
                    oe2.f.b(mVar22, 0);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 23:
                m mVar23 = (m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                t11.d dVar2 = t11.d.f161718a;
                if (mVar23.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var22 = n.f135158a;
                    oi0.c.c(mVar23, 0);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 24:
                m mVar24 = (m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                t11.d dVar3 = t11.d.f161718a;
                if (mVar24.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var23 = n.f135158a;
                    og.a.j(mVar24, 0);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 25:
                m mVar25 = (m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                t11.d dVar4 = t11.d.f161718a;
                if (mVar25.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var24 = n.f135158a;
                    og2.k.c(mVar25, 0);
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 26:
                m mVar26 = (m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                t11.d dVar5 = t11.d.f161718a;
                if (mVar26.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var25 = n.f135158a;
                    o72.t.d(mVar26, 0);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 27:
                m mVar27 = (m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                t11.d dVar6 = t11.d.f161718a;
                if (mVar27.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    x1 x1Var26 = n.f135158a;
                    oc.b.a(mVar27, 0);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            case 28:
                h82.r rVar11 = (h82.r) obj;
                m mVar28 = (m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                e eVar = e.f161725a;
                rVar11.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= mVar28.B(rVar11) ? 4 : 2;
                }
                if (mVar28.n(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    x1 x1Var27 = n.f135158a;
                    int i30 = ((iIntValue18 << 3) & 112) | 6;
                    rVar11.k(z3.f.c(8474663, new j(rVar11, 13), mVar28), mVar28, i30);
                    rVar11.j(z3.f.c(2032321907, new j(rVar11, 14), mVar28), mVar28, i30);
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
            default:
                h82.r rVar12 = (h82.r) obj;
                m mVar29 = (m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                t12.b bVar4 = t12.b.f161739a;
                rVar12.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= mVar29.B(rVar12) ? 4 : 2;
                }
                if (mVar29.n(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    x1 x1Var28 = n.f135158a;
                    int i34 = (iIntValue19 << 3) & 112;
                    rVar12.D(R.string.concept_profile_privacy, mVar29, i34);
                    rVar12.l(R.string.privacy_help_general_description, (iIntValue19 << 6) & 896, 2, null, mVar29);
                    int i35 = i34 | 6;
                    rVar12.j(z3.f.c(-1026676937, new j(rVar12, i14), mVar29), mVar29, i35);
                    rVar12.j(z3.f.c(-1767807762, new t12.a(rVar12, z15 ? 1 : 0), mVar29), mVar29, i35);
                    if (s3.b()) {
                        mVar29.C(1016047428);
                        mVar29.f();
                    } else {
                        mVar29.C(1015821593);
                        rVar12.j(z3.f.c(2040681746, new t12.a(rVar12, z14 ? 1 : 0), mVar29), mVar29, i35);
                        mVar29.f();
                    }
                    rVar12.j(z3.f.c(-214720401, new t12.a(rVar12, i16), mVar29), mVar29, i35);
                    if (s3.b()) {
                        mVar29.C(1016529540);
                        mVar29.f();
                    } else {
                        mVar29.C(1016331574);
                        rVar12.j(z3.f.c(-383678455, new t12.a(rVar12, i15), mVar29), mVar29, i35);
                        mVar29.f();
                    }
                    rVar12.j(z3.f.c(1338366960, new t12.a(rVar12, i17), mVar29), mVar29, i35);
                } else {
                    mVar29.e();
                }
                return Unit.INSTANCE;
        }
    }
}
