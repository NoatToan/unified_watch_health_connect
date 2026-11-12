package ms0;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lms0/h;", "", "Landroid/view/View;", "searchStatusView", "<init>", "(Landroid/view/View;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f120477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f120478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f120479c;

    public h(View view2) {
        view2.getClass();
        this.f120477a = view2;
        View viewFindViewById = view2.findViewById(R.id.loading_indicator);
        viewFindViewById.getClass();
        this.f120478b = (ProgressBar) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.status_message);
        viewFindViewById2.getClass();
        this.f120479c = (TextView) viewFindViewById2;
    }
}
