package com.unionpay;

import android.content.Intent;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
final class m implements ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10777a;

    public m(UPPayWapActivity uPPayWapActivity) {
        this.f10777a = uPPayWapActivity;
    }

    @Override // com.unionpay.ae
    public final void a(String str, af afVar) {
        String str2;
        String str3 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                str2 = (String) jSONObject.get("url");
                try {
                    str3 = (String) jSONObject.get("title");
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
            Bundle bundle = new Bundle();
            bundle.putString("waptype", "new_page");
            bundle.putString("magic_data", "949A1CC");
            bundle.putString("wapurl", str2);
            bundle.putString("waptitle", str3);
            bundle.putString("actionType", this.f10777a.g);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            intent.setClass(this.f10777a, UPPayWapActivity.class);
            this.f10777a.startActivity(intent);
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
