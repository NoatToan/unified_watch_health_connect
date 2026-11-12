package pf0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgActivitiesListFragment;
import f72.j0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EcgActivitiesListFragment f137477b;

    public /* synthetic */ e(EcgActivitiesListFragment ecgActivitiesListFragment, int i14) {
        this.f137476a = i14;
        this.f137477b = ecgActivitiesListFragment;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f137476a;
        EcgActivitiesListFragment ecgActivitiesListFragment = this.f137477b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-409086011, new e(ecgActivitiesListFragment, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = j0.a(t62.c.f162799a);
                    String string = ecgActivitiesListFragment.getString(R.string.msg_no_ecg_data_available);
                    String string2 = ecgActivitiesListFragment.getString(R.string.msg_sync_for_ecg_recordings);
                    string2.getClass();
                    b82.n.c(dVarA, string, string2, null, null, mVar2, 0, 24);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
