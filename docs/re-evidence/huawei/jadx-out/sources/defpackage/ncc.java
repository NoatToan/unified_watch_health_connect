package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.HarmonyBuild;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class ncc implements DataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ncc f42871a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42872c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f42873b = BaseApplication.getContext();
    private xgt d;

    public static ncc c() {
        ncc nccVar;
        synchronized (f42872c) {
            if (f42871a == null) {
                f42871a = new ncc();
            }
            nccVar = f42871a;
        }
        return nccVar;
    }

    public void a() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.smartedge", this);
    }

    private ncc() {
        xgt xgtVarB = xgt.b();
        this.d = xgtVarB;
        xgtVarB.a(this.f42873b);
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("HwNotificationLiveMgr", "onDataReceived enter");
        if (deviceInfo == null || eecVar == null) {
            LogUtil.a("HwNotificationLiveMgr", "device or message is null.");
            return;
        }
        if (eecVar instanceof eee) {
            eee eeeVar = (eee) eecVar;
            if (eecVar.getCommandId() != 2) {
                LogUtil.j("HwNotificationLiveMgr", "onDataReceived, message commandId: ", Integer.valueOf(eecVar.getCommandId()));
                return;
            }
            if (eeeVar.d() != 800100014) {
                ReleaseLogUtil.e("Notify_HwNotificationLiveMgr", "event id reported is not LEVEL_EVENT_ID");
                return;
            }
            if (!d() || !ncp.g()) {
                ReleaseLogUtil.e("Notify_HwNotificationLiveMgr", "onDataReceived phone is later harmony 4 or capability is not support");
                return;
            }
            String strE = eeq.e(eeeVar.c());
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            String upperCase = eeq.d(strE).toUpperCase(Locale.ENGLISH);
            LogUtil.a("HwNotificationLiveMgr", "onDataReceived  eventData=", upperCase);
            SharedPreferenceManager.c("NOTIFY_LIVE_LEVEL_VALUE", "NOTIFY_LIVE_LEVEL_VALUE", upperCase);
            Intent intent = new Intent("com.huawei.health.action.ACTION_NOTIFICATION_LEVEL");
            intent.putExtra("action_type", "NOTIFICATION_LEVEL");
            BroadcastManagerUtil.a(BaseApplication.getContext(), intent, LocalBroadcast.f36595c, true);
            nby.a().b();
        }
    }

    public void e(String str) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwNotificationLiveMgr");
        DeviceInfo deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            LogUtil.j("HwNotificationLiveMgr", "isSupportSyncIcon deviceInfo is null");
            return;
        }
        if (!eey.d(deviceInfo, 84)) {
            LogUtil.j("HwNotificationLiveMgr", "sendSampleEventCommand capability is not support.");
            return;
        }
        UniteDevice uniteDeviceD = xjg.d(deviceInfo.getDeviceIdentify());
        cmg cmgVarC = xjf.c(a(str));
        if (cmgVarC == null) {
            LogUtil.j("HwNotificationLiveMgr", "sendEventConfigCommand commandMessage is invalid.");
        } else {
            this.d.sendCommand(uniteDeviceD, cmgVarC);
        }
    }

    private static eee a(String str) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.smartedge");
        eeeVar.setWearPkgName("hw.watch.message.smartedge");
        eeeVar.setCommandId(2);
        eeeVar.a(800100013L);
        eeeVar.a(0);
        eeeVar.e(eeq.c(eeq.a(str)));
        return eeeVar;
    }

    private boolean d() {
        String str;
        return HarmonyBuild.e && (str = HarmonyBuild.f36561a) != null && !str.isEmpty() && str.charAt(0) >= '4' && str.charAt(0) <= '9';
    }
}
