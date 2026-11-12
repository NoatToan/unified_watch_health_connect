package com.xiaomi.hm.health.device.setting.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.fw_upgrade.NetFwUpgradeManager;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\n\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0004H\u0014R#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/eventbus/EventFwCheckResult;", "result", "", "onEvent", "startCheck", "onCleared", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result;", "a", "Lkotlin/Lazy;", "getResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "resultLiveData", "", "b", "Z", "isChecking", "Lkotlinx/coroutines/channels/Channel;", "c", "Lkotlinx/coroutines/channels/Channel;", "resultChannel", "<init>", "()V", GoogleApiAvailabilityLight.a, "Result", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceUpdateCheckerViewModel extends ViewModel {

    @Deprecated
    public static final long TIMEOUT = 30000;

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy resultLiveData = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isChecking;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Channel<Boolean> resultChannel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result;", "", "<init>", "()V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Success", "Timeout", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result$Success;", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result$Failed;", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result$Timeout;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static abstract class Result {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result$Failed;", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Failed extends Result {

            @NotNull
            public static final Failed INSTANCE = new Failed();

            private Failed() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result$Success;", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Success extends Result {

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result$Timeout;", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Timeout extends Result {

            @NotNull
            public static final Timeout INSTANCE = new Timeout();

            private Timeout() {
                super(null);
            }
        }

        private Result() {
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$a", "", "", "TIMEOUT", "J", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceUpdateCheckerViewModel$Result;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<Result>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Result> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceUpdateCheckerViewModel$startCheck$1$1", f = "DeviceUpdateCheckerViewModel.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Channel<Boolean> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Channel<Boolean> channel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceUpdateCheckerViewModel.this.new c(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableLiveData<Result> mutableLiveData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<Result> resultLiveData = DeviceUpdateCheckerViewModel.this.getResultLiveData();
                Channel<Boolean> channel = this.d;
                this.a = resultLiveData;
                this.b = 1;
                Object objReceive = channel.receive(this);
                if (objReceive == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = resultLiveData;
                obj = objReceive;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.a;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(((Boolean) obj).booleanValue() ? Result.Success.INSTANCE : Result.Failed.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    public DeviceUpdateCheckerViewModel() {
        EventBus.getDefault().register(this);
    }

    @NotNull
    public final MutableLiveData<Result> getResultLiveData() {
        return (MutableLiveData) this.resultLiveData.getValue();
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        EventBus.getDefault().unregister(this);
        super.onCleared();
    }

    public final void onEvent(@NotNull EventFwCheckResult result) {
        if (this.isChecking) {
            e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DeviceUpdateCheckerViewModel$onEvent$$inlined$safeLaunch$1(null, this, result), 2, null);
        }
    }

    public final void startCheck() {
        Channel<Boolean> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.resultChannel = channelChannel$default;
        this.isChecking = true;
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            HMFwOnlineManager.getInstance().checkFw(HMDeviceType.MILI, true);
        } else {
            NetFwUpgradeManager.checkFwFromServerAsync(true);
        }
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceUpdateCheckerViewModel$startCheck$$inlined$safeLaunch$1(null, this, channelChannel$default), 2, null);
    }
}
