package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class v1 extends fb2.t<com.garmin.android.apps.connectmobile.devices.model.f, hg1.k> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93420e;

    public v1(Context context) {
        super(context);
        this.f93420e = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        if (fVar != null) {
            return fVar.f34132b.containsKey("speedType");
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<hg1.k, CharSequence> q(hg1.k[] kVarArr) {
        hg1.k[] kVarArr2 = kVarArr;
        HashMap map = new HashMap();
        if (kVarArr2 != null) {
            for (hg1.k kVar : kVarArr2) {
                map.put(kVar, this.f70343a.getString(kVar.f83713b));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final hg1.k r(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (fVar2 != null) {
            return fVar2.x0();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return this.f93420e;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.run_options_pace_speed_selection);
    }

    @Override // fb2.t
    public final hg1.k[] v(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        return new hg1.k[]{hg1.k.DATA_FIELD_SPEED, hg1.k.DATA_FIELD_PACE};
    }

    @Override // fb2.t
    public final void w(hg1.k kVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        hg1.k kVar2 = kVar;
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (fVar2 != null) {
            fVar2.U1(kVar2);
        } else {
            vb.h.s("Model is required");
        }
    }
}
