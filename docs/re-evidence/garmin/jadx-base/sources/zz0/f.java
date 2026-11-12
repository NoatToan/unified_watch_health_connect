package zz0;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Metadata;
import sz0.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzz0/f;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "Lsz0/k;", "notificationActionListener", "<init>", "(Landroid/view/View;Lsz0/k;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends RecyclerView.f0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f207600m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f207601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserLevelImageView f207602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f207603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f207604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f207605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f207606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f207607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f207608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f207609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f207610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f207611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f207612l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view2, k kVar) {
        super(view2);
        view2.getClass();
        kVar.getClass();
        this.f207601a = kVar;
        View viewFindViewById = view2.findViewById(R.id.profile_image);
        viewFindViewById.getClass();
        this.f207602b = (UserLevelImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.notification_image_vector);
        viewFindViewById2.getClass();
        this.f207603c = (ComposeView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.title_text_view);
        viewFindViewById3.getClass();
        this.f207604d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.info_text);
        viewFindViewById4.getClass();
        this.f207605e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.sub_info_text);
        viewFindViewById5.getClass();
        this.f207606f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.negative_button);
        viewFindViewById6.getClass();
        this.f207607g = (Button) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.positive_button);
        viewFindViewById7.getClass();
        this.f207608h = (Button) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.close_icon);
        viewFindViewById8.getClass();
        this.f207609i = (ImageView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.pending_delete_layout);
        viewFindViewById9.getClass();
        this.f207610j = viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.undo_button);
        viewFindViewById10.getClass();
        this.f207611k = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.unread_bubble_image_view);
        viewFindViewById11.getClass();
        this.f207612l = (ImageView) viewFindViewById11;
    }

    public final void d(NotificationItem.Activity.a aVar) {
        v22.e.r(this.f207604d, !aVar.f39550c);
        boolean z14 = aVar.f39550c;
        v22.e.r(this.f207605e, !z14);
        v22.e.j(this.f207608h);
        v22.e.j(this.f207607g);
        v22.e.r(this.f207609i, !z14);
        v22.e.r(this.f207610j, z14);
    }
}
