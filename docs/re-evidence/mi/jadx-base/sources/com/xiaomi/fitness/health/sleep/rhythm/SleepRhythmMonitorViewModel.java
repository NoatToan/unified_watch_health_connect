package com.xiaomi.fitness.health.sleep.rhythm;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.DeviceResultCode;
import com.xiaomi.fitness.common.lifecycle.LiveDataHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.calendar.SleepRhythmCalendarDayData;
import com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmExtKt;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepSettingRepository;
import com.xiaomi.fitness.util.DeviceModelExtKt;
import com.xiaomi.fitness.watch.face.edit.utils.Source;
import defpackage.ut9;
import defpackage.vt9;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001UB\t\b\u0007¢\u0006\u0004\bT\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001d\u0010\u001aJ\u0019\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f0\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u001d\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001e2\u0006\u0010#\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u001e¢\u0006\u0004\b'\u0010!J\u001d\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001e¢\u0006\u0004\b,\u0010!R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010;R)\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0>0=8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR)\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140>0=8\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR+\u0010F\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010E0>0=8\u0006¢\u0006\f\n\u0004\bF\u0010@\u001a\u0004\bG\u0010BR+\u0010I\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010H0>0=8\u0006¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010BR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\f0=8\u0006¢\u0006\f\n\u0004\bK\u0010@\u001a\u0004\bL\u0010BR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020M0=8\u0006¢\u0006\f\n\u0004\bN\u0010@\u001a\u0004\bO\u0010BR)\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020Q0P0=8\u0006¢\u0006\f\n\u0004\bR\u0010@\u001a\u0004\bS\u0010B¨\u0006V"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "sleepRhythmReport", "", "setSleepRhythmMonitorToDevice", "(Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;)V", "", "sleepRhythmRecords", "", "startTimeSecond", "endInSecond", "", "checkOverlapping", "(Ljava/util/List;JJ)Z", "queryStart", "queryEndTime", "findEffectiveNoDiaryDate", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "", "times", "setSleepRhythmRemind", "(ZLjava/util/List;)V", "setSleepRhythmMonitor", "requestShowSleepAssistStatus", "()V", "requestSleepRhythmRemind", "requestSleepRhythmMonitor", "onCleared", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "queryAllSleepRhythmRecordsLiveData", "()Landroidx/lifecycle/LiveData;", "queryLatestSleepRhythmLiveData", Source.TIME_SECOND, "queryLatestSleepRhythmBeforeTodayLiveData", "(J)Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "queryLatestSleepDiaryLiveData", "", "sid", "addSleepRhyThmReport", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;)V", "queryJumpDiaryDateLiveData", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorRepository;", "rhythmRepo$delegate", "Lkotlin/Lazy;", "getRhythmRepo", "()Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorRepository;", "rhythmRepo", "Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "sleepSettingRepo$delegate", "getSleepSettingRepo", "()Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "sleepSettingRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "sleepDataRepo$delegate", "getSleepDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "sleepDataRepo", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "setRemindConfigResultLiveData", "Landroidx/lifecycle/MutableLiveData;", "getSetRemindConfigResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setMonitorResultLiveData", "getSetMonitorResultLiveData", "Lut9;", "getRemindResultLiveData", "getGetRemindResultLiveData", "Lvt9;", "getMonitorResultLiveData", "getGetMonitorResultLiveData", "sleepAssistSwitchLiveData", "getSleepAssistSwitchLiveData", "Lorg/joda/time/LocalDate;", "onDayClickLiveData", "getOnDayClickLiveData", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarDayData;", "resumeMonthItemLiveData", "getResumeMonthItemLiveData", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepRhythmMonitorViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmMonitorViewModel.kt\ncom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,293:1\n1863#2,2:294\n*S KotlinDebug\n*F\n+ 1 SleepRhythmMonitorViewModel.kt\ncom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorViewModel\n*L\n131#1:294,2\n*E\n"})
public final class SleepRhythmMonitorViewModel extends AbsViewModel {
    public static final int RESULT_CODE_RHYTHM_OVERLAPPING = 1000;

