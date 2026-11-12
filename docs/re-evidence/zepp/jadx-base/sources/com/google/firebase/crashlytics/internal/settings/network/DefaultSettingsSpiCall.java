package com.google.firebase.crashlytics.internal.settings.network;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.google.firebase.crashlytics.internal.settings.model.SettingsRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultSettingsSpiCall implements SettingsSpiCall {
    public static final String d = "X-CRASHLYTICS-GOOGLE-APP-ID";
    public static final String e = "X-CRASHLYTICS-API-CLIENT-TYPE";
    public static final String f = "X-CRASHLYTICS-API-CLIENT-VERSION";
    public static final String g = "User-Agent";
    public static final String h = "Accept";
    public static final String i = "Crashlytics Android SDK/";
    public static final String j = "application/json";
    public static final String k = "android";
    public static final String l = "build_version";
    public static final String m = "display_version";
    public static final String n = "instance";
    public static final String o = "source";
    public static final String p = "X-CRASHLYTICS-DEVICE-MODEL";
    public static final String q = "X-CRASHLYTICS-OS-BUILD-VERSION";
    public static final String r = "X-CRASHLYTICS-OS-DISPLAY-VERSION";
    public static final String s = "X-CRASHLYTICS-INSTALLATION-ID";
    private final String a;
    private final HttpRequestFactory b;
    private final Logger c;

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory) {
        this(str, httpRequestFactory, Logger.getLogger());
    }

    private HttpGetRequest a(HttpGetRequest httpGetRequest, SettingsRequest settingsRequest) {
        b(httpGetRequest, d, settingsRequest.googleAppId);
        b(httpGetRequest, e, "android");
        b(httpGetRequest, f, CrashlyticsCore.getVersion());
        b(httpGetRequest, "Accept", "application/json");
        b(httpGetRequest, p, settingsRequest.deviceModel);
        b(httpGetRequest, q, settingsRequest.osBuildVersion);
        b(httpGetRequest, r, settingsRequest.osDisplayVersion);
        b(httpGetRequest, s, settingsRequest.installIdProvider.getCrashlyticsInstallId());
        return httpGetRequest;
    }

    private void b(HttpGetRequest httpGetRequest, String str, String str2) {
        if (str2 != null) {
            httpGetRequest.header(str, str2);
        }
    }

    private JSONObject c(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            this.c.w("Failed to parse settings JSON from " + this.a, e2);
            this.c.w("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> d(SettingsRequest settingsRequest) {
        HashMap map = new HashMap();
        map.put(l, settingsRequest.buildVersion);
        map.put(m, settingsRequest.displayVersion);
        map.put("source", Integer.toString(settingsRequest.source));
        String str = settingsRequest.instanceId;
        if (!TextUtils.isEmpty(str)) {
            map.put(n, str);
        }
        return map;
    }

    public HttpGetRequest createHttpGetRequest(Map<String, String> map) {
        return this.b.buildHttpGetRequest(this.a, map).header("User-Agent", i + CrashlyticsCore.getVersion()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public JSONObject e(HttpResponse httpResponse) {
        int iCode = httpResponse.code();
        this.c.v("Settings response code was: " + iCode);
        if (f(iCode)) {
            return c(httpResponse.body());
        }
        this.c.e("Settings request failed; (status: " + iCode + ") from " + this.a);
        return null;
    }

    public boolean f(int i2) {
        return i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.network.SettingsSpiCall
    public JSONObject invoke(SettingsRequest settingsRequest, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> mapD = d(settingsRequest);
            HttpGetRequest httpGetRequestA = a(createHttpGetRequest(mapD), settingsRequest);
            this.c.d("Requesting settings from " + this.a);
            this.c.v("Settings query params were: " + mapD);
            return e(httpGetRequestA.execute());
        } catch (IOException e2) {
            this.c.e("Settings request failed.", e2);
            return null;
        }
    }

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory, Logger logger) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.c = logger;
        this.b = httpRequestFactory;
        this.a = str;
    }
}
