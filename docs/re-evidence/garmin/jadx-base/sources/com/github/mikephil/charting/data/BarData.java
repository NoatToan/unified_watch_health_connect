package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import java.util.List;
import kg.f;

/* JADX INFO: loaded from: classes13.dex */
public class BarData extends BarLineScatterCandleBubbleData<IBarDataSet> {
    private float mBarWidth;

    public BarData() {
        this.mBarWidth = 0.85f;
    }

    public float getBarWidth() {
        return this.mBarWidth;
    }

    public float getGroupWidth(float f14, float f15) {
        return ((this.mBarWidth + f15) * this.mDataSets.size()) + f14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void groupBars(float f14, float f15, float f16) {
        BarEntry barEntry;
        if (this.mDataSets.size() <= 1) {
            f.n("BarData needs to hold at least 2 BarDataSets to allow grouping.");
            return;
        }
        int entryCount = ((IBarDataSet) getMaxEntryCountSet()).getEntryCount();
        float f17 = f15 / 2.0f;
        float f18 = f16 / 2.0f;
        float f19 = this.mBarWidth / 2.0f;
        float groupWidth = getGroupWidth(f15, f16);
        for (int i14 = 0; i14 < entryCount; i14++) {
            float f22 = f14 + f17;
            for (T t7 : this.mDataSets) {
                float f24 = f22 + f18 + f19;
                if (i14 < t7.getEntryCount() && (barEntry = (BarEntry) t7.getEntryForIndex(i14)) != null) {
                    barEntry.setX(f24);
                }
                f22 = f24 + f19 + f18;
            }
            float f25 = f22 + f17;
            float f26 = groupWidth - (f25 - f14);
            if (f26 > 0.0f || f26 < 0.0f) {
                f25 += f26;
            }
            f14 = f25;
        }
        notifyDataChanged();
    }

    public void setBarWidth(float f14) {
        this.mBarWidth = f14;
    }

    public BarData(IBarDataSet... iBarDataSetArr) {
        super(iBarDataSetArr);
        this.mBarWidth = 0.85f;
    }

    public BarData(List<IBarDataSet> list) {
        super(list);
        this.mBarWidth = 0.85f;
    }
}
