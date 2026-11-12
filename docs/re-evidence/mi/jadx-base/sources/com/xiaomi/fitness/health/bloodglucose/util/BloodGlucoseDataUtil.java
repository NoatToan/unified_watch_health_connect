package com.xiaomi.fitness.health.bloodglucose.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.aggregation.AGPItem;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.PostMealBSDiff;
import com.xiaomi.fit.fitness.export.data.aggregation.SleepBloodSugarData;
import com.xiaomi.fit.fitness.export.data.aggregation.SportBloodSugarData;
import com.xiaomi.fit.fitness.export.data.aggregation.StatisticBloodSugar;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fitness.chart.barchart.itemdecoration.BloodGlucoseLineChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.AGPDetailList;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseLineChartData;
import com.xiaomi.fitness.chart.entrys.FingerBSList;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import defpackage.c0j;
import defpackage.iji;
import defpackage.pni;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.uz6;
import defpackage.vfe;
import defpackage.x44;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001cB\t\b\u0002¢\u0006\u0004\ba\u0010bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J+\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\"¢\u0006\u0004\b#\u0010$JA\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J=\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0.2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0004¢\u0006\u0004\b2\u0010\bJ\u0015\u00103\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0004¢\u0006\u0004\b3\u0010\u0011J)\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002040\u001b¢\u0006\u0004\b6\u00107J4\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u00109\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b8\u0012\u0004\u0012\u00020\u00040%¢\u0006\u0004\b;\u0010<J%\u0010B\u001a\u00020A2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bB\u0010CJ4\u0010E\u001a\b\u0012\u0004\u0012\u00020:0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010D\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b8\u0012\u0004\u0012\u00020\u00040%¢\u0006\u0004\bE\u0010<J-\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010G\u001a\u00020F2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bI\u0010JJ#\u0010L\u001a\b\u0012\u0004\u0012\u00020H0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010G\u001a\u00020K¢\u0006\u0004\bL\u0010MJ<\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010O\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bN\u0012\u0004\u0012\u00020\t0%2\u0006\u0010P\u001a\u00020\t¢\u0006\u0004\bR\u0010SJ\u0015\u0010T\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bT\u0010\u0011J\u0015\u0010U\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bU\u0010\u0011J\u0015\u0010V\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bV\u0010\u0011J\u0015\u0010W\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bW\u0010\u0011R\u0014\u0010X\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010YR\u0014\u0010[\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010YR\u0014\u0010\\\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010YR\u0014\u0010]\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010YR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\t0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_¨\u0006d"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/util/BloodGlucoseDataUtil;", "", "Landroid/content/Context;", "context", "", "type", "", "getLevelStingRes", "(Landroid/content/Context;I)Ljava/lang/String;", "", "value", "getValueTypeByFloat", "(F)I", "percent", "getTypeStingResAndPercent", "(IILandroid/content/Context;)Ljava/lang/String;", "getDistributeColor", "(I)I", "getLevelTextColor", "Landroid/graphics/drawable/Drawable;", "getLevelDrawable", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "Lvfe;", "lineChartAttrs", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "report", "highLightType", "", "Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;", "createDayEntries", "(Landroid/content/Context;Lvfe;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;I)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/SleepBloodSugarData;", "createDaySleepEntries", "(Landroid/content/Context;Lvfe;Lcom/xiaomi/fit/fitness/export/data/aggregation/SleepBloodSugarData;)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/SportBloodSugarData;", "createDaySportEntries", "(Landroid/content/Context;Lvfe;Lcom/xiaomi/fit/fitness/export/data/aggregation/SportBloodSugarData;)Ljava/util/List;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AGPItem;", "reportMap", "", "sportTime", "createAGPDetailEntries", "(Landroid/content/Context;Lvfe;Ljava/util/Map;J)Ljava/util/List;", "", "isWeek", "", "createWeekMonthEntries", "(Landroid/content/Context;Lvfe;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;ZI)Ljava/util/List;", "constant", "getBloodGlucoseTypeByConstant", "getBloodGlucoseStrByConstant", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "createSleepDayEntries", "(Lvfe;Ljava/util/List;)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/annotation/BloodSugarLevel;", "bloodSugarList", "Luz6;", "createDistributeData", "(Landroid/content/Context;Ljava/util/Map;)Ljava/util/List;", "settingLowValue", "settingHighValue", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "mItemDecoration", "", "initLineColor", "(FFLcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;)V", "bloodSugarMap", "createFingerDistributeData", "Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;", "statisticDataList", "Lqpo;", "createSummaryModelList", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;I)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/PostMealBSDiff;", "createFingerDayModelList", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/PostMealBSDiff;)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/annotation/BloodSugarMeasurePeriod;", "mDataList", Constants.KEY_RECHARGE_MAXVALUE, "Lcom/xiaomi/fitness/health/bloodglucose/util/BloodGlucoseDataUtil$FingerMealTimeRecycleModel;", "createFingerMealTimeModelList", "(Landroid/content/Context;Ljava/util/Map;F)Ljava/util/List;", "getTypeStingRes", "getRecordLevelDrawable", "getRecordLevelTextColor", "getFingerBgColor", "COLOR_HIGH", "I", "COLOR_NORMAL", "COLOR_LOW", "COLOR_EXTRA_LOW", "COLOR_EXTRA_HIGH", "settValueList", "Ljava/util/List;", "valueTypeList", "<init>", "()V", "FingerMealTimeRecycleModel", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBloodGlucoseDataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseDataUtil.kt\ncom/xiaomi/fitness/health/bloodglucose/util/BloodGlucoseDataUtil\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,934:1\n216#2,2:935\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseDataUtil.kt\ncom/xiaomi/fitness/health/bloodglucose/util/BloodGlucoseDataUtil\n*L\n510#1:935,2\n*E\n"})
public final class BloodGlucoseDataUtil {

    @NotNull
    public static final BloodGlucoseDataUtil INSTANCE = new BloodGlucoseDataUtil();
    private static final int COLOR_HIGH = iji.N;
    private static final int COLOR_NORMAL = iji.P;
    private static final int COLOR_LOW = iji.O;
    private static final int COLOR_EXTRA_LOW = iji.M;
    private static final int COLOR_EXTRA_HIGH = iji.L;

    @NotNull
    private static final List<Float> settValueList = new ArrayList();

