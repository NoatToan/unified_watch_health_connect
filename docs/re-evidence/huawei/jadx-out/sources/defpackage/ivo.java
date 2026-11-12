package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.DeviceStateConstants;
import com.huawei.health.devicemgr.api.constant.ExecuteMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.StorageParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class ivo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private jaq f38099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f38100c;
    private Map<String, IBaseResponseCallback> d;
    private String e;
    private String i;

    private ivo() {
        this.d = new ConcurrentHashMap();
    }

    public static ivo a() {
        return b.f38101b;
    }

    static class a extends BroadcastReceiver {
        private final WeakReference<ivo> d;

        a(ivo ivoVar) {
            this.d = new WeakReference<>(ivoVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("Track_BoltDeviceManager", "onReceive intent is null");
                return;
            }
            if (intent.getAction() == null) {
                LogUtil.j("Track_BoltDeviceManager", "onReceive getAction is null");
                return;
            }
            LogUtil.a("Track_BoltDeviceManager", "ConnectionStateBroadcastReceiver onReceive() getAction: ", intent.getAction());
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                if (!(parcelableExtra instanceof DeviceInfo)) {
                    LogUtil.j("Track_BoltDeviceManager", "object is not instanceof DeviceInfo !");
                    return;
                }
                DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                if (deviceInfo.getProductType() != 75) {
                    return;
                }
                ivo.e(deviceInfo);
                ivo ivoVar = this.d.get();
                if (ivoVar == null) {
                    LogUtil.j("Track_BoltDeviceManager", "BoltConnectionStateReceiver deviceManager is null");
                } else {
                    ivoVar.e();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(DeviceInfo deviceInfo) {
        jaq jaqVarC = c();
        String strV = jaqVarC.v();
        LogUtil.a("Track_BoltDeviceManager", "preemptionBoltIdentify = ", CommonUtil.n(strV));
        if (deviceInfo.getDeviceConnectState() == 2 && strV.equals(deviceInfo.getDeviceIdentify())) {
            d(deviceInfo.getDeviceIdentify(), jaqVarC);
        }
    }

    private static void d(String str, jaq jaqVar) {
        int deviceStateById = ecu.d().getDeviceStateById(DeviceStateConstants.WEAR_PLACE, str, "", "Track_BoltDeviceManager");
        LogUtil.a("Track_BoltDeviceManager", "wearPlaceCode = ", Integer.valueOf(deviceStateById));
        if (deviceStateById == 13) {
            jaqVar.l(str);
        } else if (deviceStateById == 8) {
            jaqVar.n(str);
        } else if (deviceStateById == 53) {
            jaqVar.m(str);
        }
    }

    public void b(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str) || iBaseResponseCallback == null) {
            LogUtil.j("Track_BoltDeviceManager", "registerConnectionStatusCallback failed with params error. tag:", str, " callback:", iBaseResponseCallback);
        } else {
            if (this.d.containsKey(str)) {
                LogUtil.j("Track_BoltDeviceManager", "registerConnectionStatusCallback ", str, " is save");
                return;
            }
            this.d.put(str, iBaseResponseCallback);
            LogUtil.a("Track_BoltDeviceManager", "registerConnectionStatusCallback tag:", str, " callback:", iBaseResponseCallback, " register callback size:", Integer.valueOf(this.d.size()));
            h();
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_BoltDeviceManager", "unregisterConnectionStatusCallback failed with params error. tag:");
        } else {
            LogUtil.a("Track_BoltDeviceManager", "unregisterConnectionStatusCallback tag:", str, " callback:", this.d.remove(str), " register callback size:", Integer.valueOf(this.d.size()));
            g();
        }
    }

    private void h() {
        if (this.f38100c != null) {
            return;
        }
        if (!this.d.isEmpty()) {
            this.f38100c = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
            BroadcastManagerUtil.c(BaseApplication.getContext(), this.f38100c, intentFilter, LocalBroadcast.f36595c, null);
            LogUtil.a("Track_BoltDeviceManager", "registerConnectionStatusBroadcast : registerReceiver");
            return;
        }
        LogUtil.j("Track_BoltDeviceManager", "mCallbacks is empty");
    }

    private void g() {
        if (this.d.size() != 0 || this.f38100c == null) {
            return;
        }
        LogUtil.a("Track_BoltDeviceManager", "unregisterConnectionStatusBroadcast() enter.");
        BaseApplication.getContext().unregisterReceiver(this.f38100c);
        this.f38100c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("Track_BoltDeviceManager", "distributeConnectionStatusChanged enter.");
        HashMap map = new HashMap(this.d);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((IBaseResponseCallback) it.next()).a(0, null);
        }
        LogUtil.a("Track_BoltDeviceManager", "distributeConnectionStatusChanged callback:", map.keySet());
    }

    public List<d> e(boolean z) {
        LogUtil.a("Track_BoltDeviceManager", "getBoltDeviceList() isRecognizeRadioFrequencyId: ", Boolean.valueOf(z));
        ArrayList arrayList = new ArrayList(10);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "Track_BoltDeviceManager");
        if (njy.e(deviceList)) {
            LogUtil.j("Track_BoltDeviceManager", "getBoltDeviceList() deviceInfoList is empty");
            return arrayList;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo != null && deviceInfo.getProductType() == 75) {
                a(z, deviceInfo);
                String deviceIdentify = deviceInfo.getDeviceIdentify();
                int iE = e(deviceIdentify);
                int iB = b(deviceIdentify);
                LogUtil.a("Track_BoltDeviceManager", "getBoltDeviceList() wearPlaceCode: ", Integer.valueOf(iB), ", batteryInfo: ", Integer.valueOf(iE), ", deviceIdentify: ", CommonUtil.n(deviceIdentify));
                arrayList.add(new d(deviceInfo, iE, iB));
            }
        }
        LogUtil.a("Track_BoltDeviceManager", "getBoltDeviceList() boltDeviceInfoList: ", arrayList);
        return arrayList;
    }

    private void a(boolean z, DeviceInfo deviceInfo) {
        if (z) {
            ecu.d().sendDeviceData(5055, 900100001, null, deviceInfo, "Track_BoltDeviceManager");
            ecu.d().sendDeviceData(1, 8, null, deviceInfo, "Track_BoltDeviceManager");
            LogUtil.a("Track_BoltDeviceManager", "setRadioFrequencyId : sendDeviceData get new position and battery power");
        }
    }

    private int b(String str) {
        int deviceStateById = ecu.d().getDeviceStateById(DeviceStateConstants.WEAR_PLACE, str, "", "Track_BoltDeviceManager");
        if (deviceStateById == 13) {
            return 0;
        }
        if (deviceStateById == 8) {
            return 1;
        }
        if (deviceStateById == 53) {
            return 2;
        }
        if (deviceStateById == 240) {
            return 3;
        }
        LogUtil.j("Track_BoltDeviceManager", "getWearPlaceCode() wearPlaceCode is -1");
        return -1;
    }

    public List<d> b(int i) {
        LogUtil.a("Track_BoltDeviceManager", "getCurrentConnectedList() sportType: ", Integer.valueOf(i));
        b();
        Map<Integer, List<d>> mapC = c(e(false), true);
        ArrayList arrayList = new ArrayList(2);
        StringBuilder sb = new StringBuilder();
        for (d dVar : mapC.get(0)) {
            if (dVar.e().getDeviceIdentify().equals(this.e)) {
                sb.append("FOOT deviceName: ");
                sb.append(dVar.e().getDeviceName());
                sb.append(", deviceId: ");
                sb.append(CommonUtil.n(this.e));
                arrayList.add(dVar);
                break;
            }
        }
        if (i == 259) {
            for (d dVar2 : mapC.get(2)) {
                if (dVar2.e().getDeviceIdentify().equals(this.f38098a)) {
                    sb.append(", BIKE deviceName: ");
                    sb.append(dVar2.e().getDeviceName());
                    sb.append(", deviceId: ");
                    sb.append(CommonUtil.n(this.f38098a));
                    arrayList.add(dVar2);
                    break;
                }
            }
            return arrayList;
        }
        for (d dVar3 : mapC.get(1)) {
            if (dVar3.e().getDeviceIdentify().equals(this.i)) {
                sb.append(", WAIST deviceName: ");
                sb.append(dVar3.e().getDeviceName());
                sb.append(", deviceId: ");
                sb.append(CommonUtil.n(this.i));
                arrayList.add(dVar3);
                break;
            }
        }
        LogUtil.a("Track_BoltDeviceManager", "getCurrentConnectedList() info: ", sb.toString(), ", boltDeviceInfoList: ", arrayList);
        return arrayList;
    }

    private void b() {
        if (this.f38099b == null) {
            this.f38099b = c();
        }
        this.i = this.f38099b.z();
        this.e = this.f38099b.u();
        this.f38098a = this.f38099b.w();
        LogUtil.a("Track_BoltDeviceManager", "acquireDeviceIdentify() mWearWaistBoltIdentify = ", CommonUtil.n(this.i), ", mWearFootBoltIdentify = ", CommonUtil.n(this.e), ", mWearBikeBoltIdentify = ", CommonUtil.n(this.f38098a));
    }

    public List<d> e(List<d> list) {
        ArrayList arrayList = new ArrayList(10);
        if (list != null) {
            for (d dVar : list) {
                if (dVar.f38104c == -1 && dVar.e.getDeviceConnectState() == 2) {
                    arrayList.add(dVar);
                }
            }
        }
        return arrayList;
    }

    public boolean d(List<d> list, int i) {
        int iA;
        if (njy.e(list)) {
            return false;
        }
        int iA2 = a(list, 0);
        if (i == 259) {
            iA = a(list, 2);
        } else {
            iA = a(list, 1);
        }
        return iA2 > 0 && iA > 0;
    }

    public List<d> b(List<d> list, int i) {
        ArrayList arrayList = new ArrayList(10);
        if (!njy.e(list)) {
            int i2 = i == 259 ? 1 : 2;
            for (d dVar : list) {
                if (dVar != null && dVar.f38104c != -1 && dVar.f38104c != i2 && dVar.e.getDeviceConnectState() != 2) {
                    arrayList.add(dVar);
                }
            }
        }
        return arrayList;
    }

    private int a(List<d> list, int i) {
        int i2 = 0;
        if (njy.e(list)) {
            return 0;
        }
        for (d dVar : list) {
            if (dVar != null && dVar.e.getDeviceConnectState() == 2 && dVar.f38104c == i) {
                i2++;
            }
        }
        return i2;
    }

    public Map<Integer, List<d>> c(List<d> list, boolean z) {
        LogUtil.a("Track_BoltDeviceManager", "getWearingPositionBoltList() boltDeviceInfoList: ", Integer.valueOf(list.size()), ", isFilteringConnected: ", Boolean.valueOf(z));
        HashMap map = new HashMap();
        if (list == null) {
            LogUtil.j("Track_BoltDeviceManager", "getWearingPositionBoltList() boltDeviceInfoList is null, return");
            return map;
        }
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        ArrayList arrayList3 = new ArrayList(10);
        ArrayList arrayList4 = new ArrayList(10);
        for (d dVar : list) {
            if (!z || dVar.e().getDeviceConnectState() == 2) {
                if (dVar.f38104c == 0) {
                    arrayList.add(dVar);
                } else if (dVar.f38104c == 1) {
                    arrayList2.add(dVar);
                } else if (dVar.f38104c == 2) {
                    arrayList3.add(dVar);
                } else if (dVar.f38104c == -1) {
                    arrayList4.add(dVar);
                }
            }
        }
        map.put(0, arrayList);
        map.put(1, arrayList2);
        map.put(2, arrayList3);
        map.put(-1, arrayList4);
        LogUtil.a("Track_BoltDeviceManager", "getWearingPositionBoltList() map: ", map);
        return map;
    }

    public void d() {
        List<d> listE = a().e(false);
        for (int i = 0; i < listE.size(); i++) {
            d dVar = listE.get(i);
            if (dVar.e().getDeviceConnectState() == 3) {
                String deviceIdentify = dVar.e().getDeviceIdentify();
                ecy ecyVar = new ecy();
                ecyVar.c(deviceIdentify);
                ecu.d().executeDeviceRelatedLogic(ExecuteMode.NOTIFY_CONNECT_DEVICE, ecyVar, "Track_BoltDeviceManager");
                LogUtil.a("Track_BoltDeviceManager", "connectBoltDevice : deviceIdentify = ", CommonUtil.n(deviceIdentify));
            }
        }
    }

    public void c(List<d> list) {
        LogUtil.a("Track_BoltDeviceManager", " disconnectDevice enter ");
        if (njy.e(list)) {
            LogUtil.e("Track_BoltDeviceManager", " disconnectDevice boltDeviceInfoList is null ");
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (d dVar : list) {
            if (dVar.e().getDeviceConnectState() == 2) {
                LogUtil.a("Track_BoltDeviceManager", "disconnectDevice device is ", dVar.e().getDeviceName());
                arrayList.add(dVar.e().getDeviceIdentify());
            }
        }
        if (njy.b(arrayList)) {
            ecu.d().unPair(arrayList, false);
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_BoltDeviceManager", "preemptionBoltDevice deviceIdentify is empty");
            return;
        }
        ecy ecyVar = new ecy();
        ecyVar.c(str);
        ecu.d().executeDeviceRelatedLogic(ExecuteMode.NOTIFY_SEIZE_DEVICE, ecyVar, "Track_BoltDeviceManager");
        LogUtil.a("Track_BoltDeviceManager", "preemptionBoltDevice : deviceIdentify = ", CommonUtil.n(str));
    }

    public static jaq c() {
        return new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
    }

    public int e(String str) {
        return ecu.d().getDeviceStateById(DeviceStateConstants.BATTERY, str, "", "Track_BoltDeviceManager");
    }

    public static void a(DeviceInfo deviceInfo) {
        edc.e().sendSampleConfigCommand(deviceInfo, a(2), "Track_BoltDeviceManager");
    }

    private static eef a(int i) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.unitedevice.finddevice");
        eefVar.setWearPkgName("findDevice");
        eefVar.setCommandId(1);
        ArrayList arrayList = new ArrayList(5);
        eeg eegVar = new eeg();
        eegVar.b(900100002L);
        eegVar.b(i);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    public static class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f38102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f38103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f38104c;
        private final int d;
        private final DeviceInfo e;

        public d(DeviceInfo deviceInfo, int i, int i2) {
            this.e = deviceInfo;
            this.d = i;
            this.f38104c = i2;
        }

        public boolean c() {
            return this.f38103b;
        }

        public void d(boolean z) {
            this.f38103b = z;
        }

        public boolean a() {
            return this.f38102a;
        }

        public void c(boolean z) {
            this.f38102a = z;
        }

        public DeviceInfo e() {
            return this.e;
        }

        public int b() {
            return this.d;
        }

        public int d() {
            return this.f38104c;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return (int) (dVar.e.getLastConnectedTime() - this.e.getLastConnectedTime());
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).e.getLastConnectedTime() == this.e.getLastConnectedTime();
        }

        public int hashCode() {
            DeviceInfo deviceInfo = this.e;
            if (deviceInfo == null) {
                return 0;
            }
            return (int) deviceInfo.getLastConnectedTime();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.e != null) {
                sb.append("{deviceName=");
                sb.append(this.e.getDeviceName());
                sb.append(", deviceId=");
                sb.append(CommonUtil.n(this.e.getDeviceIdentify()));
                sb.append(", deviceConnectState=");
                sb.append(this.e.getDeviceConnectState());
            }
            sb.append(", mBatteryInfo=");
            sb.append(this.d);
            sb.append(", mWearingPosition=");
            sb.append(this.f38104c);
            sb.append(", mIsChecked=");
            sb.append(this.f38103b);
            sb.append(", mIsPreempting=");
            sb.append(this.f38102a);
            sb.append("}");
            return sb.toString();
        }
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ivo f38101b = new ivo();
    }
}
