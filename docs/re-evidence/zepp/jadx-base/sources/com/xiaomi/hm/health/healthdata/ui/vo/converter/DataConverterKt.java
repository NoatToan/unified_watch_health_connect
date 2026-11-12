package com.xiaomi.hm.health.healthdata.ui.vo.converter;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.model.Stress;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.healthdata.core.dao.BloodPressureDecoration;
import com.xiaomi.hm.health.healthdata.core.dto.AvgItemDto;
import com.xiaomi.hm.health.healthdata.core.dto.BarDto;
import com.xiaomi.hm.health.healthdata.core.dto.BpDto;
import com.xiaomi.hm.health.healthdata.core.dto.DataItemDto;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils.TempUtils;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import com.xiaomi.hm.health.healthdata.ui.vo.HistoryItem;
import com.xiaomi.hm.health.healthdata.ui.vo.TimeParam;
import com.xiaomi.hm.health.healthdata.utils.BodyCompositionUtilsKt;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a,\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0000*\b\u0012\u0004\u0012\u00020\u00060\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\f0\u00002\u0006\u0010\r\u001a\u00020\u0007\u001a \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\f0\u00002\u0006\u0010\r\u001a\u00020\u0007H\u0002\u001a\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\f0\u00002\u0006\u0010\u0010\u001a\u00020\u000f\u001a&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0000*\b\u0012\u0004\u0012\u00020\u00060\u00002\u0006\u0010\r\u001a\u00020\u0007H\u0002\u001a\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002\u001a\u001e\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0000*\b\u0012\u0004\u0012\u00020\u00060\u0000H\u0002\u001a\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a\u001e\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0000*\b\u0012\u0004\u0012\u00020\u00060\u0000H\u0002\u001a\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a\u001e\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0000*\b\u0012\u0004\u0012\u00020\u00060\u0000H\u0002\u001a\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0000*\b\u0012\u0004\u0012\u00020 0\u0000\u001a\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u0000*\b\u0012\u0004\u0012\u00020#0\u0000\u001a>\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0%0\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u0013H\u0002\u001a,\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0%0\u00002\u0006\u0010'\u001a\u00020&H\u0002\u001aD\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0%0\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u0013\u001a,\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0%0\u00002\u0006\u0010'\u001a\u00020&H\u0002\u001a,\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0%0\u00002\u0006\u0010'\u001a\u00020&H\u0002\u001a:\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010(\u001a\u00020\u0013H\u0002\u001a\u0082\u0001\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0/2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0/2\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010/2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010(\u001a\u00020\u0013\u001a\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020&0\t*\b\u0012\u0004\u0012\u00020\n0\t\u001a\n\u00108\u001a\u000207*\u000206\"\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010:\"\u0016\u0010=\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010<¨\u0006>"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/core/dto/AvgItemDto;", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "toChartDataList", "Lcom/xiaomi/hm/health/healthdata/core/dto/BpDto;", "Ljava/util/Date;", "date", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", "toBpChartDataList", "Lcom/xiaomi/hm/health/healthdata/core/dto/DataItemDto;", "start", "h", "", "startInMills", "toChartDataListByStart", "g", "", "index", "Lcom/xiaomi/hm/health/healthdata/ui/vo/TimeParam;", "timeParam", GoogleApiAvailabilityLight.a, GoogleApiAvailabilityLight.b, "day", "a", "m", hl.k, z.j, DTransferConstants.SEARCH_KEY, com.google.android.exoplayer2.text.ttml.b.r, "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HistoryItem;", "toHealthHistoryData", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "toTempHistoryData", "Lcom/xiaomi/hm/health/healthdata/core/dto/BarDto;", "", "offset", "dayFrequency", "e", "l", "toBarChartDataList", "i", "o", "b", "Lkotlin/Pair;", "highRange", "highPair", "lowRange", "lowPair", "toBarChartVo", "toRawBarChartVo", "Lcom/huami/stress/domain/model/SingleStress;", "Lcom/huami/stress/domain/model/Stress;", "toStress", "", "Ljava/lang/String;", "TAG", LogUtil.I, "MILLI_SECONDS_IN_MINUTE", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class DataConverterKt {

    @NotNull
    private static final String a = "DataConverter";
    private static final int b = 60000;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            iArr[TimeMode.YEAR.ordinal()] = 3;
            iArr[TimeMode.DAY.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HealthDataType.values().length];
            iArr2[HealthDataType.MUSCLE.ordinal()] = 1;
            iArr2[HealthDataType.BONE.ordinal()] = 2;
            iArr2[HealthDataType.SKELETAL_MUSCLE.ordinal()] = 3;
            iArr2[HealthDataType.BASAL_METABOLISM.ordinal()] = 4;
            iArr2[HealthDataType.VISCERAL_FAT.ordinal()] = 5;
            iArr2[HealthDataType.BLOOD_PRESSURE.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<HealthChartDataVo> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toChartDataListByStart..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList<BarChartVo<Number>> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toDailyBarChartDataList..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList<BarChartVo<Number>> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toDailyBpChartDataList..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ArrayList<HealthChartDataVo> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toDailyChartDataList..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ArrayList<BarChartVo<Number>> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toMonthBarChartDataList..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ArrayList<BarChartVo<Number>> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toMonthBpChartDataList..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ArrayList<HealthChartDataVo> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toMonthChartDataList..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ArrayList<BarChartVo<Number>> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toWeekBarChartDataList..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ArrayList<BarChartVo<Number>> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toWeekChartDataList..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ArrayList<HealthChartDataVo> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toWeekChartDataList..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ArrayList<BarChartVo<Number>> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toYearBarChartDataList..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ArrayList<BarChartVo<Number>> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toYearChartDataList..." + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<HealthChartDataVo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ArrayList<HealthChartDataVo> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toYearChartDataList..." + this.a;
        }
    }

    private static final int a(int i2) {
        int i3 = (i2 + 6) % 7;
        if (i3 == 0) {
            return 7;
        }
        return i3;
    }

    private static final BarChartVo<Number> b(BarDto<? extends Number> barDto, int i2, float f2, TimeParam timeParam, int i3) {
        return toBarChartVo(i2, barDto.getHighRange(), barDto.getHighValue(), barDto.getLowRange(), barDto.getLowValue(), f2, timeParam, i3);
    }

    public static /* synthetic */ BarChartVo c(BarDto barDto, int i2, float f2, TimeParam timeParam, int i3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return b(barDto, i2, f2, timeParam, i3);
    }

    private static final BarChartVo<Number> d(BpDto bpDto, int i2, TimeParam timeParam) {
        HealthDataUtils healthDataUtils = HealthDataUtils.INSTANCE;
        HealthDataType healthDataType = HealthDataType.BLOOD_PRESSURE;
        return toBarChartVo(i2, healthDataUtils.getHealthDataRange(healthDataType), bpDto.getHeightValue(), healthDataUtils.getHealthDataRange(healthDataType), bpDto.getLowValue(), healthDataUtils.getBarChartOffset(healthDataType), timeParam, healthDataUtils.getDayFrequency(healthDataType));
    }

    private static final List<BarChartVo<Number>> e(List<? extends BarDto<? extends Number>> list, Date date, float f2, int i2) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            BarDto barDto = (BarDto) it2.next();
            calendar.setTimeInMillis(barDto.getUploadTime());
            if (TimeUtils.isTheSameDay(calendar2.getTimeInMillis(), calendar.getTimeInMillis())) {
                arrayList.add(b(barDto, ((int) (calendar.getTimeInMillis() - calendar2.getTimeInMillis())) / 1000, f2, new TimeParam(TimeMode.DAY, barDto.getUploadTime()), i2));
            }
            arrayList2.add(Unit.INSTANCE);
        }
        HMLog.debug(a, new b(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List f(List list, Date date, float f2, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return e(list, date, f2, i2);
    }

    private static final List<BarChartVo<Number>> g(List<BpDto> list, Date date) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(HealthDataTimeUtils.INSTANCE.getDayStartTime(date.getTime()));
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BpDto bpDto : list) {
            Date uploadTime = bpDto.getUploadTime();
            if (uploadTime != null) {
                calendar.setTime(uploadTime);
            }
            if (TimeUtils.isTheSameDay(calendar2.getTimeInMillis(), calendar.getTimeInMillis())) {
                arrayList.add(d(bpDto, ((int) (calendar.getTimeInMillis() - calendar2.getTimeInMillis())) / 1000, new TimeParam(TimeMode.DAY, calendar.getTimeInMillis())));
            }
            arrayList2.add(Unit.INSTANCE);
        }
        HMLog.debug(a, new c(arrayList));
        return arrayList;
    }

    private static final List<HealthChartDataVo> h(List<DataItemDto> list, Date date) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(HealthDataTimeUtils.INSTANCE.getDayStartTime(date.getTime()));
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (DataItemDto dataItemDto : list) {
            Date uploadTime = dataItemDto.getUploadTime();
            if (uploadTime != null) {
                calendar.setTime(uploadTime);
            }
            if (TimeUtils.isTheSameDay(calendar2.getTimeInMillis(), calendar.getTimeInMillis())) {
                arrayList.add(new HealthChartDataVo(((int) (calendar.getTimeInMillis() - calendar2.getTimeInMillis())) / 1000, dataItemDto.getValue(), dataItemDto.getUploadTime(), dataItemDto.getExtra()));
            }
            arrayList2.add(Unit.INSTANCE);
        }
        HMLog.debug(a, new d(arrayList));
        return arrayList;
    }

    private static final List<BarChartVo<Number>> i(List<? extends BarDto<? extends Number>> list, float f2) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            BarDto barDto = (BarDto) it2.next();
            calendar.setTimeInMillis(barDto.getUploadTime());
            arrayList2.add(Boolean.valueOf(arrayList.add(c(barDto, calendar.get(5), f2, new TimeParam(TimeMode.MONTH, barDto.getUploadTime()), 0, 8, null))));
        }
        HMLog.debug(a, new e(arrayList));
        return arrayList;
    }

    private static final List<BarChartVo<Number>> j(List<BpDto> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BpDto bpDto : list) {
            Date uploadTime = bpDto.getUploadTime();
            if (uploadTime != null) {
                calendar.setTime(uploadTime);
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(d(bpDto, calendar.get(5), new TimeParam(TimeMode.MONTH, calendar.getTimeInMillis())))));
        }
        HMLog.debug(a, new f(arrayList));
        return arrayList;
    }

    private static final List<HealthChartDataVo> k(List<AvgItemDto> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AvgItemDto avgItemDto : list) {
            calendar.setTime(avgItemDto.getUploadTime());
            arrayList2.add(Boolean.valueOf(arrayList.add(new HealthChartDataVo(calendar.get(5), avgItemDto.getAvgValue(), avgItemDto.getUploadTime(), avgItemDto.getExtra()))));
        }
        HMLog.debug(a, new g(arrayList));
        return arrayList;
    }

    private static final List<BarChartVo<Number>> l(List<? extends BarDto<? extends Number>> list, float f2) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            BarDto barDto = (BarDto) it2.next();
            calendar.setTimeInMillis(barDto.getUploadTime());
            boolean zStartsWith$default = kotlin.text.m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null);
            int iA = calendar.get(7);
            if (!zStartsWith$default) {
                iA = a(iA);
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(c(barDto, iA, f2, new TimeParam(TimeMode.WEEK, barDto.getUploadTime()), 0, 8, null))));
        }
        HMLog.debug(a, new h(arrayList));
        return arrayList;
    }

    private static final List<BarChartVo<Number>> m(List<BpDto> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BpDto bpDto : list) {
            Date uploadTime = bpDto.getUploadTime();
            if (uploadTime != null) {
                calendar.setTime(uploadTime);
            }
            boolean zStartsWith$default = kotlin.text.m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null);
            int iA = calendar.get(7);
            if (!zStartsWith$default) {
                iA = a(iA);
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(d(bpDto, iA, new TimeParam(TimeMode.WEEK, calendar.getTimeInMillis())))));
        }
        HMLog.debug(a, new i(arrayList));
        return arrayList;
    }

    private static final List<HealthChartDataVo> n(List<AvgItemDto> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AvgItemDto avgItemDto : list) {
            calendar.setTime(avgItemDto.getUploadTime());
            boolean zStartsWith$default = kotlin.text.m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null);
            int iA = calendar.get(7);
            if (!zStartsWith$default) {
                iA = a(iA);
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(new HealthChartDataVo(iA, avgItemDto.getAvgValue(), avgItemDto.getUploadTime(), avgItemDto.getExtra()))));
        }
        HMLog.debug(a, new j(arrayList));
        return arrayList;
    }

    private static final List<BarChartVo<Number>> o(List<? extends BarDto<? extends Number>> list, float f2) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            BarDto barDto = (BarDto) it2.next();
            calendar.setTimeInMillis(barDto.getUploadTime());
            arrayList2.add(Boolean.valueOf(arrayList.add(c(barDto, calendar.get(2) + 1, f2, new TimeParam(TimeMode.YEAR, barDto.getUploadTime()), 0, 8, null))));
        }
        HMLog.debug(a, new k(arrayList));
        return arrayList;
    }

    private static final List<BarChartVo<Number>> p(List<BpDto> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BpDto bpDto : list) {
            Date uploadTime = bpDto.getUploadTime();
            if (uploadTime != null) {
                calendar.setTime(uploadTime);
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(d(bpDto, calendar.get(2) + 1, new TimeParam(TimeMode.YEAR, calendar.getTimeInMillis())))));
        }
        HMLog.debug(a, new l(arrayList));
        return arrayList;
    }

    private static final List<HealthChartDataVo> q(List<AvgItemDto> list) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AvgItemDto avgItemDto : list) {
            calendar.setTime(avgItemDto.getUploadTime());
            arrayList2.add(Boolean.valueOf(arrayList.add(new HealthChartDataVo(calendar.get(2) + 1, avgItemDto.getAvgValue(), avgItemDto.getUploadTime(), avgItemDto.getExtra()))));
        }
        HMLog.debug(a, new m(arrayList));
        return arrayList;
    }

    @NotNull
    public static final List<BarChartVo<Number>> toBarChartDataList(@NotNull List<? extends BarDto<? extends Number>> list, @NotNull Date date, @NotNull TimeMode timeMode, float f2, int i2) {
        List<BarChartVo<Number>> listL;
        int i3 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i3 == 1) {
            listL = l(list, f2);
        } else if (i3 == 2) {
            listL = i(list, f2);
        } else if (i3 == 3) {
            listL = o(list, f2);
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            listL = e(list, date, f2, i2);
        }
        return CollectionsKt___CollectionsKt.sortedWith(listL, new Comparator() { // from class: com.xiaomi.hm.health.healthdata.ui.vo.converter.DataConverterKt$toBarChartDataList$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((BarChartVo) t).getIndex()), Integer.valueOf(((BarChartVo) t2).getIndex()));
            }
        });
    }

    public static /* synthetic */ List toBarChartDataList$default(List list, Date date, TimeMode timeMode, float f2, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return toBarChartDataList(list, date, timeMode, f2, i2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0151  */
    /* JADX WARN: Code duplicated, block: B:39:0x0165  */
    /* JADX WARN: Code duplicated, block: B:40:0x018a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0194  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b9  */
    @NotNull
    public static final BarChartVo<Number> toBarChartVo(int i2, @NotNull Pair<? extends Number, ? extends Number> pair, @Nullable Pair<? extends Number, ? extends Number> pair2, @NotNull Pair<? extends Number, ? extends Number> pair3, @Nullable Pair<? extends Number, ? extends Number> pair4, float f2, @NotNull TimeParam timeParam, int i3) {
        float fFloatValue;
        Pair<? extends Number, ? extends Number> pair5;
        String formatTime$default;
        float fFloatValue2;
        Pair<? extends Number, ? extends Number> pair6;
        Pair pair7 = new Pair(Float.valueOf(f2), Float.valueOf(f2));
        Pair pair8 = new Pair(Float.valueOf(f2), Float.valueOf(f2));
        Pair<? extends Number, ? extends Number> pair9 = null;
        Float fValueOf = Float.valueOf(0.0f);
        if (pair2 == null) {
            pair5 = null;
        } else {
            Number first = pair.getFirst();
            Number second = pair.getSecond();
            if (pair2.getSecond().floatValue() == 0.0f) {
                fFloatValue = pair2.getFirst().floatValue();
                if (Intrinsics.areEqual(Float.valueOf(fFloatValue), first)) {
                    float f3 = 2 * f2;
                    pair7 = new Pair(fValueOf, Float.valueOf(f3));
                    pair5 = new Pair<>(pair2.getFirst(), Float.valueOf(pair2.getFirst().floatValue() + f3));
                } else if (Intrinsics.areEqual(Float.valueOf(fFloatValue), second)) {
                    float f4 = 2 * f2;
                    pair7 = new Pair(Float.valueOf(f4), fValueOf);
                    pair5 = new Pair<>(Float.valueOf(pair2.getFirst().floatValue() - f4), pair2.getFirst());
                } else {
                    pair7 = new Pair(Float.valueOf(f2), Float.valueOf(f2));
                    pair5 = new Pair<>(Float.valueOf(pair2.getFirst().floatValue() - f2), Float.valueOf(pair2.getFirst().floatValue() + f2));
                }
            } else {
                if (pair2.getFirst().floatValue() == pair2.getSecond().floatValue()) {
                    fFloatValue = pair2.getFirst().floatValue();
                    if (Intrinsics.areEqual(Float.valueOf(fFloatValue), first)) {
                        float f5 = 2 * f2;
                        pair7 = new Pair(fValueOf, Float.valueOf(f5));
                        pair5 = new Pair<>(pair2.getFirst(), Float.valueOf(pair2.getFirst().floatValue() + f5));
                    } else if (Intrinsics.areEqual(Float.valueOf(fFloatValue), second)) {
                        float f6 = 2 * f2;
                        pair7 = new Pair(Float.valueOf(f6), fValueOf);
                        pair5 = new Pair<>(Float.valueOf(pair2.getFirst().floatValue() - f6), pair2.getFirst());
                    } else {
                        pair7 = new Pair(Float.valueOf(f2), Float.valueOf(f2));
                        pair5 = new Pair<>(Float.valueOf(pair2.getFirst().floatValue() - f2), Float.valueOf(pair2.getFirst().floatValue() + f2));
                    }
                } else {
                    pair7 = new Pair(fValueOf, fValueOf);
                    pair5 = pair2;
                }
            }
        }
        if (pair4 != null) {
            Number first2 = pair3.getFirst();
            Number second2 = pair3.getSecond();
            if (pair4.getSecond().floatValue() == 0.0f) {
                fFloatValue2 = pair4.getFirst().floatValue();
                if (Intrinsics.areEqual(Float.valueOf(fFloatValue2), first2)) {
                    float f7 = 2 * f2;
                    pair8 = new Pair(fValueOf, Float.valueOf(f7));
                    pair6 = new Pair<>(pair4.getFirst(), Float.valueOf(pair4.getFirst().floatValue() + f7));
                } else if (Intrinsics.areEqual(Float.valueOf(fFloatValue2), second2)) {
                    float f8 = 2 * f2;
                    pair8 = new Pair(Float.valueOf(f8), fValueOf);
                    pair6 = new Pair<>(Float.valueOf(pair4.getFirst().floatValue() - f8), pair4.getFirst());
                } else {
                    pair8 = new Pair(Float.valueOf(f2), Float.valueOf(f2));
                    pair6 = new Pair<>(Float.valueOf(pair4.getFirst().floatValue() - f2), Float.valueOf(pair4.getFirst().floatValue() + f2));
                }
            } else {
                if (pair4.getFirst().floatValue() == pair4.getSecond().floatValue()) {
                    fFloatValue2 = pair4.getFirst().floatValue();
                    if (Intrinsics.areEqual(Float.valueOf(fFloatValue2), first2)) {
                        float f9 = 2 * f2;
                        pair8 = new Pair(fValueOf, Float.valueOf(f9));
                        pair6 = new Pair<>(pair4.getFirst(), Float.valueOf(pair4.getFirst().floatValue() + f9));
                    } else if (Intrinsics.areEqual(Float.valueOf(fFloatValue2), second2)) {
                        float f10 = 2 * f2;
                        pair8 = new Pair(Float.valueOf(f10), fValueOf);
                        pair6 = new Pair<>(Float.valueOf(pair4.getFirst().floatValue() - f10), pair4.getFirst());
                    } else {
                        pair8 = new Pair(Float.valueOf(f2), Float.valueOf(f2));
                        pair6 = new Pair<>(Float.valueOf(pair4.getFirst().floatValue() - f2), Float.valueOf(pair4.getFirst().floatValue() + f2));
                    }
                } else {
                    pair8 = new Pair(fValueOf, fValueOf);
                    pair6 = pair4;
                }
            }
            pair9 = pair6;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[timeParam.getMode().ordinal()];
        if (i4 == 1 || i4 == 2) {
            formatTime$default = HMDataFormatKt.getFormatTime$default(timeParam.getTime(), HMDataFormatKt.adaptHMPattern(HMPattern.YEAR_ABBR_MONTH_DAY, timeParam.getTime()), (Locale) null, 2, (Object) null);
        } else if (i4 == 3) {
            formatTime$default = HMDataFormatKt.getFormatTime$default(timeParam.getTime(), HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null);
        } else {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            formatTime$default = HMDataFormatKt.getFormatTime$default(timeParam.getTime(), HMDataFormatKt.adaptHMPattern(HMPattern.YEAR_ABBR_MONTH_DAY_HOUR24_MINUTE, timeParam.getTime()), (Locale) null, 2, (Object) null) + " - " + HMDataFormatKt.getFormatTime$default(timeParam.getTime() + ((long) (60000 * i3)), HMPattern.HOUR24_MINUTE, (Locale) null, 2, (Object) null);
        }
        return new BarChartVo<>(i2, pair5, pair7, pair9, pair8, formatTime$default);
    }

    @NotNull
    public static final List<BarChartVo<Number>> toBpChartDataList(@NotNull List<BpDto> list, @NotNull Date date, @NotNull TimeMode timeMode) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i2 == 1) {
            return m(list);
        }
        if (i2 == 2) {
            return j(list);
        }
        if (i2 == 3) {
            return p(list);
        }
        if (i2 == 4) {
            return g(list, date);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final List<HealthChartDataVo> toChartDataList(@NotNull List<AvgItemDto> list, @NotNull TimeMode timeMode) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i2 == 1) {
            return n(list);
        }
        if (i2 != 2) {
            return i2 != 3 ? CollectionsKt__CollectionsKt.emptyList() : q(list);
        }
        return k(list);
    }

    @NotNull
    public static final List<HealthChartDataVo> toChartDataListByStart(@NotNull List<DataItemDto> list, long j2) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (DataItemDto dataItemDto : list) {
            Date uploadTime = dataItemDto.getUploadTime();
            if (uploadTime != null) {
                calendar.setTime(uploadTime);
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(new HealthChartDataVo(((int) (calendar.getTimeInMillis() - calendar2.getTimeInMillis())) / 1000, dataItemDto.getValue(), dataItemDto.getUploadTime(), dataItemDto.getExtra()))));
        }
        HMLog.debug(a, new a(arrayList));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    @NotNull
    public static final List<HistoryItem> toHealthHistoryData(@NotNull List<UserDataEntity> list) {
        String withDecimal;
        Float floatOrNull;
        Date uploadTime;
        long time;
        Float floatOrNull2;
        Context context = BraceletApp.getContext();
        ArrayList arrayList = new ArrayList();
        ArrayList<UserDataEntity> arrayList2 = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            UserDataEntity userDataEntity = (UserDataEntity) next;
            if (userDataEntity.getType() != HealthDataType.BLOOD_PRESSURE) {
                String eventValue = userDataEntity.getEventValue();
                if (!((eventValue == null || (floatOrNull2 = kotlin.text.k.toFloatOrNull(eventValue)) == null || floatOrNull2.floatValue() <= 0.0f) ? false : true)) {
                    z = false;
                }
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        for (UserDataEntity userDataEntity2 : arrayList2) {
            HealthDataType type = userDataEntity2.getType();
            numValueOf = null;
            Integer numValueOf = null;
            switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    String eventValue2 = userDataEntity2.getEventValue();
                    withDecimal = DataExKt.formatWithDecimal(Float.valueOf(BodyCompositionUtilsKt.weightFromKg(eventValue2 != null ? kotlin.text.k.toFloatOrNull(eventValue2) : null)), 2);
                    String str = withDecimal;
                    String time2 = HealthDataTimeUtils.INSTANCE.formatTime(userDataEntity2.getUploadTime());
                    uploadTime = userDataEntity2.getUploadTime();
                    if (uploadTime == null) {
                        time = 0;
                    } else {
                        time = uploadTime.getTime();
                    }
                    arrayList.add(new HistoryItem(str, time2, time, userDataEntity2.getIsOldData(), !userDataEntity2.getIsOldData()));
                    break;
                case 4:
                case 5:
                    String eventValue3 = userDataEntity2.getEventValue();
                    if (eventValue3 != null && (floatOrNull = kotlin.text.k.toFloatOrNull(eventValue3)) != null) {
                        numValueOf = Integer.valueOf((int) floatOrNull.floatValue());
                    }
                    withDecimal = String.valueOf(numValueOf);
                    String str2 = withDecimal;
                    String time3 = HealthDataTimeUtils.INSTANCE.formatTime(userDataEntity2.getUploadTime());
                    uploadTime = userDataEntity2.getUploadTime();
                    if (uploadTime == null) {
                        time = 0;
                    } else {
                        time = uploadTime.getTime();
                    }
                    arrayList.add(new HistoryItem(str2, time3, time, userDataEntity2.getIsOldData(), !userDataEntity2.getIsOldData()));
                    break;
                case 6:
                    String height = new BloodPressureDecoration(userDataEntity2).getHeight();
                    String low = new BloodPressureDecoration(userDataEntity2).getLow();
                    if (height != null && low != null) {
                        withDecimal = (context.getString(R.string.card_dbp) + height) + " " + (context.getString(R.string.card_sbp) + low);
                        String str3 = withDecimal;
                        String time4 = HealthDataTimeUtils.INSTANCE.formatTime(userDataEntity2.getUploadTime());
                        uploadTime = userDataEntity2.getUploadTime();
                        if (uploadTime == null) {
                            time = 0;
                        } else {
                            time = uploadTime.getTime();
                        }
                        arrayList.add(new HistoryItem(str3, time4, time, userDataEntity2.getIsOldData(), !userDataEntity2.getIsOldData()));
                    }
                    break;
                default:
                    String eventValue4 = userDataEntity2.getEventValue();
                    withDecimal = DataExKt.formatWithDecimal(eventValue4 != null ? kotlin.text.k.toFloatOrNull(eventValue4) : null, 1);
                    String str4 = withDecimal;
                    String time5 = HealthDataTimeUtils.INSTANCE.formatTime(userDataEntity2.getUploadTime());
                    uploadTime = userDataEntity2.getUploadTime();
                    if (uploadTime == null) {
                        time = 0;
                    } else {
                        time = uploadTime.getTime();
                    }
                    arrayList.add(new HistoryItem(str4, time5, time, userDataEntity2.getIsOldData(), !userDataEntity2.getIsOldData()));
                    break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final BarChartVo<Float> toRawBarChartVo(@NotNull BarChartVo<Number> barChartVo) {
        Pair pair;
        Pair pair2;
        Pair<Number, Number> highValue = barChartVo.getHighValue();
        if (highValue == null) {
            pair = null;
        } else {
            float fFloatValue = highValue.getFirst().floatValue();
            float fFloatValue2 = highValue.getSecond().floatValue();
            Pair<Number, Number> highOffset = barChartVo.getHighOffset();
            pair = new Pair(Float.valueOf(fFloatValue + highOffset.getFirst().floatValue()), Float.valueOf(fFloatValue2 - highOffset.getSecond().floatValue()));
        }
        Pair<Number, Number> lowValue = barChartVo.getLowValue();
        if (lowValue == null) {
            pair2 = null;
        } else {
            float fFloatValue3 = lowValue.getFirst().floatValue();
            float fFloatValue4 = lowValue.getSecond().floatValue();
            Pair<Number, Number> lowOffset = barChartVo.getLowOffset();
            pair2 = new Pair(Float.valueOf(fFloatValue3 + lowOffset.getFirst().floatValue()), Float.valueOf(fFloatValue4 - lowOffset.getSecond().floatValue()));
        }
        return new BarChartVo<>(barChartVo.getIndex(), pair, new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f)), pair2, new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f)), barChartVo.getExtra());
    }

    @NotNull
    public static final Stress toStress(@NotNull SingleStress singleStress) {
        return new Stress(singleStress.getValue(), singleStress.getTimestamp());
    }

    @NotNull
    public static final List<HistoryItem> toTempHistoryData(@NotNull List<TemperatureVo> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TemperatureVo temperatureVo : list) {
            arrayList.add(new HistoryItem(DataExKt.formatWithDecimal(Float.valueOf(TempUtils.INSTANCE.getTempDisplayFloat(temperatureVo.getTemp())), 1), HealthDataTimeUtils.INSTANCE.formatTime(new Date(temperatureVo.getTimestamp())), temperatureVo.getTimestamp(), false, false));
        }
        return arrayList;
    }

    @NotNull
    public static final List<HealthChartDataVo> toChartDataList(@NotNull List<DataItemDto> list, @NotNull Date date) {
        return h(list, date);
    }
}
