package defpackage;

import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class ncx implements DataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42902a = new Object();
    private static ncx e;

    private ncx() {
    }

    public static ncx e() {
        ncx ncxVar;
        synchronized (f42902a) {
            if (e == null) {
                e = new ncx();
            }
            ncxVar = e;
        }
        return ncxVar;
    }

    private void b(String str) {
        edc.e().registerDeviceSampleListener(str, this);
    }

    public void b(DeviceInfo deviceInfo, String str) {
        b("hw.otadevice.privacyswitch");
        if (deviceInfo == null || !nvd.a(deviceInfo) || deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("HwPrivacySwitchMgr", "no send command");
        } else {
            if (edc.e().sendSampleConfigCommand(deviceInfo, c(str), "HwPrivacySwitchMgr")) {
                return;
            }
            LogUtil.a("HwPrivacySwitchMgr", "sendQueryWearPlaceCommand fail");
        }
    }

    private eef c(String str) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.otadevice.privacyswitch");
        eefVar.setWearPkgName("privacySwitch");
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(a(str));
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    private eeg a(String str) {
        LogUtil.a("HwPrivacySwitchMgr", "constructSampleConfigInfo enter ");
        eeg eegVar = new eeg();
        eegVar.b(900100005L);
        eegVar.b(1);
        StringBuilder sb = new StringBuilder(10);
        sb.append(eeq.d(lsk.a(str, 10)));
        eegVar.d(eeq.c(sb.toString()));
        return eegVar;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("HwPrivacySwitchMgr", "onDataReceived errorCode ", Integer.valueOf(i));
    }
}
