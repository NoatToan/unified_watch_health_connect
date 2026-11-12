package yg1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceSettingsDTO f196915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f196916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<g> f196917c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<g> f196918d = new ArrayList<>();

    public f(DeviceSettingsDTO deviceSettingsDTO, boolean z14) {
        this.f196915a = deviceSettingsDTO;
        this.f196916b = z14;
        a();
    }

    public static g b(int i14, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (gVar.f196920b == i14) {
                return gVar;
            }
        }
        return null;
    }

    public final void a() {
        ArrayList<g> arrayList = this.f196917c;
        arrayList.clear();
        ArrayList<g> arrayList2 = this.f196918d;
        arrayList2.clear();
        for (g gVar : this.f196915a.f33905x) {
            if (this.f196916b && gVar.f196925g == R.string.device_settings_controls_menu_airplane_mode) {
                gVar.f196922d = 2131232695;
                gVar.f196925g = R.string.device_settings_controls_menu_4g_lte_control;
            }
            if (gVar.f196920b == 255 && !gVar.f196921c.booleanValue()) {
                arrayList2.add(gVar);
            } else if (!gVar.f196919a.equals("INVALID")) {
                arrayList.add(gVar);
            }
        }
    }
}
