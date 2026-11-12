package com.github.mikephil.chartingv2.buffer;

import com.github.mikephil.chartingv2.interfaces.datasets.IScatterDataSet;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class ScatterBuffer extends AbstractBuffer<IScatterDataSet> {
    public ScatterBuffer(int i14) {
        super(i14);
    }

    public void addForm(float f14, float f15) {
        float[] fArr = this.buffer;
        int i14 = this.index;
        int i15 = i14 + 1;
        this.index = i15;
        fArr[i14] = f14;
        this.index = i14 + 2;
        fArr[i15] = f15;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.mikephil.chartingv2.data.Entry] */
    @Override // com.github.mikephil.chartingv2.buffer.AbstractBuffer
    public void feed(IScatterDataSet iScatterDataSet) {
        float entryCount = iScatterDataSet.getEntryCount() * this.phaseX;
        for (int i14 = 0; i14 < entryCount; i14++) {
            ?? entryForIndex = iScatterDataSet.getEntryForIndex(i14);
            addForm(entryForIndex.getXIndex(), entryForIndex.getVal() * this.phaseY);
        }
        reset();
    }
}
