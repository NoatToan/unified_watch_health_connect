package com.huawei.hms.iapfull.webpay.thirdpay;

import com.braintreepayments.api.PayPalDataCollectorCallback;
import com.braintreepayments.api.PayPalVaultRequest;
import com.huawei.hms.iapfull.y0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
class b implements PayPalDataCollectorCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ PayPalVaultRequest f13802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ PaypalActivity f13803b;

    @Override // com.braintreepayments.api.PayPalDataCollectorCallback
    public void onResult(String str, Exception exc) {
        String strOptString;
        if (exc != null) {
            y0.a("PaypalActivity", exc.getMessage());
        }
        try {
            strOptString = new JSONObject(str).optString("correlation_id");
        } catch (JSONException unused) {
            strOptString = "";
        }
        this.f13803b.d.edit().putString("deviceData", strOptString).apply();
        this.f13803b.f13793b.b(this.f13803b, this.f13802a);
    }

    b(PaypalActivity paypalActivity, PayPalVaultRequest payPalVaultRequest) {
        this.f13803b = paypalActivity;
        this.f13802a = payPalVaultRequest;
    }
}
