package g62;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg62/c0;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends RecyclerView.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f76064c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GCMCheckableRow f76065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposeView f76066b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.course_point_type_label);
        viewFindViewById.getClass();
        this.f76065a = (GCMCheckableRow) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.icon_start);
        viewFindViewById2.getClass();
        this.f76066b = (ComposeView) viewFindViewById2;
    }
}
