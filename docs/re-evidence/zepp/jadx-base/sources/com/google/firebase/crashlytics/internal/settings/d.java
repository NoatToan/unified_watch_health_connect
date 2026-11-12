package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.FeaturesSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SessionSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class d implements c {
    private static final String a = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
    private static final String b = "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s";
    private static final String c = "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports";
    private static final String d = "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps";

    private static AppSettingsData c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String string = jSONObject2.getString("status");
        boolean zEquals = "new".equals(string);
        String string2 = jSONObject.getString(b.m);
        String string3 = jSONObject.getString(b.n);
        String str = zEquals ? a : String.format(Locale.US, b, string2);
        Locale locale = Locale.US;
        return new AppSettingsData(string, str, String.format(locale, c, string2), String.format(locale, d, string2), string2, string3, jSONObject2.optBoolean(b.s, false), jSONObject2.optInt(b.t, 0), jSONObject2.optInt(b.u, 0));
    }

    private static FeaturesSettingsData d(JSONObject jSONObject) {
        return new FeaturesSettingsData(jSONObject.optBoolean(b.i, true), jSONObject.optBoolean(b.j, false));
    }

    private static SessionSettingsData e() {
        return new SessionSettingsData(8, 4);
    }

    private static long f(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) {
        return jSONObject.has(b.a) ? jSONObject.optLong(b.a) : currentTimeProvider.getCurrentTimeMillis() + (j * 1000);
    }

    private JSONObject g(AppSettingsData appSettingsData) throws JSONException {
        return new JSONObject().put("status", appSettingsData.status).put(b.s, appSettingsData.updateRequired).put(b.t, appSettingsData.reportUploadVariant).put(b.u, appSettingsData.nativeReportUploadVariant);
    }

    private JSONObject h(AppSettingsData appSettingsData) throws JSONException {
        return new JSONObject().put(b.m, appSettingsData.bundleId).put(b.n, appSettingsData.organizationId);
    }

    private JSONObject i(FeaturesSettingsData featuresSettingsData) throws JSONException {
        return new JSONObject().put(b.i, featuresSettingsData.collectReports);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.c
    public JSONObject a(SettingsData settingsData) throws JSONException {
        return new JSONObject().put(b.a, settingsData.expiresAtMillis).put(b.f, settingsData.cacheDuration).put(b.d, settingsData.settingsVersion).put(b.e, i(settingsData.featuresData)).put("app", g(settingsData.appData)).put(b.g, h(settingsData.appData));
    }

    @Override // com.google.firebase.crashlytics.internal.settings.c
    public SettingsData b(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt(b.d, 0);
        int iOptInt2 = jSONObject.optInt(b.f, 3600);
        return new SettingsData(f(currentTimeProvider, iOptInt2, jSONObject), c(jSONObject.getJSONObject(b.g), jSONObject.getJSONObject("app")), e(), d(jSONObject.getJSONObject(b.e)), iOptInt, iOptInt2);
    }
}
