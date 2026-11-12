package com.huawei.hms.network.file.core;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.embedded.k;
import com.huawei.hms.network.embedded.n2;
import com.huawei.hms.network.file.a.h;
import com.huawei.hms.network.file.api.GlobalRequestConfig;
import com.huawei.hms.network.file.api.RequestManager;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.inner.utils.CheckConfigUtils;
import com.huawei.openalliance.ad.constant.TagConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f15736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile HttpClient f15737c;
    HttpClient d;
    HttpClient e;
    HttpClient f;
    HttpClient g;
    private volatile GlobalRequestConfig h;
    private final Object i = new Object();

    public void f() {
        if (this.f15737c != null) {
            return;
        }
        synchronized (this.i) {
            this.f15737c = b(this.h);
            if (h.f().a()) {
                FLogger.v("HttpClientManager", "hasH1Policy, create h1HttpClient");
                this.d = this.f15737c.newBuilder().enableQuic(false).options(a(PolicyNetworkService.ClientConstants.SUPPORT_PROTOCOLS, CheckConfigUtils.Constants.HTTP_1_1)).build();
            }
            if (h.f().b()) {
                FLogger.v("HttpClientManager", "hasH2Policy, create h2HttpClient");
                this.e = this.f15737c.newBuilder().enableQuic(false).build();
            }
            if (this.f15736b && h.f().d() && i()) {
                FLogger.v("HttpClientManager", "hasH3PCCPolicy, create h3PCCHttpClient");
                this.f = this.f15737c.newBuilder().options(a(n2.CONGESTION_CONTROL_TYPE, k.a.f14965b)).build();
            }
            if (this.f15736b && h.f().c() && i()) {
                FLogger.v("HttpClientManager", "hasH3PCCMultipathPolicy, create h3PCCMultipathHttpClient");
                this.g = this.f15737c.newBuilder().options(g()).build();
            }
        }
    }

    public HttpClient e() {
        return this.g;
    }

    public HttpClient d() {
        return this.f;
    }

    public HttpClient c() {
        return this.e;
    }

    public HttpClient b() {
        return this.d;
    }

    public HttpClient a() {
        return this.f15737c;
    }

    private boolean i() {
        String valueFromOptions = this.h != null ? Utils.getValueFromOptions(TagConstants.SCENE_TYPE, this.h.getOptions()) : "";
        FLogger.v("HttpClientManager", "global request config scene is " + valueFromOptions);
        FLogger.v("HttpClientManager", "download manager tag is " + this.f15735a);
        if (TextUtils.isEmpty(valueFromOptions) && TextUtils.isEmpty(this.f15735a)) {
            return false;
        }
        String strA = b.a("file_manager|filemanager_pcc_switch");
        FLogger.v("HttpClientManager", "PCC remote tag is " + strA);
        if (TextUtils.isEmpty(strA)) {
            FLogger.i("HttpClientManager", "PCC remote config is empty", new Object[0]);
            return false;
        }
        String[] strArrSplit = strA.split(",");
        if (strArrSplit == null) {
            return false;
        }
        for (String str : strArrSplit) {
            if (valueFromOptions.equals(str) || this.f15735a.equals(str)) {
                FLogger.i("HttpClientManager", "enable pcc, tag is " + this.f15735a, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public static HttpClient h() {
        return new HttpClient.Builder().build();
    }

    private String g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(n2.CONGESTION_CONTROL_TYPE, k.a.f14965b);
            jSONObject.put("enable_multipath", true);
        } catch (JSONException unused) {
            FLogger.w("HttpClientManager", "create option fail", new Object[0]);
        }
        return jSONObject.toString();
    }

    private boolean c(GlobalRequestConfig globalRequestConfig) {
        return (globalRequestConfig == null || Utils.isEmpty(globalRequestConfig.getQuicHints())) ? false : true;
    }

    private HttpClient b(GlobalRequestConfig globalRequestConfig) {
        FLogger.i("HttpClientManager", "init initDefaultHttpclient", new Object[0]);
        if (this.f15736b) {
            FLogger.v("HttpClientManager", "enable quic");
            NetworkKit.getInstance().addQuicHint(true, (String[]) globalRequestConfig.getQuicHints().toArray(new String[globalRequestConfig.getQuicHints().size()]));
        }
        return globalRequestConfig == null ? h() : a(globalRequestConfig);
    }

    private String a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
            FLogger.w("HttpClientManager", "create option fail, key is " + str, new Object[0]);
        }
        return jSONObject.toString();
    }

    private HttpClient a(GlobalRequestConfig globalRequestConfig) {
        HttpClient httpClient = globalRequestConfig.getHttpClient();
        if (httpClient != null) {
            return httpClient;
        }
        HttpClient.Builder builder = new HttpClient.Builder();
        builder.options(a(PolicyNetworkService.ProfileConstants.SCENE_TYPE_OPTION_KEY, PolicyNetworkService.ProfileConstants.FILE_MANAGER));
        if (globalRequestConfig.getHostnameVerifier() != null) {
            builder.hostnameVerifier(globalRequestConfig.getHostnameVerifier());
        }
        if (globalRequestConfig.getSslSocketFactory() != null && globalRequestConfig.getTrustManager() != null) {
            builder.sslSocketFactory(globalRequestConfig.getSslSocketFactory(), globalRequestConfig.getTrustManager());
        }
        if (this.f15736b) {
            builder.enableQuic(true);
        }
        if (!Utils.isBlank(globalRequestConfig.getOptions())) {
            builder.options(globalRequestConfig.getOptions());
        }
        return builder.build();
    }

    public c(Context context, GlobalRequestConfig globalRequestConfig, String str) {
        this.f15736b = false;
        this.h = globalRequestConfig;
        this.f15735a = str;
        this.f15736b = c(globalRequestConfig);
        RequestManager.init(context);
    }
}
