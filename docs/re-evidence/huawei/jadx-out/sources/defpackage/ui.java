package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.braintreepayments.api.ConfigurationCallback;
import com.braintreepayments.api.PayPalDataCollectorCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ud f50111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final va f50112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sh f50113c;

    public ui(sh shVar) {
        this(shVar, new ud(), new va());
    }

    ui(sh shVar, ud udVar, va vaVar) {
        this.f50113c = shVar;
        this.f50111a = udVar;
        this.f50112b = vaVar;
    }

    String c(Context context) {
        return this.f50112b.c(context);
    }

    String c(Context context, ue ueVar, tf tfVar) {
        return this.f50111a.e(context, tfVar, ueVar);
    }

    public void a(final Context context, final uh uhVar, final PayPalDataCollectorCallback payPalDataCollectorCallback) {
        this.f50113c.c(new ConfigurationCallback() { // from class: ui.4
            @Override // com.braintreepayments.api.ConfigurationCallback
            public void onResult(tf tfVar, Exception exc) {
                if (tfVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        ue ueVarE = new ue(uhVar.getF50079b()).e(ui.this.c(context));
                        if (uhVar.getF50080c() != null) {
                            ueVarE.c(uhVar.getF50080c());
                        }
                        String strE = ui.this.f50111a.e(context, tfVar, ueVarE);
                        if (!TextUtils.isEmpty(strE)) {
                            jSONObject.put("correlation_id", strE);
                        }
                    } catch (JSONException unused) {
                    }
                    payPalDataCollectorCallback.onResult(jSONObject.toString(), null);
                    return;
                }
                payPalDataCollectorCallback.onResult(null, exc);
            }
        });
    }
}
