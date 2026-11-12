package com.huawei.ui.main.stories.fitness.util.chart;

import android.content.Context;
import android.graphics.Color;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.api.ICustomCalculator;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.common.MotionType;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.LogicalUnit;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.interactors.StepModuleChartStorageHelper;
import com.huawei.ui.main.stories.fitness.views.base.chart.ICustomMotionTypeCalculator;
import defpackage.qgm;
import defpackage.qmf;
import defpackage.qmg;
import defpackage.qms;
import defpackage.qnn;
import defpackage.qqn;
import defpackage.ukl;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class StepModuleBarChartHolder extends HwHealthBarScrollChartHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ICustomMotionTypeCalculator f27103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IChartStorageHelper f27104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27105c;
    private ICustomCalculator d;
    private Map<DataInfos, HwHealthBarDataSet> e;
    private ICustomCalculator i;

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return 0.0f;
    }

    public StepModuleBarChartHolder(Context context) {
        super(context);
        this.e = new HashMap();
        this.f27104b = new StepModuleChartStorageHelper();
        this.d = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.util.chart.StepModuleBarChartHolder.2
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                HwHealthBarDataSet hwHealthBarDataSet = (HwHealthBarDataSet) StepModuleBarChartHolder.this.e.get(dataInfos);
                if (hwHealthBarDataSet == null) {
                    throw new RuntimeException("mAvgCalculator can't find dataSet");
                }
                return hwHealthBarDataSet.calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.util.chart.StepModuleBarChartHolder.2.5
                    @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                    public float calculate(List<? extends HwHealthBaseEntry> list) {
                        if (list == null || list.size() == 0) {
                            return 0.0f;
                        }
                        HwHealthBaseEntry hwHealthBaseEntry = list.get(0);
                        if (hwHealthBaseEntry instanceof HwHealthBarEntry) {
                            HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) hwHealthBaseEntry;
                            if (hwHealthBarEntry.acquireModel() instanceof qmf) {
                                return StepModuleBarChartHolder.this.b(list, (qmf) hwHealthBarEntry.acquireModel());
                            }
                        }
                        throw new RuntimeException("mAvgCalculator not instanceof HwHealthBarEntry! logic error!!!");
                    }
                });
            }
        };
        this.i = new ICustomCalculator() { // from class: com.huawei.ui.main.stories.fitness.util.chart.StepModuleBarChartHolder.3
            @Override // com.huawei.health.knit.api.ICustomCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
                HwHealthBarDataSet hwHealthBarDataSet = (HwHealthBarDataSet) StepModuleBarChartHolder.this.e.get(dataInfos);
                if (hwHealthBarDataSet == null) {
                    throw new RuntimeException("calculateSum not find dataSet! logic error!!!");
                }
                return hwHealthBarDataSet.calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.util.chart.StepModuleBarChartHolder.3.4
                    @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                    public float calculate(List<? extends HwHealthBaseEntry> list) {
                        float fE = 0.0f;
                        if (list == null || list.size() == 0) {
                            return 0.0f;
                        }
                        HwHealthBaseEntry hwHealthBaseEntry = list.get(0);
                        if (hwHealthBaseEntry instanceof HwHealthBarEntry) {
                            HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) hwHealthBaseEntry;
                            if (hwHealthBarEntry.acquireModel() instanceof qmf) {
                                if (!(((qmf) hwHealthBarEntry.acquireModel()) instanceof qmg)) {
                                    for (HwHealthBaseEntry hwHealthBaseEntry2 : list) {
                                        if (hwHealthBaseEntry2 != null) {
                                            fE += qnn.d(((HwHealthBarEntry) hwHealthBaseEntry2).acquireModel());
                                        }
                                    }
                                    return fE;
                                }
                                for (HwHealthBaseEntry hwHealthBaseEntry3 : list) {
                                    if (hwHealthBaseEntry3 != null) {
                                        fE += ((qmg) ((HwHealthBarEntry) hwHealthBaseEntry3).acquireModel()).e();
                                    }
                                }
                                return fE;
                            }
                        }
                        throw new RuntimeException("calculateSum not instanceof HwHealthBarEntry! logic error!!!");
                    }
                });
            }
        };
        this.f27103a = new ICustomMotionTypeCalculator() { // from class: com.huawei.ui.main.stories.fitness.util.chart.StepModuleBarChartHolder.5
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ICustomMotionTypeCalculator
            public float calculate(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos, final MotionType motionType) {
                HwHealthBarDataSet hwHealthBarDataSet = (HwHealthBarDataSet) StepModuleBarChartHolder.this.e.get(dataInfos);
                if (hwHealthBarDataSet == null) {
                    throw new RuntimeException("mMotionTypeCalculator can't find dataSet");
                }
                return hwHealthBarDataSet.calculateLogicByShowRange(hwHealthBaseScrollBarLineChart, new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.util.chart.StepModuleBarChartHolder.5.2
                    @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
                    public float calculate(List<? extends HwHealthBaseEntry> list) {
                        float motionType2 = 0.0f;
                        if (list == null || list.size() == 0) {
                            return 0.0f;
                        }
                        if (!(list.get(0) instanceof HwHealthBarEntry)) {
                            throw new RuntimeException("mMotionTypeCalculator not instanceof HwHealthBarEntry! logic error!!!");
                        }
                        for (HwHealthBaseEntry hwHealthBaseEntry : list) {
                            if (hwHealthBaseEntry instanceof HwHealthBarEntry) {
                                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) hwHealthBaseEntry;
                                if (hwHealthBarEntry.acquireModel() instanceof qms) {
                                    motionType2 += ((qms) hwHealthBarEntry.acquireModel()).getMotionType(motionType);
                                }
                            }
                        }
                        return motionType2;
                    }
                });
            }
        };
    }

    public void b(long j) {
        this.f27105c = j;
    }

    public long a() {
        return this.f27105c;
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return ukl.c((int) Math.ceil(f), 5);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.f27104b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onCustomChartStyle(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos) {
        if (dataInfos == null) {
            LogUtil.j("StepModuleBarChartHolder", "onCustomChartStyle dataType == null");
            return;
        }
        if (dataInfos.isStepData() && !dataInfos.isDayData()) {
            qgm.c("900200006", new b(this, hwHealthBarChart, "900200006"));
            return;
        }
        if (dataInfos.isActiveHoursData() && dataInfos.isDayData()) {
            HwHealthYAxis axisFirstParty = hwHealthBarChart.getAxisFirstParty();
            if (axisFirstParty == null) {
                LogUtil.j("StepModuleBarChartHolder", "onCustomChartStyle axisFirstParty == null");
                return;
            } else {
                axisFirstParty.setDrawLabels(false);
                axisFirstParty.setDrawGridLines(true);
                return;
            }
        }
        if (!dataInfos.isTimeStrengthData() || dataInfos.isDayData()) {
            return;
        }
        qgm.c("900200008", new b(this, hwHealthBarChart, "900200008"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final HwHealthBarChart hwHealthBarChart, final int i, final int i2) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.util.chart.StepModuleBarChartHolder.1
                @Override // java.lang.Runnable
                public void run() {
                    StepModuleBarChartHolder.this.d(hwHealthBarChart, i, i2);
                }
            });
            return;
        }
        hwHealthBarChart.enableManualReferenceLine(i, i2);
        hwHealthBarChart.reCalculateDynamicBoardForManualRefLine();
        hwHealthBarChart.refresh();
    }

    public ICustomCalculator e() {
        return this.i;
    }

    public ICustomCalculator c() {
        return this.d;
    }

    public ICustomMotionTypeCalculator d() {
        return this.f27103a;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthBarDataSet onCreateDataSet(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        HwHealthBarDataSet hwHealthBarDataSetOnCreateDataSet = super.onCreateDataSet(hwHealthBarChart, dataInfos, cVar);
        this.e.put(dataInfos, hwHealthBarDataSetOnCreateDataSet);
        if (dataInfos.isStepData()) {
            hwHealthBarDataSetOnCreateDataSet.setColor(qqn.d(R.color.sport_step_default));
            hwHealthBarDataSetOnCreateDataSet.e(qqn.d(R.color.sport_step_focus));
            return hwHealthBarDataSetOnCreateDataSet;
        }
        if (dataInfos.isDistanceData()) {
            hwHealthBarDataSetOnCreateDataSet.setColor(Color.argb(255, MachineControlPointResponse.OP_CODE_EXTENSION_SET_STEP_COUNT, 229, MachineControlPointResponse.OP_CODE_EXTENSION_SET_STEP_COUNT));
            hwHealthBarDataSetOnCreateDataSet.e(Color.argb(255, 71, 204, 71));
            return hwHealthBarDataSetOnCreateDataSet;
        }
        if (dataInfos.isCaloriesData()) {
            hwHealthBarDataSetOnCreateDataSet.setColor(Color.argb(255, 249, 139, 121));
            hwHealthBarDataSetOnCreateDataSet.e(Color.argb(255, 245, 62, 31));
            return hwHealthBarDataSetOnCreateDataSet;
        }
        if (dataInfos.isClimbData()) {
            hwHealthBarDataSetOnCreateDataSet.setColor(Color.argb(255, 127, 223, 228));
            hwHealthBarDataSetOnCreateDataSet.e(Color.argb(255, 0, 191, 201));
            return hwHealthBarDataSetOnCreateDataSet;
        }
        if (dataInfos.isTimeStrengthData()) {
            hwHealthBarDataSetOnCreateDataSet.setColor(Color.argb(255, 255, 205, 112));
            hwHealthBarDataSetOnCreateDataSet.e(Color.argb(255, 255, 171, 17));
            return hwHealthBarDataSetOnCreateDataSet;
        }
        if (dataInfos.isActiveHoursData()) {
            hwHealthBarDataSetOnCreateDataSet.setColor(qqn.d(R.color.active_hours_default));
            hwHealthBarDataSetOnCreateDataSet.e(qqn.d(R.color.active_time_color));
            if (dataInfos.isDayData()) {
                hwHealthBarDataSetOnCreateDataSet.setBarDrawWidth(25.0f);
                hwHealthBarDataSetOnCreateDataSet.e(HwHealthBarDataSet.DrawColorMode.DATA_COLOR);
            }
        }
        return hwHealthBarDataSetOnCreateDataSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float b(List<? extends HwHealthBaseEntry> list, qmf qmfVar) {
        float fE;
        int iD = 0;
        if (!(qmfVar instanceof qmg)) {
            fE = 0.0f;
            for (HwHealthBaseEntry hwHealthBaseEntry : list) {
                if (hwHealthBaseEntry != null) {
                    fE += qnn.d(((HwHealthBarEntry) hwHealthBaseEntry).acquireModel());
                    iD++;
                }
            }
            if (iD == 0) {
                LogUtil.j("StepModuleBarChartHolder", "Division by zero attempted!");
                return 0.0f;
            }
        } else {
            fE = 0.0f;
            for (HwHealthBaseEntry hwHealthBaseEntry2 : list) {
                if (hwHealthBaseEntry2 instanceof HwHealthBarEntry) {
                    HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) hwHealthBaseEntry2;
                    if (hwHealthBarEntry.acquireModel() instanceof qmg) {
                        qmg qmgVar = (qmg) hwHealthBarEntry.acquireModel();
                        fE += qmgVar.e();
                        iD += qmgVar.d();
                    }
                }
            }
            if (iD == 0) {
                LogUtil.j("StepModuleBarChartHolder", "Division by zero attempted!");
                return 0.0f;
            }
        }
        return fE / iD;
    }

    public static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<StepModuleBarChartHolder> f27112a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<HwHealthBarChart> f27113c;
        private String d;

        public b(StepModuleBarChartHolder stepModuleBarChartHolder, HwHealthBarChart hwHealthBarChart, String str) {
            this.f27112a = new WeakReference<>(stepModuleBarChartHolder);
            this.f27113c = new WeakReference<>(hwHealthBarChart);
            this.d = str;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (!(obj instanceof Integer)) {
                LogUtil.j("StepModuleBarChartHolder", "!CollectionUtils.isListTypeMatch(data, HiGoalInfo.class)");
                return;
            }
            int iIntValue = ((Integer) obj).intValue();
            WeakReference<HwHealthBarChart> weakReference = this.f27113c;
            if (weakReference == null || this.f27112a == null) {
                LogUtil.j("StepModuleBarChartHolder", "mChart or mChartHolder == null");
                return;
            }
            HwHealthBarChart hwHealthBarChart = weakReference.get();
            StepModuleBarChartHolder stepModuleBarChartHolder = this.f27112a.get();
            if (hwHealthBarChart == null || stepModuleBarChartHolder == null) {
                LogUtil.j("StepModuleBarChartHolder", "mChart.get() == null");
            } else if ("900200006".equals(this.d)) {
                stepModuleBarChartHolder.d(hwHealthBarChart, iIntValue, qqn.d(R.color.sport_step_target));
            } else if ("900200008".equals(this.d)) {
                stepModuleBarChartHolder.d(hwHealthBarChart, iIntValue, qqn.d(R.color.active_workout_target));
            }
        }
    }
}
