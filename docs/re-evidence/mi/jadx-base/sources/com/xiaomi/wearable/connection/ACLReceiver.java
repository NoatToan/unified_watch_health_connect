package com.xiaomi.wearable.connection;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.wearable.connection.ACLReceiver;
import com.xiaomi.wearable.core.CoreExtKt;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002%&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005J\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0005J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/xiaomi/wearable/connection/ACLReceiver;", "", "<init>", "()V", "TAG", "", "aclReceiver", "Lcom/xiaomi/wearable/connection/ACLReceiver$Receiver;", "getAclReceiver", "()Lcom/xiaomi/wearable/connection/ACLReceiver$Receiver;", "aclReceiver$delegate", "Lkotlin/Lazy;", "map", "Ljava/util/HashMap;", "Lcom/xiaomi/wearable/connection/ACLReceiver$OnACLReceiver;", "adapter", "Landroid/bluetooth/BluetoothAdapter;", "kotlin.jvm.PlatformType", "Landroid/bluetooth/BluetoothAdapter;", "getIsConnectedMethod", "Ljava/lang/reflect/Method;", "getGetIsConnectedMethod", "()Ljava/lang/reflect/Method;", "getIsConnectedMethod$delegate", LoginPreferenceConfig.TYPE_REGISTER, "", "getConnectionState", "", Home.JSON_KEY_ADDRESS, "addReceiver", "receiver", "removeReceiver", "notifyReceiver", "device", "Landroid/bluetooth/BluetoothDevice;", "connected", "unregisterReceiver", "OnACLReceiver", "Receiver", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ACLReceiver {

    @NotNull
    private static final String TAG = "ACLReceiver";

    @NotNull
    public static final ACLReceiver INSTANCE = new ACLReceiver();

    /* JADX INFO: renamed from: aclReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy aclReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ACLReceiver.aclReceiver_delegate$lambda$0();
        }
    });

    @NotNull
    private static final HashMap<String, OnACLReceiver> map = new HashMap<>();
    private static final BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();

    /* JADX INFO: renamed from: getIsConnectedMethod$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy getIsConnectedMethod = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: b0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ACLReceiver.getIsConnectedMethod_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/wearable/connection/ACLReceiver$OnACLReceiver;", "", "onReceive", "", "mac", "", "connected", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnACLReceiver {
        void onReceive(@NotNull String mac, boolean connected);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/wearable/connection/ACLReceiver$Receiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Receiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null) {
                CoreExtKt.getLogger().i(ACLReceiver.TAG, "receive acl connect event device is null");
                return;
            }
            CoreExtKt.getLogger().i(ACLReceiver.TAG, "onReceive() called with: context = " + bluetoothDevice);
            ACLReceiver.INSTANCE.notifyReceiver(bluetoothDevice, Intrinsics.areEqual(intent.getAction(), "android.bluetooth.device.action.ACL_CONNECTED"));
        }
    }

    private ACLReceiver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Receiver aclReceiver_delegate$lambda$0() {
        return new Receiver();
    }

    private final Receiver getAclReceiver() {
        return (Receiver) aclReceiver.getValue();
    }

    private final Method getGetIsConnectedMethod() {
        return (Method) getIsConnectedMethod.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getIsConnectedMethod_delegate$lambda$1() {
        try {
            return BluetoothDevice.class.getMethod("isConnected", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyReceiver(BluetoothDevice device, boolean connected) {
        OnACLReceiver onACLReceiver = map.get(device.getAddress());
        if (onACLReceiver != null) {
            String address = device.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            onACLReceiver.onReceive(address, connected);
        }
    }

    private final void unregisterReceiver() {
        try {
            com.xiaomi.wearable.CoreExtKt.getContext().unregisterReceiver(getAclReceiver());
        } catch (Exception unused) {
        }
    }

    public final void addReceiver(@NotNull String address, @NotNull OnACLReceiver receiver) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        HashMap<String, OnACLReceiver> map2 = map;
        if (map2.containsKey(address)) {
            return;
        }
        map2.put(address, receiver);
    }

    public final boolean getConnectionState(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        boolean zBooleanValue = false;
        try {
            BluetoothDevice remoteDevice = adapter.getRemoteDevice(address);
            Method getIsConnectedMethod2 = getGetIsConnectedMethod();
            Object objInvoke = getIsConnectedMethod2 != null ? getIsConnectedMethod2.invoke(remoteDevice, new Object[0]) : null;
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            zBooleanValue = ((Boolean) objInvoke).booleanValue();
        } catch (Exception unused) {
        }
        CoreExtKt.getLogger().i(TAG, "getConnectionState() called with: address = " + address + ", " + zBooleanValue);
        return zBooleanValue;
    }

    public final void register() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                com.xiaomi.wearable.CoreExtKt.getContext().registerReceiver(getAclReceiver(), intentFilter, 2);
            } else {
                com.xiaomi.wearable.CoreExtKt.getContext().registerReceiver(getAclReceiver(), intentFilter);
            }
        } catch (Exception unused) {
        }
    }

    public final void removeReceiver(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        map.remove(address);
    }
}
