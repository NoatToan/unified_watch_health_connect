package com.huawei.hms.support.api.safetydetect.p001default;

import android.content.Context;
import com.huawei.hms.support.api.entity.safetydetect.MaliciousAppsListResp;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class h extends a<MaliciousAppsListResp> {
    @Override // com.huawei.hms.support.api.safetydetect.p001default.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaliciousAppsListResp a(String str, int i, String str2) throws s {
        try {
            MaliciousAppsListResp maliciousAppsListResp = new MaliciousAppsListResp(str);
            maliciousAppsListResp.setRtnCode(i);
            maliciousAppsListResp.setErrorReason(str2);
            return maliciousAppsListResp;
        } catch (JSONException e) {
            throw new s(e.getLocalizedMessage());
        }
    }

    public h(Context context, String str, String str2, boolean z) {
        super(context, str, str2, z);
    }
}
