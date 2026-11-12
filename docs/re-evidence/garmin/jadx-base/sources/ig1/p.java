package ig1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class p extends j0 {
    public p(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final View a() {
        View viewF = f(R.layout.gcm3_activity_options_gps_mode_field);
        ((TextView) viewF.findViewById(R.id.activity_options_gps_mode_header)).setText(this.f70343a.getString(R.string.activity_options_bike_mode_header));
        return viewF;
    }
}
