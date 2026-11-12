package com.huawei.health.h5pro.utils;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public class AdjustResizeWithSoftInput implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f6982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f6984c;
    private int d;
    private FrameLayout.LayoutParams e;

    private AdjustResizeWithSoftInput(Activity activity) {
        this(activity, false);
    }

    public static void assistActivity(Activity activity) {
        if (activity == null) {
            return;
        }
        new AdjustResizeWithSoftInput(activity);
    }

    public static void assistAdjustOnceActivity(Activity activity) {
        if (activity == null) {
            return;
        }
        new AdjustResizeWithSoftInput(activity, true);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f6982a == null) {
            LogUtil.w("H5PRO_AdjustResizeWithSoftInput", "onGlobalLayout: mContent is null");
            return;
        }
        if (this.e == null) {
            LogUtil.w("H5PRO_AdjustResizeWithSoftInput", "onGlobalLayout: mFrameLayoutParams is null");
            return;
        }
        if (this.f6984c == null) {
            LogUtil.w("H5PRO_AdjustResizeWithSoftInput", "onGlobalLayout: mChildOfContent is null");
            return;
        }
        Rect rect = new Rect();
        this.f6982a.getWindowVisibleDisplayFrame(rect);
        int iMin = Math.min(rect.bottom, this.f6982a.getMeasuredHeight());
        if (iMin != this.d) {
            this.e.height = iMin;
            this.f6984c.requestLayout();
            this.d = iMin;
            if (this.f6983b) {
                this.f6984c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    private AdjustResizeWithSoftInput(Activity activity, boolean z) {
        this.f6983b = false;
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        this.f6982a = frameLayout;
        if (frameLayout == null) {
            LogUtil.w("H5PRO_AdjustResizeWithSoftInput", "mContent is null");
            return;
        }
        View childAt = frameLayout.getChildAt(0);
        this.f6984c = childAt;
        if (childAt == null) {
            LogUtil.w("H5PRO_AdjustResizeWithSoftInput", "mChildOfContent is null");
            return;
        }
        this.d = 0;
        this.f6983b = z;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(this);
        ViewGroup.LayoutParams layoutParams = this.f6984c.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            this.e = (FrameLayout.LayoutParams) layoutParams;
        }
    }
}
