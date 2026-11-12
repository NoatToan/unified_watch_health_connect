package hq;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.DetailedMuscleMapActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DetailedMuscleMapActivity f84949b;

    public /* synthetic */ a(DetailedMuscleMapActivity detailedMuscleMapActivity, int i14) {
        this.f84948a = i14;
        this.f84949b = detailedMuscleMapActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f84948a;
        DetailedMuscleMapActivity detailedMuscleMapActivity = this.f84949b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                DetailedMuscleMapActivity.a aVar = DetailedMuscleMapActivity.f29817b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(246209663, new a(detailedMuscleMapActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                DetailedMuscleMapActivity.a aVar2 = DetailedMuscleMapActivity.f29817b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.d.a(false, z3.f.c(-1958698662, new a(detailedMuscleMapActivity, i15), mVar2), null, null, null, z3.f.c(1264440534, new a(detailedMuscleMapActivity, 3), mVar2), mVar2, 196656, 29);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                DetailedMuscleMapActivity.a aVar3 = DetailedMuscleMapActivity.f29817b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar3, R.string.lbl_detailed_muscle_view);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("title", strQ);
                    b92.a aVarB = c0235a.b();
                    boolean zR = mVar3.r(detailedMuscleMapActivity);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new h62.j(detailedMuscleMapActivity, 11);
                        mVar3.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h62.j(detailedMuscleMapActivity, 11);
                            mVar3.K(objQ);
                        }
                    }
                    int i17 = b92.a.f16960b;
                    z02.f.c(0, 38, aVarB, (e23.a) objQ, null, strQ, mVar3, null);
                } else {
                    mVar3.e();
                }
                break;
            default:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                DetailedMuscleMapActivity.a aVar4 = DetailedMuscleMapActivity.f29817b;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    c.a((e) detailedMuscleMapActivity.f29818a.getValue(), mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
