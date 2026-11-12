package com.huami.feedback.domain;

import com.huami.feedback.repo.DeviceRepository;
import com.huami.feedback.sync.api.device.DeviceType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/feedback/domain/CheckSyncLogDeviceEnvUseCase;", "", "Lcom/huami/feedback/sync/api/device/DeviceType;", "deviceType", "Lcom/huami/feedback/domain/SyncLogDeviceEnvState;", "invoke", "(Lcom/huami/feedback/sync/api/device/DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/feedback/repo/DeviceRepository;", "a", "Lcom/huami/feedback/repo/DeviceRepository;", "deviceRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Lcom/huami/feedback/repo/DeviceRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class CheckSyncLogDeviceEnvUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceRepository deviceRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/feedback/domain/SyncLogDeviceEnvState;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.domain.CheckSyncLogDeviceEnvUseCase$invoke$2", f = "CheckSyncLogDeviceEnvUseCase.kt", i = {}, l = {25, 26, 27, 28}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SyncLogDeviceEnvState>, Object> {
        public int a;
        public final /* synthetic */ DeviceType c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeviceType deviceType, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = deviceType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CheckSyncLogDeviceEnvUseCase.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super SyncLogDeviceEnvState> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0065  */
        /* JADX WARN: Code duplicated, block: B:26:0x0068  */
        /* JADX WARN: Code duplicated, block: B:28:0x0078 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x0081  */
        /* JADX WARN: Code duplicated, block: B:32:0x0084  */
        /* JADX WARN: Code duplicated, block: B:34:0x0094 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x009d  */
        /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return SyncLogDeviceEnvState.FirmwareUpgrading;
                    }
                    DeviceRepository deviceRepository = CheckSyncLogDeviceEnvUseCase.this.deviceRepository;
                    DeviceType deviceType = this.c;
                    this.a = 3;
                    obj = deviceRepository.isUsingVoiceAssistant(deviceType, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return SyncLogDeviceEnvState.VoiceAssistantAlive;
                    }
                    DeviceRepository deviceRepository2 = CheckSyncLogDeviceEnvUseCase.this.deviceRepository;
                    DeviceType deviceType2 = this.c;
                    this.a = 4;
                    obj = deviceRepository2.isUsingMusicController(deviceType2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return SyncLogDeviceEnvState.VoiceAssistantAlive;
                    }
                    DeviceRepository deviceRepository3 = CheckSyncLogDeviceEnvUseCase.this.deviceRepository;
                    DeviceType deviceType3 = this.c;
                    this.a = 4;
                    obj = deviceRepository3.isUsingMusicController(deviceType3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Boolean) obj).booleanValue() ? SyncLogDeviceEnvState.MusicAlive : SyncLogDeviceEnvState.Successful;
            }
            ResultKt.throwOnFailure(obj);
            DeviceRepository deviceRepository4 = CheckSyncLogDeviceEnvUseCase.this.deviceRepository;
            DeviceType deviceType4 = this.c;
            this.a = 1;
            obj = deviceRepository4.isSyncing(deviceType4, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                return SyncLogDeviceEnvState.SyncingData;
            }
            DeviceRepository deviceRepository5 = CheckSyncLogDeviceEnvUseCase.this.deviceRepository;
            DeviceType deviceType5 = this.c;
            this.a = 2;
            obj = deviceRepository5.isFWUpgrading(deviceType5, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                return SyncLogDeviceEnvState.FirmwareUpgrading;
            }
            DeviceRepository deviceRepository6 = CheckSyncLogDeviceEnvUseCase.this.deviceRepository;
            DeviceType deviceType6 = this.c;
            this.a = 3;
            obj = deviceRepository6.isUsingVoiceAssistant(deviceType6, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                return SyncLogDeviceEnvState.VoiceAssistantAlive;
            }
            DeviceRepository deviceRepository7 = CheckSyncLogDeviceEnvUseCase.this.deviceRepository;
            DeviceType deviceType7 = this.c;
            this.a = 4;
            obj = deviceRepository7.isUsingMusicController(deviceType7, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    public CheckSyncLogDeviceEnvUseCase(@NotNull DeviceRepository deviceRepository, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.deviceRepository = deviceRepository;
        this.defaultDispatcher = coroutineDispatcher;
    }

    @Nullable
    public final Object invoke(@NotNull DeviceType deviceType, @NotNull Continuation<? super SyncLogDeviceEnvState> continuation) {
        return BuildersKt.withContext(this.defaultDispatcher, new a(deviceType, null), continuation);
    }

    public /* synthetic */ CheckSyncLogDeviceEnvUseCase(DeviceRepository deviceRepository, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceRepository, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
