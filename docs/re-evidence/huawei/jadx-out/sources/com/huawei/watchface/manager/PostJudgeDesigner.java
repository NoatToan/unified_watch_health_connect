package com.huawei.watchface.manager;

import android.text.TextUtils;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.c2;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSignBean;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultinfo"), @d0(name = "resultcode"), @d0(name = "isDesigner")})
public class PostJudgeDesigner extends BaseHttpRequest<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBaseResponseCallback f30328a;

    public PostJudgeDesigner(IBaseResponseCallback iBaseResponseCallback) {
        this.f30328a = iBaseResponseCallback;
    }

    public static String e() {
        String sign;
        StringBuffer stringBuffer = new StringBuffer(2048);
        WatchFaceSignBean watchFaceSignBeanA = WatchFaceHttpUtil.A();
        if (watchFaceSignBeanA != null) {
            sign = watchFaceSignBeanA.getSign();
        } else {
            HwLog.e("PostJudgeDesigner", "getDesignerParameters() watchFaceSignBean is null.");
            sign = null;
        }
        if (TextUtils.isEmpty(sign)) {
            HwLog.e("PostJudgeDesigner", "getDesignerParameters() sign is null.");
            return "";
        }
        stringBuffer.append("sign=").append(sign);
        stringBuffer.append("&themeVersion=").append(HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion(true, false));
        stringBuffer.append("&buildNumber=").append(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getSoftVersion());
        stringBuffer.append("&versionCode=80003&terminalType=123&deviceType=");
        String deviceType = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceType();
        if (TextUtils.isEmpty(deviceType)) {
            HwLog.e("PostJudgeDesigner", "getDesignerParameters() deviceType is null.");
            return "";
        }
        stringBuffer.append(deviceType);
        c2.a(Environment.getApplicationContext()).a(stringBuffer);
        String deviceId = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            HwLog.e("PostJudgeDesigner", "getDesignerParameters() deviceId is null.");
            return "";
        }
        stringBuffer.append("&deviceId=").append(deviceId);
        stringBuffer.append("&isVipVersion=").append(CommonUtils.B());
        return stringBuffer.toString();
    }

    public final LinkedHashMap b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(WatchFaceConstant.X_CLIENTTRACEID, MobileInfoHelper.generateUUID());
        linkedHashMap.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        return linkedHashMap;
    }

    public String c(String str) {
        HwLog.i("PostJudgeDesigner", "getResponse() enter.");
        String strE = e();
        if (!TextUtils.isEmpty(strE)) {
            return a(WatchFaceHttpUtil.h(), strE, b());
        }
        HwLog.i("PostJudgeDesigner", "getResponse() designerParameters is empty.");
        return "";
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest, java.lang.Runnable
    public void run() {
        String strC = c("");
        if (TextUtils.isEmpty(strC)) {
            HwLog.i("PostJudgeDesigner", "getDesignerParameters receive json, receive is empty.");
        } else if (TextUtils.isEmpty(WatchFaceHttpUtil.I())) {
            HwLog.i("PostJudgeDesigner", "getDesignerParameters getBaseUrl() is null");
        } else {
            b(strC);
        }
    }

    public String b(String str) {
        String strOptString = null;
        if (str != null) {
            HwLog.i("PostJudgeDesigner", "dealReceive");
            if (!TextUtils.isEmpty(str)) {
                String string = "";
                int i = -1;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if ("success".equals(jSONObject.getString("resultinfo"))) {
                        string = jSONObject.getString("isDesigner");
                        i = 0;
                    } else {
                        strOptString = jSONObject.optString("resultinfo");
                        HwLog.i("PostJudgeDesigner", "getDesignerParameters error : " + strOptString);
                    }
                } catch (JSONException e) {
                    HwLog.i("PostJudgeDesigner", "getDesignerParameters is error " + HwLog.printException((Exception) e));
                }
                IBaseResponseCallback iBaseResponseCallback = this.f30328a;
                if (iBaseResponseCallback != null) {
                    iBaseResponseCallback.onResponse(i, string);
                }
            }
        }
        return strOptString;
    }
}
