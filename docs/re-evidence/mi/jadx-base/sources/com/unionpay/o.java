package com.unionpay;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
final class o implements ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10779a;

    public o(UPPayWapActivity uPPayWapActivity) {
        this.f10779a = uPPayWapActivity;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // com.unionpay.ae
    public final void a(String str, af afVar) {
        try {
            this.f10779a.i = afVar;
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("packageName");
            String string2 = jSONObject.getString("type");
            String strOptString = jSONObject.optString("openParams");
            String strOptString2 = jSONObject.optString("tn");
            String strOptString3 = jSONObject.optString("extra");
            if ("0".equals(string2)) {
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(strOptString2)) {
                    if (afVar != null) {
                        afVar.a(UPPayWapActivity.b("1", "Parameter error", (String) null));
                        return;
                    }
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName(string, "com.unionpay.uppay.PayActivity");
                intent.putExtra("paydata", strOptString2);
                intent.putExtra(UPPayWapActivity.f10735a, this.f10779a.f);
                intent.putExtra("extra", strOptString3);
                try {
                    this.f10779a.startActivityForResult(intent, 1);
                    return;
                } catch (Exception unused) {
                    if (afVar != null) {
                        afVar.a(UPPayWapActivity.b("2", "Call application error", (String) null));
                        return;
                    }
                    return;
                }
            }
            if (!"2".equals(string2)) {
                if (afVar != null) {
                    afVar.a(UPPayWapActivity.b("1", "Parameter error", (String) null));
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(strOptString)) {
                if (afVar != null) {
                    afVar.a(UPPayWapActivity.b("1", "Parameter error", (String) null));
                    return;
                }
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(strOptString));
            intent2.putExtra("extra", strOptString3);
            if (!TextUtils.isEmpty(string)) {
                intent2.setPackage(string);
            }
            try {
                this.f10779a.startActivityForResult(intent2, 1);
                return;
            } catch (Exception unused2) {
                if (afVar != null) {
                    afVar.a(UPPayWapActivity.b("2", "Call application error", (String) null));
                    return;
                }
                return;
            }
        } catch (Exception e) {
            if (afVar != null) {
                afVar.a(UPPayWapActivity.b("1", e.getMessage(), (String) null));
            }
        }
        if (afVar != null) {
            afVar.a(UPPayWapActivity.b("1", e.getMessage(), (String) null));
        }
    }
}
