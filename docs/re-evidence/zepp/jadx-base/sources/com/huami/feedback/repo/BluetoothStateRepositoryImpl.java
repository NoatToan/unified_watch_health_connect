package com.huami.feedback.repo;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.feedback.util.Utils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/huami/feedback/repo/BluetoothStateRepositoryImpl;", "Lcom/huami/feedback/repo/BluetoothStateRepository;", "Landroid/content/IntentFilter;", "a", "", "isBluetoothEnable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huami/feedback/repo/BluetoothState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_state", "Lkotlinx/coroutines/flow/StateFlow;", "getBluetoothState", "()Lkotlinx/coroutines/flow/StateFlow;", "bluetoothState", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class BluetoothStateRepositoryImpl implements BluetoothStateRepository {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableStateFlow<BluetoothState> _state = StateFlowKt.MutableStateFlow(BluetoothState.UnKnow);

    public BluetoothStateRepositoryImpl(@NotNull Context context) {
        context.registerReceiver(new BroadcastReceiver() { // from class: com.huami.feedback.repo.BluetoothStateRepositoryImpl$receiver$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Object> {
                public final /* synthetic */ BluetoothDevice a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(BluetoothDevice bluetoothDevice) {
                    super(0);
                    this.a = bluetoothDevice;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final Object invoke() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("蓝牙设备：");
                    BluetoothDevice bluetoothDevice = this.a;
                    sb.append((Object) (bluetoothDevice == null ? null : bluetoothDevice.getName()));
                    sb.append(" 已连接");
                    return sb.toString();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<Object> {
                public final /* synthetic */ BluetoothDevice a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(BluetoothDevice bluetoothDevice) {
                    super(0);
                    this.a = bluetoothDevice;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final Object invoke() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("蓝牙设备：");
                    BluetoothDevice bluetoothDevice = this.a;
                    sb.append((Object) (bluetoothDevice == null ? null : bluetoothDevice.getName()));
                    sb.append(" 已断开");
                    return sb.toString();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<Object> {
                public final /* synthetic */ BluetoothStateRepositoryImpl a;
                public final /* synthetic */ int b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(BluetoothStateRepositoryImpl bluetoothStateRepositoryImpl, int i) {
                    super(0);
                    this.a = bluetoothStateRepositoryImpl;
                    this.b = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final Object invoke() {
                    return "ACTION_STATE_CHANGED: " + this.a._state.getValue() + '(' + this.b + ')';
                }
            }

            @Override // android.content.BroadcastReceiver
            @SuppressLint({"MissingPermission"})
            public void onReceive(@Nullable Context context2, @Nullable Intent intent) {
                if (intent == null) {
                    return;
                }
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                String action = intent.getAction();
                if (action != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode == -1530327060) {
                        if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                            this.a._state.setValue(BluetoothState.INSTANCE.fromState(intExtra));
                            LogcatKt.info(Logcat.INSTANCE, "feedback", new c(this.a, intExtra));
                            return;
                        }
                        return;
                    }
                    if (iHashCode == -301431627) {
                        if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                            LogcatKt.info(Logcat.INSTANCE, "feedback", new a(bluetoothDevice));
                        }
                    } else if (iHashCode == 1821585647 && action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                        LogcatKt.info(Logcat.INSTANCE, "feedback", new b(bluetoothDevice));
                    }
                }
            }
        }, a());
    }

    private final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_OFF");
        intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_ON");
        return intentFilter;
    }

    @Override // com.huami.feedback.repo.BluetoothStateRepository
    @NotNull
    public StateFlow<BluetoothState> getBluetoothState() {
        return this._state;
    }

    @Override // com.huami.feedback.repo.BluetoothStateRepository
    public boolean isBluetoothEnable() {
        return Utils.isBluetoothEnable();
    }
}
