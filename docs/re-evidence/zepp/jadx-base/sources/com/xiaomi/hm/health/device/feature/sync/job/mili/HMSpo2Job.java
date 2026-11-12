package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.huami.device.core.sync.api.dto.ProgressDto;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.sync.inject.InjectDevice;
import com.huami.device.core.sync.impl.sync.inject.InjectScope;
import com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel;
import com.huami.devicex.injection.data.HealthDataApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b-\u0010.J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0011\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010,\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMSpo2Job;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectScope;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectStatusChannel;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectDevice;", "Lorg/koin/core/component/KoinComponent;", "", "progress", "", "sendStatus", "", "maxTime", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "start", "Lkotlinx/coroutines/CoroutineScope;", "scope", "onInject", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "channel", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "setScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "statusChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "setDevice", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Lcom/huami/devicex/injection/data/HealthDataApi;", "healthDataApi$delegate", "Lkotlin/Lazy;", "getHealthDataApi", "()Lcom/huami/devicex/injection/data/HealthDataApi;", "healthDataApi", "workStatusDto$delegate", "getWorkStatusDto", "()Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "workStatusDto", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class HMSpo2Job implements SyncJob, InjectScope, InjectStatusChannel, InjectDevice, KoinComponent {
    public HMBaseDevice device;

    /* JADX INFO: renamed from: healthDataApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthDataApi;
    public CoroutineScope scope;
    private Channel<WorkStatusDto> statusChannel;

    /* JADX INFO: renamed from: workStatusDto$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy workStatusDto;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSpo2Job$sendStatus$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.HMSpo2Job$sendStatus$1", f = "HMSpo2Job.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $progress;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$progress = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMSpo2Job.this.new AnonymousClass1(this.$progress, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = HMSpo2Job.this.statusChannel;
                Objects.requireNonNull(channel);
                if (!channel.isClosedForSend()) {
                    Channel channel2 = HMSpo2Job.this.statusChannel;
                    Objects.requireNonNull(channel2);
                    WorkStatusDto workStatusDtoCopy$default = WorkStatusDto.copy$default(HMSpo2Job.this.getWorkStatusDto(), null, null, new ProgressDto(HMSpo2Job.this.findType(), this.$progress, null, 4, null), 0, 11, null);
                    this.label = 1;
                    if (channel2.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMSpo2Job() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.healthDataApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<HealthDataApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSpo2Job$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.data.HealthDataApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final HealthDataApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(HealthDataApi.class), qualifier, objArr);
            }
        });
        this.workStatusDto = LazyKt__LazyJVMKt.lazy(new Function0<WorkStatusDto>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSpo2Job$workStatusDto$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WorkStatusDto getA() {
                String deviceID;
                DeviceInfo deviceInfo = this.this$0.getDevice().getDeviceInfo();
                String str = "";
                if (deviceInfo != null && (deviceID = deviceInfo.getDeviceID()) != null) {
                    str = deviceID;
                }
                return new WorkStatusDto(str, DeviceWorkStatus.RUNNING, null, 0, 8, null);
            }
        });
    }

    private final HealthDataApi getHealthDataApi() {
        return (HealthDataApi) this.healthDataApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WorkStatusDto getWorkStatusDto() {
        return (WorkStatusDto) this.workStatusDto.getValue();
    }

    private final void sendStatus(int progress) {
        e.f(getScope(), Dispatchers.getDefault(), null, new AnonymousClass1(progress, null), 2, null);
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getSPO2();
    }

    @NotNull
    public final HMBaseDevice getDevice() {
        HMBaseDevice hMBaseDevice = this.device;
        Objects.requireNonNull(hMBaseDevice);
        return hMBaseDevice;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final CoroutineScope getScope() {
        CoroutineScope coroutineScope = this.scope;
        Objects.requireNonNull(coroutineScope);
        return coroutineScope;
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public long maxTime() {
        return 60000L;
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectScope
    public void onInject(@NotNull CoroutineScope scope) {
        setScope(scope);
    }

    public final void setDevice(@NotNull HMBaseDevice hMBaseDevice) {
        this.device = hMBaseDevice;
    }

    public final void setScope(@NotNull CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException, DeviceConnectException {
        if (!getDevice().isConnected()) {
            throw new DeviceConnectException();
        }
        sendStatus(1);
        try {
            getHealthDataApi().syncDeviceSpo2Data(getDevice());
            sendStatus(100);
        } catch (Exception e) {
            throw new SyncException("同步血氧错误", e, 0, 4, null);
        }
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel
    public void onInject(@NotNull Channel<WorkStatusDto> channel) {
        this.statusChannel = channel;
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectDevice
    public void onInject(@NotNull HMBaseDevice device) throws ConfigException {
        if (device instanceof HMMiLiProDevice) {
            setDevice(device);
            return;
        }
        throw new ConfigException("device class error", null, 2, null);
    }
}
