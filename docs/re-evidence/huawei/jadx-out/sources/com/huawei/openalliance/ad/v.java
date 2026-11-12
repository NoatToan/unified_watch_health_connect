package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;
import com.huawei.openalliance.ad.constant.UiEngineParam;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class v extends j {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            a(remoteCallResultCallback, this.f19295a, 1001, null, true);
            return;
        }
        hw.b("JsbQueryDsl", "query dsl");
        try {
            com.huawei.openalliance.ad.utils.c.a(str, new IPPSUiEngineCallback.a() { // from class: com.huawei.openalliance.ad.v.1
                @Override // com.huawei.hms.ads.uiengine.IPPSUiEngineCallback
                public void onCallResult(String str2, Bundle bundle) {
                    if (bundle == null) {
                        j.a(remoteCallResultCallback, v.this.f19295a, 1000, null, false);
                        return;
                    }
                    try {
                        gr grVar = new gr(bundle);
                        String strD = grVar.d("templateId");
                        String strD2 = grVar.d(UiEngineParam.STYLE_ID);
                        String strD3 = grVar.d(UiEngineParam.H5_DSL);
                        hw.b("JsbQueryDsl", "query h5 dsl, tmpId: %s, styleId: %s", strD, strD2);
                        if (!com.huawei.openalliance.ad.utils.dg.b(strD) && !com.huawei.openalliance.ad.utils.dg.b(strD2) && !com.huawei.openalliance.ad.utils.dg.b(strD3)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("templateId", strD);
                            jSONObject.put(UiEngineParam.STYLE_ID, strD2);
                            jSONObject.put(UiEngineParam.H5_DSL, strD3);
                            j.a(remoteCallResultCallback, v.this.f19295a, 1000, jSONObject.toString(), false);
                            return;
                        }
                        hw.c("JsbQueryDsl", "illegal param");
                        j.a(remoteCallResultCallback, v.this.f19295a, 1001, null, false);
                    } catch (JSONException unused) {
                        hw.d("JsbQueryDsl", "query h5 dsl json exception");
                        j.a(remoteCallResultCallback, v.this.f19295a, 1011, null, false);
                    }
                }
            });
        } catch (Throwable unused) {
            a(remoteCallResultCallback, true);
        }
    }

    public v() {
        super("pps.query.dsl");
    }
}
