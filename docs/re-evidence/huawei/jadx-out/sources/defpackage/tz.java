package defpackage;

import com.braintreepayments.api.PaymentMethod;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
class tz extends PaymentMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f49816b = new JSONObject();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49817c;
    private String d;
    private String e;

    tz() {
    }

    @Override // com.braintreepayments.api.PaymentMethod
    public JSONObject buildJSON() throws JSONException {
        JSONObject jSONObjectBuildJSON = super.buildJSON();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("correlationId", this.e);
        jSONObject.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, this.f49815a);
        if ("single-payment".equalsIgnoreCase(this.f49817c)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PaymentMethod.VALIDATE_KEY, false);
            jSONObject.put(PaymentMethod.OPTIONS_KEY, jSONObject2);
        }
        Iterator<String> itKeys = this.f49816b.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject.put(next, this.f49816b.get(next));
        }
        Object obj = this.d;
        if (obj != null) {
            jSONObjectBuildJSON.put("merchant_account_id", obj);
        }
        jSONObjectBuildJSON.put("paypalAccount", jSONObject);
        return jSONObjectBuildJSON;
    }

    void b(String str) {
        this.e = str;
    }

    void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f49816b = jSONObject;
        }
    }

    void e(String str) {
        this.f49815a = str;
    }

    void c(String str) {
        this.d = str;
    }

    void a(String str) {
        this.f49817c = str;
    }

    @Override // com.braintreepayments.api.PaymentMethod
    public String getApiPath() {
        return "paypal_accounts";
    }
}
