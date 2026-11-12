package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.hwhealthlinkage.wearsdk.CallbackService;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f34142a = new byte[1];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f34143c = new byte[1];
    private static Context d;
    private static volatile fks e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CallbackService f34144b;
    private CallbackService.MyBinder j;
    private List<IBaseResponseCallback> i = new ArrayList(10);
    private List<IBaseResponseCallback> f = new ArrayList(10);
    private IBaseResponseCallback h = new IBaseResponseCallback() { // from class: fks.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "onResponse notified");
            fks fksVar = fks.this;
            fksVar.b((List<IBaseResponseCallback>) fksVar.f);
            LogUtil.a("HWhealthLinkage_WearSDK", "after registerBinderListenerCallbackList notified");
            fks fksVar2 = fks.this;
            fksVar2.b((List<IBaseResponseCallback>) fksVar2.i);
        }
    };
    private ServiceConnection g = new ServiceConnection() { // from class: fks.4
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    fks.this.f34144b = ((CallbackService.MyBinder) iBinder).getCallbackService();
                    fks.this.j = (CallbackService.MyBinder) iBinder;
                    fks.this.j.setRemoteServerListener(fks.this.h);
                    ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "onServiceConnected notified");
                    fks fksVar = fks.this;
                    fksVar.b((List<IBaseResponseCallback>) fksVar.i);
                    if (fks.this.f34144b != null) {
                        lug.a(fks.this.f34144b.getLinkageBinder());
                        fks.this.k();
                    } else {
                        fks.this.n();
                    }
                } catch (ClassCastException e2) {
                    ReleaseLogUtil.a("HWhealthLinkage_WearSDK", LogAnonymous.b(e2));
                }
                ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "localServiceCallbackConnection has been connected!");
                return;
            }
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "onServiceConnected service is null");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ReleaseLogUtil.a("HWhealthLinkage_WearSDK", "Service has unexpectedly disconnected");
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "unBindCallbackService!!!");
        HandlerExecutor.c(new Runnable() { // from class: fkv
            @Override // java.lang.Runnable
            public final void run() {
                this.f34149c.l();
            }
        }, 2000L);
    }

    /* synthetic */ void l() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fkr
            @Override // java.lang.Runnable
            public final void run() {
                this.f34141c.o();
            }
        });
    }

    public void o() {
        try {
            ServiceConnection serviceConnection = this.g;
            if (serviceConnection != null) {
                d.unbindService(serviceConnection);
                ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "unbindService");
            }
        } catch (IllegalArgumentException unused) {
            ReleaseLogUtil.a("HWhealthLinkage_WearSDK", "unBindService is error");
        }
    }

    public void k(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "registerServiceConnectedListener");
        if (this.f34144b != null && iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100000, "success");
        }
        if (this.i.contains(iBaseResponseCallback)) {
            return;
        }
        this.i.add(iBaseResponseCallback);
    }

    public void q(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "unregisterServiceConnectedListener");
        if (this.i.contains(iBaseResponseCallback)) {
            this.i.remove(iBaseResponseCallback);
        }
    }

    public void g(IBaseResponseCallback iBaseResponseCallback) {
        if (this.f.contains(iBaseResponseCallback)) {
            return;
        }
        this.f.add(iBaseResponseCallback);
    }

    public static fks d() {
        if (e == null) {
            synchronized (f34142a) {
                if (e == null) {
                    d = BaseApplication.getContext();
                    e = new fks();
                }
            }
        }
        return e;
    }

    private fks() {
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Intent intent = new Intent("local.proxy");
        intent.setClass(d, CallbackService.class);
        intent.setPackage("com.huawei.health");
        intent.putExtra("from_flag", "WearSDK" + hashCode());
        d.bindService(intent, this.g, 1);
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.requestWearTask("getOperator", null, iBaseResponseCallback);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        }
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        if (this.f34144b != null) {
            if (eej.c() == null) {
                ReleaseLogUtil.e("HWhealthLinkage_WearSDK", "CapabilityUtils.getDeviceCapability() == null");
                iBaseResponseCallback.a(-3, "");
                return;
            }
            boolean zIsSupportWorkoutCapabilicy = eej.c().isSupportWorkoutCapabilicy();
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "isSupport = ", Boolean.valueOf(zIsSupportWorkoutCapabilicy));
            if (zIsSupportWorkoutCapabilicy) {
                LogUtil.a("HWhealthLinkage_WearSDK", "getDeviceStepRateAlgorithmEnterprise requestWearTask");
                this.f34144b.requestWearTask("getWorkoutCapability", null, iBaseResponseCallback);
                return;
            } else {
                LogUtil.a("HWhealthLinkage_WearSDK", "!isSupportWorkoutCapabilicy");
                iBaseResponseCallback.a(-3, "false");
                return;
            }
        }
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackService is null");
        iBaseResponseCallback.a(201000, "");
    }

    public void j(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "setOperator parameters is null");
        } else if (this.f34144b != null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "setOperator callbackservice is not null");
            this.f34144b.requestWearTask("setOperator", jSONObject.toString(), iBaseResponseCallback);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "setOperator callbackservice is null");
        }
    }

    public void c(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "setHeartRateReportStatus parameters is null");
            return;
        }
        CallbackService callbackService = this.f34144b;
        if (callbackService == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        } else {
            callbackService.requestWearTask("setHeartRateReportStatus", jSONObject.toString(), iBaseResponseCallback);
            this.f34144b.registerNotification("notificationHeartRateInfo", iBaseResponseCallback);
        }
    }

    public void e(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "openOrCloseReport parameters is null");
            xjt.v("openOrCloseReport parameters is null");
            return;
        }
        CallbackService callbackService = this.f34144b;
        if (callbackService == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "openOrCloseReport callbackservice is null");
        } else {
            callbackService.requestWearTask("openOrCloseReport", jSONObject.toString(), iBaseResponseCallback);
            this.f34144b.registerNotification("registerGetRTSportDataListCallbackList", iBaseResponseCallback);
        }
    }

    public void b(int i, IBaseResponseCallback iBaseResponseCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operator_type", i);
            CallbackService callbackService = this.f34144b;
            if (callbackService != null) {
                callbackService.requestWearTask("openOrCloseReport", jSONObject.toString(), iBaseResponseCallback);
            } else {
                ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "openOrCloseReport callbackservice is null");
            }
        } catch (JSONException e2) {
            ReleaseLogUtil.e("HWhealthLinkage_", "openAllDataReport JSONException = ", e2.getMessage());
        }
    }

    public void a(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "setAw70LinkReportStatus enter");
        if (jSONObject == null || iBaseResponseCallback == null) {
            ReleaseLogUtil.e("HWhealthLinkage_WearSDK", "setAw70LinkReportStatus parameters is null");
            return;
        }
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.requestWearTask("setAw70LinkReportStatus", jSONObject.toString(), iBaseResponseCallback);
            this.f34144b.registerNotification("notificationAw70LinkInfo", iBaseResponseCallback);
        } else {
            ReleaseLogUtil.e("HWhealthLinkage_WearSDK", "setAw70LinkReportStatus callbackservice is null");
        }
    }

    public void j(IBaseResponseCallback iBaseResponseCallback) {
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.registerNotification("notificationStateConnectionStateChanged", iBaseResponseCallback);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackService is null!!!");
        }
    }

    public void i(IBaseResponseCallback iBaseResponseCallback) {
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.registerNotification("notificationStatus", iBaseResponseCallback);
        } else {
            ReleaseLogUtil.e("HWhealthLinkage_WearSDK", "callbackservice is null");
        }
    }

    public void m(IBaseResponseCallback iBaseResponseCallback) {
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.registerNotification("notificationSportReminder", iBaseResponseCallback);
        }
    }

    public List<DeviceInfo> c() {
        CallbackService.MyBinder myBinder = this.j;
        List<com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo> usedDeviceList = myBinder != null ? myBinder.getUsedDeviceList() : null;
        ArrayList arrayList = new ArrayList(10);
        if (usedDeviceList == null || usedDeviceList.size() <= 0) {
            return null;
        }
        for (com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo deviceInfo : usedDeviceList) {
            if (deviceInfo != null) {
                arrayList.add(deviceInfo.convertToCommonDevice());
            }
        }
        return arrayList;
    }

    public List<DeviceInfo> h() {
        CallbackService.MyBinder myBinder = this.j;
        List<com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo> usedDeviceListInHealth = myBinder != null ? myBinder.getUsedDeviceListInHealth() : null;
        ArrayList arrayList = new ArrayList(10);
        if (usedDeviceListInHealth == null || usedDeviceListInHealth.size() <= 0) {
            return null;
        }
        for (com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo deviceInfo : usedDeviceListInHealth) {
            if (deviceInfo != null) {
                arrayList.add(deviceInfo.convertToCommonDevice());
            }
        }
        return arrayList;
    }

    public List<DeviceInfo> f() {
        CallbackService.MyBinder myBinder = this.j;
        List<com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo> usedDeviceListInWear = myBinder != null ? myBinder.getUsedDeviceListInWear() : null;
        ArrayList arrayList = new ArrayList(10);
        if (usedDeviceListInWear == null || usedDeviceListInWear.size() <= 0) {
            return null;
        }
        for (com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo deviceInfo : usedDeviceListInWear) {
            if (deviceInfo != null) {
                arrayList.add(deviceInfo.convertToCommonDevice());
            }
        }
        return arrayList;
    }

    public List<DeviceInfo> g() {
        CallbackService.MyBinder myBinder = this.j;
        List<com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo> wearDeviceList = myBinder != null ? myBinder.getWearDeviceList() : null;
        ArrayList arrayList = new ArrayList(10);
        if (wearDeviceList == null || wearDeviceList.size() <= 0) {
            return null;
        }
        for (com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo deviceInfo : wearDeviceList) {
            if (deviceInfo != null) {
                arrayList.add(deviceInfo.convertToCommonDevice());
            }
        }
        LogUtil.a("HWhealthLinkage_WearSDK", "getWearDeviceList is size:" + arrayList.size());
        return arrayList;
    }

    public DeviceInfo a() {
        synchronized (f34143c) {
            if (this.j == null) {
                return null;
            }
            List<DeviceInfo> listC = c();
            if (listC != null) {
                LogUtil.a("HWhealthLinkage_WearSDK", "getCurrentDeviceInfo() deviceInfoList.size() = " + listC.size());
                DeviceInfo deviceInfoA = a(listC);
                if (deviceInfoA != null) {
                    return deviceInfoA;
                }
                ReleaseLogUtil.a("HWhealthLinkage_WearSDK", "getCurrentDeviceInfo() deviceInfo's ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE");
                return null;
            }
            ReleaseLogUtil.a("HWhealthLinkage_WearSDK", "getCurrentDeviceInfo() deviceInfoList is null");
            return null;
        }
    }

    private DeviceInfo a(List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null) {
                if (deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getDeviceConnectState() == 2) {
                    return deviceInfo;
                }
            } else {
                ReleaseLogUtil.a("HWhealthLinkage_WearSDK", "deviceInfo is null");
            }
        }
        return null;
    }

    public DeviceInfo b(boolean z) {
        List<DeviceInfo> listH;
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "getCurrentDeviceInfo isWear:" + z);
        synchronized (f34143c) {
            if (this.j == null) {
                return null;
            }
            if (z) {
                listH = f();
            } else {
                listH = h();
            }
            if (listH != null) {
                LogUtil.a("HWhealthLinkage_WearSDK", "getCurrentDeviceInfo() deviceInfoList.size() = " + listH.size());
                DeviceInfo deviceInfoA = a(listH);
                if (deviceInfoA != null) {
                    return deviceInfoA;
                }
                ReleaseLogUtil.a("HWhealthLinkage_WearSDK", "getCurrentDeviceInfo() deviceInfo's ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE");
                return null;
            }
            ReleaseLogUtil.a("HWhealthLinkage_WearSDK", "getCurrentDeviceInfo() deviceInfoList is null");
            return null;
        }
    }

    public void a(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (this.f34144b != null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "sendHealthDataTohealth jsonString:" + str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("jsonString", str);
            } catch (JSONException unused) {
                ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackService JSONException");
            }
            this.f34144b.requestWearTask("sendHealthDataTohealth", jSONObject.toString(), iBaseResponseCallback);
            return;
        }
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackService is null!!!");
    }

    public void b(String str, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "unbindAllDevice ");
        if (this.f34144b != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("typeList", str);
            } catch (JSONException unused) {
                ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackService JSONException");
            }
            this.f34144b.requestWearTask("unbindDevicesByTypes", jSONObject.toString(), iBaseResponseCallback);
            return;
        }
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackService is null!!!");
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "Enter getMessageCenterFromWear ");
        if (this.f34144b != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("commandType", 1);
            } catch (JSONException unused) {
                ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackService JSONException");
            }
            this.f34144b.requestWearTask("getWearData", jSONObject.toString(), iBaseResponseCallback);
            return;
        }
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackService is null!!!");
    }

    public void e(String str, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "Enter getMessageCenterFromWear ");
        if (this.f34144b != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("commandType", 3);
                jSONObject.put("leomac", str);
            } catch (JSONException unused) {
                ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackService JSONException");
            }
            this.f34144b.requestWearTask("getWearData", jSONObject.toString(), iBaseResponseCallback);
            return;
        }
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackService is null!!!");
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "Enter getDeviceListFromWear");
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.requestWearTask("getDeviceList", null, iBaseResponseCallback);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackService is null!!!");
        }
    }

    public JSONObject b() {
        CallbackService.MyBinder myBinder = this.j;
        if (myBinder != null) {
            return myBinder.getDeviceCapability();
        }
        return null;
    }

    public DeviceCapability i() {
        CallbackService.MyBinder myBinder = this.j;
        if (myBinder != null) {
            return myBinder.getWearDeviceCapability();
        }
        return null;
    }

    public List<DeviceCapability> e() {
        CallbackService.MyBinder myBinder = this.j;
        if (myBinder != null) {
            return myBinder.getHealthDeviceCapability();
        }
        return null;
    }

    public boolean m() {
        CallbackService.MyBinder myBinder = this.j;
        DeviceCapability wearDeviceCapability = myBinder != null ? myBinder.getWearDeviceCapability() : null;
        if (wearDeviceCapability != null) {
            return wearDeviceCapability.isSupportHeartRateInfo();
        }
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "isWearDeviceSupportHeart deviceCapability is null");
        return false;
    }

    public boolean j() {
        CallbackService.MyBinder myBinder = this.j;
        List<DeviceCapability> healthDeviceCapability = myBinder != null ? myBinder.getHealthDeviceCapability() : null;
        boolean zIsSupportHeartRateInfo = false;
        if (healthDeviceCapability != null) {
            Iterator<DeviceCapability> it = healthDeviceCapability.iterator();
            while (it.hasNext() && !(zIsSupportHeartRateInfo = it.next().isSupportHeartRateInfo())) {
            }
            return zIsSupportHeartRateInfo;
        }
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "isHealthDeviceSupportHeart deviceCapability is null");
        return false;
    }

    public void f(IBaseResponseCallback iBaseResponseCallback) {
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.requestWearTask("getRunPlanParameter", null, iBaseResponseCallback);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        }
    }

    public void i(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "setRunPlan parameters is null");
            return;
        }
        CallbackService callbackService = this.f34144b;
        if (callbackService == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        } else {
            callbackService.requestWearTask("setRunPlan", jSONObject.toString(), iBaseResponseCallback);
        }
    }

    public void h(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "setRunPlanReminderSwitch parameters is null");
            return;
        }
        CallbackService callbackService = this.f34144b;
        if (callbackService == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        } else {
            callbackService.requestWearTask("setRunPlanReminderSwitch", jSONObject.toString(), iBaseResponseCallback);
        }
    }

    public void d(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "deliverRealTimeSportData parameters is null");
            return;
        }
        CallbackService callbackService = this.f34144b;
        if (callbackService == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        } else {
            callbackService.requestWearTask("workoutOperateRealtimeData", jSONObject.toString(), iBaseResponseCallback);
        }
    }

    public void r(IBaseResponseCallback iBaseResponseCallback) {
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.requestWearTask("syncFitnessDetailData", null, iBaseResponseCallback);
            return;
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100001, null);
        }
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
    }

    public void n(IBaseResponseCallback iBaseResponseCallback) {
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.registerNotification("registerNotificationRunPlanRecordInfoCallbackList", iBaseResponseCallback);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        }
    }

    public void o(IBaseResponseCallback iBaseResponseCallback) {
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.registerNotification("notificationGetWorkoutRecordStatistic", iBaseResponseCallback);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        }
    }

    public void l(IBaseResponseCallback iBaseResponseCallback) {
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.registerNotification("notificationWorkoutRecordSpeechPlay", iBaseResponseCallback);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        }
    }

    public void h(IBaseResponseCallback iBaseResponseCallback) {
        if (this.f34144b != null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "registerNotificationPress ---");
            this.f34144b.registerNotification("registerNotificationPressCallBack", iBaseResponseCallback);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        }
    }

    public void p(IBaseResponseCallback iBaseResponseCallback) {
        if (this.f34144b != null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "unRegisterNotificationPress ---");
            this.f34144b.unRegisterNotification("registerNotificationPressCallBack", iBaseResponseCallback);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        }
    }

    public void b(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "notifyVoicePlayStatus object is null");
            return;
        }
        CallbackService callbackService = this.f34144b;
        if (callbackService == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        } else {
            callbackService.requestWearTask("notificationWorkoutRecordSpeechPlayReportStatus", jSONObject.toString(), iBaseResponseCallback);
        }
    }

    public void g(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "setNotificationStatusResponse parameters is null");
            return;
        }
        CallbackService callbackService = this.f34144b;
        if (callbackService == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        } else {
            callbackService.requestWearTask("setNotificationStatusResponse", jSONObject.toString(), iBaseResponseCallback);
        }
    }

    public void f(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "setMetricUnit parameters is null");
            return;
        }
        CallbackService callbackService = this.f34144b;
        if (callbackService == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        } else {
            callbackService.requestWearTask("setMetricUnit", jSONObject.toString(), iBaseResponseCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<IBaseResponseCallback> list) {
        if (list.isEmpty() || this.f34144b == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LogUtil.a("HWhealthLinkage_WearSDK", "notify notifyAllListener~~~~" + list.get(i));
            list.get(i).a(100000, "success");
        }
    }

    public void n(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "setStressMeasureStatus()");
        if (jSONObject == null) {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "setStressMeasureStatus parameters is null");
            return;
        }
        CallbackService callbackService = this.f34144b;
        if (callbackService != null) {
            callbackService.requestWearTask("setStressReportStatus", jSONObject.toString(), iBaseResponseCallback);
            this.f34144b.registerNotification("notificationStressInfo", iBaseResponseCallback);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "callbackservice is null");
        }
    }

    public void a(String str) {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "Enter removeFunctionCallback()");
        CallbackService.MyBinder myBinder = this.j;
        if (myBinder != null) {
            myBinder.removeFunctionCallback(str);
        } else {
            ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "localBinder is null");
        }
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "getWorkoutBitmap enter.");
        CallbackService callbackService = this.f34144b;
        if (callbackService != null && iBaseResponseCallback != null) {
            callbackService.requestWearTask("getAw70SupportSportType", null, iBaseResponseCallback);
        } else {
            ReleaseLogUtil.e("HWhealthLinkage_WearSDK", "getWorkoutBitmap service is null");
        }
    }

    public void d(IBaseResponseCallback iBaseResponseCallback, String str) {
        ReleaseLogUtil.d("HWhealthLinkage_WearSDK", "sendEcgBlackList enter.");
        if (this.f34144b != null && iBaseResponseCallback != null) {
            if (TextUtils.isEmpty(str)) {
                ReleaseLogUtil.e("HWhealthLinkage_WearSDK", "json is empty.");
                iBaseResponseCallback.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "");
                return;
            } else {
                this.f34144b.requestWearTask("sendEcgBlockList", str, iBaseResponseCallback);
                return;
            }
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(-1, "");
        }
        ReleaseLogUtil.e("HWhealthLinkage_WearSDK", "getWorkoutBitmap service is null");
    }
}
