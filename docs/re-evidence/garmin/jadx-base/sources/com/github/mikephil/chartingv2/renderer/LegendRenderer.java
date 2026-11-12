package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.data.ChartData;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.IDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet;
import com.github.mikephil.chartingv2.utils.FSize;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import i3.e5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class LegendRenderer extends Renderer {
    protected Legend mLegend;
    protected Paint mLegendFormPaint;
    protected Paint mLegendLabelPaint;

    /* JADX INFO: renamed from: com.github.mikephil.chartingv2.renderer.LegendRenderer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendForm;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition;

        static {
            int[] iArr = new int[Legend.LegendForm.values().length];
            $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendForm = iArr;
            try {
                iArr[Legend.LegendForm.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendForm[Legend.LegendForm.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendForm[Legend.LegendForm.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Legend.LegendPosition.values().length];
            $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition = iArr2;
            try {
                iArr2[Legend.LegendPosition.BELOW_CHART_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.BELOW_CHART_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.BELOW_CHART_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.ABOVE_CHART_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.ABOVE_CHART_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.ABOVE_CHART_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.PIECHART_CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.RIGHT_OF_CHART.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.RIGHT_OF_CHART_CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.RIGHT_OF_CHART_INSIDE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.LEFT_OF_CHART.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.LEFT_OF_CHART_CENTER.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[Legend.LegendPosition.LEFT_OF_CHART_INSIDE.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public LegendRenderer(ViewPortHandler viewPortHandler, Legend legend) {
        super(viewPortHandler);
        this.mLegend = legend;
        Paint paint = new Paint(1);
        this.mLegendLabelPaint = paint;
        paint.setTextSize(Utils.convertDpToPixel(9.0f));
        this.mLegendLabelPaint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.mLegendFormPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.mLegendFormPaint.setStrokeWidth(3.0f);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x010a A[SYNTHETIC] */
    public void computeLegend(ChartData<?> chartData) {
        int i14;
        ICandleDataSet iCandleDataSet;
        List<String> xVals;
        IPieDataSet iPieDataSet;
        int i15;
        if (!this.mLegend.isLegendCustom()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i16 = 0; i16 < chartData.getDataSetCount(); i16++) {
                IDataSet dataSetByIndex = chartData.getDataSetByIndex(i16);
                List<Integer> colors = dataSetByIndex.getColors();
                int entryCount = dataSetByIndex.getEntryCount();
                if (dataSetByIndex instanceof IBarDataSet) {
                    IBarDataSet iBarDataSet = (IBarDataSet) dataSetByIndex;
                    if (iBarDataSet.isStacked()) {
                        String[] stackLabels = iBarDataSet.getStackLabels();
                        for (int i17 = 0; i17 < colors.size() && i17 < iBarDataSet.getStackSize(); i17++) {
                            arrayList.add(stackLabels[i17 % stackLabels.length]);
                            arrayList2.add(colors.get(i17));
                        }
                        if (iBarDataSet.getLabel() != null) {
                            arrayList2.add(1122868);
                            arrayList.add(iBarDataSet.getLabel());
                        }
                    } else if (dataSetByIndex instanceof IPieDataSet) {
                        xVals = chartData.getXVals();
                        iPieDataSet = (IPieDataSet) dataSetByIndex;
                        for (i15 = 0; i15 < colors.size() && i15 < entryCount && i15 < xVals.size(); i15++) {
                            arrayList.add(xVals.get(i15));
                            arrayList2.add(colors.get(i15));
                        }
                        if (iPieDataSet.getLabel() != null) {
                            arrayList2.add(1122868);
                            arrayList.add(iPieDataSet.getLabel());
                        }
                    } else if (dataSetByIndex instanceof ICandleDataSet) {
                        iCandleDataSet = (ICandleDataSet) dataSetByIndex;
                        if (iCandleDataSet.getDecreasingColor() != 1122867) {
                            arrayList2.add(Integer.valueOf(iCandleDataSet.getDecreasingColor()));
                            arrayList2.add(Integer.valueOf(iCandleDataSet.getIncreasingColor()));
                            arrayList.add(null);
                            arrayList.add(dataSetByIndex.getLabel());
                        } else {
                            for (i14 = 0; i14 < colors.size() && i14 < entryCount; i14++) {
                                if (i14 < colors.size() - 1 || i14 >= entryCount - 1) {
                                    arrayList.add(chartData.getDataSetByIndex(i16).getLabel());
                                } else {
                                    arrayList.add(null);
                                }
                                arrayList2.add(colors.get(i14));
                            }
                        }
                    } else {
                        while (i14 < colors.size()) {
                            if (i14 < colors.size() - 1) {
                                arrayList.add(chartData.getDataSetByIndex(i16).getLabel());
                            } else {
                                arrayList.add(chartData.getDataSetByIndex(i16).getLabel());
                            }
                            arrayList2.add(colors.get(i14));
                        }
                    }
                } else if (dataSetByIndex instanceof IPieDataSet) {
                    xVals = chartData.getXVals();
                    iPieDataSet = (IPieDataSet) dataSetByIndex;
                    while (i15 < colors.size()) {
                        arrayList.add(xVals.get(i15));
                        arrayList2.add(colors.get(i15));
                    }
                    if (iPieDataSet.getLabel() != null) {
                        arrayList2.add(1122868);
                        arrayList.add(iPieDataSet.getLabel());
                    }
                } else if (dataSetByIndex instanceof ICandleDataSet) {
                    iCandleDataSet = (ICandleDataSet) dataSetByIndex;
                    if (iCandleDataSet.getDecreasingColor() != 1122867) {
                        arrayList2.add(Integer.valueOf(iCandleDataSet.getDecreasingColor()));
                        arrayList2.add(Integer.valueOf(iCandleDataSet.getIncreasingColor()));
                        arrayList.add(null);
                        arrayList.add(dataSetByIndex.getLabel());
                    } else {
                        while (i14 < colors.size()) {
                            if (i14 < colors.size() - 1) {
                                arrayList.add(chartData.getDataSetByIndex(i16).getLabel());
                            } else {
                                arrayList.add(chartData.getDataSetByIndex(i16).getLabel());
                            }
                            arrayList2.add(colors.get(i14));
                        }
                    }
                } else {
                    while (i14 < colors.size()) {
                        if (i14 < colors.size() - 1) {
                            arrayList.add(chartData.getDataSetByIndex(i16).getLabel());
                        } else {
                            arrayList.add(chartData.getDataSetByIndex(i16).getLabel());
                        }
                        arrayList2.add(colors.get(i14));
                    }
                }
            }
            if (this.mLegend.getExtraColors() != null && this.mLegend.getExtraLabels() != null) {
                int[] extraColors = this.mLegend.getExtraColors();
                int length = extraColors.length;
                for (int iD = 0; iD < length; iD = e5.d(extraColors[iD], iD, arrayList2, 1)) {
                }
                Collections.addAll(arrayList, this.mLegend.getExtraLabels());
            }
            this.mLegend.setComputedColors(arrayList2);
            this.mLegend.setComputedLabels(arrayList);
        }
        Typeface typeface = this.mLegend.getTypeface();
        if (typeface != null) {
            this.mLegendLabelPaint.setTypeface(typeface);
        }
        this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
        this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
        this.mLegend.calculateDimensions(this.mLegendLabelPaint, this.mViewPortHandler);
    }

    public void drawForm(Canvas canvas, float f14, float f15, int i14, Legend legend) {
        if (legend.getColors()[i14] == 1122868) {
            return;
        }
        this.mLegendFormPaint.setColor(legend.getColors()[i14]);
        float formSize = legend.getFormSize();
        float f16 = formSize / 2.0f;
        int i15 = AnonymousClass1.$SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendForm[legend.getForm().ordinal()];
        if (i15 == 1) {
            canvas.drawCircle(f14 + f16, f15, f16, this.mLegendFormPaint);
        } else if (i15 == 2) {
            canvas.drawRect(f14, f15 - f16, f14 + formSize, f15 + f16, this.mLegendFormPaint);
        } else {
            if (i15 != 3) {
                return;
            }
            canvas.drawLine(f14, f15, f14 + formSize, f15, this.mLegendFormPaint);
        }
    }

    public void drawLabel(Canvas canvas, float f14, float f15, String str) {
        canvas.drawText(str, f14, f15, this.mLegendLabelPaint);
    }

    public Paint getFormPaint() {
        return this.mLegendFormPaint;
    }

    public Paint getLabelPaint() {
        return this.mLegendLabelPaint;
    }

    public void renderLegend(Canvas canvas) {
        float fContentLeft;
        Canvas canvas2;
        FSize[] fSizeArr;
        Boolean[] boolArr;
        int i14;
        Legend.LegendPosition legendPosition;
        int i15;
        float f14;
        float fContentTop;
        float chartHeight;
        float f15;
        float f16;
        float f17;
        Canvas canvas3;
        float fCalcTextWidth;
        if (this.mLegend.isEnabled()) {
            Typeface typeface = this.mLegend.getTypeface();
            if (typeface != null) {
                this.mLegendLabelPaint.setTypeface(typeface);
            }
            this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
            this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
            float lineHeight = Utils.getLineHeight(this.mLegendLabelPaint);
            float yEntrySpace = this.mLegend.getYEntrySpace() + Utils.getLineSpacing(this.mLegendLabelPaint);
            float fCalcTextHeight = lineHeight - (Utils.calcTextHeight(this.mLegendLabelPaint, "ABC") / 2.0f);
            String[] labels = this.mLegend.getLabels();
            int[] colors = this.mLegend.getColors();
            float formToTextSpace = this.mLegend.getFormToTextSpace();
            float xEntrySpace = this.mLegend.getXEntrySpace();
            Legend.LegendDirection direction = this.mLegend.getDirection();
            float formSize = this.mLegend.getFormSize();
            float stackSpace = this.mLegend.getStackSpace();
            float yOffset = this.mLegend.getYOffset();
            float xOffset = this.mLegend.getXOffset();
            Legend.LegendPosition position = this.mLegend.getPosition();
            int i16 = 1122868;
            float chartHeight2 = 0.0f;
            switch (AnonymousClass1.$SwitchMap$com$github$mikephil$chartingv2$components$Legend$LegendPosition[position.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    float fContentWidth = this.mViewPortHandler.contentWidth();
                    if (position == Legend.LegendPosition.BELOW_CHART_LEFT || position == Legend.LegendPosition.ABOVE_CHART_LEFT) {
                        fContentLeft = this.mViewPortHandler.contentLeft() + xOffset;
                        if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            fContentLeft += this.mLegend.mNeededWidth;
                        }
                    } else {
                        if (position == Legend.LegendPosition.BELOW_CHART_RIGHT || position == Legend.LegendPosition.ABOVE_CHART_RIGHT) {
                            fContentLeft = this.mViewPortHandler.contentRight() - xOffset;
                            if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                                f14 = this.mLegend.mNeededWidth;
                            }
                        } else {
                            fContentLeft = (fContentWidth / 2.0f) + this.mViewPortHandler.contentLeft();
                            f14 = this.mLegend.mNeededWidth / 2.0f;
                        }
                        fContentLeft -= f14;
                    }
                    float f18 = fContentLeft;
                    FSize[] calculatedLineSizes = this.mLegend.getF80361h();
                    FSize[] calculatedLabelSizes = this.mLegend.getF80359f();
                    Boolean[] calculatedLabelBreakPoints = this.mLegend.getF80360g();
                    if (position != Legend.LegendPosition.ABOVE_CHART_LEFT && position != Legend.LegendPosition.ABOVE_CHART_RIGHT && position != Legend.LegendPosition.ABOVE_CHART_CENTER) {
                        chartHeight2 = (this.mViewPortHandler.getChartHeight() - yOffset) - this.mLegend.mNeededHeight;
                    }
                    int length = labels.length;
                    float f19 = f18;
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < length) {
                        int i19 = length;
                        if (i17 < calculatedLabelBreakPoints.length && calculatedLabelBreakPoints[i17].booleanValue()) {
                            chartHeight2 = lineHeight + yEntrySpace + chartHeight2;
                            f19 = f19;
                        }
                        if (f19 == f19 && position == Legend.LegendPosition.BELOW_CHART_CENTER && i18 < calculatedLineSizes.length) {
                            f19 = ((direction == Legend.LegendDirection.RIGHT_TO_LEFT ? calculatedLineSizes[i18].width : -calculatedLineSizes[i18].width) / 2.0f) + f19;
                            i18++;
                        }
                        int i24 = i18;
                        boolean z14 = colors[i17] != 1122868;
                        boolean z15 = labels[i17] == null;
                        if (z14) {
                            if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                                f19 -= formSize;
                            }
                            i14 = i19;
                            boolArr = calculatedLabelBreakPoints;
                            fSizeArr = calculatedLineSizes;
                            legendPosition = position;
                            canvas2 = canvas;
                            i15 = i17;
                            float f22 = f19;
                            drawForm(canvas2, f22, chartHeight2 + fCalcTextHeight, i15, this.mLegend);
                            f19 = direction == Legend.LegendDirection.LEFT_TO_RIGHT ? f22 + formSize : f22;
                        } else {
                            canvas2 = canvas;
                            fSizeArr = calculatedLineSizes;
                            boolArr = calculatedLabelBreakPoints;
                            i14 = i19;
                            legendPosition = position;
                            i15 = i17;
                        }
                        if (z15) {
                            f19 += direction == Legend.LegendDirection.RIGHT_TO_LEFT ? -stackSpace : stackSpace;
                        } else {
                            if (z14) {
                                f19 += direction == Legend.LegendDirection.RIGHT_TO_LEFT ? -formToTextSpace : formToTextSpace;
                            }
                            Legend.LegendDirection legendDirection = Legend.LegendDirection.RIGHT_TO_LEFT;
                            if (direction == legendDirection) {
                                f19 -= calculatedLabelSizes[i15].width;
                            }
                            float f24 = f19;
                            drawLabel(canvas2, f24, chartHeight2 + lineHeight, labels[i15]);
                            if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                                f24 += calculatedLabelSizes[i15].width;
                            }
                            f19 = f24 + (direction == legendDirection ? -xEntrySpace : xEntrySpace);
                        }
                        i17 = i15 + 1;
                        position = legendPosition;
                        i18 = i24;
                        calculatedLineSizes = fSizeArr;
                        calculatedLabelBreakPoints = boolArr;
                        length = i14;
                    }
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    if (position == Legend.LegendPosition.PIECHART_CENTER) {
                        float chartWidth = this.mViewPortHandler.getChartWidth() / 2.0f;
                        Legend.LegendDirection legendDirection2 = Legend.LegendDirection.LEFT_TO_RIGHT;
                        Legend legend = this.mLegend;
                        float f25 = chartWidth + ((direction == legendDirection2 ? -legend.mTextWidthMax : legend.mTextWidthMax) / 2.0f);
                        float chartHeight3 = this.mViewPortHandler.getChartHeight() / 2.0f;
                        Legend legend2 = this.mLegend;
                        chartHeight = legend2.getYOffset() + (chartHeight3 - (legend2.mNeededHeight / 2.0f));
                        f15 = f25;
                    } else {
                        Legend.LegendPosition legendPosition2 = Legend.LegendPosition.RIGHT_OF_CHART;
                        if (position == legendPosition2 || position == Legend.LegendPosition.RIGHT_OF_CHART_CENTER || position == Legend.LegendPosition.RIGHT_OF_CHART_INSIDE) {
                            xOffset = this.mViewPortHandler.getChartWidth() - xOffset;
                            if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                                xOffset -= this.mLegend.mTextWidthMax;
                            }
                        } else if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            xOffset += this.mLegend.mTextWidthMax;
                        }
                        if (position == legendPosition2 || position == Legend.LegendPosition.LEFT_OF_CHART) {
                            fContentTop = this.mViewPortHandler.contentTop();
                        } else {
                            if (position == Legend.LegendPosition.RIGHT_OF_CHART_CENTER || position == Legend.LegendPosition.LEFT_OF_CHART_CENTER) {
                                chartHeight = (this.mViewPortHandler.getChartHeight() / 2.0f) - (this.mLegend.mNeededHeight / 2.0f);
                            } else {
                                fContentTop = this.mViewPortHandler.contentTop();
                            }
                            f15 = xOffset;
                        }
                        chartHeight = fContentTop + yOffset;
                        f15 = xOffset;
                    }
                    float f26 = chartHeight;
                    float f27 = 0.0f;
                    int i25 = 0;
                    boolean z16 = false;
                    while (i25 < labels.length) {
                        boolean z17 = colors[i25] != i16;
                        if (z17) {
                            Legend.LegendDirection legendDirection3 = Legend.LegendDirection.LEFT_TO_RIGHT;
                            float f28 = direction == legendDirection3 ? f15 + f27 : f15 - (formSize - f27);
                            f17 = lineHeight;
                            f16 = stackSpace;
                            canvas3 = canvas;
                            drawForm(canvas3, f28, f26 + fCalcTextHeight, i25, this.mLegend);
                            fCalcTextWidth = direction == legendDirection3 ? f28 + formSize : f28;
                        } else {
                            f16 = stackSpace;
                            f17 = lineHeight;
                            canvas3 = canvas;
                            fCalcTextWidth = f15;
                        }
                        String str = labels[i25];
                        if (str != null) {
                            if (z17 && !z16) {
                                fCalcTextWidth += direction == Legend.LegendDirection.LEFT_TO_RIGHT ? formToTextSpace : -formToTextSpace;
                            } else if (z16) {
                                fCalcTextWidth = f15;
                            }
                            if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                                fCalcTextWidth -= Utils.calcTextWidth(this.mLegendLabelPaint, str);
                            }
                            if (z16) {
                                f26 = f17 + yEntrySpace + f26;
                                drawLabel(canvas3, fCalcTextWidth, f26 + f17, labels[i25]);
                            } else {
                                drawLabel(canvas3, fCalcTextWidth, f26 + f17, labels[i25]);
                            }
                            f26 = f17 + yEntrySpace + f26;
                            f27 = 0.0f;
                        } else {
                            f27 = formSize + f16 + f27;
                            z16 = true;
                        }
                        i25++;
                        stackSpace = f16;
                        lineHeight = f17;
                        i16 = 1122868;
                    }
                    break;
            }
        }
    }
}
