package miuix.viewpager.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.OriginalViewPager;

/* JADX INFO: loaded from: classes3.dex */
public class ViewPager extends OriginalViewPager {
    public boolean k0;

    public ViewPager(Context context) {
        super(context);
        this.k0 = true;
    }

    public boolean O() {
        return this.k0;
    }

    @Override // androidx.viewpager.widget.OriginalViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.k0) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Catch IllegalArgumentException:");
            sb.append(e);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.OriginalViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.k0) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Catch IllegalArgumentException:");
            sb.append(e);
            return false;
        }
    }

    public void setDraggable(boolean z) {
        this.k0 = z;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k0 = true;
    }
}
