package f00;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf00/b;", "Lf00/c;", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        lineDataProvider.getClass();
        chartAnimator.getClass();
        viewPortHandler.getClass();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry, java.lang.Object] */
    @Override // f00.c, com.github.mikephil.charting.renderer.LineChartRenderer
    public final void drawLinearFill(Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        int i14;
        int i15;
        iLineDataSet.getClass();
        transformer.getClass();
        xBounds.getClass();
        Path pathE = e(iLineDataSet, xBounds.min, xBounds.max);
        int i16 = 0;
        do {
            i14 = (i16 * 128) + xBounds.min;
            i15 = i14 + 128;
            int i17 = xBounds.max;
            if (i15 > i17) {
                i15 = i17;
            }
            if (i14 < i15) {
                if (iLineDataSet.getFillFormatter() instanceof yz.a) {
                    IFillFormatter fillFormatter = iLineDataSet.getFillFormatter();
                    fillFormatter.getClass();
                    List<Entry> listA = ((yz.a) fillFormatter).a();
                    if (listA != null) {
                        float phaseY = this.mAnimator.getPhaseY();
                        pathE.reset();
                        ?? entryForIndex = iLineDataSet.getEntryForIndex(i14);
                        pathE.moveTo(entryForIndex.getX(), listA.get(0).getY());
                        pathE.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
                        if (i14 <= i15) {
                            int i18 = i14;
                            while (true) {
                                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i18);
                                entryForIndex2.getClass();
                                pathE.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                                if (i18 == i15) {
                                    break;
                                } else {
                                    i18++;
                                }
                            }
                        }
                        if (i14 <= i15) {
                            int i19 = i15;
                            while (true) {
                                Entry entry = listA.get(i19);
                                pathE.lineTo(entry.getX(), entry.getY() * phaseY);
                                if (i19 == i14) {
                                    break;
                                } else {
                                    i19--;
                                }
                            }
                        }
                        pathE.close();
                        Unit unit = Unit.INSTANCE;
                    } else {
                        e(iLineDataSet, i14, i15);
                    }
                } else {
                    e(iLineDataSet, i14, i15);
                }
                transformer.pathValueToPixel(pathE);
                Drawable fillDrawable = iLineDataSet.getFillDrawable();
                if (fillDrawable != null) {
                    drawFilledPath(canvas, pathE, fillDrawable);
                } else {
                    drawFilledPath(canvas, pathE, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                }
            }
            i16++;
        } while (i14 < i15);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public final Path e(ILineDataSet iLineDataSet, int i14, int i15) {
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        boolean z14 = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED;
        Path path = new Path();
        ?? entryForIndex = iLineDataSet.getEntryForIndex(i14);
        path.moveTo(entryForIndex.getX(), fillLinePosition);
        path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        double d14 = ((i15 - i14) * phaseX) + i14;
        int iCeil = (int) Math.ceil(d14);
        for (int i16 = i14 + 1; i16 < iCeil; i16++) {
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i16);
            if (z14) {
                ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i16 - 1);
                if (entryForIndex3 != 0) {
                    path.lineTo(entryForIndex2.getX(), entryForIndex3.getY() * phaseY);
                    path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                }
            } else {
                path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
            }
        }
        int iCeil2 = ((int) Math.ceil(d14)) - 1;
        int entryCount = iLineDataSet.getEntryCount() - 1;
        if (iCeil2 > entryCount) {
            iCeil2 = entryCount;
        }
        path.lineTo(iLineDataSet.getEntryForIndex(iCeil2 >= 0 ? iCeil2 : 0).getX(), fillLinePosition);
        path.close();
        return path;
    }
}
