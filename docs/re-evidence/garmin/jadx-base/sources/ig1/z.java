package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class z extends fb2.a<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f93430i;

    public z(Context context) {
        super(context);
        this.f93430i = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        if (fVar != null) {
            return fVar.f34132b.containsKey("timeDateEnabled");
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        Boolean bool;
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (fVar2 == null) {
            vb.h.s("Model is required");
            return false;
        }
        HashMap<String, Object> map = fVar2.f34132b;
        if (map.containsKey("timeDateEnabled")) {
            Object obj = map.get("timeDateEnabled");
            obj.getClass();
            bool = (Boolean) obj;
        } else {
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    @Override // fb2.a
    public final int s() {
        return this.f93430i;
    }

    @Override // fb2.a
    public String t() {
        return this.f70343a.getString(R.string.weather_time_label) + " & " + this.f70343a.getString(R.string.txt_date);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        if (fVar != null) {
            fVar.y1("timeDateEnabled", Boolean.valueOf(z14));
        } else {
            vb.h.s("Model is required");
        }
    }
}
