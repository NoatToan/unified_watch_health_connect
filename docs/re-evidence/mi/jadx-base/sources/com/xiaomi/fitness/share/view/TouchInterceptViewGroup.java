package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes8.dex */
public class TouchInterceptViewGroup extends FrameLayout {
    public TouchInterceptViewGroup(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public TouchInterceptViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchInterceptViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
