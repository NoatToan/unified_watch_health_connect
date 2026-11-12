package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes22.dex */
public class WrapContentHeightViewPager extends ViewPager {
    private View a;
    private int b;

    public WrapContentHeightViewPager(@NonNull Context context) {
        super(context);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[PHI: r6
      0x0049: PHI (r6v3 int) = (r6v2 int), (r6v7 int) binds: [B:18:0x0047, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        View view = this.a;
        int i3 = 0;
        if (view == null) {
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > i4) {
                    i4 = measuredHeight2;
                }
            }
            i3 = i4;
        } else if (view instanceof WebView) {
            WebView webView = (WebView) view;
            measuredHeight = ((int) (webView.getContentHeight() * webView.getScale())) + this.b;
            if (measuredHeight > 0) {
                i3 = measuredHeight;
            }
        } else {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = view.getMeasuredHeight();
            if (measuredHeight > 0) {
                i3 = measuredHeight;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public void setCurrentView(View view) {
        setCurrentView(view, 0);
    }

    public WrapContentHeightViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCurrentView(View view, int i) {
        this.a = view;
        this.b = i;
        requestLayout();
    }
}
