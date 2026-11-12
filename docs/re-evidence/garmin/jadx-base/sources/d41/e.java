package d41;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ld41/e;", "Lcom/github/mikephil/charting/renderer/LineChartRenderer;", "Lcom/github/mikephil/charting/charts/CombinedChart;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/charts/CombinedChart;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends LineChartRenderer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CombinedChart combinedChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(combinedChart, chartAnimator, viewPortHandler);
        combinedChart.getClass();
        chartAnimator.getClass();
        viewPortHandler.getClass();
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r14v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry, java.lang.Object] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public final void drawLinearFill(Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        int i14;
        int i15;
        Entry entry;
        Path path = this.mGenerateFilledPathBuffer;
        xBounds.getClass();
        int i16 = xBounds.min;
        int i17 = xBounds.range + i16;
        int i18 = 0;
        do {
            i14 = (i18 * 128) + i16;
            i15 = i14 + 128;
            if (i15 > i17) {
                i15 = i17;
            }
            if (i14 <= i15) {
                iLineDataSet.getClass();
                IFillFormatter fillFormatter = iLineDataSet.getFillFormatter();
                fillFormatter.getClass();
                List<Entry> listA = ((yz.a) fillFormatter).a();
                float phaseY = this.mAnimator.getPhaseY();
                path.getClass();
                path.reset();
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i14);
                if (listA != null && (entry = listA.get(0)) != null) {
                    path.moveTo(entryForIndex.getX(), entry.getY());
                }
                path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
                int i19 = i14 + 1;
                if (i19 <= i15) {
                    int i24 = i19;
                    while (true) {
                        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i24);
                        entryForIndex2.getClass();
                        path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                        if (i24 == i15) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                }
                if (i19 <= i15) {
                    int i25 = i15;
                    while (true) {
                        if (listA != null) {
                            Entry entry2 = listA.get(i25);
                            if (entry2 != null) {
                                path.lineTo(entry2.getX(), entry2.getY() * phaseY);
                            }
                        }
                        if (i25 == i19) {
                            break;
                        } else {
                            i25--;
                        }
                    }
                }
                path.close();
                transformer.getClass();
                transformer.pathValueToPixel(path);
                Drawable fillDrawable = iLineDataSet.getFillDrawable();
                if (fillDrawable != null) {
                    drawFilledPath(canvas, path, fillDrawable);
                } else {
                    drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                }
            }
            i18++;
        } while (i14 <= i15);
    }
}
