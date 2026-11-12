package f62;

import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesActivity;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutEditNotesActivity f69285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f69286c;

    public /* synthetic */ m0(WorkoutEditNotesActivity workoutEditNotesActivity, boolean z14, int i14) {
        this.f69284a = i14;
        this.f69285b = workoutEditNotesActivity;
        this.f69286c = z14;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f69284a;
        WorkoutEditNotesActivity workoutEditNotesActivity = this.f69285b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                WorkoutEditNotesActivity.a aVar = WorkoutEditNotesActivity.f48867c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-34464531, new m0(workoutEditNotesActivity, this.f69286c, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                WorkoutEditNotesActivity.a aVar2 = WorkoutEditNotesActivity.f48867c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(workoutEditNotesActivity.ca().f49000b, mVar2);
                    p1 p1VarC2 = s9.c.c(workoutEditNotesActivity.ca().f49002d, mVar2);
                    String str = (String) p1VarC.getF182175a();
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.h0 h0VarCa = workoutEditNotesActivity.ca();
                    boolean zR = mVar2.r(h0VarCa);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new WorkoutEditNotesActivity.c(h0VarCa);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new WorkoutEditNotesActivity.c(h0VarCa);
                            mVar2.K(objQ);
                        }
                    }
                    e23.l lVar = (e23.l) ((k23.g) objQ);
                    com.garmin.android.apps.connectmobile.workouts.data.model.a aVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) p1VarC2.getF182175a();
                    String str2 = ((w52.e) workoutEditNotesActivity.f48869b.getValue()).f182503c;
                    boolean zR2 = mVar2.r(workoutEditNotesActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new et1.v(workoutEditNotesActivity, 5);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new et1.v(workoutEditNotesActivity, 5);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.q qVar = (e23.q) objQ2;
                    boolean zR3 = mVar2.r(workoutEditNotesActivity);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new dh1.a(workoutEditNotesActivity, 27);
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new dh1.a(workoutEditNotesActivity, 27);
                            mVar2.K(objQ3);
                        }
                    }
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.g0.a(str, lVar, this.f69286c, aVar4, str2, qVar, (e23.p) objQ3, new WorkoutEditNotesActivity.d(workoutEditNotesActivity.ca().f49004f), mVar2, com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d << 9);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
