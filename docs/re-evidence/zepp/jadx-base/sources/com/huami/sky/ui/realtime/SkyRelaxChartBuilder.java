package com.huami.sky.ui.realtime;

import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.DynamicChartData;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.helper.ChartBuildKt;
import com.huami.sky.lib.entity.RelaxInfo;
import com.huami.tools.log.HMLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0014R\u0016\u0010$\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0016\u0010&\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0014R\u0016\u0010(\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0014¨\u0006+"}, d2 = {"Lcom/huami/sky/ui/realtime/SkyRelaxChartBuilder;", "", "", "time", "", "a", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "buildYAxisData", "startTime", "endTime", "Lcom/huami/chart/data/XAxisData;", "buildXAxisData", "Lcom/huami/chart/data/ChartDataList;", "createRelaxChartList", "Lcom/huami/sky/lib/entity/RelaxInfo;", "relaxInfo", "Lcom/huami/chart/chart/DynamicChartData;", "buildChartData", "", LogUtil.I, "MINUTE_15_MILLI_SECOND", "b", "MINUTE_MILLI_SECOND", "c", "J", "LINE_ANIM_DURATION", "", GoogleApiAvailabilityLight.a, "F", "RELAX_CHART_Y_MAX", "e", "RELAX_CHART_Y_MIN", "f", "RELAX_CHART_X_START", "g", "RELAX_CHART_X_HALF", "h", "RELAX_CHART_X_END", "i", "RELAX_CHART_X_COUNT", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyRelaxChartBuilder {

    @NotNull
    public static final SkyRelaxChartBuilder INSTANCE = new SkyRelaxChartBuilder();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int MINUTE_15_MILLI_SECOND = 900000;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int MINUTE_MILLI_SECOND = 60000;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final long LINE_ANIM_DURATION = 1000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float RELAX_CHART_Y_MAX = 70.0f;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float RELAX_CHART_Y_MIN = 30.0f;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int RELAX_CHART_X_START = 0;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int RELAX_CHART_X_HALF = 15;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final int RELAX_CHART_X_END = 29;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final int RELAX_CHART_X_COUNT = 30;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ RelaxInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, RelaxInfo relaxInfo) {
            super(0);
            this.a = i;
            this.b = relaxInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "新增放松指数图表数据，索引：" + this.a + ", 放松值：" + this.b.getValue();
        }
    }

    private SkyRelaxChartBuilder() {
    }

    private final String a(long time) {
        return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final DynamicChartData buildChartData(@NotNull RelaxInfo relaxInfo, long startTime) {
        int createdAt = (int) ((relaxInfo.getCreatedAt() - startTime) / ((long) 60000));
        HMLog.info("SkyRelaxChartBuilder", new a(createdAt, relaxInfo));
        return new DynamicChartData(new ChartData(createdAt, relaxInfo.getValue()), 1000L);
    }

    @NotNull
    public final SparseArray<XAxisData> buildXAxisData(long startTime, long endTime) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        if (startTime < 0) {
            sparseArray.put(0, new XAxisData(0, "--:--"));
            sparseArray.put(15, new XAxisData(15, ""));
            sparseArray.put(29, new XAxisData(29, "--:--"));
        } else {
            sparseArray.put(0, new XAxisData(0, a(startTime)));
            sparseArray.put(15, new XAxisData(15, a(startTime + ((long) 900000))));
            sparseArray.put(29, new XAxisData(29, a(endTime)));
        }
        return sparseArray;
    }

    @NotNull
    public final SparseArray<YAxisData> buildYAxisData() {
        return ChartBuildKt.buildYAxisData$default(30.0f, 70.0f, 0, 4, null);
    }

    @NotNull
    public final ChartDataList createRelaxChartList() {
        ChartDataList chartDataList = new ChartDataList(new SparseArray());
        chartDataList.setStart(0);
        chartDataList.setEnd(29);
        chartDataList.setShownCount(30);
        chartDataList.setMinValue(30.0f);
        chartDataList.setMaxValue(70.0f);
        return chartDataList;
    }
}
