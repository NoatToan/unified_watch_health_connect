package com.huami.chart.render;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.BackgroundShader;
import com.huami.chart.data.XAxisData;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.render.BackgroundRender;
import com.huami.chart.style.BackgroundStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class BackgroundRender extends BaseRender<BackgroundStyle> {
    private static final String i = "BackgroundRender";

    public BackgroundRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i() {
        return " pure color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j() {
        return "grid ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k() {
        return "VERTICAL_LINE ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l() {
        return "image";
    }

    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i2, int i3, float f) {
        float width;
        float marginEnd;
        super.draw(canvas, i2, i3, f);
        if ((((BackgroundStyle) this.mStyle).getBackgroundStyle() & 2) > 0) {
            HMLog.verbose(i, new Function0() { // from class: km
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BackgroundRender.i();
                }
            });
            canvas.drawColor(((BackgroundStyle) this.mStyle).getBackgroundColor());
        }
        if ((((BackgroundStyle) this.mStyle).getBackgroundStyle() & 4) > 0) {
            HMLog.verbose(i, new Function0() { // from class: jm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BackgroundRender.j();
                }
            });
            float gridDividerSize = ((BackgroundStyle) this.mStyle).getGridDividerSize();
            if (Float.compare(gridDividerSize, 0.0f) != 0) {
                int drawWidth = (int) (this.hmChart.getDrawAreaManager().getDrawWidth() / gridDividerSize);
                int drawHeight = (int) (this.hmChart.getDrawAreaManager().getDrawHeight() / gridDividerSize);
                for (int i4 = 0; i4 <= drawWidth; i4++) {
                    float left = this.hmChart.getDrawAreaManager().getLeft() + (i4 * gridDividerSize);
                    canvas.drawLine(left, this.hmChart.getDrawAreaManager().getTop(), left, this.hmChart.getDrawAreaManager().getBottom(), this.paintProvider.getBackgroundGridPaint());
                }
                for (int i5 = 0; i5 <= drawHeight; i5++) {
                    float top = (i5 * gridDividerSize) + this.hmChart.getDrawAreaManager().getTop();
                    canvas.drawLine(this.hmChart.getDrawAreaManager().getLeft(), top, this.hmChart.getDrawAreaManager().getRight(), top, this.paintProvider.getBackgroundGridPaint());
                }
            }
        }
        if ((((BackgroundStyle) this.mStyle).getBackgroundStyle() & 16) > 0) {
            HMLog.verbose(i, new Function0() { // from class: im
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BackgroundRender.k();
                }
            });
            float top2 = this.hmChart.getDrawAreaManager().getTop();
            float bottom = this.hmChart.getDrawAreaManager().getBottom();
            if (((BackgroundStyle) this.mStyle).getAxisData() != null && ((BackgroundStyle) this.mStyle).getAxisData().size() > 0) {
                for (int i6 = 0; i6 < ((BackgroundStyle) this.mStyle).getAxisData().size(); i6++) {
                    XAxisData xAxisDataValueAt = ((BackgroundStyle) this.mStyle).getAxisData().valueAt(i6);
                    if (xAxisDataValueAt != null) {
                        float shownDataHorizonalValue = getShownDataHorizonalValue(getPositionByPosIndex(xAxisDataValueAt.getIndex()));
                        canvas.drawLine(shownDataHorizonalValue, top2, shownDataHorizonalValue, bottom, this.paintProvider.getBackgroundGridPaint());
                    }
                }
            }
        }
        if ((((BackgroundStyle) this.mStyle).getBackgroundStyle() & 32) > 0 && this.hmChart.getChartDataManager().getChartDataList().getCount() > 0) {
            float top3 = this.hmChart.getDrawAreaManager().getTop();
            float bottom2 = this.hmChart.getDrawAreaManager().getBottom();
            float left2 = this.hmChart.getDrawAreaManager().getLeft();
            float right = this.hmChart.getDrawAreaManager().getRight();
            if (!Float.isNaN(((BackgroundStyle) this.mStyle).getMarginStart()) && !Float.isNaN(((BackgroundStyle) this.mStyle).getMarginEnd())) {
                left2 = ChartUtil.isRtl(this.hmChart) ? ((BackgroundStyle) this.mStyle).getMarginEnd() : ((BackgroundStyle) this.mStyle).getMarginStart();
                if (ChartUtil.isRtl(this.hmChart)) {
                    width = this.hmChart.getDrawAreaManager().getWidth();
                    marginEnd = ((BackgroundStyle) this.mStyle).getMarginStart();
                } else {
                    width = this.hmChart.getDrawAreaManager().getWidth();
                    marginEnd = ((BackgroundStyle) this.mStyle).getMarginEnd();
                }
                right = width - marginEnd;
            }
            float f2 = right;
            float f3 = left2;
            Paint backgroundPaint = this.paintProvider.getBackgroundPaint();
            BackgroundShader backgroundShader = ((BackgroundStyle) this.mStyle).getBackgroundShader();
            backgroundPaint.setShader(new LinearGradient(backgroundShader.getX0(), getPositionByValue(backgroundShader.getY0()), backgroundShader.getX1(), getPositionByValue(backgroundShader.getY1()), backgroundShader.getColors(), backgroundShader.getPositions(), backgroundShader.getTile()));
            canvas.drawRect(f3, top3, f2, bottom2, backgroundPaint);
        }
        if ((((BackgroundStyle) this.mStyle).getBackgroundStyle() & 8) > 0) {
            HMLog.verbose(i, new Function0() { // from class: lm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BackgroundRender.l();
                }
            });
            Bitmap backgroundBitmap = ((BackgroundStyle) this.mStyle).getBackgroundBitmap();
            if (backgroundBitmap != null) {
                canvas.drawBitmap(backgroundBitmap, 0.0f, 0.0f, this.paintProvider.getBackgroundPaint());
            }
        }
    }
}
