package com.huami.moving.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import com.sothree.slidinguppanel.ScrollableViewHelper;

/* JADX INFO: loaded from: classes5.dex */
public class LockableNestedScrollView extends NestedScrollView {
    private boolean a;

    public static class NestedScrollableViewHelper extends ScrollableViewHelper {
        @Override // com.sothree.slidinguppanel.ScrollableViewHelper
        public int getScrollableViewScrollPosition(View view, boolean z) {
            if (!(view instanceof NestedScrollView)) {
                return 0;
            }
            if (z) {
                return view.getScrollY();
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            return nestedScrollView.getChildAt(0).getBottom() - (nestedScrollView.getHeight() + nestedScrollView.getScrollY());
        }
    }

    public LockableNestedScrollView(@NonNull Context context) {
        super(context);
        this.a = true;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = this.a;
        return z ? super.onTouchEvent(motionEvent) : z;
    }

    public void setScrollingEnabled(boolean z) {
        this.a = z;
    }

    public LockableNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
    }

    public LockableNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
    }
}
