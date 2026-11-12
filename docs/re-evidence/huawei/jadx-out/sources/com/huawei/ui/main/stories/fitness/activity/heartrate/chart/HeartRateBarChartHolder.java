package com.huawei.ui.main.stories.fitness.activity.heartrate.chart;

import android.content.Context;
import com.huawei.health.knit.api.ICustomCalculator;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthCombinedScrollChartHolder;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChart;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.icommon.LogicalUnit;
import com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IScrollChartVisitor;
import defpackage.qnn;
import defpackage.uep;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class HeartRateBarChartHolder extends HwHealthCombinedScrollChartHolder implements HighlightedEntryParser, IScrollChartVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ICustomCalculator f26903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICustomCalculator f26904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IChartStorageHelper f26905c;
    private Map<DataInfos, HwHealthBaseBarLineDataSet> d;
    private ICustomCalculator e;
    private Map<DataInfos, HwHealthBaseBarLineDataSet> f;
    private Map<DataInfos, HwHealthBaseBarLineDataSet> g;
    private ICustomCalculator h;
    private ICustomCalculator i;
    private Map<DataInfos, HwHealthBaseBarLineDataSet> j;
    private ICustomCalculator l;
    private ICustomCalculator m;

    public HeartRateBarChartHolder(Context context) {
        super(context);
        this.f = new HashMap(16);
        this.j = new HashMap(16);
        this.g = new HashMap(16);
        this.d = new HashMap(16);
        this.f26905c = new uep();
        this.e = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.3
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateBarChartHolder.this.j == null || HeartRateBarChartHolder.this.j.get(dataInfos) == null) {
                    throw new RuntimeException("mAvgCalculator can't find dataSet");
                }
                return ((HwHealthBaseBarLineDataSet) HeartRateBarChartHolder.this.j.get(dataInfos)).calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.3.3
                    @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                    public float calculate(List<? extends HwHealthBaseEntry> list) {
                        if (list != null && list.size() != 0) {
                            Iterator<? extends HwHealthBaseEntry> it = list.iterator();
                            int i = 0;
                            float y = 0.0f;
                            while (it.hasNext()) {
                                y += it.next().getY();
                                i++;
                            }
                            if (i > 0) {
                                return y / i;
                            }
                        }
                        return 0.0f;
                    }
                });
            }
        };
        this.h = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.1
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateBarChartHolder.this.f == null || HeartRateBarChartHolder.this.f.get(dataInfos) == null) {
                    throw new RuntimeException("calculateMax can't find dataSet");
                }
                return ((HwHealthBaseBarLineDataSet) HeartRateBarChartHolder.this.f.get(dataInfos)).calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.1.4
                    @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                    public float calculate(List<? extends HwHealthBaseEntry> list) {
                        if (list == null || list.size() == 0) {
                            return 0.0f;
                        }
                        if (!(list.get(0) instanceof HwHealthBarEntry)) {
                            throw new RuntimeException("calculateMax not instanceof HwHealthBarEntry! logic error!!!");
                        }
                        Iterator<? extends HwHealthBaseEntry> it = list.iterator();
                        float fD = Float.MIN_VALUE;
                        while (it.hasNext()) {
                            IStorageModel iStorageModelAcquireModel = ((HwHealthBarEntry) it.next()).acquireModel();
                            if (qnn.d(iStorageModelAcquireModel) > fD) {
                                fD = qnn.d(iStorageModelAcquireModel);
                            }
                        }
                        return fD;
                    }
                });
            }
        };
        this.i = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.2
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateBarChartHolder.this.f == null || HeartRateBarChartHolder.this.f.get(dataInfos) == null) {
                    throw new RuntimeException("calculateMin not find dataSet! logic error!!!");
                }
                return ((HwHealthBaseBarLineDataSet) HeartRateBarChartHolder.this.f.get(dataInfos)).calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.2.1
                    @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                    public float calculate(List<? extends HwHealthBaseEntry> list) {
                        if (list == null || list.size() == 0) {
                            return 0.0f;
                        }
                        if (!(list.get(0) instanceof HwHealthBarEntry)) {
                            throw new RuntimeException("calculateMin not instanceof HwHealthBarEntry! logic error!!!");
                        }
                        Iterator<? extends HwHealthBaseEntry> it = list.iterator();
                        float fB = Float.MAX_VALUE;
                        while (it.hasNext()) {
                            IStorageModel iStorageModelAcquireModel = ((HwHealthBarEntry) it.next()).acquireModel();
                            if (fB > qnn.b(iStorageModelAcquireModel)) {
                                fB = qnn.b(iStorageModelAcquireModel);
                            }
                        }
                        return fB;
                    }
                });
            }
        };
        this.l = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.4
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateBarChartHolder.this.g == null || HeartRateBarChartHolder.this.g.get(dataInfos) == null) {
                    return 0.0f;
                }
                return ((HwHealthBaseBarLineDataSet) HeartRateBarChartHolder.this.g.get(dataInfos)).calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.4.4
                    @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                    public float calculate(List<? extends HwHealthBaseEntry> list) {
                        if (list == null || list.size() == 0) {
                            return 0.0f;
                        }
                        if (!(list.get(0) instanceof HwHealthBarEntry)) {
                            throw new RuntimeException("calculateMax not instanceof HwHealthBarEntry! logic error!!!");
                        }
                        Iterator<? extends HwHealthBaseEntry> it = list.iterator();
                        float fD = Float.MIN_VALUE;
                        while (it.hasNext()) {
                            IStorageModel iStorageModelAcquireModel = ((HwHealthBarEntry) it.next()).acquireModel();
                            if (qnn.d(iStorageModelAcquireModel) > fD) {
                                fD = qnn.d(iStorageModelAcquireModel);
                            }
                        }
                        return fD;
                    }
                });
            }
        };
        this.m = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.5
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateBarChartHolder.this.g == null || HeartRateBarChartHolder.this.g.get(dataInfos) == null) {
                    return 0.0f;
                }
                return ((HwHealthBaseBarLineDataSet) HeartRateBarChartHolder.this.g.get(dataInfos)).calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.5.2
                    @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                    public float calculate(List<? extends HwHealthBaseEntry> list) {
                        if (list == null || list.size() == 0) {
                            return 0.0f;
                        }
                        if (!(list.get(0) instanceof HwHealthBarEntry)) {
                            throw new RuntimeException("calculateMin not instanceof HwHealthBarEntry! logic error!!!");
                        }
                        Iterator<? extends HwHealthBaseEntry> it = list.iterator();
                        float fB = Float.MAX_VALUE;
                        while (it.hasNext()) {
                            IStorageModel iStorageModelAcquireModel = ((HwHealthBarEntry) it.next()).acquireModel();
                            if (fB > qnn.b(iStorageModelAcquireModel)) {
                                fB = qnn.b(iStorageModelAcquireModel);
                            }
                        }
                        return fB;
                    }
                });
            }
        };
        this.f26904b = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.9
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateBarChartHolder.this.d == null || HeartRateBarChartHolder.this.d.get(dataInfos) == null) {
                    return 0.0f;
                }
                return ((HwHealthBaseBarLineDataSet) HeartRateBarChartHolder.this.d.get(dataInfos)).calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.9.2
                    @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                    public float calculate(List<? extends HwHealthBaseEntry> list) {
                        if (list == null || list.size() == 0) {
                            return 0.0f;
                        }
                        if (!(list.get(0) instanceof HwHealthBarEntry)) {
                            throw new RuntimeException("calculateMax not instanceof HwHealthBarEntry! logic error!!!");
                        }
                        Iterator<? extends HwHealthBaseEntry> it = list.iterator();
                        float fD = Float.MIN_VALUE;
                        while (it.hasNext()) {
                            IStorageModel iStorageModelAcquireModel = ((HwHealthBarEntry) it.next()).acquireModel();
                            if (qnn.d(iStorageModelAcquireModel) > fD) {
                                fD = qnn.d(iStorageModelAcquireModel);
                            }
                        }
                        return fD;
                    }
                });
            }
        };
        this.f26903a = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.10
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateBarChartHolder.this.d == null || HeartRateBarChartHolder.this.d.get(dataInfos) == null) {
                    return 0.0f;
                }
                return ((HwHealthBaseBarLineDataSet) HeartRateBarChartHolder.this.d.get(dataInfos)).calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder.10.3
                    @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                    public float calculate(List<? extends HwHealthBaseEntry> list) {
                        if (list == null || list.size() == 0) {
                            return 0.0f;
                        }
                        if (!(list.get(0) instanceof HwHealthBarEntry)) {
                            throw new RuntimeException("calculateMin not instanceof HwHealthBarEntry! logic error!!!");
                        }
                        Iterator<? extends HwHealthBaseEntry> it = list.iterator();
                        float fB = Float.MAX_VALUE;
                        while (it.hasNext()) {
                            IStorageModel iStorageModelAcquireModel = ((HwHealthBarEntry) it.next()).acquireModel();
                            if (fB > qnn.b(iStorageModelAcquireModel)) {
                                fB = qnn.b(iStorageModelAcquireModel);
                            }
                        }
                        return fB;
                    }
                });
            }
        };
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        LogUtil.d("HeartRateBarChartHolder", "computeDynamicBorderMax maxValue = ", Float.valueOf(f), "minValue = ", Float.valueOf(f2));
        if (this.j.containsValue(hwHealthBaseBarLineDataSet)) {
            if (f <= 80.0f) {
                return 80.0f;
            }
            float f3 = f - f2;
            float f4 = (f3 / 2.0f) + f2;
            float f5 = (f3 * 1.2f) / 2.0f;
            float f6 = (int) (f4 + f5);
            float f7 = (int) (f4 - f5);
            if (f > f2 && f6 > f7 && f6 <= 220.0f && f6 >= 40.0f) {
                return f6;
            }
        }
        return 220.0f;
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        LogUtil.d("HeartRateBarChartHolder", "computeDynamicBorderMin maxValue = ", Float.valueOf(f), "minValue = ", Float.valueOf(f2));
        if (this.j.containsValue(hwHealthBaseBarLineDataSet) && f2 >= 40.0f && f > 80.0f) {
            float f3 = f - f2;
            float f4 = (f3 / 2.0f) + f2;
            float f5 = (f3 * 1.2f) / 2.0f;
            float f6 = (int) (f4 - f5);
            float f7 = (int) (f4 + f5);
            if (f > f2 && f7 > f6 && f6 >= 40.0f && f6 <= 220.0f) {
                return f6;
            }
        }
        return 40.0f;
    }

    private void c(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, HwHealthChartHolder.c cVar) {
        if (HwHealthChartHolder.LAYER_ID_NORMAL_HR.equals(cVar.a())) {
            this.f.put(cVar.c(), hwHealthBaseBarLineDataSet);
            return;
        }
        if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(cVar.a())) {
            this.j.put(cVar.c(), hwHealthBaseBarLineDataSet);
            return;
        }
        if (HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(cVar.a())) {
            this.g.put(cVar.c(), hwHealthBaseBarLineDataSet);
        } else if (HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(cVar.a())) {
            this.d.put(cVar.c(), hwHealthBaseBarLineDataSet);
        } else {
            LogUtil.a("HeartRateBarChartHolder", "recordDataSet is null");
        }
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.f26905c;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthCombinedScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry> onCreateDataSet(HwHealthCombinedChart hwHealthCombinedChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry> hwHealthBaseBarLineDataSetOnCreateDataSet = super.onCreateDataSet(hwHealthCombinedChart, dataInfos, cVar);
        c(hwHealthBaseBarLineDataSetOnCreateDataSet, cVar);
        return hwHealthBaseBarLineDataSetOnCreateDataSet;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthCombinedScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry> onFakeDataSet(HwHealthChartHolder.c cVar) {
        HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry> hwHealthBaseBarLineDataSetOnFakeDataSet = super.onFakeDataSet(cVar);
        c(hwHealthBaseBarLineDataSetOnFakeDataSet, cVar);
        return hwHealthBaseBarLineDataSetOnFakeDataSet;
    }

    public ICustomCalculator b() {
        return this.h;
    }

    public ICustomCalculator c() {
        return this.i;
    }

    public ICustomCalculator e() {
        return this.e;
    }

    public ICustomCalculator g() {
        return this.l;
    }

    public ICustomCalculator h() {
        return this.m;
    }

    public ICustomCalculator a() {
        return this.f26904b;
    }

    public ICustomCalculator d() {
        return this.f26903a;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser
    public String parse(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry instanceof HwHealthBarEntry) {
            HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) hwHealthBaseEntry;
            float fB = qnn.b(hwHealthBarEntry.acquireModel());
            float fD = qnn.d(hwHealthBarEntry.acquireModel());
            return UnitUtil.e(fB, 1, 0) + " - " + UnitUtil.e(fD, 1, 0);
        }
        return UnitUtil.e(hwHealthBaseEntry.getY(), 1, 0);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IScrollChartVisitor
    public void visitShowModels(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, String str, DataInfos dataInfos, LogicalUnit logicalUnit) {
        HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet;
        if (str.equals(HwHealthChartHolder.HIGH_WARN)) {
            Map<DataInfos, HwHealthBaseBarLineDataSet> map = this.g;
            if (map == null || map.get(dataInfos) == null) {
                return;
            } else {
                hwHealthBaseBarLineDataSet = this.g.get(dataInfos);
            }
        } else {
            LogUtil.a("HeartRateBarChartHolder", "mBradycardiaDataSetMap is null?", Boolean.valueOf(this.d == null));
            Map<DataInfos, HwHealthBaseBarLineDataSet> map2 = this.d;
            if (map2 == null || map2.get(dataInfos) == null) {
                LogUtil.a("HeartRateBarChartHolder", "mBradycardiaDataSetMap.get(dataInfos) null!!!!");
                return;
            }
            hwHealthBaseBarLineDataSet = this.d.get(dataInfos);
        }
        hwHealthBaseBarLineDataSet.calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, logicalUnit);
    }
}
