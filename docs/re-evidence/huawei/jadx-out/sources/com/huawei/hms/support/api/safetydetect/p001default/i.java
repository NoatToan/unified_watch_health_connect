package com.huawei.hms.support.api.safetydetect.p001default;

import android.content.Context;
import com.huawei.hms.support.api.entity.safetydetect.RiskTokenResponse;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class i extends a<RiskTokenResponse> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f16562c;

    @Override // com.huawei.hms.support.api.safetydetect.p001default.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RiskTokenResponse a(String str, int i, String str2) throws s {
        try {
            RiskTokenResponse riskTokenResponse = new RiskTokenResponse(str);
            q.a(this.f16562c, str);
            return riskTokenResponse;
        } catch (JSONException e) {
            throw new s(e.getLocalizedMessage());
        }
    }

    public i(Context context, String str, String str2, boolean z) {
        super(context, str, str2, z);
        this.f16562c = context;
    }
}
