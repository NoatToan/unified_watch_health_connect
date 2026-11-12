package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes20.dex */
public class yjs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile yjs f53525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f53526b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentObserver f53527c;
    private ContentObserver d;
    private DataReceiveCallback g;
    private IBaseResponseCallback i;
    private final Uri f = Uri.parse("content://com.android.server.notification.hwNotificationdecisioncenterProvider");
    private final CountDownTimer e = new CountDownTimer(30000, 30000) { // from class: yjs.3
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            synchronized (yjs.f53526b) {
                LogUtil.a("WearEngine_NotificationCoordinationManager", "mCountDownTimer stop");
                yjs.this.f();
                yjs unused = yjs.f53525a = null;
            }
        }
    };

    private yjs() {
        a();
        e();
        ProductMapParseUtil.a(BaseApplication.getContext());
    }

    public static yjs d() {
        if (f53525a == null) {
            synchronized (f53526b) {
                if (f53525a != null) {
                    return f53525a;
                }
                if (c() == null) {
                    LogUtil.e("WearEngine_NotificationCoordinationManager", "getInstance deviceInfo is null");
                    return null;
                }
                LogUtil.a("WearEngine_NotificationCoordinationManager", "getInstance deviceInfo create");
                f53525a = new yjs();
            }
        }
        return f53525a;
    }

    private void a() {
        this.i = new IBaseResponseCallback() { // from class: yjt
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f53531b.c(i, obj);
            }
        };
        this.g = new DataReceiveCallback() { // from class: yju
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public final void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                this.e.a(i, deviceInfo, eecVar);
            }
        };
        Handler handler = null;
        this.d = new ContentObserver(handler) { // from class: yjs.1
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                LogUtil.a("WearEngine_NotificationCoordinationManager", "isAllowNotification onChange.");
                yjs.this.i();
            }
        };
        this.f53527c = new ContentObserver(handler) { // from class: yjs.5
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                LogUtil.a("WearEngine_NotificationCoordinationManager", "AllowPackageList onChange.");
                yjs.this.j();
            }
        };
    }

    /* synthetic */ void c(int i, Object obj) {
        String str;
        LogUtil.a("WearEngine_NotificationCoordinationManager", "mJoinNotificationCollaborationCallback enter.");
        if (i != 0) {
            LogUtil.j("WearEngine_NotificationCoordinationManager", "mNotificationCallback error");
            return;
        }
        if (!(obj instanceof Boolean)) {
            LogUtil.j("WearEngine_NotificationCoordinationManager", "mNotificationCallback objData illegal");
            return;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        DeviceInfo deviceInfoC = c();
        if (deviceInfoC == null) {
            return;
        }
        if (!zBooleanValue) {
            str = "0";
        } else {
            str = "1";
        }
        a(deviceInfoC.getWearEngineDeviceId(), "isAllowNotification", str);
    }

    /* synthetic */ void a(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("WearEngine_NotificationCoordinationManager", "mSampleReceive enter.");
        if (deviceInfo == null || eecVar == null) {
            LogUtil.a("WearEngine_NotificationCoordinationManager", "device or message is null.");
        } else if (eecVar instanceof eef) {
            b((eef) eecVar, deviceInfo.getWearEngineDeviceId());
        }
    }

    private void b(eef eefVar, String str) {
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (configInfoList == null || configInfoList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (eeg eegVar : configInfoList) {
            String strC = c(eegVar.c());
            int iA = a(eeq.e(eegVar.e()));
            arrayList.add(strC);
            arrayList2.add(String.valueOf(iA));
        }
        d(str, arrayList, arrayList2);
    }

    private int a(String str) {
        try {
            List<eew> listE = new eet().b(str).e();
            if (listE != null && listE.size() != 0) {
                return CommonUtil.v(listE.get(0).b());
            }
            LogUtil.j("WearEngine_NotificationCoordinationManager", "tlvList is empty");
            return 0;
        } catch (eeu unused) {
            LogUtil.e("WearEngine_NotificationCoordinationManager", "parseData is error");
            return 0;
        }
    }

    private String c(long j) {
        if (j == 900100013) {
            return "isZenModeOn";
        }
        if (j == 900100014) {
            return "isUsing";
        }
        return "unknown";
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    public void c(String str, DeviceInfo deviceInfo) {
        byte b2;
        LogUtil.a("WearEngine_NotificationCoordinationManager", "handleAction enter");
        if (TextUtils.isEmpty(str) || deviceInfo == null) {
            LogUtil.e("WearEngine_NotificationCoordinationManager", "handleAction action or deviceInfo is null");
            return;
        }
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1152217332) {
            if (iHashCode != -240757920) {
                if (iHashCode == 255854206 && str.equals("com.huawei.wearengine.NotificationCoordination.update")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("com.huawei.wearengine.NotificationCoordination.delete")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("com.huawei.wearengine.NotificationCoordination.add")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            LogUtil.a("WearEngine_NotificationCoordinationManager", "processAction add enter");
            this.e.cancel();
            edc.e().registerDeviceSampleListener("com.huawei.wearengine", this.g);
            e(deviceInfo);
            return;
        }
        if (b2 == 1) {
            LogUtil.a("WearEngine_NotificationCoordinationManager", "processAction delete enter");
            c(deviceInfo.getWearEngineDeviceId());
            h();
        } else {
            if (b2 != 2) {
                return;
            }
            ReleaseLogUtil.d("R_NotificationCoordinationManager", "processAction update enter");
            a(deviceInfo.getWearEngineDeviceId(), "isAvailable", "0");
            h();
        }
    }

    private void h() {
        if (c() == null) {
            LogUtil.a("WearEngine_NotificationCoordinationManager", "release start");
            this.e.cancel();
            this.e.start();
        }
    }

    private static DeviceInfo c() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "WearEngine_NotificationCoordinationManager");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("WearEngine_NotificationCoordinationManager", "getDeviceInfo, deviceInfoList is empty");
            return null;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_NotificationCoordinationManager", "getDeviceInfo, deviceInfo is null");
            return null;
        }
        if (eey.d(deviceInfo, Constants.MAX_PRO_BOTTOM_MARGIN_PAD)) {
            return deviceInfo;
        }
        LogUtil.j("WearEngine_NotificationCoordinationManager", "getDeviceInfo, device is not support");
        return null;
    }

    private void e(DeviceInfo deviceInfo) {
        String strE = ykx.e(deviceInfo);
        LogUtil.a("WearEngine_NotificationCoordinationManager", "deviceType is " + strE);
        b(deviceInfo.getWearEngineDeviceId(), strE);
        j();
        i();
        a(deviceInfo);
    }

    private void a(DeviceInfo deviceInfo) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("com.huawei.wearengine");
        eefVar.setWearPkgName("com.huawei.watch.home");
        eeg eegVar = new eeg();
        eegVar.b(900100013L);
        eegVar.b(1);
        eeg eegVar2 = new eeg();
        eegVar2.b(900100014L);
        eegVar2.b(1);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        arrayList.add(eegVar2);
        eefVar.setConfigInfoList(arrayList);
        edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "WearEngine_NotificationCoordinationManager");
        LogUtil.a("WearEngine_NotificationCoordinationManager", "sendSampleConfigCommand is success!");
    }

    private void e() {
        edc.e().registerDeviceSampleListener("com.huawei.wearengine", this.g);
        BaseApplication.getContext().getContentResolver().registerContentObserver(Uri.parse(lsu.f40768c), false, this.d);
        BaseApplication.getContext().getContentResolver().registerContentObserver(Uri.parse(lsu.j), false, this.f53527c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        edc.e().unRegisterDeviceSampleListener("com.huawei.wearengine");
        BaseApplication.getContext().getContentResolver().unregisterContentObserver(this.d);
        BaseApplication.getContext().getContentResolver().unregisterContentObserver(this.f53527c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        NotificationContentProviderUtil.c(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        List<String> listJ = NotificationContentProviderUtil.j();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listJ.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(listJ.get(i));
        }
        DeviceInfo deviceInfoC = c();
        if (deviceInfoC == null) {
            return;
        }
        a(deviceInfoC.getWearEngineDeviceId(), "allowPackageList", sb.toString());
    }

    private void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("WearEngine_NotificationCoordinationManager", "addDeviceInfo wearEngineId is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("packageName", "com.huawei.health");
        bundle.putString("deviceType", str2);
        bundle.putString("deviceKey", str);
        bundle.putString("isVersionSupport", "1");
        bundle.putString("isLanguageSupport", "1");
        bundle.putString("isZenModeOn", "1");
        bundle.putString("isAvailable", "1");
        bundle.putString("isAllowNotification", "0");
        bundle.putString("isUsing", "0");
        bundle.putString("allowPackageList", "");
        LogUtil.a("WearEngine_NotificationCoordinationManager", "addDeviceInfo deviceId: " + CommonUtil.n(str));
        try {
            BaseApplication.getContext().getContentResolver().call(this.f, "add", (String) null, bundle);
        } catch (Exception unused) {
            LogUtil.e("WearEngine_NotificationCoordinationManager", "addDeviceInfo exception");
        }
    }

    private void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("WearEngine_NotificationCoordinationManager", "updateDeviceInfo wearEngineId is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("packageName", "com.huawei.health");
        bundle.putString("deviceKey", str);
        bundle.putString("updateKeys", str2);
        bundle.putString(str2, str3);
        ReleaseLogUtil.d("R_NotificationCoordinationManager", "updateDeviceInfo deviceId: ", CommonUtil.n(str), ",updateKey: ", str2, ",updateValue: ", str3);
        try {
            BaseApplication.getContext().getContentResolver().call(this.f, "update", (String) null, bundle);
        } catch (Exception unused) {
            LogUtil.e("WearEngine_NotificationCoordinationManager", "updateDeviceInfo exception");
        }
    }

    private void d(String str, List<String> list, List<String> list2) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            LogUtil.e("WearEngine_NotificationCoordinationManager", "updateDeviceInfo wearEngineId or updateKeys is empty");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("packageName", "com.huawei.health");
        bundle.putString("deviceKey", str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(list.get(i));
            bundle.putString(list.get(i), list2.get(i));
            LogUtil.a("WearEngine_NotificationCoordinationManager", "updateDeviceInfo deviceId: " + CommonUtil.n(str) + ",updateKey: " + list.get(i) + ", updateValue: " + list2.get(i));
        }
        bundle.putString("updateKeys", sb.toString());
        try {
            BaseApplication.getContext().getContentResolver().call(this.f, "update", (String) null, bundle);
        } catch (Exception unused) {
            LogUtil.e("WearEngine_NotificationCoordinationManager", "updateDeviceInfo exception");
        }
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("WearEngine_NotificationCoordinationManager", "removeDeviceInfo wearEngineId is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("packageName", "com.huawei.health");
        bundle.putString("deviceKey", str);
        LogUtil.a("WearEngine_NotificationCoordinationManager", "removeDeviceInfo deviceId: " + CommonUtil.n(str));
        try {
            BaseApplication.getContext().getContentResolver().call(this.f, EventType.REMOVE, (String) null, bundle);
        } catch (Exception unused) {
            LogUtil.e("WearEngine_NotificationCoordinationManager", "removeDeviceInfo exception");
        }
    }
}
