package ij0;

import android.content.Intent;
import android.net.Uri;
import aq2.j;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import eo2.d;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GarminPayLaunchScreenActivity f93814b;

    public /* synthetic */ b(GarminPayLaunchScreenActivity garminPayLaunchScreenActivity, int i14) {
        this.f93813a = i14;
        this.f93814b = garminPayLaunchScreenActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f93813a;
        GarminPayLaunchScreenActivity garminPayLaunchScreenActivity = this.f93814b;
        switch (i14) {
            case 0:
                GarminPayLaunchScreenActivity.a aVar = GarminPayLaunchScreenActivity.f35305d;
                kj0.c cVar = kj0.c.f104941a;
                kj0.c.a aVar2 = kj0.c.a.ON_RE_INIT;
                cVar.getClass();
                kj0.c.c(garminPayLaunchScreenActivity, true, aVar2);
                break;
            case 1:
                GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                garminPayLaunchScreenActivity.finish();
                break;
            case 2:
                GarminPayLaunchScreenActivity.a aVar4 = GarminPayLaunchScreenActivity.f35305d;
                garminPayLaunchScreenActivity.finish();
                break;
            case 3:
                GarminPayLaunchScreenActivity.a aVar5 = GarminPayLaunchScreenActivity.f35305d;
                garminPayLaunchScreenActivity.finish();
                break;
            case 4:
                GarminPayLaunchScreenActivity.a aVar6 = GarminPayLaunchScreenActivity.f35305d;
                garminPayLaunchScreenActivity.finish();
                break;
            case 5:
                GarminPayLaunchScreenActivity.a aVar7 = GarminPayLaunchScreenActivity.f35305d;
                garminPayLaunchScreenActivity.finish();
                break;
            case 6:
                GarminPayLaunchScreenActivity.a aVar8 = GarminPayLaunchScreenActivity.f35305d;
                j jVar = j.f12491a;
                kj0.b.f104940a.getClass();
                zi2.a aVarA = kj0.b.a();
                jVar.getClass();
                garminPayLaunchScreenActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(j.c(aVarA))));
                wr2.j.f186862a.getClass();
                wr2.j.b("EcomMainActivity.showMaintenanceAlertDialog(), positiveAction");
                d.f64794a.getClass();
                d.c(garminPayLaunchScreenActivity);
                break;
            default:
                GarminPayLaunchScreenActivity.a aVar9 = GarminPayLaunchScreenActivity.f35305d;
                wr2.j.f186862a.getClass();
                wr2.j.b("EcomMainActivity.showMaintenanceAlertDialog(), negativeAction");
                d.f64794a.getClass();
                d.c(garminPayLaunchScreenActivity);
                break;
        }
        return Unit.INSTANCE;
    }
}
