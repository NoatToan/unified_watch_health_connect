package com.huawei.watchface.mvp.model.thread;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.picture.security.account.bean.SignInRequest;
import com.huawei.picture.security.account.bean.SignInResponse;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.q0;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultinfo"), @d0(name = "resultcode"), @d0(name = "userInfo-serviceCountryCode"), @d0(name = "userInfo-countryCode")})
public class HitopSignInThread extends BaseHttpRequest<SignInResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f30371a;

    public HitopSignInThread(Bundle bundle) {
        this.f30371a = bundle;
    }

    private String buildRequestParams() {
        SignInRequest signInRequest = new SignInRequest();
        if (this.f30371a.containsKey("authCode")) {
            signInRequest.setAuthCode(this.f30371a.getString("authCode"));
        }
        if (this.f30371a.containsKey("publicKey")) {
            signInRequest.setPublicKey(this.f30371a.getString("publicKey"));
        }
        if (this.f30371a.containsKey("appId")) {
            signInRequest.setAppId(this.f30371a.getString("appId"));
        }
        if (this.f30371a.containsKey("redirectUri")) {
            signInRequest.setRedirectUri(this.f30371a.getString("redirectUri"));
        }
        return GsonHelper.toJson(signInRequest);
    }

    public SignInResponse b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("HitopSignInThread", "dealReceive json is empty");
            return new SignInResponse();
        }
        try {
            return (SignInResponse) GsonHelper.fromJson(str, SignInResponse.class);
        } catch (Exception e) {
            HwLog.i("HitopSignInThread", "handleJsonData exception: " + HwLog.printException(e));
            return new SignInResponse();
        }
    }

    public String e() {
        return a(WatchFaceHttpUtil.G(), buildRequestParams(), getReqHeaders());
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
