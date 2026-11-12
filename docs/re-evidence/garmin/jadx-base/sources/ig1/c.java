package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class c extends fb2.z<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93288e;

    public c(Context context) {
        super(context);
        this.f93288e = View.generateViewId();
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
    public final String q(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (fVar2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        if (fVar2.v1().booleanValue()) {
            sb3.append(this.f70343a.getString(R.string.lbl_time));
        }
        if (fVar2.e1().booleanValue()) {
            if (sb3.length() > 0) {
                sb3.append(", ");
            }
            sb3.append(this.f70343a.getString(R.string.lbl_distance));
        }
        if (fVar2.c1().booleanValue()) {
            if (sb3.length() > 0) {
                sb3.append(", ");
            }
            sb3.append(this.f70343a.getString(R.string.lbl_calories));
        }
        if (fVar2.h1().booleanValue()) {
            if (sb3.length() > 0) {
                sb3.append(", ");
            }
            sb3.append(this.f70343a.getString(R.string.lbl_heart_rate_cap));
        }
        if (fVar2.t1().booleanValue()) {
            if (sb3.length() > 0) {
                sb3.append(", ");
            }
            sb3.append(this.f70343a.getString(R.string.strength_training_reps));
        }
        return sb3.length() > 0 ? sb3.toString() : this.f70343a.getString(R.string.lbl_off);
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s */
    public final int getF180417e() {
        return this.f93288e;
    }

    @Override // fb2.z
    public final String t() {
        return this.f70343a.getString(R.string.device_alerts);
    }
}
