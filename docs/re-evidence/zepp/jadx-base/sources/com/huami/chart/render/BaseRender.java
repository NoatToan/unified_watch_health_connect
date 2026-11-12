package com.huami.chart.render;

import android.graphics.Canvas;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.BaseStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseRender<T extends BaseStyle> {
    private static final String h = "BaseRender";
    private RenderConfig a;
    private float b;
    private float c;
    private int d;
    private int e;
    private int f;
    private int g;
    public HMChart hmChart;
    public T mStyle;
    public PaintProvider paintProvider;

    public BaseRender(HMChart hMChart, PaintProvider paintProvider) {
        this.b = 0.0f;
        this.paintProvider = paintProvider;
        this.hmChart = hMChart;
        this.a = hMChart.getRenderConfigManager().getRenderConfig();
        this.c = hMChart.getDrawAreaManager().getWidth();
        if (this.a.getAxisStyle() != null) {
            this.b = this.a.getAxisStyle().getxAxisMarginLeft();
            this.c -= this.a.getAxisStyle().getxAxisMarginRight();
        }
    }

    private float a(float f) {
        float f2 = this.b;
        float f3 = this.c;
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    private int b(int i, int i2, int i3) {
        ChartData dataByDataIndex;
        if (i2 - i > 1) {
            int i4 = (i + i2) / 2;
            ChartData dataByDataIndex2 = this.hmChart.getChartDataManager().getChartDataList().getDataByDataIndex(i4);
            if (dataByDataIndex2 == null) {
                return -1;
            }
            if (dataByDataIndex2.getStart() <= i3 && dataByDataIndex2.getEnd() > i3) {
                return i4;
            }
            if (dataByDataIndex2.getStart() == i3 && dataByDataIndex2.getEnd() == i3) {
                return i4;
            }
            if (dataByDataIndex2.getEnd() <= i3) {
                i = i4 + 1;
            }
            if (dataByDataIndex2.getStart() > i3) {
                i2 = i4;
            }
            return b(i, i2, i3);
        }
        ChartData dataByDataIndex3 = this.hmChart.getChartDataManager().getChartDataList().getDataByDataIndex(i);
        if (dataByDataIndex3 == null || (dataByDataIndex = this.hmChart.getChartDataManager().getChartDataList().getDataByDataIndex(i2)) == null) {
            return -1;
        }
        if (dataByDataIndex3.getStart() == i3 && dataByDataIndex3.getEnd() == i3) {
            return i;
        }
        if (dataByDataIndex.getStart() == i3 && dataByDataIndex.getEnd() == i3) {
            return i2;
        }
        if (dataByDataIndex3.getStart() <= i3 && dataByDataIndex3.getEnd() > i3) {
            return i;
        }
        if (dataByDataIndex.getStart() > i3 || dataByDataIndex.getEnd() <= i3) {
            return -1;
        }
        return i2;
    }

    private float c() {
        return ChartUtil.isRtl(this.hmChart) ? this.hmChart.getDrawAreaManager().getLeft() : this.hmChart.getDrawAreaManager().getRight();
    }

    private float d() {
        return ChartUtil.isRtl(this.hmChart) ? this.hmChart.getDrawAreaManager().getRight() : this.hmChart.getDrawAreaManager().getLeft();
    }

    public float adjustedHasDataX(float f) {
        Index currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex();
        if (currentIndex == null || currentIndex.getPosiIndex() == null) {
            return f;
        }
        if (Float.isNaN(f)) {
            f = getPositionByPosIndex(currentIndex.getPosiIndex().getIndex());
        }
        ChartData dataByPositionIndex = this.hmChart.getChartDataManager().getDataByPositionIndex(currentIndex.getPosiIndex().getIndex());
        if (!this.hmChart.getInteractiveManager().isEnableAutoAdjust()) {
            return f;
        }
        if (!this.hmChart.getInteractiveManager().isEnableAutoAdjust() || dataByPositionIndex != null) {
            return dataByPositionIndex == null ? f : (getShownDataHorizonalValue(getPositionByPosIndex(dataByPositionIndex.getStart())) + getShownDataHorizonalValue(getPositionByPosIndex(dataByPositionIndex.getEnd()))) / 2.0f;
        }
        int index = currentIndex.getPosiIndex().getIndex();
        int start = this.hmChart.getChartDataManager().getChartDataList().getStart();
        int end = this.hmChart.getChartDataManager().getChartDataList().getEnd();
        if (currentIndex.getPosiIndex().getIndex() < start) {
            index = start;
        } else if (currentIndex.getPosiIndex().getIndex() > end) {
            index = end;
        }
        return getPositionByPosIndex(index);
    }

    public float clipValueInCorrectRange(float f) {
        if (f < this.hmChart.getDrawAreaManager().getLeft()) {
            f = this.hmChart.getDrawAreaManager().getLeft();
        }
        return f > this.hmChart.getDrawAreaManager().getRight() ? this.hmChart.getDrawAreaManager().getRight() : f;
    }

    public void draw(Canvas canvas, int i, int i2, float f) {
        if (this.hmChart.getInteractiveManager().isAnchorCenter()) {
            c();
            d();
        }
        int start = this.hmChart.getHmDataCacheCenter().getIndexByPosition((this.hmChart.getInteractiveManager().getxOffset() + d()) / this.hmChart.getInteractiveManager().getScaleFactorX(), 0.0f).getPosiIndex().getStart() - 1;
        if (start < 0) {
            start = 0;
        }
        int iMin = Math.min(this.hmChart.getHmDataCacheCenter().getIndexByPosition((this.hmChart.getInteractiveManager().getxOffset() + c()) / this.hmChart.getInteractiveManager().getScaleFactorX(), 0.0f).getPosiIndex().getStart() + 1, this.hmChart.getChartDataManager().getChartDataList().getEnd());
        this.d = start;
        this.e = iMin;
        this.f = b(0, this.hmChart.getChartDataManager().getChartDataList().getCount() - 1, start);
        int iB = b(0, this.hmChart.getChartDataManager().getChartDataList().getCount() - 1, iMin);
        this.g = iB;
        if (iB == -1) {
            this.g = this.hmChart.getChartDataManager().getChartDataList().getCount() - 1;
        }
        this.g = this.g > this.hmChart.getChartDataManager().getChartDataList().getCount() + (-1) ? this.hmChart.getChartDataManager().getChartDataList().getCount() - 1 : this.g;
        int i3 = this.f;
        this.f = i3 >= 0 ? i3 : 0;
    }

    public float getAdjustedDownX() {
        return a(this.hmChart.getInteractiveManager().getDownX() + this.hmChart.getInteractiveManager().getxOffset());
    }

    public int getCanvasDataIndexEnd() {
        return this.g + 1;
    }

    public int getCanvasDataIndexStart() {
        return this.f;
    }

    public int getCanvasEnd() {
        return this.e;
    }

    public float getCanvasHeight() {
        return this.hmChart.getDrawAreaManager().getDrawHeight();
    }

    public int getCanvasStart() {
        return this.d;
    }

    public int getDataSize() {
        return this.hmChart.getChartDataManager().getChartDataList().getCount();
    }

    public float getPointPositionByValuePositionIndex(int i, int i2) {
        ChartData pointDataByPositionIndex = this.hmChart.getChartDataManager().getPointDataByPositionIndex(i, i2);
        if (pointDataByPositionIndex == null) {
            return 0.0f;
        }
        return getPositionByValue(pointDataByPositionIndex.getSumValue());
    }

    public float getPositionByPosIndex(int i) {
        return this.hmChart.getHmDataCacheCenter().getPositionByPosIndex(i) * this.hmChart.getInteractiveManager().getScaleFactorX();
    }

    public float getPositionByValue(float f) {
        return (this.hmChart.getDrawAreaManager().getHeight() - ((this.hmChart.getHmDataCacheCenter().getPositionByValue(f) * this.hmChart.getInteractiveManager().getScaleFactorY()) * this.hmChart.getInteractiveManager().getCurrentScale())) + ((this.hmChart.getInteractiveManager().getCurrentScale() - 1.0f) * this.hmChart.getDrawAreaManager().getMarginBottom());
    }

    public float getPositionByValuePositionIndex(int i) {
        ChartData dataByPositionIndex = this.hmChart.getChartDataManager().getDataByPositionIndex(i);
        if (dataByPositionIndex == null) {
            return 0.0f;
        }
        return getPositionByValue(dataByPositionIndex.getSumValue());
    }

    public float getShownDataHorizonalValue(float f) {
        return f - this.hmChart.getInteractiveManager().getxOffset();
    }

    public float getShownDataVerticalValue(float f) {
        return f;
    }

    public boolean highlight(int i) {
        Index currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex();
        return (currentIndex == null || currentIndex.isInvalidate() || currentIndex.getDataIndex() != i) ? false : true;
    }

    public boolean isFingerUp() {
        if (isInvalidIndex()) {
            return false;
        }
        return Float.isNaN(this.hmChart.getInteractiveManager().getCurrentDownX()) || Float.isNaN(this.hmChart.getInteractiveManager().getCurrentDownY());
    }

    public boolean isInvalidIndex() {
        return this.hmChart.getInteractiveManager().getCurrentIndex().isInvalidate();
    }

    public void setBaseStyle(T t) {
        this.mStyle = t;
        t.setRender(this);
    }

    public float clipValueInCorrectRange(float f, float f2) {
        if (f < this.hmChart.getDrawAreaManager().getLeft() - f2) {
            f = this.hmChart.getDrawAreaManager().getLeft() - f2;
        }
        return f > this.hmChart.getDrawAreaManager().getRight() + f2 ? this.hmChart.getDrawAreaManager().getRight() + f2 : f;
    }

    public float getPositionByValuePositionIndex(int i, int i2) {
        ChartData multiDataByPositionIndex = this.hmChart.getChartDataManager().getMultiDataByPositionIndex(i, i2);
        if (multiDataByPositionIndex == null) {
            return 0.0f;
        }
        return getPositionByValue(multiDataByPositionIndex.getSumValue());
    }

    public boolean highlight(float f, float f2) {
        if (f2 != -1.0f) {
            return false;
        }
        float currentDownX = this.hmChart.getInteractiveManager().getCurrentDownX() + this.hmChart.getInteractiveManager().getxOffset();
        return currentDownX >= f - this.hmChart.getDrawAreaManager().getHalfDataWidth() && currentDownX < f + this.hmChart.getDrawAreaManager().getHalfDataWidth();
    }

    public boolean highlight(float f, float f2, float f3) {
        float currentDownX = this.hmChart.getInteractiveManager().getCurrentDownX() + this.hmChart.getInteractiveManager().getxOffset();
        return currentDownX >= f && currentDownX < f2;
    }

    public boolean highlight(float f, float f2, float f3, float f4) {
        float currentDownX = this.hmChart.getInteractiveManager().getCurrentDownX();
        float currentDownY = this.hmChart.getInteractiveManager().getCurrentDownY();
        return currentDownX >= f && currentDownX < f2 && currentDownY >= f3 && currentDownY < f4;
    }
}
