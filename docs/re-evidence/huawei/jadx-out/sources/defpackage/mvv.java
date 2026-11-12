package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.devicesdk.callback.BtDevicePairCallback;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.phoneprocess.mgr.hwearphonepairmgr.EarPhoneCallBack;
import com.huawei.hwdevicemgr.framework.INoitifyPhoneServiceCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: loaded from: classes11.dex */
public class mvv implements DataReceiveCallback {
    private static volatile mvv f;
    private DeviceInfo g;
    private volatile EarPhoneCallBack k;
    private String m;
    private ExtendHandler n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42526a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, edj> f42528c = new HashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f42527b = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    private static final String[] e = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
    private static final String[] d = {"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};
    private int l = -1;
    private int j = -1;
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: mvv.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context != null && intent != null) {
                mvv.this.b(intent);
            } else {
                LogUtil.j("EarPhonePairGuideManager", "context or intent is null");
            }
        }
    };
    private BtDevicePairCallback i = new BtDevicePairCallback() { // from class: mvv.2
        @Override // com.huawei.devicesdk.callback.BtDevicePairCallback
        public void onDevicePairing(BluetoothDevice bluetoothDevice) {
        }

        @Override // com.huawei.devicesdk.callback.BtDevicePairCallback
        public void onDevicePaired(BluetoothDevice bluetoothDevice) {
            if (mvv.this.n.hasMessages(1)) {
                if (mvv.this.i(bluetoothDevice.getAddress())) {
                    mvv.this.n.removeMessages(1);
                    mvv.this.e();
                    return;
                } else {
                    mvv.this.d(bluetoothDevice.getAddress());
                    return;
                }
            }
            LogUtil.j("EarPhonePairGuideManager", "onDevicePaired, time out or not start pair");
        }

        @Override // com.huawei.devicesdk.callback.BtDevicePairCallback
        public void onDevicePairNone(BluetoothDevice bluetoothDevice) {
            LogUtil.j("EarPhonePairGuideManager", "onDevicePairNone");
            if (mvv.this.n == null || !mvv.this.n.hasMessages(2)) {
                if (mvv.this.n != null) {
                    mvv.this.n.removeMessages(1);
                }
                xjt.m("earphone is onDevicePairNone");
                mvv mvvVar = mvv.this;
                mvvVar.j(mvvVar.g);
                return;
            }
            LogUtil.j("EarPhonePairGuideManager", "earphone is remove");
        }
    };

    class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            LogUtil.a("EarPhonePairGuideManager", "message.what: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                xjt.m("earphone connect timeout");
                mvv mvvVar = mvv.this;
                mvvVar.j(mvvVar.g);
                return true;
            }
            if (i == 2) {
                if (message.obj instanceof String) {
                    mvv.this.f((String) message.obj);
                }
                return true;
            }
            LogUtil.j("EarPhonePairGuideManager", "other messgae");
            return false;
        }
    }

    private mvv() {
        this.n = null;
        LogUtil.a("EarPhonePairGuideManager", "create EarPhonePairGuideManager.");
        m();
        cok.d();
        this.n = HandlerCenter.b(new c(), "EarPhonePairGuideManager");
    }

    public static mvv d() {
        if (f == null) {
            synchronized (mvv.class) {
                if (f == null) {
                    f = new mvv();
                }
            }
        }
        return f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    public void d(DeviceInfo deviceInfo, String str) {
        if (deviceInfo == null || TextUtils.isEmpty(str)) {
            LogUtil.j("EarPhonePairGuideManager", "updateEarPhoneMessage, device info or message is null");
            return;
        }
        LogUtil.a("EarPhonePairGuideManager", "deal message from main process: ", str);
        str.hashCode();
        switch (str) {
            case "start_pair_info_back_device":
                d(deviceInfo, 0);
                break;
            case "pair_fail":
                g(deviceInfo);
                break;
            case "cancel_pair_ear_phone":
                f(deviceInfo);
                break;
            case "skip_pair_info":
                m(deviceInfo);
                break;
            case "pull_up_earphone_pair":
                h(deviceInfo);
                break;
            case "get_cached_ear_phone_info":
                d(deviceInfo);
                break;
            case "get_ear_phone_info":
                e(deviceInfo);
                break;
            case "start_pair_info":
                d(deviceInfo, 9);
                break;
            case "retry_pair_info":
                l(deviceInfo);
                break;
            default:
                LogUtil.j("EarPhonePairGuideManager", "updateEarPhoneMessage, other message: ", str);
                break;
        }
    }

    public void c(DeviceInfo deviceInfo) {
        LogUtil.a("EarPhonePairGuideManager", "unPairEarphone in.");
        Map<String, edj> map = f42528c;
        if (map == null) {
            LogUtil.a("EarPhonePairGuideManager", "unPairEarphone sEarPhoneMap is null");
            return;
        }
        if (!map.containsKey(deviceInfo.getDeviceIdentify())) {
            k();
        }
        edj edjVar = f42528c.get(deviceInfo.getDeviceIdentify());
        if (edjVar != null && !TextUtils.isEmpty(edjVar.d())) {
            if (BTDeviceMgrUtil.c().a(edjVar.d())) {
                return;
            }
            LogUtil.j("EarPhonePairGuideManager", "unPairEarphone fail.");
            return;
        }
        e(deviceInfo, new EarPhoneCallBack() { // from class: mvv.4
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwearphonepairmgr.EarPhoneCallBack
            public void onResponse(edj edjVar2, DeviceInfo deviceInfo2) {
                LogUtil.a("EarPhonePairGuideManager", "start unPairEarphone");
                if (BTDeviceMgrUtil.c().a(edjVar2.d())) {
                    return;
                }
                LogUtil.j("EarPhonePairGuideManager", "unPairEarphone fail.");
            }
        });
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("EarPhonePairGuideManager", "onDataReceived: ", Integer.valueOf(i));
        if (eecVar instanceof eef) {
            eef eefVar = (eef) eecVar;
            if (eecVar.getCommandId() != 1) {
                LogUtil.j("EarPhonePairGuideManager", "onDataReceived, message commandId", Integer.valueOf(eecVar.getCommandId()));
                return;
            }
            List<eeg> configInfoList = eefVar.getConfigInfoList();
            if (configInfoList == null || configInfoList.size() == 0) {
                LogUtil.j("EarPhonePairGuideManager", "onDataReceived sampleConfigInfos empty");
                return;
            }
            String strE = eeq.e(configInfoList.get(0).e());
            LogUtil.a("EarPhonePairGuideManager", "configData: ", strE);
            edj edjVar = new edj();
            e(strE, edjVar);
            if (this.k != null) {
                this.k.onResponse(edjVar, deviceInfo);
            }
            cqp.a(100067, qqt.b(edjVar), "", "");
            return;
        }
        if (eecVar instanceof eee) {
            eee eeeVar = (eee) eecVar;
            if (eecVar.getCommandId() != 2) {
                LogUtil.j("EarPhonePairGuideManager", "onDataReceived, message commandId", Integer.valueOf(eecVar.getCommandId()));
                return;
            }
            String strE2 = eeq.e(eeeVar.c());
            int iV = CommonUtil.v(strE2);
            LogUtil.a("EarPhonePairGuideManager", "eventData: ", strE2, " status: ", Integer.valueOf(iV));
            b(iV, deviceInfo);
        }
    }

    private void b(int i, DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            cqp.a(100069, deviceInfo.getDeviceName(), String.valueOf(i), "");
        }
        if (i == 0) {
            b(deviceInfo);
            return;
        }
        if (i == 1 || i == 2) {
            LogUtil.a("EarPhonePairGuideManager", "DEVICE_IGNORE_PAIR");
            a(2, deviceInfo);
            return;
        }
        if (i == 5) {
            a(5, deviceInfo);
            return;
        }
        if (i == 6) {
            a(6, deviceInfo);
            return;
        }
        if (i == 8) {
            f();
            return;
        }
        if (i == 9) {
            a(deviceInfo);
            return;
        }
        if (i == 11) {
            a(11, deviceInfo);
        } else if (i != 12) {
            LogUtil.a("EarPhonePairGuideManager", "other status");
        } else {
            a(12, deviceInfo);
        }
    }

    private void e(String str, edj edjVar) {
        try {
            List<eew> listE = new eet().b(str).e();
            if (listE != null && listE.size() != 0) {
                for (eew eewVar : listE) {
                    switch (CommonUtil.v(eewVar.e())) {
                        case 1:
                            edjVar.a(eeq.d(eewVar.b()).trim());
                            break;
                        case 2:
                            edjVar.b(eeq.d(eewVar.b()).trim());
                            break;
                        case 3:
                            edjVar.e(CommonUtil.v(eewVar.b()));
                            break;
                        case 4:
                            edjVar.b(CommonUtil.v(eewVar.b()));
                            break;
                        case 5:
                            edjVar.d(CommonUtil.v(eewVar.b()));
                            break;
                        case 6:
                            edjVar.c(CommonUtil.v(eewVar.b()));
                            break;
                        default:
                            Object[] objArr = new Object[1];
                            objArr[0] = "other info";
                            LogUtil.a("EarPhonePairGuideManager", objArr);
                            break;
                    }
                }
                return;
            }
            LogUtil.j("EarPhonePairGuideManager", "tlvList is empty");
        } catch (eeu unused) {
            LogUtil.e("EarPhonePairGuideManager", "parseData is error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            LogUtil.a("EarPhonePairGuideManager", "action is null");
            return;
        }
        LogUtil.a("EarPhonePairGuideManager", "action: ", action);
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            this.l = intExtra;
            LogUtil.a("EarPhonePairGuideManager", "mHfpStats: ", Integer.valueOf(intExtra));
            if (!d(intent)) {
                LogUtil.j("EarPhonePairGuideManager", "not current ear phone");
                return;
            } else if (this.l == 2) {
                e();
                return;
            }
        }
        if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            this.j = intExtra2;
            LogUtil.a("EarPhonePairGuideManager", "mA2dpStats: ", Integer.valueOf(intExtra2));
            if (!d(intent)) {
                LogUtil.j("EarPhonePairGuideManager", "not current ear phone");
                return;
            } else if (this.j == 2) {
                e();
                return;
            }
        }
        xjt.m("a2dp or hfp connect error");
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.n.removeMessages(1);
        this.l = -1;
        this.j = -1;
        a(1, this.g);
        i(this.g);
        n();
    }

    private void b() {
        if (this.l == 0 && this.j == 0) {
            this.l = -1;
            this.j = -1;
            j(this.g);
        }
    }

    private boolean d(Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice == null) {
            LogUtil.j("EarPhonePairGuideManager", "hfp btDevice is null");
            return false;
        }
        String address = bluetoothDevice.getAddress();
        return (TextUtils.isEmpty(address) || TextUtils.isEmpty(this.m) || !TextUtils.equals(address, this.m)) ? false : true;
    }

    private void b(DeviceInfo deviceInfo) {
        e(deviceInfo, new EarPhoneCallBack() { // from class: mvv.5
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwearphonepairmgr.EarPhoneCallBack
            public void onResponse(edj edjVar, DeviceInfo deviceInfo2) {
                LogUtil.a("EarPhonePairGuideManager", "deviceStartPair");
                mvv.this.a(deviceInfo2.getDeviceIdentify(), edjVar);
                mvv.this.a(4, deviceInfo2);
                mvv.this.d(deviceInfo2, 9);
            }
        });
    }

    private void e(DeviceInfo deviceInfo) {
        e(deviceInfo, new EarPhoneCallBack() { // from class: mvv.1
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwearphonepairmgr.EarPhoneCallBack
            public void onResponse(edj edjVar, DeviceInfo deviceInfo2) {
                LogUtil.a("EarPhonePairGuideManager", "getEarPhoneInfo");
                mvv.this.a(deviceInfo2.getDeviceIdentify(), edjVar);
                mvv.this.a(4, deviceInfo2);
            }
        });
    }

    private void d(DeviceInfo deviceInfo) {
        e(deviceInfo, new EarPhoneCallBack() { // from class: mvv.9
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwearphonepairmgr.EarPhoneCallBack
            public void onResponse(edj edjVar, DeviceInfo deviceInfo2) {
                LogUtil.a("EarPhonePairGuideManager", "getCachedEarPhoneInfo");
                if (edjVar != null) {
                    mvv.this.a(deviceInfo2.getDeviceIdentify(), edjVar);
                }
                mvv.this.a(4, deviceInfo2);
            }
        });
    }

    private void m() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.earphoneManager", this);
    }

    private void l() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
            BaseApplication.getContext().registerReceiver(this.h, intentFilter);
        } catch (IllegalArgumentException | SecurityException e2) {
            LogUtil.e("EarPhonePairGuideManager", "registerConnectedBroadcast is error:", ExceptionUtils.c(e2));
        }
    }

    private void n() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.h);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("EarPhonePairGuideManager", "unRegisterBroadCast is error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, int i) {
        Map<String, edj> map;
        if (deviceInfo == null || (map = f42528c) == null) {
            LogUtil.j("EarPhonePairGuideManager", "pairEarPhone, deviceInfo is null");
            return;
        }
        edj edjVar = map.get(deviceInfo.getDeviceIdentify());
        if (edjVar == null) {
            LogUtil.j("EarPhonePairGuideManager", "pairEarPhone, earPhoneInfo is null");
            return;
        }
        String strD = edjVar.d();
        if (TextUtils.isEmpty(strD) || !BluetoothAdapter.checkBluetoothAddress(strD)) {
            LogUtil.j("EarPhonePairGuideManager", "pairEarPhone, earPhoneId is null or earPhoneId is wrong");
            xjt.m("earphone id is error");
            j(deviceInfo);
        } else {
            if ((edjVar.b() & 1) == 0) {
                a(0, deviceInfo);
                return;
            }
            if (edjVar.e() == 0) {
                LogUtil.j("EarPhonePairGuideManager", "earphone is outside");
                a(0, deviceInfo);
            } else {
                if (edjVar.a() == 0) {
                    LogUtil.j("EarPhonePairGuideManager", "earphone is not close");
                    xjt.m("earphone is not close");
                    j(deviceInfo);
                    return;
                }
                c(deviceInfo, i);
            }
        }
    }

    private void e(DeviceInfo deviceInfo, EarPhoneCallBack earPhoneCallBack) {
        this.k = earPhoneCallBack;
        n(deviceInfo);
        this.g = deviceInfo;
        edc.e().sendSampleConfigCommand(deviceInfo, c(), "EarPhonePairGuideManager");
        cqp.a(100066, "", "", "");
    }

    private eef c() {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.unitedevice.earphoneManager");
        eefVar.setWearPkgName("earphoneManager");
        eefVar.setCommandId(1);
        ArrayList arrayList = new ArrayList(5);
        eeg eegVar = new eeg();
        eegVar.b(900100008L);
        eegVar.b(2);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    private void f(DeviceInfo deviceInfo) {
        Map<String, edj> map = f42528c;
        if (map != null) {
            map.remove(deviceInfo.getDeviceIdentify());
        }
        o();
        this.m = null;
        n();
        ExtendHandler extendHandler = this.n;
        if (extendHandler != null) {
            extendHandler.removeMessages(1);
        }
        n(deviceInfo);
        edc.e().sendSampleEventCommand(deviceInfo, c(7), "EarPhonePairGuideManager");
        cqp.a(100068, "", String.valueOf(7), "");
    }

    private void o() {
        if (this.m == null) {
            LogUtil.j("EarPhonePairGuideManager", "removeEarPhone, mEarPhoneIdentify is null");
            return;
        }
        try {
            BluetoothDevice bluetoothDeviceB = BTDeviceMgrUtil.c().b(this.m);
            if (bluetoothDeviceB == null) {
                LogUtil.j("EarPhonePairGuideManager", "btDevice is null");
                return;
            }
            coi.b().b(bluetoothDeviceB);
            if (bluetoothDeviceB.getBondState() == 12) {
                BTDeviceMgrUtil.c().b(bluetoothDeviceB);
            } else {
                BTDeviceMgrUtil.c().d(this.m);
            }
        } catch (SecurityException e2) {
            LogUtil.e("EarPhonePairGuideManager", "removeEarPhone SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private void m(DeviceInfo deviceInfo) {
        n(deviceInfo);
        edc.e().sendSampleEventCommand(deviceInfo, c(3), "EarPhonePairGuideManager");
        cqp.a(100068, "", String.valueOf(3), "");
    }

    private void l(DeviceInfo deviceInfo) {
        n(deviceInfo);
        edc.e().sendSampleEventCommand(deviceInfo, c(4), "EarPhonePairGuideManager");
        cqp.a(100068, "", String.valueOf(4), "");
    }

    private void g(DeviceInfo deviceInfo) {
        n(deviceInfo);
        edc.e().sendSampleEventCommand(deviceInfo, c(8), "EarPhonePairGuideManager");
        cqp.a(100068, "", String.valueOf(8), "");
    }

    private void i(DeviceInfo deviceInfo) {
        n(deviceInfo);
        edc.e().sendSampleEventCommand(deviceInfo, c(13), "EarPhonePairGuideManager");
        cqp.a(100068, "", String.valueOf(13), "");
    }

    private void h(DeviceInfo deviceInfo) {
        n(deviceInfo);
        edc.e().sendSampleEventCommand(deviceInfo, c(11), "EarPhonePairGuideManager");
        cqp.a(100068, "", String.valueOf(11), "");
    }

    private void c(DeviceInfo deviceInfo, int i) {
        n(deviceInfo);
        edc.e().sendSampleEventCommand(deviceInfo, c(i), "EarPhonePairGuideManager");
        cqp.a(100068, "", String.valueOf(i), "");
    }

    private eee c(int i) {
        LogUtil.a("EarPhonePairGuideManager", "getSampleEvent: ", Integer.valueOf(i));
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.earphoneManager");
        eeeVar.setWearPkgName("earphoneManager");
        eeeVar.setCommandId(2);
        eeeVar.a(800100005L);
        eeeVar.a(0);
        eeeVar.e(eeq.c(eeq.d(i)));
        return eeeVar;
    }

    private void n(DeviceInfo deviceInfo) {
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(deviceInfo.getDeviceIdentify());
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "EarPhonePairGuideManager");
        if (coq.d(deviceList)) {
            return;
        }
        DeviceInfo deviceInfo2 = deviceList.get(0);
        if (!TextUtils.isEmpty(deviceInfo.getExpandCapability()) || deviceInfo2 == null || TextUtils.isEmpty(deviceInfo2.getExpandCapability())) {
            return;
        }
        deviceInfo.setExpandCapability(deviceInfo2.getExpandCapability());
    }

    private void a(DeviceInfo deviceInfo) {
        LogUtil.a("EarPhonePairGuideManager", "checkEarPhone: ");
        Map<String, edj> map = f42528c;
        if (map == null) {
            return;
        }
        edj edjVar = map.get(deviceInfo.getDeviceIdentify());
        if (edjVar == null) {
            LogUtil.j("EarPhonePairGuideManager", "checkEarPhone, earPhoneInfo is null");
            return;
        }
        String strD = edjVar.d();
        if (TextUtils.isEmpty(strD)) {
            j(deviceInfo);
            return;
        }
        this.m = strD;
        Vector<String> vectorD = coi.b().d();
        if (!coq.d(vectorD) && vectorD.contains(strD)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.obj = strD;
            this.n.sendMessage(messageObtain, 1000L);
            return;
        }
        f(strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(final String str) {
        if (b(str)) {
            if (i(str)) {
                e();
                return;
            } else {
                d(str);
                return;
            }
        }
        if (!g()) {
            LogUtil.j("EarPhonePairGuideManager", "startScanEarPhone, app is not has permission");
            e(str);
            return;
        }
        final boolean[] zArr = {false};
        cmy.a aVar = new cmy.a();
        aVar.b(5);
        aVar.a(str);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(aVar.c());
        xgt.b().scanDevice(ScanMode.BR_BLE, arrayList, new DeviceScanCallback() { // from class: mvv.8
            @Override // com.huawei.devicesdk.callback.DeviceScanCallback
            public void scanResult(UniteDevice uniteDevice, byte[] bArr, String str2, int i) {
                if (i == 22) {
                    LogUtil.a("EarPhonePairGuideManager", "startScan finish");
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    zArr2[0] = true;
                    mvv.this.e(str);
                    return;
                }
                if (uniteDevice == null || uniteDevice.getDeviceInfo() == null) {
                    LogUtil.j("EarPhonePairGuideManager", "device is null");
                    return;
                }
                LogUtil.j("EarPhonePairGuideManager", "startScan,result: ", uniteDevice.getDeviceInfo().getDeviceName(), " mac: ", cpl.a(uniteDevice.getDeviceInfo().getDeviceMac()), " addition: ", str2);
                if (TextUtils.equals(uniteDevice.getDeviceInfo().getDeviceMac(), str)) {
                    boolean[] zArr3 = zArr;
                    if (zArr3[0]) {
                        LogUtil.j("EarPhonePairGuideManager", "scan aready finish");
                    } else {
                        zArr3[0] = true;
                        mvv.this.e(str);
                    }
                }
            }
        });
    }

    private boolean g() {
        if (PermissionUtil.d()) {
            return i();
        }
        if (a() && CommonUtil.x(BaseApplication.getContext())) {
            return j();
        }
        return h();
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    private boolean j() {
        return lsg.d(BaseApplication.getContext(), e);
    }

    private boolean h() {
        return lsg.d(BaseApplication.getContext(), f42527b);
    }

    private boolean i() {
        return lsg.d(BaseApplication.getContext(), d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (b(str)) {
            if (i(str)) {
                e();
                return;
            } else {
                d(str);
                return;
            }
        }
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        if (remoteDevice == null) {
            LogUtil.j("EarPhonePairGuideManager", "connectedEarPhone error. mBluetoothDevice is null.");
            return;
        }
        this.n.sendEmptyMessage(1, 35000L);
        a(str);
        LogUtil.a("EarPhonePairGuideManager", "connectedEarPhone pair device. ", cpl.a(str), " result:", Boolean.valueOf(coi.b().c(remoteDevice, this.i)));
    }

    private void a(final String str) {
        if (CommonUtil.bg()) {
            ThreadPoolManager.c().a("EarPhonePairGuideManager", new Runnable() { // from class: mvy
                @Override // java.lang.Runnable
                public final void run() {
                    mvv.c(str);
                }
            });
        }
    }

    static /* synthetic */ void c(String str) {
        if (coj.d(str)) {
            return;
        }
        coj.b(str);
    }

    private boolean b(String str) {
        try {
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
            if (remoteDevice != null) {
                return remoteDevice.getBondState() == 12;
            }
            LogUtil.j("EarPhonePairGuideManager", "btDevicePairHfpAndA2dp error. mBluetoothDevice is null.");
            return false;
        } catch (IllegalArgumentException | SecurityException e2) {
            LogUtil.e("EarPhonePairGuideManager", "isConnected Exception:", ExceptionUtils.c(e2));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(String str) {
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        if (remoteDevice == null) {
            LogUtil.j("EarPhonePairGuideManager", "isConnectedHfpOrA2dp error. mBluetoothDevice is null.");
            return false;
        }
        boolean zC = cok.d().c(remoteDevice);
        boolean zD = cok.d().d(remoteDevice);
        LogUtil.a("EarPhonePairGuideManager", "isConnectedHfpOrA2dp", " isConnectedHfp: ", Boolean.valueOf(zC), " isConnectedA2dp: ", Boolean.valueOf(zD));
        return zD || zC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        if (remoteDevice == null) {
            LogUtil.j("EarPhonePairGuideManager", "btDevicePairHfpAndA2dp error. mBluetoothDevice is null.");
            return;
        }
        boolean zC = cok.d().c(remoteDevice);
        boolean zD = cok.d().d(remoteDevice);
        LogUtil.a("EarPhonePairGuideManager", "btDevicePairHfpAndA2dp", " isConnectedHfp: ", Boolean.valueOf(zC), " isConnectedA2dp: ", Boolean.valueOf(zD));
        l();
        if (!zD) {
            LogUtil.a("EarPhonePairGuideManager", "btDevicePairHfpAndA2dp", " isConnectedA2dp: ", Boolean.valueOf(cok.d().b(remoteDevice)));
        }
        if (zC) {
            return;
        }
        LogUtil.a("EarPhonePairGuideManager", "btDevicePairHfpAndA2dp", " isConnectedHfp: ", Boolean.valueOf(cok.d().e(remoteDevice)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("EarPhonePairGuideManager", "notifyMessageResult, deviceInfo is null");
            return;
        }
        String strB = "";
        if (i == 1) {
            cqp.a(100070, deviceInfo.getDeviceName(), "", "");
        }
        try {
            Map<String, edj> map = f42528c;
            if (map != null) {
                strB = qqt.b(map.get(deviceInfo.getDeviceIdentify()));
            }
            String str = strB;
            LogUtil.a("EarPhonePairGuideManager", "notifyMessageResult: ", str);
            INoitifyPhoneServiceCallback iNoitifyPhoneServiceCallbackE = mjy.b().e("earphoneManager");
            if (iNoitifyPhoneServiceCallbackE == null) {
                LogUtil.j("EarPhonePairGuideManager", "mCommonCallback is null");
            } else {
                iNoitifyPhoneServiceCallbackE.executeResponse("earphoneManager", i, deviceInfo, 0, str);
            }
        } catch (RemoteException unused) {
            LogUtil.e("EarPhonePairGuideManager", "notifyMessageResult, exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(DeviceInfo deviceInfo) {
        g(deviceInfo);
        f();
    }

    private void f() {
        Map<String, edj> map;
        edj edjVar;
        a(-1, this.g);
        DeviceInfo deviceInfo = this.g;
        if (deviceInfo != null && (map = f42528c) != null && (edjVar = map.get(deviceInfo.getDeviceIdentify())) != null) {
            LogUtil.a("EarPhonePairGuideManager", "pairFail, isUnPair: ", Boolean.valueOf(BTDeviceMgrUtil.c().a(edjVar.d())));
        }
        this.n.removeMessages(1);
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, edj edjVar) {
        LogUtil.a("EarPhonePairGuideManager", "storeEarphoneMap. ");
        Map<String, edj> map = f42528c;
        if (map == null) {
            LogUtil.j("EarPhonePairGuideManager", "storeEarphoneMap sEarPhoneMap is null");
            return;
        }
        map.put(str, edjVar);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), "cached_earphone_key", new Gson().toJson(f42528c), new StorageParams(1));
    }

    private void k() {
        LogUtil.a("EarPhonePairGuideManager", "restoreEarphoneMapFromSp. ");
        try {
            Map<String, edj> map = (Map) new Gson().fromJson(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), "cached_earphone_key"), new TypeToken<Map<String, edj>>() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwearphonepairmgr.EarPhonePairGuideManager$8
            }.getType());
            if (map != null) {
                f42528c = map;
            } else {
                LogUtil.j("EarPhonePairGuideManager", "cachedEarPhoneInfoMap is null.");
            }
        } catch (JsonSyntaxException unused) {
            LogUtil.e("EarPhonePairGuideManager", "restoreEarphoneMapFromSp jsonSyntaxException.");
        } catch (NumberFormatException unused2) {
            LogUtil.e("EarPhonePairGuideManager", "restoreEarphoneMapFromSp NumberFormatException.");
        }
    }
}
