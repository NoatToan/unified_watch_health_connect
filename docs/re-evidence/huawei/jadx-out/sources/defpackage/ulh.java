package defpackage;

import com.github.mikephil.charting.data.Entry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarLineChart;

/* JADX INFO: loaded from: classes19.dex */
public class ulh extends qob {
    public ulh(HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        super(hwHealthBaseBarLineChart);
    }

    @Override // defpackage.qob, com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public void load(HwHealthLineDataSet hwHealthLineDataSet) {
        Entry entryForIndex;
        this.f46544a.c(this.e, hwHealthLineDataSet);
        this.f46545b = hwHealthLineDataSet;
        this.f46546c.clear();
        if (this.f46544a.a() - 1 >= 0 && this.f46544a.a() - 1 < hwHealthLineDataSet.getEntryCount()) {
            c(hwHealthLineDataSet.getEntryForIndex(this.f46544a.a() - 1));
        }
        for (int iA = this.f46544a.a(); this.f46544a.c() != 0 && iA < this.f46544a.c() + this.f46544a.a(); iA++) {
            c(hwHealthLineDataSet.getEntryForIndex(iA));
        }
        if (this.f46544a.d() < 0 || this.f46544a.d() >= hwHealthLineDataSet.getEntryCount() || (entryForIndex = hwHealthLineDataSet.getEntryForIndex(this.f46544a.d())) == null) {
            return;
        }
        c(entryForIndex);
    }

    private void c(Entry entry) {
        if (a(entry)) {
            this.f46546c.add(new qod(entry));
        }
    }

    private boolean a(Entry entry) {
        if (!(entry.getData() instanceof uma) || !(this.e instanceof BloodSugarLineChart)) {
            return false;
        }
        uma umaVar = (uma) entry.getData();
        return !umaVar.g() && umaVar.d().equals(((BloodSugarLineChart) this.e).getDataType());
    }
}
