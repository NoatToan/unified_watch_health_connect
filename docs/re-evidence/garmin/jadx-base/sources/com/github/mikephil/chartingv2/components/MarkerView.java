package com.github.mikephil.chartingv2.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.Highlight;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class MarkerView extends RelativeLayout {
    public MarkerView(Context context, int i14) {
        super(context);
        setupLayoutResource(i14);
    }

    private void setupLayoutResource(int i14) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(i14, this);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
    }

    public void draw(Canvas canvas, float f14, float f15) {
        float xOffset = f14 + getXOffset(f14);
        float yOffset = f15 + getYOffset(f15);
        canvas.translate(xOffset, yOffset);
        draw(canvas);
        canvas.translate(-xOffset, -yOffset);
    }

    public abstract int getXOffset(float f14);

    public abstract int getYOffset(float f14);

    public abstract void refreshContent(Entry entry, Highlight highlight);
}
