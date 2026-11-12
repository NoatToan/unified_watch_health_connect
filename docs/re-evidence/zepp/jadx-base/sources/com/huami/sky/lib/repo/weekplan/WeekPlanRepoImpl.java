package com.huami.sky.lib.repo.weekplan;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.module.ktx.TimeExtKt;
import com.huami.sky.lib.cache.SkyPlayCache;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0016J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/lib/repo/weekplan/WeekPlanRepoImpl;", "Lcom/huami/sky/lib/repo/weekplan/IWeekPlanRepo;", "", "timeStamp", "", "dateStr", "", "b", "addStartDate", "clearStartDate", "getStartDate", "Ljava/util/Date;", "date", "", "isMarked", "markDate", "", "getMarkedDate", "", "days", "Lkotlin/Pair;", "refreshWeekList", "Lcom/google/gson/Gson;", "a", "Lkotlin/Lazy;", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "Companion", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanRepoImpl implements IWeekPlanRepo {

    @NotNull
    public static final String TAG = "WeekPlanRepoImpl";

    @NotNull
    public static final String WEEKPLAN_EMPTY_TAG = "WEEKPLAN_EMPTY_TAG";
    private static final int b = 9;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Gson> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            this.a.printStackTrace();
            return String.valueOf(Unit.INSTANCE);
        }
    }

    private final Gson a() {
        return (Gson) this.gson.getValue();
    }

    private final void b(long timeStamp, String dateStr) {
        SkyPlayCache.INSTANCE.getInstance().saveSetWithUserId(IWeekPlanRepoKt.WEEK_PLAN_DATE_LIST, y.mutableSetOf(a().toJson(new WeekPlanPO(timeStamp, dateStr))));
    }

    @Override // com.huami.sky.lib.repo.weekplan.IWeekPlanRepo
    public void addStartDate(@NotNull String dateStr) {
        SkyPlayCache.INSTANCE.getInstance().saveStringWithUserId(IWeekPlanRepoKt.WEEK_PLAN_START_DATE, dateStr);
    }

    @Override // com.huami.sky.lib.repo.weekplan.IWeekPlanRepo
    public void clearStartDate() {
        SkyPlayCache.INSTANCE.getInstance().saveStringWithUserId(IWeekPlanRepoKt.WEEK_PLAN_START_DATE, WEEKPLAN_EMPTY_TAG);
    }

    @Override // com.huami.sky.lib.repo.weekplan.IWeekPlanRepo
    @NotNull
    public List<String> getMarkedDate() {
        Set<String> setWithUserId = SkyPlayCache.INSTANCE.getInstance().getSetWithUserId(IWeekPlanRepoKt.WEEK_PLAN_DATE_LIST);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setWithUserId, 10));
        Iterator<T> it2 = setWithUserId.iterator();
        while (it2.hasNext()) {
            arrayList.add(((WeekPlanPO) a().fromJson((String) it2.next(), new TypeToken<WeekPlanPO>() { // from class: com.huami.sky.lib.repo.weekplan.WeekPlanRepoImpl$getMarkedDate$lambda-8$$inlined$fromJson$1
            }.getType())).getDateStr());
        }
        return arrayList;
    }

    @Override // com.huami.sky.lib.repo.weekplan.IWeekPlanRepo
    @Nullable
    public String getStartDate() {
        String stringWithUserId = SkyPlayCache.INSTANCE.getInstance().getStringWithUserId(IWeekPlanRepoKt.WEEK_PLAN_START_DATE, WEEKPLAN_EMPTY_TAG);
        if (stringWithUserId == null) {
            return null;
        }
        if (Intrinsics.areEqual(stringWithUserId, WEEKPLAN_EMPTY_TAG)) {
            stringWithUserId = null;
        }
        return stringWithUserId;
    }

    @Override // com.huami.sky.lib.repo.weekplan.IWeekPlanRepo
    public void markDate(@NotNull Date date, boolean isMarked) {
        Object objM3845constructorimpl;
        Object next;
        Set<String> setWithUserId = SkyPlayCache.INSTANCE.getInstance().getSetWithUserId(IWeekPlanRepoKt.WEEK_PLAN_DATE_LIST);
        Boolean boolValueOf = null;
        if (setWithUserId == null || setWithUserId.isEmpty()) {
            String timeString$default = TimeExtKt.toTimeString$default(date, (String) null, (Locale) null, 3, (Object) null);
            if (timeString$default == null) {
                return;
            }
            b(TimeExtKt.getBeginningTime(date), timeString$default);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            Set<String> mutableSet = CollectionsKt___CollectionsKt.toMutableSet(setWithUserId);
            if (mutableSet.size() > 9) {
                Iterator<T> it2 = mutableSet.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long timeStamp = ((WeekPlanPO) a().fromJson((String) next, new TypeToken<WeekPlanPO>() { // from class: com.huami.sky.lib.repo.weekplan.WeekPlanRepoImpl$markDate$lambda-6$lambda-5$lambda-2$$inlined$fromJson$1
                        }.getType())).getTimeStamp();
                        do {
                            Object next2 = it2.next();
                            long timeStamp2 = ((WeekPlanPO) a().fromJson((String) next2, new TypeToken<WeekPlanPO>() { // from class: com.huami.sky.lib.repo.weekplan.WeekPlanRepoImpl$markDate$lambda-6$lambda-5$lambda-2$$inlined$fromJson$1
                            }.getType())).getTimeStamp();
                            if (timeStamp > timeStamp2) {
                                next = next2;
                                timeStamp = timeStamp2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                String str = (String) next;
                if (str != null) {
                    mutableSet.remove(str);
                }
            }
            String timeString$default2 = TimeExtKt.toTimeString$default(date, (String) null, (Locale) null, 3, (Object) null);
            if (timeString$default2 != null) {
                mutableSet.add(a().toJson(new WeekPlanPO(TimeExtKt.getBeginningTime(date), timeString$default2)));
                boolValueOf = Boolean.valueOf(SkyPlayCache.INSTANCE.getInstance().saveSetWithUserId(IWeekPlanRepoKt.WEEK_PLAN_DATE_LIST, mutableSet));
            }
            objM3845constructorimpl = Result.m3845constructorimpl(boolValueOf);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(TAG, new b(thM3848exceptionOrNullimpl));
        }
    }

    @Override // com.huami.sky.lib.repo.weekplan.IWeekPlanRepo
    @Nullable
    public Pair<Date, Date> refreshWeekList(int days) {
        Date date$default;
        String startDate = getStartDate();
        if (startDate == null || (date$default = TimeExtKt.toDate$default(startDate, null, null, 3, null)) == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date$default);
        return TimeExtKt.timeRange(calendar, 1 - days);
    }
}
