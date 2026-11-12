package com.xiaomi.fitness.repo.rainbow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fit.fitness.export.data.aggregation.record.CalorieRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.UserProfileExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy;
import com.xiaomi.fitness.aggregation.health.dao.RainbowDaoProxy;
import com.xiaomi.fitness.aggregation.health.dao.TimeZoneUtil;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.lifecycle.DataHolder;
import com.xiaomi.fitness.common.lifecycle.IDataHandler;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.rainbow.RainbowRepository;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0012\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0010¢\u0006\u0002\b\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0002J\u0010\u0010$\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J$\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\"2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J(\u0010*\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000b2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010,H\u0002J\b\u0010-\u001a\u00020\u000fH\u0002J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010/\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u00100R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/repo/rainbow/RainbowRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "<init>", "()V", "RAINBOW_TAG", "", "userInfoMgr", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "ONE_DAY", "", "calendarCacheMap", "", "", "Ljava/util/Calendar;", "rainbowBiz", "Lcom/xiaomi/fitness/repo/rainbow/RainbowBiz;", "mergeTargetReport", "sid", CloudContract.COL_VIEW_TAG, "startTimestamp", "srcReportList", "", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getAllDailyReport", "timeInSecond", "widthDetail", "", "getDailyReport", "Landroidx/lifecycle/LiveData;", "getAllSupportRainbowItems", "isToday", "getDailyReportSync", "getDailyReportList", "beginInSecond", "endInSecond", "getLatestDailyReportBefore", "createNewReport", "goalMap", "", "getCurCalendar", "getTheReportDataSource", "report", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRainbowRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RainbowRepository.kt\ncom/xiaomi/fitness/repo/rainbow/RainbowRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n1863#2,2:372\n*S KotlinDebug\n*F\n+ 1 RainbowRepository.kt\ncom/xiaomi/fitness/repo/rainbow/RainbowRepository\n*L\n201#1:372,2\n*E\n"})
public final class RainbowRepository extends BaseRepository<DailyGoalReport> implements IRainbowRepository {

    @NotNull
    private final Map<Integer, Calendar> calendarCacheMap;

    @NotNull
    private final RainbowBiz rainbowBiz;

    @NotNull
    private final String RAINBOW_TAG = "RainbowRepository";

