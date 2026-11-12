package cg1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcg1/s;", "", "Landroid/view/ViewGroup;", "view", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f27179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserLevelImageView f27180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f27181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f27182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f27183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewGroup f27184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UserLevelImageView f27185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f27186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f27187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f27188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewGroup f27189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UserLevelImageView f27190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f27191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f27192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f27193o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f27194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ViewGroup f27195q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final UserLevelImageView f27196r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f27197s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f27198t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f27199u;

    public s(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewFindViewById = viewGroup.findViewById(R.id.segments_leaders_snapshot_1st);
        viewFindViewById.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        this.f27179a = viewGroup2;
        View viewFindViewById2 = viewGroup2.findViewById(R.id.leader_snapshot_profile_picture);
        viewFindViewById2.getClass();
        this.f27180b = (UserLevelImageView) viewFindViewById2;
        View viewFindViewById3 = viewGroup2.findViewById(R.id.leader_snapshot_rank);
        viewFindViewById3.getClass();
        this.f27181c = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup2.findViewById(R.id.leader_snapshot_name);
        viewFindViewById4.getClass();
        this.f27182d = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewGroup2.findViewById(R.id.leader_snapshot_time);
        viewFindViewById5.getClass();
        this.f27183e = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.segments_leaders_snapshot_2nd);
        viewFindViewById6.getClass();
        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById6;
        this.f27184f = viewGroup3;
        View viewFindViewById7 = viewGroup3.findViewById(R.id.leader_snapshot_profile_picture);
        viewFindViewById7.getClass();
        this.f27185g = (UserLevelImageView) viewFindViewById7;
        View viewFindViewById8 = viewGroup3.findViewById(R.id.leader_snapshot_rank);
        viewFindViewById8.getClass();
        this.f27186h = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewGroup3.findViewById(R.id.leader_snapshot_name);
        viewFindViewById9.getClass();
        this.f27187i = (TextView) viewFindViewById9;
        View viewFindViewById10 = viewGroup3.findViewById(R.id.leader_snapshot_time);
        viewFindViewById10.getClass();
        this.f27188j = (TextView) viewFindViewById10;
        View viewFindViewById11 = viewGroup.findViewById(R.id.segments_leaders_snapshot_3rd);
        viewFindViewById11.getClass();
        ViewGroup viewGroup4 = (ViewGroup) viewFindViewById11;
        this.f27189k = viewGroup4;
        View viewFindViewById12 = viewGroup4.findViewById(R.id.leader_snapshot_profile_picture);
        viewFindViewById12.getClass();
        this.f27190l = (UserLevelImageView) viewFindViewById12;
        View viewFindViewById13 = viewGroup4.findViewById(R.id.leader_snapshot_rank);
        viewFindViewById13.getClass();
        this.f27191m = (TextView) viewFindViewById13;
        View viewFindViewById14 = viewGroup4.findViewById(R.id.leader_snapshot_name);
        viewFindViewById14.getClass();
        this.f27192n = (TextView) viewFindViewById14;
        View viewFindViewById15 = viewGroup4.findViewById(R.id.leader_snapshot_time);
        viewFindViewById15.getClass();
        this.f27193o = (TextView) viewFindViewById15;
        View viewFindViewById16 = viewGroup.findViewById(R.id.segments_leaders_snapshot_me_container);
        viewFindViewById16.getClass();
        this.f27194p = viewFindViewById16;
        View viewFindViewById17 = viewGroup.findViewById(R.id.segments_leaders_snapshot_me);
        viewFindViewById17.getClass();
        ViewGroup viewGroup5 = (ViewGroup) viewFindViewById17;
        this.f27195q = viewGroup5;
        View viewFindViewById18 = viewGroup5.findViewById(R.id.leader_snapshot_profile_picture);
        viewFindViewById18.getClass();
        this.f27196r = (UserLevelImageView) viewFindViewById18;
        View viewFindViewById19 = viewGroup5.findViewById(R.id.leader_snapshot_rank);
        viewFindViewById19.getClass();
        this.f27197s = (TextView) viewFindViewById19;
        View viewFindViewById20 = viewGroup5.findViewById(R.id.leader_snapshot_name);
        viewFindViewById20.getClass();
        this.f27198t = (TextView) viewFindViewById20;
        View viewFindViewById21 = viewGroup5.findViewById(R.id.leader_snapshot_time);
        viewFindViewById21.getClass();
        this.f27199u = (TextView) viewFindViewById21;
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.leaderboard_layout);
        Context context = viewGroup.getContext();
        context.getClass();
        if (c22.b.e(context)) {
            linearLayout.setOrientation(1);
            ((LinearLayout) viewGroup.findViewById(R.id.leaders_layout)).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
    }

    public static void a(SegmentDetailsActivity segmentDetailsActivity, TextView textView) {
        if (c22.b.a(segmentDetailsActivity) >= 1.5f) {
            textView.setTextSize(0, c22.b.b(segmentDetailsActivity, segmentDetailsActivity.getResources().getDimension(R.dimen.andfont_body_2), 1.3f));
        }
    }
}
