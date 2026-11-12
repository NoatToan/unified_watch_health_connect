package com.huami.device.core.sync.impl.job.milible;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.sync.api.Cancelable;
import com.huami.device.core.sync.api.Interruptable;
import com.huami.device.core.sync.api.dto.ProgressDto;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.exception.NotSupportException;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.sync.inject.InjectDevice;
import com.huami.device.core.sync.impl.sync.inject.InjectScope;
import com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel;
import com.huami.tools.log.HMLog;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Calendar;
import java.util.concurrent.CancellationException;
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
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u000b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\bI\u0010JJ\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017J\u001c\u0010\u001e\u001a\u00020\u00132\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0017J\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\u000eH\u0016J\b\u0010\"\u001a\u00020\u000eH\u0016J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010%\u001a\u00020$H&J\u0014\u0010&\u001a\u00020\u000e2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH&J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00028\u0000H&¢\u0006\u0004\b(\u0010)J\b\u0010*\u001a\u00020\u000eH\u0016R\"\u0010\r\u001a\u00020\f8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0011\u001a\u00020\u00108\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=\"\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010BR\u001d\u0010G\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010<¨\u0006K"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "DATA", "Lcom/huami/device/core/sync/api/type/SyncJob;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectStatusChannel;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectScope;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectDevice;", "Lcom/huami/device/core/sync/api/Cancelable;", "Lcom/huami/device/core/sync/api/Interruptable;", "", "deviceNotConnect", "", "maxTime", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onInject", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "channel", "status", "sendStatus", "", "percent", "createProgress", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.EXCEPTION, "errorCode", "createErrorProgress", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "loadProDevice", "start", "interrupt", "isInterrupted", "Ljava/util/Calendar;", "loadStartTime", "onError", "outData", "onDataOut", "(Ljava/lang/Object;)V", g.g, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "setDevice", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "setScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "stateChannel", "Lkotlinx/coroutines/channels/Channel;", "getStateChannel", "()Lkotlinx/coroutines/channels/Channel;", "setStateChannel", "(Lkotlinx/coroutines/channels/Channel;)V", "isCancel", "Z", "()Z", "setCancel", "(Z)V", "", "tag", "Ljava/lang/String;", "workStatusDto$delegate", "Lkotlin/Lazy;", "getWorkStatusDto", "()Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "workStatusDto", "isInterrupt", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class BaseJob<DATA> implements SyncJob, InjectStatusChannel, InjectScope, InjectDevice, Cancelable, Interruptable {
    public HMBaseDevice device;
    private boolean isCancel;
    private volatile boolean isInterrupt;
    public CoroutineScope scope;
    public Channel<WorkStatusDto> stateChannel;

    @NotNull
    private final String tag = "SyncCenter-BaseTask";

    /* JADX INFO: renamed from: workStatusDto$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy workStatusDto = LazyKt__LazyJVMKt.lazy(new Function0<WorkStatusDto>(this) { // from class: com.huami.device.core.sync.impl.job.milible.BaseJob$workStatusDto$2
        public final /* synthetic */ BaseJob<DATA> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final WorkStatusDto invoke() {
            String deviceID;
            DeviceInfo deviceInfo = this.this$0.getDevice().getDeviceInfo();
            String str = "";
            if (deviceInfo != null && (deviceID = deviceInfo.getDeviceID()) != null) {
                str = deviceID;
            }
            return new WorkStatusDto(str, DeviceWorkStatus.RUNNING, null, 0, 12, null);
        }
    });

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.job.milible.BaseJob$sendStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"DATA", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.job.milible.BaseJob$sendStatus$1", f = "BaseJob.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ WorkStatusDto $status;
        public int label;
        public final /* synthetic */ BaseJob<DATA> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15251(BaseJob<DATA> baseJob, WorkStatusDto workStatusDto, Continuation<? super C15251> continuation) {
            super(2, continuation);
            this.this$0 = baseJob;
            this.$status = workStatusDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C15251(this.this$0, this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.this$0.getStateChannel().isClosedForSend()) {
                        Channel<WorkStatusDto> stateChannel = this.this$0.getStateChannel();
                        WorkStatusDto workStatusDto = this.$status;
                        this.label = 1;
                        if (stateChannel.send(workStatusDto, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                HMLog.warn(((BaseJob) this.this$0).tag, th, new Function0<String>() { // from class: com.huami.device.core.sync.impl.job.milible.BaseJob.sendStatus.1.1
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "channel closed";
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ WorkStatusDto createErrorProgress$default(BaseJob baseJob, Exception exc, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createErrorProgress");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return baseJob.createErrorProgress(exc, i);
    }

    private final boolean deviceNotConnect() {
        if (getDevice().isConnected()) {
            return false;
        }
        HMLog.warn$default(this.tag, null, new Function0<String>() { // from class: com.huami.device.core.sync.impl.job.milible.BaseJob.deviceNotConnect.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "设备未连接";
            }
        }, 2, null);
        return true;
    }

    private final WorkStatusDto getWorkStatusDto() {
        return (WorkStatusDto) this.workStatusDto.getValue();
    }

    @Override // com.huami.device.core.sync.api.Cancelable
    public void cancel() {
        this.isCancel = true;
    }

    @NotNull
    public final WorkStatusDto createErrorProgress(@NotNull Exception exception, int errorCode) {
        HMLog.error(this.tag, GoogleApiAvailabilityLight.b, exception, new Function0<String>() { // from class: com.huami.device.core.sync.impl.job.milible.BaseJob.createErrorProgress.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "ErrorProgress";
            }
        });
        onError(exception);
        return WorkStatusDto.copy$default(getWorkStatusDto(), null, null, new ProgressDto(findType(), -1, String.valueOf(exception.getMessage())), errorCode, 3, null);
    }

    @NotNull
    public final WorkStatusDto createProgress(int percent) {
        return WorkStatusDto.copy$default(getWorkStatusDto(), null, null, new ProgressDto(findType(), percent, null, 4, null), 0, 11, null);
    }

    @NotNull
    public final HMBaseDevice getDevice() {
        HMBaseDevice hMBaseDevice = this.device;
        if (hMBaseDevice != null) {
            return hMBaseDevice;
        }
        return null;
    }

    @NotNull
    public final CoroutineScope getScope() {
        CoroutineScope coroutineScope = this.scope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        return null;
    }

    @NotNull
    public final Channel<WorkStatusDto> getStateChannel() {
        Channel<WorkStatusDto> channel = this.stateChannel;
        if (channel != null) {
            return channel;
        }
        return null;
    }

    @Override // com.huami.device.core.sync.api.Interruptable
    public void interrupt() {
        this.isInterrupt = true;
    }

    /* JADX INFO: renamed from: isCancel, reason: from getter */
    public final boolean getIsCancel() {
        return this.isCancel;
    }

    @Override // com.huami.device.core.sync.api.Interruptable
    public boolean isInterrupted() {
        return this.isCancel || this.isInterrupt;
    }

    @NotNull
    public final HMMiLiProDevice loadProDevice() throws NotSupportException {
        try {
            return (HMMiLiProDevice) getDevice();
        } catch (Exception e) {
            sendStatus(createErrorProgress$default(this, e, 0, 2, null));
            throw new NotSupportException("type error", e);
        }
    }

    @NotNull
    public abstract Calendar loadStartTime();

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public long maxTime() {
        return 600000L;
    }

    public abstract void onDataOut(DATA outData);

    public abstract void onError(@NotNull Exception exception);

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectDevice
    public void onInject(@NotNull HMBaseDevice device) {
        setDevice(device);
    }

    public final void sendStatus(@NotNull WorkStatusDto status) {
        e.f(getScope(), null, null, new C15251(this, status, null), 3, null);
    }

    public final void setCancel(boolean z) {
        this.isCancel = z;
    }

    public final void setDevice(@NotNull HMBaseDevice hMBaseDevice) {
        this.device = hMBaseDevice;
    }

    public final void setScope(@NotNull CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    public final void setStateChannel(@NotNull Channel<WorkStatusDto> channel) {
        this.stateChannel = channel;
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() throws DeviceConnectException {
        if (this.isCancel) {
            throw new CancellationException("主动取消同步任务");
        }
        if (deviceNotConnect()) {
            throw new DeviceConnectException();
        }
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectScope
    public void onInject(@NotNull CoroutineScope scope) {
        setScope(scope);
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel
    public void onInject(@NotNull Channel<WorkStatusDto> channel) {
        setStateChannel(channel);
    }
}
