package com.huawei.hms.support.api.safetydetect.p001default;

import android.content.Context;
import com.huawei.hms.support.api.entity.safetydetect.UrlCheckResponse;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class a0 extends a<UrlCheckResponse> {
    @Override // com.huawei.hms.support.api.safetydetect.p001default.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UrlCheckResponse a(String str, int i, String str2) throws s {
        try {
            return new UrlCheckResponse(str);
        } catch (JSONException e) {
            throw new s(e.getLocalizedMessage());
        }
    }

    public a0(Context context, String str, String str2, boolean z) {
        super(context, str, str2, z);
    }
}
