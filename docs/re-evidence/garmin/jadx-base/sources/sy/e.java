package sy;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h82.r;
import p005kotlin.Unit;
import p3.n;
import p3.x1;
import sk0.r1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161162a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.calories.presentation.a f161163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f161164c;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.calories.presentation.a aVar, r rVar) {
        this.f161163b = aVar;
        this.f161164c = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:54:0x0169  */
    /* JADX WARN: Code duplicated, block: B:59:0x0190  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f161162a;
        p3.m.a aVar = p3.m.f135153a;
        final com.garmin.android.apps.connectmobile.calories.presentation.a aVar2 = this.f161163b;
        final int i15 = 0;
        final int i16 = 2;
        final int i17 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i18 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    com.garmin.android.apps.connectmobile.calories.presentation.a.c cVar = aVar2.f31247f.f31249a;
                    com.garmin.android.apps.connectmobile.calories.presentation.a.c cVar2 = com.garmin.android.apps.connectmobile.calories.presentation.a.c.MFP_VERSION;
                    int i19 = cVar == cVar2 ? R.string.lbl_nutrition : R.string.lbl_calories_burned;
                    r rVar = this.f161164c;
                    rVar.D(i19, mVar, 0);
                    com.garmin.android.apps.connectmobile.calories.presentation.a.b bVar = aVar2.f31247f;
                    if (bVar.f31249a == cVar2 && bVar.f31250b) {
                        mVar.C(1360380268);
                        String strQ = y.Q(mVar, R.string.calories_mfp_help_main_description);
                        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                        Object objQ = mVar.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r1(14);
                            mVar.K(objQ);
                        }
                        rVar.m(0, 0, y.Q(mVar, R.string.calories_mfp_help_main_description), oi0.c.A(context, (e23.l) objQ, strQ), mVar);
                        mVar.f();
                    } else {
                        mVar.C(1360714665);
                        rVar.l(R.string.calories_help_main_description, 0, 2, null, mVar);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i24 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    com.garmin.android.apps.connectmobile.calories.presentation.a.b bVar2 = aVar2.f31247f;
                    com.garmin.android.apps.connectmobile.calories.presentation.a.c cVar3 = bVar2.f31249a;
                    com.garmin.android.apps.connectmobile.calories.presentation.a.c cVar4 = com.garmin.android.apps.connectmobile.calories.presentation.a.c.MFP_VERSION;
                    r rVar2 = this.f161164c;
                    if (cVar3 == cVar4 && bVar2.f31250b) {
                        mVar2.C(-1207876156);
                        boolean zR = mVar2.r(aVar2);
                        Object objQ2 = mVar2.q();
                        if (zR) {
                            objQ2 = new e23.a() { // from class: sy.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i25 = i15;
                                    com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                    switch (i25) {
                                        case 0:
                                            int i26 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 1:
                                            int i27 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                        case 2:
                                            int i28 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_CONSUMED_ACTION");
                                            break;
                                        case 3:
                                            int i29 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIE_GOAL_ACTION");
                                            break;
                                        case 4:
                                            int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ADJUSTED_GOAL_ACTION");
                                            break;
                                        case 5:
                                            int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_REMAINING_ACTION");
                                            break;
                                        case 6:
                                            int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 7:
                                            int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("RESTING_CALORIES_ACTION");
                                            break;
                                        case 8:
                                            int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("TOTAL_CALORIES_ACTION");
                                            break;
                                        default:
                                            int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e23.a() { // from class: sy.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i25 = i15;
                                        com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                        switch (i25) {
                                            case 0:
                                                int i26 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 1:
                                                int i27 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                            case 2:
                                                int i28 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_CONSUMED_ACTION");
                                                break;
                                            case 3:
                                                int i29 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIE_GOAL_ACTION");
                                                break;
                                            case 4:
                                                int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ADJUSTED_GOAL_ACTION");
                                                break;
                                            case 5:
                                                int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_REMAINING_ACTION");
                                                break;
                                            case 6:
                                                int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 7:
                                                int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("RESTING_CALORIES_ACTION");
                                                break;
                                            case 8:
                                                int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("TOTAL_CALORIES_ACTION");
                                                break;
                                            default:
                                                int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ2);
                            }
                        }
                        rVar2.B(R.string.lbl_active_calories, null, false, (e23.a) objQ2, mVar2, 0, 6);
                        boolean zR2 = mVar2.r(aVar2);
                        Object objQ3 = mVar2.q();
                        if (zR2) {
                            objQ3 = new e23.a() { // from class: sy.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i25 = i17;
                                    com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                    switch (i25) {
                                        case 0:
                                            int i26 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 1:
                                            int i27 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                        case 2:
                                            int i28 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_CONSUMED_ACTION");
                                            break;
                                        case 3:
                                            int i29 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIE_GOAL_ACTION");
                                            break;
                                        case 4:
                                            int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ADJUSTED_GOAL_ACTION");
                                            break;
                                        case 5:
                                            int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_REMAINING_ACTION");
                                            break;
                                        case 6:
                                            int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 7:
                                            int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("RESTING_CALORIES_ACTION");
                                            break;
                                        case 8:
                                            int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("TOTAL_CALORIES_ACTION");
                                            break;
                                        default:
                                            int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new e23.a() { // from class: sy.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i25 = i17;
                                        com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                        switch (i25) {
                                            case 0:
                                                int i26 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 1:
                                                int i27 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                            case 2:
                                                int i28 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_CONSUMED_ACTION");
                                                break;
                                            case 3:
                                                int i29 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIE_GOAL_ACTION");
                                                break;
                                            case 4:
                                                int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ADJUSTED_GOAL_ACTION");
                                                break;
                                            case 5:
                                                int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_REMAINING_ACTION");
                                                break;
                                            case 6:
                                                int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 7:
                                                int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("RESTING_CALORIES_ACTION");
                                                break;
                                            case 8:
                                                int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("TOTAL_CALORIES_ACTION");
                                                break;
                                            default:
                                                int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ3);
                            }
                        }
                        rVar2.B(R.string.lbl_calories_during_an_activity, null, false, (e23.a) objQ3, mVar2, 0, 6);
                        boolean zR3 = mVar2.r(aVar2);
                        Object objQ4 = mVar2.q();
                        if (zR3) {
                            objQ4 = new e23.a() { // from class: sy.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i25 = i16;
                                    com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                    switch (i25) {
                                        case 0:
                                            int i26 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 1:
                                            int i27 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                        case 2:
                                            int i28 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_CONSUMED_ACTION");
                                            break;
                                        case 3:
                                            int i29 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIE_GOAL_ACTION");
                                            break;
                                        case 4:
                                            int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ADJUSTED_GOAL_ACTION");
                                            break;
                                        case 5:
                                            int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_REMAINING_ACTION");
                                            break;
                                        case 6:
                                            int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 7:
                                            int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("RESTING_CALORIES_ACTION");
                                            break;
                                        case 8:
                                            int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("TOTAL_CALORIES_ACTION");
                                            break;
                                        default:
                                            int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new e23.a() { // from class: sy.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i25 = i16;
                                        com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                        switch (i25) {
                                            case 0:
                                                int i26 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 1:
                                                int i27 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                            case 2:
                                                int i28 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_CONSUMED_ACTION");
                                                break;
                                            case 3:
                                                int i29 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIE_GOAL_ACTION");
                                                break;
                                            case 4:
                                                int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ADJUSTED_GOAL_ACTION");
                                                break;
                                            case 5:
                                                int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_REMAINING_ACTION");
                                                break;
                                            case 6:
                                                int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 7:
                                                int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("RESTING_CALORIES_ACTION");
                                                break;
                                            case 8:
                                                int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("TOTAL_CALORIES_ACTION");
                                                break;
                                            default:
                                                int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ4);
                            }
                        }
                        rVar2.B(R.string.lbl_calories_consumed, null, false, (e23.a) objQ4, mVar2, 0, 6);
                        boolean zR4 = mVar2.r(aVar2);
                        Object objQ5 = mVar2.q();
                        if (zR4) {
                            final int i25 = 3;
                            objQ5 = new e23.a() { // from class: sy.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i26 = i25;
                                    com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                    switch (i26) {
                                        case 0:
                                            int i27 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 1:
                                            int i28 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                        case 2:
                                            int i29 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_CONSUMED_ACTION");
                                            break;
                                        case 3:
                                            int i210 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIE_GOAL_ACTION");
                                            break;
                                        case 4:
                                            int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ADJUSTED_GOAL_ACTION");
                                            break;
                                        case 5:
                                            int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_REMAINING_ACTION");
                                            break;
                                        case 6:
                                            int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 7:
                                            int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("RESTING_CALORIES_ACTION");
                                            break;
                                        case 8:
                                            int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("TOTAL_CALORIES_ACTION");
                                            break;
                                        default:
                                            int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                final int i26 = 3;
                                objQ5 = new e23.a() { // from class: sy.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i27 = i26;
                                        com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                        switch (i27) {
                                            case 0:
                                                int i28 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 1:
                                                int i29 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                            case 2:
                                                int i210 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_CONSUMED_ACTION");
                                                break;
                                            case 3:
                                                int i211 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIE_GOAL_ACTION");
                                                break;
                                            case 4:
                                                int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ADJUSTED_GOAL_ACTION");
                                                break;
                                            case 5:
                                                int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_REMAINING_ACTION");
                                                break;
                                            case 6:
                                                int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 7:
                                                int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("RESTING_CALORIES_ACTION");
                                                break;
                                            case 8:
                                                int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("TOTAL_CALORIES_ACTION");
                                                break;
                                            default:
                                                int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ5);
                            }
                        }
                        rVar2.B(R.string.lbl_calorie_goal, null, false, (e23.a) objQ5, mVar2, 0, 6);
                        boolean zR5 = mVar2.r(aVar2);
                        Object objQ6 = mVar2.q();
                        if (zR5) {
                            final int i27 = 4;
                            objQ6 = new e23.a() { // from class: sy.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i27;
                                    com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                    switch (i28) {
                                        case 0:
                                            int i29 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 1:
                                            int i210 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                        case 2:
                                            int i211 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_CONSUMED_ACTION");
                                            break;
                                        case 3:
                                            int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIE_GOAL_ACTION");
                                            break;
                                        case 4:
                                            int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ADJUSTED_GOAL_ACTION");
                                            break;
                                        case 5:
                                            int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_REMAINING_ACTION");
                                            break;
                                        case 6:
                                            int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 7:
                                            int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("RESTING_CALORIES_ACTION");
                                            break;
                                        case 8:
                                            int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("TOTAL_CALORIES_ACTION");
                                            break;
                                        default:
                                            int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                final int i28 = 4;
                                objQ6 = new e23.a() { // from class: sy.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i29 = i28;
                                        com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                        switch (i29) {
                                            case 0:
                                                int i210 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 1:
                                                int i211 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                            case 2:
                                                int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_CONSUMED_ACTION");
                                                break;
                                            case 3:
                                                int i213 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIE_GOAL_ACTION");
                                                break;
                                            case 4:
                                                int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ADJUSTED_GOAL_ACTION");
                                                break;
                                            case 5:
                                                int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_REMAINING_ACTION");
                                                break;
                                            case 6:
                                                int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 7:
                                                int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("RESTING_CALORIES_ACTION");
                                                break;
                                            case 8:
                                                int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("TOTAL_CALORIES_ACTION");
                                                break;
                                            default:
                                                int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ6);
                            }
                        }
                        rVar2.B(R.string.lbl_adjusted_goal, null, false, (e23.a) objQ6, mVar2, 0, 6);
                        boolean zR6 = mVar2.r(aVar2);
                        Object objQ7 = mVar2.q();
                        if (zR6) {
                            final int i29 = 5;
                            objQ7 = new e23.a() { // from class: sy.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i29;
                                    com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                    switch (i210) {
                                        case 0:
                                            int i211 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 1:
                                            int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                        case 2:
                                            int i213 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_CONSUMED_ACTION");
                                            break;
                                        case 3:
                                            int i214 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIE_GOAL_ACTION");
                                            break;
                                        case 4:
                                            int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ADJUSTED_GOAL_ACTION");
                                            break;
                                        case 5:
                                            int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_REMAINING_ACTION");
                                            break;
                                        case 6:
                                            int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 7:
                                            int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("RESTING_CALORIES_ACTION");
                                            break;
                                        case 8:
                                            int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("TOTAL_CALORIES_ACTION");
                                            break;
                                        default:
                                            int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ7);
                        } else {
                            aVar.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                final int i210 = 5;
                                objQ7 = new e23.a() { // from class: sy.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i211 = i210;
                                        com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                        switch (i211) {
                                            case 0:
                                                int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 1:
                                                int i213 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                            case 2:
                                                int i214 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_CONSUMED_ACTION");
                                                break;
                                            case 3:
                                                int i215 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIE_GOAL_ACTION");
                                                break;
                                            case 4:
                                                int i30 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ADJUSTED_GOAL_ACTION");
                                                break;
                                            case 5:
                                                int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_REMAINING_ACTION");
                                                break;
                                            case 6:
                                                int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 7:
                                                int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("RESTING_CALORIES_ACTION");
                                                break;
                                            case 8:
                                                int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("TOTAL_CALORIES_ACTION");
                                                break;
                                            default:
                                                int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ7);
                            }
                        }
                        rVar2.B(R.string.lbl_calories_remaining, null, false, (e23.a) objQ7, mVar2, 0, 6);
                        mVar2.f();
                    } else {
                        mVar2.C(-1207206122);
                        boolean zR7 = mVar2.r(aVar2);
                        Object objQ8 = mVar2.q();
                        if (zR7) {
                            final int i30 = 6;
                            objQ8 = new e23.a() { // from class: sy.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i211 = i30;
                                    com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                    switch (i211) {
                                        case 0:
                                            int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 1:
                                            int i213 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                        case 2:
                                            int i214 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_CONSUMED_ACTION");
                                            break;
                                        case 3:
                                            int i215 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIE_GOAL_ACTION");
                                            break;
                                        case 4:
                                            int i34 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ADJUSTED_GOAL_ACTION");
                                            break;
                                        case 5:
                                            int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_REMAINING_ACTION");
                                            break;
                                        case 6:
                                            int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 7:
                                            int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("RESTING_CALORIES_ACTION");
                                            break;
                                        case 8:
                                            int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("TOTAL_CALORIES_ACTION");
                                            break;
                                        default:
                                            int i39 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ8);
                        } else {
                            aVar.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                final int i34 = 6;
                                objQ8 = new e23.a() { // from class: sy.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i211 = i34;
                                        com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                        switch (i211) {
                                            case 0:
                                                int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 1:
                                                int i213 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                            case 2:
                                                int i214 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_CONSUMED_ACTION");
                                                break;
                                            case 3:
                                                int i215 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIE_GOAL_ACTION");
                                                break;
                                            case 4:
                                                int i35 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ADJUSTED_GOAL_ACTION");
                                                break;
                                            case 5:
                                                int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_REMAINING_ACTION");
                                                break;
                                            case 6:
                                                int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 7:
                                                int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("RESTING_CALORIES_ACTION");
                                                break;
                                            case 8:
                                                int i39 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("TOTAL_CALORIES_ACTION");
                                                break;
                                            default:
                                                int i310 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ8);
                            }
                        }
                        rVar2.B(R.string.lbl_active_calories, null, false, (e23.a) objQ8, mVar2, 0, 6);
                        boolean zR8 = mVar2.r(aVar2);
                        Object objQ9 = mVar2.q();
                        if (zR8) {
                            final int i35 = 7;
                            objQ9 = new e23.a() { // from class: sy.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i211 = i35;
                                    com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                    switch (i211) {
                                        case 0:
                                            int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 1:
                                            int i213 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                        case 2:
                                            int i214 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_CONSUMED_ACTION");
                                            break;
                                        case 3:
                                            int i215 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIE_GOAL_ACTION");
                                            break;
                                        case 4:
                                            int i36 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ADJUSTED_GOAL_ACTION");
                                            break;
                                        case 5:
                                            int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_REMAINING_ACTION");
                                            break;
                                        case 6:
                                            int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 7:
                                            int i39 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("RESTING_CALORIES_ACTION");
                                            break;
                                        case 8:
                                            int i310 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("TOTAL_CALORIES_ACTION");
                                            break;
                                        default:
                                            int i311 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ9);
                        } else {
                            aVar.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                final int i36 = 7;
                                objQ9 = new e23.a() { // from class: sy.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i211 = i36;
                                        com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                        switch (i211) {
                                            case 0:
                                                int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 1:
                                                int i213 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                            case 2:
                                                int i214 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_CONSUMED_ACTION");
                                                break;
                                            case 3:
                                                int i215 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIE_GOAL_ACTION");
                                                break;
                                            case 4:
                                                int i37 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ADJUSTED_GOAL_ACTION");
                                                break;
                                            case 5:
                                                int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_REMAINING_ACTION");
                                                break;
                                            case 6:
                                                int i39 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 7:
                                                int i310 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("RESTING_CALORIES_ACTION");
                                                break;
                                            case 8:
                                                int i311 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("TOTAL_CALORIES_ACTION");
                                                break;
                                            default:
                                                int i312 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ9);
                            }
                        }
                        rVar2.B(R.string.lbl_resting_calories, null, false, (e23.a) objQ9, mVar2, 0, 6);
                        boolean zR9 = mVar2.r(aVar2);
                        Object objQ10 = mVar2.q();
                        if (zR9) {
                            final int i37 = 8;
                            objQ10 = new e23.a() { // from class: sy.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i211 = i37;
                                    com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                    switch (i211) {
                                        case 0:
                                            int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 1:
                                            int i213 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                        case 2:
                                            int i214 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_CONSUMED_ACTION");
                                            break;
                                        case 3:
                                            int i215 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIE_GOAL_ACTION");
                                            break;
                                        case 4:
                                            int i38 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ADJUSTED_GOAL_ACTION");
                                            break;
                                        case 5:
                                            int i39 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_REMAINING_ACTION");
                                            break;
                                        case 6:
                                            int i310 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 7:
                                            int i311 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("RESTING_CALORIES_ACTION");
                                            break;
                                        case 8:
                                            int i312 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("TOTAL_CALORIES_ACTION");
                                            break;
                                        default:
                                            int i313 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ10);
                        } else {
                            aVar.getClass();
                            if (objQ10 == p3.m.a.f135155b) {
                                final int i38 = 8;
                                objQ10 = new e23.a() { // from class: sy.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i211 = i38;
                                        com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                        switch (i211) {
                                            case 0:
                                                int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 1:
                                                int i213 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                            case 2:
                                                int i214 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_CONSUMED_ACTION");
                                                break;
                                            case 3:
                                                int i215 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIE_GOAL_ACTION");
                                                break;
                                            case 4:
                                                int i39 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ADJUSTED_GOAL_ACTION");
                                                break;
                                            case 5:
                                                int i310 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_REMAINING_ACTION");
                                                break;
                                            case 6:
                                                int i311 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 7:
                                                int i312 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("RESTING_CALORIES_ACTION");
                                                break;
                                            case 8:
                                                int i313 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("TOTAL_CALORIES_ACTION");
                                                break;
                                            default:
                                                int i314 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ10);
                            }
                        }
                        rVar2.B(R.string.calories_total_label, null, false, (e23.a) objQ10, mVar2, 0, 6);
                        boolean zR10 = mVar2.r(aVar2);
                        Object objQ11 = mVar2.q();
                        if (zR10) {
                            final int i39 = 9;
                            objQ11 = new e23.a() { // from class: sy.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i211 = i39;
                                    com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                    switch (i211) {
                                        case 0:
                                            int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 1:
                                            int i213 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                        case 2:
                                            int i214 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_CONSUMED_ACTION");
                                            break;
                                        case 3:
                                            int i215 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIE_GOAL_ACTION");
                                            break;
                                        case 4:
                                            int i310 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ADJUSTED_GOAL_ACTION");
                                            break;
                                        case 5:
                                            int i311 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_REMAINING_ACTION");
                                            break;
                                        case 6:
                                            int i312 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("ACTIVE_CALORIES_ACTION");
                                            break;
                                        case 7:
                                            int i313 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("RESTING_CALORIES_ACTION");
                                            break;
                                        case 8:
                                            int i314 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("TOTAL_CALORIES_ACTION");
                                            break;
                                        default:
                                            int i315 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                            aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ11);
                        } else {
                            aVar.getClass();
                            if (objQ11 == p3.m.a.f135155b) {
                                final int i310 = 9;
                                objQ11 = new e23.a() { // from class: sy.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i211 = i310;
                                        com.garmin.android.apps.connectmobile.calories.presentation.a aVar3 = aVar2;
                                        switch (i211) {
                                            case 0:
                                                int i212 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 1:
                                                int i213 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                            case 2:
                                                int i214 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_CONSUMED_ACTION");
                                                break;
                                            case 3:
                                                int i215 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIE_GOAL_ACTION");
                                                break;
                                            case 4:
                                                int i311 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ADJUSTED_GOAL_ACTION");
                                                break;
                                            case 5:
                                                int i312 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_REMAINING_ACTION");
                                                break;
                                            case 6:
                                                int i313 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("ACTIVE_CALORIES_ACTION");
                                                break;
                                            case 7:
                                                int i314 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("RESTING_CALORIES_ACTION");
                                                break;
                                            case 8:
                                                int i315 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("TOTAL_CALORIES_ACTION");
                                                break;
                                            default:
                                                int i316 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                                                aVar3.e("CALORIES_DURING_ACTIVITY_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ11);
                            }
                        }
                        rVar2.B(R.string.lbl_calories_during_an_activity, null, false, (e23.a) objQ11, mVar2, 0, 6);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(r rVar, com.garmin.android.apps.connectmobile.calories.presentation.a aVar) {
        this.f161164c = rVar;
        this.f161163b = aVar;
    }
}
