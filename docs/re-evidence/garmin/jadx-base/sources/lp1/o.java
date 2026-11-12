package lp1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llp1/o;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f114185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f114186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f114187c;

    public o(View view2) {
        view2.getClass();
        this.f114185a = view2.getContext();
        this.f114186b = view2.findViewById(R.id.non_activity_ride_time_gained_container);
        this.f114187c = (TextView) view2.findViewById(R.id.non_activity_ride_time_gained_value);
    }
}
