package com.huami.device.core.sync.impl.sync.hub;

import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.SyncApi;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.impl.sync.ConstKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/device/core/sync/impl/sync/hub/SensorHubSyncImpl;", "Lcom/huami/device/core/sync/api/SyncApi;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "start", "", "isRunning", "Lcom/huami/device/core/sync/impl/sync/hub/HmSensorHubDevice;", "device", "Lcom/huami/device/core/sync/impl/sync/hub/HmSensorHubDevice;", "", "tag", "Ljava/lang/String;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "currentStatus", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "(Lcom/huami/device/core/sync/impl/sync/hub/HmSensorHubDevice;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class SensorHubSyncImpl implements SyncApi, CoroutineScope {

    @NotNull
    private final HmSensorHubDevice device;

    @NotNull
    private final String tag = "SyncCenter-SyncApi";

    @NotNull
    private final CoroutineContext coroutineContext = ConstKt.createSyncContext();

    @NotNull
    private final AtomicBoolean currentStatus = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.sync.hub.SensorHubSyncImpl$start$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.sync.hub.SensorHubSyncImpl$start$1", f = "SensorHubSyncImpl.kt", i = {0}, l = {46, 50, 51, 54}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Channel<WorkStatusDto> $statusChannel;
        public final /* synthetic */ WorkStatusDto $workStatus;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ SensorHubSyncImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Channel<WorkStatusDto> channel, WorkStatusDto workStatusDto, SensorHubSyncImpl sensorHubSyncImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$statusChannel = channel;
            this.$workStatus = workStatusDto;
            this.this$0 = sensorHubSyncImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$statusChannel, this.$workStatus, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x009e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            Channel<WorkStatusDto> channel;
            WorkStatusDto workStatusDtoCopy$default;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i != 0) {
                        if (i == 1) {
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                        } else if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            channel = this.$statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.label = 3;
                            if (channel.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 3 && i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        this.this$0.currentStatus.set(false);
                        SendChannel.DefaultImpls.close$default(this.$statusChannel, null, 1, null);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    Channel<WorkStatusDto> channel2 = this.$statusChannel;
                    WorkStatusDto workStatusDto = this.$workStatus;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (channel2.send(workStatusDto, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.this$0.currentStatus.set(true);
                    LinkedList linkedList = new LinkedList();
                    linkedList.addAll(SyncCenterFactory.INSTANCE.getSyncStrategy().loadSyncJobs(this.this$0.device));
                    Channel<WorkStatusDto> channel3 = this.$statusChannel;
                    HmSensorHubDevice hmSensorHubDevice = this.this$0.device;
                    this.L$0 = null;
                    this.label = 2;
                    if (ConstKt.runJobQueue(linkedList, channel3, hmSensorHubDevice, coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channel = this.$statusChannel;
                    workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                    this.label = 3;
                    if (channel.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e) {
                    HMLog.e(this.this$0.tag, e);
                    Channel<WorkStatusDto> channel4 = this.$statusChannel;
                    WorkStatusDto workStatusDtoCopy$default2 = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.EXCEPTION, null, ConstKt.findErrorCode(e), 5, null);
                    this.L$0 = null;
                    this.label = 4;
                    if (channel4.send(workStatusDtoCopy$default2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.this$0.currentStatus.set(false);
                SendChannel.DefaultImpls.close$default(this.$statusChannel, null, 1, null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.currentStatus.set(false);
                SendChannel.DefaultImpls.close$default(this.$statusChannel, null, 1, null);
                throw th;
            }
        }
    }

    public SensorHubSyncImpl(@NotNull HmSensorHubDevice hmSensorHubDevice) {
        this.device = hmSensorHubDevice;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    /* JADX INFO: renamed from: isRunning */
    public boolean getCurrentStatus() {
        return this.currentStatus.get();
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    @NotNull
    public Channel<WorkStatusDto> start() {
        String deviceID;
        Channel<WorkStatusDto> channelCreateStatusChannel = ConstKt.createStatusChannel();
        DeviceInfo deviceInfo = this.device.getDeviceInfo();
        String str = "";
        if (deviceInfo != null && (deviceID = deviceInfo.getDeviceID()) != null) {
            str = deviceID;
        }
        e.f(this, getCoroutineContext(), null, new AnonymousClass1(channelCreateStatusChannel, new WorkStatusDto(str, DeviceWorkStatus.RUNNING, null, 0, 8, null), this, null), 2, null);
        return channelCreateStatusChannel;
    }
}
