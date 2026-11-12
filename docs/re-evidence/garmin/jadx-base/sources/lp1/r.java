package lp1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import r22.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llp1/r;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f114194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f114195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f114196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x1 f114197d;

    public r(View view2) {
        view2.getClass();
        this.f114194a = view2.findViewById(R.id.ride_time_gained_container);
        this.f114195b = (TextView) view2.findViewById(R.id.ride_time_gained_value);
        Context context = view2.getContext();
        context.getClass();
        this.f114196c = new i(context);
        this.f114197d = new x1(context);
    }
}
