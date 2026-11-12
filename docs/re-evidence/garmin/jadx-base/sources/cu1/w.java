package cu1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcu1/w;", "Lcu1/o;", "Landroid/view/LayoutInflater;", "inflater", "Lcu1/l;", "actionListener", "<init>", "(Landroid/view/LayoutInflater;Lcu1/l;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f55715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f55716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f55717d;

    /* JADX WARN: Illegal instructions before constructor call */
    public w(LayoutInflater layoutInflater, l lVar) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm4_training_feed_schedule, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f55715b = lVar;
        View viewFindViewById = this.f55688a.findViewById(R.id.atp_dashboard_next_workout);
        viewFindViewById.getClass();
        this.f55716c = new p(viewFindViewById);
        View viewFindViewById2 = this.f55688a.findViewById(R.id.atp_dashboard_workout_schedule);
        viewFindViewById2.getClass();
        this.f55717d = new p(viewFindViewById2);
    }
}
