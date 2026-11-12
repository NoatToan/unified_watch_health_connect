package com.huami.assistant.ocr.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public class OCRFrameLayout extends ViewGroup {
    public OCRFrameLayout(Context context) {
        super(context);
    }

    private void a(AttributeSet attrs) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).layout(l, t, r, b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        for (int i = 0; i < childCount; i++) {
            measureChild(getChildAt(i), View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(ViewGroup.resolveSize(size, widthMeasureSpec), ViewGroup.resolveSize(size2, heightMeasureSpec));
    }

    public OCRFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        a(attrs);
    }

    public OCRFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        a(attrs);
    }
}
