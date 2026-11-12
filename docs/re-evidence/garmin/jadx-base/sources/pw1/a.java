package pw1;

import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ITPDashboardActivity f141710b;

    public /* synthetic */ a(ITPDashboardActivity iTPDashboardActivity, int i14) {
        this.f141709a = i14;
        this.f141710b = iTPDashboardActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f141709a;
        ITPDashboardActivity iTPDashboardActivity = this.f141710b;
        switch (i14) {
            case 0:
                ITPDashboardActivity.a aVar = ITPDashboardActivity.f45618m;
                iTPDashboardActivity.na();
                return Unit.INSTANCE;
            case 1:
                ITPDashboardActivity.a aVar2 = ITPDashboardActivity.f45618m;
                iTPDashboardActivity.na();
                return Unit.INSTANCE;
            case 2:
                ITPDashboardActivity.a aVar3 = ITPDashboardActivity.f45618m;
                iTPDashboardActivity.qa();
                return Unit.INSTANCE;
            case 3:
                ITPDashboardActivity.a aVar4 = ITPDashboardActivity.f45618m;
                iTPDashboardActivity.pa();
                return Unit.INSTANCE;
            case 4:
                wt1.b bVar = iTPDashboardActivity.f45624j;
                if (bVar != null) {
                    bVar.e();
                    return Unit.INSTANCE;
                }
                s.m("errorViewHolder");
                throw null;
            case 5:
                ITPDashboardActivity.a aVar5 = ITPDashboardActivity.f45618m;
                iTPDashboardActivity.ra();
                return Unit.INSTANCE;
            case 6:
                ITPDashboardActivity.a aVar6 = ITPDashboardActivity.f45618m;
                iTPDashboardActivity.pa();
                return Unit.INSTANCE;
            default:
                g22.a.a(iTPDashboardActivity, null);
                return Unit.INSTANCE;
        }
    }
}
