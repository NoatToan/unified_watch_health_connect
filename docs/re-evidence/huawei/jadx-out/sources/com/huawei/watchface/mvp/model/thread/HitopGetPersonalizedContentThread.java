package com.huawei.watchface.mvp.model.thread;

import android.text.TextUtils;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.c2;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSignBean;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import defpackage.ort;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultinfo"), @d0(name = "resultcode"), @d0(name = "content")})
public class HitopGetPersonalizedContentThread extends BaseHttpRequest<String> {
    public String b(String str) {
        HwLog.e("HitopGetPersonalizedContentThread", "dealReceive json is empty? = " + ort.d(str));
        String strD = d(str);
        HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(Environment.getApplicationContext());
        if (hwWatchFaceApi != null && !hwWatchFaceApi.isOversea() && TextUtils.equals(strD, "-1")) {
            strD = e();
        }
        if (TextUtils.equals(strD, "-1")) {
            strD = NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_DEFAULT_PERSONALIZED_RECOMMENDATION_SWITCH, "-1");
        }
        HwLog.i("HitopGetPersonalizedContentThread", "dealReceive status:" + strD);
        return strD;
    }

    public String c(String str) {
        return a(WatchFaceHttpUtil.t(), str + f(), getReqHeaders());
    }

    public final String d(String str) {
        if (ort.d(str)) {
            return "-1";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = Integer.parseInt(jSONObject.optString("resultcode"));
            if (i != 0) {
                HwLog.e("HitopGetPersonalizedContentThread", "dealReceive resultCode:" + i);
                return "-1";
            }
            String strOptString = jSONObject.optString("content");
            if (ort.d(strOptString)) {
                HwLog.e("HitopGetPersonalizedContentThread", "dealReceive content is empty");
                return "-1";
            }
            String strOptString2 = new JSONObject(strOptString).optString("HWHDRecommendMsg");
            if (!ort.d(strOptString2) && "1".equalsIgnoreCase(strOptString2)) {
                return "1";
            }
            if (!ort.d(strOptString2) && "0".equalsIgnoreCase(strOptString2)) {
                return "0";
            }
            HwLog.e("HitopGetPersonalizedContentThread", "dealReceive hwHdRecommendMsg is empty or is not 1");
            return "-1";
        } catch (Exception e) {
            HwLog.e("HitopGetPersonalizedContentThread", "handleJsonData exception: " + HwLog.printException(e));
            return "-1";
        }
    }

    public final String e() {
        try {
            HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(Environment.getApplicationContext());
            return hwWatchFaceApi != null ? hwWatchFaceApi.getWatchfacePersonalSwitch() : "-1";
        } catch (Exception e) {
            HwLog.e("HitopGetPersonalizedContentThread", "getPersonalSwitchFromAccountInfo exception: " + HwLog.printException(e));
            return "-1";
        }
    }

    public final String f() {
        String sign;
        StringBuffer stringBuffer = new StringBuffer(2048);
        WatchFaceSignBean watchFaceSignBeanC = WatchFaceHttpUtil.C();
        if (watchFaceSignBeanC != null) {
            sign = watchFaceSignBeanC.getSign();
        } else {
            HwLog.e("HitopGetPersonalizedContentThread", "getPersonalizedRequestParams() watchFaceSignBean is null.");
            sign = null;
        }
        if (TextUtils.isEmpty(sign)) {
            HwLog.e("HitopGetPersonalizedContentThread", "getPersonalizedRequestParams() sign is null.");
            return "";
        }
        stringBuffer.append("sign=").append(sign);
        stringBuffer.append("&type=1003&buildNumber=");
        stringBuffer.append(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getSoftVersion());
        stringBuffer.append("&themeVersion=").append(HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion(true, false));
        stringBuffer.append("&versionCode=").append(CommonUtils.getVersionCode());
        stringBuffer.append("&terminalType=1&deviceType=");
        String deviceType = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceType();
        if (TextUtils.isEmpty(deviceType)) {
            HwLog.e("HitopGetPersonalizedContentThread", "getPersonalizedRequestParams() deviceType is null.");
            return "";
        }
        stringBuffer.append(deviceType);
        c2.a(Environment.getApplicationContext()).a(stringBuffer);
        String deviceId = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            HwLog.e("HitopGetPersonalizedContentThread", "getPersonalizedRequestParams() deviceId is null.");
            return "";
        }
        stringBuffer.append("&deviceId=").append(deviceId);
        return stringBuffer.toString();
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return CommonUtils.getVersionCode() + "";
    }
}
