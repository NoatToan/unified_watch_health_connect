package c70;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import h82.r;
import java.util.Iterator;
import java.util.Map;
import o72.z0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.u0;
import p3.c2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import sg0.j;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f25217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f25218c;

    public /* synthetic */ b(r rVar, Context context, int i14) {
        this.f25216a = i14;
        this.f25217b = rVar;
        this.f25218c = context;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x044c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        int i14 = this.f25216a;
        int i15 = 19;
        m.a aVar = m.f135153a;
        Context context = this.f25218c;
        boolean z14 = false;
        final int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i17 = c.f25219f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVar = this.f25217b;
                    rVar.t(R.string.lbl_cycling_ability_help_header_3, mVar, 0);
                    String strQ = y.Q(mVar, R.string.lbl_cycling_ability_help_paragraph_3_1);
                    Object objQ = mVar.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new c63.n(19);
                        mVar.K(objQ);
                    }
                    rVar.p(strQ, oi0.c.A(context, (l) objQ, strQ), mVar, 0);
                    rVar.o(R.string.lbl_cycling_ability_help_paragraph_3_2, 0, 2, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i18 = ix.f.f95592j;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVar2 = this.f25217b;
                    rVar2.t(R.string.sleep_lbl_sleep, mVar2, 0);
                    rVar2.o(R.string.gcm_body_battery_help_your_chart_label_1, 0, 2, null, mVar2);
                    mVar2.C(1132112835);
                    String str = y.Q(mVar2, R.string.gcm_sleep_tracking_device_help) + " <link>" + y.Q(mVar2, R.string.android_notification_update_failure_thirdline_learn_more) + "</link>";
                    mVar2.f();
                    boolean zR = mVar2.r(context);
                    Object objQ2 = mVar2.q();
                    if (zR) {
                        objQ2 = new ho0.a(context, 9);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new ho0.a(context, 9);
                            mVar2.K(objQ2);
                        }
                    }
                    rVar2.w(str, null, (e23.a) objQ2, mVar2, 0, 2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = o81.a.f130834f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r rVar3 = this.f25217b;
                    rVar3.t(R.string.lbl_receiving_hill_score, mVar3, 0);
                    String strQ2 = y.Q(mVar3, R.string.msg_receive_hill_score_v2);
                    Object objQ3 = mVar3.q();
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new z0(19);
                        mVar3.K(objQ3);
                    }
                    rVar3.o(R.string.msg_receive_hill_score_v2, 0, 0, oi0.c.A(context, (l) objQ3, strQ2), mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i24 = o81.a.f130834f;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    String strQ3 = y.Q(mVar4, R.string.msg_hill_score_factor_hill_endurance);
                    h82.c.a aVar2 = h82.c.f82428d;
                    s5.c cVarJ = o81.a.j(strQ3, mVar4);
                    r rVar4 = this.f25217b;
                    rVar4.f(cVarJ, null, mVar4, 0, 2);
                    rVar4.f(o81.a.j(y.Q(mVar4, R.string.msg_hill_score_factor_hill_strength), mVar4), null, mVar4, 0, 2);
                    String strQ4 = y.Q(mVar4, R.string.msg_hill_score_factor_vo2_max_v2);
                    s5.c cVarJ2 = o81.a.j(strQ4, mVar4);
                    Object objQ4 = mVar4.q();
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new z0(20);
                        mVar4.K(objQ4);
                    }
                    rVar4.f(cVarJ2, oi0.c.A(context, (l) objQ4, strQ4), mVar4, 0, 0);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i25 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    final r rVar5 = this.f25217b;
                    rVar5.o(R.string.msg_your_sleep_score_categories, 0, 2, null, mVar5);
                    final Map mapE = u0.e(new o13.p(Integer.valueOf(R.string.lbl_sleep_score_range_excellent), com.garmin.android.apps.connectmobile.sleep.presentation.a.v(context, y.Q(mVar5, R.string.lbl_sleep_score_range_excellent))), new o13.p(Integer.valueOf(R.string.lbl_sleep_score_range_good), com.garmin.android.apps.connectmobile.sleep.presentation.a.v(context, y.Q(mVar5, R.string.lbl_sleep_score_range_good))), new o13.p(Integer.valueOf(R.string.lbl_sleep_score_range_fair), com.garmin.android.apps.connectmobile.sleep.presentation.a.v(context, y.Q(mVar5, R.string.lbl_sleep_score_range_fair))), new o13.p(Integer.valueOf(R.string.lbl_sleep_score_range_poor_2), y.Q(mVar5, R.string.lbl_sleep_score_range_poor)));
                    rVar5.g(z3.f.c(1421103400, new p() { // from class: sm1.f
                        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
                        @Override // e23.p
                        public final Object invoke(Object obj5, Object obj6) {
                            int i26 = i16;
                            ?? r14 = mapE;
                            switch (i26) {
                                case 0:
                                    p3.m mVar6 = (p3.m) obj5;
                                    int iIntValue6 = ((Integer) obj6).intValue();
                                    int i27 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                                    if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        x1 x1Var6 = p3.n.f135158a;
                                        Iterator it = r14.entrySet().iterator();
                                        while (it.hasNext()) {
                                            rVar5.d(((Number) ((Map.Entry) it.next()).getKey()).intValue(), 0, 2, null, mVar6);
                                        }
                                        x1 x1Var7 = p3.n.f135158a;
                                    } else {
                                        mVar6.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar7 = (p3.m) obj5;
                                    int iIntValue7 = ((Integer) obj6).intValue();
                                    int i28 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                                    if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                        x1 x1Var8 = p3.n.f135158a;
                                        Iterator it3 = r14.entrySet().iterator();
                                        while (it3.hasNext()) {
                                            rVar5.d(((Number) ((Map.Entry) it3.next()).getKey()).intValue(), 0, 2, null, mVar7);
                                        }
                                        x1 x1Var9 = p3.n.f135158a;
                                    } else {
                                        mVar7.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar5), mVar5, 6);
                    rVar5.o(R.string.msg_primary_factors_contributing_to_sleep_score, 0, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i26 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r rVar6 = this.f25217b;
                    rVar6.t(R.string.device_settings_pulse_ox, mVar6, 0);
                    rVar6.o(R.string.msg_pulse_ox_paragraph, 0, 2, null, mVar6);
                    pm1.f fVar = (pm1.f) KoinJavaComponent.get$default(pm1.f.class, null, null, 6, null);
                    Object objQ5 = mVar6.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ5 == c2565a) {
                        obj3 = objQ5;
                        c2 c2VarN = p0.n(null);
                        mVar6.K(c2VarN);
                        obj3 = c2VarN;
                    }
                    obj3 = objQ5;
                    p1 p1Var = (p1) obj3;
                    fVar.e(new com.garmin.android.apps.connectmobile.sleep.presentation.a.c(p1Var));
                    if (((hc1.b) p1Var.getF182175a()) != null) {
                        mVar6.C(871470472);
                        rVar6.c(mVar6, 0);
                        boolean zR2 = mVar6.r(fVar) | mVar6.r(context);
                        Object objQ6 = mVar6.q();
                        if (zR2 || objQ6 == c2565a) {
                            obj4 = objQ6;
                            j jVar = new j(p1Var, 8, fVar, context);
                            mVar6.K(jVar);
                            obj4 = jVar;
                        }
                        rVar6.i((e23.a) obj4, R.string.pulse_ox_settings_title, mVar6, 0);
                        mVar6.f();
                    } else {
                        mVar6.C(872277712);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i27 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    final r rVar7 = this.f25217b;
                    rVar7.D(R.string.lbl_sleep_score, mVar7, 0);
                    rVar7.l(R.string.msg_sleep_score_help_intro_description, 0, 2, null, mVar7);
                    rVar7.o(R.string.msg_your_sleep_score_categories, 0, 2, null, mVar7);
                    final Map mapE2 = u0.e(new o13.p(Integer.valueOf(R.string.lbl_sleep_score_range_excellent), com.garmin.android.apps.connectmobile.sleep.presentation.a.v(context, y.Q(mVar7, R.string.lbl_sleep_score_range_excellent))), new o13.p(Integer.valueOf(R.string.lbl_sleep_score_range_good), com.garmin.android.apps.connectmobile.sleep.presentation.a.v(context, y.Q(mVar7, R.string.lbl_sleep_score_range_good))), new o13.p(Integer.valueOf(R.string.lbl_sleep_score_range_fair), com.garmin.android.apps.connectmobile.sleep.presentation.a.v(context, y.Q(mVar7, R.string.lbl_sleep_score_range_fair))), new o13.p(Integer.valueOf(R.string.lbl_sleep_score_range_poor_2), y.Q(mVar7, R.string.lbl_sleep_score_range_poor)));
                    final int i28 = z14 ? 1 : 0;
                    rVar7.g(z3.f.c(2012566631, new p() { // from class: sm1.f
                        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
                        @Override // e23.p
                        public final Object invoke(Object obj5, Object obj6) {
                            int i29 = i28;
                            ?? r14 = mapE2;
                            switch (i29) {
                                case 0:
                                    p3.m mVar8 = (p3.m) obj5;
                                    int iIntValue8 = ((Integer) obj6).intValue();
                                    int i210 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                                    if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                        x1 x1Var8 = p3.n.f135158a;
                                        Iterator it = r14.entrySet().iterator();
                                        while (it.hasNext()) {
                                            rVar7.d(((Number) ((Map.Entry) it.next()).getKey()).intValue(), 0, 2, null, mVar8);
                                        }
                                        x1 x1Var9 = p3.n.f135158a;
                                    } else {
                                        mVar8.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar9 = (p3.m) obj5;
                                    int iIntValue9 = ((Integer) obj6).intValue();
                                    int i211 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                                    if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        x1 x1Var10 = p3.n.f135158a;
                                        Iterator it3 = r14.entrySet().iterator();
                                        while (it3.hasNext()) {
                                            rVar7.d(((Number) ((Map.Entry) it3.next()).getKey()).intValue(), 0, 2, null, mVar9);
                                        }
                                        x1 x1Var11 = p3.n.f135158a;
                                    } else {
                                        mVar9.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar7), mVar7, 6);
                    rVar7.o(R.string.msg_learn_more_sleep_score_factors, 0, 2, null, mVar7);
                    rVar7.c(mVar7, 0);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i29 = sz1.p.f161567f;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r rVar8 = this.f25217b;
                    rVar8.t(R.string.tr_help_second_section_title, mVar8, 0);
                    rVar8.o(R.string.tr_help_second_section, 0, 2, null, mVar8);
                    mVar8.C(-856418796);
                    String str2 = "<link>" + y.Q(mVar8, R.string.gcm_sleep_tracking_help_info) + "</link>";
                    mVar8.f();
                    boolean zR3 = mVar8.r(context);
                    Object objQ7 = mVar8.q();
                    if (zR3) {
                        objQ7 = new s70.r(context, 17);
                        mVar8.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new s70.r(context, 17);
                            mVar8.K(objQ7);
                        }
                    }
                    rVar8.w(str2, null, (e23.a) objQ7, mVar8, 0, 2);
                } else {
                    mVar8.e();
                }
                break;
            default:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i30 = t31.g.f162217g;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    String strQ5 = y.Q(mVar9, R.string.ohrv_help_title_receiving_status);
                    r rVar9 = this.f25217b;
                    rVar9.s(0, 2, strQ5, null, mVar9);
                    mVar9.C(-1888479391);
                    String str3 = y.Q(mVar9, R.string.gcm_training_status_receiving_hrv_status_desc) + " <link>" + y.Q(mVar9, R.string.gcm_sleep_tracking_help_info) + "</link>";
                    mVar9.f();
                    boolean zR4 = mVar9.r(context);
                    Object objQ8 = mVar9.q();
                    if (zR4) {
                        objQ8 = new s70.r(context, i15);
                        mVar9.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new s70.r(context, i15);
                            mVar9.K(objQ8);
                        }
                    }
                    rVar9.w(str3, null, (e23.a) objQ8, mVar9, 0, 2);
                    rVar9.q(y.Q(mVar9, R.string.ohrv_help_description_receiving_status_1), mVar9, 0);
                } else {
                    mVar9.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(r rVar, h82.c cVar, Context context, int i14) {
        this.f25216a = i14;
        this.f25217b = rVar;
        this.f25218c = context;
    }
}
