package lr2;

import android.content.DialogInterface;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import l30.i0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsActivity f114390b;

    public /* synthetic */ f(DeviceSettingsActivity deviceSettingsActivity, int i14) {
        this.f114389a = i14;
        this.f114390b = deviceSettingsActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f114389a;
        DeviceSettingsActivity deviceSettingsActivity = this.f114390b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        DeviceSettingsActivity.a aVar = DeviceSettingsActivity.f51993w;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                deviceSettingsActivity.getClass();
                deviceSettingsActivity.f52002n = new i0(17, deviceSettingsActivity, new d(deviceSettingsActivity, 5));
                deviceSettingsActivity.f52003o.a();
                return Unit.INSTANCE;
            case 1:
                dialogInterface.getClass();
                mr2.d dVar = deviceSettingsActivity.f51997i;
                if (dVar == null) {
                    p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                    throw null;
                }
                if (dVar.c1().d() == js2.e.LOCKED_WALLET) {
                    deviceSettingsActivity.fa();
                } else {
                    deviceSettingsActivity.f52002n = new d(deviceSettingsActivity, 4);
                    deviceSettingsActivity.f52003o.a();
                }
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            default:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                deviceSettingsActivity.f52002n = new i0(17, deviceSettingsActivity, new d(deviceSettingsActivity, 5));
                deviceSettingsActivity.f52003o.a();
                return Unit.INSTANCE;
        }
    }
}
