package com.xiaomi.fitness.health.sleep.interfere;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetVM;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%J\u000e\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020%R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001a¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001d¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereSetVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "bedHour", "", "getBedHour", "()I", "setBedHour", "(I)V", "bedMinute", "getBedMinute", "setBedMinute", "wakeHour", "getWakeHour", "setWakeHour", "wakeMinute", "getWakeMinute", "setWakeMinute", "sleepInterfereRequest", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest;", "getSleepInterfereRequest", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest;", "sleepInterfereRequest$delegate", "Lkotlin/Lazy;", "userInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getUserInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "interferePlanLiveData", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "getInterferePlanLiveData", "getUserInfo", "", "createInterferePlan", "startDate", "", "endDate", "updateInterferePlan", "id", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepInterfereSetVM extends AbsViewModel {

    @NotNull
    private static final String TAG = "SleepInterfereSetVM";
    private int bedHour = 22;
    private int bedMinute = 30;
    private int wakeHour = 6;
    private int wakeMinute = 30;

    /* JADX INFO: renamed from: sleepInterfereRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepInterfereRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dpm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepInterfereSetVM.sleepInterfereRequest_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<AccountCoreInfo> userInfoLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<SleepInterferePlan> interferePlanLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetVM$createInterferePlan$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetVM$createInterferePlan$1", f = "SleepInterfereSetVM.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endDate;
        final /* synthetic */ long $startDate;
        int label;
        final /* synthetic */ SleepInterfereSetVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j2, SleepInterfereSetVM sleepInterfereSetVM, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$startDate = j;
            this.$endDate = j2;
            this.this$0 = sleepInterfereSetVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$startDate, this.$endDate, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger.i(SleepInterfereSetVM.TAG, "create-plan:" + this.$startDate + "," + this.$endDate + "," + this.this$0.getBedHour() + "," + this.this$0.getBedMinute() + "," + this.this$0.getWakeHour() + "," + this.this$0.getWakeMinute());
                SleepInterfereRequest sleepInterfereRequest = this.this$0.getSleepInterfereRequest();
                long j = this.$startDate;
                long j2 = this.$endDate;
                int bedHour = (this.this$0.getBedHour() * 3600) + (this.this$0.getBedMinute() * 60);
                int wakeHour = (this.this$0.getWakeHour() * 3600) + (this.this$0.getWakeMinute() * 60);
                int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
                String currentTimeZoneID = FitnessDateUtils.getCurrentTimeZoneID();
                this.label = 1;
                obj = sleepInterfereRequest.createInterferePlan(j, j2, bedHour, wakeHour, currentTZOffsetInSec, currentTimeZoneID, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.getInterferePlanLiveData().postValue((SleepInterferePlan) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetVM$getUserInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetVM$getUserInfo$1", f = "SleepInterfereSetVM.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C24881(Continuation<? super C24881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereSetVM.this.new C24881(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<AccountCoreInfo> userInfoLiveData = SleepInterfereSetVM.this.getUserInfoLiveData();
                UserInfoManager accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
                this.L$0 = userInfoLiveData;
                this.label = 1;
                Object miAccountCoreInfo$default = UserInfoManager.getMiAccountCoreInfo$default(accountManagerExtKt, false, this, 1, null);
                if (miAccountCoreInfo$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = userInfoLiveData;
                obj = miAccountCoreInfo$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetVM$updateInterferePlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetVM$updateInterferePlan$1", f = "SleepInterfereSetVM.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24891(long j, Continuation<? super C24891> continuation) {
            super(2, continuation);
            this.$id = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereSetVM.this.new C24891(this.$id, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepInterfereRequest sleepInterfereRequest = SleepInterfereSetVM.this.getSleepInterfereRequest();
                long j = this.$id;
                Integer numBoxInt = Boxing.boxInt((SleepInterfereSetVM.this.getBedHour() * 3600) + (SleepInterfereSetVM.this.getBedMinute() * 60));
                Integer numBoxInt2 = Boxing.boxInt((SleepInterfereSetVM.this.getWakeHour() * 3600) + (SleepInterfereSetVM.this.getWakeMinute() * 60));
                this.label = 1;
                obj = sleepInterfereRequest.updateInterferePlan(j, numBoxInt, numBoxInt2, 0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SleepInterfereSetVM.this.getInterferePlanLiveData().postValue((SleepInterferePlan) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepInterfereRequest getSleepInterfereRequest() {
        return (SleepInterfereRequest) this.sleepInterfereRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepInterfereRequest sleepInterfereRequest_delegate$lambda$0() {
        return new SleepInterfereRequest();
    }

    public final void createInterferePlan(long startDate, long endDate) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(startDate, endDate, this, null), 2, null);
    }

    public final int getBedHour() {
        return this.bedHour;
    }

    public final int getBedMinute() {
        return this.bedMinute;
    }

    @NotNull
    public final MutableLiveData<SleepInterferePlan> getInterferePlanLiveData() {
        return this.interferePlanLiveData;
    }

    public final void getUserInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24881(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getUserInfoLiveData() {
        return this.userInfoLiveData;
    }

    public final int getWakeHour() {
        return this.wakeHour;
    }

    public final int getWakeMinute() {
        return this.wakeMinute;
    }

    public final void setBedHour(int i) {
        this.bedHour = i;
    }

    public final void setBedMinute(int i) {
        this.bedMinute = i;
    }

    public final void setWakeHour(int i) {
        this.wakeHour = i;
    }

    public final void setWakeMinute(int i) {
        this.wakeMinute = i;
    }

    public final void updateInterferePlan(long id) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24891(id, null), 2, null);
    }
}
