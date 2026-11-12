package fb1;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfb1/n0;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q f70276a;

    public n0(com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q qVar) {
        this.f70276a = qVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q qVar = this.f70276a;
        NestedScrollView nestedScrollView = qVar.f40796i;
        if (nestedScrollView == null) {
            p005kotlin.jvm.internal.s.m("mScrollView");
            throw null;
        }
        int height = nestedScrollView.getHeight();
        if (height > 0) {
            NestedScrollView nestedScrollView2 = qVar.f40796i;
            if (nestedScrollView2 == null) {
                p005kotlin.jvm.internal.s.m("mScrollView");
                throw null;
            }
            nestedScrollView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            NestedScrollView nestedScrollView3 = qVar.f40796i;
            if (nestedScrollView3 == null) {
                p005kotlin.jvm.internal.s.m("mScrollView");
                throw null;
            }
            View childAt = nestedScrollView3.getChildAt(nestedScrollView3.getChildCount() - 1);
            childAt.getClass();
            int bottom = childAt.getBottom();
            NestedScrollView nestedScrollView4 = qVar.f40796i;
            if (nestedScrollView4 == null) {
                p005kotlin.jvm.internal.s.m("mScrollView");
                throw null;
            }
            int paddingBottom = (nestedScrollView4.getPaddingBottom() + bottom) - height;
            NestedScrollView nestedScrollView5 = qVar.f40796i;
            if (nestedScrollView5 == null) {
                p005kotlin.jvm.internal.s.m("mScrollView");
                throw null;
            }
            int scrollY = paddingBottom - nestedScrollView5.getScrollY();
            NestedScrollView nestedScrollView6 = qVar.f40796i;
            if (nestedScrollView6 == null) {
                p005kotlin.jvm.internal.s.m("mScrollView");
                throw null;
            }
            nestedScrollView6.p(0, scrollY, 250, false);
            NestedScrollView nestedScrollView7 = qVar.f40796i;
            if (nestedScrollView7 != null) {
                nestedScrollView7.scrollBy(0, scrollY);
            } else {
                p005kotlin.jvm.internal.s.m("mScrollView");
                throw null;
            }
        }
    }
}
