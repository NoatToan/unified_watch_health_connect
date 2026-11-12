package com.huawei.watchface;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.CouponsByproductBean;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes45.dex */
public class e1 extends BaseHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30122a;

    public e1(String str) {
        this.f30122a = str;
    }

    private LinkedHashMap e() {
        LinkedHashMap<String, String> reqHeaders = super.getReqHeaders();
        reqHeaders.put("x-brandChannel", String.valueOf(q0.d()));
        reqHeaders.put("x-accountBrand", String.valueOf(q0.b()));
        reqHeaders.put("x-appBrand", String.valueOf(q0.b()));
        reqHeaders.remove(WatchFaceConstant.X_UID);
        reqHeaders.remove("usertoken");
        reqHeaders.remove("authtype");
        return reqHeaders;
    }

    private String f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TextUtils.isEmpty(this.f30122a)) {
            linkedHashMap.put("hitopId", this.f30122a);
        }
        if (WatchFaceHttpUtil.A() != null) {
            linkedHashMap.put(HwPayConstant.KEY_SIGN, WatchFaceHttpUtil.A().getSign());
        }
        linkedHashMap.put("resourceType", "6");
        linkedHashMap.put("userToken", x3.b(c2.a(Environment.getApplicationContext()).h()));
        linkedHashMap.put("deviceType", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceType());
        linkedHashMap.put("deviceId", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceId());
        linkedHashMap.put("versionCode", CommonUtils.getVersionCode() + "");
        linkedHashMap.put("isVipVersion", Integer.valueOf(CommonUtils.B()));
        String strA = a(linkedHashMap);
        HwLog.i("GetVipProductInfoThread", "getRequestParams -- mProductId:" + this.f30122a);
        return strA;
    }

    public CouponsByproductBean b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("GetVipProductInfoThread", "dealReceive json is empty");
            return null;
        }
        try {
            return (CouponsByproductBean) c5.a().a(str, CouponsByproductBean.class);
        } catch (JsonSyntaxException e) {
            HwLog.e("GetVipProductInfoThread", "dealReceive JsonSyntaxException:" + HwLog.printException((Exception) e));
            return null;
        } catch (Exception e2) {
            HwLog.e("GetVipProductInfoThread", "dealReceive Exception:" + HwLog.printException(e2));
            return null;
        }
    }

    public String c(String str) {
        HwLog.i("GetVipProductInfoThread", "getResponse url");
        return a(WatchFaceHttpUtil.x(), f(), e());
    }
}
