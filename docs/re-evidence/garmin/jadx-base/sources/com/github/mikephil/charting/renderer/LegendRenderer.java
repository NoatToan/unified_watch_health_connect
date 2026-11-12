package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q6.f;

/* JADX INFO: loaded from: classes13.dex */
public class LegendRenderer extends Renderer {
    protected List<LegendEntry> computedEntries;
    protected Paint.FontMetrics legendFontMetrics;
    protected Legend mLegend;
    protected Paint mLegendFormPaint;
    protected Paint mLegendLabelPaint;
    private Path mLineFormPath;

    /* JADX INFO: renamed from: com.github.mikephil.charting.renderer.LegendRenderer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment;

        static {
            int[] iArr = new int[Legend.LegendForm.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm = iArr;
            try {
                iArr[Legend.LegendForm.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.SQUARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.LINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Legend.LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr2;
            try {
                iArr2[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[Legend.LegendOrientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[Legend.LegendVerticalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[Legend.LegendHorizontalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = iArr4;
            try {
                iArr4[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public LegendRenderer(ViewPortHandler viewPortHandler, Legend legend) {
        super(viewPortHandler);
        this.computedEntries = new ArrayList(16);
        this.legendFontMetrics = new Paint.FontMetrics();
        this.mLineFormPath = new Path();
        this.mLegend = legend;
        Paint paint = new Paint(1);
        this.mLegendLabelPaint = paint;
        paint.setTextSize(Utils.convertDpToPixel(9.0f));
        this.mLegendLabelPaint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.mLegendFormPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX WARN: Code duplicated, block: B:35:0x0143  */
    /* JADX WARN: Code duplicated, block: B:38:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x0154  */
    /* JADX WARN: Code duplicated, block: B:45:0x015b  */
    /* JADX WARN: Code duplicated, block: B:60:0x018b A[SYNTHETIC] */
    public void computeLegend(ChartData<?> chartData) {
        int i14;
        String label;
        ICandleDataSet iCandleDataSet;
        IPieDataSet iPieDataSet;
        int i15;
        if (!this.mLegend.isLegendCustom()) {
            this.computedEntries.clear();
            for (int i16 = 0; i16 < chartData.getDataSetCount(); i16++) {
                IDataSet dataSetByIndex = chartData.getDataSetByIndex(i16);
                List<Integer> colors = dataSetByIndex.getColors();
                int entryCount = dataSetByIndex.getEntryCount();
                if (dataSetByIndex instanceof IBarDataSet) {
                    IBarDataSet iBarDataSet = (IBarDataSet) dataSetByIndex;
                    if (iBarDataSet.isStacked()) {
                        String[] stackLabels = iBarDataSet.getStackLabels();
                        for (int i17 = 0; i17 < colors.size() && i17 < iBarDataSet.getStackSize(); i17++) {
                            this.computedEntries.add(new LegendEntry(stackLabels[i17 % stackLabels.length], dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i17).intValue()));
                        }
                        if (iBarDataSet.getLabel() != null) {
                            this.computedEntries.add(new LegendEntry(dataSetByIndex.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, 1122867));
                        }
                    } else if (dataSetByIndex instanceof IPieDataSet) {
                        iPieDataSet = (IPieDataSet) dataSetByIndex;
                        for (i15 = 0; i15 < colors.size() && i15 < entryCount; i15++) {
                            this.computedEntries.add(new LegendEntry(iPieDataSet.getEntryForIndex(i15).getLabel(), dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i15).intValue()));
                        }
                        if (iPieDataSet.getLabel() != null) {
                            this.computedEntries.add(new LegendEntry(dataSetByIndex.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, 1122867));
                        }
                    } else if (dataSetByIndex instanceof ICandleDataSet) {
                        iCandleDataSet = (ICandleDataSet) dataSetByIndex;
                        if (iCandleDataSet.getDecreasingColor() != 1122867) {
                            int decreasingColor = iCandleDataSet.getDecreasingColor();
                            int increasingColor = iCandleDataSet.getIncreasingColor();
                            this.computedEntries.add(new LegendEntry(null, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), decreasingColor));
                            this.computedEntries.add(new LegendEntry(dataSetByIndex.getLabel(), dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), increasingColor));
                        } else {
                            for (i14 = 0; i14 < colors.size() && i14 < entryCount; i14++) {
                                if (i14 < colors.size() - 1 || i14 >= entryCount - 1) {
                                    label = chartData.getDataSetByIndex(i16).getLabel();
                                } else {
                                    label = null;
                                }
                                this.computedEntries.add(new LegendEntry(label, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i14).intValue()));
                            }
                        }
                    } else {
                        while (i14 < colors.size()) {
                            if (i14 < colors.size() - 1) {
                                label = chartData.getDataSetByIndex(i16).getLabel();
                            } else {
                                label = chartData.getDataSetByIndex(i16).getLabel();
                            }
                            this.computedEntries.add(new LegendEntry(label, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i14).intValue()));
                        }
                    }
                } else if (dataSetByIndex instanceof IPieDataSet) {
                    iPieDataSet = (IPieDataSet) dataSetByIndex;
                    while (i15 < colors.size()) {
                        this.computedEntries.add(new LegendEntry(iPieDataSet.getEntryForIndex(i15).getLabel(), dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i15).intValue()));
                    }
                    if (iPieDataSet.getLabel() != null) {
                        this.computedEntries.add(new LegendEntry(dataSetByIndex.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, 1122867));
                    }
                } else if (dataSetByIndex instanceof ICandleDataSet) {
                    iCandleDataSet = (ICandleDataSet) dataSetByIndex;
                    if (iCandleDataSet.getDecreasingColor() != 1122867) {
                        int decreasingColor2 = iCandleDataSet.getDecreasingColor();
                        int increasingColor2 = iCandleDataSet.getIncreasingColor();
                        this.computedEntries.add(new LegendEntry(null, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), decreasingColor2));
                        this.computedEntries.add(new LegendEntry(dataSetByIndex.getLabel(), dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), increasingColor2));
                    } else {
                        while (i14 < colors.size()) {
                            if (i14 < colors.size() - 1) {
                                label = chartData.getDataSetByIndex(i16).getLabel();
                            } else {
                                label = chartData.getDataSetByIndex(i16).getLabel();
                            }
                            this.computedEntries.add(new LegendEntry(label, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i14).intValue()));
                        }
                    }
                } else {
                    while (i14 < colors.size()) {
                        if (i14 < colors.size() - 1) {
                            label = chartData.getDataSetByIndex(i16).getLabel();
                        } else {
                            label = chartData.getDataSetByIndex(i16).getLabel();
                        }
                        this.computedEntries.add(new LegendEntry(label, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i14).intValue()));
                    }
                }
            }
            if (this.mLegend.getExtraEntries() != null) {
                Collections.addAll(this.computedEntries, this.mLegend.getExtraEntries());
            }
            this.mLegend.setEntries(this.computedEntries);
        }
        Typeface typeface = this.mLegend.getTypeface();
        if (typeface != null) {
            this.mLegendLabelPaint.setTypeface(typeface);
        }
        this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
        this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
        this.mLegend.calculateDimensions(this.mLegendLabelPaint, this.mViewPortHandler);
    }

    public void drawForm(Canvas canvas, float f14, float f15, LegendEntry legendEntry, Legend legend) {
        Canvas canvas2;
        int i14 = legendEntry.formColor;
        if (i14 == 1122868 || i14 == 1122867 || i14 == 0) {
            return;
        }
        int iSave = canvas.save();
        Legend.LegendForm form = legendEntry.form;
        if (form == Legend.LegendForm.DEFAULT) {
            form = legend.getForm();
        }
        this.mLegendFormPaint.setColor(legendEntry.formColor);
        float fConvertDpToPixel = Utils.convertDpToPixel(Float.isNaN(legendEntry.formSize) ? legend.getFormSize() : legendEntry.formSize);
        float f16 = fConvertDpToPixel / 2.0f;
        int i15 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[form.ordinal()];
        if (i15 == 3 || i15 == 4) {
            canvas2 = canvas;
            this.mLegendFormPaint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(f14 + f16, f15, f16, this.mLegendFormPaint);
        } else if (i15 != 5) {
            if (i15 == 6) {
                float fConvertDpToPixel2 = Utils.convertDpToPixel(Float.isNaN(legendEntry.formLineWidth) ? legend.getFormLineWidth() : legendEntry.formLineWidth);
                DashPathEffect formLineDashEffect = legendEntry.formLineDashEffect;
                if (formLineDashEffect == null) {
                    formLineDashEffect = legend.getFormLineDashEffect();
                }
                this.mLegendFormPaint.setStyle(Paint.Style.STROKE);
                this.mLegendFormPaint.setStrokeWidth(fConvertDpToPixel2);
                this.mLegendFormPaint.setPathEffect(formLineDashEffect);
                this.mLineFormPath.reset();
                this.mLineFormPath.moveTo(f14, f15);
                this.mLineFormPath.lineTo(f14 + fConvertDpToPixel, f15);
                canvas.drawPath(this.mLineFormPath, this.mLegendFormPaint);
            }
            canvas2 = canvas;
        } else {
            this.mLegendFormPaint.setStyle(Paint.Style.FILL);
            canvas2 = canvas;
            canvas2.drawRect(f14, f15 - f16, f14 + fConvertDpToPixel, f15 + f16, this.mLegendFormPaint);
        }
        canvas2.restoreToCount(iSave);
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

    /* JADX WARN: Code duplicated, block: B:151:0x0318  */
    /* JADX WARN: Code duplicated, block: B:152:0x031b  */
    /* JADX WARN: Code duplicated, block: B:154:0x031f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0323  */
    /* JADX WARN: Code duplicated, block: B:159:0x0340  */
    /* JADX WARN: Code duplicated, block: B:160:0x0343  */
    /* JADX WARN: Code duplicated, block: B:161:0x0345  */
    /* JADX WARN: Code duplicated, block: B:163:0x0354  */
    /* JADX WARN: Code duplicated, block: B:164:0x0356  */
    /* JADX WARN: Code duplicated, block: B:166:0x035a  */
    /* JADX WARN: Code duplicated, block: B:167:0x035c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0362  */
    /* JADX WARN: Code duplicated, block: B:174:0x0376  */
    /* JADX WARN: Code duplicated, block: B:176:0x0381  */
    /* JADX WARN: Code duplicated, block: B:177:0x0383  */
    /* JADX WARN: Code duplicated, block: B:179:0x0386  */
    /* JADX WARN: Code duplicated, block: B:181:0x038a  */
    /* JADX WARN: Code duplicated, block: B:182:0x038c  */
    public void renderLegend(Canvas canvas) {
        float f14;
        float chartWidth;
        float f15;
        int i14;
        boolean z14;
        boolean z15;
        int i15;
        Canvas canvas2;
        List<FSize> list;
        List<FSize> list2;
        List<Boolean> list3;
        float f16;
        Legend.LegendDirection legendDirection;
        float f17;
        float f18;
        float f19;
        float fContentTop;
        int i16;
        float f22;
        Canvas canvas3;
        float f24;
        float fCalcTextWidth;
        if (this.mLegend.isEnabled()) {
            Typeface typeface = this.mLegend.getTypeface();
            if (typeface != null) {
                this.mLegendLabelPaint.setTypeface(typeface);
            }
            this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
            this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
            float lineHeight = Utils.getLineHeight(this.mLegendLabelPaint, this.legendFontMetrics);
            float fConvertDpToPixel = Utils.convertDpToPixel(this.mLegend.getYEntrySpace()) + Utils.getLineSpacing(this.mLegendLabelPaint, this.legendFontMetrics);
            float fCalcTextHeight = lineHeight - (Utils.calcTextHeight(this.mLegendLabelPaint, "ABC") / 2.0f);
            LegendEntry[] entries = this.mLegend.getEntries();
            float fConvertDpToPixel2 = Utils.convertDpToPixel(this.mLegend.getFormToTextSpace());
            float fConvertDpToPixel3 = Utils.convertDpToPixel(this.mLegend.getXEntrySpace());
            Legend.LegendOrientation orientation = this.mLegend.getOrientation();
            Legend.LegendHorizontalAlignment horizontalAlignment = this.mLegend.getHorizontalAlignment();
            Legend.LegendVerticalAlignment verticalAlignment = this.mLegend.getVerticalAlignment();
            Legend.LegendDirection direction = this.mLegend.getDirection();
            float fConvertDpToPixel4 = Utils.convertDpToPixel(this.mLegend.getFormSize());
            float fConvertDpToPixel5 = Utils.convertDpToPixel(this.mLegend.getStackSpace());
            float yOffset = this.mLegend.getYOffset();
            float xOffset = this.mLegend.getXOffset();
            int i17 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[horizontalAlignment.ordinal()];
            if (i17 == 1) {
                f14 = fConvertDpToPixel5;
                if (orientation != Legend.LegendOrientation.VERTICAL) {
                    xOffset += this.mViewPortHandler.contentLeft();
                }
                chartWidth = direction == Legend.LegendDirection.RIGHT_TO_LEFT ? xOffset + this.mLegend.mNeededWidth : xOffset;
            } else if (i17 == 2) {
                f14 = fConvertDpToPixel5;
                Legend.LegendOrientation legendOrientation = Legend.LegendOrientation.VERTICAL;
                ViewPortHandler viewPortHandler = this.mViewPortHandler;
                chartWidth = (orientation == legendOrientation ? viewPortHandler.getChartWidth() : viewPortHandler.contentRight()) - xOffset;
                if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                    chartWidth -= this.mLegend.mNeededWidth;
                }
            } else if (i17 != 3) {
                f14 = fConvertDpToPixel5;
                chartWidth = 0.0f;
            } else {
                Legend.LegendOrientation legendOrientation2 = Legend.LegendOrientation.VERTICAL;
                ViewPortHandler viewPortHandler2 = this.mViewPortHandler;
                float chartWidth2 = orientation == legendOrientation2 ? viewPortHandler2.getChartWidth() / 2.0f : viewPortHandler2.contentLeft() + (this.mViewPortHandler.contentWidth() / 2.0f);
                Legend.LegendDirection legendDirection2 = Legend.LegendDirection.LEFT_TO_RIGHT;
                f14 = fConvertDpToPixel5;
                chartWidth = chartWidth2 + (direction == legendDirection2 ? xOffset : -xOffset);
                if (orientation == legendOrientation2) {
                    double d14 = chartWidth;
                    Legend legend = this.mLegend;
                    chartWidth = (float) (d14 + (direction == legendDirection2 ? (((double) (-legend.mNeededWidth)) / 2.0d) + ((double) xOffset) : (((double) legend.mNeededWidth) / 2.0d) - ((double) xOffset)));
                }
            }
            int i18 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[orientation.ordinal()];
            if (i18 != 1) {
                if (i18 != 2) {
                    return;
                }
                int i19 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[verticalAlignment.ordinal()];
                if (i19 == 1) {
                    fContentTop = (horizontalAlignment == Legend.LegendHorizontalAlignment.CENTER ? 0.0f : this.mViewPortHandler.contentTop()) + yOffset;
                } else if (i19 == 2) {
                    Legend.LegendHorizontalAlignment legendHorizontalAlignment = Legend.LegendHorizontalAlignment.CENTER;
                    ViewPortHandler viewPortHandler3 = this.mViewPortHandler;
                    fContentTop = (horizontalAlignment == legendHorizontalAlignment ? viewPortHandler3.getChartHeight() : viewPortHandler3.contentBottom()) - (this.mLegend.mNeededHeight + yOffset);
                } else if (i19 != 3) {
                    fContentTop = 0.0f;
                } else {
                    float chartHeight = this.mViewPortHandler.getChartHeight() / 2.0f;
                    Legend legend2 = this.mLegend;
                    fContentTop = legend2.getYOffset() + (chartHeight - (legend2.mNeededHeight / 2.0f));
                }
                float f25 = fContentTop;
                float f26 = 0.0f;
                int i24 = 0;
                boolean z16 = false;
                while (i24 < entries.length) {
                    LegendEntry legendEntry = entries[i24];
                    boolean z17 = legendEntry.form != Legend.LegendForm.NONE;
                    float fConvertDpToPixel6 = Float.isNaN(legendEntry.formSize) ? fConvertDpToPixel4 : Utils.convertDpToPixel(legendEntry.formSize);
                    if (z17) {
                        Legend.LegendDirection legendDirection3 = Legend.LegendDirection.LEFT_TO_RIGHT;
                        float f27 = direction == legendDirection3 ? chartWidth + f26 : chartWidth - (fConvertDpToPixel6 - f26);
                        f22 = f14;
                        f24 = fConvertDpToPixel;
                        i16 = i24;
                        canvas3 = canvas;
                        drawForm(canvas3, f27, f25 + fCalcTextHeight, legendEntry, this.mLegend);
                        fCalcTextWidth = direction == legendDirection3 ? f27 + fConvertDpToPixel6 : f27;
                    } else {
                        i16 = i24;
                        f22 = f14;
                        canvas3 = canvas;
                        f24 = fConvertDpToPixel;
                        fCalcTextWidth = chartWidth;
                    }
                    String str = legendEntry.label;
                    if (str != null) {
                        if (z17 && !z16) {
                            fCalcTextWidth += direction == Legend.LegendDirection.LEFT_TO_RIGHT ? fConvertDpToPixel2 : -fConvertDpToPixel2;
                        } else if (z16) {
                            fCalcTextWidth = chartWidth;
                        }
                        if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            fCalcTextWidth -= Utils.calcTextWidth(this.mLegendLabelPaint, str);
                        }
                        String str2 = legendEntry.label;
                        if (z16) {
                            f25 += lineHeight + f24;
                            drawLabel(canvas3, fCalcTextWidth, f25 + lineHeight, str2);
                        } else {
                            drawLabel(canvas3, fCalcTextWidth, f25 + lineHeight, str2);
                        }
                        f25 = lineHeight + f24 + f25;
                        f26 = 0.0f;
                    } else {
                        f26 = fConvertDpToPixel6 + f22 + f26;
                        z16 = true;
                    }
                    i24 = i16 + 1;
                    fConvertDpToPixel = f24;
                    f14 = f22;
                }
                return;
            }
            float f28 = f14;
            List<FSize> calculatedLineSizes = this.mLegend.getCalculatedLineSizes();
            List<FSize> calculatedLabelSizes = this.mLegend.getCalculatedLabelSizes();
            List<Boolean> calculatedLabelBreakPoints = this.mLegend.getCalculatedLabelBreakPoints();
            int i25 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[verticalAlignment.ordinal()];
            float f29 = chartWidth;
            if (i25 != 1) {
                if (i25 != 2) {
                    yOffset = i25 != 3 ? 0.0f : f.c(this.mViewPortHandler.getChartHeight(), this.mLegend.mNeededHeight, 2.0f, yOffset);
                } else {
                    yOffset = (this.mViewPortHandler.getChartHeight() - yOffset) - this.mLegend.mNeededHeight;
                }
            }
            int length = entries.length;
            List<FSize> list4 = calculatedLabelSizes;
            float f34 = f29;
            int i26 = 0;
            int i27 = 0;
            while (i26 < length) {
                float f35 = yOffset;
                LegendEntry legendEntry2 = entries[i26];
                float f36 = f34;
                int i28 = length;
                boolean z18 = legendEntry2.form != Legend.LegendForm.NONE;
                float fConvertDpToPixel7 = Float.isNaN(legendEntry2.formSize) ? fConvertDpToPixel4 : Utils.convertDpToPixel(legendEntry2.formSize);
                if (i26 >= calculatedLabelBreakPoints.size() || !calculatedLabelBreakPoints.get(i26).booleanValue()) {
                    f15 = f36;
                } else {
                    f35 = lineHeight + fConvertDpToPixel + f35;
                    f15 = f29;
                }
                if (f15 == f29) {
                    i14 = i26;
                    if (horizontalAlignment == Legend.LegendHorizontalAlignment.CENTER && i27 < calculatedLineSizes.size()) {
                        f15 += (direction == Legend.LegendDirection.RIGHT_TO_LEFT ? calculatedLineSizes.get(i27).width : -calculatedLineSizes.get(i27).width) / 2.0f;
                        i27++;
                    }
                    int i29 = i27;
                    if (legendEntry2.label == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z18) {
                        if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            f15 -= fConvertDpToPixel7;
                        }
                        f19 = f15;
                        int i30 = i14;
                        z15 = z18;
                        i15 = i30;
                        list = calculatedLineSizes;
                        list2 = list4;
                        list3 = calculatedLabelBreakPoints;
                        canvas2 = canvas;
                        drawForm(canvas2, f19, f35 + fCalcTextHeight, legendEntry2, this.mLegend);
                        if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                            f15 = f19 + fConvertDpToPixel7;
                        } else {
                            f15 = f19;
                        }
                    } else {
                        int i34 = i14;
                        z15 = z18;
                        i15 = i34;
                        canvas2 = canvas;
                        list = calculatedLineSizes;
                        list2 = list4;
                        list3 = calculatedLabelBreakPoints;
                    }
                    if (z14) {
                        if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            f16 = -f28;
                        } else {
                            f16 = f28;
                        }
                        f34 = f15 + f16;
                    } else {
                        if (z15) {
                            if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                                f18 = -fConvertDpToPixel2;
                            } else {
                                f18 = fConvertDpToPixel2;
                            }
                            f15 += f18;
                        }
                        legendDirection = Legend.LegendDirection.RIGHT_TO_LEFT;
                        if (direction == legendDirection) {
                            f15 -= list2.get(i15).width;
                        }
                        drawLabel(canvas2, f15, f35 + lineHeight, legendEntry2.label);
                        if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                            f15 += list2.get(i15).width;
                        }
                        if (direction == legendDirection) {
                            f17 = -fConvertDpToPixel3;
                        } else {
                            f17 = fConvertDpToPixel3;
                        }
                        f34 = f15 + f17;
                    }
                    i26 = i15 + 1;
                    calculatedLabelBreakPoints = list3;
                    yOffset = f35;
                    length = i28;
                    i27 = i29;
                    list4 = list2;
                    calculatedLineSizes = list;
                } else {
                    i14 = i26;
                }
                int i210 = i27;
                if (legendEntry2.label == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z18) {
                    if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f15 -= fConvertDpToPixel7;
                    }
                    f19 = f15;
                    int i35 = i14;
                    z15 = z18;
                    i15 = i35;
                    list = calculatedLineSizes;
                    list2 = list4;
                    list3 = calculatedLabelBreakPoints;
                    canvas2 = canvas;
                    drawForm(canvas2, f19, f35 + fCalcTextHeight, legendEntry2, this.mLegend);
                    if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                        f15 = f19 + fConvertDpToPixel7;
                    } else {
                        f15 = f19;
                    }
                } else {
                    int i36 = i14;
                    z15 = z18;
                    i15 = i36;
                    canvas2 = canvas;
                    list = calculatedLineSizes;
                    list2 = list4;
                    list3 = calculatedLabelBreakPoints;
                }
                if (z14) {
                    if (z15) {
                        if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            f18 = -fConvertDpToPixel2;
                        } else {
                            f18 = fConvertDpToPixel2;
                        }
                        f15 += f18;
                    }
                    legendDirection = Legend.LegendDirection.RIGHT_TO_LEFT;
                    if (direction == legendDirection) {
                        f15 -= list2.get(i15).width;
                    }
                    drawLabel(canvas2, f15, f35 + lineHeight, legendEntry2.label);
                    if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                        f15 += list2.get(i15).width;
                    }
                    if (direction == legendDirection) {
                        f17 = -fConvertDpToPixel3;
                    } else {
                        f17 = fConvertDpToPixel3;
                    }
                    f34 = f15 + f17;
                } else {
                    if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f16 = -f28;
                    } else {
                        f16 = f28;
                    }
                    f34 = f15 + f16;
                }
                i26 = i15 + 1;
                calculatedLabelBreakPoints = list3;
                yOffset = f35;
                length = i28;
                i27 = i210;
                list4 = list2;
                calculatedLineSizes = list;
            }
        }
    }
}
