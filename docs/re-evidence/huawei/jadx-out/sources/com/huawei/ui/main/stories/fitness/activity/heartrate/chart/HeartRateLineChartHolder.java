package com.huawei.ui.main.stories.fitness.activity.heartrate.chart;

import android.content.Context;
import android.graphics.Color;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.health.knit.api.ICustomCalculator;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.LogicalUnit;
import com.huawei.ui.commonui.linechart.model.HwHealthLineEntry;
import com.huawei.ui.commonui.linechart.model.StorageGenericModel;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IScrollChartVisitor;
import defpackage.qqn;
import defpackage.uep;
import defpackage.ueu;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HeartRateLineChartHolder extends HwHealthLineScrollChartHolder implements HighlightedEntryParser, IScrollChartVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ICustomCalculator f26915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICustomCalculator f26916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IChartStorageHelper f26917c;
    private ICustomCalculator d;
    private HwHealthBaseBarLineDataSet e;
    private ICustomCalculator f;
    private HwHealthBaseBarLineDataSet g;
    private ICustomCalculator h;
    private ICustomCalculator i;
    private HwHealthBaseBarLineDataSet j;

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return 220.0f;
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return 40.0f;
    }

    public HeartRateLineChartHolder(Context context) {
        super(context);
        this.f26917c = new uep();
        this.h = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.4
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateLineChartHolder.this.j == null) {
                    return 0.0f;
                }
                return HeartRateLineChartHolder.this.j.calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.4.2
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
        this.d = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.5
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateLineChartHolder.this.j == null) {
                    return 0.0f;
                }
                return HeartRateLineChartHolder.this.j.calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.5.1
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
        this.f = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.2
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateLineChartHolder.this.g != null) {
                    return HeartRateLineChartHolder.this.g.calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.2.5
                        @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                        public float calculate(List<? extends HwHealthBaseEntry> list) {
                            if (list == null || list.size() == 0) {
                                return Float.MIN_VALUE;
                            }
                            if (!(list.get(0) instanceof HwHealthLineEntry)) {
                                throw new RuntimeException("calculateMax not instanceof HwHealthLineEntry! logic error!!!");
                            }
                            Iterator<? extends HwHealthBaseEntry> it = list.iterator();
                            float fC = -3.4028235E38f;
                            while (it.hasNext()) {
                                for (Object obj : ((StorageGenericModel) ((HwHealthLineEntry) it.next()).acquireModel()).e("HR_WARNING_DETAIL")) {
                                    if (obj instanceof ueu) {
                                        ueu ueuVar = (ueu) obj;
                                        if (ueuVar.c() > fC) {
                                            fC = ueuVar.c();
                                        }
                                    }
                                }
                            }
                            return fC;
                        }
                    });
                }
                throw new RuntimeException("calculateMax can't find dataSet");
            }
        };
        this.i = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.3
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateLineChartHolder.this.g != null) {
                    return HeartRateLineChartHolder.this.g.calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.3.5
                        @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                        public float calculate(List<? extends HwHealthBaseEntry> list) {
                            float fE = Float.MAX_VALUE;
                            if (list == null || list.size() == 0) {
                                return Float.MAX_VALUE;
                            }
                            if (!(list.get(0) instanceof HwHealthLineEntry)) {
                                throw new RuntimeException("calculateMin not instanceof HwHealthLineEntry! logic error!!!");
                            }
                            Iterator<? extends HwHealthBaseEntry> it = list.iterator();
                            while (it.hasNext()) {
                                for (Object obj : ((StorageGenericModel) ((HwHealthLineEntry) it.next()).acquireModel()).e("HR_WARNING_DETAIL")) {
                                    if (obj instanceof ueu) {
                                        ueu ueuVar = (ueu) obj;
                                        if (ueuVar.e() < fE) {
                                            fE = ueuVar.e();
                                        }
                                    }
                                }
                            }
                            return fE;
                        }
                    });
                }
                throw new RuntimeException("calculateMax can't find dataSet");
            }
        };
        this.f26916b = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.9
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateLineChartHolder.this.e != null) {
                    return HeartRateLineChartHolder.this.e.calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.9.3
                        @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                        public float calculate(List<? extends HwHealthBaseEntry> list) {
                            if (list == null || list.size() == 0) {
                                return Float.MIN_VALUE;
                            }
                            if (!(list.get(0) instanceof HwHealthLineEntry)) {
                                throw new RuntimeException("calculateMax not instanceof HwHealthLineEntry! logic error!!!");
                            }
                            Iterator<? extends HwHealthBaseEntry> it = list.iterator();
                            float fC = -3.4028235E38f;
                            while (it.hasNext()) {
                                Iterator<Object> it2 = ((StorageGenericModel) ((HwHealthLineEntry) it.next()).acquireModel()).e("BRADYCARDIA_DETAIL").iterator();
                                while (it2.hasNext()) {
                                    ueu ueuVar = (ueu) it2.next();
                                    if (ueuVar.c() > fC) {
                                        fC = ueuVar.c();
                                    }
                                }
                            }
                            return fC;
                        }
                    });
                }
                throw new RuntimeException("calculateMax can't find dataSet");
            }
        };
        this.f26915a = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.8
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                if (HeartRateLineChartHolder.this.e != null) {
                    return HeartRateLineChartHolder.this.e.calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.8.4
                        @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                        public float calculate(List<? extends HwHealthBaseEntry> list) {
                            float fE = Float.MAX_VALUE;
                            if (list == null || list.size() == 0) {
                                return Float.MAX_VALUE;
                            }
                            if (!(list.get(0) instanceof HwHealthLineEntry)) {
                                throw new RuntimeException("calculateMin not instanceof HwHealthLineEntry! logic error!!!");
                            }
                            Iterator<? extends HwHealthBaseEntry> it = list.iterator();
                            while (it.hasNext()) {
                                Iterator<Object> it2 = ((StorageGenericModel) ((HwHealthLineEntry) it.next()).acquireModel()).e("BRADYCARDIA_DETAIL").iterator();
                                while (it2.hasNext()) {
                                    ueu ueuVar = (ueu) it2.next();
                                    if (ueuVar.e() < fE) {
                                        fE = ueuVar.e();
                                    }
                                }
                            }
                            return fE;
                        }
                    });
                }
                throw new RuntimeException("calculateMax can't find dataSet");
            }
        };
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthLineDataSet onCreateDataSet(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        HwHealthLineDataSet hwHealthLineDataSetOnCreateDataSet = super.onCreateDataSet(hwHealthLineChart, dataInfos, cVar);
        hwHealthLineDataSetOnCreateDataSet.setColor(Color.argb(255, 252, 49, 89));
        hwHealthLineDataSetOnCreateDataSet.d(Color.argb(229, a.L, 70, 94));
        hwHealthLineDataSetOnCreateDataSet.a(Color.argb(127, 252, 49, 89), Color.argb(0, 252, 49, 89), true);
        hwHealthLineDataSetOnCreateDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.10
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public boolean drawLine(int i, int i2, int i3) {
                return i2 - i <= 35;
            }
        });
        hwHealthLineDataSetOnCreateDataSet.setLineWidth(1.5f);
        hwHealthLineDataSetOnCreateDataSet.e(new HwHealthLineDataSet.NodeDrawStyle() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.7
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
                return Utils.convertDpToPixel(4.0f);
            }
        });
        hwHealthLineDataSetOnCreateDataSet.setLabelCount(5, true);
        hwHealthLineChart.getAxisFirstParty().setAxisMinimum(40.0f);
        hwHealthLineChart.getAxisFirstParty().setAxisMaximum(220.0f);
        c(hwHealthLineDataSetOnCreateDataSet, cVar);
        return hwHealthLineDataSetOnCreateDataSet;
    }

    private void c(HwHealthLineDataSet hwHealthLineDataSet, HwHealthChartHolder.c cVar) {
        if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(cVar.a())) {
            this.j = hwHealthLineDataSet;
            return;
        }
        if (HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(cVar.a())) {
            this.g = hwHealthLineDataSet;
        } else if (HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(cVar.a())) {
            this.e = hwHealthLineDataSet;
        } else {
            LogUtil.a("HeartRateLineChartHolder", "recordDataSet is null?");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HwHealthLineDataSet onFakeDataSet(HwHealthChartHolder.c cVar) {
        ArrayList arrayList = new ArrayList(16);
        DataInfos dataInfosC = cVar.c();
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, arrayList, getChartBrief(dataInfosC), getChartLabel(dataInfosC), getChartUnit(dataInfosC));
        hwHealthLineDataSet.setColor(Color.argb(255, 252, 49, 89));
        hwHealthLineDataSet.d(Color.argb(229, a.L, 70, 94));
        hwHealthLineDataSet.a(Color.argb(127, 252, 49, 89), Color.argb(0, 252, 49, 89), true);
        hwHealthLineDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.6
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public boolean drawLine(int i, int i2, int i3) {
                return i2 - i <= 35;
            }
        });
        hwHealthLineDataSet.setLineWidth(2.0f);
        hwHealthLineDataSet.e(new HwHealthLineDataSet.NodeDrawStyle() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder.1
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
                return Utils.convertDpToPixel(4.0f);
            }
        });
        c(hwHealthLineDataSet, cVar);
        return hwHealthLineDataSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onCustomChartStyle(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos) {
        hwHealthLineChart.makeReverse(true);
        hwHealthLineChart.setGridColor(qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color), qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color));
        hwHealthLineChart.setLabelColor(qqn.b(BaseApplication.getContext(), R.color.textColorSecondary));
        hwHealthLineChart.setAvoidFirstLastClipping(false);
        hwHealthLineChart.enableOnlyShowMinutes(true);
        hwHealthLineChart.enableOneMinuteOmit(true);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.f26917c;
    }

    public ICustomCalculator a() {
        return this.h;
    }

    public ICustomCalculator h() {
        return this.d;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser
    public String parse(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) {
            return "--";
        }
        return UnitUtil.e(hwHealthBaseEntry.getY(), 1, 0);
    }

    public ICustomCalculator d() {
        return this.f;
    }

    public ICustomCalculator b() {
        return this.i;
    }

    public ICustomCalculator c() {
        return this.f26916b;
    }

    public ICustomCalculator e() {
        return this.f26915a;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IScrollChartVisitor
    public void visitShowModels(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, String str, DataInfos dataInfos, LogicalUnit logicalUnit) {
        HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet;
        if (HwHealthChartHolder.HIGH_WARN.equals(str)) {
            hwHealthBaseBarLineDataSet = this.g;
        } else {
            hwHealthBaseBarLineDataSet = this.e;
        }
        hwHealthBaseBarLineDataSet.calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, logicalUnit);
    }
}
