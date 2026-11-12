package p40;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp40/n0;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f135706b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f135707a;

    static {
        int i14 = ComposeView.f6053c;
    }

    public n0(View view2) {
        view2.getClass();
        this.f135707a = (ComposeView) view2.findViewById(R.id.course_planner_header);
    }
}
