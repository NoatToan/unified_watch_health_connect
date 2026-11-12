package xk1;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f191260b;

    public /* synthetic */ k(n nVar, int i14) {
        this.f191259a = i14;
        this.f191260b = nVar;
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
        int i14 = this.f191259a;
        n nVar = this.f191260b;
        switch (i14) {
            case 0:
                h82.r rVar = (h82.r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = n.f191265j;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    int i16 = (iIntValue << 3) & 112;
                    rVar.D(R.string.device_settings_power_zones, mVar, i16);
                    rVar.l(R.string.power_zones_help_header, (iIntValue << 6) & 896, 2, null, mVar);
                    rVar.a(z3.f.c(680093735, new wb1.i(29, rVar, nVar), mVar), mVar, i16 | 6);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i17 = n.f191265j;
                rVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i18 = (iIntValue2 << 3) & 112;
                    rVar2.D(R.string.lbl_cycling_power_zones, mVar2, i18);
                    int i19 = (iIntValue2 << 6) & 896;
                    rVar2.l(R.string.lbl_cycling_power_help_title_desc, i19, 2, null, mVar2);
                    rVar2.t(R.string.lbl_power_zone_help_title2, mVar2, i18);
                    rVar2.o(R.string.lbl_cycling_power_help_title_desc2, i19, 2, null, mVar2);
                    rVar2.t(R.string.startup_lbl_training_with_power_zones, mVar2, i18);
                    rVar2.o(R.string.lbl_cycling_power_help_title_desc3, i19, 2, null, mVar2);
                    nVar.l(rVar2, mVar2, iIntValue2 & 14);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                h82.r rVar3 = (h82.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i24 = n.f191265j;
                rVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(rVar3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    int i25 = (iIntValue3 << 3) & 112;
                    rVar3.D(R.string.lbl_skiing_power_zone_help_title1, mVar3, i25);
                    int i26 = (iIntValue3 << 6) & 896;
                    rVar3.l(R.string.lbl_skiing_power_help_title_desc1, i26, 2, null, mVar3);
                    rVar3.t(R.string.lbl_power_zone_help_title2, mVar3, i25);
                    rVar3.o(R.string.lbl_skiing_power_help_title_desc2, i26, 2, null, mVar3);
                    rVar3.t(R.string.startup_lbl_training_with_power_zones, mVar3, i25);
                    rVar3.o(R.string.lbl_skiing_power_help_title_desc3, i26, 2, null, mVar3);
                    nVar.l(rVar3, mVar3, iIntValue3 & 14);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                h82.r rVar4 = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i27 = n.f191265j;
                rVar4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i28 = (iIntValue4 << 3) & 112;
                    rVar4.D(R.string.lbl_running_power_zone_help_title1, mVar4, i28);
                    int i29 = (iIntValue4 << 6) & 896;
                    rVar4.l(R.string.lbl_running_power_help_title_desc1, i29, 2, null, mVar4);
                    rVar4.t(R.string.lbl_power_zone_help_title2, mVar4, i28);
                    rVar4.o(R.string.lbl_running_power_help_title_desc2_v2, i29, 2, null, mVar4);
                    rVar4.t(R.string.startup_lbl_training_with_power_zones, mVar4, i28);
                    rVar4.o(R.string.lbl_running_power_help_title_desc3_v2, i29, 2, null, mVar4);
                    nVar.l(rVar4, mVar4, iIntValue4 & 14);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                h82.r rVar5 = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i30 = n.f191265j;
                rVar5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar5) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i34 = (iIntValue5 << 3) & 112;
                    rVar5.D(R.string.device_settings_power_zones, mVar5, i34);
                    rVar5.m((iIntValue5 << 6) & 896, 2, y.Q(mVar5, R.string.lbl_power_zone_help_title_desc1), null, mVar5);
                    rVar5.t(R.string.lbl_power_zone_help_title2, mVar5, i34);
                    rVar5.q(y.Q(mVar5, R.string.lbl_power_zone_help_title_desc2), mVar5, i34);
                    rVar5.t(R.string.startup_lbl_training_with_power_zones, mVar5, i34);
                    rVar5.q(y.Q(mVar5, R.string.lbl_power_zone_help_title_desc3), mVar5, i34);
                    nVar.l(rVar5, mVar5, iIntValue5 & 14);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i35 = n.f191265j;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    nVar.j(mVar6, 0);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i36 = n.f191265j;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    nVar.k(mVar7, 0);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i37 = n.f191265j;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    nVar.g(mVar8, 0);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i38 = n.f191265j;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    nVar.i(mVar9, 0);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i39 = n.f191265j;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    nVar.h(mVar10, 0);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                int i44 = n.f191265j;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    nVar.j(mVar11, 0);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i45 = n.f191265j;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var12 = p3.n.f135158a;
                    nVar.g(mVar12, 0);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                int i46 = n.f191265j;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var13 = p3.n.f135158a;
                    nVar.i(mVar13, 0);
                } else {
                    mVar13.e();
                }
                break;
            default:
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                int i47 = n.f191265j;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var14 = p3.n.f135158a;
                    nVar.k(mVar14, 0);
                } else {
                    mVar14.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
