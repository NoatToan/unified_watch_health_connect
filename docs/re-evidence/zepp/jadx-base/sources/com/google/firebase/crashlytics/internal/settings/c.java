package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
interface c {
    JSONObject a(SettingsData settingsData) throws JSONException;

    SettingsData b(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException;
}
