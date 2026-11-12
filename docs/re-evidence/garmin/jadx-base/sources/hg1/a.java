package hg1;

import android.widget.LinearLayout;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.activityoptions.DisplayBacklightActivity;

/* JADX INFO: loaded from: classes10.dex */
public class a implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DisplayBacklightActivity f83673a;

    public a(DisplayBacklightActivity displayBacklightActivity) {
        this.f83673a = displayBacklightActivity;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "DisplayBacklightActivity");
        lj0.b bVar2 = lj0.b.f112951e;
        DisplayBacklightActivity displayBacklightActivity = this.f83673a;
        if (bVar != bVar2) {
            Toast.makeText(displayBacklightActivity, R.string.txt_error_occurred, 0).show();
        }
        displayBacklightActivity.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        DisplayBacklightActivity displayBacklightActivity = this.f83673a;
        displayBacklightActivity.hideProgressOverlay();
        displayBacklightActivity.f41630e = (DeviceSettingsDTO) obj;
        if (obj == null) {
            a(lj0.b.f112956j);
        }
        LinearLayout linearLayout = (LinearLayout) displayBacklightActivity.findViewById(R.id.page_content);
        linearLayout.addView(fb2.g.a(displayBacklightActivity));
        for (fb2.e eVar : displayBacklightActivity.f41627b) {
            linearLayout.addView(eVar.a());
            boolean zG = eVar.g(displayBacklightActivity, displayBacklightActivity.f41630e);
            eVar.addObserver(displayBacklightActivity);
            eVar.m(zG);
        }
        linearLayout.addView(fb2.g.a(displayBacklightActivity));
    }
}
