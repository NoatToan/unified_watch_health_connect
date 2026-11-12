package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class y extends fb2.m<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f93427f;

    public y(Context context) {
        super(context);
        this.f93427f = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        return ((com.garmin.android.apps.connectmobile.devices.model.f) obj).P0();
    }

    @Override // fb2.m, fb2.e
    public final boolean k(Object obj) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        super.k(fVar);
        return fVar.P0();
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF180422f() {
        return this.f93427f;
    }

    @Override // fb2.m
    public final String u() {
        return this.f70343a.getString(R.string.run_options_data_fields);
    }
}
