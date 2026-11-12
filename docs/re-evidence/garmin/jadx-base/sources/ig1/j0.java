package ig1;

import android.content.Context;
import bs2.gf;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j0 extends fb2.e<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f93347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f93348e;

    static {
        HashMap map = new HashMap();
        f93347d = map;
        map.put(gf.OFF, Integer.valueOf(R.id.activity_options_gps_mode_off));
        map.put(gf.GPS, Integer.valueOf(R.id.activity_options_gps_mode_on));
        f93348e = R.id.activity_options_gps_mode_section;
    }

    public j0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        this.f70345c = new fb2.c(cVar.findViewById(f93348e), cVar, new i0(this));
        return k(fVar);
    }

    @Override // fb2.e
    public final boolean h(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (fVar2 != null) {
            return fVar2.f34132b.containsKey("gpsMode");
        }
        vb.h.s("Model is required");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        if (fVar == 0) {
            vb.h.s("Model is required");
            return false;
        }
        if (!d()) {
            vb.h.s("View decorator is not found. Please call initialize() first before calling update().");
            return false;
        }
        this.f70344b = fVar;
        boolean zContainsKey = fVar.f34132b.containsKey("gpsMode");
        if (zContainsKey) {
            ((fb2.c) this.f70345c).k(fVar.e0(), f93347d);
        }
        return zContainsKey;
    }
}
