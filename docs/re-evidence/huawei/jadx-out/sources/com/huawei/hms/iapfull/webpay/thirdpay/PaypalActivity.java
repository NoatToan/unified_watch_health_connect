package com.huawei.hms.iapfull.webpay.thirdpay;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import com.braintreepayments.api.PayPalAccountNonce;
import com.braintreepayments.api.PayPalListener;
import com.braintreepayments.api.PayPalVaultRequest;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.iapfull.n0;
import com.huawei.hms.iapfull.y0;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.tencent.connect.common.Constants;
import defpackage.sh;
import defpackage.uf;
import defpackage.uh;
import defpackage.ui;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class PaypalActivity extends n0 implements PayPalListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private uf f13793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ui f13794c;
    private SharedPreferences d;
    private sh e;

    @Override // com.huawei.hms.iapfull.n0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y0.b("PaypalActivity", "onCreate");
        this.d = getApplicationContext().getSharedPreferences("Paypal", 0);
        String stringExtra = new SafeIntent(getIntent()).getStringExtra("paypal_sign_token");
        sh shVar = new sh(this, stringExtra, getPackageName() + ".braintree");
        this.e = shVar;
        uf ufVar = new uf(this, shVar);
        this.f13793b = ufVar;
        ufVar.a((PayPalListener) this);
        this.f13794c = new ui(this.e);
        if (stringExtra == null) {
            y0.a("PaypalActivity", "onCreate illegal params");
            finish();
        } else {
            this.f13794c.a(this, new uh(false, null), new b(this, new PayPalVaultRequest(true)));
        }
    }

    @Override // com.braintreepayments.api.PayPalListener
    public void onPayPalSuccess(PayPalAccountNonce payPalAccountNonce) {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", "ok");
            jSONObject.put("deviceData", this.d.getString("deviceData", ""));
            jSONObject.put(Constants.NONCE, payPalAccountNonce.getString());
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "{\"result\":\"fail\",\"error\":\"JSONException\"}";
        }
        b(string);
    }

    @Override // com.braintreepayments.api.PayPalListener
    public void onPayPalFailure(Exception exc) {
        String string;
        y0.a("PaypalActivity", "onPayPalFailure, error: " + exc.getMessage());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", ParamConstants.CallbackMethod.ON_FAIL);
            jSONObject.put(VastAttribute.ERROR, exc.getMessage());
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "{\"result\":\"fail\",\"error\":\"JSONException\"}";
        }
        b(string);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    private void b(String str) {
        Intent intent = new Intent();
        intent.putExtra("paypal_sign_result", str);
        setResult(-1, intent);
        this.e = null;
        this.f13793b = null;
        finish();
    }
}
