package com.huami.sleep.statistic.helper;

import android.content.Context;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.sleep.R;
import com.huami.sleep.statistic.vo.SleepRegularChartVo;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u000e\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0016\u0010\u0010\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bj\u0002`\u000b\u0012\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00110\bj\u0002`\u0012\u0012\u0016\u0010\u001b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\bj\u0002`\u0018\u0012\u0016\u0010 \u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00160\bj\u0002`\u001d¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R)\u0010\u0010\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bj\u0002`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00110\bj\u0002`\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000fR)\u0010\u001b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\bj\u0002`\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR)\u0010 \u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00160\bj\u0002`\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R0\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020!0-8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R0\u00105\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R0\u00108\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u00102\"\u0004\b7\u00104¨\u0006;"}, d2 = {"Lcom/huami/sleep/statistic/helper/SleepRegularChartBuilder;", "Lcom/huami/sleep/statistic/helper/RegularChartBuilder;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function0;", "", "Lcom/huami/sleep/statistic/vo/SleepRegularChartVo;", "Lcom/huami/sleep/statistic/helper/RegularDataGetter;", "b", "Lkotlin/jvm/functions/Function0;", "getRegularDataGetter", "()Lkotlin/jvm/functions/Function0;", "regularDataGetter", "", "Lcom/huami/sleep/statistic/helper/RegularWidthGetter;", "c", "getRegularWidthGetter", "regularWidthGetter", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "Lcom/huami/sleep/statistic/helper/RegularXAxisDataGetter;", GoogleApiAvailabilityLight.a, "getRegularXAxisDataGetter", "regularXAxisDataGetter", "Lcom/huami/chart/data/YAxisData;", "Lcom/huami/sleep/statistic/helper/RegularYAxisDataGetter;", "e", "getRegularYAxisDataGetter", "regularYAxisDataGetter", "", "f", LogUtil.I, "wakeColor", "g", "intoSleepColor", "value", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "", "getLinColors", "()[Ljava/lang/Integer;", "linColors", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "getYAxisData", "setYAxisData", "yAxisData", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepRegularChartBuilder implements RegularChartBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<List<SleepRegularChartVo>> regularDataGetter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Float> regularWidthGetter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<SparseArray<XAxisData>> regularXAxisDataGetter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<SparseArray<YAxisData>> regularYAxisDataGetter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int wakeColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int intoSleepColor;

    /* JADX WARN: Multi-variable type inference failed */
    public SleepRegularChartBuilder(@NotNull Context context, @NotNull Function0<? extends List<SleepRegularChartVo>> function0, @NotNull Function0<Float> function1, @NotNull Function0<? extends SparseArray<XAxisData>> function2, @NotNull Function0<? extends SparseArray<YAxisData>> function3) {
        this.context = context;
        this.regularDataGetter = function0;
        this.regularWidthGetter = function1;
        this.regularXAxisDataGetter = function2;
        this.regularYAxisDataGetter = function3;
        this.wakeColor = ContextCompat.getColor(context, R.color.s34);
        this.intoSleepColor = ContextCompat.getColor(context, R.color.s25);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.huami.sleep.statistic.helper.RegularChartBuilder
    @NotNull
    public List<SleepRegularChartVo> getDataList() {
        return this.regularDataGetter.invoke();
    }

    @Override // com.huami.sleep.statistic.helper.RegularChartBuilder
    @NotNull
    public Integer[] getLinColors() {
        return new Integer[]{Integer.valueOf(this.wakeColor), Integer.valueOf(this.intoSleepColor)};
    }

    @NotNull
    public final Function0<List<SleepRegularChartVo>> getRegularDataGetter() {
        return this.regularDataGetter;
    }

    @NotNull
    public final Function0<Float> getRegularWidthGetter() {
        return this.regularWidthGetter;
    }

    @NotNull
    public final Function0<SparseArray<XAxisData>> getRegularXAxisDataGetter() {
        return this.regularXAxisDataGetter;
    }

    @NotNull
    public final Function0<SparseArray<YAxisData>> getRegularYAxisDataGetter() {
        return this.regularYAxisDataGetter;
    }

    @Override // com.huami.sleep.statistic.helper.RegularChartBuilder
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        return this.regularXAxisDataGetter.invoke();
    }

    @Override // com.huami.sleep.statistic.helper.RegularChartBuilder
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        return this.regularYAxisDataGetter.invoke();
    }

    @Override // com.huami.sleep.statistic.helper.RegularChartBuilder
    public void setDataList(@NotNull List<SleepRegularChartVo> list) {
    }

    @Override // com.huami.sleep.statistic.helper.RegularChartBuilder
    public void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray) {
    }

    @Override // com.huami.sleep.statistic.helper.RegularChartBuilder
    public void setYAxisData(@NotNull SparseArray<YAxisData> sparseArray) {
    }
}
