package com.huami.device.core.sync.impl.sync.headset;

import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.Cancelable;
import com.huami.device.core.sync.api.Interruptable;
import com.huami.device.core.sync.api.SyncApi;
import com.huami.device.core.sync.api.SyncStrategy;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.ConfigException;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.sync.ConstKt;
import com.huami.device.core.sync.impl.sync.inject.InjectDevice;
import com.huami.tools.log.HMLog;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016R\u0016\u0010\u0006\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u00020\u001a8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/device/core/sync/impl/sync/headset/HMHeadSetSyncImpl;", "Lcom/huami/device/core/sync/api/SyncApi;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectDevice;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/device/core/sync/api/Cancelable;", "", "isRunning", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onInject", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "start", g.g, "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/xiaomi/hm/health/bt/device/MozartDevice;", "headSetDevice", "Lcom/xiaomi/hm/health/bt/device/MozartDevice;", "statusChannel", "Lkotlinx/coroutines/channels/Channel;", "Ljava/util/Queue;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "jobsQueue", "Ljava/util/Queue;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "<init>", "()V", "Companion", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class HMHeadSetSyncImpl implements SyncApi, InjectDevice, CoroutineScope, Cancelable {

    @NotNull
    private static final String tag = "SyncCenter-SyncApi";

    @Nullable
    private MozartDevice headSetDevice;

    @Nullable
    private Queue<SyncJob> jobsQueue;

    @Nullable
    private Channel<WorkStatusDto> statusChannel;

    @NotNull
    private final AtomicBoolean isRunning = new AtomicBoolean(false);

    @NotNull
    private final CoroutineContext coroutineContext = ConstKt.createSyncContext();

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.sync.headset.HMHeadSetSyncImpl$start$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.sync.headset.HMHeadSetSyncImpl$start$1", f = "HMHeadSetSyncImpl.kt", i = {0}, l = {69, 72, 74, 77}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MozartDevice $d;
        public final /* synthetic */ SyncStrategy $strategy;
        public final /* synthetic */ WorkStatusDto $workStatus;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkStatusDto workStatusDto, SyncStrategy syncStrategy, MozartDevice mozartDevice, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$workStatus = workStatusDto;
            this.$strategy = syncStrategy;
            this.$d = mozartDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = HMHeadSetSyncImpl.this.new AnonymousClass1(this.$workStatus, this.$strategy, this.$d, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:40:0x00a5 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #0 {all -> 0x002d, blocks: (B:14:0x0028, B:19:0x0034, B:37:0x009c, B:40:0x00a5, B:22:0x003c, B:31:0x0073, B:34:0x0089, B:25:0x0047, B:28:0x0059), top: B:62:0x000e, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00bd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x00d0 A[PHI: r0
          0x00d0: PHI (r0v6 kotlinx.coroutines.channels.Channel) = (r0v11 kotlinx.coroutines.channels.Channel), (r0v22 kotlinx.coroutines.channels.Channel) binds: [B:54:0x0110, B:44:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Channel channel;
            CoroutineScope coroutineScope;
            Channel channel2;
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
                            channel2 = HMHeadSetSyncImpl.this.statusChannel;
                            if (channel2 == null) {
                                workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                                this.L$0 = null;
                                this.label = 3;
                                if (channel2.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                HMHeadSetSyncImpl.this.isRunning.set(false);
                                channel = HMHeadSetSyncImpl.this.statusChannel;
                                if (channel != null) {
                                    Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                                }
                                return Unit.INSTANCE;
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        HMHeadSetSyncImpl.this.isRunning.set(false);
                        channel = HMHeadSetSyncImpl.this.statusChannel;
                        if (channel != null) {
                            Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    HMHeadSetSyncImpl.this.isRunning.set(true);
                    Channel channel3 = HMHeadSetSyncImpl.this.statusChannel;
                    if (channel3 != null) {
                        WorkStatusDto workStatusDtoCopy$default2 = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.NORMAL, null, 0, 13, null);
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        if (channel3.send(workStatusDtoCopy$default2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    HMHeadSetSyncImpl.this.jobsQueue = ConstKt.convertJobListToQueue(this.$strategy, this.$d);
                    Queue queue = HMHeadSetSyncImpl.this.jobsQueue;
                    if (queue != null) {
                        HMHeadSetSyncImpl hMHeadSetSyncImpl = HMHeadSetSyncImpl.this;
                        MozartDevice mozartDevice = this.$d;
                        Channel channel4 = hMHeadSetSyncImpl.statusChannel;
                        this.L$0 = queue;
                        this.label = 2;
                        if (ConstKt.runJobQueue(queue, channel4, mozartDevice, coroutineScope, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    channel2 = HMHeadSetSyncImpl.this.statusChannel;
                    if (channel2 == null) {
                        workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                        this.L$0 = null;
                        this.label = 3;
                        if (channel2.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    HMHeadSetSyncImpl.this.isRunning.set(false);
                    channel = HMHeadSetSyncImpl.this.statusChannel;
                    if (channel != null) {
                        Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                    }
                } catch (Throwable th) {
                    HMLog.e(HMHeadSetSyncImpl.tag, th);
                    Channel channel5 = HMHeadSetSyncImpl.this.statusChannel;
                    if (channel5 != null) {
                        WorkStatusDto workStatusDtoCopy$default3 = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.EXCEPTION, null, ConstKt.findErrorCode(th), 5, null);
                        this.L$0 = null;
                        this.label = 4;
                        if (channel5.send(workStatusDtoCopy$default3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                HMHeadSetSyncImpl.this.isRunning.set(false);
                Channel channel6 = HMHeadSetSyncImpl.this.statusChannel;
                if (channel6 != null) {
                    Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel6, null, 1, null));
                }
                throw th2;
            }
        }
    }

    @Override // com.huami.device.core.sync.api.Cancelable
    public void cancel() {
        this.isRunning.getAndSet(false);
        Queue<SyncJob> queue = this.jobsQueue;
        if (queue != null) {
            for (SyncJob syncJob : queue) {
                if (syncJob instanceof Cancelable) {
                    ((Cancelable) syncJob).cancel();
                }
                if (syncJob instanceof Interruptable) {
                    ((Interruptable) syncJob).interrupt();
                }
            }
        }
        CancellationException cancellationException = new CancellationException("use call cancel this sync task");
        Channel<WorkStatusDto> channel = this.statusChannel;
        if (channel != null) {
            channel.cancel(cancellationException);
        }
        JobKt.cancel(getCoroutineContext(), cancellationException);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    /* JADX INFO: renamed from: isRunning */
    public boolean getCurrentStatus() {
        return this.isRunning.get();
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectDevice
    public void onInject(@NotNull HMBaseDevice device) throws ConfigException {
        if (!(device instanceof MozartDevice)) {
            throw new ConfigException("配置错误", null, 2, null);
        }
        this.headSetDevice = (MozartDevice) device;
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    @NotNull
    public Channel<WorkStatusDto> start() throws ConfigException {
        String deviceID;
        this.statusChannel = ChannelKt.Channel$default(0, 1, null);
        MozartDevice mozartDevice = this.headSetDevice;
        if (mozartDevice == null) {
            throw new ConfigException("error inject device target", null, 2, null);
        }
        SyncStrategy syncStrategy = SyncCenterFactory.INSTANCE.getSyncStrategy();
        if (syncStrategy == null) {
            throw new ConfigException("error inject sync strategy", null, 2, null);
        }
        DeviceInfo deviceInfo = mozartDevice.getDeviceInfo();
        e.f(this, getCoroutineContext(), null, new AnonymousClass1(new WorkStatusDto((deviceInfo == null || (deviceID = deviceInfo.getDeviceID()) == null) ? "" : deviceID, DeviceWorkStatus.RUNNING, null, 0, 8, null), syncStrategy, mozartDevice, null), 2, null);
        return this.statusChannel;
    }
}
