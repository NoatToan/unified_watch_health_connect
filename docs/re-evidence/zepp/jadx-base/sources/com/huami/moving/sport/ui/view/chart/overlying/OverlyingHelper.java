package com.huami.moving.sport.ui.view.chart.overlying;

import android.content.Context;
import android.util.SparseArray;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.view.chart.dataprovider.AltiType;
import com.huami.moving.sport.ui.view.chart.dataprovider.BaseType;
import com.huami.moving.sport.ui.view.chart.dataprovider.BoatingFreType;
import com.huami.moving.sport.ui.view.chart.dataprovider.CadenceType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfAngleType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfBeatType;
import com.huami.moving.sport.ui.view.chart.dataprovider.GolfUpDownTimeType;
import com.huami.moving.sport.ui.view.chart.dataprovider.HeartType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PaceType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PowerMeterType;
import com.huami.moving.sport.ui.view.chart.dataprovider.PressureType;
import com.huami.moving.sport.ui.view.chart.dataprovider.RopeSkipingFreqType;
import com.huami.moving.sport.ui.view.chart.dataprovider.SpeedType;
import com.huami.moving.sport.ui.view.chart.dataprovider.Spo2Type;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepFreqType;
import com.huami.moving.sport.ui.view.chart.dataprovider.StepType;
import com.huami.moving.sport.ui.view.chart.dataprovider.StrokeSpeedType;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/moving/sport/ui/view/chart/overlying/OverlyingHelper;", "", "<init>", "()V", "Companion", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class OverlyingHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArrayList<Triple<BaseType, ChartDataList, SparseArray<YAxisData>>> a = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0016RY\u0010\u001e\u001aB\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001c0\u001bj \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001c`\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/huami/moving/sport/ui/view/chart/overlying/OverlyingHelper$Companion;", "", "Lcom/huami/moving/sport/ui/view/chart/dataprovider/BaseType;", "type", "Lcom/huami/chart/data/ChartDataList;", "list", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "yAxisDatas", "", "addTypeChartList", "clearChartsTypeList", "", "isPointStyleType", "isBaseChartMultiLineStyleType", "unSupportInteractiveType", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "alphaValue", "", "baseChartOtherMultilineColors", "", "getColorByType", "alpha", "baseColor", "getColorWithAlpha", "Ljava/util/ArrayList;", "Lkotlin/Triple;", "Lkotlin/collections/ArrayList;", "chartsTypeList", "Ljava/util/ArrayList;", "getChartsTypeList", "()Ljava/util/ArrayList;", "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addTypeChartList(@NotNull BaseType type, @NotNull ChartDataList list, @NotNull SparseArray<YAxisData> yAxisDatas) {
            getChartsTypeList().add(new Triple<>(type, list, yAxisDatas));
        }

        @NotNull
        public final int[] baseChartOtherMultilineColors(@NotNull BaseType type, @NotNull Context context, float alphaValue) {
            return type instanceof GolfUpDownTimeType ? new int[]{getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.s15))} : new int[]{context.getResources().getColor(R.color.s43)};
        }

        public final void clearChartsTypeList() {
            getChartsTypeList().clear();
        }

        @NotNull
        public final ArrayList<Triple<BaseType, ChartDataList, SparseArray<YAxisData>>> getChartsTypeList() {
            return OverlyingHelper.a;
        }

        public final int getColorByType(@NotNull BaseType type, @NotNull Context context, float alphaValue) {
            if (type instanceof StepType) {
                return getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.s19));
            }
            if (type instanceof StepFreqType) {
                return getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.s21));
            }
            if (type instanceof RopeSkipingFreqType ? true : type instanceof BoatingFreType) {
                return getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.s20));
            }
            if (type instanceof HeartType ? true : type instanceof Spo2Type) {
                return getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.p3));
            }
            if (type instanceof PaceType ? true : type instanceof SpeedType) {
                return getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.s15));
            }
            if (type instanceof AltiType ? true : type instanceof StrokeSpeedType) {
                return getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.s33));
            }
            if (type instanceof PressureType) {
                return getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.s20));
            }
            if (type instanceof GolfBeatType) {
                return getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.s33));
            }
            if (type instanceof GolfAngleType) {
                return getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.s20));
            }
            if (type instanceof GolfUpDownTimeType) {
                return getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.p3));
            }
            return type instanceof PowerMeterType ? getColorWithAlpha(alphaValue, context.getResources().getColor(R.color.s25)) : context.getResources().getColor(R.color.s1);
        }

        public final int getColorWithAlpha(float alpha, int baseColor) {
            return (e.coerceAtMost(255, e.coerceAtLeast(0, (int) (alpha * 255))) << 24) + (baseColor & 16777215);
        }

        public final boolean isBaseChartMultiLineStyleType(@NotNull BaseType type) {
            return type instanceof GolfUpDownTimeType;
        }

        public final boolean isPointStyleType(@NotNull BaseType type) {
            if (type instanceof StepType ? true : type instanceof StepFreqType ? true : type instanceof RopeSkipingFreqType ? true : type instanceof BoatingFreType ? true : type instanceof CadenceType) {
                return true;
            }
            return type instanceof Spo2Type;
        }

        public final boolean unSupportInteractiveType(@NotNull BaseType type) {
            if (type instanceof GolfBeatType ? true : type instanceof GolfUpDownTimeType) {
                return true;
            }
            return type instanceof GolfAngleType;
        }
    }
}
