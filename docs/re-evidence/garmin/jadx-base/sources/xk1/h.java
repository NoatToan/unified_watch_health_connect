package xk1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesConfigActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxk1/h;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PowerZonesConfigActivity f191229a;

    public h(PowerZonesConfigActivity powerZonesConfigActivity) {
        this.f191229a = powerZonesConfigActivity;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        PowerZonesConfigActivity powerZonesConfigActivity = this.f191229a;
        powerZonesConfigActivity.hideProgressOverlay();
        if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA || cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
            PowerZonesConfigActivity.a aVar = PowerZonesConfigActivity.f44055i;
            Toast.makeText(powerZonesConfigActivity, R.string.msg_settings_saved_successfully, 0).show();
            powerZonesConfigActivity.finish();
        } else {
            PowerZonesConfigActivity.a aVar2 = PowerZonesConfigActivity.f44055i;
            Toast.makeText(powerZonesConfigActivity, R.string.txt_something_went_wrong_try_again, 0).show();
            powerZonesConfigActivity.finish();
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        eVar.getClass();
        obj.getClass();
    }
}
