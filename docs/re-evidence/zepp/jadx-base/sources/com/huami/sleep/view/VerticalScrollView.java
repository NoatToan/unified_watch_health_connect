package com.huami.sleep.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes13.dex */
public class VerticalScrollView extends ScrollView {
    private static final double b = 90.0d;
    private GestureDetector a;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return Math.abs(distanceY) > Math.abs(distanceX);
        }
    }

    public VerticalScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.a = new GestureDetector(new a());
        setFadingEdgeLength(0);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev) && this.a.onTouchEvent(ev);
    }
}
