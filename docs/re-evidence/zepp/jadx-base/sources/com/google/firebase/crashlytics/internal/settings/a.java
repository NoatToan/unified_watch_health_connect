package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.FeaturesSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SessionSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.Settings;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class a implements c {
    private static AppSettingsData c(JSONObject jSONObject) throws JSONException {
        return new AppSettingsData(jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString(b.q), jSONObject.getString(b.r), jSONObject.optBoolean(b.s, false));
    }

    private static FeaturesSettingsData d(JSONObject jSONObject) {
        return new FeaturesSettingsData(jSONObject.optBoolean(b.i, true), jSONObject.optBoolean(b.j, false));
    }

    private static SessionSettingsData e(JSONObject jSONObject) {
        return new SessionSettingsData(jSONObject.optInt(b.y, 8), 4);
    }

    public static Settings f(CurrentTimeProvider currentTimeProvider) {
        JSONObject jSONObject = new JSONObject();
        return new SettingsData(g(currentTimeProvider, TimeUtils.TIME_1_HOURS, jSONObject), null, e(jSONObject), d(jSONObject), 0, 3600);
    }

    private static long g(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) {
        return jSONObject.has(b.a) ? jSONObject.optLong(b.a) : currentTimeProvider.getCurrentTimeMillis() + (j * 1000);
    }

    private JSONObject h(AppSettingsData appSettingsData) throws JSONException {
        return new JSONObject().put("status", appSettingsData.status).put("url", appSettingsData.url).put(b.q, appSettingsData.reportsUrl).put(b.r, appSettingsData.ndkReportsUrl).put(b.s, appSettingsData.updateRequired);
    }

    private JSONObject i(FeaturesSettingsData featuresSettingsData) throws JSONException {
        return new JSONObject().put(b.i, featuresSettingsData.collectReports);
    }

    private JSONObject j(SessionSettingsData sessionSettingsData) throws JSONException {
        return new JSONObject().put(b.y, sessionSettingsData.maxCustomExceptionEvents).put(b.z, sessionSettingsData.maxCompleteSessionsCount);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.c
    public JSONObject a(SettingsData settingsData) throws JSONException {
        return new JSONObject().put(b.a, settingsData.expiresAtMillis).put(b.f, settingsData.cacheDuration).put(b.d, settingsData.settingsVersion).put(b.e, i(settingsData.featuresData)).put("app", h(settingsData.appData)).put(b.c, j(settingsData.sessionData));
    }

    @Override // com.google.firebase.crashlytics.internal.settings.c
    public SettingsData b(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt(b.d, 0);
        int iOptInt2 = jSONObject.optInt(b.f, 3600);
        return new SettingsData(g(currentTimeProvider, iOptInt2, jSONObject), c(jSONObject.getJSONObject("app")), e(jSONObject.getJSONObject(b.c)), d(jSONObject.getJSONObject(b.e)), iOptInt, iOptInt2);
    }
}
