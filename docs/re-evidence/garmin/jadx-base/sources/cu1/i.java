package cu1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcu1/i;", "Lcu1/o;", "Landroid/view/LayoutInflater;", "inflater", "<init>", "(Landroid/view/LayoutInflater;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f55681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f55682c;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(LayoutInflater layoutInflater) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm4_training_feed_completed, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f55681b = (ImageView) this.f55688a.findViewById(R.id.atp_dashboard_completed_state_icon);
        this.f55682c = (TextView) this.f55688a.findViewById(R.id.atp_dashboard_completed_state);
    }
}
