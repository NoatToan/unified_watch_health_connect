package com.huami.moving.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes5.dex */
public class MapHelperLayout extends RelativeLayout {
    private boolean a;

    public MapHelperLayout(Context context) {
        super(context);
        this.a = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            getParent().requestDisallowInterceptTouchEvent(this.a);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public MapHelperLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MapHelper);
        this.a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapHelper_shield, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public MapHelperLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
    }
}
