package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSignBean;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class u1 extends BaseHttpRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30583c = "u1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30585b;

    public u1(String str, String str2) {
        this.f30585b = str;
        this.f30584a = str2;
    }

    private String buildRequestParams() {
        String sign;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            WatchFaceSignBean watchFaceSignBeanC = WatchFaceHttpUtil.C();
            if (watchFaceSignBeanC != null) {
                sign = watchFaceSignBeanC.getSign();
            } else {
                HwLog.e(f30583c, "getDesignerParameters() watchFaceSignBean is null.");
                sign = null;
            }
            if (TextUtils.isEmpty(sign)) {
                HwLog.e(f30583c, "getDesignerParameters() sign is null.");
                return "";
            }
            linkedHashMap.put(HwPayConstant.KEY_SIGN, sign);
            linkedHashMap.put("userToken", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getToken());
            linkedHashMap.put("deviceType", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceType());
            linkedHashMap.put("deviceId", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceId());
            linkedHashMap.put("couponId", this.f30584a);
            linkedHashMap.put("orderId", this.f30585b);
            return a(linkedHashMap);
        } catch (Exception e) {
            HwLog.i(f30583c, "Exception : " + HwLog.printException(e));
            return "";
        }
    }

    public Boolean b(String str) {
        if (str == null) {
            return Boolean.FALSE;
        }
        try {
            int iOptInt = new JSONObject(str).optInt("resultcode");
            HwLog.i(f30583c, "resultCode : " + iOptInt);
            return iOptInt != 0 ? Boolean.FALSE : Boolean.TRUE;
        } catch (Exception e) {
            HwLog.e(f30583c, "HitopRequestCouponUnlock hitop exception " + HwLog.printException(e));
            return Boolean.FALSE;
        }
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return CommonUtils.getVersionCode() + "";
    }

    public String e() {
        return a(WatchFaceHttpUtil.g(), buildRequestParams(), getReqHeaders());
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public LinkedHashMap getReqHeaders() {
        return super.getReqHeaders();
    }
}
