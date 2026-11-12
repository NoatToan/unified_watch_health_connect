package w52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.d2;
import c2.h2;
import c2.t2;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import i3.ve;
import kotlin.k2;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182728a;

    public /* synthetic */ s(int i14) {
        this.f182728a = i14;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        xn.b bVar = xn.b.f191588a;
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            d2 d2Var = d2.f16532a;
            String strQ = gl1.y.Q(mVar, R.string.lbl_activites);
            d2Var.getClass();
            h4.r rVarA = t2Var.a(d2.h(), 0.4f, true);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81536n;
            int i14 = (iIntValue & 14) | 24576;
            d2Var.c(t2Var, strQ, null, rVarA, aVar, 0, 0, mVar, i14, 50);
            d2Var.c(t2Var, gl1.y.Q(mVar, R.string.lbl_resting_heart_rate), null, t2Var.a(d2.h(), 0.2f, true), aVar, 0, 0, mVar, i14, 50);
            d2Var.c(t2Var, gl1.y.Q(mVar, R.string.calories_active), null, t2Var.a(d2.h(), 0.2f, true), aVar, 0, 0, mVar, i14, 50);
            d2Var.c(t2Var, gl1.y.Q(mVar, R.string.lbl_total), null, t2Var.a(d2.h(), 0.2f, true), aVar, 0, 0, mVar, i14, 50);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:358:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:365:0x0b59  */
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
        int i14 = this.f182728a;
        int i15 = 9;
        int i16 = 5;
        int i17 = 16;
        p3.m.a aVar = p3.m.f135153a;
        int i18 = 18;
        int i19 = 19;
        boolean z14 = false;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                v.h.y(286100696, (h4.r) obj, (Integer) obj3, mVar);
                p3.x1 x1Var = p3.n.f135158a;
                long jA = n5.a.a(mVar, R.color.gcm3_workout_repeat_border);
                h4.r.a aVar2 = h4.r.S;
                boolean zL = mVar.l(jA);
                Object objQ = mVar.q();
                if (zL) {
                    objQ = new j82.d(jA, 26);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new j82.d(jA, 26);
                        mVar.K(objQ);
                    }
                }
                h4.r rVarD = l4.k.d(aVar2, (e23.l) objQ);
                mVar.f();
                return rVarD;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                v.h.y(-767256130, (h4.r) obj, (Integer) obj3, mVar2);
                p3.x1 x1Var2 = p3.n.f135158a;
                long jA2 = n5.a.a(mVar2, R.color.gcm3_workout_repeat_border);
                h4.r.a aVar3 = h4.r.S;
                boolean zL2 = mVar2.l(jA2);
                Object objQ2 = mVar2.q();
                if (zL2) {
                    objQ2 = new j82.d(jA2, 27);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new j82.d(jA2, 27);
                        mVar2.K(objQ2);
                    }
                }
                h4.r rVarD2 = l4.k.d(aVar3, (e23.l) objQ2);
                mVar2.f();
                return rVarD2;
            case 2:
                h4.r rVar = (h4.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                v.h.y(447006922, rVar, (Integer) obj3, mVar3);
                p3.x1 x1Var3 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(rVar, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                mVar3.f();
                return rVarC;
            case 3:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                v.h.y(-1141442905, rVar2, (Integer) obj3, mVar4);
                p3.x1 x1Var4 = p3.n.f135158a;
                h4.r rVarC2 = o4.s0.c(rVar2, 0.96f, 0.96f, 0.8f, 0.0f, null, 0, 524280);
                mVar4.f();
                return rVarC2;
            case 4:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                v.h.y(732940394, rVar3, (Integer) obj3, mVar5);
                p3.x1 x1Var5 = p3.n.f135158a;
                h4.r rVarA = h4.k.a(rVar3, k2.f91249a, new s(i16));
                mVar5.f();
                return rVarA;
            case 5:
                h4.r rVar4 = (h4.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                v.h.y(54146647, rVar4, (Integer) obj3, mVar6);
                p3.x1 x1Var6 = p3.n.f135158a;
                m4.q qVar = (m4.q) mVar6.A(kotlin.t1.f91491i);
                Object objQ3 = mVar6.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = p3.p0.n(Boolean.FALSE);
                    mVar6.K(objQ3);
                }
                p3.p1 p1Var = (p3.p1) objQ3;
                androidx.lifecycle.b0.a aVar4 = androidx.lifecycle.b0.a.ON_STOP;
                boolean zR = mVar6.r(qVar);
                Object objQ4 = mVar6.q();
                if (zR || objQ4 == c2565a) {
                    objQ4 = new vv0.n(15, qVar, p1Var);
                    mVar6.K(objQ4);
                }
                s9.e.a(aVar4, null, (e23.a) objQ4, mVar6, 6);
                Object objQ5 = mVar6.q();
                if (objQ5 == c2565a) {
                    objQ5 = new vd0.d(p1Var, i19);
                    mVar6.K(objQ5);
                }
                h4.r rVarC3 = m4.e.c(rVar4, (e23.l) objQ5);
                mVar6.f();
                return rVarC3;
            case 6:
                h82.r rVar5 = (h82.r) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                w61.a aVar5 = w61.a.f183133a;
                rVar5.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar7.B(rVar5) ? 4 : 2;
                }
                if (mVar7.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    rVar5.D(R.string.lbl_receiving_a_reading, mVar7, (iIntValue << 3) & 112);
                    c22.x0.f23314a.getClass();
                    rVar5.m((iIntValue << 6) & 896, 2, gl1.d.W(c22.x0.f23692wb), null, mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                h82.r rVar6 = (h82.r) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                w61.a aVar6 = w61.a.f183133a;
                rVar6.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar8.B(rVar6) ? 4 : 2;
                }
                if (mVar8.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    int i24 = (iIntValue2 << 3) & 112;
                    rVar6.D(R.string.primary_training_device, mVar8, i24);
                    rVar6.l(R.string.primary_training_help_description, (iIntValue2 << 6) & 896, 2, null, mVar8);
                    int i25 = i24 | 6;
                    rVar6.j(z3.f.c(-31743169, new vu0.h(rVar6, i19), mVar8), mVar8, i25);
                    rVar6.j(z3.f.c(341932982, new vu0.h(rVar6, 20), mVar8), mVar8, i25);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                h82.r rVar7 = (h82.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                w61.a aVar7 = w61.a.f183133a;
                rVar7.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar9.B(rVar7) ? 4 : 2;
                }
                if (mVar9.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    int i26 = (iIntValue3 << 3) & 112;
                    rVar7.D(R.string.gcm_training_status_load_focus_header_1, mVar9, i26);
                    rVar7.o(R.string.gcm_training_status_load_focus_description_1, (iIntValue3 << 6) & 896, 2, null, mVar9);
                    rVar7.j(z3.f.c(-2147280545, new vu0.h(rVar7, i18), mVar9), mVar9, i26 | 6);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                h82.r rVar8 = (h82.r) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                w61.a aVar8 = w61.a.f183133a;
                rVar8.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar10.B(rVar8) ? 4 : 2;
                }
                if (mVar10.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    int i27 = (iIntValue4 << 3) & 112;
                    rVar8.D(R.string.gcm_training_status_heat_acclimation_header, mVar10, i27);
                    String strQ = gl1.y.Q(mVar10, R.string.gcm_training_status_heat_acclimation_description_1);
                    Object objQ6 = mVar10.q();
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        obj4 = objQ6;
                        Object dVar = new w40.d(9);
                        mVar10.K(dVar);
                        obj4 = dVar;
                    }
                    obj4 = objQ6;
                    int i28 = (iIntValue4 << 6) & 896;
                    rVar8.m(i28, 0, strQ, oi0.c.B(strQ, (e23.l) obj4, mVar10), mVar10);
                    int i29 = i27 | 6;
                    rVar8.j(z3.f.c(380799425, new vu0.h(rVar8, i17), mVar10), mVar10, i29);
                    rVar8.j(z3.f.c(1285339242, new vu0.h(rVar8, 17), mVar10), mVar10, i29);
                    rVar8.o(R.string.gcm_training_status_heat_acclimation_description_4, i28, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                h82.r rVar9 = (h82.r) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                w61.a aVar9 = w61.a.f183133a;
                rVar9.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar11.B(rVar9) ? 4 : 2;
                }
                if (mVar11.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                    boolean zC1 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).C1();
                    String strI = hb.a.i(gl1.y.Q(mVar11, (zY || zC1) ? R.string.common_meters_string : R.string.common_feet_string));
                    l3.f23124b.getClass();
                    String str = l3.f23131i.format((zY || zC1) ? 800L : 2625L);
                    String str2 = l3.f23131i.format((zY || zC1) ? 4000L : 13000L);
                    int i30 = (iIntValue5 << 3) & 112;
                    rVar9.D(R.string.gcm_training_status_altitude_acclimation_header_1, mVar11, i30);
                    rVar9.m((iIntValue5 << 6) & 896, 2, gl1.y.P(R.string.gcm_training_status_altitude_acclimation_description_1, new Object[]{strI}, mVar11), null, mVar11);
                    int i34 = i30 | 6;
                    rVar9.j(z3.f.c(110311539, new vx1.b(rVar9, 13, str, strI), mVar11), mVar11, i34);
                    rVar9.j(z3.f.c(-922490212, new vu0.h(rVar9, 24), mVar11), mVar11, i34);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    rVar9.q(gl1.y.P(R.string.gcm_training_status_altitude_acclimation_description_4, new Object[]{am.j.o(StringUtils.SPACE, strI, sb3)}, mVar11), mVar11, i30);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                h82.r rVar10 = (h82.r) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                w61.a aVar10 = w61.a.f183133a;
                rVar10.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar12.B(rVar10) ? 4 : 2;
                }
                if (mVar12.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    int i35 = (iIntValue6 << 3) & 112;
                    rVar10.D(R.string.gcm_training_status_training_load_header_1, mVar12, i35);
                    int i36 = (iIntValue6 << 6) & 896;
                    rVar10.l(R.string.training_load_help, i36, 2, null, mVar12);
                    rVar10.j(z3.f.c(1929077457, new vu0.h(rVar10, 23), mVar12), mVar12, i35 | 6);
                    rVar10.o(R.string.gcm_training_status_training_load_description_3, i36, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                h82.r rVar11 = (h82.r) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                w61.a aVar11 = w61.a.f183133a;
                rVar11.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar13.B(rVar11) ? 4 : 2;
                }
                if (mVar13.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    int i37 = (iIntValue7 << 3) & 112;
                    rVar11.D(R.string.gcm_training_status_measure_your_effort, mVar13, i37);
                    rVar11.l(R.string.lbl_training_load_description, (iIntValue7 << 6) & 896, 2, null, mVar13);
                    rVar11.j(z3.f.c(119888401, new vu0.h(rVar11, 25), mVar13), mVar13, i37 | 6);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                h82.r rVar12 = (h82.r) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                w61.a aVar12 = w61.a.f183133a;
                rVar12.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar14.B(rVar12) ? 4 : 2;
                }
                if (mVar14.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    p3.x1 x1Var14 = p3.n.f135158a;
                    int i38 = (iIntValue8 << 3) & 112;
                    rVar12.D(R.string.gcm_training_status_measure_your_effort, mVar14, i38);
                    rVar12.l(R.string.lbl_training_load_description, (iIntValue8 << 6) & 896, 2, null, mVar14);
                    int i39 = i38 | 6;
                    rVar12.j(z3.f.c(317970611, new vu0.h(rVar12, 21), mVar14), mVar14, i39);
                    rVar12.j(z3.f.c(838843754, new vu0.h(rVar12, 22), mVar14), mVar14, i39);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                wa0.a aVar13 = wa0.a.f183760a;
                ((c2.a0) obj).getClass();
                if (mVar15.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    p3.x1 x1Var15 = p3.n.f135158a;
                    h4.r.a aVar14 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar14, j92.b.f97899b.f97918c), mVar15);
                    String strQ2 = gl1.y.Q(mVar15, R.string.lbl_inreach_purchase_complete_description);
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar15), mVar15, 0, 0, 131070);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                h82.r rVar13 = (h82.r) obj;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                wd0.b bVar = wd0.b.f184359a;
                rVar13.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar16.B(rVar13) ? 4 : 2;
                }
                if (mVar16.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    p3.x1 x1Var16 = p3.n.f135158a;
                    int i44 = ((iIntValue10 << 3) & 112) | 6;
                    rVar13.k(z3.f.c(-421445574, new vu0.h(rVar13, 29), mVar16), mVar16, i44);
                    rVar13.j(z3.f.c(-1331254418, new wd0.a(rVar13, z14 ? 1 : 0), mVar16), mVar16, i44);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj3).intValue();
                wg2.a aVar15 = wg2.a.f185137a;
                ((r1.e0) obj).getClass();
                p3.x1 x1Var17 = p3.n.f135158a;
                wg2.d.e((p3.m) obj2, 0);
                return Unit.INSTANCE;
            case 17:
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                wu0.a aVar16 = wu0.a.f187235a;
                ((t2) obj).getClass();
                if (mVar17.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    p3.x1 x1Var18 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar17, R.string.lbl_dialog_view_privacy);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarA = s5.x0.a(j92.f.f97932i, ds.e0.e(mVar17), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    mh.c(strQ3, x2.f(h4.r.S, 1.0f), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar17, 48, 0, 130044);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 18:
                boolean z15 = false;
                h2 h2Var = (h2) obj;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                wu0.a aVar17 = wu0.a.f187235a;
                h2Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar18.B(h2Var) ? 4 : 2;
                }
                if ((iIntValue12 & 19) != 18) {
                    z15 = true;
                }
                if (mVar18.n(iIntValue12 & 1, z15)) {
                    p3.x1 x1Var19 = p3.n.f135158a;
                    ve.a(c2.l.x(h4.r.S, h2Var), null, vb.h.e(d92.b.f58623a, mVar18), 0L, 0.0f, 0.0f, null, wu0.a.f187238d, mVar18, 12582912, 122);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 19:
                h4.r rVar14 = (h4.r) obj;
                p3.m mVar19 = (p3.m) obj2;
                v.h.y(932960223, rVar14, (Integer) obj3, mVar19);
                p3.x1 x1Var20 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA2 = c2.l.A(rVar14, 0.0f, j92.b.f97899b.f97918c, 1);
                mVar19.f();
                return rVarA2;
            case 20:
                x1.e eVar = (x1.e) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                x1.a aVar18 = x1.a.f188327a;
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar20.B(eVar) ? 4 : 2;
                }
                if (mVar20.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    p3.x1 x1Var21 = p3.n.f135158a;
                    h4.r.a aVar19 = h4.r.S;
                    x1.j.f188348a.getClass();
                    c2.q.a(u1.n.e(x2.h(x2.f(c2.l.A(aVar19, 0.0f, x1.j.f188360m, 1), 1.0f), x1.j.f188359l), eVar.f188339c, o4.m1.f128891a), mVar20, 0);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                x91.k kVar = x91.k.f189620a;
                ((e2.d) obj).getClass();
                if (mVar21.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    p3.x1 x1Var22 = p3.n.f135158a;
                    h4.r.a aVar20 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarC4 = c2.l.C(c2.l.A(aVar20, eVar2.f97920e, 0.0f, 2), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    String strQ4 = gl1.y.Q(mVar21, R.string.lbl_new_personal_record);
                    z5.b.f202439b.getClass();
                    String strB = s5.l0.b(strQ4, z5.b.a.a());
                    d92.b.f58624b.getClass();
                    mh.c(strB, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar21), mVar21, 0, 0, 131068);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 22:
                h82.r rVar15 = (h82.r) obj;
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                xa1.a aVar21 = xa1.a.f189726a;
                rVar15.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar22.B(rVar15) ? 4 : 2;
                }
                if (mVar22.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    p3.x1 x1Var23 = p3.n.f135158a;
                    rVar15.D(R.string.about_effort_level_help_section_title, mVar22, (iIntValue15 << 3) & 112);
                    int i45 = (iIntValue15 << 6) & 896;
                    rVar15.l(R.string.about_effort_level_help_intro, i45, 2, null, mVar22);
                    rVar15.o(R.string.about_effort_level_help_paragraph, i45, 2, null, mVar22);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 23:
                h82.r rVar16 = (h82.r) obj;
                p3.m mVar23 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                xc1.a aVar22 = xc1.a.f189964a;
                rVar16.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= mVar23.B(rVar16) ? 4 : 2;
                }
                if (mVar23.n(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    p3.x1 x1Var24 = p3.n.f135158a;
                    e23.p<? super p3.m, ? super Integer, Unit> pVarC = z3.f.c(1413955038, new wd0.a(rVar16, i16), mVar23);
                    int i46 = (iIntValue16 << 3) & 112;
                    rVar16.k(pVarC, mVar23, i46 | 6);
                    rVar16.t(R.string.proj_rtp_help_first_paragraph_title, mVar23, i46);
                    int i47 = (iIntValue16 << 6) & 896;
                    rVar16.o(R.string.proj_rtp_help_first_paragraph_body, i47, 2, null, mVar23);
                    rVar16.t(R.string.proj_rtp_help_second_paragraph_title, mVar23, i46);
                    rVar16.o(R.string.proj_rtp_help_second_paragraph_body_v2, i47, 2, null, mVar23);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj3).intValue();
                xg2.b bVar2 = xg2.b.f190933a;
                ((r1.e0) obj).getClass();
                p3.x1 x1Var25 = p3.n.f135158a;
                l72.f0.f110999a.g(0, 3, 0L, null, (p3.m) obj2);
                return Unit.INSTANCE;
            case 25:
                h82.r rVar17 = (h82.r) obj;
                p3.m mVar24 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                xh1.a aVar23 = xh1.a.f191041a;
                rVar17.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= mVar24.B(rVar17) ? 4 : 2;
                }
                if (mVar24.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    p3.x1 x1Var26 = p3.n.f135158a;
                    int i48 = (iIntValue17 << 3) & 112;
                    rVar17.D(R.string.lbl_swimming_aerobic_threshold, mVar24, i48);
                    int i49 = (iIntValue17 << 6) & 896;
                    rVar17.l(R.string.msg_css_representation, i49, 2, null, mVar24);
                    rVar17.t(R.string.lbl_pace_per_100_m, mVar24, i48);
                    rVar17.o(R.string.msg_css_pace_description, i49, 2, null, mVar24);
                    rVar17.t(R.string.lbl_train_with_css, mVar24, i48);
                    rVar17.o(R.string.msg_css_training_recommandation, i49, 2, null, mVar24);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 26:
                h82.r rVar18 = (h82.r) obj;
                p3.m mVar25 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                xh1.a aVar24 = xh1.a.f191041a;
                rVar18.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= mVar25.B(rVar18) ? 4 : 2;
                }
                if (mVar25.n(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    p3.x1 x1Var27 = p3.n.f135158a;
                    rVar18.D(R.string.lbl_doing_css_test, mVar25, (iIntValue18 << 3) & 112);
                    String strQ5 = gl1.y.Q(mVar25, R.string.msg_determine_css);
                    Context context = (Context) mVar25.A(AndroidCompositionLocals_androidKt.f6042b);
                    Object objQ7 = mVar25.q();
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        obj5 = objQ7;
                        Object m0Var = new xd2.m0(5);
                        mVar25.K(m0Var);
                        obj5 = m0Var;
                    }
                    obj5 = objQ7;
                    int i54 = (iIntValue18 << 6) & 896;
                    rVar18.m(i54, 0, strQ5, oi0.c.A(context, (e23.l) obj5, strQ5), mVar25);
                    rVar18.o(R.string.msg_where_to_find_css, i54, 2, null, mVar25);
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 27:
                h82.r rVar19 = (h82.r) obj;
                p3.m mVar26 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                xk1.a aVar25 = xk1.a.f191211a;
                rVar19.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= mVar26.B(rVar19) ? 4 : 2;
                }
                if (mVar26.n(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    p3.x1 x1Var28 = p3.n.f135158a;
                    int i55 = (iIntValue19 << 3) & 112;
                    rVar19.D(R.string.hr_zones_help_understand_hr_zones, mVar26, i55);
                    int i56 = (iIntValue19 << 6) & 896;
                    rVar19.l(R.string.hr_zones_help_understand_hr_zones_descr, i56, 2, null, mVar26);
                    rVar19.o(R.string.hr_zones_help_zones_descr, i56, 2, null, mVar26);
                    int i57 = i55 | 6;
                    rVar19.j(z3.f.c(1841726654, new wd0.a(rVar19, 7), mVar26), mVar26, i57);
                    rVar19.j(z3.f.c(-1054779481, new wd0.a(rVar19, 8), mVar26), mVar26, i57);
                    rVar19.j(z3.f.c(1583079558, new wd0.a(rVar19, i15), mVar26), mVar26, i57);
                    rVar19.j(z3.f.c(-74028699, new wd0.a(rVar19, 10), mVar26), mVar26, i57);
                    rVar19.j(z3.f.c(-1731136956, new wd0.a(rVar19, 11), mVar26), mVar26, i57);
                    rVar19.j(z3.f.c(906722083, new wd0.a(rVar19, 12), mVar26), mVar26, i57);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 28:
                return a(obj, obj2, obj3);
            default:
                t2 t2Var = (t2) obj;
                p3.m mVar27 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                xn.b bVar3 = xn.b.f191588a;
                t2Var.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= mVar27.B(t2Var) ? 4 : 2;
                }
                if (mVar27.n(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    p3.x1 x1Var29 = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    String strQ6 = gl1.y.Q(mVar27, R.string.lbl_running);
                    d2Var.getClass();
                    h4.r rVarA3 = t2Var.a(d2.i(), 0.4f, true);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar26 = h4.d.a.f81536n;
                    int i58 = iIntValue20 & 14;
                    d2Var.f(t2Var, strQ6, rVarA3, aVar26, 0, 0, mVar27, i58 | 3072, 24);
                    int i59 = i58 | 3120;
                    d2Var.f(t2Var, "110", t2Var.a(d2.i(), 0.2f, true), aVar26, 0, 0, mVar27, i59, 24);
                    d2Var.f(t2Var, "300", t2Var.a(d2.i(), 0.2f, true), aVar26, 0, 0, mVar27, i59, 24);
                    d2Var.f(t2Var, "410", t2Var.a(d2.i(), 0.2f, true), aVar26, 0, 0, mVar27, i59, 24);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
        }
    }
}
