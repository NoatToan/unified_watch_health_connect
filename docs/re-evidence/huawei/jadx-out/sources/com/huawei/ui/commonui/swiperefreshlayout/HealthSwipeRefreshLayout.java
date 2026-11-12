package com.huawei.ui.commonui.swiperefreshlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.huawei.uikit.phone.hwswiperefreshlayout.widget.HwSwipeRefreshLayout;

/* JADX INFO: loaded from: classes16.dex */
public class HealthSwipeRefreshLayout extends HwSwipeRefreshLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23909b;

    public HealthSwipeRefreshLayout(Context context) {
        super(context);
        this.f23909b = false;
    }

    public HealthSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23909b = false;
    }

    public HealthSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23909b = false;
    }

    @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f23909b) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setInterceptTouchEvent(boolean z) {
        this.f23909b = z;
    }
}
