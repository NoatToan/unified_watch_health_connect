package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class e extends fb2.a<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f93298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.settings.devices.e.a f93299j;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93300a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.settings.devices.e.a.values().length];
            f93300a = iArr;
            try {
                iArr[com.garmin.android.apps.connectmobile.settings.devices.e.a.SWIMMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93300a[com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public e(Context context, com.garmin.android.apps.connectmobile.settings.devices.e.a aVar) {
        super(context);
        this.f93298i = View.generateViewId();
        this.f93299j = aVar;
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
        Context context = this.f70343a;
        int i14 = R.string.activity_options_auto_lap_footer;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = this.f93299j;
        if (aVar != null) {
            int i15 = a.f93300a[aVar.ordinal()];
            if (i15 == 1) {
                i14 = R.string.msg_auto_lap_500yd_500m;
            } else if (i15 == 2) {
                i14 = R.string.activity_options_auto_lap_5mi_footer;
            }
        }
        return context.getString(i14);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return this.f93298i;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.run_options_auto_lap);
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
