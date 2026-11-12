package h62;

import com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity;
import o53.f0;
import p005kotlin.Unit;
import p3.x1;
import w52.t0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutListActivity f82208b;

    public /* synthetic */ b(WorkoutListActivity workoutListActivity, int i14) {
        this.f82207a = i14;
        this.f82208b = workoutListActivity;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82207a;
        WorkoutListActivity workoutListActivity = this.f82208b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                WorkoutListActivity.a aVar = WorkoutListActivity.f49414i;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(858000813, new b(workoutListActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                WorkoutListActivity.a aVar2 = WorkoutListActivity.f49414i;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) f0.F(workoutListActivity.ma().f82260l, Boolean.FALSE, mVar2, 48).getF182175a()).booleanValue();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zBooleanValue) {
                        mVar2.C(1351976439);
                        i.a supportActionBar = workoutListActivity.getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.g();
                        }
                        boolean zR = mVar2.r(workoutListActivity);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new c(workoutListActivity, 1);
                            mVar2.K(objQ);
                        } else {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new c(workoutListActivity, 1);
                                mVar2.K(objQ);
                            }
                        }
                        t0.a((e23.a) objQ, mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(1352115288);
                        m mVarMa = workoutListActivity.ma();
                        boolean zBooleanValue2 = ((Boolean) workoutListActivity.f49416f.getValue()).booleanValue();
                        boolean zR2 = mVar2.r(workoutListActivity);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new WorkoutListActivity.c(workoutListActivity);
                            mVar2.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new WorkoutListActivity.c(workoutListActivity);
                                mVar2.K(objQ2);
                            }
                        }
                        e23.a aVar4 = (e23.a) ((k23.g) objQ2);
                        boolean zR3 = mVar2.r(workoutListActivity);
                        Object objQ3 = mVar2.q();
                        if (zR3) {
                            objQ3 = new WorkoutListActivity.d(workoutListActivity);
                            mVar2.K(objQ3);
                        } else {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new WorkoutListActivity.d(workoutListActivity);
                                mVar2.K(objQ3);
                            }
                        }
                        e23.a aVar5 = (e23.a) ((k23.g) objQ3);
                        boolean zR4 = mVar2.r(workoutListActivity);
                        Object objQ4 = mVar2.q();
                        if (zR4) {
                            objQ4 = new WorkoutListActivity.e(workoutListActivity);
                            mVar2.K(objQ4);
                        } else {
                            aVar3.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new WorkoutListActivity.e(workoutListActivity);
                                mVar2.K(objQ4);
                            }
                        }
                        e23.a aVar6 = (e23.a) ((k23.g) objQ4);
                        boolean zR5 = mVar2.r(workoutListActivity);
                        Object objQ5 = mVar2.q();
                        if (zR5) {
                            objQ5 = new WorkoutListActivity.f(workoutListActivity);
                            mVar2.K(objQ5);
                        } else {
                            aVar3.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new WorkoutListActivity.f(workoutListActivity);
                                mVar2.K(objQ5);
                            }
                        }
                        k.g(mVarMa, zBooleanValue2, aVar4, aVar5, aVar6, (e23.l) ((k23.g) objQ5), mVar2, 0);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
