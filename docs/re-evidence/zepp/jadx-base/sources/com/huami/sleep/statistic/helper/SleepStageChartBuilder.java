package com.huami.sleep.statistic.helper;

import android.content.Context;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.util.HMColor;
import com.huami.sleep.R;
import com.huami.sleep.statistic.vo.SleepBarChartVo;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0016\u0010\u0010\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bj\u0002`\u000b\u0012\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00110\bj\u0002`\u0012\u0012\u0016\u0010\u001b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\bj\u0002`\u0018\u0012\u0016\u0010 \u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00160\bj\u0002`\u001d¢\u0006\u0004\bG\u0010HR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R)\u0010\u0010\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bj\u0002`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00110\bj\u0002`\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000fR)\u0010\u001b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\bj\u0002`\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR)\u0010 \u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00160\bj\u0002`\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010(\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0016\u0010*\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#R\u0016\u0010,\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0016\u0010.\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010#R0\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00109\u001a\b\u0012\u0004\u0012\u000206058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R$\u0010>\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R0\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR0\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010@\"\u0004\bE\u0010B¨\u0006I"}, d2 = {"Lcom/huami/sleep/statistic/helper/SleepStageChartBuilder;", "Lcom/huami/sleep/statistic/helper/BarChartBuilder;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function0;", "", "Lcom/huami/sleep/statistic/vo/SleepBarChartVo;", "Lcom/huami/sleep/statistic/helper/BarDataGetter;", "b", "Lkotlin/jvm/functions/Function0;", "getBarDataGetter", "()Lkotlin/jvm/functions/Function0;", "barDataGetter", "", "Lcom/huami/sleep/statistic/helper/BarWidthGetter;", "c", "getBarWidthGetter", "barWidthGetter", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "Lcom/huami/sleep/statistic/helper/XAxisDataGetter;", GoogleApiAvailabilityLight.a, "getXAxisDataGetter", "xAxisDataGetter", "Lcom/huami/chart/data/YAxisData;", "Lcom/huami/sleep/statistic/helper/YAxisDataGetter;", "e", "getYAxisDataGetter", "yAxisDataGetter", "", "f", LogUtil.I, "deepColor", "g", "remColor", "h", "wakeColor", "i", "lightColor", z.j, "editColor", hl.k, "napColor", "value", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "", "Lcom/huami/chart/util/HMColor;", "getBarColors", "()[Lcom/huami/chart/util/HMColor;", "barColors", "getBarWidth", "()F", "setBarWidth", "(F)V", "barWidth", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "getYAxisData", "setYAxisData", "yAxisData", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepStageChartBuilder implements BarChartBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<List<SleepBarChartVo>> barDataGetter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Float> barWidthGetter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<SparseArray<XAxisData>> xAxisDataGetter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<SparseArray<YAxisData>> yAxisDataGetter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int deepColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int remColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int wakeColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int lightColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int editColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int napColor;

    /* JADX WARN: Multi-variable type inference failed */
    public SleepStageChartBuilder(@NotNull Context context, @NotNull Function0<? extends List<SleepBarChartVo>> function0, @NotNull Function0<Float> function1, @NotNull Function0<? extends SparseArray<XAxisData>> function2, @NotNull Function0<? extends SparseArray<YAxisData>> function3) {
        this.context = context;
        this.barDataGetter = function0;
        this.barWidthGetter = function1;
        this.xAxisDataGetter = function2;
        this.yAxisDataGetter = function3;
        this.deepColor = ContextCompat.getColor(context, R.color.s25);
        this.remColor = ContextCompat.getColor(context, R.color.s19);
        this.wakeColor = ContextCompat.getColor(context, R.color.s34);
        int i = R.color.s16;
        this.lightColor = ContextCompat.getColor(context, i);
        this.editColor = ContextCompat.getColor(context, R.color.s17);
        this.napColor = ContextCompat.getColor(context, i);
    }

    @Override // com.huami.sleep.statistic.helper.BarChartBuilder
    @NotNull
    public HMColor[] getBarColors() {
        return new HMColor[]{new HMColor(this.deepColor), new HMColor(this.remColor), new HMColor(this.wakeColor), new HMColor(this.napColor), new HMColor(this.lightColor), new HMColor(this.editColor)};
    }

    @NotNull
    public final Function0<List<SleepBarChartVo>> getBarDataGetter() {
        return this.barDataGetter;
    }

    @Override // com.huami.sleep.statistic.helper.BarChartBuilder
    public float getBarWidth() {
        return this.barWidthGetter.invoke().floatValue();
    }

    @NotNull
    public final Function0<Float> getBarWidthGetter() {
        return this.barWidthGetter;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.huami.sleep.statistic.helper.BarChartBuilder
    @NotNull
    public List<SleepBarChartVo> getDataList() {
        return this.barDataGetter.invoke();
    }

    @Override // com.huami.sleep.statistic.helper.BarChartBuilder
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        return this.xAxisDataGetter.invoke();
    }

    @NotNull
    public final Function0<SparseArray<XAxisData>> getXAxisDataGetter() {
        return this.xAxisDataGetter;
    }

    @Override // com.huami.sleep.statistic.helper.BarChartBuilder
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        return this.yAxisDataGetter.invoke();
    }

    @NotNull
    public final Function0<SparseArray<YAxisData>> getYAxisDataGetter() {
        return this.yAxisDataGetter;
    }

    @Override // com.huami.sleep.statistic.helper.BarChartBuilder
    public void setBarWidth(float f) {
    }

    @Override // com.huami.sleep.statistic.helper.BarChartBuilder
    public void setDataList(@NotNull List<SleepBarChartVo> list) {
    }

    @Override // com.huami.sleep.statistic.helper.BarChartBuilder
    public void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray) {
    }

    @Override // com.huami.sleep.statistic.helper.BarChartBuilder
    public void setYAxisData(@NotNull SparseArray<YAxisData> sparseArray) {
    }
}
