package k32;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk32/o;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f102715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NestedScrollView f102716b;

    public o(View view2) {
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.scroll_view_top_indicator);
        viewFindViewById.getClass();
        this.f102715a = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.scroll_view);
        viewFindViewById2.getClass();
        this.f102716b = (NestedScrollView) viewFindViewById2;
    }
}
