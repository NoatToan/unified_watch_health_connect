package com.huami.device.core.sync.impl.sync.smart;

import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.SyncApi;
import com.huami.device.core.sync.api.SyncStrategy;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.sync.ConstKt;
import com.huami.device.core.sync.impl.sync.inject.InjectDevice;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import java.util.Queue;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u00020\u00108\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/device/core/sync/impl/sync/smart/HMSmartWatchSyncImpl;", "Lcom/huami/device/core/sync/api/SyncApi;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectDevice;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onInject", "", "isRunning", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "start", "", "tag", "Ljava/lang/String;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "Z", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class HMSmartWatchSyncImpl implements SyncApi, InjectDevice, CoroutineScope {
    private HMMiLiDevice device;
    private volatile boolean isRunning;

    @NotNull
    private final String tag = "SyncCenter-SyncApi";

    @NotNull
    private final CoroutineContext coroutineContext = ConstKt.createSyncContext();

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.sync.smart.HMSmartWatchSyncImpl$start$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.sync.smart.HMSmartWatchSyncImpl$start$2", f = "HMSmartWatchSyncImpl.kt", i = {0, 0, 1, 1, 2, 2}, l = {70, 71, 72, 73, 74, 77}, m = "invokeSuspend", n = {"$this$launch", "jobQueue", "$this$launch", "jobQueue", "$this$launch", "jobQueue"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Channel<WorkStatusDto> $statusChannel;
        public final /* synthetic */ WorkStatusDto $workStatus;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Channel<WorkStatusDto> channel, WorkStatusDto workStatusDto, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$statusChannel = channel;
            this.$workStatus = workStatusDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = HMSmartWatchSyncImpl.this.new AnonymousClass2(this.$statusChannel, this.$workStatus, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0098 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x00aa A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:42:0x00c3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:45:0x00dd A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            Queue<SyncJob> queueConvertJobListToQueue;
            Channel<WorkStatusDto> channel;
            WorkStatusDto workStatusDto;
            Channel<WorkStatusDto> channel2;
            HMMiLiDevice hMMiLiDevice;
            Channel<WorkStatusDto> channel3;
            WorkStatusDto workStatusDtoCopy$default;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            try {
                try {
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = (CoroutineScope) this.L$0;
                            SyncStrategy syncStrategy = SyncCenterFactory.INSTANCE.getSyncStrategy();
                            HMMiLiDevice hMMiLiDevice2 = HMSmartWatchSyncImpl.this.device;
                            if (hMMiLiDevice2 == null) {
                                hMMiLiDevice2 = null;
                            }
                            queueConvertJobListToQueue = ConstKt.convertJobListToQueue(syncStrategy, hMMiLiDevice2);
                            ConstKt.printDebugInfo(queueConvertJobListToQueue);
                            Channel<WorkStatusDto> channel4 = this.$statusChannel;
                            WorkStatusDto workStatusDtoCopy$default2 = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.NORMAL, null, 0, 13, null);
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 1;
                            if (channel4.send(workStatusDtoCopy$default2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 2;
                            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel = this.$statusChannel;
                            workStatusDto = this.$workStatus;
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 3;
                            if (channel.send(workStatusDto, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel2 = this.$statusChannel;
                            hMMiLiDevice = HMSmartWatchSyncImpl.this.device;
                            if (hMMiLiDevice == null) {
                                hMMiLiDevice = null;
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (ConstKt.runJobQueue(queueConvertJobListToQueue, channel2, hMMiLiDevice, coroutineScope, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel3 = this.$statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.label = 5;
                            if (channel3.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HMSmartWatchSyncImpl.this.isRunning = false;
                            SendChannel.DefaultImpls.close$default(this.$statusChannel, null, 1, null);
                            return Unit.INSTANCE;
                        case 1:
                            queueConvertJobListToQueue = (Queue) this.L$1;
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 2;
                            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel = this.$statusChannel;
                            workStatusDto = this.$workStatus;
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 3;
                            if (channel.send(workStatusDto, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel2 = this.$statusChannel;
                            hMMiLiDevice = HMSmartWatchSyncImpl.this.device;
                            if (hMMiLiDevice == null) {
                                hMMiLiDevice = null;
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (ConstKt.runJobQueue(queueConvertJobListToQueue, channel2, hMMiLiDevice, coroutineScope, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel3 = this.$statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.label = 5;
                            if (channel3.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HMSmartWatchSyncImpl.this.isRunning = false;
                            SendChannel.DefaultImpls.close$default(this.$statusChannel, null, 1, null);
                            return Unit.INSTANCE;
                        case 2:
                            queueConvertJobListToQueue = (Queue) this.L$1;
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            channel = this.$statusChannel;
                            workStatusDto = this.$workStatus;
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 3;
                            if (channel.send(workStatusDto, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel2 = this.$statusChannel;
                            hMMiLiDevice = HMSmartWatchSyncImpl.this.device;
                            if (hMMiLiDevice == null) {
                                hMMiLiDevice = null;
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (ConstKt.runJobQueue(queueConvertJobListToQueue, channel2, hMMiLiDevice, coroutineScope, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel3 = this.$statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.label = 5;
                            if (channel3.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HMSmartWatchSyncImpl.this.isRunning = false;
                            SendChannel.DefaultImpls.close$default(this.$statusChannel, null, 1, null);
                            return Unit.INSTANCE;
                        case 3:
                            queueConvertJobListToQueue = (Queue) this.L$1;
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            channel2 = this.$statusChannel;
                            hMMiLiDevice = HMSmartWatchSyncImpl.this.device;
                            if (hMMiLiDevice == null) {
                                hMMiLiDevice = null;
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (ConstKt.runJobQueue(queueConvertJobListToQueue, channel2, hMMiLiDevice, coroutineScope, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel3 = this.$statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.label = 5;
                            if (channel3.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HMSmartWatchSyncImpl.this.isRunning = false;
                            SendChannel.DefaultImpls.close$default(this.$statusChannel, null, 1, null);
                            return Unit.INSTANCE;
                        case 4:
                            ResultKt.throwOnFailure(obj);
                            channel3 = this.$statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.label = 5;
                            if (channel3.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HMSmartWatchSyncImpl.this.isRunning = false;
                            SendChannel.DefaultImpls.close$default(this.$statusChannel, null, 1, null);
                            return Unit.INSTANCE;
                        case 5:
                            ResultKt.throwOnFailure(obj);
                            HMSmartWatchSyncImpl.this.isRunning = false;
                            SendChannel.DefaultImpls.close$default(this.$statusChannel, null, 1, null);
                            return Unit.INSTANCE;
                        case 6:
                            ResultKt.throwOnFailure(obj);
                            HMSmartWatchSyncImpl.this.isRunning = false;
                            SendChannel.DefaultImpls.close$default(this.$statusChannel, null, 1, null);
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th) {
                    HMLog.e(HMSmartWatchSyncImpl.this.tag, th);
                    Channel<WorkStatusDto> channel5 = this.$statusChannel;
                    WorkStatusDto workStatusDtoCopy$default3 = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.EXCEPTION, null, ConstKt.findErrorCode(th), 5, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 6;
                    if (channel5.send(workStatusDtoCopy$default3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (Throwable th2) {
                HMSmartWatchSyncImpl.this.isRunning = false;
                SendChannel.DefaultImpls.close$default(this.$statusChannel, null, 1, null);
                throw th2;
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    /* JADX INFO: renamed from: isRunning, reason: from getter */
    public boolean getIsRunning() {
        return this.isRunning;
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectDevice
    public void onInject(@NotNull HMBaseDevice device) throws ConfigException {
        if (!(device instanceof HMSmartWatchDevice)) {
            throw new ConfigException("配置错误", null, 2, null);
        }
        this.device = (HMMiLiDevice) device;
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    @NotNull
    public Channel<WorkStatusDto> start() {
        String deviceID;
        Channel<WorkStatusDto> Channel = ChannelKt.Channel(10);
        if (this.isRunning) {
            HMLog.w(this.tag, "正在同步中……", new Object[0]);
            SendChannel.DefaultImpls.close$default(Channel, null, 1, null);
            return Channel;
        }
        this.isRunning = true;
        HMMiLiDevice hMMiLiDevice = this.device;
        if (hMMiLiDevice == null) {
            hMMiLiDevice = null;
        }
        DeviceInfo deviceInfo = hMMiLiDevice.getDeviceInfo();
        e.f(this, getCoroutineContext(), null, new AnonymousClass2(Channel, new WorkStatusDto((deviceInfo == null || (deviceID = deviceInfo.getDeviceID()) == null) ? "" : deviceID, DeviceWorkStatus.RUNNING, null, 0, 8, null), null), 2, null);
        return Channel;
    }
}
