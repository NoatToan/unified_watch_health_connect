package com.huawei.hms.hwid;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.utils.Util;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class w extends HuaweiApi<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Api<a> f13567a = new Api<>(HuaweiApiAvailability.HMS_API_NAME_GAME);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f13568c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f13569b;

    public static class a implements Api.ApiOptions.Optional {
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 1;
    }

    public w(Context context) {
        super(context, f13567a, f13568c, new v());
        this.f13569b = context;
    }

    public void a() {
        ar.b("SignInNoticeClientImpl", "request Jos Notice.", true);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("noticeType", 1);
            jSONObject.put("hmsSdkVersionName", "6.13.0.303");
            jSONObject.put("cpId", Util.getCpId(this.f13569b));
            doWrite(new ae(CoreNaming.GETNOTICE, jSONObject.toString(), ""));
        } catch (JSONException unused) {
            ar.c("SignInNoticeClientImpl", "createParams Notice request meet JSONException.", true);
        }
    }
}
