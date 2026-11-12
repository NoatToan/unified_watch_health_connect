package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.main.stories.fitness.views.base.InteractorLineChartHolder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class ull extends InteractorLineChartHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataInfos f50329a;
    private final ulj d;

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        if (f > 34.0f) {
            return 34.0f;
        }
        float f3 = f + (f % 2.0f != 0.0f ? 3.0f : 2.0f);
        if (f3 < 12.0f) {
            return 12.0f;
        }
        return f3;
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return f2 - (f2 % 2.0f != 0.0f ? 3.0f : 2.0f) > 4.0f ? 4.0f : 0.0f;
    }

    public ull(Context context, DataInfos dataInfos) {
        super(context);
        this.f50329a = dataInfos;
        this.d = new ulj(dataInfos);
    }

    public void e(Context context, Handler handler) {
        this.d.d(context, handler);
    }

    public void e(String str) {
        this.d.c(str);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthLineDataSet onCreateDataSet(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        ulg ulgVar = new ulg(new ArrayList(16), getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos), this.f50329a);
        ulgVar.setColor(Color.argb(255, 178, 178, 178));
        ulgVar.d(Color.argb(229, 178, 178, 178));
        ulgVar.b(this.mLineLinkerFilter);
        ulgVar.setLineWidth(1.5f);
        ulgVar.e(this.mNodeDrawStyle);
        ulgVar.setLabelCount(5, true);
        hwHealthLineChart.getAxisFirstParty().setAxisMinimum(0.0f);
        hwHealthLineChart.getAxisFirstParty().setAxisMaximum(34.0f);
        hwHealthLineChart.getAxisSecondParty().setEnabled(false);
        hwHealthLineChart.getAxisThirdParty().setEnabled(false);
        return ulgVar;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.d;
    }

    public void b() {
        ulj uljVar = this.d;
        if (uljVar != null) {
            uljVar.e();
        }
    }
}
