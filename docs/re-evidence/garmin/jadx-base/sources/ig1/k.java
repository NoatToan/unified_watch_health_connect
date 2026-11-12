package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class k extends fb2.a<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f93350i;

    public k(Context context) {
        super(context);
        this.f93350i = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        if (fVar != null) {
            return fVar.f34132b.containsKey("autoLapEnabled");
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (fVar2 != null) {
            return fVar2.Z0().booleanValue();
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final String r() {
        return this.f70343a.getString(R.string.auto_rest_footer);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71595i() {
        return this.f93350i;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.strength_training_auto_set_lbl);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        if (fVar != null) {
            fVar.y1("autoLapEnabled", Boolean.valueOf(z14));
        } else {
            vb.h.s("Model is required");
        }
    }
}
