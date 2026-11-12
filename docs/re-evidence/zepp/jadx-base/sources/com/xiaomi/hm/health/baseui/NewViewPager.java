package com.xiaomi.hm.health.baseui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes19.dex */
public class NewViewPager extends ViewPager {
    private View a;
    private int b;
    private boolean c;

    public NewViewPager(Context context) {
        super(context);
        this.b = 0;
        this.c = false;
    }

    public void disableMeasureByChild() {
        this.c = true;
        requestLayout();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.c) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        View view = this.a;
        if (view == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                childAt.measure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
                this.b = Math.max(childAt.getMeasuredHeight(), this.b);
            }
        } else {
            view.measure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
            this.b = view.getMeasuredHeight();
        }
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.b, 1073741824));
    }

    public void setCurrentView(View currentView) {
        this.c = false;
        this.a = currentView;
        requestLayout();
    }

    public NewViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.b = 0;
        this.c = false;
    }
}
