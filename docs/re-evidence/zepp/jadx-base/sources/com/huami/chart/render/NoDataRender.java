package com.huami.chart.render;

import android.graphics.Canvas;
import com.huami.chart.chart.HMChart;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.render.NoDataRender;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class NoDataRender extends BaseRender<NoDataStyle> {
    private static final String i = "NoDataRender";

    public NoDataRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g() {
        return "NoDataStyle.LABEl";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h() {
        return "ChartDataList is not empty";
    }

    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i2, int i3, float f) {
        super.draw(canvas, i2, i3, f);
        if ((((NoDataStyle) this.mStyle).getNoDataStyle() & 2) > 0) {
            String str = i;
            HMLog.verbose(str, new Function0() { // from class: mf5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NoDataRender.g();
                }
            });
            if (this.hmChart.getChartDataManager().getChartDataList().getCount() != 0) {
                HMLog.verbose(str, new Function0() { // from class: lf5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NoDataRender.h();
                    }
                });
                return;
            }
            String noDataLabel = ((NoDataStyle) this.mStyle).getNoDataLabel();
            if (noDataLabel.isEmpty()) {
                return;
            }
            float fCalculateTextWidth = ChartUtil.calculateTextWidth(this.paintProvider.getNoDataTextPaint(), noDataLabel) / 2.0f;
            float width = ((NoDataStyle) this.mStyle).isLabelCenterInCanvas() ? (this.hmChart.getDrawAreaManager().getWidth() / 2.0f) - fCalculateTextWidth : this.hmChart.getDrawAreaManager().getDrawCenterX() - fCalculateTextWidth;
            if (!Float.isNaN(((NoDataStyle) this.mStyle).getLabelCenterXOffset())) {
                float labelCenterXOffset = ((NoDataStyle) this.mStyle).getLabelCenterXOffset();
                if (ChartUtil.isRtl(this.hmChart)) {
                    labelCenterXOffset = -labelCenterXOffset;
                }
                width += labelCenterXOffset;
            }
            canvas.drawText(noDataLabel, width, this.hmChart.getDrawAreaManager().getDrawCenterY(), this.paintProvider.getNoDataTextPaint());
        }
    }
}
