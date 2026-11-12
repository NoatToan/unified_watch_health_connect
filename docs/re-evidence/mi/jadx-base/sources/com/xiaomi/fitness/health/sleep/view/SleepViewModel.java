package com.xiaomi.fitness.health.sleep.view;

import android.app.Application;
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
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.IPagingSourceRepository;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.distribute.SleepDistributeConfig;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalInsightReport;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.BackgroundRestrictionUtil;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepSettingRepository;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import com.xiaomi.fitness.sleep.trace.SleepTracer;
import com.xiaomi.fitness.sleep.trace.extensions.TraceExtKt;
import com.xiaomi.fitness.util.DeviceModelExtKt;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001TB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0016J\u0010\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102J\u0016\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205J\u000e\u00107\u001a\u0002002\u0006\u00101\u001a\u000202J\u0006\u00108\u001a\u00020\u0006J\u0006\u00109\u001a\u000205J\u0006\u0010:\u001a\u00020\u0006J\u0006\u0010;\u001a\u000200J\u0018\u0010<\u001a\u0002002\u0006\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020?H\u0016J\u0006\u0010@\u001a\u000200J\u0012\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0-0\u0016J\u001c\u0010C\u001a\u0002002\f\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u000eH\u0086@¢\u0006\u0002\u0010EJ\u000e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0\u0016J\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0\u0016J%\u0010H\u001a\u0019\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070J¢\u0006\u0002\bK\u0012\u0004\u0012\u00020L0I0\u00162\u0006\u0010M\u001a\u00020BJ\b\u0010N\u001a\u0004\u0018\u00010OJ\u0006\u0010P\u001a\u000200J\u000e\u0010Q\u001a\u0002002\u0006\u0010R\u001a\u00020.J\u0006\u0010S\u001a\u000200R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000e\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b)\u0010*¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "isNoRestrictedLevelLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "isRestrictedLevelLiveData", "sleepShowAssistSwitchEnableLiveData", "getSleepShowAssistSwitchEnableLiveData", "pressureSwitchLiveData", "getPressureSwitchLiveData", "sleepInterferePlanLiveData", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "getSleepInterferePlanLiveData", "sleepInterfereRequest", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest;", "getSleepInterfereRequest", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest;", "fetchLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "getFetchLiveData", "()Landroidx/lifecycle/LiveData;", "setFetchLiveData", "(Landroidx/lifecycle/LiveData;)V", "mDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "mSleepTracer", "Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "getMSleepTracer", "()Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "mSleepTracer$delegate", "sleepSettingRepo", "Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "getSleepSettingRepo", "()Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "sleepSettingRepo$delegate", "queryAllRecordsLiveData", "Landroidx/paging/PagingData;", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "deleteRecord", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "hasOverlayWithHistoryRecords", "startTimeLongInMillis", "", "endTimeLongInMillis", "insertRecordToDatabase", "sleepTrackIsEnabled", "getSleepSnoreRequestTime", "sleepAudioIsEnabled", "queryRestrictionLevel", "requestMonthGroupData", "endTimeSecond", "limit", "", "requestShowSleepAssistGuide", "queryAllSleepAnimalLiveData", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "deleteSleepAnimal", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryLatestSleepAnimalLiveData", "triggerComputeAnimalReport", "querySleepAnimalInsightReportLiveData", "", "", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalIndicator;", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalInsightReport;", "animalReport", "getSleepDistributeConfig", "Lcom/xiaomi/fit/fitness/export/data/distribute/SleepDistributeConfig;", "loadPressureSwitch", "calibrateSleepSegmentReport", "segmentReport", "getSleepInterferePlan", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepViewModel extends BasicDataViewModel {

    @NotNull
    public static final String TAG = "SleepViewModel";

    @Nullable
    private LiveData<List<DailyBasicReport>> fetchLiveData;

    @NotNull
    private final MutableLiveData<Boolean> isNoRestrictedLevelLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> isRestrictedLevelLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> sleepShowAssistSwitchEnableLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> pressureSwitchLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<SleepInterferePlan>> sleepInterferePlanLiveData = new MutableLiveData<>();

    @NotNull
    private final SleepInterfereRequest sleepInterfereRequest = new SleepInterfereRequest();

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: g1n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepViewModel.mDataRepo_delegate$lambda$0(this.f18475a);
        }
    });

    /* JADX INFO: renamed from: mSleepTracer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepTracer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: h1n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepViewModel.mSleepTracer_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: sleepSettingRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepSettingRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: i1n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepViewModel.sleepSettingRepo_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.view.SleepViewModel$calibrateSleepSegmentReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.view.SleepViewModel$calibrateSleepSegmentReport$1", f = "SleepViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SleepSegmentReport $segmentReport;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SleepSegmentReport sleepSegmentReport, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$segmentReport = sleepSegmentReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$segmentReport, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).updateSleepSegment(this.$segmentReport);
            Logger.i(SleepViewModel.TAG, "calibrateSleepSegmentReport updateSleepSegment updated.");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.view.SleepViewModel$deleteRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.view.SleepViewModel$deleteRecord$1", f = "SleepViewModel.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DailyRecordItem $record;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25371(DailyRecordItem dailyRecordItem, Continuation<? super C25371> continuation) {
            super(2, continuation);
            this.$record = dailyRecordItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepViewModel.this.new C25371(this.$record, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ISleepRepository mDataRepo = SleepViewModel.this.getMDataRepo();
                DailyRecordItem[] dailyRecordItemArr = {this.$record};
                this.label = 1;
                if (mDataRepo.deleteRecord(dailyRecordItemArr, this) == coroutine_suspended) {
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
            return ((C25371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.view.SleepViewModel$getSleepInterferePlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.view.SleepViewModel$getSleepInterferePlan$1", f = "SleepViewModel.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C25381(Continuation<? super C25381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepViewModel.this.new C25381(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepInterfereRequest sleepInterfereRequest = SleepViewModel.this.getSleepInterfereRequest();
                this.label = 1;
                obj = sleepInterfereRequest.getCurrentSleepInterferePlan(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SleepViewModel.this.getSleepInterferePlanLiveData().postValue((List) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.view.SleepViewModel$insertRecordToDatabase$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.view.SleepViewModel$insertRecordToDatabase$1", f = "SleepViewModel.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DailyRecordItem $record;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25391(DailyRecordItem dailyRecordItem, Continuation<? super C25391> continuation) {
            super(2, continuation);
            this.$record = dailyRecordItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepViewModel.this.new C25391(this.$record, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ISleepRepository mDataRepo = SleepViewModel.this.getMDataRepo();
                DailyRecordItem dailyRecordItem = this.$record;
                this.label = 1;
                if (mDataRepo.addRecord(dailyRecordItem, this) == coroutine_suspended) {
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
            return ((C25391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.view.SleepViewModel$loadPressureSwitch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.view.SleepViewModel$loadPressureSwitch$1", f = "SleepViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C25401(Continuation<? super C25401> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(SleepViewModel sleepViewModel, Boolean bool) {
            sleepViewModel.getPressureSwitchLiveData().postValue(bool);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepViewModel.this.new C25401(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepSettingRepository sleepSettingRepo = SleepViewModel.this.getSleepSettingRepo();
            final SleepViewModel sleepViewModel = SleepViewModel.this;
            sleepSettingRepo.loadPressureSwitchOnlyDevice(new WeakReference<>(new Function1() { // from class: com.xiaomi.fitness.health.sleep.view.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SleepViewModel.C25401.invokeSuspend$lambda$0(sleepViewModel, (Boolean) obj2);
                }
            }));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.view.SleepViewModel$requestMonthGroupData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.view.SleepViewModel$requestMonthGroupData$1", f = "SleepViewModel.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTimeSecond;
        final /* synthetic */ int $limit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25411(long j, int i, Continuation<? super C25411> continuation) {
            super(2, continuation);
            this.$endTimeSecond = j;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepViewModel.this.new C25411(this.$endTimeSecond, this.$limit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ISleepRepository mDataRepo = SleepViewModel.this.getMDataRepo();
                long j = this.$endTimeSecond;
                int i2 = this.$limit;
                this.label = 1;
                obj = ISleepRepository.DefaultImpls.getSleepByMonthGroup$default(mDataRepo, 0L, j, i2, false, this, 8, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Map<Long, List<DailyRecordItem>> map = (Map) obj;
            SleepViewModel.this.setHasMore(!map.isEmpty());
            Logger.i(SleepViewModel.TAG, "requestMonthData endTime " + this.$endTimeSecond + ";size " + map.size());
            SleepViewModel.this.getMonthGroupRequestMap().postValue(map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.view.SleepViewModel$requestShowSleepAssistGuide$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.view.SleepViewModel$requestShowSleepAssistGuide$1", f = "SleepViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C25421(Continuation<? super C25421> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(SleepViewModel sleepViewModel, boolean z) {
            Logger.i(SleepViewModel.TAG, "loadSleepAssistSwitchWithAppCache " + z);
            sleepViewModel.getSleepShowAssistSwitchEnableLiveData().postValue(Boolean.valueOf(z ^ true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepViewModel.this.new C25421(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            boolean z = wearableDeviceModel != null && DeviceModelExtKt.isSupportAssistSleep(wearableDeviceModel);
            if (z) {
                SleepSettingRepository sleepSettingRepo = SleepViewModel.this.getSleepSettingRepo();
                Intrinsics.checkNotNull(wearableDeviceModel);
                final SleepViewModel sleepViewModel = SleepViewModel.this;
                sleepSettingRepo.loadSleepAssistSwitchWithAppCache(wearableDeviceModel, new Function1() { // from class: com.xiaomi.fitness.health.sleep.view.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return SleepViewModel.C25421.invokeSuspend$lambda$0(sleepViewModel, ((Boolean) obj2).booleanValue());
                    }
                });
                return Unit.INSTANCE;
            }
            Logger.i(SleepViewModel.TAG, "not supportAssistSleep;hasDeviceModel:" + (wearableDeviceModel != null) + ";supportAssistSleep:" + z);
            SleepViewModel.this.getSleepShowAssistSwitchEnableLiveData().postValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.view.SleepViewModel$triggerComputeAnimalReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.view.SleepViewModel$triggerComputeAnimalReport$1", f = "SleepViewModel.kt", i = {}, l = {202, 202}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25431 extends SuspendLambda implements Function2<LiveDataScope<SleepAnimalReport>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C25431(Continuation<? super C25431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25431 c25431 = SleepViewModel.this.new C25431(continuation);
            c25431.L$0 = obj;
            return c25431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<SleepAnimalReport> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C25431) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ISleepRepository mDataRepo = SleepViewModel.this.getMDataRepo();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = mDataRepo.triggerComputeSleepAnimal(this);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISleepRepository getMDataRepo() {
        return (ISleepRepository) this.mDataRepo.getValue();
    }

    private final SleepTracer getMSleepTracer() {
        return (SleepTracer) this.mSleepTracer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepSettingRepository getSleepSettingRepo() {
        return (SleepSettingRepository) this.sleepSettingRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISleepRepository mDataRepo_delegate$lambda$0(SleepViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (ISleepRepository) this$0.getRepo(ISleepRepository.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepTracer mSleepTracer_delegate$lambda$1() {
        return TraceExtKt.getInstance(SleepTracer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllRecordsLiveData$lambda$3(SleepViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return IPagingSourceRepository.DefaultImpls.getAllRecordDetailPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryAllSleepAnimalLiveData$lambda$5(SleepViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ISleepRepository.DefaultImpls.getSleepAnimalAllRecordPagingSource$default(this$0.getMDataRepo(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRestrictionLevel$lambda$4(SleepViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BackgroundRestrictionUtil backgroundRestrictionUtil = BackgroundRestrictionUtil.INSTANCE;
        Application application = ApplicationExtKt.getApplication();
        String packageName = ApplicationExtKt.getApplication().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        int iQueryRestrictionLevel = backgroundRestrictionUtil.queryRestrictionLevel(application, packageName);
        Boolean boolIsNoRestrictedLevel = backgroundRestrictionUtil.isNoRestrictedLevel(iQueryRestrictionLevel);
        Boolean boolIsRestrictedLevel = backgroundRestrictionUtil.isRestrictedLevel(iQueryRestrictionLevel);
        this$0.isNoRestrictedLevelLiveData.postValue(boolIsNoRestrictedLevel);
        this$0.isRestrictedLevelLiveData.postValue(boolIsRestrictedLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepSettingRepository sleepSettingRepo_delegate$lambda$2() {
        return new SleepSettingRepository();
    }

    public final void calibrateSleepSegmentReport(@NotNull SleepSegmentReport segmentReport) {
        Intrinsics.checkNotNullParameter(segmentReport, "segmentReport");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(segmentReport, null), 2, null);
    }

    public final void deleteRecord(@Nullable DailyRecordItem record) {
        if (record == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25371(record, null), 2, null);
    }

    @Nullable
    public final Object deleteSleepAnimal(@NotNull List<SleepAnimalReport> list, @NotNull Continuation<? super Unit> continuation) {
        Object objDeleteSleepAnimal = getMDataRepo().deleteSleepAnimal(list, continuation);
        return objDeleteSleepAnimal == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDeleteSleepAnimal : Unit.INSTANCE;
    }

    @Nullable
    public final LiveData<List<DailyBasicReport>> getFetchLiveData() {
        return this.fetchLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getPressureSwitchLiveData() {
        return this.pressureSwitchLiveData;
    }

    @Nullable
    public final SleepDistributeConfig getSleepDistributeConfig() {
        return getMDataRepo().getSleepDistributeConfig();
    }

    public final void getSleepInterferePlan() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25381(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<List<SleepInterferePlan>> getSleepInterferePlanLiveData() {
        return this.sleepInterferePlanLiveData;
    }

    @NotNull
    public final SleepInterfereRequest getSleepInterfereRequest() {
        return this.sleepInterfereRequest;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepShowAssistSwitchEnableLiveData() {
        return this.sleepShowAssistSwitchEnableLiveData;
    }

    public final long getSleepSnoreRequestTime() {
        return getMSleepTracer().getSnoreRequestTime();
    }

    public final boolean hasOverlayWithHistoryRecords(long startTimeLongInMillis, long endTimeLongInMillis) {
        long j = 1000;
        return getMDataRepo().hasSleepSegmentExits(startTimeLongInMillis / j, endTimeLongInMillis / j);
    }

    public final void insertRecordToDatabase(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25391(record, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> isNoRestrictedLevelLiveData() {
        return this.isNoRestrictedLevelLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> isRestrictedLevelLiveData() {
        return this.isRestrictedLevelLiveData;
    }

    public final void loadPressureSwitch() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25401(null), 2, null);
    }

    @NotNull
    public final LiveData<PagingData<SleepSegmentReport>> queryAllRecordsLiveData() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: k1n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepViewModel.queryAllRecordsLiveData$lambda$3(this.f23331a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<PagingData<SleepAnimalReport>> queryAllSleepAnimalLiveData() {
        return FlowLiveDataConversions.asLiveData$default(new Pager(new PagingConfig(20, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: j1n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepViewModel.queryAllSleepAnimalLiveData$lambda$5(this.f22332a);
            }
        }, 2, null).getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<SleepAnimalReport> queryLatestSleepAnimalLiveData() {
        return getMDataRepo().getLatestSleepAnimal();
    }

    public final void queryRestrictionLevel() {
        ExecutorHelper.runInBackground(new Runnable() { // from class: f1n
            @Override // java.lang.Runnable
            public final void run() {
                SleepViewModel.queryRestrictionLevel$lambda$4(this.f17299a);
            }
        });
    }

    @NotNull
    public final LiveData<Map<String, SleepAnimalInsightReport>> querySleepAnimalInsightReportLiveData(@NotNull SleepAnimalReport animalReport) {
        Intrinsics.checkNotNullParameter(animalReport, "animalReport");
        return getMDataRepo().getSleepAnimalInsightReport(animalReport);
    }

    @Override // com.xiaomi.fitness.base.BasicDataViewModel
    public void requestMonthGroupData(long endTimeSecond, int limit) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25411(endTimeSecond, limit, null), 2, null);
    }

    public final void requestShowSleepAssistGuide() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25421(null), 2, null);
    }

    public final void setFetchLiveData(@Nullable LiveData<List<DailyBasicReport>> liveData) {
        this.fetchLiveData = liveData;
    }

    public final boolean sleepAudioIsEnabled() {
        return !AppUtil.INSTANCE.isPlayChannel() && getMSleepTracer().getSnoreDetectionStatus() == 2;
    }

    public final boolean sleepTrackIsEnabled() {
        return getMSleepTracer().isEnable();
    }

    @NotNull
    public final LiveData<SleepAnimalReport> triggerComputeAnimalReport() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C25431(null), 3, (Object) null);
    }
}
