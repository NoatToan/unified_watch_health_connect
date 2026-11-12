package bv1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbv1/b;", "Lbv1/m;", "Landroid/view/LayoutInflater;", "inflater", "<init>", "(Landroid/view/LayoutInflater;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f21381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f21382d;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(LayoutInflater layoutInflater) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fbt_dashboard_activities, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f21380b = (TextView) this.f21420a.findViewById(R.id.header_title);
        this.f21381c = (ComposeView) this.f21420a.findViewById(R.id.activities_card_view);
        this.f21382d = this.f21420a.findViewById(R.id.activities_bottom_space);
    }
}
