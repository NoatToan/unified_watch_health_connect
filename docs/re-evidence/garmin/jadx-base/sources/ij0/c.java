package ij0;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import e23.p;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GarminPayLaunchScreenActivity f93816b;

    public /* synthetic */ c(GarminPayLaunchScreenActivity garminPayLaunchScreenActivity, int i14) {
        this.f93815a = i14;
        this.f93816b = garminPayLaunchScreenActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f93815a;
        GarminPayLaunchScreenActivity garminPayLaunchScreenActivity = this.f93816b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.intValue();
                GarminPayLaunchScreenActivity.a aVar = GarminPayLaunchScreenActivity.f35305d;
                dialogInterface.getClass();
                garminPayLaunchScreenActivity.finish();
                dialogInterface.dismiss();
                break;
            default:
                num.getClass();
                GarminPayLaunchScreenActivity.a aVar2 = GarminPayLaunchScreenActivity.f35305d;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                garminPayLaunchScreenActivity.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
