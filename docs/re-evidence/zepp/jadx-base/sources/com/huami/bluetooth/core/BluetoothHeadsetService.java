package com.huami.bluetooth.core;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0016\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/core/BluetoothHeadsetService;", "", "Lkotlin/Function1;", "Landroid/bluetooth/BluetoothHeadset;", "", NotificationCompat.CATEGORY_CALL, "a", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "", "b", "Lkotlin/Function0;", "initComplete", "c", "device", "isHeadsetConnected", "connectHeadset", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "profileIsInit", "Landroid/bluetooth/BluetoothAdapter;", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothHeadset;", "bluetoothHeadset", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BluetoothHeadsetService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static BluetoothHeadsetService d = null;

    @NotNull
    private static final String e = "BluetoothHeadsetService";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean profileIsInit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private BluetoothHeadset bluetoothHeadset;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/core/BluetoothHeadsetService$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/bluetooth/core/BluetoothHeadsetService;", PointCategory.INIT, "get", "", "TAG", "Ljava/lang/String;", "service", "Lcom/huami/bluetooth/core/BluetoothHeadsetService;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final BluetoothHeadsetService get() {
            return BluetoothHeadsetService.d;
        }

        @JvmStatic
        @NotNull
        public final BluetoothHeadsetService init(@NotNull Context context) {
            BluetoothHeadsetService bluetoothHeadsetService = BluetoothHeadsetService.d;
            if (bluetoothHeadsetService != null) {
                return bluetoothHeadsetService;
            }
            BluetoothHeadsetService bluetoothHeadsetService2 = new BluetoothHeadsetService(context, null);
            Companion companion = BluetoothHeadsetService.INSTANCE;
            BluetoothHeadsetService.d = bluetoothHeadsetService2;
            return bluetoothHeadsetService2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ BluetoothDevice b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Reflecting through JAVA, poking Headset profile connect";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BluetoothDevice bluetoothDevice) {
            super(0);
            this.b = bluetoothDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BluetoothHeadset bluetoothHeadset = BluetoothHeadsetService.this.bluetoothHeadset;
            if (bluetoothHeadset == null) {
                return;
            }
            if (!(bluetoothHeadset.getConnectionState(this.b) != 2)) {
                bluetoothHeadset = null;
            }
            if (bluetoothHeadset == null) {
                return;
            }
            BluetoothHeadsetService bluetoothHeadsetService = BluetoothHeadsetService.this;
            BluetoothDevice bluetoothDevice = this.b;
            HMLog.info(BluetoothHeadsetService.e, a.a);
            bluetoothHeadsetService.b(bluetoothDevice);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/bluetooth/BluetoothHeadset;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<BluetoothHeadset, Boolean> {
        public final /* synthetic */ BluetoothDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BluetoothDevice bluetoothDevice) {
            super(1);
            this.a = bluetoothDevice;
        }

        public final boolean a(@NotNull BluetoothHeadset bluetoothHeadset) {
            return bluetoothHeadset.getConnectionState(this.a) == 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(BluetoothHeadset bluetoothHeadset) {
            return Boolean.valueOf(a(bluetoothHeadset));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.core.BluetoothHeadsetService$waitProfileInit$1", f = "BluetoothHeadsetService.kt", i = {}, l = {95, 96}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Unit> b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.core.BluetoothHeadsetService$waitProfileInit$1$1", f = "BluetoothHeadsetService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function0<Unit> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Function0<Unit> function0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Unit> function0, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.b, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    private BluetoothHeadsetService(Context context) {
        this.profileIsInit = new AtomicBoolean(false);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.bluetoothAdapter = defaultAdapter;
        if (defaultAdapter == null) {
            return;
        }
        defaultAdapter.getProfileProxy(context.getApplicationContext(), new BluetoothProfile.ServiceListener() { // from class: com.huami.bluetooth.core.BluetoothHeadsetService.1
            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceConnected(int profile, @Nullable BluetoothProfile proxy) {
                if (profile == 1) {
                    Debug.fi(BluetoothHeadsetService.e, "Headset service connected!");
                    BluetoothHeadsetService bluetoothHeadsetService = BluetoothHeadsetService.this;
                    Objects.requireNonNull(proxy, "null cannot be cast to non-null type android.bluetooth.BluetoothHeadset");
                    bluetoothHeadsetService.bluetoothHeadset = (BluetoothHeadset) proxy;
                    BluetoothHeadsetService.this.profileIsInit.compareAndSet(false, true);
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceDisconnected(int profile) {
                if (profile == 1) {
                    Debug.fi(BluetoothHeadsetService.e, "Headset service disconnected!");
                    BluetoothHeadsetService.this.bluetoothHeadset = null;
                    BluetoothHeadsetService.this.profileIsInit.compareAndSet(true, false);
                }
            }
        }, 1);
    }

    public /* synthetic */ BluetoothHeadsetService(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final boolean a(Function1<? super BluetoothHeadset, Boolean> call) {
        BluetoothHeadset bluetoothHeadset = this.bluetoothHeadset;
        Boolean boolValueOf = bluetoothHeadset == null ? null : Boolean.valueOf(call.invoke(bluetoothHeadset).booleanValue());
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        Debug.fi(e, "Headset service is not connected");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(BluetoothDevice bluetoothDevice) {
        Method method;
        if (bluetoothDevice != null) {
            try {
                BluetoothHeadset bluetoothHeadset = this.bluetoothHeadset;
                if (bluetoothHeadset != null && (method = bluetoothHeadset.getClass().getMethod(WifiSetActivity.KEY_CONNECT, BluetoothDevice.class)) != null) {
                    method.invoke(this.bluetoothHeadset, bluetoothDevice);
                }
            } catch (Exception e2) {
                HMLog.info(e, new a(e2));
            }
        }
    }

    private final void c(Function0<Unit> initComplete) {
        if (this.profileIsInit.get()) {
            initComplete.invoke();
        } else {
            e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new d(initComplete, null), 2, null);
        }
    }

    @JvmStatic
    @Nullable
    public static final BluetoothHeadsetService get() {
        return INSTANCE.get();
    }

    @JvmStatic
    @NotNull
    public static final BluetoothHeadsetService init(@NotNull Context context) {
        return INSTANCE.init(context);
    }

    public final void connectHeadset(@NotNull BluetoothDevice bluetoothDevice) {
        c(new b(bluetoothDevice));
    }

    public final boolean isHeadsetConnected(@NotNull BluetoothDevice device) {
        return a(new c(device));
    }
}
