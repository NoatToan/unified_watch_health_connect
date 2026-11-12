package com.huawei.multisimservice;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback;
import com.huawei.multisimservice.model.IOpenMultiSimCalbcak;
import com.huawei.multisimservice.model.SimInfo;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.sim.R;
import defpackage.llm;
import defpackage.lsb;
import defpackage.npz;
import defpackage.pxi;
import defpackage.xjt;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes40.dex */
public class MultiSimService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18079a = "";
    private IOpenMultiSimCalbcak j = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAttachedDeviceMultiSimCallback f18080b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IServiceBinder.Stub f18081c = new IServiceBinder.Stub() { // from class: com.huawei.multisimservice.MultiSimService.3
        @Override // com.huawei.multisimservice.IServiceBinder
        public IBinder getServiceBinder(String str) {
            ReleaseLogUtil.d("DEVMGR_MultiSimService", "getServiceBinder input packageName is:", str);
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("MultiSimService", "getServiceBinder input packageName error");
                xjt.q("getServiceBinder input packageName error.");
                return null;
            }
            if (llm.c(BaseApplication.getContext(), str)) {
                MultiSimService.this.f18079a = str;
                npz.b().b(MultiSimService.this.f18079a);
                if ("com.huawei.hwmultisim".equals(str)) {
                    LogUtil.a("MultiSimService", "getServiceBinder return mAttachedDeviceBinder");
                    return MultiSimService.this.e;
                }
                LogUtil.a("MultiSimService", "getServiceBinder return mIOpenMultiSimBinder");
                return MultiSimService.this.d;
            }
            ReleaseLogUtil.e("DEVMGR_MultiSimService", "AuthUtils failure with", str);
            xjt.q("AuthUtils failure with" + str);
            return null;
        }
    };
    private final IAttachedDeviceMultiSim.Stub e = new IAttachedDeviceMultiSim.Stub() { // from class: com.huawei.multisimservice.MultiSimService.5
        @Override // com.huawei.multisimservice.IAttachedDeviceMultiSim
        public void registerCallback(IAttachedDeviceMultiSimCallback iAttachedDeviceMultiSimCallback) {
            ReleaseLogUtil.d("DEVMGR_MultiSimService", "IAttachedDeviceMultiSim registerCallback ");
            MultiSimService.this.f18080b = iAttachedDeviceMultiSimCallback;
        }

        @Override // com.huawei.multisimservice.IAttachedDeviceMultiSim
        public void unRegisterCallback(IAttachedDeviceMultiSimCallback iAttachedDeviceMultiSimCallback) {
            ReleaseLogUtil.d("DEVMGR_MultiSimService", "IAttachedDeviceMultiSim unRegisterCallback ");
            MultiSimService.this.f18080b = null;
            npz.b().e(iAttachedDeviceMultiSimCallback);
        }

        @Override // com.huawei.multisimservice.IAttachedDeviceMultiSim
        public void getAttachedDeviceMultiSimInfo() {
            ReleaseLogUtil.d("DEVMGR_MultiSimService", "IAttachedDeviceMultiSim getAttachedDeviceMultiSimInfo");
            MultiSimService.this.d();
        }

        @Override // com.huawei.multisimservice.IAttachedDeviceMultiSim
        public void downloadESimProfile(String str) {
            MultiSimService.this.c(str);
        }

        @Override // com.huawei.multisimservice.IAttachedDeviceMultiSim
        public void multiSimStatusNotify(int i, String str) {
            ReleaseLogUtil.d("DEVMGR_MultiSimService", "multiSimStatusNotifyRequest multiSimStatus is:", Integer.valueOf(i));
            npz.b().d(i, str);
        }

        @Override // com.huawei.multisimservice.IAttachedDeviceMultiSim
        public void deleteESimProfile(List<SimInfo> list) {
            ReleaseLogUtil.d("DEVMGR_MultiSimService", "IAttachedDeviceMultiSim deleteESimProfile profileInfoList is:", list);
            npz.b().d(list);
        }
    };
    private final IOpenMultiSim.Stub d = new IOpenMultiSim.Stub() { // from class: com.huawei.multisimservice.MultiSimService.2
        @Override // com.huawei.multisimservice.IOpenMultiSim
        public void registerCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) {
            ReleaseLogUtil.d("DEVMGR_MultiSimService", "IAttachedDeviceMultiSim registerCallback");
            MultiSimService.this.j = iOpenMultiSimCalbcak;
        }

        @Override // com.huawei.multisimservice.IOpenMultiSim
        public void unRegisterCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) {
            ReleaseLogUtil.d("DEVMGR_MultiSimService", "IAttachedDeviceMultiSim unRegisterCallback");
            MultiSimService.this.j = null;
            npz.b().b(iOpenMultiSimCalbcak);
        }

        @Override // com.huawei.multisimservice.IOpenMultiSim
        public void getAttachedDeviceMultiSimInfo() {
            ReleaseLogUtil.d("DEVMGR_MultiSimService", "IOpenMultiSim.IAttachedDeviceMultiSim getAttachedDeviceMultiSimInfo");
            pxi.e("activate_button", "online_APP_start");
            MultiSimService.this.d();
        }

        @Override // com.huawei.multisimservice.IOpenMultiSim
        public void downloadEsimProfile(String str, long j, String str2) {
            LogUtil.a("MultiSimService", "downloadEsimProfile activationCode :", str, ", app:", MultiSimService.this.f18079a);
            if (!TextUtils.isEmpty(str2)) {
                MultiSimService.this.e();
                npz npzVarB = npz.b();
                if (npzVarB != null) {
                    npzVarB.b(MultiSimService.this.f18079a);
                    if (npzVarB.c(MultiSimService.this.f18079a)) {
                        npzVarB.c(str, j, str2);
                        return;
                    }
                    return;
                }
                ReleaseLogUtil.e("DEVMGR_MultiSimService", "hwMultiSimManager is null.");
                xjt.q("hwMultiSimManager is null.");
                return;
            }
            ReleaseLogUtil.d("MultiSimService", "sign is empty.");
            xjt.q("sign is empty.");
            downloadESimProfile(str);
        }

        @Override // com.huawei.multisimservice.IOpenMultiSim
        public void downloadESimProfile(String str) {
            LogUtil.a("MultiSimService", "IOpenMultiSim.IAttachedDeviceMultiSim downloadESimProfile,activationCode is:", str, ",downloadESimProfile with app:", MultiSimService.this.f18079a);
            MultiSimService.this.e();
            npz npzVarB = npz.b();
            if (npzVarB != null) {
                npzVarB.b(MultiSimService.this.f18079a);
                if (npzVarB.c(MultiSimService.this.f18079a)) {
                    if (MultiSimService.this.f18079a.equals("com.sinovatech.unicom.ui")) {
                        npzVarB.c(str, 0L, "");
                        return;
                    } else {
                        npzVarB.a(str);
                        return;
                    }
                }
                return;
            }
            ReleaseLogUtil.e("DEVMGR_MultiSimService", "downloadEsimProfile get hwMultiSimManager is null");
            xjt.q("downloadEsimProfile get hwMultiSimManager is null.");
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("endTime", String.valueOf(System.currentTimeMillis()));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_ESIM_MANAGER_60010002.value(), linkedHashMap);
    }

    public MultiSimService() {
        LogUtil.a("MultiSimService", "MultiSimService construct");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LogUtil.a("MultiSimService", "onStartCommand");
        super.onStartCommand(intent, i, i2);
        LogUtil.a("MultiSimService", "onStartCommand notification");
        Notification.Builder builderC = lsb.d().c();
        builderC.setAutoCancel(true);
        builderC.setPriority(0);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setGroup("MultiSimService");
        startForeground(20200608, builderC.build());
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ReleaseLogUtil.d("DEVMGR_MultiSimService", "onBind service");
        return this.f18081c;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        this.f18079a = "";
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        lsb.d().e(20200608);
        ReleaseLogUtil.d("DEVMGR_MultiSimService", "onDestroy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("MultiSimService", "getDeviceInfoAndAuth with app:", this.f18079a);
        npz npzVarB = npz.b();
        if (npzVarB == null) {
            ReleaseLogUtil.e("DEVMGR_MultiSimService", "getDeviceInfoAndAuth get hwMultiSimManager is null");
            xjt.q("getDeviceInfoAndAuth get hwMultiSimManager is null.");
            return;
        }
        npzVarB.b(this.f18079a);
        IAttachedDeviceMultiSimCallback iAttachedDeviceMultiSimCallback = this.f18080b;
        if (iAttachedDeviceMultiSimCallback != null) {
            npzVarB.c(iAttachedDeviceMultiSimCallback);
        } else {
            IOpenMultiSimCalbcak iOpenMultiSimCalbcak = this.j;
            if (iOpenMultiSimCalbcak != null) {
                npzVarB.d(iOpenMultiSimCalbcak);
            } else {
                LogUtil.j("MultiSimService", "getDeviceInfoAndAuth default.");
            }
        }
        npzVarB.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        LogUtil.a("MultiSimService", "IAttachedDeviceMultiSim downloadESimProfile activationCode is:", str, ",downloadESimProfile with app:", this.f18079a);
        npz npzVarB = npz.b();
        npzVarB.b(this.f18079a);
        if (npzVarB.c(this.f18079a) || "com.huawei.hwmultisim".equals(this.f18079a)) {
            npzVarB.a(str);
        }
    }
}
