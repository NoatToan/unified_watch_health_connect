package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class u1 extends fb2.z<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93415e;

    public u1(Context context) {
        super(context);
        this.f93415e = View.generateViewId();
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // fb2.z
    public final String q(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        String string = this.f70343a.getString(R.string.activity_options_running_mode_free_title);
        if (fVar2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        if (fVar2.R0() && fVar2.j1().booleanValue()) {
            return this.f70343a.getString(R.string.activity_options_running_mode_run_or_walk_title);
        }
        return (fVar2.V0() && fVar2.x1().booleanValue()) ? this.f70343a.getString(R.string.run_mode_alerts_setting_virtual_pacer) : string;
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s */
    public final int getF180417e() {
        return this.f93415e;
    }

    @Override // fb2.z
    public final String t() {
        return this.f70343a.getString(R.string.activity_options_running_mode_title);
    }
}
