package com.huami.bluetooth.core;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0016\u0010\u000f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0002J\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001b¨\u0006\""}, d2 = {"Lcom/huami/bluetooth/core/BluetoothA2dpService;", "", "Lkotlin/Function1;", "Landroid/bluetooth/BluetoothAdapter;", "", NotificationCompat.CATEGORY_CALL, "b", "Landroid/bluetooth/BluetoothA2dp;", "a", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "", "c", "Lkotlin/Function0;", "initComplete", GoogleApiAvailabilityLight.a, "isA2dpConnected", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "device", "isA2dpPlaying", "connectA2DP", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "profileIsInit", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothA2dp;", "bluetoothA2dp", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BluetoothA2dpService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = "BluetoothA2dpService";

    @Nullable
    private static BluetoothA2dpService e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean profileIsInit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private BluetoothA2dp bluetoothA2dp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/core/BluetoothA2dpService$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/bluetooth/core/BluetoothA2dpService;", PointCategory.INIT, "get", "", "TAG", "Ljava/lang/String;", "service", "Lcom/huami/bluetooth/core/BluetoothA2dpService;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final BluetoothA2dpService get() {
            return BluetoothA2dpService.e;
        }

        @JvmStatic
        @NotNull
        public final BluetoothA2dpService init(@NotNull Context context) {
            BluetoothA2dpService bluetoothA2dpService = BluetoothA2dpService.e;
            if (bluetoothA2dpService != null) {
                return bluetoothA2dpService;
            }
            BluetoothA2dpService bluetoothA2dpService2 = new BluetoothA2dpService(context, null);
            Companion companion = BluetoothA2dpService.INSTANCE;
            BluetoothA2dpService.e = bluetoothA2dpService2;
            return bluetoothA2dpService2;
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
                return "Reflecting through JAVA, poking A2DP profile connect";
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
            BluetoothA2dp bluetoothA2dp = BluetoothA2dpService.this.bluetoothA2dp;
            if (bluetoothA2dp == null) {
                return;
            }
            if (!(bluetoothA2dp.getConnectionState(this.b) != 2)) {
                bluetoothA2dp = null;
            }
            if (bluetoothA2dp == null) {
                return;
            }
            BluetoothA2dpService bluetoothA2dpService = BluetoothA2dpService.this;
            BluetoothDevice bluetoothDevice = this.b;
            HMLog.info(BluetoothA2dpService.d, a.a);
            bluetoothA2dpService.c(bluetoothDevice);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/bluetooth/BluetoothAdapter;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<BluetoothAdapter, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final boolean a(@NotNull BluetoothAdapter bluetoothAdapter) {
            return bluetoothAdapter.getProfileConnectionState(2) == 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(BluetoothAdapter bluetoothAdapter) {
            return Boolean.valueOf(a(bluetoothAdapter));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/bluetooth/BluetoothAdapter;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<BluetoothAdapter, Boolean> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.b = str;
        }

        public final boolean a(@NotNull BluetoothAdapter bluetoothAdapter) {
            return BluetoothA2dpService.this.isA2dpConnected(bluetoothAdapter.getRemoteDevice(this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(BluetoothAdapter bluetoothAdapter) {
            return Boolean.valueOf(a(bluetoothAdapter));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/bluetooth/BluetoothA2dp;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<BluetoothA2dp, Boolean> {
        public final /* synthetic */ BluetoothDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BluetoothDevice bluetoothDevice) {
            super(1);
            this.a = bluetoothDevice;
        }

        public final boolean a(@NotNull BluetoothA2dp bluetoothA2dp) {
            return bluetoothA2dp.getConnectionState(this.a) == 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(BluetoothA2dp bluetoothA2dp) {
            return Boolean.valueOf(a(bluetoothA2dp));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/bluetooth/BluetoothAdapter;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<BluetoothAdapter, Boolean> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.b = str;
        }

        public final boolean a(@NotNull BluetoothAdapter bluetoothAdapter) {
            return BluetoothA2dpService.this.isA2dpPlaying(bluetoothAdapter.getRemoteDevice(this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(BluetoothAdapter bluetoothAdapter) {
            return Boolean.valueOf(a(bluetoothAdapter));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/bluetooth/BluetoothA2dp;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<BluetoothA2dp, Boolean> {
        public final /* synthetic */ BluetoothDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BluetoothDevice bluetoothDevice) {
            super(1);
            this.a = bluetoothDevice;
        }

        public final boolean a(@NotNull BluetoothA2dp bluetoothA2dp) {
            return bluetoothA2dp.isA2dpPlaying(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(BluetoothA2dp bluetoothA2dp) {
            return Boolean.valueOf(a(bluetoothA2dp));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.core.BluetoothA2dpService$waitProfileInit$1", f = "BluetoothA2dpService.kt", i = {}, l = {148, 149}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Unit> b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.core.BluetoothA2dpService$waitProfileInit$1$1", f = "BluetoothA2dpService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
        public h(Function0<Unit> function0, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

    private BluetoothA2dpService(Context context) {
        this.profileIsInit = new AtomicBoolean(false);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.bluetoothAdapter = defaultAdapter;
        if (defaultAdapter == null) {
            return;
        }
        defaultAdapter.getProfileProxy(context.getApplicationContext(), new BluetoothProfile.ServiceListener() { // from class: com.huami.bluetooth.core.BluetoothA2dpService.1
            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceConnected(int profile, @Nullable BluetoothProfile proxy) {
                if (profile == 2) {
                    Debug.fi(BluetoothA2dpService.d, "A2DP service connected!");
                    BluetoothA2dpService bluetoothA2dpService = BluetoothA2dpService.this;
                    Objects.requireNonNull(proxy, "null cannot be cast to non-null type android.bluetooth.BluetoothA2dp");
                    bluetoothA2dpService.bluetoothA2dp = (BluetoothA2dp) proxy;
                    BluetoothA2dpService.this.profileIsInit.compareAndSet(false, true);
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceDisconnected(int profile) {
                if (profile == 2) {
                    Debug.fi(BluetoothA2dpService.d, "A2DP service disconnected!");
                    BluetoothA2dpService.this.bluetoothA2dp = null;
                    BluetoothA2dpService.this.profileIsInit.compareAndSet(true, false);
                }
            }
        }, 2);
    }

    public /* synthetic */ BluetoothA2dpService(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final boolean a(Function1<? super BluetoothA2dp, Boolean> call) {
        BluetoothA2dp bluetoothA2dp = this.bluetoothA2dp;
        Boolean boolValueOf = bluetoothA2dp == null ? null : Boolean.valueOf(call.invoke(bluetoothA2dp).booleanValue());
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        Debug.fi(d, "A2DP service is not connected");
        return false;
    }

    private final boolean b(Function1<? super BluetoothAdapter, Boolean> call) {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        Boolean boolValueOf = bluetoothAdapter == null ? null : Boolean.valueOf(call.invoke(bluetoothAdapter).booleanValue());
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        Debug.fi(d, "Bluetooth is not supported on this hardware platform");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(BluetoothDevice bluetoothDevice) {
        Method method;
        if (bluetoothDevice != null) {
            try {
                BluetoothA2dp bluetoothA2dp = this.bluetoothA2dp;
                if (bluetoothA2dp != null && (method = bluetoothA2dp.getClass().getMethod(WifiSetActivity.KEY_CONNECT, BluetoothDevice.class)) != null) {
                    method.invoke(this.bluetoothA2dp, bluetoothDevice);
                }
            } catch (Exception e2) {
                HMLog.info(d, new a(e2));
            }
        }
    }

    private final void d(Function0<Unit> initComplete) {
        if (this.profileIsInit.get()) {
            initComplete.invoke();
        } else {
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new h(initComplete, null), 2, null);
        }
    }

    @JvmStatic
    @Nullable
    public static final BluetoothA2dpService get() {
        return INSTANCE.get();
    }

    @JvmStatic
    @NotNull
    public static final BluetoothA2dpService init(@NotNull Context context) {
        return INSTANCE.init(context);
    }

    public final void connectA2DP(@NotNull BluetoothDevice bluetoothDevice) {
        d(new b(bluetoothDevice));
    }

    public final boolean isA2dpConnected() {
        return b(c.a);
    }

    public final boolean isA2dpPlaying(@NotNull String address) {
        if (BluetoothAdapter.checkBluetoothAddress(address)) {
            return b(new f(address));
        }
        return false;
    }

    public final boolean isA2dpConnected(@NotNull String address) {
        if (BluetoothAdapter.checkBluetoothAddress(address)) {
            return b(new d(address));
        }
        return false;
    }

    public final boolean isA2dpPlaying(@NotNull BluetoothDevice device) {
        return a(new g(device));
    }

    public final boolean isA2dpConnected(@NotNull BluetoothDevice device) {
        return a(new e(device));
    }
}
