package com.xiaomi.fitness.health.sleep.rhythm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonthItemViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.calendar.SleepRhythmCalendarDayData;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0018\u001a\u00020\u0014H\u0002R#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonthItemViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "monthCalendarRecordStatusLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarDayData;", "getMonthCalendarRecordStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "sleepDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "getSleepDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "sleepDataRepo$delegate", "Lkotlin/Lazy;", "requestMonthCalendarRecordStatus", "", DialWidgetType.DATE, "Lorg/joda/time/LocalDate;", "requestRhythmMonthRecords", "(Lorg/joda/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initMonthMap", "localDate", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmMonthItemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmMonthItemViewModel.kt\ncom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonthItemViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class SleepRhythmMonthItemViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "SleepRhythmMonthItemViewModel";

    @NotNull
    private final MutableLiveData<Map<Long, SleepRhythmCalendarDayData>> monthCalendarRecordStatusLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: sleepDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sum
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepRhythmMonthItemViewModel.sleepDataRepo_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonthItemViewModel$requestMonthCalendarRecordStatus$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonthItemViewModel$requestMonthCalendarRecordStatus$1", f = "SleepRhythmMonthItemViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalDate $date;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LocalDate localDate, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$date = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepRhythmMonthItemViewModel.this.new AnonymousClass1(this.$date, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepRhythmMonthItemViewModel sleepRhythmMonthItemViewModel = SleepRhythmMonthItemViewModel.this;
                LocalDate localDate = this.$date;
                this.label = 1;
                obj = sleepRhythmMonthItemViewModel.requestRhythmMonthRecords(localDate, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SleepRhythmMonthItemViewModel.this.getMonthCalendarRecordStatusLiveData().postValue((Map) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonthItemViewModel$requestRhythmMonthRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonthItemViewModel", f = "SleepRhythmMonthItemViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {52, 53}, m = "requestRhythmMonthRecords", n = {"this", "dataMap", "reqStart", "reqEnd", "dataMap", "rhythmRecords", "reqStart", "reqEnd"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1"})
    public static final class C25061 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C25061(Continuation<? super C25061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepRhythmMonthItemViewModel.this.requestRhythmMonthRecords(null, this);
        }
    }

    private final ISleepRepository getSleepDataRepo() {
        return (ISleepRepository) this.sleepDataRepo.getValue();
    }

    private final Map<Long, SleepRhythmCalendarDayData> initMonthMap(LocalDate localDate) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long firstDayOfMonthMillis = CurseExtKt.getFirstDayOfMonthMillis(localDate);
        LocalDate firstDayOfMonthLocalDate = CurseExtKt.getFirstDayOfMonthLocalDate(localDate);
        int daysOfMonth = TimeDateUtil.INSTANCE.getDaysOfMonth(firstDayOfMonthMillis) + 30;
        for (int i = -30; i < daysOfMonth; i++) {
            LocalDate localDatePlusDays = firstDayOfMonthLocalDate.plusDays(i);
            Intrinsics.checkNotNull(localDatePlusDays);
            long mills = ExtUtilKt.getMills(localDatePlusDays) / ((long) 1000);
            linkedHashMap.put(Long.valueOf(mills), new SleepRhythmCalendarDayData(mills, 0, 2, null));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:31:0x0120  */
    /* JADX WARN: Code duplicated, block: B:42:0x014d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0152  */
    /* JADX WARN: Code duplicated, block: B:46:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object requestRhythmMonthRecords(LocalDate localDate, Continuation<? super Map<Long, SleepRhythmCalendarDayData>> continuation) {
        C25061 c25061;
        long jLongValue;
        long jLongValue2;
        SleepRhythmMonthItemViewModel sleepRhythmMonthItemViewModel;
        Map<Long, SleepRhythmCalendarDayData> map;
        List list;
        long j;
        Map<Long, SleepRhythmCalendarDayData> map2;
        long j2;
        Map map3;
        long jLongValue3;
        SleepRhythmCalendarDayData value;
        Iterator it;
        Object next;
        SleepRhythmReport sleepRhythmReport;
        Integer num;
        int iIntValue;
        SleepRhythmReport sleepRhythmReport2;
        if (continuation instanceof C25061) {
            c25061 = (C25061) continuation;
            int i = c25061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c25061.label = i - Integer.MIN_VALUE;
            } else {
                c25061 = new C25061(continuation);
            }
        } else {
            c25061 = new C25061(continuation);
        }
        C25061 c25062 = c25061;
        Object obj = c25062.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c25062.label;
        if (i2 != 0) {
            if (i2 == 1) {
                long j3 = c25062.J$1;
                long j4 = c25062.J$0;
                Map<Long, SleepRhythmCalendarDayData> map4 = (Map) c25062.L$1;
                sleepRhythmMonthItemViewModel = (SleepRhythmMonthItemViewModel) c25062.L$0;
                ResultKt.throwOnFailure(obj);
                jLongValue2 = j3;
                jLongValue = j4;
                map = map4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = c25062.J$1;
                j2 = c25062.J$0;
                list = (List) c25062.L$1;
                map2 = (Map) c25062.L$0;
                ResultKt.throwOnFailure(obj);
            }
            map3 = (Map) obj;
            Logger.i(TAG, "request rhythmRecords:" + list + ";recordStatus:" + map3 + ";reqStart:" + j2 + ";reqEnd:" + j);
            for (Map.Entry<Long, SleepRhythmCalendarDayData> entry : map2.entrySet()) {
                jLongValue3 = entry.getKey().longValue();
                value = entry.getValue();
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    sleepRhythmReport2 = (SleepRhythmReport) next;
                    long time = sleepRhythmReport2.getTime();
                    if (jLongValue3 > sleepRhythmReport2.getEndTime() && time <= jLongValue3) {
                        break;
                    }
                }
                sleepRhythmReport = (SleepRhythmReport) next;
                if (sleepRhythmReport == null) {
                    value.setRhythm(sleepRhythmReport);
                    num = (Integer) map3.get(Boxing.boxLong(jLongValue3));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    value.setType(iIntValue);
                }
            }
            return map2;
        }
        ResultKt.throwOnFailure(obj);
        Map<Long, SleepRhythmCalendarDayData> mapInitMonthMap = initMonthMap(localDate);
        Set<Long> setKeySet = mapInitMonthMap.keySet();
        jLongValue = ((Number) CollectionsKt___CollectionsKt.first(setKeySet)).longValue();
        jLongValue2 = ((Number) CollectionsKt___CollectionsKt.last(setKeySet)).longValue();
        ISleepRepository sleepDataRepo = getSleepDataRepo();
        c25062.L$0 = this;
        c25062.L$1 = mapInitMonthMap;
        c25062.J$0 = jLongValue;
        c25062.J$1 = jLongValue2;
        c25062.label = 1;
        Object sleepRhythmRecords = sleepDataRepo.getSleepRhythmRecords(jLongValue, jLongValue2, c25062);
        if (sleepRhythmRecords == coroutine_suspended) {
            return coroutine_suspended;
        }
        sleepRhythmMonthItemViewModel = this;
        map = mapInitMonthMap;
        obj = sleepRhythmRecords;
        List list2 = (List) obj;
        ISleepRepository sleepDataRepo2 = sleepRhythmMonthItemViewModel.getSleepDataRepo();
        c25062.L$0 = map;
        c25062.L$1 = list2;
        c25062.J$0 = jLongValue;
        c25062.J$1 = jLongValue2;
        c25062.label = 2;
        long j5 = jLongValue;
        Object sleepRhythmAndDiaryRecordStatus$default = ISleepRepository.DefaultImpls.getSleepRhythmAndDiaryRecordStatus$default(sleepDataRepo2, jLongValue, jLongValue2, 0, false, c25062, 12, null);
        if (sleepRhythmAndDiaryRecordStatus$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = list2;
        obj = sleepRhythmAndDiaryRecordStatus$default;
        j = jLongValue2;
        map2 = map;
        j2 = j5;
        map3 = (Map) obj;
        Logger.i(TAG, "request rhythmRecords:" + list + ";recordStatus:" + map3 + ";reqStart:" + j2 + ";reqEnd:" + j);
        while (r2.hasNext()) {
            jLongValue3 = entry.getKey().longValue();
            value = entry.getValue();
            it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                sleepRhythmReport2 = (SleepRhythmReport) next;
                long time2 = sleepRhythmReport2.getTime();
                if (jLongValue3 > sleepRhythmReport2.getEndTime()) {
                }
            }
            sleepRhythmReport = (SleepRhythmReport) next;
            if (sleepRhythmReport == null) {
                value.setRhythm(sleepRhythmReport);
                num = (Integer) map3.get(Boxing.boxLong(jLongValue3));
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                value.setType(iIntValue);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISleepRepository sleepDataRepo_delegate$lambda$0() {
        return (ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class);
    }

    @NotNull
    public final MutableLiveData<Map<Long, SleepRhythmCalendarDayData>> getMonthCalendarRecordStatusLiveData() {
        return this.monthCalendarRecordStatusLiveData;
    }

    public final void requestMonthCalendarRecordStatus(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(date, null), 2, null);
    }
}
