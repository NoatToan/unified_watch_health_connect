package com.huawei.hms.support.api.safetydetect.p001default;

import android.content.Context;
import com.huawei.hms.support.api.entity.safetydetect.UserDetectResponse;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class c0 extends a<UserDetectResponse> {
    @Override // com.huawei.hms.support.api.safetydetect.p001default.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UserDetectResponse a(String str, int i, String str2) throws s {
        try {
            return new UserDetectResponse(str);
        } catch (JSONException e) {
            throw new s(e.getLocalizedMessage());
        }
    }

    public c0(Context context, String str, String str2, boolean z) {
        super(context, str, str2, z);
    }
}
