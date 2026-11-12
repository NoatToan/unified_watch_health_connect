package rs;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrs/j;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f154323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f154324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f154325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f154326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f154327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f154328f;

    public j(View view2) {
        view2.getClass();
        this.f154323a = view2;
        View viewFindViewById = view2.findViewById(R.id.weather_humidity_text);
        viewFindViewById.getClass();
        View viewFindViewById2 = view2.findViewById(R.id.weather_temperature_text);
        viewFindViewById2.getClass();
        this.f154324b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.weather_wind_speed);
        viewFindViewById3.getClass();
        this.f154325c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.weather_wind_circle_image);
        viewFindViewById4.getClass();
        this.f154326d = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.weather_image);
        viewFindViewById5.getClass();
        this.f154327e = (ImageView) viewFindViewById5;
        Context context = view2.getContext();
        context.getClass();
        this.f154328f = new i(new l22.a(context));
    }
}
