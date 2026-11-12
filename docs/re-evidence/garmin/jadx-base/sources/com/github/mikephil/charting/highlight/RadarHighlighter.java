package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class RadarHighlighter extends PieRadarHighlighter<RadarChart> {
    public RadarHighlighter(RadarChart radarChart) {
        super(radarChart);
    }

    @Override // com.github.mikephil.charting.highlight.PieRadarHighlighter
    public Highlight getClosestHighlight(int i14, float f14, float f15) {
        List<Highlight> highlightsAtIndex = getHighlightsAtIndex(i14);
        float fDistanceToCenter = ((RadarChart) this.mChart).distanceToCenter(f14, f15) / ((RadarChart) this.mChart).getFactor();
        Highlight highlight = null;
        float f16 = Float.MAX_VALUE;
        for (int i15 = 0; i15 < highlightsAtIndex.size(); i15++) {
            Highlight highlight2 = highlightsAtIndex.get(i15);
            float fAbs = Math.abs(highlight2.getY() - fDistanceToCenter);
            if (fAbs < f16) {
                highlight = highlight2;
                f16 = fAbs;
            }
        }
        return highlight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public List<Highlight> getHighlightsAtIndex(int i14) {
        this.mHighlightBuffer.clear();
        float phaseX = ((RadarChart) this.mChart).getAnimator().getPhaseX();
        float phaseY = ((RadarChart) this.mChart).getAnimator().getPhaseY();
        float sliceAngle = ((RadarChart) this.mChart).getSliceAngle();
        float factor = ((RadarChart) this.mChart).getFactor();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        for (int i15 = 0; i15 < ((RadarData) ((RadarChart) this.mChart).getData()).getDataSetCount(); i15++) {
            IRadarDataSet dataSetByIndex = ((RadarData) ((RadarChart) this.mChart).getData()).getDataSetByIndex(i15);
            ?? entryForIndex = dataSetByIndex.getEntryForIndex(i14);
            float y14 = (entryForIndex.getY() - ((RadarChart) this.mChart).getYChartMin()) * factor * phaseY;
            float f14 = i14;
            Utils.getPosition(((RadarChart) this.mChart).getCenterOffsets(), y14, ((RadarChart) this.mChart).getRotationAngle() + (sliceAngle * f14 * phaseX), mPPointF);
            this.mHighlightBuffer.add(new Highlight(f14, entryForIndex.getY(), mPPointF.f52828x, mPPointF.f52829y, i15, dataSetByIndex.getAxisDependency()));
        }
        return this.mHighlightBuffer;
    }
}
