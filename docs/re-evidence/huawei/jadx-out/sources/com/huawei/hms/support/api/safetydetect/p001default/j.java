package com.huawei.hms.support.api.safetydetect.p001default;

import android.content.Context;
import com.huawei.hms.support.api.entity.safetydetect.WifiDetectResponse;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class j extends a<WifiDetectResponse> {
    @Override // com.huawei.hms.support.api.safetydetect.p001default.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public WifiDetectResponse a(String str, int i, String str2) throws s {
        try {
            WifiDetectResponse wifiDetectResponse = new WifiDetectResponse(str);
            wifiDetectResponse.setRtnCode(i);
            wifiDetectResponse.setErrorReason(str2);
            return wifiDetectResponse;
        } catch (JSONException e) {
            throw new s(e.getLocalizedMessage());
        }
    }

    public j(Context context, String str, String str2, boolean z) {
        super(context, str, str2, z);
    }
}
