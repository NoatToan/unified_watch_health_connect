package cu1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcu1/h;", "Lcu1/o;", "Landroid/view/LayoutInflater;", "inflater", "Lcu1/g;", "actionListener", "<init>", "(Landroid/view/LayoutInflater;Lcu1/g;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f55676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f55677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f55678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f55679e;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(LayoutInflater layoutInflater, g gVar) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm4_training_feed_coach_action, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f55676b = gVar;
        this.f55677c = (TextView) this.f55688a.findViewById(R.id.atp_dashboard_coach_info);
        this.f55678d = (TextView) this.f55688a.findViewById(R.id.atp_dashboard_description);
        this.f55679e = (LinearLayout) this.f55688a.findViewById(R.id.atp_dashboard_coach_action_containers);
    }
}
