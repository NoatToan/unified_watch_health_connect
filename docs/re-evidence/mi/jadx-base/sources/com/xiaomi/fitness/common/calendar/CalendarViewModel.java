package com.xiaomi.fitness.common.calendar;

import android.os.Bundle;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRedDotRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.calendar.CalendarViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.threetarget.RainbowExKt;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.util.TargetUtil;
import defpackage.cdp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bH\u0010IJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0019J-\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u001eJ)\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\"0\u00182\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\"¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R/\u00109\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020807078\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR/\u0010D\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020C0\f0\f8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/common/calendar/CalendarViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRedDotRepository;", "getRedDotRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRedDotRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "getRainbowRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "Lorg/joda/time/LocalDate;", "firstDayOfMonth", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "recentlyReportParam", "", "", "monthReportMap", "", "createMonthReportListInner", "(Lorg/joda/time/LocalDate;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;Ljava/util/Map;)V", StatConstants.PARAM_START, "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, "reqRecentRegularReport", "(Lorg/joda/time/LocalDate;JLjava/util/Map;Landroidx/lifecycle/LifecycleOwner;)V", "endTime", "Landroidx/lifecycle/LiveData;", "(J)Landroidx/lifecycle/LiveData;", StatConstants.PARAM_END, "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "homeDataType", "reqMonthsData", "(JJLcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;Landroidx/lifecycle/LifecycleOwner;)V", "reqDaysData", "beginInSecond", "endInSecond", "", "triggerFetchRainbowReportList", "(JJ)Landroidx/lifecycle/LiveData;", "list", "Lcom/xiaomi/fitness/common/calendar/MonthReportModel;", "createReportMap", "(Ljava/util/List;)Lcom/xiaomi/fitness/common/calendar/MonthReportModel;", "monthReportModel", "createMonthReportList", "(Lcom/xiaomi/fitness/common/calendar/MonthReportModel;Landroidx/lifecycle/LifecycleOwner;)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "repoProvider", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "getRepoProvider", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "setRepoProvider", "(Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;)V", "Ljava/util/HashMap;", "", "dots", "Ljava/util/HashMap;", "getDots", "()Ljava/util/HashMap;", "Landroidx/lifecycle/MutableLiveData;", "", "liveData", "Landroidx/lifecycle/MutableLiveData;", "getLiveData", "()Landroidx/lifecycle/MutableLiveData;", "Lcdp;", "circleModelMap", "Ljava/util/Map;", "getCircleModelMap", "()Ljava/util/Map;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/xiaomi/fitness/common/calendar/CalendarViewModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,181:1\n216#2,2:182\n216#2,2:184\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/xiaomi/fitness/common/calendar/CalendarViewModel\n*L\n52#1:182,2\n73#1:184,2\n*E\n"})
public final class CalendarViewModel extends AbsViewModel {

    @NotNull
    private final HashMap<Long, HashMap<Long, Integer>> dots = new HashMap<>();

    @NotNull
    private final MutableLiveData<Boolean> liveData = new MutableLiveData<>();

    @NotNull
    private final Map<Long, Map<Long, cdp>> circleModelMap = new LinkedHashMap();

