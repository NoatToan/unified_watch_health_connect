package com.huami.chart.provider;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.huami.chart.util.HMColor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class PaintProvider {
    public abstract Paint getBackgroundGridPaint();

    public abstract Paint getBackgroundPaint();

    public abstract Paint getBarChartPaint(boolean z, HMColor hMColor);

    public abstract Paint getBottomIndicatorBackgroundPaint(int i);

    public abstract Paint getBottomIndicatorShapePaint(int i);

    public abstract Paint getGapPointPaint();

    public abstract Paint getGapSubPointPaint();

    public abstract Paint getGoalLineLabelPaint(int i);

    public abstract Paint getGoalLinePaint(int i);

    public abstract Paint getInteractiveLinePaint(int i);

    public abstract Paint getLineBgJoinPaint();

    public abstract Paint getLineJoinPaint();

    public abstract Paint getLinePaint();

    public abstract Paint getMidongPaint(int i);

    public abstract Paint getMultiLineGapPointPaint(int i);

    public abstract Paint getMultiLinePaint(int i);

    public abstract Paint getNoDataTextPaint();

    public abstract Paint getPointPaint(int i);

    public abstract Paint getSectionLinePaint(int i);

    public abstract Paint getSubLinePaint();

    public abstract Paint getSubPointPaint();

    public abstract Paint getValuePaint(boolean z);

    public abstract Paint getXAxisArrowPaint();

    public abstract Paint getXAxisLabelBgPaint();

    public abstract Paint getXAxisLabelPaint(Typeface typeface);

    public abstract Paint getXAxisPaint();

    public abstract Paint getXAxisScalePaint();

    public abstract Paint getXAxisSubLabelPaint(Typeface typeface);

    public abstract Paint getYAxisArrowPaint();

    public abstract Paint getYAxisLabelPaint(Typeface typeface, HMColor hMColor);

    public abstract Paint getYAxisPaint();

    public abstract Paint getYAxisScalePaint();
}
