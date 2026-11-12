package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class CustomH5ProWebview extends H5ProWebView {
    private boolean d;

    public CustomH5ProWebview(Context context) {
        super(context);
    }

    public CustomH5ProWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.health.h5pro.core.H5ProWebView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        LogUtil.a("CustomH5ProWebview", "onDetachedFromWindow");
    }

    public void c() {
        super.onDetachedFromWindow();
    }

    public void setIsDisallowIntercept(boolean z) {
        this.d = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.d && motionEvent.getActionMasked() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
