package com.huawei.hwcloudmodel.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.up.utils.NSPException;
import defpackage.lqr;
import defpackage.niz;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class NspClient extends AbsNspClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f17208a = null;
    private static boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LoginInit f17209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f17210c;

    public NspClient(Context context) {
        this.f17210c = null;
        this.f17209b = null;
        if (context == null) {
            LogUtil.j("UIME_NspClient", "Nsplient context is null");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f17210c = applicationContext;
        if (this.f17209b == null) {
            this.f17209b = LoginInit.getInstance(applicationContext);
        }
        if (f17208a == null) {
            f17208a = new a();
            b();
            a();
        }
    }

    @Override // com.huawei.hwcloudmodel.utils.AbsNspClient
    protected lqr callService(String str, Map<String, Object> map, int i, int i2, int i3) throws NSPException {
        return callService(str, map, i, i2, i3, 1);
    }

    @Override // com.huawei.hwcloudmodel.utils.AbsNspClient
    protected lqr callService(String str, Map<String, Object> map, int i, int i2, int i3, int i4) throws NSPException {
        String json;
        String url;
        LogUtil.a("UIME_NspClient", "callService enter urlType=", Integer.valueOf(i4));
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UIME_NspClient", "callService Service isEmpty");
            throw new NSPException(1, "Service name is empty.");
        }
        c(str, map, map2);
        Gson gson = new Gson();
        try {
            json = gson.toJson(map2);
            try {
                if (json.length() < 1024) {
                    LogUtil.d("UIME_NspClient", "callService data = ", json, "length of json more than 1024");
                } else {
                    LogUtil.d("UIME_NspClient", "callService data = ", json.substring(0, 1023), "length of json less than 1024");
                }
            } catch (Exception unused) {
                LogUtil.j("UIME_NspClient", "callService exception");
            }
        } catch (Exception unused2) {
            json = null;
        }
        String str2 = json;
        StringBuffer stringBuffer = new StringBuffer();
        if (i4 == 2) {
            url = e();
        } else if (str.equals("/dataRecommend/common/updateCommentRemainderTimes") || str.equals("/dataRecommend/common/getCommentRemainderTimes")) {
            url = GRSManager.c(this.f17210c).getUrl("healthRecommendUrl");
        } else if (str.equals("hiHealth/getThirdIdentify")) {
            url = GRSManager.c(this.f17210c).getUrl("domainHealthcommonHicloud") + "/commonAbility/";
        } else {
            if (!Utils.h()) {
                LogUtil.j("UIME_NspClient", "callService fetch HEALTH_CLOUD from no_cloud user; service:", str, " type:", Integer.valueOf(i3));
                throw new NSPException(2, "NspClient request HEALTH_CLOUD in no-cloud country");
            }
            url = GRSManager.c(this.f17210c).getUrl("healthCloudUrl");
        }
        stringBuffer.append(url);
        stringBuffer.append(str);
        String string = stringBuffer.toString();
        LogUtil.d("UIME_NspClient", "callService apiURL=", string);
        lqr lqrVarRequest = request(this.f17210c, string, str2, i, i2, i3);
        if (lqrVarRequest == null) {
            LogUtil.j("UIME_NspClient", "callService response=null");
            throw new NSPException(1, "Server No Response");
        }
        LogUtil.a("UIME_NspClient", "callService response=[status:", Integer.valueOf(lqrVarRequest.b()), ", code:", Integer.valueOf(lqrVarRequest.d()), "]");
        a(lqrVarRequest, gson);
        return lqrVarRequest;
    }

    private void c(String str, Map<String, Object> map, Map<String, Object> map2) throws NSPException {
        a(map2);
        boolean zO = Utils.o();
        LogUtil.a("UIME_NspClient", "callService isOverSea =", Boolean.valueOf(zO));
        if (zO) {
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009);
            map2.put("siteId", accountInfo);
            LogUtil.a("UIME_NspClient", "callService getSiteId=", accountInfo);
        }
        map2.put("deviceType", String.valueOf(CommonUtil.h(this.f17210c)));
        String deviceType = LoginInit.getInstance(this.f17210c).getDeviceType();
        LogUtil.d("UIME_NspClient", "callService upDeviceType = ", deviceType);
        map2.put("upDeviceType", deviceType);
        String deviceId = LoginInit.getInstance(this.f17210c).getDeviceId();
        if ("".equals(deviceId)) {
            deviceId = "clientnull";
        }
        LogUtil.d("UIME_NspClient", "callService deviceId=", deviceId);
        map2.put("deviceId", deviceId);
        map2.put("sysVersion", Build.VERSION.RELEASE);
        if (str.equals("/dataQuery/path/getMotionPathByVersion") || str.equals("/dataQuery/path/getMotionPathData")) {
            map2.put("iVersion", Integer.valueOf(Utils.a()));
        } else {
            map2.put("iVersion", Integer.valueOf(Utils.e()));
        }
        map2.put("isManually", Integer.valueOf(Utils.d()));
        map2.put("language", MLAsrConstants.LAN_ZH);
        map2.put("oaId", "");
        String strC = KeyValDbManager.d(this.f17210c).c("cloud_user_privacy10");
        if (strC == null || !"true".equals(strC)) {
            map2.put("isTrackingEnabled", 0);
        } else {
            map2.put("isTrackingEnabled", 1);
        }
        map2.put("improveState", Boolean.valueOf(niz.c()));
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry != null) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        map2.put("currentManufacturer", Build.MANUFACTURER);
    }

    private String e() {
        String strE;
        return (CommonUtil.ap() && (strE = SharedPreferenceManager.e(this.f17210c, String.valueOf(10008), "key_download_config")) != null && strE.contains("lfhealthtest2")) ? strE : GRSManager.c(this.f17210c).getUrl("healthDeviceUrl");
    }

    private void a(Map<String, Object> map) throws NSPException {
        Object objD;
        map.put("ts", Long.valueOf(System.currentTimeMillis()));
        map.put("tokenType", Integer.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        LoginInit loginInit = this.f17209b;
        if (loginInit == null) {
            throw new NSPException(1, "mLogin is null.");
        }
        String accountInfo = loginInit.getAccountInfo(1008);
        LogUtil.d("UIME_NspClient", "callService severToken from db = ", accountInfo);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("UIME_NspClient", "callService severToken is null!");
            LoginInit.getInstance(this.f17210c).moveInfoFromSPTODB();
            if (this.f17209b.getIsLogined()) {
                LoginInit.tryLoginWhenTokenInvalid();
            }
            throw new NSPException(1, "severToken is null.");
        }
        map.put("token", accountInfo);
        if (LoginInit.getInstance(this.f17210c).isLoginedByWear()) {
            LogUtil.a("UIME_NspClient", "callService appid wear logined");
            map.put("source", 2);
            objD = "com.huawei.bone";
        } else {
            LogUtil.a("UIME_NspClient", "callService appid health logined");
            objD = com.huawei.haf.application.BaseApplication.d();
            map.put("source", 1);
        }
        map.put("appId", objD);
    }

    private void a(lqr lqrVar, Gson gson) {
        String strD;
        CloudCommonReponse cloudCommonReponse;
        if (lqrVar.a() == null || (strD = Utils.d(lqrVar.a())) == null) {
            return;
        }
        if (strD.length() < 1024) {
            LogUtil.d("UIME_NspClient", "callService response content=", strD);
        } else {
            LogUtil.d("UIME_NspClient", "callService response content=", strD.substring(0, 1023));
        }
        try {
            cloudCommonReponse = (CloudCommonReponse) gson.fromJson(strD, CloudCommonReponse.class);
        } catch (JsonSyntaxException e2) {
            if (strD.length() < 30) {
                LogUtil.a("UIME_NspClient", "processResponseContent fromJson exception response content=", strD);
            } else {
                LogUtil.a("UIME_NspClient", "processResponseContent fromJson exception response content=", strD.substring(0, 30));
            }
            LogUtil.a("UIME_NspClient", "processResponseContent, fromJson exception :", e2.getMessage());
            cloudCommonReponse = null;
        }
        if (cloudCommonReponse != null) {
            if (cloudCommonReponse.getResultCode().intValue() == 1002 || cloudCommonReponse.getResultCode().intValue() == 1004) {
                LogUtil.a("UIME_NspClient", "processResponseContent auth failed, so need to logout!", cloudCommonReponse.getResultCode());
                LoginInit.tryLoginWhenTokenInvalid();
            }
        }
    }

    private void b() {
        LogUtil.a("UIME_NspClient", "registerLogoutBroadcastReceiver register accout logout broadcast ");
        BroadcastManagerUtil.d(this.f17210c, f17208a, new IntentFilter("com.huawei.plugin.account.logout"), LocalBroadcast.f36595c, null);
    }

    private void a() {
        LogUtil.a("UIME_NspClient", "registerLoginBroadcastReceiver register accout login broadcast ");
        BroadcastManagerUtil.d(this.f17210c, f17208a, new IntentFilter("com.huawei.plugin.account.login"), LocalBroadcast.f36595c, null);
    }

    static class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            if (intent == null || context == null) {
                return;
            }
            try {
                action = intent.getAction();
            } catch (Exception unused) {
                LogUtil.e("UIME_NspClient", "onReceive: getAction() exception");
                action = null;
            }
            LogUtil.d("UIME_NspClient", "onReceive:", action);
            if ("com.huawei.plugin.account.logout".equals(action)) {
                boolean unused2 = NspClient.e = true;
            } else if ("com.huawei.plugin.account.login".equals(action)) {
                boolean unused3 = NspClient.e = false;
            } else {
                LogUtil.j("UIME_NspClient", "onReceive is other action");
            }
        }
    }
}
