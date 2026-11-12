package com.xiaomi.hm.health.device.bind;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.bind.HmBindEarbudLogic;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HmBindEarbudLogic extends HMBindBaseLogic {
    private static final int A = 1;
    private static final int B = -1;
    private static final int C = -2;
    private static final int D = 5;
    private static final int E = 3;
    private static final int x = 20000;
    private static final int y = 10000;
    private static final int z = 0;
    private final ArrayList<String> l;
    private final HashMap<String, AdvData> m;
    private int n;
    private AdvData o;
    private AdvData p;
    private UserInfo q;
    private BleScanOption r;
    private BleScanOption s;
    private EarbudBindListener t;
    private int u;
    private int v;
    private final Lazy<DeviceRepositoryApi> w;

    public interface EarbudBindListener extends HMBindBaseLogic.IBindListener {
        void onEarbudBindProgerss(AdvData advData, AdvData advData2);
    }

    public HmBindEarbudLogic(Context context) {
        super(context, HMDeviceType.EARBUD);
        this.l = new ArrayList<>();
        this.m = new HashMap<>();
        this.n = 20000;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.u = 0;
        this.v = 0;
        this.w = KoinJavaComponent.inject(DeviceRepositoryApi.class);
        Z();
    }

    private void S(HMDeviceSource... hMDeviceSourceArr) {
        for (HMDeviceSource hMDeviceSource : hMDeviceSourceArr) {
            this.l.addAll(ConfigHelperKt.getDeviceConfig(hMDeviceSource).getBtNames());
        }
    }

    private void T() {
        this.r = new BleScanOption.Builder().scanTimeout(this.n).needConnectedDevices(true).filterUUID(HMBaseProfile.UUID_SERVICE_MILI_SERVICE).filterNames(this.l).callback(this).build();
        BleScanCenter.getInstance().startScan(this.r);
    }

    private void U(boolean z2) {
        this.o = null;
        this.p = null;
        if (this.m.size() <= 0) {
            return;
        }
        ArrayList<AdvData> arrayList = new ArrayList();
        for (AdvData advData : this.m.values()) {
            if (!z2 || advData.rssi >= -60) {
                arrayList.add(advData);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: m34
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HmBindEarbudLogic.d0((AdvData) obj, (AdvData) obj2);
            }
        });
        for (AdvData advData2 : arrayList) {
            AdvData advData3 = this.m.get(j0(advData2.device.getAddress()));
            if (advData3 != null) {
                if (c0(advData2.device.getAddress())) {
                    this.o = advData2;
                    this.p = advData3;
                } else {
                    this.o = advData3;
                    this.p = advData2;
                }
            }
            if (this.o != null && this.p != null) {
                break;
            }
        }
        if (this.o == null && this.p == null) {
            AdvData advData4 = (AdvData) arrayList.get(0);
            if (c0(advData4.device.getAddress())) {
                this.o = advData4;
            } else {
                this.p = advData4;
            }
        }
    }

    private void V(AdvData advData, AdvData advData2) {
        HMLog.i(HMBindBaseLogic.TAG, "scaned device size:" + this.m.size(), new Object[0]);
        String deviceName = advData.getDeviceName();
        String deviceName2 = advData2.getDeviceName();
        if (TextUtils.isEmpty(deviceName) || TextUtils.isEmpty(deviceName2)) {
            handleBindFailed(HMBindBaseLogic.BindError.UNKNOW_DEVICE_TYPE);
            HMLog.i(HMBindBaseLogic.TAG, "not support device : " + advData.device, new Object[0]);
            return;
        }
        HMDeviceSource hMDeviceSourceNameToSource = HmEarbudDevice.nameToSource(deviceName);
        HMDeviceSource hMDeviceSourceNameToSource2 = HmEarbudDevice.nameToSource(deviceName2);
        if (!b0(hMDeviceSourceNameToSource) && !b0(hMDeviceSourceNameToSource2)) {
            W(advData.device, advData2.device);
            return;
        }
        handleBindFailed(HMBindBaseLogic.BindError.UNKNOW_DEVICE_TYPE);
        HMLog.i(HMBindBaseLogic.TAG, "not support device : " + advData.device, new Object[0]);
    }

    private void W(BluetoothDevice bluetoothDevice, BluetoothDevice bluetoothDevice2) {
        HmEarbudDevice hmEarbudDevice = new HmEarbudDevice(this.mContext, bluetoothDevice, bluetoothDevice2);
        hmEarbudDevice.setConnectionCallback(this);
        hmEarbudDevice.setAutoReconnect(false);
        hmEarbudDevice.setAuthInfo(new AuthInfo(this.q));
        if (this.mHasStop.get()) {
            return;
        }
        this.mBleDevice = hmEarbudDevice;
        hmEarbudDevice.create(true);
    }

    private void X() {
        this.s = new BleScanOption.Builder().scanTimeout(60000 - this.n).needConnectedDevices(true).filterUUID(HMBaseProfile.UUID_SERVICE_MILI_SERVICE).filterNames(this.l).callback(this).build();
        BleScanCenter.getInstance().startScan(this.s);
    }

    private String Y(String str) {
        HMLog.d(HMBindBaseLogic.TAG, "nickName:" + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char c = charArray[i2];
            if (i >= 10) {
                sb.append("***");
                break;
            }
            i += c <= 255 ? 1 : 2;
            sb.append(c);
        }
        HMLog.d(HMBindBaseLogic.TAG, "limitNickName:" + sb.toString(), new Object[0]);
        return sb.toString();
    }

    private void Z() {
        S(HMDeviceSource.EARBUD_CHOPIN);
    }

    private boolean a0(HmBaseEarbudDevice hmBaseEarbudDevice) {
        Status deviceStatus;
        return hmBaseEarbudDevice == null || (deviceStatus = hmBaseEarbudDevice.getDeviceStatus()) == Status.INIT_FAILED || deviceStatus == Status.GATT_CONNECT_FAILED || deviceStatus == Status.CONNECTING_TIMEOUT || deviceStatus == Status.GATT_DISCONNECT || deviceStatus == Status.AUTH_FAILED || deviceStatus == Status.DISCOVERY_FAILED || deviceStatus == Status.DISCONNECTED;
    }

    private boolean b0(HMDeviceSource hMDeviceSource) {
        return hMDeviceSource != HMDeviceSource.EARBUD_CHOPIN;
    }

    private boolean c0(String str) {
        return str.endsWith("01");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d0(AdvData advData, AdvData advData2) {
        return advData2.rssi - advData.rssi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e0() {
        return "earBud bleDevice null!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0() {
        this.t.onEarbudBindProgerss(this.o, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0() {
        this.t.onEarbudBindProgerss(this.o, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0() {
        this.t.onEarbudBindProgerss(this.o, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i0() {
        return "TAG_BIND startBind earBud";
    }

    private String j0(String str) {
        String strSubstring = str.substring(0, str.length() - 2);
        return c0(str) ? strSubstring.concat("02") : strSubstring.concat("01");
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void destroyBleDevice() {
        if (this.mBleDevice != null) {
            HMLog.i(HMBindBaseLogic.TAG, "destroy bind ble device", new Object[0]);
            this.mBleDevice.setConnectionCallback(null);
            this.mBleDevice.setAuthCallback(null);
            this.mBleDevice.setAutoReconnect(false);
            this.mBleDevice.destroy();
            this.mBleDevice = null;
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void handleBindSuccess(HMBaseDevice hMBaseDevice, Device device) {
        super.handleBindSuccess(hMBaseDevice, device);
        Lazy<PropertyStoreApi> lazy = HMBindBaseLogic.propertyStoreApiLazy;
        lazy.getValue().setShowEarbudAlarmDialog(true);
        lazy.getValue().setShowEarbudDeleteGuide(true);
        lazy.getValue().setShowEarbudDeleteTip(true);
    }

    public void improve() {
        this.n += 10000;
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
    public void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
        HMBaseDevice hMBaseDevice = this.mBleDevice;
        if (hMBaseDevice instanceof HmEarbudDevice) {
            HmEarbudDevice hmEarbudDevice = (HmEarbudDevice) hMBaseDevice;
            boolean zA0 = a0(hmEarbudDevice);
            boolean zA1 = a0(hmEarbudDevice.getRightDevice());
            if (hmEarbudDevice.isAllConnected()) {
                onDeviceConnected(hmEarbudDevice.getBluetoothDevice(), HMDeviceType.EARBUD, Status.AUTH_SUCCESS);
                return;
            }
            if (zA0 && this.u < 3) {
                hmEarbudDevice.reConnect();
                this.u++;
                HMLog.i(HMBindBaseLogic.TAG, "left connect fail and retry, times:" + this.u, new Object[0]);
                return;
            }
            if (zA1 && this.v < 3) {
                hmEarbudDevice.getRightDevice().reConnect();
                this.v++;
                HMLog.i(HMBindBaseLogic.TAG, "right connect fail and retry, times:" + this.v, new Object[0]);
                return;
            }
            if (zA0 || zA1) {
                HMLog.i(HMBindBaseLogic.TAG, "onDeviceDisconnected:" + HMDeviceType.EARBUD, new Object[0]);
                destroyBleDevice();
                handleBindFailed(HMBindBaseLogic.BindError.DISCONNECTED);
            }
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void onDeviceConnected(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
        int i;
        HMLog.i(HMBindBaseLogic.TAG, "onDeviceConnected:" + hMDeviceType, new Object[0]);
        if (this.mHasStop.get()) {
            return;
        }
        HMBaseDevice hMBaseDevice = this.mBleDevice;
        if (hMBaseDevice == null) {
            HMLog.error(HMBindBaseLogic.TAG, new Function0() { // from class: o34
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HmBindEarbudLogic.e0();
                }
            });
            destroyBleDevice();
            handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
            return;
        }
        DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
        if (!NetUtil.isNetworkConnected(this.mContext) || deviceInfo == null) {
            destroyBleDevice();
            handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
            return;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        int defaultActiveStatus = getDefaultActiveStatus(deviceSource);
        try {
            i = new JSONObject(HMDeviceWebAPI.bindDeviceToWebWithResponse(getBindInfo(deviceInfo, deviceSource, defaultActiveStatus))).getJSONObject("data").getInt("status");
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (i == -2) {
            handleBindFailed(HMBindBaseLogic.BindError.HAS_BOUND);
            return;
        }
        if (i == -1) {
            handleBindFailed(HMBindBaseLogic.BindError.HAS_DEVICE);
            return;
        }
        if (i != 1) {
            handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
            return;
        }
        Device deviceCreateDbDevice = HMBindBaseLogic.createDbDevice(hMBaseDevice, defaultActiveStatus, getBrandType());
        this.w.getValue().insertOrReplace(deviceCreateDbDevice);
        HMLog.i(HMBindBaseLogic.TAG, "insert when connected: source: " + deviceCreateDbDevice.getDevice_source() + "; adress: " + deviceCreateDbDevice.getDevice_address(), new Object[0]);
        handleBindSuccess(hMBaseDevice, deviceCreateDbDevice);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanError(BleScanOption bleScanOption) {
        HMLog.d(HMBindBaseLogic.TAG, "onScanError:" + bleScanOption, new Object[0]);
        handleBindFailed(HMBindBaseLogic.BindError.SCAN_ERROR);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStart(BleScanOption bleScanOption) {
        HMLog.d(HMBindBaseLogic.TAG, "onScanStart:" + bleScanOption, new Object[0]);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStop(BleScanOption bleScanOption) {
        HMBindBaseLogic.BindError bindError;
        U(false);
        HMLog.i(HMBindBaseLogic.TAG, "onScanStop:<" + bleScanOption + ">,Left:" + this.o + " Right:" + this.p, new Object[0]);
        if (this.mHasStop.get()) {
            return;
        }
        if (bleScanOption != this.r) {
            AdvData advData = this.o;
            if (advData == null || this.p == null) {
                if (advData == null && this.p == null) {
                    bindError = HMBindBaseLogic.BindError.NO_DEVICE;
                } else {
                    bindError = advData == null ? HMBindBaseLogic.BindError.NO_LEFT_DEVICE : HMBindBaseLogic.BindError.NO_RIGHT_DEVICE;
                }
                handleBindFailed(bindError);
                return;
            }
        } else if (this.o == null || this.p == null) {
            this.mHandler.post(new Runnable() { // from class: k34
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f0();
                }
            });
            X();
            return;
        }
        this.mHandler.post(new Runnable() { // from class: j34
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g0();
            }
        });
        V(this.o, this.p);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanedDevice(AdvData advData, BleScanOption bleScanOption) {
        String str = SearchCriteria.LT + advData.rssi + " " + advData.device + " " + advData.getDeviceName() + SearchCriteria.GT;
        HMLog.d(HMBindBaseLogic.TAG, "onScanedDevice : " + str, new Object[0]);
        int i = advData.rssi;
        if (i > 0) {
            HMLog.i(HMBindBaseLogic.TAG, "drop as rssi > 0 : " + str, new Object[0]);
            return;
        }
        if (i < -90) {
            HMLog.i(HMBindBaseLogic.TAG, "drop as rssi < -90 : " + str, new Object[0]);
            return;
        }
        if (i != 0 && !advData.isGeneralDiscoverableMode() && !advData.isLimitedDiscoverableMode()) {
            HMLog.i(HMBindBaseLogic.TAG, "drop connected adv data : " + str, new Object[0]);
            return;
        }
        String address = advData.device.getAddress();
        if (exist(address) || exist(j0(address))) {
            HMLog.i(HMBindBaseLogic.TAG, "return as bound : " + address, new Object[0]);
            return;
        }
        this.m.put(address, advData);
        HMLog.i(HMBindBaseLogic.TAG, "scanedDevices size : " + this.m.size(), new Object[0]);
        U(true);
        if (this.o == null || this.p == null) {
            this.mHandler.post(new Runnable() { // from class: l34
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h0();
                }
            });
        }
        if (this.o != null && this.p != null && bleScanOption == this.r) {
            BleScanCenter.getInstance().stopScan(this.r);
        }
        if (this.o == null || this.p == null || bleScanOption != this.s) {
            return;
        }
        BleScanCenter.getInstance().stopScan(this.s);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void setUserInfo(UserInfo userInfo) {
        this.q = userInfo;
    }

    public void startBind(EarbudBindListener earbudBindListener) {
        super.startBind((HMBindBaseLogic.IBindListener) earbudBindListener);
        this.u = 0;
        this.v = 0;
        this.t = earbudBindListener;
        HMLog.info(HMBindBaseLogic.TAG, new Function0() { // from class: n34
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HmBindEarbudLogic.i0();
            }
        });
        this.m.clear();
        T();
    }
}