    @NotNull
    private static final List<Integer> valueTypeList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{5, 3, 1, 2, 4});

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/util/BloodGlucoseDataUtil$FingerMealTimeRecycleModel;", "", "drawPercent", "", "drawText", "", "drawColor", "", "typeTitleText", "<init>", "(FLjava/lang/String;ILjava/lang/String;)V", "getDrawPercent", "()F", "getDrawText", "()Ljava/lang/String;", "getDrawColor", "()I", "getTypeTitleText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FingerMealTimeRecycleModel {
        private final int drawColor;
        private final float drawPercent;

        @NotNull
        private final String drawText;

        @NotNull
        private final String typeTitleText;

        public FingerMealTimeRecycleModel(float f, @NotNull String drawText, int i, @NotNull String typeTitleText) {
            Intrinsics.checkNotNullParameter(drawText, "drawText");
            Intrinsics.checkNotNullParameter(typeTitleText, "typeTitleText");
            this.drawPercent = f;
            this.drawText = drawText;
            this.drawColor = i;
            this.typeTitleText = typeTitleText;
        }

        public static /* synthetic */ FingerMealTimeRecycleModel copy$default(FingerMealTimeRecycleModel fingerMealTimeRecycleModel, float f, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = fingerMealTimeRecycleModel.drawPercent;
            }
            if ((i2 & 2) != 0) {
                str = fingerMealTimeRecycleModel.drawText;
            }
            if ((i2 & 4) != 0) {
                i = fingerMealTimeRecycleModel.drawColor;
            }
            if ((i2 & 8) != 0) {
                str2 = fingerMealTimeRecycleModel.typeTitleText;
            }
            return fingerMealTimeRecycleModel.copy(f, str, i, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getDrawPercent() {
            return this.drawPercent;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDrawText() {
            return this.drawText;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getDrawColor() {
            return this.drawColor;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTypeTitleText() {
            return this.typeTitleText;
        }

        @NotNull
        public final FingerMealTimeRecycleModel copy(float drawPercent, @NotNull String drawText, int drawColor, @NotNull String typeTitleText) {
            Intrinsics.checkNotNullParameter(drawText, "drawText");
            Intrinsics.checkNotNullParameter(typeTitleText, "typeTitleText");
            return new FingerMealTimeRecycleModel(drawPercent, drawText, drawColor, typeTitleText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FingerMealTimeRecycleModel)) {
                return false;
            }
            FingerMealTimeRecycleModel fingerMealTimeRecycleModel = (FingerMealTimeRecycleModel) other;
            return Float.compare(this.drawPercent, fingerMealTimeRecycleModel.drawPercent) == 0 && Intrinsics.areEqual(this.drawText, fingerMealTimeRecycleModel.drawText) && this.drawColor == fingerMealTimeRecycleModel.drawColor && Intrinsics.areEqual(this.typeTitleText, fingerMealTimeRecycleModel.typeTitleText);
        }

        public final int getDrawColor() {
            return this.drawColor;
        }

        public final float getDrawPercent() {
            return this.drawPercent;
        }

        @NotNull
        public final String getDrawText() {
            return this.drawText;
        }

        @NotNull
        public final String getTypeTitleText() {
            return this.typeTitleText;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.drawPercent) * 31) + this.drawText.hashCode()) * 31) + Integer.hashCode(this.drawColor)) * 31) + this.typeTitleText.hashCode();
        }

        @NotNull
        public String toString() {
            return "FingerMealTimeRecycleModel(drawPercent=" + this.drawPercent + ", drawText=" + this.drawText + ", drawColor=" + this.drawColor + ", typeTitleText=" + this.typeTitleText + ")";
        }
    }

    private BloodGlucoseDataUtil() {
    }

    public static /* synthetic */ List createDayEntries$default(BloodGlucoseDataUtil bloodGlucoseDataUtil, Context context, vfe vfeVar, DailyBloodSugarReport dailyBloodSugarReport, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 1;
        }
        return bloodGlucoseDataUtil.createDayEntries(context, vfeVar, dailyBloodSugarReport, i);
    }

    public static /* synthetic */ List createSummaryModelList$default(BloodGlucoseDataUtil bloodGlucoseDataUtil, Context context, StatisticBloodSugar statisticBloodSugar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return bloodGlucoseDataUtil.createSummaryModelList(context, statisticBloodSugar, i);
    }

    public static /* synthetic */ List createWeekMonthEntries$default(BloodGlucoseDataUtil bloodGlucoseDataUtil, Context context, vfe vfeVar, DailyBloodSugarReport dailyBloodSugarReport, boolean z, int i, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return bloodGlucoseDataUtil.createWeekMonthEntries(context, vfeVar, dailyBloodSugarReport, z, i);
    }

    private final int getDistributeColor(int type) {
        if (type == 2) {
            return COLOR_HIGH;
        }
        if (type == 3) {
            return COLOR_LOW;
        }
        if (type != 4) {
            return type != 5 ? COLOR_NORMAL : COLOR_EXTRA_LOW;
        }
        return COLOR_EXTRA_HIGH;
    }

    private final Drawable getLevelDrawable(Context context, int type) {
        if (type == 2) {
            return context.getResources().getDrawable(pni.J2);
        }
        if (type == 3) {
            return context.getResources().getDrawable(pni.K2);
        }
        if (type == 4) {
            return context.getResources().getDrawable(pni.H2);
        }
        if (type != 5) {
            return null;
        }
        return context.getResources().getDrawable(pni.I2);
    }

    private final String getLevelStingRes(Context context, int type) {
        if (type == 2) {
            String string = context.getString(c0j.y0);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (type == 3) {
            String string2 = context.getString(c0j.C0);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (type == 4) {
            String string3 = context.getString(c0j.j0);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (type != 5) {
            return "";
        }
        String string4 = context.getString(c0j.k0);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    private final int getLevelTextColor(int type) {
        if (type != 2) {
            if (type != 3) {
                if (type != 4) {
                    if (type != 5) {
                        return 0;
                    }
                }
            }
            return x44.a(iji.R);
        }
        return x44.a(iji.Q);
    }

    private final String getTypeStingResAndPercent(int type, int percent, Context context) {
        if (type == 2) {
            String string = context.getString(c0j.z0, String.valueOf(percent));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (type == 3) {
            String string2 = context.getString(c0j.D0, String.valueOf(percent));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (type == 4) {
            return context.getString(c0j.j0) + percent + "%";
        }
        if (type != 5) {
            String string3 = context.getString(c0j.N0, String.valueOf(percent));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        return context.getString(c0j.k0) + percent + "%";
    }

    private final int getValueTypeByFloat(float value) {
        List listReversed = CollectionsKt___CollectionsKt.reversed(settValueList);
        int size = listReversed.size();
        for (int i = 0; i < size; i++) {
            if (value < ((Number) listReversed.get(i)).floatValue()) {
                return valueTypeList.get(i).intValue();
            }
        }
        return settValueList.size();
    }

    @NotNull
    public final List<BloodGlucoseEntry> createAGPDetailEntries(@NotNull Context context, @NotNull vfe lineChartAttrs, @Nullable Map<Integer, AGPItem> reportMap, long sportTime) {
        Map<Integer, AGPItem> map = reportMap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lineChartAttrs, "lineChartAttrs");
        ArrayList arrayList = new ArrayList();
        if (map == null) {
            return arrayList;
        }
        new BloodGlucoseEntry(0, -1.0f, sportTime, 2);
        LocalDate localDatePlusDays = TimeDateUtil.timestampToLocalDate(sportTime).plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        int size = reportMap.size() - 1;
        int size2 = reportMap.size() - 1;
        int i = (int) (86400 / ((long) size2));
        int i2 = 0;
        while (i2 < 4) {
            BloodGlucoseEntry bloodGlucoseEntry = new BloodGlucoseEntry(i2, -1.0f, jChangZeroOfTheDay, 2);
            bloodGlucoseEntry.itemType = "days";
            int i3 = size2 / 4;
            if (i2 == 3) {
                i3 += size2 % 4;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            long j = jChangZeroOfTheDay;
            if (size < reportMap.size() - 1) {
                AGPItem aGPItem = map.get(Integer.valueOf(size + 1));
                ListExtKt.add(arrayList2, Float.valueOf(aGPItem != null ? aGPItem.getNinetyValue() : 0.0f));
                ListExtKt.add(arrayList3, Float.valueOf(aGPItem != null ? aGPItem.getTenValue() : 0.0f));
                ListExtKt.add(arrayList4, Float.valueOf(aGPItem != null ? aGPItem.getTwentyFiveValue() : 0.0f));
                ListExtKt.add(arrayList5, Float.valueOf(aGPItem != null ? aGPItem.getSeventyFiveValue() : 0.0f));
                ListExtKt.add(arrayList6, Float.valueOf(aGPItem != null ? aGPItem.getFiftyValue() : 0.0f));
            }
            jChangZeroOfTheDay = j;
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i3;
                ArrayList arrayList7 = arrayList6;
                jChangZeroOfTheDay -= (long) i;
                AGPItem aGPItem2 = map.get(Integer.valueOf(size));
                bloodGlucoseEntry.setY(Math.max(aGPItem2 != null ? aGPItem2.getNinetyValue() : 0.0f, bloodGlucoseEntry.getY()));
                ListExtKt.add(arrayList2, Float.valueOf(aGPItem2 != null ? aGPItem2.getNinetyValue() : 0.0f));
                ListExtKt.add(arrayList3, Float.valueOf(aGPItem2 != null ? aGPItem2.getTenValue() : 0.0f));
                ListExtKt.add(arrayList4, Float.valueOf(aGPItem2 != null ? aGPItem2.getTwentyFiveValue() : 0.0f));
                ListExtKt.add(arrayList5, Float.valueOf(aGPItem2 != null ? aGPItem2.getSeventyFiveValue() : 0.0f));
                ListExtKt.add(arrayList7, Float.valueOf(aGPItem2 != null ? aGPItem2.getFiftyValue() : 0.0f));
                if (size > 0) {
                    size--;
                }
                i4++;
                map = reportMap;
                arrayList6 = arrayList7;
                i3 = i5;
            }
            ArrayList arrayList8 = arrayList6;
            AGPDetailList aGPDetailList = new AGPDetailList(1, arrayList2, arrayList3);
            AGPDetailList aGPDetailList2 = new AGPDetailList(2, arrayList5, arrayList4);
            AGPDetailList aGPDetailList3 = new AGPDetailList(3, arrayList8, arrayList8);
            ListExtKt.add(bloodGlucoseEntry.getDrawAGPList(), aGPDetailList);
            ListExtKt.add(bloodGlucoseEntry.getDrawAGPList(), aGPDetailList2);
            ListExtKt.add(bloodGlucoseEntry.getDrawAGPList(), aGPDetailList3);
            bloodGlucoseEntry.timestamp = jChangZeroOfTheDay;
            arrayList.add(bloodGlucoseEntry);
            i2++;
            map = reportMap;
        }
        return arrayList;
    }

    @NotNull
    public final List<BloodGlucoseEntry> createDayEntries(@NotNull Context context, @NotNull vfe lineChartAttrs, @NotNull DailyBloodSugarReport report, int highLightType) {
        Map<Long, BloodSugarItem> map;
        long j;
        int i = highLightType;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lineChartAttrs, "lineChartAttrs");
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDatePlusDays = TimeDateUtil.timestampToLocalDate(report.getTime()).plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        lineChartAttrs.c = 1;
        int i2 = (int) (86400 / ((long) 288));
        Map<Long, BloodSugarItem> bloodSugarMap = report.getBloodSugarMap();
        Map<Long, List<BloodSugarItem>> fingerBSMap = report.getFingerBSMap();
        BloodGlucoseEntry bloodGlucoseEntry = new BloodGlucoseEntry(0, -1.0f, jChangZeroOfTheDay, 2);
        bloodGlucoseEntry.itemType = "days";
        long j2 = jChangZeroOfTheDay;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        for (int i5 = 288; i3 < i5; i5 = 288) {
            long j3 = j2 - ((long) i2);
            BloodSugarItem bloodSugarItem = bloodSugarMap != null ? bloodSugarMap.get(Long.valueOf(j3)) : null;
            if ((bloodSugarItem != null ? bloodSugarItem.bloodSugar() : -1.0f) > -1.0f && highLightType == 1) {
                z = true;
            }
            int trend = bloodSugarItem != null ? bloodSugarItem.getTrend() : 2;
            float fBloodSugar = (bloodSugarItem != null ? bloodSugarItem.bloodSugar() : -1.0f) > 25.0f ? 25.0f : bloodSugarItem != null ? bloodSugarItem.bloodSugar() : -1.0f;
            int i6 = i2;
            int targetLevel$default = bloodSugarItem != null ? BloodSugarItem.getTargetLevel$default(bloodSugarItem, null, 1, null) : 0;
            String string = context.getString(getTypeStingRes(bloodSugarItem != null ? BloodSugarItem.getTargetLevel$default(bloodSugarItem, null, 1, null) : -1));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ListExtKt.add(bloodGlucoseEntry.getValues(), new BloodGlucoseLineChartData(fBloodSugar, trend, targetLevel$default, string, bloodSugarItem != null ? bloodSugarItem.getTime() : j3));
            List<BloodSugarItem> list = fingerBSMap != null ? fingerBSMap.get(Long.valueOf(j3)) : null;
            if (list != null) {
                Iterator it = list.iterator();
                long j4 = j3;
                boolean z2 = z;
                FingerBSList fingerBSList = null;
                FingerBSList fingerBSList2 = null;
                while (it.hasNext()) {
                    it = it;
                    BloodSugarItem bloodSugarItem2 = (BloodSugarItem) it.next();
                    j3 = j3;
                    long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(bloodSugarItem2.getTime(), j4);
                    long time = bloodSugarItem2.getTime();
                    float fBloodSugar2 = bloodSugarItem2.bloodSugar();
                    bloodSugarMap = bloodSugarMap;
                    int targetLevel$default2 = BloodSugarItem.getTargetLevel$default(bloodSugarItem2, null, 1, null);
                    j4 = jCoerceAtLeast;
                    String string2 = context.getString(getTypeStingRes(BloodSugarItem.getTargetLevel$default(bloodSugarItem2, null, 1, null)));
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Integer measurePeriod = bloodSugarItem2.getMeasurePeriod();
                    FingerBSList fingerBSList3 = new FingerBSList(time, fBloodSugar2, targetLevel$default2, string2, getBloodGlucoseTypeByConstant(context, measurePeriod != null ? measurePeriod.intValue() : 0));
                    if (list.size() == 1) {
                        ListExtKt.add(bloodGlucoseEntry.getFingerBSList(), fingerBSList3);
                        i4++;
                    } else {
                        if (fingerBSList2 == null && fingerBSList == null) {
                            fingerBSList = fingerBSList3;
                            fingerBSList2 = fingerBSList;
                        }
                        if ((fingerBSList != null ? fingerBSList.getValue() : 0.0f) < bloodSugarItem2.bloodSugar()) {
                            fingerBSList = fingerBSList3;
                        }
                        if ((fingerBSList2 != null ? fingerBSList2.getValue() : 0.0f) > bloodSugarItem2.bloodSugar()) {
                            fingerBSList2 = fingerBSList3;
                        }
                    }
                    if (bloodSugarItem2.bloodSugar() > -1.0f && highLightType == 2) {
                        z2 = true;
                    }
                }
                map = bloodSugarMap;
                j = j3;
                if (fingerBSList != null && fingerBSList2 != null) {
                    FingerBSList fingerBSList4 = new FingerBSList(j4, fingerBSList.getValue(), fingerBSList.getLevelType(), fingerBSList.getLevelStingRes(), fingerBSList.getMealTime());
                    ListExtKt.add(bloodGlucoseEntry.getFingerBSList(), new FingerBSList(j, fingerBSList2.getValue(), fingerBSList2.getLevelType(), fingerBSList2.getLevelStingRes(), fingerBSList2.getMealTime()));
                    bloodGlucoseEntry.getFingerHighLightMap().put(Integer.valueOf(i4), fingerBSList4);
                    i4++;
                }
                z = z2;
            } else {
                map = bloodSugarMap;
                j = j3;
            }
            i3++;
            i = highLightType;
            i2 = i6;
            bloodSugarMap = map;
            arrayList = arrayList;
            fingerBSMap = fingerBSMap;
            j2 = j;
        }
        int i7 = i;
        ArrayList arrayList2 = arrayList;
        if (z) {
            bloodGlucoseEntry.setY(1.0f);
        }
        bloodGlucoseEntry.timestamp = j2;
        bloodGlucoseEntry.setHighLightType(i7);
        bloodGlucoseEntry.barEntryTimeType = 1;
        arrayList2.add(bloodGlucoseEntry);
        return arrayList2;
    }

    @NotNull
    public final List<BloodGlucoseEntry> createDaySleepEntries(@NotNull Context context, @NotNull vfe lineChartAttrs, @NotNull SleepBloodSugarData report) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lineChartAttrs, "lineChartAttrs");
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        lineChartAttrs.c = 1;
        if (report.getAnalyzeData().getDataMap() == null) {
            return arrayList;
        }
        Map<Long, BloodSugarItem> dataMap = report.getAnalyzeData().getDataMap();
        BloodGlucoseEntry bloodGlucoseEntry = new BloodGlucoseEntry(0, -1.0f, report.getAnalyzeData().getStartTime(), 2);
        long endTime = report.getAnalyzeData().getEndTime();
        for (long startTime = report.getAnalyzeData().getStartTime(); endTime > startTime; startTime += (long) 300) {
            BloodSugarItem bloodSugarItem = dataMap != null ? dataMap.get(Long.valueOf(startTime)) : null;
            float fBloodSugar = bloodSugarItem != null ? bloodSugarItem.bloodSugar() : -1.0f;
            int targetLevel$default = bloodSugarItem != null ? BloodSugarItem.getTargetLevel$default(bloodSugarItem, null, 1, null) : -1;
            String string = context.getString(getTypeStingRes(bloodSugarItem != null ? BloodSugarItem.getTargetLevel$default(bloodSugarItem, null, 1, null) : -1));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ListExtKt.add(bloodGlucoseEntry.getValues(), new BloodGlucoseLineChartData(fBloodSugar, 0, targetLevel$default, string, bloodSugarItem != null ? bloodSugarItem.getTime() : endTime));
        }
        bloodGlucoseEntry.setValues(CollectionsKt___CollectionsKt.reversed(bloodGlucoseEntry.getValues()));
        bloodGlucoseEntry.setDrawDetailEndTime(Long.valueOf(endTime));
        bloodGlucoseEntry.setHighLightType(1);
        bloodGlucoseEntry.itemType = "time";
        arrayList.add(bloodGlucoseEntry);
        return arrayList;
    }

    @NotNull
    public final List<BloodGlucoseEntry> createDaySportEntries(@NotNull Context context, @NotNull vfe lineChartAttrs, @NotNull SportBloodSugarData report) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lineChartAttrs, "lineChartAttrs");
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        lineChartAttrs.c = 1;
        if (report.getAnalyzeData().getDataMap() == null) {
            return arrayList;
        }
        Map<Long, BloodSugarItem> dataMap = report.getAnalyzeData().getDataMap();
        BloodGlucoseEntry bloodGlucoseEntry = new BloodGlucoseEntry(0, -1.0f, report.getAnalyzeData().getStartTime(), 2);
        long endTime = report.getAnalyzeData().getEndTime();
        for (long startTime = report.getAnalyzeData().getStartTime(); endTime > startTime; startTime += (long) 300) {
            BloodSugarItem bloodSugarItem = dataMap != null ? dataMap.get(Long.valueOf(startTime)) : null;
            float fBloodSugar = bloodSugarItem != null ? bloodSugarItem.bloodSugar() : -1.0f;
            int targetLevel$default = bloodSugarItem != null ? BloodSugarItem.getTargetLevel$default(bloodSugarItem, null, 1, null) : -1;
            String string = context.getString(getTypeStingRes(bloodSugarItem != null ? BloodSugarItem.getTargetLevel$default(bloodSugarItem, null, 1, null) : -1));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ListExtKt.add(bloodGlucoseEntry.getValues(), new BloodGlucoseLineChartData(fBloodSugar, 0, targetLevel$default, string, bloodSugarItem != null ? bloodSugarItem.getTime() : endTime));
        }
        bloodGlucoseEntry.setValues(CollectionsKt___CollectionsKt.reversed(bloodGlucoseEntry.getValues()));
        bloodGlucoseEntry.setDrawDetailEndTime(Long.valueOf(report.getAnalyzeData().getEndTime()));
        bloodGlucoseEntry.setHighLightType(1);
        bloodGlucoseEntry.itemType = "time";
        arrayList.add(bloodGlucoseEntry);
        return arrayList;
    }

    @NotNull
    public final List<uz6> createDistributeData(@NotNull Context context, @NotNull Map<Integer, Integer> bloodSugarList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bloodSugarList, "bloodSugarList");
        LinkedList linkedList = new LinkedList();
        Iterator<Map.Entry<Integer, Integer>> it = bloodSugarList.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().getValue().intValue();
        }
        if (bloodSugarList.get(5) != null) {
            Integer num = bloodSugarList.get(5);
            Intrinsics.checkNotNull(num);
            if (num.intValue() > 0.0f) {
                Integer num2 = bloodSugarList.get(5);
                Intrinsics.checkNotNull(num2);
                int iRoundToInt = MathKt__MathJVMKt.roundToInt((num2.intValue() * 100) / (iIntValue * 1.0f));
                linkedList.add(new uz6(x44.a(getDistributeColor(5)), context.getString(getTypeStingRes(5)), 10, iRoundToInt, String.valueOf(iRoundToInt), "%"));
            }
        }
        if (bloodSugarList.get(3) != null) {
            Integer num3 = bloodSugarList.get(3);
            Intrinsics.checkNotNull(num3);
            if (num3.intValue() > 0.0f) {
                Integer num4 = bloodSugarList.get(3);
                Intrinsics.checkNotNull(num4);
                int iRoundToInt2 = MathKt__MathJVMKt.roundToInt((num4.intValue() * 100) / (iIntValue * 1.0f));
                linkedList.add(new uz6(x44.a(getDistributeColor(3)), context.getString(getTypeStingRes(3)), 10, iRoundToInt2, String.valueOf(iRoundToInt2), "%"));
            }
        }
        if (bloodSugarList.get(1) != null) {
            Integer num5 = bloodSugarList.get(1);
            Intrinsics.checkNotNull(num5);
            if (num5.intValue() > 0.0f) {
                Integer num6 = bloodSugarList.get(1);
                Intrinsics.checkNotNull(num6);
                int iRoundToInt3 = MathKt__MathJVMKt.roundToInt((num6.intValue() * 100) / (iIntValue * 1.0f));
                linkedList.add(new uz6(x44.a(getDistributeColor(1)), context.getString(getTypeStingRes(1)), 10, iRoundToInt3, String.valueOf(iRoundToInt3), "%"));
            }
        }
        if (bloodSugarList.get(2) != null) {
            Integer num7 = bloodSugarList.get(2);
            Intrinsics.checkNotNull(num7);
            if (num7.intValue() > 0.0f) {
                Integer num8 = bloodSugarList.get(2);
                Intrinsics.checkNotNull(num8);
                int iRoundToInt4 = MathKt__MathJVMKt.roundToInt((num8.intValue() * 100) / (iIntValue * 1.0f));
                linkedList.add(new uz6(x44.a(getDistributeColor(2)), context.getString(getTypeStingRes(2)), 10, iRoundToInt4, String.valueOf(iRoundToInt4), "%"));
            }
        }
        if (bloodSugarList.get(4) != null) {
            Integer num9 = bloodSugarList.get(4);
            Intrinsics.checkNotNull(num9);
            if (num9.intValue() > 0.0f) {
                Integer num10 = bloodSugarList.get(4);
                Intrinsics.checkNotNull(num10);
                int iRoundToInt5 = MathKt__MathJVMKt.roundToInt((num10.intValue() * 100) / (iIntValue * 1.0f));
                linkedList.add(new uz6(x44.a(getDistributeColor(4)), context.getString(getTypeStingRes(4)), 10, iRoundToInt5, String.valueOf(iRoundToInt5), "%"));
            }
        }
        DistributeDataUtil.INSTANCE.reviseDistributeDataList(linkedList);
        if (linkedList.size() > 0) {
            uz6 uz6Var = (uz6) CollectionsKt___CollectionsKt.last((List) linkedList);
            uz6Var.h = String.valueOf(uz6Var.f39601a);
        }
        return linkedList;
    }

    @NotNull
    public final List<qpo> createFingerDayModelList(@NotNull Context context, @NotNull PostMealBSDiff statisticDataList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(statisticDataList, "statisticDataList");
        LinkedList linkedList = new LinkedList();
        if (statisticDataList.getBreakfast() != null) {
            String string = context.getString(c0j.o0);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Float breakfast = statisticDataList.getBreakfast();
            Intrinsics.checkNotNull(breakfast);
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(Math.abs(breakfast.floatValue()))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            qpo qpoVar = new qpo(string, str, context.getResources().getQuantityString(qxi.d, 3));
            Float breakfast2 = statisticDataList.getBreakfast();
            Intrinsics.checkNotNull(breakfast2);
            if (Math.abs(breakfast2.floatValue()) > 3.3f) {
                qpoVar.i = context.getResources().getDrawable(pni.J2);
                qpoVar.d = context.getString(c0j.y0);
                qpoVar.h = x44.a(iji.Q);
            }
            linkedList.add(qpoVar);
        }
        if (statisticDataList.getLunch() != null) {
            String string2 = context.getString(c0j.x0);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Float lunch = statisticDataList.getLunch();
            Intrinsics.checkNotNull(lunch);
            String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(Math.abs(lunch.floatValue()))}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            qpo qpoVar2 = new qpo(string2, str2, context.getResources().getQuantityString(qxi.d, 3));
            Float lunch2 = statisticDataList.getLunch();
            Intrinsics.checkNotNull(lunch2);
            if (Math.abs(lunch2.floatValue()) > 3.3f) {
                qpoVar2.i = context.getResources().getDrawable(pni.J2);
                qpoVar2.d = context.getString(c0j.y0);
                qpoVar2.h = x44.a(iji.Q);
            }
            linkedList.add(qpoVar2);
        }
        if (statisticDataList.getDinner() != null) {
            String string3 = context.getString(c0j.r0);
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            Float dinner = statisticDataList.getDinner();
            Intrinsics.checkNotNull(dinner);
            String str3 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(Math.abs(dinner.floatValue()))}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            qpo qpoVar3 = new qpo(string3, str3, context.getResources().getQuantityString(qxi.d, 3));
            Float dinner2 = statisticDataList.getDinner();
            Intrinsics.checkNotNull(dinner2);
            if (Math.abs(dinner2.floatValue()) > 3.3f) {
                qpoVar3.i = context.getResources().getDrawable(pni.J2);
                qpoVar3.d = context.getString(c0j.y0);
                qpoVar3.h = x44.a(iji.Q);
            }
            linkedList.add(qpoVar3);
        }
        return linkedList;
    }

    @NotNull
    public final List<uz6> createFingerDistributeData(@NotNull Context context, @NotNull Map<Integer, Integer> bloodSugarMap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bloodSugarMap, "bloodSugarMap");
        LinkedList linkedList = new LinkedList();
        Integer num = bloodSugarMap.get(3);
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = bloodSugarMap.get(1);
        int iIntValue2 = iIntValue + (num2 != null ? num2.intValue() : 0);
        Integer num3 = bloodSugarMap.get(2);
        int iIntValue3 = iIntValue2 + (num3 != null ? num3.intValue() : 0);
        Integer num4 = bloodSugarMap.get(5);
        int iIntValue4 = iIntValue3 + (num4 != null ? num4.intValue() : 0);
        Integer num5 = bloodSugarMap.get(4);
        int iIntValue5 = iIntValue4 + (num5 != null ? num5.intValue() : 0);
        if (iIntValue5 == 0) {
            return linkedList;
        }
        if (bloodSugarMap.get(5) != null) {
            Integer num6 = bloodSugarMap.get(5);
            Intrinsics.checkNotNull(num6);
            if (num6.intValue() > 0) {
                int iA = x44.a(getDistributeColor(5));
                Integer num7 = bloodSugarMap.get(5);
                Intrinsics.checkNotNull(num7);
                String typeStingResAndPercent = getTypeStingResAndPercent(5, (num7.intValue() * 100) / iIntValue5, context);
                Integer num8 = bloodSugarMap.get(5);
                Intrinsics.checkNotNull(num8);
                int iIntValue6 = (num8.intValue() * 100) / iIntValue5;
                String strValueOf = String.valueOf(bloodSugarMap.get(5));
                Resources resources = context.getResources();
                int i = qxi.common_unit_rowing_machine_count;
                Integer num9 = bloodSugarMap.get(5);
                Intrinsics.checkNotNull(num9);
                uz6 uz6Var = new uz6(iA, typeStingResAndPercent, 11, iIntValue6, strValueOf, resources.getQuantityString(i, num9.intValue()));
                uz6Var.l = 5;
                ListExtKt.add(linkedList, uz6Var);
            }
        }
        if (bloodSugarMap.get(3) != null) {
            Integer num10 = bloodSugarMap.get(3);
            Intrinsics.checkNotNull(num10);
            if (num10.intValue() > 0) {
                int iA2 = x44.a(getDistributeColor(3));
                Integer num11 = bloodSugarMap.get(3);
                Intrinsics.checkNotNull(num11);
                String typeStingResAndPercent2 = getTypeStingResAndPercent(3, (num11.intValue() * 100) / iIntValue5, context);
                Integer num12 = bloodSugarMap.get(3);
                Intrinsics.checkNotNull(num12);
                int iIntValue7 = (num12.intValue() * 100) / iIntValue5;
                String strValueOf2 = String.valueOf(bloodSugarMap.get(3));
                Resources resources2 = context.getResources();
                int i2 = qxi.common_unit_rowing_machine_count;
                Integer num13 = bloodSugarMap.get(3);
                Intrinsics.checkNotNull(num13);
                uz6 uz6Var2 = new uz6(iA2, typeStingResAndPercent2, 11, iIntValue7, strValueOf2, resources2.getQuantityString(i2, num13.intValue()));
                uz6Var2.l = 3;
                ListExtKt.add(linkedList, uz6Var2);
            }
        }
        if (bloodSugarMap.get(1) != null) {
            Integer num14 = bloodSugarMap.get(1);
            Intrinsics.checkNotNull(num14);
            if (num14.intValue() > 0) {
                int iA3 = x44.a(getDistributeColor(1));
                Integer num15 = bloodSugarMap.get(1);
                Intrinsics.checkNotNull(num15);
                String typeStingResAndPercent3 = getTypeStingResAndPercent(1, (num15.intValue() * 100) / iIntValue5, context);
                Integer num16 = bloodSugarMap.get(1);
                Intrinsics.checkNotNull(num16);
                int iIntValue8 = (num16.intValue() * 100) / iIntValue5;
                String strValueOf3 = String.valueOf(bloodSugarMap.get(1));
                Resources resources3 = context.getResources();
                int i3 = qxi.common_unit_rowing_machine_count;
                Integer num17 = bloodSugarMap.get(1);
                Intrinsics.checkNotNull(num17);
                uz6 uz6Var3 = new uz6(iA3, typeStingResAndPercent3, 11, iIntValue8, strValueOf3, resources3.getQuantityString(i3, num17.intValue()));
                uz6Var3.l = 1;
                ListExtKt.add(linkedList, uz6Var3);
            }
        }
        if (bloodSugarMap.get(2) != null) {
            Integer num18 = bloodSugarMap.get(2);
            Intrinsics.checkNotNull(num18);
            if (num18.intValue() > 0) {
                int iA4 = x44.a(getDistributeColor(2));
                Integer num19 = bloodSugarMap.get(2);
                Intrinsics.checkNotNull(num19);
                String typeStingResAndPercent4 = getTypeStingResAndPercent(2, (num19.intValue() * 100) / iIntValue5, context);
                Integer num20 = bloodSugarMap.get(2);
                Intrinsics.checkNotNull(num20);
                int iIntValue9 = (num20.intValue() * 100) / iIntValue5;
                String strValueOf4 = String.valueOf(bloodSugarMap.get(2));
                Resources resources4 = context.getResources();
                int i4 = qxi.common_unit_rowing_machine_count;
                Integer num21 = bloodSugarMap.get(2);
                Intrinsics.checkNotNull(num21);
                uz6 uz6Var4 = new uz6(iA4, typeStingResAndPercent4, 11, iIntValue9, strValueOf4, resources4.getQuantityString(i4, num21.intValue()));
                uz6Var4.l = 2;
                ListExtKt.add(linkedList, uz6Var4);
            }
        }
        if (bloodSugarMap.get(4) != null) {
            Integer num22 = bloodSugarMap.get(4);
            Intrinsics.checkNotNull(num22);
            if (num22.intValue() > 0) {
                int iA5 = x44.a(getDistributeColor(4));
                Integer num23 = bloodSugarMap.get(4);
                Intrinsics.checkNotNull(num23);
                String typeStingResAndPercent5 = getTypeStingResAndPercent(4, (num23.intValue() * 100) / iIntValue5, context);
                Integer num24 = bloodSugarMap.get(4);
                Intrinsics.checkNotNull(num24);
                int iIntValue10 = (num24.intValue() * 100) / iIntValue5;
                String strValueOf5 = String.valueOf(bloodSugarMap.get(4));
                Resources resources5 = context.getResources();
                int i5 = qxi.common_unit_rowing_machine_count;
                Integer num25 = bloodSugarMap.get(4);
                Intrinsics.checkNotNull(num25);
                uz6 uz6Var5 = new uz6(iA5, typeStingResAndPercent5, 11, iIntValue10, strValueOf5, resources5.getQuantityString(i5, num25.intValue()));
                uz6Var5.l = 4;
                ListExtKt.add(linkedList, uz6Var5);
            }
        }
        DistributeDataUtil.INSTANCE.reviseDistributeDataList(linkedList);
        uz6 uz6Var6 = (uz6) CollectionsKt___CollectionsKt.last((List) linkedList);
        uz6Var6.g = getTypeStingResAndPercent(uz6Var6.l, uz6Var6.f39601a, context);
        return linkedList;
    }

    @NotNull
    public final List<FingerMealTimeRecycleModel> createFingerMealTimeModelList(@NotNull Context context, @NotNull Map<Integer, Float> mDataList, float maxValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i < 9; i++) {
            Float f = mDataList.get(Integer.valueOf(i));
            if (f == null || f.floatValue() < 0.0f) {
                ListExtKt.add(linkedList, new FingerMealTimeRecycleModel(0.0f, "--", x44.a(iji.I3), getBloodGlucoseTypeByConstant(context, i)));
            } else {
                ListExtKt.add(linkedList, new FingerMealTimeRecycleModel(maxValue > 0.0f ? (f.floatValue() * 100) / maxValue : 100.0f, f.toString(), getFingerBgColor(getValueTypeByFloat(f.floatValue())), getBloodGlucoseTypeByConstant(context, i)));
            }
        }
        return linkedList;
    }

    @NotNull
    public final List<MaxMinEntry> createSleepDayEntries(@NotNull vfe lineChartAttrs, @NotNull List<BloodSugarItem> report) {
        Intrinsics.checkNotNullParameter(lineChartAttrs, "lineChartAttrs");
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        int size = report.size();
        lineChartAttrs.c = size;
        int i = 0;
        for (BloodSugarItem bloodSugarItem : report) {
            MaxMinEntry maxMinEntry = new MaxMinEntry(i, bloodSugarItem.bloodSugar(), bloodSugarItem.getTime(), (i == 0 || i == size + (-1)) ? 2 : 3);
            maxMinEntry.timestamp = bloodSugarItem.getTime();
            i++;
            arrayList.add(maxMinEntry);
        }
        return arrayList;
    }

    @NotNull
    public final List<qpo> createSummaryModelList(@NotNull Context context, @NotNull StatisticBloodSugar statisticDataList, int type) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(statisticDataList, "statisticDataList");
        LinkedList linkedList = new LinkedList();
        if (statisticDataList.getMaxItem().bloodSugar() != 0.0f) {
            String levelStingRes = getLevelStingRes(context, BloodSugarItem.getTargetLevel$default(statisticDataList.getMaxItem(), null, 1, null));
            int levelTextColor = getLevelTextColor(BloodSugarItem.getTargetLevel$default(statisticDataList.getMaxItem(), null, 1, null));
            Drawable levelDrawable = getLevelDrawable(context, BloodSugarItem.getTargetLevel$default(statisticDataList.getMaxItem(), null, 1, null));
            if (type == 1) {
                string2 = context.getString(c0j.I0);
            } else {
                int i = c0j.t0;
                Object[] objArr = new Object[1];
                Integer measurePeriod = statisticDataList.getMaxItem().getMeasurePeriod();
                objArr[0] = getBloodGlucoseTypeByConstant(context, measurePeriod != null ? measurePeriod.intValue() : -1);
                string2 = context.getString(i, objArr);
            }
            String str = string2;
            Intrinsics.checkNotNull(str);
            linkedList.add(new qpo(str, String.valueOf(statisticDataList.getMaxItem().bloodSugar()), context.getResources().getQuantityString(qxi.d, 3), levelStingRes, levelTextColor, levelDrawable));
        }
        if (statisticDataList.getMinItem().bloodSugar() != 0.0f) {
            String levelStingRes2 = getLevelStingRes(context, BloodSugarItem.getTargetLevel$default(statisticDataList.getMinItem(), null, 1, null));
            int levelTextColor2 = getLevelTextColor(BloodSugarItem.getTargetLevel$default(statisticDataList.getMinItem(), null, 1, null));
            Drawable levelDrawable2 = getLevelDrawable(context, BloodSugarItem.getTargetLevel$default(statisticDataList.getMinItem(), null, 1, null));
            if (type == 1) {
                string = context.getString(c0j.K0);
            } else {
                int i2 = c0j.w0;
                Object[] objArr2 = new Object[1];
                Integer measurePeriod2 = statisticDataList.getMinItem().getMeasurePeriod();
                objArr2[0] = getBloodGlucoseTypeByConstant(context, measurePeriod2 != null ? measurePeriod2.intValue() : -1);
                string = context.getString(i2, objArr2);
            }
            String str2 = string;
            Intrinsics.checkNotNull(str2);
            linkedList.add(new qpo(str2, String.valueOf(statisticDataList.getMinItem().bloodSugar()), context.getResources().getQuantityString(qxi.d, 3), levelStingRes2, levelTextColor2, levelDrawable2));
        }
        if (statisticDataList.getAvgItem().bloodSugar() != 0.0f && type == 1) {
            linkedList.add(new qpo(context.getString(c0j.e0), String.valueOf(statisticDataList.getAvgItem().bloodSugar()), context.getResources().getQuantityString(qxi.d, 3), getLevelStingRes(context, BloodSugarItem.getTargetLevel$default(statisticDataList.getAvgItem(), null, 1, null)), getLevelTextColor(BloodSugarItem.getTargetLevel$default(statisticDataList.getAvgItem(), null, 1, null)), getLevelDrawable(context, BloodSugarItem.getTargetLevel$default(statisticDataList.getAvgItem(), null, 1, null))));
        }
        return linkedList;
    }

    @NotNull
    public final List<BloodGlucoseEntry> createWeekMonthEntries(@NotNull Context context, @NotNull vfe lineChartAttrs, @NotNull DailyBloodSugarReport report, boolean isWeek, int highLightType) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        long j;
        float fBloodSugar;
        Map<Long, List<BloodSugarItem>> map;
        long j2;
        long j3;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lineChartAttrs, "lineChartAttrs");
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        boolean z2 = true;
        if (isWeek) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(firstDayOfMonth);
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDatePlusMonths);
        long j4 = isWeek ? 168L : ((jChangZeroOfTheDay2 - jChangZeroOfTheDay) / 86400) * ((long) 24);
        Map<Long, BloodSugarItem> bloodSugarMap = report.getBloodSugarMap();
        lineChartAttrs.c = 1;
        Map<Long, List<BloodSugarItem>> fingerBSMap = report.getFingerBSMap();
        BloodGlucoseEntry bloodGlucoseEntry = new BloodGlucoseEntry(0, 0.0f, jChangZeroOfTheDay2, 2);
        bloodGlucoseEntry.itemType = isWeek ? "weeks" : "months";
        long j5 = 0;
        if (0 <= j4) {
            boolean z3 = false;
            int i = 0;
            while (true) {
                BloodSugarItem bloodSugarItem = bloodSugarMap != null ? bloodSugarMap.get(Long.valueOf(jChangZeroOfTheDay2)) : null;
                if ((bloodSugarItem != null ? bloodSugarItem.bloodSugar() : -1.0f) > -1.0f) {
                    z3 = z2;
                }
                int trend = bloodSugarItem != null ? bloodSugarItem.getTrend() : 2;
                if ((bloodSugarItem != null ? bloodSugarItem.bloodSugar() : -1.0f) > 25.0f) {
                    fBloodSugar = 25.0f;
                } else {
                    fBloodSugar = bloodSugarItem != null ? bloodSugarItem.bloodSugar() : -1.0f;
                }
                Map<Long, BloodSugarItem> map2 = bloodSugarMap;
                int targetLevel$default = bloodSugarItem != null ? BloodSugarItem.getTargetLevel$default(bloodSugarItem, null, 1, null) : 0;
                String string = context.getString(getTypeStingRes(bloodSugarItem != null ? BloodSugarItem.getTargetLevel$default(bloodSugarItem, null, 1, null) : -1));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ListExtKt.add(bloodGlucoseEntry.getValues(), new BloodGlucoseLineChartData(fBloodSugar, trend, targetLevel$default, string, bloodSugarItem != null ? bloodSugarItem.getTime() : jChangZeroOfTheDay2));
                int i2 = 0;
                while (i2 < 12) {
                    long j6 = jChangZeroOfTheDay2 + ((long) (i2 * 300));
                    List<BloodSugarItem> list = fingerBSMap != null ? fingerBSMap.get(Long.valueOf(j6)) : null;
                    if (list != null) {
                        Iterator it = list.iterator();
                        j2 = jChangZeroOfTheDay;
                        long j7 = j6;
                        FingerBSList fingerBSList = null;
                        int i3 = 0;
                        FingerBSList fingerBSList2 = null;
                        while (it.hasNext()) {
                            int i4 = i3 + 1;
                            Map<Long, List<BloodSugarItem>> map3 = fingerBSMap;
                            BloodSugarItem bloodSugarItem2 = (BloodSugarItem) it.next();
                            long j8 = j5;
                            long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(bloodSugarItem2.getTime(), j7);
                            long time = bloodSugarItem2.getTime();
                            float fBloodSugar2 = bloodSugarItem2.bloodSugar();
                            it = it;
                            int targetLevel$default2 = BloodSugarItem.getTargetLevel$default(bloodSugarItem2, null, 1, null);
                            String string2 = context.getString(getTypeStingRes(BloodSugarItem.getTargetLevel$default(bloodSugarItem2, null, 1, null)));
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            Integer measurePeriod = bloodSugarItem2.getMeasurePeriod();
                            FingerBSList fingerBSList3 = new FingerBSList(time, fBloodSugar2, targetLevel$default2, string2, getBloodGlucoseTypeByConstant(context, measurePeriod != null ? measurePeriod.intValue() : 0));
                            if (i3 > 0) {
                                if ((fingerBSList != null ? fingerBSList.getValue() : 0.0f) < bloodSugarItem2.bloodSugar()) {
                                    fingerBSList = fingerBSList3;
                                }
                                if ((fingerBSList2 != null ? fingerBSList2.getValue() : 0.0f) > bloodSugarItem2.bloodSugar()) {
                                    fingerBSList2 = fingerBSList3;
                                }
                                z = true;
                            } else {
                                z = true;
                                if (list.size() == 1) {
                                    ListExtKt.add(bloodGlucoseEntry.getFingerBSList(), fingerBSList3);
                                    i++;
                                } else {
                                    fingerBSList2 = fingerBSList3;
                                }
                            }
                            if (bloodSugarItem2.bloodSugar() > -1.0f && highLightType == 2) {
                                z3 = z;
                            }
                            i3 = i4;
                            j7 = jCoerceAtLeast;
                            fingerBSMap = map3;
                            j5 = j8;
                        }
                        map = fingerBSMap;
                        j3 = j5;
                        if (fingerBSList != null && fingerBSList2 != null) {
                            FingerBSList fingerBSList4 = new FingerBSList(j7, fingerBSList.getValue(), fingerBSList.getLevelType(), fingerBSList.getLevelStingRes(), fingerBSList.getMealTime());
                            ListExtKt.add(bloodGlucoseEntry.getFingerBSList(), new FingerBSList(j6, fingerBSList2.getValue(), fingerBSList2.getLevelType(), fingerBSList2.getLevelStingRes(), fingerBSList2.getMealTime()));
                            bloodGlucoseEntry.getFingerHighLightMap().put(Integer.valueOf(i), fingerBSList4);
                            i++;
                        }
                    } else {
                        map = fingerBSMap;
                        j2 = jChangZeroOfTheDay;
                        j3 = j5;
                    }
                    i2++;
                    jChangZeroOfTheDay = j2;
                    fingerBSMap = map;
                    j5 = j3;
                }
                Map<Long, List<BloodSugarItem>> map4 = fingerBSMap;
                j = jChangZeroOfTheDay;
                long j9 = j5;
                jChangZeroOfTheDay2 -= TimeDateUtil.TIME_HOUR;
                if (j9 == j4) {
                    break;
                }
                jChangZeroOfTheDay = j;
                fingerBSMap = map4;
                z2 = true;
                j5 = j9 + 1;
                bloodSugarMap = map2;
            }
            if (z3) {
                bloodGlucoseEntry.setY(1.0f);
            }
        } else {
            j = jChangZeroOfTheDay;
        }
        long j10 = j;
        bloodGlucoseEntry.timestamp = j10;
        bloodGlucoseEntry.localDate = TimeDateUtil.timestampToLocalDate(j10);
        bloodGlucoseEntry.setHighLightType(highLightType);
        arrayList.add(bloodGlucoseEntry);
        return arrayList;
    }

    public final int getBloodGlucoseStrByConstant(int constant) {
        switch (constant) {
            case 1:
                return c0j.i0;
            case 2:
                return c0j.l0;
            case 3:
                return c0j.Q0;
            case 4:
                return c0j.U0;
            case 5:
                return c0j.S0;
            case 6:
                return c0j.T0;
            case 7:
                return c0j.R0;
            case 8:
                return c0j.f0;
            case 9:
                return c0j.V0;
            default:
                return c0j.V0;
        }
    }

    @NotNull
    public final String getBloodGlucoseTypeByConstant(@NotNull Context context, int constant) {
        Intrinsics.checkNotNullParameter(context, "context");
        switch (constant) {
            case 1:
                String string = context.getString(c0j.i0);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case 2:
                String string2 = context.getString(c0j.l0);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = context.getString(c0j.Q0);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 4:
                String string4 = context.getString(c0j.U0);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 5:
                String string5 = context.getString(c0j.S0);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 6:
                String string6 = context.getString(c0j.T0);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 7:
                String string7 = context.getString(c0j.R0);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 8:
                String string8 = context.getString(c0j.f0);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 9:
                String string9 = context.getString(c0j.V0);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            default:
                String string10 = context.getString(c0j.V0);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
        }
    }

    public final int getFingerBgColor(int type) {
        if (type == 2) {
            return x44.a(iji.N);
        }
        if (type == 3) {
            return x44.a(iji.O);
        }
        if (type != 4) {
            return type != 5 ? x44.a(iji.S) : x44.a(iji.M);
        }
        return x44.a(iji.L);
    }

    public final int getRecordLevelDrawable(int type) {
        if (type == 2) {
            return pni.J2;
        }
        if (type == 3) {
            return pni.K2;
        }
        if (type != 4) {
            return type != 5 ? pni.L2 : pni.I2;
        }
        return pni.H2;
    }

    public final int getRecordLevelTextColor(int type) {
        if (type != 2) {
            if (type != 3) {
                if (type != 4) {
                    if (type != 5) {
                        return x44.a(iji.S);
                    }
                }
            }
            return x44.a(iji.R);
        }
        return x44.a(iji.Q);
    }

    public final int getTypeStingRes(int type) {
        if (type == 2) {
            return c0j.y0;
        }
        if (type == 3) {
            return c0j.C0;
        }
        if (type != 4) {
            return type != 5 ? c0j.M0 : c0j.k0;
        }
        return c0j.j0;
    }

    public final void initLineColor(float settingLowValue, float settingHighValue, @NotNull BloodGlucoseLineChartItemDecoration mItemDecoration) {
        Intrinsics.checkNotNullParameter(mItemDecoration, "mItemDecoration");
        ArrayList arrayList = new ArrayList();
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.L)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.N)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.P)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.O)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.M)));
        List<Float> list = settValueList;
        list.clear();
        list.add(Float.valueOf(3.0f));
        list.add(Float.valueOf(settingLowValue));
        list.add(Float.valueOf(settingHighValue));
        list.add(Float.valueOf(13.9f));
        mItemDecoration.setPointLineColor(arrayList, list);
    }
}
