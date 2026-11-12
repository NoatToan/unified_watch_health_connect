package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.GmsVersion;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealth.dictionary.model.HealthDataMergePolicy;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import com.huawei.hwidauth.api.Result;
import com.huawei.hwidauth.api.ResultCallBack;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.hwidauth.h.a;
import com.huawei.hwidauth.ui.WebViewActivity;
import com.huawei.hwidauth.ui.f;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.secure.android.common.encrypt.hash.SHA;
import com.huawei.secure.android.common.encrypt.rsa.RSAEncrypt;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.secure.android.common.util.EncodeUtil;
import com.huawei.secure.android.common.util.SafeBase64;
import com.huawei.secure.android.common.webview.SafeWebView;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class nog extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43349a;
    private String aa;
    private String ab;
    private boolean ac;
    private String ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43350b;
    private String d;
    private f.b e;
    private String j;
    private String k;
    private String l;
    private DeviceInfo m;
    private String n;
    private String o;
    private Context p;
    private int q;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;
    private String h = "";
    private String f = "";
    private String g = "";
    private String i = "";
    private String r = "0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43351c = false;

    public nog(f.b bVar, Context context) {
        this.e = bVar;
        this.p = context;
    }

    public void a(String str) {
        this.ab = str;
    }

    @Override // com.huawei.hwidauth.ui.b
    public void init(SafeIntent safeIntent) {
        nox.b("WebViewPresenter", "init", true);
        Bundle extras = safeIntent.getExtras();
        if (extras == null) {
            nox.a("WebViewPresenter", "Excepton：bundle null", true);
            d(404, "parse intent exception", "");
        } else {
            e(new SafeBundle(extras), safeIntent);
            nox.b("WebViewPresenter", "init end", true);
        }
    }

    private void e(SafeBundle safeBundle, SafeIntent safeIntent) {
        try {
            this.h = safeBundle.getString("key_app_id");
            this.f = safeBundle.getString("key_scopes");
            this.g = safeBundle.getString("key_access_token");
            this.j = safeBundle.getString("key_redirecturi", "");
            this.i = safeBundle.getString("key_oper", "");
            this.z = safeIntent.getStringExtra("key_pickerSignIn");
            this.m = (DeviceInfo) safeBundle.getParcelable("key_device_info", DeviceInfo.class);
            this.o = safeBundle.getString("key_qr_code");
            this.q = safeBundle.getInt("key_qr_siteid");
            this.s = safeBundle.getString("key_qr_code_source", "");
            this.r = safeBundle.getString("key_check_password_type");
            this.w = safeBundle.getString("key_extends_param");
            this.n = safeBundle.getString("key_cp_login_url");
            this.k = safeBundle.getString("key_login_mode");
            this.v = safeBundle.getString("reqClientType");
            this.aa = safeBundle.getString("key_uid");
            this.l = safeBundle.getString("key_transId");
            this.ad = safeBundle.getString("key_code_verifier");
            this.f43351c = safeBundle.getBoolean("key_mcp_signIn");
            this.ac = safeBundle.getBoolean("independentAuthorization", false);
            this.f43350b = safeBundle.getString("user_code");
            this.f43349a = safeBundle.getString("verification_url");
            this.d = safeBundle.getString("grs_app_name");
            l();
            if (TextUtils.isEmpty(this.i) || !"from_qr_authorize".equals(this.i)) {
                s();
            }
        } catch (RuntimeException unused) {
            nox.a("WebViewPresenter", "RuntimeException：parse intent", true);
            d(404, "parse intent exception", "");
        } catch (Exception unused2) {
            nox.a("WebViewPresenter", "Exception：parse intent", true);
            d(404, "parse intent exception", "");
        }
    }

    private void l() {
        nox.b("WebViewPresenter", "parsingExtendsParam mExtendsParam =" + this.w, false);
        if (TextUtils.isEmpty(this.w)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.w);
            if (jSONObject.has("countryCode")) {
                this.x = jSONObject.getString("countryCode");
            }
            if (jSONObject.has("phoneNumber")) {
                this.u = jSONObject.getString("phoneNumber");
            }
            if (jSONObject.has("reqClientType")) {
                this.v = jSONObject.getString("reqClientType");
            }
            if (jSONObject.has("loginChannel")) {
                this.y = jSONObject.getString("loginChannel");
            }
        } catch (JSONException unused) {
            nox.a("WebViewPresenter", "parsingExtendsParam Exception", true);
            d(404, "parse intent exception", "");
        }
    }

    private String m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ED", this.t);
        } catch (JSONException unused) {
            nox.a("WebViewPresenter", "JSONException_ed", true);
        }
        return jSONObject.toString();
    }

    private String k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("D", q());
        } catch (JSONException unused) {
            nox.a("WebViewPresenter", "JSONException_d", true);
        }
        return jSONObject.toString();
    }

    private String e(String str, String str2) throws UnsupportedEncodingException {
        return "LOGIN_MODE_HUAWEI_UNITE_ID".equals(this.k) ? a.a().a() : a.a().b() + "?reqClientType=" + this.v + npi.g(this.p) + "&loginChannel=7000000&displayType=2&clientID=" + this.h + "&lang=" + str.toLowerCase(Locale.getDefault()) + "&service=" + URLEncoder.encode(str2 + "?reqClientType=" + this.v + npi.g(this.p), "UTF-8");
    }

    public String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(this.v)) {
            this.v = "7";
        }
        try {
            sb.append("ext_clientInfo=");
            sb.append(y());
            sb.append(npi.g(this.p));
            sb.append("&loginUrl=");
            sb.append(URLEncoder.encode(e(str, str2), "UTF-8"));
            sb.append("&service=");
            sb.append(URLEncoder.encode(str2 + "?reqClientType=" + this.v + npi.g(this.p) + "&loginChannel=7000000&service=" + URLEncoder.encode(nnm.c().e(this.p), "UTF-8") + "&displayType=2&lang=" + str.toLowerCase(Locale.getDefault()), "UTF-8"));
            sb.append("&loginChannel=");
            sb.append(GmsVersion.VERSION_ORLA);
            sb.append("&reqClientType=");
            sb.append(Integer.parseInt(this.v));
            sb.append("&lang=");
            sb.append(URLEncoder.encode(str.toLowerCase(Locale.getDefault()), "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            sb = new StringBuilder();
        } catch (RuntimeException unused2) {
            sb = new StringBuilder();
        } catch (Exception unused3) {
            sb = new StringBuilder();
        }
        nox.b("WebViewPresenter", "centerUrlData：" + ((Object) sb), false);
        return sb.toString();
    }

    public String b(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("loginUrl=");
            sb.append(URLEncoder.encode(a.a().b() + "?reqClientType=7&loginChannel=7000000&displayType=2&clientID=" + this.h + "&lang=" + str.toLowerCase(Locale.getDefault()) + npi.g(this.p), "UTF-8"));
            sb.append("&service=");
            sb.append(URLEncoder.encode(a.a().d() + "?reqClientType=7&loginChannel=7000000&service=" + URLEncoder.encode(nnm.c().e(this.p), "UTF-8") + "&displayType=2&lang=" + str.toLowerCase(Locale.getDefault()) + npi.g(this.p), "UTF-8"));
            sb.append("&loginChannel=");
            sb.append(GmsVersion.VERSION_ORLA);
            sb.append("&reqClientType=");
            sb.append(7);
            sb.append("&accessToken=");
            sb.append(URLEncoder.encode(this.g, "UTF-8"));
            sb.append("&lang=");
            sb.append(URLEncoder.encode(str.toLowerCase(Locale.getDefault()), "UTF-8"));
            sb.append("&appID=");
            sb.append(this.h);
            sb.append(npi.g(this.p));
        } catch (UnsupportedEncodingException unused) {
            sb = new StringBuilder();
        } catch (Exception unused2) {
            sb = new StringBuilder();
        }
        nox.b("WebViewPresenter", "authAppListUrlData：" + ((Object) sb), false);
        return sb.toString();
    }

    public String c(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("ext_clientInfo=");
            sb.append(y());
            sb.append("&chkType=");
            sb.append(this.r);
            sb.append("&reqClientType=7");
            sb.append("&lang=");
            sb.append(URLEncoder.encode(str.toLowerCase(Locale.getDefault()), "UTF-8"));
            sb.append(npi.g(this.p));
        } catch (UnsupportedEncodingException unused) {
            sb = new StringBuilder();
        }
        nox.b("WebViewPresenter", "verifyPasswordData：" + ((Object) sb), false);
        return sb.toString();
    }

    public String e(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("loginUrl=");
            sb.append(URLEncoder.encode(a.a().b() + "?reqClientType=7&loginChannel=7000000&displayType=2&clientID=" + this.h + "&lang=" + str.toLowerCase(Locale.getDefault()) + npi.g(this.p), "UTF-8"));
            sb.append("&service=");
            sb.append(nnm.c().h(this.p));
            sb.append("&loginChannel=");
            sb.append(GmsVersion.VERSION_ORLA);
            sb.append("&reqClientType=");
            sb.append(7);
            sb.append("&lang=");
            sb.append(URLEncoder.encode(str.toLowerCase(Locale.getDefault()), "UTF-8"));
            sb.append("&appID=");
            sb.append(this.h);
            sb.append("&qrSiteID=");
            sb.append(this.q);
            sb.append("&qrCode=");
            sb.append(this.o);
            sb.append(npi.g(this.p));
            if (!TextUtils.isEmpty(this.s)) {
                sb.append("&qrCodeSource=");
                sb.append(this.s);
            }
        } catch (UnsupportedEncodingException unused) {
            sb = new StringBuilder();
        } catch (Exception unused2) {
            sb = new StringBuilder();
        }
        nox.b("WebViewPresenter", "qrLoginUrlData：" + ((Object) sb), false);
        return sb.toString();
    }

    public String c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("code=");
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append("&state=");
            sb.append(URLEncoder.encode(str2, "UTF-8"));
            if (!TextUtils.isEmpty(nom.x())) {
                sb.append("&queryParam=");
                sb.append(URLEncoder.encode(nom.x(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
            sb = new StringBuilder();
        } catch (Exception unused2) {
            sb = new StringBuilder();
        }
        nox.b("WebViewPresenter", "centerUrlData：" + ((Object) sb), false);
        return sb.toString();
    }

    public String d() {
        return this.i;
    }

    public void e() {
        try {
            nox.b("WebViewPresenter", "get urlMap from grs Cluster", true);
            Map<String, String> mapA = nmj.d().a(this.p, this.d, "com.huawei.cloud.hwid");
            if (mapA != null) {
                c(mapA);
            } else {
                nox.a("WebViewPresenter", "urlMap null", true);
                d(6, "User cancel", "");
            }
        } catch (NoClassDefFoundError unused) {
            nox.a("WebViewPresenter", "NoClassDefFoundError", true);
            d(6, "User cancel", "");
        }
    }

    private void c(Map<String, String> map) {
        String strB;
        nox.b("WebViewPresenter", "handleGrsUrlMap start.", true);
        nox.b("WebViewPresenter", "get hw domain.", true);
        if ("scan_code_login".equalsIgnoreCase(this.i)) {
            strB = b(this.q, map);
        } else {
            strB = map.get("CASDomainUrl");
        }
        String str = map.get("CASDomainUrl");
        String str2 = map.get("CASGetResourceUrl");
        String str3 = map.get("CASAuthorizeUrl");
        String str4 = map.get("GwSilentCodeUrl");
        String str5 = map.get("Root");
        if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            nox.a("WebViewPresenter", "url is empty exit", true);
            d(6, "User cancel", "");
            return;
        }
        a(strB, str, str2, str3, str4, str5);
        a.a().a(strB, str2, str3);
        nox.b("WebViewPresenter", "initDomainUrlAndLoadUrl", true);
        if (TextUtils.isEmpty(nom.t()) || non.c(nom.r()).booleanValue()) {
            c(true);
            n();
        } else {
            c(false);
        }
    }

    private void n() {
        nox.b("WebViewPresenter", "executeGetResourceRequest==", true);
        String strQ = noc.o().q();
        if (TextUtils.isEmpty(strQ)) {
            nox.a("WebViewPresenter", "getResourceUrl is null.", true);
            d(6, "User cancel", "");
            return;
        }
        nnf nnfVar = new nnf(this.p, "casLogin");
        String str = strQ + nnfVar.c();
        nox.b("WebViewPresenter", "executeGetResourceRequest:" + str, false);
        new nof(nnfVar, this.p, str, new com.huawei.hwidauth.g.f.a() { // from class: nog.3
            @Override // com.huawei.hwidauth.g.f.a
            public void a(SafeBundle safeBundle) {
                nog.this.c(safeBundle);
            }

            @Override // com.huawei.hwidauth.g.f.a
            public void a(int i, String str2) {
                nog.this.e.a(i, str2);
            }
        }).a();
    }

    public void d(String str) {
        nna nnaVar = new nna(this.p, str, "0", "");
        String strQ = noc.o().q();
        if (TextUtils.isEmpty(strQ)) {
            nox.a("WebViewPresenter", "getResourceUrl is null.", true);
            this.e.a(d("1", "9999"));
            return;
        }
        String str2 = strQ + nnaVar.c();
        e(nnaVar);
        nox.b("WebViewPresenter", "getDeviceAuthCode:" + str2, false);
        new nob(nnaVar, this.p, str2, new com.huawei.hwidauth.g.f.a() { // from class: nog.1
            @Override // com.huawei.hwidauth.g.f.a
            public void a(SafeBundle safeBundle) {
                nog.this.a(safeBundle);
            }

            @Override // com.huawei.hwidauth.g.f.a
            public void a(int i, String str3) {
                nog.this.e.a(nog.this.d("1", "9999"));
            }
        }).a();
    }

    private String b(int i, Map<String, String> map) {
        String strC;
        nox.b("WebViewPresenter", "dealScanRequestUrl start.", true);
        if (i <= 0) {
            strC = "";
        } else {
            strC = nnm.c().c(this.p, i);
        }
        return (TextUtils.isEmpty(strC) || "https://".equals(strC)) ? map.get("CASDomainUrl") : strC;
    }

    private void a(String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb = new StringBuilder("get domain url from grs mainDomainUrl size:");
        sb.append(str == null ? 0 : str.length());
        nox.b("WebViewPresenter", sb.toString(), true);
        StringBuilder sb2 = new StringBuilder("get domain url from grs cASDomainUrl size:");
        sb2.append(str2 == null ? 0 : str2.length());
        nox.b("WebViewPresenter", sb2.toString(), true);
        StringBuilder sb3 = new StringBuilder("get domain url from grs authorizeUrl size:");
        sb3.append(str4 == null ? 0 : str4.length());
        nox.b("WebViewPresenter", sb3.toString(), true);
        StringBuilder sb4 = new StringBuilder("get domain url from grs getResourceUrl size:");
        sb4.append(str3 == null ? 0 : str3.length());
        nox.b("WebViewPresenter", sb4.toString(), true);
        StringBuilder sb5 = new StringBuilder("get domain url from grs gwSilentCodeUrl size:");
        sb5.append(str5 == null ? 0 : str5.length());
        nox.b("WebViewPresenter", sb5.toString(), true);
        StringBuilder sb6 = new StringBuilder("get domain url from grs root ");
        sb6.append(str6 != null ? str6.length() : 0);
        nox.b("WebViewPresenter", sb6.toString(), true);
    }

    public HashMap<String, String> j(String str) {
        nox.b("WebViewPresenter", "getHeaders start.", true);
        HashMap<String, String> map = new HashMap<>();
        map.put("X-Huawei-Client-Info", l(str));
        return map;
    }

    public HashMap<String, String> h(String str) {
        nox.b("WebViewPresenter", "getQrCodeHeaders start.", true);
        HashMap<String, String> map = new HashMap<>();
        map.put("X-Huawei-Client-Info", l(str));
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + this.g);
        return map;
    }

    public HashMap<String, String> c() {
        nox.b("WebViewPresenter", "getVerifyPasswordHeaders start.", true);
        HashMap<String, String> map = new HashMap<>();
        map.put("srcAppVersion", "");
        map.put("srcAppName", this.p.getPackageName());
        return map;
    }

    public HashMap<String, String> i(String str) {
        nox.b("WebViewPresenter", "getSignInHeaders start.", true);
        HashMap<String, String> map = new HashMap<>();
        map.put("X-Huawei-Client-Info", l(str));
        if (TextUtils.isEmpty(this.g)) {
            return map;
        }
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + this.g);
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if (r9 < 216000) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String f(String str) {
        StringBuilder sb;
        String strP = p();
        String strA = a(str, strP);
        if (!this.ac && TextUtils.isEmpty(this.g)) {
            boolean zB = nnu.a(this.p).b("getSignInCode", false);
            nox.b("WebViewPresenter", "getSignInUrl  hasGetCode= " + zB, true);
            if (zB) {
                long jCurrentTimeMillis = System.currentTimeMillis() - nnu.a(this.p).c("getSignInCodeTime", 0L);
                nox.b("WebViewPresenter", "getSignInUrl  midTime= " + jCurrentTimeMillis, true);
                if (jCurrentTimeMillis > 0) {
                }
            }
            try {
                sb = new StringBuilder(a.a().b());
                sb.append("?service");
                sb.append('=');
                sb.append(URLEncoder.encode(strA, "UTF-8"));
                sb.append("&lang=");
                sb.append(str);
                sb.append("&loginChannel=");
                sb.append(TextUtils.isEmpty(this.y) ? 70000 : this.y);
                sb.append("&reqClientType=");
                sb.append(TextUtils.isEmpty(this.v) ? 7 : this.v);
                sb.append("&clientID=");
                sb.append(URLEncoder.encode(this.h, "UTF-8"));
                sb.append(npi.g(this.p));
                if (!TextUtils.isEmpty(strP)) {
                    sb.append("&countryCode=");
                    sb.append(strP);
                }
            } catch (Exception e) {
                nox.a("WebViewPresenter", "Exception:" + e.getClass().getSimpleName(), true);
                sb = new StringBuilder();
            }
            return sb.toString();
        }
        return strA;
    }

    private String a(String str, String str2) {
        return c(new StringBuilder(a.a().f()), str2, str).toString();
    }

    private StringBuilder c(StringBuilder sb, String str, String str2) {
        try {
            sb.append("access_type=offline");
            sb.append('&');
            sb.append(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE);
            sb.append('=');
            sb.append("code");
            sb.append('&');
            sb.append("client_id");
            sb.append('=');
            sb.append(URLEncoder.encode(this.h, "UTF-8"));
            sb.append('&');
            sb.append("ui_locales");
            sb.append('=');
            sb.append(URLEncoder.encode(str2.toLowerCase(Locale.getDefault()), "UTF-8"));
            sb.append('&');
            sb.append(CommonConstant.ReqAccessTokenParam.REDIRECT_URI);
            sb.append('=');
            sb.append(URLEncoder.encode(this.j, "UTF-8"));
            sb.append('&');
            sb.append("state");
            sb.append('=');
            sb.append(URLEncoder.encode(nph.d(), "UTF-8"));
            String str3 = this.f;
            if (this.ac) {
                sb.append("&independent_authorization=");
                sb.append("true");
            } else if (!str3.contains("openid")) {
                str3 = "openid " + str3;
            }
            if (!TextUtils.isEmpty(str3)) {
                sb.append('&');
                sb.append("scope");
                sb.append('=');
                sb.append(URLEncoder.encode(str3, "UTF-8"));
            }
            sb.append('&');
            sb.append("display");
            sb.append('=');
            sb.append("touch");
            sb.append('&');
            sb.append(Constants.NONCE);
            sb.append('=');
            sb.append(URLEncoder.encode(npd.a(), "UTF-8"));
            sb.append('&');
            sb.append("include_granted_scopes");
            sb.append('=');
            sb.append("true");
            sb.append('&');
            sb.append("uuid");
            sb.append('=');
            sb.append(this.m.e());
            sb.append(npi.g(this.p));
            if (!TextUtils.isEmpty(this.y)) {
                sb.append("&loginChannel=");
                sb.append(this.y);
            }
            if (!TextUtils.isEmpty(this.v)) {
                sb.append("&reqClientType=");
                sb.append(this.v);
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append("&countryCode=");
                sb.append(str);
            }
            sb.append("&cVersion=");
            sb.append("HwID_6.13.0.301");
            if (this.f43351c) {
                String strEncodeToString = SafeBase64.encodeToString(MessageDigest.getInstance("SHA-256").digest(this.ad.getBytes("ISO_8859_1")), 11);
                sb.append("&code_challenge=");
                sb.append(strEncodeToString);
                sb.append("&code_challenge_method=");
                sb.append("S256");
                if (!TextUtils.isEmpty(this.g)) {
                    sb.append("&auth_type=");
                    sb.append("1");
                }
                String strE = nph.e();
                if (TextUtils.isEmpty(strE)) {
                    strE = "unkown";
                }
                sb.append("&terminal-type=");
                sb.append(strE);
            }
            return sb;
        } catch (UnsupportedEncodingException e) {
            nox.a("WebViewPresenter", "UnsupportedEncodingException:" + e.getClass().getSimpleName(), true);
            return new StringBuilder();
        } catch (RuntimeException e2) {
            nox.a("WebViewPresenter", "RuntimeException:" + e2.getClass().getSimpleName(), true);
            return new StringBuilder();
        } catch (NoSuchAlgorithmException e3) {
            nox.a("WebViewPresenter", "NoSuchAlgorithmException:" + e3.getClass().getSimpleName(), true);
            return new StringBuilder();
        } catch (Exception e4) {
            nox.a("WebViewPresenter", "Exception:" + e4.getClass().getSimpleName(), true);
            return new StringBuilder();
        }
    }

    private String p() {
        if (!TextUtils.isEmpty(this.x)) {
            return this.x;
        }
        String strG = nnm.c().g(this.p.getApplicationContext());
        nox.b("WebViewPresenter", "countryIsoCoce:" + strG, false);
        return !TextUtils.isEmpty(strG) ? strG : "";
    }

    public String b() {
        return this.n;
    }

    public void a(SafeBundle safeBundle) {
        String strF;
        nox.b("WebViewPresenter", "handleRequestGetDevAuthCode ==", true);
        try {
            String string = safeBundle.getString("devAuthCode");
            String string2 = safeBundle.getString("devSecretKey");
            String string3 = safeBundle.getString("randomID");
            Context context = this.p;
            String strB = context instanceof Activity ? nov.b((Activity) context) : HealthDataMergePolicy.NONE;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("uuid", this.m.e());
            jSONObject.put("terminalType", this.m.b());
            jSONObject.put("deviceName", this.m.d());
            jSONObject.put("deviceType", this.m.c());
            jSONObject.put(DeviceInfo.TAG_DEVICE_ID, this.m.a());
            jSONObject.put("deviceAuthCode", string);
            jSONObject.put("loginStatus", "0");
            jSONObject.put("netType", strB);
            nox.b("WebViewPresenter", "GetDevAuthCode ==" + jSONObject.toString(), false);
            if (TextUtils.isEmpty(string2)) {
                strF = "";
            } else {
                strF = f(string2, jSONObject.toString());
            }
            jSONObject2.put("factors", strF);
            jSONObject2.put("randomID", string3);
            this.e.a(jSONObject2.toString());
        } catch (Exception unused) {
            nox.b("WebViewPresenter", "JSONException", true);
            this.e.a(d("1", "9999"));
        }
    }

    public String d(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("factors", "");
            jSONObject.put("randomID", "");
            jSONObject.put("phonestateperm", str);
            jSONObject.put(VastAttribute.ERROR, str2);
        } catch (JSONException unused) {
            nox.b("WebViewPresenter", "buildDefaultJson JSONException", true);
        }
        return jSONObject.toString();
    }

    private String f(String str, String str2) {
        try {
            return nmy.e(nop.b(str2), nop.b(str));
        } catch (InvalidAlgorithmParameterException unused) {
            nox.a("WebViewPresenter", "NoSuchPaddingException ", true);
            return "";
        } catch (InvalidKeyException unused2) {
            nox.a("WebViewPresenter", "InvalidKeyException ", true);
            return "";
        } catch (NoSuchAlgorithmException unused3) {
            nox.a("WebViewPresenter", "NoSuchAlgorithmException ", true);
            return "";
        } catch (BadPaddingException unused4) {
            nox.a("WebViewPresenter", "BadPaddingException ", true);
            return "";
        } catch (IllegalBlockSizeException unused5) {
            nox.a("WebViewPresenter", "IllegalBlockSizeException ", true);
            return "";
        } catch (NoSuchPaddingException unused6) {
            nox.a("WebViewPresenter", "NoSuchPaddingException ", true);
            return "";
        }
    }

    private void s() {
        p(r());
    }

    private String r() {
        if (this.m == null) {
            d(404, "parameter error DeviceInfo is null", "");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        String strH = h(this.m.a(), this.m.c());
        try {
            jSONObject.put("terminalType", this.m.b());
            jSONObject.put("deviceAliasName", this.m.d());
            jSONObject.put("deviceType", this.m.c());
            jSONObject.put(DeviceInfo.TAG_DEVICE_ID, this.m.a());
            if (!TextUtils.isEmpty(strH)) {
                jSONObject.put("deviceID2", strH);
            }
            jSONObject.put("uuid", this.m.e());
            Context context = this.p;
            jSONObject.put("netType", context instanceof Activity ? nov.b((Activity) context) : HealthDataMergePolicy.NONE);
        } catch (JSONException unused) {
            nox.b("WebViewPresenter", "JSONException", true);
            d(404, "parameter error DeviceInfo is error", "");
        }
        nox.b("WebViewPresenter", "getEDjson" + jSONObject.toString(), false);
        return jSONObject.toString();
    }

    private String h(String str, String str2) {
        if (str2.equals("8")) {
            return SHA.sha256Encrypt(str);
        }
        return "";
    }

    private String q() {
        if ("from_qr_authorize".equals(this.i)) {
            nox.b("WebViewPresenter", "mFrom is from_qr_authorize and deviceinfo is null", true);
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("terminalType", this.m.b());
            jSONObject.put("deviceAliasName", this.m.d());
        } catch (JSONException unused) {
            nox.b("WebViewPresenter", "JSONException", true);
        }
        nox.b("WebViewPresenter", "getDjson:" + jSONObject.toString(), false);
        return jSONObject.toString();
    }

    private String p(String str) {
        String strT = nom.t();
        if (!TextUtils.isEmpty(strT)) {
            try {
                byte[] bArrEncrypt = RSAEncrypt.encrypt(t(str), EncryptUtil.getPublicKey(strT));
                if (bArrEncrypt == null) {
                    nox.a("WebViewPresenter", "rsaJsonBytes null", false);
                    return "";
                }
                this.t = SafeBase64.encodeToString(bArrEncrypt, 2);
                nox.b("WebViewPresenter", "getJsonHeader  mRSAJsonStr " + this.t, false);
                return this.t;
            } catch (Exception e) {
                nox.a("WebViewPresenter", "Exception:" + e.getClass().getSimpleName(), true);
            }
        }
        return "";
    }

    private byte[] t(String str) {
        byte[] bArr = new byte[0];
        if (TextUtils.isEmpty(str)) {
            nox.a("WebViewPresenter", "data is empty", true);
            return bArr;
        }
        try {
            if (nos.j()) {
                return c(str.getBytes("UTF-8"));
            }
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            nox.a("WebViewPresenter", "getBytes error" + e.getClass().getSimpleName(), true);
            return bArr;
        }
    }

    private byte[] c(byte[] bArr) {
        if (bArr != null && bArr.length >= 447) {
            nox.b("WebViewPresenter", "the message is too long, need to compress data", true);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                nox.a("WebViewPresenter", "failed to compress data", true);
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(SafeBundle safeBundle) {
        nox.b("WebViewPresenter", "handleRequestNet ==", true);
        ArrayList<String> stringArrayList = safeBundle.getStringArrayList("domainAllowList");
        nom.j(safeBundle.getString("publicKey"));
        nom.a(stringArrayList);
        if (TextUtils.isEmpty(this.i) || !"from_qr_authorize".equals(this.i)) {
            s();
        }
        c(false);
    }

    private void c(final boolean z) {
        nox.b("WebViewPresenter", "setLoading", true);
        Context context = this.p;
        if (context instanceof WebViewActivity) {
            ((WebViewActivity) context).runOnUiThread(new Runnable() { // from class: nog.2
                @Override // java.lang.Runnable
                public void run() {
                    nog.this.e.a(z);
                }
            });
        }
    }

    private String t() {
        if (this.ac) {
            nox.b("WebViewPresenter", "IndependentAuthorization", true);
            return "independent_authorization";
        }
        return "accountPickerH5.signIn_v2";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    public void d(int i, String str, String str2) {
        a(Integer.toString(i));
        nox.b("WebViewPresenter", "resultCallBack start.", true);
        byte b2 = 0;
        nox.b("WebViewPresenter", "resultCallBack stateCode:" + i + " ,statusMessage:" + str + " ,authorizationCode:" + str2, false);
        if ("pickerSignIn".equals(this.z)) {
            y(str2);
            e(i, str2);
        }
        if (g()) {
            c(i, str, str2, "accountPickerH5.signIn_pageFromOtherApp");
            return;
        }
        if (j()) {
            c(i, str, str2, "accountPickerH5.signIn_v3");
            return;
        }
        nms nmsVar = new nms(i, str);
        int i2 = 200;
        if (200 == i) {
            nmsVar.d(true);
        } else {
            nmsVar.d(false);
            i2 = 404;
        }
        int i3 = i2;
        String str3 = this.i;
        str3.hashCode();
        switch (str3.hashCode()) {
            case -2108773991:
                if (!str3.equals("scan_code_login")) {
                    b2 = -1;
                }
                break;
            case -1899443177:
                if (!str3.equals("from_open_realNameInfo")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -1245469133:
                if (!str3.equals("from_open_auth_app_list")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -982451862:
                if (!str3.equals("from_open_childInfo")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -776617635:
                if (!str3.equals("from_open_center_mng_new")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case -563575172:
                if (!str3.equals("from_open_center_mng")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case -313839168:
                if (!str3.equals("from_qr_authorize")) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case -39986271:
                if (!str3.equals("verify_password")) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case -29230078:
                if (!str3.equals("verify_password_new")) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case 201671127:
                if (!str3.equals("from_signin")) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case 341052952:
                if (!str3.equals("open_personal_info")) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                d(nom.j(), new nmn(nmsVar), 907115008, i3, str, "accountPickerH5.qrCodeAuthLogin");
                nox.b("WebViewPresenter", "CONST_SCAN_LOGIN", true);
                break;
            case 1:
            case 3:
            case 6:
            case 10:
                e(nmsVar, i3, str);
                break;
            case 2:
                d(nom.g(), new nmp(nmsVar), 907115007, i3, str, "accountPickerH5.openAuthAppList");
                nox.b("WebViewPresenter", "CONST_OPEN_AUTH_APP_LIST", true);
                break;
            case 4:
                d(nom.l(), new nmt(nmsVar), 907115004, i3, str, "accountPickerH5.openAccountManager_v3");
                nox.b("WebViewPresenter", "CONST_OPEN_MNG_NEW", true);
                break;
            case 5:
                d(nom.l(), new nmt(nmsVar), 907115004, i3, str, "accountPickerH5.openAccountManager_v2");
                nox.b("WebViewPresenter", "CONST_OPEN_MNG", true);
                break;
            case 7:
                d(nom.i(), new nmk(str, nmsVar), 907115003, i3, str, "accountPickerH5.chkUserPassword_v2");
                nox.b("WebViewPresenter", "CONST_VERIFY_PASSWORD", true);
                break;
            case 8:
                d(nom.i(), new nmk(str, nmsVar), 907115003, i3, str, "accountPickerH5.chkUserPassword_v3");
                nox.b("WebViewPresenter", "CONST_VERIFY_PASSWORD_NEW", true);
                break;
            case 9:
                ResultCallBack resultCallBackH = nom.h();
                nmu nmuVar = new nmu(str2, nmsVar);
                y(str2);
                d(resultCallBackH, nmuVar, 907115001, i3, str, t());
                nox.b("WebViewPresenter", "CONST_SIGN", true);
                break;
            default:
                nox.b("WebViewPresenter", "mFrom not match", true);
                this.e.b();
                break;
        }
    }

    private void e(final int i, final String str) {
        nox.b("WebViewPresenter", "handleFromPickerResult", true);
        ((WebViewActivity) this.p).runOnUiThread(new Runnable() { // from class: nog.4
            @Override // java.lang.Runnable
            public void run() {
                if (200 == i) {
                    nog.this.e.b(-1, nog.this.g(str, "0"));
                    return;
                }
                nog.this.e.b(0, nog.this.g(str, i + ""));
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    private void e(nms nmsVar, int i, String str) {
        byte b2;
        String str2 = this.i;
        str2.hashCode();
        switch (str2) {
            case "from_open_realNameInfo":
                b2 = 0;
                break;
            case "from_open_childInfo":
                b2 = 1;
                break;
            case "from_qr_authorize":
                b2 = 2;
                break;
            case "open_personal_info":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            d(nom.n(), new nmw(nmsVar), 907115010, i, str, "accountPickerH5.openRealNameInfo");
            nox.b("WebViewPresenter", "CONST_OPEN_REAL_NAME", true);
            return;
        }
        if (b2 == 1) {
            ResultCallBack resultCallBackM = nom.m();
            if (nmsVar.e() == 10001401) {
                nmsVar = new nms(2008, "AccessToken is invalid.");
            }
            d(resultCallBackM, new nmw(nmsVar), 907115012, i, str, "accountPickerH5.openChildAccountDetailInfo");
            nox.b("WebViewPresenter", "CallBack CONST_OPEN_CHILD_INFO", true);
            return;
        }
        if (b2 == 2) {
            d(nom.o(), new nmw(nmsVar), 907115011, i, str, "accountPickerH5.qrCodeAuthorize");
            nox.b("WebViewPresenter", "CONST_QR_AUTHORIZE", true);
        } else if (b2 == 3) {
            d(nom.f(), new nmw(nmsVar), 907115006, i, str, "accountPickerH5.openPersonalInfo");
            nox.b("WebViewPresenter", "CONST_OPEN_PERSONAL_INFO", true);
        } else {
            nox.b("WebViewPresenter", "dealOtherOper not match", true);
            this.e.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    public boolean g(String str) {
        String str2;
        nox.b("WebViewPresenter", "interceptCenterUrl url:" + str, false);
        this.e.b(false);
        this.e.c(false);
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("\\?");
            if (strArrSplit.length >= 1) {
                str2 = strArrSplit[0];
            } else {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str2.endsWith(nnm.c().b(this.p))) {
            this.e.b(true);
            return false;
        }
        if (str2.endsWith(nnm.c().i(this.p))) {
            this.e.c(true);
            return false;
        }
        if (q(str)) {
            return true;
        }
        if (str2.equalsIgnoreCase(nnm.c().e(this.p))) {
            ResultCallBack resultCallBackL = nom.l();
            nms nmsVar = new nms(200, "logout succ");
            nmsVar.d(true);
            nmsVar.d(9);
            nmt nmtVar = new nmt(nmsVar);
            if (resultCallBackL != null) {
                resultCallBackL.onResult(nmtVar);
                this.e.b();
                return true;
            }
        } else if (str2.equalsIgnoreCase(nnm.c().h(this.p))) {
            ResultCallBack resultCallBackJ = nom.j();
            nms nmsVar2 = new nms(200, "qr login succ");
            nmsVar2.d(true);
            nmn nmnVar = new nmn(nmsVar2);
            if (resultCallBackJ != null) {
                noj.b(this.p, 907115008, 200, "qrCodeAuthLogin success", this.l, "accountPickerH5.qrCodeAuthLogin", "api_ret");
                resultCallBackJ.onResult(nmnVar);
                this.e.b();
                return true;
            }
        } else if (str2.equalsIgnoreCase(a.a().b()) && "from_open_auth_app_list".equalsIgnoreCase(this.i)) {
            ResultCallBack resultCallBackG = nom.g();
            nms nmsVar3 = new nms(2008, "access token is invalid.");
            nmsVar3.d(false);
            nmp nmpVar = new nmp(nmsVar3);
            if (resultCallBackG != null) {
                noj.b(this.p, 907115007, 404, "access token is invalid", this.l, "accountPickerH5.openAuthAppList", "api_ret");
                resultCallBackG.onResult(nmpVar);
                this.e.b();
                return true;
            }
        }
        return false;
    }

    private boolean q(String str) {
        if ("from_open_center_mng_new".equalsIgnoreCase(d()) && str.startsWith(a.a().a())) {
            ResultCallBack resultCallBackL = nom.l();
            nms nmsVar = new nms(2008, "invalid at");
            nmsVar.d(false);
            nmt nmtVar = new nmt(nmsVar);
            if (resultCallBackL != null) {
                noj.b(this.p, 907115004, 404, "access token is invalid", this.l, "accountPickerH5.openAccountManager_v3", "api_ret");
                resultCallBackL.onResult(nmtVar);
                this.e.b();
                return true;
            }
        }
        return false;
    }

    public boolean k(String str) {
        nox.b("WebViewPresenter", "checkOverLoadRedirectUrlStart: url = " + str, false);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.j)) {
            if (str.startsWith(this.j + "?")) {
                return true;
            }
            if (str.startsWith(this.j + "&")) {
                return true;
            }
        }
        return false;
    }

    public boolean m(String str) {
        Bundle bundleE;
        nox.b("WebViewPresenter", "redirectUrl url:" + this.j + "?", false);
        if (k(str) && (bundleE = nom.e(str)) != null) {
            SafeBundle safeBundle = new SafeBundle(bundleE);
            if (nom.c(bundleE)) {
                nox.b("WebViewPresenter", "get code success", true);
                e(safeBundle);
                return true;
            }
            if (!TextUtils.isEmpty(bundleE.getString(VastAttribute.ERROR, ""))) {
                nox.b("WebViewPresenter", "get code error", true);
                e(safeBundle);
                return true;
            }
        }
        return false;
    }

    public void e(nna nnaVar) {
        nnaVar.a(this.m);
    }

    public void a() {
        if (TextUtils.isEmpty(this.u)) {
            return;
        }
        String strR = r(this.u);
        nox.b("WebViewPresenter", "fillAccountJs = " + strR, false);
        this.e.b(strR);
    }

    private String r(String str) {
        return "javascript:fillAccount('1','" + EncodeUtil.encodeForJavaScript(str) + com.huawei.operation.utils.Constants.RIGHT_BRACKET;
    }

    private void e(SafeBundle safeBundle) {
        int i;
        nox.b("WebViewPresenter", "parseCode", true);
        String string = safeBundle.getString("code");
        String string2 = safeBundle.getString("state");
        if (!TextUtils.isEmpty(string)) {
            nox.b("WebViewPresenter", "get authorization_code success", true);
            d(200, string2, string);
            return;
        }
        nox.b("WebViewPresenter", "get authorization_code error", true);
        String string3 = safeBundle.getString(VastAttribute.ERROR);
        String string4 = safeBundle.getString("sub_error");
        try {
            i = Integer.parseInt(string3);
        } catch (NumberFormatException unused) {
            nox.a("WebViewPresenter", "NumberFormatException", true);
            i = 404;
        }
        String string5 = safeBundle.getString("error_description");
        nox.b("WebViewPresenter", "get authorization_code errorCode " + i, true);
        nox.b("WebViewPresenter", "get authorization_code subError " + string4, false);
        nox.b("WebViewPresenter", "get authorization_code errorMessage " + string5, false);
        d(i, "sub_error " + string4 + " " + string5, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent g(String str, String str2) {
        nox.b("WebViewPresenter", "getResultIntent", true);
        nox.b("WebViewPresenter", "pickerSdk signIn return code", true);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("statusCode", str2);
            jSONObject.put("status", jSONObject2);
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("serverAuthCode", str);
                jSONObject.put(CommonPickerConstant.RequestParams.KEY_SIGN_IN_HUAWEI_ID, jSONObject3);
            }
        } catch (JSONException unused) {
            nox.a("WebViewPresenter", TrackConstants$Events.EXCEPTION, true);
        }
        Intent intent = new Intent();
        intent.putExtra("HUAWEIID_SIGNIN_RESULT", jSONObject.toString());
        return intent;
    }

    private String s(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("CUID", str);
        } catch (JSONException unused) {
            nox.b("WebViewPresenter", "childUserIdToJson JSONException", true);
        }
        nox.b("WebViewPresenter", "childUserIdToJson = " + jSONObject.toString(), false);
        return p(jSONObject.toString());
    }

    private String y() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("AT", this.g);
            jSONObject.put("AD", this.h);
            JSONObject jSONObject2 = new JSONObject();
            String strH = h(this.m.a(), this.m.c());
            jSONObject2.put("terminalType", this.m.b());
            jSONObject2.put("deviceAliasName", this.m.d());
            jSONObject2.put("deviceType", this.m.c());
            jSONObject2.put(DeviceInfo.TAG_DEVICE_ID, this.m.a());
            if (!TextUtils.isEmpty(strH)) {
                jSONObject2.put("deviceID2", this.m.a());
            }
            jSONObject2.put("uuid", this.m.e());
            jSONObject.put("ED", jSONObject2.toString());
            jSONObject.put("TY", 1);
            jSONObject.put("TS", System.currentTimeMillis());
        } catch (JSONException unused) {
            nox.b("WebViewPresenter", "JSONException", true);
        }
        nox.b("WebViewPresenter", "getExtClientInfo:" + jSONObject.toString(), false);
        return p(jSONObject.toString());
    }

    public String b(Context context) {
        String strE = nom.e(context);
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("ext_clientInfo=");
            sb.append(y());
            sb.append("&reqClientType=");
            sb.append(7);
            sb.append("&lang=");
            sb.append(URLEncoder.encode(strE.toLowerCase(Locale.getDefault()), "UTF-8"));
            sb.append(npi.g(this.p));
            sb.append("&service=");
            sb.append(URLEncoder.encode(a.a().m() + "?" + npi.g(this.p), "UTF-8"));
            sb.append("&loginUrl=");
            sb.append(URLEncoder.encode(a.a().b() + "?reqClientType=7&loginChannel=7000000&displayType=2&clientID=" + this.h + "&lang=" + strE.toLowerCase(Locale.getDefault()) + npi.g(this.p), "UTF-8"));
            sb.append("&loginChannel=");
            sb.append(GmsVersion.VERSION_ORLA);
            sb.append("&clientNonce=");
            sb.append(nom.p());
        } catch (UnsupportedEncodingException unused) {
            sb = new StringBuilder();
        } catch (Exception unused2) {
            sb = new StringBuilder();
        }
        nox.b("WebViewPresenter", "personalInfo：" + ((Object) sb), false);
        return sb.toString();
    }

    public String d(Context context) {
        String strE = nom.e(context);
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("ext_clientInfo=");
            sb.append(y());
            sb.append("&reqClientType=");
            sb.append(TextUtils.isEmpty(this.v) ? 7 : this.v);
            sb.append("&lang=");
            sb.append(URLEncoder.encode(strE.toLowerCase(Locale.getDefault()), "UTF-8"));
            sb.append(npi.g(this.p));
            sb.append("&serviceType=");
            sb.append(2);
            sb.append("&service=");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.a().k());
            sb2.append("?lang=");
            sb2.append(strE.toLowerCase(Locale.getDefault()));
            sb2.append("&loginChannel=7000000&reqClientType=");
            sb2.append(TextUtils.isEmpty(this.v) ? 7 : this.v);
            sb2.append("&isFromLiteSDK=true");
            sb2.append(npi.g(this.p));
            sb.append(URLEncoder.encode(sb2.toString(), "UTF-8"));
            sb.append("&loginChannel=");
            sb.append(GmsVersion.VERSION_ORLA);
            sb.append("&clientNonce=");
            sb.append(nom.p());
        } catch (UnsupportedEncodingException unused) {
            sb = new StringBuilder();
        } catch (Exception unused2) {
            sb = new StringBuilder();
        }
        nox.b("WebViewPresenter", "realNameInfo：" + ((Object) sb), false);
        return sb.toString();
    }

    public String e(Context context) {
        String strE = nom.e(context);
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("ext_clientInfo=");
            sb.append(y());
            sb.append("&reqClientType=");
            sb.append(TextUtils.isEmpty(this.v) ? 7 : this.v);
            sb.append("&lang=");
            sb.append(URLEncoder.encode(strE.toLowerCase(Locale.getDefault()), "UTF-8"));
            sb.append(npi.g(this.p));
            sb.append("&serviceType=");
            sb.append(6);
            sb.append("&service=");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.a().l());
            sb2.append("?childInfo=");
            sb2.append(s(this.aa));
            sb2.append("&lang=");
            sb2.append(strE.toLowerCase(Locale.getDefault()));
            sb2.append("&loginChannel=7000000&reqClientType=");
            sb2.append(TextUtils.isEmpty(this.v) ? 7 : this.v);
            sb2.append("&isFromLiteSDK=true");
            sb2.append(npi.g(this.p));
            sb.append(URLEncoder.encode(sb2.toString(), "UTF-8"));
            sb.append("&loginChannel=");
            sb.append(GmsVersion.VERSION_ORLA);
            sb.append("&clientNonce=");
            sb.append(nom.p());
        } catch (UnsupportedEncodingException unused) {
            sb = new StringBuilder();
        } catch (Exception unused2) {
            sb = new StringBuilder();
        }
        nox.b("WebViewPresenter", "getCloudChildInfo：" + sb.toString(), false);
        return sb.toString();
    }

    public String a(Context context) {
        return this.f43349a + "?user_code=" + this.f43350b + "&cVersion=HwID_6.13.0.301" + npi.g(context);
    }

    public boolean n(String str) {
        nox.b("WebViewPresenter", "enter checkSignInService", true);
        Bundle bundleE = nom.e(str);
        if (bundleE == null) {
            return false;
        }
        SafeBundle safeBundle = new SafeBundle(bundleE);
        if ("pickerSignIn".equals(this.z)) {
            d(200, safeBundle.getString("state"), safeBundle.getString("code"));
            return true;
        }
        if (safeBundle.containsKey("isNotHuaweiId") && "1".equals(safeBundle.getString("isNotHuaweiId", "0"))) {
            String string = safeBundle.getString("ticket", "");
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            Intent intent = new Intent();
            intent.putExtra("HUAWEIID_SIGNIN_RESULT", b(b(null, null, null, string), true));
            this.e.a(-1, intent);
            nox.b("WebViewPresenter", "checkSignInService get ticket exit", true);
            return true;
        }
        String string2 = safeBundle.getString("code", "");
        String string3 = safeBundle.getString("state", "");
        String string4 = safeBundle.getString("risks", "");
        if (TextUtils.isEmpty(string2)) {
            return false;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("HUAWEIID_SIGNIN_RESULT", b(b(string2, string3, string4, null), true));
        intent2.putExtra("url", str);
        this.e.a(-1, intent2);
        nox.b("WebViewPresenter", "checkSignInService get code exit", true);
        return true;
    }

    private void y(String str) {
        nox.b("WebViewPresenter", "saveGetAuthorizationCodeFlag mIsIndependentAuthorization = " + this.ac, true);
        if (TextUtils.isEmpty(str) || this.ac) {
            return;
        }
        nnu.a(this.p).e("getSignInCode", true);
        nnu.a(this.p).a("getSignInCodeTime", System.currentTimeMillis());
    }

    private void c(int i, String str, String str2, String str3) {
        nox.b("WebViewPresenter", "packingResult stateCode = " + i + "--statusMessage = " + str + "--authorizationCode =" + str2, false);
        Intent intent = new Intent();
        if (i != 200) {
            intent.putExtra("HUAWEIID_SIGNIN_RESULT", b(d(i, str), false));
            this.e.a(0, intent);
            noj.b(this.p, 907115001, 404, str, this.l, str3, "api_ret");
        } else {
            if (j()) {
                y(str2);
            }
            intent.putExtra("HUAWEIID_SIGNIN_RESULT", b(b(str2, null, null, null), true));
            this.e.a(-1, intent);
            noj.b(this.p, 907115001, 200, str, this.l, str3, "api_ret");
        }
    }

    private JSONObject d(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("stateCode", i);
            jSONObject.put("stateMessage", str);
            return jSONObject;
        } catch (JSONException unused) {
            nox.a("WebViewPresenter", "getFailJsonObject JSONException", true);
            return jSONObject;
        } catch (Exception unused2) {
            nox.a("WebViewPresenter", "getFailJsonObject Exception", true);
            return jSONObject;
        }
    }

    private String b(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(CommonPickerConstant.RequestParams.KEY_SIGN_IN_HUAWEI_ID, jSONObject);
            jSONObject2.put("result", z);
        } catch (JSONException unused) {
            nox.a("WebViewPresenter", "getSignInResult JSONException", true);
        } catch (Exception unused2) {
            nox.a("WebViewPresenter", "getSignInResult Exception", true);
        }
        return jSONObject2.toString();
    }

    private JSONObject b(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("code", str);
                jSONObject.put("state", str2);
                jSONObject.put("risks", str3);
                return jSONObject;
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("ticket", str4);
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException unused) {
            nox.a("WebViewPresenter", "getSucJsonObject JSONException", true);
        } catch (Exception unused2) {
            nox.a("WebViewPresenter", "getSucJsonObject Exception", true);
        }
    }

    private void d(ResultCallBack resultCallBack, Result result, int i, int i2, String str, String str2) {
        if (resultCallBack != null) {
            resultCallBack.onResult(result);
            noj.b(this.p, i, i2, str, this.l, str2, "api_ret");
        } else {
            noj.b(this.p, i, 404, "callBack is null", this.l, str2, "api_ret");
        }
        this.e.b();
    }

    public String h() {
        return this.l;
    }

    public String l(String str) {
        nox.b("WebViewPresenter", "getDeviceInfo", true);
        if (nop.c(str)) {
            nox.b("WebViewPresenter", "getEdJsonStr", true);
            return m();
        }
        nox.b("WebViewPresenter", "getDJsonStr", true);
        return k();
    }

    public boolean g() {
        return "from_other_app_signin".equalsIgnoreCase(this.i);
    }

    public boolean j() {
        return "from_v3_signin".equalsIgnoreCase(this.i);
    }

    public String i() {
        return this.j;
    }

    public String f() {
        return this.z;
    }

    public boolean o() {
        try {
            return ((Boolean) Class.forName("android.app.Activity").getMethod("isInMultiWindowMode", new Class[0]).invoke(this, new Object[0])).booleanValue();
        } catch (ClassNotFoundException unused) {
            nox.b("WebViewPresenter", "ClassNotFoundException", true);
            return false;
        } catch (IllegalAccessException unused2) {
            nox.b("WebViewPresenter", "IllegalAccessException", true);
            return false;
        } catch (IllegalArgumentException unused3) {
            nox.b("WebViewPresenter", "IllegalArgumentException", true);
            return false;
        } catch (NoSuchMethodException unused4) {
            nox.b("WebViewPresenter", "NoSuchMethodException", true);
            return false;
        } catch (RuntimeException unused5) {
            nox.b("WebViewPresenter", "RuntimeException", true);
            return false;
        } catch (InvocationTargetException unused6) {
            nox.b("WebViewPresenter", "InvocationTargetException", true);
            return false;
        } catch (Exception unused7) {
            nox.b("WebViewPresenter", "Exception", true);
            return false;
        }
    }

    public boolean b(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean d(int i) {
        if (b((Activity) this.p, new String[]{"android.permission.CAMERA"}, i)) {
            nox.b("WebViewPresenter", "checkCameraPermission return true", true);
            return true;
        }
        nox.b("WebViewPresenter", "checkCameraPermission return false", true);
        return false;
    }

    public boolean b(int i) {
        if (b((Activity) this.p, new String[]{nom.b()}, i)) {
            nox.b("WebViewPresenter", "checkSDPermission return true", true);
            return true;
        }
        nox.b("WebViewPresenter", "checkSDPermission return false", true);
        return false;
    }

    private boolean b(Activity activity, String[] strArr, int i) {
        if (activity == null || strArr == null || strArr.length == 0) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() <= 0) {
            return true;
        }
        activity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), i);
        return false;
    }

    public String c(SafeWebView safeWebView, String str) {
        nox.b("WebViewPresenter", "buildAuthInfo", true);
        if (!safeWebView.isWhiteListUrl(a.a().e())) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            DeviceInfo deviceInfo = this.m;
            if (deviceInfo != null) {
                jSONObject.put("deviceType", deviceInfo.c());
                jSONObject.put("deviceId", this.m.a());
                jSONObject.put("uuid", this.m.e());
            }
            jSONObject.put("packageName", str);
            jSONObject.put("reqClientType", "");
            jSONObject.put("loginChannel", "90000100");
            if (!TextUtils.isEmpty(this.g)) {
                jSONObject.put("accessToken", this.g);
            }
            jSONObject.put("tokenType", 1);
            nox.b("WebViewPresenter", "mAuthInfoString", true);
            String string = jSONObject.toString();
            nox.b("WebViewPresenter", "buildAuthInfo: json string = " + string, false);
            return string;
        } catch (JSONException unused) {
            nox.a("WebViewPresenter", "JSONException", true);
            return null;
        }
    }

    public String o(String str) {
        nox.b("WebViewPresenter", "the loginUrl is:" + str, false);
        if (TextUtils.isEmpty(str) || !str.contains(AuthInternalPickerConstant.EXT_CLIENTINFO_STUB)) {
            nox.b("WebViewPresenter", "the loginUrl is empty or loginUrl not contains ext_clientInfo", true);
            return str;
        }
        String strU = u(str);
        nox.b("WebViewPresenter", "the deviceInfo is:" + strU, false);
        return str.replace(AuthInternalPickerConstant.EXT_CLIENTINFO_STUB, "ext_clientInfo=" + strU);
    }

    private String u(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (nop.c(str)) {
                String strH = h(this.m.a(), this.m.c());
                jSONObject.put("AD", this.h);
                jSONObject2.put("deviceType", this.m.c());
                jSONObject2.put(DeviceInfo.TAG_DEVICE_ID, this.m.a());
                jSONObject2.put("uuid", this.m.e());
                if (!TextUtils.isEmpty(strH)) {
                    jSONObject2.put("deviceID2", strH);
                }
            }
            jSONObject2.put("terminalType", this.m.b());
            jSONObject2.put("deviceAliasName", this.m.d());
            jSONObject.put("ED", jSONObject2.toString());
            jSONObject.put("TY", 5);
            jSONObject.put("TS", System.currentTimeMillis());
        } catch (JSONException unused) {
            nox.b("WebViewPresenter", "JSONException", true);
        }
        nox.b("WebViewPresenter", "getSignInExtClientInfo:" + jSONObject.toString(), false);
        return p(jSONObject.toString());
    }
}
