package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwdevice.phoneprocess.mgr.intelligentlifemgr.ProfileAgent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mxn implements DataReceiveCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mxn f42651b;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Boolean> f42652a = new HashMap(16);
    private final BroadcastReceiver d = new BroadcastReceiver() { // from class: mxn.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HwSyncDeviceInfoMgr", "mDeviceStatusReceiver intent is null.");
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                LogUtil.j("HwSyncDeviceInfoMgr", "mDeviceStatusReceiver action is null");
                return;
            }
            LogUtil.a("HwSyncDeviceInfoMgr", "mDeviceStatusReceiver action = ", action);
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
                if (deviceInfo == null) {
                    return;
                }
                LogUtil.a("HwSyncDeviceInfoMgr", "mDeviceStatusReceiver deviceInfo = ", deviceInfo.toString(), ",state = ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                mxn.this.b(deviceInfo);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DeviceInfo deviceInfo) {
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        if (deviceConnectState == 1) {
            HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
            hwGetDevicesParameter.setDeviceIdentify(deviceInfo.getDeviceIdentify());
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "HwSyncDeviceInfoMgr");
            if (deviceList == null || deviceList.size() == 0) {
                this.f42652a.put(deviceInfo.getDeviceIdentify(), true);
                return;
            }
            return;
        }
        if (deviceConnectState != 2) {
            return;
        }
        this.f42652a.put(deviceInfo.getDeviceIdentify(), false);
        if ("main_relationship".equals(deviceInfo.getRelationship()) && eey.d(deviceInfo, 191)) {
            LogUtil.a("HwSyncDeviceInfoMgr", "dealDeviceConnectState main device connected");
        } else if (eey.d(deviceInfo, 92) && "main_relationship".equals(deviceInfo.getRelationship())) {
            a();
            e(deviceInfo);
        }
    }

    private mxn() {
        d();
        mxr.e().a("HwSyncDeviceInfoMgr");
        LogUtil.a("HwSyncDeviceInfoMgr", "create HwSyncDeviceInfoMgr.");
    }

    public static mxn c() {
        mxn mxnVar;
        synchronized (e) {
            if (f42651b == null) {
                f42651b = new mxn();
            }
            mxnVar = f42651b;
        }
        return mxnVar;
    }

    private void d() {
        LogUtil.a("HwSyncDeviceInfoMgr", "registerBroadcastReceiver");
        a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.d, intentFilter, LocalBroadcast.f36595c, null);
    }

    public void c(List<String> list, boolean z) {
        if (z) {
            b(list);
        }
        mkf.e(BaseApplication.getContext()).unPair(list, z);
    }

    public void a(DeviceInfo deviceInfo) {
        c(deviceInfo);
    }

    private void e(DeviceInfo deviceInfo) {
        List<DeviceInfo> listE = e();
        if (listE.size() > 0) {
            LogUtil.a("HwSyncDeviceInfoMgr", "sendSyncAllDeviceCommand send command");
            e(deviceInfo, listE, 1);
        }
    }

    private void c(DeviceInfo deviceInfo) {
        List<DeviceInfo> deviceList;
        DeviceInfo deviceInfo2;
        if ((!this.f42652a.containsKey(deviceInfo.getDeviceIdentify()) || this.f42652a.get(deviceInfo.getDeviceIdentify()).booleanValue()) && (deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwSyncDeviceInfoMgr")) != null && deviceList.size() > 0 && (deviceInfo2 = deviceList.get(0)) != null && eey.d(deviceInfo2, 92)) {
            LogUtil.a("HwSyncDeviceInfoMgr", "sendSyncAddDeviceCommand send command");
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(deviceInfo);
            e(deviceInfo2, arrayList, 3);
        }
    }

    private void b(List<String> list) {
        c(list);
        a(list);
    }

    private void c(List<String> list) {
        if (list == null) {
            LogUtil.j("HwSyncDeviceInfoMgr", "unPairEarphone identifyList is null");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwSyncDeviceInfoMgr");
        if (deviceList == null || deviceList.size() <= 0) {
            return;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("HwSyncDeviceInfoMgr", "unPairEarphone mainDeviceInfo is null");
            return;
        }
        if (!list.contains(deviceInfo.getDeviceIdentify())) {
            LogUtil.j("HwSyncDeviceInfoMgr", "unPairEarphone mainDeviceInfo is not match. ");
        } else if (!eey.d(deviceInfo, 112)) {
            LogUtil.j("HwSyncDeviceInfoMgr", "unPairEarphone capability is not match");
        } else {
            mvv.d().c(deviceInfo);
        }
    }

    private void a(List<String> list) {
        if (list == null) {
            LogUtil.j("HwSyncDeviceInfoMgr", "sendSyncDeleteDeviceCommand identifyList is null");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwSyncDeviceInfoMgr");
        if (deviceList == null || deviceList.size() <= 0) {
            return;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("HwSyncDeviceInfoMgr", "sendSyncDeleteDeviceCommand mainDeviceInfo is null");
            return;
        }
        if (!eey.d(deviceInfo, 92)) {
            LogUtil.j("HwSyncDeviceInfoMgr", "sendSyncDeleteDeviceCommand capability is not match");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        List<DeviceInfo> listB = b();
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("HwSyncDeviceInfoMgr", "sendSyncDeleteDeviceCommand identify is empty");
            } else if (str.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                LogUtil.j("HwSyncDeviceInfoMgr", "sendSyncDeleteDeviceCommand delete device is main device");
            } else {
                DeviceInfo deviceInfoA = a(str, listB);
                if (deviceInfoA != null) {
                    arrayList.add(deviceInfoA);
                }
            }
        }
        if (arrayList.size() > 0) {
            LogUtil.a("HwSyncDeviceInfoMgr", "sendSyncDeleteDeviceCommand send command");
            e(deviceInfo, arrayList, 4);
        }
    }

    private DeviceInfo a(String str, List<DeviceInfo> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (DeviceInfo deviceInfo : list) {
            if (str.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                return deviceInfo;
            }
        }
        return null;
    }

    private List<DeviceInfo> e() {
        ArrayList arrayList = new ArrayList(16);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwSyncDeviceInfoMgr");
        if (deviceList.size() > 0) {
            for (int i = 0; i < deviceList.size(); i++) {
                DeviceInfo deviceInfo = deviceList.get(i);
                if (e(deviceInfo, deviceInfo.getDeviceModel())) {
                    arrayList.add(deviceInfo);
                }
            }
        }
        List<CloudDeviceInfo> listB = mre.d().b();
        if (listB.size() > 0) {
            for (int i2 = 0; i2 < listB.size(); i2++) {
                CloudDeviceInfo cloudDeviceInfo = listB.get(i2);
                if (e(cloudDeviceInfo, cloudDeviceInfo.getDeviceModel())) {
                    arrayList.add(cloudDeviceInfo);
                }
            }
        }
        return arrayList;
    }

    private boolean e(DeviceInfo deviceInfo, String str) {
        if (deviceInfo.getProductType() == 75) {
            return str.contains("Bolt") || str.contains("bolt");
        }
        return false;
    }

    private List<DeviceInfo> b() {
        ArrayList arrayList = new ArrayList(16);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwSyncDeviceInfoMgr");
        if (deviceList.size() > 0) {
            arrayList.addAll(deviceList);
        }
        List<CloudDeviceInfo> listB = mre.d().b();
        if (listB.size() > 0) {
            arrayList.addAll(listB);
        }
        return arrayList;
    }

    public void a() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.syncdevice", this);
    }

    private void e(DeviceInfo deviceInfo, List<DeviceInfo> list, int i) {
        if (deviceInfo == null) {
            LogUtil.j("HwSyncDeviceInfoMgr", "sendSyncDeviceCommand currentDeviceInfo is null");
            return;
        }
        if (list == null || list.size() <= 0) {
            LogUtil.j("HwSyncDeviceInfoMgr", "sendSyncDeviceCommand deviceList is null or empty");
            return;
        }
        for (DeviceInfo deviceInfo2 : list) {
            if (deviceInfo2.getDeviceIdentify() != null && deviceInfo2.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                list.remove(deviceInfo2);
                break;
            }
        }
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.unitedevice.syncdevice");
        eefVar.setWearPkgName("syncdevice");
        ArrayList arrayList = new ArrayList(10);
        if (list.size() == 0) {
            LogUtil.a("HwSyncDeviceInfoMgr", "no pairDevice need to sync.");
            d(deviceInfo, i, eefVar, arrayList);
            return;
        }
        int i2 = 0;
        for (DeviceInfo deviceInfo3 : list) {
            i2++;
            if (i2 == list.size()) {
                LogUtil.a("HwSyncDeviceInfoMgr", "sendSyncDeviceCommand is last device");
                arrayList.add(c(deviceInfo3, i, true));
                eefVar.setConfigInfoList(arrayList);
                edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "HwSyncDeviceInfoMgr");
            } else {
                arrayList.add(c(deviceInfo3, i, false));
                if (arrayList.size() == 10) {
                    LogUtil.a("HwSyncDeviceInfoMgr", "sendSyncDeviceCommand sampleConfigInfos size is SEND_DEVICE_SIZE");
                    eefVar.setConfigInfoList(arrayList);
                    edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "HwSyncDeviceInfoMgr");
                    arrayList.clear();
                }
            }
        }
    }

    private void d(DeviceInfo deviceInfo, int i, eef eefVar, List<eeg> list) {
        list.add(c(null, i, true));
        eefVar.setConfigInfoList(list);
        edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "HwSyncDeviceInfoMgr");
    }

    private eeg c(DeviceInfo deviceInfo, int i, boolean z) {
        String strD;
        eeg eegVar = new eeg();
        eegVar.b(900100003L);
        eegVar.b(i);
        StringBuilder sb = new StringBuilder(10);
        if (z) {
            strD = eeq.d(1);
        } else {
            strD = eeq.d(0);
        }
        sb.append(eeq.d(8) + eeq.d(1) + strD);
        if (deviceInfo == null) {
            LogUtil.a("HwSyncDeviceInfoMgr", "structStringBuilder: ", sb.toString());
            eegVar.d(eeq.c(sb.toString()));
            return eegVar;
        }
        e(deviceInfo, sb);
        LogUtil.a("HwSyncDeviceInfoMgr", "constructSampleConfigInfo structStringBuilder: ", sb.toString());
        eegVar.d(eeq.c(sb.toString()));
        return eegVar;
    }

    private void e(DeviceInfo deviceInfo, StringBuilder sb) {
        if (!TextUtils.isEmpty(deviceInfo.getDeviceModel())) {
            String strA = eeq.a(deviceInfo.getDeviceModel());
            sb.append(eeq.d(9) + eeq.d(strA.length() / 2) + strA);
        }
        sb.append(eeq.d(10) + eeq.d(2) + eeq.e(deviceInfo.getProductType()));
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        if (!TextUtils.isEmpty(hiLinkDeviceId)) {
            String strA2 = eeq.a(hiLinkDeviceId);
            sb.append(eeq.d(11) + eeq.d(strA2.length() / 2) + strA2);
        }
        if (!TextUtils.isEmpty(deviceInfo.getDeviceName())) {
            String strA3 = eeq.a(deviceInfo.getDeviceName());
            sb.append(eeq.d(12) + eeq.d(strA3.length() / 2) + strA3);
        }
        if (!TextUtils.isEmpty(deviceInfo.getSecurityUuid())) {
            String strA4 = eeq.a(deviceInfo.getSecurityUuid());
            sb.append(eeq.d(13) + eeq.d(strA4.length() / 2) + strA4);
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            return;
        }
        c(deviceInfo, sb);
    }

    private void c(DeviceInfo deviceInfo, StringBuilder sb) {
        String strA = eeq.a(deviceInfo.getDeviceIdentify());
        sb.append(eeq.d(14) + eeq.d(strA.length() / 2) + strA);
        String switchSettingFromDb = mhs.a().getSwitchSettingFromDb(mip.a(deviceInfo.getDeviceIdentify()));
        if (TextUtils.isEmpty(switchSettingFromDb)) {
            return;
        }
        meg megVarB = mip.b(switchSettingFromDb);
        sb.append(eeq.d(15) + eeq.d(8) + String.format(Locale.ENGLISH, "%016d", Long.valueOf(megVarB.b())));
        sb.append(eeq.d(16) + eeq.d(2) + eeq.e(megVarB.a()));
        sb.append(eeq.d(17) + eeq.d(1) + eeq.d(megVarB.c()));
        sb.append(eeq.d(18) + eeq.d(1) + eeq.d(megVarB.e()));
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (deviceInfo == null) {
            LogUtil.j("HwSyncDeviceInfoMgr", "onDataReceived deviceInfo is null");
            return;
        }
        if (eecVar instanceof eef) {
            LogUtil.a("HwSyncDeviceInfoMgr", "onDataReceived sampleBase instanceof SampleConfig");
            List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
            if (configInfoList == null || configInfoList.size() <= 0) {
                LogUtil.j("HwSyncDeviceInfoMgr", "onDataReceived sampleConfigInfos is null or empty");
            } else {
                e(configInfoList, deviceInfo);
            }
        }
    }

    private void e(List<eeg> list, DeviceInfo deviceInfo) {
        List<DeviceInfo> arrayList = new ArrayList<>(10);
        for (eeg eegVar : list) {
            String strE = eeq.e(eegVar.e());
            LogUtil.a("HwSyncDeviceInfoMgr", "configDeviceDbInfo configData = ", strE);
            CloudDeviceInfo cloudDeviceInfoC = c(strE);
            if (cloudDeviceInfoC != null) {
                if (eegVar.d() == 1 || eegVar.d() == 3) {
                    if (!e(cloudDeviceInfoC) && !b(cloudDeviceInfoC)) {
                        cloudDeviceInfoC.setIsCloudDevice(true);
                        arrayList.add(cloudDeviceInfoC);
                        if (d(cloudDeviceInfoC.getProductType())) {
                            mre.d().c(cloudDeviceInfoC);
                        }
                    }
                } else if (eegVar.d() == 4) {
                    if (e(cloudDeviceInfoC)) {
                        ArrayList arrayList2 = new ArrayList(10);
                        arrayList2.add(cloudDeviceInfoC.getDeviceIdentify());
                        mkn.e().unPair(arrayList2, true);
                        a(cloudDeviceInfoC.getSecurityUuid() + "#ANDROID21");
                        return;
                    }
                    if (b(cloudDeviceInfoC)) {
                        mre.d().d(cloudDeviceInfoC);
                        a(cloudDeviceInfoC.getSecurityUuid() + "#ANDROID21");
                        g();
                    }
                } else if (eegVar.d() == 5) {
                    d(cloudDeviceInfoC);
                } else {
                    LogUtil.j("HwSyncDeviceInfoMgr", "configDeviceDbInfo configAction is not match");
                }
            }
        }
        d(arrayList);
    }

    private void d(CloudDeviceInfo cloudDeviceInfo) {
        String deviceReportInfo = cloudDeviceInfo.getDeviceReportInfo();
        if (deviceReportInfo.length() % 4 == 0) {
            Map<Integer, Integer> map = new HashMap<>();
            int i = 0;
            while (i < deviceReportInfo.length()) {
                int i2 = i + 4;
                String strSubstring = deviceReportInfo.substring(i, i2);
                map.put(Integer.valueOf(CommonUtil.v(strSubstring.substring(0, 2))), Integer.valueOf(CommonUtil.v(strSubstring.substring(2))));
                i = i2;
            }
            List<DeviceInfo> arrayList = new ArrayList<>(16);
            HashMap<Integer, Integer> map2 = new HashMap<>();
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwSyncDeviceInfoMgr");
            Collections.sort(deviceList, new Comparator<DeviceInfo>() { // from class: mxn.2
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public int compare(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
                    return (int) (deviceInfo2.getLastConnectedTime() - deviceInfo.getLastConnectedTime());
                }
            });
            if (deviceList.size() > 0) {
                a(map, arrayList, map2, deviceList);
            }
            List<CloudDeviceInfo> listB = mre.d().b();
            if (listB.size() > 0) {
                List<DeviceInfo> arrayList2 = new ArrayList<>();
                arrayList2.addAll(listB);
                a(map, arrayList, map2, arrayList2);
            }
            List<DeviceInfo> deviceList2 = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwSyncDeviceInfoMgr");
            if (deviceList2 == null || deviceList2.size() <= 0 || arrayList.size() <= 0) {
                return;
            }
            e(deviceList2.get(0), arrayList, 1);
        }
    }

    private void a(Map<Integer, Integer> map, List<DeviceInfo> list, HashMap<Integer, Integer> map2, List<DeviceInfo> list2) {
        for (int i = 0; i < list2.size(); i++) {
            DeviceInfo deviceInfo = list2.get(i);
            int productType = deviceInfo.getProductType();
            Integer num = map2.get(Integer.valueOf(productType));
            Integer num2 = map.get(Integer.valueOf(productType));
            if (!map.keySet().contains(Integer.valueOf(productType))) {
                LogUtil.a("HwSyncDeviceInfoMgr", "getMatchDeviceList current productType not contains productTypeMap");
            } else if (num == null || num != num2) {
                list.add(deviceInfo);
                if (!map2.containsKey(Integer.valueOf(productType))) {
                    map2.put(Integer.valueOf(productType), 1);
                } else {
                    map2.put(Integer.valueOf(productType), Integer.valueOf(map2.get(Integer.valueOf(productType)).intValue() + 1));
                }
            }
        }
    }

    private void g() {
        for (int i = 0; i < cin.f1618a.size(); i++) {
            KeyValDbManager.d(BaseApplication.getContext()).b("profile_devices_last_query_time_01" + cin.f1618a.get(i), String.valueOf(0));
        }
    }

    private CloudDeviceInfo c(String str) {
        CloudDeviceInfo cloudDeviceInfo = null;
        try {
            List<eew> listE = new eet().b(str).e();
            if (listE != null && listE.size() > 0) {
                CloudDeviceInfo cloudDeviceInfo2 = new CloudDeviceInfo();
                try {
                    meg megVar = new meg();
                    for (eew eewVar : listE) {
                        int iV = CommonUtil.v(eewVar.e());
                        if (iV != 19) {
                            switch (iV) {
                                case 8:
                                    LogUtil.a("HwSyncDeviceInfoMgr", "parseConfigData flag type is ", Integer.valueOf(CommonUtil.v(eewVar.b())));
                                    break;
                                case 9:
                                    cloudDeviceInfo2.setDeviceModel(eeq.d(eewVar.b()));
                                    break;
                                case 10:
                                    cloudDeviceInfo2.setProductType(CommonUtil.v(eewVar.b()));
                                    break;
                                case 11:
                                    cloudDeviceInfo2.setHiLinkDeviceId(eeq.d(eewVar.b()));
                                    break;
                                case 12:
                                    cloudDeviceInfo2.setDeviceName(eeq.d(eewVar.b()));
                                    break;
                                case 13:
                                    cloudDeviceInfo2.setUuid(eewVar.b());
                                    break;
                                case 14:
                                    cloudDeviceInfo2.setDeviceIdentify(eeq.d(eewVar.b()));
                                    break;
                                default:
                                    d(megVar, eewVar);
                                    break;
                            }
                        } else {
                            LogUtil.a("HwSyncDeviceInfoMgr", "parseConfigData value=", eewVar.b());
                            cloudDeviceInfo2.setDeviceReportInfo(eewVar.b());
                        }
                    }
                    c(cloudDeviceInfo2.getDeviceIdentify(), megVar);
                    return cloudDeviceInfo2;
                } catch (eeu e2) {
                    e = e2;
                    cloudDeviceInfo = cloudDeviceInfo2;
                    LogUtil.e("HwSyncDeviceInfoMgr", "parseConfigData e1 = ", ExceptionUtils.c(e));
                    return cloudDeviceInfo;
                }
            }
            LogUtil.j("HwSyncDeviceInfoMgr", "parseConfigData tlvList is null or empty");
            return null;
        } catch (eeu e3) {
            e = e3;
        }
    }

    private void d(meg megVar, eew eewVar) {
        LogUtil.d("HwSyncDeviceInfoMgr", "parseWheelSizeTlv - getTag:", eewVar.e(), ",getValue:", eewVar.b());
        switch (CommonUtil.v(eewVar.e())) {
            case 15:
                megVar.a(CommonUtil.x(eewVar.b()));
                break;
            case 16:
                megVar.e(CommonUtil.v(eewVar.b()));
                break;
            case 17:
                megVar.c(CommonUtil.v(eewVar.b()));
                break;
            case 18:
                megVar.b(CommonUtil.v(eewVar.b()));
                break;
            default:
                LogUtil.j("HwSyncDeviceInfoMgr", "parseConfigData default branches.");
                break;
        }
    }

    private void c(String str, meg megVar) {
        if (!TextUtils.isEmpty(str) && megVar != null) {
            try {
                long jX = CommonUtil.x(String.format(Locale.ENGLISH, "%016d", Long.valueOf(megVar.b())));
                LogUtil.a("HwSyncDeviceInfoMgr", "timeFromDevice: ", Long.valueOf(jX));
                if (jX == -1) {
                    LogUtil.j("HwSyncDeviceInfoMgr", "timeFromDevice is invalid. ");
                    return;
                }
                String switchSettingFromDb = mhs.a().getSwitchSettingFromDb(mip.a(str));
                meg megVarB = mip.b(switchSettingFromDb);
                if (TextUtils.isEmpty(switchSettingFromDb) || megVarB == null) {
                    return;
                }
                long jX2 = CommonUtil.x(String.format(Locale.ENGLISH, "%016d", Long.valueOf(megVarB.b())));
                LogUtil.a("HwSyncDeviceInfoMgr", "timeFromDb: ", Long.valueOf(jX2));
                if (jX2 < jX) {
                    mhs.a().setSwitchSettingToDb(mip.a(str), megVar.toString());
                    return;
                }
                return;
            } catch (NumberFormatException unused) {
                LogUtil.e("HwSyncDeviceInfoMgr", "saveRimSize NumberFormatException.");
                return;
            }
        }
        LogUtil.j("HwSyncDeviceInfoMgr", "saveRimSize parameter is invalid.");
    }

    private boolean e(CloudDeviceInfo cloudDeviceInfo) {
        if (cloudDeviceInfo == null) {
            LogUtil.j("HwSyncDeviceInfoMgr", "isMathLocalDeviceList syncDeviceInfo is null");
            return false;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwSyncDeviceInfoMgr");
        if (deviceList == null || deviceList.size() <= 0) {
            LogUtil.j("HwSyncDeviceInfoMgr", "isMathLocalDeviceList deviceInfoList is null or empty");
            return false;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo == null || deviceInfo.getDeviceIdentify() == null) {
                LogUtil.j("HwSyncDeviceInfoMgr", "isMathLocalDeviceList deviceInfo or deviceIdentify is null");
            } else if (deviceInfo.getDeviceIdentify().contains(cloudDeviceInfo.getDeviceIdentify()) && deviceInfo.getDeviceName().equalsIgnoreCase(cloudDeviceInfo.getDeviceName())) {
                LogUtil.a("HwSyncDeviceInfoMgr", "isMathLocalDeviceList is match");
                cloudDeviceInfo.setDeviceIdentify(deviceInfo.getDeviceIdentify());
                return true;
            }
        }
        return false;
    }

    private boolean b(CloudDeviceInfo cloudDeviceInfo) {
        if (cloudDeviceInfo == null || TextUtils.isEmpty(cloudDeviceInfo.getDeviceIdentify())) {
            LogUtil.j("HwSyncDeviceInfoMgr", "isMathCloudDeviceList syncDeviceInfo or identifyis null");
            return false;
        }
        List<CloudDeviceInfo> listB = mre.d().b();
        if (listB.size() <= 0) {
            LogUtil.j("HwSyncDeviceInfoMgr", "isMathCloudDeviceList cloudDeviceInfoList is null or empty");
            return false;
        }
        for (CloudDeviceInfo cloudDeviceInfo2 : listB) {
            if (cloudDeviceInfo2 == null || cloudDeviceInfo2.getDeviceIdentify() == null) {
                LogUtil.j("HwSyncDeviceInfoMgr", "isMathCloudDeviceList cloudDeviceInfo or deviceIdentify is null");
            } else if (cloudDeviceInfo.getDeviceIdentify().contains(cloudDeviceInfo2.getDeviceIdentify()) && cloudDeviceInfo2.getDeviceName().equalsIgnoreCase(cloudDeviceInfo.getDeviceName())) {
                LogUtil.a("HwSyncDeviceInfoMgr", "isMathCloudDeviceList is match");
                return true;
            }
        }
        return false;
    }

    private boolean d(int i) {
        String strA = mmx.a(i);
        LogUtil.a("HwSyncDeviceInfoMgr", "isDownloadResource deviceUuid is null: ", Boolean.valueOf(TextUtils.isEmpty(strA)));
        return ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strA);
    }

    private void d(final List<DeviceInfo> list) {
        LogUtil.a("HwSyncDeviceInfoMgr", "syncDeviceInfoToCloud enter, size is ", Integer.valueOf(list.size()));
        if (list.size() == 0) {
            LogUtil.j("HwSyncDeviceInfoMgr", "deviceInfos size is 0.");
        } else {
            if (Utils.o()) {
                return;
            }
            ProfileAgent.PROFILE_AGENT.connectProfile(new ServiceConnectCallback() { // from class: mxn.3
                @Override // com.huawei.profile.client.connect.ServiceConnectCallback
                public void onConnect() {
                    LogUtil.a("HwSyncDeviceInfoMgr", "profile connected");
                    ProfileAgent.PROFILE_AGENT.setConnected(true);
                    lsy.a(new Runnable() { // from class: mxn.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                nar.d().e((DeviceInfo) it.next());
                            }
                            ProfileAgent.PROFILE_AGENT.disconnectProfile();
                        }
                    });
                }

                @Override // com.huawei.profile.client.connect.ServiceConnectCallback
                public void onDisconnect() {
                    ProfileAgent.PROFILE_AGENT.setConnected(false);
                    LogUtil.a("HwSyncDeviceInfoMgr", "profile disconnected");
                }
            });
            LogUtil.a("HwSyncDeviceInfoMgr", "syncDeviceInfoToCloud end");
        }
    }

    private void a(final String str) {
        LogUtil.a("HwSyncDeviceInfoMgr", "removeDeviceFromCloud enter");
        if (Utils.o() || TextUtils.isEmpty(str)) {
            LogUtil.j("HwSyncDeviceInfoMgr", "removeDeviceFromCloud overSea or deviceUuid is null.");
        } else {
            ProfileAgent.PROFILE_AGENT.connectProfile(new ServiceConnectCallback() { // from class: mxn.1
                @Override // com.huawei.profile.client.connect.ServiceConnectCallback
                public void onConnect() {
                    LogUtil.a("HwSyncDeviceInfoMgr", "profile connected");
                    lsy.a(new Runnable() { // from class: mxn.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            nar.d().e(str);
                            ProfileAgent.PROFILE_AGENT.disconnectProfile();
                        }
                    });
                    ProfileAgent.PROFILE_AGENT.setConnected(true);
                }

                @Override // com.huawei.profile.client.connect.ServiceConnectCallback
                public void onDisconnect() {
                    ProfileAgent.PROFILE_AGENT.setConnected(false);
                    LogUtil.a("HwSyncDeviceInfoMgr", "profile disconnected");
                }
            });
        }
    }
}
