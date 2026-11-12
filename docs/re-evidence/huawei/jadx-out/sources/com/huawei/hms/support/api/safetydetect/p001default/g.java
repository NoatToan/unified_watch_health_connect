package com.huawei.hms.support.api.safetydetect.p001default;

import android.content.Context;
import com.huawei.hms.support.api.entity.safetydetect.VerifyAppsCheckEnabledResp;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class g extends a<VerifyAppsCheckEnabledResp> {
    @Override // com.huawei.hms.support.api.safetydetect.p001default.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public VerifyAppsCheckEnabledResp a(String str, int i, String str2) throws s {
        try {
            VerifyAppsCheckEnabledResp verifyAppsCheckEnabledResp = new VerifyAppsCheckEnabledResp(str);
            verifyAppsCheckEnabledResp.setRtnCode(i);
            verifyAppsCheckEnabledResp.setErrorReason(str2);
            return verifyAppsCheckEnabledResp;
        } catch (JSONException e) {
            throw new s(e.getLocalizedMessage());
        }
    }

    public g(Context context, String str, String str2, boolean z) {
        super(context, str, str2, z);
    }
}
