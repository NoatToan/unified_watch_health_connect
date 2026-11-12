package um;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lum/b;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f171983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f171984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f171985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f171986d;

    public b(View view2) {
        view2.getClass();
        this.f171983a = view2;
        this.f171984b = (LinearLayout) view2.findViewById(R.id.metricsContainer);
        this.f171985c = (TextView) view2.findViewById(R.id.highlight_date_time);
        this.f171986d = new ArrayList();
    }
}
