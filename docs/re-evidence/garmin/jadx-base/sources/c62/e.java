package c62;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiSportsDetailsActivity f24719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WorkoutDetailsDTO f24720c;

    public /* synthetic */ e(WorkoutDetailsDTO workoutDetailsDTO, MultiSportsDetailsActivity multiSportsDetailsActivity, int i14) {
        this.f24718a = i14;
        this.f24720c = workoutDetailsDTO;
        this.f24719b = multiSportsDetailsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f24718a;
        MultiSportsDetailsActivity multiSportsDetailsActivity = this.f24719b;
        WorkoutDetailsDTO workoutDetailsDTO = this.f24720c;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.workouts.data.model.h0 h0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.h0) obj;
                ((Integer) obj2).getClass();
                MultiSportsDetailsActivity.a aVar = MultiSportsDetailsActivity.f48440z;
                h0Var.getClass();
                f.c<Intent> cVar = multiSportsDetailsActivity.f48463y;
                WorkoutDetailsActivity.a aVar2 = WorkoutDetailsActivity.f48482f;
                int segmentOrder = h0Var.getSegmentOrder();
                Long lValueOf = workoutDetailsDTO != null ? Long.valueOf(workoutDetailsDTO.f48040a) : null;
                String str = workoutDetailsDTO != null ? workoutDetailsDTO.K0 : null;
                boolean z14 = multiSportsDetailsActivity.ea().F;
                aVar2.getClass();
                Intent intent = new Intent(multiSportsDetailsActivity, (Class<?>) WorkoutDetailsActivity.class);
                intent.putExtra("extra_workout_segment_order", segmentOrder);
                if (lValueOf != null && lValueOf.longValue() > 0) {
                    intent.putExtra("GCM_workout_id", lValueOf.longValue());
                }
                if (str != null) {
                    intent.putExtra("EXTRA_SCHEDULE_WORKOUT_UUID", str);
                }
                intent.putExtra("EXTRA_IS_FBT_WORKOUT", z14);
                cVar.a(intent, null);
                break;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                MultiSportsDetailsActivity.a aVar3 = MultiSportsDetailsActivity.f48440z;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1778310865, new e(multiSportsDetailsActivity, workoutDetailsDTO, 7), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                MultiSportsDetailsActivity.a aVar4 = MultiSportsDetailsActivity.f48440z;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1763367558, new e(multiSportsDetailsActivity, workoutDetailsDTO, 6), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            case 3:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                MultiSportsDetailsActivity.a aVar5 = MultiSportsDetailsActivity.f48440z;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(400307645, new e(multiSportsDetailsActivity, workoutDetailsDTO, 10), mVar3), mVar3, 196608, 31);
                } else {
                    mVar3.e();
                }
                break;
            case 4:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                MultiSportsDetailsActivity.a aVar6 = MultiSportsDetailsActivity.f48440z;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-293657814, new e(workoutDetailsDTO, multiSportsDetailsActivity, 9), mVar4), mVar4, 196608, 31);
                } else {
                    mVar4.e();
                }
                break;
            case 5:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                MultiSportsDetailsActivity.a aVar7 = MultiSportsDetailsActivity.f48440z;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-728234990, new e(multiSportsDetailsActivity, workoutDetailsDTO, 8), mVar5), mVar5, 196608, 31);
                } else {
                    mVar5.e();
                }
                break;
            case 6:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                MultiSportsDetailsActivity.a aVar8 = MultiSportsDetailsActivity.f48440z;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    w52.l0.f(multiSportsDetailsActivity, workoutDetailsDTO.f48049j, workoutDetailsDTO.f48053m, mVar6, 0);
                } else {
                    mVar6.e();
                }
                break;
            case 7:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                MultiSportsDetailsActivity.a aVar9 = MultiSportsDetailsActivity.f48440z;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    w52.l0.f(multiSportsDetailsActivity, workoutDetailsDTO.f48049j, workoutDetailsDTO.f48053m, mVar7, 0);
                } else {
                    mVar7.e();
                }
                break;
            case 8:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                MultiSportsDetailsActivity.a aVar10 = MultiSportsDetailsActivity.f48440z;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    w52.q0.a(this.f24719b, workoutDetailsDTO.Z, workoutDetailsDTO.f48051k0, mVar8, 0);
                } else {
                    mVar8.e();
                }
                break;
            case 9:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                MultiSportsDetailsActivity.a aVar11 = MultiSportsDetailsActivity.f48440z;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    if (workoutDetailsDTO == null) {
                        mVar9.C(488492633);
                        mVar9.f();
                    } else {
                        mVar9.C(488492634);
                        com.garmin.android.apps.connectmobile.workouts.data.model.a aVarC = workoutDetailsDTO.C();
                        String str2 = ((w52.e) multiSportsDetailsActivity.f48461w.getValue()).f182503c;
                        boolean zR = mVar9.r(multiSportsDetailsActivity);
                        Object objQ = mVar9.q();
                        if (zR) {
                            objQ = new MultiSportsDetailsActivity.g(multiSportsDetailsActivity);
                            mVar9.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new MultiSportsDetailsActivity.g(multiSportsDetailsActivity);
                                mVar9.K(objQ);
                            }
                        }
                        w52.s0.a(aVarC, str2, (e23.q) ((k23.g) objQ), mVar9, com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                break;
            default:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                MultiSportsDetailsActivity.a aVar12 = MultiSportsDetailsActivity.f48440z;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    w52.l0.g(multiSportsDetailsActivity, workoutDetailsDTO.f48049j, mVar10, 0);
                } else {
                    mVar10.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(MultiSportsDetailsActivity multiSportsDetailsActivity, WorkoutDetailsDTO workoutDetailsDTO, int i14) {
        this.f24718a = i14;
        this.f24719b = multiSportsDetailsActivity;
        this.f24720c = workoutDetailsDTO;
    }
}
