package ye2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import com.garmin.android.apps.connectmobile.R;
import java.util.Set;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lye2/d;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f196833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f196834b;

    public d(View view2, b bVar) {
        this.f196833a = view2;
        this.f196834b = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view2 = this.f196833a;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        Set<Integer> setC1 = this.f196834b.getFragListener$mobile_auth_release().c1();
        if (setC1.size() >= 2) {
            Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Set<Integer> set = setC1;
            marginLayoutParams.topMargin = ((Number) h0.W(set, 0)).intValue();
            toolbar.setLayoutParams(marginLayoutParams);
            NestedScrollView nestedScrollView = (NestedScrollView) view2.findViewById(R.id.scrollable_content);
            ViewGroup.LayoutParams layoutParams2 = nestedScrollView.getLayoutParams();
            layoutParams2.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.bottomMargin = ((Number) h0.W(set, 1)).intValue();
            nestedScrollView.setLayoutParams(marginLayoutParams2);
        }
        return true;
    }
}
