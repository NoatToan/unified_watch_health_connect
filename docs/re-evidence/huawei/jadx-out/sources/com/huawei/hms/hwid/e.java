package com.huawei.hms.hwid;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.utils.Util;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class e extends HuaweiApi<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Api<a> f13557a = new Api<>(HuaweiApiAvailability.HMS_API_NAME_GAME);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f13558c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f13559b;

    public static class a implements Api.ApiOptions.Optional {
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 1;
    }

    public e(Context context) {
        super(context, f13557a, f13558c, new d());
        this.f13559b = context;
    }

    public void a() {
        ar.b("AccountSignInNoticeClientImpl", "request Jos Notice.", true);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("noticeType", 1);
            jSONObject.put("hmsSdkVersionName", "6.13.0.303");
            jSONObject.put("cpId", Util.getCpId(this.f13559b));
            doWrite(new k(CoreNaming.GETNOTICE, jSONObject.toString(), ""));
        } catch (JSONException unused) {
            ar.c("AccountSignInNoticeClientImpl", "createParams Notice request meet JSONException.", true);
        }
    }
}
