package au1;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau1/d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f13031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f13032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f13033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f13034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f13035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f13036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f13037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f13038h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.training_coach_name);
        viewFindViewById.getClass();
        this.f13031a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.training_coach_background);
        viewFindViewById2.getClass();
        this.f13032b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.training_coach_schedule);
        viewFindViewById3.getClass();
        this.f13033c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.training_video_time);
        viewFindViewById4.getClass();
        this.f13034d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.training_coach_video_thumbnail);
        viewFindViewById5.getClass();
        this.f13035e = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.training_coach_video_button);
        viewFindViewById6.getClass();
        this.f13036f = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.training_coach_video_container);
        viewFindViewById7.getClass();
        this.f13037g = viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.training_coach_choose_button);
        viewFindViewById8.getClass();
        this.f13038h = (Button) viewFindViewById8;
    }
}
