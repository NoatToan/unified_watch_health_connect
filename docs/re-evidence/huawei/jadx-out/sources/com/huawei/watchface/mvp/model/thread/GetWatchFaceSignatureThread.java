package com.huawei.watchface.mvp.model.thread;

import android.app.Application;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.a4;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.c2;
import com.huawei.watchface.c5;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.ScreenInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSignatureBean;
import com.huawei.watchface.q0;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultcode"), @d0(name = "resultinfo"), @d0(name = "result-content-huid", needAnony = true), @d0(name = "result-content-hitopId"), @d0(name = "result-content-version"), @d0(name = "result-content-deviceId", needAnony = true), @d0(name = "result-content-watchContentHash", needAnony = true), @d0(name = "result-content-status"), @d0(name = "result-content-recycle")})
public class GetWatchFaceSignatureThread extends BaseHttpRequest<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30361c;

    public GetWatchFaceSignatureThread(String str, String str2, int i) {
        this.f30359a = str;
        this.f30360b = str2;
        this.f30361c = i;
    }

    private String g() {
        JSONObject jSONObject;
        Exception e;
        JSONException e2;
        JSONObject jSONObject2;
        ScreenInfo screenInfo;
        try {
            jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(this.f30359a)) {
                    jSONObject.put("hitopId", this.f30359a);
                }
                if (!TextUtils.isEmpty(this.f30360b)) {
                    jSONObject.put("version", this.f30360b);
                }
                Application applicationContext = Environment.getApplicationContext();
                if (applicationContext == null) {
                    HwLog.i("GetWatchFaceSignatureThread", "getSignParams application is null");
                    return null;
                }
                HwWatchFaceBtManager hwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(applicationContext);
                HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(applicationContext);
                jSONObject.put(Wpt.MODE, hwWatchFaceBtManager.isSportAPModel() ? "1" : "0");
                jSONObject.put("operateType", String.valueOf(this.f30361c));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("screen", hwWatchFaceBtManager.getWatchFaceScreen(true, hwWatchFaceApi.getDeviceConnectState() == 0));
                String deviceModel = hwWatchFaceApi.getDeviceModel();
                jSONObject3.put("deviceModel", deviceModel + hwWatchFaceApi.getSoftVersion());
                jSONObject3.put("phoneType", deviceModel);
                jSONObject3.put("deviceId", q0.f());
                jSONObject3.put("deviceType", "5");
                jSONObject3.put(CloudParamKeys.CLIENT_TYPE, "6");
                jSONObject3.put("osVersion", hwWatchFaceBtManager.getWatchFaceMaxVersion(false, false));
                List<ScreenInfo> compatibleInfo = HwWatchFaceManager.getInstance(applicationContext).getCompatibleInfo();
                if (!ArrayUtils.isEmpty(compatibleInfo) && (screenInfo = (ScreenInfo) ArrayUtils.a(compatibleInfo, 0)) != null) {
                    String string = new JSONObject().put(screenInfo.getWidth() + "*" + screenInfo.getHeight(), screenInfo.getSupportVersion()).toString();
                    jSONObject3.put("adaptScreenInfo", string);
                    StringBuilder sb = new StringBuilder("getSignParams adaptScreenInfo：");
                    sb.append(string);
                    HwLog.i("GetWatchFaceSignatureThread", sb.toString());
                }
                jSONObject.put("watchDeviceInfo", jSONObject3);
                jSONObject2 = jSONObject;
                return jSONObject2.toString();
            } catch (JSONException e3) {
                e2 = e3;
                HwLog.e("GetWatchFaceSignatureThread", "getSignParams JSONException:" + HwLog.printException((Exception) e2));
                jSONObject2 = jSONObject;
            } catch (Exception e4) {
                e = e4;
                HwLog.e("GetWatchFaceSignatureThread", "getSignParams Exception:" + HwLog.printException(e));
                jSONObject2 = jSONObject;
            }
        } catch (JSONException e5) {
            jSONObject = null;
            e2 = e5;
        } catch (Exception e6) {
            jSONObject = null;
            e = e6;
        }
    }

    public String b(String str) {
        c(str);
        return str;
    }

    public final void c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                HwLog.i("GetWatchFaceSignatureThread", "parseReceiveMsg receive is null");
                return;
            }
            WatchFaceSignatureBean watchFaceSignatureBean = (WatchFaceSignatureBean) c5.a().a(str, WatchFaceSignatureBean.class);
            if (watchFaceSignatureBean != null) {
                HwLog.i("GetWatchFaceSignatureThread", "parseReceiveMsg requestWatchfaceSignature code:" + watchFaceSignatureBean.getResultCode() + ",info:" + watchFaceSignatureBean.getResultInfo());
            }
        } catch (JsonSyntaxException e) {
            HwLog.e("GetWatchFaceSignatureThread", "parseReceiveMsg JsonSyntaxException: " + HwLog.printException((Exception) e));
        } catch (Exception e2) {
            HwLog.e("GetWatchFaceSignatureThread", "parseReceiveMsg exception: " + HwLog.printException(e2));
        }
    }

    public final String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("memberSignFlag", "1");
            jSONObject.put("100009", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            HwLog.e("GetWatchFaceSignatureThread", "createJsonAbility JSONException:" + HwLog.printException((Exception) e));
            return "";
        } catch (Exception e2) {
            HwLog.e("GetWatchFaceSignatureThread", "createJsonAbility Exception:" + HwLog.printException(e2));
            return "";
        }
    }

    public String f() {
        HwLog.i("GetWatchFaceSignatureThread", "getResponse url");
        return a(WatchFaceHttpUtil.K(), g(), b());
    }

    private LinkedHashMap b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x-versioncode", CommonUtils.getVersionCode() + "");
        linkedHashMap.put(WatchFaceConstant.X_CLIENTTRACEID, MobileInfoHelper.generateUUID());
        linkedHashMap.put(ProfileRequestConstants.X_APPID_KEY, "10003");
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.i("GetWatchFaceSignatureThread", "generateCommonHeaders application is null");
            return linkedHashMap;
        }
        linkedHashMap.put("x-hc", HwWatchFaceApi.getInstance(applicationContext).getCommonCountryCode());
        linkedHashMap.put(ProfileRequestConstants.X_LANGUAGE_KEY, LanguageUtils.a(false));
        linkedHashMap.put("x-devicemodel", HwWatchFaceApi.getInstance(applicationContext).getDeviceModel());
        linkedHashMap.put("x-ostype", "emui");
        linkedHashMap.put("x-osversion", HwWatchFaceBtManager.getInstance(applicationContext).getWatchFaceMaxVersion(false, false));
        linkedHashMap.put("x-phonetype", MobileInfoHelper.getDeviceName());
        linkedHashMap.put("x-screen", a4.a());
        linkedHashMap.put("x-clienttype", "1");
        linkedHashMap.put("x-packagename", applicationContext.getPackageName());
        linkedHashMap.put("x-brandChannel", String.valueOf(q0.d()));
        linkedHashMap.put("Content-Type", "application/json; charset=UTF-8");
        if (HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportMemberSignature()) {
            linkedHashMap.put("x-ability", e());
        }
        c2.a(applicationContext).b(linkedHashMap, d());
        return linkedHashMap;
    }
}
