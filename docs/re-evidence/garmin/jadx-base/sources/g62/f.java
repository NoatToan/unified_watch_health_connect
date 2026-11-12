package g62;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import p005kotlin.Unit;
import p3.x1;
import w52.l0;
import w52.y1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutDetailsDTO f76079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b f76080c;

    public /* synthetic */ f(WorkoutDetailsDTO workoutDetailsDTO, com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar) {
        this.f76078a = 1;
        this.f76079b = workoutDetailsDTO;
        this.f76080c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f76078a;
        WorkoutDetailsDTO workoutDetailsDTO = this.f76079b;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar = this.f76080c;
        int i15 = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    l0.h(bVar, workoutDetailsDTO != null ? workoutDetailsDTO.f48049j : null, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String str = workoutDetailsDTO != null ? workoutDetailsDTO.f48046g : null;
                    boolean zR = mVar2.r(bVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new g(bVar, i15);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new g(bVar, i15);
                            mVar2.K(objQ);
                        }
                    }
                    y1.a(384, 0, (e23.l) objQ, str, mVar2, false);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-431520058, new f(bVar, workoutDetailsDTO, i15), mVar3), mVar3, 196608, 31);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar, WorkoutDetailsDTO workoutDetailsDTO, int i14) {
        this.f76078a = i14;
        this.f76080c = bVar;
        this.f76079b = workoutDetailsDTO;
    }
}
