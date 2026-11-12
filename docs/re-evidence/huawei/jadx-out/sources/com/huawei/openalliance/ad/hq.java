package com.huawei.openalliance.ad;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.huawei.openalliance.ad.views.linkscroll.LinkScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class hq implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<LinkScrollView> f18901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<View> f18902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18903c = 0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        try {
            View view = this.f18902b.get();
            LinkScrollView linkScrollView = this.f18901a.get();
            if (view != null && linkScrollView != null) {
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int height = view.getHeight();
                int i = height - rect.bottom;
                hw.a("InputOnGlobalLayoutList", "keyboard height is %s, view height is %s.", Integer.valueOf(i), Integer.valueOf(height));
                if (i > height * 0.25f) {
                    linkScrollView.a(i - this.f18903c, true);
                    return;
                }
                linkScrollView.a(i, false);
                if (i != 0) {
                    this.f18903c = i;
                    return;
                }
                return;
            }
            hw.c("InputOnGlobalLayoutList", "view is null.");
        } catch (Throwable th) {
            hw.c("InputOnGlobalLayoutList", "listen input err: %s", th.getClass().getSimpleName());
        }
    }

    public hq(LinkScrollView linkScrollView, View view) {
        this.f18901a = new WeakReference<>(linkScrollView);
        this.f18902b = new WeakReference<>(view);
    }
}
