package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.garmin.android.apps.connectmobile.userprofile.view.AppBarFlingBehavior;

/* JADX INFO: loaded from: classes10.dex */
public class GCMNestedScrollView extends NestedScrollView {
    public a H0;
    public boolean I0;
    public int T;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public b f47795k0;

    public interface a {
        void a();
    }

    public interface b {
    }

    public GCMNestedScrollView(Context context) {
        super(context);
        this.T = 0;
        this.I0 = true;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void e(int i14) {
        float f14 = i14;
        if (this.B.b(0.0f, f14)) {
            return;
        }
        dispatchNestedFling(0.0f, f14, true);
        r(2);
        super.e(i14);
    }

    public a getOnBottomReachedListener() {
        return this.H0;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.I0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view2, float f14, float f15, boolean z14) {
        r(2);
        return super.onNestedFling(view2, f14, f15, z14);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view2, float f14, float f15) {
        r(2);
        return this.B.b(f14, f15);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i14, int i15, int i16, int i17) {
        int bottom = getChildAt(getChildCount() - 1).getBottom() - (getScrollY() + getHeight());
        getChildAt(0).getTop();
        getScrollY();
        a aVar = this.H0;
        if (aVar != null && bottom == 0) {
            aVar.a();
        }
        b bVar = this.f47795k0;
        if (bVar != null) {
            ((AppBarFlingBehavior.b) bVar).f47221a += i15 - i17;
        }
        super.onScrollChanged(i14, i15, i16, i17);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view2, View view3, int i14) {
        r(1);
        return onStartNestedScroll(view2, view3, i14, 0);
    }

    public final void r(int i14) {
        if (this.f47795k0 == null || this.T == i14) {
            return;
        }
        this.T = i14;
    }

    public void setOnBottomReachedListener(a aVar) {
        this.H0 = aVar;
    }

    public void setOnScrollListener(b bVar) {
        this.f47795k0 = bVar;
    }

    public void setScrollEnabled(boolean z14) {
        this.I0 = z14;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean startNestedScroll(int i14) {
        boolean zStartNestedScroll = super.startNestedScroll(i14);
        r(1);
        return zStartNestedScroll;
    }

    public GCMNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = 0;
        this.I0 = true;
    }

    public GCMNestedScrollView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.T = 0;
        this.I0 = true;
    }
}
