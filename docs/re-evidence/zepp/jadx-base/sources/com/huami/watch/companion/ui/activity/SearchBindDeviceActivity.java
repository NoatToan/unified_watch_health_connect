package com.huami.watch.companion.ui.activity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.R;
import com.huami.watch.companion.event.SearchWatchErrorEvent;
import com.huami.watch.companion.ui.activity.SearchBindDeviceActivity;
import com.huami.watch.companion.ui.adapter.BleDeviceBindEvent;
import com.huami.watch.companion.ui.adapter.NearbyDeviceAdapter;
import com.huami.watch.companion.ui.callback.SearchBindCallback;
import com.huami.watch.companion.ui.view.ScanView;
import com.huami.watch.companion.util.BindBaseLogicHelper;
import com.huami.watch.companion.util.BindBaseLogicProxy;
import com.huami.watch.util.BTUtil;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.tencent.open.SocialConstants;
import com.xiaomi.hm.health.bt.device.HMAmazfitDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\b*\u00012\u0018\u0000 72\u00020\u0001:\u000278B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u0016\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR2\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\u001fj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 `!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u00101\u001a\n .*\u0004\u0018\u00010-0-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103¨\u00069"}, d2 = {"Lcom/huami/watch/companion/ui/activity/SearchBindDeviceActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "t", "initData", "w", "initView", SOAP.XMLNS, LogUtil.D, "E", "", "localName", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "v", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Landroid/bluetooth/BluetoothDevice;", "device", "", ConstantKt.KEY_RSSI, "handleDevice", "Lcom/huami/watch/companion/ui/adapter/NearbyDeviceAdapter;", "x", "Lcom/huami/watch/companion/ui/adapter/NearbyDeviceAdapter;", "mNearbyDeviceAdapter", "", "y", "Z", "firstFoundNewDevice", "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lkotlin/collections/HashMap;", "z", "Ljava/util/HashMap;", "boundDevicesMap", "Landroid/bluetooth/BluetoothAdapter;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Lcom/huami/watch/companion/ui/callback/SearchBindCallback;", "B", "Lcom/huami/watch/companion/ui/callback/SearchBindCallback;", "bleScanCallback", "Lcom/xiaomi/hm/health/bt/scan/BleScanOption;", "kotlin.jvm.PlatformType", "C", "Lcom/xiaomi/hm/health/bt/scan/BleScanOption;", "scanOption", "com/huami/watch/companion/ui/activity/SearchBindDeviceActivity$receiver$1", "Lcom/huami/watch/companion/ui/activity/SearchBindDeviceActivity$receiver$1;", SocialConstants.PARAM_RECEIVER, "<init>", "()V", "Companion", "DeviceState", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class SearchBindDeviceActivity extends BaseTitleActivity {
    private static final long E = 15;
    private static final long F = 10;
    private static final short G = -100;

    @NotNull
    public static final String TAG = "SearchBindDevice";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final SearchBindCallback bleScanCallback;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final BleScanOption scanOption;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final SearchBindDeviceActivity$receiver$1 receiver;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private NearbyDeviceAdapter mNearbyDeviceAdapter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean firstFoundNewDevice;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private HashMap<String, HMDeviceType> boundDevicesMap = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b-\u0010.J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\rHÆ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/huami/watch/companion/ui/activity/SearchBindDeviceActivity$DeviceState;", "", "other", "", "equals", "", "hashCode", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "component1", "", "component2", "Landroid/bluetooth/BluetoothDevice;", "component3", "", "component4", "source", "deviceName", "device", ConstantKt.KEY_RSSI, "copy", "toString", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "setSource", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "b", "Ljava/lang/String;", "getDeviceName", "()Ljava/lang/String;", "setDeviceName", "(Ljava/lang/String;)V", "c", "Landroid/bluetooth/BluetoothDevice;", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "setDevice", "(Landroid/bluetooth/BluetoothDevice;)V", GoogleApiAvailabilityLight.a, ExifInterface.LATITUDE_SOUTH, "getRssi", "()S", "setRssi", "(S)V", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;S)V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class DeviceState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        private HMDeviceSource source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private String deviceName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        private BluetoothDevice device;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private short rssi;

        public DeviceState(@Nullable HMDeviceSource hMDeviceSource, @NotNull String str, @Nullable BluetoothDevice bluetoothDevice, short s) {
            this.source = hMDeviceSource;
            this.deviceName = str;
            this.device = bluetoothDevice;
            this.rssi = s;
        }

        public static /* synthetic */ DeviceState copy$default(DeviceState deviceState, HMDeviceSource hMDeviceSource, String str, BluetoothDevice bluetoothDevice, short s, int i, Object obj) {
            if ((i & 1) != 0) {
                hMDeviceSource = deviceState.source;
            }
            if ((i & 2) != 0) {
                str = deviceState.deviceName;
            }
            if ((i & 4) != 0) {
                bluetoothDevice = deviceState.device;
            }
            if ((i & 8) != 0) {
                s = deviceState.rssi;
            }
            return deviceState.copy(hMDeviceSource, str, bluetoothDevice, s);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMDeviceSource getSource() {
            return this.source;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDeviceName() {
            return this.deviceName;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final BluetoothDevice getDevice() {
            return this.device;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final short getRssi() {
            return this.rssi;
        }

        @NotNull
        public final DeviceState copy(@Nullable HMDeviceSource source, @NotNull String deviceName, @Nullable BluetoothDevice device, short rssi) {
            return new DeviceState(source, deviceName, device, rssi);
        }

        public boolean equals(@Nullable Object other) {
            BluetoothDevice bluetoothDevice = this.device;
            if (bluetoothDevice == null || other == null || !(other instanceof DeviceState)) {
                return false;
            }
            String address = bluetoothDevice.getAddress();
            return address == null ? false : address.equals(((DeviceState) other).device.getAddress());
        }

        @Nullable
        public final BluetoothDevice getDevice() {
            return this.device;
        }

        @NotNull
        public final String getDeviceName() {
            return this.deviceName;
        }

        public final short getRssi() {
            return this.rssi;
        }

        @Nullable
        public final HMDeviceSource getSource() {
            return this.source;
        }

        public int hashCode() {
            HMDeviceSource hMDeviceSource = this.source;
            int iHashCode = (((hMDeviceSource == null ? 0 : hMDeviceSource.hashCode()) * 31) + this.deviceName.hashCode()) * 31;
            BluetoothDevice bluetoothDevice = this.device;
            return ((iHashCode + (bluetoothDevice != null ? bluetoothDevice.hashCode() : 0)) * 31) + this.rssi;
        }

        public final void setDevice(@Nullable BluetoothDevice bluetoothDevice) {
            this.device = bluetoothDevice;
        }

        public final void setDeviceName(@NotNull String str) {
            this.deviceName = str;
        }

        public final void setRssi(short s) {
            this.rssi = s;
        }

        public final void setSource(@Nullable HMDeviceSource hMDeviceSource) {
            this.source = hMDeviceSource;
        }

        @NotNull
        public String toString() {
            return "DeviceState(source=" + this.source + ", deviceName=" + this.deviceName + ", device=" + this.device + ", rssi=" + ((int) this.rssi) + ")";
        }
    }

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
            return "address: " + this.a.getAddress();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "已连接";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMDeviceSource hMDeviceSource) {
            super(0);
            this.a = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "source: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "amazfitDeviceSupport: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "miliDeviceSupport: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "miliProDeviceSupport: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ui/activity/SearchBindDeviceActivity$DeviceState;", "state", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<DeviceState, Unit> {
        public g() {
            super(1);
        }

        public final void a(@NotNull DeviceState deviceState) {
            RxBus.get().post(new BleDeviceBindEvent(deviceState, SearchBindDeviceActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeviceState deviceState) {
            a(deviceState);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.watch.companion.ui.activity.SearchBindDeviceActivity$receiver$1] */
    public SearchBindDeviceActivity() {
        SearchBindCallback searchBindCallback = new SearchBindCallback(this);
        this.bleScanCallback = searchBindCallback;
        this.scanOption = new BleScanOption.Builder().needConnectedDevices(false).callback(searchBindCallback).build();
        this.receiver = new BroadcastReceiver() { // from class: com.huami.watch.companion.ui.activity.SearchBindDeviceActivity$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                String action = intent.getAction();
                if (action != null && action.hashCode() == 1167529923 && action.equals("android.bluetooth.device.action.FOUND")) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    Bundle extras = intent.getExtras();
                    short s = extras == null ? (short) -100 : extras.getShort("android.bluetooth.device.extra.RSSI");
                    if (bluetoothDevice == null) {
                        return;
                    }
                    this.a.handleDevice(bluetoothDevice, s);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(final SearchBindDeviceActivity searchBindDeviceActivity, boolean z) {
        BTUtil.cancelDiscovery();
        if (searchBindDeviceActivity.firstFoundNewDevice && z) {
            return;
        }
        RxBus.get().post(new SearchWatchErrorEvent(searchBindDeviceActivity, new Runnable() { // from class: tk6
            @Override // java.lang.Runnable
            public final void run() {
                SearchBindDeviceActivity.B(this.a);
            }
        }, new Runnable() { // from class: uk6
            @Override // java.lang.Runnable
            public final void run() {
                SearchBindDeviceActivity.C(this.a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SearchBindDeviceActivity searchBindDeviceActivity) {
        searchBindDeviceActivity.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(SearchBindDeviceActivity searchBindDeviceActivity) {
        searchBindDeviceActivity.finish();
    }

    private final void D() {
        BleScanCenter.getInstance().startScan(this.scanOption);
    }

    private final void E() {
        BleScanCenter.getInstance().stopScan(this.scanOption);
    }

    private final void initData() {
        BindBaseLogicHelper.Companion companion = BindBaseLogicHelper.INSTANCE;
        BindBaseLogicProxy bindBaseLogicProxy = companion.getBindBaseLogicProxy();
        HashMap<String, HMDeviceType> boundDevices = bindBaseLogicProxy == null ? null : bindBaseLogicProxy.getBoundDevices(HMDeviceType.MILI);
        BindBaseLogicProxy bindBaseLogicProxy2 = companion.getBindBaseLogicProxy();
        HashMap<String, HMDeviceType> boundDevices2 = bindBaseLogicProxy2 != null ? bindBaseLogicProxy2.getBoundDevices(HMDeviceType.WATCH) : null;
        if (boundDevices != null) {
            this.boundDevicesMap.putAll(boundDevices);
        }
        if (boundDevices2 == null) {
            return;
        }
        this.boundDevicesMap.putAll(boundDevices2);
    }

    private final void initView() {
        NearbyDeviceAdapter nearbyDeviceAdapter = new NearbyDeviceAdapter(this);
        this.mNearbyDeviceAdapter = nearbyDeviceAdapter;
        nearbyDeviceAdapter.setItemClickListener(new g());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvNearbyDevice);
        NearbyDeviceAdapter nearbyDeviceAdapter2 = this.mNearbyDeviceAdapter;
        if (nearbyDeviceAdapter2 == null) {
            nearbyDeviceAdapter2 = null;
        }
        recyclerView.setAdapter(nearbyDeviceAdapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        ((Button) findViewById(R.id.tv_put_aside)).setOnClickListener(new View.OnClickListener() { // from class: ok6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchBindDeviceActivity.u(this.a, view);
            }
        });
        ((ScanView) findViewById(R.id.loadingView)).startScan();
    }

    private final void s() {
        this.bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    }

    private final void t() {
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.s36), !RainbowUtils.isDarkMode(this));
        getRightTitle().setVisibility(8);
        getWindow().setBackgroundDrawable(null);
        ((FrameLayout) findViewById(R.id.common_title_content_parent)).setBackgroundResource(R.color.s10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SearchBindDeviceActivity searchBindDeviceActivity, View view) {
        searchBindDeviceActivity.E();
        BTUtil.cancelDiscovery();
        searchBindDeviceActivity.finish();
    }

    private final HMDeviceSource v(String localName) {
        if (TextUtils.isEmpty(localName)) {
            return null;
        }
        HMDeviceSource hMDeviceSourceNameToSource = HMMiLiDevice.nameToSource(localName);
        if (hMDeviceSourceNameToSource == null) {
            hMDeviceSourceNameToSource = HMMiLiProDevice.nameToSource(localName);
        }
        return hMDeviceSourceNameToSource == null ? HMAmazfitDevice.nameToSource(localName) : hMDeviceSourceNameToSource;
    }

    private final void w() {
        Rx.io(new ObservableOnSubscribe() { // from class: pk6
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                SearchBindDeviceActivity.x(this.a, observableEmitter);
            }
        }).observable().delay(15L, TimeUnit.SECONDS).flatMap(new Function() { // from class: sk6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SearchBindDeviceActivity.y(this.a, (Boolean) obj);
            }
        }).safeSubscribe(Rx.safeObserver(new Consumer() { // from class: rk6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchBindDeviceActivity.A(this.a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(SearchBindDeviceActivity searchBindDeviceActivity, ObservableEmitter observableEmitter) {
        searchBindDeviceActivity.D();
        observableEmitter.onNext(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource y(SearchBindDeviceActivity searchBindDeviceActivity, Boolean bool) {
        searchBindDeviceActivity.E();
        return Rx.io(new ObservableOnSubscribe() { // from class: qk6
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                SearchBindDeviceActivity.z(observableEmitter);
            }
        }).delay(10L, TimeUnit.SECONDS).observable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(ObservableEmitter observableEmitter) {
        BTUtil.startDiscovery();
        observableEmitter.onNext(Boolean.TRUE);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void handleDevice(@NotNull BluetoothDevice device, short rssi) {
        BindBaseLogicProxy bindBaseLogicProxy;
        String bluetoothDeviceName = GattUtils.getBluetoothDeviceName(device);
        if (bluetoothDeviceName == null || (bindBaseLogicProxy = BindBaseLogicHelper.INSTANCE.getBindBaseLogicProxy()) == null || !bindBaseLogicProxy.isWatch(HMMiLiProDevice.nameToSource(bluetoothDeviceName))) {
            return;
        }
        HMLog.info(TAG, new a(device));
        if (this.boundDevicesMap.size() > 0 && this.boundDevicesMap.get(device.getAddress()) != null) {
            HMLog.info(TAG, b.a);
            return;
        }
        boolean zIsSupportDeviceName = HMMiLiDevice.isSupportDeviceName(bluetoothDeviceName);
        HMLog.info(TAG, new e(zIsSupportDeviceName));
        boolean zIsSupportDeviceName2 = HMMiLiProDevice.isSupportDeviceName(bluetoothDeviceName);
        HMLog.info(TAG, new f(zIsSupportDeviceName2));
        boolean zIsSupportDeviceName3 = HMAmazfitDevice.isSupportDeviceName(bluetoothDeviceName);
        HMLog.info(TAG, new d(zIsSupportDeviceName3));
        if (zIsSupportDeviceName || zIsSupportDeviceName2 || zIsSupportDeviceName3) {
            HMDeviceSource hMDeviceSourceV = v(bluetoothDeviceName);
            HMLog.info(TAG, new c(hMDeviceSourceV));
            String officialName = bindBaseLogicProxy.getOfficialName(hMDeviceSourceV);
            if (hMDeviceSourceV != null) {
                if (!this.firstFoundNewDevice) {
                    ((TextView) findViewById(R.id.tv_search_title)).setText(getString(R.string.bind_found_nearby_watch));
                    ((TextView) findViewById(R.id.tv_search_sub_title)).setText(getString(R.string.bind_found_watch));
                    this.firstFoundNewDevice = true;
                }
                NearbyDeviceAdapter nearbyDeviceAdapter = this.mNearbyDeviceAdapter;
                if (nearbyDeviceAdapter == null) {
                    nearbyDeviceAdapter = null;
                }
                nearbyDeviceAdapter.addData(new DeviceState(hMDeviceSourceV, officialName, device, rssi));
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_bind_device);
        t();
        initView();
        initData();
        s();
        w();
        registerReceiver(this.receiver, new IntentFilter("android.bluetooth.device.action.FOUND"));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.receiver);
        ((ScanView) findViewById(R.id.loadingView)).stopScan();
    }
}
