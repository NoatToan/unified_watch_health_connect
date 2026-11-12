package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.hms.ads.consent.inter.Consent;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ag extends j {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        Consent.getInstance(context).setUnderAgeOfPromise(new JSONObject(str).optInt(JsbMapKeyNames.H5_CONSENT_PROMISE, 0) == 1);
        b(remoteCallResultCallback, true);
    }

    public ag() {
        super("pps.set.consentpromise");
    }
}
