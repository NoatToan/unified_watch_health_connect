package aq;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l3 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f12044b;

    public /* synthetic */ l3(o3 o3Var, int i14) {
        this.f12043a = i14;
        this.f12044b = o3Var;
    }

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
        int i14 = this.f12043a;
        int i15 = 14;
        o3 o3Var = this.f12044b;
        switch (i14) {
            case 0:
                h82.r rVar = (h82.r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i16 = o3.f12139h;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    int i17 = ((iIntValue << 3) & 112) | 6;
                    rVar.k(z3.f.c(1142677313, new a42.l(rVar, 3), mVar), mVar, i17);
                    rVar.a(z3.f.c(-150176918, new a03.t0(i15, rVar, o3Var), mVar), mVar, i17);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i18 = o3.f12139h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    o3Var.m(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i19 = o3.f12139h;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    o3Var.n(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i24 = o3.f12139h;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    o3Var.g(mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i25 = o3.f12139h;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    o3Var.h(mVar5, 0);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i26 = o3.f12139h;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    o3Var.l(mVar6, 0);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i27 = o3.f12139h;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    o3Var.k(mVar7, 0);
                } else {
                    mVar7.e();
                }
                break;
            default:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i28 = o3.f12139h;
                rVar2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(rVar2) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    int i29 = (iIntValue8 << 3) & 112;
                    rVar2.D(R.string.activities_primary_benefit_help_title, mVar8, i29);
                    int i30 = (iIntValue8 << 6) & 896;
                    rVar2.o(R.string.activities_primary_benefit_desc_1, i30, 2, null, mVar8);
                    rVar2.t(R.string.activity_anaerobic_label, mVar8, i29);
                    String strQ = gl1.y.Q(mVar8, R.string.lbl_segment_classification_sprint);
                    o3 o3Var2 = this.f12044b;
                    o3Var2.i(strQ, null, R.color.gcm3_training_effect_anaerobic, null, mVar8, 0);
                    o3Var2.i(gl1.y.Q(mVar8, R.string.activities_training_effect_anaerobic_capacity), null, R.color.gcm3_training_effect_anaerobic, null, mVar8, 0);
                    rVar2.t(R.string.lbl_high_aer_lf, mVar8, i29);
                    o3Var2.i(gl1.y.Q(mVar8, R.string.activities_training_effect_vo2_max), null, R.color.gcm3_training_effect_high_aerobic, null, mVar8, 0);
                    o3Var2.i(gl1.y.Q(mVar8, R.string.activities_training_effect_threshold), null, R.color.gcm3_training_effect_high_aerobic, null, mVar8, 0);
                    o3Var2.i(gl1.y.Q(mVar8, R.string.golf_lbl_swing_tempo), null, R.color.gcm3_training_effect_high_aerobic, null, mVar8, 0);
                    rVar2.t(R.string.activities_low_aerobic_title, mVar8, i29);
                    o3Var2.i(gl1.y.Q(mVar8, R.string.activities_training_effect_aerobic_base), null, R.color.gcm3_training_effect_low_aerobic, null, mVar8, 0);
                    o3Var2.i(gl1.y.Q(mVar8, R.string.activities_training_effect_recovery), null, R.color.gcm3_training_effect_low_aerobic, null, mVar8, 0);
                    rVar2.c(mVar8, iIntValue8 & 14);
                    rVar2.o(R.string.activities_primary_benefit_desc_2, i30, 2, null, mVar8);
                } else {
                    mVar8.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
