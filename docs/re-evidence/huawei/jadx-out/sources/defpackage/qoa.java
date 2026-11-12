package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.renderer.LegendRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;

/* JADX INFO: loaded from: classes16.dex */
public class qoa extends LegendRenderer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f46543b;
    private HwHealthBaseBarLineChart d;

    public qoa(Context context, HwHealthBaseBarLineChart hwHealthBaseBarLineChart, ViewPortHandler viewPortHandler, Legend legend) {
        super(viewPortHandler, legend);
        this.f46543b = context;
        this.d = hwHealthBaseBarLineChart;
    }

    @Override // com.github.mikephil.charting.renderer.LegendRenderer
    public void renderLegend(Canvas canvas) {
        if (this.mLegend.isEnabled()) {
            d(this.mLegend);
            if (this.mLegend.getEntries().length == 3) {
                return;
            }
            Typeface typeface = this.mLegend.getTypeface();
            if (typeface != null) {
                this.mLegendLabelPaint.setTypeface(typeface);
            }
            this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
            this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
            LegendEntry[] entries = this.mLegend.getEntries();
            if (entries[0].label == null && entries.length > 2) {
                entries[0].label = entries[entries.length - 1].label;
            }
            a(canvas, this.d.acquireChartAnchor().d(), this.d.acquireChartAnchor().d().top + (-this.mLegendLabelPaint.getFontMetrics().top), entries);
        }
    }

    private void d(Legend legend) {
        if (!qmh.e(this.f46543b)) {
            legend.setDirection(Legend.LegendDirection.LEFT_TO_RIGHT);
            legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        } else {
            legend.setDirection(Legend.LegendDirection.RIGHT_TO_LEFT);
            legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        }
    }

    private void a(Canvas canvas, Rect rect, float f, LegendEntry[] legendEntryArr) {
        if (this.mLegend.getEntries().length == 1 || this.mLegend.getEntries().length > 2) {
            if (!qmh.e(this.f46543b)) {
                float f2 = rect.left;
                this.mLegendLabelPaint.setTextAlign(Paint.Align.LEFT);
                drawLabel(canvas, f2, f, legendEntryArr[0].label);
                return;
            } else {
                float f3 = rect.right;
                this.mLegendLabelPaint.setTextAlign(Paint.Align.RIGHT);
                drawLabel(canvas, f3, f, legendEntryArr[0].label);
                return;
            }
        }
        if (this.mLegend.getEntries().length == 2) {
            float f4 = rect.left;
            float f5 = rect.right;
            if (!qmh.e(this.f46543b)) {
                this.mLegendLabelPaint.setTextAlign(Paint.Align.LEFT);
                drawLabel(canvas, f4, f, legendEntryArr[0].label);
                this.mLegendLabelPaint.setTextAlign(Paint.Align.RIGHT);
                drawLabel(canvas, f5, f, legendEntryArr[1].label);
                return;
            }
            this.mLegendLabelPaint.setTextAlign(Paint.Align.LEFT);
            drawLabel(canvas, f4, f, legendEntryArr[1].label);
            this.mLegendLabelPaint.setTextAlign(Paint.Align.RIGHT);
            drawLabel(canvas, f5, f, legendEntryArr[0].label);
        }
    }
}
