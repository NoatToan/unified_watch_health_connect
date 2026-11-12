package com.huami.device.core.sync.impl.sync.weight;

import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.Cancelable;
import com.huami.device.core.sync.api.SyncApi;
import com.huami.device.core.sync.api.SyncStrategy;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.job.weight.BaseWeightJob;
import com.huami.device.core.sync.impl.sync.ConstKt;
import com.huami.device.core.sync.impl.sync.inject.InjectDevice;
import com.huami.tools.log.HMLog;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMWeightDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import java.util.Calendar;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b&\u0010\u0010J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u000f\u0010\u0011\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u00020\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/huami/device/core/sync/impl/sync/weight/WeightDeviceSyncCenterImpl;", "Lcom/huami/device/core/sync/api/SyncApi;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectDevice;", "Lcom/huami/device/core/sync/api/Cancelable;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onInject", "", "isRunning", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "start", g.g, "resetTime$sync_center_release", "()V", "resetTime", "", "tag", "Ljava/lang/String;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "currentStatus", "Z", "", "syncTime", "J", "Lcom/huami/device/core/sync/api/SyncStrategy;", "syncStrategy", "Lcom/huami/device/core/sync/api/SyncStrategy;", "Lcom/xiaomi/hm/health/bt/device/HMWeightDevice;", "Lcom/xiaomi/hm/health/bt/device/HMWeightDevice;", "statusChannel", "Lkotlinx/coroutines/channels/Channel;", "<init>", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class WeightDeviceSyncCenterImpl implements SyncApi, CoroutineScope, InjectDevice, Cancelable {
    private volatile boolean currentStatus;
    private HMWeightDevice device;

    @Nullable
    private Channel<WorkStatusDto> statusChannel;
    private long syncTime;

    @NotNull
    private final String tag = "SyncCenter-SyncApi";

    @NotNull
    private final CoroutineContext coroutineContext = ConstKt.createSyncContext();

    @NotNull
    private final SyncStrategy syncStrategy = SyncCenterFactory.INSTANCE.getSyncStrategy();

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.sync.weight.WeightDeviceSyncCenterImpl$start$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.sync.weight.WeightDeviceSyncCenterImpl$start$3", f = "WeightDeviceSyncCenterImpl.kt", i = {2, 2, 5}, l = {84, 85, 89, 106, 109, 111}, m = "invokeSuspend", n = {"$this$launch", "jobQueue", "e"}, s = {"L$0", "L$1", "L$0"})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ WorkStatusDto $workStatus;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(WorkStatusDto workStatusDto, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$workStatus = workStatusDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = WeightDeviceSyncCenterImpl.this.new AnonymousClass3(this.$workStatus, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x008b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x009c  */
        /* JADX WARN: Code duplicated, block: B:45:0x00e6 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:11:0x0022, B:12:0x0027, B:58:0x015f, B:15:0x0034, B:42:0x00cd, B:43:0x00df, B:45:0x00e6, B:47:0x00ee, B:48:0x0114, B:50:0x0118, B:53:0x0124, B:54:0x0139, B:55:0x013d, B:16:0x0039, B:30:0x008c, B:17:0x003d, B:27:0x0082, B:22:0x004c, B:24:0x0058, B:36:0x00a4, B:39:0x00b3), top: B:79:0x000b, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0118 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:11:0x0022, B:12:0x0027, B:58:0x015f, B:15:0x0034, B:42:0x00cd, B:43:0x00df, B:45:0x00e6, B:47:0x00ee, B:48:0x0114, B:50:0x0118, B:53:0x0124, B:54:0x0139, B:55:0x013d, B:16:0x0039, B:30:0x008c, B:17:0x003d, B:27:0x0082, B:22:0x004c, B:24:0x0058, B:36:0x00a4, B:39:0x00b3), top: B:79:0x000b, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x0123  */
        /* JADX WARN: Code duplicated, block: B:57:0x015e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:60:0x016d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:64:0x017c A[PHI: r15
          0x017c: PHI (r15v4 kotlinx.coroutines.channels.Channel) = (r15v10 kotlinx.coroutines.channels.Channel), (r15v42 kotlinx.coroutines.channels.Channel) binds: [B:71:0x01bd, B:62:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:81:0x0114 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x00ee A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th;
            Channel channel;
            CoroutineScope coroutineScope;
            Queue<SyncJob> queueConvertJobListToQueue;
            Channel channel2;
            Channel channel3;
            WorkStatusDto workStatusDtoCopy$default;
            SyncJob syncJobPoll;
            HMWeightDevice hMWeightDevice;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            try {
                try {
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = (CoroutineScope) this.L$0;
                            if (!ConstKt.isNeedSync(WeightDeviceSyncCenterImpl.this.syncTime)) {
                                HMLog.w(WeightDeviceSyncCenterImpl.this.tag, "return as time interval less than 60 seconds", new Object[0]);
                                Channel channel4 = WeightDeviceSyncCenterImpl.this.statusChannel;
                                WorkStatusDto workStatusDtoCopy$default2 = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.INTERVAL, null, 0, 13, null);
                                this.label = 1;
                                if (channel4.send(workStatusDtoCopy$default2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                this.label = 2;
                                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Unit unit = Unit.INSTANCE;
                                WeightDeviceSyncCenterImpl.this.currentStatus = false;
                                channel2 = WeightDeviceSyncCenterImpl.this.statusChannel;
                                if (channel2 != null) {
                                    Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel2, null, 1, null));
                                }
                                return unit;
                            }
                            SyncStrategy syncStrategy = WeightDeviceSyncCenterImpl.this.syncStrategy;
                            HMWeightDevice hMWeightDevice2 = WeightDeviceSyncCenterImpl.this.device;
                            if (hMWeightDevice2 == null) {
                                hMWeightDevice2 = null;
                            }
                            queueConvertJobListToQueue = ConstKt.convertJobListToQueue(syncStrategy, hMWeightDevice2);
                            Channel channel5 = WeightDeviceSyncCenterImpl.this.statusChannel;
                            WorkStatusDto workStatusDto = this.$workStatus;
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 3;
                            if (channel5.send(workStatusDto, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            WeightDeviceSyncCenterImpl.this.currentStatus = true;
                            WeightDeviceSyncCenterImpl.this.syncTime = Calendar.getInstance().getTimeInMillis();
                            while (!queueConvertJobListToQueue.isEmpty()) {
                                syncJobPoll = queueConvertJobListToQueue.poll();
                                if (syncJobPoll == null) {
                                    HMLog.w(WeightDeviceSyncCenterImpl.this.tag, "current queue size (" + queueConvertJobListToQueue.size() + "), item is null", new Object[0]);
                                } else {
                                    if (syncJobPoll instanceof BaseWeightJob) {
                                        BaseWeightJob baseWeightJob = (BaseWeightJob) syncJobPoll;
                                        hMWeightDevice = WeightDeviceSyncCenterImpl.this.device;
                                        if (hMWeightDevice == null) {
                                            hMWeightDevice = null;
                                        }
                                        baseWeightJob.setDevice$sync_center_release(hMWeightDevice);
                                        ((BaseWeightJob) syncJobPoll).setScope$sync_center_release(coroutineScope);
                                        ((BaseWeightJob) syncJobPoll).setStateChannel(WeightDeviceSyncCenterImpl.this.statusChannel);
                                    }
                                    syncJobPoll.start();
                                }
                            }
                            channel3 = WeightDeviceSyncCenterImpl.this.statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (channel3.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            WeightDeviceSyncCenterImpl.this.currentStatus = false;
                            this.label = 5;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            WeightDeviceSyncCenterImpl.this.currentStatus = false;
                            channel = WeightDeviceSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            return Unit.INSTANCE;
                        case 1:
                            ResultKt.throwOnFailure(obj);
                            this.label = 2;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Unit unit2 = Unit.INSTANCE;
                            WeightDeviceSyncCenterImpl.this.currentStatus = false;
                            channel2 = WeightDeviceSyncCenterImpl.this.statusChannel;
                            if (channel2 != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel2, null, 1, null));
                            }
                            return unit2;
                        case 2:
                            ResultKt.throwOnFailure(obj);
                            Unit unit3 = Unit.INSTANCE;
                            WeightDeviceSyncCenterImpl.this.currentStatus = false;
                            channel2 = WeightDeviceSyncCenterImpl.this.statusChannel;
                            if (channel2 != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel2, null, 1, null));
                            }
                            return unit3;
                        case 3:
                            queueConvertJobListToQueue = (Queue) this.L$1;
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            WeightDeviceSyncCenterImpl.this.currentStatus = true;
                            WeightDeviceSyncCenterImpl.this.syncTime = Calendar.getInstance().getTimeInMillis();
                            while (!queueConvertJobListToQueue.isEmpty()) {
                                syncJobPoll = queueConvertJobListToQueue.poll();
                                if (syncJobPoll == null) {
                                    HMLog.w(WeightDeviceSyncCenterImpl.this.tag, "current queue size (" + queueConvertJobListToQueue.size() + "), item is null", new Object[0]);
                                } else {
                                    if (syncJobPoll instanceof BaseWeightJob) {
                                        BaseWeightJob baseWeightJob2 = (BaseWeightJob) syncJobPoll;
                                        hMWeightDevice = WeightDeviceSyncCenterImpl.this.device;
                                        if (hMWeightDevice == null) {
                                            hMWeightDevice = null;
                                        }
                                        baseWeightJob2.setDevice$sync_center_release(hMWeightDevice);
                                        ((BaseWeightJob) syncJobPoll).setScope$sync_center_release(coroutineScope);
                                        ((BaseWeightJob) syncJobPoll).setStateChannel(WeightDeviceSyncCenterImpl.this.statusChannel);
                                    }
                                    syncJobPoll.start();
                                }
                            }
                            channel3 = WeightDeviceSyncCenterImpl.this.statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (channel3.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            WeightDeviceSyncCenterImpl.this.currentStatus = false;
                            this.label = 5;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            WeightDeviceSyncCenterImpl.this.currentStatus = false;
                            channel = WeightDeviceSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            return Unit.INSTANCE;
                        case 4:
                            ResultKt.throwOnFailure(obj);
                            WeightDeviceSyncCenterImpl.this.currentStatus = false;
                            this.label = 5;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            WeightDeviceSyncCenterImpl.this.currentStatus = false;
                            channel = WeightDeviceSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            return Unit.INSTANCE;
                        case 5:
                            ResultKt.throwOnFailure(obj);
                            WeightDeviceSyncCenterImpl.this.currentStatus = false;
                            channel = WeightDeviceSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            return Unit.INSTANCE;
                        case 6:
                            th = (Throwable) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            HMLog.e(WeightDeviceSyncCenterImpl.this.tag, th);
                            WeightDeviceSyncCenterImpl.this.currentStatus = false;
                            channel = WeightDeviceSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th2) {
                    Channel channel6 = WeightDeviceSyncCenterImpl.this.statusChannel;
                    WorkStatusDto workStatusDtoCopy$default3 = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.EXCEPTION, null, ConstKt.findErrorCode(th2), 5, null);
                    this.L$0 = th2;
                    this.L$1 = null;
                    this.label = 6;
                    if (channel6.send(workStatusDtoCopy$default3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    th = th2;
                }
            } catch (Throwable th3) {
                WeightDeviceSyncCenterImpl.this.currentStatus = false;
                Channel channel7 = WeightDeviceSyncCenterImpl.this.statusChannel;
                if (channel7 != null) {
                    Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel7, null, 1, null));
                }
                throw th3;
            }
        }
    }

    @Override // com.huami.device.core.sync.api.Cancelable
    public void cancel() {
        CancellationException cancellationException = new CancellationException("cancel by user.");
        JobKt.cancel(getCoroutineContext(), cancellationException);
        Channel<WorkStatusDto> channel = this.statusChannel;
        if (channel == null) {
            return;
        }
        channel.cancel(cancellationException);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    /* JADX INFO: renamed from: isRunning, reason: from getter */
    public boolean getCurrentStatus() {
        return this.currentStatus;
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectDevice
    public void onInject(@NotNull HMBaseDevice device) throws ConfigException {
        if (!(device instanceof HMWeightDevice)) {
            throw new ConfigException(Intrinsics.stringPlus("config error not support this device ", device), null, 2, null);
        }
        this.device = (HMWeightDevice) device;
    }

    public final void resetTime$sync_center_release() {
        this.syncTime = 0L;
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    @NotNull
    public Channel<WorkStatusDto> start() {
        String deviceID;
        this.statusChannel = ChannelKt.Channel$default(0, 1, null);
        HMWeightDevice hMWeightDevice = this.device;
        if (hMWeightDevice == null) {
            hMWeightDevice = null;
        }
        if (!hMWeightDevice.isConnected()) {
            HMLog.w(this.tag, "设备未连接", new Object[0]);
            Channel<WorkStatusDto> channel = this.statusChannel;
            SendChannel.DefaultImpls.close$default(channel, null, 1, null);
            return channel;
        }
        if (this.currentStatus) {
            HMLog.w(this.tag, "正在同步中……", new Object[0]);
            Channel<WorkStatusDto> channel2 = this.statusChannel;
            SendChannel.DefaultImpls.close$default(channel2, null, 1, null);
            return channel2;
        }
        HMWeightDevice hMWeightDevice2 = this.device;
        if (hMWeightDevice2 == null) {
            hMWeightDevice2 = null;
        }
        DeviceInfo deviceInfo = hMWeightDevice2.getDeviceInfo();
        e.f(this, getCoroutineContext(), null, new AnonymousClass3(new WorkStatusDto((deviceInfo == null || (deviceID = deviceInfo.getDeviceID()) == null) ? "" : deviceID, DeviceWorkStatus.RUNNING, null, 0, 8, null), null), 2, null);
        return this.statusChannel;
    }
}
