package com.huawei.watchface;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.picture.security.account.bean.SignInRequest;
import com.huawei.picture.security.account.bean.SignInResponse;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class r1 extends BaseHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f30553a;

    public r1(Bundle bundle) {
        this.f30553a = bundle;
    }

    private String buildRequestParams() {
        SignInRequest signInRequest = new SignInRequest();
        if (this.f30553a.containsKey("userRefreshToken")) {
            signInRequest.setUserRefreshToken(this.f30553a.getString("userRefreshToken"));
        }
        if (this.f30553a.containsKey("appId")) {
            signInRequest.setAppId(this.f30553a.getString("appId"));
        }
        if (this.f30553a.containsKey("timestamp")) {
            signInRequest.setTimestamp(this.f30553a.getString("timestamp"));
        }
        if (this.f30553a.containsKey(HwPayConstant.KEY_SIGN)) {
            signInRequest.setSign(this.f30553a.getString(HwPayConstant.KEY_SIGN));
        }
        return GsonHelper.toJson(signInRequest);
    }

    public SignInResponse b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("HitopRefreshTokenThread", "dealReceive json is empty");
            return new SignInResponse();
        }
        try {
            return (SignInResponse) GsonHelper.fromJson(str, SignInResponse.class);
        } catch (Exception e) {
            HwLog.i("HitopRefreshTokenThread", "handleJsonData exception: " + HwLog.printException(e));
            return new SignInResponse();
        }
    }

    public String e() {
        return a(WatchFaceHttpUtil.F(), buildRequestParams(), getReqHeaders());
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public LinkedHashMap getReqHeaders() {
        LinkedHashMap<String, String> reqHeaders = super.getReqHeaders();
        reqHeaders.put("versionCode", MobileInfoHelper.getVersion());
        reqHeaders.put("x-hc", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        reqHeaders.put("x-packagename", Environment.b());
        reqHeaders.put("appBrand", String.valueOf(q0.b()));
        reqHeaders.put("x-brandChannel", String.valueOf(q0.d()));
        reqHeaders.put(WatchFaceConstant.CIPHER_VERSION, "1,2");
        reqHeaders.put("personSwitch", String.valueOf(1));
        reqHeaders.put("x-accountBrand", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getAccountBrand());
        reqHeaders.put("Content-Type", "application/json");
        reqHeaders.remove("authtype");
        reqHeaders.remove("usertoken");
        reqHeaders.remove("deviceid");
        reqHeaders.remove("deviceType");
        reqHeaders.remove("terminalType");
        return reqHeaders;
    }
}
