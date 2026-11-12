package com.huami.chart.helper;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.IChartProvider;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.util.Index;
import com.huami.tools.analytics.DbUtils;
import defpackage.ec4;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u001f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r\u0012,\u0010/\u001a(\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+0&¢\u0006\u0002\b,¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R<\u0010/\u001a(\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020+0&¢\u0006\u0002\b,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/huami/chart/helper/CommonChartProvider;", "Lcom/huami/chart/chart/IChartProvider;", "Landroid/view/ViewGroup;", "getChartContainer", "Lcom/huami/chart/data/ChartDataList;", "getChartDataList", "", "getMultiChartDataList", "()[Lcom/huami/chart/data/ChartDataList;", "Lcom/huami/chart/provider/DrawConfig;", "getDrawConfig", "Lcom/huami/chart/provider/RenderConfig;", "getRenderConfig", "Lcom/huami/chart/util/Index;", "getCurrentIndex", "", "refreshingAnim", "preAnim", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Landroid/view/ViewGroup;", "chartContainerViewGroup", "c", "Lcom/huami/chart/data/ChartDataList;", "dataList", GoogleApiAvailabilityLight.a, "[Lcom/huami/chart/data/ChartDataList;", "multiList", "Lcom/huami/chart/helper/DataConfig;", "e", "Lcom/huami/chart/helper/DataConfig;", "dataConfig", "f", "Lcom/huami/chart/util/Index;", "defaultIndex", "Lkotlin/Function2;", "Lcom/huami/chart/provider/RenderConfig$Builder;", "Lkotlin/ParameterName;", "name", "hasData", "", "Lkotlin/ExtensionFunctionType;", "g", "Lkotlin/jvm/functions/Function2;", "renderConfig", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/huami/chart/data/ChartDataList;[Lcom/huami/chart/data/ChartDataList;Lcom/huami/chart/helper/DataConfig;Lcom/huami/chart/util/Index;Lkotlin/jvm/functions/Function2;)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class CommonChartProvider implements IChartProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ViewGroup chartContainerViewGroup;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ChartDataList dataList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final ChartDataList[] multiList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final DataConfig dataConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Index defaultIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function2<RenderConfig.Builder, Boolean, Unit> renderConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonChartProvider(@NotNull Context context, @NotNull ViewGroup viewGroup, @NotNull ChartDataList chartDataList, @Nullable ChartDataList[] chartDataListArr, @NotNull DataConfig dataConfig, @Nullable Index index, @NotNull Function2<? super RenderConfig.Builder, ? super Boolean, Unit> function2) {
        this.context = context;
        this.chartContainerViewGroup = viewGroup;
        this.dataList = chartDataList;
        this.multiList = chartDataListArr;
        this.dataConfig = dataConfig;
        this.defaultIndex = index;
        this.renderConfig = function2;
    }

    @Override // com.huami.chart.chart.IChartProvider
    @NotNull
    /* JADX INFO: renamed from: getChartContainer, reason: from getter */
    public ViewGroup getChartContainerViewGroup() {
        return this.chartContainerViewGroup;
    }

    @Override // com.huami.chart.chart.IChartProvider
    @NotNull
    /* JADX INFO: renamed from: getChartDataList, reason: from getter */
    public ChartDataList getDataList() {
        return this.dataList;
    }

    @Override // com.huami.chart.chart.IChartProvider
    @NotNull
    public Index getCurrentIndex() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Index index = this.defaultIndex;
            if (index == null) {
                index = getDataList().getCount() > 0 ? new Index(getDataList().getCount() - 1, getDataList().getLastData().getBaseIndex()) : Index.INVALID_INDEX;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(index);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        Index index2 = Index.INVALID_INDEX;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = index2;
        }
        return (Index) objM3845constructorimpl;
    }

    @Override // com.huami.chart.chart.IChartProvider
    @NotNull
    public DrawConfig getDrawConfig() {
        DrawConfig.Builder builder = new DrawConfig.Builder(this.context);
        ChartBuildKt.setCanvasWidthAndHeight(builder, getChartContainerViewGroup().getMeasuredWidth(), getChartContainerViewGroup().getMeasuredHeight());
        DataConfig dataConfig = this.dataConfig;
        float f = dataConfig.getCom.facebook.appevents.internal.ViewHierarchyConstants.DIMENSION_WIDTH_KEY java.lang.String();
        DataConfig.MarginF rectF = dataConfig.getRectF();
        ChartBuildKt.setDataBounds(builder, rectF.getLeft(), rectF.getTop(), rectF.getRight(), rectF.getBottom(), f);
        return builder.create();
    }

    @Override // com.huami.chart.chart.IChartProvider
    @Nullable
    /* JADX INFO: renamed from: getMultiChartDataList, reason: from getter */
    public ChartDataList[] getMultiList() {
        return this.multiList;
    }

    @Override // com.huami.chart.chart.IChartProvider
    public /* synthetic */ ChartDataList[] getPointChartDataList() {
        return ec4.b(this);
    }

    @Override // com.huami.chart.chart.IChartProvider
    @NotNull
    public RenderConfig getRenderConfig() {
        RenderConfig.Builder builder = new RenderConfig.Builder();
        this.renderConfig.invoke(builder, Boolean.valueOf(getDataList().getCount() > 0));
        return builder.create();
    }

    @Override // com.huami.chart.chart.IChartProvider
    public boolean preAnim() {
        return false;
    }

    @Override // com.huami.chart.chart.IChartProvider
    public boolean refreshingAnim() {
        return false;
    }

    public /* synthetic */ CommonChartProvider(Context context, ViewGroup viewGroup, ChartDataList chartDataList, ChartDataList[] chartDataListArr, DataConfig dataConfig, Index index, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewGroup, chartDataList, (i & 8) != 0 ? null : chartDataListArr, (i & 16) != 0 ? new DataConfig(HMChartHelperKt.getDpToPx(8.0f), null, 2, null) : dataConfig, (i & 32) != 0 ? null : index, function2);
    }
}
