package com.huawei.watchface.mvp.model.thread;

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
import com.huawei.watchface.l1;
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
@ReportPolicy(collectedFields = {@d0(name = "resultcode"), @d0(name = "resultinfo"), @d0(name = "result-content-huid", needAnony = true), @d0(name = "result-content-deviceId", needAnony = true), @d0(name = "result-content-validDate"), @d0(name = "result-content-memberStatus")})
public class GetMemberSignatureThread extends BaseHttpRequest<WatchFaceSignatureBean> {
    public WatchFaceSignatureBean b(String str) {
        try {
            if (str == null) {
                HwLog.i("GetMemberSignatureThread", "dealReceive receive is null");
                return null;
            }
            WatchFaceSignatureBean watchFaceSignatureBean = (WatchFaceSignatureBean) c5.a().a(str, WatchFaceSignatureBean.class);
            if (watchFaceSignatureBean != null) {
                return watchFaceSignatureBean;
            }
            HwLog.e("GetMemberSignatureThread", "dealReceive watchFaceSignatureBean is null");
            return null;
        } catch (JsonSyntaxException e) {
            HwLog.e("GetMemberSignatureThread", "dealReceive JsonSyntaxException: " + HwLog.printException((Exception) e));
            return null;
        } catch (Exception e2) {
            HwLog.e("GetMemberSignatureThread", "dealReceive exception: " + HwLog.printException(e2));
            return null;
        }
    }

    public String e() {
        HwLog.i("GetMemberSignatureThread", "getResponse url");
        return a(WatchFaceHttpUtil.p(), f(), b());
    }

    public final String f() {
        JSONObject jSONObject;
        Exception e;
        JSONException e2;
        JSONObject jSONObject2;
        ScreenInfo screenInfo;
        try {
            jSONObject = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(Environment.getApplicationContext());
                jSONObject3.put("screen", HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceScreen(true, hwWatchFaceApi.getDeviceConnectState() == 0));
                String deviceModel = hwWatchFaceApi.getDeviceModel();
                jSONObject3.put("deviceModel", deviceModel + hwWatchFaceApi.getSoftVersion());
                jSONObject3.put("huid", l1.a(hwWatchFaceApi.getUserId()));
                jSONObject3.put("phoneType", deviceModel);
                jSONObject3.put("deviceId", q0.e());
                jSONObject3.put("deviceType", "5");
                jSONObject3.put(CloudParamKeys.CLIENT_TYPE, "6");
                jSONObject3.put("osVersion", HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion(false, false));
                jSONObject3.put(Wpt.MODE, HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSportAPModel() ? "1" : "0");
                List<ScreenInfo> compatibleInfo = HwWatchFaceManager.getInstance(Environment.getApplicationContext()).getCompatibleInfo();
                if (!ArrayUtils.isEmpty(compatibleInfo) && (screenInfo = (ScreenInfo) ArrayUtils.a(compatibleInfo, 0)) != null) {
                    String string = new JSONObject().put(screenInfo.getWidth() + "*" + screenInfo.getHeight(), screenInfo.getSupportVersion()).toString();
                    jSONObject3.put("adaptScreenInfo", string);
                    StringBuilder sb = new StringBuilder("getSignParams adaptScreenInfo：");
                    sb.append(string);
                    HwLog.i("GetMemberSignatureThread", sb.toString());
                }
                jSONObject.put("watchDeviceInfo", jSONObject3);
                jSONObject2 = jSONObject;
            } catch (JSONException e3) {
                e2 = e3;
                HwLog.e("GetMemberSignatureThread", "getSignParams JSONException:" + HwLog.printException((Exception) e2));
                jSONObject2 = jSONObject;
            } catch (Exception e4) {
                e = e4;
                HwLog.e("GetMemberSignatureThread", "getSignParams Exception:" + HwLog.printException(e));
                jSONObject2 = jSONObject;
            }
        } catch (JSONException e5) {
            jSONObject = null;
            e2 = e5;
        } catch (Exception e6) {
            jSONObject = null;
            e = e6;
        }
        return jSONObject2.toString();
    }

    private LinkedHashMap b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x-versioncode", CommonUtils.getVersionCode() + "");
        linkedHashMap.put(WatchFaceConstant.X_CLIENTTRACEID, MobileInfoHelper.generateUUID());
        linkedHashMap.put(ProfileRequestConstants.X_APPID_KEY, "10003");
        linkedHashMap.put("x-hc", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        linkedHashMap.put(ProfileRequestConstants.X_LANGUAGE_KEY, LanguageUtils.a(false));
        linkedHashMap.put("x-devicemodel", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        linkedHashMap.put("x-ostype", "emui");
        linkedHashMap.put("x-osversion", HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion(false, false));
        linkedHashMap.put("x-phonetype", MobileInfoHelper.getDeviceName());
        linkedHashMap.put("x-screen", a4.a());
        linkedHashMap.put("x-clienttype", "1");
        linkedHashMap.put("x-packagename", Environment.getApplicationContext().getPackageName());
        linkedHashMap.put("x-brandChannel", String.valueOf(q0.d()));
        linkedHashMap.put("Content-Type", "application/json; charset=UTF-8");
        c2.a(Environment.getApplicationContext()).b(linkedHashMap, d());
        return linkedHashMap;
    }
}
