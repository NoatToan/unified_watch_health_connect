package com.xiaomi.hm.health.bodyfat.utils;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017R%\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/utils/WeightBluetoothStateReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "onReceive", "Lkotlin/Function1;", "", "a", "Lkotlin/jvm/functions/Function1;", "getOnReceiveBlueState", "()Lkotlin/jvm/functions/Function1;", "onReceiveBlueState", "", "b", "Ljava/lang/String;", "tag", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightBluetoothStateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function1<Boolean, Unit> onReceiveBlueState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag = "Weight_blue_utils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ BluetoothDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BluetoothDevice bluetoothDevice) {
            super(0);
            this.a = bluetoothDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("设备：");
            BluetoothDevice bluetoothDevice = this.a;
            sb.append((Object) (bluetoothDevice == null ? null : bluetoothDevice.getName()));
            sb.append(" 已连接");
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ BluetoothDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BluetoothDevice bluetoothDevice) {
            super(0);
            this.a = bluetoothDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("设备：");
            BluetoothDevice bluetoothDevice = this.a;
            sb.append((Object) (bluetoothDevice == null ? null : bluetoothDevice.getName()));
            sb.append(" 已断开");
            return sb.toString();
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
            return "蓝牙关闭";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "蓝牙开启";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeightBluetoothStateReceiver(@NotNull Function1<? super Boolean, Unit> function1) {
        this.onReceiveBlueState = function1;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnReceiveBlueState() {
        return this.onReceiveBlueState;
    }

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"MissingPermission"})
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1530327060) {
                if (iHashCode == -301431627) {
                    if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                        HMLog.info(this.tag, new a(bluetoothDevice));
                        return;
                    }
                    return;
                } else {
                    if (iHashCode == 1821585647 && action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                        HMLog.info(this.tag, new b(bluetoothDevice));
                        return;
                    }
                    return;
                }
            }
            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                if (intExtra == 10) {
                    HMLog.info(this.tag, c.a);
                    this.onReceiveBlueState.invoke(Boolean.FALSE);
                } else {
                    if (intExtra != 12) {
                        return;
                    }
                    HMLog.info(this.tag, d.a);
                    this.onReceiveBlueState.invoke(Boolean.TRUE);
                }
            }
        }
    }
}
