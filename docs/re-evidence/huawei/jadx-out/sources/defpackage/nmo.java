package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hwidauth.api.ResultCallBack;
import com.huawei.hwidauth.c.j;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.hwidauth.ui.WebViewActivity;
import com.huawei.openalliance.ad.constant.VastAttribute;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nmo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f43285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43286c;
    private String d;
    private String e;
    private String f;
    private nnk g;
    private ResultCallBack<nmu> h;

    private nmo(Activity activity, String str, String str2, String str3, String str4, String str5, ResultCallBack<nmu> resultCallBack) {
        this.f43285b = activity;
        this.d = str;
        this.f43284a = str2;
        this.f43286c = str4;
        this.e = str3;
        this.f = str5;
        this.h = resultCallBack;
        nom.c(resultCallBack);
    }

    public void e(String str, String str2, boolean z) throws nmr {
        Activity activity = this.f43285b;
        if (activity == null || activity.isFinishing()) {
            throw new nmr("Actvity status invalid");
        }
        if (TextUtils.isEmpty(str)) {
            throw new nmr("grsAppName is empty");
        }
        if (TextUtils.isEmpty(this.d)) {
            throw new nmr("Appid is null");
        }
        if (TextUtils.isEmpty(this.e)) {
            throw new nmr("RedirectUri is null");
        }
        if (this.h == null) {
            throw new nmr("ResultResultCallBack is null");
        }
        if (TextUtils.isEmpty(this.f43286c)) {
            throw new nmr("deviceInfo is null");
        }
        nox.b("HuaWeiIdSignInClient", "signIn", true);
        noj.b(this.f43285b, 907115001, 0, "signOAuth start", noj.b(), "accountPickerH5.signIn_v2", "api_entry");
        if (!TextUtils.isEmpty(str2)) {
            this.g = nnk.a();
            e(str, str2, z, "");
        } else {
            e(str, (String) null, "");
        }
    }

    public void c(String str) throws nmr {
        Activity activity = this.f43285b;
        if (activity == null || activity.isFinishing()) {
            throw new nmr("Actvity status invalid");
        }
        if (TextUtils.isEmpty(str)) {
            throw new nmr("grsAppName is empty");
        }
        if (TextUtils.isEmpty(this.d)) {
            throw new nmr("Appid is null");
        }
        if (TextUtils.isEmpty(this.e)) {
            throw new nmr("RedirectUri is null");
        }
        if (this.h == null) {
            throw new nmr("ResultResultCallBack is null");
        }
        if (TextUtils.isEmpty(this.f43286c)) {
            throw new nmr("deviceInfo is null");
        }
        nox.b("HuaWeiIdSignInClient", "signIn", true);
        noj.b(this.f43285b, 907115001, 0, "signOAuth start", noj.b(), "accountPickerH5.signIn_v2", "api_entry");
        e(str, (String) null, "");
    }

    private void e(final String str, final String str2, final boolean z, final String str3) {
        nox.b("HuaWeiIdSignInClient", "doRequest init.", true);
        this.g.b(this.f43285b.getApplicationContext(), str, new nnc(this.f43285b.getApplicationContext(), this.d, str2, this.f43284a, this.e), new j() { // from class: nmo.2
            @Override // com.huawei.hwidauth.c.j
            public void onSuccess(String str4) {
                nox.b("HuaWeiIdSignInClient", "onSuccess response = " + str4, false);
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str4);
                        if (jSONObject.has("code")) {
                            String string = jSONObject.getString("code");
                            nmo nmoVar = nmo.this;
                            nmoVar.b(200, "success", string, nmoVar.h, str3);
                            return;
                        } else {
                            if (jSONObject.has(VastAttribute.ERROR) && "1301".equals(jSONObject.getString(VastAttribute.ERROR))) {
                                nox.b("HuaWeiIdSignInClient", "unauthorized_code startWebViewActivity", true);
                                nmo.this.e(str, str2, str3);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException unused) {
                        nox.a("HuaWeiIdSignInClient", "JSONException", true);
                        nmo nmoVar2 = nmo.this;
                        nmoVar2.b(-1, "User cancel", "", nmoVar2.h, str3);
                        return;
                    }
                }
                nox.b("HuaWeiIdSignInClient", "onSuccess response empty", true);
                nmo nmoVar3 = nmo.this;
                nmoVar3.b(-1, "User cancel", "", nmoVar3.h, str3);
            }

            @Override // com.huawei.hwidauth.c.j
            public void onFailure(int i, String str4) {
                nox.b("HuaWeiIdSignInClient", "onFailure, errorCode is " + i, true);
                nmo.this.c(str, i, str4, str2, z, str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, int i, String str2, String str3, boolean z, String str4) {
        nox.b("HuaWeiIdSignInClient", "dealFailRequestResult errorCode = " + i, true);
        nox.b("HuaWeiIdSignInClient", "dealFailRequestResult errorContent = " + str2, false);
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String string = new JSONObject(str2).getString(VastAttribute.ERROR);
            if ("1301".equals(string)) {
                nox.b("HuaWeiIdSignInClient", "unauthorized_code startWebViewActivity", true);
                e(str, str3, str4);
                return;
            }
            if ("1203".equals(string)) {
                nox.b("HuaWeiIdSignInClient", "token revoked startWebViewActivity", true);
                if (z) {
                    e(str, "", str4);
                    return;
                }
                noj.b(this.f43285b, 907115001, 404, "Access Token is Invalid", str4, "accountPickerH5.signIn_v2", "api_ret");
                this.h.onResult(new nmu("", new nms(2008, "Access Token is Invalid")));
                return;
            }
            nox.b("HuaWeiIdSignInClient", "dealFailRequestResult other error", true);
            noj.b(this.f43285b, 907115001, 404, "signOAuth fail", str4, "accountPickerH5.signIn_v2", "api_ret");
            this.h.onResult(new nmu("", new nms(2003, AuthInternalPickerConstant.PARAM_ERROR)));
        } catch (JSONException unused) {
            nox.a("HuaWeiIdSignInClient", "JSONException ", true);
            b(i, "User cancel", "", this.h, str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2, String str3) {
        try {
            Intent intent = new Intent(this.f43285b, (Class<?>) WebViewActivity.class);
            intent.putExtra("key_redirecturi", this.e);
            intent.putExtra("key_app_id", this.d);
            intent.putExtra("key_scopes", this.f43284a);
            intent.putExtra("key_transId", str3);
            intent.putExtra("key_oper", "from_signin");
            intent.putExtra("key_device_info", (Parcelable) DeviceInfo.a(this.f43285b, this.f43286c));
            intent.putExtra("key_extends_param", this.f);
            intent.putExtra("grs_app_name", str);
            if (!TextUtils.isEmpty(str2)) {
                nox.b("HuaWeiIdSignInClient", "accessToken not empty", true);
                intent.putExtra("key_access_token", str2);
            }
            this.f43285b.startActivity(intent);
        } catch (IllegalArgumentException e) {
            nox.a("HuaWeiIdSignInClient", "IllegalArgumentException", true);
            noj.b(this.f43285b, 907115001, 404, "IllegalArgumentException:" + e.getMessage(), str3, "accountPickerH5.signIn_v2", "api_ret");
        } catch (RuntimeException e2) {
            nox.a("HuaWeiIdSignInClient", "RuntimeException", true);
            noj.b(this.f43285b, 907115001, 404, "RuntimeException:" + e2.getMessage(), str3, "accountPickerH5.signIn_v2", "api_ret");
        } catch (Exception e3) {
            nox.a("HuaWeiIdSignInClient", "Exception", true);
            noj.b(this.f43285b, 907115001, 404, "Exception:" + e3.getMessage(), str3, "accountPickerH5.signIn_v2", "api_ret");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str, String str2, ResultCallBack<nmu> resultCallBack, String str3) {
        if (resultCallBack != null) {
            nms nmsVar = new nms(i, str);
            if (200 == i) {
                nmsVar.d(true);
                noj.b(this.f43285b, 907115001, 200, "signOAuth ok", str3, "accountPickerH5.signIn_v2", "api_ret");
            } else {
                nmsVar.d(false);
                noj.b(this.f43285b, 907115001, 404, "signOAuth fail", str3, "accountPickerH5.signIn_v2", "api_ret");
            }
            resultCallBack.onResult(new nmu(str2, nmsVar));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Activity f43290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f43291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f43292c;
        private String d;
        private String e;
        private String f;
        private ResultCallBack<nmu> j;

        public c(Activity activity) {
            this.f43290a = activity;
        }

        public c c(String str) {
            this.f43292c = str;
            return this;
        }

        public c b(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                this.d = "";
                return this;
            }
            StringBuilder sb = new StringBuilder();
            nox.b("HuaWeiIdSignInClient", "scopes length " + strArr.length, true);
            for (String str : strArr) {
                sb.append(str);
                sb.append(" ");
            }
            this.d = sb.toString();
            return this;
        }

        public c b(String str) {
            this.f43291b = str;
            return this;
        }

        public c e(String str) {
            this.e = str;
            return this;
        }

        public c a(String str) {
            this.f = str;
            return this;
        }

        public c a(ResultCallBack<nmu> resultCallBack) {
            this.j = resultCallBack;
            return this;
        }

        public nmo a() {
            return new nmo(this.f43290a, this.f43292c, this.d, this.f43291b, this.e, this.f, this.j);
        }
    }
}
