package com.huawei.multisimservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak;
import com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback;
import com.chinatelecom.multisimservice.model.SmartWearServiceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import defpackage.llm;
import defpackage.npz;
import defpackage.xjt;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes40.dex */
public class MultiSimCtccService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOpenMultiSimCalbcak f18077b = null;
    private ISmartWearServiceInfoCallback e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18076a = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.chinatelecom.multisimservice.IServiceBinder.Stub f18078c = new com.chinatelecom.multisimservice.IServiceBinder.Stub() { // from class: com.huawei.multisimservice.MultiSimCtccService.3
        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public IBinder getServiceBinder(String str, String str2) throws RemoteException {
            ReleaseLogUtil.d("DEVMGR_MultiSimCtccService", "getCtccServiceBinder input packageName is:", str, "versionCode is", str2);
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("MultiSimCtccService", "getCtccServiceBinder input packageName error");
                xjt.q("getCtccServiceBinder input packageName error.");
                return null;
            }
            if (llm.c(BaseApplication.getContext(), str)) {
                MultiSimCtccService.this.f18076a = str;
                npz.b().b(str);
                LogUtil.a("MultiSimCtccService", "getCtccServiceBinder return ctccIOpenMultiSimBinder");
                return MultiSimCtccService.this.d;
            }
            ReleaseLogUtil.e("DEVMGR_MultiSimCtccService", "CtccAuthUtils failure with", str);
            xjt.q("CtccAuthUtils failure with" + str);
            return null;
        }

        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public void registCallback(ISmartWearServiceInfoCallback iSmartWearServiceInfoCallback) throws RemoteException {
            ReleaseLogUtil.d("DEVMGR_MultiSimCtccService", "ctccSmartWearServiceInfoCallback register");
            MultiSimCtccService.this.e = iSmartWearServiceInfoCallback;
        }

        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public void unRegistCallback(ISmartWearServiceInfoCallback iSmartWearServiceInfoCallback) throws RemoteException {
            ReleaseLogUtil.d("DEVMGR_MultiSimCtccService", "ctccSmartWearServiceInfoCallback unRegister");
            MultiSimCtccService.this.e = null;
        }

        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public void getSmartWearServiceInfo() throws RemoteException {
            if (MultiSimCtccService.this.e == null) {
                ReleaseLogUtil.d("DEVMGR_MultiSimCtccService", "ctccSmartWearServiceInfoCallback is null");
            } else {
                MultiSimCtccService.this.e.getSmartWearServiceInfo(new SmartWearServiceInfo(MultiSimCtccService.this.getPackageName(), "1.9.4"));
            }
        }
    };
    private final com.chinatelecom.multisimservice.IOpenMultiSim.Stub d = new com.chinatelecom.multisimservice.IOpenMultiSim.Stub() { // from class: com.huawei.multisimservice.MultiSimCtccService.5
        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void registerCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) {
            ReleaseLogUtil.d("DEVMGR_MultiSimCtccService", "ctccOpenMultiSimCallback register:", iOpenMultiSimCalbcak);
            MultiSimCtccService.this.f18077b = iOpenMultiSimCalbcak;
        }

        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void unRegisterCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) {
            ReleaseLogUtil.d("DEVMGR_MultiSimCtccService", "ctccOpenMultiSimCallback unRegister:", iOpenMultiSimCalbcak);
            MultiSimCtccService.this.f18077b = null;
            npz.b().r();
        }

        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void getAttachedDeviceMultiSimInfo() {
            ReleaseLogUtil.d("DEVMGR_MultiSimCtccService", "ctccIOpenMultiSimBinder getAttachedDeviceMultiSimInfo");
            MultiSimCtccService.this.a();
        }

        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void downloadESimProfile(String str) {
            LogUtil.a("MultiSimCtccService", "ctccIOpenMultiSimBinder downloadESimProfile,activationCode is:", str, ",downloadESimProfile with app:", MultiSimCtccService.this.f18076a);
            MultiSimCtccService.this.e();
            npz npzVarB = npz.b();
            npzVarB.b(MultiSimCtccService.this.f18076a);
            if (!npzVarB.c(MultiSimCtccService.this.f18076a)) {
                if (MultiSimCtccService.this.f18077b != null) {
                    ReleaseLogUtil.e("DEVMGR_MultiSimCtccService", "App unauthorized");
                    try {
                        MultiSimCtccService.this.f18077b.getProfileDownloadStatus(0);
                        return;
                    } catch (RemoteException unused) {
                        LogUtil.e("MultiSimCtccService", "downloadESimProfile exception");
                        return;
                    }
                }
                ReleaseLogUtil.e("DEVMGR_MultiSimCtccService", "downloadESimProfile failed ctccOpenMultiSimCallback is null");
                return;
            }
            npzVarB.c(str, 0L, "");
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("endTime", String.valueOf(System.currentTimeMillis()));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_ESIM_MANAGER_60010002.value(), linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("MultiSimCtccService", "getDeviceInfoAndAuth with app:", this.f18076a);
        npz npzVarB = npz.b();
        npzVarB.b(this.f18076a);
        IOpenMultiSimCalbcak iOpenMultiSimCalbcak = this.f18077b;
        if (iOpenMultiSimCalbcak != null) {
            npzVarB.a(iOpenMultiSimCalbcak);
        }
        npzVarB.p();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ReleaseLogUtil.d("DEVMGR_MultiSimCtccService", "onBind ctccBinder");
        return this.f18078c;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        this.f18076a = "";
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d("DEVMGR_MultiSimCtccService", "onDestroy");
    }
}
