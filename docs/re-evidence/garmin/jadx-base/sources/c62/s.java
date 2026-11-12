package c62;

import com.garmin.android.apps.connectmobile.workouts.presentation.details.ViewCompatibleActivityListActivity;
import i3.i7;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.i0 f24881b;

    public /* synthetic */ s(ww1.i0 i0Var, int i14) {
        this.f24880a = i14;
        this.f24881b = i0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f24880a;
        ww1.i0 i0Var = this.f24881b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ViewCompatibleActivityListActivity.a aVar = ViewCompatibleActivityListActivity.f48480a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    i7.b(i0Var.b().f4362e, null, null, 0L, mVar, 48, 12);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ViewCompatibleActivityListActivity.a aVar2 = ViewCompatibleActivityListActivity.f48480a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    i7.b(i0Var.b().f4362e, null, null, 0L, mVar2, 48, 12);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
