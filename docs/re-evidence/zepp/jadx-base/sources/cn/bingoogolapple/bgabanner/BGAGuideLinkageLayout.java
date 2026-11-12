package cn.bingoogolapple.bgabanner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class BGAGuideLinkageLayout extends FrameLayout {
    public BGAGuideLinkageLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (int i = 0; i < getChildCount(); i++) {
            try {
                getChildAt(i).dispatchTouchEvent(motionEvent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public BGAGuideLinkageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BGAGuideLinkageLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
