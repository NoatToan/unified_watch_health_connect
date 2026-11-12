package com.huawei.hms.support.hwid.common.e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsApi;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes34.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f16621a = new c();
    private com.huawei.hms.support.hwid.result.c<com.huawei.hms.support.hwid.result.a> d;
    private Context g;
    private JSONObject h;
    private JSONObject i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16622b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16623c = "";
    private boolean e = false;
    private boolean f = false;
    private boolean j = false;

    public static c a() {
        return f16621a;
    }

    public void a(Context context, String str, String str2, com.huawei.hms.support.hwid.result.c<com.huawei.hms.support.hwid.result.a> cVar) {
        this.f16622b = str;
        this.f16623c = str2;
        this.d = cVar;
        this.g = context;
        new Thread(new Runnable() { // from class: com.huawei.hms.support.hwid.common.e.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Map<String, String> mapSynGetGrsUrls = GrsApi.synGetGrsUrls("com.huawei.cloud.hwid");
                    if (mapSynGetGrsUrls != null) {
                        String str3 = mapSynGetGrsUrls.get("Root");
                        if (TextUtils.isEmpty(str3)) {
                            e.b("GetDomainNameUtil", "url is empty exit");
                            c.this.a(2003, "url is empty exit");
                            return;
                        } else {
                            e.a("GetDomainNameUtil", "get domain url from grs success");
                            c.this.a(str3, "siteDomain");
                            c.this.a(str3, "upLogin503");
                            return;
                        }
                    }
                    e.b("GetDomainNameUtil", "urlMap null");
                    c.this.a(2003, "urlMap null");
                } catch (NoClassDefFoundError unused) {
                    e.b("GetDomainNameUtil", "NoClassDefFoundError");
                    c.this.a(2003, "NoClassDefFoundError");
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final String str2) {
        e.a("GetDomainNameUtil", "getSiteDomianFromServer");
        RestClientGlobalInstance.getInstance().init(this.g);
        RestClient restClientBuild = new RestClient.Builder(this.g).baseUrl(str).build();
        if (restClientBuild == null) {
            a(2003, "restClient is null");
            return;
        }
        a aVar = (a) restClientBuild.create(a.class);
        final com.huawei.hms.support.hwid.common.c.a.a aVar2 = new com.huawei.hms.support.hwid.common.c.a.a(this.g, str2);
        try {
            aVar.a(aVar2.d(), RequestBody.create(" text/html; charset=utf-8", aVar2.e().getBytes("UTF-8"))).enqueue(new ResultCallback<ResponseBody>() { // from class: com.huawei.hms.support.hwid.common.e.c.2
                @Override // com.huawei.hms.framework.network.restclient.ResultCallback
                public void onResponse(Response<ResponseBody> response) {
                    e.a("GetDomainNameUtil", "request getResource for siteDomain success");
                    c.this.a(aVar2, response, str2);
                }

                @Override // com.huawei.hms.framework.network.restclient.ResultCallback
                public void onFailure(Throwable th) {
                    e.a("GetDomainNameUtil", "request getResource for siteDomain onFailure");
                    c.this.a(2016, "request getResource for siteDomain onFailure");
                }
            });
        } catch (IOException unused) {
            e.a("GetDomainNameUtil", "request getResource for siteDomain IOException");
            a(2015, "request getResource for siteDomain IOException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.huawei.hms.support.hwid.common.c.a.a aVar, Response<ResponseBody> response, String str) {
        e.a("GetDomainNameUtil", "handleRequestNet");
        int code = response.getCode();
        e.a("GetDomainNameUtil", "code:" + code);
        if (code == 200) {
            e.a("GetDomainNameUtil", "GetResourceRequest success");
            try {
                aVar.a(new String(response.getBody().bytes(), "UTF-8"));
                String strF = aVar.f();
                if (!TextUtils.isEmpty(strF) && strF != null) {
                    e.a("GetDomainNameUtil", "get getResourceResponseJson success");
                    JSONObject jSONObject = new JSONObject(strF);
                    if (str.equals("siteDomain")) {
                        this.h = jSONObject;
                        this.e = true;
                    } else {
                        this.i = jSONObject;
                        this.f = true;
                    }
                    b();
                    return;
                }
                e.a("GetDomainNameUtil", "getResourceResponseJson is null, errorcode is " + aVar.g());
                e.a("GetDomainNameUtil", "getResourceResponseJson is null, errorcode is " + aVar.g() + " errorMsg: " + aVar.h(), false);
                a(2016, "getResourceResponseJson is null");
                return;
            } catch (IOException unused) {
                e.a("GetDomainNameUtil", "IOException");
                a(2015, "IOException");
                return;
            } catch (JSONException unused2) {
                e.a("GetDomainNameUtil", "JSONException");
                a(2015, "JSONException");
                return;
            } catch (XmlPullParserException unused3) {
                e.a("GetDomainNameUtil", "XmlPullParserException");
                a(2015, "XmlPullParserException");
                return;
            }
        }
        a(2016, "request error");
    }

    public void a(final Context context, final String str, final String str2) {
        if (a(context)) {
            new Thread(new Runnable() { // from class: com.huawei.hms.support.hwid.common.e.c.3
                @Override // java.lang.Runnable
                public void run() {
                    c.this.a(context, str, str2, new com.huawei.hms.support.hwid.result.c<com.huawei.hms.support.hwid.result.a>() { // from class: com.huawei.hms.support.hwid.common.e.c.3.1
                        @Override // com.huawei.hms.support.hwid.result.c
                        public void a(com.huawei.hms.support.hwid.result.a aVar) {
                            if (aVar.a().a() == 0) {
                                e.a("GetDomainNameUtil", "updateSiteDomain success: ", true);
                            } else {
                                e.b("GetDomainNameUtil", "updateSiteDomain fail: ", true);
                            }
                        }
                    });
                }
            }).start();
        }
    }

    private boolean a(Context context) {
        long j;
        e.a("GetDomainNameUtil", "check needUpdateProp");
        try {
            j = Long.parseLong(com.huawei.hms.support.hwid.common.d.a.a(context).a("lastupdate", ""));
        } catch (NumberFormatException unused) {
            j = 0;
        }
        long time = new Date().getTime();
        if (j > time) {
            j = 0;
        }
        if (j == 0 || time - j > 86400000) {
            e.a("GetDomainNameUtil", "need update siteDomainName file");
            return true;
        }
        e.a("GetDomainNameUtil", "no need update siteDomainName file");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        com.huawei.hms.support.hwid.result.a aVar = new com.huawei.hms.support.hwid.result.a(new com.huawei.hms.support.hwid.result.d(i, str));
        com.huawei.hms.support.hwid.result.c<com.huawei.hms.support.hwid.result.a> cVar = this.d;
        if (cVar == null) {
            return;
        }
        if (!this.j) {
            this.j = true;
            cVar.a(aVar);
        }
        e.a("GetDomainNameUtil", "hasOnCallback is:" + this.j);
    }

    private void b() {
        e.a("GetDomainNameUtil", "enter callback");
        if (this.e && this.f) {
            e.a("GetDomainNameUtil", "request siteDomain and publickey all finish");
            HashMap<String, Object> map = new HashMap<>();
            map.put("public-key", this.i.optString("public-key"));
            map.put("1", this.h.optString("as_1"));
            map.put("5", this.h.optString("as_5"));
            map.put("7", this.h.optString("as_7"));
            map.put("8", this.h.optString("as_8"));
            map.put("lastupdate", String.valueOf(System.currentTimeMillis()));
            com.huawei.hms.support.hwid.common.d.a.a(this.g).a(map);
            e.a("GetDomainNameUtil", "save publickey and siteDomain success");
            a(0, "save publickey and siteDomain success");
            return;
        }
        e.a("GetDomainNameUtil", "request siteDomain and publickey no finish");
    }
}