    @NotNull
    private IRepositoryProvider repoProvider = FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE);

    private final void createMonthReportListInner(LocalDate firstDayOfMonth, DailyGoalReport recentlyReportParam, Map<Long, DailyGoalReport> monthReportMap) {
        LocalDate localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        while (true) {
            Intrinsics.checkNotNull(localDatePlusMonths);
            if (TimeDateUtil.isSameLocalDate(firstDayOfMonth, localDatePlusMonths)) {
                return;
            }
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(firstDayOfMonth);
            Logger.d(BaseCalendarFragment.TAG, "createMonthReportListInner  " + TimeDateUtil.timestampToLocalDate(jChangZeroOfTheDay));
            DailyGoalReport dailyGoalReport = monthReportMap.get(Long.valueOf(jChangZeroOfTheDay));
            if (dailyGoalReport != null) {
                recentlyReportParam = RainbowExKt.copyRecentlyReport(dailyGoalReport, dailyGoalReport);
            } else {
                recentlyReportParam = RainbowExKt.copyRecentlyReport(recentlyReportParam, recentlyReportParam);
                recentlyReportParam.setTime(jChangZeroOfTheDay);
                monthReportMap.put(Long.valueOf(jChangZeroOfTheDay), recentlyReportParam);
            }
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }
    }

    private final IRainbowRepository getRainbowRepo() {
        return this.repoProvider.getRainbowRepository();
    }

    private final IRedDotRepository getRedDotRepo() {
        return this.repoProvider.getRedDotRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqDaysData$lambda$3(CalendarViewModel this$0, Ref.ObjectRef month, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(month, "$month");
        Intrinsics.checkNotNull(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((Map) month.element).put(Long.valueOf(((Number) ((Map.Entry) it.next()).getKey()).longValue()), 1);
        }
        this$0.liveData.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqMonthsData$lambda$1(CalendarViewModel this$0, Ref.ObjectRef year, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(year, "$year");
        Intrinsics.checkNotNull(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((Map) year.element).put(Long.valueOf(((Number) ((Map.Entry) it.next()).getKey()).longValue()), 1);
        }
        this$0.liveData.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    private final void reqRecentRegularReport(final LocalDate firstDayOfMonth, final long start, final Map<Long, DailyGoalReport> monthReportMap, LifecycleOwner owner) {
        reqRecentRegularReport(start).observe(owner, new CalendarViewModelKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ga3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CalendarViewModel.reqRecentRegularReport$lambda$4(this.f18767a, firstDayOfMonth, monthReportMap, start, (DailyGoalReport) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqRecentRegularReport$lambda$4(CalendarViewModel this$0, LocalDate firstDayOfMonth, Map monthReportMap, long j, DailyGoalReport dailyGoalReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(firstDayOfMonth, "$firstDayOfMonth");
        Intrinsics.checkNotNullParameter(monthReportMap, "$monthReportMap");
        Logger.d(BaseCalendarFragment.TAG, "reqRecentRegularReport  " + TimeDateUtil.timestampToLocalDate(dailyGoalReport.getTime()));
        Intrinsics.checkNotNull(dailyGoalReport);
        this$0.createMonthReportListInner(firstDayOfMonth, dailyGoalReport, monthReportMap);
        Logger.d(BaseCalendarFragment.TAG, "circleModelMap put LocalDate " + TimeDateUtil.timestampToLocalDate(j) + " : " + j);
        this$0.circleModelMap.put(Long.valueOf(j), TargetUtil.createThreeCircleMap(monthReportMap));
        this$0.liveData.postValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final void createMonthReportList(@NotNull MonthReportModel monthReportModel, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(monthReportModel, "monthReportModel");
        Intrinsics.checkNotNullParameter(owner, "owner");
        long timeFirstDay = monthReportModel.getTimeFirstDay();
        Map<Long, DailyGoalReport> reportMap = monthReportModel.getReportMap();
        DailyGoalReport dailyGoalReport = reportMap.get(Long.valueOf(timeFirstDay));
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(timeFirstDay);
        if (dailyGoalReport == null) {
            reqRecentRegularReport(localDateTimestampToLocalDate, timeFirstDay, reportMap, owner);
            return;
        }
        createMonthReportListInner(localDateTimestampToLocalDate, dailyGoalReport, reportMap);
        LocalDate localDateTimestampToLocalDate2 = TimeDateUtil.timestampToLocalDate(timeFirstDay);
        StringBuilder sb = new StringBuilder();
        sb.append("circleModelMap put LocalDate ");
        sb.append(localDateTimestampToLocalDate2);
        sb.append(" : ");
        sb.append(timeFirstDay);
        this.circleModelMap.put(Long.valueOf(timeFirstDay), TargetUtil.createThreeCircleMap(reportMap));
        this.liveData.postValue(Boolean.TRUE);
    }

    @NotNull
    public final MonthReportModel createReportMap(@NotNull List<DailyGoalReport> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.isEmpty()) {
            return new MonthReportModel(-1L, linkedHashMap);
        }
        long time = list.get(0).getTime();
        for (DailyGoalReport dailyGoalReport : list) {
            linkedHashMap.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(dailyGoalReport.getTime())), dailyGoalReport);
            if (dailyGoalReport.getTime() < time) {
                time = dailyGoalReport.getTime();
            }
        }
        return new MonthReportModel(TimeDateUtil.getFirstDayOfMonthTime(time), linkedHashMap);
    }

    @NotNull
    public final Map<Long, Map<Long, cdp>> getCircleModelMap() {
        return this.circleModelMap;
    }

    @NotNull
    public final HashMap<Long, HashMap<Long, Integer>> getDots() {
        return this.dots;
    }

    @NotNull
    public final MutableLiveData<Boolean> getLiveData() {
        return this.liveData;
    }

    @NotNull
    public final IRepositoryProvider getRepoProvider() {
        return this.repoProvider;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void reqDaysData(long start, long end, @NotNull HomeDataType homeDataType, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        Intrinsics.checkNotNullParameter(owner, "owner");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r3 = this.dots.get(Long.valueOf(start));
        objectRef.element = r3;
        if (r3 != 0) {
            return;
        }
        objectRef.element = new HashMap();
        this.dots.put(Long.valueOf(start), (HashMap<Long, Integer>) objectRef.element);
        FlowLiveDataConversions.asLiveData$default(IRedDotRepository.DefaultImpls.getRedDotMap$default(getRedDotRepo(), homeDataType, start, end, null, 8, null), (CoroutineContext) null, 0L, 3, (Object) null).observe(owner, new CalendarViewModelKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ia3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CalendarViewModel.reqDaysData$lambda$3(this.f20931a, objectRef, (Map) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void reqMonthsData(long start, long end, @NotNull HomeDataType homeDataType, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        Intrinsics.checkNotNullParameter(owner, "owner");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r3 = this.dots.get(Long.valueOf(start));
        objectRef.element = r3;
        if (r3 != 0) {
            Logger.d("CalendarTag", "reqMonthData: already exists");
            return;
        }
        objectRef.element = new HashMap();
        this.dots.put(Long.valueOf(start), (HashMap<Long, Integer>) objectRef.element);
        FlowLiveDataConversions.asLiveData$default(getRedDotRepo().getRedDotMap(homeDataType, start, end, "months"), (CoroutineContext) null, 0L, 3, (Object) null).observe(owner, new CalendarViewModelKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ha3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CalendarViewModel.reqMonthsData$lambda$1(this.f19853a, objectRef, (Map) obj);
            }
        }));
    }

    public final void setRepoProvider(@NotNull IRepositoryProvider iRepositoryProvider) {
        Intrinsics.checkNotNullParameter(iRepositoryProvider, "<set-?>");
        this.repoProvider = iRepositoryProvider;
    }

    @NotNull
    public final LiveData<List<DailyGoalReport>> triggerFetchRainbowReportList(long beginInSecond, long endInSecond) {
        return getRainbowRepo().getDailyReportList(beginInSecond, endInSecond);
    }

    private final LiveData<DailyGoalReport> reqRecentRegularReport(long endTime) {
        return getRainbowRepo().getLatestDailyReportBefore(endTime);
    }
}
