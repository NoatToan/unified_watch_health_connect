package defpackage;

import android.os.Binder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.phdkit.DataContentListener;
import com.huawei.phdkit.DeviceData;
import com.huawei.phdkit.DeviceStateListener;
import com.huawei.phdkit.DiscoveryListener;
import com.huawei.phdkit.DvLiteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class oqm extends HwBaseManager implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static oqm f44370a;
    private Map<String, DataContentListener> e;
    private eet g;
    private Set<String> h;
    private List<DeviceStateListener> j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f44372c = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f44371b = new Object();

    private oqm() {
        super(BaseApplication.getContext());
        this.e = new HashMap(16);
        this.j = new ArrayList(24);
        this.h = new HashSet(10);
        this.g = new eet();
        LogUtil.a("WearEngine_HwDvLiteManager", "enter HwDvLiteManager");
    }

    public static oqm c() {
        oqm oqmVar;
        synchronized (f44372c) {
            if (f44370a == null) {
                f44370a = new oqm();
            }
            oqmVar = f44370a;
        }
        return oqmVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 48;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("WearEngine_HwDvLiteManager", bArr, "getResult Hex: ");
        if (deviceInfo == null || bArr == null || bArr.length < 2) {
            LogUtil.j("WearEngine_HwDvLiteManager", "device or dataContents is null");
            return;
        }
        if (bArr[1] == 3) {
            e(deviceInfo, bArr);
            LogUtil.a("WearEngine_HwDvLiteManager", "set isCapability");
            return;
        }
        LogUtil.a("WearEngine_HwDvLiteManager", "other commandID");
        String deviceUdid = deviceInfo.getDeviceUdid();
        LogUtil.d("WearEngine_HwDvLiteManager", "getResult udid is: " + deviceUdid);
        try {
            Iterator<DataContentListener> it = h(deviceUdid).iterator();
            while (it.hasNext()) {
                it.next().getResult(deviceUdid, eeq.e(bArr));
            }
        } catch (RemoteException unused) {
            LogUtil.e("WearEngine_HwDvLiteManager", "DataContentListener remoteException");
        }
    }

    private List<DataContentListener> h(String str) {
        LogUtil.a("WearEngine_HwDvLiteManager", "enter getDataContentListenerList");
        LinkedList linkedList = new LinkedList();
        synchronized (d) {
            for (Map.Entry<String, DataContentListener> entry : this.e.entrySet()) {
                String key = entry.getKey();
                LogUtil.d("WearEngine_HwDvLiteManager", "entry.getKey(): " + key);
                if (key != null && key.startsWith(str)) {
                    if (entry.getValue() == null) {
                        LogUtil.j("WearEngine_HwDvLiteManager", "dataContentListener is null");
                    } else {
                        linkedList.add(entry.getValue());
                    }
                }
            }
        }
        LogUtil.a("WearEngine_HwDvLiteManager", "dataContentListeners size: " + linkedList.size());
        return linkedList;
    }

    private void e(DeviceInfo deviceInfo, byte[] bArr) {
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("WearEngine_HwDvLiteManager", "info data is error");
            return;
        }
        try {
            List<eew> listE = this.g.b(strE.substring(4)).e();
            if (listE == null || listE.size() <= 0) {
                return;
            }
            for (eew eewVar : listE) {
                if (CommonUtil.v(eewVar.e()) == 1) {
                    d(deviceInfo, eewVar);
                } else {
                    LogUtil.j("WearEngine_HwDvLiteManager", "parameter is invalid.");
                }
            }
        } catch (eeu unused) {
            LogUtil.e("WearEngine_HwDvLiteManager", "setCapability TlvException");
        } catch (NumberFormatException unused2) {
            LogUtil.e("WearEngine_HwDvLiteManager", "setCapability NumberFormatException");
        }
    }

    private void d(DeviceInfo deviceInfo, eew eewVar) {
        if (SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(3000000), eeq.a(deviceInfo.getDeviceIdentify()), eeq.d(eewVar.b()), new StorageParams(0)) == 0) {
            LogUtil.a("WearEngine_HwDvLiteManager", "setSharedPreference success");
        } else {
            LogUtil.j("WearEngine_HwDvLiteManager", "setSharedPreference failed");
        }
        d(deviceInfo.getDeviceIdentify());
    }

    private void d(String str) {
        if (TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(3000000), str))) {
            return;
        }
        if (SharedPreferenceManager.b(String.valueOf(3000000), str)) {
            LogUtil.a("WearEngine_HwDvLiteManager", "deleteMacKey success");
        } else {
            LogUtil.j("WearEngine_HwDvLiteManager", "deleteMacKey failed");
        }
    }

    public void c(String str, DataContentListener dataContentListener) {
        if (str != null && dataContentListener != null) {
            LogUtil.a("WearEngine_HwDvLiteManager", "listener is not null");
            DeviceData deviceData = new DeviceData();
            if (e(str) == null) {
                LogUtil.a("WearEngine_HwDvLiteManager", "udid is invalid or device is null");
                deviceData.setErrorCode(1);
                deviceData.setStatus(0);
                deviceData.setUdid(str);
                try {
                    dataContentListener.getStatus(deviceData);
                    return;
                } catch (RemoteException unused) {
                    LogUtil.e("WearEngine_HwDvLiteManager", "DataContentListener remoteException:");
                    return;
                }
            }
            String strF = f(str);
            synchronized (d) {
                this.e.put(strF, dataContentListener);
            }
            deviceData.setErrorCode(0);
            deviceData.setStatus(0);
            deviceData.setUdid(str);
            try {
                dataContentListener.getStatus(deviceData);
                return;
            } catch (RemoteException unused2) {
                LogUtil.e("WearEngine_HwDvLiteManager", "sendDataCallback remoteException:");
                return;
            }
        }
        LogUtil.j("WearEngine_HwDvLiteManager", "DataContentListener is null");
    }

    private String f(String str) {
        return str + Constants.LINK + Binder.getCallingUid();
    }

    public void b(DiscoveryListener discoveryListener) {
        LogUtil.a("WearEngine_HwDvLiteManager", "discoverDevices enter");
        if (discoveryListener == null) {
            LogUtil.j("WearEngine_HwDvLiteManager", "listener is null");
            return;
        }
        List<DeviceInfo> listD = d();
        try {
            ArrayList arrayList = new ArrayList(16);
            if (listD.isEmpty()) {
                LogUtil.j("WearEngine_HwDvLiteManager", "discoverDevices device is empty");
                discoveryListener.onDeviceFound(arrayList);
            } else {
                Iterator<DeviceInfo> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(b(it.next()));
                }
                discoveryListener.onDeviceFound(arrayList);
            }
        } catch (RemoteException unused) {
            LogUtil.e("WearEngine_HwDvLiteManager", "discoverDevices remoteException");
        }
    }

    private List<DvLiteDevice> b(DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList(16);
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("WearEngine_HwDvLiteManager", "device is null or not connected");
            return arrayList;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "WearEngine_HwDvLiteManager");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j("WearEngine_HwDvLiteManager", "getDvLiteDevices, deviceCapabilityHashMaps is empty");
            return arrayList;
        }
        DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability == null || !deviceCapability.isSupportPhd()) {
            LogUtil.a("WearEngine_HwDvLiteManager", "device not support dmsp.");
            return arrayList;
        }
        LogUtil.a("WearEngine_HwDvLiteManager", "discoverDevices devices is not empty");
        DvLiteDevice dvLiteDevice = new DvLiteDevice();
        LogUtil.a("WearEngine_HwDvLiteManager", "device.getDeviceName()", deviceInfo.getDeviceName());
        dvLiteDevice.setDeviceName(deviceInfo.getDeviceName());
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(3000000), eeq.a(deviceInfo.getDeviceIdentify()));
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("WearEngine_HwDvLiteManager", "deviceCapabilityString is null");
        } else {
            dvLiteDevice.setAbilityContents(eeq.c(eeq.a(strE)));
            LogUtil.d("WearEngine_HwDvLiteManager", "device.setAbilityContents()", strE);
        }
        dvLiteDevice.setUdid(deviceInfo.getDeviceUdid());
        arrayList.add(dvLiteDevice);
        return arrayList;
    }

    public void a(String str, DeviceStateListener deviceStateListener) {
        if (deviceStateListener == null || str == null) {
            return;
        }
        LogUtil.a("WearEngine_HwDvLiteManager", "registerDeviceStatusListener enter :", str);
        synchronized (f44371b) {
            this.j.add(deviceStateListener);
        }
        LogUtil.a("WearEngine_HwDvLiteManager", "mPhdDeviceStateListenerList add success");
    }

    public void a(String str) {
        if (str != null) {
            LogUtil.a("WearEngine_HwDvLiteManager", "unRegisterDeviceStatusListener enter :", str);
            synchronized (f44371b) {
                this.j.clear();
            }
        }
    }

    public void b() {
        LogUtil.a("WearEngine_HwDvLiteManager", "clearDataListenerMap enter");
        synchronized (d) {
            this.e.clear();
        }
    }

    public void c(String str) {
        LogUtil.a("WearEngine_HwDvLiteManager", "clearOneDataListenerMap enter");
        if (str == null) {
            return;
        }
        String strF = f(str);
        synchronized (d) {
            this.e.remove(strF);
        }
    }

    public String b(String str) {
        LogUtil.a("WearEngine_HwDvLiteManager", "getIdentify enter");
        if (str == null) {
            LogUtil.j("WearEngine_HwDvLiteManager", "getIdentify enter parameter is invalid.");
            return "";
        }
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            LogUtil.j("WearEngine_HwDvLiteManager", "getUsedDeviceList is invalid.");
            return "";
        }
        if (!str.equals(deviceInfoE.getDeviceUdid()) && !str.equals(deviceInfoE.getUuid())) {
            return "";
        }
        LogUtil.a("WearEngine_HwDvLiteManager", "udid equal");
        return deviceInfoE.getDeviceIdentify();
    }

    public void d(DeviceInfo deviceInfo) {
        LogUtil.a("WearEngine_HwDvLiteManager", "notifyPhdDeviceStates enter");
        if (deviceInfo == null) {
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            e(deviceInfo);
        }
        if (deviceInfo.getDeviceConnectState() == 3) {
            a(deviceInfo);
        }
        synchronized (f44371b) {
            if (!this.h.contains(deviceInfo.getDeviceIdentify())) {
                LogUtil.a("WearEngine_HwDvLiteManager", "device not suppot msdp");
                return;
            }
            for (int i = 0; i < this.j.size(); i++) {
                if (this.j.get(i) != null) {
                    DvLiteDevice dvLiteDevice = new DvLiteDevice();
                    dvLiteDevice.setDeviceName(deviceInfo.getDeviceName());
                    dvLiteDevice.setDeviceStatus(deviceInfo.getDeviceConnectState());
                    LogUtil.a("WearEngine_HwDvLiteManager", "btDeviceInfo.getDeviceName() :", deviceInfo.getDeviceName(), " , DeviceConnectState.DEVICE_CONNECTED :", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                    dvLiteDevice.setUdid(deviceInfo.getDeviceUdid());
                    try {
                        if (deviceInfo.getDeviceConnectState() == 2) {
                            this.j.get(i).onDeviceStateChanged(dvLiteDevice, 1);
                        }
                        if (deviceInfo.getDeviceConnectState() == 3) {
                            this.j.get(i).onDeviceStateChanged(dvLiteDevice, 1);
                            this.h.remove(deviceInfo.getDeviceIdentify());
                        }
                    } catch (RemoteException unused) {
                        LogUtil.e("WearEngine_HwDvLiteManager", "getResult remoteException");
                    }
                }
            }
        }
    }

    private void e(DeviceInfo deviceInfo) {
        LogUtil.a("WearEngine_HwDvLiteManager", "inquireDeviceMsdpCapability enter");
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "WearEngine_HwDvLiteManager");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j("WearEngine_HwDvLiteManager", "inquireDeviceMsdpCapability, deviceCapabilityHashMaps is empty");
            return;
        }
        DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability == null || !deviceCapability.isSupportPhd()) {
            LogUtil.j("WearEngine_HwDvLiteManager", "device not support dmsp.");
            return;
        }
        synchronized (f44371b) {
            this.h.add(deviceInfo.getDeviceIdentify());
        }
        LogUtil.a("WearEngine_HwDvLiteManager", "mSupportMsdpDeviceSet add device");
        e(deviceInfo, 48, 3, new byte[]{1, 0});
    }

    private void a(DeviceInfo deviceInfo) {
        LogUtil.a("WearEngine_HwDvLiteManager", "deleteVirtualizationCapability enter");
        if (TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(3000000), eeq.a(deviceInfo.getDeviceIdentify())))) {
            return;
        }
        if (SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(3000000), eeq.a(deviceInfo.getDeviceIdentify())) == 0) {
            LogUtil.a("WearEngine_HwDvLiteManager", "deleteVirtualizationCapability success");
        }
    }

    private void e(DeviceInfo deviceInfo, int i, int i2, byte[] bArr) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(i);
        deviceCommand.setCommandID(i2);
        deviceCommand.setDataLen(bArr.length);
        deviceCommand.setDataContent(bArr);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private List<DeviceInfo> d() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "WearEngine_HwDvLiteManager");
        ArrayList arrayList = new ArrayList(16);
        if (deviceList != null && deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (!eel.d(deviceInfo.getProductType())) {
                    arrayList.add(deviceInfo);
                }
            }
        }
        return arrayList;
    }

    private DeviceInfo e(String str) {
        List<DeviceInfo> listD = d();
        if (listD.size() <= 0) {
            return null;
        }
        for (DeviceInfo deviceInfo : listD) {
            if (str.equals(deviceInfo.getDeviceUdid()) || str.equals(deviceInfo.getUuid())) {
                return deviceInfo;
            }
        }
        return null;
    }
}
