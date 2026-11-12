package com.github.mikephil.charting.utils;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes13.dex */
public class TransformerHorizontalBarChart extends Transformer {
    public TransformerHorizontalBarChart(ViewPortHandler viewPortHandler) {
        super(viewPortHandler);
    }

    @Override // com.github.mikephil.charting.utils.Transformer
    public void prepareMatrixOffset(boolean z14) {
        this.mMatrixOffset.reset();
        Matrix matrix = this.mMatrixOffset;
        if (!z14) {
            matrix.postTranslate(this.mViewPortHandler.offsetLeft(), this.mViewPortHandler.getChartHeight() - this.mViewPortHandler.offsetBottom());
        } else {
            matrix.setTranslate(-(this.mViewPortHandler.getChartWidth() - this.mViewPortHandler.offsetRight()), this.mViewPortHandler.getChartHeight() - this.mViewPortHandler.offsetBottom());
            this.mMatrixOffset.postScale(-1.0f, 1.0f);
        }
    }
}
