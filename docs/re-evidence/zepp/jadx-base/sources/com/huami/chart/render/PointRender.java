package com.huami.chart.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.render.PointRender;
import com.huami.chart.style.PointStyle;
import com.huami.chart.util.HMColor;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class PointRender extends BaseRender<PointStyle> {
    private static final String i = "PointRender";

    public PointRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g() {
        return "null != data.getExtends";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(HMColor hMColor) {
        return "o instanceOf HMColor " + hMColor.toString();
    }

    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i2, int i3, float f) {
        ChartDataList[] pointChartDataList;
        super.draw(canvas, i2, i3, f);
        for (int canvasStart = getCanvasStart(); canvasStart <= getCanvasEnd() + 1 && (pointChartDataList = this.hmChart.getChartDataManager().getPointChartDataList()) != null && pointChartDataList.length != 0; canvasStart++) {
            for (int i4 = 0; i4 < pointChartDataList.length; i4++) {
                if (this.hmChart.getChartDataManager().hasPointDataAtPositionIndex(i4, canvasStart)) {
                    float shownDataVerticalValue = getShownDataVerticalValue(getPointPositionByValuePositionIndex(i4, canvasStart));
                    float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(canvasStart));
                    ChartData pointDataByPositionIndex = this.hmChart.getChartDataManager().getPointDataByPositionIndex(i4, canvasStart);
                    if (((PointStyle) this.mStyle).getPointStyle() == 2) {
                        Paint pointPaint = this.paintProvider.getPointPaint(((PointStyle) this.mStyle).getPointColor());
                        if (pointDataByPositionIndex != null && pointDataByPositionIndex.getDataExtends() != null) {
                            HMColor hMColor = null;
                            for (IDataExtendListener<?> iDataExtendListener : pointDataByPositionIndex.getDataExtends()) {
                                HMLog.verbose(i, new Function0() { // from class: n16
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PointRender.g();
                                    }
                                });
                                Object obj = iDataExtendListener.get(pointDataByPositionIndex.getBaseIndex());
                                if (obj instanceof HMColor) {
                                    final HMColor hMColor2 = (HMColor) obj;
                                    HMLog.verbose(i, new Function0() { // from class: m16
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PointRender.h(hMColor2);
                                        }
                                    });
                                    hMColor = hMColor2;
                                }
                            }
                            if (hMColor != null) {
                                pointPaint.setColor(hMColor.getRawColor());
                            }
                        }
                        canvas.drawCircle(shownDataHorizonalValue, shownDataVerticalValue, ((PointStyle) this.mStyle).getPointSize(), pointPaint);
                    }
                }
            }
        }
    }
}
