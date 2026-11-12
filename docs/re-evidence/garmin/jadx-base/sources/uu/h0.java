package uu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luu/h0;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f172711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f172712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f172713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f172714d;

    public h0(ViewGroup viewGroup) {
        super(e5.e(viewGroup, R.layout.earned_badge_item, viewGroup, false));
        View viewFindViewById = this.itemView.findViewById(R.id.badge_image);
        viewFindViewById.getClass();
        this.f172711a = (ImageView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.badge_name);
        viewFindViewById2.getClass();
        this.f172712b = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.new_badge_hint);
        viewFindViewById3.getClass();
        this.f172713c = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.badge_earned_count);
        viewFindViewById4.getClass();
        this.f172714d = (TextView) viewFindViewById4;
    }
}
