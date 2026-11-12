package com.huawei.pluginsocialshare.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.material.tabs.TabLayout;
import com.huawei.ui.commonui.tablayout.HealthTabLayout;

/* JADX INFO: loaded from: classes42.dex */
public class ShareTabLayout extends HealthTabLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f22626a;

    public ShareTabLayout(Context context) {
        super(context);
    }

    public ShareTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShareTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22626a = motionEvent.getX();
        } else if (action == 1) {
            float x = motionEvent.getX();
            float f = this.f22626a;
            this.f22626a = 0.0f;
            d(x - f);
        } else if (action == 2 && this.f22626a < 0.1d) {
            this.f22626a = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    private void d(float f) {
        TabLayout.Tab tabAt;
        TabLayout.Tab tabAt2;
        if (Math.abs(f) > 200.0f) {
            int selectedTabPosition = getSelectedTabPosition();
            if (f > 0.0f && selectedTabPosition < getTabCount() - 1 && (tabAt2 = getTabAt(selectedTabPosition + 1)) != null) {
                tabAt2.select();
            }
            if (f >= 0.0f || selectedTabPosition <= 0 || (tabAt = getTabAt(selectedTabPosition - 1)) == null) {
                return;
            }
            tabAt.select();
        }
    }
}
