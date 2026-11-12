package com.huami.feedback.repo;

import com.huami.components.devicestatus.DeviceStatusDelegate;
import com.huami.components.devicestatus.DeviceStatusListener;
import com.huami.feedback.sync.api.DeviceLogSyncError;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.feedback.sync.api.device.DevicesDataSource;
import com.huami.feedback.sync.api.device.FeedbackDevice;
import com.huami.feedback.sync.api.device.SyncLogResult;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\b\b\u0002\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u001b\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001b\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\nJ%\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/huami/feedback/repo/DeviceRepositoryImpl;", "Lcom/huami/feedback/repo/DeviceRepository;", "", "type", "", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/feedback/sync/api/device/DeviceType;", "deviceType", "isSyncing", "(Lcom/huami/feedback/sync/api/device/DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFWUpgrading", "isUsingVoiceAssistant", "isUsingMusicController", "isSupportSyncLog", "", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "getActiveDevices", "connectDevice", "isConnected", "hasNewFirmware", "", "logDirector", "Lcom/huami/feedback/sync/api/DeviceLogSyncError;", "syncDeviceLog", "(Lcom/huami/feedback/sync/api/device/DeviceType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "upgradeFirmware", "Lcom/huami/feedback/sync/api/device/DevicesDataSource;", "Lcom/huami/feedback/sync/api/device/DevicesDataSource;", "devicesDataSource", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Lcom/huami/feedback/sync/api/device/DevicesDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceRepositoryImpl implements DeviceRepository {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DevicesDataSource devicesDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.repo.DeviceRepositoryImpl$hasNewFirmware$2", f = "DeviceRepositoryImpl.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ DeviceType c;

        /* JADX INFO: renamed from: com.huami.feedback.repo.DeviceRepositoryImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.feedback.repo.DeviceRepositoryImpl$hasNewFirmware$2$1", f = "DeviceRepositoryImpl.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0386a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ DeviceRepositoryImpl b;
            public final /* synthetic */ DeviceType c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0386a(DeviceRepositoryImpl deviceRepositoryImpl, DeviceType deviceType, Continuation<? super C0386a> continuation) {
                super(2, continuation);
                this.b = deviceRepositoryImpl;
                this.c = deviceType;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0386a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0386a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DevicesDataSource devicesDataSource = this.b.devicesDataSource;
                    DeviceType deviceType = this.c;
                    this.a = 1;
                    obj = devicesDataSource.hasFwUpgrade(deviceType, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeviceType deviceType, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = deviceType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceRepositoryImpl.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcher = DeviceRepositoryImpl.this.defaultDispatcher;
                C0386a c0386a = new C0386a(DeviceRepositoryImpl.this, this.c, null);
                this.a = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, c0386a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.repo.DeviceRepositoryImpl", f = "DeviceRepositoryImpl.kt", i = {}, l = {69}, m = "syncDeviceLog", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return DeviceRepositoryImpl.this.syncDeviceLog(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/feedback/sync/api/device/SyncLogResult;", "<anonymous parameter 0>", "value", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.repo.DeviceRepositoryImpl$syncDeviceLog$2", f = "DeviceRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<SyncLogResult, SyncLogResult, Continuation<? super SyncLogResult>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull SyncLogResult syncLogResult, @NotNull SyncLogResult syncLogResult2, @Nullable Continuation<? super SyncLogResult> continuation) {
            c cVar = new c(continuation);
            cVar.b = syncLogResult2;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (SyncLogResult) this.b;
        }
    }

    public DeviceRepositoryImpl(@NotNull DevicesDataSource devicesDataSource, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.devicesDataSource = devicesDataSource;
        this.defaultDispatcher = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(final int i, Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        DeviceStatusDelegate.getInstance().registerDeviceStatusListener(new DeviceStatusListener() { // from class: com.huami.feedback.repo.DeviceRepositoryImpl$connectDeviceInternal$2$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(int i) {
                    super(0);
                    this.a = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("Device connected event. Type:", Integer.valueOf(this.a));
                }
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onConnected(int deviceType) {
                HMLog.info("feedback", new a(deviceType));
                if (i == deviceType) {
                    cancellableContinuationImpl.resume(Boolean.TRUE, null);
                    DeviceStatusDelegate.getInstance().unregisterDeviceStatusListener(this);
                }
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onConnecting(int deviceType) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onConnectingTimeout(int deviceType) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onDisconnected(int deviceType) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStartSyncAGPS(int deviceType) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStartSyncData(int deviceType) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStopSyncAGPS(int deviceType, boolean hasError) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStopSyncData(int deviceType, boolean hasError) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onSynchronizingAGPS(int deviceType, int percent) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onSynchronizingData(int deviceType, int percent) {
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.huami.feedback.repo.DeviceRepository
    @Nullable
    public Object connectDevice(int i, @NotNull Continuation<? super Boolean> continuation) {
        return a(i, continuation);
    }

    @Override // com.huami.feedback.repo.DeviceRepository
    @NotNull
    public List<FeedbackDevice> getActiveDevices() {
        return this.devicesDataSource.getActiveDevices();
    }

    @Override // com.huami.feedback.repo.DeviceRepository
    @Nullable
    public Object hasNewFirmware(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation) {
        return CoroutineScopeKt.coroutineScope(new a(deviceType, null), continuation);
    }

    @Override // com.huami.feedback.repo.DeviceRepository
    public boolean isConnected(@NotNull DeviceType deviceType) {
        return this.devicesDataSource.isConnected(deviceType);
    }

    @Override // com.huami.feedback.repo.DeviceRepository
    @Nullable
    public Object isFWUpgrading(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation) {
        return this.devicesDataSource.isFwUpgrading(deviceType, continuation);
    }

    @Override // com.huami.feedback.repo.DeviceRepository
    public boolean isSupportSyncLog(@NotNull DeviceType deviceType) {
        return this.devicesDataSource.isSupportSyncLog(deviceType);
    }

    @Override // com.huami.feedback.repo.DeviceRepository
    @Nullable
    public Object isSyncing(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation) {
        return this.devicesDataSource.isSyncing(deviceType, continuation);
    }

    @Override // com.huami.feedback.repo.DeviceRepository
    @Nullable
    public Object isUsingMusicController(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation) {
        return this.devicesDataSource.isMusicAlive(deviceType, continuation);
    }

    @Override // com.huami.feedback.repo.DeviceRepository
    @Nullable
    public Object isUsingVoiceAssistant(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation) {
        return this.devicesDataSource.isVoiceAssistantAlive(deviceType, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.feedback.repo.DeviceRepository
    @Nullable
    public Object syncDeviceLog(@NotNull DeviceType deviceType, @NotNull String str, @NotNull Continuation<? super DeviceLogSyncError> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objReduce = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objReduce);
            Flow<SyncLogResult> flowSyncLog = this.devicesDataSource.syncLog(deviceType, str);
            c cVar = new c(null);
            bVar.c = 1;
            objReduce = FlowKt.reduce(flowSyncLog, cVar, bVar);
            if (objReduce == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objReduce);
        }
        return ((SyncLogResult) objReduce).getError();
    }

    @Override // com.huami.feedback.repo.DeviceRepository
    public void upgradeFirmware() {
        this.devicesDataSource.startFwUpgrade();
    }

    public /* synthetic */ DeviceRepositoryImpl(DevicesDataSource devicesDataSource, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(devicesDataSource, (i & 2) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }
}
