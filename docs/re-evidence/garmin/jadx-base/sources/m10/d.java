package m10;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm10/d;", "", "Landroid/view/View;", "rootView", "", ModelSourceWrapper.POSITION, "<init>", "(Landroid/view/View;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f115772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f115773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f115774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f115775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UserLevelImageView f115776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f115777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f115778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f115779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f115780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f115781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f115782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f115783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f115784m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f115785n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f115786o;

    public d(View view2, int i14) {
        view2.getClass();
        this.f115772a = view2;
        View viewFindViewById = view2.findViewById(R.id.like_icon);
        viewFindViewById.getClass();
        this.f115773b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.comment_icon);
        viewFindViewById2.getClass();
        this.f115774c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.connection_watermark_activity_type_picture);
        viewFindViewById3.getClass();
        this.f115775d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.connection_display_picture);
        viewFindViewById4.getClass();
        this.f115776e = (UserLevelImageView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.connection_display_name);
        viewFindViewById5.getClass();
        this.f115777f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.connection_activity_name);
        viewFindViewById6.getClass();
        this.f115778g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.connection_activity_creation_time);
        viewFindViewById7.getClass();
        this.f115779h = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.like_unlike);
        viewFindViewById8.getClass();
        this.f115780i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.comment_uncomment);
        viewFindViewById9.getClass();
        this.f115781j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.connections_metric_first);
        viewFindViewById10.getClass();
        this.f115782k = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.connections_metric_second);
        viewFindViewById11.getClass();
        this.f115783l = (TextView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.connections_metric_third);
        viewFindViewById12.getClass();
        this.f115784m = (TextView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.like_count);
        viewFindViewById13.getClass();
        this.f115785n = (TextView) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.comment_count);
        viewFindViewById14.getClass();
        this.f115786o = (TextView) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.operation_error);
        viewFindViewById15.getClass();
        View viewFindViewById16 = view2.findViewById(R.id.connectionAddProgress);
        viewFindViewById16.getClass();
    }

    public final void a() {
        this.f115786o.setVisibility(8);
        this.f115774c.setVisibility(8);
        this.f115785n.setVisibility(8);
        this.f115773b.setVisibility(8);
        this.f115781j.setVisibility(8);
        this.f115780i.setVisibility(8);
    }
}
