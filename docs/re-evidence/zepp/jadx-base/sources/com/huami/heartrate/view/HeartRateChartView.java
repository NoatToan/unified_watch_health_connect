package com.huami.heartrate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.data.XAxisData;
import com.huami.health.afppg.model.AtrialFibrillation;
import com.huami.heartrate.atrialfib.AtrialUtils;
import com.huami.heartrate.chart.HRCardChartHelper;
import com.huami.heartrate.chart.HRChartHelperKt;
import com.huami.heartrate.chart.HandleDataKt;
import com.huami.heartrate.chart.model.HRDayChartData;
import com.huami.heartrate.constant.ConstantKt;
import com.huami.heartrate.model.AbnormalHeartBeatEntity;
import com.huami.heartrate.service.ChartVo;
import com.huami.heartrate.service.HeartRateInfo;
import com.huami.heartrate.vo.LineChartVo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006#"}, d2 = {"Lcom/huami/heartrate/view/HeartRateChartView;", "Lcom/huami/heartrate/view/AbsHeartRateChartView;", "", "Lcom/huami/heartrate/model/AbnormalHeartBeatEntity;", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "b", GoogleApiAvailabilityLight.a, "Landroid/view/ViewGroup;", "container", "Lcom/huami/heartrate/vo/LineChartVo;", "lineChartVo", "", "c", "", "", "xAxisLabels", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "a", "([Ljava/lang/String;)Landroid/util/SparseArray;", "Lcom/huami/heartrate/service/ChartVo;", "chartVo", "Lcom/huami/heartrate/service/HeartRateInfo;", "heartRateInfo", "abnormalHeartBeatEntityList", "refreshLineChart", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateChartView extends AbsHeartRateChartView {

    @NotNull
    private static final String a = "HeartRateChartView";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getDayXAxisData..." + this.a;
        }
    }

    @JvmOverloads
    public HeartRateChartView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HeartRateChartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ HeartRateChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final SparseArray<XAxisData> a(String[] xAxisLabels) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        int length = xAxisLabels.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int length2 = (((i * 24) * 60) / (xAxisLabels.length - 1)) / 5;
                sparseArray.put(length2, new XAxisData(length2, xAxisLabels[i]));
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        HMLog.info(a, new a(sparseArray));
        return sparseArray;
    }

    private final List<AtrialFibrillation> b(List<AbnormalHeartBeatEntity> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(d((AbnormalHeartBeatEntity) it2.next()));
        }
        return arrayList;
    }

    private final void c(ViewGroup container, LineChartVo lineChartVo) {
        ChartDataList chartDataList = new ChartDataList(lineChartVo.getChartDatas(), 0, ConstantKt.DRAW_END_INDEX);
        float roundUpTen = chartDataList.getCount() <= 0 ? 0.0f : HRChartHelperKt.getRoundUpTen(chartDataList.getMaxDataValue());
        HRCardChartHelper hRCardChartHelper = new HRCardChartHelper(getContext(), container, lineChartVo.getContainerWidth(), lineChartVo.getContainerHeight());
        HRDayChartData hRDayChartData = new HRDayChartData(lineChartVo.getYStart(), roundUpTen, a(lineChartVo.getXLabels()), HRChartHelperKt.getYAxisData((int) roundUpTen), chartDataList);
        float[] goals = lineChartVo.getGoals();
        ArrayList<RangeIndex> abnormalHr = lineChartVo.getAbnormalHr();
        if (abnormalHr == null) {
            abnormalHr = new ArrayList<>();
        }
        hRCardChartHelper.refreshLineChart(hRDayChartData, goals, abnormalHr);
    }

    private final AtrialFibrillation d(AbnormalHeartBeatEntity abnormalHeartBeatEntity) {
        return new AtrialFibrillation(abnormalHeartBeatEntity.getDuration(), abnormalHeartBeatEntity.getEventTime(), abnormalHeartBeatEntity.getEndTime(), abnormalHeartBeatEntity.getEcgAbnormalResults(), abnormalHeartBeatEntity.getDeviceSource());
    }

    @Override // com.huami.heartrate.view.AbsHeartRateChartView
    public void refreshLineChart(@NotNull ViewGroup container, @Nullable ChartVo chartVo, @Nullable HeartRateInfo heartRateInfo, @Nullable List<AbnormalHeartBeatEntity> abnormalHeartBeatEntityList) {
        byte[] mergedRawHeartData = heartRateInfo == null ? null : heartRateInfo.getMergedRawHeartData();
        SparseArray sparseArray = mergedRawHeartData == null ? new SparseArray(0) : (SparseArray) HandleDataKt.getWholeDayHeartRateDataConvert().invoke(mergedRawHeartData).first;
        Calendar calendar = Calendar.getInstance();
        Long lValueOf = heartRateInfo == null ? null : Long.valueOf(heartRateInfo.getDate());
        calendar.setTimeInMillis(lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue());
        ArrayList<RangeIndex> arrayListAtrialFibrillationItemToRange = AtrialUtils.INSTANCE.atrialFibrillationItemToRange(calendar, abnormalHeartBeatEntityList == null ? null : b(abnormalHeartBeatEntityList));
        float[] goals = chartVo == null ? null : chartVo.getGoals();
        float startY = chartVo == null ? 0.0f : chartVo.getStartY();
        String[] xLabels = chartVo == null ? null : chartVo.getXLabels();
        if (xLabels == null) {
            xLabels = ConstantKt.getDAY_CHART_ARRAY();
        }
        c(container, new LineChartVo(sparseArray, arrayListAtrialFibrillationItemToRange, goals, startY, xLabels, chartVo == null ? null : chartVo.getContainerWidth(), chartVo != null ? chartVo.getContainerHeight() : null));
    }

    @JvmOverloads
    public HeartRateChartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
