package com.huawei.ui.main.stories.route.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.scrollview.HealthScrollView;

/* JADX INFO: loaded from: classes19.dex */
public class MapContainer extends RelativeLayout {
    private HealthScrollView e;

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public MapContainer(Context context) {
        super(context);
    }

    public MapContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MapContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setScrollView(HealthScrollView healthScrollView) {
        this.e = healthScrollView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.e.requestDisallowInterceptTouchEvent(false);
        } else {
            this.e.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
