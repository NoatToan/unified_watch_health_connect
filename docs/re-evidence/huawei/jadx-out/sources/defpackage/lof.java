package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BluetoothDialogCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceHfpStateCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwbtsdk.btdatatype.callback.IAddDeviceStateCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import com.huawei.hwbtsdk.btdatatype.datatype.OperationDeviceInfo;
import com.huawei.hwbtsdk.btmanager.btdeviceservice.BTDeviceServiceBase;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.BuildConfigProperties;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lof {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f40541a;
    private static Context h;
    private static lof j;
    private BluetoothDialogCallback aa;
    private final BtDeviceHfpStateCallback l;
    private BTDeviceMgrUtil o;
    private final BtSwitchStateCallback q;
    private List<String> z;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40543c = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40542b = new Object();
    private static Map<String, lnv> i = new HashMap(16);
    private static ConcurrentHashMap<String, lnx> g = new ConcurrentHashMap<>(16);
    private BtDeviceStateCallback t = null;
    private IAddDeviceStateCallback k = null;
    private List<BluetoothDeviceNode> n = new ArrayList(16);
    private List<String> u = new ArrayList(16);
    private List<String> v = new ArrayList(16);
    private int p = -1;
    private String f = "";
    private boolean x = false;
    private int ad = -1;
    private boolean w = false;
    private ConcurrentHashMap<String, String> m = new ConcurrentHashMap<>(16);
    private BtDeviceDiscoverCallback y = new BtDeviceDiscoverCallback() { // from class: lof.1
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryCanceled() {
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onFailure(int i2, String str) {
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscovered(BluetoothDeviceNode bluetoothDeviceNode, int i2, byte[] bArr) {
            if (bluetoothDeviceNode != null) {
                lof.this.b(bluetoothDeviceNode, i2);
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryFinished() {
            LogUtil.b("BTSDKApi", "onDeviceDiscoveryFinished");
            synchronized (lof.f40543c) {
                if (lof.this.aa != null) {
                    lof.this.aa.onScanFinished();
                }
            }
        }
    };
    private BtDeviceStateCallback r = new BtDeviceStateCallback() { // from class: lof.2
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
        public void onAckReceived(DeviceInfo deviceInfo, int i2, byte[] bArr) {
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
        public void onDeviceConnectionStateChanged(DeviceInfo deviceInfo, int i2, OperationDeviceInfo operationDeviceInfo) {
            if (deviceInfo == null) {
                LogUtil.e("BTSDKApi", "onDeviceConnectionStateChanged btDeviceInfo is null");
            } else {
                LogUtil.b("BTSDKApi", "onDeviceConnectionStateChanged with btState: ", Integer.valueOf(i2));
                lof.this.d(deviceInfo, i2, operationDeviceInfo);
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
        public void onDataReceived(DeviceInfo deviceInfo, int i2, byte[] bArr) {
            if (deviceInfo != null) {
                if (lof.this.t != null) {
                    lof.this.t.onDataReceived(deviceInfo, i2, bArr);
                    return;
                }
                return;
            }
            LogUtil.e("BTSDKApi", "onDataReceived btDeviceInfo is null");
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
        public void disconnectBluetooth(DeviceInfo deviceInfo, int i2) {
            if (lof.this.t != null) {
                lof.this.t.disconnectBluetooth(deviceInfo, i2);
            }
        }
    };
    private final BtSwitchStateCallback s = new BtSwitchStateCallback() { // from class: lof.3
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
        public void onBtSwitchStateCallback(int i2) {
            LogUtil.b("BTSDKApi", "During add device then receive BT Switch state: ", Integer.valueOf(i2));
            if (i2 == 1) {
                lof.this.o.e(lof.this.s);
                if (lof.this.k != null) {
                    lof.this.k.onAddDeviceState(2);
                    return;
                }
                return;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        LogUtil.b("BTSDKApi", "mBtSwitchStateByAddDeviceCallback default");
                    }
                } else {
                    lof.this.o.e(lof.this.s);
                    if (lof.this.p == 0) {
                        lof.f40541a.sendEmptyMessage(5);
                    }
                }
            }
        }
    };

    private lof(Context context) {
        this.o = null;
        BtDeviceHfpStateCallback btDeviceHfpStateCallback = new BtDeviceHfpStateCallback() { // from class: lof.5
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceHfpStateCallback
            public void onBtDeviceHfpConnected(BluetoothDevice bluetoothDevice, String str) {
                if (bluetoothDevice == null) {
                    LogUtil.e("BTSDKApi", "mBtDeviceHfpStateCallback btDevice is null.");
                    return;
                }
                try {
                    LogUtil.b("BTSDKApi", "Enter onBTDeviceHFPConnected() deviceName :", bluetoothDevice.getName());
                    DeviceInfo deviceInfoD = lnt.d("reconnectDevices", bluetoothDevice.getAddress());
                    if (deviceInfoD != null && deviceInfoD.getDeviceActiveState() == 1 && !"AndroidWear".equalsIgnoreCase(deviceInfoD.getDeviceIdentify())) {
                        if (cqf.c(lof.h, deviceInfoD)) {
                            LogUtil.b("BTSDKApi", "Start to connect BT Device.");
                            String deviceIdentify = deviceInfoD.getDeviceIdentify();
                            String address = bluetoothDevice.getAddress();
                            if (deviceIdentify.equalsIgnoreCase(address)) {
                                lnv lnvVar = (lnv) lof.i.get(address);
                                if (lnvVar == null) {
                                    LogUtil.e("BTSDKApi", "preDeviceSendCommandUtil is null");
                                    return;
                                }
                                boolean zK = lnvVar.k();
                                BTDeviceServiceBase bTDeviceServiceBaseG = lnvVar.g();
                                int bTDeviceConnectState = bTDeviceServiceBaseG != null ? bTDeviceServiceBaseG.getBTDeviceConnectState() : 3;
                                LogUtil.b("BTSDKApi", "The connected hfp is the wanted device, isAvailable : ", Boolean.valueOf(zK));
                                if (deviceInfoD.getDeviceProtocol() == 2 && (deviceInfoD.getDeviceConnectState() == 5 || !zK)) {
                                    LogUtil.b("BTSDKApi", "Current is headset status, so do not need connect BR device.");
                                    return;
                                } else if (bTDeviceConnectState != 2) {
                                    lof.this.e(bluetoothDevice, str, deviceInfoD);
                                    return;
                                } else {
                                    LogUtil.b("BTSDKApi", "The service layer is connected successfully.");
                                    return;
                                }
                            }
                            LogUtil.b("BTSDKApi", "The connected hfp is not wanted device, so stop to connect spp.");
                            return;
                        }
                        return;
                    }
                    LogUtil.b("BTSDKApi", "Parameter is incorrect.");
                } catch (SecurityException e2) {
                    LogUtil.d("BTSDKApi", "mBtDeviceHfpStateCallback SecurityException:", ExceptionUtils.c(e2));
                }
            }
        };
        this.l = btDeviceHfpStateCallback;
        BtSwitchStateCallback btSwitchStateCallback = new BtSwitchStateCallback() { // from class: lof.4
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
            public void onBtSwitchStateCallback(int i2) {
                LogUtil.b("BTSDKApi", "Receive BT Switch state: ", Integer.valueOf(i2));
                ArrayList<DeviceInfo> arrayListA = lnt.a("reconnectDevices");
                if (i2 == 1) {
                    if (arrayListA != null && arrayListA.size() > 0) {
                        for (DeviceInfo deviceInfo : arrayListA) {
                            if (deviceInfo.getDeviceBluetoothType() == 2) {
                                LogUtil.b("BTSDKApi", "BT Switch off with identify: ", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()));
                                lnv lnvVar = (lnv) lof.i.get(deviceInfo.getDeviceIdentify());
                                if (lnvVar != null) {
                                    LogUtil.b("BTSDKApi", "Start to tell bt service switch info");
                                    lnvVar.c(1);
                                }
                            }
                        }
                    }
                    lof.this.q();
                    return;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            LogUtil.b("BTSDKApi", "mBtSwitchStateCallback default");
                        }
                    } else if (arrayListA != null) {
                        for (DeviceInfo deviceInfo2 : arrayListA) {
                            LogUtil.b("BTSDKApi", "Receive BT Switch deviceInfo :", Integer.valueOf(deviceInfo2.getDeviceBluetoothType()), ";active state:", Integer.valueOf(deviceInfo2.getDeviceActiveState()));
                            if (deviceInfo2.getDeviceBluetoothType() == 2 || !lof.this.o.b(deviceInfo2)) {
                                if (deviceInfo2.getDeviceActiveState() == 1) {
                                    LogUtil.b("BTSDKApi", "BT switch on so start to force connect BLE or BR device.");
                                    lof.this.a(deviceInfo2.getDeviceIdentify(), false);
                                }
                            }
                        }
                    }
                }
            }
        };
        this.q = btSwitchStateCallback;
        if (context == null) {
            LogUtil.e("BTSDKApi", "0xA0200008", "init BTSDKApi with context is null.");
            return;
        }
        h = context;
        LogUtil.b("BTSDKApi", "init BluetoothProfile.");
        BTDeviceMgrUtil bTDeviceMgrUtilC = BTDeviceMgrUtil.c();
        this.o = bTDeviceMgrUtilC;
        bTDeviceMgrUtilC.b(context);
        this.o.d(btDeviceHfpStateCallback);
        this.o.a(btSwitchStateCallback);
        lnt.c();
        f40541a = new a(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothDeviceNode bluetoothDeviceNode, int i2) {
        bluetoothDeviceNode.setRssi(i2);
        bluetoothDeviceNode.setTimeStamp(System.currentTimeMillis());
        if (this.p == 2 && bluetoothDeviceNode.getDeviceType() == 3) {
            LogUtil.e("BTSDKApi", "Dual Mode device no add.");
        } else {
            b(bluetoothDeviceNode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(BluetoothDevice bluetoothDevice, String str, DeviceInfo deviceInfo) {
        int deviceBluetoothType = deviceInfo.getDeviceBluetoothType();
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(str)) {
            String manufacture = deviceInfo.getManufacture();
            LogUtil.b("BTSDKApi", "getManufacture: ", manufacture);
            if (manufacture != null && manufacture.contains("010303") && deviceBluetoothType == 1) {
                LogUtil.b("BTSDKApi", "The connected hfp action: ", str);
                c(1, bluetoothDevice, null, deviceInfo.getDeviceName(), false);
                return;
            }
            return;
        }
        if (deviceBluetoothType == 1) {
            LogUtil.b("BTSDKApi", "The connected hfp is the wanted device, so start to connect spp.");
            c(1, bluetoothDevice, null, deviceInfo.getDeviceName(), false);
        } else {
            if (deviceBluetoothType == 2) {
                LogUtil.b("BTSDKApi", "The connected hfp is the wanted device, so start to connect gatt.");
                g.get(deviceInfo.getDeviceIdentify()).b(bluetoothDevice.getAddress());
                c(2, bluetoothDevice, null, deviceInfo.getDeviceName(), false);
                return;
            }
            LogUtil.e("BTSDKApi", "The connected hfp is the wanted device,no support this type :", Integer.valueOf(deviceBluetoothType));
        }
    }

    public void b(String str, int i2) {
        if (str == null) {
            LogUtil.e("BTSDKApi", "notifyDeviceDoublePhone id is null");
            return;
        }
        synchronized (d) {
            lnv lnvVar = i.get(str);
            if (lnvVar != null) {
                lnvVar.a(i2);
            }
        }
    }

    public static lof d(Context context) {
        lof lofVar;
        synchronized (f40542b) {
            if (j == null) {
                LogUtil.e("BTSDKApi", "sBtSdkApiInstance is null.");
                j = new lof(BaseApplication.b());
            }
            lofVar = j;
        }
        return lofVar;
    }

    public void g() {
        this.o.j();
        this.m.clear();
        s();
    }

    private static void s() {
        synchronized (f40542b) {
            j = null;
        }
    }

    private lnv b(int i2, String str, String str2, BluetoothDevice bluetoothDevice) {
        LogUtil.b("BTSDKApi", "getBTDeviceInstance() Type :", Integer.valueOf(i2), ", nodeId :", str2);
        if (i2 != 0 && i2 != 5 && bluetoothDevice == null) {
            LogUtil.e("BTSDKApi", "0xA0200008", "getBtDeviceInstance btDevice is null.");
            return null;
        }
        String strE = e(i2, str2, bluetoothDevice);
        Map<String, lnv> map = i;
        if (map == null) {
            return null;
        }
        if (!map.containsKey(strE)) {
            return b(i2, str, str2, bluetoothDevice, strE);
        }
        LogUtil.b("BTSDKApi", "has this device.");
        lnv lnvVar = i.get(strE);
        if (i2 == -1 || i2 == lnvVar.h()) {
            return lnvVar;
        }
        i.remove(strE);
        return b(i2, str, str2, bluetoothDevice, strE);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    private lnv b(int i2, String str, String str2, BluetoothDevice bluetoothDevice, String str3) {
        int iA;
        LogUtil.b("BTSDKApi", "createDeviceSendCommandUtil mDeviceMgrMap do not contain this device.");
        if (i2 == 0 || i2 == 5) {
            iA = -1;
        } else {
            try {
                if (TextUtils.isEmpty(bluetoothDevice.getName())) {
                    iA = this.o.a(this.u);
                    LogUtil.b("BTSDKApi", "createDeviceSendCommandUtil productType :", Integer.valueOf(iA));
                } else {
                    iA = -1;
                }
            } catch (SecurityException e2) {
                LogUtil.d("BTSDKApi", "createDeviceSendCommandUtil SecurityException:", ExceptionUtils.c(e2));
                return null;
            }
        }
        BluetoothDevice bluetoothDeviceD = d(i2, str3, bluetoothDevice);
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceIdentify(str3);
        deviceInfo.setProductType(this.ad);
        loa.a().a(deviceInfo);
        lnu lnuVar = new lnu();
        lnuVar.e(bluetoothDeviceD);
        lnuVar.c(i2);
        lnuVar.b(str);
        lnuVar.c(str2);
        lnuVar.a(this.r);
        lnuVar.a(iA);
        lnv lnvVar = new lnv(h, lnuVar);
        synchronized (d) {
            i.put(str3, lnvVar);
        }
        return lnvVar;
    }

    private String e(int i2, String str, BluetoothDevice bluetoothDevice) {
        if (i2 == 5) {
            return str;
        }
        if (i2 == 0) {
            return "AndroidWear";
        }
        return bluetoothDevice.getAddress();
    }

    private BluetoothDevice d(int i2, String str, BluetoothDevice bluetoothDevice) {
        return (i2 == 0 || i2 == 5) ? bluetoothDevice : this.o.b(str);
    }

    private void p(String str) {
        LogUtil.b("BTSDKApi", "Enter removeBTDeviceInstance().");
        String strC = lnm.c(str);
        if (!i.containsKey(strC)) {
            LogUtil.b("BTSDKApi", "removeBTDeviceInstance Do not contain delete device : ", BTDeviceMgrUtil.c().e(strC));
            if (strC.equalsIgnoreCase("AndroidWear") || strC.endsWith("smart_watch") || BTDeviceMgrUtil.c().a(strC)) {
                return;
            }
            LogUtil.e("BTSDKApi", "removeBTDeviceInstance Remove bond device fail.");
            return;
        }
        synchronized (e) {
            DeviceInfo deviceInfoD = lnt.d("reconnectDevices", strC);
            if (deviceInfoD != null) {
                lnt.c("reconnectDevices", deviceInfoD);
                LogUtil.b("BTSDKApi", "The wanted remove device is current device so clear reconnect device info.", "Set reconnect device identify is empty.");
                lnx lnxVar = g.get(strC);
                if (lnxVar != null) {
                    lnxVar.e("");
                } else {
                    LogUtil.b("BTSDKApi", "the ble reconnect manager not in map");
                }
            }
        }
        b(i.get(strC), strC);
    }

    private void b(lnv lnvVar, String str) {
        if (lnvVar != null) {
            LogUtil.b("BTSDKApi", "Find wanted remove device success.");
            lnvVar.b(true);
            lnvVar.d(false);
            lnx lnxVar = g.get(str);
            if (lnxVar == null) {
                LogUtil.e("BTSDKApi", "bleReconnectManager is null");
                return;
            }
            String strA = lnxVar.a();
            LogUtil.b("BTSDKApi", "Stop reconnect Device Identify: ", BTDeviceMgrUtil.c().e(strA));
            if (strA.equalsIgnoreCase(str)) {
                LogUtil.b("BTSDKApi", "disconnectDevice Stop reconnect ble for remove device.");
                lnxVar.b(str);
            }
            int iF = lnvVar.f();
            if (iF != 2 && iF != 1) {
                synchronized (d) {
                    i.remove(lnm.c(str));
                    LogUtil.b("BTSDKApi", "Device remove success and device list size :", Integer.valueOf(i.size()));
                }
                if (!str.equalsIgnoreCase("AndroidWear") && !str.endsWith("smart_watch")) {
                    LogUtil.b("BTSDKApi", "Remove bond device isUnPairSuccess :", Boolean.valueOf(BTDeviceMgrUtil.c().a(str)));
                    return;
                } else {
                    LogUtil.b("BTSDKApi", "AW device should disconnect GMS.");
                    lnvVar.b();
                    return;
                }
            }
            lnvVar.a();
        }
    }

    public void j(String str) {
        LogUtil.b("BTSDKApi", "Enter removeCurrentInstance().");
        if (str == null) {
            LogUtil.e("BTSDKApi", "removeCurrentInstance strIdentify is null");
            return;
        }
        this.m.put(str, str);
        lnv lnvVar = i.get(lnm.c(str));
        if (lnvVar != null) {
            lnvVar.a();
        }
        BTDeviceMgrUtil.c().d(str);
    }

    public int h() {
        LogUtil.b("BTSDKApi", "Enter getBTSwitchState().");
        return this.o.h();
    }

    private void v() {
        if (!x() && (this.p == 2 || w())) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(BaseApplication.d(), "com.huawei.ui.device.activity.pairing.BtDialogActivity"));
            intent.setFlags(268435456);
            intent.putExtra(TtmlNode.TAG_STYLE, 1);
            intent.putExtra("content", 1);
            try {
                h.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.b("showBtSwitchEnableTip startJumpActivity not find JumpActivity", new Object[0]);
            }
        }
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(BaseApplication.d(), "com.huawei.ui.device.activity.pairing.BtDialogActivity"));
        intent2.setFlags(268435456);
        intent2.putExtra(TtmlNode.TAG_STYLE, 1);
        intent2.putExtra("content", 3);
        try {
            h.startActivity(intent2);
        } catch (ActivityNotFoundException unused2) {
            LogUtil.b("showBtTip ActivityNotFoundException", new Object[0]);
        }
    }

    public void d(boolean z, Handler handler) {
        LogUtil.b("BTSDKApi", "BT_GPS enableBTSwitch enable is ", Boolean.valueOf(z));
        if (z) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.obj = handler;
            f40541a.sendMessage(messageObtain);
            if (this.p != 0) {
                LogUtil.b("BTSDKApi", "BT_GPS startActivity BTDialogActivity");
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(BaseApplication.d(), "com.huawei.ui.device.activity.pairing.BtDialogActivity"));
                intent.setFlags(268435456);
                intent.putExtra(TtmlNode.TAG_STYLE, 3);
                intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, this.p);
                try {
                    h.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                    LogUtil.b("enableBTSwitch startJumpActivity not find JumpActivity", new Object[0]);
                    return;
                }
            }
            return;
        }
        f40541a.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, int i2, OperationDeviceInfo operationDeviceInfo) {
        BtDeviceStateCallback btDeviceStateCallback = this.t;
        if (btDeviceStateCallback != null) {
            btDeviceStateCallback.onDeviceConnectionStateChanged(deviceInfo, i2, operationDeviceInfo);
            if ((i2 == 3 || i2 == 4) && i.containsKey(lnm.c(deviceInfo.getDeviceIdentify())) && a(deviceInfo)) {
                return;
            }
            e(deviceInfo, i2);
            if (i2 == 2) {
                LogUtil.b("BTSDKApi", "Device connected so stop reconnect.");
                lnx lnxVar = g.get(deviceInfo.getDeviceIdentify());
                if (lnxVar != null) {
                    LogUtil.b("BTSDKApi", "handleDeviceConnectStatusChanged Stop reconnect ble for remove device.");
                    lnxVar.b(deviceInfo.getDeviceIdentify());
                }
            }
        }
    }

    private boolean a(DeviceInfo deviceInfo) {
        if (!i.get(lnm.c(deviceInfo.getDeviceIdentify())).l()) {
            return false;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        lnx lnxVar = g.get(deviceInfo.getDeviceIdentify());
        if (lnxVar != null && lnxVar.a().equalsIgnoreCase(deviceIdentify)) {
            LogUtil.b("BTSDKApi", "Stop reconnect ble for remove device.");
            lnxVar.b(deviceInfo.getDeviceIdentify());
        }
        LogUtil.b("BTSDKApi", "Need to remove device from device list.");
        synchronized (d) {
            i.remove(lnm.c(deviceInfo.getDeviceIdentify()));
            if (!deviceIdentify.equalsIgnoreCase("AndroidWear") && !deviceIdentify.endsWith("smart_watch")) {
                boolean zA = BTDeviceMgrUtil.c().a(deviceIdentify);
                LogUtil.e("BTSDKApi", "unPairResult :", Boolean.valueOf(zA));
                if (zA) {
                    return true;
                }
                a aVar = f40541a;
                if (aVar != null) {
                    aVar.sendEmptyMessage(7);
                }
            } else {
                LogUtil.b("BTSDKApi", "AW device do not need remove bond info.");
            }
            return true;
        }
    }

    private void e(DeviceInfo deviceInfo, int i2) {
        synchronized (e) {
            DeviceInfo deviceInfoD = lnt.d("reconnectDevices", deviceInfo.getDeviceIdentify());
            if (deviceInfoD != null) {
                String deviceIdentify = deviceInfoD.getDeviceIdentify();
                LogUtil.b("BTSDKApi", "Device BTType :", Integer.valueOf(deviceInfoD.getDeviceBluetoothType()), "reconnectDeviceInfo macAddress: ", BTDeviceMgrUtil.c().e(deviceIdentify), "Device ProductType: ", Integer.valueOf(deviceInfo.getProductType()));
                if (deviceInfoD.getDeviceBluetoothType() == 2 && (i2 == 3 || i2 == 4)) {
                    lnv lnvVarB = b(2, deviceInfo.getDeviceName(), (String) null, this.o.b(deviceInfoD.getDeviceIdentify()));
                    if (deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceIdentify)) {
                        LogUtil.e("BTSDKApi", "Start to reconnect BLE device. Device connected so stop reconnect.");
                        b(g.get(deviceInfo.getDeviceIdentify()), lnvVarB, deviceInfoD);
                    }
                }
            }
        }
    }

    private void b(final lnx lnxVar, lnv lnvVar, final DeviceInfo deviceInfo) {
        if (lnxVar == null) {
            LogUtil.e("BTSDKApi", "stopReconnectCausedConnected bleReconnectManager is null");
            return;
        }
        LogUtil.b("BTSDKApi", "Stop reconnect ble for remove device.");
        lnxVar.c(lnvVar);
        if (lnvVar == null) {
            LogUtil.e("BTSDKApi", "deviceSendCommandUtil is null.");
            return;
        }
        boolean zE = lnvVar.e();
        LogUtil.b("BTSDKApi", "isReconnectEnableFlag info :", Boolean.valueOf(zE));
        if (!zE) {
            lnxVar.b(deviceInfo.getDeviceIdentify());
            return;
        }
        if (System.currentTimeMillis() - lne.e() > 300000) {
            if (deviceInfo.getDeviceActiveState() != 1) {
                LogUtil.b("BTSDKApi", "stopReconnectCausedConnected reconnectDeviceInfo is not active RETRY_CONNECT_LONG_DELAY");
                return;
            } else {
                lnxVar.c(deviceInfo);
                return;
            }
        }
        f40541a.postDelayed(new Runnable() { // from class: lof.9
            @Override // java.lang.Runnable
            public void run() {
                if (deviceInfo.getDeviceActiveState() == 1) {
                    LogUtil.b("BTSDKApi", "stopReconnectCausedConnected reconnectDeviceInfo five minutes later");
                    lnxVar.c(deviceInfo);
                } else {
                    LogUtil.e("BTSDKApi", "stopReconnectCausedConnected reconnectDeviceInfo is not active else");
                }
            }
        }, 300000L);
        LogUtil.b("BTSDKApi", "occur ble 133 error in five minutes");
    }

    private void b(BluetoothDeviceNode bluetoothDeviceNode) {
        int iL;
        BluetoothDialogCallback bluetoothDialogCallback;
        synchronized (this) {
            String strE = e(bluetoothDeviceNode);
            if (cop.e() && TextUtils.isEmpty(strE)) {
                return;
            }
            if (!a(bluetoothDeviceNode, strE) && m(strE)) {
                try {
                    iL = l(strE);
                } catch (SecurityException e2) {
                    LogUtil.d("BTSDKApi", "addScanDeviceToList SecurityException:", ExceptionUtils.c(e2));
                    iL = 0;
                }
                synchronized (f40543c) {
                    this.n.add(iL, bluetoothDeviceNode);
                    if (Thread.currentThread() == Looper.getMainLooper().getThread() && (bluetoothDialogCallback = this.aa) != null) {
                        bluetoothDialogCallback.onSetList(this.n, true, iL);
                        return;
                    }
                    y();
                }
            }
        }
    }

    private String e(BluetoothDeviceNode bluetoothDeviceNode) {
        SecurityException e2;
        String recordName;
        String strE = "";
        try {
            BluetoothDevice btDevice = bluetoothDeviceNode.getBtDevice();
            if (!TextUtils.isEmpty(bluetoothDeviceNode.getNodeId())) {
                recordName = bluetoothDeviceNode.getDisplayName();
            } else {
                String name = btDevice != null ? btDevice.getName() : "";
                try {
                    recordName = TextUtils.isEmpty(name) ? bluetoothDeviceNode.getRecordName() : name;
                } catch (SecurityException e3) {
                    e2 = e3;
                    recordName = name;
                    LogUtil.d("BTSDKApi", "getScanDeviceName SecurityException:", ExceptionUtils.c(e2));
                    return recordName;
                }
            }
            if (btDevice != null) {
                try {
                    strE = cpl.e(btDevice.getAddress());
                } catch (SecurityException e4) {
                    e2 = e4;
                    LogUtil.d("BTSDKApi", "getScanDeviceName SecurityException:", ExceptionUtils.c(e2));
                    return recordName;
                }
            }
            LogUtil.b("BTSDKApi", "getScanDeviceName deviceName :", recordName, "，address :", strE);
            return recordName;
        } catch (SecurityException e5) {
            e2 = e5;
            recordName = "";
        }
    }

    private boolean a(BluetoothDeviceNode bluetoothDeviceNode, String str) {
        boolean z;
        BluetoothDevice btDevice = bluetoothDeviceNode.getBtDevice();
        for (BluetoothDeviceNode bluetoothDeviceNode2 : this.n) {
            if (bluetoothDeviceNode2 != null && bluetoothDeviceNode2.getBtDevice() != null && bluetoothDeviceNode2.getBtDevice().getAddress() != null && btDevice != null && bluetoothDeviceNode2.getBtDevice().getAddress().equals(btDevice.getAddress())) {
                d(bluetoothDeviceNode2, str);
                z = true;
                LogUtil.b("BTSDKApi", "addScanDeviceToList flag is ", Boolean.valueOf(z));
                return z;
            }
        }
        z = false;
        LogUtil.b("BTSDKApi", "addScanDeviceToList flag is ", Boolean.valueOf(z));
        return z;
    }

    private void d(BluetoothDeviceNode bluetoothDeviceNode, String str) {
        LogUtil.b("BTSDKApi", "addDeviceToList, updateDeviceList");
        try {
            if (bluetoothDeviceNode.getBtDevice().getName() == null && TextUtils.isEmpty(bluetoothDeviceNode.getRecordName()) && str != null && cop.a()) {
                if (!o(str)) {
                    LogUtil.e("BTSDKApi", "updateDeviceList device name is error.");
                } else {
                    bluetoothDeviceNode.setRecordName(str);
                    y();
                }
            }
        } catch (SecurityException e2) {
            LogUtil.d("BTSDKApi", "updateDeviceList SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private int l(String str) {
        synchronized (f40543c) {
            int size = this.n.size();
            if (TextUtils.isEmpty(str)) {
                return size;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                BluetoothDevice btDevice = this.n.get(i2).getBtDevice();
                String name = btDevice != null ? btDevice.getName() : "";
                if (!TextUtils.isEmpty(name)) {
                    if (!o(name) && o(str)) {
                    }
                    i3 = i2 + 1;
                    i2 = i3;
                }
                return i2;
            }
            i2 = i3;
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        if (z) {
            if (!x() && (this.p == 2 || w())) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(BaseApplication.d(), "com.huawei.ui.device.activity.pairing.BtDialogActivity"));
                intent.setFlags(268435456);
                intent.putExtra(TtmlNode.TAG_STYLE, 1);
                intent.putExtra("content", 2);
                try {
                    h.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                    LogUtil.b("startJumpActivity not find JumpActivity", new Object[0]);
                }
            }
            LogUtil.b("BTSDKApi", "BT_GPS showDiscoverDeviceTip1");
            a(true);
            return;
        }
        if (x() || this.p != 2) {
            LogUtil.b("BTSDKApi", "BT_GPS showDiscoverDeviceTip2");
            a(true);
        } else {
            LogUtil.b("BTSDKApi", "gps not enable");
        }
    }

    public void l() {
        if (h() != 3) {
            LogUtil.e("BTSDKApi", "startScanDevices bluetooth switch is not on.");
            return;
        }
        LogUtil.b("BTSDKApi", "scanbegin type:", Integer.valueOf(this.p));
        Object obj = f40543c;
        synchronized (obj) {
            List<BluetoothDeviceNode> list = this.n;
            if (list != null) {
                list.clear();
                BluetoothDialogCallback bluetoothDialogCallback = this.aa;
                if (bluetoothDialogCallback != null) {
                    bluetoothDialogCallback.onSetList(this.n, false, 0);
                }
            }
        }
        this.o.c(this.u, this.p, this.y);
        synchronized (obj) {
            BluetoothDialogCallback bluetoothDialogCallback2 = this.aa;
            if (bluetoothDialogCallback2 != null) {
                bluetoothDialogCallback2.onSetNameFilter(this.u);
            }
        }
    }

    public void a(boolean z) {
        LogUtil.b("BTSDKApi", "BT_GPS showDeviceList isBrTip: ", Boolean.valueOf(z));
        if (this.p == 1 && z && this.o.d(this.u)) {
            LogUtil.b("BTSDKApi", "Has wanted BR device.");
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(BaseApplication.d(), "com.huawei.ui.device.activity.pairing.BtDialogActivity"));
            intent.setFlags(268435456);
            intent.putExtra(TtmlNode.TAG_STYLE, 1);
            intent.putExtra("content", 4);
            try {
                h.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.b("startJumpActivity not find JumpActivity", new Object[0]);
            }
        }
        LogUtil.b("BTSDKApi", "Clear device scan list.");
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(BaseApplication.d(), "com.huawei.ui.device.activity.pairing.BtDialogActivity"));
        intent2.setFlags(268435456);
        intent2.putExtra(TtmlNode.TAG_STYLE, 3);
        intent2.putExtra(DeviceCategoryFragment.DEVICE_TYPE, this.p);
        try {
            h.startActivity(intent2);
        } catch (ActivityNotFoundException unused2) {
            LogUtil.d("BTSDKApi", "start BtDialogActivity ActivityNotFoundException.");
        } catch (SecurityException unused3) {
            LogUtil.d("BTSDKApi", "start BtDialogActivity SecurityException.");
        }
    }

    public void k() {
        LogUtil.b("BTSDKApi", "Enter showPermissionDialog");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(BaseApplication.d(), "com.huawei.ui.device.activity.pairing.BtDialogActivity"));
        intent.setFlags(268435456);
        intent.putExtra(TtmlNode.TAG_STYLE, 1);
        intent.putExtra("content", 6);
        try {
            h.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.d("BTSDKApi", "start showPermissionDialog ActivityNotFoundException.");
        } catch (SecurityException unused2) {
            LogUtil.d("BTSDKApi", "start showPermissionDialog SecurityException.");
        }
    }

    public void b(long j2, int i2) {
        if (j2 < 0) {
            LogUtil.e("BTSDKApi", "connectSelectedDevice id is error");
            return;
        }
        if (j2 >= this.n.size()) {
            LogUtil.d("BTSDKApi", "Please read the pairing guide and try again.");
            xgx.d().notification(1);
            return;
        }
        BluetoothDevice btDevice = this.n.get((int) j2).getBtDevice();
        if (btDevice != null) {
            try {
                LogUtil.b("BTSDKApi", "connectSelectedDevice id: ", Long.valueOf(j2), ";name is: ", btDevice.getName());
                d(i2);
                d(j2);
                return;
            } catch (SecurityException e2) {
                LogUtil.d("BTSDKApi", "connectSelectedDevice SecurityException:", ExceptionUtils.c(e2));
                return;
            }
        }
        LogUtil.e("BTSDKApi", "connectSelectedDevice deal else");
    }

    private void d(int i2) {
        if (i2 == -1 || i2 == this.p) {
            return;
        }
        this.p = i2;
    }

    public void d(long j2) {
        int i2 = (int) j2;
        if (i2 < 0 || i2 >= this.n.size()) {
            LogUtil.e("BTSDKApi", "connectDevice id is error");
            return;
        }
        BluetoothDevice btDevice = this.n.get(i2).getBtDevice();
        e();
        c(this.p, btDevice, this.n.get(i2).getNodeId(), this.n.get(i2).getRecordName(), true);
    }

    public void c(DeviceParameter deviceParameter, List<String> list, IAddDeviceStateCallback iAddDeviceStateCallback) {
        if (deviceParameter == null) {
            LogUtil.e("BTSDKApi", "addDevice deviceParameter is null");
            return;
        }
        ArrayList<String> nameFilter = deviceParameter.getNameFilter();
        if (nameFilter == null || iAddDeviceStateCallback == null) {
            LogUtil.e("BTSDKApi", "nameFilter or deviceListStateCallback is null");
            return;
        }
        e(deviceParameter, nameFilter, iAddDeviceStateCallback);
        String mac = deviceParameter.getMac();
        boolean zIsBand = deviceParameter.isBand();
        LogUtil.b("BTSDKApi", "addDevice isBand: ", Boolean.valueOf(zIsBand));
        if (BuildConfigProperties.a("IS_SUPPORT_NEW_ADD_MODE", false)) {
            this.v.clear();
            this.v.addAll(nameFilter);
            lmq.c(this.ad, this.v, zIsBand);
        }
        if (this.w) {
            this.z = list;
            LogUtil.b("BTSDKApi", "mIsOnlyShowHeartRate is true");
        }
        if (!TextUtils.isEmpty(mac)) {
            if (mac.endsWith("smart_watch")) {
                c(this.p, null, lnm.c(mac), null, true);
                return;
            } else {
                c(this.p, BTDeviceMgrUtil.c().b(mac), null, null, true);
                return;
            }
        }
        int iH = h();
        if (iH == 1) {
            v();
            return;
        }
        if (iH != 3) {
            LogUtil.e("BTSDKApi", "other switch status");
            return;
        }
        int i2 = this.p;
        if (i2 == 0) {
            c(i2, null, null, null, true);
        } else {
            c(true);
        }
    }

    private void e(DeviceParameter deviceParameter, List<String> list, IAddDeviceStateCallback iAddDeviceStateCallback) {
        this.p = deviceParameter.getBluetoothType();
        this.f = deviceParameter.getDeviceNameInfo();
        this.u.clear();
        this.u.addAll(list);
        this.ad = deviceParameter.getProductType();
        this.k = iAddDeviceStateCallback;
        this.w = deviceParameter.isSupportHeartRate();
    }

    public void b(List<DeviceInfo> list) {
        LogUtil.b("BTSDKApi", "Enter removeDeviceList().");
        if (list == null) {
            LogUtil.e("BTSDKApi", "0xA0200008", "Parameter is incorrect.");
            return;
        }
        for (DeviceInfo deviceInfo : list) {
            if (!"".equals(lnb.e(BaseApplication.b()).a(deviceInfo.getDeviceIdentify(), BaseApplication.b()))) {
                lnb.e(BaseApplication.b()).d(deviceInfo.getDeviceIdentify(), cph.b(""), "btsdk_sharedpreferences_bindid", BaseApplication.b());
            }
            p(deviceInfo.getDeviceIdentify());
        }
    }

    private static Map<String, lnv> p() {
        LogUtil.b("BTSDKApi", "Enter geActiveDeviceList().");
        HashMap map = new HashMap(16);
        for (Map.Entry<String, lnv> entry : i.entrySet()) {
            String key = entry.getKey();
            lnv value = entry.getValue();
            if (value != null && value.j() == 1) {
                map.put(key, value);
            }
        }
        return map;
    }

    private static List<String> r() {
        LogUtil.b("BTSDKApi", "Enter getAllActiveDeviceInfos().");
        ArrayList arrayList = new ArrayList(16);
        Map<String, lnv> mapP = p();
        if (mapP != null && mapP.size() > 0) {
            for (Map.Entry<String, lnv> entry : mapP.entrySet()) {
                LogUtil.b("BTSDKApi", "getAllActiveDeviceInfos Active device identify: ", BTDeviceMgrUtil.c().e(entry.getKey()));
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public void b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("BTSDKApi", "setCurrentDevice deviceInfo is null");
        } else {
            b(deviceInfo, false);
        }
    }

    public void b(DeviceInfo deviceInfo, boolean z) {
        LogUtil.b("BTSDKApi", "Enter setCurrentDevice() isManual: ", Boolean.valueOf(z));
        lnt.b("currentConnectedDevices", deviceInfo);
        lnt.b("reconnectDevices", deviceInfo);
        if (deviceInfo == null) {
            LogUtil.e("BTSDKApi", "deviceInfo is null.");
            return;
        }
        this.ad = deviceInfo.getProductType();
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        LogUtil.b("BTSDKApi", "macAddress: ", BTDeviceMgrUtil.c().e(deviceIdentify));
        if (-2 == deviceInfo.getProductType()) {
            LogUtil.e("BTSDKApi", "This func do not support AF500 device.");
        } else {
            b(deviceInfo, z, deviceIdentify);
        }
    }

    private void b(DeviceInfo deviceInfo, boolean z, String str) {
        BluetoothDevice bluetoothDeviceB;
        int deviceBluetoothType = deviceInfo.getDeviceBluetoothType();
        LogUtil.b("BTSDKApi", "device BTType :", Integer.valueOf(deviceBluetoothType), " ,device getProductType: ", Integer.valueOf(deviceInfo.getProductType()));
        List<String> listR = r();
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        a(z, deviceBluetoothType, deviceIdentify);
        if (listR.contains(deviceIdentify)) {
            if (deviceBluetoothType != 0 && deviceBluetoothType != 5) {
                b(str, deviceBluetoothType, z, deviceIdentify, deviceInfo.getManufacture());
                return;
            }
            lnv lnvVar = i.get(lnm.c(deviceIdentify));
            if (lnvVar == null || lnvVar.f() == 2) {
                return;
            }
            LogUtil.b("BTSDKApi", "start to connect aw device.");
            c(deviceBluetoothType, null, deviceInfo.getNodeId(), deviceInfo.getDeviceName(), false);
            return;
        }
        LogUtil.b("BTSDKApi", "The Current device has not active.");
        if (deviceBluetoothType == 0 || deviceBluetoothType == 5) {
            bluetoothDeviceB = null;
        } else {
            bluetoothDeviceB = this.o.b(deviceIdentify);
            if (bluetoothDeviceB == null) {
                LogUtil.e("BTSDKApi", "0xA0200006", " btDevice is null.");
                return;
            }
        }
        c(deviceBluetoothType, bluetoothDeviceB, deviceInfo.getNodeId(), deviceInfo.getDeviceName(), false);
    }

    private void b(String str, int i2, boolean z, String str2, String str3) {
        LogUtil.b("BTSDKApi", "The Current device has already active.");
        BTDeviceMgrUtil bTDeviceMgrUtil = this.o;
        if (bTDeviceMgrUtil != null) {
            BluetoothDevice bluetoothDeviceB = bTDeviceMgrUtil.b(str);
            if (bluetoothDeviceB != null) {
                d(i2, z, str2, bluetoothDeviceB, str3);
            } else {
                LogUtil.e("BTSDKApi", "handleContainsInActiveDevices btDevice is null.");
            }
        }
    }

    private void d(int i2, boolean z, String str, BluetoothDevice bluetoothDevice, String str2) {
        lnv lnvVar = i.get(str);
        if (i2 == 1 && this.o.e(bluetoothDevice) && lnvVar != null && lnvVar.f() != 2) {
            c(i2, bluetoothDevice, null, null, false);
            return;
        }
        if (i2 != 1 || !z) {
            LogUtil.b("BTSDKApi", "btType is not BR or hfp is not connect.");
            if (i2 == 2) {
                LogUtil.b("BTSDKApi", "Current is ble device so set is disconnect by user flag is false.");
                if (lnvVar == null || lnvVar.f() == 2) {
                    return;
                }
                lnvVar.e(true);
                a(str, false);
                return;
            }
            return;
        }
        LogUtil.b("BTSDKApi", "reconnect Need to connect hfp profile.");
        if (str2 != null && str2.contains("010303")) {
            c(i2, bluetoothDevice, null, null, false);
        } else {
            this.o.d(bluetoothDevice);
        }
    }

    public void d(String str) {
        LogUtil.b("BTSDKApi", "Enter disconnectDeviceByMac");
        if (str == null) {
            LogUtil.e("BTSDKApi", "disconnectDeviceByMac macAddress is null");
            return;
        }
        String strC = lnm.c(str);
        lnv lnvVar = i.get(strC);
        if (lnvVar != null) {
            lnvVar.d(0);
            LogUtil.b("BTSDKApi", "Start to setBTDeviceActiveState is disable. Set Reconnect device identify is empty");
            lnx lnxVar = g.get(strC);
            if (lnxVar != null) {
                lnxVar.e("");
                LogUtil.b("BTSDKApi", "Start to stopReconnectBLE.");
                lnxVar.b(strC);
            }
            LogUtil.b("BTSDKApi", "Start to disconnect device.");
            lnvVar.a();
        }
    }

    public void c(String str, String str2, String str3, int i2) {
        BluetoothDevice bluetoothDeviceB;
        LogUtil.b("BTSDKApi", "Enter setActiveDevice(),bluetoothType:", Integer.valueOf(i2));
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("BTSDKApi", "0xA0200008", " deviceIdentify is null.");
            return;
        }
        int i3 = -1;
        int i4 = str.equalsIgnoreCase("AndroidWear") ? 0 : -1;
        if (str.endsWith("smart_watch")) {
            i4 = 5;
        }
        if (i4 == 0 || i4 == 5) {
            i3 = i4;
            bluetoothDeviceB = null;
        } else {
            bluetoothDeviceB = this.o.b(str);
            if (bluetoothDeviceB == null) {
                LogUtil.e("BTSDKApi", "btDevice is null.");
                return;
            } else if (i2 == 1) {
                i3 = 1;
            } else if (i2 == 2) {
                i3 = 2;
            } else {
                LogUtil.e("BTSDKApi", "The BTType is unknown.");
            }
        }
        lnv lnvVarB = b(i3, str3, str2, bluetoothDeviceB);
        if (lnvVarB != null) {
            LogUtil.b("BTSDKApi", "Set wanted device active flag enable.");
            lnvVarB.d(1);
        }
        LogUtil.b("BTSDKApi", "Set Reconnect device identify: ", BTDeviceMgrUtil.c().e(str));
        lnx lnxVar = g.get(str);
        if (lnxVar != null) {
            lnxVar.e(str);
            return;
        }
        LogUtil.b("BTSDKApi", "add new device: ", BTDeviceMgrUtil.c().e(str));
        lnx lnxVar2 = new lnx();
        lnxVar2.e(str);
        g.put(str, lnxVar2);
    }

    public void e() {
        LogUtil.b("BTSDKApi", "Enter cancelBTDeviceDiscovery().");
        this.o.d();
    }

    public void d(BtDeviceStateCallback btDeviceStateCallback) {
        LogUtil.b("BTSDKApi", "Enter registerBtDeviceStateCallback().");
        if (btDeviceStateCallback == null) {
            LogUtil.e("BTSDKApi", "0xA0200008", "btDeviceCallback is null.");
        } else {
            this.t = btDeviceStateCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2, BluetoothDevice bluetoothDevice, String str, String str2, boolean z) {
        final String address;
        LogUtil.b("BTSDKApi", "Enter connectBTDevice().");
        if (i2 != 0 && i2 != 5) {
            if (bluetoothDevice == null) {
                LogUtil.e("BTSDKApi", "0xA0200008", " parameter is not correct.");
                return;
            }
            this.m.put(bluetoothDevice.getAddress(), "");
        }
        if (i2 == 5) {
            address = str + "smart_watch";
        } else if (i2 == 0) {
            address = "AndroidWear";
        } else {
            address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
        }
        if (cop.b()) {
            ThreadPoolManager.c().a("oldCancelBtConfirmDialog", new Runnable() { // from class: loe
                @Override // java.lang.Runnable
                public final void run() {
                    lof.e(address);
                }
            });
        }
        List<String> listR = r();
        lnv lnvVarB = b(i2, str2, str, bluetoothDevice);
        boolean zC = lnvVarB != null ? lnvVarB.c() : false;
        if (listR.contains(address)) {
            LogUtil.b("BTSDKApi", "hasAddedWantedDevice: ", Boolean.valueOf(zC), "preMacAddress equal strMacAddress.");
            e(lnvVarB, address, i2);
            return;
        }
        LogUtil.b("BTSDKApi", "hasAddedWantedDevice: ", Boolean.valueOf(zC), "preMacAddress do not equal strMacAddress.");
        if (!z || zC) {
            LogUtil.b("BTSDKApi", "set current device active state is true.");
            c(address, str, str2, i2);
        }
        a(lnvVarB);
    }

    static /* synthetic */ void e(String str) {
        if (coj.d(str)) {
            return;
        }
        coj.b(str);
    }

    private void a(lnv lnvVar) {
        if (lnvVar != null) {
            int iF = lnvVar.f();
            LogUtil.b("BTSDKApi", "device connect state: ", Integer.valueOf(iF));
            if (iF != 2 && iF != 1) {
                if (h() == 3) {
                    LogUtil.b("BTSDKApi", "BT switch is on so start connect device.");
                    lnvVar.d();
                } else {
                    LogUtil.b("BTSDKApi", "BT switch is not on. btswitchstate:", Integer.valueOf(h()));
                }
            }
            if (iF == 2 && this.t != null) {
                LogUtil.b("BTSDKApi", "report device connected status to dms.");
                DeviceInfo deviceInfoI = lnvVar.i();
                if (deviceInfoI == null) {
                    return;
                }
                this.t.onDeviceConnectionStateChanged(deviceInfoI, 2, loa.a().d(deviceInfoI.getDeviceIdentify()));
            }
            if (iF != 1 || this.t == null) {
                return;
            }
            DeviceInfo deviceInfoI2 = lnvVar.i();
            if (deviceInfoI2 == null) {
                LogUtil.e("BTSDKApi", "handleUnContaisInActivieDevices device info is null.");
            } else {
                this.t.onDeviceConnectionStateChanged(deviceInfoI2, 1, loa.a().d(deviceInfoI2.getDeviceIdentify()));
            }
        }
    }

    private void e(lnv lnvVar, String str, int i2) {
        if (lnvVar != null) {
            int iF = lnvVar.f();
            LogUtil.b("BTSDKApi", "getBTDeviceConnectState:", Integer.valueOf(iF));
            DeviceInfo deviceInfoD = lnt.d("reconnectDevices", str);
            if (deviceInfoD != null && iF != 2 && iF != 1) {
                LogUtil.b("BTSDKApi", "Start to connect wanted device.");
                lnvVar.d();
            } else {
                LogUtil.b("BTSDKApi", "Do not need to connect wanted device.");
            }
            DeviceInfo deviceInfoI = lnvVar.i();
            if (deviceInfoI == null) {
                deviceInfoI = new DeviceInfo();
            }
            deviceInfoI.setDeviceIdentify(str);
            if (deviceInfoD == null) {
                lnt.b("reconnectDevices", deviceInfoI);
            }
            OperationDeviceInfo operationDeviceInfoD = loa.a().d(str);
            if (iF != 2 || i2 == 0 || this.t == null) {
                return;
            }
            LogUtil.b("BTSDKApi", "Start to report connected state with device type: ", Integer.valueOf(deviceInfoI.getProductType()));
            deviceInfoI.setDeviceConnectState(2);
            this.t.onDeviceConnectionStateChanged(deviceInfoI, 2, operationDeviceInfoD);
        }
    }

    public void f(String str) {
        LogUtil.b("BTSDKApi", "Enter stopReconnectAndDisconnectDevice");
        if (str == null) {
            LogUtil.e("BTSDKApi", "stopReconnectAndDisconnectDevice preMacAddress is null");
            return;
        }
        String strC = lnm.c(str);
        lnv lnvVar = i.get(strC);
        if (lnvVar != null) {
            lnvVar.e(false);
            lnx lnxVar = g.get(strC);
            if (lnxVar != null) {
                lnxVar.b(strC);
            }
            lnvVar.a();
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("BTSDKApi", "0xA0200008", " btMacAddress is incorrect.");
            return;
        }
        lnv lnvVar = i.get(lnm.c(str));
        if (lnvVar != null) {
            int iF = lnvVar.f();
            if (iF == 1 || iF == 2) {
                lnvVar.a();
                return;
            } else {
                LogUtil.b("BTSDKApi", "disconnectBTDevice Device is already disconnect.");
                return;
            }
        }
        LogUtil.e("BTSDKApi", "0xA0200008", "disconnectBTDevice can not get device manager handle.");
    }

    public void a(String str, String str2) {
        LogUtil.b("BTSDKApi", "Enter sendAWFilePath().");
        if (str2 == null) {
            return;
        }
        lnv lnvVarT = t();
        if (lnvVarT == null) {
            LogUtil.e("BTSDKApi", "0xA0200008", "sendAWFilePath deviceSendCommandUtil is null.");
        } else {
            LogUtil.b("BTSDKApi", "sendAWFilePath path : ", str2);
            lnvVarT.c(str2);
        }
    }

    public void d(BtDeviceResponseCallback btDeviceResponseCallback) {
        LogUtil.b("BTSDKApi", "Enter setFileCallback().");
        if (btDeviceResponseCallback == null) {
            return;
        }
        lnv lnvVarT = t();
        if (lnvVarT == null) {
            LogUtil.e("BTSDKApi", "0xA0200008", " deviceSendCommandUtil is null.");
        } else {
            LogUtil.b("BTSDKApi", "setFileCallback path : ", btDeviceResponseCallback);
            lnvVarT.a(btDeviceResponseCallback);
        }
    }

    public void c(BtDeviceResponseCallback btDeviceResponseCallback) {
        LogUtil.b("BTSDKApi", "Enter setAWFileCallback().");
        if (btDeviceResponseCallback == null) {
            LogUtil.e("BTSDKApi", "setAWFileCallback() callback is null");
            return;
        }
        lnv lnvVarT = t();
        if (lnvVarT == null) {
            LogUtil.e("BTSDKApi", "0xA0200008", "setAWFileCallback is null.");
        } else {
            LogUtil.b("BTSDKApi", "setAWFileCallback path : ", btDeviceResponseCallback);
            lnvVarT.c(btDeviceResponseCallback);
        }
    }

    private lnv t() {
        DeviceInfo deviceInfoI;
        LogUtil.b("BTSDKApi", "Enter getCurrentSmartWatchUtil().");
        Iterator<Map.Entry<String, lnv>> it = i.entrySet().iterator();
        while (it.hasNext()) {
            lnv value = it.next().getValue();
            if (value != null && value.j() == 1 && (deviceInfoI = value.i()) != null && (deviceInfoI.getDeviceBluetoothType() == 0 || deviceInfoI.getDeviceBluetoothType() == 5)) {
                return value;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    public void b(int i2, lnr lnrVar) {
        BluetoothDevice bluetoothDeviceB;
        lnv lnvVarB;
        if (lnrVar == null) {
            return;
        }
        String strG = lnrVar.g();
        if (strG.endsWith("smart_watch")) {
            lnrVar.b(5);
            strG = lnm.c(strG);
        } else {
            if ("AndroidWear".equalsIgnoreCase(strG)) {
                lnrVar.b(0);
            } else {
                bluetoothDeviceB = this.o.b(strG);
                if (bluetoothDeviceB == null) {
                    return;
                }
                int i3 = 1;
                if (i2 != 1) {
                    i3 = 2;
                    if (i2 != 2) {
                        LogUtil.e("BTSDKApi", "The BTType is unknown.");
                        i3 = -1;
                    }
                }
                lnrVar.b(i3);
            }
            if (lnrVar.e() == 5) {
                lnvVarB = b(lnrVar.e(), (String) null, strG, bluetoothDeviceB);
            } else {
                lnvVarB = b(lnrVar.e(), (String) null, (String) null, bluetoothDeviceB);
            }
            if (lnvVarB == null) {
                LogUtil.e("BTSDKApi", "0xA0200008", " deviceSendCommandUtil is null.");
            } else {
                lnvVarB.b(lnrVar);
            }
        }
        bluetoothDeviceB = null;
        if (lnrVar.e() == 5) {
            lnvVarB = b(lnrVar.e(), (String) null, strG, bluetoothDeviceB);
        } else {
            lnvVarB = b(lnrVar.e(), (String) null, (String) null, bluetoothDeviceB);
        }
        if (lnvVarB == null) {
            LogUtil.e("BTSDKApi", "0xA0200008", " deviceSendCommandUtil is null.");
        } else {
            lnvVarB.b(lnrVar);
        }
    }

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                return;
            }
            switch (message.what) {
                case 1:
                    if (lof.this.k != null) {
                        lof.this.k.onAddDeviceState(1);
                    }
                    break;
                case 2:
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof Handler)) {
                        lof.this.o.e(lof.this.s, (Handler) message.obj);
                        break;
                    }
                    break;
                case 3:
                    if (lof.this.k != null) {
                        lof.this.k.onAddDeviceState(3);
                    }
                    break;
                case 4:
                    lof.this.c(false);
                    break;
                case 5:
                    lof.this.c(0, null, null, null, true);
                    break;
                case 6:
                default:
                    LogUtil.e("BTSDKApi", "AddDeviceHandler msg.what is unknown");
                    break;
                case 7:
                    LogUtil.d("BTSDKApi", "Unable to unpair device here. Unpair it in Bluetooth settings.");
                    xgx.d().notification(2);
                    break;
                case 8:
                    LogUtil.d("BTSDKApi", "The device needs to adapt to the 0x15 field in Bluetooth protocol 5.1.7");
                    xgx.d().notification(3);
                    break;
            }
        }
    }

    private boolean x() {
        if (!(h.getSystemService("location") instanceof LocationManager)) {
            LogUtil.e("BTSDKApi", "isGpsLocationEnable get Location Service fail");
            return false;
        }
        LocationManager locationManager = (LocationManager) h.getSystemService("location");
        boolean zIsProviderEnabled = locationManager.isProviderEnabled(GeocodeSearch.GPS);
        LogUtil.b("BTSDKApi", "isGPSLocationEnable：", Boolean.valueOf(zIsProviderEnabled));
        if (lmq.e() || lmq.c()) {
            return zIsProviderEnabled;
        }
        boolean zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
        LogUtil.b("BTSDKApi", "isNetWorkLocationEnable：", Boolean.valueOf(zIsProviderEnabled2));
        return zIsProviderEnabled || zIsProviderEnabled2;
    }

    public void a(String str, boolean z) {
        LogUtil.b("BTSDKApi", "Enter forceConnectBTDevice().");
        if (str == null) {
            return;
        }
        DeviceInfo deviceInfoD = lnt.d("reconnectDevices", str);
        lnv lnvVar = i.get(lnm.c(str));
        if (lnvVar == null || deviceInfoD == null) {
            return;
        }
        int iF = lnvVar.f();
        int deviceBluetoothType = deviceInfoD.getDeviceBluetoothType();
        LogUtil.b("BTSDKApi", "Current connect state: ", Integer.valueOf(iF));
        if (iF != 2) {
            if (deviceBluetoothType != 0 && deviceBluetoothType != 5) {
                b(str, z, deviceInfoD, lnvVar, iF, deviceBluetoothType);
            } else if (iF != 1) {
                LogUtil.b("BTSDKApi", "Start to connect AW device.");
                lnvVar.d();
            }
        }
    }

    private void b(String str, boolean z, DeviceInfo deviceInfo, lnv lnvVar, int... iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        BluetoothDevice bluetoothDeviceB = this.o.b(deviceInfo.getDeviceIdentify());
        if (bluetoothDeviceB != null) {
            boolean zE = lnvVar.e();
            LogUtil.b("BTSDKApi", "reconnectEnableFlag: ", Boolean.valueOf(zE));
            if (i3 == 2 && zE) {
                e(g.get(str), lnvVar, z, deviceInfo);
                return;
            }
            if (i3 != 1 || i2 == 1) {
                return;
            }
            if (this.o.e(bluetoothDeviceB) || e(deviceInfo)) {
                LogUtil.b("BTSDKApi", "Start to connect BR device.");
                b(true);
                lnvVar.d();
            }
        }
    }

    private boolean e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("BTSDKApi", "isSupportBleAndBr deviceInfo is null");
            return false;
        }
        String manufacture = deviceInfo.getManufacture();
        LogUtil.b("BTSDKApi", "getManufacture: ", manufacture);
        return manufacture != null && manufacture.contains("010303") && deviceInfo.getDeviceBluetoothType() == 1;
    }

    private void e(lnx lnxVar, lnv lnvVar, boolean z, DeviceInfo deviceInfo) {
        if (lnxVar != null) {
            lnxVar.b(deviceInfo.getDeviceIdentify());
            if (lnxVar.b() == null) {
                LogUtil.e("BTSDKApi", "btDeviceSendCommandUtil is null so reset it.");
                lnxVar.c(lnvVar);
            }
            int iF = lnvVar.f();
            if (z) {
                LogUtil.b("BTSDKApi", "iconnect find device so connect device directly.");
                if (iF == 1 || iF == 2) {
                    return;
                }
                lnvVar.d();
                return;
            }
            if (deviceInfo.getDeviceActiveState() != 1) {
                LogUtil.e("BTSDKApi", "stopReconnectCausedConnected reconnectDeviceInfo is not active");
            } else {
                lnxVar.c(deviceInfo);
            }
        }
    }

    public void i() {
        IAddDeviceStateCallback iAddDeviceStateCallback = this.k;
        if (iAddDeviceStateCallback != null) {
            iAddDeviceStateCallback.onAddDeviceState(4);
        }
    }

    public void j() {
        LogUtil.b("BTSDKApi", "Enter connectHFPConnectedDevice().");
        BluetoothDevice bluetoothDeviceC = this.o.c(this.u);
        if (bluetoothDeviceC != null) {
            try {
                LogUtil.b("BTSDKApi", "The wanted device name: ", bluetoothDeviceC.getName());
                c(1, bluetoothDeviceC, null, null, true);
            } catch (SecurityException e2) {
                LogUtil.d("BTSDKApi", "connectHFPConnectedDevice SecurityException:", ExceptionUtils.c(e2));
            }
        }
    }

    public String m() {
        LogUtil.b("BTSDKApi", "Enter getHFPConnectedDeviceName().");
        BluetoothDevice bluetoothDeviceC = this.o.c(this.u);
        if (bluetoothDeviceC != null) {
            try {
                LogUtil.b("BTSDKApi", "The wanted device name: ", bluetoothDeviceC.getName());
                return bluetoothDeviceC.getName();
            } catch (SecurityException e2) {
                LogUtil.d("BTSDKApi", "getHFPConnectedDeviceName SecurityException:", ExceptionUtils.c(e2));
                return "";
            }
        }
        return "";
    }

    public String f() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    public void e(String str, String str2, String str3, int i2) {
        BluetoothDevice bluetoothDeviceB;
        lnv lnvVarB;
        LogUtil.b("BTSDKApi", "Enter setAddedDeviceSuccess(),bluetoothType:", Integer.valueOf(i2));
        if (TextUtils.isEmpty(str2)) {
            LogUtil.e("BTSDKApi", "0xA0200008", "strIdentify is null.");
            return;
        }
        int i3 = -1;
        int i4 = "AndroidWear".equalsIgnoreCase(str2) ? 0 : -1;
        if (str2.endsWith("smart_watch")) {
            i4 = 5;
        }
        if (i4 != 0 && i4 != 5) {
            bluetoothDeviceB = this.o.b(str2);
            if (bluetoothDeviceB == null) {
                LogUtil.e("BTSDKApi", "btDevice is null so return.");
                return;
            }
            if (i2 == 1) {
                i3 = 1;
            } else {
                i4 = 2;
                if (i2 != 2) {
                    LogUtil.b("BTSDKApi", "The btType is unknown.");
                }
            }
            lnvVarB = b(i3, str3, str, bluetoothDeviceB);
            if (lnvVarB != null) {
                LogUtil.b("BTSDKApi", "Set wanted device add success flag.");
                lnvVarB.d(true);
            } else {
                LogUtil.e("BTSDKApi", "deviceSendCommandUtil is null.");
            }
        }
        bluetoothDeviceB = null;
        i3 = i4;
        lnvVarB = b(i3, str3, str, bluetoothDeviceB);
        if (lnvVarB != null) {
            LogUtil.b("BTSDKApi", "Set wanted device add success flag.");
            lnvVarB.d(true);
        } else {
            LogUtil.e("BTSDKApi", "deviceSendCommandUtil is null.");
        }
    }

    public void d(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.b("BTSDKApi", "Enter setDMSHandshakeFail().");
        if (deviceInfo == null) {
            LogUtil.e("BTSDKApi", "0xA0200008", " btDeviceInfo is null.");
            return;
        }
        LogUtil.b("BTSDKApi", "Start to report connect fail.");
        deviceInfo.setDeviceConnectState(4);
        loa loaVarA = loa.a();
        loaVarA.a(deviceInfo.getDeviceIdentify(), System.currentTimeMillis());
        if (bArr != null && bArr.length >= 2) {
            loaVarA.e(deviceInfo.getDeviceIdentify(), lmq.b(bArr[0], bArr[1]));
        }
        loaVarA.d(deviceInfo.getDeviceIdentify(), 2010000);
        this.r.onDeviceConnectionStateChanged(deviceInfo, 4, loaVarA.d(deviceInfo.getDeviceIdentify()));
    }

    public void b(boolean z, String str) {
        if (str == null) {
            LogUtil.e("BTSDKApi", "setReconnectInfoFlag strIdentify is null");
            return;
        }
        lnv lnvVar = i.get(str);
        if (lnvVar == null) {
            LogUtil.e("BTSDKApi", "setReconnectInfoFlag deviceSendCommandUtil is null");
            return;
        }
        lnvVar.e(z);
        if (z) {
            return;
        }
        lnvVar.d(0);
    }

    public void i(String str) {
        LogUtil.b("BTSDKApi", "stopReconnectBle enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("BTSDKApi", "stopReconnectBle macAddress is null");
            return;
        }
        lnx lnxVar = g.get(str);
        if (lnxVar == null) {
            LogUtil.e("BTSDKApi", "stopReconnectBle bleReconnectManager is null");
        } else {
            lnxVar.b(str);
        }
    }

    public void g(String str) {
        LogUtil.b("BTSDKApi", "startReconnectBle enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("BTSDKApi", "startReconnectBle macAddress is null");
            return;
        }
        lnx lnxVar = g.get(str);
        if (lnxVar == null) {
            LogUtil.e("BTSDKApi", "startReconnectBle bleReconnectManager is null");
            return;
        }
        DeviceInfo deviceInfoD = lnt.d("reconnectDevices", str);
        if (deviceInfoD != null && deviceInfoD.getDeviceActiveState() == 1) {
            lnxVar.c(deviceInfoD);
        } else {
            LogUtil.e("BTSDKApi", "startReconnectBle reconnectDeviceInfo is not active");
        }
    }

    public void n(String str) {
        if (str == null) {
            LogUtil.e("BTSDKApi", "updateReconnectDeviceInfoActiveStatus identify is null");
        } else {
            lnt.c(str);
        }
    }

    public boolean n() {
        return this.x;
    }

    public void b(boolean z) {
        this.x = z;
    }

    public void d(BluetoothDialogCallback bluetoothDialogCallback) {
        synchronized (f40543c) {
            this.aa = bluetoothDialogCallback;
        }
    }

    private boolean m(String str) {
        boolean z = true;
        boolean zK = false;
        if (TextUtils.isEmpty(str)) {
            List<String> list = this.v;
            if (list == null) {
                return false;
            }
            if (list.size() > 0 && "Blacktip".equalsIgnoreCase(this.v.get(0))) {
                return false;
            }
            LogUtil.e("BTSDKApi", "filterScanDeviceName deviceName is null and return true.");
            return true;
        }
        for (String str2 : this.v) {
            if (TextUtils.isEmpty(str2)) {
                zK = true;
            } else if (cop.e() && !str.contains(Constants.LINK)) {
                LogUtil.c("BTSDKApi", "is beta version and deviceName not contains special char");
            } else if (!str.toUpperCase(Locale.ENGLISH).contains(str2.toUpperCase(Locale.ENGLISH))) {
                continue;
            } else if (this.w) {
                zK = k(str);
            } else {
                LogUtil.b("BTSDKApi", "filterScanDeviceName isExistDeviceList isAddDeviceList is ", Boolean.valueOf(z));
                return z;
            }
        }
        z = zK;
        LogUtil.b("BTSDKApi", "filterScanDeviceName isExistDeviceList isAddDeviceList is ", Boolean.valueOf(z));
        return z;
    }

    private boolean o(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        for (String str2 : this.u) {
            if (!TextUtils.isEmpty(str2)) {
                if (upperCase.contains(str2.toUpperCase(Locale.ENGLISH))) {
                    z = true;
                    break;
                }
            } else {
                z = true;
            }
        }
        LogUtil.b("BTSDKApi", "isSelectedDeviceName is ", Boolean.valueOf(z));
        return z;
    }

    private boolean w() {
        return cpp.c() && this.p == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        LogUtil.b("BTSDKApi", "Enter disconnectBoundConnectedDevice.");
        for (Map.Entry<String, lnv> entry : i.entrySet()) {
            if (entry != null && (entry.getValue() instanceof lnv)) {
                lnv value = entry.getValue();
                if (value == null || value.i() == null) {
                    LogUtil.e("BTSDKApi", "disconnectBoundConnectedDevice sendCommandUtil or deviceInfo is null.");
                } else {
                    LogUtil.b("BTSDKApi", "disconnectBoundConnectedDevice deviceConnectState :", Integer.valueOf(value.f()));
                    if (value.f() == 2) {
                        value.a();
                    }
                }
            }
        }
    }

    private boolean k(String str) {
        boolean z = false;
        for (String str2 : this.z) {
            if (TextUtils.isEmpty(str2) || str.toUpperCase(Locale.ENGLISH).contains(str2.toUpperCase(Locale.ENGLISH))) {
                z = true;
            }
        }
        return z;
    }

    public String b(String str) {
        ConcurrentHashMap<String, String> concurrentHashMap = this.m;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return "";
    }

    public void c(String str) {
        ConcurrentHashMap<String, String> concurrentHashMap = this.m;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, "");
        }
    }

    private void a(boolean z, int i2, String str) {
        if (z && i2 == 1) {
            lnv lnvVar = i.get(str);
            if (lnvVar == null) {
                LogUtil.e("BTSDKApi", "resetDeviceConnectAvailable sendCommandUtil is null.");
            } else {
                if (lnvVar.k()) {
                    return;
                }
                LogUtil.b("BTSDKApi", "resetDeviceConnectAvailable has reset.");
                lnvVar.a(true);
            }
        }
    }

    private void y() {
        f40541a.post(new Runnable() { // from class: lof.6
            @Override // java.lang.Runnable
            public void run() {
                synchronized (lof.f40543c) {
                    if (lof.this.aa != null) {
                        lof.this.aa.onSetList(lof.this.n, false, 0);
                    }
                }
            }
        });
    }

    public int h(String str) {
        Map<String, lnv> map = i;
        if (map == null || str == null) {
            LogUtil.e("BTSDKApi", "mDeviceMgrMap or deviceIdentify is null");
            return -1;
        }
        lnv lnvVar = map.get(str);
        if (lnvVar == null) {
            return -1;
        }
        return lnvVar.h();
    }

    public void o() {
        a aVar = f40541a;
        if (aVar == null) {
            LogUtil.e("BTSDKApi", "showMissParametersTip mAddDeviceHandler is null");
        } else {
            aVar.sendEmptyMessage(8);
        }
    }
}
