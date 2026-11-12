package qm;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqm/r0;", "Lpq0/a;", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Landroid/graphics/Paint;", "highlightPaint", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;Landroid/graphics/Paint;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 extends pq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarDataProvider f145443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f145444b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Paint paint) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        paint.getClass();
        this.f145443a = barDataProvider;
        this.f145444b = paint;
    }

    @Override // pq0.a
    public final float a() {
        return 10.0f;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public final void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        Canvas canvas2;
        Transformer transformer;
        BarData barData = this.mChart.getBarData();
        int i14 = 0;
        if (highlightArr == null) {
            highlightArr = new Highlight[0];
        }
        int length = highlightArr.length;
        while (i14 < length) {
            Highlight highlight = highlightArr[i14];
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
            if (isInBoundsX(barEntry, iBarDataSet)) {
                float y14 = barEntry.getY();
                float x14 = barEntry.getX();
                BarDataProvider barDataProvider = this.f145443a;
                MPPointD pixelForValues = (barDataProvider == null || (transformer = barDataProvider.getTransformer(YAxis.AxisDependency.LEFT)) == null) ? null : transformer.getPixelForValues(x14, y14);
                if (pixelForValues != null) {
                    highlight.setDraw((float) pixelForValues.f52826x, (float) pixelForValues.f52827y);
                    float f14 = (float) pixelForValues.f52826x;
                    float f15 = (float) pixelForValues.f52827y;
                    if (canvas != null) {
                        canvas.drawCircle(f14, f15, 10.0f, this.f145444b);
                    }
                    float f16 = (float) pixelForValues.f52826x;
                    float f17 = (float) pixelForValues.f52827y;
                    if (canvas != null) {
                        canvas2 = canvas;
                        canvas2.drawLine(f16, 0.0f, f16, f17, this.f145444b);
                    } else {
                        canvas2 = canvas;
                    }
                } else {
                    canvas2 = canvas;
                }
            } else {
                canvas2 = canvas;
            }
            i14++;
            canvas = canvas2;
        }
    }
}
