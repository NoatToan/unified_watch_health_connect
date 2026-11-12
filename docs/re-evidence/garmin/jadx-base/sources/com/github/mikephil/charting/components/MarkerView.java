package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class MarkerView extends RelativeLayout implements IMarker {
    private MPPointF mOffset;
    private MPPointF mOffset2;
    private WeakReference<Chart> mWeakChart;

    public MarkerView(Context context, int i14) {
        super(context);
        this.mOffset = new MPPointF();
        this.mOffset2 = new MPPointF();
        setupLayoutResource(i14);
    }

    private void setupLayoutResource(int i14) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(i14, this);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f14, float f15) {
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f14, f15);
        int iSave = canvas.save();
        canvas.translate(f14 + offsetForDrawingAtPoint.f52828x, f15 + offsetForDrawingAtPoint.f52829y);
        draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public Chart getChartView() {
        WeakReference<Chart> weakReference = this.mWeakChart;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        return this.mOffset;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f14, float f15) {
        MPPointF offset = getOffset();
        MPPointF mPPointF = this.mOffset2;
        mPPointF.f52828x = offset.f52828x;
        mPPointF.f52829y = offset.f52829y;
        Chart chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        MPPointF mPPointF2 = this.mOffset2;
        float f16 = mPPointF2.f52828x;
        if (f14 + f16 < 0.0f) {
            mPPointF2.f52828x = -f14;
        } else if (chartView != null && f14 + width + f16 > chartView.getWidth()) {
            this.mOffset2.f52828x = (chartView.getWidth() - f14) - width;
        }
        MPPointF mPPointF3 = this.mOffset2;
        float f17 = mPPointF3.f52829y;
        if (f15 + f17 < 0.0f) {
            mPPointF3.f52829y = -f15;
        } else if (chartView != null && f15 + height + f17 > chartView.getHeight()) {
            this.mOffset2.f52829y = (chartView.getHeight() - f15) - height;
        }
        return this.mOffset2;
    }

    public void refreshContent(Entry entry, Highlight highlight) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setChartView(Chart chart) {
        this.mWeakChart = new WeakReference<>(chart);
    }

    public void setOffset(MPPointF mPPointF) {
        this.mOffset = mPPointF;
        if (mPPointF == null) {
            this.mOffset = new MPPointF();
        }
    }

    public void setOffset(float f14, float f15) {
        MPPointF mPPointF = this.mOffset;
        mPPointF.f52828x = f14;
        mPPointF.f52829y = f15;
    }
}
