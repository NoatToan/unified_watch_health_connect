package defpackage;

import com.github.mikephil.charting.buffer.BarBuffer;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;

/* JADX INFO: loaded from: classes16.dex */
public class qno extends BarBuffer {
    public qno(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (iHwHealthBarDataSet == null) {
            LogUtil.j("HwHealthBarBuffer", "feed data == null");
            return;
        }
        float entryCount = iHwHealthBarDataSet.getEntryCount();
        float f = this.phaseX;
        float f2 = this.mBarWidth / 2.0f;
        for (int i = 0; i < entryCount * f; i++) {
            HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i);
            if (hwHealthBarEntry != null) {
                IStorageModel iStorageModelAcquireModel = hwHealthBarEntry.acquireModel();
                float fD = qnn.d(iStorageModelAcquireModel);
                float fB = qnn.b(iStorageModelAcquireModel);
                if (fD > 0.0f) {
                    fD *= this.phaseY;
                } else {
                    fB *= this.phaseY;
                }
                if (this.buffer.length != 0) {
                    float x = hwHealthBarEntry.getX();
                    addBar(x - f2, fD, x + f2, fB);
                }
            }
        }
        reset();
    }
}
