package com.cmcc.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.cmcc.server.model.IOpenMultiSimCallback;
import com.cmcc.server.model.MultiSimDeviceInfo;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.huami.watch.companion.esim.EsimOperationHelper;
import com.huami.watch.companion.esim.EsimOperationHelperFactory;
import com.huami.watch.companion.esim.ui.activity.EsimActivity;
import com.huami.watch.util.Rx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ICMCCRemoteService extends Service {
    private static final String f = "com.cmcc.numberportable";
    private static final String g = "com.greenpoint.android.mc10086.activity";
    private static final String h = "com.cmic.heduohao";
    private AbsEsimOperation b;
    private IOpenMultiSimCallback c;
    private final String a = "ESim_ICMCCRemoteService";
    private IBinder d = new a();
    private IBinder e = new b();

    public class a extends IOpenMultiSim.Stub {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(String str) {
            ICMCCRemoteService.this.b.startDownloadProfile(str, EsimOperationHelper.CARRIER_YIDONG, true);
            int state = ICMCCRemoteService.this.b.getResult() != null ? ICMCCRemoteService.this.b.getResult().getState() : 1;
            HMLog.i("ESim_ICMCCRemoteService", "downloadEsimProfile state :" + state, new Object[0]);
            if (ICMCCRemoteService.this.c != null) {
                try {
                    ICMCCRemoteService.this.c.getProfileDownloadStatus(state);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                HMLog.w("ESim_ICMCCRemoteService", "downloadEsimProfile mSimCallback is null" + state, new Object[0]);
            }
            if (state == 0) {
                EsimActivity.open(ICMCCRemoteService.this.getApplicationContext(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            MultiSimDeviceInfo multiSimDeviceInfo = new MultiSimDeviceInfo();
            if (ICMCCRemoteService.this.b.isConnected(ICMCCRemoteService.this)) {
                ICMCCRemoteService.this.b.requestSimInfo();
                String info = ICMCCRemoteService.this.b.getResult() != null ? ICMCCRemoteService.this.b.getResult().getInfo() : "";
                if (TextUtils.isEmpty(info)) {
                    multiSimDeviceInfo.setResultCode(0);
                } else {
                    try {
                        HMLog.i("ESim_ICMCCRemoteService", "cmcc mResult.info is " + info, new Object[0]);
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
                HMLog.i("ESim_ICMCCRemoteService", "device not connected set result code -2", new Object[0]);
                multiSimDeviceInfo.setResultCode(-2);
            }
            if (ICMCCRemoteService.this.c == null) {
                HMLog.i("ESim_ICMCCRemoteService", "cmcc getAttachedDeviceMultiSimInfo mSimCallback is null", new Object[0]);
                return;
            }
            try {
                ICMCCRemoteService.this.c.getDeviceMultiSimInfo(multiSimDeviceInfo);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void downloadEsimProfile(final String str) {
            HMLog.i("ESim_ICMCCRemoteService", "cmcc origin activationCode is " + str, new Object[0]);
            Rx.io(new Runnable() { // from class: com.cmcc.server.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(str);
                }
            }).subscribe();
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void getAttachedDeviceMultiSimInfo() {
            Rx.io(new Runnable() { // from class: com.cmcc.server.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e();
                }
            }).subscribe();
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void registerCallback(IOpenMultiSimCallback iOpenMultiSimCallback) {
            ICMCCRemoteService.this.c = iOpenMultiSimCallback;
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void unRegisterCallback(IOpenMultiSimCallback iOpenMultiSimCallback) {
            ICMCCRemoteService.this.c = null;
        }
    }

    public class b extends IServiceBinder.Stub {
        public b() {
        }

        @Override // com.cmcc.server.IServiceBinder
        public IBinder getServiceBinder(String str) {
            HMLog.i("ESim_ICMCCRemoteService", "packageName is " + str, new Object[0]);
            if (ICMCCRemoteService.h.equals(str) || ICMCCRemoteService.f.equals(str) || ICMCCRemoteService.g.equals(str)) {
                return ICMCCRemoteService.this.d;
            }
            return null;
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
        this.b = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
    }
}
