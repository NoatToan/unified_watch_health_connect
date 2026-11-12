package com.unionpay;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
final class k implements ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10775a;

    public k(UPPayWapActivity uPPayWapActivity) {
        this.f10775a = uPPayWapActivity;
    }

    @Override // com.unionpay.ae
    public final void a(String str, af afVar) {
        String str2;
        String str3 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                str2 = (String) jSONObject.get("resultCode");
                try {
                    str3 = (String) jSONObject.get("resultData");
                } catch (Exception e) {
                    e = e;
                    if (afVar != null) {
                        afVar.a(UPPayWapActivity.b("1", e.getMessage(), (String) null));
                    }
                }
            } catch (Exception e2) {
                e = e2;
                str2 = "";
            }
            this.f10775a.a(str2, str3);
            if (afVar != null) {
                afVar.a(UPPayWapActivity.b("0", "success", (String) null));
            }
        } catch (Exception e3) {
            if (afVar != null) {
                afVar.a(UPPayWapActivity.b("1", e3.getMessage(), (String) null));
            }
        }
    }
}
