package com.unionpay;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
final class p implements ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10780a;

    public p(UPPayWapActivity uPPayWapActivity) {
        this.f10780a = uPPayWapActivity;
    }

    @Override // com.unionpay.ae
    public final void a(String str, af afVar) {
        try {
            this.f10780a.i = afVar;
            String strOptString = new JSONObject(str).optString(com.xiaomi.onetrack.api.b.D);
            if (TextUtils.isEmpty(strOptString)) {
                if (afVar != null) {
                    afVar.a(UPPayWapActivity.b("1", "Parameter error", (String) null));
                    return;
                }
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(strOptString));
            try {
                this.f10780a.startActivity(intent);
            } catch (Exception unused) {
                if (afVar != null) {
                    afVar.a(UPPayWapActivity.b("2", "Call application error", (String) null));
                }
            }
        } catch (Exception e) {
            if (afVar != null) {
                afVar.a(UPPayWapActivity.b("1", e.getMessage(), (String) null));
            }
        }
    }
}
