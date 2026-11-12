package com.huami.chart.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.SectionLineDataExtend;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.render.SectionLineRender;
import com.huami.chart.style.SectionLineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMGradientDrawable;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class SectionLineRender extends BaseRender<SectionLineStyle> {
    private static final String l = "SectionLineRender";
    private Drawable i;
    private Path j;
    private Path k;

    public SectionLineRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
        this.j = new Path();
        this.k = new Path();
    }

    private void f(Canvas canvas, int i, float f, float f2) {
        Index currentIndex;
        if ((((SectionLineStyle) this.mStyle).getInteractiveType() & 16) <= 0 || (currentIndex = this.hmChart.getInteractiveManager().getCurrentIndex()) == null || currentIndex.getDataIndex() == -1) {
            return;
        }
        if ((((SectionLineStyle) this.mStyle).isInteractiveUpCancel() && Float.isNaN(this.hmChart.getInteractiveManager().getCurrentDownX())) || Float.isNaN(f)) {
            return;
        }
        int interactiveLineColor = ((SectionLineStyle) this.mStyle).getInteractiveLineColor();
        float interactiveLineWidth = ((SectionLineStyle) this.mStyle).getInteractiveLineWidth();
        if (highlight(i)) {
            float top = this.hmChart.getDrawAreaManager().getTop();
            Paint sectionLinePaint = this.paintProvider.getSectionLinePaint(interactiveLineColor);
            sectionLinePaint.setStrokeWidth(interactiveLineWidth);
            canvas.drawLine(f, top, f, Math.max(f2 - ChartUtil.dp2px(this.hmChart.getContext(), 3.0f), top), sectionLinePaint);
        }
    }

    private void g(Canvas canvas, int[] iArr, float f, float f2, float f3, float f4) {
        if (iArr == null) {
            return;
        }
        this.i = new HMGradientDrawable(iArr);
        this.j.reset();
        this.k.reset();
        this.j.moveTo(f, f2);
        this.k.moveTo(f, this.hmChart.getDrawAreaManager().getBottom());
        this.k.lineTo(f, f2);
        this.j.lineTo(f3, f4);
        this.k.lineTo(f3, f4);
        this.k.lineTo(f3, this.hmChart.getDrawAreaManager().getBottom());
        canvas.save();
        canvas.clipPath(this.k);
        this.i.setBounds((int) this.hmChart.getDrawAreaManager().getLeft(), (int) f2, (int) this.hmChart.getDrawAreaManager().getRight(), (int) this.hmChart.getDrawAreaManager().getBottom());
        this.i.draw(canvas);
        canvas.restore();
    }

    private void h(Canvas canvas) {
        for (final int canvasDataIndexStart = getCanvasDataIndexStart(); canvasDataIndexStart <= getCanvasDataIndexEnd(); canvasDataIndexStart++) {
            ChartData dataByDataIndex = this.hmChart.getChartDataManager().getDataByDataIndex(canvasDataIndexStart);
            if (dataByDataIndex == null) {
                HMLog.verbose(l, new Function0() { // from class: hl6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SectionLineRender.i(canvasDataIndexStart);
                    }
                });
            } else {
                float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(dataByDataIndex.getStart()));
                float shownDataHorizonalValue2 = getShownDataHorizonalValue(getPositionByPosIndex(dataByDataIndex.getEnd()));
                float shownDataVerticalValue = getShownDataVerticalValue(getPositionByValue(dataByDataIndex.getSumValue()));
                int lineColor = ((SectionLineStyle) this.mStyle).getLineColor();
                int[] shadowColors = ((SectionLineStyle) this.mStyle).getShadowColors();
                Iterator<IDataExtendListener<?>> it2 = dataByDataIndex.getDataExtends().iterator();
                int i = lineColor;
                int[] shadowColors2 = shadowColors;
                while (it2.hasNext()) {
                    Object obj = it2.next().get(dataByDataIndex.getBaseIndex());
                    if (obj instanceof SectionLineDataExtend) {
                        SectionLineDataExtend sectionLineDataExtend = (SectionLineDataExtend) obj;
                        int lineColor2 = sectionLineDataExtend.getLineColor();
                        shadowColors2 = sectionLineDataExtend.getShadowColors();
                        i = lineColor2;
                    }
                }
                g(canvas, shadowColors2, shownDataHorizonalValue, shownDataVerticalValue, shownDataHorizonalValue2, shownDataVerticalValue);
                canvas.drawLine(shownDataHorizonalValue, shownDataVerticalValue, shownDataHorizonalValue2, shownDataVerticalValue, this.paintProvider.getSectionLinePaint(i));
                f(canvas, canvasDataIndexStart, (shownDataHorizonalValue + shownDataHorizonalValue2) / 2.0f, shownDataVerticalValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i(int i) {
        return "data is null" + i;
    }

    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i, int i2, float f) {
        super.draw(canvas, i, i2, f);
        if (getDataSize() >= 1 && (((SectionLineStyle) this.mStyle).getLineStyle() & 8) > 0) {
            h(canvas);
        }
    }
}
