package xk1;

import android.os.Bundle;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.PowerZonesConfigActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxk1/g;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PowerZonesConfigActivity f191228a;

    public g(PowerZonesConfigActivity powerZonesConfigActivity) {
        this.f191228a = powerZonesConfigActivity;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        PowerZonesConfigActivity powerZonesConfigActivity = this.f191228a;
        powerZonesConfigActivity.f44057b = -1L;
        if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
            sn.a.s("fetchConfigDTO: ", cVar.name(), i2.f36769a, a2.SETTINGS, "PowerZonesConfigActivity");
            Toast.makeText(powerZonesConfigActivity, R.string.txt_something_went_wrong_try_again, 0).show();
            powerZonesConfigActivity.finish();
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        eVar.getClass();
        obj.getClass();
        PowerZonesConfigActivity powerZonesConfigActivity = this.f191228a;
        powerZonesConfigActivity.f44057b = -1L;
        ok1.b bVar = (ok1.b) obj;
        powerZonesConfigActivity.f44056a = bVar;
        j.a aVar = j.M0;
        PowerZonesDTO powerZonesDTO = bVar.f132582a;
        powerZonesDTO.getClass();
        int i14 = powerZonesConfigActivity.f44059d;
        int i15 = powerZonesConfigActivity.f44060e;
        aVar.getClass();
        j jVar = new j();
        Bundle bundle = new Bundle(2);
        bundle.putParcelable("EXTRA_DTO", powerZonesDTO);
        bundle.putInt("EXTRA_CYCLING_FTP", i14);
        bundle.putInt("EXTRA_RUNNING_FTP", i15);
        jVar.setArguments(bundle);
        powerZonesConfigActivity.f44058c = jVar;
        androidx.fragment.app.v supportFragmentManager = powerZonesConfigActivity.getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        j jVar2 = powerZonesConfigActivity.f44058c;
        jVar2.getClass();
        aVarB.l(R.id.content_frame, jVar2, "powerZoneFragmentTag");
        aVarB.e();
        powerZonesConfigActivity.hideProgressOverlay();
    }
}
