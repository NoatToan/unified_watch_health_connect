package com.huawei.watchface.mvp.model.thread;

import android.text.TextUtils;
import com.huawei.hms.network.embedded.j;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.c2;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.k0;
import com.huawei.watchface.mvp.model.datatype.ScreenInfo;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialOperation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultInfo"), @d0(name = "resultinfo"), @d0(name = j.k), @d0(name = "resultCode"), @d0(name = "resultcode"), @d0(name = "retCode")}, collectedHeaders = {@d0(name = "versionCode"), @d0(name = "usertoken", needAnony = true), @d0(name = "x-usertoken", needAnony = true)}, collectedParams = {@d0(name = "versionCode"), @d0(name = "hitopid"), @d0(name = "productId")}, excludedParams = {"userToken", HwPayConstant.KEY_RESERVEDINFOR, "licenseReq", "authCode", "deviceId", HwPayConstant.KEY_SIGN, "userRefreshToken", Constants.PARAM_ACCESS_TOKEN, "phoneId", "publicKey", SocialOperation.GAME_SIGNATURE, "accessKey"})
public abstract class BaseHttpRequest<T> implements Runnable {
    private LinkedHashMap b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (WatchFaceHttpUtil.A() != null) {
            linkedHashMap.put(WatchFaceConstant.X_SIGN, WatchFaceHttpUtil.A().getSign());
        }
        if (!TextUtils.isEmpty(c())) {
            linkedHashMap.put("versionCode", c());
        }
        linkedHashMap.put(WatchFaceConstant.X_CLIENTTRACEID, MobileInfoHelper.generateUUID());
        linkedHashMap.put("x-hc", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion(false, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 0));
        linkedHashMap.put(ProfileRequestConstants.X_APPID_KEY, "10003");
        linkedHashMap.put("x-devicemodel", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        linkedHashMap.put("deviceid", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceIdAsTheme(true));
        linkedHashMap.put("deviceType", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceTypeNew());
        linkedHashMap.put("terminalType", "1");
        linkedHashMap.put(WatchFaceConstant.X_UID, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getUserId());
        linkedHashMap.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        linkedHashMap.put(WatchFaceConstant.CIPHER_VERSION, "2");
        c2.a(Environment.getApplicationContext()).a(linkedHashMap, d());
        return linkedHashMap;
    }

    public String a(String str, String str2, LinkedHashMap linkedHashMap) {
        c2.a(Environment.getApplicationContext()).f(false);
        return WatchFaceHttpUtil.a(str, str2, linkedHashMap, getClass());
    }

    public String c() {
        return null;
    }

    public boolean d() {
        return true;
    }

    public LinkedHashMap<String, String> getReqHeaders() {
        return b();
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public String a(LinkedHashMap linkedHashMap) {
        if (ArrayUtils.a(linkedHashMap)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(250);
        int i = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb.append(i == 0 ? "" : "&");
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            i++;
        }
        return sb.toString();
    }

    public String a(String str) {
        String strA;
        HwLog.i("BaseHttpRequest", "getLicenseReq start :" + str);
        try {
            strA = k0.a(Environment.getApplicationContext(), str);
        } catch (Exception unused) {
            strA = k0.a(Environment.getApplicationContext(), str);
        }
        if (TextUtils.isEmpty(strA)) {
            HwLog.w("BaseHttpRequest", "licenseReq is empty");
        }
        HwLog.i("BaseHttpRequest", "getLicenseReq -- licenseKey== " + str);
        return strA;
    }

    public void b(LinkedHashMap linkedHashMap) {
        if (linkedHashMap == null) {
            HwLog.i("BaseHttpRequest", "setHeaderAdaptScreenInfo  headers is null");
            return;
        }
        List<ScreenInfo> compatibleInfo = HwWatchFaceManager.getInstance(Environment.getApplicationContext()).getCompatibleInfo();
        if (ArrayUtils.isEmpty(compatibleInfo)) {
            HwLog.i("BaseHttpRequest", "setHeaderAdaptScreenInfo  compatibleList is empty");
            return;
        }
        ScreenInfo screenInfo = (ScreenInfo) ArrayUtils.a(compatibleInfo, 0);
        if (screenInfo == null) {
            HwLog.i("BaseHttpRequest", "setHeaderAdaptScreenInfo  screenInfo is null");
            return;
        }
        try {
            String string = new JSONObject().put(screenInfo.getWidth() + "*" + screenInfo.getHeight(), screenInfo.getSupportVersion()).toString();
            linkedHashMap.put("x-adaptScreenInfo", string);
            StringBuilder sb = new StringBuilder("setHeaderAdaptScreenInfo：");
            sb.append(string);
            HwLog.i("BaseHttpRequest", sb.toString());
        } catch (JSONException e) {
            HwLog.e("BaseHttpRequest", "setHeaderAdaptScreenInfo error " + HwLog.printException((Exception) e));
        }
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("memberUcsSign", "1");
            jSONObject.put("100009", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            HwLog.e("BaseHttpRequest", "createUcsJsonAbility JSONException:" + HwLog.printException((Exception) e));
            return "";
        } catch (Exception e2) {
            HwLog.e("BaseHttpRequest", "createUcsJsonAbility Exception:" + HwLog.printException(e2));
            return "";
        }
    }
}
