package com.unionpay;

import com.unionpay.utils.UPUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
final class u implements ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10813a;

    public u(UPPayWapActivity uPPayWapActivity) {
        this.f10813a = uPPayWapActivity;
    }

    @Override // com.unionpay.ae
    public final void a(String str, af afVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                UPUtils.a(this.f10813a, jSONObject.getString(next), next);
            }
            if (afVar != null) {
                afVar.a(UPPayWapActivity.b("0", "success", (String) null));
            }
        } catch (Exception e) {
            if (afVar != null) {
                afVar.a(UPPayWapActivity.b("1", e.getMessage(), (String) null));
            }
        }
    }
}
