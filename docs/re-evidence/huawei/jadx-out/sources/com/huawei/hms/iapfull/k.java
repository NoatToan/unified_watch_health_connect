package com.huawei.hms.iapfull;

import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.iapfull.network.model.ReportPayResultResponse;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ReportPayResultResponse f13687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Headers f13688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f13689c;

    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    @Override // java.lang.Runnable
    public void run() {
        String strOptString;
        if (!"0".equals(this.f13687a.getReturnCode())) {
            this.f13689c.f13691a.a(this.f13687a.getReturnCode(), this.f13687a.getReturnDesc());
            return;
        }
        y0.b("ReportPayResutCallback", "request success...");
        Headers headers = this.f13688b;
        if (headers != null) {
            ReportPayResultResponse reportPayResultResponse = this.f13687a;
            String str = headers.get("HW-IAP-SIGN");
            String str2 = headers.get("HW-IAP-SIGN-GROUP");
            String strOptString2 = "";
            if (TextUtils.isEmpty(str2)) {
                strOptString = "";
            } else {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    if (jSONArray.length() > 0) {
                        JSONObject jSONObject = jSONArray.getJSONObject(0);
                        strOptString = jSONObject.optString(HwPayConstant.KEY_SIGN_TYPE);
                        try {
                            strOptString2 = jSONObject.optString(HwPayConstant.KEY_SIGN);
                        } catch (JSONException unused) {
                            y0.a("ReportPayResutCallback", "setNewSign，headerSignJson parsing JSONException");
                        }
                    } else {
                        strOptString = "";
                    }
                } catch (JSONException unused2) {
                    strOptString = "";
                }
            }
            if (!TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(str)) {
                str = strOptString2;
            } else {
                strOptString = "RSA256";
            }
            if (!TextUtils.isEmpty(str)) {
                reportPayResultResponse.setNewSign(str);
            }
            if (!TextUtils.isEmpty(strOptString)) {
                reportPayResultResponse.setSignatureAlgorithm(strOptString);
            }
        }
        this.f13689c.f13691a.a(this.f13687a);
    }

    k(l lVar, ReportPayResultResponse reportPayResultResponse, Headers headers) {
        this.f13689c = lVar;
        this.f13687a = reportPayResultResponse;
        this.f13688b = headers;
    }
}
