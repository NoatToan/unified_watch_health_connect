package com.huami.device.core.sync.impl.sync.mili;

import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.Cancelable;
import com.huami.device.core.sync.api.SyncApi;
import com.huami.device.core.sync.api.WorkerExecutor;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.sync.ConstKt;
import com.huami.device.core.sync.impl.sync.inject.InjectDevice;
import com.huami.tools.log.HMLog;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001c\u0010\u0019\u001a\u00020\u00188\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/device/core/sync/impl/sync/mili/MiliSyncCenterImpl;", "Lcom/huami/device/core/sync/api/SyncApi;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectDevice;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/device/core/sync/api/Cancelable;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onInject", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "start", "", "isRunning", g.g, "", "tag", "Ljava/lang/String;", "Z", "", "syncTime", "J", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "statusChannel", "Lkotlinx/coroutines/channels/Channel;", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class MiliSyncCenterImpl implements SyncApi, InjectDevice, CoroutineScope, Cancelable {

    @Nullable
    private HMMiLiDevice device;
    private volatile boolean isRunning;

    @Nullable
    private Channel<WorkStatusDto> statusChannel;
    private long syncTime;

    @NotNull
    private final String tag = "SyncCenter-SyncApi";

    @NotNull
    private final CoroutineContext coroutineContext = ConstKt.createSyncContext();

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.sync.mili.MiliSyncCenterImpl$start$4, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.sync.mili.MiliSyncCenterImpl$start$4", f = "MiliSyncCenterImpl.kt", i = {2, 2, 3, 3, 4, 4}, l = {84, 85, 93, 95, 96, 97, 98, 101}, m = "invokeSuspend", n = {"$this$launch", "jobQueue", "$this$launch", "jobQueue", "$this$launch", "jobQueue"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ HMMiLiDevice $d;
        public final /* synthetic */ WorkStatusDto $workStatus;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(WorkStatusDto workStatusDto, HMMiLiDevice hMMiLiDevice, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$workStatus = workStatusDto;
            this.$d = hMMiLiDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = MiliSyncCenterImpl.this.new AnonymousClass4(this.$workStatus, this.$d, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:50:0x011f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:53:0x0135 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:56:0x014b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x0169 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:63:0x0178  */
        /* JADX WARN: Code duplicated, block: B:67:0x0188 A[PHI: r14
          0x0188: PHI (r14v6 com.huami.device.core.sync.api.WorkerExecutor) = (r14v11 com.huami.device.core.sync.api.WorkerExecutor), (r14v46 com.huami.device.core.sync.api.WorkerExecutor) binds: [B:76:0x01d7, B:65:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WorkerExecutor workerExecutorCreateWorkerExecutor;
            CoroutineScope coroutineScope;
            Queue<SyncJob> queueConvertJobListToQueue;
            Channel channel;
            WorkerExecutor workerExecutorCreateWorkerExecutor2;
            Channel channel2;
            WorkStatusDto workStatusDto;
            Channel channel3;
            HMMiLiDevice hMMiLiDevice;
            Channel channel4;
            WorkStatusDto workStatusDtoCopy$default;
            Channel channel5;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            try {
                try {
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = (CoroutineScope) this.L$0;
                            if (!ConstKt.isNeedSync(MiliSyncCenterImpl.this.syncTime)) {
                                HMLog.w(MiliSyncCenterImpl.this.tag, "return as time interval less than 60 seconds", new Object[0]);
                                Channel channel6 = MiliSyncCenterImpl.this.statusChannel;
                                WorkStatusDto workStatusDtoCopy$default2 = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.INTERVAL, null, 0, 13, null);
                                this.label = 1;
                                if (channel6.send(workStatusDtoCopy$default2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                this.label = 2;
                                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                MiliSyncCenterImpl.this.isRunning = false;
                                Unit unit = Unit.INSTANCE;
                                MiliSyncCenterImpl.this.isRunning = false;
                                channel = MiliSyncCenterImpl.this.statusChannel;
                                if (channel != null) {
                                    Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                                }
                                workerExecutorCreateWorkerExecutor2 = SyncCenterFactory.INSTANCE.createWorkerExecutor();
                                if (workerExecutorCreateWorkerExecutor2 != null) {
                                    workerExecutorCreateWorkerExecutor2.start(this.$d);
                                }
                                return unit;
                            }
                            MiliSyncCenterImpl.this.isRunning = true;
                            MiliSyncCenterImpl.this.syncTime = Calendar.getInstance().getTimeInMillis();
                            queueConvertJobListToQueue = ConstKt.convertJobListToQueue(SyncCenterFactory.INSTANCE.getSyncStrategy(), this.$d);
                            ConstKt.printDebugInfo(queueConvertJobListToQueue);
                            Channel channel7 = MiliSyncCenterImpl.this.statusChannel;
                            WorkStatusDto workStatusDtoCopy$default3 = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.NORMAL, null, 0, 13, null);
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 3;
                            if (channel7.send(workStatusDtoCopy$default3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 4;
                            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel2 = MiliSyncCenterImpl.this.statusChannel;
                            workStatusDto = this.$workStatus;
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 5;
                            if (channel2.send(workStatusDto, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel3 = MiliSyncCenterImpl.this.statusChannel;
                            hMMiLiDevice = this.$d;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 6;
                            if (ConstKt.runJobQueue(queueConvertJobListToQueue, channel3, hMMiLiDevice, coroutineScope, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel4 = MiliSyncCenterImpl.this.statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.label = 7;
                            if (channel4.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            MiliSyncCenterImpl.this.isRunning = false;
                            channel5 = MiliSyncCenterImpl.this.statusChannel;
                            if (channel5 != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel5, null, 1, null));
                            }
                            workerExecutorCreateWorkerExecutor = SyncCenterFactory.INSTANCE.createWorkerExecutor();
                            if (workerExecutorCreateWorkerExecutor != null) {
                                workerExecutorCreateWorkerExecutor.start(this.$d);
                            }
                            return Unit.INSTANCE;
                        case 1:
                            ResultKt.throwOnFailure(obj);
                            this.label = 2;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            MiliSyncCenterImpl.this.isRunning = false;
                            Unit unit2 = Unit.INSTANCE;
                            MiliSyncCenterImpl.this.isRunning = false;
                            channel = MiliSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            workerExecutorCreateWorkerExecutor2 = SyncCenterFactory.INSTANCE.createWorkerExecutor();
                            if (workerExecutorCreateWorkerExecutor2 != null) {
                                workerExecutorCreateWorkerExecutor2.start(this.$d);
                            }
                            return unit2;
                        case 2:
                            ResultKt.throwOnFailure(obj);
                            MiliSyncCenterImpl.this.isRunning = false;
                            Unit unit3 = Unit.INSTANCE;
                            MiliSyncCenterImpl.this.isRunning = false;
                            channel = MiliSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            workerExecutorCreateWorkerExecutor2 = SyncCenterFactory.INSTANCE.createWorkerExecutor();
                            if (workerExecutorCreateWorkerExecutor2 != null) {
                                workerExecutorCreateWorkerExecutor2.start(this.$d);
                            }
                            return unit3;
                        case 3:
                            queueConvertJobListToQueue = (Queue) this.L$1;
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 4;
                            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel2 = MiliSyncCenterImpl.this.statusChannel;
                            workStatusDto = this.$workStatus;
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 5;
                            if (channel2.send(workStatusDto, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel3 = MiliSyncCenterImpl.this.statusChannel;
                            hMMiLiDevice = this.$d;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 6;
                            if (ConstKt.runJobQueue(queueConvertJobListToQueue, channel3, hMMiLiDevice, coroutineScope, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel4 = MiliSyncCenterImpl.this.statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.label = 7;
                            if (channel4.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            MiliSyncCenterImpl.this.isRunning = false;
                            channel5 = MiliSyncCenterImpl.this.statusChannel;
                            if (channel5 != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel5, null, 1, null));
                            }
                            workerExecutorCreateWorkerExecutor = SyncCenterFactory.INSTANCE.createWorkerExecutor();
                            if (workerExecutorCreateWorkerExecutor != null) {
                                workerExecutorCreateWorkerExecutor.start(this.$d);
                            }
                            return Unit.INSTANCE;
                        case 4:
                            queueConvertJobListToQueue = (Queue) this.L$1;
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            channel2 = MiliSyncCenterImpl.this.statusChannel;
                            workStatusDto = this.$workStatus;
                            this.L$0 = coroutineScope;
                            this.L$1 = queueConvertJobListToQueue;
                            this.label = 5;
                            if (channel2.send(workStatusDto, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel3 = MiliSyncCenterImpl.this.statusChannel;
                            hMMiLiDevice = this.$d;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 6;
                            if (ConstKt.runJobQueue(queueConvertJobListToQueue, channel3, hMMiLiDevice, coroutineScope, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel4 = MiliSyncCenterImpl.this.statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.label = 7;
                            if (channel4.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            MiliSyncCenterImpl.this.isRunning = false;
                            channel5 = MiliSyncCenterImpl.this.statusChannel;
                            if (channel5 != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel5, null, 1, null));
                            }
                            workerExecutorCreateWorkerExecutor = SyncCenterFactory.INSTANCE.createWorkerExecutor();
                            if (workerExecutorCreateWorkerExecutor != null) {
                                workerExecutorCreateWorkerExecutor.start(this.$d);
                            }
                            return Unit.INSTANCE;
                        case 5:
                            queueConvertJobListToQueue = (Queue) this.L$1;
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            channel3 = MiliSyncCenterImpl.this.statusChannel;
                            hMMiLiDevice = this.$d;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 6;
                            if (ConstKt.runJobQueue(queueConvertJobListToQueue, channel3, hMMiLiDevice, coroutineScope, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel4 = MiliSyncCenterImpl.this.statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.label = 7;
                            if (channel4.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            MiliSyncCenterImpl.this.isRunning = false;
                            channel5 = MiliSyncCenterImpl.this.statusChannel;
                            if (channel5 != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel5, null, 1, null));
                            }
                            workerExecutorCreateWorkerExecutor = SyncCenterFactory.INSTANCE.createWorkerExecutor();
                            if (workerExecutorCreateWorkerExecutor != null) {
                                workerExecutorCreateWorkerExecutor.start(this.$d);
                            }
                            return Unit.INSTANCE;
                        case 6:
                            ResultKt.throwOnFailure(obj);
                            channel4 = MiliSyncCenterImpl.this.statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.label = 7;
                            if (channel4.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            MiliSyncCenterImpl.this.isRunning = false;
                            channel5 = MiliSyncCenterImpl.this.statusChannel;
                            if (channel5 != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel5, null, 1, null));
                            }
                            workerExecutorCreateWorkerExecutor = SyncCenterFactory.INSTANCE.createWorkerExecutor();
                            if (workerExecutorCreateWorkerExecutor != null) {
                                workerExecutorCreateWorkerExecutor.start(this.$d);
                            }
                            return Unit.INSTANCE;
                        case 7:
                            ResultKt.throwOnFailure(obj);
                            MiliSyncCenterImpl.this.isRunning = false;
                            channel5 = MiliSyncCenterImpl.this.statusChannel;
                            if (channel5 != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel5, null, 1, null));
                            }
                            workerExecutorCreateWorkerExecutor = SyncCenterFactory.INSTANCE.createWorkerExecutor();
                            if (workerExecutorCreateWorkerExecutor != null) {
                                workerExecutorCreateWorkerExecutor.start(this.$d);
                            }
                            return Unit.INSTANCE;
                        case 8:
                            ResultKt.throwOnFailure(obj);
                            MiliSyncCenterImpl.this.isRunning = false;
                            Channel channel8 = MiliSyncCenterImpl.this.statusChannel;
                            if (channel8 != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel8, null, 1, null));
                            }
                            workerExecutorCreateWorkerExecutor = SyncCenterFactory.INSTANCE.createWorkerExecutor();
                            if (workerExecutorCreateWorkerExecutor != null) {
                                workerExecutorCreateWorkerExecutor.start(this.$d);
                            }
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th) {
                    HMLog.e(MiliSyncCenterImpl.this.tag, th);
                    Channel channel9 = MiliSyncCenterImpl.this.statusChannel;
                    WorkStatusDto workStatusDtoCopy$default4 = WorkStatusDto.copy$default(this.$workStatus, null, DeviceWorkStatus.EXCEPTION, null, ConstKt.findErrorCode(th), 5, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 8;
                    if (channel9.send(workStatusDtoCopy$default4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (Throwable th2) {
                MiliSyncCenterImpl.this.isRunning = false;
                Channel channel10 = MiliSyncCenterImpl.this.statusChannel;
                if (channel10 != null) {
                    Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel10, null, 1, null));
                }
                WorkerExecutor workerExecutorCreateWorkerExecutor3 = SyncCenterFactory.INSTANCE.createWorkerExecutor();
                if (workerExecutorCreateWorkerExecutor3 != null) {
                    workerExecutorCreateWorkerExecutor3.start(this.$d);
                }
                throw th2;
            }
        }
    }

    @Override // com.huami.device.core.sync.api.Cancelable
    public void cancel() {
        this.isRunning = false;
        CancellationException cancellationException = new CancellationException("user call cancel.");
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
    public boolean getIsRunning() {
        return this.isRunning;
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectDevice
    public void onInject(@NotNull HMBaseDevice device) {
        if (device instanceof HMMiLiDevice) {
            this.device = (HMMiLiDevice) device;
        } else {
            this.device = null;
        }
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    @NotNull
    public Channel<WorkStatusDto> start() {
        String deviceID;
        this.statusChannel = ChannelKt.Channel$default(0, 1, null);
        if (this.device == null) {
            HMLog.w(this.tag, "No device MiliSyncCenterImpl", new Object[0]);
            SendChannel.DefaultImpls.close$default(this.statusChannel, null, 1, null);
        }
        HMMiLiDevice hMMiLiDevice = this.device;
        if (!hMMiLiDevice.isConnected()) {
            HMLog.w(this.tag, "设备未连接", new Object[0]);
            Channel<WorkStatusDto> channel = this.statusChannel;
            SendChannel.DefaultImpls.close$default(channel, null, 1, null);
            return channel;
        }
        if (!this.isRunning) {
            DeviceInfo deviceInfo = hMMiLiDevice.getDeviceInfo();
            e.f(this, getCoroutineContext(), null, new AnonymousClass4(new WorkStatusDto((deviceInfo == null || (deviceID = deviceInfo.getDeviceID()) == null) ? "" : deviceID, DeviceWorkStatus.RUNNING, null, 0, 8, null), hMMiLiDevice, null), 2, null);
            return this.statusChannel;
        }
        HMLog.w(this.tag, "正在同步中……", new Object[0]);
        Channel<WorkStatusDto> channel2 = this.statusChannel;
        SendChannel.DefaultImpls.close$default(channel2, null, 1, null);
        return channel2;
    }
}
