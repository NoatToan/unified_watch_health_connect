package com.huami.device.core.sync.impl.job.weight;

import com.huami.device.core.sync.api.dto.ProgressDto;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMWeightDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.e;
import org.cybergarage.upnp.device.ST;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0004J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0005H'J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000H&¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010+\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00058D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u0010:\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/huami/device/core/sync/impl/job/weight/BaseWeightJob;", "DATA", "Lcom/huami/device/core/sync/api/type/SyncJob;", "", "deviceNotConnect", "", "maxTime", "", "start", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "status", "sendStatus", "", "percent", "createProgress", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "loadDeviceUid", "outData", "onFinish", "(Ljava/lang/Object;)V", "Lcom/xiaomi/hm/health/bt/device/HMWeightDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMWeightDevice;", "getDevice$sync_center_release", "()Lcom/xiaomi/hm/health/bt/device/HMWeightDevice;", "setDevice$sync_center_release", "(Lcom/xiaomi/hm/health/bt/device/HMWeightDevice;)V", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope$sync_center_release", "()Lkotlinx/coroutines/CoroutineScope;", "setScope$sync_center_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "<set-?>", "uuid$delegate", "Lkotlin/properties/ReadWriteProperty;", "getUuid", "()J", "setUuid", "(J)V", ST.UUID_DEVICE, "Lkotlinx/coroutines/channels/Channel;", "stateChannel", "Lkotlinx/coroutines/channels/Channel;", "getStateChannel", "()Lkotlinx/coroutines/channels/Channel;", "setStateChannel", "(Lkotlinx/coroutines/channels/Channel;)V", "", "tag", "Ljava/lang/String;", "workStatusDto$delegate", "Lkotlin/Lazy;", "getWorkStatusDto", "()Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "workStatusDto", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class BaseWeightJob<DATA> implements SyncJob {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseWeightJob.class, ST.UUID_DEVICE, "getUuid()J", 0))};
    public HMWeightDevice device;
    public CoroutineScope scope;
    public Channel<WorkStatusDto> stateChannel;

    /* JADX INFO: renamed from: uuid$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty uuid = Delegates.INSTANCE.notNull();

    @NotNull
    private final String tag = "SyncCenter-BaseWeightJob";

    /* JADX INFO: renamed from: workStatusDto$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy workStatusDto = LazyKt__LazyJVMKt.lazy(new Function0<WorkStatusDto>(this) { // from class: com.huami.device.core.sync.impl.job.weight.BaseWeightJob$workStatusDto$2
        public final /* synthetic */ BaseWeightJob<DATA> this$0;

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
            DeviceInfo deviceInfo = this.this$0.getDevice$sync_center_release().getDeviceInfo();
            String str = "";
            if (deviceInfo != null && (deviceID = deviceInfo.getDeviceID()) != null) {
                str = deviceID;
            }
            return new WorkStatusDto(str, DeviceWorkStatus.RUNNING, null, 0, 8, null);
        }
    });

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.job.weight.BaseWeightJob$sendStatus$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"DATA", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.job.weight.BaseWeightJob$sendStatus$1", f = "BaseWeightJob.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ WorkStatusDto $status;
        public int label;
        public final /* synthetic */ BaseWeightJob<DATA> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseWeightJob<DATA> baseWeightJob, WorkStatusDto workStatusDto, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = baseWeightJob;
            this.$status = workStatusDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$status, continuation);
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
            return Unit.INSTANCE;
        }
    }

    private final boolean deviceNotConnect() {
        if (getDevice$sync_center_release().isConnected()) {
            return false;
        }
        HMLog.w(this.tag, "设备未连接", new Object[0]);
        return true;
    }

    private final WorkStatusDto getWorkStatusDto() {
        return (WorkStatusDto) this.workStatusDto.getValue();
    }

    @NotNull
    public final WorkStatusDto createProgress(int percent) {
        return WorkStatusDto.copy$default(getWorkStatusDto(), null, null, new ProgressDto(findType(), percent, null, 4, null), 0, 11, null);
    }

    @NotNull
    public final HMWeightDevice getDevice$sync_center_release() {
        HMWeightDevice hMWeightDevice = this.device;
        if (hMWeightDevice != null) {
            return hMWeightDevice;
        }
        return null;
    }

    @NotNull
    public final CoroutineScope getScope$sync_center_release() {
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

    public final long getUuid() {
        return ((Number) this.uuid.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @NotNull
    public abstract long loadDeviceUid();

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public long maxTime() {
        return 600000L;
    }

    public abstract void onFinish(DATA outData);

    public void onProgress(@NotNull Progress progress) {
    }

    public final void sendStatus(@NotNull WorkStatusDto status) {
        e.f(getScope$sync_center_release(), null, null, new AnonymousClass1(this, status, null), 3, null);
    }

    public final void setDevice$sync_center_release(@NotNull HMWeightDevice hMWeightDevice) {
        this.device = hMWeightDevice;
    }

    public final void setScope$sync_center_release(@NotNull CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    public final void setStateChannel(@NotNull Channel<WorkStatusDto> channel) {
        this.stateChannel = channel;
    }

    public final void setUuid(long j) {
        this.uuid.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() {
        try {
            if (deviceNotConnect()) {
                return;
            }
            setUuid(loadDeviceUid());
        } catch (Exception unused) {
            throw new SyncException(Intrinsics.stringPlus("初始化同步失败- ", findType()), null, 0, 6, null);
        }
    }
}
