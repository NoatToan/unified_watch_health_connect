package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class val extends HwHealthBarScrollChartHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vaq f50868b;
    private String d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onCustomChartStyle(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos) {
    }

    public val(Context context, LineChartViewPresenter lineChartViewPresenter) {
        super(context);
        this.d = "TEMPERATURE_MIN_MAX";
        this.f50868b = new vaq(lineChartViewPresenter);
    }

    public void d(String str) {
        this.f50868b.d(str);
        this.d = str;
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return vbr.b(f2, f, "TEMPERATURE_MIN_MAX".equals(this.d));
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return vbr.a(f2, f, "TEMPERATURE_MIN_MAX".equals(this.d));
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.f50868b;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthBarDataSet onCreateDataSet(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        ukr ukrVar = new ukr(new ArrayList(), getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos), dataInfos);
        if (dataInfos.isBloodOxygenData()) {
            ukrVar.setColor(Color.argb(255, 253, 178, 144));
            ukrVar.e(Color.argb(255, 255, 64, 101));
        }
        ukrVar.setLabelCount(5, true);
        ((qly) hwHealthBarChart.getData()).e(dataInfos);
        return ukrVar;
    }
}
