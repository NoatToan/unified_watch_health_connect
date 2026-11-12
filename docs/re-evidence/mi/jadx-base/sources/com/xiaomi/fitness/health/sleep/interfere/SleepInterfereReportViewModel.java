package com.xiaomi.fitness.health.sleep.interfere;

import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepSettingRepository;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "sleepInterfereRequest", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest;)V", "_planStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "planStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getPlanStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "sleepSettingRepository", "Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "getSleepSettingRepository", "()Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "sleepSettingRepository$delegate", "Lkotlin/Lazy;", "_hasOngoingPlanStateFlow", "", "hasOngoingPlanStateFlow", "getHasOngoingPlanStateFlow", "updateCurrentplanById", "", "id", "", "updateHasOngoingPlan", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepInterfereReportViewModel extends AbsViewModel {

    @NotNull
    private static final String TAG = "SleepInterfereReportViewModel";

    @NotNull
    private final MutableStateFlow<Boolean> _hasOngoingPlanStateFlow;

    @NotNull
    private final MutableStateFlow<SleepInterferePlan> _planStateFlow;

    @NotNull
    private final StateFlow<Boolean> hasOngoingPlanStateFlow;

    @NotNull
    private final StateFlow<SleepInterferePlan> planStateFlow;

    @NotNull
    private final SleepInterfereRequest sleepInterfereRequest;

    /* JADX INFO: renamed from: sleepSettingRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepSettingRepository;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel$updateCurrentplanById$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel$updateCurrentplanById$1", f = "SleepInterfereReportViewModel.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$id = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereReportViewModel.this.new AnonymousClass1(this.$id, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepInterfereRequest sleepInterfereRequest = SleepInterfereReportViewModel.this.sleepInterfereRequest;
                long j = this.$id;
                this.label = 1;
                obj = sleepInterfereRequest.getSleepInterferePlanById(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SleepInterferePlan sleepInterferePlan = (SleepInterferePlan) obj;
            if (sleepInterferePlan != null) {
                SleepInterfereReportViewModel.this._planStateFlow.setValue(sleepInterferePlan);
                Logger.i(SleepInterfereReportViewModel.TAG, "getSleepInterferePlan result: " + sleepInterferePlan);
            } else {
                Logger.i(SleepInterfereReportViewModel.TAG, "can not find plan with id: " + this.$id);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel$updateHasOngoingPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel$updateHasOngoingPlan$1", f = "SleepInterfereReportViewModel.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24871(Continuation<? super C24871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereReportViewModel.this.new C24871(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepInterfereRequest sleepInterfereRequest = SleepInterfereReportViewModel.this.sleepInterfereRequest;
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
            List list = (List) obj;
            SleepInterfereReportViewModel.this._hasOngoingPlanStateFlow.setValue(Boxing.boxBoolean(list != null && (list.isEmpty() ^ true) && ((SleepInterferePlan) list.get(0)).getStatus() == 0));
            Logger.i(SleepInterfereReportViewModel.TAG, "has ongoing plan: " + list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SleepInterfereReportViewModel(@NotNull SleepInterfereRequest sleepInterfereRequest) {
        Intrinsics.checkNotNullParameter(sleepInterfereRequest, "sleepInterfereRequest");
        this.sleepInterfereRequest = sleepInterfereRequest;
        MutableStateFlow<SleepInterferePlan> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._planStateFlow = MutableStateFlow;
        this.planStateFlow = MutableStateFlow;
        this.sleepSettingRepository = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qom
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepInterfereReportViewModel.sleepSettingRepository_delegate$lambda$0();
            }
        });
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._hasOngoingPlanStateFlow = MutableStateFlow2;
        this.hasOngoingPlanStateFlow = MutableStateFlow2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepSettingRepository sleepSettingRepository_delegate$lambda$0() {
        return new SleepSettingRepository();
    }

    @NotNull
    public final StateFlow<Boolean> getHasOngoingPlanStateFlow() {
        return this.hasOngoingPlanStateFlow;
    }

    @NotNull
    public final StateFlow<SleepInterferePlan> getPlanStateFlow() {
        return this.planStateFlow;
    }

    @NotNull
    public final SleepSettingRepository getSleepSettingRepository() {
        return (SleepSettingRepository) this.sleepSettingRepository.getValue();
    }

    public final void updateCurrentplanById(long id) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(id, null), 2, null);
    }

    public final void updateHasOngoingPlan() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24871(null), 2, null);
    }
}
