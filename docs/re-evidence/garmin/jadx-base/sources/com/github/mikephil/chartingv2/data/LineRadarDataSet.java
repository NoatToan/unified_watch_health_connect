package com.github.mikephil.chartingv2.data;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class LineRadarDataSet<T extends Entry> extends LineScatterCandleRadarDataSet<T> implements ILineRadarDataSet<T> {
    private boolean mDrawFilled;
    private int mFillAlpha;
    private int mFillColor;
    protected Drawable mFillDrawable;
    private float mLineWidth;

    public LineRadarDataSet(List<T> list, String str) {
        super(list, str);
        this.mFillColor = Color.rgb(140, 234, 255);
        this.mFillAlpha = 85;
        this.mLineWidth = 2.5f;
        this.mDrawFilled = false;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public int getFillAlpha() {
        return this.mFillAlpha;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public int getFillColor() {
        return this.mFillColor;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public Drawable getFillDrawable() {
        return this.mFillDrawable;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public float getLineWidth() {
        return this.mLineWidth;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public boolean isDrawFilledEnabled() {
        return this.mDrawFilled;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public void setDrawFilled(boolean z14) {
        this.mDrawFilled = z14;
    }

    public void setFillAlpha(int i14) {
        this.mFillAlpha = i14;
    }

    public void setFillColor(int i14) {
        this.mFillColor = i14;
        this.mFillDrawable = null;
    }

    @TargetApi(18)
    public void setFillDrawable(Drawable drawable) {
        this.mFillDrawable = drawable;
    }

    public void setLineWidth(float f14) {
        if (f14 < 0.2f) {
            f14 = 0.2f;
        }
        if (f14 > 10.0f) {
            f14 = 10.0f;
        }
        this.mLineWidth = Utils.convertDpToPixel(f14);
    }
}
