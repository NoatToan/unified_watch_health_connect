package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.hms.ads.consent.bean.AdProvider;
import com.huawei.hms.ads.consent.constant.ConsentStatus;
import com.huawei.hms.ads.consent.inter.Consent;
import com.huawei.hms.ads.consent.inter.ConsentUpdateListener;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class af extends j {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        Consent.getInstance(context).requestConsentUpdate(new ConsentUpdateListener() { // from class: com.huawei.openalliance.ad.af.1
            public void onSuccess(ConsentStatus consentStatus, boolean z, List<AdProvider> list) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(JsbMapKeyNames.H5_CONSENT_STATUS, consentStatus.getValue());
                    jSONObject.put(JsbMapKeyNames.H5_CONSENT_ISNEEDCONSENT, z);
                    JSONArray jSONArray = new JSONArray();
                    if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
                        for (AdProvider adProvider : list) {
                            JSONObject jSONObject2 = new JSONObject();
                            if (adProvider != null) {
                                jSONObject2.put("id", adProvider.getId());
                                jSONObject2.put("name", adProvider.getName());
                                jSONObject2.put(JsbMapKeyNames.H5_PROVIDER_SERVICE, adProvider.getServiceArea());
                                jSONObject2.put(JsbMapKeyNames.H5_PROVIDER_URL, adProvider.getPrivacyPolicyUrl());
                            }
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put(JsbMapKeyNames.H5_CONSENT_ADPROVIDERS, jSONArray);
                    j.a(remoteCallResultCallback, af.this.f19295a, 1000, jSONObject.toString(), true);
                } catch (Throwable unused) {
                    j.a(remoteCallResultCallback, af.this.f19295a, IEventListener.EVENT_ID_DEVICE_SCAN_FINISH, "consent info is null", true);
                }
            }

            public void onFail(String str2) {
                j.a(remoteCallResultCallback, af.this.f19295a, IEventListener.EVENT_ID_DEVICE_SCAN_FINISH, str2, true);
            }
        });
    }

    public af() {
        super("pps.consent.query");
    }
}
