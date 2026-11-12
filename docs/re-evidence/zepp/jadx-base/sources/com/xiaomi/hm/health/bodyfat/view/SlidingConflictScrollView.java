package com.xiaomi.hm.health.bodyfat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes19.dex */
public class SlidingConflictScrollView extends ScrollView {
    private float a;
    private float b;
    private float c;
    private float d;
    public boolean e;

    public SlidingConflictScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = 0.0f;
            this.a = 0.0f;
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.a += Math.abs(x - this.c);
            float fAbs = this.b + Math.abs(y - this.d);
            this.b = fAbs;
            this.c = x;
            this.d = y;
            if (this.a > fAbs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.e && super.onTouchEvent(motionEvent);
    }

    public void setScrollable(boolean z) {
        this.e = z;
    }
}
