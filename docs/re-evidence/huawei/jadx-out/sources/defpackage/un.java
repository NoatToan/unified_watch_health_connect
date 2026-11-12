package defpackage;

import android.content.Context;
import android.net.Uri;
import com.braintreepayments.api.Authorization;
import com.braintreepayments.api.AuthorizationCallback;
import com.braintreepayments.api.ConfigurationCallback;
import com.braintreepayments.api.HttpResponseCallback;
import com.braintreepayments.api.PayPalAccountNonce;
import com.braintreepayments.api.PayPalBrowserSwitchResultCallback;
import com.braintreepayments.api.PayPalInternalClientCallback;
import com.braintreepayments.api.PayPalRequest;
import com.braintreepayments.api.PayPalVaultRequest;
import com.braintreepayments.api.TokenizeCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
class un {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sh f50381a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rw f50382c;
    private final ui d;

    un(sh shVar) {
        this(shVar, new ui(shVar), new rw(shVar));
    }

    un(sh shVar, ui uiVar, rw rwVar) {
        this.f50381a = shVar;
        this.d = uiVar;
        this.f50382c = rwVar;
    }

    /* JADX INFO: renamed from: un$1, reason: invalid class name */
    class AnonymousClass1 implements AuthorizationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f50383a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PayPalRequest f50385c;
        final /* synthetic */ PayPalInternalClientCallback e;

        AnonymousClass1(PayPalInternalClientCallback payPalInternalClientCallback, PayPalRequest payPalRequest, Context context) {
            this.e = payPalInternalClientCallback;
            this.f50385c = payPalRequest;
            this.f50383a = context;
        }

        @Override // com.braintreepayments.api.AuthorizationCallback
        public void onAuthorizationResult(final Authorization authorization, Exception exc) {
            if (authorization != null) {
                un.this.f50381a.c(new ConfigurationCallback() { // from class: un.1.1
                    @Override // com.braintreepayments.api.ConfigurationCallback
                    public void onResult(final tf tfVar, Exception exc2) {
                        String str;
                        final String str2;
                        if (tfVar == null) {
                            AnonymousClass1.this.e.onResult(null, exc2);
                            return;
                        }
                        try {
                            String str3 = String.format("/v1/%s", AnonymousClass1.this.f50385c instanceof PayPalVaultRequest ? "paypal_hermes/setup_billing_agreement" : "paypal_hermes/create_payment_resource");
                            if (!AnonymousClass1.this.f50385c.isAppLinkEnabled() || un.this.f50381a.getE() == null) {
                                str = String.format("%s://onetouch/v1/cancel", un.this.f50381a.c());
                                str2 = String.format("%s://onetouch/v1/success", un.this.f50381a.c());
                            } else {
                                String string = un.this.f50381a.getE().toString();
                                str = String.format("%s/cancel", string);
                                str2 = String.format("%s/success", string);
                            }
                            un.this.f50381a.c(str3, AnonymousClass1.this.f50385c.createRequestBody(tfVar, authorization, str2, str), new HttpResponseCallback() { // from class: un.1.1.4
                                @Override // com.braintreepayments.api.HttpResponseCallback
                                public void onResult(String str4, Exception exc3) {
                                    if (str4 != null) {
                                        try {
                                            uj ujVarB = new uj(AnonymousClass1.this.f50385c).b(str2);
                                            String strA = uk.a(str4).a();
                                            if (strA != null) {
                                                Uri uri = Uri.parse(strA);
                                                String strD = un.this.d(uri);
                                                String riskCorrelationId = AnonymousClass1.this.f50385c.getRiskCorrelationId();
                                                if (riskCorrelationId == null) {
                                                    ue ueVarE = new ue(AnonymousClass1.this.f50385c.hasUserLocationConsent()).e(un.this.d.c(AnonymousClass1.this.f50383a));
                                                    if (strD != null) {
                                                        ueVarE.c(strD);
                                                    }
                                                    riskCorrelationId = un.this.d.c(AnonymousClass1.this.f50383a, ueVarE, tfVar);
                                                }
                                                if (strD != null) {
                                                    ujVarB.c(strD);
                                                }
                                                ujVarB.e(riskCorrelationId).a(uri.toString());
                                            }
                                            AnonymousClass1.this.e.onResult(ujVarB, null);
                                            return;
                                        } catch (JSONException e) {
                                            AnonymousClass1.this.e.onResult(null, e);
                                            return;
                                        }
                                    }
                                    AnonymousClass1.this.e.onResult(null, exc3);
                                }
                            });
                        } catch (JSONException e) {
                            AnonymousClass1.this.e.onResult(null, e);
                        }
                    }
                });
            } else {
                this.e.onResult(null, exc);
            }
        }
    }

    void b(Context context, PayPalRequest payPalRequest, PayPalInternalClientCallback payPalInternalClientCallback) {
        this.f50381a.a(new AnonymousClass1(payPalInternalClientCallback, payPalRequest, context));
    }

    void b(tz tzVar, final PayPalBrowserSwitchResultCallback payPalBrowserSwitchResultCallback) {
        this.f50382c.b(tzVar, new TokenizeCallback() { // from class: un.5
            @Override // com.braintreepayments.api.TokenizeCallback
            public void onResult(JSONObject jSONObject, Exception exc) {
                if (jSONObject != null) {
                    try {
                        payPalBrowserSwitchResultCallback.onResult(PayPalAccountNonce.fromJSON(jSONObject), null);
                        return;
                    } catch (JSONException e) {
                        payPalBrowserSwitchResultCallback.onResult(null, e);
                        return;
                    }
                }
                payPalBrowserSwitchResultCallback.onResult(null, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(Uri uri) {
        String queryParameter = uri.getQueryParameter("ba_token");
        return queryParameter == null ? uri.getQueryParameter("token") : queryParameter;
    }
}
