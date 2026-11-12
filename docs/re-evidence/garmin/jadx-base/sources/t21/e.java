package t21;

import b82.d2;
import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.v1;
import i3.i7;
import i3.mh;
import kotlin.t1;
import l72.p2;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import u1.y1;
import v62.s9;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161856a;

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
        int i14 = 6;
        int i15 = 0;
        int i16 = 1;
        switch (this.f161856a) {
            case 0:
                ((Integer) obj3).getClass();
                g gVar = g.f161870a;
                ((r1.e0) obj).getClass();
                x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97904c);
                s62.a.f157643a.getClass();
                u1.y0.b(s9.a(t62.b.f162798a), null, rVarQ, null, (p3.m) obj2, 48, 120);
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                h hVar = h.f161878a;
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    c22.x0.f23314a.getClass();
                    String strV = gl1.d.V(c22.x0.Qf, new Object[]{2, 3});
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    mh.c(strV, c2.l.A(c2.l.C(aVar2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), eVar.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                l01.d dVar = (l01.d) obj;
                p3.m mVar2 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                dVar.getClass();
                mVar2.C(-176979385);
                x1 x1Var3 = p3.n.f135158a;
                String strH = dVar.f107845b;
                if (strH == null) {
                    strH = sn.a.h(mVar2, 1721504071, R.string.unknown, mVar2);
                } else {
                    mVar2.C(1721503730);
                    mVar2.f();
                }
                mVar2.f();
                return strH;
            case 3:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t42.a aVar3 = t42.a.f162324a;
                ((t2) obj).getClass();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                h82.r rVar = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t61.a aVar4 = t61.a.f162731a;
                rVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    rVar.D(R.string.gcm_help_hrv_stress_section1_title, mVar4, (iIntValue3 << 3) & 112);
                    rVar.o(R.string.gcm_help_hrv_stress_section1_description, (iIntValue3 << 6) & 896, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t61.a aVar5 = t61.a.f162731a;
                rVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar5.B(rVar2) ? 4 : 2;
                }
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    rVar2.D(R.string.lbl_receiving_a_reading, mVar5, (iIntValue4 << 3) & 112);
                    int i17 = (iIntValue4 << 6) & 896;
                    rVar2.o(R.string.gcm_help_hrv_stress_section3_description, i17, 2, null, mVar5);
                    rVar2.o(R.string.gcm_help_hrv_stress_section3_description2, i17, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                t2 t2Var = (t2) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i18 = t61.e.f162741f;
                t2Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar6.B(t2Var) ? 4 : 2;
                }
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var7 = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    String strQ = gl1.y.Q(mVar6, R.string.lbl_hrv_stress);
                    d2Var.getClass();
                    int i19 = iIntValue5 & 14;
                    d2Var.c(t2Var, strQ, null, t2Var.a(d2.h(), 0.635f, true), null, 0, 0, mVar6, i19, 58);
                    d2Var.c(t2Var, gl1.y.Q(mVar6, R.string.lbl_score), null, t2Var.a(d2.h(), 0.365f, true), null, 0, 0, mVar6, i19, 58);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                h82.r rVar3 = (h82.r) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i24 = t61.e.f162741f;
                rVar3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar7.B(rVar3) ? 4 : 2;
                }
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var8 = p3.n.f135158a;
                    rVar3.D(R.string.gcm_help_hrv_stress_section2_title, mVar7, (iIntValue6 << 3) & 112);
                    int i25 = (iIntValue6 << 6) & 896;
                    rVar3.o(R.string.gcm_help_hrv_stress_section2_description1, i25, 2, null, mVar7);
                    rVar3.o(R.string.gcm_help_hrv_stress_section2_description2, i25, 2, null, mVar7);
                    rVar3.c(mVar7, iIntValue6 & 14);
                    d2.f16532a.d(null, z3.f.c(1157787786, new e(i14), mVar7), mVar7, 48, 1);
                    for (Object obj4 : p13.x.k(new o13.p(Integer.valueOf(R.string.hrv_stress_level_low), Integer.valueOf(R.string.stress_level_interval_low)), new o13.p(Integer.valueOf(R.string.hrv_stress_level_moderate), Integer.valueOf(R.string.stress_level_interval_moderate)), new o13.p(Integer.valueOf(R.string.hrv_stress_level_high), Integer.valueOf(R.string.stress_level_interval_high)), new o13.p(Integer.valueOf(R.string.hrv_stress_level_very_high), Integer.valueOf(R.string.stress_level_interval_very_high)))) {
                        int i26 = i15 + 1;
                        if (i15 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        d2.f16532a.g(i26, 384, 2, null, mVar7, z3.f.c(-226770223, new at.d(i16, (o13.p) obj4), mVar7));
                        i15 = i26;
                    }
                    x1 x1Var9 = p3.n.f135158a;
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                t70.a aVar6 = t70.a.f162801a;
                ((e2.d) obj).getClass();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    String strP = gl1.y.P(R.string.msg_header_edit_essentials, new Object[]{4}, mVar8);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar8);
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58625c.getClass();
                    mh.c(strP, c2.l.y(aVar7, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar8, 0, 0, 131068);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                t70.b bVar = t70.b.f162807a;
                ((e2.d) obj).getClass();
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    String strP2 = gl1.y.P(R.string.lbl_header_home_items_primary_stats, new Object[]{6}, mVar9);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar9);
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58625c.getClass();
                    mh.c(strP2, c2.l.y(aVar8, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, mVar9, 0, 0, 131068);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 10:
                f2.t tVar = (f2.t) obj;
                ((Integer) obj2).getClass();
                t70.p0 p0Var = (t70.p0) obj3;
                tVar.getClass();
                p0Var.getClass();
                return f2.c.a(p0Var instanceof t70.p0.c ? dh.b.f(tVar.a()) : dh.b.f(1));
            case 11:
                h82.r rVar4 = (h82.r) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                t72.g gVar2 = t72.g.f163127a;
                rVar4.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar10.B(rVar4) ? 4 : 2;
                }
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    int i27 = (iIntValue9 << 3) & 112;
                    rVar4.D(R.string.main_help_action_2, mVar10, i27);
                    int i28 = (iIntValue9 << 6) & 896;
                    rVar4.l(R.string.main_help_intro, i28, 2, null, mVar10);
                    rVar4.o(R.string.lbl_english, i28, 2, null, mVar10);
                    rVar4.g(z3.f.c(-860784126, new t12.a(rVar4, 10), mVar10), mVar10, 6 | i27);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                h4.r rVar5 = (h4.r) obj;
                p3.m mVar11 = (p3.m) obj2;
                v.h.y(-1571438419, rVar5, (Integer) obj3, mVar11);
                x1 x1Var13 = p3.n.f135158a;
                g6.f.a aVar9 = g6.f.f75994b;
                h4.r rVarW = x2.w(x2.z(rVar5, null, 3), 187, 0.0f, 2);
                mVar11.f();
                return rVarW;
            case 13:
                h4.r rVar6 = (h4.r) obj;
                p3.m mVar12 = (p3.m) obj2;
                v.h.y(2066301460, rVar6, (Integer) obj3, mVar12);
                x1 x1Var14 = p3.n.f135158a;
                g6.f.a aVar10 = g6.f.f75994b;
                h4.r rVarW2 = x2.w(x2.z(rVar6, null, 3), 265, 0.0f, 2);
                mVar12.f();
                return rVarW2;
            case 14:
                h4.r rVar7 = (h4.r) obj;
                p3.m mVar13 = (p3.m) obj2;
                v.h.y(1044367483, rVar7, (Integer) obj3, mVar13);
                x1 x1Var15 = p3.n.f135158a;
                h4.r rVarF = x2.f(rVar7, 1.0f);
                mVar13.f();
                return rVarF;
            case 15:
                h4.r rVar8 = (h4.r) obj;
                p3.m mVar14 = (p3.m) obj2;
                v.h.y(124359937, rVar8, (Integer) obj3, mVar14);
                x1 x1Var16 = p3.n.f135158a;
                h4.r rVarZ = x2.z(rVar8, null, 1);
                mVar14.f();
                return rVarZ;
            case 16:
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                t91.a aVar11 = t91.a.f163199a;
                ((t2) obj).getClass();
                if (mVar15.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var17 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar15, R.string.lbl_done);
                    z5.b.f202439b.getClass();
                    String strB = s5.l0.b(strQ2, z5.b.a.a());
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strB, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97933j), mVar15), mVar15, 0, 0, 131070);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ta0.e eVar2 = ta0.e.f163272a;
                ((c2.a0) obj).getClass();
                if (mVar16.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var18 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar16, R.string.device_no_bluetooth);
                    h4.r.a aVar12 = h4.r.S;
                    h4.r rVarF2 = x2.f(aVar12, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarC = c2.l.C(rVarF2, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97931h;
                    mh.c(strQ3, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar16), mVar16, 0, 0, 131068);
                    mh.c(gl1.y.P(R.string.msg_visit_url_from_computer, new Object[]{"garmin.com/software/express"}, mVar16), c2.l.C(x2.f(aVar12, 1.0f), 0.0f, eVar3.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar16), mVar16, 0, 0, 131068);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ta0.i iVar = ta0.i.f163361a;
                ((c2.a0) obj).getClass();
                if (mVar17.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var19 = p3.n.f135158a;
                    t4.d dVarA = n5.c.a(2131233379, mVar17, 0);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (dVarA.getF162260d() >> 32)) / Float.intBitsToFloat((int) (dVarA.getF162260d() & 4294967295L));
                    String strQ4 = gl1.y.Q(mVar17, R.string.default_image_view_content_description);
                    h4.r.a aVar13 = h4.r.S;
                    u1.y0.a(dVarA, strQ4, c2.l.g(x2.f(aVar13, 1.0f), fIntBitsToFloat), null, null, 0.0f, null, mVar17, 0, 120);
                    String strG = g22.n.g(gl1.y.Q(mVar17, R.string.startup_get_more_garmin_connect));
                    h4.r rVarF3 = x2.f(aVar13, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    h4.r rVarC2 = c2.l.C(rVarF3, 0.0f, eVar4.f97922g, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB4 = d92.c.b(d92.c.e(j92.f.f97927d), mVar17);
                    d6.h.f57752b.getClass();
                    int i29 = d6.h.f57755e;
                    mh.c(strG, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i29), 0L, 0, false, 0, 0, null, x0VarB4, mVar17, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar17, R.string.msg_get_more_from_garmin), c2.l.C(x2.f(aVar13, 1.0f), 0.0f, eVar4.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i29), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar17), mVar17, 0, 0, 130044);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                tg1.g gVar3 = tg1.g.f164513a;
                ((t2) obj).getClass();
                if (mVar18.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var20 = p3.n.f135158a;
                    h4.r.a aVar14 = h4.r.S;
                    h4.r rVarD = x2.d(aVar14, 1.0f);
                    d92.b.f58623a.getClass();
                    h4.r rVarE = u1.n.e(rVarD, d92.b.a(mVar18).e().h(), m1.f128891a);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81529g, false);
                    int iHashCode = Long.hashCode(mVar18.getU());
                    i2 i2VarX = mVar18.x();
                    h4.r rVarC3 = h4.k.c(rVarE, mVar18);
                    h5.g.V.getClass();
                    h5.e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar18.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar18.z();
                    if (mVar18.getT()) {
                        mVar18.M(aVar15);
                    } else {
                        mVar18.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar18);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar18);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar18.getT() || !p005kotlin.jvm.internal.s.g(mVar18.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar18, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar18);
                    c2.u uVar = c2.u.f22885a;
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(aVar14, j92.b.f97899b.f97920e);
                    String strQ5 = gl1.y.Q(mVar18, R.string.lbl_delete);
                    d92.b.f58624b.getClass();
                    mh.c(strQ5, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar18), mVar18, 0, 0, 131068);
                    mVar18.y();
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                tg1.i iVar2 = tg1.i.f164519a;
                ((t2) obj).getClass();
                if (mVar19.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var21 = p3.n.f135158a;
                    String strQ6 = gl1.y.Q(mVar19, R.string.lbl_remove);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var2 = j92.f.f97931h;
                    d6.h.f57752b.getClass();
                    mh.c(strQ6, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var2, mVar19, 0, 0, 130046);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 21:
                h82.r rVar9 = (h82.r) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                tn.a aVar16 = tn.a.f165449a;
                rVar9.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar20.B(rVar9) ? 4 : 2;
                }
                if (mVar20.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var22 = p3.n.f135158a;
                    rVar9.D(R.string.lbl_health_snapshot_in_pdf, mVar20, (iIntValue15 << 3) & 112);
                    rVar9.c(mVar20, iIntValue15 & 14);
                    rVar9.o(R.string.msg_health_snapshot_in_pdf, (iIntValue15 << 6) & 896, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                tn.b bVar3 = tn.b.f165451a;
                ((e2.d) obj).getClass();
                if (mVar21.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var23 = p3.n.f135158a;
                    g6.f.a aVar17 = g6.f.f75994b;
                    c2.l.f(x2.q(h4.r.S, 24), mVar21);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                tn.b bVar4 = tn.b.f165451a;
                ((e2.d) obj).getClass();
                if (mVar22.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    x1 x1Var24 = p3.n.f135158a;
                    p2.f111205a.a(gl1.y.Q(mVar22, R.string.txt_loading), mVar22, 0);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 24:
                f5.b1 b1Var = (f5.b1) obj;
                f5.y0 y0Var = (f5.y0) obj2;
                b1Var.getClass();
                y0Var.getClass();
                v1 v1VarQ = y0Var.Q(((g6.a) obj3).f75988a);
                return f5.b1.h0(b1Var, v1VarQ.f69145b, v1VarQ.f69144a, new a03.k0(v1VarQ, 21));
            case 25:
                p3.m mVar23 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ty1.b bVar5 = ty1.b.f167071a;
                ((r1.e0) obj).getClass();
                x1 x1Var25 = p3.n.f135158a;
                float f75992b = ((g6.c) mVar23.A(t1.f91490h)).getF75992b();
                h4.r.a aVar18 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97901d.f97904c * f75992b;
                g6.f.a aVar19 = g6.f.f75994b;
                h4.r rVarQ2 = x2.q(aVar18, f14);
                s62.a.f157643a.getClass();
                i7.b(v62.e1.a(t62.b.f162798a), null, rVarQ2, androidx.room.a0.c(mVar23), mVar23, 48, 0);
                return Unit.INSTANCE;
            case 26:
                h4.r rVar10 = (h4.r) obj;
                p3.m mVar24 = (p3.m) obj2;
                v.h.y(-1828048121, rVar10, (Integer) obj3, mVar24);
                x1 x1Var26 = p3.n.f135158a;
                h4.r rVarD2 = x2.d(rVar10, 1.0f);
                mVar24.f();
                return rVarD2;
            case 27:
                h4.r rVar11 = (h4.r) obj;
                p3.m mVar25 = (p3.m) obj2;
                v.h.y(271653358, rVar11, (Integer) obj3, mVar25);
                x1 x1Var27 = p3.n.f135158a;
                g6.f.a aVar20 = g6.f.f75994b;
                h4.r rVarQ3 = x2.q(rVar11, 0);
                Object objQ = mVar25.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new y1(4);
                    mVar25.K(objQ);
                }
                h4.r rVarC4 = p5.v.c((e23.l) objQ, rVarQ3, false);
                mVar25.f();
                return rVarC4;
            case 28:
                p3.m mVar26 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ub0.c cVar = ub0.c.f169719a;
                ((c2.a0) obj).getClass();
                if (mVar26.n(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    x1 x1Var28 = p3.n.f135158a;
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            default:
                h4.r rVar12 = (h4.r) obj;
                p3.m mVar27 = (p3.m) obj2;
                v.h.y(-891709570, rVar12, (Integer) obj3, mVar27);
                x1 x1Var29 = p3.n.f135158a;
                h4.r rVarA = l4.k.a(rVar12, 0.5f);
                mVar27.f();
                return rVarA;
        }
    }

    public /* synthetic */ e(int i14) {
        this.f161856a = i14;
    }
}
