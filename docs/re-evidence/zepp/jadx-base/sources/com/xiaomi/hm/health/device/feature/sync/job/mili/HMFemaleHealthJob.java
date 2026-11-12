package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.huami.device.core.sync.api.dto.ProgressDto;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.sync.inject.InjectDevice;
import com.huami.device.core.sync.impl.sync.inject.InjectScope;
import com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.feature.sync.SyncMenstruation;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b+\u0010,J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\u0014\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001d\u0010*\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMFemaleHealthJob;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectScope;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectStatusChannel;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectDevice;", "", "progress", "", "sendStatus", "", "maxTime", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "Lkotlinx/coroutines/CoroutineScope;", "scope", "onInject", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "channel", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "start", "", "tag", "Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "setScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "statusChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "getDevice", "()Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "setDevice", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;)V", "workStatusDto$delegate", "Lkotlin/Lazy;", "getWorkStatusDto", "()Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "workStatusDto", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class HMFemaleHealthJob implements SyncJob, InjectScope, InjectStatusChannel, InjectDevice {
    public HMMiLiProDevice device;
    public CoroutineScope scope;
    private Channel<WorkStatusDto> statusChannel;

    @NotNull
    private final String tag = "HMFemaleHealthJob-SyncJob";

    /* JADX INFO: renamed from: workStatusDto$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy workStatusDto = LazyKt__LazyJVMKt.lazy(new Function0<WorkStatusDto>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMFemaleHealthJob$workStatusDto$2
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

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMFemaleHealthJob$sendStatus$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.HMFemaleHealthJob$sendStatus$1", f = "HMFemaleHealthJob.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
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
            return HMFemaleHealthJob.this.new AnonymousClass1(this.$progress, continuation);
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
                Channel channel = HMFemaleHealthJob.this.statusChannel;
                Objects.requireNonNull(channel);
                if (!channel.isClosedForSend()) {
                    Channel channel2 = HMFemaleHealthJob.this.statusChannel;
                    Objects.requireNonNull(channel2);
                    WorkStatusDto workStatusDtoCopy$default = WorkStatusDto.copy$default(HMFemaleHealthJob.this.getWorkStatusDto(), null, null, new ProgressDto(HMFemaleHealthJob.this.findType(), this.$progress, null, 4, null), 0, 11, null);
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
        return JobType.INSTANCE.getFEMALE_HEALTH();
    }

    @NotNull
    public final HMMiLiProDevice getDevice() {
        HMMiLiProDevice hMMiLiProDevice = this.device;
        Objects.requireNonNull(hMMiLiProDevice);
        return hMMiLiProDevice;
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

    public final void setDevice(@NotNull HMMiLiProDevice hMMiLiProDevice) {
        this.device = hMMiLiProDevice;
    }

    public final void setScope(@NotNull CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException {
        sendStatus(1);
        try {
            new SyncMenstruation(getDevice()).start();
            sendStatus(100);
        } catch (Exception e) {
            throw new SyncException("error of Stop HMFemaleHealthJob", e, 0, 4, null);
        }
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel
    public void onInject(@NotNull Channel<WorkStatusDto> channel) {
        this.statusChannel = channel;
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectDevice
    public void onInject(@NotNull HMBaseDevice device) throws ConfigException {
        if (device instanceof HMMiLiProDevice) {
            setDevice((HMMiLiProDevice) device);
            return;
        }
        throw new ConfigException("device class error", null, 2, null);
    }
}
