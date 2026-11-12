package com.euicc.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.euicc.server.model.EUICCDeviceInfo;
import com.euicc.server.model.IOpenEUICCCalbcak;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.huami.watch.companion.esim.EsimOperationHelper;
import com.huami.watch.companion.esim.EsimOperationHelperFactory;
import com.huami.watch.companion.esim.ui.activity.EsimActivity;
import com.huami.watch.util.Rx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class IRemoteService extends Service {
    private static final String f = "com.sinovatech.unicom.ui";
    private AbsEsimOperation b;
    private IOpenEUICCCalbcak c;
    private final String a = "ESIm_IRemoteService";
    private IBinder d = new a();
    private IBinder e = new b();

    public class a extends IServiceBinder.Stub {
        public a() {
        }

        @Override // com.euicc.server.IServiceBinder
        public IBinder getServiceBinder(String str) {
            if (IRemoteService.f.equals(str)) {
                return IRemoteService.this.e;
            }
            return null;
        }
    }

    public class b extends IOpenEUICC.Stub {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(String str) {
            IRemoteService.this.b.startDownloadProfile(str, EsimOperationHelper.CARRIER_LIANTONG, true);
            int state = IRemoteService.this.b.getResult() != null ? IRemoteService.this.b.getResult().getState() : 1;
            HMLog.i("ESIm_IRemoteService", "downloadESIMProfile state :" + state, new Object[0]);
            if (state == 0) {
                EsimActivity.open(IRemoteService.this.getApplicationContext(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            EUICCDeviceInfo eUICCDeviceInfo = new EUICCDeviceInfo();
            if (IRemoteService.this.b.isConnected(IRemoteService.this)) {
                IRemoteService.this.b.requestSimInfo();
                String info = IRemoteService.this.b.getResult() != null ? IRemoteService.this.b.getResult().getInfo() : "";
                if (TextUtils.isEmpty(info)) {
                    eUICCDeviceInfo.setResultCode(0);
                } else {
                    try {
                        HMLog.i("ESIm_IRemoteService", "mResult.info is " + info, new Object[0]);
                        JSONObject jSONObject = new JSONObject(info);
                        eUICCDeviceInfo.setEID(jSONObject.optString(AbsEsimOperation.KEY_EID));
                        eUICCDeviceInfo.setDeviceIMEI(jSONObject.optString("imei"));
                        eUICCDeviceInfo.setDeviceType(2);
                        eUICCDeviceInfo.setResultCode(1);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        eUICCDeviceInfo.setResultCode(0);
                    }
                }
            } else {
                HMLog.i("ESIm_IRemoteService", "device not connected set result code -2", new Object[0]);
                eUICCDeviceInfo.setResultCode(-2);
            }
            if (IRemoteService.this.c == null) {
                HMLog.w("ESIm_IRemoteService", "getAttachedDeviceEUICCInfo mSimCallback is null", new Object[0]);
                return;
            }
            try {
                IRemoteService.this.c.getDeviceEUICCInfo(eUICCDeviceInfo);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.euicc.server.IOpenEUICC
        public void downloadEUICCProfile(final String str) {
            HMLog.i("ESIm_IRemoteService", "activationCode is " + str, new Object[0]);
            Rx.io(new Runnable() { // from class: com.euicc.server.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(str);
                }
            }).subscribe();
        }

        @Override // com.euicc.server.IOpenEUICC
        public void getAttachedDeviceEUICCInfo() {
            Rx.io(new Runnable() { // from class: com.euicc.server.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e();
                }
            }).subscribe();
        }

        @Override // com.euicc.server.IOpenEUICC
        public void registerCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) {
            IRemoteService.this.c = iOpenEUICCCalbcak;
        }

        @Override // com.euicc.server.IOpenEUICC
        public void unRegisterCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) {
            IRemoteService.this.c = null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.d;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.b = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
    }
}
