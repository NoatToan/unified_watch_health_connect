package com.huami.chart.helper;

import android.content.Context;
import android.util.SparseArray;
import androidx.core.graphics.ColorUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.chart.R;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.InteractiveLineStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.MultiLineStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.style.constant.GoalLineStyleConstant;
import com.huami.chart.util.HMGradientDrawableRectValue;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.bt.model.HMDeviceState;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\u001aU\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00028\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0002\b\u00032\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\u0013\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u001b\b\u0002\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0002\b\u0003H\u0007\u001a\u008b\u0001\u0010\u001e\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u001b\b\u0002\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0002\b\u0003H\u0007\u001aX\u0010#\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\u001b\b\u0002\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b#\u0010$\u001a]\u0010.\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0'2\u0006\u0010,\u001a\u00020\u000e2\u001b\b\u0002\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0002\b\u0003H\u0007\u001a1\u00102\u001a\u00020\t*\u00020\t2\u0006\u00100\u001a\u00020/2\u001b\b\u0002\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0002\b\u0003H\u0007\u001a\\\u0010;\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00104\u001a\u0002032\f\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00162\u001b\b\u0002\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0002\b\u0003¢\u0006\u0004\b;\u0010<\u001a7\u0010?\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010=\u001a\u0002062\u001b\b\u0002\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0002\b\u0003\u001a\u001a\u0010C\u001a\u00020\u0005*\u00020@2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e\u001a2\u0010I\u001a\u00020\u0005*\u00020@2\u0006\u0010D\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u000e\u001an\u0010Q\u001a\u00020\u0005*\u00020-2\b\b\u0002\u0010J\u001a\u00020\u000e2\b\b\u0002\u0010K\u001a\u00020\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0'2\u0006\u0010L\u001a\u00020\f2\u0006\u0010M\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\f2\u0006\u0010O\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e2\b\b\u0002\u0010P\u001a\u00020%H\u0007\u001a$\u0010T\u001a\u00020\u0005*\u00020-2\u0006\u0010R\u001a\u00020\f2\b\b\u0002\u0010S\u001a\u00020%2\u0006\u0010&\u001a\u00020%\u001a\u001a\u0010U\u001a\u00020\u0005*\u00020-2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020%\u001a&\u0010Y\u001a\b\u0012\u0004\u0012\u00020*0'2\u0006\u0010V\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\u000e2\b\b\u0002\u0010X\u001a\u00020\f\u001a\u0012\u0010Z\u001a\b\u0012\u0004\u0012\u00020*0'*\u000203H\u0002\"\u0019\u0010^\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u001d\u0010c\u001a\u0002038F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006d"}, d2 = {"B", "C", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "create", "", TransportUri.ACTION_BLOCK, "createConfig", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lcom/huami/chart/provider/RenderConfig$Builder;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "barStyle", "", "minHeight", "priority", "Lcom/huami/chart/style/BarStyle$Builder;", "addStyle", "barConfig", "lineStyle", "lineColor", "", "shadowColors", "gap", "pointRadius", "dataPointRadius", "dataPointBorderRadius", "dataPointBorderColor", "Lcom/huami/chart/style/LineStyle$Builder;", "lineConfig", "style", "interactivePointSize", "mainPointColor", "Lcom/huami/chart/style/InteractiveLineStyle$Builder;", "interactiveLineConfig", "(Lcom/huami/chart/provider/RenderConfig$Builder;Landroid/content/Context;IFLjava/lang/Integer;Lkotlin/jvm/functions/Function1;)Lcom/huami/chart/provider/RenderConfig$Builder;", "", "hasData", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "xAxisDatas", "Lcom/huami/chart/data/YAxisData;", "yAxisDatas", "yAxisXPosition", "Lcom/huami/chart/style/AxisStyle$Builder;", "axisConfig", "Lcom/huami/chart/helper/MultiLineConfig;", "config", "Lcom/huami/chart/style/MultiLineStyle$Builder;", "multiLineConfig", "", GoalLineStyleConstant.GOALS, "", "", "labels", "goalLineColors", "goalLabelColors", "Lcom/huami/chart/style/GoalLineStyle$Builder;", "goalLineConfig", "(Lcom/huami/chart/provider/RenderConfig$Builder;Landroid/content/Context;[F[Ljava/lang/String;[I[ILkotlin/jvm/functions/Function1;)Lcom/huami/chart/provider/RenderConfig$Builder;", "emptyDataLabel", "Lcom/huami/chart/style/NoDataStyle$Builder;", "emptyDataConfig", "Lcom/huami/chart/provider/DrawConfig$Builder;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "setCanvasWidthAndHeight", "left", "top", "right", "bottom", "dataWidth", "setDataBounds", "xAxisMarginLeft", "xAxisMarginRight", "xLabelColor", "xLabelSize", "yLabelColor", "yLabelSize", "yAlignRight", "baseStyle", "scaleColor", "isFullLine", "yLongScaleStyle", "movableXAxisStyle", "min", "max", "uniform", "buildYAxisData", "a", "F", "getDefaultCornerRadius", "()F", "defaultCornerRadius", "b", "Lkotlin/Lazy;", "getDefaultRadianRadius", "()[F", "defaultRadianRadius", "chart_release"}, k = 2, mv = {1, 5, 1})
public final class ChartBuildKt {
    private static final float a = HMChartHelperKt.getDpToPx(2.0f);

