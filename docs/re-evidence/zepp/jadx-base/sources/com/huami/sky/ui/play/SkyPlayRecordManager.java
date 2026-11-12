package com.huami.sky.ui.play;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.assist.ISkyDeviceStatusAssistant;
import com.huami.sky.lib.assist.SkyDeviceStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayRecordManager;", "", "", "deviceStatusObserve", "clear", "Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "a", "Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "deviceStatus", "Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "b", "Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "skyServiceHelper", "Lkotlinx/coroutines/CoroutineScope;", "c", "Lkotlinx/coroutines/CoroutineScope;", "skyIOScope", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/flow/MutableStateFlow;", "_deviceConnectedFlow", "Lkotlinx/coroutines/flow/StateFlow;", "e", "Lkotlinx/coroutines/flow/StateFlow;", "getDeviceConnectedFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "deviceConnectedFlow", "<init>", "(Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;Lcom/huami/sky/ui/play/SkyPlayServiceHelper;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayRecordManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISkyDeviceStatusAssistant deviceStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SkyPlayServiceHelper skyServiceHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private CoroutineScope skyIOScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private MutableStateFlow<Boolean> _deviceConnectedFlow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final StateFlow<Boolean> deviceConnectedFlow;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayRecordManager$deviceStatusObserve$1", f = "SkyPlayRecordManager.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<SkyDeviceStatus, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull SkyDeviceStatus skyDeviceStatus, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(skyDeviceStatus, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = SkyPlayRecordManager.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (((SkyDeviceStatus) this.b) == SkyDeviceStatus.CONNECT_SUCCESS) {
                    MutableStateFlow mutableStateFlow = SkyPlayRecordManager.this._deviceConnectedFlow;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                    this.a = 1;
                    if (mutableStateFlow.emit(boolBoxBoolean, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayRecordManager$deviceStatusObserve$2", f = "SkyPlayRecordManager.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<SkyDeviceStatus, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull SkyDeviceStatus skyDeviceStatus, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(skyDeviceStatus, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = SkyPlayRecordManager.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (((SkyDeviceStatus) this.b) == SkyDeviceStatus.CONNECT_SUCCESS) {
                    MutableStateFlow mutableStateFlow = SkyPlayRecordManager.this._deviceConnectedFlow;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                    this.a = 1;
                    if (mutableStateFlow.emit(boolBoxBoolean, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayRecordManager$deviceStatusObserve$3", f = "SkyPlayRecordManager.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(long j, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayRecordManager.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
            return a(l.longValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = SkyPlayRecordManager.this._deviceConnectedFlow;
                Boolean boolBoxBoolean = Boxing.boxBoolean(SkyPlayRecordManager.this.deviceStatus.getDeviceConnectStatus() == SkyDeviceStatus.CONNECT_SUCCESS);
                this.a = 1;
                if (mutableStateFlow.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public SkyPlayRecordManager(@NotNull ISkyDeviceStatusAssistant iSkyDeviceStatusAssistant, @NotNull SkyPlayServiceHelper skyPlayServiceHelper) {
        this.deviceStatus = iSkyDeviceStatusAssistant;
        this.skyServiceHelper = skyPlayServiceHelper;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._deviceConnectedFlow = MutableStateFlow;
        this.deviceConnectedFlow = MutableStateFlow;
    }

    public final void clear() {
        CoroutineScopeKt.cancel$default(this.skyIOScope, null, 1, null);
    }

    public final void deviceStatusObserve() {
        FlowKt.launchIn(FlowKt.onEach(this.deviceStatus.deviceConnectNotifiers(), new a(null)), this.skyIOScope);
        FlowKt.launchIn(FlowKt.onEach(this.deviceStatus.deviceBoundNotifiers(), new b(null)), this.skyIOScope);
        FlowKt.launchIn(FlowKt.onEach(this.skyServiceHelper.getPlayStartTimeFlow(), new c(null)), this.skyIOScope);
    }

    @NotNull
    public final StateFlow<Boolean> getDeviceConnectedFlow() {
        return this.deviceConnectedFlow;
    }
}
