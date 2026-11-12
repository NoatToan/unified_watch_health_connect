package com.huami.chart.render;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.render.LineJoinRender;
import com.huami.chart.style.LineJoinStyle;
import com.huami.chart.util.HMColor;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class LineJoinRender extends BaseRender<LineJoinStyle> {
    private static final String j = "LineJoinRender";
    private RenderConfig i;

    public LineJoinRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
        this.i = hMChart.getRenderConfigManager().getRenderConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(HMColor hMColor) {
        return "o instanceOf HMColor " + hMColor.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String m(float f) {
        return "currentXOffset " + this.hmChart.getInteractiveManager().getxOffset() + " destPosition " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String n(float f) {
        return "currentXOffset " + this.hmChart.getInteractiveManager().getxOffset() + " destPosition " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(float f) {
        return "percent " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p(float f) {
        return "percent " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(float f) {
        return "percent " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(Index index, int i) {
        return "currentIndex " + index + " dataIndex " + i;
    }

    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i, int i2, float f) {
        float f2;
        super.draw(canvas, i, i2, f);
        if ((((LineJoinStyle) this.mStyle).getLineJointStyle() & 1) > 0) {
            return;
        }
        float halfDataWidth = this.hmChart.getDrawAreaManager().getHalfDataWidth() * 2.0f;
        for (int canvasStart = getCanvasStart(); canvasStart <= getCanvasEnd() + 1; canvasStart++) {
            if (this.hmChart.getChartDataManager().hasDataAtPositionIndex(canvasStart)) {
                float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(canvasStart));
                float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(canvasStart));
                ChartData dataByPositionIndex = this.hmChart.getChartDataManager().getDataByPositionIndex(canvasStart);
                if (!((LineJoinStyle) this.mStyle).isDrawSpecificIndices() || (((LineJoinStyle) this.mStyle).getIndices() != null && ((LineJoinStyle) this.mStyle).getIndices().contains(Integer.valueOf(dataByPositionIndex.getIndex())))) {
                    if (!(((LineJoinStyle) this.mStyle).isInteractiveUpCancel() ? highlight(shownDataHorizonalValue, -1.0f) : highlight(canvasStart)) || (((LineJoinStyle) this.mStyle).getInteractiveType() & 64) <= 0) {
                        f2 = shownDataHorizonalValue;
                    } else {
                        Paint paint = new Paint(1);
                        float top = this.hmChart.getDrawAreaManager().getTop();
                        float bottom = this.hmChart.getDrawAreaManager().getBottom();
                        paint.setStrokeWidth(((LineJoinStyle) this.mStyle).getInteractiveLineWidth());
                        paint.setColor(((LineJoinStyle) this.mStyle).getInteractiveLineColor());
                        f2 = shownDataHorizonalValue;
                        canvas.drawLine(shownDataHorizonalValue, shownDataVerticalValue, shownDataHorizonalValue, top, paint);
                        canvas.drawLine(f2, bottom, f2, shownDataVerticalValue, paint);
                    }
                    if (((LineJoinStyle) this.mStyle).getLineJointStyle() == 2) {
                        Paint lineJoinPaint = this.paintProvider.getLineJoinPaint();
                        if (dataByPositionIndex != null && dataByPositionIndex.getDataExtends() != null) {
                            HMColor hMColor = null;
                            Iterator<IDataExtendListener<?>> it2 = dataByPositionIndex.getDataExtends().iterator();
                            while (it2.hasNext()) {
                                Object obj = it2.next().get(dataByPositionIndex.getBaseIndex());
                                if (obj instanceof HMColor) {
                                    final HMColor hMColor2 = (HMColor) obj;
                                    HMLog.verbose(j, new Function0() { // from class: dn4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return LineJoinRender.l(hMColor2);
                                        }
                                    });
                                    hMColor = hMColor2;
                                }
                            }
                            if (hMColor != null) {
                                lineJoinPaint.setColor(hMColor.getRawColor());
                            }
                        }
                        canvas.drawCircle(f2, shownDataVerticalValue, ((LineJoinStyle) this.mStyle).getLineJointSize(), lineJoinPaint);
                    } else {
                        float f3 = f2;
                        if (((LineJoinStyle) this.mStyle).getLineJointStyle() == 8) {
                            canvas.drawCircle(f3, shownDataVerticalValue, ((LineJoinStyle) this.mStyle).getLineJointSize() + ((LineJoinStyle) this.mStyle).getLineJointOuterSize(), this.paintProvider.getLineJoinPaint());
                        } else if (((LineJoinStyle) this.mStyle).getLineJointStyle() == 4) {
                            canvas.drawCircle(f3, shownDataVerticalValue, ((LineJoinStyle) this.mStyle).getLineJointSize(), this.paintProvider.getLineJoinPaint());
                        } else if ((((LineJoinStyle) this.mStyle).getLineJointStyle() & 32) > 0) {
                            final float shownDataHorizonalValue2 = getShownDataHorizonalValue(getPositionByPosIndex(this.hmChart.getChartDataManager().getChartDataList().getStart())) + this.hmChart.getInteractiveManager().getxOffset();
                            HMLog.verbose(j, new Function0() { // from class: bn4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return this.a.m(shownDataHorizonalValue2);
                                }
                            });
                            canvas.drawCircle(f3, shownDataVerticalValue, ((LineJoinStyle) this.mStyle).getLineJointSize() + ((LineJoinStyle) this.mStyle).getEdgeWidth(), this.paintProvider.getLineBgJoinPaint());
                            canvas.drawCircle(f3, shownDataVerticalValue, ((LineJoinStyle) this.mStyle).getLineJointSize(), this.paintProvider.getLineJoinPaint());
                        }
                    }
                }
            }
        }
        int canvasStart2 = (getCanvasStart() + getCanvasEnd()) / 2;
        if (!((LineJoinStyle) this.mStyle).isDrawCurrentLineJoint() || canvasStart2 < 0) {
            return;
        }
        float shownDataHorizonalValue3 = getShownDataHorizonalValue(getPositionByPosIndex(canvasStart2));
        float shownDataVerticalValue2 = getShownDataVerticalValue(getPositionByValuePositionIndex(canvasStart2));
        if ((((LineJoinStyle) this.mStyle).getLineJointStyle() & 2) > 0) {
            final float shownDataHorizonalValue4 = getShownDataHorizonalValue(getPositionByPosIndex(this.hmChart.getChartDataManager().getChartDataList().getStart())) + this.hmChart.getInteractiveManager().getxOffset();
            String str = j;
            HMLog.verbose(str, new Function0() { // from class: cn4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.n(shownDataHorizonalValue4);
                }
            });
            final float fAbs = Math.abs(shownDataHorizonalValue3 - shownDataHorizonalValue4) / halfDataWidth;
            HMLog.verbose(str, new Function0() { // from class: an4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LineJoinRender.o(fAbs);
                }
            });
            canvas.drawCircle(shownDataHorizonalValue3, shownDataVerticalValue2, ((LineJoinStyle) this.mStyle).getLineJointSize() + (((LineJoinStyle) this.mStyle).getLineJointResize() * (1.0f - (fAbs * 2.0f))), this.paintProvider.getLineJoinPaint());
            return;
        }
        if ((((LineJoinStyle) this.mStyle).getLineJointStyle() & 8) > 0) {
            final float fAbs2 = Math.abs(shownDataHorizonalValue3 - (getShownDataHorizonalValue(getPositionByPosIndex(this.hmChart.getChartDataManager().getChartDataList().getStart())) + this.hmChart.getInteractiveManager().getxOffset())) / halfDataWidth;
            HMLog.verbose(j, new Function0() { // from class: ym4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LineJoinRender.p(fAbs2);
                }
            });
            canvas.drawCircle(shownDataHorizonalValue3, shownDataVerticalValue2, ((LineJoinStyle) this.mStyle).getLineJointSize() + (((LineJoinStyle) this.mStyle).getLineJointResize() * (1.0f - (fAbs2 * 2.0f))), this.paintProvider.getLineJoinPaint());
        } else if ((((LineJoinStyle) this.mStyle).getLineJointStyle() & 4) > 0) {
            final float fAbs3 = Math.abs(shownDataHorizonalValue3 - (getShownDataHorizonalValue(getPositionByPosIndex(this.hmChart.getChartDataManager().getChartDataList().getStart())) + this.hmChart.getInteractiveManager().getxOffset())) / halfDataWidth;
            HMLog.verbose(j, new Function0() { // from class: zm4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LineJoinRender.q(fAbs3);
                }
            });
            canvas.drawCircle(shownDataHorizonalValue3, shownDataVerticalValue2, ((LineJoinStyle) this.mStyle).getLineJointSize() + (((LineJoinStyle) this.mStyle).getLineJointResize() * (1.0f - (fAbs3 * 2.0f))), this.paintProvider.getLinePaint());
            float lineJointSize = shownDataVerticalValue2 + ((LineJoinStyle) this.mStyle).getLineJointSize() + ((LineJoinStyle) this.mStyle).getLineJointWithLineHeight();
            float canvasHeight = getCanvasHeight();
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(((LineJoinStyle) this.mStyle).getLineJointWithLineStrokeWidth());
            paint2.setColor(Color.parseColor("#1A000000"));
            canvas.drawLine(shownDataHorizonalValue3, lineJointSize, shownDataHorizonalValue3, canvasHeight, paint2);
        }
    }

    @Override // com.huami.chart.render.BaseRender
    public boolean highlight(final int i) {
        ChartData dataByDataIndex;
        final Index currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex();
        HMLog.verbose(j, new Function0() { // from class: en4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LineJoinRender.r(currentIndex, i);
            }
        });
        return (currentIndex == null || currentIndex.isInvalidate() || (dataByDataIndex = this.hmChart.getChartDataManager().getDataByDataIndex(currentIndex.getDataIndex())) == null || dataByDataIndex.getIndex() != i) ? false : true;
    }
}
