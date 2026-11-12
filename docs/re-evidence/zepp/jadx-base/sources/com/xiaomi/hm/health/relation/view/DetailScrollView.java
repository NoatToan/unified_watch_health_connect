package com.xiaomi.hm.health.relation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes21.dex */
public class DetailScrollView extends ScrollView {
    private float a;
    private float b;

    public DetailScrollView(Context context) {
        super(context);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a = motionEvent.getX();
            this.b = motionEvent.getY();
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float fAbs = Math.abs(x - this.a);
            float fAbs2 = Math.abs(y - this.b);
            this.a = x;
            this.b = y;
            return fAbs2 > fAbs && fAbs2 > 10.0f;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public DetailScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DetailScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
