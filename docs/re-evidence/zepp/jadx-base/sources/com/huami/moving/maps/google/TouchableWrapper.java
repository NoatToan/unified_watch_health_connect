package com.huami.moving.maps.google;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes11.dex */
public class TouchableWrapper extends FrameLayout {
    private OnDragListener a;

    public interface OnDragListener {
        void onDrag();
    }

    public TouchableWrapper(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        OnDragListener onDragListener;
        if (motionEvent.getAction() == 2 && (onDragListener = this.a) != null) {
            onDragListener.onDrag();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setListener(OnDragListener onDragListener) {
        this.a = onDragListener;
    }
}
