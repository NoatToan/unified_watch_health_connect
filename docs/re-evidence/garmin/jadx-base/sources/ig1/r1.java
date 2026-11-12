package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class r1 extends fb2.z<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f93398f;

    public r1(Context context) {
        super(context);
        this.f93397e = View.generateViewId();
        this.f93398f = this.f70343a.getString(R.string.run_options_run_mode_alerts);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        if (fVar != null) {
            return fVar.L0();
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s */
    public final int getF180417e() {
        return this.f93397e;
    }

    @Override // fb2.z
    public String t() {
        return this.f93398f;
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public String q(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        if (fVar != null) {
            return (fVar.j1().booleanValue() || fVar.x1().booleanValue() || fVar.e1().booleanValue() || fVar.v1().booleanValue() || fVar.c1().booleanValue() || fVar.t1().booleanValue() || fVar.h1().booleanValue()) ? this.f70343a.getString(R.string.lbl_on) : this.f70343a.getString(R.string.lbl_off);
        }
        vb.h.s("Model is required");
        return null;
    }
}
