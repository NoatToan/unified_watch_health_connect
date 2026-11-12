package com.huami.chart.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.PointChartDataList;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.render.InteractiveLineRender;
import com.huami.chart.style.InteractiveLineStyle;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class InteractiveLineRender extends BaseRender<InteractiveLineStyle> {
    private static final String j = "InteractiveLineRender";
    private RenderConfig i;

    public InteractiveLineRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
        this.i = hMChart.getRenderConfigManager().getRenderConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A() {
        return "return by getCurrentDownX isNaN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B() {
        return "return by currentIndex is invalidate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C() {
        return "return by data is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D() {
        return "return by getSumValue is smaller than min data";
    }

    private void m(Canvas canvas) {
        if ((((InteractiveLineStyle) this.mStyle).getInteractiveLineStyle() & 16) > 0) {
            if (((InteractiveLineStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) {
                return;
            }
            float adjustedDownX = getAdjustedDownX();
            if (!((InteractiveLineStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) {
                adjustedDownX = adjustedHasDataX(adjustedDownX);
            }
            float f = adjustedDownX;
            float top = this.hmChart.getDrawAreaManager().getTop();
            float bottom = this.hmChart.getDrawAreaManager().getBottom();
            Paint interactiveLinePaint = this.paintProvider.getInteractiveLinePaint(((InteractiveLineStyle) this.mStyle).getVerticalLineColor());
            interactiveLinePaint.setStrokeWidth(((InteractiveLineStyle) this.mStyle).getVerticalLineWidth());
            if (((InteractiveLineStyle) this.mStyle).getVerticalLineShader() != null) {
                interactiveLinePaint.setShader(((InteractiveLineStyle) this.mStyle).getVerticalLineShader());
            }
            canvas.drawLine(f, top, f, bottom, interactiveLinePaint);
        }
    }

    private void n(Canvas canvas, ChartDataList chartDataList) {
        if ((((InteractiveLineStyle) this.mStyle).getInteractiveLineStyle() & 2) > 0) {
            if (((InteractiveLineStyle) this.mStyle).isInteractiveUpCancel() && Float.isNaN(this.hmChart.getInteractiveManager().getCurrentDownX())) {
                HMLog.debug(j, new Function0() { // from class: bg4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InteractiveLineRender.w();
                    }
                });
                return;
            }
            Index currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex();
            if (currentIndex.isInvalidate()) {
                HMLog.debug(j, new Function0() { // from class: hg4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InteractiveLineRender.x();
                    }
                });
                return;
            }
            if (currentIndex.getPosiIndex() == null) {
                return;
            }
            float positionByPosIndex = getPositionByPosIndex(currentIndex.getPosiIndex().getIndex());
            if (Float.isNaN(positionByPosIndex)) {
                return;
            }
            float top = this.hmChart.getDrawAreaManager().getTop();
            float bottom = this.hmChart.getDrawAreaManager().getBottom();
            Paint interactiveLinePaint = this.paintProvider.getInteractiveLinePaint(((InteractiveLineStyle) this.mStyle).getVerticalLineColor());
            interactiveLinePaint.setStrokeWidth(((InteractiveLineStyle) this.mStyle).getVerticalLineWidth());
            canvas.drawLine(positionByPosIndex, top, positionByPosIndex, bottom, interactiveLinePaint);
        }
    }

    private void o(Canvas canvas) {
        if ((((InteractiveLineStyle) this.mStyle).getInteractiveLineStyle() & 32) > 0) {
            if (((InteractiveLineStyle) this.mStyle).isInteractiveUpCancel() && Float.isNaN(this.hmChart.getInteractiveManager().getCurrentDownX())) {
                HMLog.debug(j, new Function0() { // from class: eg4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InteractiveLineRender.y();
                    }
                });
                return;
            }
            Index currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex();
            if (currentIndex.isInvalidate()) {
                HMLog.debug(j, new Function0() { // from class: cg4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InteractiveLineRender.z();
                    }
                });
                return;
            }
            if (currentIndex.getPosiIndex() == null) {
                return;
            }
            ChartData dataByDataIndex = this.hmChart.getChartDataManager().getDataByDataIndex(currentIndex.getDataIndex());
            float shownDataHorizonalValue = dataByDataIndex != null ? (getShownDataHorizonalValue(getPositionByPosIndex(dataByDataIndex.getStart())) + getShownDataHorizonalValue(getPositionByPosIndex(dataByDataIndex.getEnd()))) / 2.0f : getPositionByPosIndex(currentIndex.getPosiIndex().getIndex());
            float top = this.hmChart.getDrawAreaManager().getTop();
            float bottom = this.hmChart.getDrawAreaManager().getBottom();
            Paint interactiveLinePaint = this.paintProvider.getInteractiveLinePaint(((InteractiveLineStyle) this.mStyle).getVerticalLineColor());
            interactiveLinePaint.setStrokeWidth(((InteractiveLineStyle) this.mStyle).getVerticalLineWidth());
            canvas.drawLine(shownDataHorizonalValue, top, shownDataHorizonalValue, bottom, interactiveLinePaint);
        }
    }

    private void p(Canvas canvas) {
        float left;
        float right;
        if ((((InteractiveLineStyle) this.mStyle).getInteractiveLineStyle() & 8) > 0) {
            if (((InteractiveLineStyle) this.mStyle).isInteractiveUpCancel() && Float.isNaN(this.hmChart.getInteractiveManager().getCurrentDownX())) {
                HMLog.debug(j, new Function0() { // from class: gg4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InteractiveLineRender.A();
                    }
                });
                return;
            }
            Index currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex();
            if (currentIndex.isInvalidate()) {
                HMLog.debug(j, new Function0() { // from class: ag4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InteractiveLineRender.B();
                    }
                });
                return;
            }
            ChartData dataByPositionIndex = this.hmChart.getChartDataManager().getDataByPositionIndex(currentIndex.getPosiIndex().getIndex());
            if (dataByPositionIndex == null) {
                HMLog.debug(j, new Function0() { // from class: dg4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InteractiveLineRender.C();
                    }
                });
                return;
            }
            if (dataByPositionIndex.getSumValue() < this.hmChart.getChartDataManager().getChartDataList().getMinDataValue()) {
                HMLog.debug(j, new Function0() { // from class: fg4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InteractiveLineRender.D();
                    }
                });
                return;
            }
            float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(currentIndex.getPosiIndex().getIndex()));
            if (this.i.getAxisStyle() != null) {
                left = this.i.getAxisStyle().getxAxisMarginLeft();
                right = this.hmChart.getDrawAreaManager().getWidth() - this.i.getAxisStyle().getxAxisMarginRight();
            } else {
                left = this.hmChart.getDrawAreaManager().getLeft();
                right = this.hmChart.getDrawAreaManager().getRight();
            }
            Paint interactiveLinePaint = this.paintProvider.getInteractiveLinePaint(((InteractiveLineStyle) this.mStyle).getHorizontalLineColor());
            interactiveLinePaint.setStrokeWidth(((InteractiveLineStyle) this.mStyle).getHorizontalLineWidth());
            canvas.drawLine(left, shownDataVerticalValue, right, shownDataVerticalValue, interactiveLinePaint);
        }
    }

    private void q(Canvas canvas) {
        if (((InteractiveLineStyle) this.mStyle).getIntersectionPointSize() > 0.0f) {
            if (((InteractiveLineStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp()) {
                return;
            }
            Index currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex();
            if (currentIndex.isInvalidate()) {
                return;
            }
            r(canvas, currentIndex);
            s(canvas, currentIndex);
            u(canvas, currentIndex);
        }
    }

    private void r(Canvas canvas, Index index) {
        ChartData dataByDataIndex;
        float shownDataVerticalValue;
        float shownDataHorizonalValue;
        if (((InteractiveLineStyle) this.mStyle).isHideMainInteractivePoint()) {
            return;
        }
        if ((((InteractiveLineStyle) this.mStyle).getInteractiveLineStyle() & 32) > 0) {
            dataByDataIndex = -1 != index.getDataIndex() ? this.hmChart.getChartDataManager().getDataByDataIndex(index.getDataIndex()) : this.hmChart.getChartDataManager().getDataByPositionIndex(index.getPosiIndex().getIndex());
        } else {
            dataByDataIndex = this.hmChart.getRenderConfigManager().getRenderConfig().getBarStyle() != null ? this.hmChart.getChartDataManager().getDataByDataIndex(index.getDataIndex()) : this.hmChart.getChartDataManager().getDataByDataIndex(index.getDataIndex());
        }
        if (!((InteractiveLineStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp() && this.hmChart.getInteractiveManager().isEnableAutoAdjust() && dataByDataIndex == null) {
            dataByDataIndex = this.hmChart.getChartDataManager().getDataByPositionIndex(index.getPosiIndex().getIndex());
        }
        if (dataByDataIndex != null && dataByDataIndex.getSumValue() >= this.hmChart.getChartDataManager().getChartDataList().getMinDataValue()) {
            if (this.hmChart.getRenderConfigManager().getRenderConfig().getBarStyle() != null || (((InteractiveLineStyle) this.mStyle).getInteractiveLineStyle() & 32) > 0) {
                float shownDataHorizonalValue2 = (getShownDataHorizonalValue(getPositionByPosIndex(dataByDataIndex.getStart())) + getShownDataHorizonalValue(getPositionByPosIndex(dataByDataIndex.getEnd()))) / 2.0f;
                shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(dataByDataIndex.getIndex()));
                shownDataHorizonalValue = shownDataHorizonalValue2;
            } else {
                shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(index.getPosiIndex().getIndex()));
                shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(index.getPosiIndex().getIndex()));
            }
            t(canvas, clipValueInCorrectRange(shownDataHorizonalValue), shownDataVerticalValue, ((InteractiveLineStyle) this.mStyle).getIntersectionPointColor(), ((InteractiveLineStyle) this.mStyle).getPointShadowColor());
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x019c  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a9  */
    private void s(Canvas canvas, Index index) {
        float positionByPosIndex;
        float shownDataVerticalValue;
        int i;
        if (this.hmChart.getChartDataManager().getMultiChartDataList() == null || this.hmChart.getChartDataManager().getMultiChartDataList().length == 0) {
            return;
        }
        for (int i2 = 0; i2 < this.hmChart.getChartDataManager().getMultiChartDataList().length; i2++) {
            Index currentIndex = Float.isNaN(this.hmChart.getInteractiveManager().getDownX()) ? this.hmChart.getInteractiveManager().getCurrentIndex() : this.hmChart.getHmDataCacheCenter().getMultiIndexByPosition((this.hmChart.getInteractiveManager().getxOffset() + this.hmChart.getInteractiveManager().getDownX()) / this.hmChart.getInteractiveManager().getScaleFactorX(), 0.0f, this.hmChart.getChartDataManager().getMultiChartDataList()[i2]);
            if ((((InteractiveLineStyle) this.mStyle).getInteractiveLineStyle() & 32) > 0) {
                ChartData multiDataByDataIndex = -1 != currentIndex.getDataIndex() ? this.hmChart.getChartDataManager().getMultiDataByDataIndex(i2, currentIndex.getDataIndex()) : this.hmChart.getChartDataManager().getMultiDataByPositionIndex(i2, currentIndex.getPosiIndex().getIndex());
                if (multiDataByDataIndex != null) {
                    positionByPosIndex = (getShownDataHorizonalValue(getPositionByPosIndex(multiDataByDataIndex.getStart())) + getShownDataHorizonalValue(getPositionByPosIndex(multiDataByDataIndex.getEnd()))) / 2.0f;
                    shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(i2, multiDataByDataIndex.getIndex()));
                    float f = shownDataVerticalValue;
                    float fClipValueInCorrectRange = clipValueInCorrectRange(getShownDataHorizonalValue(positionByPosIndex));
                    if (this.i.getMultiLineStyle().getIntersectionPointColor() != null) {
                        i = this.i.getMultiLineStyle().getIntersectionPointColor()[i2];
                    } else {
                        i = this.i.getMultiLineStyle().getLineColors()[i2];
                    }
                    t(canvas, fClipValueInCorrectRange, f, i, ((InteractiveLineStyle) this.mStyle).getPointShadowColor());
                }
            } else if (this.hmChart.getRenderConfigManager().getRenderConfig().getBarStyle() != null) {
                ChartData chartDataV = v(i2, currentIndex, this.hmChart.getChartDataManager().getMultiDataByDataIndex(i2, index.getDataIndex()));
                if (chartDataV != null) {
                    positionByPosIndex = (getShownDataHorizonalValue(getPositionByPosIndex(chartDataV.getStart())) + getShownDataHorizonalValue(getPositionByPosIndex(chartDataV.getEnd()))) / 2.0f;
                    shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(i2, chartDataV.getIndex()));
                    float f2 = shownDataVerticalValue;
                    float fClipValueInCorrectRange2 = clipValueInCorrectRange(getShownDataHorizonalValue(positionByPosIndex));
                    if (this.i.getMultiLineStyle().getIntersectionPointColor() != null) {
                        i = this.i.getMultiLineStyle().getIntersectionPointColor()[i2];
                    } else {
                        i = this.i.getMultiLineStyle().getLineColors()[i2];
                    }
                    t(canvas, fClipValueInCorrectRange2, f2, i, ((InteractiveLineStyle) this.mStyle).getPointShadowColor());
                }
            } else {
                ChartData multiDataByDataIndex2 = this.hmChart.getChartDataManager().getMultiDataByDataIndex(i2, currentIndex.getDataIndex());
                if (!((InteractiveLineStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp() && this.hmChart.getInteractiveManager().isEnableAutoAdjust() && multiDataByDataIndex2 == null) {
                    multiDataByDataIndex2 = this.hmChart.getChartDataManager().getMultiDataByPositionIndex(i2, index.getPosiIndex().getIndex());
                }
                if (multiDataByDataIndex2 != null) {
                    positionByPosIndex = getPositionByPosIndex(index.getPosiIndex().getIndex());
                    shownDataVerticalValue = getShownDataVerticalValue(getPositionByValuePositionIndex(i2, index.getPosiIndex().getIndex()));
                    float f3 = shownDataVerticalValue;
                    float fClipValueInCorrectRange3 = clipValueInCorrectRange(getShownDataHorizonalValue(positionByPosIndex));
                    if (this.i.getMultiLineStyle().getIntersectionPointColor() != null) {
                        i = this.i.getMultiLineStyle().getIntersectionPointColor()[i2];
                    } else {
                        i = this.i.getMultiLineStyle().getLineColors()[i2];
                    }
                    t(canvas, fClipValueInCorrectRange3, f3, i, ((InteractiveLineStyle) this.mStyle).getPointShadowColor());
                }
            }
        }
    }

    private void t(Canvas canvas, float f, float f2, int i, int i2) {
        Paint interactiveLinePaint = this.paintProvider.getInteractiveLinePaint(i);
        if (((InteractiveLineStyle) this.mStyle).getIntersectionPointBorder() > 0.0f) {
            interactiveLinePaint.setColor(((InteractiveLineStyle) this.mStyle).getIntersectionPointBorderColor());
            if (((InteractiveLineStyle) this.mStyle).getPointShadowRadius() >= 0.0f) {
                interactiveLinePaint.setShadowLayer(((InteractiveLineStyle) this.mStyle).getPointShadowRadius(), ((InteractiveLineStyle) this.mStyle).getPointShadowDx(), ((InteractiveLineStyle) this.mStyle).getPointShadowDy(), i2);
            }
            canvas.drawCircle(f, f2, ((InteractiveLineStyle) this.mStyle).getIntersectionPointSize() + ((InteractiveLineStyle) this.mStyle).getIntersectionPointBorder(), interactiveLinePaint);
        }
        interactiveLinePaint.setColor(i);
        interactiveLinePaint.clearShadowLayer();
        canvas.drawCircle(f, f2, ((InteractiveLineStyle) this.mStyle).getIntersectionPointSize(), interactiveLinePaint);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00df  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
    private void u(Canvas canvas, Index index) {
        float positionByPosIndex;
        float shownDataVerticalValue;
        int interactivePointColor;
        int interactivePointColor2;
        ChartDataList[] pointChartDataList = this.hmChart.getChartDataManager().getPointChartDataList();
        if (pointChartDataList == null || pointChartDataList.length == 0) {
            return;
        }
        for (int i = 0; i < pointChartDataList.length; i++) {
            ChartDataList chartDataList = pointChartDataList[i];
            Index multiIndexByPosition = this.hmChart.getHmDataCacheCenter().getMultiIndexByPosition((this.hmChart.getInteractiveManager().getxOffset() + this.hmChart.getInteractiveManager().getDownX()) / this.hmChart.getInteractiveManager().getScaleFactorX(), 0.0f, chartDataList);
            if ((((InteractiveLineStyle) this.mStyle).getInteractiveLineStyle() & 32) > 0) {
                ChartData pointDataByDataIndex = -1 != multiIndexByPosition.getDataIndex() ? this.hmChart.getChartDataManager().getPointDataByDataIndex(i, multiIndexByPosition.getDataIndex()) : this.hmChart.getChartDataManager().getPointDataByPositionIndex(i, multiIndexByPosition.getPosiIndex().getIndex());
                if (pointDataByDataIndex != null) {
                    positionByPosIndex = (getShownDataHorizonalValue(getPositionByPosIndex(pointDataByDataIndex.getStart())) + getShownDataHorizonalValue(getPositionByPosIndex(pointDataByDataIndex.getEnd()))) / 2.0f;
                    shownDataVerticalValue = getShownDataVerticalValue(getPointPositionByValuePositionIndex(i, pointDataByDataIndex.getIndex()));
                    float f = shownDataVerticalValue;
                    interactivePointColor = this.i.getPointStyle().getInteractivePointColor();
                    if (chartDataList instanceof PointChartDataList) {
                        interactivePointColor2 = ((PointChartDataList) chartDataList).getInteractivePointColor();
                    } else {
                        interactivePointColor2 = interactivePointColor;
                    }
                    t(canvas, clipValueInCorrectRange(getShownDataHorizonalValue(positionByPosIndex)), f, interactivePointColor2, ((InteractiveLineStyle) this.mStyle).getPointShadowColor());
                }
            } else if (this.hmChart.getChartDataManager().getPointDataByDataIndex(i, multiIndexByPosition.getDataIndex()) != null) {
                positionByPosIndex = getPositionByPosIndex(index.getPosiIndex().getIndex());
                shownDataVerticalValue = getShownDataVerticalValue(getPointPositionByValuePositionIndex(i, multiIndexByPosition.getPosiIndex().getIndex()));
                float f2 = shownDataVerticalValue;
                interactivePointColor = this.i.getPointStyle().getInteractivePointColor();
                if (chartDataList instanceof PointChartDataList) {
                    interactivePointColor2 = ((PointChartDataList) chartDataList).getInteractivePointColor();
                } else {
                    interactivePointColor2 = interactivePointColor;
                }
                t(canvas, clipValueInCorrectRange(getShownDataHorizonalValue(positionByPosIndex)), f2, interactivePointColor2, ((InteractiveLineStyle) this.mStyle).getPointShadowColor());
            }
        }
    }

    private ChartData v(int i, Index index, ChartData chartData) {
        return (!((InteractiveLineStyle) this.mStyle).isInteractiveUpCancel() && isFingerUp() && this.hmChart.getInteractiveManager().isEnableAutoAdjust() && chartData == null) ? this.hmChart.getChartDataManager().getMultiDataByPositionIndex(i, index.getPosiIndex().getIndex()) : chartData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w() {
        return "return by getCurrentDownX isNaN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x() {
        return "return by currentIndex is invalidate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String y() {
        return "return by getCurrentDownX isNaN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z() {
        return "return by currentIndex is invalidate";
    }

    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i, int i2, float f) {
        super.draw(canvas, i, i2, f);
        ChartDataList chartDataList = this.hmChart.getChartDataManager().getChartDataList();
        if (chartDataList.getCount() == 0) {
            return;
        }
        m(canvas);
        n(canvas, chartDataList);
        o(canvas);
        p(canvas);
        q(canvas);
    }
}
