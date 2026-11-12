package com.huami.feedback.domain;

import androidx.annotation.VisibleForTesting;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.feedback.log.utils.LogFileUtilsKt;
import com.huami.feedback.repo.BluetoothState;
import com.huami.feedback.repo.BluetoothStateRepository;
import com.huami.feedback.repo.DeviceRepository;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.feedback.util.UtilsKt;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086Bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/feedback/domain/ConnectDeviceUseCase;", "", "Lcom/huami/feedback/repo/BluetoothState;", "state", "", "a", "Lcom/huami/feedback/sync/api/device/DeviceType;", "deviceType", "invoke", "(Lcom/huami/feedback/sync/api/device/DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeout", "Lcom/huami/feedback/repo/DeviceRepository;", "deviceRepository", "Lcom/huami/feedback/repo/BluetoothStateRepository;", "bluetoothRepository", "connectDeviceUntilTimeout", "(JLcom/huami/feedback/sync/api/device/DeviceType;Lcom/huami/feedback/repo/DeviceRepository;Lcom/huami/feedback/repo/BluetoothStateRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/feedback/repo/DeviceRepository;", "b", "Lcom/huami/feedback/repo/BluetoothStateRepository;", "<init>", "(Lcom/huami/feedback/repo/DeviceRepository;Lcom/huami/feedback/repo/BluetoothStateRepository;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class ConnectDeviceUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceRepository deviceRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BluetoothStateRepository bluetoothRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.domain.ConnectDeviceUseCase", f = "ConnectDeviceUseCase.kt", i = {0, 0}, l = {67}, m = "connectDeviceUntilTimeout", n = {"bluetoothRepository", "timeout"}, s = {"L$0", "J$0"})
    public static final class a extends ContinuationImpl {
        public long a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return ConnectDeviceUseCase.this.connectDeviceUntilTimeout(0L, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Device connect timeout(" + this.a + " ms), return.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Device connected event, But check bluetooth is not enable";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.domain.ConnectDeviceUseCase$connectDeviceUntilTimeout$type$1", f = "ConnectDeviceUseCase.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ DeviceRepository b;
        public final /* synthetic */ DeviceType c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DeviceRepository deviceRepository, DeviceType deviceType, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = deviceRepository;
            this.c = deviceType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceRepository deviceRepository = this.b;
                int iAsHmDeviceType = LogFileUtilsKt.asHmDeviceType(this.c);
                this.a = 1;
                obj = deviceRepository.connectDevice(iAsHmDeviceType, this);
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
    @DebugMetadata(c = "com.huami.feedback.domain.ConnectDeviceUseCase", f = "ConnectDeviceUseCase.kt", i = {0, 1, 1}, l = {33, 46}, m = "invoke", n = {"this", WifiSetActivity.KEY_CONNECT_RESULT, "start$iv"}, s = {"L$0", "L$0", "J$0"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return ConnectDeviceUseCase.this.invoke(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"", "isConnected", "Lcom/huami/feedback/repo/BluetoothState;", "state", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.domain.ConnectDeviceUseCase$invoke$2$1", f = "ConnectDeviceUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function3<Boolean, BluetoothState, Continuation<? super Boolean>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ Object c;

        public f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Nullable
        public final Object a(boolean z, @NotNull BluetoothState bluetoothState, @Nullable Continuation<? super Boolean> continuation) {
            f fVar = ConnectDeviceUseCase.this.new f(continuation);
            fVar.b = z;
            fVar.c = bluetoothState;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, BluetoothState bluetoothState, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), bluetoothState, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!ConnectDeviceUseCase.this.a((BluetoothState) this.c) && this.b);
        }
    }

    public ConnectDeviceUseCase(@NotNull DeviceRepository deviceRepository, @NotNull BluetoothStateRepository bluetoothStateRepository) {
        this.deviceRepository = deviceRepository;
        this.bluetoothRepository = bluetoothStateRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(BluetoothState state) {
        return state == BluetoothState.TURNING_OFF || state == BluetoothState.OFF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @VisibleForTesting
    @Nullable
    public final Object connectDeviceUntilTimeout(long j, @NotNull DeviceType deviceType, @NotNull DeviceRepository deviceRepository, @NotNull BluetoothStateRepository bluetoothStateRepository, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithTimeoutOrNull = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            d dVar = new d(deviceRepository, deviceType, null);
            aVar.b = bluetoothStateRepository;
            aVar.a = j;
            aVar.e = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, dVar, aVar);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = aVar.a;
            bluetoothStateRepository = (BluetoothStateRepository) aVar.b;
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
        }
        if (((Boolean) objWithTimeoutOrNull) == null) {
            HMLog.info("feedback", new b(j));
            return Boxing.boxBoolean(false);
        }
        if (bluetoothStateRepository.isBluetoothEnable()) {
            return Boxing.boxBoolean(true);
        }
        HMLog.info("feedback", c.a);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object invoke(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        ConnectDeviceUseCase connectDeviceUseCase;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        long j;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objConnectDeviceUntilTimeout = eVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                connectDeviceUseCase = (ConnectDeviceUseCase) eVar.a;
                ResultKt.throwOnFailure(objConnectDeviceUntilTimeout);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = eVar.c;
                booleanRef = (Ref.BooleanRef) eVar.b;
                booleanRef2 = (Ref.BooleanRef) eVar.a;
                ResultKt.throwOnFailure(objConnectDeviceUntilTimeout);
            }
            booleanRef.element = ((Boolean) objConnectDeviceUntilTimeout).booleanValue();
            UtilsKt.setConnectDuration(System.currentTimeMillis() - j);
            return Boxing.boxBoolean(booleanRef2.element);
        }
        ResultKt.throwOnFailure(objConnectDeviceUntilTimeout);
        DeviceRepository deviceRepository = this.deviceRepository;
        BluetoothStateRepository bluetoothStateRepository = this.bluetoothRepository;
        eVar.a = this;
        eVar.f = 1;
        objConnectDeviceUntilTimeout = connectDeviceUntilTimeout(30000L, deviceType, deviceRepository, bluetoothStateRepository, eVar);
        if (objConnectDeviceUntilTimeout == coroutine_suspended) {
            return coroutine_suspended;
        }
        connectDeviceUseCase = this;
        Flow flowFlowOf = FlowKt.flowOf(objConnectDeviceUntilTimeout);
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Flow flowFlowCombine = FlowKt.flowCombine(flowFlowOf, connectDeviceUseCase.bluetoothRepository.getBluetoothState(), connectDeviceUseCase.new f(null));
        eVar.a = booleanRef3;
        eVar.b = booleanRef3;
        eVar.c = jCurrentTimeMillis;
        eVar.f = 2;
        objConnectDeviceUntilTimeout = FlowKt.first(flowFlowCombine, eVar);
        if (objConnectDeviceUntilTimeout == coroutine_suspended) {
            return coroutine_suspended;
        }
        booleanRef = booleanRef3;
        booleanRef2 = booleanRef;
        j = jCurrentTimeMillis;
        booleanRef.element = ((Boolean) objConnectDeviceUntilTimeout).booleanValue();
        UtilsKt.setConnectDuration(System.currentTimeMillis() - j);
        return Boxing.boxBoolean(booleanRef2.element);
    }
}
