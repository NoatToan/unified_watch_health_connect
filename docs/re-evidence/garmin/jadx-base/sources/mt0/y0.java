package mt0;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmt0/y0;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y0 extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f120929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f120930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f120931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f120932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f120933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final UserLevelImageView f120934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.leaderboard_containter_row);
        viewFindViewById.getClass();
        this.f120929a = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.leaderboard_row_ranking);
        viewFindViewById2.getClass();
        this.f120930b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.leaderboard_row_name);
        viewFindViewById3.getClass();
        this.f120931c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.leaderboard_row_value);
        viewFindViewById4.getClass();
        this.f120932d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.leaderboard_row_sync_time);
        viewFindViewById5.getClass();
        this.f120933e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.leaderboard_row_icon);
        viewFindViewById6.getClass();
        this.f120934f = (UserLevelImageView) viewFindViewById6;
    }
}
