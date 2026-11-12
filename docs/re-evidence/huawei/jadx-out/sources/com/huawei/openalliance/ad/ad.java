package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.jsb.inner.data.JsbCallBackData;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ad extends ab {

    static class a implements com.huawei.openalliance.ad.inter.listeners.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RemoteCallResultCallback<String> f18213b;

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void e() {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void f() {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void d() {
            j.a(this.f18213b, this.f18212a, 1000, new JsbCallBackData(null, true, "interstitial.cb.close"));
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void c() {
            j.a(this.f18213b, this.f18212a, 1000, new JsbCallBackData(null, false, "interstitial.cb.completed"));
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void b() {
            j.a(this.f18213b, this.f18212a, 1000, new JsbCallBackData(null, false, "interstitial.cb.click"));
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void a(int i, int i2) {
            j.a(this.f18213b, this.f18212a, 200, new JsbCallBackData(Integer.valueOf(i), false, "interstitial.cb.error"));
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void a() {
            j.a(this.f18213b, this.f18212a, 1000, new JsbCallBackData(null, false, "interstitial.cb.show"));
        }

        a(RemoteCallResultCallback<String> remoteCallResultCallback, String str) {
            this.f18213b = remoteCallResultCallback;
            this.f18212a = str;
        }
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB == null) {
            a(remoteCallResultCallback, this.f19295a, 3002, null, true);
            return;
        }
        com.huawei.openalliance.ad.inter.data.d dVarA = pf.a(context, contentRecordB);
        if (dVarA == null) {
            hw.b("JsbStartInterstitialAdActivity", "ad is null, start activity failed");
            a(remoteCallResultCallback, this.f19295a, 3002, null, true);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(JsbMapKeyNames.H5_CUSTOM_DATA);
            String strOptString2 = jSONObject.optString(JsbMapKeyNames.H5_USER_ID);
            String strOptString3 = jSONObject.optString("muted");
            boolean zOptBoolean = jSONObject.optBoolean(JsbMapKeyNames.H5_INTERSTITIAL_DATA_ALERTS, true);
            if (!TextUtils.isEmpty(strOptString)) {
                dVarA.setCustomData(strOptString);
            }
            if (!TextUtils.isEmpty(strOptString2)) {
                dVarA.setUserId(strOptString2);
            }
            dVarA.f(com.huawei.openalliance.ad.utils.dv.a(contentRecordB, strOptString3));
            dVarA.h(zOptBoolean);
            dVarA.i(true);
        } catch (Throwable unused) {
            hw.c("JsbStartInterstitialAdActivity", "content parse error");
        }
        dVarA.a(new a(remoteCallResultCallback, this.f19295a));
        ca.a(a(context), dVarA);
        b(remoteCallResultCallback, false);
    }

    public ad() {
        super("pps.activity.interstitial");
    }
}
