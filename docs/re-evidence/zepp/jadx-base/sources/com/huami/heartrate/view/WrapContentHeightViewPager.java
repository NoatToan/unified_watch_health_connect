package com.huami.heartrate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes9.dex */
public class WrapContentHeightViewPager extends ViewPager {
    private View a;
    private int b;

    public WrapContentHeightViewPager(@NonNull Context context) {
        super(context);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[PHI: r6
      0x0049: PHI (r6v3 int) = (r6v2 int), (r6v7 int) binds: [B:18:0x0047, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredHeight;
        View view = this.a;
        int i = 0;
        if (view == null) {
            int i2 = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                childAt.measure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > i2) {
                    i2 = measuredHeight2;
                }
            }
            i = i2;
        } else if (view instanceof WebView) {
            WebView webView = (WebView) view;
            measuredHeight = ((int) (webView.getContentHeight() * webView.getScale())) + this.b;
            if (measuredHeight > 0) {
                i = measuredHeight;
            }
        } else {
            view.measure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = view.getMeasuredHeight();
            if (measuredHeight > 0) {
                i = measuredHeight;
            }
        }
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(i, 1073741824));
    }

    public void setCurrentView(View currentView) {
        setCurrentView(currentView, 0);
    }

    public WrapContentHeightViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setCurrentView(View currentView, int extraHeight) {
        this.a = currentView;
        this.b = extraHeight;
        requestLayout();
    }
}