    @NotNull
    public static final String TAG = "SleepRhythmMonitorViewModel";

    /* JADX INFO: renamed from: rhythmRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rhythmRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lum
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepRhythmMonitorViewModel.rhythmRepo_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: sleepSettingRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepSettingRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mum
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepRhythmMonitorViewModel.sleepSettingRepo_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: sleepDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: num
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepRhythmMonitorViewModel.sleepDataRepo_delegate$lambda$2();
        }
    });

    @NotNull
    private final MutableLiveData<Pair<Integer, Boolean>> setRemindConfigResultLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<Integer, Integer>> setMonitorResultLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<Integer, ut9>> getRemindResultLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<Integer, vt9>> getMonitorResultLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> sleepAssistSwitchLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<LocalDate> onDayClickLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Map<Long, SleepRhythmCalendarDayData>> resumeMonthItemLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$addSleepRhyThmReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$addSleepRhyThmReport$1", f = "SleepRhythmMonitorViewModel.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sid;
        final /* synthetic */ SleepRhythmReport $sleepRhythmReport;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, SleepRhythmReport sleepRhythmReport, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$sleepRhythmReport = sleepRhythmReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepRhythmMonitorViewModel.this.new AnonymousClass1(this.$sid, this.$sleepRhythmReport, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ISleepRepository sleepDataRepo = SleepRhythmMonitorViewModel.this.getSleepDataRepo();
                String str = this.$sid;
                SleepRhythmReport sleepRhythmReport = this.$sleepRhythmReport;
                this.label = 1;
                if (sleepDataRepo.addSleepRhyThmReport(str, sleepRhythmReport, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$findEffectiveNoDiaryDate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel", f = "SleepRhythmMonitorViewModel.kt", i = {0, 0, 0}, l = {255, 281}, m = "findEffectiveNoDiaryDate", n = {"this", "queryStart", "queryEndTime"}, s = {"L$0", "J$0", "J$1"})
    public static final class C24981 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C24981(Continuation<? super C24981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepRhythmMonitorViewModel.this.findEffectiveNoDiaryDate(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$queryJumpDiaryDateLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$queryJumpDiaryDateLiveData$1", f = "SleepRhythmMonitorViewModel.kt", i = {1, 1}, l = {239, 242, 247, 249}, m = "invokeSuspend", n = {"$this$liveData", "latestRhythmReport"}, s = {"L$0", "L$1"})
    public static final class C24991 extends SuspendLambda implements Function2<LiveDataScope<Long>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C24991(Continuation<? super C24991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24991 c24991 = SleepRhythmMonitorViewModel.this.new C24991(continuation);
            c24991.L$0 = obj;
            return c24991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Long> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C24991) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0090  */
        /* JADX WARN: Code duplicated, block: B:29:0x009c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x009d  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bd A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SleepRhythmReport sleepRhythmReport;
            Object objFindEffectiveNoDiaryDate;
            LiveDataScope liveDataScope;
            Long l;
            Long lBoxLong;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope2 = (LiveDataScope) this.L$0;
                sleepRhythmReport = (SleepRhythmReport) LiveDataHelper.INSTANCE.takeData(SleepRhythmMonitorViewModel.this.getSleepDataRepo().getLastSleepRhythmReport(), 5, TimeUnit.SECONDS, null);
                if (sleepRhythmReport == null) {
                    this.label = 1;
                    if (liveDataScope2.emit(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel = SleepRhythmMonitorViewModel.this;
                long time = sleepRhythmReport.getTime();
                long time2 = sleepRhythmReport.getTime() + TimeUnit.DAYS.toSeconds(sleepRhythmReport.getCycleDay());
                this.L$0 = liveDataScope2;
                this.L$1 = sleepRhythmReport;
                this.label = 2;
                objFindEffectiveNoDiaryDate = sleepRhythmMonitorViewModel.findEffectiveNoDiaryDate(time, time2, this);
                if (objFindEffectiveNoDiaryDate == coroutine_suspended) {
                    return coroutine_suspended;
                }
                liveDataScope = liveDataScope2;
                l = (Long) objFindEffectiveNoDiaryDate;
                if (l != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (liveDataScope.emit(l, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    lBoxLong = Boxing.boxLong(Math.min(sleepRhythmReport.getEndTime(), CurseExtKt.getTodayZeroMills() / ((long) 1000)));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (liveDataScope.emit(lBoxLong, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i == 2) {
                    SleepRhythmReport sleepRhythmReport2 = (SleepRhythmReport) this.L$1;
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    sleepRhythmReport = sleepRhythmReport2;
                    objFindEffectiveNoDiaryDate = obj;
                    l = (Long) objFindEffectiveNoDiaryDate;
                    if (l != null) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        if (liveDataScope.emit(l, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        lBoxLong = Boxing.boxLong(Math.min(sleepRhythmReport.getEndTime(), CurseExtKt.getTodayZeroMills() / ((long) 1000)));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                        if (liveDataScope.emit(lBoxLong, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$requestShowSleepAssistStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$requestShowSleepAssistStatus$1", f = "SleepRhythmMonitorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C25001(Continuation<? super C25001> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel, boolean z) {
            Logger.i(SleepRhythmMonitorViewModel.TAG, "loadSleepAssistSwitchWithAppCache " + z);
            sleepRhythmMonitorViewModel.getSleepAssistSwitchLiveData().postValue(Boolean.valueOf(z));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepRhythmMonitorViewModel.this.new C25001(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            boolean zIsSupportAssistSleep = wearableDeviceModel != null ? DeviceModelExtKt.isSupportAssistSleep(wearableDeviceModel) : false;
            if (wearableDeviceModel == null || !zIsSupportAssistSleep) {
                Logger.i(SleepRhythmMonitorViewModel.TAG, "requestShowSleepAssistGuide supportAssist false");
                SleepRhythmMonitorViewModel.this.getSleepAssistSwitchLiveData().postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            SleepSettingRepository sleepSettingRepo = SleepRhythmMonitorViewModel.this.getSleepSettingRepo();
            final SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel = SleepRhythmMonitorViewModel.this;
            sleepSettingRepo.loadSleepAssistSwitchWithAppCache(wearableDeviceModel, new Function1() { // from class: com.xiaomi.fitness.health.sleep.rhythm.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SleepRhythmMonitorViewModel.C25001.invokeSuspend$lambda$0(sleepRhythmMonitorViewModel, ((Boolean) obj2).booleanValue());
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$requestSleepRhythmMonitor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$requestSleepRhythmMonitor$1", f = "SleepRhythmMonitorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C25011(Continuation<? super C25011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepRhythmMonitorViewModel.this.new C25011(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepRhythmMonitorRepository rhythmRepo = SleepRhythmMonitorViewModel.this.getRhythmRepo();
            final SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel = SleepRhythmMonitorViewModel.this;
            rhythmRepo.getSleepRhythmMonitorFromDevice(new ISleepRhythmCallback() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel.requestSleepRhythmMonitor.1.1
                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void onSleepRhythmMonitorResult(int resultCode, vt9 sleepRegularity) {
                    Logger.i(SleepRhythmMonitorViewModel.TAG, "getSleepRhythmMonitorFromDevice code:" + resultCode + ";result:" + sleepRegularity);
                    sleepRhythmMonitorViewModel.getGetMonitorResultLiveData().postValue(new Pair<>(Integer.valueOf(resultCode), sleepRegularity));
                }

                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void onSleepRhythmRemindResult(int i, ut9 ut9Var) {
                    ISleepRhythmCallback.DefaultImpls.onSleepRhythmRemindResult(this, i, ut9Var);
                }

                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void updateRhythmRemindResult(@DeviceResultCode int i, boolean z) {
                    ISleepRhythmCallback.DefaultImpls.updateRhythmRemindResult(this, i, z);
                }

                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void updateSleepRhythmMonitorResult(@DeviceResultCode int i, int i2) {
                    ISleepRhythmCallback.DefaultImpls.updateSleepRhythmMonitorResult(this, i, i2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$requestSleepRhythmRemind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$requestSleepRhythmRemind$1", f = "SleepRhythmMonitorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C25021(Continuation<? super C25021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepRhythmMonitorViewModel.this.new C25021(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepRhythmMonitorRepository rhythmRepo = SleepRhythmMonitorViewModel.this.getRhythmRepo();
            final SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel = SleepRhythmMonitorViewModel.this;
            rhythmRepo.getSleepRhythmRemindFromDevice(new ISleepRhythmCallback() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel.requestSleepRhythmRemind.1.1
                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void onSleepRhythmMonitorResult(int i, vt9 vt9Var) {
                    ISleepRhythmCallback.DefaultImpls.onSleepRhythmMonitorResult(this, i, vt9Var);
                }

                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void onSleepRhythmRemindResult(int resultCode, ut9 sleepDisorder) {
                    Logger.i(SleepRhythmMonitorViewModel.TAG, "getSleepRhythmRemind code:" + resultCode + ";result:" + sleepDisorder);
                    sleepRhythmMonitorViewModel.getGetRemindResultLiveData().postValue(new Pair<>(Integer.valueOf(resultCode), sleepDisorder));
                }

                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void updateRhythmRemindResult(@DeviceResultCode int i, boolean z) {
                    ISleepRhythmCallback.DefaultImpls.updateRhythmRemindResult(this, i, z);
                }

                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void updateSleepRhythmMonitorResult(@DeviceResultCode int i, int i2) {
                    ISleepRhythmCallback.DefaultImpls.updateSleepRhythmMonitorResult(this, i, i2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$setSleepRhythmMonitor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$setSleepRhythmMonitor$1", f = "SleepRhythmMonitorViewModel.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"endInSecond"}, s = {"J$0"})
    public static final class C25031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $cycleDays;
        final /* synthetic */ SleepRhythmReport $sleepRhythmReport;
        final /* synthetic */ long $startTimeSecond;
        final /* synthetic */ int $status;
        long J$0;
        int label;
        final /* synthetic */ SleepRhythmMonitorViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25031(SleepRhythmReport sleepRhythmReport, int i, SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel, long j, int i2, Continuation<? super C25031> continuation) {
            super(2, continuation);
            this.$sleepRhythmReport = sleepRhythmReport;
            this.$status = i;
            this.this$0 = sleepRhythmMonitorViewModel;
            this.$startTimeSecond = j;
            this.$cycleDays = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25031(this.$sleepRhythmReport, this.$status, this.this$0, this.$startTimeSecond, this.$cycleDays, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger.i(SleepRhythmMonitorViewModel.TAG, "setRhythmMonitor " + this.$sleepRhythmReport.getType() + ";cycleDays:" + this.$sleepRhythmReport.getCycleDay() + ";time:" + this.$sleepRhythmReport.getTime());
                if (this.$status != 0) {
                    this.this$0.setSleepRhythmMonitorToDevice(this.$sleepRhythmReport);
                } else {
                    long j2 = this.$startTimeSecond;
                    TimeUnit timeUnit = TimeUnit.DAYS;
                    long seconds = j2 + timeUnit.toSeconds(this.$cycleDays);
                    long seconds2 = timeUnit.toSeconds(30L);
                    this.J$0 = seconds;
                    this.label = 1;
                    obj = this.this$0.getSleepDataRepo().getSleepRhythmRecords(this.$startTimeSecond - seconds2, seconds + seconds2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = seconds;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            ResultKt.throwOnFailure(obj);
            List list = (List) obj;
            boolean zCheckOverlapping = this.this$0.checkOverlapping(list, this.$startTimeSecond, j);
            Logger.i(SleepRhythmMonitorViewModel.TAG, "checkOverlapping " + this.$startTimeSecond + ";" + j + ";" + list + ";overlap:" + zCheckOverlapping);
            if (zCheckOverlapping) {
                this.this$0.getSetMonitorResultLiveData().postValue(new Pair<>(Boxing.boxInt(1000), Boxing.boxInt(this.$cycleDays)));
            } else {
                this.this$0.setSleepRhythmMonitorToDevice(this.$sleepRhythmReport);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$setSleepRhythmRemind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel$setSleepRhythmRemind$1", f = "SleepRhythmMonitorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $enable;
        final /* synthetic */ List<Integer> $times;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25051(boolean z, List<Integer> list, Continuation<? super C25051> continuation) {
            super(2, continuation);
            this.$enable = z;
            this.$times = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepRhythmMonitorViewModel.this.new C25051(this.$enable, this.$times, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepRhythmMonitorRepository rhythmRepo = SleepRhythmMonitorViewModel.this.getRhythmRepo();
            boolean z = this.$enable;
            List<Integer> list = this.$times;
            final SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel = SleepRhythmMonitorViewModel.this;
            rhythmRepo.setSleepRhythmRemind(z, list, new ISleepRhythmCallback() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel.setSleepRhythmRemind.1.1
                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void onSleepRhythmMonitorResult(int i, vt9 vt9Var) {
                    ISleepRhythmCallback.DefaultImpls.onSleepRhythmMonitorResult(this, i, vt9Var);
                }

                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void onSleepRhythmRemindResult(int i, ut9 ut9Var) {
                    ISleepRhythmCallback.DefaultImpls.onSleepRhythmRemindResult(this, i, ut9Var);
                }

                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void updateRhythmRemindResult(int resultCode, boolean z2) {
                    Logger.i(SleepRhythmMonitorViewModel.TAG, "setConfigToDeviceResult " + resultCode + ";result:" + z2);
                    sleepRhythmMonitorViewModel.getSetRemindConfigResultLiveData().postValue(new Pair<>(Integer.valueOf(resultCode), Boolean.valueOf(z2)));
                }

                @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
                public void updateSleepRhythmMonitorResult(@DeviceResultCode int i, int i2) {
                    ISleepRhythmCallback.DefaultImpls.updateSleepRhythmMonitorResult(this, i, i2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkOverlapping(List<SleepRhythmReport> sleepRhythmRecords, long startTimeSecond, long endInSecond) {
        for (SleepRhythmReport sleepRhythmReport : sleepRhythmRecords) {
            long time = sleepRhythmReport.getTime();
            if (startTimeSecond <= time && time <= endInSecond) {
                return true;
            }
            long endTime = sleepRhythmReport.getEndTime();
            if (startTimeSecond <= endTime && endTime <= endInSecond) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object findEffectiveNoDiaryDate(long j, long j2, Continuation<? super Long> continuation) {
        C24981 c24981;
        long j3;
        long j4;
        SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel;
        Long lBoxLong;
        if (continuation instanceof C24981) {
            c24981 = (C24981) continuation;
            int i = c24981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24981.label = i - Integer.MIN_VALUE;
            } else {
                c24981 = new C24981(continuation);
            }
        } else {
            c24981 = new C24981(continuation);
        }
        Object sleepDiaryRecords = c24981.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24981.label;
        if (i2 != 0) {
            if (i2 == 1) {
                long j5 = c24981.J$1;
                long j6 = c24981.J$0;
                SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel2 = (SleepRhythmMonitorViewModel) c24981.L$0;
                ResultKt.throwOnFailure(sleepDiaryRecords);
                j4 = j5;
                j3 = j6;
                sleepRhythmMonitorViewModel = sleepRhythmMonitorViewModel2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(sleepDiaryRecords);
            }
            return (Long) sleepDiaryRecords;
        }
        ResultKt.throwOnFailure(sleepDiaryRecords);
        ISleepRepository sleepDataRepo = getSleepDataRepo();
        c24981.L$0 = this;
        j3 = j;
        c24981.J$0 = j3;
        j4 = j2;
        c24981.J$1 = j4;
        c24981.label = 1;
        sleepDiaryRecords = sleepDataRepo.getSleepDiaryRecords(j, j2, c24981);
        if (sleepDiaryRecords == coroutine_suspended) {
            return coroutine_suspended;
        }
        sleepRhythmMonitorViewModel = this;
        Map<Long, SleepDiaryReport> map = SleepRhythmExtKt.toMap((List) sleepDiaryRecords);
        long jMin = Math.min(j4 - TimeUnit.DAYS.toSeconds(1L), CurseExtKt.getTodayZeroMills() / ((long) 1000));
        while (true) {
            if (jMin < j3) {
                lBoxLong = null;
                break;
            }
            if (map.get(Boxing.boxLong(jMin)) == null) {
                lBoxLong = Boxing.boxLong(jMin);
                break;
            }
            jMin -= TimeUnit.DAYS.toSeconds(1L);
        }
        Logger.i(TAG, "findEffectiveNoDiaryDate start:" + j3 + ";end:" + j4 + ";hasDiaryTime:" + map.keySet() + ";no diary:" + lBoxLong);
        if (lBoxLong != null) {
            return lBoxLong;
        }
        SleepRhythmReport sleepRhythmReport = (SleepRhythmReport) LiveDataHelper.INSTANCE.takeData(sleepRhythmMonitorViewModel.getSleepDataRepo().getLastSleepRhythmReportBefore(j3), 5, TimeUnit.SECONDS, null);
        if (sleepRhythmReport == null) {
            return null;
        }
        long time = sleepRhythmReport.getTime();
        long time2 = sleepRhythmReport.getTime() + TimeUnit.DAYS.toSeconds(sleepRhythmReport.getCycleDay());
        c24981.L$0 = null;
        c24981.label = 2;
        sleepDiaryRecords = sleepRhythmMonitorViewModel.findEffectiveNoDiaryDate(time, time2, c24981);
        if (sleepDiaryRecords == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (Long) sleepDiaryRecords;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepRhythmMonitorRepository getRhythmRepo() {
        return (SleepRhythmMonitorRepository) this.rhythmRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISleepRepository getSleepDataRepo() {
        return (ISleepRepository) this.sleepDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepSettingRepository getSleepSettingRepo() {
        return (SleepSettingRepository) this.sleepSettingRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllSleepRhythmRecordsLiveData$lambda$4(SleepRhythmMonitorViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ISleepRepository.DefaultImpls.getSleepRhyThmAllRecordPagingSource$default(this$0.getSleepDataRepo(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmMonitorRepository rhythmRepo_delegate$lambda$0() {
        return SleepRhythmMonitorRepository.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSleepRhythmMonitorToDevice(SleepRhythmReport sleepRhythmReport) {
        getRhythmRepo().setSleepRhythmMonitor(sleepRhythmReport, new ISleepRhythmCallback() { // from class: com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel.setSleepRhythmMonitorToDevice.1
            @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
            public void onSleepRhythmMonitorResult(int i, vt9 vt9Var) {
                ISleepRhythmCallback.DefaultImpls.onSleepRhythmMonitorResult(this, i, vt9Var);
            }

            @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
            public void onSleepRhythmRemindResult(int i, ut9 ut9Var) {
                ISleepRhythmCallback.DefaultImpls.onSleepRhythmRemindResult(this, i, ut9Var);
            }

            @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
            public void updateRhythmRemindResult(@DeviceResultCode int i, boolean z) {
                ISleepRhythmCallback.DefaultImpls.updateRhythmRemindResult(this, i, z);
            }

            @Override // com.xiaomi.fitness.health.sleep.rhythm.ISleepRhythmCallback
            public void updateSleepRhythmMonitorResult(int resultCode, int cycleDays) {
                Logger.i(SleepRhythmMonitorViewModel.TAG, "setSleepRhythmMonitor " + resultCode + ";cycleDays:" + cycleDays);
                SleepRhythmMonitorViewModel.this.getSetMonitorResultLiveData().postValue(new Pair<>(Integer.valueOf(resultCode), Integer.valueOf(cycleDays)));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISleepRepository sleepDataRepo_delegate$lambda$2() {
        return (ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepSettingRepository sleepSettingRepo_delegate$lambda$1() {
        return new SleepSettingRepository();
    }

    public final void addSleepRhyThmReport(@NotNull String sid, @NotNull SleepRhythmReport sleepRhythmReport) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(sleepRhythmReport, "sleepRhythmReport");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(sid, sleepRhythmReport, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, vt9>> getGetMonitorResultLiveData() {
        return this.getMonitorResultLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, ut9>> getGetRemindResultLiveData() {
        return this.getRemindResultLiveData;
    }

    @NotNull
    public final MutableLiveData<LocalDate> getOnDayClickLiveData() {
        return this.onDayClickLiveData;
    }

    @NotNull
    public final MutableLiveData<Map<Long, SleepRhythmCalendarDayData>> getResumeMonthItemLiveData() {
        return this.resumeMonthItemLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, Integer>> getSetMonitorResultLiveData() {
        return this.setMonitorResultLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, Boolean>> getSetRemindConfigResultLiveData() {
        return this.setRemindConfigResultLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepAssistSwitchLiveData() {
        return this.sleepAssistSwitchLiveData;
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
    }

    @NotNull
    public final LiveData<PagingData<SleepRhythmReport>> queryAllSleepRhythmRecordsLiveData() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: oum
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepRhythmMonitorViewModel.queryAllSleepRhythmRecordsLiveData$lambda$4(this.f29702a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<Long> queryJumpDiaryDateLiveData() {
        return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new C24991(null), 2, (Object) null);
    }

    @NotNull
    public final LiveData<SleepDiaryReport> queryLatestSleepDiaryLiveData() {
        return getSleepDataRepo().getLastSleepDiaryReport();
    }

    @NotNull
    public final LiveData<SleepRhythmReport> queryLatestSleepRhythmBeforeTodayLiveData(long timeSecond) {
        Logger.i(TAG, "queryLatestSleepRhythmBeforeTodayLiveData " + timeSecond);
        return getSleepDataRepo().getLastSleepRhythmReportBefore(timeSecond);
    }

    @NotNull
    public final LiveData<SleepRhythmReport> queryLatestSleepRhythmLiveData() {
        return getSleepDataRepo().getLastSleepRhythmReport();
    }

    public final void requestShowSleepAssistStatus() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25001(null), 2, null);
    }

    public final void requestSleepRhythmMonitor() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25011(null), 2, null);
    }

    public final void requestSleepRhythmRemind() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25021(null), 2, null);
    }

    public final void setSleepRhythmMonitor(@NotNull SleepRhythmReport sleepRhythmReport) {
        Intrinsics.checkNotNullParameter(sleepRhythmReport, "sleepRhythmReport");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25031(sleepRhythmReport, sleepRhythmReport.getType(), this, sleepRhythmReport.getTime(), sleepRhythmReport.getCycleDay(), null), 2, null);
    }

    public final void setSleepRhythmRemind(boolean enable, @NotNull List<Integer> times) {
        Intrinsics.checkNotNullParameter(times, "times");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25051(enable, times, null), 2, null);
    }
}
