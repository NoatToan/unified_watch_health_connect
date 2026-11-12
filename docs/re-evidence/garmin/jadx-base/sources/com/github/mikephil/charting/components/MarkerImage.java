package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointF;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class MarkerImage implements IMarker {
    private Context mContext;
    private Drawable mDrawable;
    private WeakReference<Chart> mWeakChart;
    private MPPointF mOffset = new MPPointF();
    private MPPointF mOffset2 = new MPPointF();
    private FSize mSize = new FSize();
    private Rect mDrawableBoundsCache = new Rect();

    public MarkerImage(Context context, int i14) {
        this.mContext = context;
        this.mDrawable = context.getResources().getDrawable(i14, null);
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f14, float f15) {
        if (this.mDrawable == null) {
            return;
        }
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f14, f15);
        FSize fSize = this.mSize;
        float intrinsicWidth = fSize.width;
        float intrinsicHeight = fSize.height;
        if (intrinsicWidth == 0.0f) {
            intrinsicWidth = this.mDrawable.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0.0f) {
            intrinsicHeight = this.mDrawable.getIntrinsicHeight();
        }
        this.mDrawable.copyBounds(this.mDrawableBoundsCache);
        Drawable drawable = this.mDrawable;
        Rect rect = this.mDrawableBoundsCache;
        int i14 = rect.left;
        int i15 = rect.top;
        drawable.setBounds(i14, i15, ((int) intrinsicWidth) + i14, ((int) intrinsicHeight) + i15);
        int iSave = canvas.save();
        canvas.translate(f14 + offsetForDrawingAtPoint.f52828x, f15 + offsetForDrawingAtPoint.f52829y);
        this.mDrawable.draw(canvas);
        canvas.restoreToCount(iSave);
        this.mDrawable.setBounds(this.mDrawableBoundsCache);
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
        Drawable drawable;
        Drawable drawable2;
        MPPointF offset = getOffset();
        MPPointF mPPointF = this.mOffset2;
        mPPointF.f52828x = offset.f52828x;
        mPPointF.f52829y = offset.f52829y;
        Chart chartView = getChartView();
        FSize fSize = this.mSize;
        float intrinsicWidth = fSize.width;
        float intrinsicHeight = fSize.height;
        if (intrinsicWidth == 0.0f && (drawable2 = this.mDrawable) != null) {
            intrinsicWidth = drawable2.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0.0f && (drawable = this.mDrawable) != null) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        MPPointF mPPointF2 = this.mOffset2;
        float f16 = mPPointF2.f52828x;
        if (f14 + f16 < 0.0f) {
            mPPointF2.f52828x = -f14;
        } else if (chartView != null && f14 + intrinsicWidth + f16 > chartView.getWidth()) {
            this.mOffset2.f52828x = (chartView.getWidth() - f14) - intrinsicWidth;
        }
        MPPointF mPPointF3 = this.mOffset2;
        float f17 = mPPointF3.f52829y;
        if (f15 + f17 < 0.0f) {
            mPPointF3.f52829y = -f15;
        } else if (chartView != null && f15 + intrinsicHeight + f17 > chartView.getHeight()) {
            this.mOffset2.f52829y = (chartView.getHeight() - f15) - intrinsicHeight;
        }
        return this.mOffset2;
    }

    public FSize getSize() {
        return this.mSize;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
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

    public void setSize(FSize fSize) {
        this.mSize = fSize;
        if (fSize == null) {
            this.mSize = new FSize();
        }
    }

    public void setOffset(float f14, float f15) {
        MPPointF mPPointF = this.mOffset;
        mPPointF.f52828x = f14;
        mPPointF.f52829y = f15;
    }
}
