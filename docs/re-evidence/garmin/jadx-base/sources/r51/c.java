package r51;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr51/c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f150479f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f150480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f150481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f150482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f150483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ComposeView f150484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view2) {
        super(view2);
        view2.getClass();
        this.f150480a = view2;
        View viewFindViewById = this.itemView.findViewById(R.id.activityTypeIcon);
        viewFindViewById.getClass();
        this.f150481b = (ImageView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.paceProPlanNameTextView);
        viewFindViewById2.getClass();
        this.f150482c = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.paceproPlanSpeedDistanceTextView);
        viewFindViewById3.getClass();
        this.f150483d = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.sendToDeviceIcon);
        viewFindViewById4.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById4;
        this.f150484e = composeView;
        a.f150473a.getClass();
        composeView.setContent(a.f150475c);
    }
}
