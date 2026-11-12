package com.xiaomi.hm.health.healthdata.repository;

import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.util.SparseArrayKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.data.XAxisData;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.StressDataType;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ui.view.ArmChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.BMIChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.BloodPressureChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.BloodSugarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.BmrChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.BodyFatChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.BoneChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.CalfChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.ChestChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.HipChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.MuscleChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.ProteinChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.SkeletalMuscleChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.StressBarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.SubcutaneousFatChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.TempBarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.TempSubLineAndPointChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.TemperatureChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.ThighChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.VisFatChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.WaistChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.WaterChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.TempMixLineChartBuilderData;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.Sleep;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010$J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015J:\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00122\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "", "Ljava/util/Date;", "start", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "f", "a", "date", GoogleApiAvailabilityLight.a, "", "time", "e", "b", "c", "g", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "points", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "type", "Lcom/xiaomi/hm/health/healthdata/ui/view/LineChartBuilder;", "getChartBuilder", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "dataType", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "getBarChartBuilder", "Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempMixLineChartBuilderData;", "builderData", "Lcom/xiaomi/hm/health/healthdata/ui/view/TempSubLineAndPointChartBuilder;", "getTempMixLineChartBuilder", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ChartRepo {

    @NotNull
    private static final String a = "HealthData-ChartRepo";
    private static final int b = 3600;
    private static final int c = 5;
    private static final int d = 7;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HealthDataType.values().length];
            iArr[HealthDataType.CHEST.ordinal()] = 1;
            iArr[HealthDataType.WAIST.ordinal()] = 2;
            iArr[HealthDataType.HIP.ordinal()] = 3;
            iArr[HealthDataType.ARM.ordinal()] = 4;
            iArr[HealthDataType.THIGH.ordinal()] = 5;
            iArr[HealthDataType.CALF.ordinal()] = 6;
            iArr[HealthDataType.BODY_FAT.ordinal()] = 7;
            iArr[HealthDataType.BMI.ordinal()] = 8;
            iArr[HealthDataType.MUSCLE.ordinal()] = 9;
            iArr[HealthDataType.WATER.ordinal()] = 10;
            iArr[HealthDataType.PROTEIN.ordinal()] = 11;
            iArr[HealthDataType.BASAL_METABOLISM.ordinal()] = 12;
            iArr[HealthDataType.VISCERAL_FAT.ordinal()] = 13;
            iArr[HealthDataType.BONE.ordinal()] = 14;
            iArr[HealthDataType.TEMPERATURE.ordinal()] = 15;
            iArr[HealthDataType.BLOOD_SUGAR.ordinal()] = 16;
            iArr[HealthDataType.BLOOD_PRESSURE.ordinal()] = 17;
            iArr[HealthDataType.SKELETAL_MUSCLE.ordinal()] = 18;
            iArr[HealthDataType.SUBCUTANEOUS_FAT.ordinal()] = 19;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TimeMode.values().length];
            iArr2[TimeMode.DAY.ordinal()] = 1;
            iArr2[TimeMode.WEEK.ordinal()] = 2;
            iArr2[TimeMode.MONTH.ordinal()] = 3;
            iArr2[TimeMode.YEAR.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends BarChartVo<Number>>> {
        public final /* synthetic */ List<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<BarChartVo<Number>> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends BarChartVo<Number>> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/ArrayList;", "Lcom/huami/chart/data/RangeIndex;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a1 extends Lambda implements Function0<ArrayList<RangeIndex>> {
        public final /* synthetic */ TempMixLineChartBuilderData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(TempMixLineChartBuilderData tempMixLineChartBuilderData) {
            super(0);
            this.a = tempMixLineChartBuilderData;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<RangeIndex> invoke() {
            return this.a.getSubIndex();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b1 extends Lambda implements Function0<ArrayList<int[]>> {
        public final /* synthetic */ TempMixLineChartBuilderData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(TempMixLineChartBuilderData tempMixLineChartBuilderData) {
            super(0);
            this.a = tempMixLineChartBuilderData;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<int[]> invoke() {
            return this.a.getSubIndexShadowColors();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<List<? extends BarChartVo<Number>>> {
        public final /* synthetic */ List<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<BarChartVo<Number>> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends BarChartVo<Number>> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c0 extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c1 extends Lambda implements Function0<ArrayList<Integer>> {
        public final /* synthetic */ TempMixLineChartBuilderData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(TempMixLineChartBuilderData tempMixLineChartBuilderData) {
            super(0);
            this.a = tempMixLineChartBuilderData;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<Integer> invoke() {
            return this.a.getSubPointIndex();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Integer> {
        public final /* synthetic */ TimeMode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TimeMode timeMode) {
            super(0);
            this.a = timeMode;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return this.a == TimeMode.DAY ? 288 : null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d1 extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getWeekXAxisData..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e0 extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e1 extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getYearXAxisData..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Float, Integer> {
        public final /* synthetic */ TimeMode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TimeMode timeMode) {
            super(1);
            this.a = timeMode;
        }

        public final int a(float f) {
            return this.a == TimeMode.DAY ? HealthDataUtils.INSTANCE.getStressBarColor(f) : ContextCompat.getColor(BraceletApp.getContext(), R.color.s33);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Float f) {
            return Integer.valueOf(a(f.floatValue()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f0 extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<List<? extends BarChartVo<Number>>> {
        public final /* synthetic */ List<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<BarChartVo<Number>> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends BarChartVo<Number>> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g0 extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h0 extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i0 extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j0 extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k0 extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l0 extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m0 extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n0 extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o0 extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p0 extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q0 extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r0 extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s0 extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t0 extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u0 extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getDailyXAxisData..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v0 extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getMonthXAxisData..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Sleep a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(Sleep sleep) {
            super(0);
            this.a = sleep;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getSleepXAxisData...sleep:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x0 extends Lambda implements Function0<String> {
        public final /* synthetic */ SparseArray<XAxisData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(SparseArray<XAxisData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getSleepXAxisData...xAxisList:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ List<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(List<HealthChartDataVo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y0 extends Lambda implements Function0<List<? extends HealthChartDataVo>> {
        public final /* synthetic */ TempMixLineChartBuilderData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(TempMixLineChartBuilderData tempMixLineChartBuilderData) {
            super(0);
            this.a = tempMixLineChartBuilderData;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends HealthChartDataVo> invoke() {
            return this.a.getChartData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ TimeMode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Date date, TimeMode timeMode) {
            super(0);
            this.b = date;
            this.c = timeMode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z0 extends Lambda implements Function0<SparseArray<XAxisData>> {
        public final /* synthetic */ TempMixLineChartBuilderData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(TempMixLineChartBuilderData tempMixLineChartBuilderData) {
            super(0);
            this.b = tempMixLineChartBuilderData;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SparseArray<XAxisData> invoke() {
            return ChartRepo.this.f(this.b.getStartDate(), TimeMode.DAY);
        }
    }

    private final SparseArray<XAxisData> a() {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        String[] strArr = {"00:00", "06:00", "12:00", "18:00", "23:59"};
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            int i4 = i2 * 21600;
            sparseArray.put(i4, new XAxisData(i4, strArr[i2]));
            if (i3 >= 5) {
                HMLog.debug(a, new u0(sparseArray));
                return sparseArray;
            }
            i2 = i3;
        }
    }

    private final long b(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(kotlin.text.m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null) ? 1 : 2);
        calendar.setTimeInMillis(time);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final SparseArray<XAxisData> c(Date start) {
        Calendar calendar = Calendar.getInstance();
        HealthDataTimeUtils healthDataTimeUtils = HealthDataTimeUtils.INSTANCE;
        calendar.setTimeInMillis(healthDataTimeUtils.getFirstDayOfMonthTime(start.getTime()));
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        sparseArray.put(1, new XAxisData(1, healthDataTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        calendar.set(5, 10);
        sparseArray.put(10, new XAxisData(10, healthDataTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        calendar.set(5, 20);
        sparseArray.put(20, new XAxisData(20, healthDataTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        int actualMaximum = calendar.getActualMaximum(5);
        calendar.set(5, actualMaximum);
        sparseArray.put(actualMaximum, new XAxisData(actualMaximum, healthDataTimeUtils.formatTimeMD(calendar.getTimeInMillis())));
        HMLog.debug(a, new v0(sparseArray));
        return sparseArray;
    }

    private final SparseArray<XAxisData> d(Date date) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        HealthDataTimeUtils healthDataTimeUtils = HealthDataTimeUtils.INSTANCE;
        HMSummery hMSummery = (HMSummery) CollectionsKt.getOrNull(SportDataManager.getInstance().getDaySummery(), SportDataManager.getInstance().getIndex(healthDataTimeUtils.formatDate(date, "yyyy-MM-dd")));
        Sleep sleep = hMSummery == null ? null : hMSummery.sleep;
        if (sleep == null || sleep.sleepMinutes == 0) {
            SparseArrayKt.putAll(sparseArray, a());
        } else {
            HMLog.debug(a, new w0(sleep));
            sparseArray.put(0, new XAxisData(0, healthDataTimeUtils.formatTimeHHmm(sleep.st)));
            long j2 = sleep.st;
            long j3 = sleep.ed;
            long j4 = 2;
            long j5 = ((j3 - j2) / j4) + j2;
            long j6 = (j3 - j2) / j4;
            long j7 = 1000;
            int i2 = (int) (j6 / j7);
            sparseArray.put(i2, new XAxisData(i2, healthDataTimeUtils.formatTimeHHmm(j5)));
            int i3 = (int) ((sleep.ed - sleep.st) / j7);
            sparseArray.put(i3, new XAxisData(i3, healthDataTimeUtils.formatTimeHHmm(sleep.ed)));
        }
        HMLog.debug(a, new x0(sparseArray));
        return sparseArray;
    }

    private final SparseArray<XAxisData> e(long time) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(b(time));
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            sparseArray.put(i2, new XAxisData(i2, calendar.getDisplayName(7, 1, Locale.getDefault())));
            calendar.add(6, 1);
            if (i3 > 7) {
                HMLog.debug(a, new d1(sparseArray));
                return sparseArray;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparseArray<XAxisData> f(Date start, TimeMode timeMode) {
        int i2 = WhenMappings.$EnumSwitchMapping$1[timeMode.ordinal()];
        if (i2 == 1) {
            return a();
        }
        if (i2 == 2) {
            return e(start.getTime());
        }
        if (i2 == 3) {
            return c(start);
        }
        if (i2 == 4) {
            return g(start);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final SparseArray<XAxisData> g(Date start) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        int maximum = calendar.getMaximum(2);
        int i2 = 1;
        int i3 = maximum + 1;
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        if (1 <= i3) {
            while (true) {
                int i4 = i2 + 1;
                sparseArray.put(i2, new XAxisData(i2, String.valueOf(i2)));
                if (i2 == i3) {
                    break;
                }
                i2 = i4;
            }
        }
        HMLog.debug(a, new e1(sparseArray));
        return sparseArray;
    }

    @Nullable
    public final BarChartBuilder<Number> getBarChartBuilder(@NotNull Date start, @NotNull TimeMode timeMode, @NotNull List<BarChartVo<Number>> points, @NotNull DataType dataType) {
        if (dataType == HealthDataType.BLOOD_PRESSURE) {
            return new BloodPressureChartBuilder(new a(points), new b(start, timeMode));
        }
        if (dataType instanceof StressDataType) {
            return new StressBarChartBuilder(new c(points), new d(timeMode), new e(start, timeMode), new f(timeMode), timeMode == TimeMode.DAY);
        }
        if (dataType instanceof TemperatureDataType) {
            return new TempBarChartBuilder(new g(points), new h(start, timeMode));
        }
        return null;
    }

    @NotNull
    public final LineChartBuilder getChartBuilder(@NotNull Date start, @NotNull TimeMode timeMode, @NotNull List<HealthChartDataVo> points, @NotNull HealthDataType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new ChestChartBuilder(new s(points), new d0(start, timeMode));
            case 2:
                return new WaistChartBuilder(new n0(points), new o0(start, timeMode));
            case 3:
                return new HipChartBuilder(new p0(points), new q0(start, timeMode));
            case 4:
                return new ArmChartBuilder(new r0(points), new s0(start, timeMode));
            case 5:
                return new ThighChartBuilder(new t0(points), new i(start, timeMode));
            case 6:
                return new CalfChartBuilder(new j(points), new k(start, timeMode));
            case 7:
                return new BodyFatChartBuilder(new l(points), new m(start, timeMode));
            case 8:
                return new BMIChartBuilder(new n(points), new o(start, timeMode));
            case 9:
                return new MuscleChartBuilder(new p(points), new q(start, timeMode));
            case 10:
                return new WaterChartBuilder(new r(points), new t(start, timeMode));
            case 11:
                return new ProteinChartBuilder(new u(points), new v(start, timeMode));
            case 12:
                return new BmrChartBuilder(new w(points), new x(start, timeMode));
            case 13:
                return new VisFatChartBuilder(new y(points), new z(start, timeMode));
            case 14:
                return new BoneChartBuilder(new a0(points), new b0(start, timeMode));
            case 15:
                return new TemperatureChartBuilder(new c0(points), new e0(start, timeMode));
            case 16:
                return new BloodSugarChartBuilder(new f0(points), new g0(start, timeMode));
            case 17:
                return new ArmChartBuilder(new h0(points), new i0(start, timeMode));
            case 18:
                return new SkeletalMuscleChartBuilder(new j0(points), new k0(start, timeMode));
            case 19:
                return new SubcutaneousFatChartBuilder(new l0(points), new m0(start, timeMode));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public final TempSubLineAndPointChartBuilder getTempMixLineChartBuilder(@NotNull TempMixLineChartBuilderData builderData) {
        return new TempSubLineAndPointChartBuilder(new y0(builderData), new z0(builderData), new a1(builderData), new b1(builderData), new c1(builderData));
    }
}
