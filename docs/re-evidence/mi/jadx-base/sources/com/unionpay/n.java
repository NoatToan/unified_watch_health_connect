package com.unionpay;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
final class n implements ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10778a;

    public n(UPPayWapActivity uPPayWapActivity) {
        this.f10778a = uPPayWapActivity;
    }

    @Override // com.unionpay.ae
    public final void a(String str, af afVar) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                if (afVar != null) {
                    afVar.a(UPPayWapActivity.b("1", "Parameter error", (String) null));
                    return;
                }
                return;
            }
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            while (true) {
                String str2 = "0";
                if (i >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("packageName");
                if (com.unionpay.utils.b.a(this.f10778a, string, jSONObject2.getString("packageSign"), jSONObject2.getString("supportVersion"))) {
                    str2 = "1";
                }
                jSONObject.put(string, str2);
                i++;
            }
            if (afVar != null) {
                afVar.a(UPPayWapActivity.b("0", "success", jSONObject));
            }
        } catch (Exception e) {
            if (afVar != null) {
                afVar.a(UPPayWapActivity.b("1", e.getMessage(), (String) null));
            }
        }
    }
}
