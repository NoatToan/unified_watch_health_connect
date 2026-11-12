package com.huami.bloodpressure_ui.chart;

import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_ui.ext.BloodPressureWrap;
import com.huami.bloodpressure_ui.tab.TimeMode;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.loc.z;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bí\u0001\u0012\u001c\u0010\t\u001a\u0018\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00040\u0003j\u0002`\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0003j\u0004\u0018\u0001`\u0014\u0012\"\b\u0002\u0010\u0018\u001a\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006\u0012\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u0003j\u0004\u0018\u0001`\u001b\u0012\u001c\b\u0002\u0010\u001f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u0003j\u0004\u0018\u0001`\u001b\u0012\"\b\u0002\u0010%\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 \u0018\u00010\u0003j\u0004\u0018\u0001`#\u0012\b\b\u0002\u0010(\u001a\u00020!\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n¢\u0006\u0004\be\u0010fR,\u0010\t\u001a\u0018\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00040\u0003j\u0002`\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R*\u0010\u0016\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0003j\u0004\u0018\u0001`\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR0\u0010\u0018\u001a\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR*\u0010\u001d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u0003j\u0004\u0018\u0001`\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\bR*\u0010\u001f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u0003j\u0004\u0018\u0001`\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\bR0\u0010%\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 \u0018\u00010\u0003j\u0004\u0018\u0001`#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\bR\u0016\u0010(\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R<\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R0\u00107\u001a\b\u0012\u0004\u0012\u0002020\u00192\f\u0010,\u001a\b\u0012\u0004\u0012\u0002020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R0\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u00192\f\u0010,\u001a\b\u0012\u0004\u0012\u0002080\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\u0016\u0010?\u001a\u00020<8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R*\u0010D\u001a\u0016\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020!\u0018\u00010@j\u0004\u0018\u0001`A8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010!8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR$\u0010O\u001a\u00020H2\u0006\u0010,\u001a\u00020H8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010J\"\u0004\bM\u0010NR4\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR4\u0010W\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u00104\"\u0004\bV\u00106R4\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bX\u00104\"\u0004\bY\u00106R@\u0010_\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010d\u001a\u0004\u0018\u00010\n2\b\u0010,\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006g"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartBuilder;", "Lcom/huami/bloodpressure_ui/chart/IBloodPressureChartBuilder;", "", "Lkotlin/Function0;", "", "Lcom/huami/bloodpressure_ui/chart/BarChartVo;", "Lcom/huami/bloodpressure_ui/chart/BarPointsGetter;", "a", "Lkotlin/jvm/functions/Function0;", "pointsGetter", "", "b", "J", "timeStamp", "Lcom/huami/bloodpressure_ui/tab/TimeMode;", "c", "Lcom/huami/bloodpressure_ui/tab/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "Lcom/huami/chart/data/ChartDataList;", "Lcom/huami/bloodpressure_ui/chart/AvgPointsGetter;", GoogleApiAvailabilityLight.a, "avgPointsGetter", "e", "realPointsGetter", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "Lcom/huami/bloodpressure_ui/chart/ChartDataArrayGetter;", "f", "sbpChartDataArrayGetter", "g", "dbpChartDataArrayGetter", "", "", "Lcom/huami/bloodpressure_ui/ext/BloodPressureWrap;", "Lcom/huami/bloodpressure_ui/chart/ChartDataMapGetter;", "h", "dataMapGetter", "i", LogUtil.I, "timeInterval", z.j, "Ljava/lang/Long;", "lastTimeStamp", "value", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "Lcom/huami/chart/data/XAxisData;", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "setYAxisData", "yAxisData", "", "getValueOffset", "()F", "valueOffset", "Lkotlin/Function1;", "Lcom/huami/bloodpressure_ui/chart/BarDataColorGetter;", "getBarDataColorGetter", "()Lkotlin/jvm/functions/Function1;", "barDataColorGetter", "getBarMaxSize", "()Ljava/lang/Integer;", "barMaxSize", "", "getYScaleLongDash", "()Z", "yScaleLongDash", "getShowIntersectionPoint", "setShowIntersectionPoint", "(Z)V", "showIntersectionPoint", "getAvgPoints", "()[Lcom/huami/chart/data/ChartDataList;", "setAvgPoints", "([Lcom/huami/chart/data/ChartDataList;)V", "avgPoints", "getSbpList", "setSbpList", "sbpList", "getDbpList", "setDbpList", "dbpList", "getDataListMap", "()Ljava/util/Map;", "setDataListMap", "(Ljava/util/Map;)V", "dataListMap", "getLastDataTimestamp", "()Ljava/lang/Long;", "setLastDataTimestamp", "(Ljava/lang/Long;)V", "lastDataTimestamp", "<init>", "(Lkotlin/jvm/functions/Function0;JLcom/huami/bloodpressure_ui/tab/TimeMode;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Long;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureChartBuilder implements IBloodPressureChartBuilder<Number> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<List<BarChartVo<Number>>> pointsGetter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long timeStamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TimeMode timeMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Function0<ChartDataList[]> avgPointsGetter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final Function0<List<BarChartVo<Number>>> realPointsGetter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final Function0<SparseArray<ChartData>> sbpChartDataArrayGetter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final Function0<SparseArray<ChartData>> dbpChartDataArrayGetter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final Function0<Map<Integer, BloodPressureWrap>> dataMapGetter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int timeInterval;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final Long lastTimeStamp;

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureChartBuilder(@NotNull Function0<? extends List<BarChartVo<Number>>> function0, long j, @NotNull TimeMode timeMode, @Nullable Function0<ChartDataList[]> function1, @Nullable Function0<? extends List<BarChartVo<Number>>> function2, @Nullable Function0<? extends SparseArray<ChartData>> function3, @Nullable Function0<? extends SparseArray<ChartData>> function4, @Nullable Function0<? extends Map<Integer, BloodPressureWrap>> function5, int i, @Nullable Long l) {
        this.pointsGetter = function0;
        this.timeStamp = j;
        this.timeMode = timeMode;
        this.avgPointsGetter = function1;
        this.realPointsGetter = function2;
        this.sbpChartDataArrayGetter = function3;
        this.dbpChartDataArrayGetter = function4;
        this.dataMapGetter = function5;
        this.timeInterval = i;
        this.lastTimeStamp = l;
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    @Nullable
    public ChartDataList[] getAvgPoints() {
        Function0<ChartDataList[]> function0 = this.avgPointsGetter;
        if (function0 == null) {
            return null;
        }
        return function0.invoke();
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    @Nullable
    public Function1<Float, Integer> getBarDataColorGetter() {
        return null;
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    @Nullable
    public Integer getBarMaxSize() {
        return null;
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    @Nullable
    public Map<Integer, BloodPressureWrap> getDataListMap() {
        Function0<Map<Integer, BloodPressureWrap>> function0 = this.dataMapGetter;
        if (function0 == null) {
            return null;
        }
        return function0.invoke();
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    @Nullable
    public SparseArray<ChartData> getDbpList() {
        Function0<SparseArray<ChartData>> function0 = this.dbpChartDataArrayGetter;
        if (function0 == null) {
            return null;
        }
        return function0.invoke();
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    @Nullable
    /* JADX INFO: renamed from: getLastDataTimestamp, reason: from getter */
    public Long getLastTimeStamp() {
        return this.lastTimeStamp;
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    @NotNull
    public List<BarChartVo<Number>> getPoints() {
        return this.pointsGetter.invoke();
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    @Nullable
    public SparseArray<ChartData> getSbpList() {
        Function0<SparseArray<ChartData>> function0 = this.sbpChartDataArrayGetter;
        if (function0 == null) {
            return null;
        }
        return function0.invoke();
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    public boolean getShowIntersectionPoint() {
        return false;
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    public float getValueOffset() {
        return IBloodPressureChartBuilderKt.a();
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.timeStamp);
        return IBloodPressureChartBuilderKt.getXAxisDataByType(calendar.getTime(), this.timeMode, this.timeInterval);
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        Function0<List<BarChartVo<Number>>> function0 = this.realPointsGetter;
        List<BarChartVo<Number>> listInvoke = function0 == null ? null : function0.invoke();
        if (listInvoke == null) {
            listInvoke = this.pointsGetter.invoke();
        }
        return IBloodPressureChartBuilderKt.g(listInvoke);
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    public boolean getYScaleLongDash() {
        return false;
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    public void setAvgPoints(@Nullable ChartDataList[] chartDataListArr) {
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    public void setDataListMap(@Nullable Map<Integer, BloodPressureWrap> map) {
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    public void setDbpList(@Nullable SparseArray<ChartData> sparseArray) {
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    public void setLastDataTimestamp(@Nullable Long l) {
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    public void setPoints(@NotNull List<BarChartVo<Number>> list) {
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    public void setSbpList(@Nullable SparseArray<ChartData> sparseArray) {
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    public void setShowIntersectionPoint(boolean z) {
    }

    @Override // com.huami.bloodpressure_ui.chart.IBloodPressureChartBuilder
    public void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray) {
    }

    public void setYAxisData(@NotNull SparseArray<YAxisData> sparseArray) {
    }

    public /* synthetic */ BloodPressureChartBuilder(Function0 function0, long j, TimeMode timeMode, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, int i, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, j, timeMode, (i2 & 8) != 0 ? null : function1, (i2 & 16) != 0 ? null : function2, (i2 & 32) != 0 ? null : function3, (i2 & 64) != 0 ? null : function4, (i2 & 128) != 0 ? null : function5, (i2 & 256) != 0 ? -1 : i, (i2 & 512) != 0 ? null : l);
    }
}
