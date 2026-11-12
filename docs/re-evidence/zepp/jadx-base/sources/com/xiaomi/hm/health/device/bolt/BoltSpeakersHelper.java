package com.xiaomi.hm.health.device.bolt;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.tools.analytics.DbUtils;
import com.tencent.open.SocialConstants;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B<\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R4\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010 \u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/device/bolt/BoltSpeakersHelper;", "", "", WifiSetActivity.KEY_CONNECT, ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, MiPushClient.COMMAND_UNREGISTER, "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "connectState", "c", "Lkotlin/jvm/functions/Function1;", "getConnectStateListener", "()Lkotlin/jvm/functions/Function1;", "connectStateListener", "Landroid/bluetooth/BluetoothAdapter;", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "Landroid/bluetooth/BluetoothAdapter;", "adapter", "Landroid/bluetooth/BluetoothDevice;", "e", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Landroid/bluetooth/BluetoothA2dp;", "f", "Landroid/bluetooth/BluetoothA2dp;", "a2dp", "Landroid/content/BroadcastReceiver;", "g", "Landroid/content/BroadcastReceiver;", SocialConstants.PARAM_RECEIVER, "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BoltSpeakersHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function1<Integer, Unit> connectStateListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final BluetoothAdapter adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final BluetoothDevice bluetoothDevice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private BluetoothA2dp a2dp;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private BroadcastReceiver receiver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/bolt/BoltSpeakersHelper$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "connectState", "", "connectStateListener", "Lcom/xiaomi/hm/health/device/bolt/BoltSpeakersHelper;", "newInstance", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BoltSpeakersHelper newInstance(@NotNull Context context, @NotNull String address, @NotNull Function1<? super Integer, Unit> connectStateListener) {
            return new BoltSpeakersHelper(context, address, connectStateListener, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BoltSpeakersHelper(Context context, String str, Function1<? super Integer, Unit> function1) {
        this.context = context;
        this.address = str;
        this.connectStateListener = function1;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.adapter = defaultAdapter;
        this.bluetoothDevice = defaultAdapter.getRemoteDevice(str);
        this.receiver = new BroadcastReceiver() { // from class: com.xiaomi.hm.health.device.bolt.BoltSpeakersHelper.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context2, @Nullable Intent intent) {
                if (intent != null && Intrinsics.areEqual(intent.getAction(), "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (Intrinsics.areEqual(BoltSpeakersHelper.this.getAddress(), bluetoothDevice == null ? null : bluetoothDevice.getAddress())) {
                        BoltSpeakersHelper.this.getConnectStateListener().invoke(Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0)));
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
        defaultAdapter.getProfileProxy(context, new BluetoothProfile.ServiceListener() { // from class: com.xiaomi.hm.health.device.bolt.BoltSpeakersHelper.2
            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceConnected(int profile, @Nullable BluetoothProfile proxy) {
                BoltSpeakersHelper.this.a2dp = (BluetoothA2dp) proxy;
                BluetoothA2dp bluetoothA2dp = BoltSpeakersHelper.this.a2dp;
                if (bluetoothA2dp == null) {
                    return;
                }
                BoltSpeakersHelper boltSpeakersHelper = BoltSpeakersHelper.this;
                if (bluetoothA2dp.getConnectionState(boltSpeakersHelper.bluetoothDevice) == 2) {
                    boltSpeakersHelper.getConnectStateListener().invoke(2);
                } else {
                    boltSpeakersHelper.getConnectStateListener().invoke(0);
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceDisconnected(int profile) {
            }
        }, 2);
        context.registerReceiver(this.receiver, intentFilter);
    }

    public /* synthetic */ BoltSpeakersHelper(Context context, String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, function1);
    }

    public final void connect() throws IllegalAccessException, InvocationTargetException {
        Method method;
        BluetoothA2dp bluetoothA2dp = this.a2dp;
        if (bluetoothA2dp == null || (method = bluetoothA2dp.getClass().getMethod(WifiSetActivity.KEY_CONNECT, BluetoothDevice.class)) == null) {
            return;
        }
        method.invoke(this.a2dp, this.bluetoothDevice);
    }

    public final void disconnect() throws IllegalAccessException, InvocationTargetException {
        Method method;
        BluetoothA2dp bluetoothA2dp = this.a2dp;
        if (bluetoothA2dp == null || (method = bluetoothA2dp.getClass().getMethod(ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, BluetoothDevice.class)) == null) {
            return;
        }
        method.invoke(this.a2dp, this.bluetoothDevice);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final Function1<Integer, Unit> getConnectStateListener() {
        return this.connectStateListener;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void unregister() {
        this.context.unregisterReceiver(this.receiver);
    }
}