    @NotNull
    private static final Lazy b = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0014\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<float[]> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final float[] invoke() {
            return new float[]{ChartBuildKt.getDefaultCornerRadius(), ChartBuildKt.getDefaultCornerRadius(), ChartBuildKt.getDefaultCornerRadius(), ChartBuildKt.getDefaultCornerRadius(), ChartBuildKt.getDefaultCornerRadius(), ChartBuildKt.getDefaultCornerRadius(), ChartBuildKt.getDefaultCornerRadius(), ChartBuildKt.getDefaultCornerRadius()};
        }
    }

    private static final SparseArray<YAxisData> a(float[] fArr) {
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f = fArr[i];
            sparseArray.put(i2, new YAxisData(f, HMChartHelperKt.i18n((int) f)));
            arrayList.add(Unit.INSTANCE);
            i++;
            i2++;
        }
        return sparseArray;
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder axisConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, boolean z, @NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, float f) {
        return axisConfig$default(builder, context, z, sparseArray, sparseArray2, f, null, 32, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder axisConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, boolean z, @NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, float f, @Nullable Function1<? super AxisStyle.Builder, Unit> function1) {
        AxisStyle.Builder builder2 = new AxisStyle.Builder(context);
        baseStyle$default(builder2, 0.0f, 0.0f, sparseArray, sparseArray2, HMChartHelperKt.getResColor$default(context, R.color.s2, 0.0f, 4, null), HMChartHelperKt.getSpToPx(12), HMChartHelperKt.getResColor$default(context, R.color.s3, 0.0f, 4, null), HMChartHelperKt.getSpToPx(12), f, false, 515, null);
        yLongScaleStyle$default(builder2, HMChartHelperKt.getResColor$default(context, R.color.s4, 0.0f, 4, null), false, z, 2, null);
        movableXAxisStyle(builder2, context, z);
        builder2.setXLabelHighlightColor(HMChartHelperKt.getResColor$default(context, R.color.s1, 0.0f, 4, null));
        if (function1 != null) {
            function1.invoke(builder2);
        }
        Unit unit = Unit.INSTANCE;
        builder.setAxisStyle(builder2.create());
        return builder;
    }

    public static /* synthetic */ RenderConfig.Builder axisConfig$default(RenderConfig.Builder builder, Context context, boolean z, SparseArray sparseArray, SparseArray sparseArray2, float f, Function1 function1, int i, Object obj) {
        if ((i & 32) != 0) {
            function1 = null;
        }
        return axisConfig(builder, context, z, sparseArray, sparseArray2, f, function1);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder barConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context) {
        return barConfig$default(builder, context, 0, 0.0f, 0, null, 30, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder barConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i) {
        return barConfig$default(builder, context, i, 0.0f, 0, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder barConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, float f) {
        return barConfig$default(builder, context, i, f, 0, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder barConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, float f, int i2) {
        return barConfig$default(builder, context, i, f, i2, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder barConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, float f, int i2, @Nullable Function1<? super BarStyle.Builder, Unit> function1) {
        BarStyle.Builder builder2 = new BarStyle.Builder(context);
        builder2.setBarStyle(i);
        builder2.setFingerUpHighlightCancel(false);
        builder2.setSupportRadian(true);
        builder2.setRadianValues(getDefaultRadianRadius());
        builder2.setHighlightContrast(102);
        builder2.setHighlightBorderColor(HMChartHelperKt.getResColor$default(context, R.color.s38, 0.0f, 4, null));
        builder2.setHighlightBorderStrokeWidth(HMChartHelperKt.getDpToPx(2.0f));
        builder2.setMinHeight(f);
        builder2.setRenderPriority(i2);
        if (function1 != null) {
            function1.invoke(builder2);
        }
        Unit unit = Unit.INSTANCE;
        builder.setBarStyle(builder2.create());
        return builder;
    }

    public static /* synthetic */ RenderConfig.Builder barConfig$default(RenderConfig.Builder builder, Context context, int i, float f, int i2, Function1 function1, int i3, Object obj) {
        int i4 = (i3 & 2) != 0 ? 8 : i;
        if ((i3 & 4) != 0) {
            f = HMChartHelperKt.getDpToPx(3.0f);
        }
        float f2 = f;
        int i5 = (i3 & 8) != 0 ? 102 : i2;
        if ((i3 & 16) != 0) {
            function1 = null;
        }
        return barConfig(builder, context, i4, f2, i5, function1);
    }

    @JvmOverloads
    public static final void baseStyle(@NotNull AxisStyle.Builder builder, float f, float f2, @NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, int i, float f3, int i2, float f4, float f5) {
        baseStyle$default(builder, f, f2, sparseArray, sparseArray2, i, f3, i2, f4, f5, false, 512, null);
    }

    @JvmOverloads
    public static final void baseStyle(@NotNull AxisStyle.Builder builder, float f, float f2, @NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, int i, float f3, int i2, float f4, float f5, boolean z) {
        builder.setXAxisData(sparseArray);
        builder.setYAxisData(sparseArray2);
        builder.setXLabelMarginTop(HMChartHelperKt.getDpToPx(8));
        builder.setXAxisMarginLeft(f);
        builder.setXAxisMarginRight(f2);
        builder.setXLabelColor(i);
        builder.setXLabelSize(f3);
        builder.setYLabelColor(i2);
        builder.setYLabelSize(f4);
        builder.setYAxisRight(z);
        builder.setIndentHeadAndTail(true);
        builder.setZeroX(f5);
    }

    @JvmOverloads
    public static final void baseStyle(@NotNull AxisStyle.Builder builder, float f, @NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, int i, float f2, int i2, float f3, float f4) {
        baseStyle$default(builder, f, 0.0f, sparseArray, sparseArray2, i, f2, i2, f3, f4, false, 514, null);
    }

    @JvmOverloads
    public static final void baseStyle(@NotNull AxisStyle.Builder builder, @NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, int i, float f, int i2, float f2, float f3) {
        baseStyle$default(builder, 0.0f, 0.0f, sparseArray, sparseArray2, i, f, i2, f2, f3, false, 515, null);
    }

    public static /* synthetic */ void baseStyle$default(AxisStyle.Builder builder, float f, float f2, SparseArray sparseArray, SparseArray sparseArray2, int i, float f3, int i2, float f4, float f5, boolean z, int i3, Object obj) {
        baseStyle(builder, (i3 & 1) != 0 ? HMChartHelperKt.getDpToPx(14) : f, (i3 & 2) != 0 ? HMChartHelperKt.getDpToPx(45) : f2, sparseArray, sparseArray2, i, f3, i2, f4, f5, (i3 & 512) != 0 ? true : z);
    }

    @NotNull
    public static final SparseArray<YAxisData> buildYAxisData(float f, float f2, int i) {
        return a(HMChartHelperKt.buildYAxis(f, f2, i));
    }

    public static /* synthetic */ SparseArray buildYAxisData$default(float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 2;
        }
        return buildYAxisData(f, f2, i);
    }

    public static final <B, C> C createConfig(B b2, @NotNull Function1<? super B, ? extends C> function1, @NotNull Function1<? super B, Unit> function2) {
        function2.invoke(b2);
        return function1.invoke(b2);
    }

    @NotNull
    public static final RenderConfig.Builder emptyDataConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, @NotNull String str, @Nullable Function1<? super NoDataStyle.Builder, Unit> function1) {
        NoDataStyle.Builder builder2 = new NoDataStyle.Builder(context);
        builder2.setNoDataStyle(2);
        builder2.setNoDataLabel(str);
        builder2.setNoDataLabelColor(HMChartHelperKt.getResColor$default(context, R.color.s1, 0.0f, 4, null));
        builder2.setNoDataLabelSize(HMChartHelperKt.getDpToPx(14.0f));
        builder2.setLabelCenterInCanvas(true);
        if (function1 != null) {
            function1.invoke(builder2);
        }
        Unit unit = Unit.INSTANCE;
        builder.setNoDataStyle(builder2.create());
        return builder;
    }

    public static /* synthetic */ RenderConfig.Builder emptyDataConfig$default(RenderConfig.Builder builder, Context context, String str, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return emptyDataConfig(builder, context, str, function1);
    }

    public static final float getDefaultCornerRadius() {
        return a;
    }

    @NotNull
    public static final float[] getDefaultRadianRadius() {
        return (float[]) b.getValue();
    }

    @NotNull
    public static final RenderConfig.Builder goalLineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, @NotNull float[] fArr, @NotNull String[] strArr, @NotNull int[] iArr, @NotNull int[] iArr2, @Nullable Function1<? super GoalLineStyle.Builder, Unit> function1) {
        GoalLineStyle.Builder builder2 = new GoalLineStyle.Builder(context);
        builder2.setGoalLineStyle(10);
        builder2.setGoals(fArr);
        builder2.setGoalLineLabelPosition(GoalLineStyle.GoalLineLabelPosition.END);
        builder2.setGoalLineColor(iArr);
        builder2.setGoalLineLabelColors(iArr2);
        builder2.setGoalLineMarginStart(HMChartHelperKt.getDpToPx(14));
        builder2.setGoalLineMarginEnd(HMChartHelperKt.getDpToPx(45));
        builder2.setGoalLabelMarginStart(HMChartHelperKt.getDpToPx(4.0f));
        builder2.setGoalLabels(strArr);
        if (function1 != null) {
            function1.invoke(builder2);
        }
        Unit unit = Unit.INSTANCE;
        builder.setGoalLineStyle(builder2.create());
        return builder;
    }

    public static /* synthetic */ RenderConfig.Builder goalLineConfig$default(RenderConfig.Builder builder, Context context, float[] fArr, String[] strArr, int[] iArr, int[] iArr2, Function1 function1, int i, Object obj) {
        if ((i & 32) != 0) {
            function1 = null;
        }
        return goalLineConfig(builder, context, fArr, strArr, iArr, iArr2, function1);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder interactiveLineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context) {
        return interactiveLineConfig$default(builder, context, 0, 0.0f, null, null, 30, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder interactiveLineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i) {
        return interactiveLineConfig$default(builder, context, i, 0.0f, null, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder interactiveLineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, float f) {
        return interactiveLineConfig$default(builder, context, i, f, null, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder interactiveLineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, float f, @Nullable Integer num) {
        return interactiveLineConfig$default(builder, context, i, f, num, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder interactiveLineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, float f, @Nullable Integer num, @Nullable Function1<? super InteractiveLineStyle.Builder, Unit> function1) {
        InteractiveLineStyle.Builder builder2 = new InteractiveLineStyle.Builder(context);
        builder2.setInteractiveLineStyle(i);
        builder2.setVerticalLineColor(HMChartHelperKt.getResColor$default(context, R.color.s3, 0.0f, 4, null));
        builder2.setInteractiveUpCancel(false);
        builder2.setShowVerticalLineOnlyInRange(true);
        builder2.setVerticalLineWidth(HMChartHelperKt.getDpToPx(1.0f));
        if (f > 0.0f) {
            builder2.setIntersectionPointSize(f);
            builder2.setIntersectionPointBorder(HMChartHelperKt.getDpToPx(2.0f));
            builder2.setIntersectionPointBorderColor(HMChartHelperKt.getResColor$default(context, R.color.s5, 0.0f, 4, null));
        }
        if (num != null) {
            builder2.setIntersectionPointColor(num.intValue());
        }
        builder2.setPointShadowLayer(5.0f, 0.0f, 0.0f, ColorUtils.setAlphaComponent(-16777216, 51));
        if (function1 != null) {
            function1.invoke(builder2);
        }
        Unit unit = Unit.INSTANCE;
        builder.setInteractiveLineStyle(builder2.create());
        return builder;
    }

    public static /* synthetic */ RenderConfig.Builder interactiveLineConfig$default(RenderConfig.Builder builder, Context context, int i, float f, Integer num, Function1 function1, int i2, Object obj) {
        return interactiveLineConfig(builder, context, (i2 & 2) != 0 ? 16 : i, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : function1);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder lineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i) {
        return lineConfig$default(builder, context, 0, i, null, 0, 0.0f, 0.0f, 0.0f, 0, 0, null, 2042, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder lineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2) {
        return lineConfig$default(builder, context, i, i2, null, 0, 0.0f, 0.0f, 0.0f, 0, 0, null, 2040, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder lineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2, @Nullable int[] iArr) {
        return lineConfig$default(builder, context, i, i2, iArr, 0, 0.0f, 0.0f, 0.0f, 0, 0, null, 2032, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder lineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2, @Nullable int[] iArr, int i3) {
        return lineConfig$default(builder, context, i, i2, iArr, i3, 0.0f, 0.0f, 0.0f, 0, 0, null, 2016, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder lineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2, @Nullable int[] iArr, int i3, float f) {
        return lineConfig$default(builder, context, i, i2, iArr, i3, f, 0.0f, 0.0f, 0, 0, null, 1984, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder lineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2, @Nullable int[] iArr, int i3, float f, float f2) {
        return lineConfig$default(builder, context, i, i2, iArr, i3, f, f2, 0.0f, 0, 0, null, 1920, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder lineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2, @Nullable int[] iArr, int i3, float f, float f2, float f3) {
        return lineConfig$default(builder, context, i, i2, iArr, i3, f, f2, f3, 0, 0, null, HMDeviceState.DEVICE_STATE_SELFTEST, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder lineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2, @Nullable int[] iArr, int i3, float f, float f2, float f3, int i4) {
        return lineConfig$default(builder, context, i, i2, iArr, i3, f, f2, f3, i4, 0, null, 1536, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder lineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2, @Nullable int[] iArr, int i3, float f, float f2, float f3, int i4, int i5) {
        return lineConfig$default(builder, context, i, i2, iArr, i3, f, f2, f3, i4, i5, null, 1024, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder lineConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2, @Nullable int[] iArr, int i3, float f, float f2, float f3, int i4, int i5, @Nullable Function1<? super LineStyle.Builder, Unit> function1) {
        LineStyle.Builder builder2 = new LineStyle.Builder(context);
        builder2.setLineStyle(i);
        builder2.setLineColor(i2);
        builder2.setLineWidth(HMChartHelperKt.getDpToPx(1.5f));
        builder2.setFadingInAndOut(true);
        if (iArr != null) {
            builder2.setShadowColors(iArr);
        }
        builder2.setSinglePointSize(f);
        if (i3 > 0) {
            builder2.setDisconnectLineGap(i3);
            builder2.showGapPoint(true);
            builder2.setGapPointSize((int) f);
        }
        builder2.setDataPointRadius(f2);
        builder2.setDataPointBorderRadius(f3);
        builder2.setDataPointBorderColor(i4);
        builder2.setRenderPriority(i5);
        if (function1 != null) {
            function1.invoke(builder2);
        }
        Unit unit = Unit.INSTANCE;
        builder.setLineStyle(builder2.create());
        return builder;
    }

    public static /* synthetic */ RenderConfig.Builder lineConfig$default(RenderConfig.Builder builder, Context context, int i, int i2, int[] iArr, int i3, float f, float f2, float f3, int i4, int i5, Function1 function1, int i6, Object obj) {
        return lineConfig(builder, context, (i6 & 2) != 0 ? 4 : i, i2, (i6 & 8) != 0 ? null : iArr, (i6 & 16) != 0 ? 0 : i3, (i6 & 32) != 0 ? HMChartHelperKt.getDpToPx(2.0f) : f, (i6 & 64) != 0 ? HMChartHelperKt.getDpToPx(2.0f) : f2, (i6 & 128) != 0 ? HMChartHelperKt.getDpToPx(2.5f) : f3, (i6 & 256) != 0 ? HMChartHelperKt.getResColor$default(context, R.color.s38, 0.0f, 4, null) : i4, (i6 & 512) != 0 ? 101 : i5, (i6 & 1024) != 0 ? null : function1);
    }

    public static final void movableXAxisStyle(@NotNull AxisStyle.Builder builder, @NotNull Context context, boolean z) {
        builder.setXLabelSupportAnimation(z);
        builder.setBottomIndicatorShape(z ? 10 : 8);
        builder.setBottomIndicatorCircleRadius(HMChartHelperKt.getDpToPx(10.0f));
        builder.setXLabelMarginTop(HMChartHelperKt.getDpToPx(4.0f));
        builder.setXMovableLabelMarginTop(HMChartHelperKt.getDpToPx(17.0f));
        builder.setBottomIndicatorTintColor(HMChartHelperKt.getResColor$default(context, R.color.s39, 0.0f, 4, null));
        builder.setBottomIndicatorShapeMarginTop(HMChartHelperKt.getDpToPx(3.0f));
        builder.setBottomIndicatorBackgroundColor(HMChartHelperKt.getResColor$default(context, R.color.s10, 0.0f, 4, null));
        builder.setBottomIndicatorShadow();
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder multiLineConfig(@NotNull RenderConfig.Builder builder, @NotNull MultiLineConfig multiLineConfig) {
        return multiLineConfig$default(builder, multiLineConfig, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder multiLineConfig(@NotNull RenderConfig.Builder builder, @NotNull MultiLineConfig multiLineConfig, @Nullable Function1<? super MultiLineStyle.Builder, Unit> function1) {
        Context context = multiLineConfig.getContext();
        int lineStyle = multiLineConfig.getLineStyle();
        int[] lineColors = multiLineConfig.getLineColors();
        boolean showInteractiveLine = multiLineConfig.getShowInteractiveLine();
        int[][] shadowColors = multiLineConfig.getShadowColors();
        HMGradientDrawableRectValue[] shadowRectValues = multiLineConfig.getShadowRectValues();
        float pointRadius = multiLineConfig.getPointRadius();
        float dataPointRadius = multiLineConfig.getDataPointRadius();
        float dataPointBorderRadius = multiLineConfig.getDataPointBorderRadius();
        int dataPointBorderColor = multiLineConfig.getDataPointBorderColor();
        int gap = multiLineConfig.getGap();
        int priority = multiLineConfig.getPriority();
        MultiLineStyle.Builder builder2 = new MultiLineStyle.Builder(context);
        builder2.setLineColors(lineColors);
        builder2.setLineWidth(HMChartHelperKt.getDpToPx(1.5f));
        builder2.setLineStyle(lineStyle);
        if (shadowColors != null) {
            builder2.setShadowColors((int[][]) Arrays.copyOf(shadowColors, shadowColors.length));
        }
        builder2.setSinglePointSize(pointRadius);
        builder2.setFadingInAndOut(true);
        builder2.setGradientDrawableRectValues(shadowRectValues);
        if (gap > 0) {
            builder2.setDisconnectLineGap(gap);
            builder2.showGapPoint(true);
            builder2.setGapPointSize(pointRadius);
        }
        if (showInteractiveLine) {
            builder2.setInteractiveType(2);
            builder2.setInteractiveUpCancel(false);
            builder2.setInteractiveLineColor(HMChartHelperKt.getResColor$default(context, R.color.s3, 0.0f, 4, null));
            builder2.setInteractiveLineWidth(HMChartHelperKt.getDpToPx(1.0f));
        }
        builder2.setDataPointRadius(dataPointRadius);
        builder2.setDataPointBorderRadius(dataPointBorderRadius);
        builder2.setDataPointBorderColor(dataPointBorderColor);
        builder2.setRenderPriority(priority);
        if (function1 != null) {
            function1.invoke(builder2);
        }
        Unit unit = Unit.INSTANCE;
        builder.setMultiLineStyle(builder2.create());
        return builder;
    }

    public static /* synthetic */ RenderConfig.Builder multiLineConfig$default(RenderConfig.Builder builder, MultiLineConfig multiLineConfig, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return multiLineConfig(builder, multiLineConfig, function1);
    }

    public static final void setCanvasWidthAndHeight(@NotNull DrawConfig.Builder builder, float f, float f2) {
        builder.setCanvasWidth(f);
        builder.setCanvasHeight(f2);
    }

    public static final void setDataBounds(@NotNull DrawConfig.Builder builder, float f, float f2, float f3, float f4, float f5) {
        float f6 = f5 / 2;
        builder.setDataMarginLeft(f + f6);
        builder.setDataMarginTop(f2);
        builder.setDataMarginRight(f3 + f6);
        builder.setDataMarginBottom(f4);
        builder.setDataWidth(f5);
    }

    public static final void yLongScaleStyle(@NotNull AxisStyle.Builder builder, int i, boolean z, boolean z2) {
        builder.setAxisStyle(z2 ? (z ? 16384 : 32768) | 32 | 128 : 32);
        builder.setYAxisScaleLineColor(i);
        builder.setYAxisScaleLineHeight(HMChartHelperKt.getDpToPx(1.0f));
    }

    public static /* synthetic */ void yLongScaleStyle$default(AxisStyle.Builder builder, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        yLongScaleStyle(builder, i, z, z2);
    }
}
