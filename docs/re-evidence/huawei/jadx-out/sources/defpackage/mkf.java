package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceBondStateCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback;
import com.huawei.hwbtsdk.btdatatype.callback.IAddDeviceStateCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.OperationDeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.DeviceStateCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.wearmgr.outofprocess.datatype.BluetoothType;
import com.huawei.wearmgr.phoneprocess.adapterapi.WearMgrAdapterApi;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class mkf implements HwDeviceMgrInterface {
    protected DeviceStateCallback d;
    private IBaseCallback h;
    private Context k;
    private lof n;
    private final BtDeviceBondStateCallback o;
    private HandlerThread p;
    private Handler q;
    private mxg r;
    private mxc s;
    private BtDeviceStateCallback t;
    private BroadcastReceiver w;
    public static final ConcurrentHashMap<String, mka> e = new ConcurrentHashMap<>(24);
    private static final Object f = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41797c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41796a = new Object();
    private static HwDeviceMgrInterface g = null;
    private static mkf i = null;
    private static mkj j = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected BTDeviceMgrUtil f41798b = BTDeviceMgrUtil.c();
    private List<DeviceInfo> l = new ArrayList(24);
    private BtDeviceResponseCallback m = new BtDeviceResponseCallback() { // from class: mkf.4
        @Override // com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback
        public void onResponse(int i2, Object obj) {
            try {
                if (mkf.this.h == null || !(obj instanceof String)) {
                    return;
                }
                mkf.this.h.onResponse(i2, (String) obj);
            } catch (RemoteException unused) {
                LogUtil.e("HwDeviceMgr", "exception remoteException");
            }
        }
    };

    private mkf() {
        this.n = null;
        BtDeviceBondStateCallback btDeviceBondStateCallback = new BtDeviceBondStateCallback() { // from class: mkf.3
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceBondStateCallback
            public void onBtDeviceBondNone(String str) {
                int iA = mkf.j.a(str, mkf.this.l);
                if (iA != -1) {
                    DeviceInfo deviceInfo = (DeviceInfo) mkf.this.l.get(iA);
                    if (deviceInfo != null) {
                        Intent intent = new Intent("com.huawei.bone.action.SYSTEM_BLUETOOTH_UNBIND_DEVICE");
                        intent.putExtra("DEVICE_SECURITY_UUID", deviceInfo.getSecurityUuid());
                        mkf.this.k.sendBroadcast(intent, LocalBroadcast.f36595c);
                    }
                    for (DeviceInfo deviceInfo2 : mkf.this.l) {
                        if (deviceInfo2 != null && !TextUtils.isEmpty(deviceInfo2.getDeviceIdentify()) && deviceInfo2.getDeviceIdentify().equalsIgnoreCase(str) && deviceInfo2.getDeviceBluetoothType() == 2) {
                            return;
                        }
                    }
                    LogUtil.a("HwDeviceMgr", "enter onBtDeviceBondNone(). need to remove device.");
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(str);
                    mkf.this.unPair(arrayList, true);
                }
            }
        };
        this.o = btDeviceBondStateCallback;
        this.w = new BroadcastReceiver() { // from class: mkf.1
            private String d = "";

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                boolean z;
                if (intent != null) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
                    String str = simpleDateFormat.format(new Date());
                    if ("android.intent.action.TIME_TICK".equals(intent.getAction())) {
                        if ("".equals(this.d)) {
                            this.d = str;
                            return;
                        }
                        try {
                            Date date = simpleDateFormat2.parse(str);
                            Date date2 = simpleDateFormat2.parse(this.d);
                            long time = date.getTime() - date2.getTime();
                            LogUtil.a("HwDeviceMgr", "currentTime:", date, ",mLaterTime:", date2, ",timeTap:", Long.valueOf(time));
                            long j2 = (time / 1000) / 60;
                            if (j2 > 25 || j2 < -25) {
                                this.d = str;
                                z = true;
                            } else {
                                this.d = str;
                                return;
                            }
                        } catch (ParseException unused) {
                            this.d = str;
                            return;
                        }
                    } else {
                        this.d = str;
                        z = false;
                    }
                    if (mkf.j != null) {
                        mkf.j.e(intent, z, mkf.this.l);
                    }
                }
            }
        };
        this.t = new BtDeviceStateCallback() { // from class: mkf.5
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
            public void onDeviceConnectionStateChanged(DeviceInfo deviceInfo, int i2, OperationDeviceInfo operationDeviceInfo) {
                LogUtil.a("HwDeviceMgr", "updateDeviceList btState: ", Integer.valueOf(i2));
                mkd.d().e(deviceInfo, i2, operationDeviceInfo);
            }

            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
            public void onDataReceived(DeviceInfo deviceInfo, int i2, byte[] bArr) {
                mkc.e().c(deviceInfo, i2, bArr);
            }

            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
            public void onAckReceived(DeviceInfo deviceInfo, int i2, byte[] bArr) {
                if (mkf.this.d != null) {
                    mkf.this.d.onAckReceived(deviceInfo, i2, bArr);
                }
            }

            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceStateCallback
            public void disconnectBluetooth(DeviceInfo deviceInfo, int i2) {
                mkd.d().e(deviceInfo);
            }
        };
        LogUtil.a("HwDeviceMgr", "Enter HwDeviceMgr().");
        this.k = BaseApplication.getContext();
        j();
        lof lofVarD = lof.d(this.k);
        this.n = lofVarD;
        lofVarD.d(this.t);
        j = mkj.d();
        this.s = mxc.e();
        this.r = mxg.b();
        this.d = null;
        HandlerThread handlerThread = new HandlerThread("save_dms_data");
        this.p = handlerThread;
        handlerThread.start();
        this.q = new Handler(this.p.getLooper());
        m();
        k();
        BTDeviceMgrUtil bTDeviceMgrUtil = this.f41798b;
        if (bTDeviceMgrUtil != null) {
            bTDeviceMgrUtil.a(btDeviceBondStateCallback);
        }
    }

    public List<DeviceInfo> a() {
        return this.l;
    }

    private void m() {
        if (this.l != null) {
            LogUtil.a("HwDeviceMgr", "Start to find last active device.");
            o();
            if (!AuthorizationUtils.c(BaseApplication.getContext())) {
                LogUtil.j("HwDeviceMgr", "start active device, but not authorize, so return");
            } else {
                if (j.b(this.l).isEmpty()) {
                    return;
                }
                LogUtil.a("HwDeviceMgr", "Find active device.");
                d(this.l);
            }
        }
    }

    private void b(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "oldClearDeviceByMac");
        ArrayList arrayList = new ArrayList(24);
        synchronized (e()) {
            for (DeviceInfo deviceInfo2 : this.l) {
                if (deviceInfo2 == null) {
                    return;
                }
                String deviceIdentify = deviceInfo2.getDeviceIdentify();
                if (deviceIdentify.equalsIgnoreCase(str)) {
                    LogUtil.a("HwDeviceMgr", "wanted remove device.");
                    mkb.c(deviceIdentify, -1);
                    mkb.f(deviceIdentify, "");
                    mkb.e(deviceIdentify, 3);
                    if (-2 != deviceInfo2.getProductType()) {
                        LogUtil.a("HwDeviceMgr", "Add wanted deleted device into list.");
                        arrayList.add(deviceInfo2);
                    }
                    LogUtil.a("HwDeviceMgr", "Remove Device from list.");
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
            if (deviceList != null) {
                Iterator<DeviceInfo> it = deviceList.iterator();
                while (it.hasNext()) {
                    String deviceIdentify2 = it.next().getDeviceIdentify();
                    if (deviceIdentify2 != null && deviceIdentify2.equalsIgnoreCase(str)) {
                        it.remove();
                        break;
                    }
                }
            }
            if (deviceInfo != null) {
                this.s.d(str);
                this.l.remove(deviceInfo);
                mkc.e().d();
            }
            if (arrayList.size() != 0) {
                i();
                lof lofVar = this.n;
                if (lofVar != null) {
                    lofVar.b(arrayList);
                    j.e(arrayList);
                    e(deviceList);
                    nem.d().d(this.l);
                    return;
                }
                return;
            }
            LogUtil.a("HwDeviceMgr", "Do not need delete device.");
        }
    }

    private void j() {
        if (CompileParameterUtil.d("IS_RELEASE_VERSION")) {
            return;
        }
        String strB = CommonUtil.b(Process.myPid());
        if (TextUtils.isEmpty(strB) || cip.e.equals(strB)) {
            return;
        }
        throw new RuntimeException("DMS must init in PhoneService process." + strB);
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void destroy() {
        Context context = this.k;
        if (context != null) {
            try {
                context.unregisterReceiver(this.w);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("HwDeviceMgr", "destroy IllegalArgumentException");
            }
            lof lofVar = this.n;
            if (lofVar != null) {
                lofVar.g();
            }
            mkj mkjVar = j;
            if (mkjVar != null) {
                mkjVar.b();
            }
        }
        mxg mxgVar = this.r;
        if (mxgVar != null) {
            mxgVar.d();
        }
        mxc mxcVar = this.s;
        if (mxcVar != null) {
            mxcVar.d();
        }
        h();
        g();
    }

    private void g() {
        HandlerThread handlerThread = this.p;
        if (handlerThread != null) {
            handlerThread.quit();
            this.p = null;
        }
    }

    private static void h() {
        synchronized (f) {
            g = null;
        }
    }

    private void k() {
        if (this.k != null) {
            this.k.registerReceiver(this.w, new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            this.k.registerReceiver(this.w, intentFilter);
            this.k.registerReceiver(this.w, new IntentFilter("android.intent.action.DATE_CHANGED"));
        }
    }

    public Object e() {
        return f41796a;
    }

    private void o() {
        LogUtil.a("HwDeviceMgr", "Enter getUsedDevicesFromStorage().");
        Map<String, String> mapE = SharedPreferenceManager.e(this.k, String.valueOf(1000));
        if (mapE == null) {
            LogUtil.j("HwDeviceMgr", "map is null.");
            return;
        }
        synchronized (e()) {
            this.l.clear();
            Iterator<Map.Entry<String, String>> it = mapE.entrySet().iterator();
            while (it.hasNext()) {
                DeviceInfo deviceInfo = (DeviceInfo) new Gson().fromJson(it.next().getValue(), DeviceInfo.class);
                if (deviceInfo != null) {
                    deviceInfo.setDeviceConnectState(3);
                    this.l.add(deviceInfo);
                }
            }
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        LogUtil.a("HwDeviceMgr", "updateDeviceDbInfo mDeviceInfoList size: ", Integer.valueOf(this.l.size()));
        if (this.l.size() == 0) {
            mko.e(false, false);
        } else {
            mko.e(true, false);
        }
    }

    public void a(final List<DeviceInfo> list) {
        LogUtil.a("HwDeviceMgr", "Enter setUsedDevicesToStorage(). sync");
        if (list == null) {
            return;
        }
        this.q.post(new Runnable() { // from class: mkf.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (mkf.this.e()) {
                    mkf.this.l.clear();
                    mkf.this.l.addAll(list);
                    mkf.this.s();
                    mkf.this.r();
                }
            }
        });
    }

    public void i() {
        LogUtil.a("HwDeviceMgr", "Enter setUsedDevicesToStorage().");
        this.q.post(new Runnable() { // from class: mkf.7
            @Override // java.lang.Runnable
            public void run() {
                synchronized (mkf.this.e()) {
                    mkf.this.s();
                    mkf.this.r();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        LogUtil.a("HwDeviceMgr", "Enter updateStorageDevices.");
        List<DeviceInfo> list = this.l;
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            LogUtil.a("HwDeviceMgr", "updateStorageDevices DEVICE_INFO_LIST is empty");
            SharedPreferenceManager.i(this.k, String.valueOf(1000));
            return;
        }
        Set<String> setA = SharedPreferenceManager.a(this.k, String.valueOf(1000));
        LogUtil.a("HwDeviceMgr", "updateStorageDevices size: ", Integer.valueOf(setA.size()), Integer.valueOf(this.l.size()));
        for (DeviceInfo deviceInfo : this.l) {
            LogUtil.a("HwDeviceMgr", "updateStorageDevices device: ", deviceInfo.getDeviceName());
            if (TextUtils.isEmpty(deviceInfo.getWearEngineDeviceId())) {
                mkc.e();
                deviceInfo.setWearEngineDeviceId(mkc.a());
            }
            SharedPreferenceManager.e(this.k, String.valueOf(1000), deviceInfo.getDeviceIdentify(), new Gson().toJson(deviceInfo), new StorageParams());
            setA.remove(deviceInfo.getDeviceIdentify());
        }
        if (setA.size() == 0) {
            return;
        }
        LogUtil.a("HwDeviceMgr", "updateStorageDevices start delete devices");
        Iterator<String> it = setA.iterator();
        while (it.hasNext()) {
            SharedPreferenceManager.b(this.k, String.valueOf(1000), it.next());
        }
    }

    public static HwDeviceMgrInterface e(Context context) {
        mkn mknVarE;
        synchronized (f) {
            mknVarE = mkn.e();
            g = mknVarE;
        }
        return mknVarE;
    }

    public static mkf d() {
        mkf mkfVar;
        synchronized (f41797c) {
            if (i == null) {
                i = new mkf();
            }
            mkfVar = i;
        }
        return mkfVar;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void addDevice(DeviceParameter deviceParameter, IAddDeviceStateCallback iAddDeviceStateCallback, String str) {
        ArrayList arrayList;
        LogUtil.a("HwDeviceMgr", "Enter addDevice().");
        nem.d().e(2);
        if (this.n == null || deviceParameter == null) {
            return;
        }
        if (deviceParameter.getBluetoothType() == 0) {
            for (DeviceInfo deviceInfo : this.l) {
                if (deviceInfo != null && "AndroidWear".equals(deviceInfo.getDeviceIdentify())) {
                    deviceInfo.setDeviceActiveState(1);
                    break;
                }
            }
        }
        if (deviceParameter.isSupportHeartRate()) {
            arrayList = new ArrayList(16);
            for (int i2 : edh.a()) {
                arrayList.addAll(mmx.c(i2));
            }
        } else {
            arrayList = null;
        }
        this.n.c(deviceParameter, arrayList, iAddDeviceStateCallback);
    }

    public void e(String str) {
        mkj mkjVar = j;
        if (mkjVar == null) {
            LogUtil.j("HwDeviceMgr", "sHwDevicePartMgr is null.");
            return;
        }
        mkjVar.c();
        if (this.n == null || TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.a("HwDeviceMgr", "addDevice goingDisconnectDevice is not null.");
        this.n.b(false, str);
        this.n.d(str);
        this.n.n(str);
        List<Integer> listB = j.b(this.l);
        ArrayList arrayList = new ArrayList(24);
        if (listB != null && !listB.isEmpty()) {
            Iterator<Integer> it = listB.iterator();
            while (it.hasNext()) {
                b(this.l.get(it.next().intValue()), str, arrayList);
            }
        }
        j.e(arrayList);
        d(str);
    }

    private void b(DeviceInfo deviceInfo, String str, List<DeviceInfo> list) {
        if (deviceInfo == null) {
            LogUtil.j("HwDeviceMgr", "addDevice active device info is null");
            return;
        }
        LogUtil.d("HwDeviceMgr", "addDevice active device", deviceInfo);
        if (str.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
            LogUtil.a("HwDeviceMgr", "addDevice find Target device");
            list.add(deviceInfo);
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void connectDevice(com.huawei.devicesdk.entity.DeviceInfo deviceInfo, int i2) {
        if (deviceInfo != null) {
            e(deviceInfo);
            return;
        }
        boolean z = false;
        boolean z2 = (BluetoothType.BLE.getValue() & i2) == BluetoothType.BLE.getValue();
        boolean z3 = (BluetoothType.BR.getValue() & i2) == BluetoothType.BR.getValue();
        boolean z4 = (i2 & BluetoothType.AW.getValue()) == BluetoothType.AW.getValue();
        if (z2 || z3 || z4) {
            if (z2 && !z3) {
                z = true;
            }
            d(z);
        }
    }

    private void e(com.huawei.devicesdk.entity.DeviceInfo deviceInfo) {
        DeviceInfo deviceInfo2;
        LogUtil.a("HwDeviceMgr", "Enter connectDeviceDirectly().");
        if (deviceInfo.getDeviceMac() == null || this.l == null || this.n == null) {
            return;
        }
        nem.d().e(2);
        j.c();
        Iterator<DeviceInfo> it = this.l.iterator();
        while (true) {
            if (!it.hasNext()) {
                deviceInfo2 = null;
                break;
            }
            deviceInfo2 = it.next();
            if (deviceInfo2 != null && deviceInfo.getDeviceMac().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                break;
            }
        }
        if (deviceInfo2 == null) {
            deviceInfo2 = new DeviceInfo();
            deviceInfo2.setDeviceName(deviceInfo.getDeviceName());
            deviceInfo2.setDeviceIdentify(deviceInfo.getDeviceMac());
            deviceInfo2.setDeviceProtocol(2);
            deviceInfo2.setProductType(deviceInfo.getDeviceType());
            deviceInfo2.setDeviceActiveState(1);
            deviceInfo2.setDeviceBluetoothType(deviceInfo.getDeviceBtType());
            synchronized (e()) {
                this.l.add(deviceInfo2);
                i();
            }
        }
        j.c(deviceInfo2, this.l);
        int iA = j.a(deviceInfo2.getDeviceIdentify(), this.l);
        if (iA == -1) {
            LogUtil.j("HwDeviceMgr", "History List do not have active device.");
            return;
        }
        if (this.l.get(iA).getDeviceActiveState() != 1) {
            mkb.c(deviceInfo.getDeviceMac()).resetDeviceCapability();
            this.l.get(iA).setDeviceActiveState(1);
            i();
        }
        lof lofVar = this.n;
        if (lofVar != null) {
            lofVar.b(deviceInfo2, true);
        }
    }

    private void c(String str) {
        boolean z;
        synchronized (e()) {
            z = false;
            LogUtil.a("HwDeviceMgr", "removeCurrentDevice getDeviceInfoListHandle");
            Iterator<DeviceInfo> it = this.l.iterator();
            while (it.hasNext()) {
                if (it.next().getDeviceIdentify().equalsIgnoreCase(str)) {
                    z = true;
                }
            }
        }
        LogUtil.a("HwDeviceMgr", "removeCurrentDevice isAdded:", Boolean.valueOf(z));
        if (z) {
            b(str);
            return;
        }
        lof lofVar = this.n;
        if (lofVar != null) {
            lofVar.j(str);
        }
    }

    private void e(List<DeviceInfo> list) {
        LogUtil.a("HwDeviceMgr", "Enter resetActiveDevice.");
        if (list != null) {
            ArrayList arrayList = new ArrayList(24);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if ("main_relationship".equals(list.get(i2).getRelationship()) && list.get(i2).getDeviceActiveState() == 1) {
                    LogUtil.a("HwDeviceMgr", "active device name: ", list.get(i2).getDeviceName());
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (!arrayList.isEmpty()) {
                LogUtil.j("HwDeviceMgr", "resetActiveDevice exist active device.");
                return;
            }
        }
        synchronized (e()) {
            DeviceInfo deviceInfo = null;
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwDeviceMgr");
            if (deviceList != null) {
                for (DeviceInfo deviceInfo2 : deviceList) {
                    if ("main_relationship".equalsIgnoreCase(mkl.d().a(deviceInfo2.getDeviceIdentify()))) {
                        deviceInfo = deviceInfo2;
                        break;
                    }
                }
            }
            if (deviceInfo != null) {
                LogUtil.a("HwDeviceMgr", "resetActiveDevice activeMainDevice fuzzData: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
                if (mjx.d(deviceInfo.getProductType())) {
                    LogUtil.j("HwDeviceMgr", "resetActiveDevice mDeviceInfoList is empty.");
                    com.huawei.devicesdk.entity.DeviceInfo deviceInfo3 = new com.huawei.devicesdk.entity.DeviceInfo();
                    deviceInfo3.setDeviceBtType(deviceInfo.getDeviceBluetoothType());
                    deviceInfo3.setDeviceName(deviceInfo.getDeviceName());
                    deviceInfo3.setDeviceMac(deviceInfo.getDeviceIdentify());
                    deviceInfo3.setDeviceType(deviceInfo.getProductType());
                    mkn.e().connectDevice(deviceInfo3, 0);
                } else {
                    e(deviceInfo);
                }
            }
        }
    }

    public void e(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            LogUtil.a("HwDeviceMgr", "resetActiveDevice device name :", CommonUtil.n(deviceInfo.getDeviceName()));
            synchronized (e()) {
                LogUtil.a("HwDeviceMgr", "removeCurrentDevice getDeviceInfoListHandle");
                for (DeviceInfo deviceInfo2 : this.l) {
                    if (deviceInfo2.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                        deviceInfo2.setDeviceActiveState(1);
                        break;
                    }
                }
            }
            i();
            this.n.c(deviceInfo.getDeviceIdentify(), deviceInfo.getNodeId(), deviceInfo.getDeviceName(), deviceInfo.getDeviceBluetoothType());
            lnt.d(deviceInfo.getDeviceIdentify());
        }
    }

    private void e(List<DeviceInfo> list, List<DeviceInfo> list2) {
        LogUtil.a("HwDeviceMgr", "enter deleteNotExistDevices");
        for (DeviceInfo deviceInfo : list2) {
            if (deviceInfo != null) {
                Iterator<DeviceInfo> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        LogUtil.a("HwDeviceMgr", "deleteDevice");
                        c(deviceInfo.getDeviceIdentify());
                        break;
                    }
                    DeviceInfo next = it.next();
                    if (next == null) {
                        LogUtil.j("HwDeviceMgr", "currentDeviceInfo is null");
                    } else if (TextUtils.isEmpty(next.getDeviceIdentify()) || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
                        LogUtil.j("HwDeviceMgr", "deviceIdentify is null");
                    } else if (next.getDeviceIdentify().equals(deviceInfo.getDeviceIdentify())) {
                        break;
                    }
                }
            }
        }
    }

    private void d(List<DeviceInfo> list) {
        LogUtil.a("HwDeviceMgr", "Enter initDeviceList(), ");
        if (list == null) {
            LogUtil.j("HwDeviceMgr", "initDeviceList parameter is incorrect.");
            return;
        }
        ArrayList arrayList = new ArrayList(24);
        ArrayList<DeviceInfo> arrayList2 = new ArrayList(24);
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo.getDeviceActiveState() == 0) {
                arrayList.add(deviceInfo);
            }
            if (deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getDeviceConnectState() != 2) {
                LogUtil.a("HwDeviceMgr", "findWantedSwitchDevice find ", deviceInfo.getDeviceName());
                arrayList2.add(deviceInfo);
            }
        }
        j.e(arrayList);
        j.a(arrayList);
        if (arrayList2.isEmpty()) {
            LogUtil.a("HwDeviceMgr", "index = -1, not find wanted switch device");
            return;
        }
        lof.d(this.k).b(true);
        for (DeviceInfo deviceInfo2 : arrayList2) {
            if (cqf.c(this.k, deviceInfo2)) {
                String deviceIdentify = deviceInfo2.getDeviceIdentify();
                mkb.c(deviceIdentify, -1);
                mkb.f(deviceIdentify, "");
                mkb.e(deviceIdentify, 3);
                mkb.e(deviceInfo2.getDeviceIdentify(), new DeviceCapability());
                j.c(deviceInfo2, this.l);
                i();
                lof lofVar = this.n;
                if (lofVar != null) {
                    lofVar.b(deviceInfo2, false);
                }
            }
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void switchDevice(List<DeviceInfo> list, String str) {
        LogUtil.a("HwDeviceMgr", "Enter switchDevice(), ");
        if (list == null) {
            LogUtil.j("HwDeviceMgr", "Parameter is incorrect.");
            return;
        }
        j.c();
        if (list.size() != this.l.size()) {
            e(list, this.l);
            return;
        }
        List<Integer> listE = j.e(list, str);
        if (listE.isEmpty()) {
            LogUtil.j("HwDeviceMgr", "index = -1, not find wanted switch device");
            return;
        }
        lof.d(this.k).b(false);
        for (Integer num : listE) {
            DeviceInfo deviceInfo = list.get(num.intValue());
            if (cqf.c(this.k, deviceInfo)) {
                String deviceIdentify = deviceInfo.getDeviceIdentify();
                if (eel.d(deviceInfo.getProductType())) {
                    this.s.a(deviceInfo);
                } else {
                    this.s.a(deviceInfo, true);
                }
                mkb.c(deviceIdentify, -1);
                mkb.f(deviceIdentify, "");
                mkb.e(deviceIdentify, 3);
                e(deviceInfo, num.intValue());
            }
        }
    }

    private void e(DeviceInfo deviceInfo, int i2) {
        mkb.e(deviceInfo.getDeviceIdentify(), new DeviceCapability());
        if (j.a(deviceInfo.getDeviceIdentify(), this.l) == -1) {
            LogUtil.a("HwDeviceMgr", "index = -1, updateUsedDeviceActiveStatus");
        } else {
            j.c(deviceInfo, this.l);
            if (i2 >= 0) {
                this.l.get(i2).setDeviceActiveState(1);
            }
            i();
        }
        if (this.n != null) {
            if (i2 >= 0) {
                this.l.get(i2).setLastConnectedTime(System.currentTimeMillis());
            }
            this.n.b(deviceInfo, true);
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void registerDeviceStateCallback(DeviceStateCallback deviceStateCallback) {
        LogUtil.a("HwDeviceMgr", "Enter registerDeviceStateCallback().");
        this.d = deviceStateCallback;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void unRegisterDeviceStateCallback(DeviceStateCallback deviceStateCallback) {
        LogUtil.a("HwDeviceMgr", "enter unRegisterDeviceStateCallback().");
        this.d = null;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void sendDeviceData(DeviceCommand deviceCommand) {
        List<DeviceInfo> listD;
        if (deviceCommand == null) {
            LogUtil.j("HwDeviceMgr", "sendDeviceData() deviceCommand is null.");
            return;
        }
        if (!TextUtils.isEmpty(deviceCommand.getmIdentify())) {
            b(deviceCommand, deviceCommand.getmIdentify());
            return;
        }
        synchronized (e()) {
            listD = j.d(this.l);
        }
        LogUtil.a("HwDeviceMgr", "sendDeviceData connectedDeviceInfos size: ", Integer.valueOf(listD.size()));
        if (listD.size() == 2) {
            DeviceInfo deviceInfo = listD.get(0);
            DeviceInfo deviceInfo2 = listD.get(1);
            if (eel.d(deviceInfo.getProductType())) {
                c(deviceCommand, deviceInfo.getDeviceIdentify(), deviceInfo2.getDeviceIdentify());
                return;
            } else {
                c(deviceCommand, deviceInfo2.getDeviceIdentify(), deviceInfo.getDeviceIdentify());
                return;
            }
        }
        if (listD.size() == 1) {
            DeviceInfo deviceInfo3 = listD.get(0);
            if (deviceInfo3.getDeviceActiveState() != 1) {
                LogUtil.a("HwDeviceMgr", "sendDeviceData connected device is not active device");
                return;
            } else {
                b(deviceCommand, deviceInfo3.getDeviceIdentify());
                return;
            }
        }
        LogUtil.d("HwDeviceMgr", "sendDeviceData go to else branch");
    }

    private void c(DeviceCommand deviceCommand, String str, String str2) {
        if (deviceCommand.getServiceID() == 23 && deviceCommand.getCommandID() == 15) {
            b(deviceCommand, str);
        } else {
            b(deviceCommand, str2);
        }
    }

    private void b(DeviceCommand deviceCommand, String str) {
        deviceCommand.setmIdentify(str);
        if (mkb.q(deviceCommand.getmIdentify())) {
            LogUtil.j("HwDeviceMgr", "OTA update, other command can't send...");
            return;
        }
        if (deviceCommand.getCommandID() == 13 && deviceCommand.getServiceID() == 1) {
            j.c();
        }
        ReleaseLogUtil.d("R_HwDeviceMgr", "sendDeviceCommand ServiceID:", Integer.valueOf(deviceCommand.getServiceID()), ", CommandID:", Integer.valueOf(deviceCommand.getCommandID()));
        boolean zB = b(deviceCommand);
        if (j(deviceCommand.getmIdentify()) == 2 || zB) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(deviceCommand.getDataLen() + 2);
            byteBufferAllocate.put(eeq.c(eeq.d(deviceCommand.getServiceID())));
            byteBufferAllocate.put(eeq.c(eeq.d(deviceCommand.getCommandID())));
            if (deviceCommand.getDataContent() != null) {
                byteBufferAllocate.put(deviceCommand.getDataContent());
                LogUtil.a("HwDeviceMgr", "sendDeviceCommand command data:", eeq.e(deviceCommand.getDataContent()));
                ReleaseLogUtil.d("R_HwDeviceMgr", "sendDeviceCommand command data");
            } else {
                LogUtil.j("HwDeviceMgr", "command data is null, if not OTA, data incorrect.");
            }
            byteBufferAllocate.flip();
            lnr lnrVar = new lnr();
            lnrVar.c(byteBufferAllocate.array());
            lnrVar.c(byteBufferAllocate.array().length);
            lnrVar.c(deviceCommand.getNeedAck());
            lnrVar.d(deviceCommand.getPriority());
            String str2 = deviceCommand.getmIdentify();
            lnrVar.e(str2);
            lnrVar.d(deviceCommand.getNeedEncrypt());
            lnrVar.g(deviceCommand.getServiceID());
            lnrVar.e(deviceCommand.getCommandID());
            lof lofVar = this.n;
            if (lofVar != null) {
                lofVar.b(b(str2, zB), lnrVar);
            }
        }
    }

    private boolean b(DeviceCommand deviceCommand) {
        boolean zN = mkb.n(deviceCommand.getmIdentify());
        DeviceCapability deviceCapabilityC = mkb.c(deviceCommand.getmIdentify());
        return zN && deviceCapabilityC != null && deviceCapabilityC.isSupportUserSetting() && deviceCommand.getCommandID() == 48 && deviceCommand.getServiceID() == 1;
    }

    private int b(String str, boolean z) {
        return z ? this.n.h(str) : i(str);
    }

    public int a(String str) {
        int i2;
        List<DeviceInfo> list = this.l;
        if (list == null || list.size() == 0) {
            i2 = -1;
        } else {
            i2 = 0;
            while (i2 < this.l.size()) {
                if (!this.l.get(i2).getDeviceIdentify().equals(str) || this.l.get(i2).getDeviceActiveState() != 1) {
                    i2++;
                }
            }
            i2 = -1;
        }
        LogUtil.a("HwDeviceMgr", "getActiveDeviceIndex:", Integer.valueOf(i2));
        return i2;
    }

    public void b(DeviceInfo deviceInfo) {
        LogUtil.a("HwDeviceMgr", "is Enter ZoneID");
        if (deviceInfo == null) {
            LogUtil.j("HwDeviceMgr", "btDeviceInfo is null");
            return;
        }
        lnr lnrVarN = lmw.n();
        lnrVarN.e(deviceInfo.getDeviceIdentify());
        if (this.n != null) {
            LogUtil.a("HwDeviceMgr", "start to get device zoneId type info.");
            this.n.b(deviceInfo.getDeviceBluetoothType(), lnrVarN);
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void unPair(List<String> list, boolean z) {
        LogUtil.j("HwDeviceMgr", "unPair: ", Boolean.valueOf(z));
        if (z) {
            b(list);
        } else {
            c(list);
        }
    }

    private void c(List<String> list) {
        List<DeviceInfo> deviceList = getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "disconnectDevice");
        if (list == null) {
            Iterator<DeviceInfo> it = deviceList.iterator();
            while (it.hasNext()) {
                mkd.d().e(it.next());
            }
            return;
        }
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("HwDeviceMgr", "disconnectDevice mac is empty");
            } else {
                LogUtil.a("HwDeviceMgr", "disconnectDevice mac: ", CommonUtil.n(str));
                for (DeviceInfo deviceInfo : deviceList) {
                    if (deviceInfo == null || deviceInfo.getDeviceIdentify() == null) {
                        LogUtil.j("HwDeviceMgr", "disconnectDevice parameter error");
                    } else if (deviceInfo.getDeviceIdentify().equals(str)) {
                        f(Arrays.asList(deviceInfo));
                        mkd.d().e(deviceInfo);
                    }
                }
            }
        }
    }

    private void b(List<String> list) {
        if (list == null) {
            for (DeviceInfo deviceInfo : getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "removeDevice")) {
                if (deviceInfo == null || deviceInfo.getDeviceIdentify() == null) {
                    LogUtil.j("HwDeviceMgr", "removeDevice parameter error");
                } else {
                    c(deviceInfo.getDeviceIdentify());
                }
            }
            return;
        }
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("HwDeviceMgr", "removeDevice mac is empty");
            } else {
                LogUtil.a("HwDeviceMgr", "removeDevice mac: ", CommonUtil.n(str));
                c(str);
            }
        }
    }

    private void d(boolean z) {
        LogUtil.a("HwDeviceMgr", "forceConnectDevice enter");
        if (this.n == null) {
            LogUtil.j("HwDeviceMgr", "forceConnectDevice mBtSdkApi is null");
            return;
        }
        List<Integer> listB = j.b(this.l);
        if (listB != null) {
            LogUtil.a("HwDeviceMgr", "forceConnectDevice activeDeviceList size :", Integer.valueOf(listB.size()));
            for (Integer num : listB) {
                int deviceBluetoothType = this.l.get(num.intValue()).getDeviceBluetoothType();
                if (!z || deviceBluetoothType == 2) {
                    this.n.a(this.l.get(num.intValue()).getDeviceIdentify(), z);
                }
            }
        }
    }

    public Map<String, DeviceCapability> c() {
        ConcurrentHashMap<String, mka> concurrentHashMap = e;
        LogUtil.a("DEVMGR_SETTING", "HwDeviceMgr", "getDeviceCapabilityMap enter sUsedDeviceStatus size", Integer.valueOf(concurrentHashMap.size()));
        HashMap map = new HashMap(4);
        for (mka mkaVar : concurrentHashMap.values()) {
            if (mkaVar != null && !TextUtils.isEmpty(mkaVar.i()) && !eel.d(mkaVar.p()) && a(mkaVar.i()) != -1) {
                DeviceCapability deviceCapabilityB = mkaVar.b();
                LogUtil.a("DEVMGR_SETTING", "HwDeviceMgr", "getDeviceCapability capabilityString", new Gson().toJson(deviceCapabilityB, DeviceCapability.class));
                map.put(mkaVar.i(), deviceCapabilityB);
                return map;
            }
        }
        LogUtil.a("DEVMGR_SETTING", "HwDeviceMgr", "getDeviceCapabilityMap fail");
        return map;
    }

    public void d(String str) {
        LogUtil.a("HwDeviceMgr", "Enter setTargetDeviceDisable().");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwDeviceMgr", "macAddress is null");
            return;
        }
        synchronized (e()) {
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                if (str.equalsIgnoreCase(this.l.get(i2).getDeviceIdentify())) {
                    this.l.get(i2).setDeviceActiveState(0);
                    break;
                }
            }
        }
        i();
    }

    public void c(String str, DeviceInfo deviceInfo) {
        if (this.n != null) {
            LogUtil.a("HwDeviceMgr", "Enter sendBTDeviceData by asset way with filepath:", str);
            if (deviceInfo != null) {
                this.n.a(deviceInfo.getNodeId(), str);
            }
        }
    }

    public void c(BtDeviceResponseCallback btDeviceResponseCallback) {
        if (this.n != null) {
            LogUtil.a("HwDeviceMgr", "Enter setFileCallback callback:", btDeviceResponseCallback);
            this.n.d(btDeviceResponseCallback);
        }
    }

    public void b(IBaseCallback iBaseCallback) {
        if (this.n != null) {
            LogUtil.a("HwDeviceMgr", "Enter setAwFileCallback callback", iBaseCallback);
            this.n.c(this.m);
            this.h = iBaseCallback;
        }
    }

    private int j(String str) {
        int iA = a(str);
        if (iA != -1) {
            return this.l.get(iA).getDeviceConnectState();
        }
        return 3;
    }

    private int i(String str) {
        mkj mkjVar;
        List<DeviceInfo> list;
        DeviceInfo deviceInfo;
        if (TextUtils.isEmpty(str) || (mkjVar = j) == null || (list = this.l) == null) {
            LogUtil.j("HwDeviceMgr", "isConnectedActiveDeviceStatus identify is null or sHwDevicePartMgr is null or mDeviceInfoList is null");
            return -1;
        }
        int iA = mkjVar.a(str, list);
        if (iA == -1 || iA >= this.l.size() || (deviceInfo = this.l.get(iA)) == null) {
            return -1;
        }
        return deviceInfo.getDeviceBluetoothType();
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public List<DeviceInfo> getDeviceList(HwGetDevicesMode hwGetDevicesMode, HwGetDevicesParameter hwGetDevicesParameter, String str) {
        ArrayList arrayList = new ArrayList(24);
        if (hwGetDevicesMode == null) {
            LogUtil.j("HwDeviceMgr", "getDeviceList mode is null.");
            return arrayList;
        }
        switch (AnonymousClass10.f41800c[hwGetDevicesMode.ordinal()]) {
            case 1:
                return mki.d().b();
            case 2:
                return mki.d().h();
            case 3:
                return mki.d().c();
            case 4:
                return mki.d().a();
            case 5:
                return mki.d().e(hwGetDevicesParameter);
            case 6:
                return mki.d().e();
            case 7:
                return mki.d().c();
            case 8:
                return mki.d().c();
            case 9:
                return mki.d().j();
            default:
                LogUtil.j("HwDeviceMgr", "getDeviceList unsupport mode.");
                return arrayList;
        }
    }

    /* JADX INFO: renamed from: mkf$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f41800c;

        static {
            int[] iArr = new int[HwGetDevicesMode.values().length];
            f41800c = iArr;
            try {
                iArr[HwGetDevicesMode.ALL_DEVICES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41800c[HwGetDevicesMode.CONNECTED_MAIN_DEVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41800c[HwGetDevicesMode.ACTIVE_MAIN_DEVICES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41800c[HwGetDevicesMode.CONNECTED_AW70_DEVICES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41800c[HwGetDevicesMode.IDENTIFY_DEVICES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41800c[HwGetDevicesMode.CONNECTED_DEVICES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41800c[HwGetDevicesMode.ACTIVE_DEVICES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41800c[HwGetDevicesMode.MAIN_FOLLOW_DEVICES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41800c[HwGetDevicesMode.FOLLOWED_DEVICES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public void registerAdapter(WearMgrAdapterApi wearMgrAdapterApi) {
        LogUtil.a("HwDeviceMgr", "The old channel does not implement registerAdapter temporarily.");
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface
    public Map<String, DeviceCapability> queryDeviceCapability(int i2, String str, String str2) {
        LogUtil.a("HwDeviceMgr", "enter queryDeviceCapability queryType：", Integer.valueOf(i2), "; queryContent:", CommonUtil.n(str), "; tag: ", str2);
        HashMap map = new HashMap(4);
        if (i2 != 1) {
            if (i2 == 2) {
                return n();
            }
            if (i2 == 3) {
                return f();
            }
            if (i2 == 4) {
                return c();
            }
            if (i2 != 5) {
                LogUtil.j("HwDeviceMgr", "queryDeviceCapability queryType others");
                return map;
            }
            return l();
        }
        Map<String, DeviceCapability> mapF = f();
        for (Map.Entry<String, DeviceCapability> entry : mapF.entrySet()) {
            String key = entry.getKey();
            if (mapF.containsKey(key) && TextUtils.equals(key, str)) {
                map.put(key, entry.getValue());
                break;
            }
        }
        return map;
    }

    private Map<String, DeviceCapability> n() {
        HashMap map = new HashMap(4);
        for (mka mkaVar : e.values()) {
            if (mkaVar.a() == 2) {
                map.put(mkaVar.i(), mkaVar.b());
            }
        }
        return map;
    }

    private Map<String, DeviceCapability> f() {
        HashMap map = new HashMap(4);
        for (mka mkaVar : e.values()) {
            LogUtil.a("HwDeviceMgr", "getAllCapability identify:", CommonUtil.n(mkaVar.i()));
            map.put(mkaVar.i(), mkaVar.b());
        }
        return map;
    }

    private Map<String, DeviceCapability> l() {
        HashMap map = new HashMap(4);
        List<DeviceInfo> deviceList = getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwDeviceMgr");
        if (deviceList != null && deviceList.size() > 0) {
            Iterator<DeviceInfo> it = deviceList.iterator();
            while (it.hasNext()) {
                String deviceIdentify = it.next().getDeviceIdentify();
                ConcurrentHashMap<String, mka> concurrentHashMap = e;
                if (concurrentHashMap.containsKey(deviceIdentify)) {
                    map.put(deviceIdentify, concurrentHashMap.get(deviceIdentify).b());
                }
            }
        }
        return map;
    }

    private void f(List<DeviceInfo> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("HwDeviceMgr", "unPairBtDevices input parameter is null.");
            return;
        }
        LogUtil.a("HwDeviceMgr", "unPairBtDevices :", Integer.valueOf(list.size()));
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null && deviceInfo.getDeviceBluetoothType() == 2) {
                boolean zA = this.f41798b.a(deviceInfo.getDeviceIdentify());
                LogUtil.a("HwDeviceMgr", "unPairBtDevices device:", deviceInfo.toString());
                if (!zA) {
                    LogUtil.j("HwDeviceMgr", "removeBTDeviceInstance Remove bond device fail.");
                }
            }
        }
    }
}
