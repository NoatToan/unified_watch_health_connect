package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class n4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15123c = "ServicePolicyExecutor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f15124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PolicyNetworkService f15125b;

    public boolean b(String str) {
        try {
            return this.f15124a.has(str) ? this.f15124a.getBoolean(str) : StringUtils.stringToBoolean(this.f15125b.getConfigValue(str), false);
        } catch (JSONException unused) {
            return StringUtils.stringToBoolean(this.f15125b.getConfigValue(str), false);
        }
    }

    public void a() {
        PolicyNetworkService policyNetworkService = NetworkKitInnerImpl.getInstance().getPolicyNetworkService(NetworkService.Constants.CONFIG_SERVICE);
        this.f15125b = policyNetworkService;
        if (policyNetworkService == null) {
            throw new IllegalStateException("configPolicyService is error");
        }
    }

    public Boolean a(String str) {
        try {
            if (this.f15124a.has(str)) {
                return Boolean.valueOf(this.f15124a.getBoolean(str));
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    private void c(String str) {
        try {
            this.f15124a = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
        } catch (JSONException unused) {
            this.f15124a = new JSONObject();
            Logger.w(f15123c, "call method NetworkServiceManager init set options occur JSONException");
        }
    }

    public n4(String str) {
        c(str);
    }
}
