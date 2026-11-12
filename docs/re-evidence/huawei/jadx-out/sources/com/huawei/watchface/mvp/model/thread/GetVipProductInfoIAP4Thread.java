package com.huawei.watchface.mvp.model.thread;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.c5;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.VipPackageIAP4Bean;
import com.huawei.watchface.mvp.model.datatype.VipPackageIAP4Resp;
import com.huawei.watchface.q0;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes45.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultinfo"), @d0(name = "resultcode"), @d0(name = "productInfoList")})
public class GetVipProductInfoIAP4Thread extends BaseHttpRequest<VipPackageIAP4Bean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30355c;

    public GetVipProductInfoIAP4Thread(String str) {
        this.f30353a = str;
    }

    private String f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TextUtils.isEmpty(this.f30353a)) {
            linkedHashMap.put("productCode", this.f30353a);
        }
        linkedHashMap.put("productType", "2");
        linkedHashMap.put("versionCode", String.valueOf(CommonUtils.getVersionCode()));
        String strA = WatchFaceHttpUtil.a(linkedHashMap);
        HwLog.i("GetVipProductInfoIAP4Thread", "getRequestParams -- mProductId:" + this.f30353a);
        return strA;
    }

    public VipPackageIAP4Bean b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("GetVipProductInfoIAP4Thread", "dealReceive json is empty");
            return null;
        }
        try {
            VipPackageIAP4Resp vipPackageIAP4Resp = (VipPackageIAP4Resp) c5.a().a(str, VipPackageIAP4Resp.class);
            if (vipPackageIAP4Resp == null) {
                return null;
            }
            HwLog.i("GetVipProductInfoIAP4Thread", "receive");
            if (!ArrayUtils.isEmpty(vipPackageIAP4Resp.getProductInfoList())) {
                return vipPackageIAP4Resp.getProductInfoList().get(0);
            }
        } catch (JsonSyntaxException e) {
            HwLog.e("GetVipProductInfoIAP4Thread", "dealReceive " + HwLog.printException((Exception) e));
        }
        return null;
    }

    public String c(String str) {
        HwLog.i("GetVipProductInfoIAP4Thread", "getResponse url");
        return a(WatchFaceHttpUtil.y(), f(), e());
    }

    public void d(String str) {
        this.f30355c = str;
    }

    public void e(String str) {
        this.f30354b = str;
    }

    private LinkedHashMap e() {
        LinkedHashMap<String, String> reqHeaders = super.getReqHeaders();
        reqHeaders.put("x-devicemodel", !TextUtils.isEmpty(this.f30355c) ? this.f30355c : HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        reqHeaders.put("x-brandChannel", String.valueOf(q0.d()));
        reqHeaders.put("x-accountBrand", String.valueOf(q0.b()));
        reqHeaders.put("x-appBrand", String.valueOf(q0.b()));
        reqHeaders.put(ProfileRequestConstants.X_LANGUAGE_KEY, LanguageUtils.a(false));
        reqHeaders.put("deviceid", q0.e());
        reqHeaders.put("deviceType", "5");
        reqHeaders.put("Content-Type", "application/json");
        if (!TextUtils.isEmpty(this.f30354b)) {
            reqHeaders.put(WatchFaceConstant.X_SIGN, this.f30354b);
        }
        return reqHeaders;
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return String.valueOf(CommonUtils.getVersionCode());
    }
}
