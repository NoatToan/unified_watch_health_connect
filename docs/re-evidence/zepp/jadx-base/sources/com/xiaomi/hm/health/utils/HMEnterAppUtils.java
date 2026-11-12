package com.xiaomi.hm.health.utils;

import android.content.Context;
import com.huami.account.HMLoginManager;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.utils.HMEnterAppUtils;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class HMEnterAppUtils {
    private static final String a = "HMEnterAppUtils";
    private static final String b = "v1/device/active_history.json";
    private static final String c = "details";
    private static final String d = "v";
    private static final String e = "phone";
    private static final String f = "app";
    private static final String g = "brand";
    private static final String h = "model";
    private static final String i = "osversion";
    private static final String j = "systemtype";
    private static final String k = "country";
    private static final String l = "language";
    private static final String m = "carrier";
    private static final String n = "network ";
    private static final String o = "resolution";
    private static final String p = "appversion";
    private static final String q = "buildnumber";
    private static final String r = "channel";
    private static final String s = "deviceid";
    private static final String t = "sn";
    private static final String u = "devicesource";
    private static final String v = "3";

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ int a;

        public a(final int val$tag) {
            this.a = val$tag;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int type) {
            HMLog.i(HMEnterAppUtils.a, "uploadActiveHistory fail", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable throwable) {
            HMLog.i(HMEnterAppUtils.a, "uploadActiveHistory fail", new Object[0]);
            Analytics.event(BraceletApp.getContext(), StatEvent.UPLOAD_ACTIVE_FAILED, NetUtil.getNetType(BraceletApp.getContext()));
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData item) {
            if (!item.isSuccess() || item.getResponseBody() == null) {
                HMLog.i(HMEnterAppUtils.a, "postActiveHistory response = null , tag = " + this.a, new Object[0]);
                Analytics.event(BraceletApp.getContext(), StatEvent.UPLOAD_ACTIVE_FAILED, NetUtil.getNetType(BraceletApp.getContext()));
                return;
            }
            HMLog.i(HMEnterAppUtils.a, "postActiveHistory response = " + new String(item.getResponseBody()) + " , tag = " + this.a, new Object[0]);
            Analytics.event(BraceletApp.getContext(), StatEvent.UPLOAD_ACTIVE_SUCCESS, NetUtil.getNetType(BraceletApp.getContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        c(new a(HMKeeper.getActiveHistory()));
        HMKeeper.setActiveHistory(0);
    }

    private static void c(IHMHttpResponseHandler handler) {
        HashMap map = new HashMap();
        map.put("userid", Long.valueOf(HMLoginManager.getValidUid()));
        map.put("device_type", HMAppConfig.getDeviceType());
        map.put("imei", HMAppConfig.getDeviceType());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", "3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("brand", Utils.getPhoneBand());
            jSONObject2.put("model", Utils.getPhoneModel());
            jSONObject2.put(i, Utils.getOSVersion());
            jSONObject2.put(j, Utils.getMiuiWholeVersionInfo());
            jSONObject2.put("country", Locale.getDefault().getCountry());
            jSONObject2.put("language", Locale.getDefault().getLanguage());
            jSONObject2.put(n, NetUtil.getNetType(BraceletApp.getContext()));
            jSONObject2.put("resolution", (Utils.getScreenHeight() - Utils.getBarHeight()) + "x" + Utils.getScreenWidth());
            jSONObject.put("phone", jSONObject2.toString());
            HMLog.i(a, "phoneJSON = " + jSONObject2.toString(), new Object[0]);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(p, HMAppConfig.getVersionName());
            jSONObject3.put(q, HMAppConfig.getVersionCode());
            jSONObject3.put("channel", HMAppConfig.getChannel());
            HMDeviceType majorDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
            String boundDeviceId = HMDeviceManager.getInstance().getBoundDeviceId(majorDeviceType);
            String sn = ((DeviceSnService) KoinJavaComponent.inject(DeviceSnService.class).getValue()).getSn(majorDeviceType);
            HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(majorDeviceType);
            if (boundDeviceId == null) {
                boundDeviceId = "";
            }
            jSONObject3.put("deviceid", boundDeviceId);
            if (sn == null) {
                sn = "";
            }
            jSONObject3.put("sn", sn);
            jSONObject3.put("devicesource", boundDeviceSource.getValue());
            jSONObject3.put(Utils.PARAMS_APPLICATION_NAME, Utils.getApplicationName());
            jSONObject.put("app", jSONObject3.toString());
            HMLog.i(a, "appJSON = " + jSONObject3.toString(), new Object[0]);
            map.put("details", jSONObject.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.i(a, "exception = " + e2.toString(), new Object[0]);
        }
        String url = HMServerDef.getUrl(b);
        HMLog.i(a, "url = " + url, new Object[0]);
        HMWebUtil.doRequest(url, map, Support.RequestSupport.POST, handler);
    }

    public static void postActiveHistory(final Context cxt) {
        int activeHistory = HMKeeper.getActiveHistory();
        if (cxt == null || activeHistory == 0) {
            return;
        }
        if (!HMLoginManager.isOldUser()) {
            HMLog.i(a, "postActiveHistory loginData not valid,return.", new Object[0]);
        } else if (NetUtil.isNetworkConnected(cxt)) {
            new Thread(new Runnable() { // from class: ou2
                @Override // java.lang.Runnable
                public final void run() {
                    HMEnterAppUtils.b();
                }
            }).start();
        }
    }
}
