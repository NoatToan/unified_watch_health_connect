package com.xiaomi.hm.health.device.headset.help;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.headset.PairedDevice;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J*\u0010\u0013\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00030\tR\u001e\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/device/headset/help/HeadSetConnectHelp;", "", "Lkotlin/Function0;", "", "initComplete", "c", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "b", "Lkotlin/Function1;", "Landroid/bluetooth/BluetoothA2dp;", "", NotificationCompat.CATEGORY_CALL, "a", "connectHeadset", "", "Lcom/xiaomi/hm/health/device/headset/PairedDevice;", "devices", "callback", "findFirstDevice", "Landroid/bluetooth/BluetoothAdapter;", "kotlin.jvm.PlatformType", "Landroid/bluetooth/BluetoothAdapter;", "adapter", "Landroid/bluetooth/BluetoothA2dp;", "bluetoothHeadset", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "profileIsInit", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadSetConnectHelp {

    @NotNull
    private static final String d = "HeadSetConnectHelp";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final BluetoothAdapter adapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private BluetoothA2dp bluetoothHeadset;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean profileIsInit;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "HEADSET service is not connected";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
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
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ BluetoothDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BluetoothDevice bluetoothDevice) {
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
            BluetoothA2dp bluetoothA2dp = HeadSetConnectHelp.this.bluetoothHeadset;
            if (bluetoothA2dp == null) {
                return;
            }
            if (!(bluetoothA2dp.getConnectionState(this.b) != 2)) {
                bluetoothA2dp = null;
            }
            if (bluetoothA2dp == null) {
                return;
            }
            HeadSetConnectHelp.this.b(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ List<PairedDevice> a;
        public final /* synthetic */ Function1<BluetoothDevice, Unit> b;
        public final /* synthetic */ HeadSetConnectHelp c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/bluetooth/BluetoothA2dp;", "bluetoothHeadset", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<BluetoothA2dp, Boolean> {
            public final /* synthetic */ PairedDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PairedDevice pairedDevice) {
                super(1);
                this.a = pairedDevice;
            }

            public final boolean a(@NotNull BluetoothA2dp bluetoothA2dp) {
                return bluetoothA2dp.getConnectionState(this.a.getDevice()) == 2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(BluetoothA2dp bluetoothA2dp) {
                return Boolean.valueOf(a(bluetoothA2dp));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<PairedDevice> list, Function1<? super BluetoothDevice, Unit> function1, HeadSetConnectHelp headSetConnectHelp) {
            super(0);
            this.a = list;
            this.b = function1;
            this.c = headSetConnectHelp;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Object next;
            List<PairedDevice> list = this.a;
            HeadSetConnectHelp headSetConnectHelp = this.c;
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!headSetConnectHelp.a(new a((PairedDevice) next)));
            PairedDevice pairedDevice = (PairedDevice) next;
            if (pairedDevice == null) {
                this.b.invoke(this.a.get(0).getDevice());
            } else {
                this.b.invoke(pairedDevice.getDevice());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.help.HeadSetConnectHelp$waitProfileInit$1", f = "HeadSetConnectHelp.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Unit> b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.help.HeadSetConnectHelp$waitProfileInit$1$1", f = "HeadSetConnectHelp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
        public e(Function0<Unit> function0, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

    public HeadSetConnectHelp(@NotNull Context context) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.adapter = defaultAdapter;
        this.profileIsInit = new AtomicBoolean(false);
        defaultAdapter.getProfileProxy(context, new BluetoothProfile.ServiceListener() { // from class: com.xiaomi.hm.health.device.headset.help.HeadSetConnectHelp.1
            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceConnected(int profile, @Nullable BluetoothProfile proxy) {
                if (profile == 2) {
                    HeadSetConnectHelp.this.bluetoothHeadset = (BluetoothA2dp) proxy;
                    HeadSetConnectHelp.this.profileIsInit.set(true);
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceDisconnected(int profile) {
                if (profile == 2) {
                    HeadSetConnectHelp.this.bluetoothHeadset = null;
                    HeadSetConnectHelp.this.profileIsInit.set(false);
                }
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(Function1<? super BluetoothA2dp, Boolean> call) {
        BluetoothA2dp bluetoothA2dp = this.bluetoothHeadset;
        Boolean boolValueOf = bluetoothA2dp == null ? null : Boolean.valueOf(call.invoke(bluetoothA2dp).booleanValue());
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        HMLog.info(d, a.a);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(BluetoothDevice bluetoothDevice) {
        Method method;
        if (bluetoothDevice != null) {
            try {
                BluetoothA2dp bluetoothA2dp = this.bluetoothHeadset;
                if (bluetoothA2dp != null && (method = bluetoothA2dp.getClass().getMethod(WifiSetActivity.KEY_CONNECT, BluetoothDevice.class)) != null) {
                    method.invoke(this.bluetoothHeadset, bluetoothDevice);
                }
            } catch (Exception e2) {
                HMLog.info(d, new b(e2));
            }
        }
    }

    private final void c(Function0<Unit> initComplete) {
        if (this.profileIsInit.get()) {
            initComplete.invoke();
        } else {
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new e(initComplete, null), 2, null);
        }
    }

    public final void connectHeadset(@NotNull BluetoothDevice bluetoothDevice) {
        c(new c(bluetoothDevice));
    }

    public final void findFirstDevice(@NotNull List<PairedDevice> devices, @NotNull Function1<? super BluetoothDevice, Unit> callback) {
        if (devices.isEmpty()) {
            callback.invoke(null);
        } else if (devices.size() == 1) {
            callback.invoke(devices.get(0).getDevice());
        } else {
            c(new d(devices, callback, this));
        }
    }
}
