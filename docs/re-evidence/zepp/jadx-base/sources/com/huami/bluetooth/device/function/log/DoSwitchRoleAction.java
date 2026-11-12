package com.huami.bluetooth.device.function.log;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.core.BluetoothA2dpService;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.profile.ecf.data.MultiDeviceState;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.BluetoothContext;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>BP\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000f\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u0012!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00030%¢\u0006\u0004\b<\u0010=J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\u001e\u0010\u0014\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0016J&\u0010\u001a\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R1\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00030%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00100R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/huami/bluetooth/device/function/log/DoSwitchRoleAction;", "Ljava/lang/Runnable;", "Lcom/xiaomi/hm/health/bt/ife/IHMConnectionCallback;", "", "g", "Lcom/xiaomi/hm/health/bt/device/Status;", "status", GoogleApiAvailabilityLight.a, "i", "", "c", "f", "e", "b", "a", "Lkotlin/Function0;", "runnable", "", "delay", "Ljava/util/Timer;", "h", "run", "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "onConnectionStatusChanged", "Lcom/huami/bluetooth/device/function/log/SwitchRoleCallback;", "switchRoleCallback", "registerSwitchRoleCallback", "", "Ljava/lang/String;", "deviceAddress", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "Lkotlin/jvm/functions/Function0;", "headsetState", "doRoleSwitch", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "callback", "Lkotlin/jvm/functions/Function1;", "unregisterConnectionStatusChangeInternalCallback", "Ljava/util/Timer;", "roleSwitchDisTimer", "reConnectTimer", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "lastHeadsetDeviceState", "Lcom/huami/bluetooth/device/function/log/SwitchRoleCallback;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDoSwitchRole", "Ljava/util/concurrent/atomic/AtomicInteger;", z.j, "Ljava/util/concurrent/atomic/AtomicInteger;", "rhoProcessStatus", "Landroid/content/BroadcastReceiver;", hl.k, "Landroid/content/BroadcastReceiver;", "mBroadcastReceiver", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DoSwitchRoleAction implements Runnable, IHMConnectionCallback {
    public static final long TIMEOUT_REBOOTING_HM = 120000;
    public static final long TIMEOUT_SWITCH_ROLE = 30000;

    @NotNull
    private static final String l = "DoSwitchRoleAction";
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String deviceAddress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<HeadsetDevice.HeadsetDeviceState> headsetState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> doRoleSwitch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function1<IHMConnectionCallback, Unit> unregisterConnectionStatusChangeInternalCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Timer roleSwitchDisTimer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Timer reConnectTimer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private HeadsetDevice.HeadsetDeviceState lastHeadsetDeviceState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private SwitchRoleCallback switchRoleCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean isDoSwitchRole = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final AtomicInteger rhoProcessStatus = new AtomicInteger(0);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final BroadcastReceiver mBroadcastReceiver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(DoSwitchRoleAction.l, "hm spp reConnect timeout");
            DoSwitchRoleAction.this.i();
            DoSwitchRoleAction.this.a();
            SwitchRoleCallback switchRoleCallback = DoSwitchRoleAction.this.switchRoleCallback;
            if (switchRoleCallback == null) {
                return;
            }
            switchRoleCallback.onSwitchRoleResult(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(DoSwitchRoleAction.l, "role switch disConnect timeout");
            DoSwitchRoleAction.this.i();
            DoSwitchRoleAction.this.b();
            SwitchRoleCallback switchRoleCallback = DoSwitchRoleAction.this.switchRoleCallback;
            if (switchRoleCallback == null) {
                return;
            }
            switchRoleCallback.onSwitchRoleResult(false);
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
            return "RHO switching in progress";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DoSwitchRoleAction(@NotNull String str, @NotNull Function0<HeadsetDevice.HeadsetDeviceState> function0, @NotNull Function0<Boolean> function1, @NotNull Function1<? super IHMConnectionCallback, Unit> function2) {
        this.deviceAddress = str;
        this.headsetState = function0;
        this.doRoleSwitch = function1;
        this.unregisterConnectionStatusChangeInternalCallback = function2;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.huami.bluetooth.device.function.log.DoSwitchRoleAction$mBroadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                String action = intent.getAction();
                Debug.fi("DoSwitchRoleAction", Intrinsics.stringPlus("action:", action));
                if (Intrinsics.areEqual("android.bluetooth.adapter.action.STATE_CHANGED", action)) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    if (intExtra == 10 || intExtra == 13) {
                        this.a.b();
                        this.a.a();
                        this.a.i();
                        SwitchRoleCallback switchRoleCallback = this.a.switchRoleCallback;
                        if (switchRoleCallback == null) {
                            return;
                        }
                        switchRoleCallback.onSwitchRoleResult(false);
                    }
                }
            }
        };
        this.mBroadcastReceiver = broadcastReceiver;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            BluetoothContext.getContext().registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            Debug.fi(l, Intrinsics.stringPlus("exception:", e.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        Timer timer = this.reConnectTimer;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.reConnectTimer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        Timer timer = this.roleSwitchDisTimer;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.roleSwitchDisTimer = null;
    }

    private final boolean c() {
        HeadsetDevice.HeadsetDeviceState headsetDeviceState = this.lastHeadsetDeviceState;
        MultiDeviceState.Host host = headsetDeviceState == null ? null : headsetDeviceState.getHost();
        HeadsetDevice.HeadsetDeviceState headsetDeviceStateInvoke = this.headsetState.invoke();
        return !Intrinsics.areEqual(host, headsetDeviceStateInvoke != null ? headsetDeviceStateInvoke.getHost() : null);
    }

    private final void d(Status status) {
        if (status == Status.AUTH_SUCCESS) {
            a();
            i();
            SwitchRoleCallback switchRoleCallback = this.switchRoleCallback;
            if (switchRoleCallback == null) {
                return;
            }
            switchRoleCallback.onSwitchRoleResult(c());
            return;
        }
        if (status == Status.DISCONNECTED) {
            this.rhoProcessStatus.set(2);
            b();
            a();
            e();
        }
    }

    private final void e() {
        this.reConnectTimer = h(new a(), 120000L);
    }

    private final void f() {
        this.roleSwitchDisTimer = h(new b(), 30000L);
    }

    private final void g() {
        if (this.isDoSwitchRole.get()) {
            HMLog.info(l, c.a);
            SwitchRoleCallback switchRoleCallback = this.switchRoleCallback;
            if (switchRoleCallback == null) {
                return;
            }
            switchRoleCallback.onSwitchRoleResult(false);
            return;
        }
        this.isDoSwitchRole.set(true);
        this.lastHeadsetDeviceState = this.headsetState.invoke();
        this.rhoProcessStatus.set(1);
        boolean zBooleanValue = this.doRoleSwitch.invoke().booleanValue();
        if (this.rhoProcessStatus.get() == 1) {
            if (zBooleanValue) {
                f();
                return;
            }
            i();
            SwitchRoleCallback switchRoleCallback2 = this.switchRoleCallback;
            if (switchRoleCallback2 == null) {
                return;
            }
            switchRoleCallback2.onSwitchRoleResult(false);
        }
    }

    private final Timer h(final Function0<Unit> runnable, long delay) {
        Timer timer = new Timer(true);
        timer.schedule(new TimerTask() { // from class: com.huami.bluetooth.device.function.log.DoSwitchRoleAction$startTimer$1$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                runnable.invoke();
            }
        }, delay);
        return timer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        this.unregisterConnectionStatusChangeInternalCallback.invoke(this);
        this.isDoSwitchRole.set(false);
        this.rhoProcessStatus.set(0);
        try {
            BluetoothContext.getContext().unregisterReceiver(this.mBroadcastReceiver);
        } catch (Exception e) {
            Debug.fi(l, Intrinsics.stringPlus("switchActionFinish exception:", e.getMessage()));
        }
    }

    @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
    public void onConnectionStatusChanged(@Nullable BluetoothDevice device, @Nullable HMDeviceType type, @Nullable Status status) {
        Debug.fi(l, Intrinsics.stringPlus("onConnectionStatusChanged:", status));
        d(status);
    }

    public final void registerSwitchRoleCallback(@NotNull SwitchRoleCallback switchRoleCallback) {
        this.switchRoleCallback = switchRoleCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        BluetoothA2dpService bluetoothA2dpService = BluetoothA2dpService.INSTANCE.get();
        if (bluetoothA2dpService != null) {
            Debug.fi(l, Intrinsics.stringPlus("A2DP connected: ", Boolean.valueOf(bluetoothA2dpService.isA2dpConnected(this.deviceAddress))));
        }
        g();
    }
}
