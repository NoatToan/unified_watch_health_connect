package com.huami.device.core.sync.impl.sync.shose;

import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.Cancelable;
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
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001c\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/device/core/sync/impl/sync/shose/HMShoesSyncCenterImpl;", "Lcom/huami/device/core/sync/api/SyncApi;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectDevice;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/device/core/sync/api/Cancelable;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onInject", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "start", "", "isRunning", g.g, "", "tag", "Ljava/lang/String;", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Z", "statusChannel", "Lkotlinx/coroutines/channels/Channel;", "workStatus", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class HMShoesSyncCenterImpl implements SyncApi, InjectDevice, CoroutineScope, Cancelable {
    private HMBaseBleDevice device;
    private volatile boolean isRunning;

    @Nullable
    private Channel<WorkStatusDto> statusChannel;

    @NotNull
    private final String tag = "SyncCenter-HMShoseSyncCenterImpl";

    @NotNull
    private final CoroutineContext coroutineContext = ConstKt.createSyncContext();

    @NotNull
    private final WorkStatusDto workStatus = new WorkStatusDto("", DeviceWorkStatus.RUNNING, null, 0, 8, null);

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.sync.shose.HMShoesSyncCenterImpl$start$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.sync.shose.HMShoesSyncCenterImpl$start$1", f = "HMShoesSyncCenterImpl.kt", i = {0}, l = {64, 73, 84, 76, 84, 84}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = HMShoesSyncCenterImpl.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0074  */
        /* JADX WARN: Code duplicated, block: B:30:0x0083 A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x0030, B:18:0x003f, B:24:0x0061, B:27:0x0075, B:28:0x007d, B:30:0x0083, B:33:0x0092, B:34:0x00a5, B:21:0x004a), top: B:62:0x000d, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x0091  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00d2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[PHI: r0
          0x00e1: PHI (r0v8 kotlinx.coroutines.channels.Channel) = (r0v12 kotlinx.coroutines.channels.Channel), (r0v26 kotlinx.coroutines.channels.Channel) binds: [B:51:0x0130, B:41:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:65:0x0092 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Channel channel;
            CoroutineScope coroutineScope;
            HMBaseBleDevice hMBaseBleDevice;
            Channel channel2;
            WorkStatusDto workStatusDtoCopy$default;
            HMBaseBleDevice hMBaseBleDevice2;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            try {
                try {
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = (CoroutineScope) this.L$0;
                            Channel channel3 = HMShoesSyncCenterImpl.this.statusChannel;
                            WorkStatusDto workStatusDto = HMShoesSyncCenterImpl.this.workStatus;
                            this.L$0 = coroutineScope;
                            this.label = 1;
                            if (channel3.send(workStatusDto, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HMShoesSyncCenterImpl.this.isRunning = true;
                            SyncStrategy syncStrategy = SyncCenterFactory.INSTANCE.getSyncStrategy();
                            hMBaseBleDevice = HMShoesSyncCenterImpl.this.device;
                            if (hMBaseBleDevice == null) {
                                hMBaseBleDevice = null;
                            }
                            for (SyncJob syncJob : syncStrategy.loadSyncJobs(hMBaseBleDevice)) {
                                hMBaseBleDevice2 = HMShoesSyncCenterImpl.this.device;
                                if (hMBaseBleDevice2 == null) {
                                    hMBaseBleDevice2 = null;
                                }
                                ConstKt.injectDevice(syncJob, hMBaseBleDevice2);
                                ConstKt.injectScope(syncJob, coroutineScope);
                                ConstKt.injectStatusChannel(syncJob, HMShoesSyncCenterImpl.this.statusChannel);
                                syncJob.start();
                            }
                            channel2 = HMShoesSyncCenterImpl.this.statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(HMShoesSyncCenterImpl.this.workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.L$0 = null;
                            this.label = 2;
                            if (channel2.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.label = 3;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HMShoesSyncCenterImpl.this.isRunning = false;
                            channel = HMShoesSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            return Unit.INSTANCE;
                        case 1:
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            HMShoesSyncCenterImpl.this.isRunning = true;
                            SyncStrategy syncStrategy2 = SyncCenterFactory.INSTANCE.getSyncStrategy();
                            hMBaseBleDevice = HMShoesSyncCenterImpl.this.device;
                            if (hMBaseBleDevice == null) {
                                hMBaseBleDevice = null;
                            }
                            while (r8.hasNext()) {
                                hMBaseBleDevice2 = HMShoesSyncCenterImpl.this.device;
                                if (hMBaseBleDevice2 == null) {
                                    hMBaseBleDevice2 = null;
                                }
                                ConstKt.injectDevice(syncJob, hMBaseBleDevice2);
                                ConstKt.injectScope(syncJob, coroutineScope);
                                ConstKt.injectStatusChannel(syncJob, HMShoesSyncCenterImpl.this.statusChannel);
                                syncJob.start();
                            }
                            channel2 = HMShoesSyncCenterImpl.this.statusChannel;
                            workStatusDtoCopy$default = WorkStatusDto.copy$default(HMShoesSyncCenterImpl.this.workStatus, null, DeviceWorkStatus.FINISHED, null, 0, 13, null);
                            this.L$0 = null;
                            this.label = 2;
                            if (channel2.send(workStatusDtoCopy$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.label = 3;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HMShoesSyncCenterImpl.this.isRunning = false;
                            channel = HMShoesSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            return Unit.INSTANCE;
                        case 2:
                            ResultKt.throwOnFailure(obj);
                            this.label = 3;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HMShoesSyncCenterImpl.this.isRunning = false;
                            channel = HMShoesSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            return Unit.INSTANCE;
                        case 3:
                            ResultKt.throwOnFailure(obj);
                            HMShoesSyncCenterImpl.this.isRunning = false;
                            channel = HMShoesSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            return Unit.INSTANCE;
                        case 4:
                            ResultKt.throwOnFailure(obj);
                            this.label = 5;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HMShoesSyncCenterImpl.this.isRunning = false;
                            channel = HMShoesSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            return Unit.INSTANCE;
                        case 5:
                            ResultKt.throwOnFailure(obj);
                            HMShoesSyncCenterImpl.this.isRunning = false;
                            channel = HMShoesSyncCenterImpl.this.statusChannel;
                            if (channel != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel, null, 1, null));
                            }
                            return Unit.INSTANCE;
                        case 6:
                            th = (Throwable) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            HMShoesSyncCenterImpl.this.isRunning = false;
                            Channel channel4 = HMShoesSyncCenterImpl.this.statusChannel;
                            if (channel4 != null) {
                                Boxing.boxBoolean(SendChannel.DefaultImpls.close$default(channel4, null, 1, null));
                            }
                            throw th;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Exception e) {
                    HMLog.warn(HMShoesSyncCenterImpl.this.tag, e, new Function0<String>() { // from class: com.huami.device.core.sync.impl.sync.shose.HMShoesSyncCenterImpl.start.1.1
                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "EXCEPTION of sync center";
                        }
                    });
                    Channel channel5 = HMShoesSyncCenterImpl.this.statusChannel;
                    WorkStatusDto workStatusDtoCopy$default2 = WorkStatusDto.copy$default(HMShoesSyncCenterImpl.this.workStatus, null, DeviceWorkStatus.EXCEPTION, null, ConstKt.findErrorCode(e), 5, null);
                    this.L$0 = null;
                    this.label = 4;
                    if (channel5.send(workStatusDtoCopy$default2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (Throwable th) {
                th = th;
                this.L$0 = th;
                this.label = 6;
                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
    }

    @Override // com.huami.device.core.sync.api.Cancelable
    public void cancel() {
        this.isRunning = false;
        CancellationException cancellationException = new CancellationException("cancel by user");
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
        return this.isRunning;
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectDevice
    public void onInject(@NotNull HMBaseDevice device) throws ConfigException {
        if (!(device instanceof HMBaseBleDevice)) {
            throw new ConfigException("配置跑鞋运动设备错误", null, 2, null);
        }
        this.device = (HMBaseBleDevice) device;
    }

    @Override // com.huami.device.core.sync.api.SyncApi
    @NotNull
    public Channel<WorkStatusDto> start() {
        this.statusChannel = ConstKt.createStatusChannel();
        e.f(this, getCoroutineContext(), null, new AnonymousClass1(null), 2, null);
        return this.statusChannel;
    }
}
