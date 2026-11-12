package lr2;

import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsActivity f114394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qs2.d f114395c;

    public /* synthetic */ h(DeviceSettingsActivity deviceSettingsActivity, qs2.d dVar, int i14) {
        this.f114393a = i14;
        this.f114394b = deviceSettingsActivity;
        this.f114395c = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f114393a;
        qs2.d dVar = this.f114395c;
        DeviceSettingsActivity deviceSettingsActivity = this.f114394b;
        switch (i14) {
            case 0:
                DeviceSettingsActivity.a aVar = DeviceSettingsActivity.f51993w;
                deviceSettingsActivity.f52002n = new h(deviceSettingsActivity, dVar, 1);
                deviceSettingsActivity.f52003o.a();
                break;
            case 1:
                DeviceSettingsActivity.a aVar2 = DeviceSettingsActivity.f51993w;
                xr2.a.f192031a.getClass();
                if (xr2.a.a()) {
                    deviceSettingsActivity.ha(dVar);
                } else {
                    br2.c.f19585a.a(new h(deviceSettingsActivity, dVar, 2), deviceSettingsActivity);
                }
                break;
            default:
                DeviceSettingsActivity.a aVar3 = DeviceSettingsActivity.f51993w;
                deviceSettingsActivity.ha(dVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
