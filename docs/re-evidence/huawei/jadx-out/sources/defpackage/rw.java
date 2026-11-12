package defpackage;

import com.braintreepayments.api.HttpResponseCallback;
import com.braintreepayments.api.PaymentMethod;
import com.braintreepayments.api.TokenizeCallback;
import com.huawei.hms.network.embedded.n0;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.ble.BleConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/braintreepayments/api/ApiClient;", "", "braintreeClient", "Lcom/braintreepayments/api/BraintreeClient;", "(Lcom/braintreepayments/api/BraintreeClient;)V", "parseResponseToJSON", "Lorg/json/JSONObject;", "responseBody", "", "tokenizeGraphQL", "", "tokenizePayload", ParamConstants.Param.CALLBACK, "Lcom/braintreepayments/api/TokenizeCallback;", "tokenizeREST", "paymentMethod", "Lcom/braintreepayments/api/PaymentMethod;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class rw {
    public static final c e = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sh f47779a;

    public rw(sh shVar) {
        zcp.c(shVar, "");
        this.f47779a = shVar;
    }

    public final void b(PaymentMethod paymentMethod, final TokenizeCallback tokenizeCallback) {
        zcp.c(paymentMethod, "");
        zcp.c(tokenizeCallback, "");
        final sh shVar = this.f47779a;
        String strC = e.c("payment_methods/" + paymentMethod.getApiPath());
        paymentMethod.setSessionId(this.f47779a.getR());
        sh.b(shVar, "card.rest.tokenization.started", (rz) null, 2, (Object) null);
        sh.a(shVar, strC, String.valueOf(paymentMethod.buildJSON()), (Map) null, new HttpResponseCallback() { // from class: rx
            @Override // com.braintreepayments.api.HttpResponseCallback
            public final void onResult(String str, Exception exc) {
                rw.b(this.d, shVar, tokenizeCallback, str, exc);
            }
        }, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(rw rwVar, sh shVar, TokenizeCallback tokenizeCallback, String str, Exception exc) {
        zcp.c(rwVar, "");
        zcp.c(shVar, "");
        zcp.c(tokenizeCallback, "");
        JSONObject jSONObjectE = rwVar.e(str);
        if (jSONObjectE != null) {
            sh.b(shVar, "card.rest.tokenization.success", (rz) null, 2, (Object) null);
            tokenizeCallback.onResult(jSONObjectE, null);
        } else if (exc != null) {
            sh.b(shVar, "card.rest.tokenization.failure", (rz) null, 2, (Object) null);
            tokenizeCallback.onResult(null, exc);
        }
    }

    private final JSONObject e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/braintreepayments/api/ApiClient$Companion;", "", "()V", "PAYMENT_METHOD_ENDPOINT", "", "versionedPath", BleConstants.KEY_PATH, "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c {
        private c() {
        }

        @JvmStatic
        public final String c(String str) {
            zcp.c(str, "");
            return n0.e + str;
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }
}
