package com.xiaomi.miot.core.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.IntRange;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.miot.core.BluetoothExtKt;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import defpackage.a23;
import defpackage.a33;
import defpackage.b23;
import defpackage.e7r;
import defpackage.ht2;
import defpackage.mr2;
import defpackage.qr2;
import defpackage.x82;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u00016B\t\b\u0002¢\u0006\u0004\b4\u00105J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0019R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140*0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100*0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/xiaomi/miot/core/bluetooth/BluetoothManager;", "", "Landroid/content/Context;", "context", "Lcom/xiaomi/miot/core/bluetooth/TransferLogger;", "logger", "", "init", "(Landroid/content/Context;Lcom/xiaomi/miot/core/bluetooth/TransferLogger;)V", "La33;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addBluetoothStateListener", "(La33;)V", "removeBluetoothStateListener", "", "mac", "Lb23;", "addConnectStatusListener", "(Ljava/lang/String;Lb23;)V", "removeConnectStatusListener", "La23;", "addBluetoothBondListener", "(Ljava/lang/String;La23;)V", "removeBluetoothBondListener", "unregisterConnectProxy", "(Ljava/lang/String;)V", "", "supportLargerMtu", "clearCacheWhenDisconnected", "Le7r;", "createBleManager", "(ZZ)Le7r;", "Lx82;", "createMIUIBleManager", "(ZZ)Lx82;", "channel", "Ljava/lang/String;", "getChannel", "()Ljava/lang/String;", "setChannel", "mContext", "Landroid/content/Context;", "", "mStateListeners", "Ljava/util/List;", "", "mBondStateListeners", "Ljava/util/Map;", "mConnectStateListeners", "Lqr2;", "mBleManagerCallbacks", "Lqr2;", "<init>", "()V", "Companion", "miot-core_release"}, k = 1, mv = {2, 0, 0})
public final class BluetoothManager {

    @NotNull
    private static final String TAG = "Wearable";

