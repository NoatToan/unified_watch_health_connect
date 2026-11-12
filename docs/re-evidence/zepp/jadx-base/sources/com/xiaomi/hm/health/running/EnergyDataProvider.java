package com.xiaomi.hm.health.running;

import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.step.utils.StepTimeUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StageSteps;
import com.xiaomi.hm.health.running.EnergyDataProvider;
import com.xiaomi.hm.health.running.calori.CaloriActivity;
import com.xiaomi.hm.health.running.calori.CalorieDeviceFilterKt;
import com.xiaomi.hm.health.running.calori.SportFilterType;
import com.xiaomi.hm.health.running.calori.source.AppCalorieColleague;
import com.xiaomi.hm.health.running.calori.source.CalorieMediator;
import com.xiaomi.hm.health.running.calori.source.DeviceCalorieColleague;
import com.xiaomi.hm.health.running.calori.source.ICalorieMediator;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.ui.sportfitness.model.HistoryRecordSection;
import com.xiaomi.hm.health.ui.sportfitness.utils.ExerciseHistoryDateUtils;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import defpackage.ll1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 A2\u00020\u0001:\u0004ABCDB\u0007¢\u0006\u0004\b?\u0010@J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0004H\u0002J,\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0018\u00010\u0004H\u0002J$\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J>\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J-\u0010\u001e\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001cH\u0082\bJ\u0006\u0010\u001f\u001a\u00020\tJ\u000e\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 J\u0016\u0010%\u001a\u00020\t2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000eJ\u000e\u0010'\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u0005J\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010(0\u00132\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u0016\u0010*\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010(0\u00132\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010-\u001a\u00020\tR\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006E"}, d2 = {"Lcom/xiaomi/hm/health/running/EnergyDataProvider;", "", "Lcom/xiaomi/hm/health/running/EnergyDataProvider$ViewDataForDay;", "viewData", "Ljava/util/TreeMap;", "", "", "Lcom/huami/sport/service/model/HistoryRecord;", "itemData", "", SOAP.XMLNS, "Lcom/xiaomi/hm/health/running/EnergyDataProvider$EnergyData;", "headerData", "r", "", "w", "startTime", "endTime", "t", "Lrx/Observable;", "i", "timeMilli", DTransferConstants.SEARCH_KEY, "sportRecords", GetWatermarkAPI.KEY_NAME_STEPS, hl.k, ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "selector", "v", "onCreate", "Lcom/xiaomi/hm/health/running/calori/SportFilterType;", CaloriActivity.ARG_FILTER_TYPE, "setFilterType", "Lcom/xiaomi/hm/health/dataprocess/StageSteps;", "stageStepInfo", "setStageStepInfo", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "getSportDay", "Ljava/util/ArrayList;", "fetchDayDataFromLocal", "loadHeaderAndItemDataForPeriod", "fetchPeriodDataFromLocal", "loadDayOfCalorie", "onDestroy", "", "a", "Ljava/lang/String;", "tag", "", "b", LogUtil.I, "localDataSize", "c", "Lcom/xiaomi/hm/health/running/calori/SportFilterType;", "mFilterType", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "mStageStepInfo", "e", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "sportDay", "<init>", "()V", "Companion", "EnergyData", "ObservableEventData", "ViewDataForDay", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EnergyDataProvider {
    public static final long CALORIE_TIME = 10;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long f = TimeUnit.MINUTES.toMillis(10);

    @Nullable
    private static ICalorieMediator g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "EnergyDataProvider";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int localDataSize = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private SportFilterType mFilterType = SportFilterType.DAY;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private List<? extends StageSteps> mStageStepInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SportDay sportDay;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ>\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0007*\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00148B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/running/EnergyDataProvider$Companion;", "", "", "startTime", "endTime", "", "removeOverlap", "", "Lcom/huami/sport/service/model/HistoryRecord;", "c", "b", "target", "e", "Lcom/xiaomi/hm/health/dataprocess/StageSteps;", "stageStep", "Lcom/xiaomi/hm/health/running/EnergyDataProvider$EnergyData;", "parseStageStepToEnergyData", "removeAllOverlap", "timeDuration", "removeOverlapStageSteps", "Lcom/xiaomi/hm/health/running/calori/source/ICalorieMediator;", "getCaloriInstance", "", "calculateTodayCalorie", "mCalorieMediator", "Lcom/xiaomi/hm/health/running/calori/source/ICalorieMediator;", "a", "()Lcom/xiaomi/hm/health/running/calori/source/ICalorieMediator;", "CALORIE_TIME_DURATION", "J", "getCALORIE_TIME_DURATION", "()J", "CALORIE_TIME", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/sport/service/model/HistoryRecord;", "kotlin.jvm.PlatformType", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<HistoryRecord, TimeRange> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TimeRange invoke(HistoryRecord historyRecord) {
                return new TimeRange(historyRecord.getBeginTimeInMilli(), historyRecord.getBeginTimeInMilli() + (historyRecord.getConsumeTime() * ((long) 1000)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/sport/service/model/HistoryRecord;", "kotlin.jvm.PlatformType", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<HistoryRecord, TimeRange> {
            public static final b a = new b();

            public b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TimeRange invoke(HistoryRecord historyRecord) {
                return new TimeRange(historyRecord.getBeginTimeInMilli(), historyRecord.getBeginTimeInMilli() + (historyRecord.getConsumeTime() * ((long) 1000)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sport/service/model/HistoryRecord;", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<HistoryRecord, TimeRange> {
            public static final c a = new c();

            public c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TimeRange invoke(@NotNull HistoryRecord historyRecord) {
                return new TimeRange(historyRecord.getBeginTimeInMilli(), historyRecord.getBeginTimeInMilli() + (historyRecord.getConsumeTime() * ((long) 1000)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sport/service/model/HistoryRecord;", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<HistoryRecord, TimeRange> {
            public static final d a = new d();

            public d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TimeRange invoke(@NotNull HistoryRecord historyRecord) {
                return new TimeRange(historyRecord.getBeginTimeInMilli(), historyRecord.getBeginTimeInMilli() + (historyRecord.getConsumeTime() * ((long) 1000)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/StageSteps;", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function1<StageSteps, TimeRange> {
            public final /* synthetic */ long a;
            public final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(long j, long j2) {
                super(1);
                this.a = j;
                this.b = j2;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TimeRange invoke(@NotNull StageSteps stageSteps) {
                long j = this.a;
                long j2 = stageSteps.time;
                long j3 = this.b;
                long j4 = j + (j2 * j3);
                return new TimeRange(j4, j3 + j4);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sport/service/model/HistoryRecord;", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function1<HistoryRecord, TimeRange> {
            public static final f a = new f();

            public f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TimeRange invoke(@NotNull HistoryRecord historyRecord) {
                return new TimeRange(historyRecord.getBeginTimeInMilli(), historyRecord.getBeginTimeInMilli() + (historyRecord.getConsumeTime() * ((long) 1000)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/StageSteps;", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function1<StageSteps, TimeRange> {
            public final /* synthetic */ long a;
            public final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(long j, long j2) {
                super(1);
                this.a = j;
                this.b = j2;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TimeRange invoke(@NotNull StageSteps stageSteps) {
                long j = this.a;
                long j2 = stageSteps.time;
                long j3 = this.b;
                long j4 = j + (j2 * j3);
                return new TimeRange(j4, j3 + j4);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sport/service/model/HistoryRecord;", "it", "Lcom/xiaomi/hm/health/running/TimeRange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function1<HistoryRecord, TimeRange> {
            public static final h a = new h();

            public h() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TimeRange invoke(@NotNull HistoryRecord historyRecord) {
                return new TimeRange(historyRecord.getBeginTimeInMilli(), historyRecord.getBeginTimeInMilli() + (historyRecord.getConsumeTime() * ((long) 1000)));
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ICalorieMediator a() {
            if (EnergyDataProvider.g == null) {
                CalorieMediator calorieMediator = new CalorieMediator();
                calorieMediator.setMAppCalorieColleague(new AppCalorieColleague());
                calorieMediator.setMDeviceCalorieColleague(new DeviceCalorieColleague());
                EnergyDataProvider.g = calorieMediator;
            }
            return EnergyDataProvider.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<HistoryRecord> b(long startTime, long endTime) {
            List<HistoryRecord> listFirstOrDefault = HistoryRecordManager.getInstance().loadLocalDataByTimeRangeInRx(Long.valueOf(startTime), Long.valueOf(endTime)).toBlocking().firstOrDefault(new ArrayList());
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listFirstOrDefault) {
                if (hashSet.add(((HistoryRecord) obj).getDistinctKey())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        private final List<HistoryRecord> c(long startTime, long endTime, boolean removeOverlap) {
            List<HistoryRecord> listFirstOrDefault = HistoryRecordManager.getInstance().loadLocalDataByTimeRangeInRx(Long.valueOf(startTime), Long.valueOf(endTime)).toBlocking().firstOrDefault(new ArrayList());
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listFirstOrDefault) {
                if (hashSet.add(((HistoryRecord) obj).getDistinctKey())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!((HistoryRecord) obj2).isTraining()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((HistoryRecord) obj3).isTraining()) {
                    arrayList3.add(obj3);
                }
            }
            if (removeOverlap) {
                return CollectionsKt___CollectionsKt.sorted(CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) OverlapRemover.INSTANCE.removeOverlaps(arrayList3, arrayList2, a.a, b.a)));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList2) {
                if (CalorieDeviceFilterKt.is4ByteDevice(((HistoryRecord) obj4).getSource().intValue())) {
                    arrayList4.add(obj4);
                }
            }
            return CollectionsKt___CollectionsKt.sorted(CollectionsKt___CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList3));
        }

        public static /* synthetic */ List d(Companion companion, long j, long j2, boolean z, int i, Object obj) {
            return companion.c(j, j2, (i & 4) != 0 ? false : z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<HistoryRecord> e(List<? extends HistoryRecord> list, List<? extends HistoryRecord> list2) {
            return OverlapRemover.INSTANCE.removeOverlaps(list, list2, c.a, d.a);
        }

        public static /* synthetic */ List removeOverlapStageSteps$default(Companion companion, List list, List list2, long j, boolean z, long j2, int i, Object obj) {
            return companion.removeOverlapStageSteps(list, list2, j, (i & 4) != 0 ? true : z, j2);
        }

        public final int calculateTodayCalorie() {
            Pair<Long, Long> dayStartEndTime = ExerciseHistoryDateUtils.getDayStartEndTime(Calendar.getInstance().getTime());
            return getCaloriInstance().getSumCalori(((Long) dayStartEndTime.first).longValue(), ((Long) dayStartEndTime.second).longValue());
        }

        public final long getCALORIE_TIME_DURATION() {
            return EnergyDataProvider.f;
        }

        @NotNull
        public final synchronized ICalorieMediator getCaloriInstance() {
            return a();
        }

        @NotNull
        public final EnergyData parseStageStepToEnergyData(long startTime, @NotNull StageSteps stageStep) {
            return new EnergyData(startTime + (((long) stageStep.time) * getCALORIE_TIME_DURATION()), stageStep.cal);
        }

        @NotNull
        public final List<StageSteps> removeOverlapStageSteps(@NotNull List<? extends StageSteps> list, @NotNull List<? extends HistoryRecord> list2, long j, boolean z, long j2) {
            return z ? OverlapRemover.INSTANCE.removeAllOverlaps(list, list2, new e(j, j2), f.a) : OverlapRemover.INSTANCE.removeOverlaps(list, list2, new g(j, j2), h.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/running/EnergyDataProvider$EnergyData;", "", "other", "", "compareTo", "", "a", "J", "getStartTime", "()J", "setStartTime", "(J)V", "startTime", "b", "getCal", "setCal", "cal", "<init>", "(JJ)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class EnergyData implements Comparable<EnergyData> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long startTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private long cal;

        public EnergyData(long j, long j2) {
            this.startTime = j;
            this.cal = j2;
        }

        public final long getCal() {
            return this.cal;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final void setCal(long j) {
            this.cal = j;
        }

        public final void setStartTime(long j) {
            this.startTime = j;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull EnergyData other) {
            return this.startTime > other.startTime ? -1 : 1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u001b\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004HÆ\u0003J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003JE\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR4\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/running/EnergyDataProvider$ViewDataForDay;", "", "", "component1", "", "", "Lcom/huami/sport/service/model/HistoryRecord;", "component2", "Ljava/util/TreeMap;", "component3", "sumCal", "itemData", "headerData", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getSumCal", "()J", "setSumCal", "(J)V", "b", "Ljava/util/Map;", "getItemData", "()Ljava/util/Map;", "setItemData", "(Ljava/util/Map;)V", "c", "Ljava/util/TreeMap;", "getHeaderData", "()Ljava/util/TreeMap;", "setHeaderData", "(Ljava/util/TreeMap;)V", "<init>", "(JLjava/util/Map;Ljava/util/TreeMap;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ViewDataForDay {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private long sumCal;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private Map<Long, ? extends List<HistoryRecord>> itemData;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        private TreeMap<Long, Long> headerData;

        public ViewDataForDay(long j, @NotNull Map<Long, ? extends List<HistoryRecord>> map, @NotNull TreeMap<Long, Long> treeMap) {
            this.sumCal = j;
            this.itemData = map;
            this.headerData = treeMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewDataForDay copy$default(ViewDataForDay viewDataForDay, long j, Map map, TreeMap treeMap, int i, Object obj) {
            if ((i & 1) != 0) {
                j = viewDataForDay.sumCal;
            }
            if ((i & 2) != 0) {
                map = viewDataForDay.itemData;
            }
            if ((i & 4) != 0) {
                treeMap = viewDataForDay.headerData;
            }
            return viewDataForDay.copy(j, map, treeMap);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSumCal() {
            return this.sumCal;
        }

        @NotNull
        public final Map<Long, List<HistoryRecord>> component2() {
            return this.itemData;
        }

        @NotNull
        public final TreeMap<Long, Long> component3() {
            return this.headerData;
        }

        @NotNull
        public final ViewDataForDay copy(long sumCal, @NotNull Map<Long, ? extends List<HistoryRecord>> itemData, @NotNull TreeMap<Long, Long> headerData) {
            return new ViewDataForDay(sumCal, itemData, headerData);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewDataForDay)) {
                return false;
            }
            ViewDataForDay viewDataForDay = (ViewDataForDay) other;
            return this.sumCal == viewDataForDay.sumCal && Intrinsics.areEqual(this.itemData, viewDataForDay.itemData) && Intrinsics.areEqual(this.headerData, viewDataForDay.headerData);
        }

        @NotNull
        public final TreeMap<Long, Long> getHeaderData() {
            return this.headerData;
        }

        @NotNull
        public final Map<Long, List<HistoryRecord>> getItemData() {
            return this.itemData;
        }

        public final long getSumCal() {
            return this.sumCal;
        }

        public int hashCode() {
            return (((defpackage.b.a(this.sumCal) * 31) + this.itemData.hashCode()) * 31) + this.headerData.hashCode();
        }

        public final void setHeaderData(@NotNull TreeMap<Long, Long> treeMap) {
            this.headerData = treeMap;
        }

        public final void setItemData(@NotNull Map<Long, ? extends List<HistoryRecord>> map) {
            this.itemData = map;
        }

        public final void setSumCal(long j) {
            this.sumCal = j;
        }

        @NotNull
        public String toString() {
            return "ViewDataForDay(sumCal=" + this.sumCal + ", itemData=" + this.itemData + ", headerData=" + this.headerData + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " ----------------------------------------------------------------------------------------";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, List<String> list) {
            super(0);
            this.a = str;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 步数记录的卡路里个数（与运动时间段重叠的）: " + this.b.size() + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 步数记录的卡路里（与运动时间段重叠的）: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " =======================================================================================";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ ViewDataForDay b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, ViewDataForDay viewDataForDay) {
            super(0);
            this.a = str;
            this.b = viewDataForDay;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 总卡路里: " + this.b.getSumCal();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " ----------------------------------------------------------------------------------------";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 运动记录的卡路里: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " ----------------------------------------------------------------------------------------";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, List<String> list) {
            super(0);
            this.a = str;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 步数记录的卡路里个数（与运动去重前）: " + this.b.size() + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 步数记录的卡路里（与运动去重前）: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " ----------------------------------------------------------------------------------------";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, List<String> list) {
            super(0);
            this.a = str;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 步数记录的卡路里个数（与运动去重后）: " + this.b.size() + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 步数记录的卡路里（与运动去重后）: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<Calendar> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Calendar invoke() {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.a);
            calendar.set(11, calendar.getMinimum(11));
            calendar.set(12, calendar.getMinimum(12));
            calendar.set(13, calendar.getMinimum(13));
            calendar.set(14, calendar.getMinimum(14));
            return calendar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/StageSteps;", "step", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<StageSteps, String> {
        public final /* synthetic */ Function0<Calendar> a;
        public final /* synthetic */ SimpleDateFormat b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(Function0<? extends Calendar> function0, SimpleDateFormat simpleDateFormat) {
            super(1);
            this.a = function0;
            this.b = simpleDateFormat;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull StageSteps stageSteps) {
            Calendar calendarInvoke = this.a.invoke();
            calendarInvoke.add(12, stageSteps.time * 10);
            long timeInMillis = calendarInvoke.getTimeInMillis();
            Calendar calendarInvoke2 = this.a.invoke();
            calendarInvoke2.add(12, (stageSteps.time + 1) * 10);
            long timeInMillis2 = calendarInvoke2.getTimeInMillis();
            return this.b.format(Long.valueOf(timeInMillis)) + " - " + this.b.format(Long.valueOf(timeInMillis2)) + " time: " + stageSteps.time + " calorie: " + stageSteps.cal;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HistoryRecord> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(List<? extends HistoryRecord> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "====== 运动记录个数: " + this.a.size() + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ SimpleDateFormat a;
        public final /* synthetic */ HistoryRecord b;
        public final /* synthetic */ Function1<HistoryRecord, String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(SimpleDateFormat simpleDateFormat, HistoryRecord historyRecord, Function1<? super HistoryRecord, String> function1) {
            super(0);
            this.a = simpleDateFormat;
            this.b = historyRecord;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.format(Long.valueOf(this.b.getBeginTimeInMilli())) + " 运动记录的卡路里: " + ((Object) this.c.invoke(this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HistoryRecord> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(List<? extends HistoryRecord> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "====== 步数记录的卡路里个数（与运动去重前）: " + this.a.size() + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ SimpleDateFormat a;
        public final /* synthetic */ HistoryRecord b;
        public final /* synthetic */ Function1<HistoryRecord, String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(SimpleDateFormat simpleDateFormat, HistoryRecord historyRecord, Function1<? super HistoryRecord, String> function1) {
            super(0);
            this.a = simpleDateFormat;
            this.b = historyRecord;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.format(Long.valueOf(this.b.getBeginTimeInMilli())) + " 步数记录的卡路里（与运动去重前）: " + ((Object) this.c.invoke(this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HistoryRecord> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(List<? extends HistoryRecord> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "====== 步数记录的卡路里个数（与运动去重后）: " + this.a.size() + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ SimpleDateFormat a;
        public final /* synthetic */ HistoryRecord b;
        public final /* synthetic */ Function1<HistoryRecord, String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(SimpleDateFormat simpleDateFormat, HistoryRecord historyRecord, Function1<? super HistoryRecord, String> function1) {
            super(0);
            this.a = simpleDateFormat;
            this.b = historyRecord;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.format(Long.valueOf(this.b.getBeginTimeInMilli())) + " 步数记录的卡路里（与运动去重后）: " + ((Object) this.c.invoke(this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HistoryRecord> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(List<HistoryRecord> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "====== 步数记录的卡路里个数（与运动时间段重叠的）: " + this.a.size() + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public final /* synthetic */ SimpleDateFormat a;
        public final /* synthetic */ HistoryRecord b;
        public final /* synthetic */ Function1<HistoryRecord, String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public w(SimpleDateFormat simpleDateFormat, HistoryRecord historyRecord, Function1<? super HistoryRecord, String> function1) {
            super(0);
            this.a = simpleDateFormat;
            this.b = historyRecord;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.format(Long.valueOf(this.b.getBeginTimeInMilli())) + " 步数记录的卡路里（与运动时间段重叠的）: " + ((Object) this.c.invoke(this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sport/service/model/HistoryRecord;", "r", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function1<HistoryRecord, String> {
        public final /* synthetic */ SimpleDateFormat a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(SimpleDateFormat simpleDateFormat) {
            super(1);
            this.a = simpleDateFormat;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HistoryRecord historyRecord) {
            long beginTimeInMilli = historyRecord.getBeginTimeInMilli();
            long consumeTime = (historyRecord.getConsumeTime() * ((long) 1000)) + beginTimeInMilli;
            return this.a.format(Long.valueOf(beginTimeInMilli)) + " - " + this.a.format(Long.valueOf(consumeTime)) + " calorie: " + historyRecord.getConsumeCal();
        }
    }

    private final Observable<HistoryRecord> i(final long startTime, long endTime) {
        return HistoryRecordManager.getInstance().loadLocalDataByTimeRangeInRx(Long.valueOf(startTime), Long.valueOf(endTime)).flatMap(new Func1() { // from class: kl1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return EnergyDataProvider.j(startTime, this, (List) obj);
            }
        }).distinct(ll1.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable j(long j2, EnergyDataProvider energyDataProvider, List list) {
        System.out.println((Object) (j2 + " - local data size : " + list.size()));
        energyDataProvider.localDataSize = list.size();
        return Observable.from(list);
    }

    private final TreeMap<Long, List<EnergyData>> k(List<? extends HistoryRecord> sportRecords, List<EnergyData> steps, long startTime) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sportRecords, 10));
        for (HistoryRecord historyRecord : sportRecords) {
            arrayList.add(new EnergyData(historyRecord.getBeginTimeInMilli(), historyRecord.getConsumeCal()));
        }
        List<EnergyData> listPlus = CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$combineHeaderData$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((EnergyDataProvider.EnergyData) t2).getStartTime()), Long.valueOf(((EnergyDataProvider.EnergyData) t3).getStartTime()));
            }
        }), (Iterable) steps);
        TreeMap<Long, List<EnergyData>> treeMap = new TreeMap<>(new Comparator() { // from class: el1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return EnergyDataProvider.l((Long) obj, (Long) obj2);
            }
        });
        for (EnergyData energyData : listPlus) {
            long jQ = q(energyData.getStartTime());
            List<EnergyData> arrayList2 = treeMap.get(Long.valueOf(jQ));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
            }
            arrayList2.add(energyData);
            treeMap.put(Long.valueOf(jQ), arrayList2);
        }
        return treeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(Long l2, Long l3) {
        return Intrinsics.compare(l3.longValue(), l2.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewDataForDay m(EnergyDataProvider energyDataProvider, long j2, long j3) {
        return energyDataProvider.t(j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList n(long j2, long j3, ViewDataForDay viewDataForDay) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HistoryRecordHeader(viewDataForDay.getSumCal(), j2, j3, viewDataForDay.getHeaderData()));
        for (Map.Entry<Long, List<HistoryRecord>> entry : viewDataForDay.getItemData().entrySet()) {
            arrayList.add(new HistoryRecordSection(entry.getKey().longValue()));
            arrayList.addAll(entry.getValue());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewDataForDay o(EnergyDataProvider energyDataProvider, long j2, long j3) {
        return energyDataProvider.loadHeaderAndItemDataForPeriod(j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList p(long j2, long j3, ViewDataForDay viewDataForDay) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HistoryRecordHeader(viewDataForDay.getSumCal(), j2, j3, viewDataForDay.getHeaderData()));
        for (Map.Entry<Long, List<HistoryRecord>> entry : viewDataForDay.getItemData().entrySet()) {
            arrayList.add(new HistoryRecordSection(entry.getKey().longValue()));
            arrayList.addAll(entry.getValue());
        }
        return arrayList;
    }

    private final long q(long timeMilli) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeMilli);
        if (this.mFilterType != SportFilterType.DAY) {
            calendar.set(11, calendar.getActualMinimum(11));
        }
        calendar.set(12, calendar.getActualMinimum(12));
        calendar.set(13, calendar.getActualMinimum(13));
        calendar.set(14, calendar.getActualMinimum(14));
        return calendar.getTimeInMillis();
    }

    private final void r(ViewDataForDay viewData, TreeMap<Long, List<EnergyData>> headerData) {
        long size;
        if (headerData == null) {
            size = 0;
        } else {
            size = 0;
            for (Map.Entry<Long, List<EnergyData>> entry : headerData.entrySet()) {
                Iterator<T> it2 = entry.getValue().iterator();
                long cal = 0;
                while (it2.hasNext()) {
                    cal += ((EnergyData) it2.next()).getCal();
                }
                viewData.getHeaderData().put(entry.getKey(), Long.valueOf(cal));
                size += cal;
            }
        }
        if (this.mFilterType != SportFilterType.DAY && size != 0 && headerData != null && (!headerData.isEmpty())) {
            size /= (long) headerData.size();
        }
        viewData.setSumCal(size);
    }

    private final void s(ViewDataForDay viewData, TreeMap<Long, List<HistoryRecord>> itemData) {
        if (itemData == null) {
            return;
        }
        viewData.setItemData(kotlin.collections.r.plus(viewData.getItemData(), itemData));
    }

    private final ViewDataForDay t(long startTime, long endTime) {
        Companion companion = INSTANCE;
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(Companion.d(companion, startTime, endTime, false, 4, null), new Comparator() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$loadHeaderAndItemData$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryRecord) t3).getBeginTimeInMilli()), Long.valueOf(((HistoryRecord) t2).getBeginTimeInMilli()));
            }
        });
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(companion.b(startTime, endTime), new Comparator() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$loadHeaderAndItemData$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryRecord) t3).getBeginTimeInMilli()), Long.valueOf(((HistoryRecord) t2).getBeginTimeInMilli()));
            }
        });
        List<DateData> listLoadDateData = StepDataManager.INSTANCE.loadDateData(startTime, endTime);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listLoadDateData.iterator();
        while (it2.hasNext()) {
            List<HistoryRecord> entity = StepDataManager.INSTANCE.parseEntity((DateData) it2.next());
            if (entity != null) {
                arrayList.add(entity);
            }
        }
        CollectionsKt___CollectionsKt.sortedWith(companion.e(CollectionsKt__IterablesKt.flatten(arrayList), listSortedWith), new Comparator() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$loadHeaderAndItemData$$inlined$sortedByDescending$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryRecord) t3).getBeginTimeInMilli()), Long.valueOf(((HistoryRecord) t2).getBeginTimeInMilli()));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = listLoadDateData.iterator();
        while (it3.hasNext()) {
            List<HistoryRecord> entity2 = StepDataManager.INSTANCE.parseEntity((DateData) it3.next());
            if (entity2 != null) {
                arrayList2.add(entity2);
            }
        }
        TreeMap<Long, List<HistoryRecord>> treeMapW = w(CollectionsKt___CollectionsKt.plus((Collection) listSortedWith2, (Iterable) INSTANCE.e(CollectionsKt___CollectionsKt.sortedWith(CollectionsKt__IterablesKt.flatten(arrayList2), new Comparator() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$loadHeaderAndItemData$$inlined$sortedByDescending$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryRecord) t3).getBeginTimeInMilli()), Long.valueOf(((HistoryRecord) t2).getBeginTimeInMilli()));
            }
        }), listSortedWith2)));
        Iterator<T> it4 = treeMapW.values().iterator();
        while (it4.hasNext()) {
            List list = (List) it4.next();
            if (list.size() > 1) {
                kotlin.collections.g.sortWith(list, new Comparator() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$loadHeaderAndItemData$lambda-17$lambda-16$$inlined$sortByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t2, T t3) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryRecord) t3).getBeginTimeInMilli()), Long.valueOf(((HistoryRecord) t2).getBeginTimeInMilli()));
                    }
                });
            }
        }
        Unit unit = Unit.INSTANCE;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it5 = listLoadDateData.iterator();
        while (it5.hasNext()) {
            List<StageSteps> stageStep = StepDataManager.INSTANCE.parseStageStep(((DateData) it5.next()).getStageStepsSummary());
            if (stageStep != null) {
                arrayList3.add(stageStep);
            }
        }
        List listFlatten = CollectionsKt__IterablesKt.flatten(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it6 = listFlatten.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next = it6.next();
            if (((StageSteps) next).cal > 0) {
                arrayList4.add(next);
            }
        }
        Companion companion2 = INSTANCE;
        List listRemoveOverlapStageSteps$default = Companion.removeOverlapStageSteps$default(companion2, arrayList4, listSortedWith, startTime, false, f, 4, null);
        List<? extends HistoryRecord> listSortedWith3 = CollectionsKt___CollectionsKt.sortedWith(companion2.getCaloriInstance().getDistinctAppSport(startTime, endTime), new Comparator() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$loadHeaderAndItemData$$inlined$sortedByDescending$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryRecord) t3).getBeginTimeInMilli()), Long.valueOf(((HistoryRecord) t2).getBeginTimeInMilli()));
            }
        });
        List<EnergyData> distinctStep = companion2.getCaloriInstance().getDistinctStep(startTime, endTime);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : distinctStep) {
            if (((EnergyData) obj).getCal() > 0) {
                arrayList5.add(obj);
            }
        }
        TreeMap<Long, List<EnergyData>> treeMapK = k(listSortedWith3, arrayList5, startTime);
        ViewDataForDay viewDataForDay = new ViewDataForDay(0L, new TreeMap(), new TreeMap());
        r(viewDataForDay, treeMapK);
        s(viewDataForDay, treeMapW);
        if (HMConfig.Log.isLogTerminal()) {
            String str = new SimpleDateFormat("MM-dd", Locale.getDefault()).format(Long.valueOf(startTime));
            HMLog.verbose("EnergyDataCalories", new e(str, viewDataForDay));
            HMLog.verbose("EnergyDataCalories", new f(str));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
            Iterator it7 = listSortedWith.iterator();
            while (it7.hasNext()) {
                HistoryRecord historyRecord = (HistoryRecord) it7.next();
                long beginTimeInMilli = historyRecord.getBeginTimeInMilli();
                Iterator it8 = it7;
                long consumeTime = (historyRecord.getConsumeTime() * ((long) 1000)) + beginTimeInMilli;
                arrayList6.add(simpleDateFormat.format(Long.valueOf(beginTimeInMilli)) + " - " + simpleDateFormat.format(Long.valueOf(consumeTime)) + " calorie: " + historyRecord.getConsumeCal());
                it7 = it8;
            }
            Iterator it9 = arrayList6.iterator();
            while (it9.hasNext()) {
                HMLog.verbose("EnergyDataCalories", new g(str, (String) it9.next()));
            }
            HMLog.verbose("EnergyDataCalories", new h(str));
            o oVar = new o(new n(startTime), simpleDateFormat);
            ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it10 = arrayList4.iterator();
            while (it10.hasNext()) {
                arrayList7.add(oVar.invoke(it10.next()));
            }
            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listRemoveOverlapStageSteps$default, 10));
            Iterator it11 = listRemoveOverlapStageSteps$default.iterator();
            while (it11.hasNext()) {
                arrayList8.add(oVar.invoke(it11.next()));
            }
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList7);
            mutableList.removeAll(arrayList8);
            Unit unit2 = Unit.INSTANCE;
            HMLog.verbose("EnergyDataCalories", new i(str, arrayList7));
            Iterator it12 = arrayList7.iterator();
            while (it12.hasNext()) {
                HMLog.verbose("EnergyDataCalories", new j(str, (String) it12.next()));
            }
            HMLog.verbose("EnergyDataCalories", new k(str));
            HMLog.verbose("EnergyDataCalories", new l(str, arrayList8));
            Iterator it13 = arrayList8.iterator();
            while (it13.hasNext()) {
                HMLog.verbose("EnergyDataCalories", new m(str, (String) it13.next()));
            }
            HMLog.verbose("EnergyDataCalories", new a(str));
            HMLog.verbose("EnergyDataCalories", new b(str, mutableList));
            Iterator it14 = mutableList.iterator();
            while (it14.hasNext()) {
                HMLog.verbose("EnergyDataCalories", new c(str, (String) it14.next()));
            }
            HMLog.verbose("EnergyDataCalories", new d(str));
        }
        return viewDataForDay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(Long l2, Long l3) {
        return Intrinsics.compare(l3.longValue(), l2.longValue());
    }

    private final <T> long v(Iterable<? extends T> iterable, Function1<? super T, Long> function1) {
        Iterator<? extends T> it2 = iterable.iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            jLongValue += function1.invoke(it2.next()).longValue();
        }
        return jLongValue;
    }

    private final TreeMap<Long, List<HistoryRecord>> w(List<? extends HistoryRecord> list) {
        TreeMap<Long, List<HistoryRecord>> treeMap = new TreeMap<>(new Comparator() { // from class: dl1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return EnergyDataProvider.x((Long) obj, (Long) obj2);
            }
        });
        for (HistoryRecord historyRecord : list) {
            long jQ = q(historyRecord.getBeginTimeInMilli());
            List<HistoryRecord> arrayList = treeMap.get(Long.valueOf(jQ));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(historyRecord);
            treeMap.put(Long.valueOf(jQ), arrayList);
        }
        return treeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x(Long l2, Long l3) {
        return Intrinsics.compare(l3.longValue(), l2.longValue());
    }

    @NotNull
    public final Observable<ArrayList<Object>> fetchDayDataFromLocal(final long startTime, final long endTime) {
        return Observable.fromCallable(new Callable() { // from class: gl1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return EnergyDataProvider.m(this.a, startTime, endTime);
            }
        }).subscribeOn(Schedulers.io()).map(new Func1() { // from class: il1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return EnergyDataProvider.n(startTime, endTime, (EnergyDataProvider.ViewDataForDay) obj);
            }
        });
    }

    @NotNull
    public final Observable<ArrayList<Object>> fetchPeriodDataFromLocal(final long startTime, final long endTime) {
        return Observable.fromCallable(new Callable() { // from class: hl1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return EnergyDataProvider.o(this.a, startTime, endTime);
            }
        }).subscribeOn(Schedulers.io()).map(new Func1() { // from class: jl1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return EnergyDataProvider.p(startTime, endTime, (EnergyDataProvider.ViewDataForDay) obj);
            }
        });
    }

    @NotNull
    public final SportDay getSportDay(long startTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        SportDay sportDay = new SportDay(calendar.get(1), calendar.get(2), calendar.get(5));
        this.sportDay = sportDay;
        return sportDay;
    }

    @NotNull
    public final List<EnergyData> loadDayOfCalorie(long startTime, long endTime) {
        List<HistoryRecord> distinctAppSport = INSTANCE.getCaloriInstance().getDistinctAppSport(startTime, endTime);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(distinctAppSport, 10));
        for (HistoryRecord historyRecord : distinctAppSport) {
            arrayList.add(new EnergyData(historyRecord.getBeginTimeInMilli(), historyRecord.getConsumeCal()));
        }
        final List listPlus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) INSTANCE.getCaloriInstance().getDistinctStep(startTime, endTime));
        Grouping<EnergyData, String> grouping = new Grouping<EnergyData, String>() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$loadDayOfCalorie$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public String keyOf(EnergyDataProvider.EnergyData element) {
                return StepTimeUtils.INSTANCE.formatDate(element.getStartTime());
            }

            @Override // kotlin.collections.Grouping
            @NotNull
            public Iterator<EnergyDataProvider.EnergyData> sourceIterator() {
                return listPlus.iterator();
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<EnergyData> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            EnergyData next = itSourceIterator.next();
            String strKeyOf = grouping.keyOf(next);
            Object obj = linkedHashMap.get(strKeyOf);
            if (!(obj == null && !linkedHashMap.containsKey(strKeyOf))) {
                EnergyData energyData = (EnergyData) obj;
                energyData.setCal(energyData.getCal() + next.getCal());
                next = energyData;
            }
            linkedHashMap.put(strKeyOf, next);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList2.add((EnergyData) ((Map.Entry) it2.next()).getValue());
        }
        return CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$loadDayOfCalorie$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((EnergyDataProvider.EnergyData) t3).getStartTime()), Long.valueOf(((EnergyDataProvider.EnergyData) t2).getStartTime()));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0282  */
    @NotNull
    public final ViewDataForDay loadHeaderAndItemDataForPeriod(long startTime, long endTime) {
        SimpleDateFormat simpleDateFormat;
        ArrayList arrayList;
        List list;
        TreeMap<Long, List<HistoryRecord>> treeMap;
        Iterator it2;
        String str;
        String str2;
        ArrayList arrayList2;
        int i2;
        long j2 = startTime;
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(INSTANCE.b(j2, endTime), new Comparator() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$loadHeaderAndItemDataForPeriod$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryRecord) t3).getBeginTimeInMilli()), Long.valueOf(((HistoryRecord) t2).getBeginTimeInMilli()));
            }
        });
        List<StepDataManager.Companion.PeriodRecord> periodData = StepDataManager.INSTANCE.getPeriodData(j2, endTime);
        if (periodData == null) {
            periodData = new ArrayList<>();
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = periodData.iterator();
        while (it3.hasNext()) {
            List<HistoryRecord> records = ((StepDataManager.Companion.PeriodRecord) it3.next()).getRecords();
            if (records == null) {
                records = CollectionsKt__CollectionsKt.emptyList();
            }
            kotlin.collections.h.addAll(arrayList3, records);
        }
        TreeMap<Long, List<HistoryRecord>> treeMapW = w(CollectionsKt___CollectionsKt.plus((Collection) listSortedWith, (Iterable) CollectionsKt___CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$loadHeaderAndItemDataForPeriod$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryRecord) t3).getBeginTimeInMilli()), Long.valueOf(((HistoryRecord) t2).getBeginTimeInMilli()));
            }
        })));
        Iterator<T> it4 = treeMapW.values().iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            if (list2.size() > 1) {
                kotlin.collections.g.sortWith(list2, new Comparator() { // from class: com.xiaomi.hm.health.running.EnergyDataProvider$loadHeaderAndItemDataForPeriod$lambda-39$lambda-38$$inlined$sortByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t2, T t3) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryRecord) t3).getBeginTimeInMilli()), Long.valueOf(((HistoryRecord) t2).getBeginTimeInMilli()));
                    }
                });
            }
        }
        Unit unit = Unit.INSTANCE;
        String str3 = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        List<DateData> listLoadDateData = StepDataManager.INSTANCE.loadDateData(j2, endTime);
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = listLoadDateData.iterator();
        while (it5.hasNext()) {
            DateData dateData = (DateData) it5.next();
            Date date = simpleDateFormat2.parse(dateData.getDate());
            Long lValueOf = date == null ? null : Long.valueOf(date.getTime());
            if (lValueOf == null) {
                list = listSortedWith;
                treeMap = treeMapW;
                simpleDateFormat = simpleDateFormat2;
                it2 = it5;
                str2 = str3;
            } else {
                List<StageSteps> stageStep = StepDataManager.INSTANCE.parseStageStep(dateData.getStageStepsSummary());
                if (stageStep == null) {
                    list = listSortedWith;
                    treeMap = treeMapW;
                    simpleDateFormat = simpleDateFormat2;
                    it2 = it5;
                    str = str3;
                    arrayList = null;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : stageStep) {
                        SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
                        if (((StageSteps) obj).cal > 0) {
                            arrayList5.add(obj);
                        }
                        simpleDateFormat2 = simpleDateFormat3;
                    }
                    simpleDateFormat = simpleDateFormat2;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        StageSteps stageSteps = (StageSteps) it6.next();
                        Iterator it7 = it5;
                        long jLongValue = lValueOf.longValue() + (((long) stageSteps.time) * f);
                        HistoryRecord historyRecord = new HistoryRecord();
                        historyRecord.setTraining(false);
                        historyRecord.setSource(Integer.valueOf(HMDeviceSource.VDEVICE.getValue()));
                        List list3 = listSortedWith;
                        historyRecord.setTrackid(Long.valueOf(jLongValue / ((long) 1000)));
                        historyRecord.setCosttime(Integer.valueOf((int) TimeUnit.MINUTES.toSeconds(10L)));
                        historyRecord.setCal(Integer.valueOf(stageSteps.cal));
                        Unit unit2 = Unit.INSTANCE;
                        arrayList.add(historyRecord);
                        str3 = str3;
                        listSortedWith = list3;
                        it5 = it7;
                        it6 = it6;
                        treeMapW = treeMapW;
                    }
                    list = listSortedWith;
                    treeMap = treeMapW;
                    it2 = it5;
                    str = str3;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (arrayList == null || !(!arrayList.isEmpty())) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    List<StageSteps> summaryToSteps = StepDataManager.INSTANCE.parseSummaryToSteps(dateData.getSummary());
                    if (summaryToSteps == null) {
                        str2 = str;
                    } else {
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj2 : summaryToSteps) {
                            if (((StageSteps) obj2).cal > 0) {
                                arrayList6.add(obj2);
                            }
                        }
                        ArrayList<StageSteps> arrayList7 = new ArrayList();
                        Iterator it8 = arrayList6.iterator();
                        while (true) {
                            i2 = 3600000;
                            if (!it8.hasNext()) {
                                break;
                            }
                            Object next = it8.next();
                            String str4 = str;
                            Iterator it9 = it8;
                            long jLongValue2 = lValueOf.longValue() + ((long) (((StageSteps) next).time * 3600000));
                            if (jLongValue2 < Math.min(jCurrentTimeMillis, endTime) && 1 + j2 <= jLongValue2) {
                                arrayList7.add(next);
                            }
                            str = str4;
                            it8 = it9;
                        }
                        str2 = str;
                        arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                        for (StageSteps stageSteps2 : arrayList7) {
                            long jLongValue3 = lValueOf.longValue() + ((long) (stageSteps2.time * i2));
                            HistoryRecord historyRecord2 = new HistoryRecord();
                            historyRecord2.setTraining(false);
                            historyRecord2.setSource(Integer.valueOf(HMDeviceSource.VDEVICE.getValue()));
                            historyRecord2.setTrackid(Long.valueOf(jLongValue3 / ((long) 1000)));
                            historyRecord2.setCosttime(Integer.valueOf((int) TimeUnit.MINUTES.toSeconds(60L)));
                            historyRecord2.setCal(Integer.valueOf(stageSteps2.cal));
                            Unit unit3 = Unit.INSTANCE;
                            arrayList2.add(historyRecord2);
                            lValueOf = lValueOf;
                            i2 = 3600000;
                        }
                    }
                } else {
                    str2 = str;
                    arrayList2 = arrayList;
                }
                if (arrayList2 == null) {
                    arrayList4.add(arrayList2);
                }
                j2 = startTime;
                listSortedWith = list;
                str3 = str2;
                simpleDateFormat2 = simpleDateFormat;
                it5 = it2;
                treeMapW = treeMap;
            }
            arrayList2 = null;
            if (arrayList2 == null) {
                arrayList4.add(arrayList2);
            }
            j2 = startTime;
            listSortedWith = list;
            str3 = str2;
            simpleDateFormat2 = simpleDateFormat;
            it5 = it2;
            treeMapW = treeMap;
        }
        List list4 = listSortedWith;
        TreeMap<Long, List<HistoryRecord>> treeMap2 = treeMapW;
        String str5 = str3;
        List listFlatten = CollectionsKt__IterablesKt.flatten(arrayList4);
        List listE = INSTANCE.e(listFlatten, list4);
        if (HMConfig.Log.isLogTerminal()) {
            SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(str5, Locale.CHINA);
            x xVar = new x(simpleDateFormat4);
            HMLog.verbose("EnergyDataCalories", new p(list4));
            Iterator it10 = list4.iterator();
            while (it10.hasNext()) {
                HMLog.verbose("EnergyDataCalories", new q(simpleDateFormat4, (HistoryRecord) it10.next(), xVar));
            }
            HMLog.verbose("EnergyDataCalories", new r(listFlatten));
            Iterator it11 = listFlatten.iterator();
            while (it11.hasNext()) {
                HMLog.verbose("EnergyDataCalories", new s(simpleDateFormat4, (HistoryRecord) it11.next(), xVar));
            }
            HMLog.verbose("EnergyDataCalories", new t(listE));
            Iterator it12 = listE.iterator();
            while (it12.hasNext()) {
                HMLog.verbose("EnergyDataCalories", new u(simpleDateFormat4, (HistoryRecord) it12.next(), xVar));
            }
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listFlatten);
            mutableList.removeAll(listE);
            Unit unit4 = Unit.INSTANCE;
            HMLog.verbose("EnergyDataCalories", new v(mutableList));
            Iterator it13 = mutableList.iterator();
            while (it13.hasNext()) {
                HMLog.verbose("EnergyDataCalories", new w(simpleDateFormat4, (HistoryRecord) it13.next(), xVar));
            }
        }
        List<HistoryRecord> listPlus = CollectionsKt___CollectionsKt.plus((Collection) list4, (Iterable) listE);
        ArrayList<EnergyData> arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listPlus, 10));
        for (HistoryRecord historyRecord3 : listPlus) {
            arrayList8.add(new EnergyData(historyRecord3.getBeginTimeInMilli(), historyRecord3.getConsumeCal()));
        }
        TreeMap<Long, List<EnergyData>> treeMap3 = new TreeMap<>(new Comparator() { // from class: fl1
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return EnergyDataProvider.u((Long) obj3, (Long) obj4);
            }
        });
        for (EnergyData energyData : arrayList8) {
            Long lValueOf2 = Long.valueOf(q(energyData.getStartTime()));
            List<EnergyData> arrayList9 = treeMap3.get(lValueOf2);
            if (arrayList9 == null) {
                arrayList9 = new ArrayList<>();
                treeMap3.put(lValueOf2, arrayList9);
            }
            arrayList9.add(energyData);
        }
        ViewDataForDay viewDataForDay = new ViewDataForDay(0L, new TreeMap(), new TreeMap());
        r(viewDataForDay, treeMap3);
        s(viewDataForDay, treeMap2);
        return viewDataForDay;
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void setFilterType(@NotNull SportFilterType filterType) {
        this.mFilterType = filterType;
    }

    public final void setStageStepInfo(@Nullable List<? extends StageSteps> stageStepInfo) {
        this.mStageStepInfo = stageStepInfo;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!BK\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0004HÆ\u0003J\u001d\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0018\u00010\u0004HÆ\u0003JO\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00042\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R-\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR-\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/running/EnergyDataProvider$ObservableEventData;", "", "", "component1", "Ljava/util/TreeMap;", "", "", "Lcom/huami/sport/service/model/HistoryRecord;", "component2", "Lcom/xiaomi/hm/health/running/EnergyDataProvider$EnergyData;", "component3", "eventType", "itemData", "headerData", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getEventType", "()I", "b", "Ljava/util/TreeMap;", "getItemData", "()Ljava/util/TreeMap;", "c", "getHeaderData", "<init>", "(ILjava/util/TreeMap;Ljava/util/TreeMap;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ObservableEventData {
        public static final int EVENT_HEADER = 2;
        public static final int EVENT_ITEM = 1;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int eventType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private final TreeMap<Long, List<HistoryRecord>> itemData;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        private final TreeMap<Long, List<EnergyData>> headerData;

        public ObservableEventData(int i, @Nullable TreeMap<Long, List<HistoryRecord>> treeMap, @Nullable TreeMap<Long, List<EnergyData>> treeMap2) {
            this.eventType = i;
            this.itemData = treeMap;
            this.headerData = treeMap2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ObservableEventData copy$default(ObservableEventData observableEventData, int i, TreeMap treeMap, TreeMap treeMap2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = observableEventData.eventType;
            }
            if ((i2 & 2) != 0) {
                treeMap = observableEventData.itemData;
            }
            if ((i2 & 4) != 0) {
                treeMap2 = observableEventData.headerData;
            }
            return observableEventData.copy(i, treeMap, treeMap2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getEventType() {
            return this.eventType;
        }

        @Nullable
        public final TreeMap<Long, List<HistoryRecord>> component2() {
            return this.itemData;
        }

        @Nullable
        public final TreeMap<Long, List<EnergyData>> component3() {
            return this.headerData;
        }

        @NotNull
        public final ObservableEventData copy(int eventType, @Nullable TreeMap<Long, List<HistoryRecord>> itemData, @Nullable TreeMap<Long, List<EnergyData>> headerData) {
            return new ObservableEventData(eventType, itemData, headerData);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ObservableEventData)) {
                return false;
            }
            ObservableEventData observableEventData = (ObservableEventData) other;
            return this.eventType == observableEventData.eventType && Intrinsics.areEqual(this.itemData, observableEventData.itemData) && Intrinsics.areEqual(this.headerData, observableEventData.headerData);
        }

        public final int getEventType() {
            return this.eventType;
        }

        @Nullable
        public final TreeMap<Long, List<EnergyData>> getHeaderData() {
            return this.headerData;
        }

        @Nullable
        public final TreeMap<Long, List<HistoryRecord>> getItemData() {
            return this.itemData;
        }

        public int hashCode() {
            int i = this.eventType * 31;
            TreeMap<Long, List<HistoryRecord>> treeMap = this.itemData;
            int iHashCode = (i + (treeMap == null ? 0 : treeMap.hashCode())) * 31;
            TreeMap<Long, List<EnergyData>> treeMap2 = this.headerData;
            return iHashCode + (treeMap2 != null ? treeMap2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ObservableEventData(eventType=" + this.eventType + ", itemData=" + this.itemData + ", headerData=" + this.headerData + ")";
        }

        public /* synthetic */ ObservableEventData(int i, TreeMap treeMap, TreeMap treeMap2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : treeMap, (i2 & 4) != 0 ? null : treeMap2);
        }
    }
}
