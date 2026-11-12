package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes22.dex */
public class StickHeaderChildScrollView extends NestedScrollView {
    public StickHeaderChildScrollView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (ViewCompat.canScrollVertically(this, -1)) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public StickHeaderChildScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickHeaderChildScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
