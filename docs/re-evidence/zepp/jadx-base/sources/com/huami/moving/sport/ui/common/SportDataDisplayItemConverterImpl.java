package com.huami.moving.sport.ui.common;

import android.content.Context;
import android.content.res.Resources;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.moving.config.DataItem;
import com.huami.moving.datacenter.SportDataItem;
import com.huami.moving.datacenter.SportType;
import com.huami.moving.sport.ui.R;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.RunnerPeripheralInfo;
import com.huami.moving.utils.ext.TrackrecordKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b \u0018\u0000 *2\u00020\u0001:\u0001\u000fB)\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u00105\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b6\u00107J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010 \u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u0003*\u00020\n8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020\u0003*\u00020\n8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\"R\u001a\u0010'\u001a\u00020\u0007*\u00020\n8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001c\u0010)\u001a\u0004\u0018\u00010\u0003*\u00020\n8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u001a\u0010,\u001a\u00020\u0018*\u00020\n8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\u00020\u0003*\u00020\n8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\"R\u001a\u00100\u001a\u00020\u0002*\u00020\n8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010/R\u0016\u00102\u001a\u00020\u00188B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001bR\u001a\u00104\u001a\u00020\u0003*\u00020\n8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\"¨\u00068"}, d2 = {"Lcom/huami/moving/sport/ui/common/SportDataDisplayItemConverterImpl;", "Lcom/huami/moving/sport/ui/common/SportDataDisplayItemConverter;", "", "", "o", com.google.android.exoplayer2.text.ttml.b.r, "value", "", GoogleApiAvailabilityLight.b, "", "Lcom/huami/moving/datacenter/SportDataItem;", "item", "Lcom/huami/moving/sport/ui/common/SportDataDisplayItem;", "convert", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Z", "useMetric", "c", "Ljava/lang/String;", "defaultDisplay", "", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()I", "compatibleType", "e", "m", "()Z", "isSwimmingSports", z.j, "(Lcom/huami/moving/datacenter/SportDataItem;)Ljava/lang/String;", "_title", "_display", "l", "(Lcom/huami/moving/datacenter/SportDataItem;)Z", "_verify", hl.k, "_unit", "f", "(Lcom/huami/moving/datacenter/SportDataItem;)I", "_distanceUnit", "g", "_distanceValue", "(Lcom/huami/moving/datacenter/SportDataItem;)D", "kDistance", "h", "_paceUnit", "i", "_paceValue", "sportType", "<init>", "(Landroid/content/Context;ZILjava/lang/String;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SportDataDisplayItemConverterImpl implements SportDataDisplayItemConverter {

    @Deprecated
    public static final int MIN_SP_O2 = 80;

    @NotNull
    private static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean useMetric;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String defaultDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy compatibleType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy isSwimmingSports;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/moving/sport/ui/common/SportDataDisplayItemConverterImpl$a", "", "", "MIN_SP_O2", LogUtil.I, "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return TrackrecordKt.getSportType(this.a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Boolean> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new SportType[]{SportType.SwimmingPool.INSTANCE, SportType.OpenWaterSwimming.INSTANCE});
            SportDataDisplayItemConverterImpl sportDataDisplayItemConverterImpl = SportDataDisplayItemConverterImpl.this;
            if ((listListOf instanceof Collection) && listListOf.isEmpty()) {
                return false;
            }
            Iterator it2 = listListOf.iterator();
            while (it2.hasNext()) {
                if (((SportType) it2.next()).getType() == sportDataDisplayItemConverterImpl.c()) {
                    return true;
                }
            }
            return false;
        }
    }

    public SportDataDisplayItemConverterImpl(@NotNull Context context, boolean z, int i, @NotNull String str) {
        this.context = context;
        this.useMetric = z;
        this.defaultDisplay = str;
        this.compatibleType = LazyKt__LazyJVMKt.lazy(new b(i));
        this.isSwimmingSports = LazyKt__LazyJVMKt.lazy(new c());
    }

    private static final String a(double d) {
        if (d <= 0.0d) {
            return NumberFormatter.formatDouble2String(0.0d, 2, new int[0]);
        }
        if (d < 100.0d) {
            return NumberFormatter.formatDouble2String(d, 2, new int[0]);
        }
        if (d < 1000.0d) {
            return NumberFormatter.formatDouble2String(d, 1, new int[0]);
        }
        return d < 10000.0d ? NumberFormatter.formatDouble2String(d, 0, new int[0]) : String.valueOf((int) d);
    }

    private static final double b(double d, SportDataDisplayItemConverterImpl sportDataDisplayItemConverterImpl) {
        return sportDataDisplayItemConverterImpl.c() == SportType.SwimmingPool.INSTANCE.getType() ? d : d / 1.609344d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c() {
        return ((Number) this.compatibleType.getValue()).intValue();
    }

    private final double d(SportDataItem sportDataItem) {
        double d;
        float f2;
        Double value = sportDataItem.getValue();
        if (value == null) {
            return 0.0d;
        }
        double dDoubleValue = value.doubleValue();
        if (!this.useMetric) {
            if (c() == SportType.SwimmingPool.INSTANCE.getType()) {
                f2 = 1760.0f;
            } else {
                d = 1609.344d;
            }
            return NumberFormatter.format(dDoubleValue / d, 2, new int[0]);
        }
        f2 = 1000.0f;
        d = f2;
        return NumberFormatter.format(dDoubleValue / d, 2, new int[0]);
    }

    private final String e(SportDataItem sportDataItem) {
        String strO;
        Double value = sportDataItem.getValue();
        if (value == null) {
            strO = null;
        } else {
            double dDoubleValue = value.doubleValue();
            DataItem item = sportDataItem.getItem();
            if (Intrinsics.areEqual(item, DataItem.Distance.INSTANCE)) {
                strO = g(sportDataItem);
            } else if (Intrinsics.areEqual(item, DataItem.DownhillDistance.INSTANCE)) {
                strO = DataFormatter.parseRawKilometerToFormatKilometer(RunDataConversion.convertMeterToKmOrMile((float) dDoubleValue, this.useMetric));
            } else {
                if (Intrinsics.areEqual(item, DataItem.DownhillDropMax.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.DownhillDropTotal.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.UpstairsHeight.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.DownstairsHeight.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.HighestAltitude.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.LowestAltitude.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AverageAltitude.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalClimb.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalUp.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalDown.INSTANCE)) {
                    strO = RunDataConversion.parseAltitude((float) dDoubleValue, this.useMetric);
                } else {
                    if (Intrinsics.areEqual(item, DataItem.TotalTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.ExerciseTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.PauseTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalRestTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.SwimmingTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.CyclingTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.RunningTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.SwitchTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.SubItemTime.INSTANCE)) {
                        strO = DataFormatter.getConsumeTime((long) dDoubleValue);
                    } else if (Intrinsics.areEqual(item, DataItem.SwimStyle.INSTANCE)) {
                        strO = p(dDoubleValue);
                    } else if (Intrinsics.areEqual(item, DataItem.AverageStrokeDistance.INSTANCE)) {
                        if (!this.useMetric) {
                            dDoubleValue = RunDataConversion.convertMeterToYard((float) dDoubleValue);
                        }
                        strO = NumberFormatter.formatDouble2StringByLocale(dDoubleValue, 2, new int[0]);
                    } else {
                        if (Intrinsics.areEqual(item, DataItem.AveragePace.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.BestPace.INSTANCE)) {
                            strO = i(sportDataItem);
                        } else {
                            if (Intrinsics.areEqual(item, DataItem.AverageSpeed.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxSpeed.INSTANCE)) {
                                if (!this.useMetric) {
                                    dDoubleValue /= 1.609344d;
                                }
                                strO = NumberFormatter.formatDouble2StringByLocale(dDoubleValue, 2, 4);
                            } else if (Intrinsics.areEqual(item, DataItem.AverageStride.INSTANCE)) {
                                strO = RunDataConversion.parseStrideLength((float) dDoubleValue, this.useMetric);
                            } else {
                                DataItem.AveragePullingTime averagePullingTime = DataItem.AveragePullingTime.INSTANCE;
                                if (Intrinsics.areEqual(item, averagePullingTime) ? true : Intrinsics.areEqual(item, DataItem.AveragePaddleTime.INSTANCE)) {
                                    strO = NumberFormatter.formatDouble2StringByLocale(dDoubleValue, 1, 4);
                                } else {
                                    if (Intrinsics.areEqual(item, DataItem.AverageTemperature.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxTemperature.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MinTemperature.INSTANCE) ? true : Intrinsics.areEqual(item, averagePullingTime) ? true : Intrinsics.areEqual(item, DataItem.AveragePaddleTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AerobicTE.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AnaerobicTE.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.GolfAvgBeat.INSTANCE)) {
                                        strO = NumberFormatter.formatDouble2StringByLocale(dDoubleValue, 1, new int[0]);
                                    } else {
                                        if (Intrinsics.areEqual(item, DataItem.GolfAvgDownTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.GolfAvgUpTime.INSTANCE)) {
                                            strO = NumberFormatter.formatDouble2StringByLocale(dDoubleValue, 2, new int[0]);
                                        } else {
                                            if (Intrinsics.areEqual(item, DataItem.MaxSpO2.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MinSpO2.INSTANCE)) {
                                                int i = (int) dDoubleValue;
                                                strO = i < 80 ? "<80" : String.valueOf(i);
                                            } else {
                                                strO = o(dDoubleValue);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return strO == null ? this.defaultDisplay : strO;
    }

    private final int f(SportDataItem sportDataItem) {
        if (!m() || d(sportDataItem) >= 10.0d) {
            return this.useMetric ? R.string.running_kilometers : R.string.running_miles;
        }
        return this.useMetric ? R.string.unit_m : R.string.unit_yard;
    }

    private final String g(SportDataItem sportDataItem) {
        double d = d(sportDataItem);
        if (!m() || d >= 10.0d) {
            return a(d);
        }
        if (this.useMetric) {
            Double value = sportDataItem.getValue();
            return NumberFormatter.formatDouble2String(value != null ? value.doubleValue() : 0.0d, 0, new int[0]);
        }
        Double value2 = sportDataItem.getValue();
        return NumberFormatter.formatDouble2String(value2 != null ? b(value2.doubleValue(), this) : 0.0d, 0, new int[0]);
    }

    private final int h() {
        if (m() && this.useMetric) {
            return R.string.sport_data_unit_pace_hundred_m;
        }
        if (m()) {
            return R.string.sport_data_unit_pace_hundred_yd;
        }
        return this.useMetric ? R.string.sport_data_unit_pace_km : R.string.sport_data_unit_pace_mile;
    }

    private final String i(SportDataItem sportDataItem) {
        Number value = sportDataItem.getValue();
        if (value == null) {
            value = 0;
        }
        float fFloatValue = value.floatValue();
        return m() ? DataFormatter.getFormatPaceAndUnit(fFloatValue, c(), this.useMetric)[0] : DataFormatter.formatTimeInSportFormForPace((long) RunDataConversion.paceMultiplyKilo(fFloatValue, this.useMetric));
    }

    private final String j(SportDataItem sportDataItem) {
        Integer numValueOf;
        DataItem item = sportDataItem.getItem();
        if (Intrinsics.areEqual(item, DataItem.Distance.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.segment_distance);
        } else if (Intrinsics.areEqual(item, DataItem.TotalJumps.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_total_count);
        } else if (Intrinsics.areEqual(item, DataItem.TotalRows.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_total_rows);
        } else if (Intrinsics.areEqual(item, DataItem.RopeBreaks.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_rope_breaks_count);
        } else if (Intrinsics.areEqual(item, DataItem.DownhillTimes.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.number_downslides);
        } else if (Intrinsics.areEqual(item, DataItem.DownhillDistance.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.accumulated_glide_distance);
        } else if (Intrinsics.areEqual(item, DataItem.DownhillDropMax.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.maximum_fall);
        } else if (Intrinsics.areEqual(item, DataItem.DownhillDropTotal.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.cumulative_slippage);
        } else if (Intrinsics.areEqual(item, DataItem.TotalTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.total_time_cost);
        } else if (Intrinsics.areEqual(item, DataItem.ExerciseTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_time_cost);
        } else if (Intrinsics.areEqual(item, DataItem.PauseTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.pause_time_cost);
        } else if (Intrinsics.areEqual(item, DataItem.TotalRestTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.total_rest_time_between_sets);
        } else if (Intrinsics.areEqual(item, DataItem.SwimmingTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.swim_time_cost);
        } else if (Intrinsics.areEqual(item, DataItem.CyclingTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.bike_time_cost);
        } else if (Intrinsics.areEqual(item, DataItem.RunningTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.run_time_cost);
        } else if (Intrinsics.areEqual(item, DataItem.SwitchTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_switch_time);
        } else if (Intrinsics.areEqual(item, DataItem.UpstairsFloors.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.upstairs_floor);
        } else if (Intrinsics.areEqual(item, DataItem.DownstairsFloors.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_downstairs_floors);
        } else if (Intrinsics.areEqual(item, DataItem.UpstairsHeight.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.ascent_height);
        } else if (Intrinsics.areEqual(item, DataItem.DownstairsHeight.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_downstairs_height);
        } else if (Intrinsics.areEqual(item, DataItem.AverageUpstairsFloors.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.upstairs_frequency);
        } else if (Intrinsics.areEqual(item, DataItem.SwimStyle.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.main_stroke);
        } else if (Intrinsics.areEqual(item, DataItem.Trips.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.number_of_trips);
        } else if (Intrinsics.areEqual(item, DataItem.TotalStrokes.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.total_strokes);
        } else if (Intrinsics.areEqual(item, DataItem.AverageStrokeDistance.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.avg_distance_perStroke);
        } else if (Intrinsics.areEqual(item, DataItem.Swolf.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.over_view_swolf);
        } else if (Intrinsics.areEqual(item, DataItem.AverageStrokeRate.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.average_stroke_speed);
        } else if (Intrinsics.areEqual(item, DataItem.MaxStrokeRate.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.maximum_stroke_speed);
        } else if (Intrinsics.areEqual(item, DataItem.AveragePace.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.running_avg_speed_pace);
        } else if (Intrinsics.areEqual(item, DataItem.BestPace.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.running_bigger_speed_pace);
        } else if (Intrinsics.areEqual(item, DataItem.AverageSpeed.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.running_average_speed);
        } else if (Intrinsics.areEqual(item, DataItem.MaxSpeed.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_maximum_speed);
        } else if (Intrinsics.areEqual(item, DataItem.AverageStepFreq.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.average_cadence);
        } else if (Intrinsics.areEqual(item, DataItem.MaxStepFreq.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.highest_cadence);
        } else if (Intrinsics.areEqual(item, DataItem.AverageStride.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.average_stride);
        } else if (Intrinsics.areEqual(item, DataItem.Step.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.running_step);
        } else if (Intrinsics.areEqual(item, DataItem.HighestAltitude.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.highest_altitude);
        } else if (Intrinsics.areEqual(item, DataItem.LowestAltitude.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.lowest_altitude);
        } else if (Intrinsics.areEqual(item, DataItem.AverageAltitude.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.average_altitude);
        } else if (Intrinsics.areEqual(item, DataItem.TotalClimb.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.cumulative_climp);
        } else if (Intrinsics.areEqual(item, DataItem.TotalUp.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.cumulative_rising_altitude);
        } else if (Intrinsics.areEqual(item, DataItem.TotalDown.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.running_total_down);
        } else if (Intrinsics.areEqual(item, DataItem.AverageSlope.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.average_slope);
        } else if (Intrinsics.areEqual(item, DataItem.MaxSlope.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.maximum_slope);
        } else if (Intrinsics.areEqual(item, DataItem.TotalSwing.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.total_swing_times);
        } else if (Intrinsics.areEqual(item, DataItem.ForehandSwing.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.fore_hand_count_swing);
        } else if (Intrinsics.areEqual(item, DataItem.BackhandSwing.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.back_hand_count_swing);
        } else if (Intrinsics.areEqual(item, DataItem.ServeTimes.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.serve_count);
        } else if (Intrinsics.areEqual(item, DataItem.ForehandPercentage.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.fore_hand_ratio);
        } else if (Intrinsics.areEqual(item, DataItem.BackhandPercentage.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.back_hand_ratio);
        } else if (Intrinsics.areEqual(item, DataItem.ServePercentage.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.serve_ratio);
        } else if (Intrinsics.areEqual(item, DataItem.GolfSwingCount.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_total_swing_numbers);
        } else if (Intrinsics.areEqual(item, DataItem.GolfAvgBeat.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_avg_tempo);
        } else if (Intrinsics.areEqual(item, DataItem.GolfAvgUpTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_total_avg_uptime);
        } else if (Intrinsics.areEqual(item, DataItem.GolfAvgDownTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_total_avg_downtime);
        } else if (Intrinsics.areEqual(item, DataItem.GolfAvgAngle.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_total_avg_angle);
        } else if (Intrinsics.areEqual(item, DataItem.GolfAvgScore.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_total_golf_score);
        } else if (Intrinsics.areEqual(item, DataItem.Calorie.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.running_burn);
        } else if (Intrinsics.areEqual(item, DataItem.AverageRowingFreq.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_avg_boating_fre);
        } else if (Intrinsics.areEqual(item, DataItem.HighestRowingFreq.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_max_boating_fre);
        } else if (Intrinsics.areEqual(item, DataItem.AveragePullingTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.avg_propeller_pulling_time);
        } else if (Intrinsics.areEqual(item, DataItem.AveragePaddleTime.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.avg_propeller_collecting_time);
        } else if (Intrinsics.areEqual(item, DataItem.AverageFreq.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.average_frequency);
        } else if (Intrinsics.areEqual(item, DataItem.HighestFreq.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.highest_frequency);
        } else if (Intrinsics.areEqual(item, DataItem.AverageHr.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.running_indoor_averag_heart_rate);
        } else if (Intrinsics.areEqual(item, DataItem.MaxHr.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.maximum_heart_rate);
        } else if (Intrinsics.areEqual(item, DataItem.MinHr.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_min_hr);
        } else if (Intrinsics.areEqual(item, DataItem.AverageStress.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.card_average_pressure);
        } else if (Intrinsics.areEqual(item, DataItem.MaxStress.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.card_maximum_pressure);
        } else if (Intrinsics.areEqual(item, DataItem.MinStress.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_min_stress);
        } else if (Intrinsics.areEqual(item, DataItem.AverageTemperature.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_avg_temp);
        } else if (Intrinsics.areEqual(item, DataItem.MaxTemperature.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_max_temp);
        } else if (Intrinsics.areEqual(item, DataItem.MinTemperature.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_min_temp);
        } else if (Intrinsics.areEqual(item, DataItem.TotalGroups.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_total_sets);
        } else if (Intrinsics.areEqual(item, DataItem.MaxSpO2.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_detail_spo2_max);
        } else if (Intrinsics.areEqual(item, DataItem.MinSpO2.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_detail_spo2_min);
        } else if (Intrinsics.areEqual(item, DataItem.AerobicTE.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_training_effect_aerobic_te);
        } else if (Intrinsics.areEqual(item, DataItem.AnaerobicTE.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_training_effect_anaerobic_te);
        } else if (Intrinsics.areEqual(item, DataItem.ExerciseLoad.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_exercise_load);
        } else if (Intrinsics.areEqual(item, DataItem.MaxVO2.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_max_vo2);
        } else if (Intrinsics.areEqual(item, DataItem.AveragePower.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_avg_power);
        } else if (Intrinsics.areEqual(item, DataItem.MaxPower.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_max_power);
        } else if (Intrinsics.areEqual(item, DataItem.WorkValue.INSTANCE)) {
            numValueOf = Integer.valueOf(R.string.sport_data_work_value);
        } else {
            numValueOf = Intrinsics.areEqual(item, DataItem.SubItemTime.INSTANCE) ? Integer.valueOf(R.string.sport_data_sub_sport_time) : null;
        }
        if (numValueOf == null) {
            return null;
        }
        return this.context.getString(numValueOf.intValue());
    }

    private final String k(SportDataItem sportDataItem) {
        Integer numValueOf;
        if (sportDataItem.getItem() instanceof DataItem.Step) {
            Resources resources = this.context.getResources();
            int i = R.plurals.sporting_data_unit_steps;
            Number value = sportDataItem.getValue();
            if (value == null) {
                value = 0;
            }
            return resources.getQuantityString(i, value.intValue());
        }
        DataItem item = sportDataItem.getItem();
        if (Intrinsics.areEqual(item, DataItem.Distance.INSTANCE)) {
            numValueOf = Integer.valueOf(f(sportDataItem));
        } else if (Intrinsics.areEqual(item, DataItem.DownhillDistance.INSTANCE)) {
            numValueOf = Integer.valueOf(this.useMetric ? R.string.running_kilometer : R.string.running_mile);
        } else {
            if (Intrinsics.areEqual(item, DataItem.TotalJumps.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalRows.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.RopeBreaks.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.DownhillTimes.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalStrokes.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalSwing.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.ForehandSwing.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.BackhandSwing.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.ServeTimes.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.GolfSwingCount.INSTANCE)) {
                numValueOf = Integer.valueOf(R.string.rope_skipping_unit);
            } else {
                if (Intrinsics.areEqual(item, DataItem.DownhillDropMax.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.DownhillDropTotal.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.UpstairsHeight.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.DownstairsHeight.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.HighestAltitude.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.LowestAltitude.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AverageAltitude.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalClimb.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalUp.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalDown.INSTANCE)) {
                    numValueOf = Integer.valueOf(this.useMetric ? R.string.unit_m : R.string.unit_foot);
                } else {
                    if (Intrinsics.areEqual(item, DataItem.UpstairsFloors.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.DownstairsFloors.INSTANCE)) {
                        numValueOf = Integer.valueOf(R.string.over_view_floor);
                    } else if (Intrinsics.areEqual(item, DataItem.AverageUpstairsFloors.INSTANCE)) {
                        numValueOf = Integer.valueOf(R.string.floors_per_minute);
                    } else if (Intrinsics.areEqual(item, DataItem.Trips.INSTANCE)) {
                        numValueOf = Integer.valueOf(R.string.sport_data_unit_trips);
                    } else if (Intrinsics.areEqual(item, DataItem.AverageStrokeDistance.INSTANCE)) {
                        numValueOf = Integer.valueOf(this.useMetric ? R.string.unit_m : R.string.unit_yard);
                    } else {
                        if (Intrinsics.areEqual(item, DataItem.AverageStrokeRate.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxStrokeRate.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AverageRowingFreq.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.HighestRowingFreq.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AverageFreq.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.HighestFreq.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AverageHr.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxHr.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MinHr.INSTANCE)) {
                            numValueOf = Integer.valueOf(R.string.unit_bike_ride);
                        } else {
                            if (Intrinsics.areEqual(item, DataItem.AveragePace.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.BestPace.INSTANCE)) {
                                numValueOf = Integer.valueOf(h());
                            } else {
                                if (Intrinsics.areEqual(item, DataItem.AverageSpeed.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxSpeed.INSTANCE)) {
                                    numValueOf = Integer.valueOf(this.useMetric ? R.string.running_detail_speed1 : R.string.running_detail_speed_br1);
                                } else {
                                    if (Intrinsics.areEqual(item, DataItem.AverageStepFreq.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxStepFreq.INSTANCE)) {
                                        numValueOf = Integer.valueOf(R.string.unit_pace_freq);
                                    } else if (Intrinsics.areEqual(item, DataItem.AverageStride.INSTANCE)) {
                                        numValueOf = Integer.valueOf(this.useMetric ? R.string.sport_data_unit_cm : R.string.unit_inch);
                                    } else {
                                        if (Intrinsics.areEqual(item, DataItem.AverageSlope.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxSlope.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.ForehandPercentage.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.BackhandPercentage.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.ServePercentage.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxSpO2.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MinSpO2.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.GolfAvgAngle.INSTANCE)) {
                                            numValueOf = Integer.valueOf(R.string.running_percent_mark);
                                        } else if (Intrinsics.areEqual(item, DataItem.Calorie.INSTANCE)) {
                                            numValueOf = Integer.valueOf(R.string.running_cal_unit);
                                        } else {
                                            if (Intrinsics.areEqual(item, DataItem.AveragePullingTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AveragePaddleTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.GolfAvgUpTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.GolfAvgDownTime.INSTANCE)) {
                                                numValueOf = Integer.valueOf(R.string.sport_data_unit_seconds);
                                            } else {
                                                if (Intrinsics.areEqual(item, DataItem.AverageTemperature.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxTemperature.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MinTemperature.INSTANCE)) {
                                                    numValueOf = Integer.valueOf(R.string.sport_data_unit_centigrade);
                                                } else if (Intrinsics.areEqual(item, DataItem.TotalGroups.INSTANCE)) {
                                                    numValueOf = Integer.valueOf(R.string.sport_data_unit_sets);
                                                } else if (Intrinsics.areEqual(item, DataItem.MaxVO2.INSTANCE)) {
                                                    numValueOf = Integer.valueOf(R.string.moving_ui_sport_data_unit_maxvo2);
                                                } else {
                                                    if (Intrinsics.areEqual(item, DataItem.MaxPower.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AveragePower.INSTANCE)) {
                                                        numValueOf = Integer.valueOf(R.string.moving_ui_sport_data_unit_power);
                                                    } else {
                                                        numValueOf = Intrinsics.areEqual(item, DataItem.WorkValue.INSTANCE) ? Integer.valueOf(R.string.moving_ui_sport_data_unit_work) : null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (numValueOf == null) {
            return null;
        }
        return this.context.getString(numValueOf.intValue());
    }

    private final boolean l(SportDataItem sportDataItem) {
        boolean zIsAltiMeterValid;
        Double value = sportDataItem.getValue();
        if (value == null) {
            return false;
        }
        double dDoubleValue = value.doubleValue();
        DataItem item = sportDataItem.getItem();
        if (!(Intrinsics.areEqual(item, DataItem.MaxHr.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MinHr.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AverageHr.INSTANCE))) {
            if (!Intrinsics.areEqual(item, DataItem.AverageStride.INSTANCE)) {
                if (Intrinsics.areEqual(item, DataItem.HighestAltitude.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.LowestAltitude.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AverageAltitude.INSTANCE)) {
                    zIsAltiMeterValid = RunUtils.isAltiMeterValid((int) dDoubleValue);
                } else {
                    if (!(Intrinsics.areEqual(item, DataItem.AverageTemperature.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxTemperature.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MinTemperature.INSTANCE))) {
                        if (Intrinsics.areEqual(item, DataItem.MaxSpO2.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MinSpO2.INSTANCE)) {
                            int i = (int) dDoubleValue;
                            if (1 > i || i > 99) {
                                return false;
                            }
                        } else if (Intrinsics.areEqual(item, DataItem.GolfAvgAngle.INSTANCE)) {
                            int i2 = (int) dDoubleValue;
                            if (-50 > i2 || i2 > 50) {
                                return false;
                            }
                        } else {
                            if (Intrinsics.areEqual(item, DataItem.AerobicTE.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AnaerobicTE.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AverageSlope.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxSlope.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AverageStress.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxStress.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MinStress.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.ExerciseLoad.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.MaxVO2.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.ForehandPercentage.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.BackhandPercentage.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.ServePercentage.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.PauseTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.ExerciseTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.SubItemTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.TotalRestTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.SwimmingTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.CyclingTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.RunningTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.SwitchTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AveragePaddleTime.INSTANCE) ? true : Intrinsics.areEqual(item, DataItem.AveragePullingTime.INSTANCE)) {
                                if (dDoubleValue <= 0.0d) {
                                    return false;
                                }
                            } else if (dDoubleValue < 0.0d) {
                                return false;
                            }
                        }
                    } else if (dDoubleValue <= -274.0d) {
                        return false;
                    }
                }
            } else if (dDoubleValue <= 0.0d) {
                return false;
            }
            return true;
        }
        zIsAltiMeterValid = HeartRateConstant.isHRValueValid((int) dDoubleValue);
        return zIsAltiMeterValid;
    }

    private final boolean m() {
        return ((Boolean) this.isSwimmingSports.getValue()).booleanValue();
    }

    private final boolean n(double value) {
        RunnerPeripheralInfo runnerPeripheralInfo = RunnerPeripheralInfo.getInstance();
        int height = (runnerPeripheralInfo == null || runnerPeripheralInfo.getHeight() <= 0) ? 170 : runnerPeripheralInfo.getHeight();
        return value <= ((double) height) && value >= ((double) (((float) height) * 0.25f));
    }

    private final String o(double d) {
        return String.valueOf((int) d);
    }

    private final String p(double d) {
        Integer numValueOf;
        int i = (int) d;
        String string = null;
        if (i == 1) {
            numValueOf = Integer.valueOf(R.string.sport_swim_style_breaststroke);
        } else if (i == 2) {
            numValueOf = Integer.valueOf(R.string.sport_swim_style_freestyle);
        } else if (i == 3) {
            numValueOf = Integer.valueOf(R.string.sport_swim_style_backstroke);
        } else if (i != 4) {
            numValueOf = i != 6 ? null : Integer.valueOf(R.string.sport_swim_style_butterfly);
        } else {
            numValueOf = Integer.valueOf(R.string.sport_swim_style_medley);
        }
        if (numValueOf != null) {
            string = this.context.getString(numValueOf.intValue());
        }
        return string == null ? this.defaultDisplay : string;
    }

    @Override // com.huami.moving.sport.ui.common.SportDataDisplayItemConverter
    @NotNull
    public List<SportDataDisplayItem> convert(@NotNull List<SportDataItem> item) {
        ArrayList arrayList = new ArrayList();
        for (SportDataItem sportDataItem : item) {
            String strJ = j(sportDataItem);
            if (strJ != null) {
                arrayList.add(new SportDataDisplayItem(strJ, l(sportDataItem) ? e(sportDataItem) : this.defaultDisplay, k(sportDataItem)));
            }
        }
        return arrayList;
    }

    public /* synthetic */ SportDataDisplayItemConverterImpl(Context context, boolean z, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 8) != 0) {
            str = context.getString(R.string.running_pace_empty);
            StringBuilder sb = new StringBuilder(20576);
            sb.append("class SportDataDisplayItemConverterImpl(\n    private val context: Context,\n    /**\n     * 是否使用公制单位显示，默认 true，false 情况下使用英制单位\n     */\n    private val useMetric: Boolean,\n    /**\n     * 运动类型\n     */\n    sportType: Int,\n    /**\n     * 空数据默认展示\n     */\n    private val defaultDisplay: String = context.getString(R.string.running_pace_empty)\n) : SportDataDisplayItemConverter {\n    /**\n     * 兼容类型\n     */\n    private val compatibleType: Int by lazy { sportType.sportType }\n\n    /**\n     * 是否是游泳\n     */\n    private val isSwimmingSports: Boolean by lazy {\n        listOf(\n            SportType.SwimmingPool, SportType.OpenWaterSwimming\n        ).any { it.type == compatibleType }\n    }\n\n    override fun convert(item: List<SportDataItem>): List<SportDataDisplayItem> =\n        mutableListOf<SportDataDisplayItem>().apply {\n            item.forEach {\n                it._title?.run {\n                    val value = if (it._verify) it._display else defaultDisplay\n                    this@apply.add(\n                        SportDataDisplayItem(this, value, it._unit)\n                    )\n                }\n            }\n        }\n\n    /**\n     * 运动项名称\n     */\n    private val SportDataItem._title: String?\n        get() = when (item) {\n            DataItem.Distance -> R.string.segment_distance\n            DataItem.TotalJumps -> R.string.sport_data_total_count\n            DataItem.TotalRows -> R.string.sport_data_total_rows\n            DataItem.RopeBreaks -> R.string.sport_data_rope_breaks_count\n            DataItem.DownhillTimes -> R.string.number_downslides\n            DataItem.DownhillDistance -> R.string.accumulated_glide_distance\n            DataItem.DownhillDropMax -> R.string.maximum_fall\n            DataItem.DownhillDropTotal -> R.string.cumulative_slippage\n            DataItem.TotalTime -> R.string.total_time_cost\n            DataItem.ExerciseTime -> R.string.sport_time_cost\n            DataItem.PauseTime -> R.string.pause_time_cost\n            DataItem.TotalRestTime -> R.string.total_rest_time_between_sets\n            DataItem.SwimmingTime -> R.string.swim_time_cost\n            DataItem.CyclingTime -> R.string.bike_time_cost\n            DataItem.RunningTime -> R.string.run_time_cost\n            DataItem.SwitchTime -> R.string.sport_data_switch_time\n            DataItem.UpstairsFloors -> R.string.upstairs_floor\n            DataItem.DownstairsFloors -> R.string.sport_data_downstairs_floors\n            DataItem.UpstairsHeight -> R.string.ascent_height\n            DataItem.DownstairsHeight -> R.string.sport_data_downstairs_height\n            DataItem.AverageUpstairsFloors -> R.string.upstairs_frequency\n            DataItem.SwimStyle -> R.string.main_stroke\n            DataItem.Trips -> R.string.number_of_trips\n            DataItem.TotalStrokes -> R.string.total_strokes\n            DataItem.AverageStrokeDistance -> R.string.avg_distance_perStroke\n            DataItem.Swolf -> R.string.over_view_swolf\n            DataItem.AverageStrokeRate -> R.string.average_stroke_speed\n            DataItem.MaxStrokeRate -> R.string.maximum_stroke_speed\n            DataItem.AveragePace -> R.string.running_avg_speed_pace\n            DataItem.BestPace -> R.string.running_bigger_speed_pace\n            DataItem.AverageSpeed -> R.string.running_average_speed\n            DataItem.MaxSpeed -> R.string.sport_maximum_speed\n            DataItem.AverageStepFreq -> R.string.average_cadence\n            DataItem.MaxStepFreq -> R.string.highest_cadence\n            DataItem.AverageStride -> R.string.average_stride\n            DataItem.Step -> R.string.running_step\n            DataItem.HighestAltitude -> R.string.highest_altitude\n            DataItem.LowestAltitude -> R.string.lowest_altitude\n            DataItem.AverageAltitude -> R.string.average_altitude\n            DataItem.TotalClimb -> R.string.cumulative_climp\n            DataItem.TotalUp -> R.string.cumulative_rising_altitude\n            DataItem.TotalDown -> R.string.running_total_down\n            DataItem.AverageSlope -> R.string.average_slope\n            DataItem.MaxSlope -> R.string.maximum_slope\n            DataItem.TotalSwing -> R.string.total_swing_times\n            DataItem.ForehandSwing -> R.string.fore_hand_count_swing\n            DataItem.BackhandSwing -> R.string.back_hand_count_swing\n            DataItem.ServeTimes -> R.string.serve_count\n            DataItem.ForehandPercentage -> R.string.fore_hand_ratio\n            DataItem.BackhandPercentage -> R.string.back_hand_ratio\n            DataItem.ServePercentage -> R.string.serve_ratio\n            DataItem.GolfSwingCount -> R.string.sport_data_total_swing_numbers\n            DataItem.GolfAvgBeat -> R.string.sport_data_avg_tempo\n            DataItem.GolfAvgUpTime -> R.string.sport_data_total_avg_uptime\n            DataItem.GolfAvgDownTime -> R.string.sport_data_total_avg_downtime\n            DataItem.GolfAvgAngle -> R.string.sport_data_total_avg_angle\n            DataItem.GolfAvgScore -> R.string.sport_data_total_golf_score\n            DataItem.Calorie -> R.string.running_burn\n            DataItem.AverageRowingFreq -> R.string.sport_data_avg_boating_fre\n            DataItem.HighestRowingFreq -> R.string.sport_data_max_boating_fre\n            DataItem.AveragePullingTime -> R.string.avg_propeller_pulling_time\n            DataItem.AveragePaddleTime -> R.string.avg_propeller_collecting_time\n            DataItem.AverageFreq -> R.string.average_frequency\n            DataItem.HighestFreq -> R.string.highest_frequency\n            DataItem.AverageHr -> R.string.running_indoor_averag_heart_rate\n            DataItem.MaxHr -> R.string.maximum_heart_rate\n            DataItem.MinHr -> R.string.sport_data_min_hr\n            DataItem.AverageStress -> R.string.card_average_pressure\n            DataItem.MaxStress -> R.string.card_maximum_pressure\n            DataItem.MinStress -> R.string.sport_data_min_stress\n            DataItem.AverageTemperature -> R.string.sport_data_avg_temp\n            DataItem.MaxTemperature -> R.string.sport_data_max_temp\n            DataItem.MinTemperature -> R.string.sport_data_min_temp\n            DataItem.TotalGroups -> R.string.sport_data_total_sets\n            DataItem.MaxSpO2 -> R.string.sport_detail_spo2_max\n            DataItem.MinSpO2 -> R.string.sport_detail_spo2_min\n            DataItem.AerobicTE -> R.string.sport_training_effect_aerobic_te\n            DataItem.AnaerobicTE -> R.string.sport_training_effect_anaerobic_te\n            DataItem.ExerciseLoad -> R.string.sport_data_exercise_load\n            DataItem.MaxVO2 -> R.string.sport_data_max_vo2\n            DataItem.AveragePower -> R.string.sport_data_avg_power\n            DataItem.MaxPower -> R.string.sport_data_max_power\n            DataItem.WorkValue -> R.string.sport_data_work_value\n            DataItem.SubItemTime -> R.string.sport_data_sub_sport_time\n            else -> null\n        }?.run { context.getString(this) }\n\n    /**\n     * 运动项数值格式化\n     */\n    private val SportDataItem._display: String\n        get() = value?.run {\n            when (item) {\n                DataItem.Distance ->\n                    _distanceValue\n                DataItem.DownhillDistance ->\n                    DataFormatter.parseRawKilometerToFormatKilometer(\n                        RunDataConversion.convertMeterToKmOrMile(toFloat(), useMetric)\n                    )\n                DataItem.DownhillDropMax, DataItem.DownhillDropTotal, DataItem.UpstairsHeight, DataItem.DownstairsHeight,\n                DataItem.HighestAltitude, DataItem.LowestAltitude, DataItem.AverageAltitude, DataItem.TotalClimb,\n                DataItem.TotalUp, DataItem.TotalDown ->\n                    RunDataConversion.parseAltitude(toFloat(), useMetric)\n                DataItem.TotalTime, DataItem.ExerciseTime, DataItem.PauseTime, DataItem.TotalRestTime, DataItem.SwimmingTime,\n                DataItem.CyclingTime, DataItem.RunningTime, DataItem.SwitchTime, DataItem.SubItemTime ->\n                    DataFormatter.getConsumeTime(toLong())\n                DataItem.SwimStyle ->\n                    toSwimStyle()\n                DataItem.AverageStrokeDistance -> {\n                    val dis = if (useMetric) this else RunDataConversion.convertMeterToYard(toFloat()).toDouble()\n                    NumberFormatter.formatDouble2StringByLocale(dis, 2)\n                }\n                DataItem.AveragePace, DataItem.BestPace ->\n                    _paceValue\n                DataItem.AverageSpeed, DataItem.MaxSpeed ->\n                    (if (useMetric) this else this / UnitConversion.KM_PER_MILE).run {\n                        NumberFormatter.formatDouble2StringByLocale(this, 2, BigDecimal.ROUND_HALF_UP)\n                    }\n                DataItem.AverageStride ->\n                    RunDataConversion.parseStrideLength(toFloat(), useMetric)\n                DataItem.AveragePullingTime, DataItem.AveragePaddleTime ->\n                    NumberFormatter.formatDouble2StringByLocale(this, 1, BigDecimal.ROUND_HALF_UP)\n                DataItem.AverageTemperature, DataItem.MaxTemperature, DataItem.MinTemperature,\n                DataItem.AveragePullingTime, DataItem.AveragePaddleTime, DataItem.AerobicTE, DataItem.AnaerobicTE,\n                DataItem.GolfAvgBeat ->\n                    NumberFormatter.formatDouble2StringByLocale(this, 1)\n                DataItem.GolfAvgDownTime, DataItem.GolfAvgUpTime ->\n                    NumberFormatter.formatDouble2StringByLocale(this, 2)\n                DataItem.MaxSpO2, DataItem.MinSpO2 ->\n                    toInt().run {\n                        if (this < MIN_SP_O2) {\n                            \"<$MIN_SP_O2\"\n                        } else {\n                            toString()\n                        }\n                    }\n                else ->\n                    toIntValue()\n            }\n        } ?: defaultDisplay\n\n    /**\n     * 运动数据有效性检查\n     */\n    private val SportDataItem._verify: Boolean\n        get() = value?.run {\n            when (item) {\n                DataItem.MaxHr, DataItem.MinHr, DataItem.AverageHr ->\n                    HeartRateConstant.isHRValueValid(toInt())\n                DataItem.AverageStride ->\n                    this > 0\n//                    isValidStride(this)\n                DataItem.HighestAltitude, DataItem.LowestAltitude, DataItem.AverageAltitude ->\n                    RunUtils.isAltiMeterValid(toInt())\n                DataItem.AverageTemperature, DataItem.MaxTemperature, DataItem.MinTemperature ->\n                    this > -274\n                DataItem.MaxSpO2, DataItem.MinSpO2 ->\n                    this.toInt() in 1..99\n                DataItem.GolfAvgAngle ->\n                    this.toInt() in -50..50\n                DataItem.AerobicTE, DataItem.AnaerobicTE, DataItem.AverageSlope, DataItem.MaxSlope,\n                DataItem.AverageStress, DataItem.MaxStress, DataItem.MinStress, DataItem.ExerciseLoad,\n                DataItem.MaxVO2, DataItem.ForehandPercentage, DataItem.BackhandPercentage,\n                DataItem.ServePercentage, DataItem.PauseTime, DataItem.TotalTime, DataItem.ExerciseTime,\n                DataItem.SubItemTime,DataItem.TotalRestTime, DataItem.SwimmingTime,DataItem.CyclingTime,\n                DataItem.RunningTime, DataItem.SwitchTime, DataItem.AveragePaddleTime, DataItem.AveragePullingTime->\n                    this > 0\n                else ->\n                    this >= 0\n            }\n        } ?: false\n\n    /**\n     * 运动数据项单位\n     */\n    private val SportDataItem._unit: String?\n        get() {\n            if (item is DataItem.Step) {\n                // 步数存在单复数问题\n                return context.resources.getQuantityString(R.plurals.sporting_data_unit_steps, (value ?: 0).toInt())\n            }\n            return when (item) {\n                DataItem.Distance -> _distanceUnit\n                DataItem.DownhillDistance ->\n                    if (useMetric) R.string.running_kilometer else R.string.running_mile\n                DataItem.TotalJumps, DataItem.TotalRows, DataItem.RopeBreaks, DataItem.DownhillTimes, DataItem.TotalStrokes,\n                DataItem.TotalSwing, DataItem.ForehandSwing, DataItem.BackhandSwing, DataItem.ServeTimes, DataItem.GolfSwingCount ->\n                    R.string.rope_skipping_unit\n                DataItem.DownhillDropMax, DataItem.DownhillDropTotal, DataItem.UpstairsHeight, DataItem.DownstairsHeight,\n                DataItem.HighestAltitude, DataItem.LowestAltitude, DataItem.AverageAltitude, DataItem.TotalClimb,\n                DataItem.TotalUp, DataItem.TotalDown ->\n                    if (useMetric) R.string.unit_m else R.string.unit_foot\n                DataItem.UpstairsFloors, DataItem.DownstairsFloors ->\n                    R.string.over_view_floor\n                DataItem.AverageUpstairsFloors ->\n                    R.string.floors_per_minute\n                DataItem.Trips ->\n                    R.string.sport_data_unit_trips\n                DataItem.AverageStrokeDistance ->\n                    if (useMetric) R.string.unit_m else R.string.unit_yard\n                DataItem.AverageStrokeRate, DataItem.MaxStrokeRate, DataItem.AverageRowingFreq, DataItem.HighestRowingFreq,\n                DataItem.AverageFreq, DataItem.HighestFreq, DataItem.AverageHr, DataItem.MaxHr, DataItem.MinHr ->\n                    R.string.unit_bike_ride\n                DataItem.AveragePace, DataItem.BestPace ->\n                    _paceUnit\n                DataItem.AverageSpeed, DataItem.MaxSpeed ->\n                    if (useMetric) R.string.running_detail_speed1 else R.string.running_detail_speed_br1\n                DataItem.AverageStepFreq, DataItem.MaxStepFreq ->\n                    R.string.unit_pace_freq\n                DataItem.AverageStride ->\n                    if (useMetric) R.string.sport_data_unit_cm else R.string.unit_inch\n                DataItem.AverageSlope, DataItem.MaxSlope, DataItem.ForehandPercentage, DataItem.BackhandPercentage,\n                DataItem.ServePercentage, DataItem.MaxSpO2, DataItem.MinSpO2, DataItem.GolfAvgAngle ->\n                    R.string.running_percent_mark\n                DataItem.Calorie ->\n                    R.string.running_cal_unit\n                DataItem.AveragePullingTime, DataItem.AveragePaddleTime, DataItem.GolfAvgUpTime, DataItem.GolfAvgDownTime ->\n                    R.string.sport_data_unit_seconds\n                DataItem.AverageTemperature, DataItem.MaxTemperature, DataItem.MinTemperature ->\n                    R.string.sport_data_unit_centigrade\n                DataItem.TotalGroups ->\n                    R.string.sport_data_unit_sets\n                DataItem.MaxVO2 ->\n                    R.string.moving_ui_sport_data_unit_maxvo2\n                DataItem.MaxPower, DataItem.AveragePower->\n                    R.string.moving_ui_sport_data_unit_power\n                DataItem.WorkValue->\n                    R.string.moving_ui_sport_data_unit_work\n                else -> null\n\n                // 单位特殊处理\n                // DataItem.Step\n\n                // 无单位的数据项\n                // DataItem.TotalTime\n                // DataItem.ExerciseTime\n                // DataItem.PauseTime\n                // DataItem.TotalRestTime\n                // DataItem.SwimmingTime\n                // DataItem.CyclingTime\n                // DataItem.RunningTime\n                // DataItem.SwitchTime\n                // DataItem.SwimStyle\n                // DataItem.Swolf\n                // DataItem.AveragePaddleTime\n                // DataItem.AverageStress\n                // DataItem.MaxStress\n                // DataItem.MinStress\n                // DataItem.AerobicTE\n                // DataItem.AnaerobicTE\n                // DataItem.ExerciseLoad\n                // DataItem.SubItemTime\n            }?.run {\n                context.getString(this)\n            }\n        }\n\n    /**\n     * 距离单位：\n     * 1. 非游泳：公里、英里\n     * 2. 游泳：>= 10 公里/英里 '公里、英里'，否则 '米、码'\n     */\n    private val SportDataItem._distanceUnit: Int\n        get() = when {\n            // 非游泳或距离 ≥ 10 公里/英里\n            !isSwimmingSports || kDistance >= 10 ->\n                if (useMetric)\n                    R.string.running_kilometers\n                else\n                    R.string.running_miles\n            // < 10 公里，单位：米\n            useMetric ->\n                R.string.unit_m\n            // < 10 英里，单位：码\n            else ->\n                R.string.unit_yard\n        }\n\n    /**\n     * 距离：\n     * 1. 非游");
            sb.append("泳：公里、英里\n     * 2. 游泳：>= 10 公里/英里 '公里、英里'，否则 '米、码'\n     */\n    private val SportDataItem._distanceValue: String\n        get() {\n            val distance = kDistance\n\n            fun Double.distanceFormat(): String =\n                when {\n                    this <= 0 ->\n                        NumberFormatter.formatDouble2String(0.0, 2)\n                    this < 100 ->\n                        NumberFormatter.formatDouble2String(this, 2)\n                    this < 1000 ->\n                        NumberFormatter.formatDouble2String(this, 1)\n                    this < 10000 ->\n                        NumberFormatter.formatDouble2String(this, 0)\n                    else -> toInt().toString()\n                }\n\n            fun Double.toMile(): Double =\n                if (compatibleType == SportType.SwimmingPool.type) {\n                    // 泳池游泳的距离单位是码，无需转换\n                    this\n                } else {\n                    // 米转为码\n                    this / UnitConversion.KM_PER_MILE\n                }\n\n            return when {\n                // 非游泳或 ≥ 10 公里/英里\n                !isSwimmingSports || distance >= 10 ->\n                    distance.distanceFormat()\n                // < 10 公里，单位：米\n                useMetric ->\n                    NumberFormatter.formatDouble2String(value ?: 0.0, 0)\n                // < 10 英里，单位：码\n                else -> {\n                    NumberFormatter.formatDouble2String(value?.toMile() ?: 0.0, 0)\n                }\n            }\n        }\n\n    /**\n     * 距离转换为公里/英里\n     */\n    private val SportDataItem.kDistance: Double\n        get() = value?.let { distance ->\n            // 数据默认单位是米\n            when {\n                useMetric ->\n                    // 公制单位：米转为公里\n                    distance / UnitConversion.METER_TO_KILOMETER\n                compatibleType == SportType.SwimmingPool.type ->\n                    // 英制单位：泳池游泳的距离单位是码，码转为英里\n                    distance / UnitConversion.MILE_PER_YARDS\n                else ->\n                    // 英制单位：米转为英里\n                    distance / (UnitConversion.METER_TO_KILOMETER * UnitConversion.KM_PER_MILE)\n            }\n        }?.let {\n            // 保留两位有效数字\n            NumberFormatter.format(it, 2)\n        } ?: 0.0\n\n    /**\n     * 配速单位：\n     * 1. 非游泳：/公里、/英里\n     * 2. 游泳：/100米、/100码\n     */\n    private val _paceUnit: Int\n        get() = when {\n            isSwimmingSports && useMetric -> R.string.sport_data_unit_pace_hundred_m\n            isSwimmingSports -> R.string.sport_data_unit_pace_hundred_yd\n            useMetric -> R.string.sport_data_unit_pace_km\n            else -> R.string.sport_data_unit_pace_mile\n        }\n\n    /**\n     * 配速：\n     * 1. 非游泳：/公里、/英里\n     * 2. 游泳：/100米、/100码\n     */\n    private val SportDataItem._paceValue: String\n        get() = (value ?: 0).toFloat().run {\n            if (isSwimmingSports) {\n                DataFormatter.getFormatPaceAndUnit(this, compatibleType, useMetric)[0]\n            } else {\n                DataFormatter.formatTimeInSportFormForPace(RunDataConversion.paceMultiplyKilo(this, useMetric).toLong())\n            }\n        }\n\n    private fun Double.toIntValue(): String = toInt().toString()\n\n    private fun Double.toSwimStyle(): String =\n        when (toInt()) {\n            RunningParams.SWIM_BREASTSTROKE -> R.string.sport_swim_style_breaststroke\n            RunningParams.SWIM_FREESTYLE -> R.string.sport_swim_style_freestyle\n            RunningParams.SWIM_BACKSTROKE -> R.string.sport_swim_style_backstroke\n            RunningParams.SWIM_MEDLEY -> R.string.sport_swim_style_medley\n            RunningParams.SWIM_BUTTERFLY -> R.string.sport_swim_style_butterfly\n            else -> null\n        }?.run {\n            context.getString(this)\n        } ?: defaultDisplay\n\n    /**\n     * 平均步幅的有效性校验\n     */\n    private fun isValidStride(value: Double): Boolean {\n        val info = RunnerPeripheralInfo.getInstance()\n        val height = if (info != null && info.height > 0) {\n            info.height\n        } else {\n            170\n        }\n        val minStride = height * 0.25f\n        return !(value > height || value < minStride)\n    }\n\n    private companion object {\n        const val MIN_SP_O2 = 80\n    }\n}");
        }
        this(context, z, i, str);
    }
}
