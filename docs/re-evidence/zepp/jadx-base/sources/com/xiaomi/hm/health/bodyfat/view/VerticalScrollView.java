package com.xiaomi.hm.health.bodyfat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes19.dex */
public class VerticalScrollView extends ScrollView {
    private static final double b = 90.0d;
    private GestureDetector a;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(f2) > Math.abs(f);
        }
    }

    public VerticalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new GestureDetector(new a());
        setFadingEdgeLength(0);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) && this.a.onTouchEvent(motionEvent);
    }
}
