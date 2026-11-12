package zz0;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Metadata;
import sz0.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzz0/j;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "Lsz0/k;", "notificationActionListener", "<init>", "(Landroid/view/View;Lsz0/k;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends RecyclerView.f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f207619l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f207620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserLevelImageView f207621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f207622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f207623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f207624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f207625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f207626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f207627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f207628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f207629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f207630k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View view2, k kVar) {
        super(view2);
        view2.getClass();
        kVar.getClass();
        this.f207620a = kVar;
        View viewFindViewById = view2.findViewById(R.id.profile_image);
        viewFindViewById.getClass();
        this.f207621b = (UserLevelImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.title_text_view);
        viewFindViewById2.getClass();
        this.f207622c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.info_text);
        viewFindViewById3.getClass();
        this.f207623d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.sub_info_text);
        viewFindViewById4.getClass();
        this.f207624e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.negative_button);
        viewFindViewById5.getClass();
        this.f207625f = (Button) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.positive_button);
        viewFindViewById6.getClass();
        this.f207626g = (Button) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.close_icon);
        viewFindViewById7.getClass();
        this.f207627h = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.pending_delete_layout);
        viewFindViewById8.getClass();
        this.f207628i = viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.action_info_text);
        viewFindViewById9.getClass();
        this.f207629j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.unread_bubble_image_view);
        viewFindViewById10.getClass();
        this.f207630k = (ImageView) viewFindViewById10;
    }
}
