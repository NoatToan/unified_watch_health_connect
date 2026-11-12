package sy;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h82.r;
import i3.e5;
import l72.v1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.n;
import p3.x1;
import sk0.r1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.calories.presentation.a f161159b;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.calories.presentation.a aVar, int i14) {
        this.f161158a = i14;
        this.f161159b = aVar;
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
        int i14 = this.f161158a;
        p3.m.a aVar = p3.m.f135153a;
        com.garmin.android.apps.connectmobile.calories.presentation.a aVar2 = this.f161159b;
        switch (i14) {
            case 0:
                r rVar = (r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    String strQ = y.Q(mVar, R.string.adjusted_goal_description);
                    l3.f23124b.getClass();
                    String str = l3.f23131i.format(aVar2.f31247f.f31257i);
                    String str2 = l3.f23131i.format(aVar2.f31247f.f31251c);
                    String str3 = l3.f23131i.format(aVar2.f31247f.f31255g);
                    str3.getClass();
                    str2.getClass();
                    str.getClass();
                    s5.c cVarB = v1.b(e5.g(strQ, "\n\n", y.P(R.string.adjusted_goal_equation, new Object[]{str3, str2, str}, mVar)), new String[]{str3, str2, str}, mVar);
                    rVar.D(R.string.lbl_adjust_for_activity, mVar, (iIntValue << 3) & 112);
                    rVar.n(cVarB, null, mVar, (iIntValue << 6) & 896, 2);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                r rVar2 = (r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                rVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    String strG = tn.k.g(y.Q(mVar2, R.string.calorie_goal_description), "\n\n");
                    l3.f23124b.getClass();
                    String str4 = l3.f23131i.format(aVar2.f31247f.f31255g);
                    str4.getClass();
                    s5.c cVarB2 = v1.b(tn.k.g(strG, y.P(R.string.calories_current_goal, new Object[]{str4}, mVar2)), new String[]{str4}, mVar2);
                    Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new r1(12);
                        mVar2.K(objQ);
                    }
                    String strG2 = e5.g(oi0.c.A(context, (e23.l) objQ, strG), StringUtils.SPACE, y.P(R.string.calories_current_goal, new Object[]{str4}, mVar2));
                    rVar2.D(R.string.lbl_put_it_all_together, mVar2, (iIntValue2 << 3) & 112);
                    rVar2.n(cVarB2, strG2, mVar2, (iIntValue2 << 6) & 896, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                r rVar3 = (r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                rVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(rVar3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    int i18 = (iIntValue3 << 3) & 112;
                    rVar3.D(R.string.lbl_put_it_all_together, mVar3, i18);
                    l3.f23124b.getClass();
                    String str5 = l3.f23131i.format(aVar2.f31247f.f31253e);
                    str5.getClass();
                    rVar3.r(v1.b(y.P(R.string.total_calories_description, new Object[]{str5, aVar2.o(mVar3)}, mVar3), new String[]{str5}, mVar3), mVar3, i18);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                r rVar4 = (r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i19 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                rVar4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    int i24 = (iIntValue4 << 3) & 112;
                    rVar4.D(R.string.lbl_calories_burned_in_rest, mVar4, i24);
                    rVar4.o(R.string.msg_help_calories_burned_at_rest_paragraph_1, (iIntValue4 << 6) & 896, 2, null, mVar4);
                    l3.f23124b.getClass();
                    String str6 = l3.f23131i.format(aVar2.f31247f.f31252d);
                    str6.getClass();
                    rVar4.r(v1.b(y.P(R.string.msg_help_calories_burned_at_rest_paragraph_2, new Object[]{str6, aVar2.o(mVar4)}, mVar4), new String[]{str6}, mVar4), mVar4, i24);
                    if (aVar2.f31247f.f31258j) {
                        mVar4.C(2122508397);
                        mVar4.f();
                    } else {
                        mVar4.C(2122320041);
                        rVar4.j(z3.f.c(-1786153431, new sm1.j(rVar4, 7), mVar4), mVar4, i24 | 6);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                r rVar5 = (r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i25 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                rVar5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar5) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    int i26 = ((iIntValue5 << 3) & 112) | 6;
                    rVar5.k(z3.f.c(-259604445, new e(rVar5, aVar2), mVar5), mVar5, i26);
                    rVar5.a(z3.f.c(836866074, new e(aVar2, rVar5), mVar5), mVar5, i26);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                r rVar6 = (r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i27 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                rVar6.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar6) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    int i28 = (iIntValue6 << 3) & 112;
                    rVar6.D(R.string.lbl_calories_burned_in_motion, mVar6, i28);
                    l3.f23124b.getClass();
                    String str7 = l3.f23131i.format(aVar2.f31247f.f31251c);
                    str7.getClass();
                    rVar6.r(v1.b(y.P(R.string.active_calories_description, new Object[]{str7, aVar2.o(mVar6)}, mVar6), new String[]{str7}, mVar6), mVar6, i28);
                    if (aVar2.f31247f.f31258j) {
                        mVar6.C(1320676895);
                        mVar6.f();
                    } else {
                        mVar6.C(1320488539);
                        rVar6.j(z3.f.c(-1304366961, new sm1.j(rVar6, 6), mVar6), mVar6, i28 | 6);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                r rVar7 = (r) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i29 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                rVar7.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(rVar7) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var7 = n.f135158a;
                    rVar7.D(R.string.lbl_calories_from_food, mVar7, (iIntValue7 << 3) & 112);
                    l3.f23124b.getClass();
                    String str8 = l3.f23131i.format(aVar2.f31247f.f31254f);
                    str8.getClass();
                    s5.c cVarB3 = v1.b(y.P(R.string.calories_consumed_description, new Object[]{str8}, mVar7), new String[]{str8}, mVar7);
                    String strP = y.P(R.string.calories_consumed_description, new Object[]{str8}, mVar7);
                    Context context2 = (Context) mVar7.A(AndroidCompositionLocals_androidKt.f6042b);
                    Object objQ2 = mVar7.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new r1(11);
                        mVar7.K(objQ2);
                    }
                    rVar7.n(cVarB3, oi0.c.A(context2, (e23.l) objQ2, strP), mVar7, (iIntValue7 << 6) & 896, 0);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                r rVar8 = (r) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                rVar8.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(rVar8) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    String strQ2 = y.Q(mVar8, R.string.calories_remaining_description);
                    l3.f23124b.getClass();
                    String str9 = l3.f23131i.format(aVar2.f31247f.f31257i);
                    String str10 = l3.f23131i.format(aVar2.f31247f.f31254f);
                    String str11 = l3.f23131i.format(aVar2.f31247f.f31256h);
                    str9.getClass();
                    str10.getClass();
                    str11.getClass();
                    s5.c cVarB4 = v1.b(e5.g(strQ2, "\n\n", y.P(R.string.calories_remaining_equation, new Object[]{str9, str10, str11}, mVar8)), new String[]{str9, str10, str11}, mVar8);
                    rVar8.D(R.string.lbl_calorie_countdown, mVar8, (iIntValue8 << 3) & 112);
                    String str12 = cVarB4.f157138b;
                    Context context3 = (Context) mVar8.A(AndroidCompositionLocals_androidKt.f6042b);
                    Object objQ3 = mVar8.q();
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new r1(13);
                        mVar8.K(objQ3);
                    }
                    rVar8.n(cVarB4, oi0.c.A(context3, (e23.l) objQ3, str12), mVar8, (iIntValue8 << 6) & 896, 0);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var9 = n.f135158a;
                    aVar2.m(mVar9, 0);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var10 = n.f135158a;
                    aVar2.g(mVar10, 0);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var11 = n.f135158a;
                    aVar2.l(mVar11, 0);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var12 = n.f135158a;
                    aVar2.n(mVar12, 0);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var13 = n.f135158a;
                    aVar2.i(mVar13, 0);
                } else {
                    mVar13.e();
                }
                break;
            case 13:
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                int i39 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var14 = n.f135158a;
                    aVar2.j(mVar14, 0);
                } else {
                    mVar14.e();
                }
                break;
            case 14:
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                int i44 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var15 = n.f135158a;
                    aVar2.h(mVar15, 0);
                } else {
                    mVar15.e();
                }
                break;
            default:
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                int i45 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var16 = n.f135158a;
                    aVar2.k(mVar16, 0);
                } else {
                    mVar16.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
