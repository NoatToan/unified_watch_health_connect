package aq;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laq/w;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f12271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f12272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f12273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f12274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f12275f;

    public w(View view2) {
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.exercises_metric_3_header);
        viewFindViewById.getClass();
        this.f12270a = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.exercises_header_title);
        viewFindViewById2.getClass();
        this.f12271b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.exercises_metric_1_header_title);
        viewFindViewById3.getClass();
        this.f12272c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.exercises_metric_2_header_title);
        viewFindViewById4.getClass();
        this.f12273d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.exercises_metric_3_header_title);
        viewFindViewById5.getClass();
        this.f12274e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.exercises_metric_3_header_subtitle);
        viewFindViewById6.getClass();
        this.f12275f = (TextView) viewFindViewById6;
    }
}
