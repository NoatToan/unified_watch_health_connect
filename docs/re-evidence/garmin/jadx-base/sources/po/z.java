package po;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.r1;
import com.garmin.android.apps.connectmobile.r2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z extends r1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.h f138998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f138999f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r2 f139000g;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f139000g = (r2) activity;
        } catch (ClassCastException unused) {
            p6.b.m(activity.toString(), r2.class.getName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f138999f = arguments.getLong("GCM_extra_activity_id", -1L);
            if (arguments.containsKey("GCM_extra_activity_summary")) {
                this.f138998e = (com.garmin.android.apps.connectmobile.activities.newmodel.h) arguments.getParcelable("GCM_extra_activity_summary");
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r1, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        new rs.j(view2.findViewById(R.id.activity_stats_weather_widget));
    }

    @Override // com.garmin.android.apps.connectmobile.r1, com.garmin.android.apps.connectmobile.w1
    public final View u6(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.activity_stats_map_preview_section_3_0, viewGroup, false);
    }
}
