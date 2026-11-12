package defpackage;

import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DataLayerType;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.main.stories.fitness.util.chart.DataSetLayerListener;
import com.huawei.ui.main.stories.fitness.util.chart.MultiDataBarEntry;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class uki extends qme implements DataSetLayerListener {
    private ukc e;

    public uki(List<HwHealthBarEntry> list, String str, String str2, String str3, DataInfos dataInfos) {
        super(list, str, str2, str3, dataInfos);
        this.e = new ukc();
    }

    @Override // com.huawei.ui.commonui.linechart.barchart.HwHealthBaseBarDataSet, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet
    public HwHealthBarEntry constructEntry(float f, IStorageModel iStorageModel) {
        if (iStorageModel instanceof uke) {
            ((uke) iStorageModel).d(this.e);
            return new MultiDataBarEntry(f, iStorageModel, this.e);
        }
        return super.constructEntry(f, iStorageModel);
    }

    @Override // com.huawei.ui.main.stories.fitness.util.chart.DataSetLayerListener
    public void onChange(DataLayerType dataLayerType, qnl qnlVar) {
        if (dataLayerType == null || dataLayerType.equals(this.e.c())) {
            return;
        }
        this.e.a(dataLayerType);
        if (qnlVar != null) {
            setColor(qnlVar.a());
            e(qnlVar.c());
            a().c(qnlVar.e());
            a().b(qnlVar.b());
            a().b(qnlVar.d());
        }
    }
}
