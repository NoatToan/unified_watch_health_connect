package com.huawei.ui.main.stories.fitness.util.chart;

import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import defpackage.ukc;
import defpackage.uke;

/* JADX INFO: loaded from: classes19.dex */
public class MultiDataBarEntry extends HwHealthBarEntry {
    private ukc mDataLayer;

    public MultiDataBarEntry(float f, IStorageModel iStorageModel) {
        super(f, iStorageModel);
    }

    public MultiDataBarEntry(float f, IStorageModel iStorageModel, ukc ukcVar) {
        super(f, iStorageModel);
        this.mDataLayer = ukcVar;
    }

    @Override // com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry, com.github.mikephil.charting.data.BaseEntry
    public float getY() {
        if (this.mDataLayer != null) {
            IStorageModel iStorageModelAcquireModel = acquireModel();
            if (iStorageModelAcquireModel instanceof uke) {
                return ((uke) iStorageModelAcquireModel).getCeil(this.mDataLayer.c());
            }
        }
        return super.getY();
    }

    @Override // com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry, com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry, com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry
    public int hashCode() {
        return super.hashCode();
    }
}
