package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f42662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DataReceiveCallback f42664c;
    private String d;
    private mxq e;
    private String h;

    private mxr() {
        this.h = "HwSeizeDeviceMgr";
        this.d = "hw.unitedevice.seizedevice";
        this.f42663b = "seizedevice";
        this.e = new mxq();
        this.f42664c = new DataReceiveCallback() { // from class: mxr.1
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                LogUtil.a(mxr.this.h, "callback onDataReceived");
                if (deviceInfo == null || eecVar == null) {
                    LogUtil.a(mxr.this.h, "device or message is null.");
                } else if (eecVar instanceof eef) {
                    mxr.this.a(i, deviceInfo, (eef) eecVar);
                }
            }
        };
        this.f42662a = new BroadcastReceiver() { // from class: mxr.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    LogUtil.j(mxr.this.h, "mDeviceStatusReceiver onReceive intent is null.");
                    return;
                }
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    LogUtil.j(mxr.this.h, "mDeviceStatusReceiver onReceive action is null");
                    return;
                }
                LogUtil.a(mxr.this.h, "mDeviceStatusReceiver onReceive action :", action);
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                    DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
                    if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2 && eey.d(deviceInfo, 93)) {
                        mxr.this.d();
                    }
                }
            }
        };
        LogUtil.a(this.h, "create HwSeizeDeviceMgr");
        d();
        b();
    }

    private void b() {
        LogUtil.a(this.h, "enter registerBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f42662a, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a(this.h, "enter registerDeviceSampleListener");
        edc.e().registerDeviceSampleListener(this.d, this.f42664c);
    }

    private void a(DeviceInfo deviceInfo, String str) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.j(this.h, "notifyPartsSeize partsDevice is null.");
            return;
        }
        LogUtil.a(this.h, "notifyPartsSeize enter with partsDevice: ", CommonUtil.n(deviceInfo.getDeviceIdentify()), ", identify: ", CommonUtil.n(str));
        eef eefVar = new eef();
        eeg eegVar = new eeg();
        c(eefVar, eegVar);
        String strA = this.e.a(str, deviceInfo.getDeviceIdentify());
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j(this.h, "notifyPartsSeize seizeInfo is null.");
        } else {
            eegVar.d(eeq.c(strA));
            edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "notifyPartsSeize");
        }
    }

    private void e(DeviceInfo deviceInfo, int i, String str, String str2) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.j(this.h, "replyDeviceResult deviceInfo is null.");
            return;
        }
        LogUtil.a(this.h, "replyDeviceResult enter with deviceInfo: ", CommonUtil.n(deviceInfo.getDeviceIdentify()), ", partsIdentify: ", CommonUtil.n(str), ", partsName: ", str2);
        eef eefVar = new eef();
        eeg eegVar = new eeg();
        c(eefVar, eegVar);
        String strD = this.e.d(i, str, str2);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j(this.h, "replyDeviceResult replyResult is null.");
        } else {
            eegVar.d(eeq.c(strD));
            edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "replyDeviceResult");
        }
    }

    public void e(DeviceInfo deviceInfo, String str) {
        if (deviceInfo == null || TextUtils.isEmpty(str)) {
            LogUtil.j(this.h, "requestDeviceSeize input parameter is invalid.");
            return;
        }
        LogUtil.a(this.h, "requestDeviceSeize enter with deviceInfo: ", CommonUtil.n(deviceInfo.getDeviceIdentify()), ", identify: ", CommonUtil.n(str));
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, this.h);
        if (deviceList.size() != 0) {
            d(deviceInfo, deviceList.get(0));
        }
    }

    private void d(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.j(this.h, "requestDeviceSeize deviceInfo is null.");
            return;
        }
        eef eefVar = new eef();
        eeg eegVar = new eeg();
        c(eefVar, eegVar);
        String strD = this.e.d(deviceInfo2.getDeviceIdentify(), deviceInfo2.getHiLinkDeviceId(), deviceInfo2.getDeviceName());
        LogUtil.a(this.h, "requestDeviceSeize enter with deviceInfo: ", deviceInfo, ", partsIdentify: ", CommonUtil.n(deviceInfo2.getDeviceIdentify()), ", hiLinkId: ", deviceInfo2.getHiLinkDeviceId(), ", partsName: ", deviceInfo2.getDeviceName(), "requestDeviceSeize requestSeize: ", strD);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j(this.h, "requestDeviceSeize requestSeize is null.");
        } else {
            eegVar.d(eeq.c(strD));
            edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "requestDeviceSeize");
        }
    }

    private void c(eef eefVar, eeg eegVar) {
        eefVar.setCommandId(1);
        eefVar.setSrcPkgName(this.d);
        eefVar.setWearPkgName(this.f42663b);
        eegVar.b(900100004L);
        eegVar.b(1);
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, DeviceInfo deviceInfo, eef eefVar) {
        String strA = a(deviceInfo, eefVar);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j(this.h, "getResult configData is null.");
            return;
        }
        try {
            List<eew> listE = new eet().b(strA).e();
            if (njy.e(listE)) {
                LogUtil.j(this.h, "getResult tlvList is null or size is zero");
                return;
            }
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                LogUtil.j(this.h, "getResult type is: ", Integer.valueOf(iV));
                if (iV == 8) {
                    d(deviceInfo, listE);
                    return;
                }
                if (iV == 13) {
                    b(deviceInfo, listE);
                    return;
                }
                if (iV == 15) {
                    a(deviceInfo, listE);
                    return;
                } else if (iV == 127) {
                    int iV2 = CommonUtil.v(eewVar.b());
                    LogUtil.j(this.h, "getResult CommonUtil.ERROR_TYPE, errorValue: ", Integer.valueOf(iV2));
                    if (iV2 != -1) {
                        return;
                    }
                } else {
                    LogUtil.d(this.h, "getResult default: ", Integer.valueOf(iV));
                }
            }
        } catch (eeu e) {
            LogUtil.e(this.h, "getResult Exception ", ExceptionUtils.c(e));
        }
    }

    private String a(DeviceInfo deviceInfo, eef eefVar) {
        if (deviceInfo == null || eefVar == null) {
            LogUtil.j(this.h, "getResult() getConfigData input parameter is null.");
            return null;
        }
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        eeg eegVar = configInfoList != null ? configInfoList.get(0) : null;
        String strE = eegVar != null ? eeq.e(eegVar.e()) : null;
        LogUtil.a(this.h, "getResult() getConfigData configData:", strE);
        return strE;
    }

    public void d(DeviceInfo deviceInfo, List<eew> list) {
        if (deviceInfo == null || njy.e(list)) {
            LogUtil.j(this.h, "handleSeizeNotify input parameter is null.");
            return;
        }
        DeviceInfo deviceInfo2 = new DeviceInfo();
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            switch (iV) {
                case 8:
                    deviceInfo2.setDeviceIdentify(eeq.d(eewVar.b()));
                    break;
                case 9:
                    deviceInfo2.setHiLinkDeviceId(eeq.d(eewVar.b()));
                    break;
                case 10:
                    deviceInfo2.setDeviceName(eeq.d(eewVar.b()));
                    break;
                default:
                    LogUtil.j(this.h, "handleSeizeNotify default type: ", Integer.valueOf(iV));
                    break;
            }
        }
        for (DeviceInfo deviceInfo3 : ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, this.h)) {
            LogUtil.a(this.h, "handleSeizeNotify info.getDeviceIdentify: ", CommonUtil.n(deviceInfo3.getDeviceIdentify()), ", deviceInfo.getDeviceIdentify: ", CommonUtil.n(deviceInfo2.getDeviceIdentify()), ", info.getDeviceName: ", deviceInfo3.getDeviceName(), ", deviceInfo.getDeviceName: ", deviceInfo2.getDeviceName());
            if (deviceInfo3.getDeviceIdentify().contains(deviceInfo2.getDeviceIdentify()) && deviceInfo3.getDeviceName().equalsIgnoreCase(deviceInfo2.getDeviceName())) {
                a(deviceInfo3, deviceInfo.getDeviceIdentify());
                return;
            }
        }
        e(deviceInfo2, 1, deviceInfo2.getDeviceIdentify(), deviceInfo2.getDeviceName());
    }

    public void b(DeviceInfo deviceInfo, List<eew> list) {
        if (deviceInfo == null || njy.e(list)) {
            LogUtil.j(this.h, "handleSeizeResult input parameter is null.");
            return;
        }
        String strD = null;
        int iV = 2;
        for (eew eewVar : list) {
            int iV2 = CommonUtil.v(eewVar.e());
            if (iV2 == 13) {
                strD = eeq.d(eewVar.b());
            } else if (iV2 == 14) {
                iV = CommonUtil.v(eewVar.b());
                LogUtil.a(this.h, "handleSeizeResult seizeResult: ", Integer.valueOf(iV));
            } else {
                LogUtil.j(this.h, "handleSeizeResult default type: ", Integer.valueOf(iV2));
            }
        }
        if (iV == 1 && !TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.a(this.h, "deviceIdentify start disconnect Device, seizeResult: ", Integer.valueOf(iV));
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(deviceInfo.getDeviceIdentify());
            mkf.e(BaseApplication.getContext()).unPair(arrayList, false);
        }
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(strD);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, this.h);
        if (njy.e(deviceList)) {
            return;
        }
        e(deviceList.get(0), iV, deviceInfo.getDeviceIdentify(), deviceInfo.getDeviceName());
    }

    public void a(DeviceInfo deviceInfo, List<eew> list) {
        if (deviceInfo == null || njy.e(list)) {
            LogUtil.j(this.h, "replySeizeResult input parameter is null.");
            return;
        }
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            switch (iV) {
                case 15:
                    LogUtil.a(this.h, "replySeizeResult result: ", eeq.d(eewVar.b()));
                    break;
                case 16:
                    LogUtil.a(this.h, "replySeizeResult identify: ", CommonUtil.n(eeq.d(eewVar.b())));
                    break;
                case 17:
                    LogUtil.a(this.h, "replySeizeResult name: ", eeq.d(eewVar.b()));
                    break;
                default:
                    LogUtil.j(this.h, "replySeizeResult default type: ", Integer.valueOf(iV));
                    break;
            }
        }
    }

    public void a(String str) {
        LogUtil.a(this.h, "init tag: ", str);
    }

    public static mxr e() {
        return d.d;
    }

    static class d {
        private static mxr d = new mxr();
    }
}
