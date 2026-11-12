package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class vas extends HwHealthLineScrollChartHolder implements HighlightedEntryParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vaq f50875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f50876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f50877c;
    private qny d;
    private String e;

    static /* synthetic */ boolean b(int i, int i2, int i3) {
        return i2 - i <= 60;
    }

    static /* synthetic */ boolean e(int i, int i2, int i3) {
        return true;
    }

    public vas(Context context, LineChartViewPresenter lineChartViewPresenter) {
        super(context);
        this.e = "TEMPERATURE_MIN_MAX";
        if (Utils.o()) {
            this.e = "SKIN_TEMPERATURE_MIN_MAX";
        }
        this.f50875a = new vaq(lineChartViewPresenter);
        this.f50877c = vbr.h(35.0f);
        this.f50876b = vbr.h(37.2f);
    }

    public void e(String str) {
        this.f50875a.d(str);
        c(str);
    }

    public void b(String str) {
        this.e = str;
    }

    private void c(String str) {
        if (this.d == null) {
            LogUtil.j("TemperatureLineChartHolder", "setColor dataSet is null");
        } else if ("TEMPERATURE_MIN_MAX".equals(str)) {
            this.d.b(new IHealthMultiColorMode() { // from class: vas.5
                @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
                public int[] getDataColor() {
                    return new int[]{-13404161, -11093057, -301790};
                }

                @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
                public float[] getThreshold() {
                    return new float[]{vas.this.f50877c, vas.this.f50876b};
                }
            });
        } else {
            this.d.b(new IHealthMultiColorMode() { // from class: vas.1
                @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
                public int[] getDataColor() {
                    return new int[]{-11093057, -11093057, -11093057};
                }

                @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
                public float[] getThreshold() {
                    return new float[]{20.0f, 42.0f};
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthLineDataSet onCreateDataSet(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        this.d = new qny(new ArrayList(16), getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos));
        c(this.e);
        this.d.d(Color.argb(229, 178, 178, 178));
        this.d.setLabelCount(5, true);
        this.d.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: var
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public final boolean drawLine(int i, int i2, int i3) {
                return vas.b(i, i2, i3);
            }
        });
        this.d.setLineWidth(1.5f);
        this.d.setShowMaxMinValue(true);
        this.d.e(new HwHealthLineDataSet.NodeDrawStyle() { // from class: vas.3
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i) {
                return 0.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return false;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.0f);
            }
        });
        if ("TEMPERATURE_MIN_MAX".equals(this.e)) {
            hwHealthLineChart.getAxisFirstParty().setAxisMinimum(vbr.h(34.0f));
            hwHealthLineChart.getAxisFirstParty().setAxisMaximum(vbr.h(42.0f));
        } else {
            hwHealthLineChart.getAxisFirstParty().setAxisMinimum(vbr.h(20.0f));
            hwHealthLineChart.getAxisFirstParty().setAxisMaximum(vbr.h(42.0f));
        }
        hwHealthLineChart.getAxisSecondParty().setEnabled(false);
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public HwHealthLineDataSet onFakeDataSet(HwHealthChartHolder.c cVar) {
        ArrayList arrayList = new ArrayList(16);
        DataInfos dataInfosC = cVar.c();
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, arrayList, getChartBrief(dataInfosC), getChartLabel(dataInfosC), getChartUnit(dataInfosC));
        hwHealthLineDataSet.setColor(Color.argb(255, 178, 178, 178));
        hwHealthLineDataSet.d(Color.argb(229, a.L, 70, 94));
        hwHealthLineDataSet.a(Color.argb(127, 178, 178, 178), Color.argb(0, 178, 178, 178), true);
        hwHealthLineDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: vao
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public final boolean drawLine(int i, int i2, int i3) {
                return vas.e(i, i2, i3);
            }
        });
        hwHealthLineDataSet.setForcedLabels(tvs.b());
        hwHealthLineDataSet.setLineWidth(2.0f);
        hwHealthLineDataSet.e(new HwHealthLineDataSet.NodeDrawStyle() { // from class: vas.2
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i) {
                return 0.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return false;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.0f);
            }
        });
        return hwHealthLineDataSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onCustomChartStyle(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos) {
        if (hwHealthLineChart == null) {
            return;
        }
        hwHealthLineChart.makeReverse(true);
        hwHealthLineChart.setGridColor(qqn.b(BaseApplication.getContext(), R.color.emui_bottombar_icon_off), qqn.b(BaseApplication.getContext(), R.color.common_black_20alpha));
        hwHealthLineChart.setLabelColor(qqn.b(BaseApplication.getContext(), R.color.health_chart_default_text_color));
        hwHealthLineChart.setAvoidFirstLastClipping(false);
        hwHealthLineChart.enableOnlyShowMinutes(true);
        hwHealthLineChart.enableOneMinuteOmit(true);
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return vbr.b(f2, f, "TEMPERATURE_MIN_MAX".equals(this.e));
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return vbr.a(f2, f, "TEMPERATURE_MIN_MAX".equals(this.e));
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.f50875a;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser
    public String parse(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) {
            return "--";
        }
        return UnitUtil.e(hwHealthBaseEntry.getY(), 1, 1);
    }
}
