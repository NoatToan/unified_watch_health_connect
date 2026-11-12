package com.xiaomi.fitness.repo.home;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.sp.RelativeDataPreference;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.repo.calorie.CaloriesBiz;
import com.xiaomi.fitness.repo.rainbow.RainbowBiz;
import com.xiaomi.fitness.repo.relative.RelativeDataRequest;
import com.xiaomi.fitness.repo.sleep.SleepBiz;
import com.xiaomi.fitness.repo.stand.StandBiz;
import com.xiaomi.fitness.repo.step.StepBiz;
import com.xiaomi.fitness.repo.strength.StrengthBiz;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0011H\u0016J(\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016J0\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J0\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J?\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010\u001cJ6\u0010\u0012\u001a\u00020\u001d2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\u001d0\u001fH\u0016J\u0016\u0010 \u001a\u00020\u001d2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016J>\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0082@¢\u0006\u0002\u0010\"J@\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00140\b2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0082@¢\u0006\u0002\u0010*J0\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00140\b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0082@¢\u0006\u0002\u0010-J@\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00140\b2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0082@¢\u0006\u0002\u0010*JL\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00140\b2\u0006\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)2\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000504\"\u00020\u0005H\u0082@¢\u0006\u0002\u00105JD\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00140\b2\u0006\u00103\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001bH\u0082@¢\u0006\u0002\u00108JD\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\t2\u0018\u0010=\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00140\b2\b\b\u0002\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010%\u001a\u00020\tH\u0002J*\u0010@\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020<2\u0018\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00140\bH\u0002J*\u0010B\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020:0\b0C0\u00112\u0006\u0010D\u001a\u00020\u001bH\u0016J;\u0010E\u001a\u0004\u0018\u00010:2\u0006\u0010D\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u001b2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010KR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/repo/home/HomeDataRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IHomeDataRepository;", "<init>", "()V", "TAG", "", "mLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "", "mRequesting", "Ljava/util/concurrent/atomic/AtomicBoolean;", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher$annotations", "getHomeLiveData", "Landroidx/lifecycle/LiveData;", "getHomeData", "dataTypes", "", "getHomeDataWithTag", CloudContract.COL_VIEW_TAG, "getHomeDataFlowWithTag", "Lkotlinx/coroutines/flow/StateFlow;", "getHomeDataWithTagTime", "baseZeroTimeInSec", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "", "dataBack", "Lkotlin/Function1;", "triggerGetHomeData", "triggerHomeDataRequest", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFitnessHomeData", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "dataType", "todayZeroTime", "nextZeroTime", CloudContract.COL_ZONE_OFFSET, "", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBloodSugarData", "maxTime", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTheCardTypeData", "cardType", "startTime", "endTime", "getTheItemTypeData", "persistKey", "", "(JJI[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecentOneDayData", "minTime", "(Ljava/lang/String;JILjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateItemsToReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "calendar", "Ljava/util/Calendar;", "itemMap", "isDisplayRecentDataInHomePage", "", "getMaxData0Time", "map", "getRelativeHomeData", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "relativeId", "processRelativeFitnessData", "homeDataType", "time", "model", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "latestAbnormalRecordTime", "(JLcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JLcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;Ljava/lang/Long;)Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeDataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeDataRepository.kt\ncom/xiaomi/fitness/repo/home/HomeDataRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,513:1\n1863#2:514\n1864#2:516\n1#3:515\n216#4,2:517\n53#5:519\n55#5:523\n50#6:520\n55#6:522\n107#7:521\n*S KotlinDebug\n*F\n+ 1 HomeDataRepository.kt\ncom/xiaomi/fitness/repo/home/HomeDataRepository\n*L\n158#1:514\n158#1:516\n256#1:517,2\n396#1:519\n396#1:523\n396#1:520\n396#1:522\n396#1:521\n*E\n"})
public final class HomeDataRepository implements IHomeDataRepository {

    @NotNull
    private final String TAG = "HomeDataRepository";

    @NotNull
    private final MutableLiveData<Map<HomeDataType, Object>> mLiveData = new MutableLiveData<>();

    @NotNull
    private volatile AtomicBoolean mRequesting = new AtomicBoolean(false);

    @NotNull
    private final ExecutorCoroutineDispatcher dispatcher = ThreadPoolDispatcherKt.newSingleThreadContext("homeData");

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.SPORT_REPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.TODAY_HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.WOMEN_HEALTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.STEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.CALORIE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.SLEEP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.ENERGY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.HEARING_HEALTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HomeDataType.HR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HomeDataType.STRESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HomeDataType.PAI.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HomeDataType.VITALITY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HomeDataType.WEIGHT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[HomeDataType.V02_MAX.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[HomeDataType.TRAINING_LOAD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[HomeDataType.RUNNING_INDICATOR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[HomeDataType.ECG_MEDICAL.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[HomeDataType.BLOOD_SUGAR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[HomeDataType.PHYSICAL_STATUS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE_TREND.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE_CHARACTER.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[HomeDataType.RAINBOW.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.home.HomeDataRepository$getFitnessHomeData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.home.HomeDataRepository", f = "HomeDataRepository.kt", i = {13, 13, 13, 14}, l = {203, 206, 209, 212, 216, 218, 219, SportReportBaseParser.ReportType.targetValueNumber, SportReportBaseParser.ReportType.maxFreq, 227, ErrorCode.ERROR_SP_NOTICE_NOT_READY, 237, 248, 252, 253, 263, 271, 274, 278, 281, 285, 290, 293}, m = "getFitnessHomeData", n = {"this", "nextZeroTime", CloudContract.COL_ZONE_OFFSET, "bpMap"}, s = {"L$0", "J$0", "I$0", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HomeDataRepository.this.getFitnessHomeData(null, 0L, 0L, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.home.HomeDataRepository$getHomeData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.home.HomeDataRepository$getHomeData$1", f = "HomeDataRepository.kt", i = {}, l = {75, 75}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28311 extends SuspendLambda implements Function2<LiveDataScope<Map<HomeDataType, ? extends Object>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<HomeDataType> $dataTypes;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28311(List<? extends HomeDataType> list, Continuation<? super C28311> continuation) {
            super(2, continuation);
            this.$dataTypes = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28311 c28311 = HomeDataRepository.this.new C28311(this.$dataTypes, continuation);
            c28311.L$0 = obj;
            return c28311;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<Map<HomeDataType, Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C28311) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            HomeDataRepository homeDataRepository = HomeDataRepository.this;
            List<HomeDataType> list = this.$dataTypes;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = HomeDataRepository.triggerHomeDataRequest$default(homeDataRepository, list, null, null, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<Map<HomeDataType, ? extends Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<Map<HomeDataType, Object>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.home.HomeDataRepository$getHomeData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.home.HomeDataRepository$getHomeData$2", f = "HomeDataRepository.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Map<HomeDataType, ? extends Object>, Unit> $dataBack;
        final /* synthetic */ List<HomeDataType> $dataTypes;
        Object L$0;
        int label;
        final /* synthetic */ HomeDataRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super Map<HomeDataType, ? extends Object>, Unit> function1, HomeDataRepository homeDataRepository, List<? extends HomeDataType> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$dataBack = function1;
            this.this$0 = homeDataRepository;
            this.$dataTypes = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$dataBack, this.this$0, this.$dataTypes, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Map<HomeDataType, ? extends Object>, Unit> function2 = this.$dataBack;
                HomeDataRepository homeDataRepository = this.this$0;
                List<HomeDataType> list = this.$dataTypes;
                this.L$0 = function2;
                this.label = 1;
                Object objTriggerHomeDataRequest$default = HomeDataRepository.triggerHomeDataRequest$default(homeDataRepository, list, null, null, this, 6, null);
                if (objTriggerHomeDataRequest$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objTriggerHomeDataRequest$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke2(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.home.HomeDataRepository$getHomeDataFlowWithTag$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.home.HomeDataRepository$getHomeDataFlowWithTag$1", f = "HomeDataRepository.kt", i = {0}, l = {91, 92}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class C28321 extends SuspendLambda implements Function2<FlowCollector<? super Map<HomeDataType, ? extends Object>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<HomeDataType> $dataTypes;
        final /* synthetic */ String $viewTag;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28321(List<? extends HomeDataType> list, String str, Continuation<? super C28321> continuation) {
            super(2, continuation);
            this.$dataTypes = list;
            this.$viewTag = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28321 c28321 = HomeDataRepository.this.new C28321(this.$dataTypes, this.$viewTag, continuation);
            c28321.L$0 = obj;
            return c28321;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            HomeDataRepository homeDataRepository = HomeDataRepository.this;
            List<HomeDataType> list = this.$dataTypes;
            String str = this.$viewTag;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = HomeDataRepository.triggerHomeDataRequest$default(homeDataRepository, list, str, null, this, 4, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (flowCollector.emit((Map) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Map<HomeDataType, ? extends Object>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C28321) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.home.HomeDataRepository$getHomeDataWithTag$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.home.HomeDataRepository$getHomeDataWithTag$1", f = "HomeDataRepository.kt", i = {}, l = {82, 82}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28331 extends SuspendLambda implements Function2<LiveDataScope<Map<HomeDataType, ? extends Object>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<HomeDataType> $dataTypes;
        final /* synthetic */ String $viewTag;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28331(List<? extends HomeDataType> list, String str, Continuation<? super C28331> continuation) {
            super(2, continuation);
            this.$dataTypes = list;
            this.$viewTag = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28331 c28331 = HomeDataRepository.this.new C28331(this.$dataTypes, this.$viewTag, continuation);
            c28331.L$0 = obj;
            return c28331;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<Map<HomeDataType, Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C28331) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            HomeDataRepository homeDataRepository = HomeDataRepository.this;
            List<HomeDataType> list = this.$dataTypes;
            String str = this.$viewTag;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = HomeDataRepository.triggerHomeDataRequest$default(homeDataRepository, list, str, null, this, 4, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<Map<HomeDataType, ? extends Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<Map<HomeDataType, Object>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.home.HomeDataRepository$getHomeDataWithTagTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.home.HomeDataRepository$getHomeDataWithTagTime$1", f = "HomeDataRepository.kt", i = {}, l = {108, 107}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28341 extends SuspendLambda implements Function2<LiveDataScope<Map<HomeDataType, ? extends Object>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Long $baseZeroTimeInSec;
        final /* synthetic */ List<HomeDataType> $dataTypes;
        final /* synthetic */ String $viewTag;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28341(List<? extends HomeDataType> list, String str, Long l, Continuation<? super C28341> continuation) {
            super(2, continuation);
            this.$dataTypes = list;
            this.$viewTag = str;
            this.$baseZeroTimeInSec = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28341 c28341 = HomeDataRepository.this.new C28341(this.$dataTypes, this.$viewTag, this.$baseZeroTimeInSec, continuation);
            c28341.L$0 = obj;
            return c28341;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<Map<HomeDataType, Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C28341) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            HomeDataRepository homeDataRepository = HomeDataRepository.this;
            List<HomeDataType> list = this.$dataTypes;
            String str = this.$viewTag;
            Long l = this.$baseZeroTimeInSec;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = homeDataRepository.triggerHomeDataRequest(list, str, l, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<Map<HomeDataType, ? extends Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<Map<HomeDataType, Object>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.home.HomeDataRepository$triggerGetHomeData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.home.HomeDataRepository$triggerGetHomeData$1", f = "HomeDataRepository.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<HomeDataType> $dataTypes;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.repo.home.HomeDataRepository$triggerGetHomeData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.repo.home.HomeDataRepository$triggerGetHomeData$1$1", f = "HomeDataRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Map<HomeDataType, Object> $resultMap;
            int label;
            final /* synthetic */ HomeDataRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07191(HomeDataRepository homeDataRepository, Map<HomeDataType, ? extends Object> map, Continuation<? super C07191> continuation) {
                super(2, continuation);
                this.this$0 = homeDataRepository;
                this.$resultMap = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07191(this.this$0, this.$resultMap, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.mLiveData.setValue(this.$resultMap);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28351(List<? extends HomeDataType> list, Continuation<? super C28351> continuation) {
            super(2, continuation);
            this.$dataTypes = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeDataRepository.this.new C28351(this.$dataTypes, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (HomeDataRepository.this.mRequesting.compareAndSet(false, true)) {
                    FitnessLogUtils.i(HomeDataRepository.this.TAG, "triggerHomeDataRequest");
                    HomeDataRepository homeDataRepository = HomeDataRepository.this;
                    List<HomeDataType> list = this.$dataTypes;
                    this.label = 1;
                    obj = HomeDataRepository.triggerHomeDataRequest$default(homeDataRepository, list, null, null, this, 6, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                HomeDataRepository.this.mRequesting.set(false);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AnyExtKt.main$default(null, new C07191(HomeDataRepository.this, (Map) obj, null), 1, null);
            HomeDataRepository.this.mRequesting.set(false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.home.HomeDataRepository$triggerHomeDataRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.home.HomeDataRepository", f = "HomeDataRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {167, SportReportBaseParser.ReportType.exitTime}, m = "triggerHomeDataRequest", n = {"this", CloudContract.COL_VIEW_TAG, "calendar", "resultMap", "dataType", "report", "zeroTime", "nextZeroTime", "offset", "this", CloudContract.COL_VIEW_TAG, "calendar", "resultMap", "dataType", "zeroTime", "nextZeroTime", "offset"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$5", "J$0", "J$1", "I$0"})
    public static final class C28361 extends ContinuationImpl {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C28361(Continuation<? super C28361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HomeDataRepository.this.triggerHomeDataRequest(null, null, null, this);
        }
    }

    private final DailyBasicReport aggregateItemsToReport(Calendar calendar, long todayZeroTime, HomeDataType dataType, Map<String, ? extends List<? extends DailyRecordItem>> itemMap, String viewTag) {
        long maxData0Time = isDisplayRecentDataInHomePage(dataType) ? getMaxData0Time(calendar, itemMap) : todayZeroTime;
        long j = maxData0Time == 0 ? todayZeroTime : maxData0Time;
        IRepository<? extends DailyBasicReport> repositoryByType = RepositoryManager.INSTANCE.getInstance().getRepositoryByType(dataType);
        Intrinsics.checkNotNull(repositoryByType, "null cannot be cast to non-null type com.xiaomi.fitness.repo.BaseRepository<out com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport>");
        return (DailyBasicReport) ((BaseRepository) repositoryByType).getBiz$fitness_data_core_chinaProductRelease().splitDailyReport(null, viewTag, j, itemMap);
    }

    public static /* synthetic */ DailyBasicReport aggregateItemsToReport$default(HomeDataRepository homeDataRepository, Calendar calendar, long j, HomeDataType homeDataType, Map map, String str, int i, Object obj) {
        if ((i & 16) != 0) {
            str = "home";
        }
        return homeDataRepository.aggregateItemsToReport(calendar, j, homeDataType, map, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getBloodSugarData(long j, int i, Continuation<? super Map<String, ? extends List<? extends DailyRecordItem>>> continuation) {
        DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
        DailyRecordItem recentOneData = dailyRecordDaoUtils.getRecentOneData("blood_sugar", null, j, i);
        if (recentOneData != null) {
            return getTheItemTypeData(recentOneData.getTimestamp() - TimeUnit.HOURS.toSeconds(3L), recentOneData.getTimestamp() + 1, i, new String[]{"blood_sugar"}, continuation);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DailyRecordItem recentOneData2 = dailyRecordDaoUtils.getRecentOneData(FitnessPersistKey.ManualBloodSugar, null, j, i);
        if (recentOneData2 != null) {
            List listSingletonList = Collections.singletonList(recentOneData2);
            Intrinsics.checkNotNull(listSingletonList, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.DailyRecordItem>");
            linkedHashMap.put(FitnessPersistKey.ManualBloodSugar, listSingletonList);
        }
        return linkedHashMap;
    }

    private static /* synthetic */ void getDispatcher$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:77:0x01db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f1 A[LOOP:0: B:80:0x01eb->B:82:0x01f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object getFitnessHomeData(HomeDataType homeDataType, long j, long j2, int i, Continuation<? super Map<String, ? extends List<? extends DailyRecordItem>>> continuation) {
        AnonymousClass1 anonymousClass1;
        int i2;
        long j3;
        HomeDataRepository homeDataRepository;
        Map mutableMap;
        Object recentOneDayData$default;
        Map map;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object theItemTypeData = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass2.label) {
            case 0:
                ResultKt.throwOnFailure(theItemTypeData);
                switch (WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()]) {
                    case 4:
                        anonymousClass2.label = 1;
                        theItemTypeData = getTheItemTypeData(j, j2, i, new String[]{"steps"}, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 5:
                        anonymousClass2.label = 2;
                        theItemTypeData = getTheItemTypeData(j, j2, i, new String[]{"calories"}, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 6:
                        String[] strArr = {FitnessPersistKey.ValidStand};
                        anonymousClass2.label = 3;
                        theItemTypeData = getTheItemTypeData(j, j2, i, strArr, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 7:
                        anonymousClass2.label = 4;
                        theItemTypeData = getTheItemTypeData(j, j2, i, new String[]{"intensity"}, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 8:
                        HomeDataType homeDataType2 = HomeDataType.SLEEP;
                        anonymousClass2.label = 5;
                        theItemTypeData = getTheCardTypeData(homeDataType2, j, j2, i, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 9:
                        HomeDataType homeDataType3 = HomeDataType.ENERGY;
                        anonymousClass2.label = 6;
                        theItemTypeData = getTheCardTypeData(homeDataType3, j, j2, i, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 10:
                        HomeDataType homeDataType4 = HomeDataType.HEARING_HEALTH;
                        anonymousClass2.label = 7;
                        theItemTypeData = getTheCardTypeData(homeDataType4, j, j2, i, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 11:
                        HomeDataType homeDataType5 = HomeDataType.HR;
                        anonymousClass2.label = 8;
                        theItemTypeData = getTheCardTypeData(homeDataType5, j, j2, i, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 12:
                        HomeDataType homeDataType6 = HomeDataType.STRESS;
                        anonymousClass2.label = 9;
                        theItemTypeData = getTheCardTypeData(homeDataType6, j, j2, i, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 13:
                        HomeDataType homeDataType7 = HomeDataType.SPO2;
                        anonymousClass2.label = 10;
                        theItemTypeData = getTheCardTypeData(homeDataType7, j, j2, i, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 14:
                        anonymousClass2.label = 11;
                        theItemTypeData = getTheItemTypeData(j2 - TimeUnit.DAYS.toSeconds(7L), j2, i, new String[]{"pai"}, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 15:
                        anonymousClass2.label = 12;
                        theItemTypeData = getTheItemTypeData(j2 - TimeUnit.DAYS.toSeconds(7L), j2, i, new String[]{"vitality"}, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 16:
                        Map mapSingletonMap = Collections.singletonMap("weight", DailyRecordDaoUtils.INSTANCE.getWeightDayRecords(BodyComposition.WEIGHT, j2, i, 7, 0));
                        Intrinsics.checkNotNull(mapSingletonMap);
                        return mapSingletonMap;
                    case 17:
                        anonymousClass2.label = 13;
                        theItemTypeData = getRecentOneDayData$default(this, FitnessPersistKey.Vo2Max, j2, i, null, anonymousClass2, 8, null);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 18:
                        anonymousClass2.L$0 = this;
                        anonymousClass2.J$0 = j2;
                        anonymousClass2.I$0 = i;
                        anonymousClass2.label = 14;
                        theItemTypeData = getRecentOneDayData$default(this, "blood_pressure", j2, i, null, anonymousClass2, 8, null);
                        if (theItemTypeData == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2 = i;
                        j3 = j2;
                        homeDataRepository = this;
                        mutableMap = MapsKt__MapsKt.toMutableMap((Map) theItemTypeData);
                        anonymousClass2.L$0 = mutableMap;
                        anonymousClass2.label = 15;
                        recentOneDayData$default = getRecentOneDayData$default(homeDataRepository, FitnessPersistKey.BloodPressureMedical, j3, i2, null, anonymousClass2, 8, null);
                        if (recentOneDayData$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        map = mutableMap;
                        theItemTypeData = recentOneDayData$default;
                        for (Map.Entry entry : ((Map) theItemTypeData).entrySet()) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                        return map;
                    case 19:
                        Long lBoxLong = Boxing.boxLong(j2 - TimeUnit.DAYS.toSeconds(28L));
                        anonymousClass2.label = 16;
                        theItemTypeData = getRecentOneDayData(FitnessPersistKey.TrainingLoad, j2, i, lBoxLong, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 20:
                        anonymousClass2.label = 17;
                        theItemTypeData = getRecentOneDayData$default(this, FitnessPersistKey.ManualTemperature, j2, i, null, anonymousClass2, 8, null);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 21:
                        anonymousClass2.label = 18;
                        theItemTypeData = getRecentOneDayData$default(this, FitnessPersistKey.RunningIndicator, j2, i, null, anonymousClass2, 8, null);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 22:
                        anonymousClass2.label = 19;
                        theItemTypeData = getRecentOneDayData$default(this, FitnessPersistKey.EcgMedical, j2, i, null, anonymousClass2, 8, null);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 23:
                        anonymousClass2.label = 20;
                        theItemTypeData = getBloodSugarData(j2, i, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 24:
                        Long lBoxLong2 = Boxing.boxLong(j2 - TimeUnit.DAYS.toSeconds(30L));
                        anonymousClass2.label = 21;
                        theItemTypeData = getRecentOneDayData("physical_fitness_status", j2, i, lBoxLong2, anonymousClass2);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 25:
                        anonymousClass2.label = 22;
                        theItemTypeData = getRecentOneDayData$default(this, "temperature_trend", j2, i, null, anonymousClass2, 8, null);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    case 26:
                        anonymousClass2.label = 23;
                        theItemTypeData = getRecentOneDayData$default(this, FitnessPersistKey.TemperatureCharacter, j2, i, null, anonymousClass2, 8, null);
                        return theItemTypeData == coroutine_suspended ? coroutine_suspended : theItemTypeData;
                    default:
                        return MapsKt__MapsKt.emptyMap();
                }
            case 1:
                ResultKt.throwOnFailure(theItemTypeData);
            case 2:
                ResultKt.throwOnFailure(theItemTypeData);
            case 3:
                ResultKt.throwOnFailure(theItemTypeData);
            case 4:
                ResultKt.throwOnFailure(theItemTypeData);
            case 5:
                ResultKt.throwOnFailure(theItemTypeData);
            case 6:
                ResultKt.throwOnFailure(theItemTypeData);
            case 7:
                ResultKt.throwOnFailure(theItemTypeData);
            case 8:
                ResultKt.throwOnFailure(theItemTypeData);
            case 9:
                ResultKt.throwOnFailure(theItemTypeData);
            case 10:
                ResultKt.throwOnFailure(theItemTypeData);
            case 11:
                ResultKt.throwOnFailure(theItemTypeData);
            case 12:
                ResultKt.throwOnFailure(theItemTypeData);
            case 13:
                ResultKt.throwOnFailure(theItemTypeData);
            case 14:
                i2 = anonymousClass2.I$0;
                long j4 = anonymousClass2.J$0;
                HomeDataRepository homeDataRepository2 = (HomeDataRepository) anonymousClass2.L$0;
                ResultKt.throwOnFailure(theItemTypeData);
                j3 = j4;
                homeDataRepository = homeDataRepository2;
                mutableMap = MapsKt__MapsKt.toMutableMap((Map) theItemTypeData);
                anonymousClass2.L$0 = mutableMap;
                anonymousClass2.label = 15;
                recentOneDayData$default = getRecentOneDayData$default(homeDataRepository, FitnessPersistKey.BloodPressureMedical, j3, i2, null, anonymousClass2, 8, null);
                if (recentOneDayData$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map = mutableMap;
                theItemTypeData = recentOneDayData$default;
                while (r0.hasNext()) {
                    map.put(entry.getKey(), entry.getValue());
                }
                return map;
            case 15:
                map = (Map) anonymousClass2.L$0;
                ResultKt.throwOnFailure(theItemTypeData);
                while (r0.hasNext()) {
                    map.put(entry.getKey(), entry.getValue());
                }
                return map;
            case 16:
                ResultKt.throwOnFailure(theItemTypeData);
            case 17:
                ResultKt.throwOnFailure(theItemTypeData);
            case 18:
                ResultKt.throwOnFailure(theItemTypeData);
            case 19:
                ResultKt.throwOnFailure(theItemTypeData);
            case 20:
                ResultKt.throwOnFailure(theItemTypeData);
            case 21:
                ResultKt.throwOnFailure(theItemTypeData);
            case 22:
                ResultKt.throwOnFailure(theItemTypeData);
            case 23:
                ResultKt.throwOnFailure(theItemTypeData);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final long getMaxData0Time(Calendar calendar, Map<String, ? extends List<? extends DailyRecordItem>> map) {
        Iterator<Map.Entry<String, ? extends List<? extends DailyRecordItem>>> it = map.entrySet().iterator();
        long jMax = 0;
        while (it.hasNext()) {
            Iterator<? extends DailyRecordItem> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                jMax = Math.max(jMax, it2.next().getTimestamp());
            }
        }
        if (jMax <= 0) {
            return jMax;
        }
        long j = 1000;
        calendar.setTimeInMillis(jMax * j);
        TimeUtils.setToZeroOClock(calendar);
        return calendar.getTimeInMillis() / j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRecentOneDayData(String str, long j, int i, Long l, Continuation<? super Map<String, ? extends List<? extends DailyRecordItem>>> continuation) {
        DailyRecordItem recentOneData = DailyRecordDaoUtils.INSTANCE.getRecentOneData(str, null, j, i);
        if (recentOneData == null) {
            Map mapEmptyMap = Collections.emptyMap();
            Intrinsics.checkNotNullExpressionValue(mapEmptyMap, "emptyMap(...)");
            return mapEmptyMap;
        }
        if (l == null || recentOneData.getTimestamp() >= l.longValue()) {
            long jChangeZeroOfTheDay = FitnessDateUtils.changeZeroOfTheDay(recentOneData.getTimestamp(), i);
            return getTheItemTypeData(jChangeZeroOfTheDay, jChangeZeroOfTheDay + TimeUnit.DAYS.toSeconds(1L), i, new String[]{str}, continuation);
        }
        Map mapEmptyMap2 = Collections.emptyMap();
        Intrinsics.checkNotNullExpressionValue(mapEmptyMap2, "emptyMap(...)");
        return mapEmptyMap2;
    }

    public static /* synthetic */ Object getRecentOneDayData$default(HomeDataRepository homeDataRepository, String str, long j, int i, Long l, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            l = null;
        }
        return homeDataRepository.getRecentOneDayData(str, j, i, l, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTheCardTypeData(HomeDataType homeDataType, long j, long j2, int i, Continuation<? super Map<String, ? extends List<? extends DailyRecordItem>>> continuation) {
        return DailyRecordDaoUtils.INSTANCE.getAllDailyRecord(homeDataType, null, j, j2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTheItemTypeData(long j, long j2, int i, String[] strArr, Continuation<? super Map<String, ? extends List<? extends DailyRecordItem>>> continuation) {
        return DailyRecordDaoUtils.INSTANCE.getTheDailyItems(null, j, j2, i, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private final boolean isDisplayRecentDataInHomePage(HomeDataType dataType) {
        switch (WhenMappings.$EnumSwitchMapping$0[dataType.ordinal()]) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DailyBasicReport processRelativeFitnessData(long relativeId, HomeDataType homeDataType, long time, RelativeDataModel model, Long latestAbnormalRecordTime) {
        WeightItem weightItem;
        int i = WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        if (i == 11) {
            DailyHrReport dailyHrReport = new DailyHrReport(time, "home");
            dailyHrReport.setHasNewAbnormalRecord(RelativeDataPreference.INSTANCE.hasNewAbnormalHr(relativeId, latestAbnormalRecordTime != null ? latestAbnormalRecordTime.longValue() : 0L));
            dailyHrReport.setLatestAbnormalRecordTime(latestAbnormalRecordTime);
            if (model == null) {
                return dailyHrReport;
            }
            HrItem hrItem = (HrItem) FitnessPersistUtils.INSTANCE.fromJson(model.getValue(), HrItem.class);
            if (hrItem != null) {
                hrItem.setTimestamp(time);
            }
            dailyHrReport.setLatestHrRecord(hrItem);
            return dailyHrReport;
        }
        if (i == 13) {
            DailySpo2Report dailySpo2Report = new DailySpo2Report(time, "home");
            dailySpo2Report.setHasNewAbnormalRecord(RelativeDataPreference.INSTANCE.hasNewAbnormalSpo2(relativeId, latestAbnormalRecordTime != null ? latestAbnormalRecordTime.longValue() : 0L));
            dailySpo2Report.setLatestAbnormalRecordTime(latestAbnormalRecordTime);
            if (model == null) {
                return dailySpo2Report;
            }
            Spo2Item spo2Item = (Spo2Item) FitnessPersistUtils.INSTANCE.fromJson(model.getValue(), Spo2Item.class);
            if (spo2Item != null) {
                spo2Item.setTimestamp(time);
            }
            dailySpo2Report.setLatestSpoRecord(spo2Item);
            return dailySpo2Report;
        }
        if (i == 16) {
            DailyWeightReport dailyWeightReport = new DailyWeightReport(time, "home");
            if (model == null || (weightItem = (WeightItem) FitnessPersistUtils.INSTANCE.fromJson(model.getValue(), WeightItem.class)) == null) {
                return dailyWeightReport;
            }
            weightItem.setTimestamp(time);
            dailyWeightReport.setWeightRecordList(Collections.singletonList(weightItem));
            return dailyWeightReport;
        }
        if (i == 18) {
            DailyBloodPressureReport dailyBloodPressureReport = new DailyBloodPressureReport(time, "home");
            if (model == null) {
                return dailyBloodPressureReport;
            }
            BloodPressureItem bloodPressureItem = (BloodPressureItem) FitnessPersistUtils.INSTANCE.fromJson(model.getValue(), BloodPressureItem.class);
            if (bloodPressureItem != null) {
                bloodPressureItem.setTimestamp(time);
            }
            dailyBloodPressureReport.setLatestRecord(bloodPressureItem);
            return dailyBloodPressureReport;
        }
        if (i == 27) {
            return new RainbowBiz().convertServerAggregateReport(time, "home", model);
        }
        switch (i) {
            case 4:
                return new StepBiz().convertServerAggregateReport(time, "home", model);
            case 5:
                return new CaloriesBiz().convertServerAggregateReport(time, "home", model);
            case 6:
                return new StandBiz().convertServerAggregateReport(time, "home", model);
            case 7:
                return new StrengthBiz().convertServerAggregateReport(time, "home", model);
            case 8:
                return new SleepBiz().convertServerAggregateReport(time, "home", model);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:111:0x031d  */
    /* JADX WARN: Code duplicated, block: B:118:0x038f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0392  */
    /* JADX WARN: Code duplicated, block: B:132:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0262 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0100  */
    /* JADX WARN: Code duplicated, block: B:33:0x0112  */
    /* JADX WARN: Code duplicated, block: B:35:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x014a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x014b  */
    /* JADX WARN: Code duplicated, block: B:60:0x020f  */
    /* JADX WARN: Code duplicated, block: B:61:0x021c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0234  */
    /* JADX WARN: Code duplicated, block: B:67:0x0250 A[Catch: Exception -> 0x0315, TryCatch #4 {Exception -> 0x0315, blocks: (B:65:0x024a, B:67:0x0250, B:69:0x025a, B:76:0x027f), top: B:132:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:69:0x025a A[Catch: Exception -> 0x0315, TRY_LEAVE, TryCatch #4 {Exception -> 0x0315, blocks: (B:65:0x024a, B:67:0x0250, B:69:0x025a, B:76:0x027f), top: B:132:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x027e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:90:0x02b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x02b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x014b -> B:136:0x0156). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01e9 -> B:120:0x0394). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:132:0x024a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object triggerHomeDataRequest(java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType> r27, java.lang.String r28, java.lang.Long r29, kotlin.coroutines.Continuation<? super java.util.Map<com.xiaomi.fit.fitness.export.data.annotation.HomeDataType, ? extends java.lang.Object>> r30) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.home.HomeDataRepository.triggerHomeDataRequest(java.util.List, java.lang.String, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object triggerHomeDataRequest$default(HomeDataRepository homeDataRepository, List list, String str, Long l, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "home";
        }
        if ((i & 4) != 0) {
            l = null;
        }
        return homeDataRepository.triggerHomeDataRequest(list, str, l, continuation);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository
    @NotNull
    public LiveData<Map<HomeDataType, Object>> getHomeData(@NotNull List<? extends HomeDataType> dataTypes) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        return CoroutineLiveDataKt.liveData$default(this.dispatcher, 0L, new C28311(dataTypes, null), 2, (Object) null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository
    @NotNull
    public StateFlow<Map<HomeDataType, Object>> getHomeDataFlowWithTag(@NotNull List<? extends HomeDataType> dataTypes, @NotNull String viewTag) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        return FlowKt.stateIn(FlowKt.flowOn(FlowKt.flow(new C28321(dataTypes, viewTag, null)), this.dispatcher), CoroutineScopeKt.CoroutineScope(this.dispatcher), SharingStarted.INSTANCE.getLazily(), MapsKt__MapsKt.emptyMap());
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository
    @NotNull
    public LiveData<Map<HomeDataType, Object>> getHomeDataWithTag(@NotNull List<? extends HomeDataType> dataTypes, @NotNull String viewTag) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        return CoroutineLiveDataKt.liveData$default(this.dispatcher, 0L, new C28331(dataTypes, viewTag, null), 2, (Object) null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository
    @NotNull
    public LiveData<Map<HomeDataType, Object>> getHomeDataWithTagTime(@NotNull List<? extends HomeDataType> dataTypes, @NotNull String viewTag, @Nullable Long baseZeroTimeInSec) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        return CoroutineLiveDataKt.liveData$default(this.dispatcher, 0L, new C28341(dataTypes, viewTag, baseZeroTimeInSec, null), 2, (Object) null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository
    @NotNull
    public LiveData<Map<HomeDataType, Object>> getHomeLiveData() {
        return this.mLiveData;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository
    @NotNull
    public LiveData<CloudDataResult<? extends Map<HomeDataType, DailyBasicReport>>> getRelativeHomeData(final long relativeId) {
        final long beginOfToday = TimeUtils.getBeginOfToday() / ((long) 1000);
        final Flow<CloudDataResult<? extends Map<HomeDataType, RelativeDataModel>>> homeData = RelativeDataRequest.INSTANCE.getInstance().getHomeData(relativeId);
        return FlowLiveDataConversions.asLiveData$default(FlowKt.flowOn(new Flow<CloudDataResult<? extends Map<HomeDataType, ? extends DailyBasicReport>>>() { // from class: com.xiaomi.fitness.repo.home.HomeDataRepository$getRelativeHomeData$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.home.HomeDataRepository$getRelativeHomeData$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HomeDataRepository.kt\ncom/xiaomi/fitness/repo/home/HomeDataRepository\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n54#2:223\n397#3,9:224\n406#3,15:234\n421#3:250\n423#3,3:252\n216#4:233\n217#4:251\n1#5:249\n*S KotlinDebug\n*F\n+ 1 HomeDataRepository.kt\ncom/xiaomi/fitness/repo/home/HomeDataRepository\n*L\n405#1:233\n405#1:251\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ long $relativeId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ long $todayTimestamp$inlined;
                final /* synthetic */ HomeDataRepository this$0;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.home.HomeDataRepository$getRelativeHomeData$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.home.HomeDataRepository$getRelativeHomeData$$inlined$map$1$2", f = "HomeDataRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, HomeDataRepository homeDataRepository, long j, long j2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = homeDataRepository;
                    this.$todayTimestamp$inlined = j;
                    this.$relativeId$inlined = j2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    CloudDataResult cloudDataResult;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = anonymousClass1.label;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        CloudDataResult cloudDataResult2 = (CloudDataResult) obj;
                        if (cloudDataResult2.getData() == null) {
                            cloudDataResult = new CloudDataResult(MapsKt__MapsKt.emptyMap(), cloudDataResult2.getErrorCode(), cloudDataResult2.getErrorMsg());
                            i = 1;
                        } else {
                            Object data = cloudDataResult2.getData();
                            Intrinsics.checkNotNull(data);
                            int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : ((Map) data).entrySet()) {
                                HomeDataType homeDataType = (HomeDataType) entry.getKey();
                                RelativeDataModel relativeDataModel = (RelativeDataModel) entry.getValue();
                                long time = relativeDataModel.getTime() == 0 ? this.$todayTimestamp$inlined : (relativeDataModel.getTime() + ((long) relativeDataModel.getZoneOffsetInSec())) - ((long) currentTZOffsetInSec);
                                FitnessLogUtils.d(this.this$0.TAG, "processRelativeFitnessData:" + time + "-" + homeDataType + "-" + relativeDataModel.getValue());
                                HomeDataRepository homeDataRepository = this.this$0;
                                long j = this.$relativeId$inlined;
                                int i4 = currentTZOffsetInSec;
                                long j2 = this.$todayTimestamp$inlined;
                                DailyBasicReport dailyBasicReportProcessRelativeFitnessData = homeDataRepository.processRelativeFitnessData(j, homeDataType, j2, time >= j2 ? relativeDataModel : null, relativeDataModel.getLatestAbnormalRecordTime());
                                if (dailyBasicReportProcessRelativeFitnessData != null) {
                                    linkedHashMap.put(homeDataType, dailyBasicReportProcessRelativeFitnessData);
                                }
                                currentTZOffsetInSec = i4;
                            }
                            FitnessLogUtils.i(this.this$0.TAG, "getRelativeHomeData: (" + linkedHashMap.size() + " types)");
                            cloudDataResult = new CloudDataResult(linkedHashMap, 0, null, 6, null);
                            i = 1;
                        }
                        anonymousClass1.label = i;
                        if (flowCollector.emit(cloudDataResult, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super CloudDataResult<? extends Map<HomeDataType, ? extends DailyBasicReport>>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = homeData.collect(new AnonymousClass2(flowCollector, this, beginOfToday, relativeId), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO()), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository
    public void triggerGetHomeData(@NotNull List<? extends HomeDataType> dataTypes) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        ScopeExtKt.scope(this.dispatcher, new C28351(dataTypes, null));
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository
    public void getHomeData(@NotNull List<? extends HomeDataType> dataTypes, @NotNull Function1<? super Map<HomeDataType, ? extends Object>, Unit> dataBack) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        Intrinsics.checkNotNullParameter(dataBack, "dataBack");
        ScopeExtKt.scope(this.dispatcher, new AnonymousClass2(dataBack, this, dataTypes, null));
    }
}
