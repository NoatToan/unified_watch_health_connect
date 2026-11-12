package com.huami.heartrate.chart;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BackgroundStyle;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.InteractiveLineStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.style.constant.GoalLineStyleConstant;
import com.huami.chart.util.ChartUtil;
import com.huami.heartrate.R;
import com.huami.heartrate.chart.model.HRDayChartData;
import com.huami.heartrate.constant.ConstantKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0019\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010(\u001a\u00020$¢\u0006\u0004\bC\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0016¢\u0006\u0002\b\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0016¢\u0006\u0002\b\u0017J\u001f\u0010\u001e\u001a\u00020\u001d2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0016¢\u0006\u0002\b\u0017R\u0019\u0010#\u001a\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010(\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\u00020,8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u00102R\u0016\u00105\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u0016\u00107\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0016\u00109\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u0016\u0010;\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010.R\u0016\u0010=\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010.R\u001d\u0010@\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b-\u00102R\u001d\u0010B\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010?\u001a\u0004\b0\u00102¨\u0006E"}, d2 = {"Lcom/huami/heartrate/chart/BaseHRChartHelper;", "", "Lcom/huami/chart/provider/DrawConfig$Builder;", "b", "Lcom/huami/chart/style/LineStyle$Builder;", "c", "Lcom/huami/heartrate/chart/model/HRDayChartData;", "data", "Lcom/huami/chart/style/AxisStyle$Builder;", "a", "Lcom/huami/chart/style/NoDataStyle;", "createNoDataStyle", "Lcom/huami/chart/style/InteractiveLineStyle;", "createInteractiveLineStyle", "", "hasData", "", GoalLineStyleConstant.GOALS, "Lcom/huami/chart/style/GoalLineStyle;", "createGoalLineStyle", "Lcom/huami/chart/style/BackgroundStyle;", "createBackgroundStyle", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "append", "Lcom/huami/chart/style/AxisStyle;", "appendAxisStyle", "Lcom/huami/chart/style/LineStyle;", "appendLineStyle", "Lcom/huami/chart/provider/DrawConfig;", "appendDrawConfig", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/ViewGroup;", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "container", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "", GoogleApiAvailabilityLight.a, "F", "xLabelMarginTop", "e", "getMarginLeft", "()F", "marginLeft", "f", "marginRight", "g", "dataMarginTop", "h", "dataMarginBottom", "i", "barWidthDay", z.j, "zeroY", hl.k, "Lkotlin/Lazy;", "halfFirstXAxisWidth", "l", "halfLastXAxisWidth", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseHRChartHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ViewGroup container;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float xLabelMarginTop;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float marginLeft;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float marginRight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float dataMarginTop;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float dataMarginBottom;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float barWidthDay;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float zeroY;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Paint paint = new Paint();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy halfFirstXAxisWidth = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy halfLastXAxisWidth = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Float> {
        public a() {
            super(0);
        }

        public final float a() {
            Paint paint = BaseHRChartHelper.this.paint;
            paint.setTextSize(BaseHRChartHelper.this.getContext().getResources().getDimension(R.dimen.heart_rate_x_label_size));
            return paint.measureText(ConstantKt.getDAY_CHART_ARRAY()[0]) / 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Float> {
        public b() {
            super(0);
        }

        public final float a() {
            Paint paint = BaseHRChartHelper.this.paint;
            paint.setTextSize(BaseHRChartHelper.this.getContext().getResources().getDimension(R.dimen.heart_rate_x_label_size));
            return paint.measureText(ConstantKt.getDAY_CHART_ARRAY()[ArraysKt___ArraysKt.getLastIndex(ConstantKt.getDAY_CHART_ARRAY())]) / 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(a());
        }
    }

    public BaseHRChartHelper(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        this.context = context;
        this.container = viewGroup;
        this.xLabelMarginTop = ChartUtil.dp2px(context, 5.0f);
        this.marginLeft = ChartUtil.dp2px(context, 15.0f);
        this.marginRight = ChartUtil.dp2px(context, 35.0f);
        this.dataMarginTop = ChartUtil.dp2px(context, 15.0f);
        this.dataMarginBottom = ChartUtil.dp2px(context, 20.0f);
        this.barWidthDay = ChartUtil.dp2px(context, 6.0f);
        this.zeroY = ChartUtil.dp2px(context, 30.0f);
    }

    private final AxisStyle.Builder a(HRDayChartData data) {
        boolean z = data.getChartDataList().getCount() > 0;
        return new AxisStyle.Builder(this.context).setAxisStyle(z ? 16550 : 4).setZeroX(HRChartHelperKt.isRtl(this.container) ? this.marginLeft + e() : this.container.getWidth() - this.marginLeft).setZeroY(this.zeroY).setLabelCenter(true).setXLabelColor(Color.parseColor("#B2B2B2")).setXAxisLineColor(z ? 0 : Color.parseColor("#F2F2F2")).setXLabelSize(this.context.getResources().getDimension(R.dimen.heart_rate_x_label_size)).setXAxisData(data.getXData()).setYLabelColor(Color.parseColor("#b2b2b2")).setYAxisLineColor(0).setYLabelSize(this.context.getResources().getDimension(R.dimen.heart_rate_y_label_size)).setXLabelMarginTop(this.xLabelMarginTop).setXAxisMarginLeft(HRChartHelperKt.isRtl(this.container) ? this.marginRight : this.marginLeft).setXAxisMarginRight(HRChartHelperKt.isRtl(this.container) ? this.marginLeft : this.marginRight).setYAxisData(data.getYData()).setYAxisRight(!HRChartHelperKt.isRtl(this.container));
    }

    private final DrawConfig.Builder b() {
        float f;
        float fD;
        float f2;
        float fD2;
        Context context = this.container.getContext();
        int measuredWidth = this.container.getMeasuredWidth();
        int measuredHeight = this.container.getMeasuredHeight();
        if (measuredWidth == 0) {
            measuredWidth = context.getResources().getDisplayMetrics().widthPixels;
        }
        float f3 = this.barWidthDay;
        DrawConfig.Builder dataMarginTop = new DrawConfig.Builder(context).setCanvasHeight(measuredHeight).setCanvasWidth(measuredWidth).setDataMarginTop(this.dataMarginTop);
        if (HRChartHelperKt.isRtl(this.container)) {
            f = this.marginRight;
            fD = e();
        } else {
            f = this.marginLeft;
            fD = d();
        }
        DrawConfig.Builder dataMarginLeft = dataMarginTop.setDataMarginLeft(f + fD);
        if (HRChartHelperKt.isRtl(this.container)) {
            f2 = this.marginLeft;
            fD2 = e();
        } else {
            f2 = this.marginRight;
            fD2 = d();
        }
        return dataMarginLeft.setDataMarginRight(f2 + fD2).setDataMarginBottom(this.dataMarginBottom).setDataWidth(f3);
    }

    private final LineStyle.Builder c() {
        return new LineStyle.Builder(this.context).setLineStyle(4).setInteractiveSlide(false).setSinglePointSize(ChartUtil.dp2px(this.context, 3.0f)).setInteractiveUpCancel(true).setDisconnectLineGap(1).showGapPoint(true).setShadowBeforeIndex(false);
    }

    private final float d() {
        return ((Number) this.halfFirstXAxisWidth.getValue()).floatValue();
    }

    private final float e() {
        return ((Number) this.halfLastXAxisWidth.getValue()).floatValue();
    }

    @NotNull
    public final AxisStyle appendAxisStyle(@NotNull HRDayChartData data, @NotNull Function1<? super AxisStyle.Builder, ? extends AxisStyle.Builder> append) {
        return append.invoke(a(data)).create();
    }

    @NotNull
    public final DrawConfig appendDrawConfig(@NotNull Function1<? super DrawConfig.Builder, ? extends DrawConfig.Builder> append) {
        return append.invoke(b()).create();
    }

    @NotNull
    public final LineStyle appendLineStyle(@NotNull Function1<? super LineStyle.Builder, ? extends LineStyle.Builder> append) {
        return append.invoke(c()).create();
    }

    @NotNull
    public final BackgroundStyle createBackgroundStyle(@NotNull HRDayChartData data, boolean hasData) {
        return new BackgroundStyle.Builder(this.context).setBackgroundStyle(hasData ? 16 : 1).setAxisData(data.getXData()).setGridLineWidth(ChartUtil.dp2px(this.context, 0.3f)).setGridLineColor(ContextCompat.getColor(this.context, R.color.s4)).create();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    @NotNull
    public final GoalLineStyle createGoalLineStyle(boolean hasData, @Nullable float[] goals) {
        int i;
        float fDp2px = ChartUtil.dp2px(this.context, 3.0f);
        GoalLineStyle.Builder builder = new GoalLineStyle.Builder(this.context);
        if (!hasData || goals == null) {
            i = 1;
        } else {
            if (!(goals.length == 0)) {
                i = 2;
            } else {
                i = 1;
            }
        }
        return builder.setGoalLineStyle(i).setGoals(goals).setDashLineInterval(new float[]{fDp2px, fDp2px, fDp2px}).setGoalLineWidth(ChartUtil.dp2px(this.context, 1.0f)).setGoalLineColor(new int[]{ContextCompat.getColor(this.context, R.color.s3)}).setGoalLineMarginStart(this.marginLeft).setGoalLineMarginEnd(this.marginLeft).create();
    }

    @NotNull
    public final InteractiveLineStyle createInteractiveLineStyle() {
        return new InteractiveLineStyle.Builder(this.context).setInteractiveLineStyle(10).setVerticalLineColor(Color.parseColor("#B2B2B2")).setVerticalLineWidth(ChartUtil.dp2px(this.context, 1.0f)).setHorizontalLineColor(Color.parseColor("#B2B2B2")).setHorizontalLineWidth(ChartUtil.dp2px(this.context, 1.0f)).setIntersectionPointSize(ChartUtil.dp2px(this.context, 3.0f)).setIntersectionPointBorder(ChartUtil.dp2px(this.context, 1.0f)).setIntersectionPointColor(Color.parseColor("#FF5353")).create();
    }

    @NotNull
    public final NoDataStyle createNoDataStyle() {
        return new NoDataStyle.Builder(this.context).setNoDataStyle(2).setNoDataLabel(this.context.getString(R.string.heart_rate_no_data)).setNoDataLabelColor(Color.parseColor("#b2b2b2")).setNoDataLabelSize(this.context.getResources().getDimension(R.dimen.heart_rate_x_label_size)).create();
    }

    @NotNull
    public final ViewGroup getContainer() {
        return this.container;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final float getMarginLeft() {
        return this.marginLeft;
    }
}
