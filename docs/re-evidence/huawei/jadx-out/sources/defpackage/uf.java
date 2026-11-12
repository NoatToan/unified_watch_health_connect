package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.braintreepayments.api.BraintreeRequestCodes;
import com.braintreepayments.api.ConfigurationCallback;
import com.braintreepayments.api.PayPalAccountNonce;
import com.braintreepayments.api.PayPalBrowserSwitchResultCallback;
import com.braintreepayments.api.PayPalCheckoutRequest;
import com.braintreepayments.api.PayPalFlowStartedCallback;
import com.braintreepayments.api.PayPalInternalClientCallback;
import com.braintreepayments.api.PayPalLifecycleObserver;
import com.braintreepayments.api.PayPalListener;
import com.braintreepayments.api.PayPalRequest;
import com.braintreepayments.api.PayPalVaultRequest;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.openalliance.ad.constant.ClickDestination;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f50014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    td f50015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final un f50016c;
    private PayPalListener d;
    private final sh e;
    private String i;

    public uf(FragmentActivity fragmentActivity, sh shVar) {
        this(fragmentActivity, fragmentActivity.getLifecycle(), shVar, new un(shVar));
    }

    uf(FragmentActivity fragmentActivity, Lifecycle lifecycle, sh shVar, un unVar) {
        this.i = null;
        this.f50014a = false;
        this.e = shVar;
        this.f50016c = unVar;
        if (fragmentActivity == null || lifecycle == null) {
            return;
        }
        lifecycle.addObserver(new PayPalLifecycleObserver(this));
    }

    public void a(PayPalListener payPalListener) {
        this.d = payPalListener;
        td tdVar = this.f50015b;
        if (tdVar != null) {
            d(tdVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(tf tfVar) {
        return tfVar == null || !tfVar.getZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(FragmentActivity fragmentActivity) throws sx {
        this.e.c(fragmentActivity, BraintreeRequestCodes.PAYPAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception d() {
        return new st("PayPal is not enabled. See https://developer.paypal.com/braintree/docs/guides/paypal/overview/android/v4 for more information.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception b(sx sxVar) {
        return new st("AndroidManifest.xml is incorrectly configured or another app defines the same browser switch url as this app. See https://developer.paypal.com/braintree/docs/guides/client-sdk/setup/android/v4#browser-switch-setup for the correct configuration: " + sxVar.getMessage());
    }

    public void b(FragmentActivity fragmentActivity, PayPalRequest payPalRequest) {
        c(fragmentActivity, payPalRequest, new PayPalFlowStartedCallback() { // from class: uf.4
            @Override // com.braintreepayments.api.PayPalFlowStartedCallback
            public void onResult(Exception exc) {
                if (exc == null || uf.this.d == null) {
                    return;
                }
                uf.this.d.onPayPalFailure(exc);
            }
        });
    }

    @Deprecated
    public void c(FragmentActivity fragmentActivity, PayPalRequest payPalRequest, PayPalFlowStartedCallback payPalFlowStartedCallback) {
        if (payPalRequest instanceof PayPalCheckoutRequest) {
            this.f50014a = false;
            b(fragmentActivity, (PayPalCheckoutRequest) payPalRequest, payPalFlowStartedCallback);
        } else if (payPalRequest instanceof PayPalVaultRequest) {
            this.f50014a = true;
            e(fragmentActivity, (PayPalVaultRequest) payPalRequest, payPalFlowStartedCallback);
        }
    }

    private void b(final FragmentActivity fragmentActivity, final PayPalCheckoutRequest payPalCheckoutRequest, final PayPalFlowStartedCallback payPalFlowStartedCallback) {
        this.e.e("paypal.single-payment.selected", c());
        if (payPalCheckoutRequest.getShouldOfferPayLater()) {
            this.e.e("paypal.single-payment.paylater.offered", c());
        }
        this.e.c(new ConfigurationCallback() { // from class: uf.3
            @Override // com.braintreepayments.api.ConfigurationCallback
            public void onResult(tf tfVar, Exception exc) {
                if (exc == null) {
                    if (uf.d(tfVar)) {
                        payPalFlowStartedCallback.onResult(uf.d());
                        return;
                    }
                    try {
                        uf.this.a(fragmentActivity);
                        uf.this.b(fragmentActivity, (PayPalRequest) payPalCheckoutRequest, payPalFlowStartedCallback);
                        return;
                    } catch (sx e) {
                        uf.this.e.e("paypal.invalid-manifest", uf.this.c());
                        payPalFlowStartedCallback.onResult(uf.b(e));
                        return;
                    }
                }
                payPalFlowStartedCallback.onResult(exc);
            }
        });
    }

    private void e(final FragmentActivity fragmentActivity, final PayPalVaultRequest payPalVaultRequest, final PayPalFlowStartedCallback payPalFlowStartedCallback) {
        this.e.e("paypal.billing-agreement.selected", c());
        if (payPalVaultRequest.getShouldOfferCredit()) {
            this.e.e("paypal.billing-agreement.credit.offered", c());
        }
        this.e.c(new ConfigurationCallback() { // from class: uf.1
            @Override // com.braintreepayments.api.ConfigurationCallback
            public void onResult(tf tfVar, Exception exc) {
                if (exc == null) {
                    if (uf.d(tfVar)) {
                        payPalFlowStartedCallback.onResult(uf.d());
                        return;
                    }
                    try {
                        uf.this.a(fragmentActivity);
                        uf.this.b(fragmentActivity, payPalVaultRequest, payPalFlowStartedCallback);
                        return;
                    } catch (sx e) {
                        uf.this.e.e("paypal.invalid-manifest", uf.this.c());
                        payPalFlowStartedCallback.onResult(uf.b(e));
                        return;
                    }
                }
                payPalFlowStartedCallback.onResult(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final FragmentActivity fragmentActivity, final PayPalRequest payPalRequest, final PayPalFlowStartedCallback payPalFlowStartedCallback) {
        this.f50016c.b(fragmentActivity, payPalRequest, new PayPalInternalClientCallback() { // from class: uf.5
            @Override // com.braintreepayments.api.PayPalInternalClientCallback
            public void onResult(uj ujVar, Exception exc) {
                if (ujVar != null) {
                    String strE = uf.e(payPalRequest);
                    uf.this.i = ujVar.d();
                    uf.this.e.e(String.format("%s.browser-switch.started", strE), uf.this.c());
                    try {
                        uf.this.d(fragmentActivity, ujVar, payPalRequest.isAppLinkEnabled());
                        payPalFlowStartedCallback.onResult(null);
                        return;
                    } catch (JSONException | sx e) {
                        payPalFlowStartedCallback.onResult(e);
                        return;
                    }
                }
                payPalFlowStartedCallback.onResult(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FragmentActivity fragmentActivity, uj ujVar, boolean z) throws JSONException, sx {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("approval-url", ujVar.b());
        jSONObject.put("success-url", ujVar.j());
        jSONObject.put("payment-type", ujVar.f() ? "billing-agreement" : "single-payment");
        jSONObject.put("client-metadata-id", ujVar.e());
        jSONObject.put("merchant-account-id", ujVar.a());
        jSONObject.put("source", "paypal-browser");
        jSONObject.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, ujVar.c());
        tb tbVarC = new tb().c(BraintreeRequestCodes.PAYPAL).c(Uri.parse(ujVar.b())).a(this.e.c()).d(this.e.getO()).c(jSONObject);
        if (z) {
            tbVarC.b(this.e.getE());
        }
        this.e.b(fragmentActivity, tbVarC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(PayPalRequest payPalRequest) {
        return payPalRequest instanceof PayPalVaultRequest ? "paypal.billing-agreement" : "paypal.single-payment";
    }

    public void e(td tdVar) {
        this.f50015b = tdVar;
        if (this.d != null) {
            d(tdVar);
        }
    }

    private void d(td tdVar) {
        a(tdVar, new PayPalBrowserSwitchResultCallback() { // from class: uf.2
            @Override // com.braintreepayments.api.PayPalBrowserSwitchResultCallback
            public void onResult(PayPalAccountNonce payPalAccountNonce, Exception exc) {
                if (payPalAccountNonce == null || uf.this.d == null) {
                    if (exc == null || uf.this.d == null) {
                        return;
                    }
                    uf.this.d.onPayPalFailure(exc);
                    return;
                }
                uf.this.d.onPayPalSuccess(payPalAccountNonce);
            }
        });
        this.f50015b = null;
    }

    public td e(FragmentActivity fragmentActivity) {
        return this.e.b(fragmentActivity);
    }

    public td d(FragmentActivity fragmentActivity) {
        return this.e.e(fragmentActivity);
    }

    public td b(FragmentActivity fragmentActivity) {
        return this.e.d(fragmentActivity);
    }

    public td c(FragmentActivity fragmentActivity) {
        return this.e.b((Context) fragmentActivity);
    }

    public void a(td tdVar, final PayPalBrowserSwitchResultCallback payPalBrowserSwitchResultCallback) {
        String queryParameter;
        if (tdVar == null) {
            payPalBrowserSwitchResultCallback.onResult(null, new st("BrowserSwitchResult cannot be null"));
            return;
        }
        JSONObject jSONObjectC = tdVar.c();
        String strE = tu.e(jSONObjectC, "client-metadata-id", null);
        String strE2 = tu.e(jSONObjectC, "merchant-account-id", null);
        String strE3 = tu.e(jSONObjectC, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, null);
        String strE4 = tu.e(jSONObjectC, "approval-url", null);
        String strE5 = tu.e(jSONObjectC, "success-url", null);
        String strE6 = tu.e(jSONObjectC, "payment-type", "unknown");
        boolean zEqualsIgnoreCase = strE6.equalsIgnoreCase("billing-agreement");
        String str = zEqualsIgnoreCase ? "ba_token" : "token";
        String str2 = zEqualsIgnoreCase ? "paypal.billing-agreement" : "paypal.single-payment";
        if (strE4 != null && (queryParameter = Uri.parse(strE4).getQueryParameter(str)) != null && !queryParameter.isEmpty()) {
            this.i = queryParameter;
        }
        int iA = tdVar.a();
        if (iA != 1) {
            if (iA != 2) {
                return;
            }
            payPalBrowserSwitchResultCallback.onResult(null, new vh("User canceled PayPal."));
            this.e.e(String.format("%s.browser-switch.canceled", str2), c());
            return;
        }
        try {
            Uri uriD = tdVar.d();
            if (uriD != null) {
                JSONObject jSONObjectB = b(uriD, strE5, strE4, str);
                tz tzVar = new tz();
                tzVar.b(strE);
                tzVar.e(strE3);
                tzVar.setSource("paypal-browser");
                tzVar.a(jSONObjectB);
                tzVar.a(strE6);
                if (strE2 != null) {
                    tzVar.c(strE2);
                }
                if (strE3 != null) {
                    tzVar.e(strE3);
                }
                this.f50016c.b(tzVar, new PayPalBrowserSwitchResultCallback() { // from class: uf.9
                    @Override // com.braintreepayments.api.PayPalBrowserSwitchResultCallback
                    public void onResult(PayPalAccountNonce payPalAccountNonce, Exception exc) {
                        if (payPalAccountNonce != null && payPalAccountNonce.getCreditFinancing() != null) {
                            uf.this.e.e("paypal.credit.accepted", uf.this.c());
                        }
                        payPalBrowserSwitchResultCallback.onResult(payPalAccountNonce, exc);
                    }
                });
                this.e.e(String.format("%s.browser-switch.succeeded", str2), c());
                return;
            }
            payPalBrowserSwitchResultCallback.onResult(null, new st("Unknown error"));
        } catch (JSONException e) {
            e = e;
            payPalBrowserSwitchResultCallback.onResult(null, e);
            this.e.e(String.format("%s.browser-switch.failed", str2), c());
        } catch (ub e2) {
            e = e2;
            payPalBrowserSwitchResultCallback.onResult(null, e);
            this.e.e(String.format("%s.browser-switch.failed", str2), c());
        } catch (vh e3) {
            payPalBrowserSwitchResultCallback.onResult(null, e3);
            this.e.e(String.format("%s.browser-switch.canceled", str2), c());
        }
    }

    private JSONObject b(Uri uri, String str, String str2, String str3) throws JSONException, vh, ub {
        if (!Uri.parse(str).getLastPathSegment().equals(uri.getLastPathSegment())) {
            throw new vh("User canceled PayPal.", true);
        }
        String queryParameter = Uri.parse(str2).getQueryParameter(str3);
        String queryParameter2 = uri.getQueryParameter(str3);
        if (queryParameter2 != null && TextUtils.equals(queryParameter, queryParameter2)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("environment", (Object) null);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("client", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("webURL", uri.toString());
            jSONObject2.put("response", jSONObject3);
            jSONObject2.put(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, ClickDestination.WEB);
            return jSONObject2;
        }
        throw new ub("The response contained inconsistent data.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rz c() {
        rz rzVar = new rz();
        rzVar.d(this.i);
        rzVar.c(this.f50014a.booleanValue());
        return rzVar;
    }
}