    @Nullable
    private String channel;
    private Context mContext;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<BluetoothManager> sInstance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: p23
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BluetoothManager.sInstance_delegate$lambda$0();
        }
    });

    @NotNull
    private final List<a33> mStateListeners = new CopyOnWriteArrayList();

    @NotNull
    private final Map<String, List<a23>> mBondStateListeners = new ConcurrentHashMap();

    @NotNull
    private final Map<String, List<b23>> mConnectStateListeners = new ConcurrentHashMap();

    @NotNull
    private final qr2 mBleManagerCallbacks = new qr2() { // from class: com.xiaomi.miot.core.bluetooth.BluetoothManager$mBleManagerCallbacks$1
        private final void onBondStateChanged(String mac, int bondState) {
            List list = (List) this.this$0.mBondStateListeners.get(mac);
            if (list != null) {
                Iterator it = new ArrayList(list).iterator();
                while (it.hasNext()) {
                    ((a23) it.next()).a(mac, bondState);
                }
            }
        }

        private final void onConnectStateChanged(String mac, int connectState) {
            List list = (List) this.this$0.mConnectStateListeners.get(mac);
            if (list != null) {
                Iterator it = new ArrayList(list).iterator();
                while (it.hasNext()) {
                    ((b23) it.next()).onConnectStateChanged(mac, connectState);
                }
            }
        }

        private final void onServiceDiscovered(String mac) {
            List list = (List) this.this$0.mConnectStateListeners.get(mac);
            if (list != null) {
                Iterator it = new ArrayList(list).iterator();
                while (it.hasNext()) {
                    ((b23) it.next()).onServiceDiscovered(mac);
                }
            }
        }

        @Override // defpackage.qr2
        @Deprecated
        public /* bridge */ /* synthetic */ void onBatteryValueReceived(BluetoothDevice bluetoothDevice, @IntRange(from = 0, to = 100) int i) {
            super.onBatteryValueReceived(bluetoothDevice, i);
        }

        @Override // defpackage.qr2
        public void onBonded(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            String address = device.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            onBondStateChanged(address, 12);
        }

        @Override // defpackage.qr2
        public void onBondingFailed(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            String address = device.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            onBondStateChanged(address, 10);
        }

        @Override // defpackage.qr2
        public void onBondingRequired(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            String address = device.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            onBondStateChanged(address, 11);
        }

        @Override // defpackage.qr2
        public void onDeviceConnected(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            String address = device.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            onConnectStateChanged(address, 2);
        }

        @Override // defpackage.qr2
        public void onDeviceConnecting(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
        }

        @Override // defpackage.qr2
        public void onDeviceDisconnected(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            String address = device.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            onConnectStateChanged(address, 0);
        }

        @Override // defpackage.qr2
        public void onDeviceDisconnecting(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
        }

        @Override // defpackage.qr2
        public void onDeviceNotSupported(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
        }

        @Override // defpackage.qr2
        public void onDeviceReady(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            StringBuilder sb = new StringBuilder();
            sb.append("onDeviceReady: ");
            sb.append(device);
        }

        @Override // defpackage.qr2
        public void onError(BluetoothDevice device, String message, int errorCode) {
            Intrinsics.checkNotNullParameter(device, "device");
            Intrinsics.checkNotNullParameter(message, "message");
        }

        @Override // defpackage.qr2
        public void onLinkLossOccurred(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            String address = device.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            onConnectStateChanged(address, 0);
        }

        @Override // defpackage.qr2
        public void onServicesDiscovered(BluetoothDevice device, boolean optionalServicesFound) {
            Intrinsics.checkNotNullParameter(device, "device");
            String address = device.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            onServiceDiscovered(address);
        }

        @Override // defpackage.qr2
        @Deprecated
        public /* bridge */ /* synthetic */ boolean shouldEnableBatteryLevelNotifications(BluetoothDevice bluetoothDevice) {
            return super.shouldEnableBatteryLevelNotifications(bluetoothDevice);
        }
    };

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/miot/core/bluetooth/BluetoothManager$Companion;", "", "<init>", "()V", "TAG", "", "sInstance", "Lcom/xiaomi/miot/core/bluetooth/BluetoothManager;", "getSInstance", "()Lcom/xiaomi/miot/core/bluetooth/BluetoothManager;", "sInstance$delegate", "Lkotlin/Lazy;", "get", "miot-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final BluetoothManager getSInstance() {
            return (BluetoothManager) BluetoothManager.sInstance$delegate.getValue();
        }

        @JvmStatic
        @NotNull
        public final BluetoothManager get() {
            return getSInstance();
        }
    }

    private BluetoothManager() {
        mr2.d(new mr2.b() { // from class: com.xiaomi.miot.core.bluetooth.BluetoothManager.1
            private String logTag = "Wearable.ble";

            @Override // mr2.b
            public void d(String tag, String message) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(message, "message");
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(tag);
                sb.append("] ");
                sb.append(message);
            }

            @Override // mr2.b
            public void e(String tag, String message) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(message, "message");
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(tag);
                sb.append("] ");
                sb.append(message);
            }

            public final String getLogTag() {
                return this.logTag;
            }

            public void i(String tag, String message) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(message, "message");
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(tag);
                sb.append("] ");
                sb.append(message);
            }

            public final void setLogTag(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.logTag = str;
            }

            @Override // mr2.b
            public void w(String tag, String message) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                Intrinsics.checkNotNullParameter(message, "message");
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(tag);
                sb.append("] ");
                sb.append(message);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final BluetoothManager get() {
        return INSTANCE.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BluetoothManager sInstance_delegate$lambda$0() {
        return new BluetoothManager();
    }

    public final void addBluetoothBondListener(@NotNull String mac, @NotNull a23 listener) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<a23> arrayList = this.mBondStateListeners.get(mac);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mBondStateListeners.put(mac, arrayList);
        }
        if (arrayList.contains(listener)) {
            return;
        }
        arrayList.add(listener);
    }

    public final void addBluetoothStateListener(@NotNull a33 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.mStateListeners.contains(listener)) {
            return;
        }
        this.mStateListeners.add(listener);
    }

    public final void addConnectStatusListener(@NotNull String mac, @NotNull b23 listener) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<b23> arrayList = this.mConnectStateListeners.get(mac);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mConnectStateListeners.put(mac, arrayList);
        }
        if (arrayList.contains(listener)) {
            return;
        }
        arrayList.add(listener);
    }

    @NotNull
    public final e7r createBleManager(boolean supportLargerMtu, boolean clearCacheWhenDisconnected) {
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        return new e7r(context, this.mBleManagerCallbacks, supportLargerMtu, clearCacheWhenDisconnected);
    }

    @NotNull
    public final x82 createMIUIBleManager(boolean supportLargerMtu, boolean clearCacheWhenDisconnected) {
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        return new x82(context, supportLargerMtu, this.mBleManagerCallbacks, clearCacheWhenDisconnected);
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    public final void init(@NotNull Context context, @NotNull TransferLogger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.mContext = context;
        BluetoothExtKt.setContext(context);
        TransferLoggerKt.setLogger(logger);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.miot.core.bluetooth.BluetoothManager$init$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
                if (intExtra == 10 || intExtra == 12) {
                    Iterator it = this.this$0.mStateListeners.iterator();
                    while (it.hasNext()) {
                        ((a33) it.next()).onStateChanged(intExtra);
                    }
                }
            }
        };
        Context context2 = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Context context3 = this.mContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context2 = context3;
            }
            context2.registerReceiver(broadcastReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
            return;
        }
        Context context4 = this.mContext;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        } else {
            context2 = context4;
        }
        context2.registerReceiver(broadcastReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    public final void removeBluetoothBondListener(@NotNull String mac, @NotNull a23 listener) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<a23> list = this.mBondStateListeners.get(mac);
        if (list != null) {
            list.remove(listener);
        }
    }

    public final void removeBluetoothStateListener(@NotNull a33 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mStateListeners.remove(listener);
    }

    public final void removeConnectStatusListener(@NotNull String mac, @NotNull b23 listener) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<b23> list = this.mConnectStateListeners.get(mac);
        if (list != null) {
            list.remove(listener);
        }
    }

    public final void setChannel(@Nullable String str) {
        this.channel = str;
    }

    public final void unregisterConnectProxy(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        StringBuilder sb = new StringBuilder();
        sb.append("unregisterConnectProxy() called with: mac = ");
        sb.append(mac);
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        new x82(context, true, this.mBleManagerCallbacks, false).E1(mac, true, new ht2<String>() { // from class: com.xiaomi.miot.core.bluetooth.BluetoothManager.unregisterConnectProxy.1
            @Override // defpackage.ht2
            public void onFailed(int status) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unregisterConnectProxy onFailed() called with: status = ");
                sb2.append(status);
            }

            @Override // defpackage.ht2
            public void onResponse(String data) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unregisterConnectProxy onResponse() called with: data = ");
                sb2.append(data);
            }
        });
    }
}
