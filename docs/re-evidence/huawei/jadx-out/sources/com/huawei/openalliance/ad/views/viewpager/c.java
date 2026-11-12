package com.huawei.openalliance.ad.views.viewpager;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes41.dex */
class c implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f21374a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f21375b;

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (windowInsetsOnApplyWindowInsets.isConsumed()) {
            return windowInsetsOnApplyWindowInsets;
        }
        Rect rect = this.f21374a;
        rect.left = windowInsetsOnApplyWindowInsets.getSystemWindowInsetLeft();
        rect.top = windowInsetsOnApplyWindowInsets.getSystemWindowInsetTop();
        rect.right = windowInsetsOnApplyWindowInsets.getSystemWindowInsetRight();
        rect.bottom = windowInsetsOnApplyWindowInsets.getSystemWindowInsetBottom();
        int childCount = this.f21375b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            WindowInsets windowInsetsDispatchApplyWindowInsets = this.f21375b.getChildAt(i).dispatchApplyWindowInsets(windowInsetsOnApplyWindowInsets);
            rect.left = Math.min(windowInsetsDispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
            rect.top = Math.min(windowInsetsDispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
            rect.right = Math.min(windowInsetsDispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
            rect.bottom = Math.min(windowInsetsDispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
        }
        return windowInsetsOnApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
    }

    public c(e eVar) {
        this.f21375b = eVar;
    }
}
