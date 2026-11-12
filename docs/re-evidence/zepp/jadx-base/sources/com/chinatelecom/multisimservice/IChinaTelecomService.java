package com.chinatelecom.multisimservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak;
import com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback;
import com.chinatelecom.multisimservice.model.MultiSimDeviceInfo;
import com.chinatelecom.multisimservice.model.SmartWearServiceInfo;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.huami.watch.companion.esim.EsimOperationHelper;
import com.huami.watch.companion.esim.EsimOperationHelperFactory;
import com.huami.watch.companion.esim.ui.activity.EsimActivity;
import com.huami.watch.util.Rx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class IChinaTelecomService extends Service {
    private static final String g = "com.ct.client";
    private IOpenMultiSimCalbcak b;
    private ISmartWearServiceInfoCallback c;
    private AbsEsimOperation d;
    private final String a = "ESim_IChinaTelecomService";
    public IBinder e = new a();
    public IBinder f = new b();

    public class a extends IServiceBinder.Stub {
        public a() {
        }

        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public IBinder getServiceBinder(String str, String str2) {
            String nameForUid = IChinaTelecomService.this.getPackageManager().getNameForUid(Binder.getCallingUid());
            HMLog.i("ESim_IChinaTelecomService", "callingApp is " + nameForUid, new Object[0]);
            if (IChinaTelecomService.g.equals(nameForUid)) {
                return IChinaTelecomService.this.f;
            }
            return null;
        }

        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public void getSmartWearServiceInfo() throws RemoteException {
            if (IChinaTelecomService.this.c != null) {
                SmartWearServiceInfo smartWearServiceInfo = new SmartWearServiceInfo();
                smartWearServiceInfo.setPackageName("com.huami.watch.hmwatchmanager");
                smartWearServiceInfo.setVersionName("1.0");
                IChinaTelecomService.this.c.getSmartWearServiceInfo(smartWearServiceInfo);
            }
        }

        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public void registCallback(ISmartWearServiceInfoCallback iSmartWearServiceInfoCallback) {
            IChinaTelecomService.this.c = iSmartWearServiceInfoCallback;
        }

        @Override // com.chinatelecom.multisimservice.IServiceBinder
        public void unRegistCallback(ISmartWearServiceInfoCallback iSmartWearServiceInfoCallback) {
            IChinaTelecomService.this.c = null;
        }
    }

    public class b extends IOpenMultiSim.Stub {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(String str) {
            IChinaTelecomService.this.d.startDownloadProfile(str, EsimOperationHelper.CARRIER_DIANXIN, true);
            int state = IChinaTelecomService.this.d.getResult() != null ? IChinaTelecomService.this.d.getResult().getState() : 1;
            HMLog.i("ESim_IChinaTelecomService", "downloadEsimProfile state :" + state, new Object[0]);
            if (IChinaTelecomService.this.b != null) {
                try {
                    if (state == 0) {
                        IChinaTelecomService.this.b.getProfileDownloadStatus(1);
                    } else {
                        IChinaTelecomService.this.b.getProfileDownloadStatus(0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                HMLog.w("ESim_IChinaTelecomService", "downloadESimProfile mSimCallback is null", new Object[0]);
            }
            if (state == 0) {
                EsimActivity.open(IChinaTelecomService.this.getApplicationContext(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            MultiSimDeviceInfo multiSimDeviceInfo = new MultiSimDeviceInfo();
            if (IChinaTelecomService.this.d.isConnected(IChinaTelecomService.this)) {
                IChinaTelecomService.this.d.requestSimInfo();
                String info = IChinaTelecomService.this.d.getResult() != null ? IChinaTelecomService.this.d.getResult().getInfo() : "";
                multiSimDeviceInfo.setDeviceType(2);
                if (TextUtils.isEmpty(info)) {
                    multiSimDeviceInfo.setResultCode(0);
                } else {
                    try {
                        HMLog.i("ESim_IChinaTelecomService", "mResult.info is " + info, new Object[0]);
                        JSONObject jSONObject = new JSONObject(info);
                        multiSimDeviceInfo.setEID(jSONObject.optString(AbsEsimOperation.KEY_EID));
                        multiSimDeviceInfo.setDeviceIMEI(jSONObject.optString("imei"));
                        multiSimDeviceInfo.setResultCode(1);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        multiSimDeviceInfo.setResultCode(0);
                    }
                }
            } else {
                HMLog.i("ESim_IChinaTelecomService", "device not connect set result code -2", new Object[0]);
                multiSimDeviceInfo.setResultCode(-2);
            }
            if (IChinaTelecomService.this.b == null) {
                HMLog.w("ESim_IChinaTelecomService", "getAttachedDeviceMultiSimInfo mSimCallback is null", new Object[0]);
                return;
            }
            try {
                IChinaTelecomService.this.b.getDeviceMultiSimInfo(multiSimDeviceInfo);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void downloadESimProfile(final String str) {
            Rx.io(new Runnable() { // from class: com.chinatelecom.multisimservice.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(str);
                }
            }).subscribe();
        }

        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void getAttachedDeviceMultiSimInfo() {
            Rx.io(new Runnable() { // from class: com.chinatelecom.multisimservice.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e();
                }
            }).subscribe();
        }

        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void registerCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) {
            HMLog.i("ESim_IChinaTelecomService", "telecom registerCallback", new Object[0]);
            IChinaTelecomService.this.b = iOpenMultiSimCalbcak;
        }

        @Override // com.chinatelecom.multisimservice.IOpenMultiSim
        public void unRegisterCallback(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) {
            HMLog.i("ESim_IChinaTelecomService", "telecom unRegisterCallback", new Object[0]);
            IChinaTelecomService.this.b = null;
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.e;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.d = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
    }
}