    @NotNull
    private final UserInfoManager userInfoMgr = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
    private final long ONE_DAY = TimeUnit.DAYS.toSeconds(1);

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.rainbow.RainbowRepository$getTheReportDataSource$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.rainbow.RainbowRepository$getTheReportDataSource$2", f = "RainbowRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {359, SpatialRelationUtil.A_CIRCLE_DEGREE, 361}, m = "invokeSuspend", n = {"calJob", "goalJob", "goalJob", "stepSidList", "stepSidList", "calSidList"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
        final /* synthetic */ DailyGoalReport $report;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DailyGoalReport dailyGoalReport, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$report = dailyGoalReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = RainbowRepository.this.new AnonymousClass2(this.$report, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0108 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0109  */
        /* JADX WARN: Code duplicated, block: B:27:0x011b A[LOOP:0: B:25:0x0115->B:27:0x011b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:31:0x012f A[LOOP:1: B:29:0x0129->B:31:0x012f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:35:0x0143 A[LOOP:2: B:33:0x013d->B:35:0x0143, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:38:0x017c  */
        /* JADX WARN: Code duplicated, block: B:39:0x0181  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred deferredAsync$default;
            Object objAwait;
            Deferred deferred;
            Object objAwait2;
            Deferred deferred2;
            List list;
            List list2;
            Object objAwait3;
            List list3;
            LinkedHashSet linkedHashSet;
            Iterator it;
            Iterator it2;
            Iterator it3;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    deferredAsync$default = (Deferred) this.L$1;
                    deferred = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait = obj;
                } else if (i == 2) {
                    list = (List) this.L$1;
                    Deferred deferred3 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    deferred2 = deferred3;
                    objAwait2 = obj;
                    list2 = (List) objAwait2;
                    this.L$0 = list;
                    this.L$1 = list2;
                    this.label = 3;
                    objAwait3 = deferred2.await(this);
                    if (objAwait3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list3 = list2;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) this.L$1;
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait3 = obj;
                }
                List list4 = (List) objAwait3;
                linkedHashSet = new LinkedHashSet();
                it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add((String) it.next());
                }
                it2 = list3.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add((String) it2.next());
                }
                it3 = list4.iterator();
                while (it3.hasNext()) {
                    linkedHashSet.add((String) it3.next());
                }
                FitnessLogUtils.i(RainbowRepository.this.RAINBOW_TAG, "getTheReportDataSource(" + this.$report.getTime() + "): sid(" + linkedHashSet + ")");
                return linkedHashSet.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt___CollectionsKt.toList(linkedHashSet);
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FitnessLogUtils.i(RainbowRepository.this.RAINBOW_TAG, "getTheReportDataSource(" + this.$report.getTime() + ")");
            long time = this.$report.getTime();
            long j = time + RainbowRepository.this.ONE_DAY;
            int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RainbowRepository$getTheReportDataSource$2$stepJob$1(time, j, currentTZOffsetInSec, null), 3, null);
            Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RainbowRepository$getTheReportDataSource$2$calJob$1(time, j, currentTZOffsetInSec, null), 3, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RainbowRepository$getTheReportDataSource$2$goalJob$1(this.$report, time, j, currentTZOffsetInSec, null), 3, null);
            this.L$0 = deferredAsync$default3;
            this.L$1 = deferredAsync$default;
            this.label = 1;
            objAwait = deferredAsync$default2.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred = deferredAsync$default3;
            List list5 = (List) objAwait;
            this.L$0 = deferredAsync$default;
            this.L$1 = list5;
            this.label = 2;
            objAwait2 = deferred.await(this);
            if (objAwait2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred2 = deferredAsync$default;
            list = list5;
            list2 = (List) objAwait2;
            this.L$0 = list;
            this.L$1 = list2;
            this.label = 3;
            objAwait3 = deferred2.await(this);
            if (objAwait3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            list3 = list2;
            List list6 = (List) objAwait3;
            linkedHashSet = new LinkedHashSet();
            it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add((String) it.next());
            }
            it2 = list3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add((String) it2.next());
            }
            it3 = list6.iterator();
            while (it3.hasNext()) {
                linkedHashSet.add((String) it3.next());
            }
            FitnessLogUtils.i(RainbowRepository.this.RAINBOW_TAG, "getTheReportDataSource(" + this.$report.getTime() + "): sid(" + linkedHashSet + ")");
            if (linkedHashSet.isEmpty()) {
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public RainbowRepository() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.calendarCacheMap = concurrentHashMap;
        this.rainbowBiz = new RainbowBiz();
        concurrentHashMap.put(Integer.valueOf(FitnessDateUtils.getCurrentTZOffsetInSec()), Calendar.getInstance());
    }

    private final DailyGoalReport createNewReport(long timeInSecond, Map<Integer, Integer> goalMap) {
        long beginOfDate = TimeUtils.getBeginOfDate(System.currentTimeMillis(), getCurCalendar()) / ((long) 1000);
        if (goalMap != null && timeInSecond < beginOfDate) {
            return DailyGoalReport.INSTANCE.getEmptyReport(timeInSecond, goalMap);
        }
        return DailyGoalReport.INSTANCE.getEmptyReport(timeInSecond, UserProfileExtKt.getRainbowItemGoalMap(UserInfoManager.getUserProfile$default(this.userInfoMgr, false, 1, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyGoalReport createNewReport$default(RainbowRepository rainbowRepository, long j, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return rainbowRepository.createNewReport(j, map);
    }

    private final List<Integer> getAllSupportRainbowItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        return arrayList;
    }

    private final Calendar getCurCalendar() {
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        Calendar calendar = this.calendarCacheMap.get(Integer.valueOf(currentTZOffsetInSec));
        if (calendar == null) {
            calendar = Calendar.getInstance();
            this.calendarCacheMap.put(Integer.valueOf(currentTZOffsetInSec), calendar);
        }
        Intrinsics.checkNotNull(calendar);
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getDailyReportList$lambda$3(RainbowRepository this$0, long j, long j2, List srcReportList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(srcReportList, "srcReportList");
        FitnessLogUtils.d(this$0.RAINBOW_TAG, "getDailyReportList->onDataReady:[" + j + ", " + j2 + ")");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(srcReportList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = srcReportList.iterator();
        while (it.hasNext()) {
            DailyGoalReport dailyGoalReport = (DailyGoalReport) it.next();
            linkedHashMap.put(Long.valueOf(dailyGoalReport.getTime()), dailyGoalReport);
        }
        DailyGoalReport dailyGoalReportQueryLatestRainbowBefore = (DailyGoalReport) linkedHashMap.get(Long.valueOf(j));
        if (dailyGoalReportQueryLatestRainbowBefore == null) {
            dailyGoalReportQueryLatestRainbowBefore = RainbowDaoProxy.INSTANCE.queryLatestRainbowBefore(j);
        }
        while (j < j2) {
            if (linkedHashMap.get(Long.valueOf(j)) == null) {
                arrayList.add(this$0.createNewReport(j, dailyGoalReportQueryLatestRainbowBefore != null ? dailyGoalReportQueryLatestRainbowBefore.getItemTypeAndGoal() : null));
            } else {
                dailyGoalReportQueryLatestRainbowBefore = (DailyGoalReport) linkedHashMap.get(Long.valueOf(j));
            }
            j += this$0.ONE_DAY;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DailyGoalReport getLatestDailyReportBefore$lambda$4(RainbowRepository this$0, long j, DailyGoalReport dailyGoalReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return dailyGoalReport == null ? createNewReport$default(this$0, j, null, 2, null) : dailyGoalReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isToday(long timeInSecond) {
        Calendar curCalendar = getCurCalendar();
        curCalendar.setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(curCalendar);
        return curCalendar.getTimeInMillis() == timeInSecond * ((long) 1000);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository
    @Nullable
    public DailyGoalReport getAllDailyReport(long timeInSecond, boolean widthDetail) {
        List<GoalItem> arrayList;
        List<StepRecord> stepRecords;
        List<CalorieRecord> calRecords;
        FitnessLogUtils.i(this.RAINBOW_TAG, "getAllDailyReport:timeInSecond = " + timeInSecond + ",widthDetail = " + widthDetail);
        long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(timeInSecond, FitnessDateUtils.getCurrentTZOffsetInSec(), 0);
        DailyGoalReport dailyGoalReportQueryLatestRainbowBeforeInZero = RainbowDaoProxy.INSTANCE.queryLatestRainbowBeforeInZero(jChangeToDestZeroTimeOneDay);
        FitnessLogUtils.i(this.RAINBOW_TAG, "time:" + jChangeToDestZeroTimeOneDay + " , summary:" + dailyGoalReportQueryLatestRainbowBeforeInZero);
        if (!widthDetail || dailyGoalReportQueryLatestRainbowBeforeInZero == null) {
            FitnessLogUtils.i(getTAG(), "widthDetail:" + widthDetail + " , summary:" + dailyGoalReportQueryLatestRainbowBeforeInZero);
        }
        FitnessDailyReportDaoProxy fitnessDailyReportDaoProxy = FitnessDailyReportDaoProxy.INSTANCE;
        DailyCalorieReport dailyCalorieReport = (DailyCalorieReport) fitnessDailyReportDaoProxy.queryDailyReportEntitySync(HomeDataType.CALORIE, timeInSecond);
        FitnessLogUtils.i(this.RAINBOW_TAG, "cal:" + (dailyCalorieReport != null ? Integer.valueOf(dailyCalorieReport.getCalories()) : null) + " , calRecordSize:" + ((dailyCalorieReport == null || (calRecords = dailyCalorieReport.getCalRecords()) == null) ? null : Integer.valueOf(calRecords.size())));
        DailyStepReport dailyStepReport = (DailyStepReport) fitnessDailyReportDaoProxy.queryDailyReportEntitySync(HomeDataType.STEP, timeInSecond);
        FitnessLogUtils.i(this.RAINBOW_TAG, "step:" + (dailyStepReport != null ? Integer.valueOf(dailyStepReport.getSteps()) : null) + " , stepRecordSize:" + ((dailyStepReport == null || (stepRecords = dailyStepReport.getStepRecords()) == null) ? null : Integer.valueOf(stepRecords.size())));
        DailyStandReport dailyStandReport = (DailyStandReport) fitnessDailyReportDaoProxy.queryDailyReportEntitySync(HomeDataType.VALID_STAND, timeInSecond);
        FitnessLogUtils.i(this.RAINBOW_TAG, "stand:" + (dailyStandReport != null ? Integer.valueOf(dailyStandReport.getStandCount()) : null));
        DailyMHStrengthReport dailyMHStrengthReport = (DailyMHStrengthReport) fitnessDailyReportDaoProxy.queryDailyReportEntitySync(HomeDataType.MH_STRENGTH, timeInSecond);
        FitnessLogUtils.i(this.RAINBOW_TAG, "strength:" + (dailyMHStrengthReport != null ? Integer.valueOf(dailyMHStrengthReport.getDuration()) : null));
        if (dailyGoalReportQueryLatestRainbowBeforeInZero == null || (arrayList = dailyGoalReportQueryLatestRainbowBeforeInZero.goalList()) == null) {
            arrayList = new ArrayList<>();
        }
        DailyGoalReport dailyGoalReport = new DailyGoalReport(timeInSecond, arrayList);
        dailyGoalReport.setStepReport(dailyStepReport);
        dailyGoalReport.setCalReport(dailyCalorieReport);
        dailyGoalReport.setValidStandReport(dailyStandReport);
        dailyGoalReport.setMhStrengthReport(dailyMHStrengthReport);
        return dailyGoalReport;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyGoalReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.rainbowBiz;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository
    @NotNull
    public LiveData<DailyGoalReport> getDailyReport(final long timeInSecond, final boolean widthDetail) {
        String str;
        String str2;
        String str3;
        String str4;
        FitnessLogUtils.i(this.RAINBOW_TAG, "getDailyRainbowReport:timeInSecond = " + timeInSecond + ",widthDetail = " + widthDetail);
        final UserProfile userProfile$default = UserInfoManager.getUserProfile$default(this.userInfoMgr, false, 1, null);
        Calendar curCalendar = getCurCalendar();
        long j = (long) 1000;
        curCalendar.setTimeInMillis(timeInSecond * j);
        TimeUtils.setToZeroOClock(curCalendar);
        curCalendar.add(5, 1);
        LiveData liveDataQueryRainbowListAsync$default = RainbowDaoProxy.queryRainbowListAsync$default(RainbowDaoProxy.INSTANCE, timeInSecond, curCalendar.getTimeInMillis() / j, false, 4, null);
        final String str5 = "summary";
        final String str6 = "stand";
        final String str7 = "strength";
        final String str8 = "calorie";
        final String str9 = "step";
        DataHolder dataHolder = new DataHolder(new IDataHandler<DailyGoalReport>() { // from class: com.xiaomi.fitness.repo.rainbow.RainbowRepository$getDailyReport$handler$1
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v16, types: [T, com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport] */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport] */
            /* JADX WARN: Type inference failed for: r8v2, types: [T, com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport] */
            @Override // com.xiaomi.fitness.common.lifecycle.IDataHandler
            public DailyGoalReport onDataReady(IDataHandler.DataSet dataSet) {
                DailyGoalReport dailyGoalReportQueryLatestRainbowBefore;
                Intrinsics.checkNotNullParameter(dataSet, "dataSet");
                Map<Integer, Integer> rainbowItemGoalMap = UserProfileExtKt.getRainbowItemGoalMap(userProfile$default);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                DailyGoalReport.Companion companion = DailyGoalReport.INSTANCE;
                objectRef.element = companion.getEmptyReport(timeInSecond, rainbowItemGoalMap);
                if (!this.isToday(timeInSecond) && (dailyGoalReportQueryLatestRainbowBefore = RainbowDaoProxy.INSTANCE.queryLatestRainbowBefore(timeInSecond)) != null) {
                    objectRef.element = companion.getEmptyReport(timeInSecond, dailyGoalReportQueryLatestRainbowBefore.getItemTypeAndGoal());
                }
                List<??> list = (List) dataSet.get(str5);
                if (list != null) {
                    long j2 = timeInSecond;
                    String str10 = str9;
                    String str11 = str8;
                    String str12 = str6;
                    String str13 = str7;
                    for (?? r8 : list) {
                        if (r8.getTime() == j2) {
                            r8.setStepReport((DailyStepReport) dataSet.get(str10));
                            r8.setCalReport((DailyCalorieReport) dataSet.get(str11));
                            if (r8.containsStanding()) {
                                r8.setValidStandReport((DailyStandReport) dataSet.get(str12));
                            }
                            if (r8.containsMHIntensity()) {
                                r8.setMhStrengthReport((DailyMHStrengthReport) dataSet.get(str13));
                            }
                            objectRef.element = r8;
                        }
                    }
                }
                FitnessLogUtils.d(this.RAINBOW_TAG, "onDataReady:resReport = " + objectRef.element + ", widthDetail = " + widthDetail);
                return (DailyGoalReport) objectRef.element;
            }
        }, false, 2, null);
        Intrinsics.checkNotNull(liveDataQueryRainbowListAsync$default, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.collections.List<*>>");
        DataHolder dataHolderAddSource = dataHolder.addSource("summary", List.class, liveDataQueryRainbowListAsync$default);
        if (!widthDetail) {
            return DataHolder.asLiveData$default(dataHolderAddSource, null, 1, null);
        }
        Iterator<T> it = (isToday(timeInSecond) ? UserProfileExtKt.getRainbowItemTypes(userProfile$default) : getAllSupportRainbowItems()).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue == 3) {
                        str2 = str7;
                        str = str6;
                        dataHolderAddSource.addSource(str, DailyStandReport.class, FitnessDailyReportDaoProxy.queryDailyReportEntity$default(FitnessDailyReportDaoProxy.INSTANCE, HomeDataType.VALID_STAND, timeInSecond, false, 4, null));
                    } else if (iIntValue != 4) {
                        str = str6;
                        str2 = str7;
                    } else {
                        str2 = str7;
                        dataHolderAddSource.addSource(str2, DailyMHStrengthReport.class, FitnessDailyReportDaoProxy.queryDailyReportEntity$default(FitnessDailyReportDaoProxy.INSTANCE, HomeDataType.MH_STRENGTH, timeInSecond, false, 4, null));
                        str = str6;
                    }
                    str3 = str8;
                } else {
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    dataHolderAddSource.addSource(str3, DailyCalorieReport.class, FitnessDailyReportDaoProxy.queryDailyReportEntity$default(FitnessDailyReportDaoProxy.INSTANCE, HomeDataType.CALORIE, timeInSecond, false, 4, null));
                }
                str4 = str9;
            } else {
                str = str6;
                str2 = str7;
                str3 = str8;
                str4 = str9;
                dataHolderAddSource.addSource(str4, DailyStepReport.class, FitnessDailyReportDaoProxy.queryDailyReportEntity$default(FitnessDailyReportDaoProxy.INSTANCE, HomeDataType.STEP, timeInSecond, false, 4, null));
            }
            str9 = str4;
            str7 = str2;
            str6 = str;
            str8 = str3;
        }
        return DataHolder.asLiveData$default(dataHolderAddSource, null, 1, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository
    @NotNull
    public LiveData<List<DailyGoalReport>> getDailyReportList(final long beginInSecond, final long endInSecond) {
        return Transformations.map(RainbowDaoProxy.queryRainbowListAsync$default(RainbowDaoProxy.INSTANCE, beginInSecond, endInSecond, false, 4, null), new Function1() { // from class: jbj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RainbowRepository.getDailyReportList$lambda$3(this.f22621a, beginInSecond, endInSecond, (List) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository
    @NotNull
    public DailyGoalReport getDailyReportSync(long timeInSecond) {
        DailyGoalReport dailyGoalReportQueryDailyGoalReport = RainbowDaoProxy.INSTANCE.queryDailyGoalReport(TimeZoneUtil.INSTANCE.normalizeTime(timeInSecond), true);
        if (dailyGoalReportQueryDailyGoalReport != null) {
            return dailyGoalReportQueryDailyGoalReport;
        }
        return DailyGoalReport.INSTANCE.getEmptyReport(timeInSecond, UserProfileExtKt.getRainbowItemGoalMap(this.userInfoMgr.getUserProfile(false)));
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.RAINBOW;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository
    @NotNull
    public LiveData<DailyGoalReport> getLatestDailyReportBefore(final long timeInSecond) {
        return Transformations.map(RainbowDaoProxy.INSTANCE.queryLatestRainbowBeforeAsync(timeInSecond), new Function1() { // from class: ibj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RainbowRepository.getLatestDailyReportBefore$lambda$4(this.f20978a, timeInSecond, (DailyGoalReport) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository
    @Nullable
    public Object getTheReportDataSource(@NotNull DailyGoalReport dailyGoalReport, @NotNull Continuation<? super List<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(dailyGoalReport, null), continuation);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyGoalReport>) list);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public DailyGoalReport mergeTargetReport(@Nullable String sid, @NotNull String viewTag, long startTimestamp, @NotNull List<DailyGoalReport> srcReportList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(srcReportList, "srcReportList");
        return srcReportList.isEmpty() ? DailyGoalReport.INSTANCE.getEmptyReport(startTimestamp, MapsKt__MapsKt.emptyMap()) : srcReportList.get(0);
    }
}
