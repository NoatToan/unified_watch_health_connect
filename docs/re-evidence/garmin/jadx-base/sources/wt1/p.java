package wt1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwt1/p;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f187113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f187114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f187115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f187116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f187117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f187118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f187119g;

    public p(ViewGroup viewGroup) {
        super(e5.e(viewGroup, R.layout.gcm4_atp_scheduled_event_item, viewGroup, false));
        View viewFindViewById = this.itemView.findViewById(R.id.atp_name);
        viewFindViewById.getClass();
        this.f187113a = (TextView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.atp_subtitle);
        viewFindViewById2.getClass();
        this.f187114b = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.atp_month);
        viewFindViewById3.getClass();
        this.f187115c = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.atp_day);
        viewFindViewById4.getClass();
        this.f187116d = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(R.id.atp_date_container);
        viewFindViewById5.getClass();
        this.f187117e = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(R.id.atp_activity_completed_icon);
        viewFindViewById6.getClass();
        this.f187118f = (ImageView) viewFindViewById6;
        View viewFindViewById7 = this.itemView.findViewById(R.id.item_layout);
        viewFindViewById7.getClass();
        this.f187119g = (RelativeLayout) viewFindViewById7;
    }
}
