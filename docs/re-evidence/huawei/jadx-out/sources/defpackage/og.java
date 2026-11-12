package defpackage;

import com.alipay.sdk.m.s.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class og extends e {
    @Override // com.alipay.sdk.m.s.e
    public JSONObject a() throws JSONException {
        return e.a("cashier", "sdkPreheat");
    }

    @Override // com.alipay.sdk.m.s.e
    public boolean c() {
        return false;
    }

    @Override // com.alipay.sdk.m.s.e
    public String a(on onVar, String str, JSONObject jSONObject) {
        String strA = super.a(onVar, str, jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject(strA);
            jSONObject2.put("trdfrom", "0");
            jSONObject2.put("sourceBundleId", onVar.c().getPackageName());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("invokeFromAppName", onVar.c().getPackageName());
            jSONObject2.put("env", jSONObject3);
            return jSONObject2.toString();
        } catch (Throwable th) {
            mu.c(onVar, "biz", "buildBody", th);
            oq.c(th);
            return strA;
        }
    }
}
