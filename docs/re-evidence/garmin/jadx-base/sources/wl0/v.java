package wl0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f186003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f186004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f186005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f186006d;

    public v(View view2) {
        this.f186003a = (ImageView) view2.findViewById(R.id.device_image);
        this.f186005c = (TextView) view2.findViewById(R.id.device_friendly_name);
        this.f186006d = (TextView) view2.findViewById(R.id.device_connection_status);
        this.f186004b = (ImageView) view2.findViewById(R.id.device_battery_level);
    }
}
