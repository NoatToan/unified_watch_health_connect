package com.huawei.ui.commonui.linechart;

import android.content.Context;
import com.github.mikephil.charting.data.ChartData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import defpackage.qqn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HwHealthChartHolder<T extends HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry>, ChartT extends HwHealthBaseScrollBarLineChart> implements IChartLayerHolder<T, ChartT> {
    public static final String BRADYCARDIA_WARN = "BRADYCARDIA";
    public static final String HIGH_WARN = "HIGH_WARN";
    public static final String LAYER_ID_BRADYCARDIA = "bradycardia_hr";
    public static final String LAYER_ID_NORMAL_HR = "normal_hr";
    public static final String LAYER_ID_REST_HR = "rest_hr";
    public static final String LAYER_ID_WARNING_HR = "warning_hr";
    protected Context mContext;
    private List<Mode> mModes = new ArrayList();
    private Map<IChartLayerHolder.DataTypeFilter, String> mSpecifiedDataTypeUnit = new HashMap();

    public enum Mode {
        MODE_FIRST_AXIS,
        MODE_SECOND_AXIS,
        MODE_THIRD_PARTY_AXIS,
        MODE_NONE
    }

    protected abstract void initChartData(ChartT chartt);

    protected abstract T onCreateDataSet(ChartT chartt, DataInfos dataInfos, c cVar);

    protected void onCustomChartStyle(ChartT chartt, DataInfos dataInfos) {
    }

    protected abstract T onFakeDataSet(c cVar);

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        DataInfos f23585b = DataInfos.NoDataPlaceHolder;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f23584a = "default";
        int d = 0;

        public c a(DataInfos dataInfos) {
            this.f23585b = dataInfos;
            return this;
        }

        public DataInfos c() {
            return this.f23585b;
        }

        public c e(String str) {
            this.f23584a = str;
            return this;
        }

        public String a() {
            return this.f23584a;
        }
    }

    public HwHealthChartHolder(Context context) {
        this.mContext = context;
        initLanguageVaries();
    }

    private void initLanguageVaries() {
        this.mModes.clear();
        this.mModes.add(Mode.MODE_FIRST_AXIS);
        this.mModes.add(Mode.MODE_SECOND_AXIS);
        this.mModes.add(Mode.MODE_THIRD_PARTY_AXIS);
        this.mModes.add(Mode.MODE_NONE);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder
    public T addDataLayer(ChartT chartt, DataInfos dataInfos) {
        return (T) addDataLayer(chartt, new c().a(dataInfos));
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder
    public T addDataLayer(ChartT chartt, c cVar) {
        if (chartt == null) {
            return null;
        }
        T t = (T) onDataLayerAdded(chartt, cVar.c(), cVar);
        chartt.refresh();
        return t;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder
    public T addDataLayer(ChartT chartt, T t, c cVar) {
        addDataSet(chartt, t);
        chartt.refresh();
        return t;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder
    public T fakeDataLayer(c cVar) {
        return (T) onFakeDataSet(cVar);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder
    public void rmDataLayer(ChartT chartt, T t) {
        ChartData data;
        List dataSets;
        if (chartt == null || (data = chartt.getData()) == null || (dataSets = data.getDataSets()) == null) {
            return;
        }
        dataSets.remove(t);
        chartt.refresh();
    }

    protected T onDataLayerAdded(ChartT chartt, DataInfos dataInfos, c cVar) {
        initChartData(chartt);
        T t = (T) onCreateDataSet(chartt, dataInfos, cVar);
        chartt.makeReverse(true);
        chartt.setGridColor(qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color), qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color));
        chartt.getXAxis().setAxisLineColor(qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color));
        onCustomChartStyle(chartt, dataInfos);
        addDataSet(chartt, t);
        return t;
    }

    protected String getChartBrief(DataInfos dataInfos) {
        return "";
    }

    protected String getChartLabel(DataInfos dataInfos) {
        return "";
    }

    protected String getChartUnit(DataInfos dataInfos) {
        for (Map.Entry<IChartLayerHolder.DataTypeFilter, String> entry : this.mSpecifiedDataTypeUnit.entrySet()) {
            if (entry != null) {
                IChartLayerHolder.DataTypeFilter key = entry.getKey();
                if (key.isAccept(dataInfos)) {
                    return this.mSpecifiedDataTypeUnit.get(key);
                }
            }
        }
        return "";
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder
    public void spetifiyDataTypeUnit(IChartLayerHolder.DataTypeFilter dataTypeFilter, String str) {
        this.mSpecifiedDataTypeUnit.put(dataTypeFilter, str);
    }

    protected void addDataSet(ChartT chartt, T t) {
        if (chartt == null) {
            return;
        }
        ChartData data = chartt.getData();
        if (data == null) {
            throw new RuntimeException("addDataSet method found data null");
        }
        data.getDataSets().add(t);
    }
}
